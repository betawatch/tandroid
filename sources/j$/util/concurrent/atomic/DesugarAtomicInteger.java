package j$.util.concurrent.atomic;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.function.IntUnaryOperator;

/* loaded from: classes2.dex */
public class DesugarAtomicInteger {
    public static int getAndUpdate(AtomicInteger atomicInteger, IntUnaryOperator intUnaryOperator) {
        int i10;
        do {
            i10 = atomicInteger.get();
        } while (!atomicInteger.compareAndSet(i10, intUnaryOperator.applyAsInt(i10)));
        return i10;
    }
}
