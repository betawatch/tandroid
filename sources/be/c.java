package be;

import c8.u0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import zd.b0;
import zd.c2;

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
/* loaded from: classes.dex */
public class c implements g {
    public static final /* synthetic */ AtomicLongFieldUpdater b = AtomicLongFieldUpdater.newUpdater(c.class, "sendersAndCloseStatus$volatile");
    public static final /* synthetic */ AtomicLongFieldUpdater c = AtomicLongFieldUpdater.newUpdater(c.class, "receivers$volatile");
    public static final /* synthetic */ AtomicLongFieldUpdater d = AtomicLongFieldUpdater.newUpdater(c.class, "bufferEnd$volatile");
    public static final /* synthetic */ AtomicLongFieldUpdater e = AtomicLongFieldUpdater.newUpdater(c.class, "completedExpandBuffersAndPauseFlag$volatile");
    public static final /* synthetic */ AtomicReferenceFieldUpdater f = AtomicReferenceFieldUpdater.newUpdater(c.class, Object.class, "sendSegment$volatile");
    public static final /* synthetic */ AtomicReferenceFieldUpdater h = AtomicReferenceFieldUpdater.newUpdater(c.class, Object.class, "receiveSegment$volatile");
    public static final /* synthetic */ AtomicReferenceFieldUpdater n = AtomicReferenceFieldUpdater.newUpdater(c.class, Object.class, "bufferEndSegment$volatile");
    public static final /* synthetic */ AtomicReferenceFieldUpdater r = AtomicReferenceFieldUpdater.newUpdater(c.class, Object.class, "_closeCause$volatile");
    public static final /* synthetic */ AtomicReferenceFieldUpdater s = AtomicReferenceFieldUpdater.newUpdater(c.class, Object.class, "closeHandler$volatile");
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

    public c(int i7) {
        this.a = i7;
        if (i7 < 0) {
            throw new IllegalArgumentException(jg.g.k(i7, "Invalid channel capacity: ", ", should be >=0").toString());
        }
        k kVar = e.a;
        this.bufferEnd$volatile = i7 != 0 ? i7 != Integer.MAX_VALUE ? i7 : Long.MAX_VALUE : 0L;
        this.completedExpandBuffersAndPauseFlag$volatile = d.get(this);
        k kVar2 = new k(0L, null, this, 3);
        this.sendSegment$volatile = kVar2;
        this.receiveSegment$volatile = kVar2;
        if (t()) {
            kVar2 = e.a;
            kotlin.jvm.internal.j.c(kVar2, "null cannot be cast to non-null type kotlinx.coroutines.channels.ChannelSegment<E of kotlinx.coroutines.channels.BufferedChannel>");
        }
        this.bufferEndSegment$volatile = kVar2;
        this._closeCause$volatile = e.s;
    }

    public static final k c(c cVar, long j3, k kVar) {
        Object b10;
        c cVar2;
        k kVar2 = e.a;
        d dVar = d.a;
        loop0: while (true) {
            b10 = ee.a.b(kVar, j3, dVar);
            if (!ee.a.e(b10)) {
                ee.r c10 = ee.a.c(b10);
                while (true) {
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f;
                    ee.r rVar = (ee.r) atomicReferenceFieldUpdater.get(cVar);
                    if (rVar.c >= c10.c) {
                        break loop0;
                    }
                    if (!c10.j()) {
                        break;
                    }
                    while (!atomicReferenceFieldUpdater.compareAndSet(cVar, rVar, c10)) {
                        if (atomicReferenceFieldUpdater.get(cVar) != rVar) {
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
        boolean e10 = ee.a.e(b10);
        AtomicLongFieldUpdater atomicLongFieldUpdater = c;
        if (e10) {
            cVar.i();
            if (kVar.c * e.b < atomicLongFieldUpdater.get(cVar)) {
                kVar.b();
                return null;
            }
        } else {
            k kVar3 = (k) ee.a.c(b10);
            long j10 = kVar3.c;
            if (j10 <= j3) {
                return kVar3;
            }
            long j11 = e.b * j10;
            while (true) {
                long j12 = b.get(cVar);
                long j13 = 1152921504606846975L & j12;
                if (j13 >= j11) {
                    cVar2 = cVar;
                    break;
                }
                cVar2 = cVar;
                if (b.compareAndSet(cVar2, j12, (((int) (j12 >> 60)) << 60) + j13)) {
                    break;
                }
                cVar = cVar2;
            }
            if (j10 * e.b < atomicLongFieldUpdater.get(cVar2)) {
                kVar3.b();
            }
        }
        return null;
    }

    public static final void d(c cVar, Object obj, zd.m mVar) {
        mVar.resumeWith(af.b.b(cVar.o()));
    }

    public static final int e(c cVar, k kVar, int i7, Object obj, long j3, Object obj2, boolean z9) {
        kVar.n(i7, obj);
        if (z9) {
            return cVar.A(kVar, i7, obj, j3, obj2, z9);
        }
        Object l10 = kVar.l(i7);
        if (l10 == null) {
            if (cVar.f(j3)) {
                if (kVar.k(i7, null, e.d)) {
                    return 1;
                }
            } else {
                if (obj2 == null) {
                    return 3;
                }
                if (kVar.k(i7, null, obj2)) {
                    return 2;
                }
            }
        } else if (l10 instanceof c2) {
            kVar.n(i7, null);
            if (cVar.x(l10, obj)) {
                kVar.o(i7, e.i);
                return 0;
            }
            com.google.android.gms.internal.clearcut.e eVar = e.k;
            if (kVar.f.getAndSet((i7 * 2) + 1, eVar) == eVar) {
                return 5;
            }
            kVar.m(i7, true);
            return 5;
        }
        return cVar.A(kVar, i7, obj, j3, obj2, z9);
    }

    public static void q(c cVar) {
        AtomicLongFieldUpdater atomicLongFieldUpdater = e;
        if ((atomicLongFieldUpdater.addAndGet(cVar, 1L) & 4611686018427387904L) != 0) {
            while ((atomicLongFieldUpdater.get(cVar) & 4611686018427387904L) != 0) {
            }
        }
    }

    public static boolean y(Object obj) {
        if (!(obj instanceof zd.l)) {
            throw new IllegalStateException(("Unexpected waiter: " + obj).toString());
        }
        zd.l lVar = (zd.l) obj;
        k kVar = e.a;
        com.google.android.gms.internal.clearcut.e d2 = lVar.d(gd.k.a, null);
        if (d2 == null) {
            return false;
        }
        lVar.f(d2);
        return true;
    }

    public final int A(k kVar, int i7, Object obj, long j3, Object obj2, boolean z9) {
        while (true) {
            Object l10 = kVar.l(i7);
            if (l10 == null) {
                if (!f(j3) || z9) {
                    if (z9) {
                        if (kVar.k(i7, null, e.j)) {
                            kVar.i();
                            return 4;
                        }
                    } else {
                        if (obj2 == null) {
                            return 3;
                        }
                        if (kVar.k(i7, null, obj2)) {
                            return 2;
                        }
                    }
                } else if (kVar.k(i7, null, e.d)) {
                    break;
                }
            } else {
                if (l10 != e.e) {
                    com.google.android.gms.internal.clearcut.e eVar = e.k;
                    if (l10 == eVar) {
                        kVar.n(i7, null);
                        return 5;
                    }
                    if (l10 == e.h) {
                        kVar.n(i7, null);
                        return 5;
                    }
                    if (l10 == e.l) {
                        kVar.n(i7, null);
                        i();
                        return 4;
                    }
                    kVar.n(i7, null);
                    if (l10 instanceof v) {
                        l10 = ((v) l10).a;
                    }
                    if (x(l10, obj)) {
                        kVar.o(i7, e.i);
                        return 0;
                    }
                    if (kVar.f.getAndSet((i7 * 2) + 1, eVar) != eVar) {
                        kVar.m(i7, true);
                    }
                    return 5;
                }
                if (kVar.k(i7, l10, e.d)) {
                    break;
                }
            }
        }
        return 1;
    }

    public final void B(long j3) {
        AtomicLongFieldUpdater atomicLongFieldUpdater;
        c cVar = this;
        if (cVar.t()) {
            return;
        }
        while (true) {
            atomicLongFieldUpdater = d;
            if (atomicLongFieldUpdater.get(cVar) > j3) {
                break;
            } else {
                cVar = this;
            }
        }
        int i7 = e.c;
        int i10 = 0;
        while (true) {
            AtomicLongFieldUpdater atomicLongFieldUpdater2 = e;
            if (i10 < i7) {
                long j10 = atomicLongFieldUpdater.get(cVar);
                if (j10 == (4611686018427387903L & atomicLongFieldUpdater2.get(cVar)) && j10 == atomicLongFieldUpdater.get(cVar)) {
                    return;
                } else {
                    i10++;
                }
            } else {
                while (true) {
                    long j11 = atomicLongFieldUpdater2.get(cVar);
                    if (atomicLongFieldUpdater2.compareAndSet(cVar, j11, (j11 & 4611686018427387903L) + 4611686018427387904L)) {
                        break;
                    } else {
                        cVar = this;
                    }
                }
                while (true) {
                    long j12 = atomicLongFieldUpdater.get(cVar);
                    long j13 = atomicLongFieldUpdater2.get(cVar);
                    long j14 = j13 & 4611686018427387903L;
                    boolean z9 = (j13 & 4611686018427387904L) != 0;
                    if (j12 == j14 && j12 == atomicLongFieldUpdater.get(cVar)) {
                        break;
                    }
                    if (z9) {
                        cVar = this;
                    } else {
                        cVar = this;
                        atomicLongFieldUpdater2.compareAndSet(cVar, j13, 4611686018427387904L + j14);
                    }
                }
                while (true) {
                    long j15 = atomicLongFieldUpdater2.get(cVar);
                    if (atomicLongFieldUpdater2.compareAndSet(cVar, j15, j15 & 4611686018427387903L)) {
                        return;
                    } else {
                        cVar = this;
                    }
                }
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x0189, code lost:
    
        return r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x00c6, code lost:
    
        d(r1, r4, r7);
     */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0170  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0173 A[RETURN] */
    @Override // be.u
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object a(id.c cVar, Object obj) {
        Object r10;
        jd.a aVar;
        Object obj2;
        c cVar2;
        k kVar;
        int i7;
        int i10;
        boolean z9;
        c cVar3 = this;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f;
        k kVar2 = (k) atomicReferenceFieldUpdater.get(cVar3);
        while (true) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = b;
            long andIncrement = atomicLongFieldUpdater.getAndIncrement(cVar3);
            long j3 = andIncrement & 1152921504606846975L;
            boolean r11 = cVar3.r(andIncrement, false);
            int i11 = e.b;
            long j10 = i11;
            long j11 = j3 / j10;
            int i12 = (int) (j3 % j10);
            long j12 = kVar2.c;
            gd.k kVar3 = gd.k.a;
            if (j12 != j11) {
                k c10 = c(cVar3, j11, kVar2);
                if (c10 != null) {
                    kVar2 = c10;
                } else if (r11) {
                    Object v = v(cVar, obj);
                    if (v == jd.a.a) {
                        return v;
                    }
                }
            }
            int e10 = e(cVar3, kVar2, i12, obj, j3, null, r11);
            if (e10 == 0) {
                kVar2.b();
                return kVar3;
            }
            if (e10 == 1) {
                break;
            }
            if (e10 != 2) {
                AtomicLongFieldUpdater atomicLongFieldUpdater2 = c;
                if (e10 == 3) {
                    zd.m l10 = b0.l(u0.b(cVar));
                    Object obj3 = obj;
                    try {
                        int e11 = e(cVar3, kVar2, i12, obj3, j3, l10, false);
                        try {
                            if (e11 != 0) {
                                if (e11 == 1) {
                                    l10.resumeWith(kVar3);
                                } else if (e11 != 2) {
                                    if (e11 != 4) {
                                        String str = "unexpected";
                                        if (e11 != 5) {
                                            throw new IllegalStateException("unexpected");
                                        }
                                        kVar2.b();
                                        k kVar4 = (k) atomicReferenceFieldUpdater.get(cVar3);
                                        while (true) {
                                            long andIncrement2 = atomicLongFieldUpdater.getAndIncrement(cVar3);
                                            long j13 = andIncrement2 & 1152921504606846975L;
                                            boolean r12 = cVar3.r(andIncrement2, false);
                                            int i13 = e.b;
                                            AtomicLongFieldUpdater atomicLongFieldUpdater3 = atomicLongFieldUpdater;
                                            long j14 = i13;
                                            String str2 = str;
                                            long j15 = j13 / j14;
                                            int i14 = (int) (j13 % j14);
                                            AtomicLongFieldUpdater atomicLongFieldUpdater4 = atomicLongFieldUpdater2;
                                            if (kVar4.c != j15) {
                                                k c11 = c(cVar3, j15, kVar4);
                                                if (c11 != null) {
                                                    i7 = i13;
                                                    i10 = i14;
                                                    z9 = r12;
                                                    kVar = c11;
                                                } else {
                                                    if (r12) {
                                                        break;
                                                    }
                                                    atomicLongFieldUpdater = atomicLongFieldUpdater3;
                                                    str = str2;
                                                    atomicLongFieldUpdater2 = atomicLongFieldUpdater4;
                                                }
                                            } else {
                                                kVar = kVar4;
                                                i7 = i13;
                                                i10 = i14;
                                                z9 = r12;
                                            }
                                            int e12 = e(cVar3, kVar, i10, obj3, j13, l10, z9);
                                            Object obj4 = obj3;
                                            cVar2 = cVar3;
                                            k kVar5 = kVar;
                                            int i15 = i10;
                                            obj2 = obj4;
                                            if (e12 == 0) {
                                                kVar5.b();
                                                break;
                                            }
                                            if (e12 == 1) {
                                                break;
                                            }
                                            if (e12 != 2) {
                                                if (e12 == 3) {
                                                    throw new IllegalStateException(str2);
                                                }
                                                if (e12 != 4) {
                                                    if (e12 == 5) {
                                                        kVar5.b();
                                                    }
                                                    kVar4 = kVar5;
                                                    cVar3 = cVar2;
                                                    atomicLongFieldUpdater = atomicLongFieldUpdater3;
                                                    str = str2;
                                                    atomicLongFieldUpdater2 = atomicLongFieldUpdater4;
                                                    obj3 = obj2;
                                                } else if (j13 < atomicLongFieldUpdater4.get(cVar2)) {
                                                    kVar5.b();
                                                }
                                            } else if (z9) {
                                                kVar5.i();
                                            } else {
                                                l10.a(kVar5, i15 + i7);
                                            }
                                        }
                                    } else {
                                        obj2 = obj3;
                                        cVar2 = cVar3;
                                        if (j3 < atomicLongFieldUpdater2.get(cVar2)) {
                                            kVar2.b();
                                        }
                                    }
                                    d(cVar2, obj2, l10);
                                } else {
                                    l10.a(kVar2, i12 + i11);
                                }
                                r10 = l10.r();
                                aVar = jd.a.a;
                                if (r10 != aVar) {
                                    r10 = kVar3;
                                }
                                if (r10 != aVar) {
                                    return r10;
                                }
                            } else {
                                kVar2.b();
                            }
                            l10.resumeWith(kVar3);
                            r10 = l10.r();
                            aVar = jd.a.a;
                            if (r10 != aVar) {
                            }
                            if (r10 != aVar) {
                            }
                        } catch (Throwable th2) {
                            th = th2;
                            l10.A();
                            throw th;
                        }
                    } catch (Throwable th3) {
                        th = th3;
                    }
                } else if (e10 == 4) {
                    if (j3 < atomicLongFieldUpdater2.get(cVar3)) {
                        kVar2.b();
                    }
                    Object v10 = v(cVar, obj);
                    if (v10 == jd.a.a) {
                        return v10;
                    }
                } else if (e10 == 5) {
                    kVar2.b();
                }
            } else if (r11) {
                kVar2.i();
                Object v11 = v(cVar, obj);
                if (v11 == jd.a.a) {
                    return v11;
                }
            }
        }
    }

    @Override // be.u
    public Object b(Object obj) {
        AtomicLongFieldUpdater atomicLongFieldUpdater = b;
        boolean z9 = false;
        long j3 = 1152921504606846975L;
        boolean z10 = r(atomicLongFieldUpdater.get(this), false) ? false : !f(r1 & 1152921504606846975L);
        i iVar = j.b;
        if (z10) {
            return iVar;
        }
        Object obj2 = e.j;
        k kVar = (k) f.get(this);
        while (true) {
            long andIncrement = atomicLongFieldUpdater.getAndIncrement(this);
            long j10 = andIncrement & j3;
            boolean r10 = r(andIncrement, z9);
            int i7 = e.b;
            long j11 = i7;
            long j12 = j10 / j11;
            int i10 = (int) (j10 % j11);
            if (kVar.c != j12) {
                k c10 = c(this, j12, kVar);
                if (c10 != null) {
                    kVar = c10;
                } else {
                    if (r10) {
                        return new h(o());
                    }
                    z9 = false;
                    j3 = 1152921504606846975L;
                }
            }
            int e10 = e(this, kVar, i10, obj, j10, obj2, r10);
            gd.k kVar2 = gd.k.a;
            if (e10 == 0) {
                kVar.b();
                return kVar2;
            }
            if (e10 == 1) {
                return kVar2;
            }
            if (e10 == 2) {
                if (r10) {
                    kVar.i();
                    return new h(o());
                }
                c2 c2Var = obj2 instanceof c2 ? (c2) obj2 : null;
                if (c2Var != null) {
                    c2Var.a(kVar, i10 + i7);
                }
                kVar.i();
                return iVar;
            }
            if (e10 == 3) {
                throw new IllegalStateException("unexpected");
            }
            if (e10 == 4) {
                if (j10 < c.get(this)) {
                    kVar.b();
                }
                return new h(o());
            }
            if (e10 == 5) {
                kVar.b();
            }
            z9 = false;
            j3 = 1152921504606846975L;
        }
    }

    @Override // be.t
    public final void cancel(CancellationException cancellationException) {
        if (cancellationException == null) {
            cancellationException = new CancellationException("Channel was cancelled");
        }
        g(cancellationException, true);
    }

    public final boolean f(long j3) {
        return j3 < d.get(this) || j3 < c.get(this) + ((long) this.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x003c A[LOOP:2: B:17:0x003c->B:39:?, LOOP_START] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x006e A[LOOP:3: B:22:0x006e->B:30:?, LOOP_LABEL: LOOP:3: B:22:0x006e->B:30:?, LOOP_START] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x004c A[LOOP:5: B:40:0x004c->B:48:?, LOOP_START] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x002f A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean g(Throwable th2, boolean z9) {
        c cVar;
        com.google.android.gms.internal.clearcut.e eVar;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        boolean z10;
        long j3;
        long j10;
        long j11;
        Object obj;
        long j12;
        long j13;
        AtomicLongFieldUpdater atomicLongFieldUpdater = b;
        if (z9) {
            do {
                j13 = atomicLongFieldUpdater.get(this);
                if (((int) (j13 >> 60)) == 0) {
                    k kVar = e.a;
                    cVar = this;
                }
            } while (!atomicLongFieldUpdater.compareAndSet(cVar, j13, (j13 & 1152921504606846975L) + (1 << 60)));
            eVar = e.s;
            while (true) {
                atomicReferenceFieldUpdater = r;
                if (!atomicReferenceFieldUpdater.compareAndSet(this, eVar, th2)) {
                    z10 = true;
                    break;
                }
                if (atomicReferenceFieldUpdater.get(this) != eVar) {
                    z10 = false;
                    break;
                }
            }
            if (z9) {
                do {
                    j3 = atomicLongFieldUpdater.get(this);
                    int i7 = (int) (j3 >> 60);
                    if (i7 == 0) {
                        j10 = j3 & 1152921504606846975L;
                        j11 = 2;
                    } else {
                        if (i7 != 1) {
                            break;
                        }
                        j10 = j3 & 1152921504606846975L;
                        j11 = 3;
                    }
                } while (!atomicLongFieldUpdater.compareAndSet(cVar, j3, (j11 << 60) + j10));
            } else {
                do {
                    j12 = atomicLongFieldUpdater.get(this);
                } while (!atomicLongFieldUpdater.compareAndSet(cVar, j12, (3 << 60) + (j12 & 1152921504606846975L)));
            }
            i();
            if (z10) {
                loop3: while (true) {
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = s;
                    obj = atomicReferenceFieldUpdater2.get(this);
                    com.google.android.gms.internal.clearcut.e eVar2 = obj == null ? e.q : e.r;
                    while (!atomicReferenceFieldUpdater2.compareAndSet(this, obj, eVar2)) {
                        if (atomicReferenceFieldUpdater2.get(this) != obj) {
                            break;
                        }
                    }
                }
                if (obj != null) {
                    kotlin.jvm.internal.u.a(1, obj);
                    ((rd.l) obj).invoke(m());
                    return z10;
                }
            }
            return z10;
        }
        cVar = this;
        eVar = e.s;
        while (true) {
            atomicReferenceFieldUpdater = r;
            if (!atomicReferenceFieldUpdater.compareAndSet(this, eVar, th2)) {
            }
        }
        if (z9) {
        }
        i();
        if (z10) {
        }
        return z10;
    }

    /* JADX WARN: Code restructure failed: missing block: B:54:0x008d, code lost:
    
        r1 = (be.k) ((ee.b) ee.b.b.get(r1));
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final k h(long j3) {
        Object obj;
        long j10;
        Object obj2 = n.get(this);
        k kVar = (k) f.get(this);
        if (kVar.c > ((k) obj2).c) {
            obj2 = kVar;
        }
        k kVar2 = (k) h.get(this);
        if (kVar2.c > ((k) obj2).c) {
            obj2 = kVar2;
        }
        ee.b bVar = (ee.b) obj2;
        loop0: while (true) {
            bVar.getClass();
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = ee.b.a;
            Object obj3 = atomicReferenceFieldUpdater.get(bVar);
            com.google.android.gms.internal.clearcut.e eVar = ee.a.a;
            obj = null;
            if (obj3 == eVar) {
                break;
            }
            ee.b bVar2 = (ee.b) obj3;
            if (bVar2 == null) {
                while (!atomicReferenceFieldUpdater.compareAndSet(bVar, null, eVar)) {
                    if (atomicReferenceFieldUpdater.get(bVar) != null) {
                        break;
                    }
                }
                break loop0;
            }
            bVar = bVar2;
        }
        k kVar3 = (k) bVar;
        if (s()) {
            k kVar4 = kVar3;
            loop2: do {
                int i7 = e.b - 1;
                while (true) {
                    if (-1 >= i7) {
                        break;
                    }
                    j10 = (kVar4.c * e.b) + i7;
                    if (j10 < c.get(this)) {
                        break loop2;
                    }
                    while (true) {
                        Object l10 = kVar4.l(i7);
                        if (l10 != null && l10 != e.e) {
                            if (l10 == e.d) {
                                break loop2;
                            }
                        } else {
                            if (kVar4.k(i7, l10, e.l)) {
                                kVar4.i();
                                break;
                            }
                        }
                    }
                    i7--;
                }
            } while (kVar4 != null);
            j10 = -1;
            if (j10 != -1) {
                j(j10);
            }
        }
        loop5: for (k kVar5 = kVar3; kVar5 != null; kVar5 = (k) ((ee.b) ee.b.b.get(kVar5))) {
            for (int i10 = e.b - 1; -1 < i10; i10--) {
                if ((kVar5.c * e.b) + i10 < j3) {
                    break loop5;
                }
                while (true) {
                    Object l11 = kVar5.l(i10);
                    if (l11 != null && l11 != e.e) {
                        if (!(l11 instanceof v)) {
                            if (!(l11 instanceof c2)) {
                                break;
                            }
                            if (kVar5.k(i10, l11, e.l)) {
                                obj = ee.a.f(obj, l11);
                                kVar5.m(i10, true);
                                break;
                            }
                        } else {
                            if (kVar5.k(i10, l11, e.l)) {
                                obj = ee.a.f(obj, ((v) l11).a);
                                kVar5.m(i10, true);
                                break;
                            }
                        }
                    } else {
                        if (kVar5.k(i10, l11, e.l)) {
                            kVar5.i();
                            break;
                        }
                    }
                }
            }
        }
        if (obj != null) {
            if (!(obj instanceof ArrayList)) {
                w((c2) obj, true);
                return kVar3;
            }
            ArrayList arrayList = (ArrayList) obj;
            for (int size = arrayList.size() - 1; -1 < size; size--) {
                w((c2) arrayList.get(size), true);
            }
        }
        return kVar3;
    }

    public final void i() {
        r(b.get(this), false);
    }

    public final void j(long j3) {
        k kVar = (k) h.get(this);
        while (true) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = c;
            long j10 = atomicLongFieldUpdater.get(this);
            if (j3 < Math.max(this.a + j10, d.get(this))) {
                return;
            }
            if (atomicLongFieldUpdater.compareAndSet(this, j10, 1 + j10)) {
                long j11 = e.b;
                long j12 = j10 / j11;
                int i7 = (int) (j10 % j11);
                if (kVar.c != j12) {
                    k l10 = l(j12, kVar);
                    if (l10 != null) {
                        kVar = l10;
                    }
                }
                k kVar2 = kVar;
                if (z(kVar2, i7, j10, null) != e.o) {
                    kVar2.b();
                } else if (j10 < p()) {
                    kVar2.b();
                }
                kVar = kVar2;
            }
        }
    }

    public final void k() {
        Object b10;
        if (t()) {
            return;
        }
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = n;
        k kVar = (k) atomicReferenceFieldUpdater.get(this);
        loop0: while (true) {
            long andIncrement = d.getAndIncrement(this);
            long j3 = andIncrement / e.b;
            if (p() <= andIncrement) {
                if (kVar.c < j3 && kVar.c() != null) {
                    u(j3, kVar);
                }
                q(this);
                return;
            }
            if (kVar.c != j3) {
                d dVar = d.a;
                while (true) {
                    b10 = ee.a.b(kVar, j3, dVar);
                    if (!ee.a.e(b10)) {
                        ee.r c10 = ee.a.c(b10);
                        while (true) {
                            ee.r rVar = (ee.r) atomicReferenceFieldUpdater.get(this);
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
                k kVar2 = null;
                if (ee.a.e(b10)) {
                    i();
                    u(j3, kVar);
                    q(this);
                } else {
                    k kVar3 = (k) ee.a.c(b10);
                    long j10 = kVar3.c;
                    if (j10 > j3) {
                        long j11 = j10 * e.b;
                        if (d.compareAndSet(this, 1 + andIncrement, j11)) {
                            AtomicLongFieldUpdater atomicLongFieldUpdater = e;
                            if ((atomicLongFieldUpdater.addAndGet(this, j11 - andIncrement) & 4611686018427387904L) != 0) {
                                while ((atomicLongFieldUpdater.get(this) & 4611686018427387904L) != 0) {
                                }
                            }
                        } else {
                            q(this);
                        }
                    } else {
                        kVar2 = kVar3;
                    }
                }
                if (kVar2 == null) {
                    continue;
                } else {
                    kVar = kVar2;
                }
            }
            int i7 = (int) (andIncrement % e.b);
            Object l10 = kVar.l(i7);
            boolean z9 = l10 instanceof c2;
            AtomicLongFieldUpdater atomicLongFieldUpdater2 = c;
            if (!z9 || andIncrement < atomicLongFieldUpdater2.get(this) || !kVar.k(i7, l10, e.g)) {
                while (true) {
                    Object l11 = kVar.l(i7);
                    if (!(l11 instanceof c2)) {
                        if (l11 != e.j) {
                            if (l11 != null) {
                                if (l11 == e.d || l11 == e.h || l11 == e.i || l11 == e.k || l11 == e.l) {
                                    break loop0;
                                }
                                if (l11 != e.f) {
                                    throw new IllegalStateException(("Unexpected cell state: " + l11).toString());
                                }
                            } else if (kVar.k(i7, l11, e.e)) {
                                break loop0;
                            }
                        } else {
                            break;
                        }
                    } else if (andIncrement < atomicLongFieldUpdater2.get(this)) {
                        if (kVar.k(i7, l11, new v((c2) l11))) {
                            break loop0;
                        }
                    } else if (kVar.k(i7, l11, e.g)) {
                        if (y(l11)) {
                            kVar.o(i7, e.d);
                            break;
                        } else {
                            kVar.o(i7, e.j);
                            kVar.i();
                        }
                    }
                }
            } else if (y(l10)) {
                kVar.o(i7, e.d);
                break;
            } else {
                kVar.o(i7, e.j);
                kVar.i();
                q(this);
            }
        }
        q(this);
    }

    public final k l(long j3, k kVar) {
        Object b10;
        long j10;
        k kVar2 = e.a;
        d dVar = d.a;
        loop0: while (true) {
            b10 = ee.a.b(kVar, j3, dVar);
            if (!ee.a.e(b10)) {
                ee.r c10 = ee.a.c(b10);
                while (true) {
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = h;
                    ee.r rVar = (ee.r) atomicReferenceFieldUpdater.get(this);
                    if (rVar.c >= c10.c) {
                        break loop0;
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
        if (ee.a.e(b10)) {
            i();
            if (kVar.c * e.b < p()) {
                kVar.b();
                return null;
            }
        } else {
            k kVar3 = (k) ee.a.c(b10);
            long j11 = kVar3.c;
            if (!t() && j3 <= d.get(this) / e.b) {
                while (true) {
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = n;
                    ee.r rVar2 = (ee.r) atomicReferenceFieldUpdater2.get(this);
                    if (rVar2.c >= j11 || !kVar3.j()) {
                        break;
                    }
                    while (!atomicReferenceFieldUpdater2.compareAndSet(this, rVar2, kVar3)) {
                        if (atomicReferenceFieldUpdater2.get(this) != rVar2) {
                            if (kVar3.f()) {
                                kVar3.e();
                            }
                        }
                    }
                    if (rVar2.f()) {
                        rVar2.e();
                    }
                }
            }
            if (j11 <= j3) {
                return kVar3;
            }
            long j12 = j11 * e.b;
            do {
                j10 = c.get(this);
                if (j10 >= j12) {
                    break;
                }
            } while (!c.compareAndSet(this, j10, j12));
            if (j11 * e.b < p()) {
                kVar3.b();
            }
        }
        return null;
    }

    public final Throwable m() {
        return (Throwable) r.get(this);
    }

    public final Throwable n() {
        Throwable m10 = m();
        return m10 == null ? new m("Channel was closed") : m10;
    }

    public final Throwable o() {
        Throwable m10 = m();
        return m10 == null ? new n("Channel was closed") : m10;
    }

    public final long p() {
        return b.get(this) & 1152921504606846975L;
    }

    /* JADX WARN: Code restructure failed: missing block: B:84:0x00a2, code lost:
    
        r0 = (be.k) ((ee.b) ee.b.b.get(r0));
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean r(long j3, boolean z9) {
        int i7 = (int) (j3 >> 60);
        if (i7 != 0 && i7 != 1) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = c;
            if (i7 == 2) {
                h(1152921504606846975L & j3);
                if (z9) {
                    while (true) {
                        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = h;
                        k kVar = (k) atomicReferenceFieldUpdater.get(this);
                        long j10 = atomicLongFieldUpdater.get(this);
                        if (p() <= j10) {
                            break;
                        }
                        long j11 = e.b;
                        long j12 = j10 / j11;
                        if (kVar.c != j12 && (kVar = l(j12, kVar)) == null) {
                            if (((k) atomicReferenceFieldUpdater.get(this)).c < j12) {
                                break;
                            }
                        } else {
                            kVar.b();
                            int i10 = (int) (j10 % j11);
                            while (true) {
                                Object l10 = kVar.l(i10);
                                if (l10 == null || l10 == e.e) {
                                    if (kVar.k(i10, l10, e.h)) {
                                        k();
                                        break;
                                    }
                                } else {
                                    if (l10 == e.d) {
                                        break;
                                    }
                                    if (l10 != e.j) {
                                        if (l10 != e.l) {
                                            if (l10 != e.i) {
                                                if (l10 != e.h) {
                                                    if (l10 == e.g) {
                                                        break;
                                                    }
                                                    if (l10 != e.f && j10 == atomicLongFieldUpdater.get(this)) {
                                                        break;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                            c.compareAndSet(this, j10, j10 + 1);
                        }
                    }
                }
            } else {
                if (i7 != 3) {
                    throw new IllegalStateException(jg.g.j(i7, "unexpected close status: ").toString());
                }
                k h7 = h(1152921504606846975L & j3);
                Object obj = null;
                loop0: do {
                    int i11 = e.b - 1;
                    while (true) {
                        if (-1 >= i11) {
                            break;
                        }
                        long j13 = (h7.c * e.b) + i11;
                        while (true) {
                            Object l11 = h7.l(i11);
                            if (l11 == e.i) {
                                break loop0;
                            }
                            if (l11 == e.d) {
                                if (j13 < atomicLongFieldUpdater.get(this)) {
                                    break loop0;
                                }
                                if (h7.k(i11, l11, e.l)) {
                                    h7.n(i11, null);
                                    h7.i();
                                    break;
                                }
                            } else if (l11 != e.e && l11 != null) {
                                if (!(l11 instanceof c2) && !(l11 instanceof v)) {
                                    com.google.android.gms.internal.clearcut.e eVar = e.g;
                                    if (l11 == eVar || l11 == e.f) {
                                        break loop0;
                                    }
                                    if (l11 != eVar) {
                                        break;
                                    }
                                } else {
                                    if (j13 < atomicLongFieldUpdater.get(this)) {
                                        break loop0;
                                    }
                                    c2 c2Var = l11 instanceof v ? ((v) l11).a : (c2) l11;
                                    if (h7.k(i11, l11, e.l)) {
                                        obj = ee.a.f(obj, c2Var);
                                        h7.n(i11, null);
                                        h7.i();
                                        break;
                                    }
                                }
                            } else if (h7.k(i11, l11, e.l)) {
                                h7.i();
                                break;
                            }
                        }
                        i11--;
                    }
                } while (h7 != null);
                if (obj != null) {
                    if (obj instanceof ArrayList) {
                        ArrayList arrayList = (ArrayList) obj;
                        for (int size = arrayList.size() - 1; -1 < size; size--) {
                            w((c2) arrayList.get(size), false);
                        }
                    } else {
                        w((c2) obj, false);
                    }
                }
            }
            return true;
        }
        return false;
    }

    public boolean s() {
        return false;
    }

    public final boolean t() {
        long j3 = d.get(this);
        return j3 == 0 || j3 == Long.MAX_VALUE;
    }

    /* JADX WARN: Code restructure failed: missing block: B:93:0x0196, code lost:
    
        r16 = r7;
        r3 = (be.k) r3.c();
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x019f, code lost:
    
        if (r3 != null) goto L83;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final String toString() {
        boolean z9;
        String str;
        StringBuilder sb2 = new StringBuilder();
        int i7 = (int) (b.get(this) >> 60);
        if (i7 == 2) {
            sb2.append("closed,");
        } else if (i7 == 3) {
            sb2.append("cancelled,");
        }
        sb2.append("capacity=" + this.a + ',');
        sb2.append("data=[");
        int i10 = 0;
        boolean z10 = true;
        List c10 = hd.g.c(h.get(this), f.get(this), n.get(this));
        ArrayList arrayList = new ArrayList();
        for (Object obj : c10) {
            if (((k) obj) != e.a) {
                arrayList.add(obj);
            }
        }
        Iterator it = arrayList.iterator();
        if (!it.hasNext()) {
            throw new NoSuchElementException();
        }
        Object next = it.next();
        if (it.hasNext()) {
            long j3 = ((k) next).c;
            do {
                Object next2 = it.next();
                long j10 = ((k) next2).c;
                if (j3 > j10) {
                    next = next2;
                    j3 = j10;
                }
            } while (it.hasNext());
        }
        k kVar = (k) next;
        long j11 = c.get(this);
        long p10 = p();
        loop2: while (true) {
            int i11 = e.b;
            int i12 = i10;
            while (true) {
                if (i12 >= i11) {
                    break;
                }
                long j12 = (kVar.c * e.b) + i12;
                if (j12 >= p10 && j12 >= j11) {
                    break loop2;
                }
                Object l10 = kVar.l(i12);
                boolean z11 = z10;
                Object obj2 = kVar.f.get(i12 * 2);
                if (l10 instanceof zd.l) {
                    str = (j12 >= j11 || j12 < p10) ? (j12 >= p10 || j12 < j11) ? "cont" : "send" : "receive";
                } else if (l10 instanceof v) {
                    str = "EB(" + l10 + ')';
                } else if (kotlin.jvm.internal.j.a(l10, e.f) || kotlin.jvm.internal.j.a(l10, e.g)) {
                    str = "resuming_sender";
                } else {
                    if (l10 != null && !l10.equals(e.e) && !l10.equals(e.i) && !l10.equals(e.h) && !l10.equals(e.k) && !l10.equals(e.j) && !l10.equals(e.l)) {
                        str = l10.toString();
                    }
                    i12++;
                    z10 = z11;
                }
                if (obj2 != null) {
                    sb2.append("(" + str + ',' + obj2 + "),");
                } else {
                    sb2.append(str + ',');
                }
                i12++;
                z10 = z11;
            }
            z10 = z9;
            i10 = 0;
        }
        if (sb2.length() == 0) {
            throw new NoSuchElementException("Char sequence is empty.");
        }
        if (sb2.charAt(xd.d.f(sb2)) == ',') {
            kotlin.jvm.internal.j.d(sb2.deleteCharAt(sb2.length() - 1), "deleteCharAt(...)");
        }
        sb2.append("]");
        return sb2.toString();
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x0011, code lost:
    
        continue;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void u(long j3, k kVar) {
        k kVar2;
        k kVar3;
        while (kVar.c < j3 && (kVar3 = (k) kVar.c()) != null) {
            kVar = kVar3;
        }
        while (true) {
            if (!kVar.d() || (kVar2 = (k) kVar.c()) == null) {
                while (true) {
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = n;
                    ee.r rVar = (ee.r) atomicReferenceFieldUpdater.get(this);
                    if (rVar.c >= kVar.c) {
                        return;
                    }
                    if (!kVar.j()) {
                        break;
                    }
                    while (!atomicReferenceFieldUpdater.compareAndSet(this, rVar, kVar)) {
                        if (atomicReferenceFieldUpdater.get(this) != rVar) {
                            if (kVar.f()) {
                                kVar.e();
                            }
                        }
                    }
                    if (rVar.f()) {
                        rVar.e();
                        return;
                    }
                    return;
                }
            }
            kVar = kVar2;
        }
    }

    public final Object v(id.c cVar, Object obj) {
        zd.m mVar = new zd.m(1, u0.b(cVar));
        mVar.s();
        mVar.resumeWith(af.b.b(o()));
        Object r10 = mVar.r();
        return r10 == jd.a.a ? r10 : gd.k.a;
    }

    public final void w(c2 c2Var, boolean z9) {
        if (c2Var instanceof zd.l) {
            ((id.c) c2Var).resumeWith(af.b.b(z9 ? n() : o()));
            return;
        }
        if (!(c2Var instanceof b)) {
            throw new IllegalStateException(("Unexpected waiter: " + c2Var).toString());
        }
        b bVar = (b) c2Var;
        zd.m mVar = bVar.b;
        kotlin.jvm.internal.j.b(mVar);
        bVar.b = null;
        bVar.a = e.l;
        Throwable m10 = bVar.c.m();
        if (m10 == null) {
            mVar.resumeWith(Boolean.FALSE);
        } else {
            mVar.resumeWith(af.b.b(m10));
        }
    }

    public final boolean x(Object obj, Object obj2) {
        if (!(obj instanceof b)) {
            if (!(obj instanceof zd.l)) {
                throw new IllegalStateException(("Unexpected receiver type: " + obj).toString());
            }
            zd.l lVar = (zd.l) obj;
            k kVar = e.a;
            com.google.android.gms.internal.clearcut.e d2 = lVar.d(obj2, null);
            if (d2 == null) {
                return false;
            }
            lVar.f(d2);
            return true;
        }
        b bVar = (b) obj;
        zd.m mVar = bVar.b;
        kotlin.jvm.internal.j.b(mVar);
        bVar.b = null;
        bVar.a = obj2;
        Boolean bool = Boolean.TRUE;
        k kVar2 = e.a;
        com.google.android.gms.internal.clearcut.e d10 = mVar.d(bool, null);
        if (d10 == null) {
            return false;
        }
        mVar.f(d10);
        return true;
    }

    public final Object z(k kVar, int i7, long j3, Object obj) {
        AtomicReferenceArray atomicReferenceArray = kVar.f;
        Object l10 = kVar.l(i7);
        AtomicLongFieldUpdater atomicLongFieldUpdater = b;
        if (l10 == null) {
            if (j3 >= (atomicLongFieldUpdater.get(this) & 1152921504606846975L)) {
                if (obj == null) {
                    return e.n;
                }
                if (kVar.k(i7, l10, obj)) {
                    k();
                    return e.m;
                }
            }
        } else if (l10 == e.d && kVar.k(i7, l10, e.i)) {
            k();
            Object obj2 = atomicReferenceArray.get(i7 * 2);
            kVar.n(i7, null);
            return obj2;
        }
        while (true) {
            Object l11 = kVar.l(i7);
            if (l11 == null || l11 == e.e) {
                if (j3 < (atomicLongFieldUpdater.get(this) & 1152921504606846975L)) {
                    if (kVar.k(i7, l11, e.h)) {
                        k();
                        return e.o;
                    }
                } else {
                    if (obj == null) {
                        return e.n;
                    }
                    if (kVar.k(i7, l11, obj)) {
                        k();
                        return e.m;
                    }
                }
            } else if (l11 != e.d) {
                com.google.android.gms.internal.clearcut.e eVar = e.j;
                if (l11 == eVar) {
                    return e.o;
                }
                if (l11 == e.h) {
                    return e.o;
                }
                if (l11 == e.l) {
                    k();
                    return e.o;
                }
                if (l11 != e.g && kVar.k(i7, l11, e.f)) {
                    boolean z9 = l11 instanceof v;
                    if (z9) {
                        l11 = ((v) l11).a;
                    }
                    if (y(l11)) {
                        kVar.o(i7, e.i);
                        k();
                        Object obj3 = atomicReferenceArray.get(i7 * 2);
                        kVar.n(i7, null);
                        return obj3;
                    }
                    kVar.o(i7, eVar);
                    kVar.i();
                    if (z9) {
                        k();
                    }
                    return e.o;
                }
            } else if (kVar.k(i7, l11, e.i)) {
                k();
                Object obj4 = atomicReferenceArray.get(i7 * 2);
                kVar.n(i7, null);
                return obj4;
            }
        }
    }
}
