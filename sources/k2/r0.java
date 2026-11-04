package k2;

import android.content.Context;
import android.media.MediaFormat;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.os.Trace;
import android.text.TextUtils;
import android.util.Pair;
import b8.zb;
import ci.c8;
import ei.y8;
import gi.f6;
import j$.util.Objects;
import j$.util.concurrent.ConcurrentHashMap;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import org.telegram.messenger.hs;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class r0 implements Handler.Callback, w2.d0, k1, c3.w {
    public static final long x0 = g2.n0.h0(10000);
    public final i E;
    public final ArrayList F;
    public final g2.h0 G;
    public final w H;
    public final z0 I;
    public final i1 J;
    public final f K;
    public final long L;
    public final l2.k M;
    public final l2.f N;
    public final g2.j0 O;
    public final boolean P;
    public final e2.d Q;
    public final boolean R;
    public t1 S;
    public s1 T;
    public boolean U;
    public boolean V;
    public q0 W;
    public int X;
    public j1 Y;
    public o0 Z;
    public final r1[] a;
    public boolean a0;
    public final b[] b;
    public boolean b0;
    public final boolean[] c;
    public boolean c0;
    public final z2.s d;
    public boolean d0;
    public final z2.t e;
    public long e0;
    public final t0 f;
    public boolean f0;
    public int g0;
    public final a3.d h;
    public boolean h0;
    public boolean i0;
    public boolean j0;
    public boolean k0;
    public int l0;
    public q0 m0;
    public final g2.j0 n;
    public long n0;
    public long o0;
    public int p0;
    public boolean q0;
    public final l6.n r;
    public l r0;
    public final Looper s;
    public long s0;
    public o t0;
    public long u0;
    public boolean v0;
    public final d2.m1 w;
    public float w0;
    public final d2.k1 x;
    public final long y;

    public r0(Context context, b[] bVarArr, b[] bVarArr2, z2.s sVar, z2.t tVar, t0 t0Var, a3.d dVar, int i3, boolean z10, l2.f fVar, t1 t1Var, f fVar2, long j10, Looper looper, g2.h0 h0Var, w wVar, l2.k kVar, final c3.w wVar2, boolean z11) {
        o oVar = o.a;
        this.u0 = -9223372036854775807L;
        this.H = wVar;
        this.d = sVar;
        this.e = tVar;
        this.f = t0Var;
        this.h = dVar;
        this.g0 = i3;
        this.h0 = z10;
        this.S = t1Var;
        this.K = fVar2;
        this.L = j10;
        this.b0 = false;
        this.G = h0Var;
        this.M = kVar;
        this.t0 = oVar;
        this.N = fVar;
        this.w0 = 1.0f;
        this.T = s1.b;
        this.R = z11;
        this.s0 = -9223372036854775807L;
        this.e0 = -9223372036854775807L;
        this.y = ((h) t0Var).n;
        d2.j1 j1Var = d2.n1.a;
        j1 k10 = j1.k(tVar);
        this.Y = k10;
        this.Z = new o0(k10);
        this.b = new b[bVarArr.length];
        this.c = new boolean[bVarArr.length];
        z2.n nVar = (z2.n) sVar;
        nVar.getClass();
        this.a = new r1[bVarArr.length];
        boolean z12 = false;
        for (int i10 = 0; i10 < bVarArr.length; i10++) {
            b bVar = bVarArr[i10];
            bVar.e = i10;
            bVar.f = kVar;
            bVar.h = h0Var;
            this.b[i10] = bVar;
            b bVar2 = this.b[i10];
            synchronized (bVar2.a) {
                bVar2.I = nVar;
            }
            b bVar3 = bVarArr2[i10];
            if (bVar3 != null) {
                bVar3.e = i10;
                bVar3.f = kVar;
                bVar3.h = h0Var;
                z12 = true;
            }
            this.a[i10] = new r1(bVarArr[i10], bVar3, i10);
        }
        this.P = z12;
        this.E = new i(this, h0Var);
        this.F = new ArrayList();
        this.w = new d2.m1();
        this.x = new d2.k1();
        zb.p(sVar.a == null);
        sVar.a = this;
        sVar.b = dVar;
        this.q0 = true;
        g2.j0 a10 = h0Var.a(looper, null);
        this.O = a10;
        this.I = new z0(fVar, a10, new y8(this, 23));
        this.J = new i1(this, fVar, a10, kVar);
        l6.n nVar2 = new l6.n(6);
        this.r = nVar2;
        Looper e10 = nVar2.e();
        this.s = e10;
        g2.j0 a11 = h0Var.a(e10, this);
        this.n = a11;
        this.Q = new e2.d(context, e10, this);
        a11.b(35, new c3.w() { // from class: k2.j0
            @Override // c3.w
            public final void a(long j11, long j12, d2.v vVar, MediaFormat mediaFormat) {
                r0 r0Var = r0.this;
                r0Var.getClass();
                wVar2.a(j11, j12, vVar, mediaFormat);
                r0Var.a(j11, j12, vVar, mediaFormat);
            }
        }).b();
        a11.b(39, new k0(this)).b();
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, w2.e0, w2.f1] */
    public static boolean A(x0 x0Var) {
        if (x0Var != null) {
            try {
                ?? r12 = x0Var.a;
                if (x0Var.e) {
                    for (w2.d1 d1Var : x0Var.c) {
                        if (d1Var != null) {
                            d1Var.a();
                        }
                    }
                } else {
                    r12.g();
                }
                if ((!x0Var.e ? 0L : r12.e()) != Long.MIN_VALUE) {
                    return true;
                }
            } catch (IOException unused) {
            }
        }
        return false;
    }

    public static Pair T(d2.n1 n1Var, q0 q0Var, boolean z10, int i3, boolean z11, d2.m1 m1Var, d2.k1 k1Var) {
        int U;
        d2.n1 n1Var2 = q0Var.a;
        if (n1Var.p()) {
            return null;
        }
        d2.n1 n1Var3 = n1Var2.p() ? n1Var : n1Var2;
        try {
            Pair i10 = n1Var3.i(m1Var, k1Var, q0Var.b, q0Var.c);
            if (!n1Var.equals(n1Var3)) {
                if (n1Var.b(i10.first) == -1) {
                    if (!z10 || (U = U(m1Var, k1Var, i3, z11, i10.first, n1Var3, n1Var)) == -1) {
                        return null;
                    }
                    return n1Var.i(m1Var, k1Var, U, -9223372036854775807L);
                }
                if (n1Var3.g(i10.first, k1Var).f && n1Var3.m(k1Var.c, m1Var, 0L).n == n1Var3.b(i10.first)) {
                    return n1Var.i(m1Var, k1Var, n1Var.g(i10.first, k1Var).c, q0Var.c);
                }
            }
            return i10;
        } catch (IndexOutOfBoundsException unused) {
            return null;
        }
    }

    public static int U(d2.m1 m1Var, d2.k1 k1Var, int i3, boolean z10, Object obj, d2.n1 n1Var, d2.n1 n1Var2) {
        d2.m1 m1Var2 = m1Var;
        d2.n1 n1Var3 = n1Var;
        Object obj2 = n1Var3.m(n1Var3.g(obj, k1Var).c, m1Var, 0L).a;
        for (int i10 = 0; i10 < n1Var2.o(); i10++) {
            if (n1Var2.m(i10, m1Var, 0L).a.equals(obj2)) {
                return i10;
            }
        }
        int b10 = n1Var3.b(obj);
        int h = n1Var3.h();
        int i11 = -1;
        int i12 = 0;
        while (i12 < h && i11 == -1) {
            d2.n1 n1Var4 = n1Var3;
            int d = n1Var4.d(b10, k1Var, m1Var2, i3, z10);
            if (d == -1) {
                break;
            }
            i11 = n1Var2.b(n1Var4.l(d));
            i12++;
            n1Var3 = n1Var4;
            b10 = d;
            m1Var2 = m1Var;
        }
        if (i11 == -1) {
            return -1;
        }
        return n1Var2.f(i11, k1Var, false).c;
    }

    public static void g(m1 m1Var) {
        try {
            synchronized (m1Var) {
                synchronized (m1Var) {
                }
                m1Var.a.d(m1Var.c, m1Var.d);
                return;
            }
            m1Var.a.d(m1Var.c, m1Var.d);
            return;
        } finally {
            m1Var.a(true);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:99:0x029c, code lost:
    
        if (((long) ((r3.e() - r23.n0) / r23.E.g().a)) > 10000000) goto L254;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0158  */
    /* JADX WARN: Removed duplicated region for block: B:229:0x0456  */
    /* JADX WARN: Removed duplicated region for block: B:249:0x04a3  */
    /* JADX WARN: Removed duplicated region for block: B:266:0x04c7  */
    /* JADX WARN: Removed duplicated region for block: B:281:0x04f9  */
    /* JADX WARN: Removed duplicated region for block: B:284:0x0518  */
    /* JADX WARN: Removed duplicated region for block: B:293:0x0555  */
    /* JADX WARN: Removed duplicated region for block: B:297:0x055d  */
    /* JADX WARN: Removed duplicated region for block: B:324:0x05a6  */
    /* JADX WARN: Removed duplicated region for block: B:328:0x05b1  */
    /* JADX WARN: Removed duplicated region for block: B:358:0x0166  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x01b1  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0236  */
    /* JADX WARN: Type inference failed for: r1v49, types: [java.lang.Object, w2.e0] */
    /* JADX WARN: Type inference failed for: r2v58, types: [java.lang.Object, w2.e0] */
    /* JADX WARN: Type inference failed for: r2v9, types: [java.lang.Object, w2.e0] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void A0() {
        x0 x0Var;
        long j10;
        x0 x0Var2;
        x0 x0Var3;
        r1[] r1VarArr;
        z0 z0Var;
        boolean z10;
        x0 x0Var4;
        x0 x0Var5;
        x0 a10;
        boolean z11;
        int i3;
        r1[] r1VarArr2;
        int i10;
        boolean z12;
        boolean z13;
        char c2;
        int i11;
        int i12;
        x0 x0Var6;
        x0 x0Var7;
        boolean z14;
        int i13;
        if (this.Y.a.p() || !this.J.k) {
            return;
        }
        this.I.m(this.n0);
        z0 z0Var2 = this.I;
        x0 x0Var8 = z0Var2.l;
        if (x0Var8 == null || (!x0Var8.g.k && x0Var8.g() && z0Var2.l.g.f != -9223372036854775807L && z0Var2.n < 100)) {
            z0 z0Var3 = this.I;
            long j11 = this.n0;
            j1 j1Var = this.Y;
            x0 x0Var9 = z0Var3.l;
            y0 d = x0Var9 == null ? z0Var3.d(j1Var.a, j1Var.b, j1Var.c, j1Var.s, -9223372036854775807L) : z0Var3.c(j1Var.a, x0Var9, j11);
            if (d != null) {
                z0 z0Var4 = this.I;
                x0 x0Var10 = z0Var4.l;
                long j12 = x0Var10 == null ? 1000000000000L : (x0Var10.p + x0Var10.g.f) - d.b;
                int i14 = 0;
                while (true) {
                    if (i14 >= z0Var4.q.size()) {
                        x0Var = null;
                        break;
                    }
                    y0 y0Var = ((x0) z0Var4.q.get(i14)).g;
                    long j13 = y0Var.f;
                    long j14 = d.f;
                    if ((j13 == -9223372036854775807L || j13 == j14) && y0Var.b == d.b && y0Var.a.equals(d.a)) {
                        x0Var = (x0) z0Var4.q.remove(i14);
                        break;
                    }
                    i14++;
                }
                if (x0Var == null) {
                    r0 r0Var = (r0) z0Var4.e.b;
                    b[] bVarArr = r0Var.b;
                    z2.s sVar = r0Var.d;
                    t0 t0Var = r0Var.f;
                    l2.k kVar = r0Var.M;
                    h hVar = (h) t0Var;
                    hVar.getClass();
                    j10 = -9223372036854775807L;
                    android.support.v4.media.session.a0 a0Var = new android.support.v4.media.session.a0(hVar, kVar);
                    i1 i1Var = r0Var.J;
                    z2.t tVar = r0Var.e;
                    r0Var.t0.getClass();
                    x0Var = new x0(bVarArr, j12, sVar, a0Var, i1Var, d, tVar);
                } else {
                    j10 = -9223372036854775807L;
                    x0Var.g = d;
                    x0Var.p = j12;
                }
                x0 x0Var11 = z0Var4.l;
                if (x0Var11 == null) {
                    z0Var4.i = x0Var;
                    z0Var4.j = x0Var;
                    z0Var4.k = x0Var;
                } else if (x0Var != x0Var11.m) {
                    x0Var11.b();
                    x0Var11.m = x0Var;
                    x0Var11.c();
                }
                z0Var4.o = null;
                z0Var4.l = x0Var;
                z0Var4.n++;
                z0Var4.l();
                if (!x0Var.d) {
                    long j15 = d.b;
                    x0Var.d = true;
                    x0Var.a.i(this, j15);
                } else if (x0Var.e) {
                    this.n.b(8, x0Var.a).b();
                }
                if (this.I.i == x0Var) {
                    R(d.b, true);
                }
                v(false);
                if (this.f0) {
                    D();
                } else {
                    this.f0 = A(this.I.l);
                    x0();
                }
                z0 z0Var5 = this.I;
                if (!this.c0 && this.P && !this.v0 && !e() && (x0Var6 = z0Var5.k) != null && x0Var6 == z0Var5.j && (x0Var7 = x0Var6.m) != null && (z14 = x0Var7.e)) {
                    zb.p(z14);
                    if (((long) ((x0Var7.e() - this.n0) / this.E.g().a)) <= 10000000) {
                        x0 x0Var12 = z0Var5.k;
                        x0Var12.getClass();
                        z0Var5.k = x0Var12.m;
                        z0Var5.l();
                        z0Var5.k.getClass();
                        r1[] r1VarArr3 = this.a;
                        x0 x0Var13 = z0Var5.k;
                        if (x0Var13 != null) {
                            z2.t tVar2 = x0Var13.o;
                            for (int i15 = 0; i15 < r1VarArr3.length; i15++) {
                                if (tVar2.b(i15)) {
                                    r1 r1Var = r1VarArr3[i15];
                                    if (r1Var.c != null && !r1Var.f()) {
                                        r1 r1Var2 = r1VarArr3[i15];
                                        zb.p(!r1Var2.f());
                                        if (r1.h(r1Var2.a)) {
                                            i13 = 3;
                                        } else {
                                            b bVar = r1Var2.c;
                                            i13 = (bVar == null || bVar.n == 0) ? 2 : 4;
                                        }
                                        r1Var2.d = i13;
                                        l(x0Var13, i15, false, x0Var13.e());
                                    }
                                }
                            }
                            if (e()) {
                                this.u0 = x0Var13.a.n();
                                if (!x0Var13.g()) {
                                    z0Var5.n(x0Var13);
                                    v(false);
                                    D();
                                }
                            }
                        }
                    }
                }
                boolean z15 = this.P;
                r1[] r1VarArr4 = this.a;
                z0 z0Var6 = this.I;
                x0Var2 = z0Var6.j;
                if (x0Var2 != null) {
                    if (x0Var2.m == null || this.c0) {
                        if (x0Var2.g.k || this.c0) {
                            for (r1 r1Var3 : r1VarArr4) {
                                if (r1Var3.d(x0Var2) != null) {
                                    b d10 = r1Var3.d(x0Var2);
                                    d10.getClass();
                                    if (d10.k()) {
                                        long j16 = x0Var2.g.f;
                                        long j17 = (j16 == -9223372036854775807L || j16 == Long.MIN_VALUE) ? -9223372036854775807L : j16 + x0Var2.p;
                                        b d11 = r1Var3.d(x0Var2);
                                        d11.getClass();
                                        r1.l(d11, j17);
                                    }
                                }
                            }
                        }
                    } else if (x0Var2.e) {
                        int i16 = 0;
                        while (true) {
                            if (i16 < r1VarArr4.length) {
                                r1 r1Var4 = r1VarArr4[i16];
                                if (!r1Var4.e(x0Var2, r1Var4.a) || !r1Var4.e(x0Var2, r1Var4.c)) {
                                    break;
                                } else {
                                    i16++;
                                }
                            } else if (!e() || z0Var6.k != z0Var6.j) {
                                x0 x0Var14 = x0Var2.m;
                                if (x0Var14.e || this.n0 >= x0Var14.e()) {
                                    boolean z16 = x0Var2.m.e;
                                    if (z16) {
                                        zb.p(z16);
                                    }
                                    z2.t tVar3 = x0Var2.o;
                                    x0 x0Var15 = z0Var6.k;
                                    x0 x0Var16 = z0Var6.j;
                                    if (x0Var15 == x0Var16) {
                                        x0Var16.getClass();
                                        z0Var6.k = x0Var16.m;
                                    }
                                    x0 x0Var17 = z0Var6.j;
                                    x0Var17.getClass();
                                    z0Var6.j = x0Var17.m;
                                    z0Var6.l();
                                    x0 x0Var18 = z0Var6.j;
                                    x0Var18.getClass();
                                    z2.t tVar4 = x0Var18.o;
                                    d2.n1 n1Var = this.Y.a;
                                    D0(n1Var, x0Var18.g.a, n1Var, x0Var2.g.a, -9223372036854775807L, false);
                                    if (x0Var18.e && ((z15 && this.u0 != j10) || x0Var18.a.n() != j10)) {
                                        this.u0 = j10;
                                        boolean z17 = z15 && !this.v0;
                                        if (z17) {
                                            int i17 = 0;
                                            while (true) {
                                                if (i17 >= r1VarArr4.length) {
                                                    break;
                                                }
                                                boolean b10 = tVar4.b(i17);
                                                z2.p[] pVarArr = tVar4.c;
                                                if (b10 && r1VarArr4[i17].a.b != -2 && !d2.u0.a(pVarArr[i17].n().s, pVarArr[i17].n().k) && !r1VarArr4[i17].f()) {
                                                    z17 = false;
                                                    break;
                                                }
                                                i17++;
                                            }
                                        }
                                        if (!z17) {
                                            long e10 = x0Var18.e();
                                            for (r1 r1Var5 : r1VarArr4) {
                                                b bVar2 = r1Var5.c;
                                                b bVar3 = r1Var5.a;
                                                if (r1.h(bVar3) && (i12 = r1Var5.d) != 4 && i12 != 2) {
                                                    r1.l(bVar3, e10);
                                                }
                                                if (bVar2 != null) {
                                                    if ((bVar2.n != 0) && r1Var5.d != 3) {
                                                        r1.l(bVar2, e10);
                                                    }
                                                }
                                            }
                                            if (!x0Var18.g()) {
                                                z0Var6.n(x0Var18);
                                                v(false);
                                                D();
                                            }
                                        }
                                    }
                                    for (r1 r1Var6 : r1VarArr4) {
                                        long e11 = x0Var18.e();
                                        b bVar4 = r1Var6.a;
                                        int i18 = r1Var6.b;
                                        boolean b11 = tVar3.b(i18);
                                        boolean b12 = tVar4.b(i18);
                                        b bVar5 = r1Var6.c;
                                        if (bVar5 == null || (i11 = r1Var6.d) == 3 || (i11 == 0 && r1.h(bVar4))) {
                                            bVar5 = bVar4;
                                        }
                                        if (!b11 || bVar5.E) {
                                            c2 = 65534;
                                        } else {
                                            int i19 = bVar4.b;
                                            c2 = 65534;
                                            boolean z18 = i19 == -2;
                                            q1 q1Var = tVar3.b[i18];
                                            q1 q1Var2 = tVar4.b[i18];
                                            if (!b12 || !Objects.equals(q1Var2, q1Var) || z18 || r1Var6.f()) {
                                                r1.l(bVar5, e11);
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                z0 z0Var7 = this.I;
                x0Var3 = z0Var7.j;
                if (x0Var3 != null && z0Var7.i != x0Var3 && !x0Var3.h) {
                    r1VarArr2 = this.a;
                    z2.t tVar5 = x0Var3.o;
                    z12 = true;
                    for (i10 = 0; i10 < r1VarArr2.length; i10++) {
                        int c10 = r1VarArr2[i10].c();
                        r1 r1Var7 = r1VarArr2[i10];
                        i iVar = this.E;
                        int j18 = r1Var7.j(r1Var7.a, x0Var3, tVar5, iVar);
                        int j19 = r1Var7.j(r1Var7.c, x0Var3, tVar5, iVar);
                        if (j18 == 1) {
                            j18 = j19;
                        }
                        if ((j18 & 2) != 0 && (z13 = this.k0) && z13) {
                            this.k0 = false;
                            if (this.Y.p) {
                                this.n.f(2);
                            }
                        }
                        this.l0 -= c10 - r1VarArr2[i10].c();
                        z12 &= (j18 & 1) != 0;
                    }
                    if (z12) {
                        for (int i20 = 0; i20 < r1VarArr2.length; i20++) {
                            if (tVar5.b(i20)) {
                                if (!(r1VarArr2[i20].d(x0Var3) != null)) {
                                    l(x0Var3, i20, false, x0Var3.e());
                                }
                            }
                        }
                    }
                    if (z12) {
                        z0Var7.j.h = true;
                    }
                }
                r1VarArr = this.a;
                z0Var = this.I;
                z10 = false;
                while (s0() && !this.c0 && (x0Var4 = z0Var.i) != null && (x0Var5 = x0Var4.m) != null && this.n0 >= x0Var5.e() && x0Var5.h) {
                    if (z10) {
                        F();
                    }
                    this.v0 = false;
                    a10 = z0Var.a();
                    a10.getClass();
                    if (this.Y.b.a.equals(a10.g.a.a)) {
                        w2.g0 g0Var = this.Y.b;
                        if (g0Var.b == -1) {
                            w2.g0 g0Var2 = a10.g.a;
                            if (g0Var2.b == -1 && g0Var.e != g0Var2.e) {
                                z11 = true;
                                y0 y0Var2 = a10.g;
                                boolean z19 = z11;
                                w2.g0 g0Var3 = y0Var2.a;
                                long j20 = y0Var2.b;
                                this.Y = z(g0Var3, j20, y0Var2.d, j20, !z19, 0);
                                Q();
                                C0();
                                if (e() && a10 == z0Var.k) {
                                    for (r1 r1Var8 : r1VarArr) {
                                        int i21 = r1Var8.d;
                                        if (i21 == 3 || i21 == 4) {
                                            boolean z20 = i21 == 4;
                                            b bVar6 = r1Var8.a;
                                            b bVar7 = r1Var8.c;
                                            if (z20) {
                                                bVar7.getClass();
                                                bVar7.d(17, bVar6);
                                            } else {
                                                bVar7.getClass();
                                                bVar6.d(17, bVar7);
                                            }
                                            r1Var8.d = r1Var8.d == 4 ? 0 : 1;
                                        } else if (i21 == 2) {
                                            r1Var8.d = 0;
                                        }
                                    }
                                }
                                if (this.Y.e == 3) {
                                    u0();
                                }
                                z2.t tVar6 = z0Var.i.o;
                                for (i3 = 0; i3 < r1VarArr.length; i3++) {
                                    if (tVar6.b(i3)) {
                                        r1 r1Var9 = r1VarArr[i3];
                                        b bVar8 = r1Var9.c;
                                        b bVar9 = r1Var9.a;
                                        if (r1.h(bVar9)) {
                                            bVar9.f();
                                        } else if (bVar8 != null) {
                                            if (bVar8.n != 0) {
                                                bVar8.f();
                                            }
                                        }
                                    }
                                }
                                z10 = true;
                            }
                        }
                    }
                    z11 = false;
                    y0 y0Var22 = a10.g;
                    boolean z192 = z11;
                    w2.g0 g0Var32 = y0Var22.a;
                    long j202 = y0Var22.b;
                    this.Y = z(g0Var32, j202, y0Var22.d, j202, !z192, 0);
                    Q();
                    C0();
                    if (e()) {
                        while (r2 < r1) {
                        }
                    }
                    if (this.Y.e == 3) {
                    }
                    z2.t tVar62 = z0Var.i.o;
                    while (i3 < r1VarArr.length) {
                    }
                    z10 = true;
                }
                this.t0.getClass();
            }
        }
        j10 = -9223372036854775807L;
        if (this.f0) {
        }
        z0 z0Var52 = this.I;
        if (!this.c0) {
            zb.p(z14);
            if (((long) ((x0Var7.e() - this.n0) / this.E.g().a)) <= 10000000) {
            }
        }
        boolean z152 = this.P;
        r1[] r1VarArr42 = this.a;
        z0 z0Var62 = this.I;
        x0Var2 = z0Var62.j;
        if (x0Var2 != null) {
        }
        z0 z0Var72 = this.I;
        x0Var3 = z0Var72.j;
        if (x0Var3 != null) {
            r1VarArr2 = this.a;
            z2.t tVar52 = x0Var3.o;
            z12 = true;
            while (i10 < r1VarArr2.length) {
            }
            if (z12) {
            }
            if (z12) {
            }
        }
        r1VarArr = this.a;
        z0Var = this.I;
        z10 = false;
        while (s0()) {
            if (z10) {
            }
            this.v0 = false;
            a10 = z0Var.a();
            a10.getClass();
            if (this.Y.b.a.equals(a10.g.a.a)) {
            }
            z11 = false;
            y0 y0Var222 = a10.g;
            boolean z1922 = z11;
            w2.g0 g0Var322 = y0Var222.a;
            long j2022 = y0Var222.b;
            this.Y = z(g0Var322, j2022, y0Var222.d, j2022, !z1922, 0);
            Q();
            C0();
            if (e()) {
            }
            if (this.Y.e == 3) {
            }
            z2.t tVar622 = z0Var.i.o;
            while (i3 < r1VarArr.length) {
            }
            z10 = true;
        }
        this.t0.getClass();
    }

    public final boolean B(int i3, w2.g0 g0Var) {
        z0 z0Var = this.I;
        x0 x0Var = z0Var.k;
        if (x0Var != null && x0Var.g.a.equals(g0Var)) {
            r1 r1Var = this.a[i3];
            x0 x0Var2 = z0Var.k;
            int i10 = r1Var.d;
            boolean z10 = (i10 == 2 || i10 == 4) && r1Var.d(x0Var2) == r1Var.a;
            boolean z11 = r1Var.d == 3 && r1Var.d(x0Var2) == r1Var.c;
            if (z10 || z11) {
                return true;
            }
        }
        return false;
    }

    public final void B0(int i3, int i10, int i11, boolean z10) {
        boolean z11 = z10 && i3 != -1;
        if (i3 == -1) {
            i11 = 2;
        } else if (i11 == 2) {
            i11 = 1;
        }
        boolean z12 = this.U;
        if (i3 == 0) {
            i10 = 1;
        } else if (i10 == 1) {
            i10 = z12 ? 4 : 0;
        }
        j1 j1Var = this.Y;
        if (j1Var.l == z11 && j1Var.n == i10 && j1Var.m == i11) {
            return;
        }
        this.Y = j1Var.e(i11, i10, z11);
        E0(false, false);
        z0 z0Var = this.I;
        for (x0 x0Var = z0Var.i; x0Var != null; x0Var = x0Var.m) {
            for (z2.p pVar : x0Var.o.c) {
                if (pVar != null) {
                    pVar.f(z11);
                }
            }
        }
        if (!s0()) {
            w0();
            C0();
            j1 j1Var2 = this.Y;
            if (j1Var2.p) {
                this.Y = j1Var2.i(false);
            }
            z0Var.m(this.n0);
            return;
        }
        int i12 = this.Y.e;
        g2.j0 j0Var = this.n;
        if (i12 != 3) {
            if (i12 == 2) {
                j0Var.f(2);
            }
        } else {
            i iVar = this.E;
            iVar.f = true;
            iVar.a.e();
            u0();
            j0Var.f(2);
        }
    }

    public final boolean C() {
        x0 x0Var = this.I.i;
        long j10 = x0Var.g.f;
        if (x0Var.e) {
            return j10 == -9223372036854775807L || this.Y.s < j10 || !s0();
        }
        return false;
    }

    /* JADX WARN: Type inference failed for: r2v21, types: [java.lang.Object, w2.e0] */
    public final void C0() {
        long j10;
        float f10;
        x0 x0Var = this.I.i;
        if (x0Var == null) {
            return;
        }
        long n4 = x0Var.e ? x0Var.a.n() : -9223372036854775807L;
        if (n4 != -9223372036854775807L) {
            if (!x0Var.g()) {
                this.I.n(x0Var);
                v(false);
                D();
            }
            R(n4, true);
            if (n4 != this.Y.s) {
                j1 j1Var = this.Y;
                this.Y = z(j1Var.b, n4, j1Var.c, n4, true, 5);
            }
        } else {
            i iVar = this.E;
            boolean z10 = x0Var != this.I.j;
            u1 u1Var = iVar.a;
            b bVar = iVar.c;
            if (bVar == null || bVar.l() || ((z10 && iVar.c.n != 2) || (!iVar.c.m() && (z10 || iVar.c.k())))) {
                iVar.e = true;
                if (iVar.f) {
                    u1Var.e();
                }
            } else {
                w0 w0Var = iVar.d;
                w0Var.getClass();
                long a10 = w0Var.a();
                if (iVar.e) {
                    if (a10 >= u1Var.a()) {
                        iVar.e = false;
                        if (iVar.f) {
                            u1Var.e();
                        }
                    } else if (u1Var.c) {
                        u1Var.d(u1Var.a());
                        u1Var.c = false;
                    }
                }
                u1Var.d(a10);
                d2.y0 g7 = w0Var.g();
                if (!g7.equals((d2.y0) u1Var.e)) {
                    u1Var.c(g7);
                    iVar.b.n.b(16, g7).b();
                }
            }
            long a11 = iVar.a();
            this.n0 = a11;
            long j11 = a11 - x0Var.p;
            long j12 = this.Y.s;
            ArrayList arrayList = this.F;
            if (!arrayList.isEmpty() && !this.Y.b.b()) {
                if (this.q0) {
                    this.q0 = false;
                }
                j1 j1Var2 = this.Y;
                j1Var2.a.b(j1Var2.b.a);
                int min = Math.min(this.p0, arrayList.size());
                if (min > 0 && arrayList.get(min - 1) != null) {
                    throw new ClassCastException();
                }
                if (min < arrayList.size() && arrayList.get(min) != null) {
                    throw new ClassCastException();
                }
                this.p0 = min;
            }
            if (this.E.b()) {
                boolean z11 = !this.Z.d;
                j1 j1Var3 = this.Y;
                this.Y = z(j1Var3.b, j11, j1Var3.c, j11, z11, 6);
            } else {
                j1 j1Var4 = this.Y;
                j1Var4.s = j11;
                j1Var4.t = SystemClock.elapsedRealtime();
            }
        }
        this.Y.q = this.I.l.d();
        j1 j1Var5 = this.Y;
        j1Var5.r = q(j1Var5.q);
        j1 j1Var6 = this.Y;
        if (j1Var6.l && j1Var6.e == 3 && t0(j1Var6.a, j1Var6.b)) {
            j1 j1Var7 = this.Y;
            float f11 = 1.0f;
            if (j1Var7.o.a == 1.0f) {
                f fVar = this.K;
                long n10 = n(j1Var7.a, j1Var7.b.a, j1Var7.s);
                long j13 = this.Y.r;
                if (fVar.c != -9223372036854775807L) {
                    long j14 = n10 - j13;
                    long j15 = fVar.m;
                    if (j15 == -9223372036854775807L) {
                        fVar.m = j14;
                        fVar.n = 0L;
                    } else {
                        fVar.m = Math.max(j14, (long) ((j14 * 9.999871E-4f) + (j15 * 0.999f)));
                        fVar.n = (long) ((9.999871E-4f * Math.abs(j14 - r9)) + (fVar.n * 0.999f));
                    }
                    if (fVar.l != -9223372036854775807L) {
                        j10 = 1000;
                        if (SystemClock.elapsedRealtime() - fVar.l < 1000) {
                            f11 = fVar.k;
                        }
                    } else {
                        j10 = 1000;
                    }
                    fVar.l = SystemClock.elapsedRealtime();
                    long j16 = (fVar.n * 3) + fVar.m;
                    if (fVar.h > j16) {
                        float S = g2.n0.S(j10);
                        f10 = 1.0E-7f;
                        long[] jArr = {j16, fVar.e, fVar.h - (((long) ((fVar.k - 1.0f) * S)) + ((long) ((fVar.i - 1.0f) * S)))};
                        long j17 = jArr[0];
                        for (int i3 = 1; i3 < 3; i3++) {
                            long j18 = jArr[i3];
                            if (j18 > j17) {
                                j17 = j18;
                            }
                        }
                        fVar.h = j17;
                    } else {
                        f10 = 1.0E-7f;
                        long j19 = g2.n0.j(n10 - ((long) (Math.max(0.0f, fVar.k - 1.0f) / 1.0E-7f)), fVar.h, j16);
                        fVar.h = j19;
                        long j20 = fVar.g;
                        if (j20 != -9223372036854775807L && j19 > j20) {
                            fVar.h = j20;
                        }
                    }
                    long j21 = n10 - fVar.h;
                    if (Math.abs(j21) < fVar.a) {
                        fVar.k = 1.0f;
                    } else {
                        fVar.k = g2.n0.h((f10 * j21) + 1.0f, fVar.j, fVar.i);
                    }
                    f11 = fVar.k;
                }
                if (this.E.g().a != f11) {
                    d2.y0 y0Var = new d2.y0(f11, this.Y.o.b);
                    this.n.e(16);
                    this.E.c(y0Var);
                    y(this.Y.o, this.E.g().a, false, false);
                }
            }
        }
    }

    /* JADX WARN: Type inference failed for: r1v14, types: [java.lang.Object, w2.e0] */
    /* JADX WARN: Type inference failed for: r1v21, types: [java.lang.Object, w2.f1] */
    /* JADX WARN: Type inference failed for: r7v1, types: [java.lang.Object, w2.f1] */
    public final void D() {
        boolean b10;
        if (A(this.I.l)) {
            x0 x0Var = this.I.l;
            long q10 = q(!x0Var.e ? 0L : x0Var.a.e());
            x0 x0Var2 = this.I.i;
            long j10 = t0(this.Y.a, x0Var.g.a) ? this.K.h : -9223372036854775807L;
            l2.k kVar = this.M;
            d2.n1 n1Var = this.Y.a;
            w2.g0 g0Var = x0Var.g.a;
            float f10 = this.E.g().a;
            boolean z10 = this.Y.l;
            s0 s0Var = new s0(kVar, n1Var, g0Var, q10, f10, this.d0, j10);
            b10 = ((h) this.f).b(s0Var);
            x0 x0Var3 = this.I.i;
            if (!b10 && x0Var3.e && q10 < 500000 && this.y > 0) {
                x0Var3.a.l(this.Y.s);
                b10 = ((h) this.f).b(s0Var);
            }
        } else {
            b10 = false;
        }
        this.f0 = b10;
        if (b10) {
            x0 x0Var4 = this.I.l;
            x0Var4.getClass();
            u0 u0Var = new u0();
            u0Var.a = this.n0 - x0Var4.p;
            float f11 = this.E.g().a;
            zb.f(f11 > 0.0f || f11 == -3.4028235E38f);
            u0Var.b = f11;
            long j11 = this.e0;
            zb.f(j11 >= 0 || j11 == -9223372036854775807L);
            u0Var.c = j11;
            v0 v0Var = new v0(u0Var);
            zb.p(x0Var4.m == null);
            x0Var4.a.c(v0Var);
        }
        x0();
    }

    public final void D0(d2.n1 n1Var, w2.g0 g0Var, d2.n1 n1Var2, w2.g0 g0Var2, long j10, boolean z10) {
        boolean t02 = t0(n1Var, g0Var);
        Object obj = g0Var.a;
        if (!t02) {
            d2.y0 y0Var = g0Var.b() ? d2.y0.d : this.Y.o;
            i iVar = this.E;
            if (iVar.g().equals(y0Var)) {
                return;
            }
            this.n.e(16);
            iVar.c(y0Var);
            y(this.Y.o, y0Var.a, false, false);
            return;
        }
        d2.k1 k1Var = this.x;
        int i3 = n1Var.g(obj, k1Var).c;
        d2.m1 m1Var = this.w;
        n1Var.n(i3, m1Var);
        d2.h0 h0Var = m1Var.j;
        f fVar = this.K;
        fVar.getClass();
        fVar.c = g2.n0.S(h0Var.a);
        fVar.f = g2.n0.S(h0Var.b);
        fVar.g = g2.n0.S(h0Var.c);
        float f10 = h0Var.d;
        if (f10 == -3.4028235E38f) {
            f10 = 0.97f;
        }
        fVar.j = f10;
        float f11 = h0Var.e;
        if (f11 == -3.4028235E38f) {
            f11 = 1.03f;
        }
        fVar.i = f11;
        if (f10 == 1.0f && f11 == 1.0f) {
            fVar.c = -9223372036854775807L;
        }
        fVar.a();
        if (j10 != -9223372036854775807L) {
            fVar.d = n(n1Var, obj, j10);
            fVar.a();
            return;
        }
        if (!Objects.equals(!n1Var2.p() ? n1Var2.m(n1Var2.g(g0Var2.a, k1Var).c, m1Var, 0L).a : null, m1Var.a) || z10) {
            fVar.d = -9223372036854775807L;
            fVar.a();
        }
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, w2.e0, w2.f1] */
    public final void E() {
        z0 z0Var = this.I;
        z0Var.k();
        x0 x0Var = z0Var.m;
        if (x0Var != null) {
            ?? r12 = x0Var.a;
            if ((!x0Var.d || x0Var.e) && !r12.d()) {
                d2.n1 n1Var = this.Y.a;
                if (x0Var.e) {
                    r12.q();
                }
                Iterator it = ((h) this.f).p.values().iterator();
                while (it.hasNext()) {
                    if (((g) it.next()).b) {
                        return;
                    }
                }
                if (!x0Var.d) {
                    long j10 = x0Var.g.b;
                    x0Var.d = true;
                    r12.i(this, j10);
                    return;
                }
                u0 u0Var = new u0();
                u0Var.a = this.n0 - x0Var.p;
                float f10 = this.E.g().a;
                zb.f(f10 > 0.0f || f10 == -3.4028235E38f);
                u0Var.b = f10;
                long j11 = this.e0;
                zb.f(j11 >= 0 || j11 == -9223372036854775807L);
                u0Var.c = j11;
                v0 v0Var = new v0(u0Var);
                zb.p(x0Var.m == null);
                r12.c(v0Var);
            }
        }
    }

    public final void E0(boolean z10, boolean z11) {
        long j10;
        this.d0 = z10;
        if (!z10 || z11) {
            j10 = -9223372036854775807L;
        } else {
            this.G.getClass();
            j10 = SystemClock.elapsedRealtime();
        }
        this.e0 = j10;
    }

    public final void F() {
        o0 o0Var = this.Z;
        j1 j1Var = this.Y;
        boolean z10 = o0Var.c | (((j1) o0Var.f) != j1Var);
        o0Var.c = z10;
        o0Var.f = j1Var;
        if (z10) {
            i0 i0Var = this.H.b;
            i0Var.j.d(new ii.e(10, i0Var, o0Var));
            this.Z = new o0(this.Y);
        }
    }

    public final void G(int i3) {
        r1 r1Var = this.a[i3];
        try {
            x0 x0Var = this.I.i;
            x0Var.getClass();
            b d = r1Var.d(x0Var);
            d.getClass();
            w2.d1 d1Var = d.r;
            d1Var.getClass();
            d1Var.a();
        } catch (IOException | RuntimeException e10) {
            int i10 = r1Var.a.b;
            if (i10 != 3 && i10 != 5) {
                throw e10;
            }
            z2.t tVar = this.I.i.o;
            g2.a.d("ExoPlayerImplInternal", "Disabling track due to error: " + d2.v.c(tVar.c[i3].n()), e10);
            z2.t tVar2 = new z2.t((q1[]) tVar.b.clone(), (z2.p[]) tVar.c.clone(), tVar.d, tVar.e);
            tVar2.b[i3] = null;
            tVar2.c[i3] = null;
            i(i3);
            x0 x0Var2 = this.I.i;
            x0Var2.a(tVar2, this.Y.s, false, new boolean[x0Var2.j.length]);
        }
    }

    public final void H(int i3, boolean z10) {
        boolean[] zArr = this.c;
        if (zArr[i3] != z10) {
            zArr[i3] = z10;
            this.O.d(new c8(this, i3, z10, 1));
        }
    }

    public final void I() {
        w(this.J.b(), true);
    }

    public final void J(n0 n0Var) {
        d2.n1 b10;
        this.Z.f(1);
        int i3 = n0Var.a;
        int i10 = n0Var.b;
        int i11 = n0Var.c;
        w2.i1 i1Var = n0Var.d;
        i1 i1Var2 = this.J;
        ArrayList arrayList = i1Var2.b;
        zb.f(i3 >= 0 && i3 <= i10 && i10 <= arrayList.size() && i11 >= 0);
        i1Var2.j = i1Var;
        if (i3 == i10 || i3 == i11) {
            b10 = i1Var2.b();
        } else {
            int min = Math.min(i3, i11);
            int max = Math.max(((i10 - i3) + i11) - 1, i10 - 1);
            int i12 = ((h1) arrayList.get(min)).d;
            g2.n0.R(i3, i10, i11, arrayList);
            while (min <= max) {
                h1 h1Var = (h1) arrayList.get(min);
                h1Var.d = i12;
                i12 += h1Var.a.o.e.o();
                min++;
            }
            b10 = i1Var2.b();
        }
        w(b10, false);
    }

    public final void K() {
        this.Z.f(1);
        P(false, false, false, true);
        h hVar = (h) this.f;
        ConcurrentHashMap concurrentHashMap = hVar.p;
        long id2 = Thread.currentThread().getId();
        long j10 = hVar.q;
        zb.o("Players that share the same LoadControl must share the same playback thread. See ExoPlayer.Builder.setPlaybackLooper(Looper).", j10 == -1 || j10 == id2);
        hVar.q = id2;
        l2.k kVar = this.M;
        g gVar = (g) concurrentHashMap.get(kVar);
        if (gVar == null) {
            g gVar2 = new g();
            gVar2.a = 1;
            concurrentHashMap.put(kVar, gVar2);
        } else {
            gVar.a++;
        }
        g gVar3 = (g) concurrentHashMap.get(kVar);
        gVar3.getClass();
        Integer num = (Integer) hVar.o.get(kVar.a);
        int intValue = (num == null || num.intValue() == -1) ? hVar.l : num.intValue();
        if (intValue == -1) {
            intValue = 13107200;
        }
        gVar3.c = intValue;
        gVar3.b = false;
        o0(this.Y.a.p() ? 4 : 2);
        j1 j1Var = this.Y;
        boolean z10 = j1Var.l;
        B0(this.Q.d(j1Var.e, z10), j1Var.n, j1Var.m, z10);
        a3.g gVar4 = (a3.g) this.h;
        gVar4.getClass();
        i1 i1Var = this.J;
        ArrayList arrayList = i1Var.b;
        zb.p(!i1Var.k);
        i1Var.l = gVar4;
        for (int i3 = 0; i3 < arrayList.size(); i3++) {
            h1 h1Var = (h1) arrayList.get(i3);
            i1Var.e(h1Var);
            i1Var.g.add(h1Var);
        }
        i1Var.k = true;
        this.n.f(2);
    }

    public final void L(g2.j jVar) {
        l6.n nVar = this.r;
        g2.j0 j0Var = this.n;
        try {
            P(true, false, true, false);
            M();
            t0 t0Var = this.f;
            l2.k kVar = this.M;
            h hVar = (h) t0Var;
            ConcurrentHashMap concurrentHashMap = hVar.p;
            g gVar = (g) concurrentHashMap.get(kVar);
            if (gVar != null) {
                int i3 = gVar.a - 1;
                gVar.a = i3;
                if (i3 == 0) {
                    concurrentHashMap.remove(kVar);
                    hVar.c();
                }
            }
            if (hVar.p.isEmpty()) {
                hVar.q = -1L;
            }
            e2.d dVar = this.Q;
            dVar.c = null;
            dVar.a();
            dVar.c(0);
            this.d.a();
            o0(1);
        } finally {
            j0Var.a.removeCallbacksAndMessages(null);
            nVar.g();
            jVar.e();
        }
    }

    public final void M() {
        for (int i3 = 0; i3 < this.a.length; i3++) {
            b bVar = this.b[i3];
            synchronized (bVar.a) {
                bVar.I = null;
            }
            r1 r1Var = this.a[i3];
            b bVar2 = r1Var.a;
            zb.p(bVar2.n == 0);
            bVar2.q();
            r1Var.e = false;
            b bVar3 = r1Var.c;
            if (bVar3 != null) {
                zb.p(bVar3.n == 0);
                bVar3.q();
                r1Var.f = false;
            }
        }
    }

    public final void N(int i3, int i10, w2.i1 i1Var) {
        this.Z.f(1);
        i1 i1Var2 = this.J;
        i1Var2.getClass();
        zb.f(i3 >= 0 && i3 <= i10 && i10 <= i1Var2.b.size());
        i1Var2.j = i1Var;
        i1Var2.g(i3, i10);
        w(i1Var2.b(), false);
    }

    /* JADX WARN: Removed duplicated region for block: B:62:0x0164  */
    /* JADX WARN: Removed duplicated region for block: B:65:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void O() {
        int i3;
        int i10;
        float f10 = this.E.g().a;
        z0 z0Var = this.I;
        x0 x0Var = z0Var.i;
        x0 x0Var2 = z0Var.j;
        z2.t tVar = null;
        x0 x0Var3 = x0Var;
        boolean z10 = true;
        while (x0Var3 != null && x0Var3.e) {
            j1 j1Var = this.Y;
            z2.t j10 = x0Var3.j(f10, j1Var.a, j1Var.l);
            z2.t tVar2 = x0Var3 == this.I.i ? j10 : tVar;
            z2.t tVar3 = x0Var3.o;
            z2.p[] pVarArr = j10.c;
            if (tVar3 != null && tVar3.c.length == pVarArr.length) {
                for (int i11 = 0; i11 < pVarArr.length; i11++) {
                    if (j10.a(tVar3, i11)) {
                    }
                }
                if (x0Var3 == x0Var2) {
                    z10 = false;
                }
                x0Var3 = x0Var3.m;
                tVar = tVar2;
            }
            if (z10) {
                z0 z0Var2 = this.I;
                x0 x0Var4 = z0Var2.i;
                boolean z11 = (z0Var2.n(x0Var4) & 1) != 0;
                boolean[] zArr = new boolean[this.a.length];
                tVar2.getClass();
                long a10 = x0Var4.a(tVar2, this.Y.s, z11, zArr);
                j1 j1Var2 = this.Y;
                boolean z12 = (j1Var2.e == 4 || a10 == j1Var2.s) ? false : true;
                j1 j1Var3 = this.Y;
                i3 = 4;
                this.Y = z(j1Var3.b, a10, j1Var3.c, j1Var3.d, z12, 5);
                if (z12) {
                    R(a10, true);
                }
                h();
                boolean[] zArr2 = new boolean[this.a.length];
                int i12 = 0;
                while (true) {
                    r1[] r1VarArr = this.a;
                    if (i12 >= r1VarArr.length) {
                        break;
                    }
                    int c2 = r1VarArr[i12].c();
                    zArr2[i12] = this.a[i12].g();
                    r1 r1Var = this.a[i12];
                    w2.d1 d1Var = x0Var4.c[i12];
                    i iVar = this.E;
                    long j11 = this.n0;
                    boolean z13 = zArr[i12];
                    b bVar = r1Var.a;
                    if (r1.h(bVar)) {
                        if (d1Var != bVar.r) {
                            r1Var.a(bVar, iVar);
                        } else if (z13) {
                            bVar.z(j11, false, true);
                        }
                    }
                    b bVar2 = r1Var.c;
                    if (bVar2 != null && r1.h(bVar2)) {
                        if (d1Var != bVar2.r) {
                            r1Var.a(bVar2, iVar);
                        } else if (z13) {
                            bVar2.z(j11, false, true);
                        }
                    }
                    if (c2 - this.a[i12].c() > 0) {
                        H(i12, false);
                    }
                    this.l0 -= c2 - this.a[i12].c();
                    i12++;
                }
                m(this.n0, zArr2);
                x0Var4.h = true;
            } else {
                i3 = 4;
                this.I.n(x0Var3);
                if (x0Var3.e) {
                    long max = Math.max(x0Var3.g.b, this.n0 - x0Var3.p);
                    if (this.P && e() && this.I.k == x0Var3) {
                        h();
                    }
                    i10 = 4;
                    x0Var3.a(j10, max, false, new boolean[x0Var3.j.length]);
                    v(true);
                    if (this.Y.e == i10) {
                        D();
                        C0();
                        this.n.f(2);
                        return;
                    }
                    return;
                }
            }
            i10 = i3;
            v(true);
            if (this.Y.e == i10) {
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0135  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x013c  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0146  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0150  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x017e  */
    /* JADX WARN: Removed duplicated region for block: B:91:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0157  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x014b  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0141  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0137  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x00c8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void P(boolean z10, boolean z11, boolean z12, boolean z13) {
        long j10;
        long j11;
        long j12;
        boolean z14;
        d2.n1 n1Var;
        d2.n1 n1Var2;
        w2.g0 g0Var;
        List list;
        this.n.e(2);
        this.V = false;
        if (this.W != null) {
            this.Z.f(1);
            this.W = null;
        }
        this.r0 = null;
        E0(false, true);
        i iVar = this.E;
        iVar.f = false;
        u1 u1Var = iVar.a;
        if (u1Var.c) {
            u1Var.d(u1Var.a());
            u1Var.c = false;
        }
        this.n0 = 1000000000000L;
        for (int i3 = 0; i3 < this.a.length; i3++) {
            try {
                i(i3);
            } catch (RuntimeException e10) {
                e = e10;
                g2.a.d("ExoPlayerImplInternal", "Disable failed.", e);
                if (z10) {
                }
                this.l0 = 0;
                j1 j1Var = this.Y;
                w2.g0 g0Var2 = j1Var.b;
                long j13 = j1Var.s;
                if (!this.Y.b.b()) {
                }
                j10 = this.Y.c;
                if (z11) {
                }
                this.I.b();
                this.f0 = false;
                n1Var = this.Y.a;
                if (z12) {
                }
                n1Var2 = n1Var;
                g0Var = g0Var2;
                j1 j1Var2 = this.Y;
                int i10 = j1Var2.e;
                if (z13) {
                }
                w2.r1 r1Var = z14 ? w2.r1.d : j1Var2.h;
                z2.t tVar = z14 ? this.e : j1Var2.i;
                if (z14) {
                }
                this.Y = new j1(n1Var2, g0Var, j12, j11, i10, r14, false, r1Var, tVar, list, g0Var, j1Var2.l, j1Var2.m, j1Var2.n, j1Var2.o, j11, 0L, j11, 0L, false);
                if (z12) {
                }
            } catch (l e11) {
                e = e11;
                g2.a.d("ExoPlayerImplInternal", "Disable failed.", e);
                if (z10) {
                }
                this.l0 = 0;
                j1 j1Var3 = this.Y;
                w2.g0 g0Var22 = j1Var3.b;
                long j132 = j1Var3.s;
                if (!this.Y.b.b()) {
                }
                j10 = this.Y.c;
                if (z11) {
                }
                this.I.b();
                this.f0 = false;
                n1Var = this.Y.a;
                if (z12) {
                }
                n1Var2 = n1Var;
                g0Var = g0Var22;
                j1 j1Var22 = this.Y;
                int i102 = j1Var22.e;
                if (z13) {
                }
                w2.r1 r1Var2 = z14 ? w2.r1.d : j1Var22.h;
                z2.t tVar2 = z14 ? this.e : j1Var22.i;
                if (z14) {
                }
                this.Y = new j1(n1Var2, g0Var, j12, j11, i102, r14, false, r1Var2, tVar2, list, g0Var, j1Var22.l, j1Var22.m, j1Var22.n, j1Var22.o, j11, 0L, j11, 0L, false);
                if (z12) {
                }
            }
        }
        this.u0 = -9223372036854775807L;
        if (z10) {
            for (r1 r1Var3 : this.a) {
                try {
                    r1Var3.k();
                } catch (RuntimeException e12) {
                    g2.a.d("ExoPlayerImplInternal", "Reset failed.", e12);
                }
            }
        }
        this.l0 = 0;
        j1 j1Var32 = this.Y;
        w2.g0 g0Var222 = j1Var32.b;
        long j1322 = j1Var32.s;
        if (!this.Y.b.b()) {
            j1 j1Var4 = this.Y;
            d2.k1 k1Var = this.x;
            w2.g0 g0Var3 = j1Var4.b;
            d2.n1 n1Var3 = j1Var4.a;
            if (!n1Var3.p() && !n1Var3.g(g0Var3.a, k1Var).f) {
                j10 = this.Y.s;
                if (z11) {
                    j11 = j1322;
                    j12 = j10;
                    z14 = false;
                } else {
                    this.m0 = null;
                    Pair p10 = p(this.Y.a);
                    g0Var222 = (w2.g0) p10.first;
                    long longValue = ((Long) p10.second).longValue();
                    z14 = g0Var222.equals(this.Y.b) ? false : true;
                    j11 = longValue;
                    j12 = -9223372036854775807L;
                }
                this.I.b();
                this.f0 = false;
                n1Var = this.Y.a;
                if (z12 || !(n1Var instanceof o1)) {
                    n1Var2 = n1Var;
                } else {
                    o1 o1Var = (o1) n1Var;
                    w2.i1 i1Var = this.J.j;
                    d2.n1[] n1VarArr = o1Var.l;
                    d2.n1[] n1VarArr2 = new d2.n1[n1VarArr.length];
                    for (int i11 = 0; i11 < n1VarArr.length; i11++) {
                        n1VarArr2[i11] = new n1(n1VarArr[i11]);
                    }
                    n1Var2 = new o1(n1VarArr2, o1Var.m, i1Var);
                    if (g0Var222.b != -1) {
                        n1Var2.g(g0Var222.a, this.x);
                        int i12 = this.x.c;
                        d2.m1 m1Var = this.w;
                        n1Var2.m(i12, m1Var, 0L);
                        if (m1Var.a()) {
                            g0Var = new w2.g0(g0Var222.a, g0Var222.d);
                            j1 j1Var222 = this.Y;
                            int i1022 = j1Var222.e;
                            l lVar = z13 ? null : j1Var222.f;
                            w2.r1 r1Var22 = z14 ? w2.r1.d : j1Var222.h;
                            z2.t tVar22 = z14 ? this.e : j1Var222.i;
                            if (z14) {
                                g9.g0 g0Var4 = g9.i0.b;
                                list = g9.s1.e;
                            } else {
                                list = j1Var222.j;
                            }
                            this.Y = new j1(n1Var2, g0Var, j12, j11, i1022, lVar, false, r1Var22, tVar22, list, g0Var, j1Var222.l, j1Var222.m, j1Var222.n, j1Var222.o, j11, 0L, j11, 0L, false);
                            if (z12) {
                                z0 z0Var = this.I;
                                if (!z0Var.q.isEmpty()) {
                                    ArrayList arrayList = new ArrayList();
                                    for (int i13 = 0; i13 < z0Var.q.size(); i13++) {
                                        ((x0) z0Var.q.get(i13)).i();
                                    }
                                    z0Var.q = arrayList;
                                    z0Var.m = null;
                                    z0Var.k();
                                }
                                i1 i1Var2 = this.J;
                                HashMap hashMap = i1Var2.f;
                                for (g1 g1Var : hashMap.values()) {
                                    try {
                                        g1Var.a.p(g1Var.b);
                                    } catch (RuntimeException e13) {
                                        g2.a.d("MediaSourceList", "Failed to release child source.", e13);
                                    }
                                    w2.a aVar = g1Var.a;
                                    f1 f1Var = g1Var.c;
                                    aVar.s(f1Var);
                                    g1Var.a.r(f1Var);
                                }
                                hashMap.clear();
                                i1Var2.g.clear();
                                i1Var2.k = false;
                                return;
                            }
                            return;
                        }
                    }
                }
                g0Var = g0Var222;
                j1 j1Var2222 = this.Y;
                int i10222 = j1Var2222.e;
                if (z13) {
                }
                w2.r1 r1Var222 = z14 ? w2.r1.d : j1Var2222.h;
                z2.t tVar222 = z14 ? this.e : j1Var2222.i;
                if (z14) {
                }
                this.Y = new j1(n1Var2, g0Var, j12, j11, i10222, lVar, false, r1Var222, tVar222, list, g0Var, j1Var2222.l, j1Var2222.m, j1Var2222.n, j1Var2222.o, j11, 0L, j11, 0L, false);
                if (z12) {
                }
            }
        }
        j10 = this.Y.c;
        if (z11) {
        }
        this.I.b();
        this.f0 = false;
        n1Var = this.Y.a;
        if (z12) {
        }
        n1Var2 = n1Var;
        g0Var = g0Var222;
        j1 j1Var22222 = this.Y;
        int i102222 = j1Var22222.e;
        if (z13) {
        }
        w2.r1 r1Var2222 = z14 ? w2.r1.d : j1Var22222.h;
        z2.t tVar2222 = z14 ? this.e : j1Var22222.i;
        if (z14) {
        }
        this.Y = new j1(n1Var2, g0Var, j12, j11, i102222, lVar, false, r1Var2222, tVar2222, list, g0Var, j1Var22222.l, j1Var22222.m, j1Var22222.n, j1Var22222.o, j11, 0L, j11, 0L, false);
        if (z12) {
        }
    }

    public final void Q() {
        x0 x0Var = this.I.i;
        this.c0 = x0Var != null && x0Var.g.j && this.b0;
    }

    public final void R(long j10, boolean z10) {
        x0 x0Var = this.I.i;
        long j11 = j10 + (x0Var == null ? 1000000000000L : x0Var.p);
        this.n0 = j11;
        this.E.a.d(j11);
        for (r1 r1Var : this.a) {
            long j12 = this.n0;
            b d = r1Var.d(x0Var);
            if (d != null) {
                d.z(j12, false, z10);
            }
        }
        for (x0 x0Var2 = r0.i; x0Var2 != null; x0Var2 = x0Var2.m) {
            for (z2.p pVar : x0Var2.o.c) {
                if (pVar != null) {
                    pVar.s();
                }
            }
        }
    }

    public final void S(d2.n1 n1Var, d2.n1 n1Var2) {
        if (n1Var.p() && n1Var2.p()) {
            return;
        }
        ArrayList arrayList = this.F;
        int size = arrayList.size() - 1;
        if (size < 0) {
            Collections.sort(arrayList);
        } else {
            a1.g.z(arrayList.get(size));
            throw null;
        }
    }

    public final void V(long j10) {
        boolean z10 = this.U;
        long j11 = x0;
        if (z10) {
            this.T.getClass();
            r2 = this.Y.e != 3 ? j11 : 1000L;
            for (r1 r1Var : this.a) {
                long j12 = this.n0;
                long j13 = this.o0;
                b bVar = r1Var.c;
                b bVar2 = r1Var.a;
                long h = r1.h(bVar2) ? bVar2.h(j12, j13) : Long.MAX_VALUE;
                if (bVar != null && bVar.n != 0) {
                    h = Math.min(h, bVar.h(j12, j13));
                }
                r2 = Math.min(r2, g2.n0.h0(h));
            }
            if (this.Y.m()) {
                x0 x0Var = this.I.i;
                if ((x0Var != null ? x0Var.m : null) != null) {
                    if ((g2.n0.S(r2) * this.Y.o.a) + this.n0 >= r1.e()) {
                        r2 = Math.min(r2, j11);
                    }
                }
            }
        } else if (this.Y.e != 3 || s0()) {
            r2 = j11;
        }
        this.n.a.sendEmptyMessageAtTime(2, j10 + r2);
    }

    public final void W(boolean z10) {
        w2.g0 g0Var = this.I.i.g.a;
        long Y = Y(g0Var, this.Y.s, true, false);
        if (Y != this.Y.s) {
            j1 j1Var = this.Y;
            this.Y = z(g0Var, Y, j1Var.c, j1Var.d, z10, 5);
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(5:27|(20:(9:72|73|(1:96)(3:79|(1:83)|84)|85|(1:95)|92|93|19|20)(1:29)|34|35|(1:37)(1:65)|38|39|(1:41)|42|43|44|45|46|47|48|49|50|51|18|19|20)|30|31|(1:33)(1:69)) */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x0192, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Type inference failed for: r0v18, types: [java.lang.Object, w2.e0] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void X(q0 q0Var) {
        long longValue;
        long j10;
        w2.g0 p10;
        long j11;
        boolean z10;
        boolean z11;
        w2.g0 g0Var;
        long j12;
        boolean z12;
        long j13;
        long j14;
        j1 j1Var;
        int i3;
        long j15;
        int i10;
        long j16;
        w2.g0 g0Var2;
        long j17;
        boolean z13;
        long j18;
        boolean z14;
        long Y;
        j1 j1Var2;
        w2.g0 g0Var3;
        d2.n1 n1Var;
        long j19;
        r0 r0Var = this;
        if (r0Var.V) {
            if (r0Var.W != null) {
                r0Var.X++;
                r0Var.Z.f(1);
            }
            r0Var.W = q0Var;
            return;
        }
        r0Var.Z.f(1);
        Pair T = T(r0Var.Y.a, q0Var, true, r0Var.g0, r0Var.h0, r0Var.w, r0Var.x);
        if (T == null) {
            Pair p11 = r0Var.p(r0Var.Y.a);
            p10 = (w2.g0) p11.first;
            longValue = ((Long) p11.second).longValue();
            z10 = !r0Var.Y.a.p();
            j11 = 0;
            j10 = -9223372036854775807L;
        } else {
            Object obj = T.first;
            longValue = ((Long) T.second).longValue();
            j10 = q0Var.c == -9223372036854775807L ? -9223372036854775807L : longValue;
            p10 = r0Var.I.p(r0Var.Y.a, obj, longValue);
            if (p10.b()) {
                r0Var.Y.a.g(p10.a, r0Var.x);
                if (r0Var.x.e(p10.b) == p10.c) {
                    r0Var.x.g.getClass();
                }
                r0Var.x.g.a(p10.b).getClass();
                j10 = Math.max(j10, 0L);
                longValue = 0;
                j11 = 0;
            } else {
                j11 = 0;
                if (q0Var.c != -9223372036854775807L) {
                    z10 = false;
                }
            }
            z10 = true;
        }
        try {
            try {
                if (r0Var.Y.a.p()) {
                    r0Var.m0 = q0Var;
                } else if (T == null) {
                    if (r0Var.Y.e != 1) {
                        r0Var.o0(4);
                    }
                    r0Var.P(false, true, false, true);
                } else {
                    try {
                        try {
                            try {
                                try {
                                    if (p10.equals(r0Var.Y.b)) {
                                        try {
                                            x0 x0Var = r0Var.I.i;
                                            if (x0Var == null || !x0Var.e || longValue == j11) {
                                                j14 = longValue;
                                            } else {
                                                ?? r02 = x0Var.a;
                                                long j20 = r0Var.w.m;
                                                if (r0Var.U && j20 != -9223372036854775807L) {
                                                    r0Var.T.getClass();
                                                }
                                                j14 = r02.r(longValue, r0Var.S);
                                            }
                                            if (g2.n0.h0(j14) != g2.n0.h0(r0Var.Y.s) || ((i3 = (j1Var = r0Var.Y).e) != 2 && i3 != 3)) {
                                                z11 = z10;
                                                g0Var = p10;
                                            }
                                            j15 = j1Var.s;
                                            i10 = 2;
                                            j16 = j15;
                                            z12 = z10;
                                            g0Var2 = p10;
                                            j17 = j10;
                                            r0Var.Y = r0Var.z(g0Var2, j15, j17, j16, z12, i10);
                                        } catch (Throwable th2) {
                                            th = th2;
                                            boolean z15 = z10;
                                            g0Var = p10;
                                            z12 = z15;
                                            j13 = longValue;
                                            j12 = j10;
                                            r0Var.Y = r0Var.z(g0Var, j13, j12, j13, z12, 2);
                                            throw th;
                                        }
                                    }
                                    z11 = z10;
                                    g0Var = p10;
                                    j14 = longValue;
                                    r0Var.D0(n1Var, g0Var3, n1Var, j1Var2.b, j19, true);
                                    g0Var2 = g0Var3;
                                    j17 = j19;
                                    j15 = Y;
                                    i10 = 2;
                                    j16 = j15;
                                    r0Var = this;
                                    r0Var.Y = r0Var.z(g0Var2, j15, j17, j16, z12, i10);
                                } catch (Throwable th3) {
                                    th = th3;
                                    g0Var = g0Var3;
                                    j12 = j19;
                                    j13 = Y;
                                    r0Var.Y = r0Var.z(g0Var, j13, j12, j13, z12, 2);
                                    throw th;
                                }
                                n1Var = j1Var2.a;
                                j19 = j10;
                            } catch (Throwable th4) {
                                th = th4;
                                g0Var = g0Var3;
                                j12 = j10;
                                j13 = Y;
                                r0Var.Y = r0Var.z(g0Var, j13, j12, j13, z12, 2);
                                throw th;
                            }
                            j1Var2 = r0Var.Y;
                            g0Var3 = g0Var;
                        } catch (Throwable th5) {
                            th = th5;
                        }
                        z0 z0Var = r0Var.I;
                        if (z0Var.i != z0Var.j) {
                            j18 = j14;
                            z14 = true;
                        } else {
                            j18 = j14;
                            z14 = false;
                        }
                        Y = r0Var.Y(g0Var, j18, z14, z13);
                        z12 = (longValue != Y) | z11;
                    } catch (Throwable th6) {
                        th = th6;
                        j12 = j10;
                        z12 = z11;
                        j13 = longValue;
                        r0Var.Y = r0Var.z(g0Var, j13, j12, j13, z12, 2);
                        throw th;
                    }
                    z13 = r0Var.Y.e == 4;
                }
                z12 = z10;
                g0Var2 = p10;
                j15 = longValue;
                j17 = j10;
                i10 = 2;
                j16 = j15;
                r0Var = this;
                r0Var.Y = r0Var.z(g0Var2, j15, j17, j16, z12, i10);
            } catch (Throwable th7) {
                th = th7;
                z12 = z10;
                g0Var = p10;
            }
        } catch (Throwable th8) {
            th = th8;
            z11 = z10;
            g0Var = p10;
        }
    }

    /* JADX WARN: Type inference failed for: r10v15, types: [java.lang.Object, w2.e0] */
    /* JADX WARN: Type inference failed for: r10v16, types: [java.lang.Object, w2.e0] */
    /* JADX WARN: Type inference failed for: r10v25, types: [java.lang.Object, w2.e0] */
    /* JADX WARN: Type inference failed for: r10v26, types: [java.lang.Object, w2.e0] */
    public final long Y(w2.g0 g0Var, long j10, boolean z10, boolean z11) {
        z0 z0Var;
        int i3;
        w0();
        boolean z12 = true;
        E0(false, true);
        if (z11 || this.Y.e == 3) {
            o0(2);
        }
        x0 x0Var = this.I.i;
        x0 x0Var2 = x0Var;
        while (x0Var2 != null && !g0Var.equals(x0Var2.g.a)) {
            x0Var2 = x0Var2.m;
        }
        if (z10 || x0Var != x0Var2 || (x0Var2 != null && x0Var2.p + j10 < 0)) {
            for (int i10 = 0; i10 < this.a.length; i10++) {
                i(i10);
            }
            this.u0 = -9223372036854775807L;
            if (x0Var2 != null) {
                while (true) {
                    z0Var = this.I;
                    if (z0Var.i == x0Var2) {
                        break;
                    }
                    z0Var.a();
                }
                z0Var.n(x0Var2);
                x0Var2.p = 1000000000000L;
                m(this.I.j.e(), new boolean[this.a.length]);
                x0Var2.h = true;
            }
        }
        h();
        if (this.U) {
            for (r1 r1Var : this.a) {
                if (r1Var.g() && ((i3 = r1Var.a.b) == 2 || i3 == 4)) {
                    this.V = true;
                    break;
                }
            }
        }
        if (x0Var2 != null) {
            this.I.n(x0Var2);
            if (!x0Var2.e) {
                x0Var2.g = x0Var2.g.b(j10, -9223372036854775807L);
            } else if (x0Var2.f) {
                if (this.U) {
                    this.T.getClass();
                    if (!this.Y.a.p() && x0Var2.g.a.equals(this.Y.b)) {
                        long j11 = x0Var2.p + j10;
                        boolean z13 = true;
                        for (r1 r1Var2 : this.a) {
                            if (r1Var2.g()) {
                                b d = r1Var2.d(x0Var2);
                                z13 &= d != null && d.E(j11);
                            }
                        }
                        if (z13) {
                            ?? r10 = x0Var2.a;
                            long j12 = this.Y.s;
                            t1 t1Var = t1.e;
                            if (r10.r(j12, t1Var) == x0Var2.a.r(j10, t1Var)) {
                                z12 = false;
                            }
                        }
                    }
                }
                j10 = x0Var2.a.j(j10);
                x0Var2.a.l(j10 - this.y);
            }
            R(j10, z12);
            D();
        } else {
            this.I.b();
            R(j10, true);
        }
        v(false);
        this.n.f(2);
        return j10;
    }

    public final void Z(m1 m1Var) {
        m1Var.getClass();
        Looper looper = m1Var.e;
        Looper looper2 = this.s;
        g2.j0 j0Var = this.n;
        if (looper != looper2) {
            j0Var.b(15, m1Var).b();
            return;
        }
        g(m1Var);
        int i3 = this.Y.e;
        if (i3 == 3 || i3 == 2) {
            j0Var.f(2);
        }
    }

    @Override // c3.w
    public final void a(long j10, long j11, d2.v vVar, MediaFormat mediaFormat) {
        if (this.V) {
            this.n.a(37).b();
        }
    }

    public final void a0(m1 m1Var) {
        Looper looper = m1Var.e;
        if (looper.getThread().isAlive()) {
            this.G.a(looper, null).d(new f6(this, m1Var));
        } else {
            g2.a.l("TAG", "Trying to send message on a dead thread.");
            m1Var.a(false);
        }
    }

    @Override // w2.d0
    public final void b(w2.e0 e0Var) {
        this.n.b(8, e0Var).b();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x003b, code lost:
    
        if (r7.a == 1) goto L20;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void b0(d2.f fVar, boolean z10) {
        int i3;
        z2.n nVar = (z2.n) this.d;
        if (!nVar.j.equals(fVar)) {
            nVar.j = fVar;
            nVar.k();
        }
        if (!z10) {
            fVar = null;
        }
        e2.d dVar = this.Q;
        if (!Objects.equals(dVar.d, fVar)) {
            dVar.d = fVar;
            if (fVar != null) {
                int i10 = fVar.c;
                i3 = 3;
                switch (i10) {
                    case 0:
                        g2.a.l("AudioFocusManager", "Specify a proper usage in the audio attributes for audio focus handling. Using AUDIOFOCUS_GAIN by default.");
                        i3 = 1;
                        break;
                    case 1:
                    case 14:
                        i3 = 1;
                        break;
                    case 2:
                    case 4:
                        i3 = 2;
                        break;
                    case 3:
                        break;
                    case 5:
                    case 6:
                    case 7:
                    case 8:
                    case 9:
                    case 10:
                    case 12:
                    case 13:
                        break;
                    case 11:
                        break;
                    case 15:
                    default:
                        com.google.android.recaptcha.internal.a.o(i10, "Unidentified audio usage: ", "AudioFocusManager");
                        break;
                    case 16:
                        i3 = 4;
                        break;
                }
                dVar.f = i3;
                zb.e("Automatic handling of audio focus is only available for USAGE_MEDIA and USAGE_GAME.", i3 != 1 || i3 == 0);
            }
            i3 = 0;
            dVar.f = i3;
            zb.e("Automatic handling of audio focus is only available for USAGE_MEDIA and USAGE_GAME.", i3 != 1 || i3 == 0);
        }
        j1 j1Var = this.Y;
        boolean z11 = j1Var.l;
        B0(dVar.d(j1Var.e, z11), j1Var.n, j1Var.m, z11);
    }

    public final void c(m0 m0Var, int i3) {
        this.Z.f(1);
        i1 i1Var = this.J;
        if (i3 == -1) {
            i3 = i1Var.b.size();
        }
        w(i1Var.a(i3, m0Var.a, m0Var.b), false);
    }

    public final void c0(boolean z10, g2.j jVar) {
        if (this.i0 != z10) {
            this.i0 = z10;
            if (!z10) {
                for (r1 r1Var : this.a) {
                    r1Var.k();
                }
            }
        }
        if (jVar != null) {
            jVar.e();
        }
    }

    public final void d() {
        for (r1 r1Var : this.a) {
            s1 s1Var = this.U ? this.T : null;
            r1Var.a.d(18, s1Var);
            b bVar = r1Var.c;
            if (bVar != null) {
                bVar.d(18, s1Var);
            }
        }
    }

    public final void d0(k0 k0Var) {
        for (r1 r1Var : this.a) {
            b bVar = r1Var.a;
            if (bVar.b == 4) {
                bVar.d(23, k0Var);
                b bVar2 = r1Var.c;
                if (bVar2 != null) {
                    bVar2.d(23, k0Var);
                }
            }
        }
    }

    public final boolean e() {
        if (!this.P) {
            return false;
        }
        for (r1 r1Var : this.a) {
            if (r1Var.f()) {
                return true;
            }
        }
        return false;
    }

    public final void e0(m0 m0Var) {
        this.Z.f(1);
        int i3 = m0Var.c;
        w2.i1 i1Var = m0Var.b;
        ArrayList arrayList = m0Var.a;
        if (i3 != -1) {
            this.m0 = new q0(new o1(arrayList, i1Var), m0Var.c, m0Var.d);
        }
        i1 i1Var2 = this.J;
        ArrayList arrayList2 = i1Var2.b;
        i1Var2.g(0, arrayList2.size());
        w(i1Var2.a(arrayList2.size(), arrayList, i1Var), false);
    }

    public final void f() {
        O();
        W(true);
    }

    public final void f0(boolean z10) {
        this.b0 = z10;
        Q();
        if (this.c0) {
            z0 z0Var = this.I;
            if (z0Var.j != z0Var.i) {
                W(true);
                v(false);
            }
        }
    }

    public final void g0(d2.y0 y0Var) {
        this.n.e(16);
        i iVar = this.E;
        iVar.c(y0Var);
        d2.y0 g7 = iVar.g();
        y(g7, g7.a, true, true);
    }

    public final void h() {
        b bVar;
        if (this.P && e()) {
            for (r1 r1Var : this.a) {
                int c2 = r1Var.c();
                i iVar = this.E;
                if (r1Var.f()) {
                    int i3 = r1Var.d;
                    boolean z10 = i3 == 4 || i3 == 2;
                    int i10 = i3 != 4 ? 0 : 1;
                    if (z10) {
                        try {
                            bVar = r1Var.a;
                        } catch (RuntimeException e10) {
                            g2.a.d("RendererHolder", "Disable prewarming failed.", e10);
                        }
                    } else {
                        bVar = r1Var.c;
                        bVar.getClass();
                    }
                    r1Var.a(bVar, iVar);
                    try {
                        r1Var.i(z10);
                    } catch (RuntimeException e11) {
                        g2.a.d("RendererHolder", "Reset prewarming failed.", e11);
                    }
                    r1Var.d = i10;
                }
                this.l0 -= c2 - r1Var.c();
            }
            this.u0 = -9223372036854775807L;
        }
    }

    public final void h0(o oVar) {
        this.t0 = oVar;
        d2.n1 n1Var = this.Y.a;
        z0 z0Var = this.I;
        z0Var.getClass();
        oVar.getClass();
        if (z0Var.q.isEmpty()) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (int i3 = 0; i3 < z0Var.q.size(); i3++) {
            ((x0) z0Var.q.get(i3)).i();
        }
        z0Var.q = arrayList;
        z0Var.m = null;
        z0Var.k();
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        int i3;
        x0 x0Var;
        w2.g0 g0Var;
        x0 x0Var2;
        int i10;
        try {
            switch (message.what) {
                case 1:
                    boolean z10 = message.arg1 != 0;
                    int i11 = message.arg2;
                    this.Z.f(1);
                    B0(this.Q.d(this.Y.e, z10), i11 >> 4, i11 & 15, z10);
                    break;
                case 2:
                    j();
                    break;
                case 3:
                    X((q0) message.obj);
                    break;
                case 4:
                    g0((d2.y0) message.obj);
                    break;
                case 5:
                    l0((t1) message.obj);
                    break;
                case 6:
                    v0(false, true);
                    break;
                case 7:
                    L((g2.j) message.obj);
                    return true;
                case 8:
                    x((w2.e0) message.obj);
                    break;
                case 9:
                    t((w2.e0) message.obj);
                    break;
                case 10:
                    O();
                    break;
                case 11:
                    i0(message.arg1);
                    break;
                case 12:
                    m0(message.arg1 != 0);
                    break;
                case 13:
                    c0(message.arg1 != 0, (g2.j) message.obj);
                    break;
                case 14:
                    Z((m1) message.obj);
                    break;
                case 15:
                    a0((m1) message.obj);
                    break;
                case 16:
                    d2.y0 y0Var = (d2.y0) message.obj;
                    y(y0Var, y0Var.a, true, false);
                    break;
                case 17:
                    e0((m0) message.obj);
                    break;
                case 18:
                    c((m0) message.obj, message.arg1);
                    break;
                case 19:
                    J((n0) message.obj);
                    break;
                case 20:
                    N(message.arg1, message.arg2, (w2.i1) message.obj);
                    break;
                case 21:
                    n0((w2.i1) message.obj);
                    break;
                case 22:
                    I();
                    break;
                case 23:
                    f0(message.arg1 != 0);
                    break;
                case 24:
                default:
                    return false;
                case 25:
                    f();
                    break;
                case 26:
                    O();
                    W(true);
                    break;
                case 27:
                    z0((List) message.obj, message.arg1, message.arg2);
                    break;
                case 28:
                    h0((o) message.obj);
                    break;
                case 29:
                    K();
                    break;
                case hs.T /* 30 */:
                    Pair pair = (Pair) message.obj;
                    q0(pair.first, (g2.j) pair.second);
                    break;
                case hs.U /* 31 */:
                    b0((d2.f) message.obj, message.arg1 != 0);
                    break;
                case 32:
                    r0(((Float) message.obj).floatValue());
                    break;
                case 33:
                    r(message.arg1);
                    break;
                case 34:
                    s();
                    break;
                case 35:
                    p0((c3.w) message.obj);
                    break;
                case 36:
                    j0(((Boolean) message.obj).booleanValue());
                    break;
                case 37:
                    this.V = false;
                    q0 q0Var = this.W;
                    if (q0Var != null) {
                        X(q0Var);
                        this.W = null;
                        break;
                    }
                    break;
                case 38:
                    k0((s1) message.obj);
                    break;
                case 39:
                    d0((k0) message.obj);
                    break;
            }
        } catch (d2.v0 e10) {
            boolean z11 = e10.a;
            int i12 = e10.b;
            if (i12 == 1) {
                i10 = z11 ? 3001 : 3003;
            } else {
                if (i12 == 4) {
                    i10 = z11 ? 3002 : 3004;
                }
                u(e10, r3);
            }
            r3 = i10;
            u(e10, r3);
        } catch (i2.k e11) {
            u(e11, e11.a);
        } catch (IOException e12) {
            u(e12, 2000);
        } catch (RuntimeException e13) {
            l lVar = new l(2, e13, ((e13 instanceof IllegalStateException) || (e13 instanceof IllegalArgumentException)) ? 1004 : 1000);
            g2.a.d("ExoPlayerImplInternal", "Playback error", lVar);
            v0(true, false);
            this.Y = this.Y.f(lVar);
        } catch (l e14) {
            e = e14;
            int i13 = e.s;
            z0 z0Var = this.I;
            if (i13 == 1 && (x0Var2 = z0Var.j) != null && e.F == null) {
                e = e.a(x0Var2.g.a);
            }
            int i14 = e.s;
            g2.j0 j0Var = this.n;
            if (i14 == 1 && (g0Var = e.F) != null && B(e.x, g0Var)) {
                this.v0 = true;
                h();
                x0 g7 = z0Var.g();
                x0 x0Var3 = z0Var.i;
                if (x0Var3 != g7) {
                    while (x0Var3 != null) {
                        x0 x0Var4 = x0Var3.m;
                        if (x0Var4 == g7) {
                            break;
                        }
                        x0Var3 = x0Var4;
                    }
                }
                z0Var.n(x0Var3);
                if (this.Y.e != 4) {
                    D();
                    j0Var.f(2);
                }
            } else {
                l lVar2 = this.r0;
                if (lVar2 != null) {
                    lVar2.addSuppressed(e);
                    e = this.r0;
                }
                if (e.s == 1 && z0Var.i != z0Var.j) {
                    while (true) {
                        x0Var = z0Var.i;
                        if (x0Var == z0Var.j) {
                            break;
                        }
                        z0Var.a();
                    }
                    zb.l(x0Var);
                    F();
                    y0 y0Var2 = x0Var.g;
                    w2.g0 g0Var2 = y0Var2.a;
                    long j10 = y0Var2.b;
                    this.Y = z(g0Var2, j10, y0Var2.d, j10, true, 0);
                }
                if (e.G && (this.r0 == null || (i3 = e.a) == 5004 || i3 == 5003)) {
                    g2.a.m("ExoPlayerImplInternal", "Recoverable renderer error", e);
                    if (this.r0 == null) {
                        this.r0 = e;
                    }
                    g2.i0 b10 = j0Var.b(25, e);
                    Handler handler = j0Var.a;
                    Message message2 = b10.a;
                    message2.getClass();
                    handler.sendMessageAtFrontOfQueue(message2);
                    b10.a();
                } else {
                    g2.a.d("ExoPlayerImplInternal", "Playback error", e);
                    v0(true, false);
                    this.Y = this.Y.f(e);
                }
            }
        } catch (p2.f e15) {
            u(e15, e15.a);
        } catch (w2.b e16) {
            u(e16, 1002);
        }
        F();
        return true;
    }

    public final void i(int i3) {
        r1[] r1VarArr = this.a;
        int c2 = r1VarArr[i3].c();
        r1 r1Var = r1VarArr[i3];
        b bVar = r1Var.a;
        i iVar = this.E;
        r1Var.a(bVar, iVar);
        b bVar2 = r1Var.c;
        if (bVar2 != null) {
            boolean z10 = (bVar2.n == 0 || r1Var.d == 3) ? false : true;
            r1Var.a(bVar2, iVar);
            r1Var.i(false);
            if (z10) {
                b bVar3 = r1Var.a;
                bVar2.getClass();
                bVar2.d(17, bVar3);
            }
        }
        r1Var.d = 0;
        H(i3, false);
        this.l0 -= c2;
    }

    public final void i0(int i3) {
        this.g0 = i3;
        d2.n1 n1Var = this.Y.a;
        z0 z0Var = this.I;
        z0Var.g = i3;
        int r5 = z0Var.r(n1Var);
        if ((r5 & 1) != 0) {
            W(true);
        } else if ((r5 & 2) != 0) {
            h();
        }
        v(false);
    }

    /* JADX WARN: Code restructure failed: missing block: B:232:0x023c, code lost:
    
        if (r6 >= r4.c) goto L94;
     */
    /* JADX WARN: Removed duplicated region for block: B:108:0x030f  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0346  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0354  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0362  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x036d  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x0317  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x0246  */
    /* JADX WARN: Removed duplicated region for block: B:214:0x01f0  */
    /* JADX WARN: Removed duplicated region for block: B:218:0x0203  */
    /* JADX WARN: Removed duplicated region for block: B:224:0x0215  */
    /* JADX WARN: Removed duplicated region for block: B:226:0x021b  */
    /* JADX WARN: Removed duplicated region for block: B:238:0x0218  */
    /* JADX WARN: Removed duplicated region for block: B:240:0x01f8  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00d9 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:85:0x02d2  */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Object, w2.e0] */
    /* JADX WARN: Type inference failed for: r7v19, types: [java.lang.Object, w2.e0] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void j() {
        boolean z10;
        boolean z11;
        long j10;
        boolean z12;
        boolean z13;
        long j11;
        boolean z14;
        int i3;
        boolean z15;
        j1 j1Var;
        int i10;
        boolean z16;
        this.G.getClass();
        long uptimeMillis = SystemClock.uptimeMillis();
        this.n.e(2);
        if (!this.R) {
            A0();
        }
        int i11 = this.Y.e;
        if (i11 == 1 || i11 == 4) {
            return;
        }
        if (this.R) {
            A0();
        }
        x0 x0Var = this.I.i;
        if (x0Var == null) {
            V(uptimeMillis);
            return;
        }
        Trace.beginSection("doSomeWork");
        C0();
        if (x0Var.e) {
            this.G.getClass();
            this.o0 = g2.n0.S(SystemClock.elapsedRealtime());
            x0Var.a.l(this.Y.s - this.y);
            z10 = true;
            z11 = true;
            int i12 = 0;
            while (true) {
                r1[] r1VarArr = this.a;
                if (i12 >= r1VarArr.length) {
                    break;
                }
                r1 r1Var = r1VarArr[i12];
                if (r1Var.c() == 0) {
                    H(i12, false);
                } else {
                    long j12 = this.n0;
                    long j13 = this.o0;
                    b bVar = r1Var.c;
                    b bVar2 = r1Var.a;
                    if (r1.h(bVar2)) {
                        bVar2.x(j12, j13);
                    }
                    if (bVar != null && bVar.n != 0) {
                        bVar.x(j12, j13);
                    }
                    if (z10) {
                        b bVar3 = r1Var.c;
                        b bVar4 = r1Var.a;
                        boolean l10 = r1.h(bVar4) ? bVar4.l() : true;
                        if (bVar3 != null && bVar3.n != 0) {
                            l10 &= bVar3.l();
                        }
                        if (l10) {
                            z10 = true;
                            b d = r1Var.d(x0Var);
                            z16 = d != null || d.k() || d.m() || d.l();
                            H(i12, z16);
                            z11 = !z11 && z16;
                            if (z16) {
                                G(i12);
                            }
                        }
                    }
                    z10 = false;
                    b d10 = r1Var.d(x0Var);
                    if (d10 != null) {
                    }
                    H(i12, z16);
                    if (z11) {
                    }
                    if (z16) {
                    }
                }
                i12++;
            }
        } else {
            x0Var.a.g();
            z10 = true;
            z11 = true;
        }
        long j14 = x0Var.g.f;
        boolean z17 = z10 && x0Var.e && (j14 == -9223372036854775807L || j14 <= this.Y.s);
        if (z17 && this.c0) {
            this.c0 = false;
            int i13 = this.Y.n;
            this.Z.f(0);
            B0(this.Q.d(this.Y.e, false), i13, 5, false);
        }
        if (!z17 || !x0Var.g.k) {
            j1 j1Var2 = this.Y;
            if (j1Var2.e == 2) {
                z0 z0Var = this.I;
                if (this.l0 == 0) {
                    z14 = C();
                } else if (z11) {
                    if (j1Var2.g) {
                        x0 x0Var2 = z0Var.i;
                        long j15 = t0(j1Var2.a, x0Var2.g.a) ? this.K.h : -9223372036854775807L;
                        x0 x0Var3 = z0Var.l;
                        boolean z18 = x0Var3.g() && x0Var3.g.k;
                        boolean z19 = x0Var3.g.a.b() && !x0Var3.e;
                        if (!z18 && !z19) {
                            long q10 = q(x0Var3.d());
                            t0 t0Var = this.f;
                            l2.k kVar = this.M;
                            j10 = -9223372036854775807L;
                            d2.n1 n1Var = this.Y.a;
                            w2.g0 g0Var = x0Var2.g.a;
                            float f10 = this.E.g().a;
                            boolean z20 = this.Y.l;
                            boolean z21 = this.d0;
                            h hVar = (h) t0Var;
                            hVar.getClass();
                            long j16 = j15;
                            d2.i0 i0Var = n1Var.m(n1Var.g(g0Var.a, hVar.b).c, hVar.a, 0L).c.b;
                            if (i0Var != null) {
                                String scheme = i0Var.a.getScheme();
                                if (TextUtils.isEmpty(scheme) || h.r.contains(scheme)) {
                                    z13 = true;
                                    long F = g2.n0.F(q10, f10);
                                    j11 = !z21 ? z13 ? hVar.k : hVar.j : z13 ? hVar.i : hVar.h;
                                    if (j16 != -9223372036854775807L) {
                                        j11 = Math.min(j16 / 2, j11);
                                    }
                                    if (j11 > 0 && F < j11) {
                                        if (!(!z13 ? hVar.m : false)) {
                                            g gVar = (g) hVar.p.get(kVar);
                                            gVar.getClass();
                                            synchronized (gVar) {
                                                i3 = gVar.d;
                                            }
                                            int i14 = i3 * hVar.c.b;
                                            g gVar2 = (g) hVar.p.get(kVar);
                                            gVar2.getClass();
                                        }
                                        z14 = false;
                                        if (z14) {
                                            o0(3);
                                            this.r0 = null;
                                            if (s0()) {
                                                E0(false, false);
                                                i iVar = this.E;
                                                z12 = true;
                                                iVar.f = true;
                                                iVar.a.e();
                                                u0();
                                                if (this.Y.e == 2) {
                                                    int i15 = 0;
                                                    while (true) {
                                                        r1[] r1VarArr2 = this.a;
                                                        if (i15 >= r1VarArr2.length) {
                                                            break;
                                                        }
                                                        if (r1VarArr2[i15].d(x0Var) != null ? z12 : false) {
                                                            G(i15);
                                                        }
                                                        i15++;
                                                    }
                                                    j1 j1Var3 = this.Y;
                                                    if (!j1Var3.g && j1Var3.r < 500000 && A(this.I.l) && s0()) {
                                                        z15 = z12;
                                                        if (z15) {
                                                            this.s0 = -9223372036854775807L;
                                                        } else if (this.s0 == -9223372036854775807L) {
                                                            this.G.getClass();
                                                            this.s0 = SystemClock.elapsedRealtime();
                                                        } else {
                                                            this.G.getClass();
                                                            if (SystemClock.elapsedRealtime() - this.s0 >= 4000) {
                                                                throw new g2.g0(0, 4000);
                                                            }
                                                        }
                                                        boolean z22 = (s0() || this.Y.e != 3) ? false : z12;
                                                        if (this.k0 || !this.j0 || !z22) {
                                                            z12 = false;
                                                        }
                                                        j1Var = this.Y;
                                                        if (j1Var.p != z12) {
                                                            this.Y = j1Var.i(z12);
                                                        }
                                                        this.j0 = false;
                                                        if (!z12 && (i10 = this.Y.e) != 4 && (z22 || i10 == 2 || (i10 == 3 && this.l0 != 0))) {
                                                            V(uptimeMillis);
                                                        }
                                                        Trace.endSection();
                                                    }
                                                }
                                                z15 = false;
                                                if (z15) {
                                                }
                                                if (s0()) {
                                                }
                                                if (this.k0) {
                                                }
                                                z12 = false;
                                                j1Var = this.Y;
                                                if (j1Var.p != z12) {
                                                }
                                                this.j0 = false;
                                                if (!z12) {
                                                    V(uptimeMillis);
                                                }
                                                Trace.endSection();
                                            }
                                        }
                                    }
                                    z14 = true;
                                    if (z14) {
                                    }
                                }
                            }
                            z13 = false;
                            long F2 = g2.n0.F(q10, f10);
                            if (!z21) {
                            }
                            if (j16 != -9223372036854775807L) {
                            }
                            if (j11 > 0) {
                                if (!(!z13 ? hVar.m : false)) {
                                }
                                z14 = false;
                                if (z14) {
                                }
                            }
                            z14 = true;
                            if (z14) {
                            }
                        }
                    }
                    j10 = -9223372036854775807L;
                    z14 = true;
                    if (z14) {
                    }
                } else {
                    z14 = false;
                }
                j10 = -9223372036854775807L;
                if (z14) {
                }
            } else {
                j10 = -9223372036854775807L;
            }
            z12 = true;
            if (this.Y.e == 3 && (this.l0 != 0 ? !z11 : !C())) {
                E0(s0(), false);
                o0(2);
                if (this.d0) {
                    for (x0 x0Var4 = this.I.i; x0Var4 != null; x0Var4 = x0Var4.m) {
                        for (z2.p pVar : x0Var4.o.c) {
                            if (pVar != null) {
                                pVar.t();
                            }
                        }
                    }
                    f fVar = this.K;
                    long j17 = fVar.h;
                    if (j17 != j10) {
                        long j18 = j17 + fVar.b;
                        fVar.h = j18;
                        long j19 = fVar.g;
                        if (j19 != j10 && j18 > j19) {
                            fVar.h = j19;
                        }
                        fVar.l = j10;
                    }
                }
                w0();
            }
            if (this.Y.e == 2) {
            }
            z15 = false;
            if (z15) {
            }
            if (s0()) {
            }
            if (this.k0) {
            }
            z12 = false;
            j1Var = this.Y;
            if (j1Var.p != z12) {
            }
            this.j0 = false;
            if (!z12) {
            }
            Trace.endSection();
        }
        o0(4);
        w0();
        z12 = true;
        if (this.Y.e == 2) {
        }
        z15 = false;
        if (z15) {
        }
        if (s0()) {
        }
        if (this.k0) {
        }
        z12 = false;
        j1Var = this.Y;
        if (j1Var.p != z12) {
        }
        this.j0 = false;
        if (!z12) {
        }
        Trace.endSection();
    }

    public final void j0(boolean z10) {
        if (!z10) {
            q0 q0Var = this.W;
            g2.j0 j0Var = this.n;
            if (q0Var != null && this.V && !j0Var.a.hasMessages(37)) {
                this.X++;
            }
            int i3 = this.X;
            if (i3 > 0) {
                this.O.d(new cg.l0(this, i3, 10));
            }
            this.X = 0;
            this.V = false;
            j0Var.e(37);
            q0 q0Var2 = this.W;
            if (q0Var2 != null) {
                X(q0Var2);
                this.W = null;
                this.V = false;
            }
        }
        this.U = z10;
        d();
    }

    @Override // w2.e1
    public final void k(w2.f1 f1Var) {
        this.n.b(9, (w2.e0) f1Var).b();
    }

    public final void k0(s1 s1Var) {
        this.T = s1Var;
        d();
    }

    public final void l(x0 x0Var, int i3, boolean z10, long j10) {
        r1 r1Var = this.a[i3];
        boolean g7 = r1Var.g();
        b bVar = r1Var.a;
        if (g7) {
            return;
        }
        boolean z11 = x0Var == this.I.i;
        z2.t tVar = x0Var.o;
        q1 q1Var = tVar.b[i3];
        z2.p pVar = tVar.c[i3];
        boolean z12 = s0() && this.Y.e == 3;
        boolean z13 = !z10 && z12;
        this.l0++;
        w2.d1 d1Var = x0Var.c[i3];
        long j11 = x0Var.p;
        w2.g0 g0Var = x0Var.g.a;
        b bVar2 = r1Var.c;
        int length = pVar != null ? pVar.length() : 0;
        d2.v[] vVarArr = new d2.v[length];
        for (int i10 = 0; i10 < length; i10++) {
            pVar.getClass();
            vVarArr[i10] = pVar.g(i10);
        }
        int i11 = r1Var.d;
        i iVar = this.E;
        if (i11 == 0 || i11 == 2 || i11 == 4) {
            r1Var.e = true;
            zb.p(bVar.n == 0);
            bVar.d = q1Var;
            bVar.H = g0Var;
            bVar.n = 1;
            bVar.o(z13, z11);
            bVar.y(vVarArr, d1Var, j10, j11, g0Var);
            bVar.z(j10, z13, true);
            iVar.d(bVar);
        } else {
            r1Var.f = true;
            bVar2.getClass();
            zb.p(bVar2.n == 0);
            bVar2.d = q1Var;
            bVar2.H = g0Var;
            bVar2.n = 1;
            bVar2.o(z13, z11);
            bVar2.y(vVarArr, d1Var, j10, j11, g0Var);
            bVar2.z(j10, z13, true);
            iVar.d(bVar2);
        }
        l0 l0Var = new l0(this);
        b d = r1Var.d(x0Var);
        d.getClass();
        d.d(11, l0Var);
        if (z12 && z11) {
            r1Var.m();
        }
    }

    public final void l0(t1 t1Var) {
        this.S = t1Var;
    }

    public final void m(long j10, boolean[] zArr) {
        r1[] r1VarArr;
        long j11;
        x0 x0Var = this.I.j;
        z2.t tVar = x0Var.o;
        int i3 = 0;
        while (true) {
            r1VarArr = this.a;
            if (i3 >= r1VarArr.length) {
                break;
            }
            if (!tVar.b(i3)) {
                r1VarArr[i3].k();
            }
            i3++;
        }
        int i10 = 0;
        while (i10 < r1VarArr.length) {
            if (tVar.b(i10) && r1VarArr[i10].d(x0Var) == null) {
                j11 = j10;
                l(x0Var, i10, zArr[i10], j11);
            } else {
                j11 = j10;
            }
            i10++;
            j10 = j11;
        }
    }

    public final void m0(boolean z10) {
        this.h0 = z10;
        d2.n1 n1Var = this.Y.a;
        z0 z0Var = this.I;
        z0Var.h = z10;
        int r5 = z0Var.r(n1Var);
        if ((r5 & 1) != 0) {
            W(true);
        } else if ((r5 & 2) != 0) {
            h();
        }
        v(false);
    }

    public final long n(d2.n1 n1Var, Object obj, long j10) {
        d2.k1 k1Var = this.x;
        int i3 = n1Var.g(obj, k1Var).c;
        d2.m1 m1Var = this.w;
        n1Var.n(i3, m1Var);
        if (m1Var.f != -9223372036854775807L && m1Var.a() && m1Var.i) {
            return g2.n0.S(g2.n0.C(m1Var.g) - m1Var.f) - (j10 + k1Var.e);
        }
        return -9223372036854775807L;
    }

    public final void n0(w2.i1 i1Var) {
        this.Z.f(1);
        i1 i1Var2 = this.J;
        int size = i1Var2.b.size();
        if (i1Var.getLength() != size) {
            i1Var = i1Var.i().f(0, size);
        }
        i1Var2.j = i1Var;
        w(i1Var2.b(), false);
    }

    public final long o(x0 x0Var) {
        if (x0Var == null) {
            return 0L;
        }
        long j10 = x0Var.p;
        if (!x0Var.e) {
            return j10;
        }
        int i3 = 0;
        while (true) {
            r1[] r1VarArr = this.a;
            if (i3 >= r1VarArr.length) {
                return j10;
            }
            if (r1VarArr[i3].d(x0Var) != null) {
                b d = r1VarArr[i3].d(x0Var);
                Objects.requireNonNull(d);
                long j11 = d.y;
                if (j11 == Long.MIN_VALUE) {
                    return Long.MIN_VALUE;
                }
                j10 = Math.max(j11, j10);
            }
            i3++;
        }
    }

    public final void o0(int i3) {
        j1 j1Var = this.Y;
        if (j1Var.e != i3) {
            if (i3 != 2) {
                this.s0 = -9223372036854775807L;
            }
            if (i3 != 3 && j1Var.p) {
                this.Y = j1Var.i(false);
            }
            this.Y = this.Y.h(i3);
        }
    }

    public final Pair p(d2.n1 n1Var) {
        long j10 = 0;
        if (n1Var.p()) {
            return Pair.create(j1.u, 0L);
        }
        int a10 = n1Var.a(this.h0);
        Pair i3 = n1Var.i(this.w, this.x, a10, -9223372036854775807L);
        w2.g0 p10 = this.I.p(n1Var, i3.first, 0L);
        long longValue = ((Long) i3.second).longValue();
        if (p10.b()) {
            Object obj = p10.a;
            d2.k1 k1Var = this.x;
            n1Var.g(obj, k1Var);
            if (p10.c == k1Var.e(p10.b)) {
                k1Var.g.getClass();
            }
        } else {
            j10 = longValue;
        }
        return Pair.create(p10, Long.valueOf(j10));
    }

    public final void p0(c3.w wVar) {
        for (r1 r1Var : this.a) {
            b bVar = r1Var.a;
            if (bVar.b == 2) {
                bVar.d(7, wVar);
                b bVar2 = r1Var.c;
                if (bVar2 != null) {
                    bVar2.d(7, wVar);
                }
            }
        }
    }

    public final long q(long j10) {
        x0 x0Var = this.I.l;
        if (x0Var == null) {
            return 0L;
        }
        return Math.max(0L, j10 - (this.n0 - x0Var.p));
    }

    public final void q0(Object obj, g2.j jVar) {
        for (r1 r1Var : this.a) {
            b bVar = r1Var.a;
            if (bVar.b == 2) {
                int i3 = r1Var.d;
                if (i3 == 4 || i3 == 1) {
                    b bVar2 = r1Var.c;
                    bVar2.getClass();
                    bVar2.d(1, obj);
                } else {
                    bVar.d(1, obj);
                }
            }
        }
        int i10 = this.Y.e;
        if (i10 == 3 || i10 == 2) {
            this.n.f(2);
        }
        if (jVar != null) {
            jVar.e();
        }
    }

    public final void r(int i3) {
        j1 j1Var = this.Y;
        B0(i3, j1Var.n, j1Var.m, j1Var.l);
    }

    public final void r0(float f10) {
        this.w0 = f10;
        float f11 = f10 * this.Q.g;
        for (r1 r1Var : this.a) {
            b bVar = r1Var.a;
            if (bVar.b == 1) {
                bVar.d(2, Float.valueOf(f11));
                b bVar2 = r1Var.c;
                if (bVar2 != null) {
                    bVar2.d(2, Float.valueOf(f11));
                }
            }
        }
    }

    public final void s() {
        r0(this.w0);
    }

    public final boolean s0() {
        j1 j1Var = this.Y;
        return j1Var.l && j1Var.n == 0;
    }

    public final void t(w2.e0 e0Var) {
        z0 z0Var = this.I;
        x0 x0Var = z0Var.l;
        if (x0Var != null && x0Var.a == e0Var) {
            z0Var.m(this.n0);
            D();
            return;
        }
        x0 x0Var2 = z0Var.m;
        if (x0Var2 == null || x0Var2.a != e0Var) {
            return;
        }
        E();
    }

    public final boolean t0(d2.n1 n1Var, w2.g0 g0Var) {
        if (g0Var.b() || n1Var.p()) {
            return false;
        }
        int i3 = n1Var.g(g0Var.a, this.x).c;
        d2.m1 m1Var = this.w;
        n1Var.n(i3, m1Var);
        return m1Var.a() && m1Var.i && m1Var.f != -9223372036854775807L;
    }

    public final void u(IOException iOException, int i3) {
        l lVar = new l(0, iOException, i3);
        x0 x0Var = this.I.i;
        if (x0Var != null) {
            lVar = lVar.a(x0Var.g.a);
        }
        g2.a.d("ExoPlayerImplInternal", "Playback error", lVar);
        v0(false, false);
        this.Y = this.Y.f(lVar);
    }

    public final void u0() {
        x0 x0Var = this.I.i;
        if (x0Var == null) {
            return;
        }
        z2.t tVar = x0Var.o;
        int i3 = 0;
        while (true) {
            r1[] r1VarArr = this.a;
            if (i3 >= r1VarArr.length) {
                return;
            }
            if (tVar.b(i3)) {
                r1VarArr[i3].m();
            }
            i3++;
        }
    }

    public final void v(boolean z10) {
        x0 x0Var = this.I.l;
        w2.g0 g0Var = x0Var == null ? this.Y.b : x0Var.g.a;
        boolean equals = this.Y.k.equals(g0Var);
        if (!equals) {
            this.Y = this.Y.c(g0Var);
        }
        j1 j1Var = this.Y;
        j1Var.q = x0Var == null ? j1Var.s : x0Var.d();
        j1 j1Var2 = this.Y;
        j1Var2.r = q(j1Var2.q);
        if ((!equals || z10) && x0Var != null && x0Var.e) {
            y0(x0Var.g.a, x0Var.o);
        }
    }

    public final void v0(boolean z10, boolean z11) {
        P(z10 || !this.i0, false, true, false);
        this.Z.f(z11 ? 1 : 0);
        h hVar = (h) this.f;
        ConcurrentHashMap concurrentHashMap = hVar.p;
        l2.k kVar = this.M;
        g gVar = (g) concurrentHashMap.get(kVar);
        if (gVar != null) {
            int i3 = gVar.a - 1;
            gVar.a = i3;
            if (i3 == 0) {
                concurrentHashMap.remove(kVar);
                hVar.c();
            }
        }
        this.Q.d(1, this.Y.l);
        o0(1);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:100:0x048b  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x048d  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x046e  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x03a2  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x03ac A[Catch: all -> 0x03a7, TryCatch #2 {all -> 0x03a7, blocks: (B:127:0x03a3, B:128:0x03ac, B:130:0x03b2, B:43:0x03c1, B:65:0x03c8, B:67:0x03ce, B:69:0x03d8, B:71:0x03e5, B:74:0x03e8), top: B:41:0x036e }] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x040c  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0455  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x042d  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x042f  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x040e  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x046c  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x047b  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x04b3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void w(d2.n1 n1Var, boolean z10) {
        long j10;
        d2.m1 m1Var;
        Object obj;
        int i3;
        long j11;
        long j12;
        boolean z11;
        boolean z12;
        boolean z13;
        d2.k1 k1Var;
        boolean z14;
        d2.n1 n1Var2;
        d2.k1 k1Var2;
        d2.n1 n1Var3;
        long j13;
        long j14;
        long j15;
        long j16;
        long j17;
        int i10;
        p0 p0Var;
        int i11;
        long longValue;
        boolean z15;
        int i12;
        boolean z16;
        d2.k1 k1Var3;
        d2.n1 n1Var4;
        d2.n1 n1Var5;
        w2.g0 g0Var;
        boolean z17;
        d2.n1 n1Var6;
        long j18;
        int s6;
        x0 x0Var;
        z0 z0Var;
        j1 j1Var = this.Y;
        q0 q0Var = this.m0;
        z0 z0Var2 = this.I;
        int i13 = this.g0;
        boolean z18 = this.h0;
        d2.m1 m1Var2 = this.w;
        d2.k1 k1Var4 = this.x;
        if (n1Var.p()) {
            w2.g0 g0Var2 = j1.u;
            boolean z19 = (g0Var2.equals(j1Var.b) && j1Var.s == 0) ? false : true;
            p0 p0Var2 = new p0(g0Var2, 0L, -9223372036854775807L, false, true, false, z19, z19 && z10 && !j1Var.a.p() && !j1Var.a.g(j1Var.b.a, k1Var4).f, 4);
            n1Var4 = n1Var;
            j15 = 0;
            p0Var = p0Var2;
            k1Var3 = k1Var4;
        } else {
            w2.g0 g0Var3 = j1Var.b;
            Object obj2 = g0Var3.a;
            d2.n1 n1Var7 = j1Var.a;
            boolean z20 = n1Var7.p() || n1Var7.g(g0Var3.a, k1Var4).f;
            long j19 = (j1Var.b.b() || z20) ? j1Var.c : j1Var.s;
            if (q0Var != null) {
                boolean z21 = true;
                j10 = 1;
                d2.n1 n1Var8 = n1Var;
                Pair T = T(n1Var8, q0Var, true, i13, z18, m1Var2, k1Var4);
                if (T == null) {
                    i12 = n1Var8.a(z18);
                    obj = obj2;
                    longValue = j19;
                    z15 = false;
                    z16 = false;
                } else {
                    if (q0Var.c == -9223372036854775807L) {
                        i12 = n1Var8.g(T.first, k1Var4).c;
                        obj = obj2;
                        longValue = j19;
                        z15 = false;
                    } else {
                        obj = T.first;
                        longValue = ((Long) T.second).longValue();
                        z15 = true;
                        i12 = -1;
                    }
                    z16 = j1Var.e == 4;
                    z21 = false;
                }
                z13 = z15;
                z12 = z21;
                z11 = z16;
                j12 = longValue;
                i3 = i12;
                m1Var = m1Var2;
                n1Var3 = n1Var8;
                k1Var2 = k1Var4;
            } else {
                j10 = 1;
                d2.n1 n1Var9 = n1Var;
                if (j1Var.a.p()) {
                    i3 = n1Var9.a(z18);
                    m1Var = m1Var2;
                    obj = obj2;
                } else if (n1Var9.b(obj2) == -1) {
                    obj = obj2;
                    int U = U(m1Var2, k1Var4, i13, z18, obj, j1Var.a, n1Var9);
                    m1Var = m1Var2;
                    d2.n1 n1Var10 = n1Var9;
                    k1Var = k1Var4;
                    if (U == -1) {
                        U = n1Var10.a(z18);
                        z14 = true;
                    } else {
                        z14 = false;
                    }
                    i3 = U;
                    z12 = z14;
                    j12 = j19;
                    z11 = false;
                    n1Var2 = n1Var10;
                    z13 = false;
                    n1Var3 = n1Var2;
                    k1Var2 = k1Var;
                } else {
                    m1Var = m1Var2;
                    obj = obj2;
                    if (j19 == -9223372036854775807L) {
                        i3 = n1Var9.g(obj, k1Var4).c;
                    } else if (z20) {
                        j1Var.a.g(g0Var3.a, k1Var4);
                        if (j1Var.a.m(k1Var4.c, m1Var, 0L).n == j1Var.a.b(g0Var3.a)) {
                            Pair i14 = n1Var9.i(m1Var, k1Var4, n1Var9.g(obj, k1Var4).c, j19 + k1Var4.e);
                            obj = i14.first;
                            j11 = ((Long) i14.second).longValue();
                        } else {
                            j11 = n1Var9.g(obj, k1Var4).d != -9223372036854775807L ? g2.n0.j(j19, 0L, k1Var4.d - 1) : j19;
                        }
                        j12 = j11;
                        i3 = -1;
                        z11 = false;
                        z12 = false;
                        z13 = true;
                        n1Var3 = n1Var9;
                        k1Var2 = k1Var4;
                    } else {
                        i3 = -1;
                    }
                }
                j12 = j19;
                z11 = false;
                z12 = false;
                n1Var2 = n1Var9;
                k1Var = k1Var4;
                z13 = false;
                n1Var3 = n1Var2;
                k1Var2 = k1Var;
            }
            if (i3 != -1) {
                Pair i15 = n1Var3.i(m1Var, k1Var2, i3, -9223372036854775807L);
                obj = i15.first;
                j12 = ((Long) i15.second).longValue();
                j13 = -9223372036854775807L;
            } else {
                j13 = j12;
            }
            w2.g0 p10 = z0Var2.p(n1Var3, obj, j12);
            int i16 = p10.e;
            boolean z22 = i16 == -1 || ((i11 = g0Var3.e) != -1 && i16 >= i11);
            boolean equals = g0Var3.a.equals(obj);
            boolean z23 = equals && !g0Var3.b() && !p10.b() && z22;
            d2.k1 g7 = n1Var3.g(obj, k1Var2);
            if (z20 || j19 != j13) {
                j14 = j13;
            } else {
                Object obj3 = g0Var3.a;
                int i17 = g0Var3.b;
                j14 = j13;
                if (obj3.equals(p10.a)) {
                    if (g0Var3.b()) {
                        g7.g(i17);
                    }
                    if (p10.b()) {
                        g7.g(p10.b);
                    }
                }
            }
            if (z23) {
                p10 = g0Var3;
            }
            if (!p10.b()) {
                if (equals && g0Var3.b()) {
                    d2.a a10 = n1Var3.g(obj, k1Var2).g.a(g0Var3.b);
                    a10.getClass();
                    long j20 = j1Var.c;
                    j15 = 0;
                    if (j20 == -9223372036854775807L || 0 > j20) {
                        int i18 = a10.a;
                        int i19 = g0Var3.c;
                        if (i18 > i19 && a10.e[i19] == 2) {
                            long j21 = n1Var3.g(obj, k1Var2).d;
                            if (j21 != -9223372036854775807L) {
                                j12 = Math.min(j21 - j10, j12);
                            }
                            j16 = j12;
                            j17 = j16;
                        }
                    }
                } else {
                    j15 = 0;
                }
                j16 = j12;
                j17 = j14;
            } else if (p10.equals(g0Var3)) {
                j16 = j1Var.s;
                j17 = j14;
                j15 = 0;
            } else {
                n1Var3.g(p10.a, k1Var2);
                if (p10.c == k1Var2.e(p10.b)) {
                    k1Var2.g.getClass();
                }
                j17 = j14;
                j15 = 0;
                j16 = 0;
            }
            boolean z24 = (p10.equals(j1Var.b) && j16 == j1Var.s) ? false : true;
            int i20 = n1Var3.b(j1Var.b.a) == -1 ? 4 : 3;
            if (p10.a.equals(j1Var.b.a) && p10.b != -1) {
                d2.a a11 = n1Var3.g(p10.a, k1Var2).g.a(p10.b);
                int i21 = p10.c;
                int[] iArr = a11.e;
                if (i21 >= iArr.length || iArr[i21] != 2) {
                    i10 = 0;
                    p0Var = new p0(p10, j16, j17, z11, z12, z13, z24, (z24 || !z10 || j1Var.a.p() || j1Var.a.g(j1Var.b.a, k1Var2).f) ? false : true, i10);
                    n1Var4 = n1Var3;
                    k1Var3 = k1Var2;
                }
            }
            i10 = i20;
            p0Var = new p0(p10, j16, j17, z11, z12, z13, z24, (z24 || !z10 || j1Var.a.p() || j1Var.a.g(j1Var.b.a, k1Var2).f) ? false : true, i10);
            n1Var4 = n1Var3;
            k1Var3 = k1Var2;
        }
        w2.g0 g0Var4 = p0Var.a;
        long j22 = p0Var.b;
        try {
            if (p0Var.e) {
                z17 = true;
                if (this.Y.e != 1) {
                    o0(4);
                }
                P(false, false, false, true);
            } else {
                z17 = true;
            }
            r1[] r1VarArr = this.a;
            int length = r1VarArr.length;
            int i22 = 0;
            d2.n1 n1Var11 = k1Var3;
            while (i22 < length) {
                r1 r1Var = r1VarArr[i22];
                b bVar = r1Var.a;
                boolean equals2 = Objects.equals(bVar.G, n1Var4);
                if (equals2 == 0) {
                    bVar.G = n1Var4;
                    bVar.v();
                }
                b bVar2 = r1Var.c;
                if (bVar2 != null && !Objects.equals(bVar2.G, n1Var4)) {
                    bVar2.G = n1Var4;
                    bVar2.v();
                }
                i22++;
                n1Var11 = equals2;
            }
            try {
                if (p0Var.g) {
                    n1Var11 = n1Var4;
                    if (!n1Var11.p()) {
                        for (x0 x0Var2 = this.I.i; x0Var2 != null; x0Var2 = x0Var2.m) {
                            if (x0Var2.g.a.equals(g0Var4)) {
                                x0Var2.g = this.I.h(n1Var11, x0Var2.g);
                                x0Var2.k();
                            }
                        }
                        boolean z25 = p0Var.d;
                        try {
                            z0Var = this.I;
                            g0Var = g0Var4;
                        } catch (Throwable th2) {
                            th = th2;
                            g0Var = g0Var4;
                            n1Var6 = n1Var11;
                            n1Var5 = n1Var6;
                            j1 j1Var2 = this.Y;
                            d2.n1 n1Var12 = j1Var2.a;
                            w2.g0 g0Var5 = j1Var2.b;
                            w2.g0 g0Var6 = g0Var;
                            D0(n1Var5, g0Var6, n1Var12, g0Var5, p0Var.f ? j22 : -9223372036854775807L, false);
                            if (!p0Var.g || p0Var.c != this.Y.c) {
                                long j23 = p0Var.c;
                                boolean z26 = p0Var.h;
                                this.Y = z(g0Var6, j22, j23, z26 ? j22 : this.Y.d, z26, p0Var.i);
                            }
                            Q();
                            S(n1Var5, this.Y.a);
                            this.Y = this.Y.j(n1Var5);
                            if (!n1Var5.p()) {
                                this.m0 = null;
                            }
                            v(false);
                            this.n.f(2);
                            throw th;
                        }
                        try {
                            j22 = Y(g0Var, j22, z0Var.i != z0Var.j ? z17 : false, z25);
                            j1 j1Var3 = this.Y;
                            w2.g0 g0Var7 = g0Var;
                            D0(n1Var, g0Var7, j1Var3.a, j1Var3.b, !p0Var.f ? j22 : -9223372036854775807L, false);
                            if (!p0Var.g || p0Var.c != this.Y.c) {
                                long j24 = p0Var.c;
                                boolean z27 = p0Var.h;
                                this.Y = z(g0Var7, j22, j24, !z27 ? j22 : this.Y.d, z27, p0Var.i);
                            }
                            Q();
                            S(n1Var, this.Y.a);
                            this.Y = this.Y.j(n1Var);
                            if (!n1Var.p()) {
                                this.m0 = null;
                            }
                            v(false);
                            this.n.f(2);
                        } catch (Throwable th3) {
                            th = th3;
                            j22 = j22;
                            n1Var6 = n1Var11;
                            n1Var5 = n1Var6;
                            j1 j1Var22 = this.Y;
                            d2.n1 n1Var122 = j1Var22.a;
                            w2.g0 g0Var52 = j1Var22.b;
                            w2.g0 g0Var62 = g0Var;
                            D0(n1Var5, g0Var62, n1Var122, g0Var52, p0Var.f ? j22 : -9223372036854775807L, false);
                            if (!p0Var.g) {
                            }
                            long j232 = p0Var.c;
                            boolean z262 = p0Var.h;
                            this.Y = z(g0Var62, j22, j232, z262 ? j22 : this.Y.d, z262, p0Var.i);
                            Q();
                            S(n1Var5, this.Y.a);
                            this.Y = this.Y.j(n1Var5);
                            if (!n1Var5.p()) {
                            }
                            v(false);
                            this.n.f(2);
                            throw th;
                        }
                    }
                } else {
                    try {
                        x0 x0Var3 = this.I.j;
                        long o10 = x0Var3 == null ? j15 : o(x0Var3);
                        try {
                            try {
                                if (e() && (x0Var = this.I.k) != null) {
                                    j18 = o(x0Var);
                                    s6 = this.I.s(n1Var, this.n0, o10, j18);
                                    if ((s6 & 1) == 0) {
                                        W(false);
                                    } else if ((s6 & 2) != 0) {
                                        h();
                                    }
                                }
                                s6 = this.I.s(n1Var, this.n0, o10, j18);
                                if ((s6 & 1) == 0) {
                                }
                            } catch (Throwable th4) {
                                th = th4;
                                n1Var11 = n1Var;
                                g0Var = g0Var4;
                                n1Var6 = n1Var11;
                                n1Var5 = n1Var6;
                                j1 j1Var222 = this.Y;
                                d2.n1 n1Var1222 = j1Var222.a;
                                w2.g0 g0Var522 = j1Var222.b;
                                w2.g0 g0Var622 = g0Var;
                                D0(n1Var5, g0Var622, n1Var1222, g0Var522, p0Var.f ? j22 : -9223372036854775807L, false);
                                if (!p0Var.g) {
                                }
                                long j2322 = p0Var.c;
                                boolean z2622 = p0Var.h;
                                this.Y = z(g0Var622, j22, j2322, z2622 ? j22 : this.Y.d, z2622, p0Var.i);
                                Q();
                                S(n1Var5, this.Y.a);
                                this.Y = this.Y.j(n1Var5);
                                if (!n1Var5.p()) {
                                }
                                v(false);
                                this.n.f(2);
                                throw th;
                            }
                        } catch (Throwable th5) {
                            th = th5;
                            n1Var11 = n1Var;
                        }
                        j18 = j15;
                    } catch (Throwable th6) {
                        th = th6;
                        n1Var11 = n1Var4;
                    }
                }
                g0Var = g0Var4;
                j1 j1Var32 = this.Y;
                w2.g0 g0Var72 = g0Var;
                D0(n1Var, g0Var72, j1Var32.a, j1Var32.b, !p0Var.f ? j22 : -9223372036854775807L, false);
                if (!p0Var.g) {
                }
                long j242 = p0Var.c;
                boolean z272 = p0Var.h;
                this.Y = z(g0Var72, j22, j242, !z272 ? j22 : this.Y.d, z272, p0Var.i);
                Q();
                S(n1Var, this.Y.a);
                this.Y = this.Y.j(n1Var);
                if (!n1Var.p()) {
                }
                v(false);
                this.n.f(2);
            } catch (Throwable th7) {
                th = th7;
            }
        } catch (Throwable th8) {
            th = th8;
            n1Var5 = n1Var4;
            g0Var = g0Var4;
        }
    }

    public final void w0() {
        i iVar = this.E;
        iVar.f = false;
        u1 u1Var = iVar.a;
        if (u1Var.c) {
            u1Var.d(u1Var.a());
            u1Var.c = false;
        }
        for (r1 r1Var : this.a) {
            b bVar = r1Var.c;
            b bVar2 = r1Var.a;
            if (r1.h(bVar2)) {
                r1.b(bVar2);
            }
            if (bVar != null && bVar.n != 0) {
                r1.b(bVar);
            }
        }
    }

    public final void x(w2.e0 e0Var) {
        x0 x0Var;
        z0 z0Var = this.I;
        x0 x0Var2 = z0Var.l;
        i iVar = this.E;
        if (x0Var2 != null && x0Var2.a == e0Var) {
            x0Var2.getClass();
            if (!x0Var2.e) {
                float f10 = iVar.g().a;
                j1 j1Var = this.Y;
                x0Var2.f(f10, j1Var.a, j1Var.l);
            }
            y0(x0Var2.g.a, x0Var2.o);
            if (x0Var2 == z0Var.i) {
                R(x0Var2.g.b, true);
                m(z0Var.j.e(), new boolean[this.a.length]);
                x0Var2.h = true;
                j1 j1Var2 = this.Y;
                w2.g0 g0Var = j1Var2.b;
                long j10 = x0Var2.g.b;
                this.Y = z(g0Var, j10, j1Var2.c, j10, false, 5);
            }
            D();
            return;
        }
        int i3 = 0;
        while (true) {
            if (i3 >= z0Var.q.size()) {
                x0Var = null;
                break;
            }
            x0Var = (x0) z0Var.q.get(i3);
            if (x0Var.a == e0Var) {
                break;
            } else {
                i3++;
            }
        }
        if (x0Var != null) {
            zb.p(true ^ x0Var.e);
            float f11 = iVar.g().a;
            j1 j1Var3 = this.Y;
            x0Var.f(f11, j1Var3.a, j1Var3.l);
            x0 x0Var3 = z0Var.m;
            if (x0Var3 == null || x0Var3.a != e0Var) {
                return;
            }
            E();
        }
    }

    /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, w2.f1] */
    public final void x0() {
        x0 x0Var = this.I.l;
        boolean z10 = this.f0 || (x0Var != null && x0Var.a.d());
        j1 j1Var = this.Y;
        if (z10 != j1Var.g) {
            this.Y = j1Var.b(z10);
        }
    }

    public final void y(d2.y0 y0Var, float f10, boolean z10, boolean z11) {
        int i3;
        if (z10) {
            if (z11) {
                this.Z.f(1);
            }
            this.Y = this.Y.g(y0Var);
        }
        float f11 = y0Var.a;
        x0 x0Var = this.I.i;
        while (true) {
            i3 = 0;
            if (x0Var == null) {
                break;
            }
            z2.p[] pVarArr = x0Var.o.c;
            int length = pVarArr.length;
            while (i3 < length) {
                z2.p pVar = pVarArr[i3];
                if (pVar != null) {
                    pVar.q(f11);
                }
                i3++;
            }
            x0Var = x0Var.m;
        }
        r1[] r1VarArr = this.a;
        int length2 = r1VarArr.length;
        while (i3 < length2) {
            r1 r1Var = r1VarArr[i3];
            float f12 = y0Var.a;
            r1Var.a.A(f10, f12);
            b bVar = r1Var.c;
            if (bVar != null) {
                bVar.A(f10, f12);
            }
            i3++;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00c3 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void y0(w2.g0 g0Var, z2.t tVar) {
        boolean z10;
        int length;
        int i3;
        x0 x0Var = this.I.l;
        x0Var.getClass();
        q(x0Var.d());
        if (t0(this.Y.a, x0Var.g.a)) {
            long j10 = this.K.h;
        }
        d2.n1 n1Var = this.Y.a;
        float f10 = this.E.g().a;
        boolean z11 = this.Y.l;
        z2.p[] pVarArr = tVar.c;
        h hVar = (h) this.f;
        hVar.getClass();
        g9.l0 l0Var = hVar.o;
        l2.k kVar = this.M;
        Integer num = (Integer) l0Var.get(kVar.a);
        int intValue = (num == null || num.intValue() == -1) ? hVar.l : num.intValue();
        g gVar = (g) hVar.p.get(kVar);
        gVar.getClass();
        if (intValue == -1) {
            d2.i0 i0Var = n1Var.m(n1Var.g(g0Var.a, hVar.b).c, hVar.a, 0L).c.b;
            if (i0Var != null) {
                String scheme = i0Var.a.getScheme();
                if (TextUtils.isEmpty(scheme) || h.r.contains(scheme)) {
                    z10 = true;
                    length = pVarArr.length;
                    i3 = 0;
                    int i10 = 0;
                    while (true) {
                        int i11 = 13107200;
                        if (i3 >= length) {
                            z2.p pVar = pVarArr[i3];
                            if (pVar != null) {
                                switch (pVar.b().c) {
                                    case -2:
                                        i11 = 0;
                                        i10 += i11;
                                        break;
                                    case -1:
                                    case 1:
                                        i10 += i11;
                                        break;
                                    case 0:
                                        i11 = 144310272;
                                        i10 += i11;
                                        break;
                                    case 2:
                                        i11 = z10 ? 19660800 : 131072000;
                                        i10 += i11;
                                        break;
                                    case 3:
                                    case 5:
                                    case 6:
                                        i11 = 131072;
                                        i10 += i11;
                                        break;
                                    case 4:
                                        i11 = 26214400;
                                        i10 += i11;
                                        break;
                                    default:
                                        throw new IllegalArgumentException();
                                }
                            }
                            i3++;
                        } else {
                            intValue = g2.n0.i(i10, 13107200, 210239488);
                        }
                    }
                }
            }
            z10 = false;
            length = pVarArr.length;
            i3 = 0;
            int i102 = 0;
            while (true) {
                int i112 = 13107200;
                if (i3 >= length) {
                }
                i3++;
            }
        }
        gVar.c = intValue;
        hVar.c();
    }

    public final j1 z(w2.g0 g0Var, long j10, long j11, long j12, boolean z10, int i3) {
        g9.s1 s1Var;
        boolean z11;
        this.q0 = (!this.q0 && j10 == this.Y.s && g0Var.equals(this.Y.b)) ? false : true;
        Q();
        j1 j1Var = this.Y;
        w2.r1 r1Var = j1Var.h;
        z2.t tVar = j1Var.i;
        List list = j1Var.j;
        if (this.J.k) {
            x0 x0Var = this.I.i;
            r1Var = x0Var == null ? w2.r1.d : x0Var.n;
            tVar = x0Var == null ? this.e : x0Var.o;
            z2.p[] pVarArr = tVar.c;
            g9.f0 f0Var = new g9.f0(4);
            boolean z12 = false;
            for (z2.p pVar : pVarArr) {
                if (pVar != null) {
                    d2.s0 s0Var = pVar.g(0).l;
                    if (s0Var == null) {
                        f0Var.c(new d2.s0(new d2.r0[0]));
                    } else {
                        f0Var.c(s0Var);
                        z12 = true;
                    }
                }
            }
            if (z12) {
                s1Var = f0Var.f();
            } else {
                g9.g0 g0Var2 = g9.i0.b;
                s1Var = g9.s1.e;
            }
            list = s1Var;
            if (x0Var != null) {
                y0 y0Var = x0Var.g;
                if (y0Var.d != j11) {
                    x0Var.g = y0Var.a(j11);
                }
            }
            r1[] r1VarArr = this.a;
            z0 z0Var = this.I;
            x0 x0Var2 = z0Var.i;
            if (x0Var2 == z0Var.j && x0Var2 != null) {
                z2.t tVar2 = x0Var2.o;
                int i10 = 0;
                boolean z13 = false;
                while (true) {
                    if (i10 >= r1VarArr.length) {
                        z11 = true;
                        break;
                    }
                    if (tVar2.b(i10)) {
                        if (r1VarArr[i10].a.b != 1) {
                            z11 = false;
                            break;
                        }
                        if (tVar2.b[i10].a != 0) {
                            z13 = true;
                        }
                    }
                    i10++;
                }
                boolean z14 = z13 && z11;
                if (z14 != this.k0) {
                    this.k0 = z14;
                    if (!z14 && this.Y.p) {
                        this.n.f(2);
                    }
                }
            }
        } else if (!g0Var.equals(j1Var.b)) {
            r1Var = w2.r1.d;
            tVar = this.e;
            list = g9.s1.e;
        }
        w2.r1 r1Var2 = r1Var;
        z2.t tVar3 = tVar;
        List list2 = list;
        if (z10) {
            o0 o0Var = this.Z;
            if (!o0Var.d || o0Var.e == 5) {
                o0Var.c = true;
                o0Var.d = true;
                o0Var.e = i3;
            } else {
                zb.f(i3 == 5);
            }
        }
        j1 j1Var2 = this.Y;
        return j1Var2.d(g0Var, j10, j11, j12, q(j1Var2.q), r1Var2, tVar3, list2);
    }

    public final void z0(List list, int i3, int i10) {
        this.Z.f(1);
        i1 i1Var = this.J;
        i1Var.getClass();
        ArrayList arrayList = i1Var.b;
        zb.f(i3 >= 0 && i3 <= i10 && i10 <= arrayList.size());
        zb.f(list.size() == i10 - i3);
        for (int i11 = i3; i11 < i10; i11++) {
            ((h1) arrayList.get(i11)).a.t((d2.n0) list.get(i11 - i3));
        }
        w(i1Var.b(), false);
    }
}
