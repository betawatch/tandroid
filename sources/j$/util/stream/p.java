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

    static K0 D0(b bVar, Spliterator spliterator) {
        l lVar = new l(21);
        l lVar2 = new l(22);
        return new K0((Collection) new v1(S2.REFERENCE, new l(23), lVar2, lVar, 3).c(bVar, spliterator));
    }

    @Override // j$.util.stream.b
    final G0 t0(Spliterator spliterator, IntFunction intFunction, b bVar) {
        if (R2.DISTINCT.j(bVar.p0())) {
            return bVar.h0(spliterator, false, intFunction);
        }
        if (R2.ORDERED.j(bVar.p0())) {
            return D0(bVar, spliterator);
        }
        AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        new P(new l0(5, atomicBoolean, concurrentHashMap), false).c(bVar, spliterator);
        Collection keySet = concurrentHashMap.keySet();
        if (atomicBoolean.get()) {
            HashSet hashSet = new HashSet(keySet);
            hashSet.add(null);
            keySet = hashSet;
        }
        return new K0(keySet);
    }

    @Override // j$.util.stream.b
    final Spliterator u0(b bVar, Spliterator spliterator) {
        return R2.DISTINCT.j(bVar.p0()) ? bVar.C0(spliterator) : R2.ORDERED.j(bVar.p0()) ? D0(bVar, spliterator).spliterator() : new a3(bVar.C0(spliterator));
    }

    @Override // j$.util.stream.b
    final e2 w0(int i, e2 e2Var) {
        e2Var.getClass();
        return R2.DISTINCT.j(i) ? e2Var : R2.SORTED.j(i) ? new n(e2Var) : new o(e2Var);
    }
}
