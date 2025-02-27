package j$.util.stream;

import j$.util.Spliterator;
import j$.util.concurrent.ConcurrentHashMap;
import j$.util.function.IntFunction;
import java.util.Collection;
import java.util.HashSet;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes2.dex */
final class p extends V1 {
    p(b bVar, int i) {
        super(bVar, i, 0);
    }

    static J0 F0(b bVar, Spliterator spliterator) {
        l lVar = new l(17);
        l lVar2 = new l(18);
        return new J0((Collection) new u1(S2.REFERENCE, new l(19), lVar2, lVar, 3).c(bVar, spliterator));
    }

    @Override // j$.util.stream.b
    final F0 v0(Spliterator spliterator, IntFunction intFunction, b bVar) {
        if (R2.DISTINCT.d(bVar.r0())) {
            return bVar.j0(spliterator, false, intFunction);
        }
        if (R2.ORDERED.d(bVar.r0())) {
            return F0(bVar, spliterator);
        }
        AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        new P(new k0(5, atomicBoolean, concurrentHashMap), false).c(bVar, spliterator);
        Collection keySet = concurrentHashMap.keySet();
        if (atomicBoolean.get()) {
            HashSet hashSet = new HashSet(keySet);
            hashSet.add(null);
            keySet = hashSet;
        }
        return new J0(keySet);
    }

    @Override // j$.util.stream.b
    final Spliterator w0(b bVar, Spliterator spliterator) {
        return R2.DISTINCT.d(bVar.r0()) ? bVar.E0(spliterator) : R2.ORDERED.d(bVar.r0()) ? F0(bVar, spliterator).spliterator() : new a3(bVar.E0(spliterator));
    }

    @Override // j$.util.stream.b
    final e2 y0(int i, e2 e2Var) {
        e2Var.getClass();
        return R2.DISTINCT.d(i) ? e2Var : R2.SORTED.d(i) ? new n(e2Var) : new o(e2Var);
    }
}
