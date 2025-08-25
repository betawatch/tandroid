package j$.util.stream;

import j$.util.Objects;
import j$.util.Spliterator;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.Collection;
import java.util.HashSet;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.function.IntFunction;

/* loaded from: classes2.dex */
final class o extends d2 {
    static M0 X(b bVar, Spliterator spliterator) {
        j jVar = new j(28);
        j jVar2 = new j(29);
        l lVar = new l(0);
        Objects.requireNonNull(jVar);
        Objects.requireNonNull(jVar2);
        Objects.requireNonNull(lVar);
        return new M0((Collection) new C1(b3.REFERENCE, lVar, jVar2, jVar, 3).c(bVar, spliterator));
    }

    @Override // j$.util.stream.b
    final I0 N(b bVar, Spliterator spliterator, IntFunction intFunction) {
        if (a3.DISTINCT.m(bVar.J())) {
            return bVar.B(spliterator, false, intFunction);
        }
        if (a3.ORDERED.m(bVar.J())) {
            return X(bVar, spliterator);
        }
        AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        n0 n0Var = new n0(2, atomicBoolean, concurrentHashMap);
        Objects.requireNonNull(n0Var);
        new O(n0Var, false).e(bVar, spliterator);
        Collection keySet = concurrentHashMap.keySet();
        if (atomicBoolean.get()) {
            HashSet hashSet = new HashSet(keySet);
            hashSet.add(null);
            keySet = hashSet;
        }
        return new M0(keySet);
    }

    @Override // j$.util.stream.b
    final Spliterator O(b bVar, Spliterator spliterator) {
        if (a3.DISTINCT.m(bVar.J())) {
            return bVar.W(spliterator);
        }
        if (a3.ORDERED.m(bVar.J())) {
            return X(bVar, spliterator).spliterator();
        }
        return new j3(bVar.W(spliterator));
    }

    @Override // j$.util.stream.b
    final m2 Q(int i, m2 m2Var) {
        Objects.requireNonNull(m2Var);
        if (a3.DISTINCT.m(i)) {
            return m2Var;
        }
        if (a3.SORTED.m(i)) {
            return new m(m2Var);
        }
        return new n(m2Var);
    }
}
