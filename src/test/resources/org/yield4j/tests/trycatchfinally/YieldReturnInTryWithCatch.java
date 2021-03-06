package org.yield4j.tests.trycatchfinally;
import static org.yield4j.YieldSupport.*;

//>> [0, 1]
public class YieldReturnInTryWithCatch {
    @org.yield4j.Generator public Iterable<Integer> method() {
        int i = 0;
        try {
            yield_return(i);
            throw new NullPointerException();
        } catch (NullPointerException npex) {
            i++;
        }
        yield_return(i);
    }
}
