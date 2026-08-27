package j$.util.stream;

import j$.util.Objects;
import j$.util.Spliterator;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.Collection;
import java.util.HashSet;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.function.IntFunction;

/* loaded from: classes2.dex */
public final class m extends z4 {
    public static i2 U0(t3 t3Var, Spliterator spliterator) {
        j$.time.format.a aVar = new j$.time.format.a(24);
        j$.time.format.a aVar2 = new j$.time.format.a(25);
        j$.time.format.a aVar3 = new j$.time.format.a(26);
        Objects.requireNonNull(aVar);
        Objects.requireNonNull(aVar2);
        Objects.requireNonNull(aVar3);
        return new i2((Collection) new y3(w6.REFERENCE, aVar3, aVar2, aVar, 3).i(t3Var, spliterator));
    }

    @Override // j$.util.stream.a
    public final e2 N0(t3 t3Var, Spliterator spliterator, IntFunction intFunction) {
        a aVar = (a) t3Var;
        if (v6.DISTINCT.m(aVar.m)) {
            return t3Var.j0(spliterator, false, intFunction);
        }
        if (v6.ORDERED.m(aVar.m)) {
            return U0(t3Var, spliterator);
        }
        AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        j$.util.concurrent.t tVar = new j$.util.concurrent.t(4, atomicBoolean, concurrentHashMap);
        Objects.requireNonNull(tVar);
        new o0(tVar, false).a(t3Var, spliterator);
        Collection keySet = concurrentHashMap.keySet();
        if (atomicBoolean.get()) {
            HashSet hashSet = new HashSet(keySet);
            hashSet.add(null);
            keySet = hashSet;
        }
        return new i2(keySet);
    }

    @Override // j$.util.stream.a
    public final Spliterator O0(a aVar, Spliterator spliterator) {
        if (v6.DISTINCT.m(aVar.m)) {
            return aVar.H0(spliterator);
        }
        if (v6.ORDERED.m(aVar.m)) {
            return U0(aVar, spliterator).spliterator();
        }
        return new e7(aVar.H0(spliterator), new ConcurrentHashMap());
    }

    @Override // j$.util.stream.a
    public final j5 Q0(int i10, j5 j5Var) {
        Objects.requireNonNull(j5Var);
        if (v6.DISTINCT.m(i10)) {
            return j5Var;
        }
        if (v6.SORTED.m(i10)) {
            return new k(j5Var);
        }
        return new l(j5Var);
    }
}
