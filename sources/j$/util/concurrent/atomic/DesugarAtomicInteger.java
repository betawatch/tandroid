package j$.util.concurrent.atomic;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.function.IntUnaryOperator;

/* loaded from: classes2.dex */
public class DesugarAtomicInteger {
    public static int getAndUpdate(AtomicInteger atomicInteger, IntUnaryOperator intUnaryOperator) {
        int i7;
        do {
            i7 = atomicInteger.get();
        } while (!atomicInteger.compareAndSet(i7, intUnaryOperator.applyAsInt(i7)));
        return i7;
    }
}
