package ce;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import td.l;
import td.m;
import yd.t;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public class i {
    public static final /* synthetic */ AtomicReferenceFieldUpdater b = AtomicReferenceFieldUpdater.newUpdater(i.class, Object.class, "head$volatile");
    public static final /* synthetic */ AtomicLongFieldUpdater c = AtomicLongFieldUpdater.newUpdater(i.class, "deqIdx$volatile");
    public static final /* synthetic */ AtomicReferenceFieldUpdater d = AtomicReferenceFieldUpdater.newUpdater(i.class, Object.class, "tail$volatile");
    public static final /* synthetic */ AtomicLongFieldUpdater e = AtomicLongFieldUpdater.newUpdater(i.class, "enqIdx$volatile");
    public static final /* synthetic */ AtomicIntegerFieldUpdater f = AtomicIntegerFieldUpdater.newUpdater(i.class, "_availablePermits$volatile");
    private volatile /* synthetic */ int _availablePermits$volatile;
    public final g a;
    private volatile /* synthetic */ long deqIdx$volatile;
    private volatile /* synthetic */ long enqIdx$volatile;
    private volatile /* synthetic */ Object head$volatile;
    private volatile /* synthetic */ Object tail$volatile;

    public i(int i10) {
        if (i10 < 0 || i10 > 1) {
            throw new IllegalArgumentException("The number of acquired permits should be in 0..1".toString());
        }
        k kVar = new k(0L, null, 2);
        this.head$volatile = kVar;
        this.tail$volatile = kVar;
        this._availablePermits$volatile = 1 - i10;
        this.a = new g(this, 0);
    }

    public final void a(c cVar) {
        Object a2;
        k kVar;
        m mVar = cVar.a;
        d dVar = cVar.b;
        while (true) {
            int andDecrement = f.getAndDecrement(this);
            if (andDecrement <= 1) {
                ad.j jVar = ad.j.a;
                if (andDecrement > 0) {
                    d.g.set(dVar, null);
                    mVar.B(new b(dVar, cVar, 0), jVar);
                    return;
                }
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = d;
                k kVar2 = (k) atomicReferenceFieldUpdater.get(this);
                long andIncrement = e.getAndIncrement(this);
                f fVar = f.a;
                long j10 = andIncrement / j.f;
                while (true) {
                    a2 = yd.a.a(kVar2, j10, fVar);
                    if (!yd.a.d(a2)) {
                        t b10 = yd.a.b(a2);
                        while (true) {
                            t tVar = (t) atomicReferenceFieldUpdater.get(this);
                            kVar = kVar2;
                            if (tVar.c >= b10.c) {
                                break;
                            }
                            if (!b10.j()) {
                                break;
                            }
                            while (!atomicReferenceFieldUpdater.compareAndSet(this, tVar, b10)) {
                                if (atomicReferenceFieldUpdater.get(this) != tVar) {
                                    if (b10.f()) {
                                        b10.e();
                                    }
                                    kVar2 = kVar;
                                }
                            }
                            if (tVar.f()) {
                                tVar.e();
                            }
                        }
                    } else {
                        break;
                    }
                    kVar2 = kVar;
                }
                k kVar3 = (k) yd.a.b(a2);
                AtomicReferenceArray atomicReferenceArray = kVar3.e;
                int i10 = (int) (andIncrement % j.f);
                while (!atomicReferenceArray.compareAndSet(i10, null, cVar)) {
                    if (atomicReferenceArray.get(i10) != null) {
                        ea.a aVar = j.b;
                        ea.a aVar2 = j.c;
                        while (!atomicReferenceArray.compareAndSet(i10, aVar, aVar2)) {
                            if (atomicReferenceArray.get(i10) != aVar) {
                                break;
                            }
                        }
                        d.g.set(dVar, null);
                        mVar.B(new b(dVar, cVar, 0), jVar);
                        return;
                    }
                }
                cVar.a(kVar3, i10);
                return;
            }
        }
    }

    public final void b() {
        boolean z10;
        int i10;
        Object a2;
        do {
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f;
            int andIncrement = atomicIntegerFieldUpdater.getAndIncrement(this);
            z10 = true;
            if (andIncrement >= 1) {
                do {
                    i10 = atomicIntegerFieldUpdater.get(this);
                    if (i10 <= 1) {
                        break;
                    }
                } while (!atomicIntegerFieldUpdater.compareAndSet(this, i10, 1));
                throw new IllegalStateException("The number of released permits cannot be greater than 1".toString());
            }
            if (andIncrement >= 0) {
                return;
            }
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = b;
            k kVar = (k) atomicReferenceFieldUpdater.get(this);
            long andIncrement2 = c.getAndIncrement(this);
            long j10 = andIncrement2 / j.f;
            h hVar = h.a;
            while (true) {
                a2 = yd.a.a(kVar, j10, hVar);
                if (!yd.a.d(a2)) {
                    t b10 = yd.a.b(a2);
                    while (true) {
                        t tVar = (t) atomicReferenceFieldUpdater.get(this);
                        if (tVar.c >= b10.c) {
                            break;
                        }
                        if (!b10.j()) {
                            break;
                        }
                        while (!atomicReferenceFieldUpdater.compareAndSet(this, tVar, b10)) {
                            if (atomicReferenceFieldUpdater.get(this) != tVar) {
                                if (b10.f()) {
                                    b10.e();
                                }
                            }
                        }
                        if (tVar.f()) {
                            tVar.e();
                        }
                    }
                } else {
                    break;
                }
            }
            k kVar2 = (k) yd.a.b(a2);
            AtomicReferenceArray atomicReferenceArray = kVar2.e;
            kVar2.b();
            boolean z11 = false;
            if (kVar2.c <= j10) {
                int i11 = (int) (andIncrement2 % j.f);
                Object andSet = atomicReferenceArray.getAndSet(i11, j.b);
                if (andSet == null) {
                    int i12 = j.a;
                    int i13 = 0;
                    while (true) {
                        if (i13 >= i12) {
                            ea.a aVar = j.b;
                            ea.a aVar2 = j.d;
                            while (true) {
                                if (atomicReferenceArray.compareAndSet(i11, aVar, aVar2)) {
                                    z11 = true;
                                    break;
                                } else if (atomicReferenceArray.get(i11) != aVar) {
                                    break;
                                }
                            }
                            z10 = true ^ z11;
                        } else if (atomicReferenceArray.get(i11) == j.c) {
                            break;
                        } else {
                            i13++;
                        }
                    }
                } else if (andSet != j.e) {
                    if (!(andSet instanceof l)) {
                        throw new IllegalStateException(("unexpected: " + andSet).toString());
                    }
                    l lVar = (l) andSet;
                    ea.a d10 = lVar.d(this.a, ad.j.a);
                    if (d10 != null) {
                        lVar.f(d10);
                    }
                }
            }
            z10 = false;
        } while (!z10);
    }
}
