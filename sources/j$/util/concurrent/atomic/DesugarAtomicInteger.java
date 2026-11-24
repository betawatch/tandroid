package j$.util.concurrent.atomic;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.function.IntUnaryOperator;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes4.dex */
public class DesugarAtomicInteger {
    public static int getAndUpdate(AtomicInteger atomicInteger, IntUnaryOperator intUnaryOperator) {
        int i;
        do {
            i = atomicInteger.get();
        } while (!atomicInteger.compareAndSet(i, intUnaryOperator.applyAsInt(i)));
        return i;
    }
}
