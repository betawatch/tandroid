package j$.util.stream;

import j$.util.Objects;
import j$.util.Spliterator;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.Collection;
import java.util.HashSet;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.function.IntFunction;

/* loaded from: classes2.dex */
public final class m extends X1 {
    public static G0 T(a aVar, Spliterator spliterator) {
        j$.time.format.a aVar2 = new j$.time.format.a(24);
        j$.time.format.a aVar3 = new j$.time.format.a(25);
        j$.time.format.a aVar4 = new j$.time.format.a(26);
        Objects.requireNonNull(aVar2);
        Objects.requireNonNull(aVar3);
        Objects.requireNonNull(aVar4);
        return new G0((Collection) new w1(T2.REFERENCE, aVar4, aVar3, aVar2, 3).c(aVar, spliterator));
    }

    @Override // j$.util.stream.a
    public final C0 J(a aVar, Spliterator spliterator, IntFunction intFunction) {
        if (S2.DISTINCT.q(aVar.f)) {
            return aVar.B(spliterator, false, intFunction);
        }
        if (S2.ORDERED.q(aVar.f)) {
            return T(aVar, spliterator);
        }
        AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        j$.util.concurrent.t tVar = new j$.util.concurrent.t(4, atomicBoolean, concurrentHashMap);
        Objects.requireNonNull(tVar);
        new N(tVar, false).e(aVar, spliterator);
        Collection keySet = concurrentHashMap.keySet();
        if (atomicBoolean.get()) {
            HashSet hashSet = new HashSet(keySet);
            hashSet.add(null);
            keySet = hashSet;
        }
        return new G0(keySet);
    }

    @Override // j$.util.stream.a
    public final Spliterator K(a aVar, Spliterator spliterator) {
        if (S2.DISTINCT.q(aVar.f)) {
            return aVar.S(spliterator);
        }
        if (S2.ORDERED.q(aVar.f)) {
            return T(aVar, spliterator).spliterator();
        }
        return new b3(aVar.S(spliterator), new ConcurrentHashMap());
    }

    @Override // j$.util.stream.a
    public final g2 M(int i, g2 g2Var) {
        Objects.requireNonNull(g2Var);
        if (S2.DISTINCT.q(i)) {
            return g2Var;
        }
        if (S2.SORTED.q(i)) {
            return new k(g2Var);
        }
        return new l(g2Var);
    }
}
