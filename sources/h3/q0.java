package h3;

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

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public final class q0 implements Handler.Callback, j4.y {
    public final ArrayList A;
    public final d5.b0 B;
    public final w C;
    public final k1 D;
    public final s1 E;
    public final i F;
    public final long G;
    public j2 H;
    public w1 I;
    public ue.f J;
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
    public final b5.v d;
    public final b5.z e;
    public final j f;
    public final com.google.android.exoplayer2.upstream.f h;
    public final d5.d0 n;
    public final HandlerThread r;
    public final Looper s;
    public final r2 v;
    public final p2 w;
    public final long x;
    public final k y;
    public boolean L = false;
    public long a0 = -9223372036854775807L;

    public q0(e[] eVarArr, b5.v vVar, b5.z zVar, j jVar, com.google.android.exoplayer2.upstream.f fVar, int i10, boolean z10, i3.f fVar2, j2 j2Var, i iVar, long j10, Looper looper, d5.b0 b0Var, w wVar, i3.k kVar) {
        this.C = wVar;
        this.a = eVarArr;
        this.d = vVar;
        this.e = zVar;
        this.f = jVar;
        this.h = fVar;
        this.P = i10;
        this.Q = z10;
        this.H = j2Var;
        this.F = iVar;
        this.G = j10;
        this.B = b0Var;
        this.x = jVar.g;
        w1 h = w1.h(zVar);
        this.I = h;
        this.J = new ue.f(h);
        this.c = new h2[eVarArr.length];
        for (int i11 = 0; i11 < eVarArr.length; i11++) {
            eVarArr[i11].init(i11, kVar);
            this.c[i11] = eVarArr[i11].getCapabilities();
        }
        this.y = new k(this, b0Var);
        this.A = new ArrayList();
        this.b = Collections.newSetFromMap(new IdentityHashMap());
        this.v = new r2();
        this.w = new p2();
        vVar.a = this;
        vVar.b = fVar;
        this.Y = true;
        d5.d0 a2 = b0Var.a(looper, null);
        this.D = new k1(fVar2, a2);
        this.E = new s1(this, fVar2, a2, kVar);
        HandlerThread handlerThread = new HandlerThread("ExoPlayer:Playback", -16);
        this.r = handlerThread;
        handlerThread.start();
        Looper looper2 = handlerThread.getLooper();
        this.s = looper2;
        this.n = b0Var.a(looper2, this);
    }

    public static Pair G(s2 s2Var, p0 p0Var, boolean z10, int i10, boolean z11, r2 r2Var, p2 p2Var) {
        Object H;
        s2 s2Var2 = p0Var.a;
        if (s2Var.p()) {
            return null;
        }
        s2 s2Var3 = s2Var2.p() ? s2Var : s2Var2;
        try {
            Pair i11 = s2Var3.i(r2Var, p2Var, p0Var.b, p0Var.c);
            if (!s2Var.equals(s2Var3)) {
                if (s2Var.b(i11.first) == -1) {
                    if (!z10 || (H = H(r2Var, p2Var, i10, z11, i11.first, s2Var3, s2Var)) == null) {
                        return null;
                    }
                    return s2Var.i(r2Var, p2Var, s2Var.g(H, p2Var).c, -9223372036854775807L);
                }
                if (s2Var3.g(i11.first, p2Var).f && s2Var3.m(p2Var.c, r2Var, 0L).A == s2Var3.b(i11.first)) {
                    return s2Var.i(r2Var, p2Var, s2Var.g(i11.first, p2Var).c, p0Var.c);
                }
            }
            return i11;
        } catch (IndexOutOfBoundsException unused) {
            return null;
        }
    }

    public static Object H(r2 r2Var, p2 p2Var, int i10, boolean z10, Object obj, s2 s2Var, s2 s2Var2) {
        int b10 = s2Var.b(obj);
        int h = s2Var.h();
        int i11 = 0;
        int i12 = b10;
        int i13 = -1;
        while (i11 < h && i13 == -1) {
            r2 r2Var2 = r2Var;
            p2 p2Var2 = p2Var;
            int i14 = i10;
            boolean z11 = z10;
            s2 s2Var3 = s2Var;
            i12 = s2Var3.d(i12, p2Var2, r2Var2, i14, z11);
            if (i12 == -1) {
                break;
            }
            i13 = s2Var2.b(s2Var3.l(i12));
            i11++;
            s2Var = s2Var3;
            p2Var = p2Var2;
            r2Var = r2Var2;
            i10 = i14;
            z10 = z11;
        }
        if (i13 == -1) {
            return null;
        }
        return s2Var2.l(i13);
    }

    public static void N(e eVar, long j10) {
        eVar.setCurrentStreamFinal();
        if (eVar instanceof r4.m) {
            r4.m mVar = (r4.m) eVar;
            d5.a.i(mVar.isCurrentStreamFinal());
            mVar.A = j10;
        }
    }

    public static boolean r(e eVar) {
        return eVar.getState() != 0;
    }

    public final void A(int i10, int i11, j4.g1 g1Var) {
        this.J.a(1);
        s1 s1Var = this.E;
        s1Var.getClass();
        d5.a.f(i10 >= 0 && i10 <= i11 && i11 <= s1Var.b.size());
        s1Var.j = g1Var;
        s1Var.g(i10, i11);
        m(s1Var.b(), false);
    }

    public final void B() {
        int i10;
        float f10 = this.y.getPlaybackParameters().a;
        k1 k1Var = this.D;
        i1 i1Var = k1Var.h;
        i1 i1Var2 = k1Var.i;
        boolean z10 = true;
        for (i1 i1Var3 = i1Var; i1Var3 != null && i1Var3.d; i1Var3 = i1Var3.l) {
            b5.z g10 = i1Var3.g(f10, this.I.a);
            b5.z zVar = i1Var3.n;
            b5.s[] sVarArr = g10.c;
            if (zVar != null && zVar.c.length == sVarArr.length) {
                for (int i11 = 0; i11 < sVarArr.length; i11++) {
                    if (g10.a(zVar, i11)) {
                    }
                }
                if (i1Var3 == i1Var2) {
                    z10 = false;
                }
            }
            if (z10) {
                k1 k1Var2 = this.D;
                i1 i1Var4 = k1Var2.h;
                boolean k10 = k1Var2.k(i1Var4);
                boolean[] zArr = new boolean[this.a.length];
                long a2 = i1Var4.a(g10, this.I.r, k10, zArr);
                w1 w1Var = this.I;
                boolean z11 = (w1Var.e == 4 || a2 == w1Var.r) ? false : true;
                w1 w1Var2 = this.I;
                i10 = 4;
                this.I = p(w1Var2.b, a2, w1Var2.c, w1Var2.d, z11, 5);
                if (z11) {
                    E(a2);
                }
                boolean[] zArr2 = new boolean[this.a.length];
                int i12 = 0;
                while (true) {
                    e[] eVarArr = this.a;
                    if (i12 >= eVarArr.length) {
                        break;
                    }
                    e eVar = eVarArr[i12];
                    boolean r10 = r(eVar);
                    zArr2[i12] = r10;
                    j4.b1 b1Var = i1Var4.c[i12];
                    if (r10) {
                        if (b1Var != eVar.getStream()) {
                            c(eVar);
                        } else if (zArr[i12]) {
                            eVar.resetPosition(this.W);
                        }
                    }
                    i12++;
                }
                f(zArr2);
            } else {
                i10 = 4;
                this.D.k(i1Var3);
                if (i1Var3.d) {
                    i1Var3.a(g10, Math.max(i1Var3.f.b, this.W - i1Var3.o), false, new boolean[i1Var3.i.length]);
                }
            }
            l(true);
            if (this.I.e != i10) {
                t();
                f0();
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
    public final void C(boolean z10, boolean z11, boolean z12, boolean z13) {
        long j10;
        long j11;
        boolean z14;
        List list;
        this.n.a.removeMessages(2);
        this.Z = null;
        this.N = false;
        k kVar = this.y;
        kVar.f = false;
        c2.c0 c0Var = kVar.a;
        if (c0Var.a) {
            c0Var.a(c0Var.getPositionUs());
            c0Var.a = false;
        }
        this.W = 1000000000000L;
        for (e eVar : this.a) {
            try {
                c(eVar);
            } catch (n | RuntimeException e9) {
                d5.a.p("ExoPlayerImplInternal", "Disable failed.", e9);
            }
        }
        if (z10) {
            for (e eVar2 : this.a) {
                if (this.b.remove(eVar2)) {
                    try {
                        eVar2.reset();
                    } catch (RuntimeException e10) {
                        d5.a.p("ExoPlayerImplInternal", "Reset failed.", e10);
                    }
                }
            }
        }
        this.U = 0;
        w1 w1Var = this.I;
        j4.c0 c0Var2 = w1Var.b;
        long j12 = w1Var.r;
        if (!this.I.b.a()) {
            w1 w1Var2 = this.I;
            p2 p2Var = this.w;
            j4.c0 c0Var3 = w1Var2.b;
            s2 s2Var = w1Var2.a;
            if (!s2Var.p() && !s2Var.g(c0Var3.a, p2Var).f) {
                j10 = this.I.r;
                if (z11) {
                    this.V = null;
                    Pair i10 = i(this.I.a);
                    c0Var2 = (j4.c0) i10.first;
                    j12 = ((Long) i10.second).longValue();
                    j10 = -9223372036854775807L;
                    if (!c0Var2.equals(this.I.b)) {
                        z14 = true;
                        j11 = j12;
                        j4.c0 c0Var4 = c0Var2;
                        this.D.b();
                        this.O = false;
                        w1 w1Var3 = this.I;
                        s2 s2Var2 = w1Var3.a;
                        int i11 = w1Var3.e;
                        n nVar = z13 ? null : w1Var3.f;
                        j4.j1 j1Var = z14 ? j4.j1.d : w1Var3.h;
                        b5.z zVar = z14 ? this.e : w1Var3.i;
                        if (z14) {
                            p8.x xVar = p8.z.b;
                            list = p8.l0.e;
                        } else {
                            list = w1Var3.j;
                        }
                        this.I = new w1(s2Var2, c0Var4, j10, j11, i11, nVar, false, j1Var, zVar, list, c0Var4, w1Var3.l, w1Var3.m, w1Var3.n, j11, 0L, j11, false);
                        if (z12) {
                            s1 s1Var = this.E;
                            HashMap hashMap = s1Var.f;
                            for (q1 q1Var : hashMap.values()) {
                                try {
                                    q1Var.a.o(q1Var.b);
                                } catch (RuntimeException e11) {
                                    d5.a.p("MediaSourceList", "Failed to release child source.", e11);
                                }
                                j4.a aVar = q1Var.a;
                                g5.b bVar = q1Var.c;
                                aVar.r(bVar);
                                q1Var.a.q(bVar);
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
                j4.c0 c0Var42 = c0Var2;
                this.D.b();
                this.O = false;
                w1 w1Var32 = this.I;
                s2 s2Var22 = w1Var32.a;
                int i112 = w1Var32.e;
                if (z13) {
                }
                j4.j1 j1Var2 = z14 ? j4.j1.d : w1Var32.h;
                b5.z zVar2 = z14 ? this.e : w1Var32.i;
                if (z14) {
                }
                this.I = new w1(s2Var22, c0Var42, j10, j11, i112, nVar, false, j1Var2, zVar2, list, c0Var42, w1Var32.l, w1Var32.m, w1Var32.n, j11, 0L, j11, false);
                if (z12) {
                }
            }
        }
        j10 = this.I.c;
        if (z11) {
        }
        j11 = j12;
        z14 = false;
        j4.c0 c0Var422 = c0Var2;
        this.D.b();
        this.O = false;
        w1 w1Var322 = this.I;
        s2 s2Var222 = w1Var322.a;
        int i1122 = w1Var322.e;
        if (z13) {
        }
        j4.j1 j1Var22 = z14 ? j4.j1.d : w1Var322.h;
        b5.z zVar22 = z14 ? this.e : w1Var322.i;
        if (z14) {
        }
        this.I = new w1(s2Var222, c0Var422, j10, j11, i1122, nVar, false, j1Var22, zVar22, list, c0Var422, w1Var322.l, w1Var322.m, w1Var322.n, j11, 0L, j11, false);
        if (z12) {
        }
    }

    public final void D() {
        i1 i1Var = this.D.h;
        this.M = i1Var != null && i1Var.f.h && this.L;
    }

    public final void E(long j10) {
        i1 i1Var = this.D.h;
        long j11 = j10 + (i1Var == null ? 1000000000000L : i1Var.o);
        this.W = j11;
        this.y.a.a(j11);
        for (e eVar : this.a) {
            if (r(eVar)) {
                eVar.resetPosition(this.W);
            }
        }
        for (i1 i1Var2 = r0.h; i1Var2 != null; i1Var2 = i1Var2.l) {
            for (b5.s sVar : i1Var2.n.c) {
                if (sVar != null) {
                    sVar.s();
                }
            }
        }
    }

    public final void F(s2 s2Var, s2 s2Var2) {
        if (s2Var.p() && s2Var2.p()) {
            return;
        }
        ArrayList arrayList = this.A;
        int size = arrayList.size() - 1;
        if (size < 0) {
            Collections.sort(arrayList);
        } else {
            a9.p.t(arrayList.get(size));
            throw null;
        }
    }

    public final void I(boolean z10) {
        j4.c0 c0Var = this.D.h.f.a;
        long K = K(c0Var, this.I.r, true, false);
        if (K != this.I.r) {
            w1 w1Var = this.I;
            this.I = p(c0Var, K, w1Var.c, w1Var.d, z10, 5);
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
    /* JADX WARN: Type inference failed for: r0v16, types: [j4.z, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void J(p0 p0Var) {
        long longValue;
        j4.c0 m10;
        long j10;
        boolean z10;
        long j11;
        boolean z11;
        j4.c0 c0Var;
        long j12;
        long B;
        long j13;
        w1 w1Var;
        int i10;
        long j14;
        boolean z12;
        j4.c0 c0Var2;
        int i11;
        long j15;
        long K;
        boolean z13;
        w1 w1Var2;
        j4.c0 c0Var3;
        s2 s2Var;
        long j16;
        q0 q0Var = this;
        q0Var.J.a(1);
        Pair G = G(q0Var.I.a, p0Var, true, q0Var.P, q0Var.Q, q0Var.v, q0Var.w);
        try {
            if (G == null) {
                Pair i12 = q0Var.i(q0Var.I.a);
                m10 = (j4.c0) i12.first;
                longValue = ((Long) i12.second).longValue();
                z10 = !q0Var.I.a.p();
                j11 = -9223372036854775807L;
            } else {
                Object obj = G.first;
                longValue = ((Long) G.second).longValue();
                long j17 = p0Var.c == -9223372036854775807L ? -9223372036854775807L : longValue;
                m10 = q0Var.D.m(q0Var.I.a, obj, longValue);
                if (!m10.a()) {
                    j10 = 0;
                    z10 = p0Var.c == -9223372036854775807L;
                    j11 = j17;
                    if (!q0Var.I.a.p()) {
                        q0Var.V = p0Var;
                    } else if (G == null) {
                        if (q0Var.I.e != 1) {
                            q0Var.X(4);
                        }
                        q0Var.C(false, true, false, true);
                    } else {
                        try {
                            if (m10.equals(q0Var.I.b)) {
                                try {
                                    i1 i1Var = q0Var.D.h;
                                    B = (i1Var == null || !i1Var.d || longValue == j10) ? longValue : i1Var.a.B(longValue, q0Var.H);
                                    if (d5.g0.S(B) != d5.g0.S(q0Var.I.r) || ((i10 = (w1Var = q0Var.I).e) != 2 && i10 != 3)) {
                                        z11 = z10;
                                        j13 = j11;
                                        c0Var = m10;
                                    }
                                    j14 = w1Var.r;
                                    z12 = z10;
                                    c0Var2 = m10;
                                    i11 = 2;
                                    j15 = j14;
                                    q0Var.I = q0Var.p(c0Var2, j14, j11, j15, z12, i11);
                                    return;
                                } catch (Throwable th) {
                                    th = th;
                                    z11 = z10;
                                    c0Var = m10;
                                    j12 = longValue;
                                    q0Var.I = q0Var.p(c0Var, j12, j11, j12, z11, 2);
                                    throw th;
                                }
                            }
                            z11 = z10;
                            j13 = j11;
                            c0Var = m10;
                            B = longValue;
                            q0Var.g0(s2Var, c0Var3, s2Var, w1Var2.b, j16);
                            c0Var2 = c0Var3;
                            j11 = j16;
                            z12 = z13;
                            j14 = K;
                            i11 = 2;
                            j15 = j14;
                            q0Var = this;
                            q0Var.I = q0Var.p(c0Var2, j14, j11, j15, z12, i11);
                            return;
                        } catch (Throwable th2) {
                            th = th2;
                            c0Var = c0Var3;
                            j11 = j16;
                            z11 = z13;
                            j12 = K;
                            q0Var.I = q0Var.p(c0Var, j12, j11, j12, z11, 2);
                            throw th;
                        }
                        boolean z14 = q0Var.I.e == 4;
                        k1 k1Var = q0Var.D;
                        K = q0Var.K(c0Var, B, k1Var.h != k1Var.i, z14);
                        z13 = z11 | (longValue != K);
                        w1Var2 = q0Var.I;
                        c0Var3 = c0Var;
                        s2Var = w1Var2.a;
                        j16 = j13;
                    }
                    z12 = z10;
                    c0Var2 = m10;
                    j14 = longValue;
                    i11 = 2;
                    j15 = j14;
                    q0Var = this;
                    q0Var.I = q0Var.p(c0Var2, j14, j11, j15, z12, i11);
                    return;
                }
                q0Var.I.a.g(m10.a, q0Var.w);
                longValue = q0Var.w.f(m10.b) == m10.c ? q0Var.w.h.b : 0L;
                j11 = j17;
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
            q0Var.I = q0Var.p(c0Var2, j14, j11, j15, z12, i11);
            return;
        } catch (Throwable th3) {
            th = th3;
            z11 = z10;
        }
        j10 = 0;
    }

    /* JADX WARN: Type inference failed for: r9v5, types: [j4.z, java.lang.Object] */
    public final long K(j4.c0 c0Var, long j10, boolean z10, boolean z11) {
        c0();
        this.N = false;
        if (z11 || this.I.e == 3) {
            X(2);
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
                c(eVar);
            }
            if (i1Var2 != null) {
                while (k1Var.h != i1Var2) {
                    k1Var.a();
                }
                k1Var.k(i1Var2);
                i1Var2.o = 1000000000000L;
                f(new boolean[eVarArr.length]);
            }
        }
        if (i1Var2 != null) {
            ?? r92 = i1Var2.a;
            k1Var.k(i1Var2);
            if (!i1Var2.d) {
                i1Var2.f = i1Var2.f.b(j10);
            } else if (i1Var2.e) {
                j10 = r92.o(j10);
                r92.p(j10 - this.x);
            }
            E(j10);
            t();
        } else {
            k1Var.b();
            E(j10);
        }
        l(false);
        this.n.d(2);
        return j10;
    }

    public final void L(e2 e2Var) {
        d5.d0 d0Var = this.n;
        if (e2Var.f != this.s) {
            d0Var.a(15, e2Var).b();
            return;
        }
        synchronized (e2Var) {
        }
        try {
            e2Var.a.handleMessage(e2Var.d, e2Var.e);
            e2Var.b(true);
            int i10 = this.I.e;
            if (i10 == 3 || i10 == 2) {
                d0Var.d(2);
            }
        } catch (Throwable th) {
            e2Var.b(true);
            throw th;
        }
    }

    public final void M(e2 e2Var) {
        Looper looper = e2Var.f;
        if (looper.getThread().isAlive()) {
            this.B.a(looper, null).c(new f2.r(this, e2Var));
        } else {
            d5.a.K("TAG", "Trying to send message on a dead thread.");
            e2Var.b(false);
        }
    }

    public final void O(boolean z10, AtomicBoolean atomicBoolean) {
        if (this.R != z10) {
            this.R = z10;
            if (!z10) {
                for (e eVar : this.a) {
                    if (!r(eVar) && this.b.remove(eVar)) {
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

    public final void P(m0 m0Var) {
        this.J.a(1);
        int i10 = m0Var.c;
        j4.g1 g1Var = m0Var.b;
        ArrayList arrayList = m0Var.a;
        if (i10 != -1) {
            this.V = new p0(new f2(arrayList, g1Var), m0Var.c, m0Var.d);
        }
        s1 s1Var = this.E;
        ArrayList arrayList2 = s1Var.b;
        s1Var.g(0, arrayList2.size());
        m(s1Var.a(arrayList2.size(), arrayList, g1Var), false);
    }

    public final void Q(boolean z10) {
        if (z10 == this.T) {
            return;
        }
        this.T = z10;
        if (z10 || !this.I.o) {
            return;
        }
        this.n.d(2);
    }

    public final void R(boolean z10) {
        this.L = z10;
        D();
        if (this.M) {
            k1 k1Var = this.D;
            if (k1Var.i != k1Var.h) {
                I(true);
                l(false);
            }
        }
    }

    public final void S(int i10, int i11, boolean z10, boolean z11) {
        this.J.a(z11 ? 1 : 0);
        ue.f fVar = this.J;
        fVar.b = true;
        fVar.f = true;
        fVar.g = i11;
        this.I = this.I.c(i10, z10);
        this.N = false;
        for (i1 i1Var = this.D.h; i1Var != null; i1Var = i1Var.l) {
            for (b5.s sVar : i1Var.n.c) {
                if (sVar != null) {
                    sVar.g(z10);
                }
            }
        }
        if (!Y()) {
            c0();
            f0();
            return;
        }
        int i12 = this.I.e;
        d5.d0 d0Var = this.n;
        if (i12 == 3) {
            a0();
            d0Var.d(2);
        } else if (i12 == 2) {
            d0Var.d(2);
        }
    }

    public final void T(x1 x1Var) {
        k kVar = this.y;
        kVar.setPlaybackParameters(x1Var);
        x1 playbackParameters = kVar.getPlaybackParameters();
        o(playbackParameters, playbackParameters.a, true, true);
    }

    public final void U(int i10) {
        this.P = i10;
        s2 s2Var = this.I.a;
        k1 k1Var = this.D;
        k1Var.f = i10;
        if (!k1Var.n(s2Var)) {
            I(true);
        }
        l(false);
    }

    public final void V(boolean z10) {
        this.Q = z10;
        s2 s2Var = this.I.a;
        k1 k1Var = this.D;
        k1Var.g = z10;
        if (!k1Var.n(s2Var)) {
            I(true);
        }
        l(false);
    }

    public final void W(j4.g1 g1Var) {
        this.J.a(1);
        s1 s1Var = this.E;
        int size = s1Var.b.size();
        if (g1Var.getLength() != size) {
            g1Var = g1Var.g().e(0, size);
        }
        s1Var.j = g1Var;
        m(s1Var.b(), false);
    }

    public final void X(int i10) {
        w1 w1Var = this.I;
        if (w1Var.e != i10) {
            if (i10 != 2) {
                this.a0 = -9223372036854775807L;
            }
            this.I = w1Var.f(i10);
        }
    }

    public final boolean Y() {
        w1 w1Var = this.I;
        return w1Var.l && w1Var.m == 0;
    }

    public final boolean Z(s2 s2Var, j4.c0 c0Var) {
        if (c0Var.a() || s2Var.p()) {
            return false;
        }
        int i10 = s2Var.g(c0Var.a, this.w).c;
        r2 r2Var = this.v;
        s2Var.n(i10, r2Var);
        return r2Var.a() && r2Var.r && r2Var.f != -9223372036854775807L;
    }

    @Override // j4.c1
    public final void a(j4.d1 d1Var) {
        this.n.a(9, (j4.z) d1Var).b();
    }

    public final void a0() {
        this.N = false;
        k kVar = this.y;
        kVar.f = true;
        kVar.a.b();
        for (e eVar : this.a) {
            if (r(eVar)) {
                eVar.start();
            }
        }
    }

    public final void b(m0 m0Var, int i10) {
        this.J.a(1);
        s1 s1Var = this.E;
        if (i10 == -1) {
            i10 = s1Var.b.size();
        }
        m(s1Var.a(i10, m0Var.a, m0Var.b), false);
    }

    public final void b0(boolean z10, boolean z11) {
        C(z10 || !this.R, false, true, false);
        this.J.a(z11 ? 1 : 0);
        this.f.b(true);
        X(1);
    }

    public final void c(e eVar) {
        if (r(eVar)) {
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

    public final void c0() {
        k kVar = this.y;
        kVar.f = false;
        c2.c0 c0Var = kVar.a;
        if (c0Var.a) {
            c0Var.a(c0Var.getPositionUs());
            c0Var.a = false;
        }
        for (e eVar : this.a) {
            if (r(eVar) && eVar.getState() == 2) {
                eVar.stop();
            }
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
    /* JADX WARN: Type inference failed for: r2v21, types: [j4.z, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v1, types: [j4.z, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v26, types: [j4.z, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v69, types: [j4.d1, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v25, types: [j4.z, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v75, types: [j4.d1, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v24, types: [j4.d1, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void d() {
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
        j1 c10;
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
                d5.a.i(i1Var7.l == null);
                if (i1Var7.d) {
                    i1Var7.a.I(j17 - i1Var7.o);
                    k1 k1Var3 = this.D;
                    i1Var = k1Var3.j;
                    if (i1Var != null || (!i1Var.f.i && i1Var.d && ((!i1Var.e || i1Var.a.D() == Long.MIN_VALUE) && k1Var3.j.f.e != -9223372036854775807L && k1Var3.k < 100))) {
                        k1 k1Var4 = this.D;
                        long j18 = this.W;
                        w1 w1Var3 = this.I;
                        i1Var2 = k1Var4.j;
                        if (i1Var2 != null) {
                            j15 = -9223372036854775807L;
                            c10 = k1Var4.d(w1Var3.a, w1Var3.b, w1Var3.c, w1Var3.r);
                        } else {
                            j15 = -9223372036854775807L;
                            c10 = k1Var4.c(w1Var3.a, i1Var2, j18);
                        }
                        if (c10 != null) {
                            k1 k1Var5 = this.D;
                            h2[] h2VarArr = this.c;
                            b5.v vVar = this.d;
                            com.google.android.exoplayer2.upstream.r rVar = this.f.a;
                            s1 s1Var2 = this.E;
                            b5.z zVar = this.e;
                            i1 i1Var8 = k1Var5.j;
                            if (i1Var8 == null) {
                                s1Var = s1Var2;
                                j16 = 1000000000000L;
                                j10 = Long.MIN_VALUE;
                            } else {
                                j10 = Long.MIN_VALUE;
                                s1Var = s1Var2;
                                j16 = (i1Var8.o + i1Var8.f.e) - c10.b;
                            }
                            i1 i1Var9 = new i1(h2VarArr, j16, vVar, rVar, s1Var, c10, zVar);
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
                            i1Var9.a.E(this, c10.b);
                            if (this.D.h == i1Var9) {
                                E(c10.b);
                            }
                            l(false);
                            if (this.O) {
                                this.O = q();
                                d0();
                            } else {
                                t();
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
                                            j4.b1 b1Var = i1Var3.c[i13];
                                            if (b1Var != null && eVar.getStream() == b1Var && eVar.hasReadStreamToEnd()) {
                                                long j19 = i1Var3.f.e;
                                                N(eVar, (j19 == j15 || j19 == j10) ? j15 : i1Var3.o + j19);
                                            }
                                        }
                                    }
                                } else if (i1Var3.d) {
                                    int i14 = 0;
                                    while (true) {
                                        if (i14 < eVarArr2.length) {
                                            e eVar2 = eVarArr2[i14];
                                            j4.b1 b1Var2 = i1Var3.c[i14];
                                            if (eVar2.getStream() != b1Var2) {
                                                break;
                                            }
                                            if (b1Var2 != null && !eVar2.hasReadStreamToEnd()) {
                                                i1 i1Var11 = i1Var3.l;
                                                if (!i1Var3.f.f) {
                                                    break;
                                                }
                                                if (!i1Var11.d) {
                                                    break;
                                                }
                                                if (!(eVar2 instanceof r4.m) && !(eVar2 instanceof z3.f) && eVar2.getReadingPositionUs() < i1Var11.e()) {
                                                    break;
                                                }
                                            }
                                            i14++;
                                        } else {
                                            i1 i1Var12 = i1Var3.l;
                                            if (i1Var12.d || this.W >= i1Var12.e()) {
                                                b5.z zVar2 = i1Var3.n;
                                                i1 i1Var13 = k1Var6.i;
                                                d5.a.i((i1Var13 == null || i1Var13.l == null) ? false : true);
                                                k1Var6.i = k1Var6.i.l;
                                                k1Var6.j();
                                                i1 i1Var14 = k1Var6.i;
                                                b5.z zVar3 = i1Var14.n;
                                                s2 s2Var = this.I.a;
                                                z10 = false;
                                                i10 = 1;
                                                g0(s2Var, i1Var14.f.a, s2Var, i1Var3.f.a, -9223372036854775807L);
                                                if (!i1Var14.d || i1Var14.a.w() == j15) {
                                                    for (int i15 = 0; i15 < eVarArr2.length; i15++) {
                                                        boolean b10 = zVar2.b(i15);
                                                        boolean b11 = zVar3.b(i15);
                                                        if (b10 && !eVarArr2[i15].isCurrentStreamFinal()) {
                                                            boolean z22 = this.c[i15].getTrackType() == -2;
                                                            i2 i2Var = zVar2.b[i15];
                                                            i2 i2Var2 = zVar3.b[i15];
                                                            if (!b11 || !i2Var2.equals(i2Var) || z22) {
                                                                N(eVarArr2[i15], i1Var14.e());
                                                            }
                                                        }
                                                    }
                                                } else {
                                                    long e9 = i1Var14.e();
                                                    for (e eVar3 : eVarArr2) {
                                                        if (eVar3.getStream() != null) {
                                                            N(eVar3, e9);
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
                                    b5.z zVar4 = i1Var4.n;
                                    j4.b1[] b1VarArr = i1Var4.c;
                                    i12 = 0;
                                    z21 = false;
                                    while (true) {
                                        eVarArr = this.a;
                                        if (i12 < eVarArr.length) {
                                            break;
                                        }
                                        e eVar4 = eVarArr[i12];
                                        if (r(eVar4)) {
                                            boolean z23 = eVar4.getStream() != b1VarArr[i12];
                                            if (!zVar4.b(i12) || z23) {
                                                if (!eVar4.isCurrentStreamFinal()) {
                                                    b5.s sVar = zVar4.c[i12];
                                                    int length = sVar != null ? sVar.length() : 0;
                                                    t0[] t0VarArr = new t0[length];
                                                    for (int i16 = 0; i16 < length; i16++) {
                                                        t0VarArr[i16] = sVar.h(i16);
                                                    }
                                                    eVar4.replaceStream(t0VarArr, b1VarArr[i12], i1Var4.e(), i1Var4.o);
                                                } else if (eVar4.isEnded()) {
                                                    c(eVar4);
                                                } else {
                                                    z21 = true;
                                                }
                                            }
                                        }
                                        i12++;
                                    }
                                    if (!z21) {
                                        f(new boolean[eVarArr.length]);
                                    }
                                }
                                k1Var = this.D;
                                z19 = false;
                                while (Y() && !this.M && (i1Var5 = k1Var.h) != null && (i1Var6 = i1Var5.l) != null && this.W >= i1Var6.e() && i1Var6.g) {
                                    if (z19) {
                                        u();
                                    }
                                    a2 = k1Var.a();
                                    a2.getClass();
                                    if (this.I.b.a.equals(a2.f.a.a)) {
                                        j4.c0 c0Var = this.I.b;
                                        if (c0Var.b == -1) {
                                            j4.c0 c0Var2 = a2.f.a;
                                            if (c0Var2.b == -1 && c0Var.e != c0Var2.e) {
                                                z20 = true;
                                                j1 j1Var = a2.f;
                                                j4.c0 c0Var3 = j1Var.a;
                                                boolean z24 = z20;
                                                long j20 = j1Var.b;
                                                this.I = p(c0Var3, j20, j1Var.c, j20, !z24, 0);
                                                D();
                                                f0();
                                                z19 = true;
                                            }
                                        }
                                    }
                                    z20 = false;
                                    j1 j1Var2 = a2.f;
                                    j4.c0 c0Var32 = j1Var2.a;
                                    boolean z242 = z20;
                                    long j202 = j1Var2.b;
                                    this.I = p(c0Var32, j202, j1Var2.c, j202, !z242, 0);
                                    D();
                                    f0();
                                    z19 = true;
                                }
                            }
                            z10 = false;
                            i10 = 1;
                            k1 k1Var72 = this.D;
                            i1Var4 = k1Var72.i;
                            if (i1Var4 != null) {
                                b5.z zVar42 = i1Var4.n;
                                j4.b1[] b1VarArr2 = i1Var4.c;
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
                            while (Y()) {
                                if (z19) {
                                }
                                a2 = k1Var.a();
                                a2.getClass();
                                if (this.I.b.a.equals(a2.f.a.a)) {
                                }
                                z20 = false;
                                j1 j1Var22 = a2.f;
                                j4.c0 c0Var322 = j1Var22.a;
                                boolean z2422 = z20;
                                long j2022 = j1Var22.b;
                                this.I = p(c0Var322, j2022, j1Var22.c, j2022, !z2422, 0);
                                D();
                                f0();
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
                    while (Y()) {
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
            if (c10 != null) {
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
            while (Y()) {
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
        d5.a.c("doSomeWork");
        f0();
        if (i1Var15.d) {
            long elapsedRealtime = SystemClock.elapsedRealtime() * 1000;
            j11 = 10;
            j12 = 1000;
            i1Var15.a.p(this.I.r - this.x);
            int i18 = 0;
            boolean z25 = true;
            z12 = true;
            while (true) {
                e[] eVarArr3 = this.a;
                if (i18 >= eVarArr3.length) {
                    break;
                }
                e eVar5 = eVarArr3[i18];
                if (r(eVar5)) {
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
            i1Var15.a.m();
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
                    S(this.I.m, 5, z10, z10);
                }
                if (z13 || !i1Var15.f.i) {
                    w1Var = this.I;
                    if (w1Var.e != 2) {
                        k1 k1Var8 = this.D;
                        if (this.U == 0) {
                            z14 = s();
                            j14 = uptimeMillis;
                        } else {
                            if (z12) {
                                if (w1Var.g) {
                                    long j22 = Z(w1Var.a, k1Var8.h.f.a) ? this.F.h : j13;
                                    i1 i1Var16 = k1Var8.j;
                                    boolean z28 = i1Var16.d && (!i1Var16.e || i1Var16.a.D() == j10) && i1Var16.f.i;
                                    boolean z29 = i1Var16.f.a.a() && !i1Var16.d;
                                    if (!z28 && !z29) {
                                        j jVar = this.f;
                                        j14 = uptimeMillis;
                                        long j23 = this.I.p;
                                        i1 i1Var17 = this.D.j;
                                        long max = i1Var17 == null ? 0L : Math.max(0L, j23 - (this.W - i1Var17.o));
                                        float f10 = this.y.getPlaybackParameters().a;
                                        boolean z30 = this.N;
                                        jVar.getClass();
                                        long x8 = d5.g0.x(max, f10);
                                        long j24 = z30 ? jVar.e : jVar.d;
                                        if (j22 != j13) {
                                            j24 = Math.min(j22 / 2, j24);
                                        }
                                        if (j24 > 0 && x8 < j24) {
                                            com.google.android.exoplayer2.upstream.r rVar2 = jVar.a;
                                            synchronized (rVar2) {
                                                int i19 = rVar2.d * rVar2.b;
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
                            X(3);
                            this.Z = null;
                            if (Y()) {
                                a0();
                            }
                        }
                    } else {
                        j14 = uptimeMillis;
                    }
                    if (this.I.e == 3 && (this.U != 0 ? !z12 : !s())) {
                        this.N = Y();
                        X(2);
                        if (this.N) {
                            for (i1 i1Var18 = this.D.h; i1Var18 != null; i1Var18 = i1Var18.l) {
                                for (b5.s sVar2 : i1Var18.n.c) {
                                    if (sVar2 != null) {
                                        sVar2.t();
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
                        c0();
                    }
                } else {
                    X(4);
                    c0();
                    j14 = uptimeMillis;
                }
                if (this.I.e == 2) {
                    int i20 = 0;
                    while (true) {
                        e[] eVarArr4 = this.a;
                        if (i20 >= eVarArr4.length) {
                            break;
                        }
                        if (r(eVarArr4[i20]) && this.a[i20].getStream() == i1Var15.c[i20]) {
                            this.a[i20].maybeThrowStreamError();
                        }
                        i20++;
                    }
                    w1 w1Var4 = this.I;
                    if (!w1Var4.g && w1Var4.q < 500000 && q()) {
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
                        boolean z31 = !Y() && this.I.e == 3;
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
                        d5.a.q();
                    }
                }
                z15 = false;
                if (!z15) {
                }
                if (Y()) {
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
                d5.a.q();
            }
        } else {
            j13 = -9223372036854775807L;
        }
        z13 = false;
        if (z13) {
            this.M = z10;
            S(this.I.m, 5, z10, z10);
        }
        if (z13) {
        }
        w1Var = this.I;
        if (w1Var.e != 2) {
        }
        if (this.I.e == 3) {
            this.N = Y();
            X(2);
            if (this.N) {
            }
            c0();
        }
        if (this.I.e == 2) {
        }
        z15 = false;
        if (!z15) {
        }
        if (Y()) {
        }
        if (this.T) {
        }
        w1Var2 = this.I;
        if (w1Var2.o != z16) {
        }
        this.S = false;
        if (!z18) {
        }
        d5.a.q();
    }

    /* JADX WARN: Type inference failed for: r1v6, types: [j4.d1, java.lang.Object] */
    public final void d0() {
        i1 i1Var = this.D.j;
        boolean z10 = this.O || (i1Var != null && i1Var.a.b());
        w1 w1Var = this.I;
        if (z10 != w1Var.g) {
            this.I = new w1(w1Var.a, w1Var.b, w1Var.c, w1Var.d, w1Var.e, w1Var.f, z10, w1Var.h, w1Var.i, w1Var.j, w1Var.k, w1Var.l, w1Var.m, w1Var.n, w1Var.p, w1Var.q, w1Var.r, w1Var.o);
        }
    }

    @Override // j4.y
    public final void e(j4.z zVar) {
        this.n.a(8, zVar).b();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public final void e0(b5.z zVar) {
        b5.s[] sVarArr = zVar.c;
        j jVar = this.f;
        int i10 = jVar.f;
        if (i10 == -1) {
            int i11 = 0;
            int i12 = 0;
            while (true) {
                e[] eVarArr = this.a;
                int i13 = 13107200;
                if (i11 < eVarArr.length) {
                    if (sVarArr[i11] != null) {
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

    public final void f(boolean[] zArr) {
        e[] eVarArr;
        Set set;
        b5.z zVar;
        d5.o oVar;
        k1 k1Var = this.D;
        i1 i1Var = k1Var.i;
        b5.z zVar2 = i1Var.n;
        int i10 = 0;
        while (true) {
            eVarArr = this.a;
            int length = eVarArr.length;
            set = this.b;
            if (i10 >= length) {
                break;
            }
            if (!zVar2.b(i10) && set.remove(eVarArr[i10])) {
                eVarArr[i10].reset();
            }
            i10++;
        }
        int i11 = 0;
        while (i11 < eVarArr.length) {
            if (zVar2.b(i11)) {
                boolean z10 = zArr[i11];
                e eVar = eVarArr[i11];
                if (!r(eVar)) {
                    i1 i1Var2 = k1Var.i;
                    boolean z11 = i1Var2 == k1Var.h;
                    b5.z zVar3 = i1Var2.n;
                    i2 i2Var = zVar3.b[i11];
                    b5.s sVar = zVar3.c[i11];
                    int length2 = sVar != null ? sVar.length() : 0;
                    t0[] t0VarArr = new t0[length2];
                    for (int i12 = 0; i12 < length2; i12++) {
                        t0VarArr[i12] = sVar.h(i12);
                    }
                    boolean z12 = Y() && this.I.e == 3;
                    boolean z13 = !z10 && z12;
                    this.U++;
                    set.add(eVar);
                    zVar = zVar2;
                    boolean z14 = z12;
                    eVar.enable(i2Var, t0VarArr, i1Var2.c[i11], this.W, z13, z11, i1Var2.e(), i1Var2.o);
                    eVar.handleMessage(11, new l0(this));
                    k kVar = this.y;
                    kVar.getClass();
                    d5.o mediaClock = eVar.getMediaClock();
                    if (mediaClock != null && mediaClock != (oVar = kVar.d)) {
                        if (oVar != null) {
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
                    zVar2 = zVar;
                }
            }
            zVar = zVar2;
            i11++;
            zVar2 = zVar;
        }
        i1Var.g = true;
    }

    /* JADX WARN: Type inference failed for: r2v25, types: [j4.z, java.lang.Object] */
    public final void f0() {
        long j10;
        char c10;
        char c11;
        long max;
        i1 i1Var = this.D.h;
        if (i1Var == null) {
            return;
        }
        long w10 = i1Var.d ? i1Var.a.w() : -9223372036854775807L;
        if (w10 != -9223372036854775807L) {
            E(w10);
            if (w10 != this.I.r) {
                w1 w1Var = this.I;
                this.I = p(w1Var.b, w10, w1Var.c, w10, true, 5);
            }
        } else {
            k kVar = this.y;
            boolean z10 = i1Var != this.D.i;
            c2.c0 c0Var = kVar.a;
            e eVar = kVar.c;
            if (eVar == null || eVar.isEnded() || (!kVar.c.isReady() && (z10 || kVar.c.hasReadStreamToEnd()))) {
                kVar.e = true;
                if (kVar.f) {
                    c0Var.b();
                }
            } else {
                d5.o oVar = kVar.d;
                oVar.getClass();
                long positionUs = oVar.getPositionUs();
                if (kVar.e) {
                    if (positionUs >= c0Var.getPositionUs()) {
                        kVar.e = false;
                        if (kVar.f) {
                            c0Var.b();
                        }
                    } else if (c0Var.a) {
                        c0Var.a(c0Var.getPositionUs());
                        c0Var.a = false;
                    }
                }
                c0Var.a(positionUs);
                x1 playbackParameters = oVar.getPlaybackParameters();
                if (!playbackParameters.equals((x1) c0Var.e)) {
                    c0Var.setPlaybackParameters(playbackParameters);
                    kVar.b.n.a(16, playbackParameters).b();
                }
            }
            long positionUs2 = kVar.getPositionUs();
            this.W = positionUs2;
            long j11 = positionUs2 - i1Var.o;
            long j12 = this.I.r;
            if (!this.A.isEmpty() && !this.I.b.a()) {
                if (this.Y) {
                    this.Y = false;
                }
                w1 w1Var2 = this.I;
                w1Var2.a.b(w1Var2.b.a);
                int min = Math.min(this.X, this.A.size());
                if (min > 0 && this.A.get(min - 1) != null) {
                    throw new ClassCastException();
                }
                if (min < this.A.size() && this.A.get(min) != null) {
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
        if (w1Var4.l && w1Var4.e == 3 && Z(w1Var4.a, w1Var4.b)) {
            w1 w1Var5 = this.I;
            float f10 = 1.0f;
            if (w1Var5.n.a == 1.0f) {
                i iVar = this.F;
                long g10 = g(w1Var5.a, w1Var5.b.a, w1Var5.r);
                long j14 = this.I.p;
                i1 i1Var3 = this.D.j;
                if (i1Var3 == null) {
                    j10 = -9223372036854775807L;
                    c10 = 1;
                    c11 = 0;
                    max = 0;
                } else {
                    j10 = -9223372036854775807L;
                    c10 = 1;
                    c11 = 0;
                    max = Math.max(0L, j14 - (this.W - i1Var3.o));
                }
                if (iVar.c != j10) {
                    long j15 = g10 - max;
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
                            float H = d5.g0.H(1000L);
                            long j18 = ((long) ((iVar.k - 1.0f) * H)) + ((long) ((iVar.i - 1.0f) * H));
                            long j19 = iVar.e;
                            long j20 = iVar.h - j18;
                            long[] jArr = new long[3];
                            jArr[c11] = j17;
                            jArr[c10] = j19;
                            jArr[2] = j20;
                            long j21 = jArr[c11];
                            for (int i10 = 1; i10 < 3; i10++) {
                                long j22 = jArr[i10];
                                if (j22 > j21) {
                                    j21 = j22;
                                }
                            }
                            iVar.h = j21;
                        } else {
                            long i11 = d5.g0.i(g10 - ((long) (Math.max(0.0f, iVar.k - 1.0f) / 1.0E-7f)), iVar.h, j17);
                            iVar.h = i11;
                            long j23 = iVar.g;
                            if (j23 != j10 && i11 > j23) {
                                iVar.h = j23;
                            }
                        }
                        long j24 = g10 - iVar.h;
                        if (Math.abs(j24) < iVar.a) {
                            iVar.k = 1.0f;
                        } else {
                            iVar.k = d5.g0.g((1.0E-7f * j24) + 1.0f, iVar.j, iVar.i);
                        }
                        f10 = iVar.k;
                    } else {
                        f10 = iVar.k;
                    }
                }
                if (this.y.getPlaybackParameters().a != f10) {
                    this.y.setPlaybackParameters(new x1(f10, this.I.n.b));
                    o(this.I.n, this.y.getPlaybackParameters().a, false, false);
                }
            }
        }
    }

    public final long g(s2 s2Var, Object obj, long j10) {
        p2 p2Var = this.w;
        int i10 = s2Var.g(obj, p2Var).c;
        r2 r2Var = this.v;
        s2Var.n(i10, r2Var);
        if (r2Var.f != -9223372036854775807L && r2Var.a() && r2Var.r) {
            return d5.g0.H(d5.g0.t(r2Var.h) - r2Var.f) - (j10 + p2Var.e);
        }
        return -9223372036854775807L;
    }

    public final void g0(s2 s2Var, j4.c0 c0Var, s2 s2Var2, j4.c0 c0Var2, long j10) {
        boolean Z = Z(s2Var, c0Var);
        Object obj = c0Var.a;
        if (!Z) {
            x1 x1Var = c0Var.a() ? x1.d : this.I.n;
            k kVar = this.y;
            if (kVar.getPlaybackParameters().equals(x1Var)) {
                return;
            }
            kVar.setPlaybackParameters(x1Var);
            return;
        }
        p2 p2Var = this.w;
        int i10 = s2Var.g(obj, p2Var).c;
        r2 r2Var = this.v;
        s2Var.n(i10, r2Var);
        b1 b1Var = r2Var.v;
        int i11 = d5.g0.a;
        i iVar = this.F;
        iVar.getClass();
        iVar.c = d5.g0.H(b1Var.a);
        iVar.f = d5.g0.H(b1Var.b);
        iVar.g = d5.g0.H(b1Var.c);
        float f10 = b1Var.d;
        if (f10 == -3.4028235E38f) {
            f10 = 0.97f;
        }
        iVar.j = f10;
        float f11 = b1Var.e;
        if (f11 == -3.4028235E38f) {
            f11 = 1.03f;
        }
        iVar.i = f11;
        if (f10 == 1.0f && f11 == 1.0f) {
            iVar.c = -9223372036854775807L;
        }
        iVar.a();
        if (j10 != -9223372036854775807L) {
            iVar.d = g(s2Var, obj, j10);
            iVar.a();
            return;
        }
        if (d5.g0.a(!s2Var2.p() ? s2Var2.m(s2Var2.g(c0Var2.a, p2Var).c, r2Var, 0L).a : null, r2Var.a)) {
            return;
        }
        iVar.d = -9223372036854775807L;
        iVar.a();
    }

    public final long h() {
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
            if (r(eVarArr[i10]) && eVarArr[i10].getStream() == i1Var.c[i10]) {
                long readingPositionUs = eVarArr[i10].getReadingPositionUs();
                if (readingPositionUs == Long.MIN_VALUE) {
                    return Long.MIN_VALUE;
                }
                j10 = Math.max(readingPositionUs, j10);
            }
            i10++;
        }
    }

    public final synchronized void h0(o oVar, long j10) {
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

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        i1 i1Var;
        int i10 = MediaDataController.MAX_STYLE_RUNS_COUNT;
        try {
            switch (message.what) {
                case 0:
                    x();
                    break;
                case 1:
                    S(message.arg2, 1, message.arg1 != 0, true);
                    break;
                case 2:
                    d();
                    break;
                case 3:
                    J((p0) message.obj);
                    break;
                case 4:
                    T((x1) message.obj);
                    break;
                case 5:
                    this.H = (j2) message.obj;
                    break;
                case 6:
                    b0(false, true);
                    break;
                case 7:
                    z();
                    return true;
                case 8:
                    n((j4.z) message.obj);
                    break;
                case 9:
                    j((j4.z) message.obj);
                    break;
                case 10:
                    B();
                    break;
                case 11:
                    U(message.arg1);
                    break;
                case 12:
                    V(message.arg1 != 0);
                    break;
                case 13:
                    O(message.arg1 != 0, (AtomicBoolean) message.obj);
                    break;
                case 14:
                    e2 e2Var = (e2) message.obj;
                    e2Var.getClass();
                    L(e2Var);
                    break;
                case 15:
                    M((e2) message.obj);
                    break;
                case 16:
                    x1 x1Var = (x1) message.obj;
                    o(x1Var, x1Var.a, true, false);
                    break;
                case 17:
                    P((m0) message.obj);
                    break;
                case 18:
                    b((m0) message.obj, message.arg1);
                    break;
                case 19:
                    w((n0) message.obj);
                    break;
                case 20:
                    A(message.arg1, message.arg2, (j4.g1) message.obj);
                    break;
                case 21:
                    W((j4.g1) message.obj);
                    break;
                case 22:
                    v();
                    break;
                case 23:
                    R(message.arg1 != 0);
                    break;
                case 24:
                    Q(message.arg1 == 1);
                    break;
                case 25:
                    I(true);
                    break;
                default:
                    return false;
            }
        } catch (com.google.android.exoplayer2.upstream.n e9) {
            k(e9, e9.a);
        } catch (n e10) {
            e = e10;
            if (e.c == 1 && (i1Var = this.D.i) != null) {
                e = e.a(i1Var.f.a);
            }
            if (e.r && this.Z == null) {
                d5.a.L("ExoPlayerImplInternal", "Recoverable renderer error", e);
                this.Z = e;
                d5.d0 d0Var = this.n;
                d5.c0 a2 = d0Var.a(25, e);
                Handler handler = d0Var.a;
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
                d5.a.p("ExoPlayerImplInternal", "Playback error", e);
                b0(true, false);
                this.I = this.I.d(e);
            }
        } catch (t1 e11) {
            boolean z10 = e11.a;
            int i11 = e11.b;
            if (i11 == 1) {
                i10 = z10 ? 3001 : 3003;
            } else if (i11 == 4) {
                i10 = z10 ? 3002 : 3004;
            }
            k(e11, i10);
        } catch (j4.b e12) {
            k(e12, 1002);
        } catch (RuntimeException e13) {
            if ((e13 instanceof IllegalStateException) || (e13 instanceof IllegalArgumentException)) {
                i10 = 1004;
            }
            n nVar2 = new n(2, e13, i10);
            d5.a.p("ExoPlayerImplInternal", "Playback error", nVar2);
            b0(true, false);
            this.I = this.I.d(nVar2);
        } catch (l3.e e14) {
            k(e14, e14.a);
        } catch (IOException e15) {
            k(e15, 2000);
        }
        u();
        return true;
    }

    public final Pair i(s2 s2Var) {
        if (s2Var.p()) {
            return Pair.create(w1.s, 0L);
        }
        Pair i10 = s2Var.i(this.v, this.w, s2Var.a(this.Q), -9223372036854775807L);
        j4.c0 m10 = this.D.m(s2Var, i10.first, 0L);
        long longValue = ((Long) i10.second).longValue();
        if (m10.a()) {
            Object obj = m10.a;
            p2 p2Var = this.w;
            s2Var.g(obj, p2Var);
            longValue = m10.c == p2Var.f(m10.b) ? p2Var.h.b : 0L;
        }
        return Pair.create(m10, Long.valueOf(longValue));
    }

    /* JADX WARN: Type inference failed for: r6v5, types: [j4.d1, java.lang.Object] */
    public final void j(j4.z zVar) {
        i1 i1Var = this.D.j;
        if (i1Var == null || i1Var.a != zVar) {
            return;
        }
        long j10 = this.W;
        if (i1Var != null) {
            d5.a.i(i1Var.l == null);
            if (i1Var.d) {
                i1Var.a.I(j10 - i1Var.o);
            }
        }
        t();
    }

    public final void k(IOException iOException, int i10) {
        n nVar = new n(0, iOException, i10);
        i1 i1Var = this.D.h;
        if (i1Var != null) {
            nVar = nVar.a(i1Var.f.a);
        }
        d5.a.p("ExoPlayerImplInternal", "Playback error", nVar);
        b0(false, false);
        this.I = this.I.d(nVar);
    }

    public final void l(boolean z10) {
        i1 i1Var = this.D.j;
        j4.c0 c0Var = i1Var == null ? this.I.b : i1Var.f.a;
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
            e0(i1Var.n);
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
    public final void m(s2 s2Var, boolean z10) {
        r2 r2Var;
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
        s2 s2Var2;
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
        s2 s2Var3;
        boolean z20;
        long j15;
        s2 s2Var4;
        boolean z21;
        boolean z22;
        long K;
        j4.c0 c0Var;
        s2 s2Var5;
        Object obj2;
        long j16;
        int i16;
        w1 w1Var = this.I;
        p0 p0Var = this.V;
        k1 k1Var = this.D;
        int i17 = this.P;
        boolean z23 = this.Q;
        r2 r2Var2 = this.v;
        p2 p2Var2 = this.w;
        if (s2Var.p()) {
            s2Var2 = s2Var;
            o0Var = new o0(w1.s, 0L, -9223372036854775807L, false, true, false);
        } else {
            j4.c0 c0Var2 = w1Var.b;
            Object obj3 = c0Var2.a;
            s2 s2Var6 = w1Var.a;
            boolean z24 = s2Var6.p() || s2Var6.g(c0Var2.a, p2Var2).f;
            long j17 = (w1Var.b.a() || z24) ? w1Var.c : w1Var.r;
            if (p0Var != null) {
                Pair G = G(s2Var, p0Var, true, i17, z23, r2Var2, p2Var2);
                if (G == null) {
                    i15 = s2Var.a(z23);
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
                        i14 = s2Var.g(G.first, p2Var2).c;
                    } else {
                        obj = G.first;
                        longValue = ((Long) G.second).longValue();
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
                r2Var = r2Var2;
            } else {
                if (w1Var.a.p()) {
                    i10 = s2Var.a(z23);
                    r2Var = r2Var2;
                } else if (s2Var.b(obj3) == -1) {
                    Object H = H(r2Var2, p2Var2, i17, z23, obj3, w1Var.a, s2Var);
                    r2Var = r2Var2;
                    p2Var2 = p2Var2;
                    if (H == null) {
                        i12 = s2Var.a(z23);
                        z14 = true;
                    } else {
                        i12 = s2Var.g(H, p2Var2).c;
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
                    r2Var = r2Var2;
                    if (j17 == -9223372036854775807L) {
                        i10 = s2Var.g(obj3, p2Var2).c;
                    } else if (z24) {
                        w1Var.a.g(c0Var2.a, p2Var2);
                        if (w1Var.a.m(p2Var2.c, r2Var, 0L).A == w1Var.a.b(c0Var2.a)) {
                            Pair i18 = s2Var.i(r2Var, p2Var2, s2Var.g(obj3, p2Var2).c, j17 + p2Var2.e);
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
                Pair i19 = s2Var.i(r2Var, p2Var3, i10, -9223372036854775807L);
                s2Var2 = s2Var;
                p2Var = p2Var3;
                obj = i19.first;
                j10 = ((Long) i19.second).longValue();
                j11 = -9223372036854775807L;
            } else {
                p2Var = p2Var2;
                s2Var2 = s2Var;
                j11 = j10;
            }
            j4.c0 m10 = k1Var.m(s2Var2, obj, j10);
            int i20 = m10.e;
            boolean z25 = c0Var2.a.equals(obj) && !c0Var2.a() && !m10.a() && (i20 == i11 || ((i13 = c0Var2.e) != i11 && i20 >= i13));
            p2 g10 = s2Var2.g(obj, p2Var);
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
                            s2Var2.g(m10.a, p2Var);
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
        j4.c0 c0Var3 = o0Var.a;
        long j18 = o0Var.c;
        boolean z26 = o0Var.d;
        long j19 = o0Var.b;
        boolean z27 = (this.I.b.equals(c0Var3) && j19 == this.I.r) ? false : true;
        try {
            if (o0Var.e) {
                try {
                    if (this.I.e != 1) {
                        X(4);
                    }
                    z21 = false;
                    C(false, false, false, true);
                } catch (Throwable th) {
                    th = th;
                    j14 = j19;
                    s2Var3 = s2Var2;
                    j15 = j18;
                    z20 = false;
                    w1 w1Var2 = this.I;
                    s2 s2Var7 = w1Var2.a;
                    j4.c0 c0Var4 = w1Var2.b;
                    j4.c0 c0Var5 = c0Var3;
                    s2Var4 = s2Var3;
                    g0(s2Var4, c0Var5, s2Var7, c0Var4, !o0Var.f ? j14 : -9223372036854775807L);
                    if (!z27) {
                    }
                    w1 w1Var3 = this.I;
                    Object obj5 = w1Var3.b.a;
                    s2 s2Var8 = w1Var3.a;
                    if (z27) {
                    }
                    this.I = p(c0Var5, j14, j15, this.I.d, (z27 || !z10 || s2Var8.p() || s2Var8.g(obj5, this.w).f) ? false : true, s2Var4.b(obj5) != -1 ? 4 : 3);
                    D();
                    F(s2Var4, this.I.a);
                    this.I = this.I.g(s2Var4);
                    if (!s2Var4.p()) {
                    }
                    l(z20);
                    throw th;
                }
            } else {
                z21 = false;
            }
            if (!z27) {
                k1 k1Var2 = this.D;
                long j20 = this.W;
                h();
                if (!k1Var2.o(s2Var2, j20)) {
                    I(z21);
                }
            } else if (!s2Var2.p()) {
                try {
                    i1 i1Var = this.D.h;
                    while (i1Var != null) {
                        try {
                            if (i1Var.f.a.equals(c0Var3)) {
                                j1 g11 = this.D.g(s2Var2, i1Var.f);
                                i1Var.f = g11;
                                try {
                                    Object obj6 = i1Var.a;
                                    if (obj6 instanceof j4.d) {
                                        long j21 = g11.d;
                                        if (j21 == -9223372036854775807L) {
                                            j21 = Long.MIN_VALUE;
                                        }
                                        j4.d dVar = (j4.d) obj6;
                                        c0Var = c0Var3;
                                        j14 = j19;
                                        try {
                                            dVar.e = 0L;
                                            dVar.f = j21;
                                            i1Var = i1Var.l;
                                            c0Var3 = c0Var;
                                            j19 = j14;
                                        } catch (Throwable th2) {
                                            th = th2;
                                            c0Var3 = c0Var;
                                            s2Var3 = s2Var2;
                                            j15 = j18;
                                            z20 = false;
                                            w1 w1Var22 = this.I;
                                            s2 s2Var72 = w1Var22.a;
                                            j4.c0 c0Var42 = w1Var22.b;
                                            j4.c0 c0Var52 = c0Var3;
                                            s2Var4 = s2Var3;
                                            g0(s2Var4, c0Var52, s2Var72, c0Var42, !o0Var.f ? j14 : -9223372036854775807L);
                                            if (!z27) {
                                            }
                                            w1 w1Var32 = this.I;
                                            Object obj52 = w1Var32.b.a;
                                            s2 s2Var82 = w1Var32.a;
                                            if (z27) {
                                            }
                                            this.I = p(c0Var52, j14, j15, this.I.d, (z27 || !z10 || s2Var82.p() || s2Var82.g(obj52, this.w).f) ? false : true, s2Var4.b(obj52) != -1 ? 4 : 3);
                                            D();
                                            F(s2Var4, this.I.a);
                                            this.I = this.I.g(s2Var4);
                                            if (!s2Var4.p()) {
                                            }
                                            l(z20);
                                            throw th;
                                        }
                                    }
                                } catch (Throwable th3) {
                                    th = th3;
                                    c0Var = c0Var3;
                                    j14 = j19;
                                    c0Var3 = c0Var;
                                    s2Var3 = s2Var2;
                                    j15 = j18;
                                    z20 = false;
                                    w1 w1Var222 = this.I;
                                    s2 s2Var722 = w1Var222.a;
                                    j4.c0 c0Var422 = w1Var222.b;
                                    j4.c0 c0Var522 = c0Var3;
                                    s2Var4 = s2Var3;
                                    g0(s2Var4, c0Var522, s2Var722, c0Var422, !o0Var.f ? j14 : -9223372036854775807L);
                                    if (!z27) {
                                    }
                                    w1 w1Var322 = this.I;
                                    Object obj522 = w1Var322.b.a;
                                    s2 s2Var822 = w1Var322.a;
                                    if (z27) {
                                    }
                                    this.I = p(c0Var522, j14, j15, this.I.d, (z27 || !z10 || s2Var822.p() || s2Var822.g(obj522, this.w).f) ? false : true, s2Var4.b(obj522) != -1 ? 4 : 3);
                                    D();
                                    F(s2Var4, this.I.a);
                                    this.I = this.I.g(s2Var4);
                                    if (!s2Var4.p()) {
                                    }
                                    l(z20);
                                    throw th;
                                }
                            }
                            c0Var = c0Var3;
                            j14 = j19;
                            i1Var = i1Var.l;
                            c0Var3 = c0Var;
                            j19 = j14;
                        } catch (Throwable th4) {
                            th = th4;
                            j14 = j19;
                            s2Var3 = s2Var2;
                            j15 = j18;
                            z20 = false;
                            w1 w1Var2222 = this.I;
                            s2 s2Var7222 = w1Var2222.a;
                            j4.c0 c0Var4222 = w1Var2222.b;
                            j4.c0 c0Var5222 = c0Var3;
                            s2Var4 = s2Var3;
                            g0(s2Var4, c0Var5222, s2Var7222, c0Var4222, !o0Var.f ? j14 : -9223372036854775807L);
                            if (!z27) {
                            }
                            w1 w1Var3222 = this.I;
                            Object obj5222 = w1Var3222.b.a;
                            s2 s2Var8222 = w1Var3222.a;
                            if (z27) {
                            }
                            this.I = p(c0Var5222, j14, j15, this.I.d, (z27 || !z10 || s2Var8222.p() || s2Var8222.g(obj5222, this.w).f) ? false : true, s2Var4.b(obj5222) != -1 ? 4 : 3);
                            D();
                            F(s2Var4, this.I.a);
                            this.I = this.I.g(s2Var4);
                            if (!s2Var4.p()) {
                            }
                            l(z20);
                            throw th;
                        }
                    }
                    j4.c0 c0Var6 = c0Var3;
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
                            K = K(c0Var3, j14, z22, z26);
                            w1 w1Var4 = this.I;
                            j4.c0 c0Var7 = c0Var3;
                            s2Var5 = s2Var2;
                            g0(s2Var5, c0Var7, w1Var4.a, w1Var4.b, !o0Var.f ? K : -9223372036854775807L);
                            if (!z27 || j18 != this.I.c) {
                                w1 w1Var5 = this.I;
                                obj2 = w1Var5.b.a;
                                s2 s2Var9 = w1Var5.a;
                                boolean z28 = (z27 || !z10 || s2Var9.p() || s2Var9.g(obj2, this.w).f) ? false : true;
                                long j22 = this.I.d;
                                if (s2Var5.b(obj2) != -1) {
                                    j16 = j18;
                                    i16 = 4;
                                } else {
                                    j16 = j18;
                                    i16 = 3;
                                }
                                this.I = p(c0Var7, K, j16, j22, z28, i16);
                            }
                            D();
                            F(s2Var5, this.I.a);
                            this.I = this.I.g(s2Var5);
                            if (!s2Var5.p()) {
                                this.V = null;
                            }
                            l(z20);
                        } catch (Throwable th5) {
                            th = th5;
                            j14 = j14;
                            s2Var3 = s2Var2;
                            j15 = j18;
                            w1 w1Var22222 = this.I;
                            s2 s2Var72222 = w1Var22222.a;
                            j4.c0 c0Var42222 = w1Var22222.b;
                            j4.c0 c0Var52222 = c0Var3;
                            s2Var4 = s2Var3;
                            g0(s2Var4, c0Var52222, s2Var72222, c0Var42222, !o0Var.f ? j14 : -9223372036854775807L);
                            if (!z27 || j15 != this.I.c) {
                                w1 w1Var32222 = this.I;
                                Object obj52222 = w1Var32222.b.a;
                                s2 s2Var82222 = w1Var32222.a;
                                this.I = p(c0Var52222, j14, j15, this.I.d, (z27 || !z10 || s2Var82222.p() || s2Var82222.g(obj52222, this.w).f) ? false : true, s2Var4.b(obj52222) != -1 ? 4 : 3);
                            }
                            D();
                            F(s2Var4, this.I.a);
                            this.I = this.I.g(s2Var4);
                            if (!s2Var4.p()) {
                                this.V = null;
                            }
                            l(z20);
                            throw th;
                        }
                    } catch (Throwable th6) {
                        th = th6;
                        c0Var3 = c0Var6;
                        z20 = false;
                        s2Var3 = s2Var2;
                        j15 = j18;
                        w1 w1Var222222 = this.I;
                        s2 s2Var722222 = w1Var222222.a;
                        j4.c0 c0Var422222 = w1Var222222.b;
                        j4.c0 c0Var522222 = c0Var3;
                        s2Var4 = s2Var3;
                        g0(s2Var4, c0Var522222, s2Var722222, c0Var422222, !o0Var.f ? j14 : -9223372036854775807L);
                        if (!z27) {
                        }
                        w1 w1Var322222 = this.I;
                        Object obj522222 = w1Var322222.b.a;
                        s2 s2Var822222 = w1Var322222.a;
                        if (z27) {
                        }
                        this.I = p(c0Var522222, j14, j15, this.I.d, (z27 || !z10 || s2Var822222.p() || s2Var822222.g(obj522222, this.w).f) ? false : true, s2Var4.b(obj522222) != -1 ? 4 : 3);
                        D();
                        F(s2Var4, this.I.a);
                        this.I = this.I.g(s2Var4);
                        if (!s2Var4.p()) {
                        }
                        l(z20);
                        throw th;
                    }
                } catch (Throwable th7) {
                    th = th7;
                    j14 = j19;
                }
            }
            K = j19;
            z20 = false;
            w1 w1Var42 = this.I;
            j4.c0 c0Var72 = c0Var3;
            s2Var5 = s2Var2;
            g0(s2Var5, c0Var72, w1Var42.a, w1Var42.b, !o0Var.f ? K : -9223372036854775807L);
            if (!z27) {
            }
            w1 w1Var52 = this.I;
            obj2 = w1Var52.b.a;
            s2 s2Var92 = w1Var52.a;
            if (z27) {
            }
            long j222 = this.I.d;
            if (s2Var5.b(obj2) != -1) {
            }
            this.I = p(c0Var72, K, j16, j222, z28, i16);
            D();
            F(s2Var5, this.I.a);
            this.I = this.I.g(s2Var5);
            if (!s2Var5.p()) {
            }
            l(z20);
        } catch (Throwable th8) {
            th = th8;
        }
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [j4.z, java.lang.Object] */
    public final void n(j4.z zVar) {
        k1 k1Var = this.D;
        i1 i1Var = k1Var.j;
        if (i1Var == null || i1Var.a != zVar) {
            return;
        }
        float f10 = this.y.getPlaybackParameters().a;
        s2 s2Var = this.I.a;
        i1Var.d = true;
        i1Var.m = i1Var.a.z();
        b5.z g10 = i1Var.g(f10, s2Var);
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
        e0(i1Var.n);
        if (i1Var == k1Var.h) {
            E(i1Var.f.b);
            f(new boolean[this.a.length]);
            w1 w1Var = this.I;
            j4.c0 c0Var = w1Var.b;
            long j13 = i1Var.f.b;
            this.I = p(c0Var, j13, w1Var.c, j13, false, 5);
        }
        t();
    }

    public final void o(x1 x1Var, float f10, boolean z10, boolean z11) {
        int i10;
        if (z10) {
            if (z11) {
                this.J.a(1);
            }
            this.I = this.I.e(x1Var);
        }
        float f11 = x1Var.a;
        i1 i1Var = this.D.h;
        while (true) {
            i10 = 0;
            if (i1Var == null) {
                break;
            }
            b5.s[] sVarArr = i1Var.n.c;
            int length = sVarArr.length;
            while (i10 < length) {
                b5.s sVar = sVarArr[i10];
                if (sVar != null) {
                    sVar.q(f11);
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
                eVar.setPlaybackSpeed(f10, x1Var.a);
            }
            i10++;
        }
    }

    public final w1 p(j4.c0 c0Var, long j10, long j11, long j12, boolean z10, int i10) {
        p8.l0 l0Var;
        this.Y = (!this.Y && j10 == this.I.r && c0Var.equals(this.I.b)) ? false : true;
        D();
        w1 w1Var = this.I;
        j4.j1 j1Var = w1Var.h;
        b5.z zVar = w1Var.i;
        List list = w1Var.j;
        if (this.E.k) {
            i1 i1Var = this.D.h;
            j1Var = i1Var == null ? j4.j1.d : i1Var.m;
            zVar = i1Var == null ? this.e : i1Var.n;
            b5.s[] sVarArr = zVar.c;
            p8.w wVar = new p8.w();
            boolean z11 = false;
            for (b5.s sVar : sVarArr) {
                if (sVar != null) {
                    z3.c cVar = sVar.h(0).s;
                    if (cVar == null) {
                        wVar.a(new z3.c(new z3.b[0]));
                    } else {
                        wVar.a(cVar);
                        z11 = true;
                    }
                }
            }
            if (z11) {
                l0Var = wVar.c();
            } else {
                p8.x xVar = p8.z.b;
                l0Var = p8.l0.e;
            }
            list = l0Var;
            if (i1Var != null) {
                j1 j1Var2 = i1Var.f;
                if (j1Var2.c != j11) {
                    i1Var.f = j1Var2.a(j11);
                }
            }
        } else if (!c0Var.equals(w1Var.b)) {
            j1Var = j4.j1.d;
            zVar = this.e;
            list = p8.l0.e;
        }
        j4.j1 j1Var3 = j1Var;
        b5.z zVar2 = zVar;
        List list2 = list;
        if (z10) {
            ue.f fVar = this.J;
            if (!fVar.d || fVar.e == 5) {
                fVar.b = true;
                fVar.d = true;
                fVar.e = i10;
            } else {
                d5.a.f(i10 == 5);
            }
        }
        w1 w1Var2 = this.I;
        long j13 = w1Var2.p;
        i1 i1Var2 = this.D.j;
        return w1Var2.b(c0Var, j10, j11, j12, i1Var2 == null ? 0L : Math.max(0L, j13 - (this.W - i1Var2.o)), j1Var3, zVar2, list2);
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [j4.d1, java.lang.Object] */
    public final boolean q() {
        i1 i1Var = this.D.j;
        if (i1Var == null) {
            return false;
        }
        return (!i1Var.d ? 0L : i1Var.a.g()) != Long.MIN_VALUE;
    }

    public final boolean s() {
        i1 i1Var = this.D.h;
        long j10 = i1Var.f.e;
        if (i1Var.d) {
            return j10 == -9223372036854775807L || this.I.r < j10 || !Y();
        }
        return false;
    }

    /* JADX WARN: Type inference failed for: r0v12, types: [j4.z, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v18, types: [j4.d1, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v3, types: [j4.d1, java.lang.Object] */
    public final void t() {
        boolean c10;
        if (q()) {
            i1 i1Var = this.D.j;
            long g10 = !i1Var.d ? 0L : i1Var.a.g();
            i1 i1Var2 = this.D.j;
            long max = i1Var2 == null ? 0L : Math.max(0L, g10 - (this.W - i1Var2.o));
            i1 i1Var3 = this.D.h;
            c10 = this.f.c(max, this.y.getPlaybackParameters().a);
            if (!c10 && max < 500000 && this.x > 0) {
                this.D.h.a.p(this.I.r);
                c10 = this.f.c(max, this.y.getPlaybackParameters().a);
            }
        } else {
            c10 = false;
        }
        this.O = c10;
        if (c10) {
            i1 i1Var4 = this.D.j;
            long j10 = this.W;
            d5.a.i(i1Var4.l == null);
            i1Var4.a.q(j10 - i1Var4.o);
        }
        d0();
    }

    public final void u() {
        ue.f fVar = this.J;
        w1 w1Var = this.I;
        boolean z10 = fVar.b | (((w1) fVar.h) != w1Var);
        fVar.b = z10;
        fVar.h = w1Var;
        if (z10) {
            k0 k0Var = this.C.a;
            k0Var.i.c(new d5.u(16, k0Var, fVar));
            this.J = new ue.f(this.I);
        }
    }

    public final void v() {
        m(this.E.b(), true);
    }

    public final void w(n0 n0Var) {
        s2 b10;
        this.J.a(1);
        int i10 = n0Var.a;
        int i11 = n0Var.b;
        int i12 = n0Var.c;
        j4.g1 g1Var = n0Var.d;
        s1 s1Var = this.E;
        ArrayList arrayList = s1Var.b;
        d5.a.f(i10 >= 0 && i10 <= i11 && i11 <= arrayList.size() && i12 >= 0);
        s1Var.j = g1Var;
        if (i10 == i11 || i10 == i12) {
            b10 = s1Var.b();
        } else {
            int min = Math.min(i10, i12);
            int max = Math.max(((i11 - i10) + i12) - 1, i11 - 1);
            int i13 = ((r1) arrayList.get(min)).d;
            d5.g0.G(i10, i11, i12, arrayList);
            while (min <= max) {
                r1 r1Var = (r1) arrayList.get(min);
                r1Var.d = i13;
                i13 += r1Var.a.o.b.o();
                min++;
            }
            b10 = s1Var.b();
        }
        m(b10, false);
    }

    public final void x() {
        this.J.a(1);
        C(false, false, false, true);
        this.f.b(false);
        X(this.I.a.p() ? 4 : 2);
        com.google.android.exoplayer2.upstream.u uVar = (com.google.android.exoplayer2.upstream.u) this.h;
        uVar.getClass();
        s1 s1Var = this.E;
        ArrayList arrayList = s1Var.b;
        d5.a.i(!s1Var.k);
        s1Var.l = uVar;
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            r1 r1Var = (r1) arrayList.get(i10);
            s1Var.e(r1Var);
            s1Var.g.add(r1Var);
        }
        s1Var.k = true;
        this.n.d(2);
    }

    public final synchronized boolean y() {
        if (!this.K && this.s.getThread().isAlive()) {
            this.n.d(7);
            h0(new o(this, 3), this.G);
            return this.K;
        }
        return true;
    }

    public final void z() {
        C(true, false, true, false);
        this.f.b(true);
        X(1);
        HandlerThread handlerThread = this.r;
        if (handlerThread != null) {
            handlerThread.quit();
        }
        synchronized (this) {
            this.K = true;
            notifyAll();
        }
    }
}
