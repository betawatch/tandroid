package nd;

import j3.p0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import k1.m;
import k7.p7;
import kf.k0;
import ld.i2;
import ld.l;
import qd.t;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes.dex */
public class b {
    public static final /* synthetic */ AtomicLongFieldUpdater b = AtomicLongFieldUpdater.newUpdater(b.class, "sendersAndCloseStatus$volatile");
    public static final /* synthetic */ AtomicLongFieldUpdater c = AtomicLongFieldUpdater.newUpdater(b.class, "receivers$volatile");
    public static final /* synthetic */ AtomicLongFieldUpdater d = AtomicLongFieldUpdater.newUpdater(b.class, "bufferEnd$volatile");
    public static final /* synthetic */ AtomicLongFieldUpdater e = AtomicLongFieldUpdater.newUpdater(b.class, "completedExpandBuffersAndPauseFlag$volatile");
    public static final /* synthetic */ AtomicReferenceFieldUpdater f = AtomicReferenceFieldUpdater.newUpdater(b.class, Object.class, "sendSegment$volatile");
    public static final /* synthetic */ AtomicReferenceFieldUpdater g = AtomicReferenceFieldUpdater.newUpdater(b.class, Object.class, "receiveSegment$volatile");
    public static final /* synthetic */ AtomicReferenceFieldUpdater h = AtomicReferenceFieldUpdater.newUpdater(b.class, Object.class, "bufferEndSegment$volatile");
    public static final /* synthetic */ AtomicReferenceFieldUpdater i = AtomicReferenceFieldUpdater.newUpdater(b.class, Object.class, "_closeCause$volatile");
    public static final /* synthetic */ AtomicReferenceFieldUpdater j = AtomicReferenceFieldUpdater.newUpdater(b.class, Object.class, "closeHandler$volatile");
    private volatile /* synthetic */ Object _closeCause$volatile;
    public final int a;
    private volatile /* synthetic */ long bufferEnd$volatile;
    private volatile /* synthetic */ Object bufferEndSegment$volatile;
    private volatile /* synthetic */ Object closeHandler$volatile;
    private volatile /* synthetic */ long completedExpandBuffersAndPauseFlag$volatile;
    private volatile /* synthetic */ Object receiveSegment$volatile;
    private volatile /* synthetic */ long receivers$volatile;
    private volatile /* synthetic */ Object sendSegment$volatile;
    private volatile /* synthetic */ long sendersAndCloseStatus$volatile;

    public b(int i10) {
        this.a = i10;
        if (i10 < 0) {
            throw new IllegalArgumentException(k0.k(i10, "Invalid channel capacity: ", ", should be >=0").toString());
        }
        h hVar = d.a;
        this.bufferEnd$volatile = i10 != 0 ? i10 != Integer.MAX_VALUE ? i10 : Long.MAX_VALUE : 0L;
        this.completedExpandBuffersAndPauseFlag$volatile = d.get(this);
        h hVar2 = new h(0L, null, this, 3);
        this.sendSegment$volatile = hVar2;
        this.receiveSegment$volatile = hVar2;
        if (j()) {
            hVar2 = d.a;
            kotlin.jvm.internal.j.c(hVar2, "null cannot be cast to non-null type kotlinx.coroutines.channels.ChannelSegment<E of kotlinx.coroutines.channels.BufferedChannel>");
        }
        this.bufferEndSegment$volatile = hVar2;
        this._closeCause$volatile = d.r;
    }

    public static void h(b bVar) {
        AtomicLongFieldUpdater atomicLongFieldUpdater = e;
        if ((atomicLongFieldUpdater.addAndGet(bVar, 1L) & 4611686018427387904L) != 0) {
            while ((atomicLongFieldUpdater.get(bVar) & 4611686018427387904L) != 0) {
            }
        }
    }

    public static boolean n(Object obj) {
        if (!(obj instanceof l)) {
            throw new IllegalStateException(("Unexpected waiter: " + obj).toString());
        }
        l lVar = (l) obj;
        h hVar = d.a;
        o3.c b10 = lVar.b(null, sc.i.a);
        if (b10 == null) {
            return false;
        }
        lVar.e(b10);
        return true;
    }

    public final boolean a(long j10) {
        return j10 < d.get(this) || j10 < c.get(this) + ((long) this.a);
    }

    public final h b(long j10) {
        Object obj;
        Object obj2 = h.get(this);
        h hVar = (h) f.get(this);
        if (hVar.c > ((h) obj2).c) {
            obj2 = hVar;
        }
        h hVar2 = (h) g.get(this);
        if (hVar2.c > ((h) obj2).c) {
            obj2 = hVar2;
        }
        qd.d dVar = (qd.d) obj2;
        loop0: while (true) {
            dVar.getClass();
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = qd.d.a;
            Object obj3 = atomicReferenceFieldUpdater.get(dVar);
            o3.c cVar = qd.a.b;
            obj = null;
            if (obj3 == cVar) {
                break;
            }
            qd.d dVar2 = (qd.d) obj3;
            if (dVar2 == null) {
                while (!atomicReferenceFieldUpdater.compareAndSet(dVar, null, cVar)) {
                    if (atomicReferenceFieldUpdater.get(dVar) != null) {
                        break;
                    }
                }
                break loop0;
            }
            dVar = dVar2;
        }
        h hVar3 = (h) dVar;
        loop2: for (h hVar4 = hVar3; hVar4 != null; hVar4 = (h) ((qd.d) qd.d.b.get(hVar4))) {
            for (int i10 = d.b - 1; -1 < i10; i10--) {
                if ((hVar4.c * d.b) + i10 < j10) {
                    break loop2;
                }
                while (true) {
                    Object l10 = hVar4.l(i10);
                    if (l10 != null && l10 != d.e) {
                        if (!(l10 instanceof j)) {
                            if (!(l10 instanceof i2)) {
                                break;
                            }
                            if (hVar4.k(i10, l10, d.l)) {
                                obj = qd.a.e(obj, l10);
                                hVar4.m(i10, true);
                                break;
                            }
                        } else {
                            if (hVar4.k(i10, l10, d.l)) {
                                obj = qd.a.e(obj, ((j) l10).a);
                                hVar4.m(i10, true);
                                break;
                            }
                        }
                    } else {
                        if (hVar4.k(i10, l10, d.l)) {
                            hVar4.i();
                            break;
                        }
                    }
                }
            }
        }
        if (obj != null) {
            if (!(obj instanceof ArrayList)) {
                l((i2) obj, true);
                return hVar3;
            }
            ArrayList arrayList = (ArrayList) obj;
            for (int size = arrayList.size() - 1; -1 < size; size--) {
                l((i2) arrayList.get(size), true);
            }
        }
        return hVar3;
    }

    public final void c() {
        i(b.get(this), false);
    }

    public final void d() {
        Object a2;
        if (j()) {
            return;
        }
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = h;
        h hVar = (h) atomicReferenceFieldUpdater.get(this);
        loop0: while (true) {
            long andIncrement = d.getAndIncrement(this);
            long j10 = andIncrement / d.b;
            if (g() <= andIncrement) {
                if (hVar.c < j10 && hVar.c() != null) {
                    k(j10, hVar);
                }
                h(this);
                return;
            }
            if (hVar.c != j10) {
                c cVar = c.a;
                while (true) {
                    a2 = qd.a.a(hVar, j10, cVar);
                    if (!qd.a.d(a2)) {
                        t b10 = qd.a.b(a2);
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
                h hVar2 = null;
                if (qd.a.d(a2)) {
                    c();
                    k(j10, hVar);
                    h(this);
                } else {
                    h hVar3 = (h) qd.a.b(a2);
                    long j11 = hVar3.c;
                    if (j11 > j10) {
                        long j12 = j11 * d.b;
                        if (d.compareAndSet(this, 1 + andIncrement, j12)) {
                            AtomicLongFieldUpdater atomicLongFieldUpdater = e;
                            if ((atomicLongFieldUpdater.addAndGet(this, j12 - andIncrement) & 4611686018427387904L) != 0) {
                                while ((atomicLongFieldUpdater.get(this) & 4611686018427387904L) != 0) {
                                }
                            }
                        } else {
                            h(this);
                        }
                    } else {
                        hVar2 = hVar3;
                    }
                }
                if (hVar2 == null) {
                    continue;
                } else {
                    hVar = hVar2;
                }
            }
            int i10 = (int) (andIncrement % d.b);
            Object l10 = hVar.l(i10);
            boolean z4 = l10 instanceof i2;
            AtomicLongFieldUpdater atomicLongFieldUpdater2 = c;
            if (!z4 || andIncrement < atomicLongFieldUpdater2.get(this) || !hVar.k(i10, l10, d.g)) {
                while (true) {
                    Object l11 = hVar.l(i10);
                    if (!(l11 instanceof i2)) {
                        if (l11 != d.j) {
                            if (l11 != null) {
                                if (l11 == d.d || l11 == d.h || l11 == d.i || l11 == d.k || l11 == d.l) {
                                    break loop0;
                                }
                                if (l11 != d.f) {
                                    throw new IllegalStateException(("Unexpected cell state: " + l11).toString());
                                }
                            } else if (hVar.k(i10, l11, d.e)) {
                                break loop0;
                            }
                        } else {
                            break;
                        }
                    } else if (andIncrement < atomicLongFieldUpdater2.get(this)) {
                        if (hVar.k(i10, l11, new j((i2) l11))) {
                            break loop0;
                        }
                    } else if (hVar.k(i10, l11, d.g)) {
                        if (n(l11)) {
                            hVar.o(i10, d.d);
                            break;
                        } else {
                            hVar.o(i10, d.j);
                            hVar.i();
                        }
                    }
                }
            } else if (n(l10)) {
                hVar.o(i10, d.d);
                break;
            } else {
                hVar.o(i10, d.j);
                hVar.i();
                h(this);
            }
        }
        h(this);
    }

    public final h e(long j10, h hVar) {
        Object a2;
        long j11;
        h hVar2 = d.a;
        c cVar = c.a;
        loop0: while (true) {
            a2 = qd.a.a(hVar, j10, cVar);
            if (!qd.a.d(a2)) {
                t b10 = qd.a.b(a2);
                while (true) {
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = g;
                    t tVar = (t) atomicReferenceFieldUpdater.get(this);
                    if (tVar.c >= b10.c) {
                        break loop0;
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
        if (qd.a.d(a2)) {
            c();
            if (hVar.c * d.b < g()) {
                hVar.b();
                return null;
            }
        } else {
            h hVar3 = (h) qd.a.b(a2);
            long j12 = hVar3.c;
            if (!j() && j10 <= d.get(this) / d.b) {
                while (true) {
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = h;
                    t tVar2 = (t) atomicReferenceFieldUpdater2.get(this);
                    if (tVar2.c >= j12 || !hVar3.j()) {
                        break;
                    }
                    while (!atomicReferenceFieldUpdater2.compareAndSet(this, tVar2, hVar3)) {
                        if (atomicReferenceFieldUpdater2.get(this) != tVar2) {
                            if (hVar3.f()) {
                                hVar3.e();
                            }
                        }
                    }
                    if (tVar2.f()) {
                        tVar2.e();
                    }
                }
            }
            if (j12 <= j10) {
                return hVar3;
            }
            long j13 = j12 * d.b;
            do {
                j11 = c.get(this);
                if (j11 >= j13) {
                    break;
                }
            } while (!c.compareAndSet(this, j11, j13));
            if (j12 * d.b < g()) {
                hVar3.b();
            }
        }
        return null;
    }

    public final Throwable f() {
        Throwable th2 = (Throwable) i.get(this);
        return th2 == null ? new p0("Channel was closed") : th2;
    }

    public final long g() {
        return b.get(this) & 1152921504606846975L;
    }

    /* JADX WARN: Code restructure failed: missing block: B:123:0x0165, code lost:
    
        nd.b.c.compareAndSet(r14, r7, r7 + 1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x00a4, code lost:
    
        r1 = (nd.h) ((qd.d) qd.d.b.get(r1));
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean i(long j10, boolean z4) {
        int i10 = (int) (j10 >> 60);
        if (i10 != 0 && i10 != 1) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = c;
            if (i10 == 2) {
                b(1152921504606846975L & j10);
                if (z4) {
                    while (true) {
                        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = g;
                        h hVar = (h) atomicReferenceFieldUpdater.get(this);
                        long j11 = atomicLongFieldUpdater.get(this);
                        if (g() <= j11) {
                            break;
                        }
                        long j12 = d.b;
                        long j13 = j11 / j12;
                        if (hVar.c != j13 && (hVar = e(j13, hVar)) == null) {
                            if (((h) atomicReferenceFieldUpdater.get(this)).c < j13) {
                                break;
                            }
                        } else {
                            hVar.b();
                            int i11 = (int) (j11 % j12);
                            while (true) {
                                Object l10 = hVar.l(i11);
                                if (l10 == null || l10 == d.e) {
                                    if (hVar.k(i11, l10, d.h)) {
                                        d();
                                        break;
                                    }
                                } else {
                                    if (l10 == d.d) {
                                        break;
                                    }
                                    if (l10 != d.j) {
                                        if (l10 != d.l) {
                                            if (l10 != d.i) {
                                                if (l10 != d.h) {
                                                    if (l10 == d.g) {
                                                        break;
                                                    }
                                                    if (l10 != d.f && j11 == atomicLongFieldUpdater.get(this)) {
                                                        break;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            } else {
                if (i10 != 3) {
                    throw new IllegalStateException(k0.j(i10, "unexpected close status: ").toString());
                }
                h b10 = b(1152921504606846975L & j10);
                Object obj = null;
                loop0: do {
                    int i12 = d.b - 1;
                    while (true) {
                        if (-1 >= i12) {
                            break;
                        }
                        long j14 = (b10.c * d.b) + i12;
                        while (true) {
                            Object l11 = b10.l(i12);
                            if (l11 == d.i) {
                                break loop0;
                            }
                            if (l11 == d.d) {
                                if (j14 < atomicLongFieldUpdater.get(this)) {
                                    break loop0;
                                }
                                if (b10.k(i12, l11, d.l)) {
                                    b10.n(i12, null);
                                    b10.i();
                                    break;
                                }
                            } else if (l11 != d.e && l11 != null) {
                                if (!(l11 instanceof i2) && !(l11 instanceof j)) {
                                    o3.c cVar = d.g;
                                    if (l11 == cVar || l11 == d.f) {
                                        break loop0;
                                    }
                                    if (l11 != cVar) {
                                        break;
                                    }
                                } else {
                                    if (j14 < atomicLongFieldUpdater.get(this)) {
                                        break loop0;
                                    }
                                    i2 i2Var = l11 instanceof j ? ((j) l11).a : (i2) l11;
                                    if (b10.k(i12, l11, d.l)) {
                                        obj = qd.a.e(obj, i2Var);
                                        b10.n(i12, null);
                                        b10.i();
                                        break;
                                    }
                                }
                            } else if (b10.k(i12, l11, d.l)) {
                                b10.i();
                                break;
                            }
                        }
                        i12--;
                    }
                } while (b10 != null);
                if (obj != null) {
                    if (obj instanceof ArrayList) {
                        ArrayList arrayList = (ArrayList) obj;
                        for (int size = arrayList.size() - 1; -1 < size; size--) {
                            l((i2) arrayList.get(size), false);
                        }
                    } else {
                        l((i2) obj, false);
                    }
                }
            }
            return true;
        }
        return false;
    }

    public final boolean j() {
        long j10 = d.get(this);
        return j10 == 0 || j10 == Long.MAX_VALUE;
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x0011, code lost:
    
        continue;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void k(long j10, h hVar) {
        h hVar2;
        h hVar3;
        while (hVar.c < j10 && (hVar3 = (h) hVar.c()) != null) {
            hVar = hVar3;
        }
        while (true) {
            if (!hVar.d() || (hVar2 = (h) hVar.c()) == null) {
                while (true) {
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = h;
                    t tVar = (t) atomicReferenceFieldUpdater.get(this);
                    if (tVar.c >= hVar.c) {
                        return;
                    }
                    if (!hVar.j()) {
                        break;
                    }
                    while (!atomicReferenceFieldUpdater.compareAndSet(this, tVar, hVar)) {
                        if (atomicReferenceFieldUpdater.get(this) != tVar) {
                            if (hVar.f()) {
                                hVar.e();
                            }
                        }
                    }
                    if (tVar.f()) {
                        tVar.e();
                        return;
                    }
                    return;
                }
            }
            hVar = hVar2;
        }
    }

    public final void l(i2 i2Var, boolean z4) {
        Throwable f10;
        if (!(i2Var instanceof l)) {
            throw new IllegalStateException(("Unexpected waiter: " + i2Var).toString());
        }
        uc.c cVar = (uc.c) i2Var;
        if (z4) {
            f10 = (Throwable) i.get(this);
            if (f10 == null) {
                f10 = new i("Channel was closed");
            }
        } else {
            f10 = f();
        }
        cVar.resumeWith(p7.a(f10));
    }

    public final boolean m(Object obj, m mVar) {
        if (!(obj instanceof l)) {
            throw new IllegalStateException(("Unexpected receiver type: " + obj).toString());
        }
        l lVar = (l) obj;
        h hVar = d.a;
        o3.c b10 = lVar.b(null, mVar);
        if (b10 == null) {
            return false;
        }
        lVar.e(b10);
        return true;
    }

    public final Object o(h hVar, int i10, long j10, Object obj) {
        AtomicReferenceArray atomicReferenceArray = hVar.f;
        Object l10 = hVar.l(i10);
        AtomicLongFieldUpdater atomicLongFieldUpdater = b;
        if (l10 == null) {
            if (j10 >= (atomicLongFieldUpdater.get(this) & 1152921504606846975L)) {
                if (obj == null) {
                    return d.n;
                }
                if (hVar.k(i10, l10, obj)) {
                    d();
                    return d.m;
                }
            }
        } else if (l10 == d.d && hVar.k(i10, l10, d.i)) {
            d();
            Object obj2 = atomicReferenceArray.get(i10 * 2);
            hVar.n(i10, null);
            return obj2;
        }
        while (true) {
            Object l11 = hVar.l(i10);
            if (l11 == null || l11 == d.e) {
                if (j10 < (atomicLongFieldUpdater.get(this) & 1152921504606846975L)) {
                    if (hVar.k(i10, l11, d.h)) {
                        d();
                        return d.o;
                    }
                } else {
                    if (obj == null) {
                        return d.n;
                    }
                    if (hVar.k(i10, l11, obj)) {
                        d();
                        return d.m;
                    }
                }
            } else if (l11 != d.d) {
                o3.c cVar = d.j;
                if (l11 == cVar) {
                    return d.o;
                }
                if (l11 == d.h) {
                    return d.o;
                }
                if (l11 == d.l) {
                    d();
                    return d.o;
                }
                if (l11 != d.g && hVar.k(i10, l11, d.f)) {
                    boolean z4 = l11 instanceof j;
                    if (z4) {
                        l11 = ((j) l11).a;
                    }
                    if (n(l11)) {
                        hVar.o(i10, d.i);
                        d();
                        Object obj3 = atomicReferenceArray.get(i10 * 2);
                        hVar.n(i10, null);
                        return obj3;
                    }
                    hVar.o(i10, cVar);
                    hVar.i();
                    if (z4) {
                        d();
                    }
                    return d.o;
                }
            } else if (hVar.k(i10, l11, d.i)) {
                d();
                Object obj4 = atomicReferenceArray.get(i10 * 2);
                hVar.n(i10, null);
                return obj4;
            }
        }
    }

    public final int p(h hVar, int i10, m mVar, long j10, Object obj, boolean z4) {
        while (true) {
            Object l10 = hVar.l(i10);
            if (l10 == null) {
                if (!a(j10) || z4) {
                    if (z4) {
                        if (hVar.k(i10, null, d.j)) {
                            hVar.i();
                            return 4;
                        }
                    } else {
                        if (obj == null) {
                            return 3;
                        }
                        if (hVar.k(i10, null, obj)) {
                            return 2;
                        }
                    }
                } else if (hVar.k(i10, null, d.d)) {
                    break;
                }
            } else {
                if (l10 != d.e) {
                    o3.c cVar = d.k;
                    if (l10 == cVar) {
                        hVar.n(i10, null);
                        return 5;
                    }
                    if (l10 == d.h) {
                        hVar.n(i10, null);
                        return 5;
                    }
                    if (l10 == d.l) {
                        hVar.n(i10, null);
                        c();
                        return 4;
                    }
                    hVar.n(i10, null);
                    if (l10 instanceof j) {
                        l10 = ((j) l10).a;
                    }
                    if (m(l10, mVar)) {
                        hVar.o(i10, d.i);
                        return 0;
                    }
                    if (hVar.f.getAndSet((i10 * 2) + 1, cVar) != cVar) {
                        hVar.m(i10, true);
                    }
                    return 5;
                }
                if (hVar.k(i10, l10, d.d)) {
                    break;
                }
            }
        }
        return 1;
    }

    public final void q(long j10) {
        AtomicLongFieldUpdater atomicLongFieldUpdater;
        b bVar = this;
        if (bVar.j()) {
            return;
        }
        while (true) {
            atomicLongFieldUpdater = d;
            if (atomicLongFieldUpdater.get(bVar) > j10) {
                break;
            } else {
                bVar = this;
            }
        }
        int i10 = d.c;
        int i11 = 0;
        while (true) {
            AtomicLongFieldUpdater atomicLongFieldUpdater2 = e;
            if (i11 < i10) {
                long j11 = atomicLongFieldUpdater.get(bVar);
                if (j11 == (4611686018427387903L & atomicLongFieldUpdater2.get(bVar)) && j11 == atomicLongFieldUpdater.get(bVar)) {
                    return;
                } else {
                    i11++;
                }
            } else {
                while (true) {
                    long j12 = atomicLongFieldUpdater2.get(bVar);
                    if (atomicLongFieldUpdater2.compareAndSet(bVar, j12, (j12 & 4611686018427387903L) + 4611686018427387904L)) {
                        break;
                    } else {
                        bVar = this;
                    }
                }
                while (true) {
                    long j13 = atomicLongFieldUpdater.get(bVar);
                    long j14 = atomicLongFieldUpdater2.get(bVar);
                    long j15 = j14 & 4611686018427387903L;
                    boolean z4 = (j14 & 4611686018427387904L) != 0;
                    if (j13 == j15 && j13 == atomicLongFieldUpdater.get(bVar)) {
                        break;
                    }
                    if (z4) {
                        bVar = this;
                    } else {
                        bVar = this;
                        atomicLongFieldUpdater2.compareAndSet(bVar, j14, 4611686018427387904L + j15);
                    }
                }
                while (true) {
                    long j16 = atomicLongFieldUpdater2.get(bVar);
                    if (atomicLongFieldUpdater2.compareAndSet(bVar, j16, j16 & 4611686018427387903L)) {
                        return;
                    } else {
                        bVar = this;
                    }
                }
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:94:0x01a7, code lost:
    
        r3 = (nd.h) r3.c();
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final String toString() {
        String obj;
        StringBuilder sb = new StringBuilder();
        int i10 = (int) (b.get(this) >> 60);
        if (i10 == 2) {
            sb.append("closed,");
        } else if (i10 == 3) {
            sb.append("cancelled,");
        }
        sb.append("capacity=" + this.a + ',');
        sb.append("data=[");
        List c3 = tc.h.c(g.get(this), f.get(this), h.get(this));
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : c3) {
            if (((h) obj2) != d.a) {
                arrayList.add(obj2);
            }
        }
        Iterator it = arrayList.iterator();
        if (!it.hasNext()) {
            throw new NoSuchElementException();
        }
        Object next = it.next();
        if (it.hasNext()) {
            long j10 = ((h) next).c;
            do {
                Object next2 = it.next();
                long j11 = ((h) next2).c;
                if (j10 > j11) {
                    next = next2;
                    j10 = j11;
                }
            } while (it.hasNext());
        }
        h hVar = (h) next;
        long j12 = c.get(this);
        long g10 = g();
        loop2: do {
            int i11 = d.b;
            int i12 = 0;
            while (true) {
                if (i12 >= i11) {
                    break;
                }
                long j13 = (hVar.c * d.b) + i12;
                if (j13 >= g10 && j13 >= j12) {
                    break loop2;
                }
                Object l10 = hVar.l(i12);
                Object obj3 = hVar.f.get(i12 * 2);
                if (l10 instanceof l) {
                    obj = (j13 >= j12 || j13 < g10) ? (j13 >= g10 || j13 < j12) ? "cont" : "send" : "receive";
                } else if (l10 instanceof j) {
                    obj = "EB(" + l10 + ')';
                } else if (kotlin.jvm.internal.j.a(l10, d.f) ? true : kotlin.jvm.internal.j.a(l10, d.g)) {
                    obj = "resuming_sender";
                } else if (l10 == null ? true : l10.equals(d.e) ? true : kotlin.jvm.internal.j.a(l10, d.i) ? true : kotlin.jvm.internal.j.a(l10, d.h) ? true : kotlin.jvm.internal.j.a(l10, d.k) ? true : kotlin.jvm.internal.j.a(l10, d.j) ? true : kotlin.jvm.internal.j.a(l10, d.l)) {
                    i12++;
                } else {
                    obj = l10.toString();
                }
                if (obj3 != null) {
                    sb.append("(" + obj + ',' + obj3 + "),");
                } else {
                    sb.append(obj + ',');
                }
                i12++;
            }
        } while (hVar != null);
        if (sb.length() == 0) {
            throw new NoSuchElementException("Char sequence is empty.");
        }
        if (sb.charAt(jd.j.c(sb)) == ',') {
            kotlin.jvm.internal.j.d(sb.deleteCharAt(sb.length() - 1), "deleteCharAt(...)");
        }
        sb.append("]");
        return sb.toString();
    }
}
