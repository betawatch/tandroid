package l2;

import a8.la;
import android.content.Context;
import android.media.MediaFormat;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.os.Trace;
import android.text.TextUtils;
import android.util.Pair;
import com.google.android.gms.internal.vision.e2;
import di.x7;
import h9.t1;
import j$.util.Objects;
import j$.util.concurrent.ConcurrentHashMap;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import kg.x1;
import org.telegram.messenger.ls;
import x2.r1;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes.dex */
public final class o0 implements Handler.Callback, x2.d0, h1, d3.v {
    public static final long x0 = h2.l0.h0(10000);
    public final i E;
    public final ArrayList F;
    public final h2.g0 G;
    public final u H;
    public final w0 I;
    public final f1 J;
    public final f K;
    public final long L;
    public final m2.i M;
    public final m2.d N;
    public final h2.i0 O;
    public final boolean P;
    public final f2.e Q;
    public final boolean R;
    public p1 S;
    public o1 T;
    public boolean U;
    public boolean V;
    public n0 W;
    public int X;
    public g1 Y;
    public l0 Z;
    public final n1[] a;
    public boolean a0;
    public final b[] b;
    public boolean b0;
    public final boolean[] c;
    public boolean c0;
    public final a3.x d;
    public boolean d0;
    public final a3.y e;
    public long e0;
    public final q0 f;
    public boolean f0;
    public int g0;
    public final b3.d h;
    public boolean h0;
    public boolean i0;
    public boolean j0;
    public boolean k0;
    public int l0;
    public n0 m0;
    public final h2.i0 n;
    public long n0;
    public long o0;
    public int p0;
    public boolean q0;
    public final m6.n r;
    public l r0;
    public final Looper s;
    public long s0;
    public o t0;
    public long u0;
    public boolean v0;
    public final e2.k1 w;
    public float w0;
    public final e2.i1 x;
    public final long y;

    public o0(Context context, b[] bVarArr, b[] bVarArr2, a3.x xVar, a3.y yVar, q0 q0Var, b3.d dVar, int i7, boolean z10, m2.d dVar2, p1 p1Var, f fVar, long j3, Looper looper, h2.g0 g0Var, u uVar, m2.i iVar, final d3.v vVar, boolean z11) {
        o oVar = o.a;
        this.u0 = -9223372036854775807L;
        this.H = uVar;
        this.d = xVar;
        this.e = yVar;
        this.f = q0Var;
        this.h = dVar;
        this.g0 = i7;
        this.h0 = z10;
        this.S = p1Var;
        this.K = fVar;
        this.L = j3;
        this.b0 = false;
        this.G = g0Var;
        this.M = iVar;
        this.t0 = oVar;
        this.N = dVar2;
        this.w0 = 1.0f;
        this.T = o1.b;
        this.R = z11;
        this.s0 = -9223372036854775807L;
        this.e0 = -9223372036854775807L;
        this.y = ((h) q0Var).n;
        e2.h1 h1Var = e2.l1.a;
        g1 k10 = g1.k(yVar);
        this.Y = k10;
        this.Z = new l0(k10);
        this.b = new b[bVarArr.length];
        this.c = new boolean[bVarArr.length];
        a3.s sVar = (a3.s) xVar;
        sVar.getClass();
        this.a = new n1[bVarArr.length];
        boolean z12 = false;
        for (int i10 = 0; i10 < bVarArr.length; i10++) {
            b bVar = bVarArr[i10];
            bVar.e = i10;
            bVar.f = iVar;
            bVar.h = g0Var;
            this.b[i10] = bVar;
            b bVar2 = this.b[i10];
            synchronized (bVar2.a) {
                bVar2.I = sVar;
            }
            b bVar3 = bVarArr2[i10];
            if (bVar3 != null) {
                bVar3.e = i10;
                bVar3.f = iVar;
                bVar3.h = g0Var;
                z12 = true;
            }
            this.a[i10] = new n1(bVarArr[i10], bVar3, i10);
        }
        this.P = z12;
        this.E = new i(this, g0Var);
        this.F = new ArrayList();
        this.w = new e2.k1();
        this.x = new e2.i1();
        la.p(xVar.a == null);
        xVar.a = this;
        xVar.b = dVar;
        this.q0 = true;
        h2.i0 a10 = g0Var.a(looper, null);
        this.O = a10;
        this.I = new w0(dVar2, a10, new x1(this, 10));
        this.J = new f1(this, dVar2, a10, iVar);
        m6.n nVar = new m6.n(7);
        this.r = nVar;
        Looper d = nVar.d();
        this.s = d;
        h2.i0 a11 = g0Var.a(d, this);
        this.n = a11;
        this.Q = new f2.e(context, d, this);
        a11.b(35, new d3.v() { // from class: l2.g0
            @Override // d3.v
            public final void a(long j10, long j11, e2.u uVar2, MediaFormat mediaFormat) {
                o0 o0Var = o0.this;
                o0Var.getClass();
                vVar.a(j10, j11, uVar2, mediaFormat);
                o0Var.a(j10, j11, uVar2, mediaFormat);
            }
        }).b();
        a11.b(39, new h0(this)).b();
    }

    public static Pair S(e2.l1 l1Var, n0 n0Var, boolean z10, int i7, boolean z11, e2.k1 k1Var, e2.i1 i1Var) {
        int T;
        e2.l1 l1Var2 = n0Var.a;
        if (l1Var.p()) {
            return null;
        }
        e2.l1 l1Var3 = l1Var2.p() ? l1Var : l1Var2;
        try {
            Pair i10 = l1Var3.i(k1Var, i1Var, n0Var.b, n0Var.c);
            if (!l1Var.equals(l1Var3)) {
                if (l1Var.b(i10.first) == -1) {
                    if (!z10 || (T = T(k1Var, i1Var, i7, z11, i10.first, l1Var3, l1Var)) == -1) {
                        return null;
                    }
                    return l1Var.i(k1Var, i1Var, T, -9223372036854775807L);
                }
                if (l1Var3.g(i10.first, i1Var).f && l1Var3.m(i1Var.c, k1Var, 0L).n == l1Var3.b(i10.first)) {
                    return l1Var.i(k1Var, i1Var, l1Var.g(i10.first, i1Var).c, n0Var.c);
                }
            }
            return i10;
        } catch (IndexOutOfBoundsException unused) {
            return null;
        }
    }

    public static int T(e2.k1 k1Var, e2.i1 i1Var, int i7, boolean z10, Object obj, e2.l1 l1Var, e2.l1 l1Var2) {
        e2.k1 k1Var2 = k1Var;
        e2.l1 l1Var3 = l1Var;
        Object obj2 = l1Var3.m(l1Var3.g(obj, i1Var).c, k1Var, 0L).a;
        for (int i10 = 0; i10 < l1Var2.o(); i10++) {
            if (l1Var2.m(i10, k1Var, 0L).a.equals(obj2)) {
                return i10;
            }
        }
        int b10 = l1Var3.b(obj);
        int h = l1Var3.h();
        int i11 = -1;
        int i12 = 0;
        while (i12 < h && i11 == -1) {
            e2.l1 l1Var4 = l1Var3;
            int d = l1Var4.d(b10, i1Var, k1Var2, i7, z10);
            if (d == -1) {
                break;
            }
            i11 = l1Var2.b(l1Var4.l(d));
            i12++;
            l1Var3 = l1Var4;
            b10 = d;
            k1Var2 = k1Var;
        }
        if (i11 == -1) {
            return -1;
        }
        return l1Var2.f(i11, i1Var, false).c;
    }

    public static void f(j1 j1Var) {
        try {
            synchronized (j1Var) {
                synchronized (j1Var) {
                }
                j1Var.a.c(j1Var.c, j1Var.d);
                return;
            }
            j1Var.a.c(j1Var.c, j1Var.d);
            return;
        } finally {
            j1Var.a(true);
        }
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, x2.e0, x2.f1] */
    public static boolean z(u0 u0Var) {
        if (u0Var != null) {
            try {
                ?? r12 = u0Var.a;
                if (u0Var.e) {
                    for (x2.d1 d1Var : u0Var.c) {
                        if (d1Var != null) {
                            d1Var.a();
                        }
                    }
                } else {
                    r12.i();
                }
                if ((!u0Var.e ? 0L : r12.e()) != Long.MIN_VALUE) {
                    return true;
                }
            } catch (IOException unused) {
            }
        }
        return false;
    }

    public final boolean A(int i7, x2.g0 g0Var) {
        w0 w0Var = this.I;
        u0 u0Var = w0Var.k;
        if (u0Var != null && u0Var.g.a.equals(g0Var)) {
            n1 n1Var = this.a[i7];
            u0 u0Var2 = w0Var.k;
            int i10 = n1Var.d;
            boolean z10 = (i10 == 2 || i10 == 4) && n1Var.d(u0Var2) == n1Var.a;
            boolean z11 = n1Var.d == 3 && n1Var.d(u0Var2) == n1Var.c;
            if (z10 || z11) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:99:0x029c, code lost:
    
        if (((long) ((r3.e() - r23.n0) / r23.E.j().a)) > 10000000) goto L254;
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
    /* JADX WARN: Type inference failed for: r1v49, types: [java.lang.Object, x2.e0] */
    /* JADX WARN: Type inference failed for: r2v58, types: [java.lang.Object, x2.e0] */
    /* JADX WARN: Type inference failed for: r2v9, types: [java.lang.Object, x2.e0] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void A0() {
        u0 u0Var;
        long j3;
        u0 u0Var2;
        u0 u0Var3;
        n1[] n1VarArr;
        w0 w0Var;
        boolean z10;
        u0 u0Var4;
        u0 u0Var5;
        u0 a10;
        boolean z11;
        int i7;
        n1[] n1VarArr2;
        int i10;
        boolean z12;
        boolean z13;
        char c10;
        int i11;
        int i12;
        u0 u0Var6;
        u0 u0Var7;
        boolean z14;
        int i13;
        if (this.Y.a.p() || !this.J.k) {
            return;
        }
        this.I.m(this.n0);
        w0 w0Var2 = this.I;
        u0 u0Var8 = w0Var2.l;
        if (u0Var8 == null || (!u0Var8.g.k && u0Var8.g() && w0Var2.l.g.f != -9223372036854775807L && w0Var2.n < 100)) {
            w0 w0Var3 = this.I;
            long j10 = this.n0;
            g1 g1Var = this.Y;
            u0 u0Var9 = w0Var3.l;
            v0 d = u0Var9 == null ? w0Var3.d(g1Var.a, g1Var.b, g1Var.c, g1Var.s, -9223372036854775807L) : w0Var3.c(g1Var.a, u0Var9, j10);
            if (d != null) {
                w0 w0Var4 = this.I;
                u0 u0Var10 = w0Var4.l;
                long j11 = u0Var10 == null ? 1000000000000L : (u0Var10.p + u0Var10.g.f) - d.b;
                int i14 = 0;
                while (true) {
                    if (i14 >= w0Var4.q.size()) {
                        u0Var = null;
                        break;
                    }
                    v0 v0Var = ((u0) w0Var4.q.get(i14)).g;
                    long j12 = v0Var.f;
                    long j13 = d.f;
                    if ((j12 == -9223372036854775807L || j12 == j13) && v0Var.b == d.b && v0Var.a.equals(d.a)) {
                        u0Var = (u0) w0Var4.q.remove(i14);
                        break;
                    }
                    i14++;
                }
                if (u0Var == null) {
                    o0 o0Var = (o0) w0Var4.e.b;
                    b[] bVarArr = o0Var.b;
                    a3.x xVar = o0Var.d;
                    q0 q0Var = o0Var.f;
                    m2.i iVar = o0Var.M;
                    h hVar = (h) q0Var;
                    hVar.getClass();
                    j3 = -9223372036854775807L;
                    h6.m mVar = new h6.m(hVar, iVar);
                    f1 f1Var = o0Var.J;
                    a3.y yVar = o0Var.e;
                    o0Var.t0.getClass();
                    u0Var = new u0(bVarArr, j11, xVar, mVar, f1Var, d, yVar);
                } else {
                    j3 = -9223372036854775807L;
                    u0Var.g = d;
                    u0Var.p = j11;
                }
                u0 u0Var11 = w0Var4.l;
                if (u0Var11 == null) {
                    w0Var4.i = u0Var;
                    w0Var4.j = u0Var;
                    w0Var4.k = u0Var;
                } else if (u0Var != u0Var11.m) {
                    u0Var11.b();
                    u0Var11.m = u0Var;
                    u0Var11.c();
                }
                w0Var4.o = null;
                w0Var4.l = u0Var;
                w0Var4.n++;
                w0Var4.l();
                if (!u0Var.d) {
                    long j14 = d.b;
                    u0Var.d = true;
                    u0Var.a.t(this, j14);
                } else if (u0Var.e) {
                    this.n.b(8, u0Var.a).b();
                }
                if (this.I.i == u0Var) {
                    Q(d.b, true);
                }
                u(false);
                if (this.f0) {
                    C();
                } else {
                    this.f0 = z(this.I.l);
                    x0();
                }
                w0 w0Var5 = this.I;
                if (!this.c0 && this.P && !this.v0 && !d() && (u0Var6 = w0Var5.k) != null && u0Var6 == w0Var5.j && (u0Var7 = u0Var6.m) != null && (z14 = u0Var7.e)) {
                    la.p(z14);
                    if (((long) ((u0Var7.e() - this.n0) / this.E.j().a)) <= 10000000) {
                        u0 u0Var12 = w0Var5.k;
                        u0Var12.getClass();
                        w0Var5.k = u0Var12.m;
                        w0Var5.l();
                        w0Var5.k.getClass();
                        n1[] n1VarArr3 = this.a;
                        u0 u0Var13 = w0Var5.k;
                        if (u0Var13 != null) {
                            a3.y yVar2 = u0Var13.o;
                            for (int i15 = 0; i15 < n1VarArr3.length; i15++) {
                                if (yVar2.b(i15)) {
                                    n1 n1Var = n1VarArr3[i15];
                                    if (n1Var.c != null && !n1Var.f()) {
                                        n1 n1Var2 = n1VarArr3[i15];
                                        la.p(!n1Var2.f());
                                        if (n1.h(n1Var2.a)) {
                                            i13 = 3;
                                        } else {
                                            b bVar = n1Var2.c;
                                            i13 = (bVar == null || bVar.n == 0) ? 2 : 4;
                                        }
                                        n1Var2.d = i13;
                                        j(u0Var13, i15, false, u0Var13.e());
                                    }
                                }
                            }
                            if (d()) {
                                this.u0 = u0Var13.a.o();
                                if (!u0Var13.g()) {
                                    w0Var5.n(u0Var13);
                                    u(false);
                                    C();
                                }
                            }
                        }
                    }
                }
                boolean z15 = this.P;
                n1[] n1VarArr4 = this.a;
                w0 w0Var6 = this.I;
                u0Var2 = w0Var6.j;
                if (u0Var2 != null) {
                    if (u0Var2.m == null || this.c0) {
                        if (u0Var2.g.k || this.c0) {
                            for (n1 n1Var3 : n1VarArr4) {
                                if (n1Var3.d(u0Var2) != null) {
                                    b d2 = n1Var3.d(u0Var2);
                                    d2.getClass();
                                    if (d2.k()) {
                                        long j15 = u0Var2.g.f;
                                        long j16 = (j15 == -9223372036854775807L || j15 == Long.MIN_VALUE) ? -9223372036854775807L : j15 + u0Var2.p;
                                        b d10 = n1Var3.d(u0Var2);
                                        d10.getClass();
                                        n1.l(d10, j16);
                                    }
                                }
                            }
                        }
                    } else if (u0Var2.e) {
                        int i16 = 0;
                        while (true) {
                            if (i16 < n1VarArr4.length) {
                                n1 n1Var4 = n1VarArr4[i16];
                                if (!n1Var4.e(u0Var2, n1Var4.a) || !n1Var4.e(u0Var2, n1Var4.c)) {
                                    break;
                                } else {
                                    i16++;
                                }
                            } else if (!d() || w0Var6.k != w0Var6.j) {
                                u0 u0Var14 = u0Var2.m;
                                if (u0Var14.e || this.n0 >= u0Var14.e()) {
                                    boolean z16 = u0Var2.m.e;
                                    if (z16) {
                                        la.p(z16);
                                    }
                                    a3.y yVar3 = u0Var2.o;
                                    u0 u0Var15 = w0Var6.k;
                                    u0 u0Var16 = w0Var6.j;
                                    if (u0Var15 == u0Var16) {
                                        u0Var16.getClass();
                                        w0Var6.k = u0Var16.m;
                                    }
                                    u0 u0Var17 = w0Var6.j;
                                    u0Var17.getClass();
                                    w0Var6.j = u0Var17.m;
                                    w0Var6.l();
                                    u0 u0Var18 = w0Var6.j;
                                    u0Var18.getClass();
                                    a3.y yVar4 = u0Var18.o;
                                    e2.l1 l1Var = this.Y.a;
                                    D0(l1Var, u0Var18.g.a, l1Var, u0Var2.g.a, -9223372036854775807L, false);
                                    if (u0Var18.e && ((z15 && this.u0 != j3) || u0Var18.a.o() != j3)) {
                                        this.u0 = j3;
                                        boolean z17 = z15 && !this.v0;
                                        if (z17) {
                                            int i17 = 0;
                                            while (true) {
                                                if (i17 >= n1VarArr4.length) {
                                                    break;
                                                }
                                                boolean b10 = yVar4.b(i17);
                                                a3.u[] uVarArr = yVar4.c;
                                                if (b10 && n1VarArr4[i17].a.b != -2 && !e2.s0.a(uVarArr[i17].n().s, uVarArr[i17].n().k) && !n1VarArr4[i17].f()) {
                                                    z17 = false;
                                                    break;
                                                }
                                                i17++;
                                            }
                                        }
                                        if (!z17) {
                                            long e10 = u0Var18.e();
                                            for (n1 n1Var5 : n1VarArr4) {
                                                b bVar2 = n1Var5.c;
                                                b bVar3 = n1Var5.a;
                                                if (n1.h(bVar3) && (i12 = n1Var5.d) != 4 && i12 != 2) {
                                                    n1.l(bVar3, e10);
                                                }
                                                if (bVar2 != null) {
                                                    if ((bVar2.n != 0) && n1Var5.d != 3) {
                                                        n1.l(bVar2, e10);
                                                    }
                                                }
                                            }
                                            if (!u0Var18.g()) {
                                                w0Var6.n(u0Var18);
                                                u(false);
                                                C();
                                            }
                                        }
                                    }
                                    for (n1 n1Var6 : n1VarArr4) {
                                        long e11 = u0Var18.e();
                                        b bVar4 = n1Var6.a;
                                        int i18 = n1Var6.b;
                                        boolean b11 = yVar3.b(i18);
                                        boolean b12 = yVar4.b(i18);
                                        b bVar5 = n1Var6.c;
                                        if (bVar5 == null || (i11 = n1Var6.d) == 3 || (i11 == 0 && n1.h(bVar4))) {
                                            bVar5 = bVar4;
                                        }
                                        if (!b11 || bVar5.E) {
                                            c10 = 65534;
                                        } else {
                                            int i19 = bVar4.b;
                                            c10 = 65534;
                                            boolean z18 = i19 == -2;
                                            m1 m1Var = yVar3.b[i18];
                                            m1 m1Var2 = yVar4.b[i18];
                                            if (!b12 || !Objects.equals(m1Var2, m1Var) || z18 || n1Var6.f()) {
                                                n1.l(bVar5, e11);
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                w0 w0Var7 = this.I;
                u0Var3 = w0Var7.j;
                if (u0Var3 != null && w0Var7.i != u0Var3 && !u0Var3.h) {
                    n1VarArr2 = this.a;
                    a3.y yVar5 = u0Var3.o;
                    z12 = true;
                    for (i10 = 0; i10 < n1VarArr2.length; i10++) {
                        int c11 = n1VarArr2[i10].c();
                        n1 n1Var7 = n1VarArr2[i10];
                        i iVar2 = this.E;
                        int j17 = n1Var7.j(n1Var7.a, u0Var3, yVar5, iVar2);
                        int j18 = n1Var7.j(n1Var7.c, u0Var3, yVar5, iVar2);
                        if (j17 == 1) {
                            j17 = j18;
                        }
                        if ((j17 & 2) != 0 && (z13 = this.k0) && z13) {
                            this.k0 = false;
                            if (this.Y.p) {
                                this.n.f(2);
                            }
                        }
                        this.l0 -= c11 - n1VarArr2[i10].c();
                        z12 &= (j17 & 1) != 0;
                    }
                    if (z12) {
                        for (int i20 = 0; i20 < n1VarArr2.length; i20++) {
                            if (yVar5.b(i20)) {
                                if (!(n1VarArr2[i20].d(u0Var3) != null)) {
                                    j(u0Var3, i20, false, u0Var3.e());
                                }
                            }
                        }
                    }
                    if (z12) {
                        w0Var7.j.h = true;
                    }
                }
                n1VarArr = this.a;
                w0Var = this.I;
                z10 = false;
                while (s0() && !this.c0 && (u0Var4 = w0Var.i) != null && (u0Var5 = u0Var4.m) != null && this.n0 >= u0Var5.e() && u0Var5.h) {
                    if (z10) {
                        E();
                    }
                    this.v0 = false;
                    a10 = w0Var.a();
                    a10.getClass();
                    if (this.Y.b.a.equals(a10.g.a.a)) {
                        x2.g0 g0Var = this.Y.b;
                        if (g0Var.b == -1) {
                            x2.g0 g0Var2 = a10.g.a;
                            if (g0Var2.b == -1 && g0Var.e != g0Var2.e) {
                                z11 = true;
                                v0 v0Var2 = a10.g;
                                boolean z19 = z11;
                                x2.g0 g0Var3 = v0Var2.a;
                                long j19 = v0Var2.b;
                                this.Y = y(g0Var3, j19, v0Var2.d, j19, !z19, 0);
                                P();
                                C0();
                                if (d() && a10 == w0Var.k) {
                                    for (n1 n1Var8 : n1VarArr) {
                                        int i21 = n1Var8.d;
                                        if (i21 == 3 || i21 == 4) {
                                            boolean z20 = i21 == 4;
                                            b bVar6 = n1Var8.a;
                                            b bVar7 = n1Var8.c;
                                            if (z20) {
                                                bVar7.getClass();
                                                bVar7.c(17, bVar6);
                                            } else {
                                                bVar7.getClass();
                                                bVar6.c(17, bVar7);
                                            }
                                            n1Var8.d = n1Var8.d == 4 ? 0 : 1;
                                        } else if (i21 == 2) {
                                            n1Var8.d = 0;
                                        }
                                    }
                                }
                                if (this.Y.e == 3) {
                                    u0();
                                }
                                a3.y yVar6 = w0Var.i.o;
                                for (i7 = 0; i7 < n1VarArr.length; i7++) {
                                    if (yVar6.b(i7)) {
                                        n1 n1Var9 = n1VarArr[i7];
                                        b bVar8 = n1Var9.c;
                                        b bVar9 = n1Var9.a;
                                        if (n1.h(bVar9)) {
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
                    v0 v0Var22 = a10.g;
                    boolean z192 = z11;
                    x2.g0 g0Var32 = v0Var22.a;
                    long j192 = v0Var22.b;
                    this.Y = y(g0Var32, j192, v0Var22.d, j192, !z192, 0);
                    P();
                    C0();
                    if (d()) {
                        while (r2 < r1) {
                        }
                    }
                    if (this.Y.e == 3) {
                    }
                    a3.y yVar62 = w0Var.i.o;
                    while (i7 < n1VarArr.length) {
                    }
                    z10 = true;
                }
                this.t0.getClass();
            }
        }
        j3 = -9223372036854775807L;
        if (this.f0) {
        }
        w0 w0Var52 = this.I;
        if (!this.c0) {
            la.p(z14);
            if (((long) ((u0Var7.e() - this.n0) / this.E.j().a)) <= 10000000) {
            }
        }
        boolean z152 = this.P;
        n1[] n1VarArr42 = this.a;
        w0 w0Var62 = this.I;
        u0Var2 = w0Var62.j;
        if (u0Var2 != null) {
        }
        w0 w0Var72 = this.I;
        u0Var3 = w0Var72.j;
        if (u0Var3 != null) {
            n1VarArr2 = this.a;
            a3.y yVar52 = u0Var3.o;
            z12 = true;
            while (i10 < n1VarArr2.length) {
            }
            if (z12) {
            }
            if (z12) {
            }
        }
        n1VarArr = this.a;
        w0Var = this.I;
        z10 = false;
        while (s0()) {
            if (z10) {
            }
            this.v0 = false;
            a10 = w0Var.a();
            a10.getClass();
            if (this.Y.b.a.equals(a10.g.a.a)) {
            }
            z11 = false;
            v0 v0Var222 = a10.g;
            boolean z1922 = z11;
            x2.g0 g0Var322 = v0Var222.a;
            long j1922 = v0Var222.b;
            this.Y = y(g0Var322, j1922, v0Var222.d, j1922, !z1922, 0);
            P();
            C0();
            if (d()) {
            }
            if (this.Y.e == 3) {
            }
            a3.y yVar622 = w0Var.i.o;
            while (i7 < n1VarArr.length) {
            }
            z10 = true;
        }
        this.t0.getClass();
    }

    public final boolean B() {
        u0 u0Var = this.I.i;
        long j3 = u0Var.g.f;
        if (u0Var.e) {
            return j3 == -9223372036854775807L || this.Y.s < j3 || !s0();
        }
        return false;
    }

    public final void B0(int i7, int i10, int i11, boolean z10) {
        boolean z11 = z10 && i7 != -1;
        if (i7 == -1) {
            i11 = 2;
        } else if (i11 == 2) {
            i11 = 1;
        }
        boolean z12 = this.U;
        if (i7 == 0) {
            i10 = 1;
        } else if (i10 == 1) {
            i10 = z12 ? 4 : 0;
        }
        g1 g1Var = this.Y;
        if (g1Var.l == z11 && g1Var.n == i10 && g1Var.m == i11) {
            return;
        }
        this.Y = g1Var.e(i11, i10, z11);
        E0(false, false);
        w0 w0Var = this.I;
        for (u0 u0Var = w0Var.i; u0Var != null; u0Var = u0Var.m) {
            for (a3.u uVar : u0Var.o.c) {
                if (uVar != null) {
                    uVar.f(z11);
                }
            }
        }
        if (!s0()) {
            w0();
            C0();
            g1 g1Var2 = this.Y;
            if (g1Var2.p) {
                this.Y = g1Var2.i(false);
            }
            w0Var.m(this.n0);
            return;
        }
        int i12 = this.Y.e;
        h2.i0 i0Var = this.n;
        if (i12 != 3) {
            if (i12 == 2) {
                i0Var.f(2);
            }
        } else {
            i iVar = this.E;
            iVar.b = true;
            ((q1) iVar.c).d();
            u0();
            i0Var.f(2);
        }
    }

    /* JADX WARN: Type inference failed for: r1v14, types: [java.lang.Object, x2.e0] */
    /* JADX WARN: Type inference failed for: r1v21, types: [java.lang.Object, x2.f1] */
    /* JADX WARN: Type inference failed for: r7v1, types: [java.lang.Object, x2.f1] */
    public final void C() {
        boolean b10;
        if (z(this.I.l)) {
            u0 u0Var = this.I.l;
            long p10 = p(!u0Var.e ? 0L : u0Var.a.e());
            u0 u0Var2 = this.I.i;
            long j3 = t0(this.Y.a, u0Var.g.a) ? this.K.h : -9223372036854775807L;
            m2.i iVar = this.M;
            e2.l1 l1Var = this.Y.a;
            x2.g0 g0Var = u0Var.g.a;
            float f10 = this.E.j().a;
            boolean z10 = this.Y.l;
            p0 p0Var = new p0(iVar, l1Var, g0Var, p10, f10, this.d0, j3);
            b10 = ((h) this.f).b(p0Var);
            u0 u0Var3 = this.I.i;
            if (!b10 && u0Var3.e && p10 < 500000 && this.y > 0) {
                u0Var3.a.n(this.Y.s);
                b10 = ((h) this.f).b(p0Var);
            }
        } else {
            b10 = false;
        }
        this.f0 = b10;
        if (b10) {
            u0 u0Var4 = this.I.l;
            u0Var4.getClass();
            r0 r0Var = new r0();
            r0Var.a = this.n0 - u0Var4.p;
            float f11 = this.E.j().a;
            la.f(f11 > 0.0f || f11 == -3.4028235E38f);
            r0Var.b = f11;
            long j10 = this.e0;
            la.f(j10 >= 0 || j10 == -9223372036854775807L);
            r0Var.c = j10;
            s0 s0Var = new s0(r0Var);
            la.p(u0Var4.m == null);
            u0Var4.a.c(s0Var);
        }
        x0();
    }

    /* JADX WARN: Type inference failed for: r2v21, types: [java.lang.Object, x2.e0] */
    public final void C0() {
        long j3;
        float f10;
        u0 u0Var = this.I.i;
        if (u0Var == null) {
            return;
        }
        long o4 = u0Var.e ? u0Var.a.o() : -9223372036854775807L;
        if (o4 != -9223372036854775807L) {
            if (!u0Var.g()) {
                this.I.n(u0Var);
                u(false);
                C();
            }
            Q(o4, true);
            if (o4 != this.Y.s) {
                g1 g1Var = this.Y;
                this.Y = y(g1Var.b, o4, g1Var.c, o4, true, 5);
            }
        } else {
            i iVar = this.E;
            boolean z10 = u0Var != this.I.j;
            q1 q1Var = (q1) iVar.c;
            b bVar = (b) iVar.e;
            if (bVar == null || bVar.l() || ((z10 && ((b) iVar.e).n != 2) || (!((b) iVar.e).m() && (z10 || ((b) iVar.e).k())))) {
                iVar.a = true;
                if (iVar.b) {
                    q1Var.d();
                }
            } else {
                t0 t0Var = (t0) iVar.f;
                t0Var.getClass();
                long a10 = t0Var.a();
                if (iVar.a) {
                    if (a10 >= q1Var.a()) {
                        iVar.a = false;
                        if (iVar.b) {
                            q1Var.d();
                        }
                    } else if (q1Var.c) {
                        q1Var.c(q1Var.a());
                        q1Var.c = false;
                    }
                }
                q1Var.c(a10);
                e2.w0 j10 = t0Var.j();
                if (!j10.equals((e2.w0) q1Var.e)) {
                    q1Var.e(j10);
                    ((o0) iVar.d).n.b(16, j10).b();
                }
            }
            long a11 = iVar.a();
            this.n0 = a11;
            long j11 = a11 - u0Var.p;
            long j12 = this.Y.s;
            ArrayList arrayList = this.F;
            if (!arrayList.isEmpty() && !this.Y.b.b()) {
                if (this.q0) {
                    this.q0 = false;
                }
                g1 g1Var2 = this.Y;
                g1Var2.a.b(g1Var2.b.a);
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
                g1 g1Var3 = this.Y;
                this.Y = y(g1Var3.b, j11, g1Var3.c, j11, z11, 6);
            } else {
                g1 g1Var4 = this.Y;
                g1Var4.s = j11;
                g1Var4.t = SystemClock.elapsedRealtime();
            }
        }
        this.Y.q = this.I.l.d();
        g1 g1Var5 = this.Y;
        g1Var5.r = p(g1Var5.q);
        g1 g1Var6 = this.Y;
        if (g1Var6.l && g1Var6.e == 3 && t0(g1Var6.a, g1Var6.b)) {
            g1 g1Var7 = this.Y;
            float f11 = 1.0f;
            if (g1Var7.o.a == 1.0f) {
                f fVar = this.K;
                long l10 = l(g1Var7.a, g1Var7.b.a, g1Var7.s);
                long j13 = this.Y.r;
                if (fVar.c != -9223372036854775807L) {
                    long j14 = l10 - j13;
                    long j15 = fVar.m;
                    if (j15 == -9223372036854775807L) {
                        fVar.m = j14;
                        fVar.n = 0L;
                    } else {
                        fVar.m = Math.max(j14, (long) ((j14 * 9.999871E-4f) + (j15 * 0.999f)));
                        fVar.n = (long) ((9.999871E-4f * Math.abs(j14 - r9)) + (fVar.n * 0.999f));
                    }
                    if (fVar.l != -9223372036854775807L) {
                        j3 = 1000;
                        if (SystemClock.elapsedRealtime() - fVar.l < 1000) {
                            f11 = fVar.k;
                        }
                    } else {
                        j3 = 1000;
                    }
                    fVar.l = SystemClock.elapsedRealtime();
                    long j16 = (fVar.n * 3) + fVar.m;
                    if (fVar.h > j16) {
                        float S = h2.l0.S(j3);
                        f10 = 1.0E-7f;
                        long[] jArr = {j16, fVar.e, fVar.h - (((long) ((fVar.k - 1.0f) * S)) + ((long) ((fVar.i - 1.0f) * S)))};
                        long j17 = jArr[0];
                        for (int i7 = 1; i7 < 3; i7++) {
                            long j18 = jArr[i7];
                            if (j18 > j17) {
                                j17 = j18;
                            }
                        }
                        fVar.h = j17;
                    } else {
                        f10 = 1.0E-7f;
                        long j19 = h2.l0.j(l10 - ((long) (Math.max(0.0f, fVar.k - 1.0f) / 1.0E-7f)), fVar.h, j16);
                        fVar.h = j19;
                        long j20 = fVar.g;
                        if (j20 != -9223372036854775807L && j19 > j20) {
                            fVar.h = j20;
                        }
                    }
                    long j21 = l10 - fVar.h;
                    if (Math.abs(j21) < fVar.a) {
                        fVar.k = 1.0f;
                    } else {
                        fVar.k = h2.l0.h((f10 * j21) + 1.0f, fVar.j, fVar.i);
                    }
                    f11 = fVar.k;
                }
                if (this.E.j().a != f11) {
                    e2.w0 w0Var = new e2.w0(f11, this.Y.o.b);
                    this.n.e(16);
                    this.E.e(w0Var);
                    x(this.Y.o, this.E.j().a, false, false);
                }
            }
        }
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, x2.e0, x2.f1] */
    public final void D() {
        w0 w0Var = this.I;
        w0Var.k();
        u0 u0Var = w0Var.m;
        if (u0Var != null) {
            ?? r12 = u0Var.a;
            if ((!u0Var.d || u0Var.e) && !r12.g()) {
                e2.l1 l1Var = this.Y.a;
                if (u0Var.e) {
                    r12.r();
                }
                Iterator it = ((h) this.f).p.values().iterator();
                while (it.hasNext()) {
                    if (((g) it.next()).b) {
                        return;
                    }
                }
                if (!u0Var.d) {
                    long j3 = u0Var.g.b;
                    u0Var.d = true;
                    r12.t(this, j3);
                    return;
                }
                r0 r0Var = new r0();
                r0Var.a = this.n0 - u0Var.p;
                float f10 = this.E.j().a;
                la.f(f10 > 0.0f || f10 == -3.4028235E38f);
                r0Var.b = f10;
                long j10 = this.e0;
                la.f(j10 >= 0 || j10 == -9223372036854775807L);
                r0Var.c = j10;
                s0 s0Var = new s0(r0Var);
                la.p(u0Var.m == null);
                r12.c(s0Var);
            }
        }
    }

    public final void D0(e2.l1 l1Var, x2.g0 g0Var, e2.l1 l1Var2, x2.g0 g0Var2, long j3, boolean z10) {
        boolean t02 = t0(l1Var, g0Var);
        Object obj = g0Var.a;
        if (!t02) {
            e2.w0 w0Var = g0Var.b() ? e2.w0.d : this.Y.o;
            i iVar = this.E;
            if (iVar.j().equals(w0Var)) {
                return;
            }
            this.n.e(16);
            iVar.e(w0Var);
            x(this.Y.o, w0Var.a, false, false);
            return;
        }
        e2.i1 i1Var = this.x;
        int i7 = l1Var.g(obj, i1Var).c;
        e2.k1 k1Var = this.w;
        l1Var.n(i7, k1Var);
        e2.f0 f0Var = k1Var.j;
        f fVar = this.K;
        fVar.getClass();
        fVar.c = h2.l0.S(f0Var.a);
        fVar.f = h2.l0.S(f0Var.b);
        fVar.g = h2.l0.S(f0Var.c);
        float f10 = f0Var.d;
        if (f10 == -3.4028235E38f) {
            f10 = 0.97f;
        }
        fVar.j = f10;
        float f11 = f0Var.e;
        if (f11 == -3.4028235E38f) {
            f11 = 1.03f;
        }
        fVar.i = f11;
        if (f10 == 1.0f && f11 == 1.0f) {
            fVar.c = -9223372036854775807L;
        }
        fVar.a();
        if (j3 != -9223372036854775807L) {
            fVar.d = l(l1Var, obj, j3);
            fVar.a();
            return;
        }
        if (!Objects.equals(!l1Var2.p() ? l1Var2.m(l1Var2.g(g0Var2.a, i1Var).c, k1Var, 0L).a : null, k1Var.a) || z10) {
            fVar.d = -9223372036854775807L;
            fVar.a();
        }
    }

    public final void E() {
        l0 l0Var = this.Z;
        g1 g1Var = this.Y;
        boolean z10 = l0Var.c | (((g1) l0Var.f) != g1Var);
        l0Var.c = z10;
        l0Var.f = g1Var;
        if (z10) {
            f0 f0Var = this.H.b;
            f0Var.j.d(new ji.i(16, f0Var, l0Var));
            this.Z = new l0(this.Y);
        }
    }

    public final void E0(boolean z10, boolean z11) {
        long j3;
        this.d0 = z10;
        if (!z10 || z11) {
            j3 = -9223372036854775807L;
        } else {
            this.G.getClass();
            j3 = SystemClock.elapsedRealtime();
        }
        this.e0 = j3;
    }

    public final void F(int i7) {
        n1 n1Var = this.a[i7];
        try {
            u0 u0Var = this.I.i;
            u0Var.getClass();
            b d = n1Var.d(u0Var);
            d.getClass();
            x2.d1 d1Var = d.r;
            d1Var.getClass();
            d1Var.a();
        } catch (IOException | RuntimeException e10) {
            int i10 = n1Var.a.b;
            if (i10 != 3 && i10 != 5) {
                throw e10;
            }
            a3.y yVar = this.I.i.o;
            h2.a.d("ExoPlayerImplInternal", "Disabling track due to error: " + e2.u.c(yVar.c[i7].n()), e10);
            a3.y yVar2 = new a3.y((m1[]) yVar.b.clone(), (a3.u[]) yVar.c.clone(), yVar.d, yVar.e);
            yVar2.b[i7] = null;
            yVar2.c[i7] = null;
            h(i7);
            u0 u0Var2 = this.I.i;
            u0Var2.a(yVar2, this.Y.s, false, new boolean[u0Var2.j.length]);
        }
    }

    public final void G(int i7, boolean z10) {
        boolean[] zArr = this.c;
        if (zArr[i7] != z10) {
            zArr[i7] = z10;
            this.O.d(new x7(this, i7, z10, 1));
        }
    }

    public final void H() {
        v(this.J.b(), true);
    }

    public final void I(k0 k0Var) {
        e2.l1 b10;
        this.Z.f(1);
        int i7 = k0Var.a;
        int i10 = k0Var.b;
        int i11 = k0Var.c;
        x2.i1 i1Var = k0Var.d;
        f1 f1Var = this.J;
        ArrayList arrayList = f1Var.b;
        la.f(i7 >= 0 && i7 <= i10 && i10 <= arrayList.size() && i11 >= 0);
        f1Var.j = i1Var;
        if (i7 == i10 || i7 == i11) {
            b10 = f1Var.b();
        } else {
            int min = Math.min(i7, i11);
            int max = Math.max(((i10 - i7) + i11) - 1, i10 - 1);
            int i12 = ((e1) arrayList.get(min)).d;
            h2.l0.R(i7, i10, i11, arrayList);
            while (min <= max) {
                e1 e1Var = (e1) arrayList.get(min);
                e1Var.d = i12;
                i12 += e1Var.a.o.e.o();
                min++;
            }
            b10 = f1Var.b();
        }
        v(b10, false);
    }

    public final void J() {
        this.Z.f(1);
        O(false, false, false, true);
        h hVar = (h) this.f;
        ConcurrentHashMap concurrentHashMap = hVar.p;
        long id2 = Thread.currentThread().getId();
        long j3 = hVar.q;
        la.o("Players that share the same LoadControl must share the same playback thread. See ExoPlayer.Builder.setPlaybackLooper(Looper).", j3 == -1 || j3 == id2);
        hVar.q = id2;
        m2.i iVar = this.M;
        g gVar = (g) concurrentHashMap.get(iVar);
        if (gVar == null) {
            g gVar2 = new g();
            gVar2.a = 1;
            concurrentHashMap.put(iVar, gVar2);
        } else {
            gVar.a++;
        }
        g gVar3 = (g) concurrentHashMap.get(iVar);
        gVar3.getClass();
        Integer num = (Integer) hVar.o.get(iVar.a);
        int intValue = (num == null || num.intValue() == -1) ? hVar.l : num.intValue();
        if (intValue == -1) {
            intValue = 13107200;
        }
        gVar3.c = intValue;
        gVar3.b = false;
        o0(this.Y.a.p() ? 4 : 2);
        g1 g1Var = this.Y;
        boolean z10 = g1Var.l;
        B0(this.Q.d(g1Var.e, z10), g1Var.n, g1Var.m, z10);
        b3.g gVar4 = (b3.g) this.h;
        gVar4.getClass();
        f1 f1Var = this.J;
        ArrayList arrayList = f1Var.b;
        la.p(!f1Var.k);
        f1Var.l = gVar4;
        for (int i7 = 0; i7 < arrayList.size(); i7++) {
            e1 e1Var = (e1) arrayList.get(i7);
            f1Var.e(e1Var);
            f1Var.g.add(e1Var);
        }
        f1Var.k = true;
        this.n.f(2);
    }

    public final void K(h2.i iVar) {
        m6.n nVar = this.r;
        h2.i0 i0Var = this.n;
        try {
            O(true, false, true, false);
            L();
            q0 q0Var = this.f;
            m2.i iVar2 = this.M;
            h hVar = (h) q0Var;
            ConcurrentHashMap concurrentHashMap = hVar.p;
            g gVar = (g) concurrentHashMap.get(iVar2);
            if (gVar != null) {
                int i7 = gVar.a - 1;
                gVar.a = i7;
                if (i7 == 0) {
                    concurrentHashMap.remove(iVar2);
                    hVar.c();
                }
            }
            if (hVar.p.isEmpty()) {
                hVar.q = -1L;
            }
            f2.e eVar = this.Q;
            eVar.c = null;
            eVar.a();
            eVar.c(0);
            this.d.a();
            o0(1);
        } finally {
            i0Var.a.removeCallbacksAndMessages(null);
            nVar.g();
            iVar.e();
        }
    }

    public final void L() {
        for (int i7 = 0; i7 < this.a.length; i7++) {
            b bVar = this.b[i7];
            synchronized (bVar.a) {
                bVar.I = null;
            }
            n1 n1Var = this.a[i7];
            b bVar2 = n1Var.a;
            la.p(bVar2.n == 0);
            bVar2.q();
            n1Var.e = false;
            b bVar3 = n1Var.c;
            if (bVar3 != null) {
                la.p(bVar3.n == 0);
                bVar3.q();
                n1Var.f = false;
            }
        }
    }

    public final void M(int i7, int i10, x2.i1 i1Var) {
        this.Z.f(1);
        f1 f1Var = this.J;
        f1Var.getClass();
        la.f(i7 >= 0 && i7 <= i10 && i10 <= f1Var.b.size());
        f1Var.j = i1Var;
        f1Var.g(i7, i10);
        v(f1Var.b(), false);
    }

    /* JADX WARN: Removed duplicated region for block: B:62:0x0164  */
    /* JADX WARN: Removed duplicated region for block: B:65:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void N() {
        int i7;
        int i10;
        float f10 = this.E.j().a;
        w0 w0Var = this.I;
        u0 u0Var = w0Var.i;
        u0 u0Var2 = w0Var.j;
        a3.y yVar = null;
        u0 u0Var3 = u0Var;
        boolean z10 = true;
        while (u0Var3 != null && u0Var3.e) {
            g1 g1Var = this.Y;
            a3.y j3 = u0Var3.j(f10, g1Var.a, g1Var.l);
            a3.y yVar2 = u0Var3 == this.I.i ? j3 : yVar;
            a3.y yVar3 = u0Var3.o;
            a3.u[] uVarArr = j3.c;
            if (yVar3 != null && yVar3.c.length == uVarArr.length) {
                for (int i11 = 0; i11 < uVarArr.length; i11++) {
                    if (j3.a(yVar3, i11)) {
                    }
                }
                if (u0Var3 == u0Var2) {
                    z10 = false;
                }
                u0Var3 = u0Var3.m;
                yVar = yVar2;
            }
            if (z10) {
                w0 w0Var2 = this.I;
                u0 u0Var4 = w0Var2.i;
                boolean z11 = (w0Var2.n(u0Var4) & 1) != 0;
                boolean[] zArr = new boolean[this.a.length];
                yVar2.getClass();
                long a10 = u0Var4.a(yVar2, this.Y.s, z11, zArr);
                g1 g1Var2 = this.Y;
                boolean z12 = (g1Var2.e == 4 || a10 == g1Var2.s) ? false : true;
                g1 g1Var3 = this.Y;
                i7 = 4;
                this.Y = y(g1Var3.b, a10, g1Var3.c, g1Var3.d, z12, 5);
                if (z12) {
                    Q(a10, true);
                }
                g();
                boolean[] zArr2 = new boolean[this.a.length];
                int i12 = 0;
                while (true) {
                    n1[] n1VarArr = this.a;
                    if (i12 >= n1VarArr.length) {
                        break;
                    }
                    int c10 = n1VarArr[i12].c();
                    zArr2[i12] = this.a[i12].g();
                    n1 n1Var = this.a[i12];
                    x2.d1 d1Var = u0Var4.c[i12];
                    i iVar = this.E;
                    long j10 = this.n0;
                    boolean z13 = zArr[i12];
                    b bVar = n1Var.a;
                    if (n1.h(bVar)) {
                        if (d1Var != bVar.r) {
                            n1Var.a(bVar, iVar);
                        } else if (z13) {
                            bVar.z(j10, false, true);
                        }
                    }
                    b bVar2 = n1Var.c;
                    if (bVar2 != null && n1.h(bVar2)) {
                        if (d1Var != bVar2.r) {
                            n1Var.a(bVar2, iVar);
                        } else if (z13) {
                            bVar2.z(j10, false, true);
                        }
                    }
                    if (c10 - this.a[i12].c() > 0) {
                        G(i12, false);
                    }
                    this.l0 -= c10 - this.a[i12].c();
                    i12++;
                }
                k(this.n0, zArr2);
                u0Var4.h = true;
            } else {
                i7 = 4;
                this.I.n(u0Var3);
                if (u0Var3.e) {
                    long max = Math.max(u0Var3.g.b, this.n0 - u0Var3.p);
                    if (this.P && d() && this.I.k == u0Var3) {
                        g();
                    }
                    i10 = 4;
                    u0Var3.a(j3, max, false, new boolean[u0Var3.j.length]);
                    u(true);
                    if (this.Y.e == i10) {
                        C();
                        C0();
                        this.n.f(2);
                        return;
                    }
                    return;
                }
            }
            i10 = i7;
            u(true);
            if (this.Y.e == i10) {
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0137  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x013e  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0148  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0152  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0180  */
    /* JADX WARN: Removed duplicated region for block: B:91:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0159  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x014d  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0143  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0139  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x00ca  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void O(boolean z10, boolean z11, boolean z12, boolean z13) {
        long j3;
        long j10;
        long j11;
        boolean z14;
        e2.l1 l1Var;
        e2.l1 l1Var2;
        x2.g0 g0Var;
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
        iVar.b = false;
        q1 q1Var = (q1) iVar.c;
        if (q1Var.c) {
            q1Var.c(q1Var.a());
            q1Var.c = false;
        }
        this.n0 = 1000000000000L;
        for (int i7 = 0; i7 < this.a.length; i7++) {
            try {
                h(i7);
            } catch (RuntimeException e10) {
                e = e10;
                h2.a.d("ExoPlayerImplInternal", "Disable failed.", e);
                if (z10) {
                }
                this.l0 = 0;
                g1 g1Var = this.Y;
                x2.g0 g0Var2 = g1Var.b;
                long j12 = g1Var.s;
                if (!this.Y.b.b()) {
                }
                j3 = this.Y.c;
                if (z11) {
                }
                this.I.b();
                this.f0 = false;
                l1Var = this.Y.a;
                if (z12) {
                }
                l1Var2 = l1Var;
                g0Var = g0Var2;
                g1 g1Var2 = this.Y;
                int i10 = g1Var2.e;
                if (z13) {
                }
                r1 r1Var = z14 ? r1.d : g1Var2.h;
                a3.y yVar = z14 ? this.e : g1Var2.i;
                if (z14) {
                }
                this.Y = new g1(l1Var2, g0Var, j11, j10, i10, r14, false, r1Var, yVar, list, g0Var, g1Var2.l, g1Var2.m, g1Var2.n, g1Var2.o, j10, 0L, j10, 0L, false);
                if (z12) {
                }
            } catch (l e11) {
                e = e11;
                h2.a.d("ExoPlayerImplInternal", "Disable failed.", e);
                if (z10) {
                }
                this.l0 = 0;
                g1 g1Var3 = this.Y;
                x2.g0 g0Var22 = g1Var3.b;
                long j122 = g1Var3.s;
                if (!this.Y.b.b()) {
                }
                j3 = this.Y.c;
                if (z11) {
                }
                this.I.b();
                this.f0 = false;
                l1Var = this.Y.a;
                if (z12) {
                }
                l1Var2 = l1Var;
                g0Var = g0Var22;
                g1 g1Var22 = this.Y;
                int i102 = g1Var22.e;
                if (z13) {
                }
                r1 r1Var2 = z14 ? r1.d : g1Var22.h;
                a3.y yVar2 = z14 ? this.e : g1Var22.i;
                if (z14) {
                }
                this.Y = new g1(l1Var2, g0Var, j11, j10, i102, r14, false, r1Var2, yVar2, list, g0Var, g1Var22.l, g1Var22.m, g1Var22.n, g1Var22.o, j10, 0L, j10, 0L, false);
                if (z12) {
                }
            }
        }
        this.u0 = -9223372036854775807L;
        if (z10) {
            for (n1 n1Var : this.a) {
                try {
                    n1Var.k();
                } catch (RuntimeException e12) {
                    h2.a.d("ExoPlayerImplInternal", "Reset failed.", e12);
                }
            }
        }
        this.l0 = 0;
        g1 g1Var32 = this.Y;
        x2.g0 g0Var222 = g1Var32.b;
        long j1222 = g1Var32.s;
        if (!this.Y.b.b()) {
            g1 g1Var4 = this.Y;
            e2.i1 i1Var = this.x;
            x2.g0 g0Var3 = g1Var4.b;
            e2.l1 l1Var3 = g1Var4.a;
            if (!l1Var3.p() && !l1Var3.g(g0Var3.a, i1Var).f) {
                j3 = this.Y.s;
                if (z11) {
                    j10 = j1222;
                    j11 = j3;
                    z14 = false;
                } else {
                    this.m0 = null;
                    Pair o4 = o(this.Y.a);
                    g0Var222 = (x2.g0) o4.first;
                    long longValue = ((Long) o4.second).longValue();
                    z14 = g0Var222.equals(this.Y.b) ? false : true;
                    j10 = longValue;
                    j11 = -9223372036854775807L;
                }
                this.I.b();
                this.f0 = false;
                l1Var = this.Y.a;
                if (z12 || !(l1Var instanceof l1)) {
                    l1Var2 = l1Var;
                } else {
                    l1 l1Var4 = (l1) l1Var;
                    x2.i1 i1Var2 = this.J.j;
                    e2.l1[] l1VarArr = l1Var4.l;
                    e2.l1[] l1VarArr2 = new e2.l1[l1VarArr.length];
                    for (int i11 = 0; i11 < l1VarArr.length; i11++) {
                        l1VarArr2[i11] = new k1(l1VarArr[i11]);
                    }
                    l1Var2 = new l1(l1VarArr2, l1Var4.m, i1Var2);
                    if (g0Var222.b != -1) {
                        l1Var2.g(g0Var222.a, this.x);
                        int i12 = this.x.c;
                        e2.k1 k1Var = this.w;
                        l1Var2.m(i12, k1Var, 0L);
                        if (k1Var.a()) {
                            g0Var = new x2.g0(g0Var222.a, g0Var222.d);
                            g1 g1Var222 = this.Y;
                            int i1022 = g1Var222.e;
                            l lVar = z13 ? null : g1Var222.f;
                            r1 r1Var22 = z14 ? r1.d : g1Var222.h;
                            a3.y yVar22 = z14 ? this.e : g1Var222.i;
                            if (z14) {
                                h9.g0 g0Var4 = h9.i0.b;
                                list = t1.e;
                            } else {
                                list = g1Var222.j;
                            }
                            this.Y = new g1(l1Var2, g0Var, j11, j10, i1022, lVar, false, r1Var22, yVar22, list, g0Var, g1Var222.l, g1Var222.m, g1Var222.n, g1Var222.o, j10, 0L, j10, 0L, false);
                            if (z12) {
                                w0 w0Var = this.I;
                                if (!w0Var.q.isEmpty()) {
                                    ArrayList arrayList = new ArrayList();
                                    for (int i13 = 0; i13 < w0Var.q.size(); i13++) {
                                        ((u0) w0Var.q.get(i13)).i();
                                    }
                                    w0Var.q = arrayList;
                                    w0Var.m = null;
                                    w0Var.k();
                                }
                                f1 f1Var = this.J;
                                HashMap hashMap = f1Var.f;
                                for (d1 d1Var : hashMap.values()) {
                                    try {
                                        d1Var.a.p(d1Var.b);
                                    } catch (RuntimeException e13) {
                                        h2.a.d("MediaSourceList", "Failed to release child source.", e13);
                                    }
                                    x2.a aVar = d1Var.a;
                                    c1 c1Var = d1Var.c;
                                    aVar.s(c1Var);
                                    d1Var.a.r(c1Var);
                                }
                                hashMap.clear();
                                f1Var.g.clear();
                                f1Var.k = false;
                                return;
                            }
                            return;
                        }
                    }
                }
                g0Var = g0Var222;
                g1 g1Var2222 = this.Y;
                int i10222 = g1Var2222.e;
                if (z13) {
                }
                r1 r1Var222 = z14 ? r1.d : g1Var2222.h;
                a3.y yVar222 = z14 ? this.e : g1Var2222.i;
                if (z14) {
                }
                this.Y = new g1(l1Var2, g0Var, j11, j10, i10222, lVar, false, r1Var222, yVar222, list, g0Var, g1Var2222.l, g1Var2222.m, g1Var2222.n, g1Var2222.o, j10, 0L, j10, 0L, false);
                if (z12) {
                }
            }
        }
        j3 = this.Y.c;
        if (z11) {
        }
        this.I.b();
        this.f0 = false;
        l1Var = this.Y.a;
        if (z12) {
        }
        l1Var2 = l1Var;
        g0Var = g0Var222;
        g1 g1Var22222 = this.Y;
        int i102222 = g1Var22222.e;
        if (z13) {
        }
        r1 r1Var2222 = z14 ? r1.d : g1Var22222.h;
        a3.y yVar2222 = z14 ? this.e : g1Var22222.i;
        if (z14) {
        }
        this.Y = new g1(l1Var2, g0Var, j11, j10, i102222, lVar, false, r1Var2222, yVar2222, list, g0Var, g1Var22222.l, g1Var22222.m, g1Var22222.n, g1Var22222.o, j10, 0L, j10, 0L, false);
        if (z12) {
        }
    }

    public final void P() {
        u0 u0Var = this.I.i;
        this.c0 = u0Var != null && u0Var.g.j && this.b0;
    }

    public final void Q(long j3, boolean z10) {
        u0 u0Var = this.I.i;
        long j10 = j3 + (u0Var == null ? 1000000000000L : u0Var.p);
        this.n0 = j10;
        ((q1) this.E.c).c(j10);
        for (n1 n1Var : this.a) {
            long j11 = this.n0;
            b d = n1Var.d(u0Var);
            if (d != null) {
                d.z(j11, false, z10);
            }
        }
        for (u0 u0Var2 = r0.i; u0Var2 != null; u0Var2 = u0Var2.m) {
            for (a3.u uVar : u0Var2.o.c) {
                if (uVar != null) {
                    uVar.s();
                }
            }
        }
    }

    public final void R(e2.l1 l1Var, e2.l1 l1Var2) {
        if (l1Var.p() && l1Var2.p()) {
            return;
        }
        ArrayList arrayList = this.F;
        int size = arrayList.size() - 1;
        if (size < 0) {
            Collections.sort(arrayList);
        } else {
            a8.p0.A(arrayList.get(size));
            throw null;
        }
    }

    public final void U(long j3) {
        boolean z10 = this.U;
        long j10 = x0;
        if (z10) {
            this.T.getClass();
            r2 = this.Y.e != 3 ? j10 : 1000L;
            for (n1 n1Var : this.a) {
                long j11 = this.n0;
                long j12 = this.o0;
                b bVar = n1Var.c;
                b bVar2 = n1Var.a;
                long g10 = n1.h(bVar2) ? bVar2.g(j11, j12) : Long.MAX_VALUE;
                if (bVar != null && bVar.n != 0) {
                    g10 = Math.min(g10, bVar.g(j11, j12));
                }
                r2 = Math.min(r2, h2.l0.h0(g10));
            }
            if (this.Y.m()) {
                u0 u0Var = this.I.i;
                if ((u0Var != null ? u0Var.m : null) != null) {
                    if ((h2.l0.S(r2) * this.Y.o.a) + this.n0 >= r1.e()) {
                        r2 = Math.min(r2, j10);
                    }
                }
            }
        } else if (this.Y.e != 3 || s0()) {
            r2 = j10;
        }
        this.n.a.sendEmptyMessageAtTime(2, j3 + r2);
    }

    public final void V(boolean z10) {
        x2.g0 g0Var = this.I.i.g.a;
        long X = X(g0Var, this.Y.s, true, false);
        if (X != this.Y.s) {
            g1 g1Var = this.Y;
            this.Y = y(g0Var, X, g1Var.c, g1Var.d, z10, 5);
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(5:27|(20:(9:72|73|(1:96)(3:79|(1:83)|84)|85|(1:95)|92|93|19|20)(1:29)|34|35|(1:37)(1:65)|38|39|(1:41)|42|43|44|45|46|47|48|49|50|51|18|19|20)|30|31|(1:33)(1:69)) */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x0192, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Type inference failed for: r0v18, types: [java.lang.Object, x2.e0] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void W(n0 n0Var) {
        long longValue;
        long j3;
        x2.g0 p10;
        long j10;
        boolean z10;
        boolean z11;
        x2.g0 g0Var;
        long j11;
        boolean z12;
        long j12;
        long j13;
        g1 g1Var;
        int i7;
        long j14;
        int i10;
        long j15;
        x2.g0 g0Var2;
        long j16;
        boolean z13;
        long j17;
        boolean z14;
        long X;
        g1 g1Var2;
        x2.g0 g0Var3;
        e2.l1 l1Var;
        long j18;
        o0 o0Var = this;
        if (o0Var.V) {
            if (o0Var.W != null) {
                o0Var.X++;
                o0Var.Z.f(1);
            }
            o0Var.W = n0Var;
            return;
        }
        o0Var.Z.f(1);
        Pair S = S(o0Var.Y.a, n0Var, true, o0Var.g0, o0Var.h0, o0Var.w, o0Var.x);
        if (S == null) {
            Pair o4 = o0Var.o(o0Var.Y.a);
            p10 = (x2.g0) o4.first;
            longValue = ((Long) o4.second).longValue();
            z10 = !o0Var.Y.a.p();
            j10 = 0;
            j3 = -9223372036854775807L;
        } else {
            Object obj = S.first;
            longValue = ((Long) S.second).longValue();
            j3 = n0Var.c == -9223372036854775807L ? -9223372036854775807L : longValue;
            p10 = o0Var.I.p(o0Var.Y.a, obj, longValue);
            if (p10.b()) {
                o0Var.Y.a.g(p10.a, o0Var.x);
                if (o0Var.x.e(p10.b) == p10.c) {
                    o0Var.x.g.getClass();
                }
                o0Var.x.g.a(p10.b).getClass();
                j3 = Math.max(j3, 0L);
                longValue = 0;
                j10 = 0;
            } else {
                j10 = 0;
                if (n0Var.c != -9223372036854775807L) {
                    z10 = false;
                }
            }
            z10 = true;
        }
        try {
            try {
                if (o0Var.Y.a.p()) {
                    o0Var.m0 = n0Var;
                } else if (S == null) {
                    if (o0Var.Y.e != 1) {
                        o0Var.o0(4);
                    }
                    o0Var.O(false, true, false, true);
                } else {
                    try {
                        try {
                            try {
                                try {
                                    if (p10.equals(o0Var.Y.b)) {
                                        try {
                                            u0 u0Var = o0Var.I.i;
                                            if (u0Var == null || !u0Var.e || longValue == j10) {
                                                j13 = longValue;
                                            } else {
                                                ?? r02 = u0Var.a;
                                                long j19 = o0Var.w.m;
                                                if (o0Var.U && j19 != -9223372036854775807L) {
                                                    o0Var.T.getClass();
                                                }
                                                j13 = r02.f(longValue, o0Var.S);
                                            }
                                            if (h2.l0.h0(j13) != h2.l0.h0(o0Var.Y.s) || ((i7 = (g1Var = o0Var.Y).e) != 2 && i7 != 3)) {
                                                z11 = z10;
                                                g0Var = p10;
                                            }
                                            j14 = g1Var.s;
                                            i10 = 2;
                                            j15 = j14;
                                            z12 = z10;
                                            g0Var2 = p10;
                                            j16 = j3;
                                            o0Var.Y = o0Var.y(g0Var2, j14, j16, j15, z12, i10);
                                        } catch (Throwable th2) {
                                            th = th2;
                                            boolean z15 = z10;
                                            g0Var = p10;
                                            z12 = z15;
                                            j12 = longValue;
                                            j11 = j3;
                                            o0Var.Y = o0Var.y(g0Var, j12, j11, j12, z12, 2);
                                            throw th;
                                        }
                                    }
                                    z11 = z10;
                                    g0Var = p10;
                                    j13 = longValue;
                                    o0Var.D0(l1Var, g0Var3, l1Var, g1Var2.b, j18, true);
                                    g0Var2 = g0Var3;
                                    j16 = j18;
                                    j14 = X;
                                    i10 = 2;
                                    j15 = j14;
                                    o0Var = this;
                                    o0Var.Y = o0Var.y(g0Var2, j14, j16, j15, z12, i10);
                                } catch (Throwable th3) {
                                    th = th3;
                                    g0Var = g0Var3;
                                    j11 = j18;
                                    j12 = X;
                                    o0Var.Y = o0Var.y(g0Var, j12, j11, j12, z12, 2);
                                    throw th;
                                }
                                l1Var = g1Var2.a;
                                j18 = j3;
                            } catch (Throwable th4) {
                                th = th4;
                                g0Var = g0Var3;
                                j11 = j3;
                                j12 = X;
                                o0Var.Y = o0Var.y(g0Var, j12, j11, j12, z12, 2);
                                throw th;
                            }
                            g1Var2 = o0Var.Y;
                            g0Var3 = g0Var;
                        } catch (Throwable th5) {
                            th = th5;
                        }
                        w0 w0Var = o0Var.I;
                        if (w0Var.i != w0Var.j) {
                            j17 = j13;
                            z14 = true;
                        } else {
                            j17 = j13;
                            z14 = false;
                        }
                        X = o0Var.X(g0Var, j17, z14, z13);
                        z12 = (longValue != X) | z11;
                    } catch (Throwable th6) {
                        th = th6;
                        j11 = j3;
                        z12 = z11;
                        j12 = longValue;
                        o0Var.Y = o0Var.y(g0Var, j12, j11, j12, z12, 2);
                        throw th;
                    }
                    z13 = o0Var.Y.e == 4;
                }
                z12 = z10;
                g0Var2 = p10;
                j14 = longValue;
                j16 = j3;
                i10 = 2;
                j15 = j14;
                o0Var = this;
                o0Var.Y = o0Var.y(g0Var2, j14, j16, j15, z12, i10);
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

    /* JADX WARN: Type inference failed for: r10v15, types: [java.lang.Object, x2.e0] */
    /* JADX WARN: Type inference failed for: r10v16, types: [java.lang.Object, x2.e0] */
    /* JADX WARN: Type inference failed for: r10v25, types: [java.lang.Object, x2.e0] */
    /* JADX WARN: Type inference failed for: r10v26, types: [java.lang.Object, x2.e0] */
    public final long X(x2.g0 g0Var, long j3, boolean z10, boolean z11) {
        w0 w0Var;
        int i7;
        w0();
        boolean z12 = true;
        E0(false, true);
        if (z11 || this.Y.e == 3) {
            o0(2);
        }
        u0 u0Var = this.I.i;
        u0 u0Var2 = u0Var;
        while (u0Var2 != null && !g0Var.equals(u0Var2.g.a)) {
            u0Var2 = u0Var2.m;
        }
        if (z10 || u0Var != u0Var2 || (u0Var2 != null && u0Var2.p + j3 < 0)) {
            for (int i10 = 0; i10 < this.a.length; i10++) {
                h(i10);
            }
            this.u0 = -9223372036854775807L;
            if (u0Var2 != null) {
                while (true) {
                    w0Var = this.I;
                    if (w0Var.i == u0Var2) {
                        break;
                    }
                    w0Var.a();
                }
                w0Var.n(u0Var2);
                u0Var2.p = 1000000000000L;
                k(this.I.j.e(), new boolean[this.a.length]);
                u0Var2.h = true;
            }
        }
        g();
        if (this.U) {
            for (n1 n1Var : this.a) {
                if (n1Var.g() && ((i7 = n1Var.a.b) == 2 || i7 == 4)) {
                    this.V = true;
                    break;
                }
            }
        }
        if (u0Var2 != null) {
            this.I.n(u0Var2);
            if (!u0Var2.e) {
                u0Var2.g = u0Var2.g.b(j3, -9223372036854775807L);
            } else if (u0Var2.f) {
                if (this.U) {
                    this.T.getClass();
                    if (!this.Y.a.p() && u0Var2.g.a.equals(this.Y.b)) {
                        long j10 = u0Var2.p + j3;
                        boolean z13 = true;
                        for (n1 n1Var2 : this.a) {
                            if (n1Var2.g()) {
                                b d = n1Var2.d(u0Var2);
                                z13 &= d != null && d.E(j10);
                            }
                        }
                        if (z13) {
                            ?? r10 = u0Var2.a;
                            long j11 = this.Y.s;
                            p1 p1Var = p1.e;
                            if (r10.f(j11, p1Var) == u0Var2.a.f(j3, p1Var)) {
                                z12 = false;
                            }
                        }
                    }
                }
                j3 = u0Var2.a.k(j3);
                u0Var2.a.n(j3 - this.y);
            }
            Q(j3, z12);
            C();
        } else {
            this.I.b();
            Q(j3, true);
        }
        u(false);
        this.n.f(2);
        return j3;
    }

    public final void Y(j1 j1Var) {
        j1Var.getClass();
        Looper looper = j1Var.e;
        Looper looper2 = this.s;
        h2.i0 i0Var = this.n;
        if (looper != looper2) {
            i0Var.b(15, j1Var).b();
            return;
        }
        f(j1Var);
        int i7 = this.Y.e;
        if (i7 == 3 || i7 == 2) {
            i0Var.f(2);
        }
    }

    public final void Z(j1 j1Var) {
        Looper looper = j1Var.e;
        if (looper.getThread().isAlive()) {
            this.G.a(looper, null).d(new kg.i0(this, j1Var));
        } else {
            h2.a.l("TAG", "Trying to send message on a dead thread.");
            j1Var.a(false);
        }
    }

    @Override // d3.v
    public final void a(long j3, long j10, e2.u uVar, MediaFormat mediaFormat) {
        if (this.V) {
            this.n.a(37).b();
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x003b, code lost:
    
        if (r7.a == 1) goto L20;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a0(e2.e eVar, boolean z10) {
        int i7;
        a3.s sVar = (a3.s) this.d;
        if (!sVar.j.equals(eVar)) {
            sVar.j = eVar;
            sVar.k();
        }
        if (!z10) {
            eVar = null;
        }
        f2.e eVar2 = this.Q;
        if (!Objects.equals(eVar2.d, eVar)) {
            eVar2.d = eVar;
            if (eVar != null) {
                int i10 = eVar.c;
                i7 = 3;
                switch (i10) {
                    case 0:
                        h2.a.l("AudioFocusManager", "Specify a proper usage in the audio attributes for audio focus handling. Using AUDIOFOCUS_GAIN by default.");
                        i7 = 1;
                        break;
                    case 1:
                    case 14:
                        i7 = 1;
                        break;
                    case 2:
                    case 4:
                        i7 = 2;
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
                        e2.o(i10, "Unidentified audio usage: ", "AudioFocusManager");
                        break;
                    case 16:
                        i7 = 4;
                        break;
                }
                eVar2.f = i7;
                la.e("Automatic handling of audio focus is only available for USAGE_MEDIA and USAGE_GAME.", i7 != 1 || i7 == 0);
            }
            i7 = 0;
            eVar2.f = i7;
            la.e("Automatic handling of audio focus is only available for USAGE_MEDIA and USAGE_GAME.", i7 != 1 || i7 == 0);
        }
        g1 g1Var = this.Y;
        boolean z11 = g1Var.l;
        B0(eVar2.d(g1Var.e, z11), g1Var.n, g1Var.m, z11);
    }

    public final void b(j0 j0Var, int i7) {
        this.Z.f(1);
        f1 f1Var = this.J;
        if (i7 == -1) {
            i7 = f1Var.b.size();
        }
        v(f1Var.a(i7, j0Var.a, j0Var.b), false);
    }

    public final void b0(boolean z10, h2.i iVar) {
        if (this.i0 != z10) {
            this.i0 = z10;
            if (!z10) {
                for (n1 n1Var : this.a) {
                    n1Var.k();
                }
            }
        }
        if (iVar != null) {
            iVar.e();
        }
    }

    public final void c() {
        for (n1 n1Var : this.a) {
            o1 o1Var = this.U ? this.T : null;
            n1Var.a.c(18, o1Var);
            b bVar = n1Var.c;
            if (bVar != null) {
                bVar.c(18, o1Var);
            }
        }
    }

    @Override // x2.e1
    public final void c0(x2.f1 f1Var) {
        this.n.b(9, (x2.e0) f1Var).b();
    }

    public final boolean d() {
        if (!this.P) {
            return false;
        }
        for (n1 n1Var : this.a) {
            if (n1Var.f()) {
                return true;
            }
        }
        return false;
    }

    public final void d0(h0 h0Var) {
        for (n1 n1Var : this.a) {
            b bVar = n1Var.a;
            if (bVar.b == 4) {
                bVar.c(23, h0Var);
                b bVar2 = n1Var.c;
                if (bVar2 != null) {
                    bVar2.c(23, h0Var);
                }
            }
        }
    }

    public final void e() {
        N();
        V(true);
    }

    public final void e0(j0 j0Var) {
        this.Z.f(1);
        int i7 = j0Var.c;
        x2.i1 i1Var = j0Var.b;
        ArrayList arrayList = j0Var.a;
        if (i7 != -1) {
            this.m0 = new n0(new l1(arrayList, i1Var), j0Var.c, j0Var.d);
        }
        f1 f1Var = this.J;
        ArrayList arrayList2 = f1Var.b;
        f1Var.g(0, arrayList2.size());
        v(f1Var.a(arrayList2.size(), arrayList, i1Var), false);
    }

    public final void f0(boolean z10) {
        this.b0 = z10;
        P();
        if (this.c0) {
            w0 w0Var = this.I;
            if (w0Var.j != w0Var.i) {
                V(true);
                u(false);
            }
        }
    }

    public final void g() {
        b bVar;
        if (this.P && d()) {
            for (n1 n1Var : this.a) {
                int c10 = n1Var.c();
                i iVar = this.E;
                if (n1Var.f()) {
                    int i7 = n1Var.d;
                    boolean z10 = i7 == 4 || i7 == 2;
                    int i10 = i7 != 4 ? 0 : 1;
                    if (z10) {
                        try {
                            bVar = n1Var.a;
                        } catch (RuntimeException e10) {
                            h2.a.d("RendererHolder", "Disable prewarming failed.", e10);
                        }
                    } else {
                        bVar = n1Var.c;
                        bVar.getClass();
                    }
                    n1Var.a(bVar, iVar);
                    try {
                        n1Var.i(z10);
                    } catch (RuntimeException e11) {
                        h2.a.d("RendererHolder", "Reset prewarming failed.", e11);
                    }
                    n1Var.d = i10;
                }
                this.l0 -= c10 - n1Var.c();
            }
            this.u0 = -9223372036854775807L;
        }
    }

    public final void g0(e2.w0 w0Var) {
        this.n.e(16);
        i iVar = this.E;
        iVar.e(w0Var);
        e2.w0 j3 = iVar.j();
        x(j3, j3.a, true, true);
    }

    public final void h(int i7) {
        n1[] n1VarArr = this.a;
        int c10 = n1VarArr[i7].c();
        n1 n1Var = n1VarArr[i7];
        b bVar = n1Var.a;
        i iVar = this.E;
        n1Var.a(bVar, iVar);
        b bVar2 = n1Var.c;
        if (bVar2 != null) {
            boolean z10 = (bVar2.n == 0 || n1Var.d == 3) ? false : true;
            n1Var.a(bVar2, iVar);
            n1Var.i(false);
            if (z10) {
                b bVar3 = n1Var.a;
                bVar2.getClass();
                bVar2.c(17, bVar3);
            }
        }
        n1Var.d = 0;
        G(i7, false);
        this.l0 -= c10;
    }

    public final void h0(o oVar) {
        this.t0 = oVar;
        e2.l1 l1Var = this.Y.a;
        w0 w0Var = this.I;
        w0Var.getClass();
        oVar.getClass();
        if (w0Var.q.isEmpty()) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (int i7 = 0; i7 < w0Var.q.size(); i7++) {
            ((u0) w0Var.q.get(i7)).i();
        }
        w0Var.q = arrayList;
        w0Var.m = null;
        w0Var.k();
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        int i7;
        u0 u0Var;
        x2.g0 g0Var;
        u0 u0Var2;
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
                    i();
                    break;
                case 3:
                    W((n0) message.obj);
                    break;
                case 4:
                    g0((e2.w0) message.obj);
                    break;
                case 5:
                    l0((p1) message.obj);
                    break;
                case 6:
                    v0(false, true);
                    break;
                case 7:
                    K((h2.i) message.obj);
                    return true;
                case 8:
                    w((x2.e0) message.obj);
                    break;
                case 9:
                    s((x2.e0) message.obj);
                    break;
                case 10:
                    N();
                    break;
                case 11:
                    i0(message.arg1);
                    break;
                case 12:
                    m0(message.arg1 != 0);
                    break;
                case 13:
                    b0(message.arg1 != 0, (h2.i) message.obj);
                    break;
                case 14:
                    Y((j1) message.obj);
                    break;
                case 15:
                    Z((j1) message.obj);
                    break;
                case 16:
                    e2.w0 w0Var = (e2.w0) message.obj;
                    x(w0Var, w0Var.a, true, false);
                    break;
                case 17:
                    e0((j0) message.obj);
                    break;
                case 18:
                    b((j0) message.obj, message.arg1);
                    break;
                case 19:
                    I((k0) message.obj);
                    break;
                case 20:
                    M(message.arg1, message.arg2, (x2.i1) message.obj);
                    break;
                case 21:
                    n0((x2.i1) message.obj);
                    break;
                case 22:
                    H();
                    break;
                case 23:
                    f0(message.arg1 != 0);
                    break;
                case 24:
                default:
                    return false;
                case 25:
                    e();
                    break;
                case 26:
                    N();
                    V(true);
                    break;
                case 27:
                    z0((List) message.obj, message.arg1, message.arg2);
                    break;
                case 28:
                    h0((o) message.obj);
                    break;
                case 29:
                    J();
                    break;
                case ls.T /* 30 */:
                    Pair pair = (Pair) message.obj;
                    q0(pair.first, (h2.i) pair.second);
                    break;
                case ls.U /* 31 */:
                    a0((e2.e) message.obj, message.arg1 != 0);
                    break;
                case 32:
                    r0(((Float) message.obj).floatValue());
                    break;
                case 33:
                    q(message.arg1);
                    break;
                case 34:
                    r();
                    break;
                case 35:
                    p0((d3.v) message.obj);
                    break;
                case 36:
                    j0(((Boolean) message.obj).booleanValue());
                    break;
                case 37:
                    this.V = false;
                    n0 n0Var = this.W;
                    if (n0Var != null) {
                        W(n0Var);
                        this.W = null;
                        break;
                    }
                    break;
                case 38:
                    k0((o1) message.obj);
                    break;
                case 39:
                    d0((h0) message.obj);
                    break;
            }
        } catch (e2.t0 e10) {
            boolean z11 = e10.a;
            int i12 = e10.b;
            if (i12 == 1) {
                i10 = z11 ? 3001 : 3003;
            } else {
                if (i12 == 4) {
                    i10 = z11 ? 3002 : 3004;
                }
                t(e10, r3);
            }
            r3 = i10;
            t(e10, r3);
        } catch (j2.j e11) {
            t(e11, e11.a);
        } catch (IOException e12) {
            t(e12, 2000);
        } catch (RuntimeException e13) {
            l lVar = new l(2, e13, ((e13 instanceof IllegalStateException) || (e13 instanceof IllegalArgumentException)) ? 1004 : 1000);
            h2.a.d("ExoPlayerImplInternal", "Playback error", lVar);
            v0(true, false);
            this.Y = this.Y.f(lVar);
        } catch (l e14) {
            e = e14;
            int i13 = e.s;
            w0 w0Var2 = this.I;
            if (i13 == 1 && (u0Var2 = w0Var2.j) != null && e.F == null) {
                e = e.a(u0Var2.g.a);
            }
            int i14 = e.s;
            h2.i0 i0Var = this.n;
            if (i14 == 1 && (g0Var = e.F) != null && A(e.x, g0Var)) {
                this.v0 = true;
                g();
                u0 g10 = w0Var2.g();
                u0 u0Var3 = w0Var2.i;
                if (u0Var3 != g10) {
                    while (u0Var3 != null) {
                        u0 u0Var4 = u0Var3.m;
                        if (u0Var4 == g10) {
                            break;
                        }
                        u0Var3 = u0Var4;
                    }
                }
                w0Var2.n(u0Var3);
                if (this.Y.e != 4) {
                    C();
                    i0Var.f(2);
                }
            } else {
                l lVar2 = this.r0;
                if (lVar2 != null) {
                    lVar2.addSuppressed(e);
                    e = this.r0;
                }
                if (e.s == 1 && w0Var2.i != w0Var2.j) {
                    while (true) {
                        u0Var = w0Var2.i;
                        if (u0Var == w0Var2.j) {
                            break;
                        }
                        w0Var2.a();
                    }
                    la.l(u0Var);
                    E();
                    v0 v0Var = u0Var.g;
                    x2.g0 g0Var2 = v0Var.a;
                    long j3 = v0Var.b;
                    this.Y = y(g0Var2, j3, v0Var.d, j3, true, 0);
                }
                if (e.G && (this.r0 == null || (i7 = e.a) == 5004 || i7 == 5003)) {
                    h2.a.m("ExoPlayerImplInternal", "Recoverable renderer error", e);
                    if (this.r0 == null) {
                        this.r0 = e;
                    }
                    h2.h0 b10 = i0Var.b(25, e);
                    Handler handler = i0Var.a;
                    Message message2 = b10.a;
                    message2.getClass();
                    handler.sendMessageAtFrontOfQueue(message2);
                    b10.a();
                } else {
                    h2.a.d("ExoPlayerImplInternal", "Playback error", e);
                    v0(true, false);
                    this.Y = this.Y.f(e);
                }
            }
        } catch (q2.f e15) {
            t(e15, e15.a);
        } catch (x2.b e16) {
            t(e16, 1002);
        }
        E();
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:232:0x023c, code lost:
    
        if (r6 >= r4.c) goto L94;
     */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0311  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0348  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0356  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0364  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x036f  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x0319  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x0246  */
    /* JADX WARN: Removed duplicated region for block: B:214:0x01f0  */
    /* JADX WARN: Removed duplicated region for block: B:218:0x0203  */
    /* JADX WARN: Removed duplicated region for block: B:224:0x0215  */
    /* JADX WARN: Removed duplicated region for block: B:226:0x021b  */
    /* JADX WARN: Removed duplicated region for block: B:238:0x0218  */
    /* JADX WARN: Removed duplicated region for block: B:240:0x01f8  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00d9 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:85:0x02d4  */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Object, x2.e0] */
    /* JADX WARN: Type inference failed for: r7v19, types: [java.lang.Object, x2.e0] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void i() {
        boolean z10;
        boolean z11;
        long j3;
        boolean z12;
        boolean z13;
        long j10;
        boolean z14;
        int i7;
        boolean z15;
        g1 g1Var;
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
        u0 u0Var = this.I.i;
        if (u0Var == null) {
            U(uptimeMillis);
            return;
        }
        Trace.beginSection("doSomeWork");
        C0();
        if (u0Var.e) {
            this.G.getClass();
            this.o0 = h2.l0.S(SystemClock.elapsedRealtime());
            u0Var.a.n(this.Y.s - this.y);
            z10 = true;
            z11 = true;
            int i12 = 0;
            while (true) {
                n1[] n1VarArr = this.a;
                if (i12 >= n1VarArr.length) {
                    break;
                }
                n1 n1Var = n1VarArr[i12];
                if (n1Var.c() == 0) {
                    G(i12, false);
                } else {
                    long j11 = this.n0;
                    long j12 = this.o0;
                    b bVar = n1Var.c;
                    b bVar2 = n1Var.a;
                    if (n1.h(bVar2)) {
                        bVar2.x(j11, j12);
                    }
                    if (bVar != null && bVar.n != 0) {
                        bVar.x(j11, j12);
                    }
                    if (z10) {
                        b bVar3 = n1Var.c;
                        b bVar4 = n1Var.a;
                        boolean l10 = n1.h(bVar4) ? bVar4.l() : true;
                        if (bVar3 != null && bVar3.n != 0) {
                            l10 &= bVar3.l();
                        }
                        if (l10) {
                            z10 = true;
                            b d = n1Var.d(u0Var);
                            z16 = d != null || d.k() || d.m() || d.l();
                            G(i12, z16);
                            z11 = !z11 && z16;
                            if (z16) {
                                F(i12);
                            }
                        }
                    }
                    z10 = false;
                    b d2 = n1Var.d(u0Var);
                    if (d2 != null) {
                    }
                    G(i12, z16);
                    if (z11) {
                    }
                    if (z16) {
                    }
                }
                i12++;
            }
        } else {
            u0Var.a.i();
            z10 = true;
            z11 = true;
        }
        long j13 = u0Var.g.f;
        boolean z17 = z10 && u0Var.e && (j13 == -9223372036854775807L || j13 <= this.Y.s);
        if (z17 && this.c0) {
            this.c0 = false;
            int i13 = this.Y.n;
            this.Z.f(0);
            B0(this.Q.d(this.Y.e, false), i13, 5, false);
        }
        if (!z17 || !u0Var.g.k) {
            g1 g1Var2 = this.Y;
            if (g1Var2.e == 2) {
                w0 w0Var = this.I;
                if (this.l0 == 0) {
                    z14 = B();
                } else if (z11) {
                    if (g1Var2.g) {
                        u0 u0Var2 = w0Var.i;
                        long j14 = t0(g1Var2.a, u0Var2.g.a) ? this.K.h : -9223372036854775807L;
                        u0 u0Var3 = w0Var.l;
                        boolean z18 = u0Var3.g() && u0Var3.g.k;
                        boolean z19 = u0Var3.g.a.b() && !u0Var3.e;
                        if (!z18 && !z19) {
                            long p10 = p(u0Var3.d());
                            q0 q0Var = this.f;
                            m2.i iVar = this.M;
                            j3 = -9223372036854775807L;
                            e2.l1 l1Var = this.Y.a;
                            x2.g0 g0Var = u0Var2.g.a;
                            float f10 = this.E.j().a;
                            boolean z20 = this.Y.l;
                            boolean z21 = this.d0;
                            h hVar = (h) q0Var;
                            hVar.getClass();
                            long j15 = j14;
                            e2.g0 g0Var2 = l1Var.m(l1Var.g(g0Var.a, hVar.b).c, hVar.a, 0L).c.b;
                            if (g0Var2 != null) {
                                String scheme = g0Var2.a.getScheme();
                                if (TextUtils.isEmpty(scheme) || h.r.contains(scheme)) {
                                    z13 = true;
                                    long F = h2.l0.F(p10, f10);
                                    j10 = !z21 ? z13 ? hVar.k : hVar.j : z13 ? hVar.i : hVar.h;
                                    if (j15 != -9223372036854775807L) {
                                        j10 = Math.min(j15 / 2, j10);
                                    }
                                    if (j10 > 0 && F < j10) {
                                        if (!(!z13 ? hVar.m : false)) {
                                            g gVar = (g) hVar.p.get(iVar);
                                            gVar.getClass();
                                            synchronized (gVar) {
                                                i7 = gVar.d;
                                            }
                                            int i14 = i7 * hVar.c.b;
                                            g gVar2 = (g) hVar.p.get(iVar);
                                            gVar2.getClass();
                                        }
                                        z14 = false;
                                        if (z14) {
                                            o0(3);
                                            this.r0 = null;
                                            if (s0()) {
                                                E0(false, false);
                                                i iVar2 = this.E;
                                                z12 = true;
                                                iVar2.b = true;
                                                ((q1) iVar2.c).d();
                                                u0();
                                                if (this.Y.e == 2) {
                                                    int i15 = 0;
                                                    while (true) {
                                                        n1[] n1VarArr2 = this.a;
                                                        if (i15 >= n1VarArr2.length) {
                                                            break;
                                                        }
                                                        if (n1VarArr2[i15].d(u0Var) != null ? z12 : false) {
                                                            F(i15);
                                                        }
                                                        i15++;
                                                    }
                                                    g1 g1Var3 = this.Y;
                                                    if (!g1Var3.g && g1Var3.r < 500000 && z(this.I.l) && s0()) {
                                                        z15 = z12;
                                                        if (z15) {
                                                            this.s0 = -9223372036854775807L;
                                                        } else if (this.s0 == -9223372036854775807L) {
                                                            this.G.getClass();
                                                            this.s0 = SystemClock.elapsedRealtime();
                                                        } else {
                                                            this.G.getClass();
                                                            if (SystemClock.elapsedRealtime() - this.s0 >= 4000) {
                                                                throw new h2.f0(0, 4000);
                                                            }
                                                        }
                                                        boolean z22 = (s0() || this.Y.e != 3) ? false : z12;
                                                        if (this.k0 || !this.j0 || !z22) {
                                                            z12 = false;
                                                        }
                                                        g1Var = this.Y;
                                                        if (g1Var.p != z12) {
                                                            this.Y = g1Var.i(z12);
                                                        }
                                                        this.j0 = false;
                                                        if (!z12 && (i10 = this.Y.e) != 4 && (z22 || i10 == 2 || (i10 == 3 && this.l0 != 0))) {
                                                            U(uptimeMillis);
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
                                                g1Var = this.Y;
                                                if (g1Var.p != z12) {
                                                }
                                                this.j0 = false;
                                                if (!z12) {
                                                    U(uptimeMillis);
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
                            long F2 = h2.l0.F(p10, f10);
                            if (!z21) {
                            }
                            if (j15 != -9223372036854775807L) {
                            }
                            if (j10 > 0) {
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
                    j3 = -9223372036854775807L;
                    z14 = true;
                    if (z14) {
                    }
                } else {
                    z14 = false;
                }
                j3 = -9223372036854775807L;
                if (z14) {
                }
            } else {
                j3 = -9223372036854775807L;
            }
            z12 = true;
            if (this.Y.e == 3 && (this.l0 != 0 ? !z11 : !B())) {
                E0(s0(), false);
                o0(2);
                if (this.d0) {
                    for (u0 u0Var4 = this.I.i; u0Var4 != null; u0Var4 = u0Var4.m) {
                        for (a3.u uVar : u0Var4.o.c) {
                            if (uVar != null) {
                                uVar.t();
                            }
                        }
                    }
                    f fVar = this.K;
                    long j16 = fVar.h;
                    if (j16 != j3) {
                        long j17 = j16 + fVar.b;
                        fVar.h = j17;
                        long j18 = fVar.g;
                        if (j18 != j3 && j17 > j18) {
                            fVar.h = j18;
                        }
                        fVar.l = j3;
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
            g1Var = this.Y;
            if (g1Var.p != z12) {
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
        g1Var = this.Y;
        if (g1Var.p != z12) {
        }
        this.j0 = false;
        if (!z12) {
        }
        Trace.endSection();
    }

    public final void i0(int i7) {
        this.g0 = i7;
        e2.l1 l1Var = this.Y.a;
        w0 w0Var = this.I;
        w0Var.g = i7;
        int r10 = w0Var.r(l1Var);
        if ((r10 & 1) != 0) {
            V(true);
        } else if ((r10 & 2) != 0) {
            g();
        }
        u(false);
    }

    public final void j(u0 u0Var, int i7, boolean z10, long j3) {
        n1 n1Var = this.a[i7];
        boolean g10 = n1Var.g();
        b bVar = n1Var.a;
        if (g10) {
            return;
        }
        boolean z11 = u0Var == this.I.i;
        a3.y yVar = u0Var.o;
        m1 m1Var = yVar.b[i7];
        a3.u uVar = yVar.c[i7];
        boolean z12 = s0() && this.Y.e == 3;
        boolean z13 = !z10 && z12;
        this.l0++;
        x2.d1 d1Var = u0Var.c[i7];
        long j10 = u0Var.p;
        x2.g0 g0Var = u0Var.g.a;
        b bVar2 = n1Var.c;
        int length = uVar != null ? uVar.length() : 0;
        e2.u[] uVarArr = new e2.u[length];
        for (int i10 = 0; i10 < length; i10++) {
            uVar.getClass();
            uVarArr[i10] = uVar.g(i10);
        }
        int i11 = n1Var.d;
        i iVar = this.E;
        if (i11 == 0 || i11 == 2 || i11 == 4) {
            n1Var.e = true;
            la.p(bVar.n == 0);
            bVar.d = m1Var;
            bVar.H = g0Var;
            bVar.n = 1;
            bVar.o(z13, z11);
            bVar.y(uVarArr, d1Var, j3, j10, g0Var);
            bVar.z(j3, z13, true);
            iVar.h(bVar);
        } else {
            n1Var.f = true;
            bVar2.getClass();
            la.p(bVar2.n == 0);
            bVar2.d = m1Var;
            bVar2.H = g0Var;
            bVar2.n = 1;
            bVar2.o(z13, z11);
            bVar2.y(uVarArr, d1Var, j3, j10, g0Var);
            bVar2.z(j3, z13, true);
            iVar.h(bVar2);
        }
        i0 i0Var = new i0(this);
        b d = n1Var.d(u0Var);
        d.getClass();
        d.c(11, i0Var);
        if (z12 && z11) {
            n1Var.m();
        }
    }

    public final void j0(boolean z10) {
        if (!z10) {
            n0 n0Var = this.W;
            h2.i0 i0Var = this.n;
            if (n0Var != null && this.V && !i0Var.a.hasMessages(37)) {
                this.X++;
            }
            int i7 = this.X;
            if (i7 > 0) {
                this.O.d(new ai.c1(this, i7, 17));
            }
            this.X = 0;
            this.V = false;
            i0Var.e(37);
            n0 n0Var2 = this.W;
            if (n0Var2 != null) {
                W(n0Var2);
                this.W = null;
                this.V = false;
            }
        }
        this.U = z10;
        c();
    }

    public final void k(long j3, boolean[] zArr) {
        n1[] n1VarArr;
        long j10;
        u0 u0Var = this.I.j;
        a3.y yVar = u0Var.o;
        int i7 = 0;
        while (true) {
            n1VarArr = this.a;
            if (i7 >= n1VarArr.length) {
                break;
            }
            if (!yVar.b(i7)) {
                n1VarArr[i7].k();
            }
            i7++;
        }
        int i10 = 0;
        while (i10 < n1VarArr.length) {
            if (yVar.b(i10) && n1VarArr[i10].d(u0Var) == null) {
                j10 = j3;
                j(u0Var, i10, zArr[i10], j10);
            } else {
                j10 = j3;
            }
            i10++;
            j3 = j10;
        }
    }

    public final void k0(o1 o1Var) {
        this.T = o1Var;
        c();
    }

    public final long l(e2.l1 l1Var, Object obj, long j3) {
        e2.i1 i1Var = this.x;
        int i7 = l1Var.g(obj, i1Var).c;
        e2.k1 k1Var = this.w;
        l1Var.n(i7, k1Var);
        if (k1Var.f != -9223372036854775807L && k1Var.a() && k1Var.i) {
            return h2.l0.S(h2.l0.C(k1Var.g) - k1Var.f) - (j3 + i1Var.e);
        }
        return -9223372036854775807L;
    }

    public final void l0(p1 p1Var) {
        this.S = p1Var;
    }

    @Override // x2.d0
    public final void m(x2.e0 e0Var) {
        this.n.b(8, e0Var).b();
    }

    public final void m0(boolean z10) {
        this.h0 = z10;
        e2.l1 l1Var = this.Y.a;
        w0 w0Var = this.I;
        w0Var.h = z10;
        int r10 = w0Var.r(l1Var);
        if ((r10 & 1) != 0) {
            V(true);
        } else if ((r10 & 2) != 0) {
            g();
        }
        u(false);
    }

    public final long n(u0 u0Var) {
        if (u0Var == null) {
            return 0L;
        }
        long j3 = u0Var.p;
        if (!u0Var.e) {
            return j3;
        }
        int i7 = 0;
        while (true) {
            n1[] n1VarArr = this.a;
            if (i7 >= n1VarArr.length) {
                return j3;
            }
            if (n1VarArr[i7].d(u0Var) != null) {
                b d = n1VarArr[i7].d(u0Var);
                Objects.requireNonNull(d);
                long j10 = d.y;
                if (j10 == Long.MIN_VALUE) {
                    return Long.MIN_VALUE;
                }
                j3 = Math.max(j10, j3);
            }
            i7++;
        }
    }

    public final void n0(x2.i1 i1Var) {
        this.Z.f(1);
        f1 f1Var = this.J;
        int size = f1Var.b.size();
        if (i1Var.getLength() != size) {
            i1Var = i1Var.i().f(0, size);
        }
        f1Var.j = i1Var;
        v(f1Var.b(), false);
    }

    public final Pair o(e2.l1 l1Var) {
        long j3 = 0;
        if (l1Var.p()) {
            return Pair.create(g1.u, 0L);
        }
        int a10 = l1Var.a(this.h0);
        Pair i7 = l1Var.i(this.w, this.x, a10, -9223372036854775807L);
        x2.g0 p10 = this.I.p(l1Var, i7.first, 0L);
        long longValue = ((Long) i7.second).longValue();
        if (p10.b()) {
            Object obj = p10.a;
            e2.i1 i1Var = this.x;
            l1Var.g(obj, i1Var);
            if (p10.c == i1Var.e(p10.b)) {
                i1Var.g.getClass();
            }
        } else {
            j3 = longValue;
        }
        return Pair.create(p10, Long.valueOf(j3));
    }

    public final void o0(int i7) {
        g1 g1Var = this.Y;
        if (g1Var.e != i7) {
            if (i7 != 2) {
                this.s0 = -9223372036854775807L;
            }
            if (i7 != 3 && g1Var.p) {
                this.Y = g1Var.i(false);
            }
            this.Y = this.Y.h(i7);
        }
    }

    public final long p(long j3) {
        u0 u0Var = this.I.l;
        if (u0Var == null) {
            return 0L;
        }
        return Math.max(0L, j3 - (this.n0 - u0Var.p));
    }

    public final void p0(d3.v vVar) {
        for (n1 n1Var : this.a) {
            b bVar = n1Var.a;
            if (bVar.b == 2) {
                bVar.c(7, vVar);
                b bVar2 = n1Var.c;
                if (bVar2 != null) {
                    bVar2.c(7, vVar);
                }
            }
        }
    }

    public final void q(int i7) {
        g1 g1Var = this.Y;
        B0(i7, g1Var.n, g1Var.m, g1Var.l);
    }

    public final void q0(Object obj, h2.i iVar) {
        for (n1 n1Var : this.a) {
            b bVar = n1Var.a;
            if (bVar.b == 2) {
                int i7 = n1Var.d;
                if (i7 == 4 || i7 == 1) {
                    b bVar2 = n1Var.c;
                    bVar2.getClass();
                    bVar2.c(1, obj);
                } else {
                    bVar.c(1, obj);
                }
            }
        }
        int i10 = this.Y.e;
        if (i10 == 3 || i10 == 2) {
            this.n.f(2);
        }
        if (iVar != null) {
            iVar.e();
        }
    }

    public final void r() {
        r0(this.w0);
    }

    public final void r0(float f10) {
        this.w0 = f10;
        float f11 = f10 * this.Q.g;
        for (n1 n1Var : this.a) {
            b bVar = n1Var.a;
            if (bVar.b == 1) {
                bVar.c(2, Float.valueOf(f11));
                b bVar2 = n1Var.c;
                if (bVar2 != null) {
                    bVar2.c(2, Float.valueOf(f11));
                }
            }
        }
    }

    public final void s(x2.e0 e0Var) {
        w0 w0Var = this.I;
        u0 u0Var = w0Var.l;
        if (u0Var != null && u0Var.a == e0Var) {
            w0Var.m(this.n0);
            C();
            return;
        }
        u0 u0Var2 = w0Var.m;
        if (u0Var2 == null || u0Var2.a != e0Var) {
            return;
        }
        D();
    }

    public final boolean s0() {
        g1 g1Var = this.Y;
        return g1Var.l && g1Var.n == 0;
    }

    public final void t(IOException iOException, int i7) {
        l lVar = new l(0, iOException, i7);
        u0 u0Var = this.I.i;
        if (u0Var != null) {
            lVar = lVar.a(u0Var.g.a);
        }
        h2.a.d("ExoPlayerImplInternal", "Playback error", lVar);
        v0(false, false);
        this.Y = this.Y.f(lVar);
    }

    public final boolean t0(e2.l1 l1Var, x2.g0 g0Var) {
        if (g0Var.b() || l1Var.p()) {
            return false;
        }
        int i7 = l1Var.g(g0Var.a, this.x).c;
        e2.k1 k1Var = this.w;
        l1Var.n(i7, k1Var);
        return k1Var.a() && k1Var.i && k1Var.f != -9223372036854775807L;
    }

    public final void u(boolean z10) {
        u0 u0Var = this.I.l;
        x2.g0 g0Var = u0Var == null ? this.Y.b : u0Var.g.a;
        boolean equals = this.Y.k.equals(g0Var);
        if (!equals) {
            this.Y = this.Y.c(g0Var);
        }
        g1 g1Var = this.Y;
        g1Var.q = u0Var == null ? g1Var.s : u0Var.d();
        g1 g1Var2 = this.Y;
        g1Var2.r = p(g1Var2.q);
        if ((!equals || z10) && u0Var != null && u0Var.e) {
            y0(u0Var.g.a, u0Var.o);
        }
    }

    public final void u0() {
        u0 u0Var = this.I.i;
        if (u0Var == null) {
            return;
        }
        a3.y yVar = u0Var.o;
        int i7 = 0;
        while (true) {
            n1[] n1VarArr = this.a;
            if (i7 >= n1VarArr.length) {
                return;
            }
            if (yVar.b(i7)) {
                n1VarArr[i7].m();
            }
            i7++;
        }
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
    public final void v(e2.l1 l1Var, boolean z10) {
        long j3;
        e2.k1 k1Var;
        Object obj;
        int i7;
        long j10;
        long j11;
        boolean z11;
        boolean z12;
        boolean z13;
        e2.i1 i1Var;
        boolean z14;
        e2.l1 l1Var2;
        e2.i1 i1Var2;
        e2.l1 l1Var3;
        long j12;
        long j13;
        long j14;
        long j15;
        long j16;
        int i10;
        m0 m0Var;
        int i11;
        long longValue;
        boolean z15;
        int i12;
        boolean z16;
        e2.i1 i1Var3;
        e2.l1 l1Var4;
        e2.l1 l1Var5;
        x2.g0 g0Var;
        boolean z17;
        e2.l1 l1Var6;
        long j17;
        int s5;
        u0 u0Var;
        w0 w0Var;
        g1 g1Var = this.Y;
        n0 n0Var = this.m0;
        w0 w0Var2 = this.I;
        int i13 = this.g0;
        boolean z18 = this.h0;
        e2.k1 k1Var2 = this.w;
        e2.i1 i1Var4 = this.x;
        if (l1Var.p()) {
            x2.g0 g0Var2 = g1.u;
            boolean z19 = (g0Var2.equals(g1Var.b) && g1Var.s == 0) ? false : true;
            m0 m0Var2 = new m0(g0Var2, 0L, -9223372036854775807L, false, true, false, z19, z19 && z10 && !g1Var.a.p() && !g1Var.a.g(g1Var.b.a, i1Var4).f, 4);
            l1Var4 = l1Var;
            j14 = 0;
            m0Var = m0Var2;
            i1Var3 = i1Var4;
        } else {
            x2.g0 g0Var3 = g1Var.b;
            Object obj2 = g0Var3.a;
            e2.l1 l1Var7 = g1Var.a;
            boolean z20 = l1Var7.p() || l1Var7.g(g0Var3.a, i1Var4).f;
            long j18 = (g1Var.b.b() || z20) ? g1Var.c : g1Var.s;
            if (n0Var != null) {
                boolean z21 = true;
                j3 = 1;
                e2.l1 l1Var8 = l1Var;
                Pair S = S(l1Var8, n0Var, true, i13, z18, k1Var2, i1Var4);
                if (S == null) {
                    i12 = l1Var8.a(z18);
                    obj = obj2;
                    longValue = j18;
                    z15 = false;
                    z16 = false;
                } else {
                    if (n0Var.c == -9223372036854775807L) {
                        i12 = l1Var8.g(S.first, i1Var4).c;
                        obj = obj2;
                        longValue = j18;
                        z15 = false;
                    } else {
                        obj = S.first;
                        longValue = ((Long) S.second).longValue();
                        z15 = true;
                        i12 = -1;
                    }
                    z16 = g1Var.e == 4;
                    z21 = false;
                }
                z13 = z15;
                z12 = z21;
                z11 = z16;
                j11 = longValue;
                i7 = i12;
                k1Var = k1Var2;
                l1Var3 = l1Var8;
                i1Var2 = i1Var4;
            } else {
                j3 = 1;
                e2.l1 l1Var9 = l1Var;
                if (g1Var.a.p()) {
                    i7 = l1Var9.a(z18);
                    k1Var = k1Var2;
                    obj = obj2;
                } else if (l1Var9.b(obj2) == -1) {
                    obj = obj2;
                    int T = T(k1Var2, i1Var4, i13, z18, obj, g1Var.a, l1Var9);
                    k1Var = k1Var2;
                    e2.l1 l1Var10 = l1Var9;
                    i1Var = i1Var4;
                    if (T == -1) {
                        T = l1Var10.a(z18);
                        z14 = true;
                    } else {
                        z14 = false;
                    }
                    i7 = T;
                    z12 = z14;
                    j11 = j18;
                    z11 = false;
                    l1Var2 = l1Var10;
                    z13 = false;
                    l1Var3 = l1Var2;
                    i1Var2 = i1Var;
                } else {
                    k1Var = k1Var2;
                    obj = obj2;
                    if (j18 == -9223372036854775807L) {
                        i7 = l1Var9.g(obj, i1Var4).c;
                    } else if (z20) {
                        g1Var.a.g(g0Var3.a, i1Var4);
                        if (g1Var.a.m(i1Var4.c, k1Var, 0L).n == g1Var.a.b(g0Var3.a)) {
                            Pair i14 = l1Var9.i(k1Var, i1Var4, l1Var9.g(obj, i1Var4).c, j18 + i1Var4.e);
                            obj = i14.first;
                            j10 = ((Long) i14.second).longValue();
                        } else {
                            j10 = l1Var9.g(obj, i1Var4).d != -9223372036854775807L ? h2.l0.j(j18, 0L, i1Var4.d - 1) : j18;
                        }
                        j11 = j10;
                        i7 = -1;
                        z11 = false;
                        z12 = false;
                        z13 = true;
                        l1Var3 = l1Var9;
                        i1Var2 = i1Var4;
                    } else {
                        i7 = -1;
                    }
                }
                j11 = j18;
                z11 = false;
                z12 = false;
                l1Var2 = l1Var9;
                i1Var = i1Var4;
                z13 = false;
                l1Var3 = l1Var2;
                i1Var2 = i1Var;
            }
            if (i7 != -1) {
                Pair i15 = l1Var3.i(k1Var, i1Var2, i7, -9223372036854775807L);
                obj = i15.first;
                j11 = ((Long) i15.second).longValue();
                j12 = -9223372036854775807L;
            } else {
                j12 = j11;
            }
            x2.g0 p10 = w0Var2.p(l1Var3, obj, j11);
            int i16 = p10.e;
            boolean z22 = i16 == -1 || ((i11 = g0Var3.e) != -1 && i16 >= i11);
            boolean equals = g0Var3.a.equals(obj);
            boolean z23 = equals && !g0Var3.b() && !p10.b() && z22;
            e2.i1 g10 = l1Var3.g(obj, i1Var2);
            if (z20 || j18 != j12) {
                j13 = j12;
            } else {
                Object obj3 = g0Var3.a;
                int i17 = g0Var3.b;
                j13 = j12;
                if (obj3.equals(p10.a)) {
                    if (g0Var3.b()) {
                        g10.g(i17);
                    }
                    if (p10.b()) {
                        g10.g(p10.b);
                    }
                }
            }
            if (z23) {
                p10 = g0Var3;
            }
            if (!p10.b()) {
                if (equals && g0Var3.b()) {
                    e2.a a10 = l1Var3.g(obj, i1Var2).g.a(g0Var3.b);
                    a10.getClass();
                    long j19 = g1Var.c;
                    j14 = 0;
                    if (j19 == -9223372036854775807L || 0 > j19) {
                        int i18 = a10.a;
                        int i19 = g0Var3.c;
                        if (i18 > i19 && a10.e[i19] == 2) {
                            long j20 = l1Var3.g(obj, i1Var2).d;
                            if (j20 != -9223372036854775807L) {
                                j11 = Math.min(j20 - j3, j11);
                            }
                            j15 = j11;
                            j16 = j15;
                        }
                    }
                } else {
                    j14 = 0;
                }
                j15 = j11;
                j16 = j13;
            } else if (p10.equals(g0Var3)) {
                j15 = g1Var.s;
                j16 = j13;
                j14 = 0;
            } else {
                l1Var3.g(p10.a, i1Var2);
                if (p10.c == i1Var2.e(p10.b)) {
                    i1Var2.g.getClass();
                }
                j16 = j13;
                j14 = 0;
                j15 = 0;
            }
            boolean z24 = (p10.equals(g1Var.b) && j15 == g1Var.s) ? false : true;
            int i20 = l1Var3.b(g1Var.b.a) == -1 ? 4 : 3;
            if (p10.a.equals(g1Var.b.a) && p10.b != -1) {
                e2.a a11 = l1Var3.g(p10.a, i1Var2).g.a(p10.b);
                int i21 = p10.c;
                int[] iArr = a11.e;
                if (i21 >= iArr.length || iArr[i21] != 2) {
                    i10 = 0;
                    m0Var = new m0(p10, j15, j16, z11, z12, z13, z24, (z24 || !z10 || g1Var.a.p() || g1Var.a.g(g1Var.b.a, i1Var2).f) ? false : true, i10);
                    l1Var4 = l1Var3;
                    i1Var3 = i1Var2;
                }
            }
            i10 = i20;
            m0Var = new m0(p10, j15, j16, z11, z12, z13, z24, (z24 || !z10 || g1Var.a.p() || g1Var.a.g(g1Var.b.a, i1Var2).f) ? false : true, i10);
            l1Var4 = l1Var3;
            i1Var3 = i1Var2;
        }
        x2.g0 g0Var4 = m0Var.a;
        long j21 = m0Var.b;
        try {
            if (m0Var.e) {
                z17 = true;
                if (this.Y.e != 1) {
                    o0(4);
                }
                O(false, false, false, true);
            } else {
                z17 = true;
            }
            n1[] n1VarArr = this.a;
            int length = n1VarArr.length;
            int i22 = 0;
            e2.l1 l1Var11 = i1Var3;
            while (i22 < length) {
                n1 n1Var = n1VarArr[i22];
                b bVar = n1Var.a;
                boolean equals2 = Objects.equals(bVar.G, l1Var4);
                if (equals2 == 0) {
                    bVar.G = l1Var4;
                    bVar.v();
                }
                b bVar2 = n1Var.c;
                if (bVar2 != null && !Objects.equals(bVar2.G, l1Var4)) {
                    bVar2.G = l1Var4;
                    bVar2.v();
                }
                i22++;
                l1Var11 = equals2;
            }
            try {
                if (m0Var.g) {
                    l1Var11 = l1Var4;
                    if (!l1Var11.p()) {
                        for (u0 u0Var2 = this.I.i; u0Var2 != null; u0Var2 = u0Var2.m) {
                            if (u0Var2.g.a.equals(g0Var4)) {
                                u0Var2.g = this.I.h(l1Var11, u0Var2.g);
                                u0Var2.k();
                            }
                        }
                        boolean z25 = m0Var.d;
                        try {
                            w0Var = this.I;
                            g0Var = g0Var4;
                        } catch (Throwable th2) {
                            th = th2;
                            g0Var = g0Var4;
                            l1Var6 = l1Var11;
                            l1Var5 = l1Var6;
                            g1 g1Var2 = this.Y;
                            e2.l1 l1Var12 = g1Var2.a;
                            x2.g0 g0Var5 = g1Var2.b;
                            x2.g0 g0Var6 = g0Var;
                            D0(l1Var5, g0Var6, l1Var12, g0Var5, m0Var.f ? j21 : -9223372036854775807L, false);
                            if (!m0Var.g || m0Var.c != this.Y.c) {
                                long j22 = m0Var.c;
                                boolean z26 = m0Var.h;
                                this.Y = y(g0Var6, j21, j22, z26 ? j21 : this.Y.d, z26, m0Var.i);
                            }
                            P();
                            R(l1Var5, this.Y.a);
                            this.Y = this.Y.j(l1Var5);
                            if (!l1Var5.p()) {
                                this.m0 = null;
                            }
                            u(false);
                            this.n.f(2);
                            throw th;
                        }
                        try {
                            j21 = X(g0Var, j21, w0Var.i != w0Var.j ? z17 : false, z25);
                            g1 g1Var3 = this.Y;
                            x2.g0 g0Var7 = g0Var;
                            D0(l1Var, g0Var7, g1Var3.a, g1Var3.b, !m0Var.f ? j21 : -9223372036854775807L, false);
                            if (!m0Var.g || m0Var.c != this.Y.c) {
                                long j23 = m0Var.c;
                                boolean z27 = m0Var.h;
                                this.Y = y(g0Var7, j21, j23, !z27 ? j21 : this.Y.d, z27, m0Var.i);
                            }
                            P();
                            R(l1Var, this.Y.a);
                            this.Y = this.Y.j(l1Var);
                            if (!l1Var.p()) {
                                this.m0 = null;
                            }
                            u(false);
                            this.n.f(2);
                        } catch (Throwable th3) {
                            th = th3;
                            j21 = j21;
                            l1Var6 = l1Var11;
                            l1Var5 = l1Var6;
                            g1 g1Var22 = this.Y;
                            e2.l1 l1Var122 = g1Var22.a;
                            x2.g0 g0Var52 = g1Var22.b;
                            x2.g0 g0Var62 = g0Var;
                            D0(l1Var5, g0Var62, l1Var122, g0Var52, m0Var.f ? j21 : -9223372036854775807L, false);
                            if (!m0Var.g) {
                            }
                            long j222 = m0Var.c;
                            boolean z262 = m0Var.h;
                            this.Y = y(g0Var62, j21, j222, z262 ? j21 : this.Y.d, z262, m0Var.i);
                            P();
                            R(l1Var5, this.Y.a);
                            this.Y = this.Y.j(l1Var5);
                            if (!l1Var5.p()) {
                            }
                            u(false);
                            this.n.f(2);
                            throw th;
                        }
                    }
                } else {
                    try {
                        u0 u0Var3 = this.I.j;
                        long n10 = u0Var3 == null ? j14 : n(u0Var3);
                        try {
                            try {
                                if (d() && (u0Var = this.I.k) != null) {
                                    j17 = n(u0Var);
                                    s5 = this.I.s(l1Var, this.n0, n10, j17);
                                    if ((s5 & 1) == 0) {
                                        V(false);
                                    } else if ((s5 & 2) != 0) {
                                        g();
                                    }
                                }
                                s5 = this.I.s(l1Var, this.n0, n10, j17);
                                if ((s5 & 1) == 0) {
                                }
                            } catch (Throwable th4) {
                                th = th4;
                                l1Var11 = l1Var;
                                g0Var = g0Var4;
                                l1Var6 = l1Var11;
                                l1Var5 = l1Var6;
                                g1 g1Var222 = this.Y;
                                e2.l1 l1Var1222 = g1Var222.a;
                                x2.g0 g0Var522 = g1Var222.b;
                                x2.g0 g0Var622 = g0Var;
                                D0(l1Var5, g0Var622, l1Var1222, g0Var522, m0Var.f ? j21 : -9223372036854775807L, false);
                                if (!m0Var.g) {
                                }
                                long j2222 = m0Var.c;
                                boolean z2622 = m0Var.h;
                                this.Y = y(g0Var622, j21, j2222, z2622 ? j21 : this.Y.d, z2622, m0Var.i);
                                P();
                                R(l1Var5, this.Y.a);
                                this.Y = this.Y.j(l1Var5);
                                if (!l1Var5.p()) {
                                }
                                u(false);
                                this.n.f(2);
                                throw th;
                            }
                        } catch (Throwable th5) {
                            th = th5;
                            l1Var11 = l1Var;
                        }
                        j17 = j14;
                    } catch (Throwable th6) {
                        th = th6;
                        l1Var11 = l1Var4;
                    }
                }
                g0Var = g0Var4;
                g1 g1Var32 = this.Y;
                x2.g0 g0Var72 = g0Var;
                D0(l1Var, g0Var72, g1Var32.a, g1Var32.b, !m0Var.f ? j21 : -9223372036854775807L, false);
                if (!m0Var.g) {
                }
                long j232 = m0Var.c;
                boolean z272 = m0Var.h;
                this.Y = y(g0Var72, j21, j232, !z272 ? j21 : this.Y.d, z272, m0Var.i);
                P();
                R(l1Var, this.Y.a);
                this.Y = this.Y.j(l1Var);
                if (!l1Var.p()) {
                }
                u(false);
                this.n.f(2);
            } catch (Throwable th7) {
                th = th7;
            }
        } catch (Throwable th8) {
            th = th8;
            l1Var5 = l1Var4;
            g0Var = g0Var4;
        }
    }

    public final void v0(boolean z10, boolean z11) {
        O(z10 || !this.i0, false, true, false);
        this.Z.f(z11 ? 1 : 0);
        h hVar = (h) this.f;
        ConcurrentHashMap concurrentHashMap = hVar.p;
        m2.i iVar = this.M;
        g gVar = (g) concurrentHashMap.get(iVar);
        if (gVar != null) {
            int i7 = gVar.a - 1;
            gVar.a = i7;
            if (i7 == 0) {
                concurrentHashMap.remove(iVar);
                hVar.c();
            }
        }
        this.Q.d(1, this.Y.l);
        o0(1);
    }

    public final void w(x2.e0 e0Var) {
        u0 u0Var;
        w0 w0Var = this.I;
        u0 u0Var2 = w0Var.l;
        i iVar = this.E;
        if (u0Var2 != null && u0Var2.a == e0Var) {
            u0Var2.getClass();
            if (!u0Var2.e) {
                float f10 = iVar.j().a;
                g1 g1Var = this.Y;
                u0Var2.f(f10, g1Var.a, g1Var.l);
            }
            y0(u0Var2.g.a, u0Var2.o);
            if (u0Var2 == w0Var.i) {
                Q(u0Var2.g.b, true);
                k(w0Var.j.e(), new boolean[this.a.length]);
                u0Var2.h = true;
                g1 g1Var2 = this.Y;
                x2.g0 g0Var = g1Var2.b;
                long j3 = u0Var2.g.b;
                this.Y = y(g0Var, j3, g1Var2.c, j3, false, 5);
            }
            C();
            return;
        }
        int i7 = 0;
        while (true) {
            if (i7 >= w0Var.q.size()) {
                u0Var = null;
                break;
            }
            u0Var = (u0) w0Var.q.get(i7);
            if (u0Var.a == e0Var) {
                break;
            } else {
                i7++;
            }
        }
        if (u0Var != null) {
            la.p(true ^ u0Var.e);
            float f11 = iVar.j().a;
            g1 g1Var3 = this.Y;
            u0Var.f(f11, g1Var3.a, g1Var3.l);
            u0 u0Var3 = w0Var.m;
            if (u0Var3 == null || u0Var3.a != e0Var) {
                return;
            }
            D();
        }
    }

    public final void w0() {
        i iVar = this.E;
        iVar.b = false;
        q1 q1Var = (q1) iVar.c;
        if (q1Var.c) {
            q1Var.c(q1Var.a());
            q1Var.c = false;
        }
        for (n1 n1Var : this.a) {
            b bVar = n1Var.c;
            b bVar2 = n1Var.a;
            if (n1.h(bVar2)) {
                n1.b(bVar2);
            }
            if (bVar != null && bVar.n != 0) {
                n1.b(bVar);
            }
        }
    }

    public final void x(e2.w0 w0Var, float f10, boolean z10, boolean z11) {
        int i7;
        if (z10) {
            if (z11) {
                this.Z.f(1);
            }
            this.Y = this.Y.g(w0Var);
        }
        float f11 = w0Var.a;
        u0 u0Var = this.I.i;
        while (true) {
            i7 = 0;
            if (u0Var == null) {
                break;
            }
            a3.u[] uVarArr = u0Var.o.c;
            int length = uVarArr.length;
            while (i7 < length) {
                a3.u uVar = uVarArr[i7];
                if (uVar != null) {
                    uVar.q(f11);
                }
                i7++;
            }
            u0Var = u0Var.m;
        }
        n1[] n1VarArr = this.a;
        int length2 = n1VarArr.length;
        while (i7 < length2) {
            n1 n1Var = n1VarArr[i7];
            float f12 = w0Var.a;
            n1Var.a.A(f10, f12);
            b bVar = n1Var.c;
            if (bVar != null) {
                bVar.A(f10, f12);
            }
            i7++;
        }
    }

    /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, x2.f1] */
    public final void x0() {
        u0 u0Var = this.I.l;
        boolean z10 = this.f0 || (u0Var != null && u0Var.a.g());
        g1 g1Var = this.Y;
        if (z10 != g1Var.g) {
            this.Y = g1Var.b(z10);
        }
    }

    public final g1 y(x2.g0 g0Var, long j3, long j10, long j11, boolean z10, int i7) {
        t1 t1Var;
        boolean z11;
        this.q0 = (!this.q0 && j3 == this.Y.s && g0Var.equals(this.Y.b)) ? false : true;
        P();
        g1 g1Var = this.Y;
        r1 r1Var = g1Var.h;
        a3.y yVar = g1Var.i;
        List list = g1Var.j;
        if (this.J.k) {
            u0 u0Var = this.I.i;
            r1Var = u0Var == null ? r1.d : u0Var.n;
            yVar = u0Var == null ? this.e : u0Var.o;
            a3.u[] uVarArr = yVar.c;
            h9.f0 f0Var = new h9.f0(4);
            boolean z12 = false;
            for (a3.u uVar : uVarArr) {
                if (uVar != null) {
                    e2.q0 q0Var = uVar.g(0).l;
                    if (q0Var == null) {
                        f0Var.c(new e2.q0(new e2.p0[0]));
                    } else {
                        f0Var.c(q0Var);
                        z12 = true;
                    }
                }
            }
            if (z12) {
                t1Var = f0Var.f();
            } else {
                h9.g0 g0Var2 = h9.i0.b;
                t1Var = t1.e;
            }
            list = t1Var;
            if (u0Var != null) {
                v0 v0Var = u0Var.g;
                if (v0Var.d != j10) {
                    u0Var.g = v0Var.a(j10);
                }
            }
            n1[] n1VarArr = this.a;
            w0 w0Var = this.I;
            u0 u0Var2 = w0Var.i;
            if (u0Var2 == w0Var.j && u0Var2 != null) {
                a3.y yVar2 = u0Var2.o;
                int i10 = 0;
                boolean z13 = false;
                while (true) {
                    if (i10 >= n1VarArr.length) {
                        z11 = true;
                        break;
                    }
                    if (yVar2.b(i10)) {
                        if (n1VarArr[i10].a.b != 1) {
                            z11 = false;
                            break;
                        }
                        if (yVar2.b[i10].a != 0) {
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
        } else if (!g0Var.equals(g1Var.b)) {
            r1Var = r1.d;
            yVar = this.e;
            list = t1.e;
        }
        r1 r1Var2 = r1Var;
        a3.y yVar3 = yVar;
        List list2 = list;
        if (z10) {
            l0 l0Var = this.Z;
            if (!l0Var.d || l0Var.e == 5) {
                l0Var.c = true;
                l0Var.d = true;
                l0Var.e = i7;
            } else {
                la.f(i7 == 5);
            }
        }
        g1 g1Var2 = this.Y;
        return g1Var2.d(g0Var, j3, j10, j11, p(g1Var2.q), r1Var2, yVar3, list2);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00c3 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void y0(x2.g0 g0Var, a3.y yVar) {
        boolean z10;
        int length;
        int i7;
        u0 u0Var = this.I.l;
        u0Var.getClass();
        p(u0Var.d());
        if (t0(this.Y.a, u0Var.g.a)) {
            long j3 = this.K.h;
        }
        e2.l1 l1Var = this.Y.a;
        float f10 = this.E.j().a;
        boolean z11 = this.Y.l;
        a3.u[] uVarArr = yVar.c;
        h hVar = (h) this.f;
        hVar.getClass();
        h9.l0 l0Var = hVar.o;
        m2.i iVar = this.M;
        Integer num = (Integer) l0Var.get(iVar.a);
        int intValue = (num == null || num.intValue() == -1) ? hVar.l : num.intValue();
        g gVar = (g) hVar.p.get(iVar);
        gVar.getClass();
        if (intValue == -1) {
            e2.g0 g0Var2 = l1Var.m(l1Var.g(g0Var.a, hVar.b).c, hVar.a, 0L).c.b;
            if (g0Var2 != null) {
                String scheme = g0Var2.a.getScheme();
                if (TextUtils.isEmpty(scheme) || h.r.contains(scheme)) {
                    z10 = true;
                    length = uVarArr.length;
                    i7 = 0;
                    int i10 = 0;
                    while (true) {
                        int i11 = 13107200;
                        if (i7 >= length) {
                            a3.u uVar = uVarArr[i7];
                            if (uVar != null) {
                                switch (uVar.c().c) {
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
                            i7++;
                        } else {
                            intValue = h2.l0.i(i10, 13107200, 210239488);
                        }
                    }
                }
            }
            z10 = false;
            length = uVarArr.length;
            i7 = 0;
            int i102 = 0;
            while (true) {
                int i112 = 13107200;
                if (i7 >= length) {
                }
                i7++;
            }
        }
        gVar.c = intValue;
        hVar.c();
    }

    public final void z0(List list, int i7, int i10) {
        this.Z.f(1);
        f1 f1Var = this.J;
        f1Var.getClass();
        ArrayList arrayList = f1Var.b;
        la.f(i7 >= 0 && i7 <= i10 && i10 <= arrayList.size());
        la.f(list.size() == i10 - i7);
        for (int i11 = i7; i11 < i10; i11++) {
            ((e1) arrayList.get(i11)).a.t((e2.l0) list.get(i11 - i7));
        }
        v(f1Var.b(), false);
    }
}
