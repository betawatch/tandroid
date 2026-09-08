package ie;

import ee.t;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import zd.l;
import zd.m;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
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
                gd.i iVar = gd.i.a;
                if (andDecrement > 0) {
                    d.g.set(dVar, null);
                    mVar.B(new b(dVar, cVar, 0), iVar);
                    return;
                }
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = d;
                k kVar2 = (k) atomicReferenceFieldUpdater.get(this);
                long andIncrement = e.getAndIncrement(this);
                f fVar = f.a;
                long j3 = andIncrement / j.f;
                while (true) {
                    a2 = ee.a.a(kVar2, j3, fVar);
                    if (!ee.a.d(a2)) {
                        t b10 = ee.a.b(a2);
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
                k kVar3 = (k) ee.a.b(a2);
                AtomicReferenceArray atomicReferenceArray = kVar3.e;
                int i10 = (int) (andIncrement % j.f);
                while (!atomicReferenceArray.compareAndSet(i10, null, cVar)) {
                    if (atomicReferenceArray.get(i10) != null) {
                        d9.f fVar2 = j.b;
                        d9.f fVar3 = j.c;
                        while (!atomicReferenceArray.compareAndSet(i10, fVar2, fVar3)) {
                            if (atomicReferenceArray.get(i10) != fVar2) {
                                break;
                            }
                        }
                        d.g.set(dVar, null);
                        mVar.B(new b(dVar, cVar, 0), iVar);
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
            long j3 = andIncrement2 / j.f;
            h hVar = h.a;
            while (true) {
                a2 = ee.a.a(kVar, j3, hVar);
                if (!ee.a.d(a2)) {
                    t b10 = ee.a.b(a2);
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
            k kVar2 = (k) ee.a.b(a2);
            AtomicReferenceArray atomicReferenceArray = kVar2.e;
            kVar2.b();
            long j10 = kVar2.c;
            boolean z11 = false;
            if (j10 <= j3) {
                int i11 = (int) (andIncrement2 % j.f);
                Object andSet = atomicReferenceArray.getAndSet(i11, j.b);
                if (andSet == null) {
                    int i12 = j.a;
                    int i13 = 0;
                    while (true) {
                        if (i13 >= i12) {
                            d9.f fVar = j.b;
                            d9.f fVar2 = j.d;
                            while (true) {
                                if (atomicReferenceArray.compareAndSet(i11, fVar, fVar2)) {
                                    z11 = true;
                                    break;
                                } else if (atomicReferenceArray.get(i11) != fVar) {
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
                    d9.f b11 = lVar.b(this.a, gd.i.a);
                    if (b11 != null) {
                        lVar.e(b11);
                    }
                }
            }
            z10 = false;
        } while (!z10);
    }
}
