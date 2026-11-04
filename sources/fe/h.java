package fe;

import be.r;
import be.t;
import dd.k;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import wd.l;
import wd.m;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public class h {
    public static final /* synthetic */ AtomicReferenceFieldUpdater b = AtomicReferenceFieldUpdater.newUpdater(h.class, Object.class, "head$volatile");
    public static final /* synthetic */ AtomicLongFieldUpdater c = AtomicLongFieldUpdater.newUpdater(h.class, "deqIdx$volatile");
    public static final /* synthetic */ AtomicReferenceFieldUpdater d = AtomicReferenceFieldUpdater.newUpdater(h.class, Object.class, "tail$volatile");
    public static final /* synthetic */ AtomicLongFieldUpdater e = AtomicLongFieldUpdater.newUpdater(h.class, "enqIdx$volatile");
    public static final /* synthetic */ AtomicIntegerFieldUpdater f = AtomicIntegerFieldUpdater.newUpdater(h.class, "_availablePermits$volatile");
    private volatile /* synthetic */ int _availablePermits$volatile;
    public final b a;
    private volatile /* synthetic */ long deqIdx$volatile;
    private volatile /* synthetic */ long enqIdx$volatile;
    private volatile /* synthetic */ Object head$volatile;
    private volatile /* synthetic */ Object tail$volatile;

    public h() {
        j jVar = new j(0L, null, 2);
        this.head$volatile = jVar;
        this.tail$volatile = jVar;
        this._availablePermits$volatile = 1;
        this.a = new b(this, 1);
    }

    public final void a(c cVar) {
        Object b10;
        j jVar;
        m mVar = cVar.a;
        d dVar = cVar.b;
        while (true) {
            int andDecrement = f.getAndDecrement(this);
            if (andDecrement <= 1) {
                k kVar = k.a;
                if (andDecrement > 0) {
                    d.g.set(dVar, null);
                    mVar.C(kVar, mVar.c, new b(new c1.b(dVar, cVar), 2));
                    return;
                }
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = d;
                j jVar2 = (j) atomicReferenceFieldUpdater.get(this);
                long andIncrement = e.getAndIncrement(this);
                f fVar = f.a;
                long j10 = andIncrement / i.f;
                while (true) {
                    b10 = be.a.b(jVar2, j10, fVar);
                    if (!be.a.e(b10)) {
                        r c2 = be.a.c(b10);
                        while (true) {
                            r rVar = (r) atomicReferenceFieldUpdater.get(this);
                            jVar = jVar2;
                            if (rVar.c >= c2.c) {
                                break;
                            }
                            if (!c2.j()) {
                                break;
                            }
                            while (!atomicReferenceFieldUpdater.compareAndSet(this, rVar, c2)) {
                                if (atomicReferenceFieldUpdater.get(this) != rVar) {
                                    if (c2.f()) {
                                        c2.e();
                                    }
                                    jVar2 = jVar;
                                }
                            }
                            if (rVar.f()) {
                                rVar.e();
                            }
                        }
                    } else {
                        break;
                    }
                    jVar2 = jVar;
                }
                j jVar3 = (j) be.a.c(b10);
                AtomicReferenceArray atomicReferenceArray = jVar3.e;
                int i3 = (int) (andIncrement % i.f);
                while (!atomicReferenceArray.compareAndSet(i3, null, cVar)) {
                    if (atomicReferenceArray.get(i3) != null) {
                        t tVar = i.b;
                        t tVar2 = i.c;
                        while (!atomicReferenceArray.compareAndSet(i3, tVar, tVar2)) {
                            if (atomicReferenceArray.get(i3) != tVar) {
                                break;
                            }
                        }
                        d.g.set(dVar, null);
                        mVar.C(kVar, mVar.c, new b(new c1.b(dVar, cVar), 2));
                        return;
                    }
                }
                cVar.a(jVar3, i3);
                return;
            }
        }
    }

    public final void b() {
        boolean z10;
        int i3;
        Object b10;
        do {
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f;
            int andIncrement = atomicIntegerFieldUpdater.getAndIncrement(this);
            z10 = true;
            if (andIncrement >= 1) {
                do {
                    i3 = atomicIntegerFieldUpdater.get(this);
                    if (i3 <= 1) {
                        break;
                    }
                } while (!atomicIntegerFieldUpdater.compareAndSet(this, i3, 1));
                throw new IllegalStateException("The number of released permits cannot be greater than 1".toString());
            }
            if (andIncrement >= 0) {
                return;
            }
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = b;
            j jVar = (j) atomicReferenceFieldUpdater.get(this);
            long andIncrement2 = c.getAndIncrement(this);
            long j10 = andIncrement2 / i.f;
            g gVar = g.a;
            while (true) {
                b10 = be.a.b(jVar, j10, gVar);
                if (!be.a.e(b10)) {
                    r c2 = be.a.c(b10);
                    while (true) {
                        r rVar = (r) atomicReferenceFieldUpdater.get(this);
                        if (rVar.c >= c2.c) {
                            break;
                        }
                        if (!c2.j()) {
                            break;
                        }
                        while (!atomicReferenceFieldUpdater.compareAndSet(this, rVar, c2)) {
                            if (atomicReferenceFieldUpdater.get(this) != rVar) {
                                if (c2.f()) {
                                    c2.e();
                                }
                            }
                        }
                        if (rVar.f()) {
                            rVar.e();
                        }
                    }
                } else {
                    break;
                }
            }
            j jVar2 = (j) be.a.c(b10);
            AtomicReferenceArray atomicReferenceArray = jVar2.e;
            jVar2.b();
            boolean z11 = false;
            if (jVar2.c <= j10) {
                int i10 = (int) (andIncrement2 % i.f);
                Object andSet = atomicReferenceArray.getAndSet(i10, i.b);
                if (andSet == null) {
                    int i11 = i.a;
                    int i12 = 0;
                    while (true) {
                        if (i12 >= i11) {
                            t tVar = i.b;
                            t tVar2 = i.d;
                            while (true) {
                                if (atomicReferenceArray.compareAndSet(i10, tVar, tVar2)) {
                                    z11 = true;
                                    break;
                                } else if (atomicReferenceArray.get(i10) != tVar) {
                                    break;
                                }
                            }
                            z10 = true ^ z11;
                        } else if (atomicReferenceArray.get(i10) == i.c) {
                            break;
                        } else {
                            i12++;
                        }
                    }
                } else if (andSet != i.e) {
                    if (!(andSet instanceof l)) {
                        throw new IllegalStateException(("unexpected: " + andSet).toString());
                    }
                    l lVar = (l) andSet;
                    t f10 = lVar.f(k.a, this.a);
                    if (f10 != null) {
                        lVar.e(f10);
                    }
                }
            }
            z10 = false;
        } while (!z10);
    }
}
