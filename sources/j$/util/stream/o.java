package j$.util.stream;

import j$.util.Objects;
import j$.util.Spliterator;
import j$.util.concurrent.ConcurrentHashMap;
import j$.util.function.Consumer$-CC;
import java.util.Collection;
import java.util.HashSet;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.function.Consumer;
import java.util.function.IntFunction;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes4.dex */
public final class o extends d5 {
    public static l2 T(a aVar, Spliterator spliterator) {
        j$.time.format.a aVar2 = new j$.time.format.a((byte) 24);
        j$.time.format.a aVar3 = new j$.time.format.a((byte) 25);
        j$.time.format.a aVar4 = new j$.time.format.a((byte) 26);
        Objects.requireNonNull(aVar2);
        Objects.requireNonNull(aVar3);
        Objects.requireNonNull(aVar4);
        return new l2((Collection) new b4(c7.REFERENCE, aVar4, aVar3, aVar2, (byte) 3).b(aVar, spliterator));
    }

    @Override // j$.util.stream.a
    public final h2 J(a aVar, Spliterator spliterator, IntFunction intFunction) {
        if (b7.DISTINCT.n(aVar.f)) {
            return aVar.B(spliterator, false, intFunction);
        }
        if (b7.ORDERED.n(aVar.f)) {
            return T(aVar, spliterator);
        }
        final AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        final ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        Consumer consumer = new Consumer() { // from class: j$.util.stream.l
            @Override // java.util.function.Consumer
            /* renamed from: accept */
            public final void x(Object obj) {
                AtomicBoolean atomicBoolean2 = atomicBoolean;
                if (obj == null) {
                    atomicBoolean2.set(true);
                } else {
                    concurrentHashMap.putIfAbsent(obj, Boolean.TRUE);
                }
            }

            public final /* synthetic */ Consumer andThen(Consumer consumer2) {
                return Consumer$-CC.$default$andThen(this, consumer2);
            }
        };
        Objects.requireNonNull(consumer);
        new r0(consumer, false).d(aVar, spliterator);
        Collection keySet = concurrentHashMap.keySet();
        if (atomicBoolean.get()) {
            HashSet hashSet = new HashSet(keySet);
            hashSet.add(null);
            keySet = hashSet;
        }
        return new l2(keySet);
    }

    @Override // j$.util.stream.a
    public final Spliterator K(a aVar, Spliterator spliterator) {
        return b7.DISTINCT.n(aVar.f) ? aVar.S(spliterator) : b7.ORDERED.n(aVar.f) ? T(aVar, spliterator).spliterator() : new k7(aVar.S(spliterator), new ConcurrentHashMap());
    }

    @Override // j$.util.stream.a
    public final n5 M(int i, n5 n5Var) {
        Objects.requireNonNull(n5Var);
        return b7.DISTINCT.n(i) ? n5Var : b7.SORTED.n(i) ? new m(n5Var) : new n(n5Var);
    }
}
