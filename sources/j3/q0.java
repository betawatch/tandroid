package j3;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.util.Pair;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.List;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import org.telegram.messenger.MediaDataController;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public final class q0 implements Handler.Callback, l4.y {
    public final ArrayList A;
    public final f5.y B;
    public final w C;
    public final k1 D;
    public final s1 E;
    public final i F;
    public final long G;
    public j2 H;
    public w1 I;
    public we.f J;
    public boolean K;
    public boolean M;
    public boolean N;
    public boolean O;
    public int P;
    public boolean Q;
    public boolean R;
    public boolean S;
    public boolean T;
    public int U;
    public p0 V;
    public long W;
    public int X;
    public boolean Y;
    public n Z;
    public final e[] a;
    public final Set b;
    public final h2[] c;
    public final d5.u d;
    public final d5.y e;
    public final j f;
    public final com.google.android.exoplayer2.upstream.f h;
    public final f5.a0 n;
    public final HandlerThread r;
    public final Looper s;
    public final q2 v;
    public final p2 w;
    public final long x;
    public final k y;
    public boolean L = false;
    public long a0 = -9223372036854775807L;

    public q0(e[] eVarArr, d5.u uVar, d5.y yVar, j jVar, com.google.android.exoplayer2.upstream.f fVar, int i10, boolean z10, k3.f fVar2, j2 j2Var, i iVar, long j10, Looper looper, f5.y yVar2, w wVar, k3.k kVar) {
        this.C = wVar;
        this.a = eVarArr;
        this.d = uVar;
        this.e = yVar;
        this.f = jVar;
        this.h = fVar;
        this.P = i10;
        this.Q = z10;
        this.H = j2Var;
        this.F = iVar;
        this.G = j10;
        this.B = yVar2;
        this.x = jVar.g;
        w1 h = w1.h(yVar);
        this.I = h;
        this.J = new we.f(h);
        this.c = new h2[eVarArr.length];
        for (int i11 = 0; i11 < eVarArr.length; i11++) {
            eVarArr[i11].init(i11, kVar);
            this.c[i11] = eVarArr[i11].getCapabilities();
        }
        this.y = new k(this, yVar2);
        this.A = new ArrayList();
        this.b = Collections.newSetFromMap(new IdentityHashMap());
        this.v = new q2();
        this.w = new p2();
        uVar.a = this;
        uVar.b = fVar;
        this.Y = true;
        f5.a0 a2 = yVar2.a(looper, null);
        this.D = new k1(fVar2, a2);
        this.E = new s1(this, fVar2, a2, kVar);
        HandlerThread handlerThread = new HandlerThread("ExoPlayer:Playback", -16);
        this.r = handlerThread;
        handlerThread.start();
        Looper looper2 = handlerThread.getLooper();
        this.s = looper2;
        this.n = yVar2.a(looper2, this);
    }

    public static Pair H(r2 r2Var, p0 p0Var, boolean z10, int i10, boolean z11, q2 q2Var, p2 p2Var) {
        Object I;
        r2 r2Var2 = p0Var.a;
        if (r2Var.p()) {
            return null;
        }
        r2 r2Var3 = r2Var2.p() ? r2Var : r2Var2;
        try {
            Pair i11 = r2Var3.i(q2Var, p2Var, p0Var.b, p0Var.c);
            if (!r2Var.equals(r2Var3)) {
                if (r2Var.b(i11.first) == -1) {
                    if (!z10 || (I = I(q2Var, p2Var, i10, z11, i11.first, r2Var3, r2Var)) == null) {
                        return null;
                    }
                    return r2Var.i(q2Var, p2Var, r2Var.g(I, p2Var).c, -9223372036854775807L);
                }
                if (r2Var3.g(i11.first, p2Var).f && r2Var3.m(p2Var.c, q2Var, 0L).A == r2Var3.b(i11.first)) {
                    return r2Var.i(q2Var, p2Var, r2Var.g(i11.first, p2Var).c, p0Var.c);
                }
            }
            return i11;
        } catch (IndexOutOfBoundsException unused) {
            return null;
        }
    }

    public static Object I(q2 q2Var, p2 p2Var, int i10, boolean z10, Object obj, r2 r2Var, r2 r2Var2) {
        int b10 = r2Var.b(obj);
        int h = r2Var.h();
        int i11 = 0;
        int i12 = b10;
        int i13 = -1;
        while (i11 < h && i13 == -1) {
            q2 q2Var2 = q2Var;
            p2 p2Var2 = p2Var;
            int i14 = i10;
            boolean z11 = z10;
            r2 r2Var3 = r2Var;
            i12 = r2Var3.d(i12, p2Var2, q2Var2, i14, z11);
            if (i12 == -1) {
                break;
            }
            i13 = r2Var2.b(r2Var3.l(i12));
            i11++;
            r2Var = r2Var3;
            p2Var = p2Var2;
            q2Var = q2Var2;
            i10 = i14;
            z10 = z11;
        }
        if (i13 == -1) {
            return null;
        }
        return r2Var2.l(i13);
    }

    public static void O(e eVar, long j10) {
        eVar.setCurrentStreamFinal();
        if (eVar instanceof t4.l) {
            t4.l lVar = (t4.l) eVar;
            f5.a.i(lVar.isCurrentStreamFinal());
            lVar.A = j10;
        }
    }

    public static void d(e2 e2Var) {
        try {
            synchronized (e2Var) {
                synchronized (e2Var) {
                }
                e2Var.a.handleMessage(e2Var.d, e2Var.e);
                return;
            }
            e2Var.a.handleMessage(e2Var.d, e2Var.e);
            return;
        } finally {
            e2Var.b(true);
        }
    }

    public static boolean s(e eVar) {
        return eVar.getState() != 0;
    }

    public final void A() {
        D(true, false, true, false);
        this.f.b(true);
        Y(1);
        HandlerThread handlerThread = this.r;
        if (handlerThread != null) {
            handlerThread.quit();
        }
        synchronized (this) {
            this.K = true;
            notifyAll();
        }
    }

    public final void B(int i10, int i11, l4.h1 h1Var) {
        this.J.a(1);
        s1 s1Var = this.E;
        s1Var.getClass();
        f5.a.f(i10 >= 0 && i10 <= i11 && i11 <= s1Var.b.size());
        s1Var.j = h1Var;
        s1Var.g(i10, i11);
        n(s1Var.b(), false);
    }

    public final void C() {
        int i10;
        float f9 = this.y.getPlaybackParameters().a;
        k1 k1Var = this.D;
        i1 i1Var = k1Var.h;
        i1 i1Var2 = k1Var.i;
        boolean z10 = true;
        for (i1 i1Var3 = i1Var; i1Var3 != null && i1Var3.d; i1Var3 = i1Var3.l) {
            d5.y g10 = i1Var3.g(f9, this.I.a);
            d5.y yVar = i1Var3.n;
            d5.r[] rVarArr = g10.c;
            if (yVar != null && yVar.c.length == rVarArr.length) {
                for (int i11 = 0; i11 < rVarArr.length; i11++) {
                    if (g10.a(yVar, i11)) {
                    }
                }
                if (i1Var3 == i1Var2) {
                    z10 = false;
                }
            }
            if (z10) {
                k1 k1Var2 = this.D;
                i1 i1Var4 = k1Var2.h;
                boolean k9 = k1Var2.k(i1Var4);
                boolean[] zArr = new boolean[this.a.length];
                long a2 = i1Var4.a(g10, this.I.r, k9, zArr);
                w1 w1Var = this.I;
                boolean z11 = (w1Var.e == 4 || a2 == w1Var.r) ? false : true;
                w1 w1Var2 = this.I;
                i10 = 4;
                this.I = q(w1Var2.b, a2, w1Var2.c, w1Var2.d, z11, 5);
                if (z11) {
                    F(a2);
                }
                boolean[] zArr2 = new boolean[this.a.length];
                int i12 = 0;
                while (true) {
                    e[] eVarArr = this.a;
                    if (i12 >= eVarArr.length) {
                        break;
                    }
                    e eVar = eVarArr[i12];
                    boolean s10 = s(eVar);
                    zArr2[i12] = s10;
                    l4.c1 c1Var = i1Var4.c[i12];
                    if (s10) {
                        if (c1Var != eVar.getStream()) {
                            e(eVar);
                        } else if (zArr[i12]) {
                            eVar.resetPosition(this.W);
                        }
                    }
                    i12++;
                }
                g(zArr2);
            } else {
                i10 = 4;
                this.D.k(i1Var3);
                if (i1Var3.d) {
                    i1Var3.a(g10, Math.max(i1Var3.f.b, this.W - i1Var3.o), false, new boolean[i1Var3.i.length]);
                }
            }
            m(true);
            if (this.I.e != i10) {
                u();
                g0();
                this.n.d(2);
                return;
            }
            return;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:74:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00df  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void D(boolean z10, boolean z11, boolean z12, boolean z13) {
        long j10;
        long j11;
        boolean z14;
        List list;
        this.n.a.removeMessages(2);
        this.Z = null;
        this.N = false;
        k kVar = this.y;
        kVar.f = false;
        c2.e0 e0Var = kVar.a;
        if (e0Var.a) {
            e0Var.a(e0Var.getPositionUs());
            e0Var.a = false;
        }
        this.W = 1000000000000L;
        for (e eVar : this.a) {
            try {
                e(eVar);
            } catch (n | RuntimeException e10) {
                f5.a.p("ExoPlayerImplInternal", "Disable failed.", e10);
            }
        }
        if (z10) {
            for (e eVar2 : this.a) {
                if (this.b.remove(eVar2)) {
                    try {
                        eVar2.reset();
                    } catch (RuntimeException e11) {
                        f5.a.p("ExoPlayerImplInternal", "Reset failed.", e11);
                    }
                }
            }
        }
        this.U = 0;
        w1 w1Var = this.I;
        l4.c0 c0Var = w1Var.b;
        long j12 = w1Var.r;
        if (!this.I.b.a()) {
            w1 w1Var2 = this.I;
            p2 p2Var = this.w;
            l4.c0 c0Var2 = w1Var2.b;
            r2 r2Var = w1Var2.a;
            if (!r2Var.p() && !r2Var.g(c0Var2.a, p2Var).f) {
                j10 = this.I.r;
                if (z11) {
                    this.V = null;
                    Pair j13 = j(this.I.a);
                    c0Var = (l4.c0) j13.first;
                    j12 = ((Long) j13.second).longValue();
                    j10 = -9223372036854775807L;
                    if (!c0Var.equals(this.I.b)) {
                        z14 = true;
                        j11 = j12;
                        l4.c0 c0Var3 = c0Var;
                        this.D.b();
                        this.O = false;
                        w1 w1Var3 = this.I;
                        r2 r2Var2 = w1Var3.a;
                        int i10 = w1Var3.e;
                        n nVar = z13 ? null : w1Var3.f;
                        l4.k1 k1Var = z14 ? l4.k1.d : w1Var3.h;
                        d5.y yVar = z14 ? this.e : w1Var3.i;
                        if (z14) {
                            q8.x xVar = q8.z.b;
                            list = q8.l0.e;
                        } else {
                            list = w1Var3.j;
                        }
                        this.I = new w1(r2Var2, c0Var3, j10, j11, i10, nVar, false, k1Var, yVar, list, c0Var3, w1Var3.l, w1Var3.m, w1Var3.n, j11, 0L, j11, false);
                        if (z12) {
                            s1 s1Var = this.E;
                            HashMap hashMap = s1Var.f;
                            for (q1 q1Var : hashMap.values()) {
                                try {
                                    q1Var.a.o(q1Var.b);
                                } catch (RuntimeException e12) {
                                    f5.a.p("MediaSourceList", "Failed to release child source.", e12);
                                }
                                l4.a aVar = q1Var.a;
                                g9.l lVar = q1Var.c;
                                aVar.r(lVar);
                                q1Var.a.q(lVar);
                            }
                            hashMap.clear();
                            s1Var.g.clear();
                            s1Var.k = false;
                            return;
                        }
                        return;
                    }
                }
                j11 = j12;
                z14 = false;
                l4.c0 c0Var32 = c0Var;
                this.D.b();
                this.O = false;
                w1 w1Var32 = this.I;
                r2 r2Var22 = w1Var32.a;
                int i102 = w1Var32.e;
                if (z13) {
                }
                l4.k1 k1Var2 = z14 ? l4.k1.d : w1Var32.h;
                d5.y yVar2 = z14 ? this.e : w1Var32.i;
                if (z14) {
                }
                this.I = new w1(r2Var22, c0Var32, j10, j11, i102, nVar, false, k1Var2, yVar2, list, c0Var32, w1Var32.l, w1Var32.m, w1Var32.n, j11, 0L, j11, false);
                if (z12) {
                }
            }
        }
        j10 = this.I.c;
        if (z11) {
        }
        j11 = j12;
        z14 = false;
        l4.c0 c0Var322 = c0Var;
        this.D.b();
        this.O = false;
        w1 w1Var322 = this.I;
        r2 r2Var222 = w1Var322.a;
        int i1022 = w1Var322.e;
        if (z13) {
        }
        l4.k1 k1Var22 = z14 ? l4.k1.d : w1Var322.h;
        d5.y yVar22 = z14 ? this.e : w1Var322.i;
        if (z14) {
        }
        this.I = new w1(r2Var222, c0Var322, j10, j11, i1022, nVar, false, k1Var22, yVar22, list, c0Var322, w1Var322.l, w1Var322.m, w1Var322.n, j11, 0L, j11, false);
        if (z12) {
        }
    }

    public final void E() {
        i1 i1Var = this.D.h;
        this.M = i1Var != null && i1Var.f.h && this.L;
    }

    public final void F(long j10) {
        i1 i1Var = this.D.h;
        long j11 = j10 + (i1Var == null ? 1000000000000L : i1Var.o);
        this.W = j11;
        this.y.a.a(j11);
        for (e eVar : this.a) {
            if (s(eVar)) {
                eVar.resetPosition(this.W);
            }
        }
        for (i1 i1Var2 = r0.h; i1Var2 != null; i1Var2 = i1Var2.l) {
            for (d5.r rVar : i1Var2.n.c) {
                if (rVar != null) {
                    rVar.s();
                }
            }
        }
    }

    public final void G(r2 r2Var, r2 r2Var2) {
        if (r2Var.p() && r2Var2.p()) {
            return;
        }
        ArrayList arrayList = this.A;
        int size = arrayList.size() - 1;
        if (size < 0) {
            Collections.sort(arrayList);
        } else {
            a4.w.u(arrayList.get(size));
            throw null;
        }
    }

    public final void J(boolean z10) {
        l4.c0 c0Var = this.D.h.f.a;
        long L = L(c0Var, this.I.r, true, false);
        if (L != this.I.r) {
            w1 w1Var = this.I;
            this.I = q(c0Var, L, w1Var.c, w1Var.d, z10, 5);
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(18:20|(7:(9:64|65|(1:83)(1:71)|72|(1:82)|79|80|11|12)(1:22)|42|43|44|10|11|12)|23|24|(1:26)(1:60)|27|(1:29)(1:59)|30|31|32|(1:34)(1:57)|35|36|37|38|39|40|41) */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0154, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0155, code lost:
    
        r2 = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0156, code lost:
    
        r5 = r15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0158, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x015a, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x015b, code lost:
    
        r5 = r15;
     */
    /* JADX WARN: Removed duplicated region for block: B:14:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x00a1 A[Catch: all -> 0x00a4, TryCatch #1 {all -> 0x00a4, blocks: (B:6:0x0097, B:8:0x00a1, B:16:0x00ad, B:18:0x00b3, B:19:0x00b6, B:20:0x00be, B:67:0x00ce, B:71:0x00d6), top: B:5:0x0097 }] */
    /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object, l4.z] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void K(p0 p0Var) {
        long longValue;
        l4.c0 m10;
        long j10;
        boolean z10;
        long j11;
        boolean z11;
        l4.c0 c0Var;
        long j12;
        long f9;
        long j13;
        w1 w1Var;
        int i10;
        long j14;
        boolean z12;
        l4.c0 c0Var2;
        int i11;
        long j15;
        long L;
        boolean z13;
        w1 w1Var2;
        l4.c0 c0Var3;
        r2 r2Var;
        long j16;
        q0 q0Var = this;
        q0Var.J.a(1);
        Pair H = H(q0Var.I.a, p0Var, true, q0Var.P, q0Var.Q, q0Var.v, q0Var.w);
        try {
            if (H == null) {
                Pair j17 = q0Var.j(q0Var.I.a);
                m10 = (l4.c0) j17.first;
                longValue = ((Long) j17.second).longValue();
                z10 = !q0Var.I.a.p();
                j11 = -9223372036854775807L;
            } else {
                Object obj = H.first;
                longValue = ((Long) H.second).longValue();
                long j18 = p0Var.c == -9223372036854775807L ? -9223372036854775807L : longValue;
                m10 = q0Var.D.m(q0Var.I.a, obj, longValue);
                if (!m10.a()) {
                    j10 = 0;
                    z10 = p0Var.c == -9223372036854775807L;
                    j11 = j18;
                    if (!q0Var.I.a.p()) {
                        q0Var.V = p0Var;
                    } else if (H == null) {
                        if (q0Var.I.e != 1) {
                            q0Var.Y(4);
                        }
                        q0Var.D(false, true, false, true);
                    } else {
                        try {
                            if (m10.equals(q0Var.I.b)) {
                                try {
                                    i1 i1Var = q0Var.D.h;
                                    f9 = (i1Var == null || !i1Var.d || longValue == j10) ? longValue : i1Var.a.f(longValue, q0Var.H);
                                    if (f5.d0.S(f9) != f5.d0.S(q0Var.I.r) || ((i10 = (w1Var = q0Var.I).e) != 2 && i10 != 3)) {
                                        z11 = z10;
                                        j13 = j11;
                                        c0Var = m10;
                                    }
                                    j14 = w1Var.r;
                                    z12 = z10;
                                    c0Var2 = m10;
                                    i11 = 2;
                                    j15 = j14;
                                    q0Var.I = q0Var.q(c0Var2, j14, j11, j15, z12, i11);
                                    return;
                                } catch (Throwable th2) {
                                    th = th2;
                                    z11 = z10;
                                    c0Var = m10;
                                    j12 = longValue;
                                    q0Var.I = q0Var.q(c0Var, j12, j11, j12, z11, 2);
                                    throw th;
                                }
                            }
                            z11 = z10;
                            j13 = j11;
                            c0Var = m10;
                            f9 = longValue;
                            q0Var.h0(r2Var, c0Var3, r2Var, w1Var2.b, j16);
                            c0Var2 = c0Var3;
                            j11 = j16;
                            z12 = z13;
                            j14 = L;
                            i11 = 2;
                            j15 = j14;
                            q0Var = this;
                            q0Var.I = q0Var.q(c0Var2, j14, j11, j15, z12, i11);
                            return;
                        } catch (Throwable th3) {
                            th = th3;
                            c0Var = c0Var3;
                            j11 = j16;
                            z11 = z13;
                            j12 = L;
                            q0Var.I = q0Var.q(c0Var, j12, j11, j12, z11, 2);
                            throw th;
                        }
                        boolean z14 = q0Var.I.e == 4;
                        k1 k1Var = q0Var.D;
                        L = q0Var.L(c0Var, f9, k1Var.h != k1Var.i, z14);
                        z13 = z11 | (longValue != L);
                        w1Var2 = q0Var.I;
                        c0Var3 = c0Var;
                        r2Var = w1Var2.a;
                        j16 = j13;
                    }
                    z12 = z10;
                    c0Var2 = m10;
                    j14 = longValue;
                    i11 = 2;
                    j15 = j14;
                    q0Var = this;
                    q0Var.I = q0Var.q(c0Var2, j14, j11, j15, z12, i11);
                    return;
                }
                q0Var.I.a.g(m10.a, q0Var.w);
                longValue = q0Var.w.f(m10.b) == m10.c ? q0Var.w.h.b : 0L;
                j11 = j18;
                z10 = true;
            }
            if (!q0Var.I.a.p()) {
            }
            z12 = z10;
            c0Var2 = m10;
            j14 = longValue;
            i11 = 2;
            j15 = j14;
            q0Var = this;
            q0Var.I = q0Var.q(c0Var2, j14, j11, j15, z12, i11);
            return;
        } catch (Throwable th4) {
            th = th4;
            z11 = z10;
        }
        j10 = 0;
    }

    /* JADX WARN: Type inference failed for: r9v5, types: [java.lang.Object, l4.z] */
    public final long L(l4.c0 c0Var, long j10, boolean z10, boolean z11) {
        d0();
        this.N = false;
        if (z11 || this.I.e == 3) {
            Y(2);
        }
        k1 k1Var = this.D;
        i1 i1Var = k1Var.h;
        i1 i1Var2 = i1Var;
        while (i1Var2 != null && !c0Var.equals(i1Var2.f.a)) {
            i1Var2 = i1Var2.l;
        }
        if (z10 || i1Var != i1Var2 || (i1Var2 != null && i1Var2.o + j10 < 0)) {
            e[] eVarArr = this.a;
            for (e eVar : eVarArr) {
                e(eVar);
            }
            if (i1Var2 != null) {
                while (k1Var.h != i1Var2) {
                    k1Var.a();
                }
                k1Var.k(i1Var2);
                i1Var2.o = 1000000000000L;
                g(new boolean[eVarArr.length]);
            }
        }
        if (i1Var2 != null) {
            ?? r9 = i1Var2.a;
            k1Var.k(i1Var2);
            if (!i1Var2.d) {
                i1Var2.f = i1Var2.f.b(j10);
            } else if (i1Var2.e) {
                j10 = r9.p(j10);
                r9.r(j10 - this.x);
            }
            F(j10);
            u();
        } else {
            k1Var.b();
            F(j10);
        }
        m(false);
        this.n.d(2);
        return j10;
    }

    public final void M(e2 e2Var) {
        Looper looper = e2Var.f;
        Looper looper2 = this.s;
        f5.a0 a0Var = this.n;
        if (looper != looper2) {
            a0Var.a(15, e2Var).b();
            return;
        }
        d(e2Var);
        int i10 = this.I.e;
        if (i10 == 3 || i10 == 2) {
            a0Var.d(2);
        }
    }

    public final void N(e2 e2Var) {
        Looper looper = e2Var.f;
        if (looper.getThread().isAlive()) {
            this.B.a(looper, null).c(new cg.m2(25, this, e2Var));
        } else {
            f5.a.K("TAG", "Trying to send message on a dead thread.");
            e2Var.b(false);
        }
    }

    public final void P(boolean z10, AtomicBoolean atomicBoolean) {
        if (this.R != z10) {
            this.R = z10;
            if (!z10) {
                for (e eVar : this.a) {
                    if (!s(eVar) && this.b.remove(eVar)) {
                        eVar.reset();
                    }
                }
            }
        }
        if (atomicBoolean != null) {
            synchronized (this) {
                atomicBoolean.set(true);
                notifyAll();
            }
        }
    }

    public final void Q(m0 m0Var) {
        this.J.a(1);
        int i10 = m0Var.c;
        l4.h1 h1Var = m0Var.b;
        ArrayList arrayList = m0Var.a;
        if (i10 != -1) {
            this.V = new p0(new f2(arrayList, h1Var), m0Var.c, m0Var.d);
        }
        s1 s1Var = this.E;
        ArrayList arrayList2 = s1Var.b;
        s1Var.g(0, arrayList2.size());
        n(s1Var.a(arrayList2.size(), arrayList, h1Var), false);
    }

    public final void R(boolean z10) {
        if (z10 == this.T) {
            return;
        }
        this.T = z10;
        if (z10 || !this.I.o) {
            return;
        }
        this.n.d(2);
    }

    public final void S(boolean z10) {
        this.L = z10;
        E();
        if (this.M) {
            k1 k1Var = this.D;
            if (k1Var.i != k1Var.h) {
                J(true);
                m(false);
            }
        }
    }

    public final void T(int i10, int i11, boolean z10, boolean z11) {
        this.J.a(z11 ? 1 : 0);
        we.f fVar = this.J;
        fVar.b = true;
        fVar.f = true;
        fVar.g = i11;
        this.I = this.I.c(i10, z10);
        this.N = false;
        for (i1 i1Var = this.D.h; i1Var != null; i1Var = i1Var.l) {
            for (d5.r rVar : i1Var.n.c) {
                if (rVar != null) {
                    rVar.f(z10);
                }
            }
        }
        if (!Z()) {
            d0();
            g0();
            return;
        }
        int i12 = this.I.e;
        f5.a0 a0Var = this.n;
        if (i12 == 3) {
            b0();
            a0Var.d(2);
        } else if (i12 == 2) {
            a0Var.d(2);
        }
    }

    public final void U(x1 x1Var) {
        k kVar = this.y;
        kVar.setPlaybackParameters(x1Var);
        x1 playbackParameters = kVar.getPlaybackParameters();
        p(playbackParameters, playbackParameters.a, true, true);
    }

    public final void V(int i10) {
        this.P = i10;
        r2 r2Var = this.I.a;
        k1 k1Var = this.D;
        k1Var.f = i10;
        if (!k1Var.n(r2Var)) {
            J(true);
        }
        m(false);
    }

    public final void W(boolean z10) {
        this.Q = z10;
        r2 r2Var = this.I.a;
        k1 k1Var = this.D;
        k1Var.g = z10;
        if (!k1Var.n(r2Var)) {
            J(true);
        }
        m(false);
    }

    public final void X(l4.h1 h1Var) {
        this.J.a(1);
        s1 s1Var = this.E;
        int size = s1Var.b.size();
        if (h1Var.getLength() != size) {
            h1Var = h1Var.g().e(0, size);
        }
        s1Var.j = h1Var;
        n(s1Var.b(), false);
    }

    public final void Y(int i10) {
        w1 w1Var = this.I;
        if (w1Var.e != i10) {
            if (i10 != 2) {
                this.a0 = -9223372036854775807L;
            }
            this.I = w1Var.f(i10);
        }
    }

    public final boolean Z() {
        w1 w1Var = this.I;
        return w1Var.l && w1Var.m == 0;
    }

    @Override // l4.d1
    public final void a(l4.e1 e1Var) {
        this.n.a(9, (l4.z) e1Var).b();
    }

    public final boolean a0(r2 r2Var, l4.c0 c0Var) {
        if (c0Var.a() || r2Var.p()) {
            return false;
        }
        int i10 = r2Var.g(c0Var.a, this.w).c;
        q2 q2Var = this.v;
        r2Var.n(i10, q2Var);
        return q2Var.a() && q2Var.r && q2Var.f != -9223372036854775807L;
    }

    public final void b(m0 m0Var, int i10) {
        this.J.a(1);
        s1 s1Var = this.E;
        if (i10 == -1) {
            i10 = s1Var.b.size();
        }
        n(s1Var.a(i10, m0Var.a, m0Var.b), false);
    }

    public final void b0() {
        this.N = false;
        k kVar = this.y;
        kVar.f = true;
        kVar.a.b();
        for (e eVar : this.a) {
            if (s(eVar)) {
                eVar.start();
            }
        }
    }

    @Override // l4.y
    public final void c(l4.z zVar) {
        this.n.a(8, zVar).b();
    }

    public final void c0(boolean z10, boolean z11) {
        D(z10 || !this.R, false, true, false);
        this.J.a(z11 ? 1 : 0);
        this.f.b(true);
        Y(1);
    }

    public final void d0() {
        k kVar = this.y;
        kVar.f = false;
        c2.e0 e0Var = kVar.a;
        if (e0Var.a) {
            e0Var.a(e0Var.getPositionUs());
            e0Var.a = false;
        }
        for (e eVar : this.a) {
            if (s(eVar) && eVar.getState() == 2) {
                eVar.stop();
            }
        }
    }

    public final void e(e eVar) {
        if (s(eVar)) {
            k kVar = this.y;
            if (eVar == kVar.c) {
                kVar.d = null;
                kVar.c = null;
                kVar.e = true;
            }
            if (eVar.getState() == 2) {
                eVar.stop();
            }
            eVar.disable();
            this.U--;
        }
    }

    /* JADX WARN: Type inference failed for: r1v6, types: [java.lang.Object, l4.e1] */
    public final void e0() {
        i1 i1Var = this.D.j;
        boolean z10 = this.O || (i1Var != null && i1Var.a.b());
        w1 w1Var = this.I;
        if (z10 != w1Var.g) {
            this.I = new w1(w1Var.a, w1Var.b, w1Var.c, w1Var.d, w1Var.e, w1Var.f, z10, w1Var.h, w1Var.i, w1Var.j, w1Var.k, w1Var.l, w1Var.m, w1Var.n, w1Var.p, w1Var.q, w1Var.r, w1Var.o);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:326:0x0549, code lost:
    
        if (r9 >= r6.h) goto L297;
     */
    /* JADX WARN: Removed duplicated region for block: B:177:0x05c6  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x0606  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x0633  */
    /* JADX WARN: Removed duplicated region for block: B:206:0x0640  */
    /* JADX WARN: Removed duplicated region for block: B:212:0x064f  */
    /* JADX WARN: Removed duplicated region for block: B:216:0x06ab  */
    /* JADX WARN: Removed duplicated region for block: B:229:0x06a2  */
    /* JADX WARN: Removed duplicated region for block: B:232:0x0609  */
    /* JADX WARN: Removed duplicated region for block: B:242:0x0489  */
    /* JADX WARN: Removed duplicated region for block: B:257:0x0585  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x013e  */
    /* JADX WARN: Removed duplicated region for block: B:336:0x0562  */
    /* JADX WARN: Removed duplicated region for block: B:347:0x0157  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0291  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x02a6  */
    /* JADX WARN: Removed duplicated region for block: B:455:0x0148  */
    /* JADX WARN: Removed duplicated region for block: B:458:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:460:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:475:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0303 A[EDGE_INSN: B:74:0x0303->B:75:0x0303 BREAK  A[LOOP:0: B:42:0x02a1->B:53:0x0300], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0305  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0316  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0336  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0352  */
    /* JADX WARN: Type inference failed for: r2v21, types: [java.lang.Object, l4.z] */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, l4.z] */
    /* JADX WARN: Type inference failed for: r3v26, types: [java.lang.Object, l4.z] */
    /* JADX WARN: Type inference failed for: r3v69, types: [java.lang.Object, l4.e1] */
    /* JADX WARN: Type inference failed for: r5v25, types: [java.lang.Object, l4.z] */
    /* JADX WARN: Type inference failed for: r6v75, types: [java.lang.Object, l4.e1] */
    /* JADX WARN: Type inference failed for: r9v24, types: [java.lang.Object, l4.e1] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void f() {
        long j10;
        boolean z10;
        int i10;
        long j11;
        long j12;
        boolean z11;
        boolean z12;
        long j13;
        boolean z13;
        w1 w1Var;
        long j14;
        boolean z14;
        boolean z15;
        boolean z16;
        w1 w1Var2;
        boolean z17;
        boolean z18;
        int i11;
        i1 i1Var;
        i1 i1Var2;
        long j15;
        j1 c3;
        s1 s1Var;
        long j16;
        i1 i1Var3;
        i1 i1Var4;
        k1 k1Var;
        boolean z19;
        i1 i1Var5;
        i1 i1Var6;
        i1 a2;
        boolean z20;
        int i12;
        boolean z21;
        e[] eVarArr;
        this.B.getClass();
        long uptimeMillis = SystemClock.uptimeMillis();
        this.n.a.removeMessages(2);
        if (this.I.a.p() || !this.E.k) {
            j10 = Long.MIN_VALUE;
            z10 = false;
            i10 = 1;
        } else {
            k1 k1Var2 = this.D;
            long j17 = this.W;
            i1 i1Var7 = k1Var2.j;
            if (i1Var7 != null) {
                f5.a.i(i1Var7.l == null);
                if (i1Var7.d) {
                    i1Var7.a.U(j17 - i1Var7.o);
                    k1 k1Var3 = this.D;
                    i1Var = k1Var3.j;
                    if (i1Var != null || (!i1Var.f.i && i1Var.d && ((!i1Var.e || i1Var.a.L() == Long.MIN_VALUE) && k1Var3.j.f.e != -9223372036854775807L && k1Var3.k < 100))) {
                        k1 k1Var4 = this.D;
                        long j18 = this.W;
                        w1 w1Var3 = this.I;
                        i1Var2 = k1Var4.j;
                        if (i1Var2 != null) {
                            j15 = -9223372036854775807L;
                            c3 = k1Var4.d(w1Var3.a, w1Var3.b, w1Var3.c, w1Var3.r);
                        } else {
                            j15 = -9223372036854775807L;
                            c3 = k1Var4.c(w1Var3.a, i1Var2, j18);
                        }
                        if (c3 != null) {
                            k1 k1Var5 = this.D;
                            h2[] h2VarArr = this.c;
                            d5.u uVar = this.d;
                            com.google.android.exoplayer2.upstream.r rVar = this.f.a;
                            s1 s1Var2 = this.E;
                            d5.y yVar = this.e;
                            i1 i1Var8 = k1Var5.j;
                            if (i1Var8 == null) {
                                s1Var = s1Var2;
                                j16 = 1000000000000L;
                                j10 = Long.MIN_VALUE;
                            } else {
                                j10 = Long.MIN_VALUE;
                                s1Var = s1Var2;
                                j16 = (i1Var8.o + i1Var8.f.e) - c3.b;
                            }
                            i1 i1Var9 = new i1(h2VarArr, j16, uVar, rVar, s1Var, c3, yVar);
                            i1 i1Var10 = k1Var5.j;
                            if (i1Var10 == null) {
                                k1Var5.h = i1Var9;
                                k1Var5.i = i1Var9;
                            } else if (i1Var9 != i1Var10.l) {
                                i1Var10.b();
                                i1Var10.l = i1Var9;
                                i1Var10.c();
                            }
                            k1Var5.l = null;
                            k1Var5.j = i1Var9;
                            k1Var5.k++;
                            k1Var5.j();
                            i1Var9.a.n(this, c3.b);
                            if (this.D.h == i1Var9) {
                                F(c3.b);
                            }
                            m(false);
                            if (this.O) {
                                this.O = r();
                                e0();
                            } else {
                                u();
                            }
                            e[] eVarArr2 = this.a;
                            k1 k1Var6 = this.D;
                            i1Var3 = k1Var6.i;
                            if (i1Var3 != null) {
                                if (i1Var3.l == null || this.M) {
                                    z10 = false;
                                    i10 = 1;
                                    if (i1Var3.f.i || this.M) {
                                        for (int i13 = 0; i13 < eVarArr2.length; i13++) {
                                            e eVar = eVarArr2[i13];
                                            l4.c1 c1Var = i1Var3.c[i13];
                                            if (c1Var != null && eVar.getStream() == c1Var && eVar.hasReadStreamToEnd()) {
                                                long j19 = i1Var3.f.e;
                                                O(eVar, (j19 == j15 || j19 == j10) ? j15 : i1Var3.o + j19);
                                            }
                                        }
                                    }
                                } else if (i1Var3.d) {
                                    int i14 = 0;
                                    while (true) {
                                        if (i14 < eVarArr2.length) {
                                            e eVar2 = eVarArr2[i14];
                                            l4.c1 c1Var2 = i1Var3.c[i14];
                                            if (eVar2.getStream() != c1Var2) {
                                                break;
                                            }
                                            if (c1Var2 != null && !eVar2.hasReadStreamToEnd()) {
                                                i1 i1Var11 = i1Var3.l;
                                                if (!i1Var3.f.f) {
                                                    break;
                                                }
                                                if (!i1Var11.d) {
                                                    break;
                                                }
                                                if (!(eVar2 instanceof t4.l) && !(eVar2 instanceof b4.f) && eVar2.getReadingPositionUs() < i1Var11.e()) {
                                                    break;
                                                }
                                            }
                                            i14++;
                                        } else {
                                            i1 i1Var12 = i1Var3.l;
                                            if (i1Var12.d || this.W >= i1Var12.e()) {
                                                d5.y yVar2 = i1Var3.n;
                                                i1 i1Var13 = k1Var6.i;
                                                f5.a.i((i1Var13 == null || i1Var13.l == null) ? false : true);
                                                k1Var6.i = k1Var6.i.l;
                                                k1Var6.j();
                                                i1 i1Var14 = k1Var6.i;
                                                d5.y yVar3 = i1Var14.n;
                                                r2 r2Var = this.I.a;
                                                z10 = false;
                                                i10 = 1;
                                                h0(r2Var, i1Var14.f.a, r2Var, i1Var3.f.a, -9223372036854775807L);
                                                if (!i1Var14.d || i1Var14.a.E() == j15) {
                                                    for (int i15 = 0; i15 < eVarArr2.length; i15++) {
                                                        boolean b10 = yVar2.b(i15);
                                                        boolean b11 = yVar3.b(i15);
                                                        if (b10 && !eVarArr2[i15].isCurrentStreamFinal()) {
                                                            boolean z22 = this.c[i15].getTrackType() == -2;
                                                            i2 i2Var = yVar2.b[i15];
                                                            i2 i2Var2 = yVar3.b[i15];
                                                            if (!b11 || !i2Var2.equals(i2Var) || z22) {
                                                                O(eVarArr2[i15], i1Var14.e());
                                                            }
                                                        }
                                                    }
                                                } else {
                                                    long e10 = i1Var14.e();
                                                    for (e eVar3 : eVarArr2) {
                                                        if (eVar3.getStream() != null) {
                                                            O(eVar3, e10);
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                                k1 k1Var7 = this.D;
                                i1Var4 = k1Var7.i;
                                if (i1Var4 != null && k1Var7.h != i1Var4 && !i1Var4.g) {
                                    d5.y yVar4 = i1Var4.n;
                                    l4.c1[] c1VarArr = i1Var4.c;
                                    i12 = 0;
                                    z21 = false;
                                    while (true) {
                                        eVarArr = this.a;
                                        if (i12 < eVarArr.length) {
                                            break;
                                        }
                                        e eVar4 = eVarArr[i12];
                                        if (s(eVar4)) {
                                            boolean z23 = eVar4.getStream() != c1VarArr[i12];
                                            if (!yVar4.b(i12) || z23) {
                                                if (!eVar4.isCurrentStreamFinal()) {
                                                    d5.r rVar2 = yVar4.c[i12];
                                                    int length = rVar2 != null ? rVar2.length() : 0;
                                                    t0[] t0VarArr = new t0[length];
                                                    for (int i16 = 0; i16 < length; i16++) {
                                                        t0VarArr[i16] = rVar2.g(i16);
                                                    }
                                                    eVar4.replaceStream(t0VarArr, c1VarArr[i12], i1Var4.e(), i1Var4.o);
                                                } else if (eVar4.isEnded()) {
                                                    e(eVar4);
                                                } else {
                                                    z21 = true;
                                                }
                                            }
                                        }
                                        i12++;
                                    }
                                    if (!z21) {
                                        g(new boolean[eVarArr.length]);
                                    }
                                }
                                k1Var = this.D;
                                z19 = false;
                                while (Z() && !this.M && (i1Var5 = k1Var.h) != null && (i1Var6 = i1Var5.l) != null && this.W >= i1Var6.e() && i1Var6.g) {
                                    if (z19) {
                                        v();
                                    }
                                    a2 = k1Var.a();
                                    a2.getClass();
                                    if (this.I.b.a.equals(a2.f.a.a)) {
                                        l4.c0 c0Var = this.I.b;
                                        if (c0Var.b == -1) {
                                            l4.c0 c0Var2 = a2.f.a;
                                            if (c0Var2.b == -1 && c0Var.e != c0Var2.e) {
                                                z20 = true;
                                                j1 j1Var = a2.f;
                                                l4.c0 c0Var3 = j1Var.a;
                                                boolean z24 = z20;
                                                long j20 = j1Var.b;
                                                this.I = q(c0Var3, j20, j1Var.c, j20, !z24, 0);
                                                E();
                                                g0();
                                                z19 = true;
                                            }
                                        }
                                    }
                                    z20 = false;
                                    j1 j1Var2 = a2.f;
                                    l4.c0 c0Var32 = j1Var2.a;
                                    boolean z242 = z20;
                                    long j202 = j1Var2.b;
                                    this.I = q(c0Var32, j202, j1Var2.c, j202, !z242, 0);
                                    E();
                                    g0();
                                    z19 = true;
                                }
                            }
                            z10 = false;
                            i10 = 1;
                            k1 k1Var72 = this.D;
                            i1Var4 = k1Var72.i;
                            if (i1Var4 != null) {
                                d5.y yVar42 = i1Var4.n;
                                l4.c1[] c1VarArr2 = i1Var4.c;
                                i12 = 0;
                                z21 = false;
                                while (true) {
                                    eVarArr = this.a;
                                    if (i12 < eVarArr.length) {
                                    }
                                    i12++;
                                }
                                if (!z21) {
                                }
                            }
                            k1Var = this.D;
                            z19 = false;
                            while (Z()) {
                                if (z19) {
                                }
                                a2 = k1Var.a();
                                a2.getClass();
                                if (this.I.b.a.equals(a2.f.a.a)) {
                                }
                                z20 = false;
                                j1 j1Var22 = a2.f;
                                l4.c0 c0Var322 = j1Var22.a;
                                boolean z2422 = z20;
                                long j2022 = j1Var22.b;
                                this.I = q(c0Var322, j2022, j1Var22.c, j2022, !z2422, 0);
                                E();
                                g0();
                                z19 = true;
                            }
                        }
                    } else {
                        j15 = -9223372036854775807L;
                    }
                    j10 = Long.MIN_VALUE;
                    if (this.O) {
                    }
                    e[] eVarArr22 = this.a;
                    k1 k1Var62 = this.D;
                    i1Var3 = k1Var62.i;
                    if (i1Var3 != null) {
                    }
                    z10 = false;
                    i10 = 1;
                    k1 k1Var722 = this.D;
                    i1Var4 = k1Var722.i;
                    if (i1Var4 != null) {
                    }
                    k1Var = this.D;
                    z19 = false;
                    while (Z()) {
                    }
                }
            }
            k1 k1Var32 = this.D;
            i1Var = k1Var32.j;
            if (i1Var != null) {
            }
            k1 k1Var42 = this.D;
            long j182 = this.W;
            w1 w1Var32 = this.I;
            i1Var2 = k1Var42.j;
            if (i1Var2 != null) {
            }
            if (c3 != null) {
            }
            j10 = Long.MIN_VALUE;
            if (this.O) {
            }
            e[] eVarArr222 = this.a;
            k1 k1Var622 = this.D;
            i1Var3 = k1Var622.i;
            if (i1Var3 != null) {
            }
            z10 = false;
            i10 = 1;
            k1 k1Var7222 = this.D;
            i1Var4 = k1Var7222.i;
            if (i1Var4 != null) {
            }
            k1Var = this.D;
            z19 = false;
            while (Z()) {
            }
        }
        int i17 = this.I.e;
        if (i17 == i10 || i17 == 4) {
            return;
        }
        i1 i1Var15 = this.D.h;
        if (i1Var15 == null) {
            this.n.a.sendEmptyMessageAtTime(2, uptimeMillis + 10);
            return;
        }
        f5.a.c("doSomeWork");
        g0();
        if (i1Var15.d) {
            long elapsedRealtime = SystemClock.elapsedRealtime() * 1000;
            j11 = 10;
            j12 = 1000;
            i1Var15.a.r(this.I.r - this.x);
            int i18 = 0;
            boolean z25 = true;
            z12 = true;
            while (true) {
                e[] eVarArr3 = this.a;
                if (i18 >= eVarArr3.length) {
                    break;
                }
                e eVar5 = eVarArr3[i18];
                if (s(eVar5)) {
                    eVar5.render(this.W, elapsedRealtime);
                    z25 = z25 && eVar5.isEnded();
                    boolean z26 = i1Var15.c[i18] != eVar5.getStream();
                    boolean z27 = z26 || (!z26 && eVar5.hasReadStreamToEnd()) || eVar5.isReady() || eVar5.isEnded();
                    z12 = z12 && z27;
                    if (!z27) {
                        eVar5.maybeThrowStreamError();
                    }
                }
                i18++;
            }
            z11 = z25;
        } else {
            j11 = 10;
            j12 = 1000;
            i1Var15.a.o();
            z11 = true;
            z12 = true;
        }
        long j21 = i1Var15.f.e;
        if (z11 && i1Var15.d) {
            j13 = -9223372036854775807L;
            if (j21 == -9223372036854775807L || j21 <= this.I.r) {
                z13 = true;
                if (z13 && this.M) {
                    this.M = z10;
                    T(this.I.m, 5, z10, z10);
                }
                if (z13 || !i1Var15.f.i) {
                    w1Var = this.I;
                    if (w1Var.e != 2) {
                        k1 k1Var8 = this.D;
                        if (this.U == 0) {
                            z14 = t();
                            j14 = uptimeMillis;
                        } else {
                            if (z12) {
                                if (w1Var.g) {
                                    long j22 = a0(w1Var.a, k1Var8.h.f.a) ? this.F.h : j13;
                                    i1 i1Var16 = k1Var8.j;
                                    boolean z28 = i1Var16.d && (!i1Var16.e || i1Var16.a.L() == j10) && i1Var16.f.i;
                                    boolean z29 = i1Var16.f.a.a() && !i1Var16.d;
                                    if (!z28 && !z29) {
                                        j jVar = this.f;
                                        j14 = uptimeMillis;
                                        long j23 = this.I.p;
                                        i1 i1Var17 = this.D.j;
                                        long max = i1Var17 == null ? 0L : Math.max(0L, j23 - (this.W - i1Var17.o));
                                        float f9 = this.y.getPlaybackParameters().a;
                                        boolean z30 = this.N;
                                        jVar.getClass();
                                        long x4 = f5.d0.x(max, f9);
                                        long j24 = z30 ? jVar.e : jVar.d;
                                        if (j22 != j13) {
                                            j24 = Math.min(j22 / 2, j24);
                                        }
                                        if (j24 > 0 && x4 < j24) {
                                            com.google.android.exoplayer2.upstream.r rVar3 = jVar.a;
                                            synchronized (rVar3) {
                                                int i19 = rVar3.d * rVar3.b;
                                            }
                                        }
                                        z14 = true;
                                    }
                                }
                                j14 = uptimeMillis;
                                z14 = true;
                            } else {
                                j14 = uptimeMillis;
                            }
                            z14 = false;
                        }
                        if (z14) {
                            Y(3);
                            this.Z = null;
                            if (Z()) {
                                b0();
                            }
                        }
                    } else {
                        j14 = uptimeMillis;
                    }
                    if (this.I.e == 3 && (this.U != 0 ? !z12 : !t())) {
                        this.N = Z();
                        Y(2);
                        if (this.N) {
                            for (i1 i1Var18 = this.D.h; i1Var18 != null; i1Var18 = i1Var18.l) {
                                for (d5.r rVar4 : i1Var18.n.c) {
                                    if (rVar4 != null) {
                                        rVar4.t();
                                    }
                                }
                            }
                            i iVar = this.F;
                            long j25 = iVar.h;
                            if (j25 != j13) {
                                long j26 = j25 + iVar.b;
                                iVar.h = j26;
                                long j27 = iVar.g;
                                if (j27 != j13 && j26 > j27) {
                                    iVar.h = j27;
                                }
                                iVar.l = j13;
                            }
                        }
                        d0();
                    }
                } else {
                    Y(4);
                    d0();
                    j14 = uptimeMillis;
                }
                if (this.I.e == 2) {
                    int i20 = 0;
                    while (true) {
                        e[] eVarArr4 = this.a;
                        if (i20 >= eVarArr4.length) {
                            break;
                        }
                        if (s(eVarArr4[i20]) && this.a[i20].getStream() == i1Var15.c[i20]) {
                            this.a[i20].maybeThrowStreamError();
                        }
                        i20++;
                    }
                    w1 w1Var4 = this.I;
                    if (!w1Var4.g && w1Var4.q < 500000 && r()) {
                        z15 = true;
                        if (!z15) {
                            this.a0 = j13;
                        } else if (this.a0 == j13) {
                            this.B.getClass();
                            this.a0 = SystemClock.elapsedRealtime();
                        } else {
                            this.B.getClass();
                            if (SystemClock.elapsedRealtime() - this.a0 >= 4000) {
                                throw new IllegalStateException("Playback stuck buffering and not loading");
                            }
                        }
                        boolean z31 = !Z() && this.I.e == 3;
                        z16 = !this.T && this.S && z31;
                        w1Var2 = this.I;
                        if (w1Var2.o != z16) {
                            z17 = z31;
                            z18 = z16;
                            this.I = new w1(w1Var2.a, w1Var2.b, w1Var2.c, w1Var2.d, w1Var2.e, w1Var2.f, w1Var2.g, w1Var2.h, w1Var2.i, w1Var2.j, w1Var2.k, w1Var2.l, w1Var2.m, w1Var2.n, w1Var2.p, w1Var2.q, w1Var2.r, z18);
                        } else {
                            z17 = z31;
                            z18 = z16;
                        }
                        this.S = false;
                        if (!z18 && (i11 = this.I.e) != 4) {
                            if (!z17 || i11 == 2) {
                                this.n.a.sendEmptyMessageAtTime(2, j14 + j11);
                            } else if (i11 == 3 && this.U != 0) {
                                this.n.a.sendEmptyMessageAtTime(2, j14 + j12);
                            }
                        }
                        f5.a.q();
                    }
                }
                z15 = false;
                if (!z15) {
                }
                if (Z()) {
                }
                if (this.T) {
                }
                w1Var2 = this.I;
                if (w1Var2.o != z16) {
                }
                this.S = false;
                if (!z18) {
                    if (z17) {
                    }
                    this.n.a.sendEmptyMessageAtTime(2, j14 + j11);
                }
                f5.a.q();
            }
        } else {
            j13 = -9223372036854775807L;
        }
        z13 = false;
        if (z13) {
            this.M = z10;
            T(this.I.m, 5, z10, z10);
        }
        if (z13) {
        }
        w1Var = this.I;
        if (w1Var.e != 2) {
        }
        if (this.I.e == 3) {
            this.N = Z();
            Y(2);
            if (this.N) {
            }
            d0();
        }
        if (this.I.e == 2) {
        }
        z15 = false;
        if (!z15) {
        }
        if (Z()) {
        }
        if (this.T) {
        }
        w1Var2 = this.I;
        if (w1Var2.o != z16) {
        }
        this.S = false;
        if (!z18) {
        }
        f5.a.q();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public final void f0(d5.y yVar) {
        d5.r[] rVarArr = yVar.c;
        j jVar = this.f;
        int i10 = jVar.f;
        if (i10 == -1) {
            int i11 = 0;
            int i12 = 0;
            while (true) {
                e[] eVarArr = this.a;
                int i13 = 13107200;
                if (i11 < eVarArr.length) {
                    if (rVarArr[i11] != null) {
                        switch (eVarArr[i11].getTrackType()) {
                            case -2:
                                i13 = 0;
                                i12 += i13;
                                break;
                            case -1:
                            default:
                                throw new IllegalArgumentException();
                            case 0:
                                i13 = 144310272;
                                i12 += i13;
                                break;
                            case 1:
                                i12 += i13;
                                break;
                            case 2:
                                i13 = 131072000;
                                i12 += i13;
                                break;
                            case 3:
                            case 4:
                            case 5:
                            case 6:
                                i13 = 131072;
                                i12 += i13;
                                break;
                        }
                    }
                    i11++;
                } else {
                    i10 = Math.max(13107200, i12);
                }
            }
        }
        jVar.h = i10;
        jVar.a.a(i10);
    }

    public final void g(boolean[] zArr) {
        e[] eVarArr;
        Set set;
        d5.y yVar;
        f5.n nVar;
        k1 k1Var = this.D;
        i1 i1Var = k1Var.i;
        d5.y yVar2 = i1Var.n;
        int i10 = 0;
        while (true) {
            eVarArr = this.a;
            int length = eVarArr.length;
            set = this.b;
            if (i10 >= length) {
                break;
            }
            if (!yVar2.b(i10) && set.remove(eVarArr[i10])) {
                eVarArr[i10].reset();
            }
            i10++;
        }
        int i11 = 0;
        while (i11 < eVarArr.length) {
            if (yVar2.b(i11)) {
                boolean z10 = zArr[i11];
                e eVar = eVarArr[i11];
                if (!s(eVar)) {
                    i1 i1Var2 = k1Var.i;
                    boolean z11 = i1Var2 == k1Var.h;
                    d5.y yVar3 = i1Var2.n;
                    i2 i2Var = yVar3.b[i11];
                    d5.r rVar = yVar3.c[i11];
                    int length2 = rVar != null ? rVar.length() : 0;
                    t0[] t0VarArr = new t0[length2];
                    for (int i12 = 0; i12 < length2; i12++) {
                        t0VarArr[i12] = rVar.g(i12);
                    }
                    boolean z12 = Z() && this.I.e == 3;
                    boolean z13 = !z10 && z12;
                    this.U++;
                    set.add(eVar);
                    yVar = yVar2;
                    boolean z14 = z12;
                    eVar.enable(i2Var, t0VarArr, i1Var2.c[i11], this.W, z13, z11, i1Var2.e(), i1Var2.o);
                    eVar.handleMessage(11, new l0(this));
                    k kVar = this.y;
                    kVar.getClass();
                    f5.n mediaClock = eVar.getMediaClock();
                    if (mediaClock != null && mediaClock != (nVar = kVar.d)) {
                        if (nVar != null) {
                            throw new n(2, new IllegalStateException("Multiple renderer media clocks enabled."), MediaDataController.MAX_STYLE_RUNS_COUNT);
                        }
                        kVar.d = mediaClock;
                        kVar.c = eVar;
                        mediaClock.setPlaybackParameters((x1) kVar.a.e);
                    }
                    if (z14) {
                        eVar.start();
                    }
                    i11++;
                    yVar2 = yVar;
                }
            }
            yVar = yVar2;
            i11++;
            yVar2 = yVar;
        }
        i1Var.g = true;
    }

    /* JADX WARN: Type inference failed for: r2v25, types: [java.lang.Object, l4.z] */
    public final void g0() {
        long j10;
        char c3;
        char c6;
        long max;
        i1 i1Var = this.D.h;
        if (i1Var == null) {
            return;
        }
        long E = i1Var.d ? i1Var.a.E() : -9223372036854775807L;
        if (E != -9223372036854775807L) {
            F(E);
            if (E != this.I.r) {
                w1 w1Var = this.I;
                this.I = q(w1Var.b, E, w1Var.c, E, true, 5);
            }
        } else {
            k kVar = this.y;
            boolean z10 = i1Var != this.D.i;
            c2.e0 e0Var = kVar.a;
            e eVar = kVar.c;
            if (eVar == null || eVar.isEnded() || (!kVar.c.isReady() && (z10 || kVar.c.hasReadStreamToEnd()))) {
                kVar.e = true;
                if (kVar.f) {
                    e0Var.b();
                }
            } else {
                f5.n nVar = kVar.d;
                nVar.getClass();
                long positionUs = nVar.getPositionUs();
                if (kVar.e) {
                    if (positionUs >= e0Var.getPositionUs()) {
                        kVar.e = false;
                        if (kVar.f) {
                            e0Var.b();
                        }
                    } else if (e0Var.a) {
                        e0Var.a(e0Var.getPositionUs());
                        e0Var.a = false;
                    }
                }
                e0Var.a(positionUs);
                x1 playbackParameters = nVar.getPlaybackParameters();
                if (!playbackParameters.equals((x1) e0Var.e)) {
                    e0Var.setPlaybackParameters(playbackParameters);
                    kVar.b.n.a(16, playbackParameters).b();
                }
            }
            long positionUs2 = kVar.getPositionUs();
            this.W = positionUs2;
            long j11 = positionUs2 - i1Var.o;
            long j12 = this.I.r;
            ArrayList arrayList = this.A;
            if (!arrayList.isEmpty() && !this.I.b.a()) {
                if (this.Y) {
                    this.Y = false;
                }
                w1 w1Var2 = this.I;
                w1Var2.a.b(w1Var2.b.a);
                int min = Math.min(this.X, arrayList.size());
                if (min > 0 && arrayList.get(min - 1) != null) {
                    throw new ClassCastException();
                }
                if (min < arrayList.size() && arrayList.get(min) != null) {
                    throw new ClassCastException();
                }
                this.X = min;
            }
            this.I.r = j11;
        }
        this.I.p = this.D.j.d();
        w1 w1Var3 = this.I;
        long j13 = w1Var3.p;
        i1 i1Var2 = this.D.j;
        w1Var3.q = i1Var2 == null ? 0L : Math.max(0L, j13 - (this.W - i1Var2.o));
        w1 w1Var4 = this.I;
        if (w1Var4.l && w1Var4.e == 3 && a0(w1Var4.a, w1Var4.b)) {
            w1 w1Var5 = this.I;
            float f9 = 1.0f;
            if (w1Var5.n.a == 1.0f) {
                i iVar = this.F;
                long h = h(w1Var5.a, w1Var5.b.a, w1Var5.r);
                long j14 = this.I.p;
                i1 i1Var3 = this.D.j;
                if (i1Var3 == null) {
                    j10 = -9223372036854775807L;
                    c3 = 1;
                    c6 = 0;
                    max = 0;
                } else {
                    j10 = -9223372036854775807L;
                    c3 = 1;
                    c6 = 0;
                    max = Math.max(0L, j14 - (this.W - i1Var3.o));
                }
                if (iVar.c != j10) {
                    long j15 = h - max;
                    long j16 = iVar.m;
                    if (j16 == j10) {
                        iVar.m = j15;
                        iVar.n = 0L;
                    } else {
                        iVar.m = Math.max(j15, (long) ((j15 * 9.999871E-4f) + (j16 * 0.999f)));
                        iVar.n = (long) ((9.999871E-4f * Math.abs(j15 - r13)) + (0.999f * iVar.n));
                    }
                    if (iVar.l == j10 || SystemClock.elapsedRealtime() - iVar.l >= 1000) {
                        iVar.l = SystemClock.elapsedRealtime();
                        long j17 = (iVar.n * 3) + iVar.m;
                        if (iVar.h > j17) {
                            float H = f5.d0.H(1000L);
                            long j18 = ((long) ((iVar.k - 1.0f) * H)) + ((long) ((iVar.i - 1.0f) * H));
                            long j19 = iVar.e;
                            long j20 = iVar.h - j18;
                            long[] jArr = new long[3];
                            jArr[c6] = j17;
                            jArr[c3] = j19;
                            jArr[2] = j20;
                            long j21 = jArr[c6];
                            for (int i10 = 1; i10 < 3; i10++) {
                                long j22 = jArr[i10];
                                if (j22 > j21) {
                                    j21 = j22;
                                }
                            }
                            iVar.h = j21;
                        } else {
                            long i11 = f5.d0.i(h - ((long) (Math.max(0.0f, iVar.k - 1.0f) / 1.0E-7f)), iVar.h, j17);
                            iVar.h = i11;
                            long j23 = iVar.g;
                            if (j23 != j10 && i11 > j23) {
                                iVar.h = j23;
                            }
                        }
                        long j24 = h - iVar.h;
                        if (Math.abs(j24) < iVar.a) {
                            iVar.k = 1.0f;
                        } else {
                            iVar.k = f5.d0.g((1.0E-7f * j24) + 1.0f, iVar.j, iVar.i);
                        }
                        f9 = iVar.k;
                    } else {
                        f9 = iVar.k;
                    }
                }
                if (this.y.getPlaybackParameters().a != f9) {
                    this.y.setPlaybackParameters(new x1(f9, this.I.n.b));
                    p(this.I.n, this.y.getPlaybackParameters().a, false, false);
                }
            }
        }
    }

    public final long h(r2 r2Var, Object obj, long j10) {
        p2 p2Var = this.w;
        int i10 = r2Var.g(obj, p2Var).c;
        q2 q2Var = this.v;
        r2Var.n(i10, q2Var);
        if (q2Var.f != -9223372036854775807L && q2Var.a() && q2Var.r) {
            return f5.d0.H(f5.d0.t(q2Var.h) - q2Var.f) - (j10 + p2Var.e);
        }
        return -9223372036854775807L;
    }

    public final void h0(r2 r2Var, l4.c0 c0Var, r2 r2Var2, l4.c0 c0Var2, long j10) {
        boolean a02 = a0(r2Var, c0Var);
        Object obj = c0Var.a;
        if (!a02) {
            x1 x1Var = c0Var.a() ? x1.d : this.I.n;
            k kVar = this.y;
            if (kVar.getPlaybackParameters().equals(x1Var)) {
                return;
            }
            kVar.setPlaybackParameters(x1Var);
            return;
        }
        p2 p2Var = this.w;
        int i10 = r2Var.g(obj, p2Var).c;
        q2 q2Var = this.v;
        r2Var.n(i10, q2Var);
        b1 b1Var = q2Var.v;
        int i11 = f5.d0.a;
        i iVar = this.F;
        iVar.getClass();
        iVar.c = f5.d0.H(b1Var.a);
        iVar.f = f5.d0.H(b1Var.b);
        iVar.g = f5.d0.H(b1Var.c);
        float f9 = b1Var.d;
        if (f9 == -3.4028235E38f) {
            f9 = 0.97f;
        }
        iVar.j = f9;
        float f10 = b1Var.e;
        if (f10 == -3.4028235E38f) {
            f10 = 1.03f;
        }
        iVar.i = f10;
        if (f9 == 1.0f && f10 == 1.0f) {
            iVar.c = -9223372036854775807L;
        }
        iVar.a();
        if (j10 != -9223372036854775807L) {
            iVar.d = h(r2Var, obj, j10);
            iVar.a();
            return;
        }
        if (f5.d0.a(!r2Var2.p() ? r2Var2.m(r2Var2.g(c0Var2.a, p2Var).c, q2Var, 0L).a : null, q2Var.a)) {
            return;
        }
        iVar.d = -9223372036854775807L;
        iVar.a();
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        i1 i1Var;
        int i10 = MediaDataController.MAX_STYLE_RUNS_COUNT;
        try {
            switch (message.what) {
                case 0:
                    y();
                    break;
                case 1:
                    T(message.arg2, 1, message.arg1 != 0, true);
                    break;
                case 2:
                    f();
                    break;
                case 3:
                    K((p0) message.obj);
                    break;
                case 4:
                    U((x1) message.obj);
                    break;
                case 5:
                    this.H = (j2) message.obj;
                    break;
                case 6:
                    c0(false, true);
                    break;
                case 7:
                    A();
                    return true;
                case 8:
                    o((l4.z) message.obj);
                    break;
                case 9:
                    k((l4.z) message.obj);
                    break;
                case 10:
                    C();
                    break;
                case 11:
                    V(message.arg1);
                    break;
                case 12:
                    W(message.arg1 != 0);
                    break;
                case 13:
                    P(message.arg1 != 0, (AtomicBoolean) message.obj);
                    break;
                case 14:
                    e2 e2Var = (e2) message.obj;
                    e2Var.getClass();
                    M(e2Var);
                    break;
                case 15:
                    N((e2) message.obj);
                    break;
                case 16:
                    x1 x1Var = (x1) message.obj;
                    p(x1Var, x1Var.a, true, false);
                    break;
                case 17:
                    Q((m0) message.obj);
                    break;
                case 18:
                    b((m0) message.obj, message.arg1);
                    break;
                case 19:
                    x((n0) message.obj);
                    break;
                case 20:
                    B(message.arg1, message.arg2, (l4.h1) message.obj);
                    break;
                case 21:
                    X((l4.h1) message.obj);
                    break;
                case 22:
                    w();
                    break;
                case 23:
                    S(message.arg1 != 0);
                    break;
                case 24:
                    R(message.arg1 == 1);
                    break;
                case 25:
                    J(true);
                    break;
                default:
                    return false;
            }
        } catch (com.google.android.exoplayer2.upstream.n e10) {
            l(e10, e10.a);
        } catch (n e11) {
            e = e11;
            if (e.c == 1 && (i1Var = this.D.i) != null) {
                e = e.a(i1Var.f.a);
            }
            if (e.r && this.Z == null) {
                f5.a.L("ExoPlayerImplInternal", "Recoverable renderer error", e);
                this.Z = e;
                f5.a0 a0Var = this.n;
                f5.z a2 = a0Var.a(25, e);
                Handler handler = a0Var.a;
                Message message2 = a2.a;
                message2.getClass();
                handler.sendMessageAtFrontOfQueue(message2);
                a2.a();
            } else {
                n nVar = this.Z;
                if (nVar != null) {
                    nVar.addSuppressed(e);
                    e = this.Z;
                }
                f5.a.p("ExoPlayerImplInternal", "Playback error", e);
                c0(true, false);
                this.I = this.I.d(e);
            }
        } catch (t1 e12) {
            boolean z10 = e12.a;
            int i11 = e12.b;
            if (i11 == 1) {
                i10 = z10 ? 3001 : 3003;
            } else if (i11 == 4) {
                i10 = z10 ? 3002 : 3004;
            }
            l(e12, i10);
        } catch (RuntimeException e13) {
            if ((e13 instanceof IllegalStateException) || (e13 instanceof IllegalArgumentException)) {
                i10 = 1004;
            }
            n nVar2 = new n(2, e13, i10);
            f5.a.p("ExoPlayerImplInternal", "Playback error", nVar2);
            c0(true, false);
            this.I = this.I.d(nVar2);
        } catch (l4.b e14) {
            l(e14, 1002);
        } catch (n3.d e15) {
            l(e15, e15.a);
        } catch (IOException e16) {
            l(e16, 2000);
        }
        v();
        return true;
    }

    public final long i() {
        i1 i1Var = this.D.i;
        if (i1Var == null) {
            return 0L;
        }
        long j10 = i1Var.o;
        if (!i1Var.d) {
            return j10;
        }
        int i10 = 0;
        while (true) {
            e[] eVarArr = this.a;
            if (i10 >= eVarArr.length) {
                return j10;
            }
            if (s(eVarArr[i10]) && eVarArr[i10].getStream() == i1Var.c[i10]) {
                long readingPositionUs = eVarArr[i10].getReadingPositionUs();
                if (readingPositionUs == Long.MIN_VALUE) {
                    return Long.MIN_VALUE;
                }
                j10 = Math.max(readingPositionUs, j10);
            }
            i10++;
        }
    }

    public final synchronized void i0(o oVar, long j10) {
        this.B.getClass();
        long elapsedRealtime = SystemClock.elapsedRealtime() + j10;
        boolean z10 = false;
        while (!((Boolean) oVar.get()).booleanValue() && j10 > 0) {
            try {
                this.B.getClass();
                wait(j10);
            } catch (InterruptedException unused) {
                z10 = true;
            }
            this.B.getClass();
            j10 = elapsedRealtime - SystemClock.elapsedRealtime();
        }
        if (z10) {
            Thread.currentThread().interrupt();
        }
    }

    public final Pair j(r2 r2Var) {
        if (r2Var.p()) {
            return Pair.create(w1.s, 0L);
        }
        Pair i10 = r2Var.i(this.v, this.w, r2Var.a(this.Q), -9223372036854775807L);
        l4.c0 m10 = this.D.m(r2Var, i10.first, 0L);
        long longValue = ((Long) i10.second).longValue();
        if (m10.a()) {
            Object obj = m10.a;
            p2 p2Var = this.w;
            r2Var.g(obj, p2Var);
            longValue = m10.c == p2Var.f(m10.b) ? p2Var.h.b : 0L;
        }
        return Pair.create(m10, Long.valueOf(longValue));
    }

    /* JADX WARN: Type inference failed for: r6v5, types: [java.lang.Object, l4.e1] */
    public final void k(l4.z zVar) {
        i1 i1Var = this.D.j;
        if (i1Var == null || i1Var.a != zVar) {
            return;
        }
        long j10 = this.W;
        if (i1Var != null) {
            f5.a.i(i1Var.l == null);
            if (i1Var.d) {
                i1Var.a.U(j10 - i1Var.o);
            }
        }
        u();
    }

    public final void l(IOException iOException, int i10) {
        n nVar = new n(0, iOException, i10);
        i1 i1Var = this.D.h;
        if (i1Var != null) {
            nVar = nVar.a(i1Var.f.a);
        }
        f5.a.p("ExoPlayerImplInternal", "Playback error", nVar);
        c0(false, false);
        this.I = this.I.d(nVar);
    }

    public final void m(boolean z10) {
        i1 i1Var = this.D.j;
        l4.c0 c0Var = i1Var == null ? this.I.b : i1Var.f.a;
        boolean equals = this.I.k.equals(c0Var);
        if (!equals) {
            this.I = this.I.a(c0Var);
        }
        w1 w1Var = this.I;
        w1Var.p = i1Var == null ? w1Var.r : i1Var.d();
        w1 w1Var2 = this.I;
        long j10 = w1Var2.p;
        i1 i1Var2 = this.D.j;
        w1Var2.q = i1Var2 != null ? Math.max(0L, j10 - (this.W - i1Var2.o)) : 0L;
        if ((!equals || z10) && i1Var != null && i1Var.d) {
            f0(i1Var.n);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x038e  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x0201  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x030b  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0378  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x034c  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0356  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0310  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0389  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0398  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x03f2  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x03aa A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:96:0x03ca  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x03d2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void n(r2 r2Var, boolean z10) {
        q2 q2Var;
        long j10;
        Object obj;
        int i10;
        int i11;
        boolean z11;
        boolean z12;
        boolean z13;
        int i12;
        boolean z14;
        p2 p2Var;
        r2 r2Var2;
        long j11;
        boolean z15;
        long j12;
        o0 o0Var;
        int i13;
        long longValue;
        boolean z16;
        int i14;
        boolean z17;
        boolean z18;
        long j13;
        int i15;
        boolean z19;
        long j14;
        r2 r2Var3;
        boolean z20;
        long j15;
        r2 r2Var4;
        boolean z21;
        boolean z22;
        long L;
        l4.c0 c0Var;
        r2 r2Var5;
        Object obj2;
        long j16;
        int i16;
        w1 w1Var = this.I;
        p0 p0Var = this.V;
        k1 k1Var = this.D;
        int i17 = this.P;
        boolean z23 = this.Q;
        q2 q2Var2 = this.v;
        p2 p2Var2 = this.w;
        if (r2Var.p()) {
            r2Var2 = r2Var;
            o0Var = new o0(w1.s, 0L, -9223372036854775807L, false, true, false);
        } else {
            l4.c0 c0Var2 = w1Var.b;
            Object obj3 = c0Var2.a;
            r2 r2Var6 = w1Var.a;
            boolean z24 = r2Var6.p() || r2Var6.g(c0Var2.a, p2Var2).f;
            long j17 = (w1Var.b.a() || z24) ? w1Var.c : w1Var.r;
            if (p0Var != null) {
                Pair H = H(r2Var, p0Var, true, i17, z23, q2Var2, p2Var2);
                if (H == null) {
                    i15 = r2Var.a(z23);
                    j13 = j17;
                    obj = obj3;
                    z18 = false;
                    z19 = true;
                    z17 = false;
                } else {
                    if (p0Var.c == -9223372036854775807L) {
                        longValue = j17;
                        obj = obj3;
                        z16 = false;
                        i14 = r2Var.g(H.first, p2Var2).c;
                    } else {
                        obj = H.first;
                        longValue = ((Long) H.second).longValue();
                        z16 = true;
                        i14 = -1;
                    }
                    z17 = z16;
                    z18 = w1Var.e == 4;
                    j13 = longValue;
                    i15 = i14;
                    z19 = false;
                }
                z11 = z18;
                z12 = z19;
                z13 = z17;
                i10 = i15;
                i11 = -1;
                j10 = j13;
                q2Var = q2Var2;
            } else {
                if (w1Var.a.p()) {
                    i10 = r2Var.a(z23);
                    q2Var = q2Var2;
                } else if (r2Var.b(obj3) == -1) {
                    Object I = I(q2Var2, p2Var2, i17, z23, obj3, w1Var.a, r2Var);
                    q2Var = q2Var2;
                    p2Var2 = p2Var2;
                    if (I == null) {
                        i12 = r2Var.a(z23);
                        z14 = true;
                    } else {
                        i12 = r2Var.g(I, p2Var2).c;
                        z14 = false;
                    }
                    i10 = i12;
                    z12 = z14;
                    j10 = j17;
                    obj = obj3;
                    i11 = -1;
                    z11 = false;
                    z13 = false;
                } else {
                    q2Var = q2Var2;
                    if (j17 == -9223372036854775807L) {
                        i10 = r2Var.g(obj3, p2Var2).c;
                    } else if (z24) {
                        w1Var.a.g(c0Var2.a, p2Var2);
                        if (w1Var.a.m(p2Var2.c, q2Var, 0L).A == w1Var.a.b(c0Var2.a)) {
                            Pair i18 = r2Var.i(q2Var, p2Var2, r2Var.g(obj3, p2Var2).c, j17 + p2Var2.e);
                            obj = i18.first;
                            j10 = ((Long) i18.second).longValue();
                        } else {
                            j10 = j17;
                            obj = obj3;
                        }
                        i10 = -1;
                        i11 = -1;
                        z11 = false;
                        z12 = false;
                        z13 = true;
                    } else {
                        j10 = j17;
                        obj = obj3;
                        i10 = -1;
                        i11 = -1;
                        z11 = false;
                        z12 = false;
                        z13 = false;
                    }
                }
                j10 = j17;
                obj = obj3;
                i11 = -1;
                z11 = false;
                z12 = false;
                z13 = false;
            }
            if (i10 != i11) {
                p2 p2Var3 = p2Var2;
                Pair i19 = r2Var.i(q2Var, p2Var3, i10, -9223372036854775807L);
                r2Var2 = r2Var;
                p2Var = p2Var3;
                obj = i19.first;
                j10 = ((Long) i19.second).longValue();
                j11 = -9223372036854775807L;
            } else {
                p2Var = p2Var2;
                r2Var2 = r2Var;
                j11 = j10;
            }
            l4.c0 m10 = k1Var.m(r2Var2, obj, j10);
            int i20 = m10.e;
            boolean z25 = c0Var2.a.equals(obj) && !c0Var2.a() && !m10.a() && (i20 == i11 || ((i13 = c0Var2.e) != i11 && i20 >= i13));
            p2 g10 = r2Var2.g(obj, p2Var);
            if (!z24 && j17 == j11) {
                Object obj4 = c0Var2.a;
                int i21 = c0Var2.c;
                int i22 = c0Var2.b;
                if (obj4.equals(m10.a) && (!c0Var2.a() || !g10.g(i22) ? !(!m10.a() || !g10.g(m10.b)) : !(g10.e(i22, i21) == 4 || g10.e(i22, i21) == 2))) {
                    z15 = true;
                    if (!z25 || z15) {
                        m10 = c0Var2;
                    }
                    if (m10.a()) {
                        if (m10.equals(c0Var2)) {
                            j10 = w1Var.r;
                        } else {
                            r2Var2.g(m10.a, p2Var);
                            j12 = m10.c == p2Var.f(m10.b) ? p2Var.h.b : 0L;
                            o0Var = new o0(m10, j12, j11, z11, z12, z13);
                        }
                    }
                    j12 = j10;
                    o0Var = new o0(m10, j12, j11, z11, z12, z13);
                }
            }
            z15 = false;
            if (!z25) {
            }
            m10 = c0Var2;
            if (m10.a()) {
            }
            j12 = j10;
            o0Var = new o0(m10, j12, j11, z11, z12, z13);
        }
        l4.c0 c0Var3 = o0Var.a;
        long j18 = o0Var.c;
        boolean z26 = o0Var.d;
        long j19 = o0Var.b;
        boolean z27 = (this.I.b.equals(c0Var3) && j19 == this.I.r) ? false : true;
        try {
            if (o0Var.e) {
                try {
                    if (this.I.e != 1) {
                        Y(4);
                    }
                    z21 = false;
                    D(false, false, false, true);
                } catch (Throwable th2) {
                    th = th2;
                    j14 = j19;
                    r2Var3 = r2Var2;
                    j15 = j18;
                    z20 = false;
                    w1 w1Var2 = this.I;
                    r2 r2Var7 = w1Var2.a;
                    l4.c0 c0Var4 = w1Var2.b;
                    l4.c0 c0Var5 = c0Var3;
                    r2Var4 = r2Var3;
                    h0(r2Var4, c0Var5, r2Var7, c0Var4, !o0Var.f ? j14 : -9223372036854775807L);
                    if (!z27) {
                    }
                    w1 w1Var3 = this.I;
                    Object obj5 = w1Var3.b.a;
                    r2 r2Var8 = w1Var3.a;
                    if (z27) {
                    }
                    this.I = q(c0Var5, j14, j15, this.I.d, (z27 || !z10 || r2Var8.p() || r2Var8.g(obj5, this.w).f) ? false : true, r2Var4.b(obj5) != -1 ? 4 : 3);
                    E();
                    G(r2Var4, this.I.a);
                    this.I = this.I.g(r2Var4);
                    if (!r2Var4.p()) {
                    }
                    m(z20);
                    throw th;
                }
            } else {
                z21 = false;
            }
            if (!z27) {
                k1 k1Var2 = this.D;
                long j20 = this.W;
                i();
                if (!k1Var2.o(r2Var2, j20)) {
                    J(z21);
                }
            } else if (!r2Var2.p()) {
                try {
                    i1 i1Var = this.D.h;
                    while (i1Var != null) {
                        try {
                            if (i1Var.f.a.equals(c0Var3)) {
                                j1 g11 = this.D.g(r2Var2, i1Var.f);
                                i1Var.f = g11;
                                try {
                                    Object obj6 = i1Var.a;
                                    if (obj6 instanceof l4.d) {
                                        long j21 = g11.d;
                                        if (j21 == -9223372036854775807L) {
                                            j21 = Long.MIN_VALUE;
                                        }
                                        l4.d dVar = (l4.d) obj6;
                                        c0Var = c0Var3;
                                        j14 = j19;
                                        try {
                                            dVar.e = 0L;
                                            dVar.f = j21;
                                            i1Var = i1Var.l;
                                            c0Var3 = c0Var;
                                            j19 = j14;
                                        } catch (Throwable th3) {
                                            th = th3;
                                            c0Var3 = c0Var;
                                            r2Var3 = r2Var2;
                                            j15 = j18;
                                            z20 = false;
                                            w1 w1Var22 = this.I;
                                            r2 r2Var72 = w1Var22.a;
                                            l4.c0 c0Var42 = w1Var22.b;
                                            l4.c0 c0Var52 = c0Var3;
                                            r2Var4 = r2Var3;
                                            h0(r2Var4, c0Var52, r2Var72, c0Var42, !o0Var.f ? j14 : -9223372036854775807L);
                                            if (!z27) {
                                            }
                                            w1 w1Var32 = this.I;
                                            Object obj52 = w1Var32.b.a;
                                            r2 r2Var82 = w1Var32.a;
                                            if (z27) {
                                            }
                                            this.I = q(c0Var52, j14, j15, this.I.d, (z27 || !z10 || r2Var82.p() || r2Var82.g(obj52, this.w).f) ? false : true, r2Var4.b(obj52) != -1 ? 4 : 3);
                                            E();
                                            G(r2Var4, this.I.a);
                                            this.I = this.I.g(r2Var4);
                                            if (!r2Var4.p()) {
                                            }
                                            m(z20);
                                            throw th;
                                        }
                                    }
                                } catch (Throwable th4) {
                                    th = th4;
                                    c0Var = c0Var3;
                                    j14 = j19;
                                    c0Var3 = c0Var;
                                    r2Var3 = r2Var2;
                                    j15 = j18;
                                    z20 = false;
                                    w1 w1Var222 = this.I;
                                    r2 r2Var722 = w1Var222.a;
                                    l4.c0 c0Var422 = w1Var222.b;
                                    l4.c0 c0Var522 = c0Var3;
                                    r2Var4 = r2Var3;
                                    h0(r2Var4, c0Var522, r2Var722, c0Var422, !o0Var.f ? j14 : -9223372036854775807L);
                                    if (!z27) {
                                    }
                                    w1 w1Var322 = this.I;
                                    Object obj522 = w1Var322.b.a;
                                    r2 r2Var822 = w1Var322.a;
                                    if (z27) {
                                    }
                                    this.I = q(c0Var522, j14, j15, this.I.d, (z27 || !z10 || r2Var822.p() || r2Var822.g(obj522, this.w).f) ? false : true, r2Var4.b(obj522) != -1 ? 4 : 3);
                                    E();
                                    G(r2Var4, this.I.a);
                                    this.I = this.I.g(r2Var4);
                                    if (!r2Var4.p()) {
                                    }
                                    m(z20);
                                    throw th;
                                }
                            }
                            c0Var = c0Var3;
                            j14 = j19;
                            i1Var = i1Var.l;
                            c0Var3 = c0Var;
                            j19 = j14;
                        } catch (Throwable th5) {
                            th = th5;
                            j14 = j19;
                            r2Var3 = r2Var2;
                            j15 = j18;
                            z20 = false;
                            w1 w1Var2222 = this.I;
                            r2 r2Var7222 = w1Var2222.a;
                            l4.c0 c0Var4222 = w1Var2222.b;
                            l4.c0 c0Var5222 = c0Var3;
                            r2Var4 = r2Var3;
                            h0(r2Var4, c0Var5222, r2Var7222, c0Var4222, !o0Var.f ? j14 : -9223372036854775807L);
                            if (!z27) {
                            }
                            w1 w1Var3222 = this.I;
                            Object obj5222 = w1Var3222.b.a;
                            r2 r2Var8222 = w1Var3222.a;
                            if (z27) {
                            }
                            this.I = q(c0Var5222, j14, j15, this.I.d, (z27 || !z10 || r2Var8222.p() || r2Var8222.g(obj5222, this.w).f) ? false : true, r2Var4.b(obj5222) != -1 ? 4 : 3);
                            E();
                            G(r2Var4, this.I.a);
                            this.I = this.I.g(r2Var4);
                            if (!r2Var4.p()) {
                            }
                            m(z20);
                            throw th;
                        }
                    }
                    l4.c0 c0Var6 = c0Var3;
                    j14 = j19;
                    try {
                        k1 k1Var3 = this.D;
                        if (k1Var3.h != k1Var3.i) {
                            c0Var3 = c0Var6;
                            z22 = true;
                        } else {
                            c0Var3 = c0Var6;
                            z22 = false;
                        }
                        z20 = false;
                        try {
                            L = L(c0Var3, j14, z22, z26);
                            w1 w1Var4 = this.I;
                            l4.c0 c0Var7 = c0Var3;
                            r2Var5 = r2Var2;
                            h0(r2Var5, c0Var7, w1Var4.a, w1Var4.b, !o0Var.f ? L : -9223372036854775807L);
                            if (!z27 || j18 != this.I.c) {
                                w1 w1Var5 = this.I;
                                obj2 = w1Var5.b.a;
                                r2 r2Var9 = w1Var5.a;
                                boolean z28 = (z27 || !z10 || r2Var9.p() || r2Var9.g(obj2, this.w).f) ? false : true;
                                long j22 = this.I.d;
                                if (r2Var5.b(obj2) != -1) {
                                    j16 = j18;
                                    i16 = 4;
                                } else {
                                    j16 = j18;
                                    i16 = 3;
                                }
                                this.I = q(c0Var7, L, j16, j22, z28, i16);
                            }
                            E();
                            G(r2Var5, this.I.a);
                            this.I = this.I.g(r2Var5);
                            if (!r2Var5.p()) {
                                this.V = null;
                            }
                            m(z20);
                        } catch (Throwable th6) {
                            th = th6;
                            j14 = j14;
                            r2Var3 = r2Var2;
                            j15 = j18;
                            w1 w1Var22222 = this.I;
                            r2 r2Var72222 = w1Var22222.a;
                            l4.c0 c0Var42222 = w1Var22222.b;
                            l4.c0 c0Var52222 = c0Var3;
                            r2Var4 = r2Var3;
                            h0(r2Var4, c0Var52222, r2Var72222, c0Var42222, !o0Var.f ? j14 : -9223372036854775807L);
                            if (!z27 || j15 != this.I.c) {
                                w1 w1Var32222 = this.I;
                                Object obj52222 = w1Var32222.b.a;
                                r2 r2Var82222 = w1Var32222.a;
                                this.I = q(c0Var52222, j14, j15, this.I.d, (z27 || !z10 || r2Var82222.p() || r2Var82222.g(obj52222, this.w).f) ? false : true, r2Var4.b(obj52222) != -1 ? 4 : 3);
                            }
                            E();
                            G(r2Var4, this.I.a);
                            this.I = this.I.g(r2Var4);
                            if (!r2Var4.p()) {
                                this.V = null;
                            }
                            m(z20);
                            throw th;
                        }
                    } catch (Throwable th7) {
                        th = th7;
                        c0Var3 = c0Var6;
                        z20 = false;
                        r2Var3 = r2Var2;
                        j15 = j18;
                        w1 w1Var222222 = this.I;
                        r2 r2Var722222 = w1Var222222.a;
                        l4.c0 c0Var422222 = w1Var222222.b;
                        l4.c0 c0Var522222 = c0Var3;
                        r2Var4 = r2Var3;
                        h0(r2Var4, c0Var522222, r2Var722222, c0Var422222, !o0Var.f ? j14 : -9223372036854775807L);
                        if (!z27) {
                        }
                        w1 w1Var322222 = this.I;
                        Object obj522222 = w1Var322222.b.a;
                        r2 r2Var822222 = w1Var322222.a;
                        if (z27) {
                        }
                        this.I = q(c0Var522222, j14, j15, this.I.d, (z27 || !z10 || r2Var822222.p() || r2Var822222.g(obj522222, this.w).f) ? false : true, r2Var4.b(obj522222) != -1 ? 4 : 3);
                        E();
                        G(r2Var4, this.I.a);
                        this.I = this.I.g(r2Var4);
                        if (!r2Var4.p()) {
                        }
                        m(z20);
                        throw th;
                    }
                } catch (Throwable th8) {
                    th = th8;
                    j14 = j19;
                }
            }
            L = j19;
            z20 = false;
            w1 w1Var42 = this.I;
            l4.c0 c0Var72 = c0Var3;
            r2Var5 = r2Var2;
            h0(r2Var5, c0Var72, w1Var42.a, w1Var42.b, !o0Var.f ? L : -9223372036854775807L);
            if (!z27) {
            }
            w1 w1Var52 = this.I;
            obj2 = w1Var52.b.a;
            r2 r2Var92 = w1Var52.a;
            if (z27) {
            }
            long j222 = this.I.d;
            if (r2Var5.b(obj2) != -1) {
            }
            this.I = q(c0Var72, L, j16, j222, z28, i16);
            E();
            G(r2Var5, this.I.a);
            this.I = this.I.g(r2Var5);
            if (!r2Var5.p()) {
            }
            m(z20);
        } catch (Throwable th9) {
            th = th9;
        }
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, l4.z] */
    public final void o(l4.z zVar) {
        k1 k1Var = this.D;
        i1 i1Var = k1Var.j;
        if (i1Var == null || i1Var.a != zVar) {
            return;
        }
        float f9 = this.y.getPlaybackParameters().a;
        r2 r2Var = this.I.a;
        i1Var.d = true;
        i1Var.m = i1Var.a.J();
        d5.y g10 = i1Var.g(f9, r2Var);
        j1 j1Var = i1Var.f;
        long j10 = j1Var.b;
        long j11 = j1Var.e;
        if (j11 != -9223372036854775807L && j10 >= j11) {
            j10 = Math.max(0L, j11 - 1);
        }
        long a2 = i1Var.a(g10, j10, false, new boolean[i1Var.i.length]);
        long j12 = i1Var.o;
        j1 j1Var2 = i1Var.f;
        i1Var.o = (j1Var2.b - a2) + j12;
        i1Var.f = j1Var2.b(a2);
        f0(i1Var.n);
        if (i1Var == k1Var.h) {
            F(i1Var.f.b);
            g(new boolean[this.a.length]);
            w1 w1Var = this.I;
            l4.c0 c0Var = w1Var.b;
            long j13 = i1Var.f.b;
            this.I = q(c0Var, j13, w1Var.c, j13, false, 5);
        }
        u();
    }

    public final void p(x1 x1Var, float f9, boolean z10, boolean z11) {
        int i10;
        if (z10) {
            if (z11) {
                this.J.a(1);
            }
            this.I = this.I.e(x1Var);
        }
        float f10 = x1Var.a;
        i1 i1Var = this.D.h;
        while (true) {
            i10 = 0;
            if (i1Var == null) {
                break;
            }
            d5.r[] rVarArr = i1Var.n.c;
            int length = rVarArr.length;
            while (i10 < length) {
                d5.r rVar = rVarArr[i10];
                if (rVar != null) {
                    rVar.q(f10);
                }
                i10++;
            }
            i1Var = i1Var.l;
        }
        e[] eVarArr = this.a;
        int length2 = eVarArr.length;
        while (i10 < length2) {
            e eVar = eVarArr[i10];
            if (eVar != null) {
                eVar.setPlaybackSpeed(f9, x1Var.a);
            }
            i10++;
        }
    }

    public final w1 q(l4.c0 c0Var, long j10, long j11, long j12, boolean z10, int i10) {
        q8.l0 l0Var;
        this.Y = (!this.Y && j10 == this.I.r && c0Var.equals(this.I.b)) ? false : true;
        E();
        w1 w1Var = this.I;
        l4.k1 k1Var = w1Var.h;
        d5.y yVar = w1Var.i;
        List list = w1Var.j;
        if (this.E.k) {
            i1 i1Var = this.D.h;
            k1Var = i1Var == null ? l4.k1.d : i1Var.m;
            yVar = i1Var == null ? this.e : i1Var.n;
            d5.r[] rVarArr = yVar.c;
            q8.w wVar = new q8.w();
            boolean z11 = false;
            for (d5.r rVar : rVarArr) {
                if (rVar != null) {
                    b4.c cVar = rVar.g(0).s;
                    if (cVar == null) {
                        wVar.a(new b4.c(new b4.b[0]));
                    } else {
                        wVar.a(cVar);
                        z11 = true;
                    }
                }
            }
            if (z11) {
                l0Var = wVar.c();
            } else {
                q8.x xVar = q8.z.b;
                l0Var = q8.l0.e;
            }
            list = l0Var;
            if (i1Var != null) {
                j1 j1Var = i1Var.f;
                if (j1Var.c != j11) {
                    i1Var.f = j1Var.a(j11);
                }
            }
        } else if (!c0Var.equals(w1Var.b)) {
            k1Var = l4.k1.d;
            yVar = this.e;
            list = q8.l0.e;
        }
        l4.k1 k1Var2 = k1Var;
        d5.y yVar2 = yVar;
        List list2 = list;
        if (z10) {
            we.f fVar = this.J;
            if (!fVar.d || fVar.e == 5) {
                fVar.b = true;
                fVar.d = true;
                fVar.e = i10;
            } else {
                f5.a.f(i10 == 5);
            }
        }
        w1 w1Var2 = this.I;
        long j13 = w1Var2.p;
        i1 i1Var2 = this.D.j;
        return w1Var2.b(c0Var, j10, j11, j12, i1Var2 == null ? 0L : Math.max(0L, j13 - (this.W - i1Var2.o)), k1Var2, yVar2, list2);
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, l4.e1] */
    public final boolean r() {
        i1 i1Var = this.D.j;
        if (i1Var == null) {
            return false;
        }
        return (!i1Var.d ? 0L : i1Var.a.h()) != Long.MIN_VALUE;
    }

    public final boolean t() {
        i1 i1Var = this.D.h;
        long j10 = i1Var.f.e;
        if (i1Var.d) {
            return j10 == -9223372036854775807L || this.I.r < j10 || !Z();
        }
        return false;
    }

    /* JADX WARN: Type inference failed for: r0v12, types: [java.lang.Object, l4.z] */
    /* JADX WARN: Type inference failed for: r0v18, types: [java.lang.Object, l4.e1] */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, l4.e1] */
    public final void u() {
        boolean c3;
        if (r()) {
            i1 i1Var = this.D.j;
            long h = !i1Var.d ? 0L : i1Var.a.h();
            i1 i1Var2 = this.D.j;
            long max = i1Var2 == null ? 0L : Math.max(0L, h - (this.W - i1Var2.o));
            i1 i1Var3 = this.D.h;
            c3 = this.f.c(max, this.y.getPlaybackParameters().a);
            if (!c3 && max < 500000 && this.x > 0) {
                this.D.h.a.r(this.I.r);
                c3 = this.f.c(max, this.y.getPlaybackParameters().a);
            }
        } else {
            c3 = false;
        }
        this.O = c3;
        if (c3) {
            i1 i1Var4 = this.D.j;
            long j10 = this.W;
            f5.a.i(i1Var4.l == null);
            i1Var4.a.s(j10 - i1Var4.o);
        }
        e0();
    }

    public final void v() {
        we.f fVar = this.J;
        w1 w1Var = this.I;
        boolean z10 = fVar.b | (((w1) fVar.h) != w1Var);
        fVar.b = z10;
        fVar.h = w1Var;
        if (z10) {
            k0 k0Var = this.C.a;
            k0Var.i.c(new ef.c(23, k0Var, fVar));
            this.J = new we.f(this.I);
        }
    }

    public final void w() {
        n(this.E.b(), true);
    }

    public final void x(n0 n0Var) {
        r2 b10;
        this.J.a(1);
        int i10 = n0Var.a;
        int i11 = n0Var.b;
        int i12 = n0Var.c;
        l4.h1 h1Var = n0Var.d;
        s1 s1Var = this.E;
        ArrayList arrayList = s1Var.b;
        f5.a.f(i10 >= 0 && i10 <= i11 && i11 <= arrayList.size() && i12 >= 0);
        s1Var.j = h1Var;
        if (i10 == i11 || i10 == i12) {
            b10 = s1Var.b();
        } else {
            int min = Math.min(i10, i12);
            int max = Math.max(((i11 - i10) + i12) - 1, i11 - 1);
            int i13 = ((r1) arrayList.get(min)).d;
            f5.d0.G(i10, i11, i12, arrayList);
            while (min <= max) {
                r1 r1Var = (r1) arrayList.get(min);
                r1Var.d = i13;
                i13 += r1Var.a.o.b.o();
                min++;
            }
            b10 = s1Var.b();
        }
        n(b10, false);
    }

    public final void y() {
        this.J.a(1);
        D(false, false, false, true);
        this.f.b(false);
        Y(this.I.a.p() ? 4 : 2);
        com.google.android.exoplayer2.upstream.u uVar = (com.google.android.exoplayer2.upstream.u) this.h;
        uVar.getClass();
        s1 s1Var = this.E;
        ArrayList arrayList = s1Var.b;
        f5.a.i(!s1Var.k);
        s1Var.l = uVar;
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            r1 r1Var = (r1) arrayList.get(i10);
            s1Var.e(r1Var);
            s1Var.g.add(r1Var);
        }
        s1Var.k = true;
        this.n.d(2);
    }

    public final synchronized boolean z() {
        if (!this.K && this.s.getThread().isAlive()) {
            this.n.d(7);
            i0(new o(this, 3), this.G);
            return this.K;
        }
        return true;
    }
}
