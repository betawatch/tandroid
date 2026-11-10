package ie;

import ee.r;
import gd.k;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import zd.l;
import zd.m;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
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
                long j3 = andIncrement / i.f;
                while (true) {
                    b10 = ee.a.b(jVar2, j3, fVar);
                    if (!ee.a.e(b10)) {
                        r c10 = ee.a.c(b10);
                        while (true) {
                            r rVar = (r) atomicReferenceFieldUpdater.get(this);
                            jVar = jVar2;
                            if (rVar.c >= c10.c) {
                                break;
                            }
                            if (!c10.j()) {
                                break;
                            }
                            while (!atomicReferenceFieldUpdater.compareAndSet(this, rVar, c10)) {
                                if (atomicReferenceFieldUpdater.get(this) != rVar) {
                                    if (c10.f()) {
                                        c10.e();
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
                j jVar3 = (j) ee.a.c(b10);
                AtomicReferenceArray atomicReferenceArray = jVar3.e;
                int i7 = (int) (andIncrement % i.f);
                while (!atomicReferenceArray.compareAndSet(i7, null, cVar)) {
                    if (atomicReferenceArray.get(i7) != null) {
                        com.google.android.gms.internal.clearcut.e eVar = i.b;
                        com.google.android.gms.internal.clearcut.e eVar2 = i.c;
                        while (!atomicReferenceArray.compareAndSet(i7, eVar, eVar2)) {
                            if (atomicReferenceArray.get(i7) != eVar) {
                                break;
                            }
                        }
                        d.g.set(dVar, null);
                        mVar.C(kVar, mVar.c, new b(new c1.b(dVar, cVar), 2));
                        return;
                    }
                }
                cVar.a(jVar3, i7);
                return;
            }
        }
    }

    public final void b() {
        boolean z9;
        int i7;
        Object b10;
        do {
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f;
            int andIncrement = atomicIntegerFieldUpdater.getAndIncrement(this);
            z9 = true;
            if (andIncrement >= 1) {
                do {
                    i7 = atomicIntegerFieldUpdater.get(this);
                    if (i7 <= 1) {
                        break;
                    }
                } while (!atomicIntegerFieldUpdater.compareAndSet(this, i7, 1));
                throw new IllegalStateException("The number of released permits cannot be greater than 1".toString());
            }
            if (andIncrement >= 0) {
                return;
            }
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = b;
            j jVar = (j) atomicReferenceFieldUpdater.get(this);
            long andIncrement2 = c.getAndIncrement(this);
            long j3 = andIncrement2 / i.f;
            g gVar = g.a;
            while (true) {
                b10 = ee.a.b(jVar, j3, gVar);
                if (!ee.a.e(b10)) {
                    r c10 = ee.a.c(b10);
                    while (true) {
                        r rVar = (r) atomicReferenceFieldUpdater.get(this);
                        if (rVar.c >= c10.c) {
                            break;
                        }
                        if (!c10.j()) {
                            break;
                        }
                        while (!atomicReferenceFieldUpdater.compareAndSet(this, rVar, c10)) {
                            if (atomicReferenceFieldUpdater.get(this) != rVar) {
                                if (c10.f()) {
                                    c10.e();
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
            j jVar2 = (j) ee.a.c(b10);
            AtomicReferenceArray atomicReferenceArray = jVar2.e;
            jVar2.b();
            boolean z10 = false;
            if (jVar2.c <= j3) {
                int i10 = (int) (andIncrement2 % i.f);
                Object andSet = atomicReferenceArray.getAndSet(i10, i.b);
                if (andSet == null) {
                    int i11 = i.a;
                    int i12 = 0;
                    while (true) {
                        if (i12 >= i11) {
                            com.google.android.gms.internal.clearcut.e eVar = i.b;
                            com.google.android.gms.internal.clearcut.e eVar2 = i.d;
                            while (true) {
                                if (atomicReferenceArray.compareAndSet(i10, eVar, eVar2)) {
                                    z10 = true;
                                    break;
                                } else if (atomicReferenceArray.get(i10) != eVar) {
                                    break;
                                }
                            }
                            z9 = true ^ z10;
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
                    com.google.android.gms.internal.clearcut.e d2 = lVar.d(k.a, this.a);
                    if (d2 != null) {
                        lVar.f(d2);
                    }
                }
            }
            z9 = false;
        } while (!z9);
    }
}
