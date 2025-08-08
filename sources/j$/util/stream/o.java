package j$.util.stream;

import j$.util.Spliterator;
import j$.util.concurrent.ConcurrentHashMap;
import j$.util.function.IntFunction;
import java.util.Collection;
import java.util.HashSet;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes2.dex */
final class o extends U1 {
    static J0 D0(b bVar, Spliterator spliterator) {
        k kVar = new k(21);
        k kVar2 = new k(22);
        return new J0((Collection) new u1(R2.REFERENCE, new k(23), kVar2, kVar, 3).c(bVar, spliterator));
    }

    @Override // j$.util.stream.b
    final F0 t0(b bVar, Spliterator spliterator, IntFunction intFunction) {
        if (Q2.DISTINCT.i(bVar.p0())) {
            return bVar.h0(spliterator, false, intFunction);
        }
        if (Q2.ORDERED.i(bVar.p0())) {
            return D0(bVar, spliterator);
        }
        AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        new O(new k0(5, atomicBoolean, concurrentHashMap), false).c(bVar, spliterator);
        Collection keySet = concurrentHashMap.keySet();
        if (atomicBoolean.get()) {
            HashSet hashSet = new HashSet(keySet);
            hashSet.add(null);
            keySet = hashSet;
        }
        return new J0(keySet);
    }

    @Override // j$.util.stream.b
    final Spliterator u0(b bVar, Spliterator spliterator) {
        if (Q2.DISTINCT.i(bVar.p0())) {
            return bVar.C0(spliterator);
        }
        if (Q2.ORDERED.i(bVar.p0())) {
            return D0(bVar, spliterator).spliterator();
        }
        return new Z2(bVar.C0(spliterator));
    }

    @Override // j$.util.stream.b
    final d2 w0(int i, d2 d2Var) {
        d2Var.getClass();
        if (Q2.DISTINCT.i(i)) {
            return d2Var;
        }
        if (Q2.SORTED.i(i)) {
            return new m(d2Var);
        }
        return new n(d2Var);
    }
}
