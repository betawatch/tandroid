package l2;

import a8.ia;
import android.content.Context;
import android.media.MediaFormat;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.os.Trace;
import android.text.TextUtils;
import android.util.Pair;
import bi.c9;
import j$.util.Objects;
import j$.util.concurrent.ConcurrentHashMap;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import org.telegram.messenger.qs;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes.dex */
public final class r0 implements Handler.Callback, x2.d0, l1, d3.w {
    public static final long w0 = h2.m0.h0(10000);
    public final i D;
    public final ArrayList E;
    public final h2.g0 F;
    public final v G;
    public final a1 H;
    public final j1 I;
    public final f J;
    public final long K;
    public final m2.j L;
    public final m2.e M;
    public final h2.i0 N;
    public final boolean O;
    public final f2.d P;
    public final boolean Q;
    public t1 R;
    public s1 S;
    public boolean T;
    public boolean U;
    public q0 V;
    public int W;
    public k1 X;
    public o0 Y;
    public boolean Z;
    public final r1[] a;
    public boolean a0;
    public final b[] b;
    public boolean b0;
    public final boolean[] c;
    public boolean c0;
    public final a3.x d;
    public long d0;
    public final a3.y e;
    public boolean e0;
    public final t0 f;
    public int f0;
    public boolean g0;
    public final b3.d h;
    public boolean h0;
    public boolean i0;
    public boolean j0;
    public int k0;
    public q0 l0;
    public long m0;
    public final h2.i0 n;
    public long n0;
    public int o0;
    public boolean p0;
    public l q0;
    public final m6.n r;
    public long r0;
    public final Looper s;
    public o s0;
    public long t0;
    public boolean u0;
    public float v0;
    public final e2.k1 w;
    public final e2.i1 x;
    public final long y;

    public r0(Context context, b[] bVarArr, b[] bVarArr2, a3.x xVar, a3.y yVar, t0 t0Var, b3.d dVar, int i7, boolean z9, m2.e eVar, t1 t1Var, f fVar, long j3, Looper looper, h2.g0 g0Var, v vVar, m2.j jVar, final d3.w wVar, boolean z10) {
        o oVar = o.a;
        this.t0 = -9223372036854775807L;
        this.G = vVar;
        this.d = xVar;
        this.e = yVar;
        this.f = t0Var;
        this.h = dVar;
        this.f0 = i7;
        this.g0 = z9;
        this.R = t1Var;
        this.J = fVar;
        this.K = j3;
        this.a0 = false;
        this.F = g0Var;
        this.L = jVar;
        this.s0 = oVar;
        this.M = eVar;
        this.v0 = 1.0f;
        this.S = s1.b;
        this.Q = z10;
        this.r0 = -9223372036854775807L;
        this.d0 = -9223372036854775807L;
        this.y = ((h) t0Var).n;
        e2.h1 h1Var = e2.l1.a;
        k1 k10 = k1.k(yVar);
        this.X = k10;
        this.Y = new o0(k10);
        this.b = new b[bVarArr.length];
        this.c = new boolean[bVarArr.length];
        a3.s sVar = (a3.s) xVar;
        sVar.getClass();
        this.a = new r1[bVarArr.length];
        boolean z11 = false;
        for (int i10 = 0; i10 < bVarArr.length; i10++) {
            b bVar = bVarArr[i10];
            bVar.e = i10;
            bVar.f = jVar;
            bVar.h = g0Var;
            this.b[i10] = bVar;
            b bVar2 = this.b[i10];
            synchronized (bVar2.a) {
                bVar2.H = sVar;
            }
            b bVar3 = bVarArr2[i10];
            if (bVar3 != null) {
                bVar3.e = i10;
                bVar3.f = jVar;
                bVar3.h = g0Var;
                z11 = true;
            }
            this.a[i10] = new r1(bVarArr[i10], bVar3, i10);
        }
        this.O = z11;
        this.D = new i(this, g0Var);
        this.E = new ArrayList();
        this.w = new e2.k1();
        this.x = new e2.i1();
        ia.p(xVar.a == null);
        xVar.a = this;
        xVar.b = dVar;
        this.p0 = true;
        h2.i0 a10 = g0Var.a(looper, null);
        this.N = a10;
        this.H = new a1(eVar, a10, new y(this, 3));
        this.I = new j1(this, eVar, a10, jVar);
        m6.n nVar = new m6.n(7);
        this.r = nVar;
        Looper d = nVar.d();
        this.s = d;
        h2.i0 a11 = g0Var.a(d, this);
        this.n = a11;
        this.P = new f2.d(context, d, this);
        a11.b(35, new d3.w() { // from class: l2.j0
            @Override // d3.w
            public final void b(long j10, long j11, e2.u uVar, MediaFormat mediaFormat) {
                r0 r0Var = r0.this;
                r0Var.getClass();
                wVar.b(j10, j11, uVar, mediaFormat);
                r0Var.b(j10, j11, uVar, mediaFormat);
            }
        }).b();
        a11.b(39, new k0(this)).b();
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, x2.e0, x2.e1] */
    public static boolean A(x0 x0Var) {
        if (x0Var != null) {
            try {
                ?? r12 = x0Var.a;
                if (x0Var.e) {
                    for (x2.c1 c1Var : x0Var.c) {
                        if (c1Var != null) {
                            c1Var.a();
                        }
                    }
                } else {
                    r12.i();
                }
                if ((!x0Var.e ? 0L : r12.e()) != Long.MIN_VALUE) {
                    return true;
                }
            } catch (IOException unused) {
            }
        }
        return false;
    }

    public static Pair T(e2.l1 l1Var, q0 q0Var, boolean z9, int i7, boolean z10, e2.k1 k1Var, e2.i1 i1Var) {
        int U;
        e2.l1 l1Var2 = q0Var.a;
        if (l1Var.p()) {
            return null;
        }
        e2.l1 l1Var3 = l1Var2.p() ? l1Var : l1Var2;
        try {
            Pair i10 = l1Var3.i(k1Var, i1Var, q0Var.b, q0Var.c);
            if (!l1Var.equals(l1Var3)) {
                if (l1Var.b(i10.first) == -1) {
                    if (!z9 || (U = U(k1Var, i1Var, i7, z10, i10.first, l1Var3, l1Var)) == -1) {
                        return null;
                    }
                    return l1Var.i(k1Var, i1Var, U, -9223372036854775807L);
                }
                if (l1Var3.g(i10.first, i1Var).f && l1Var3.m(i1Var.c, k1Var, 0L).n == l1Var3.b(i10.first)) {
                    return l1Var.i(k1Var, i1Var, l1Var.g(i10.first, i1Var).c, q0Var.c);
                }
            }
            return i10;
        } catch (IndexOutOfBoundsException unused) {
            return null;
        }
    }

    public static int U(e2.k1 k1Var, e2.i1 i1Var, int i7, boolean z9, Object obj, e2.l1 l1Var, e2.l1 l1Var2) {
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
            int d = l1Var4.d(b10, i1Var, k1Var2, i7, z9);
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

    public static void h(n1 n1Var) {
        try {
            synchronized (n1Var) {
                synchronized (n1Var) {
                }
                n1Var.a.c(n1Var.c, n1Var.d);
                return;
            }
            n1Var.a.c(n1Var.c, n1Var.d);
            return;
        } finally {
            n1Var.a(true);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:99:0x029c, code lost:
    
        if (((long) ((r3.e() - r23.m0) / r23.D.j().a)) > 10000000) goto L254;
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
        x0 x0Var;
        long j3;
        x0 x0Var2;
        x0 x0Var3;
        r1[] r1VarArr;
        a1 a1Var;
        boolean z9;
        x0 x0Var4;
        x0 x0Var5;
        x0 a10;
        boolean z10;
        int i7;
        r1[] r1VarArr2;
        int i10;
        boolean z11;
        boolean z12;
        char c10;
        int i11;
        int i12;
        x0 x0Var6;
        x0 x0Var7;
        boolean z13;
        int i13;
        if (this.X.a.p() || !this.I.k) {
            return;
        }
        this.H.m(this.m0);
        a1 a1Var2 = this.H;
        x0 x0Var8 = a1Var2.l;
        if (x0Var8 == null || (!x0Var8.g.k && x0Var8.g() && a1Var2.l.g.f != -9223372036854775807L && a1Var2.n < 100)) {
            a1 a1Var3 = this.H;
            long j10 = this.m0;
            k1 k1Var = this.X;
            x0 x0Var9 = a1Var3.l;
            y0 d = x0Var9 == null ? a1Var3.d(k1Var.a, k1Var.b, k1Var.c, k1Var.s, -9223372036854775807L) : a1Var3.c(k1Var.a, x0Var9, j10);
            if (d != null) {
                a1 a1Var4 = this.H;
                x0 x0Var10 = a1Var4.l;
                long j11 = x0Var10 == null ? 1000000000000L : (x0Var10.p + x0Var10.g.f) - d.b;
                int i14 = 0;
                while (true) {
                    if (i14 >= a1Var4.q.size()) {
                        x0Var = null;
                        break;
                    }
                    y0 y0Var = ((x0) a1Var4.q.get(i14)).g;
                    long j12 = y0Var.f;
                    long j13 = d.f;
                    if ((j12 == -9223372036854775807L || j12 == j13) && y0Var.b == d.b && y0Var.a.equals(d.a)) {
                        x0Var = (x0) a1Var4.q.remove(i14);
                        break;
                    }
                    i14++;
                }
                if (x0Var == null) {
                    r0 r0Var = (r0) a1Var4.e.b;
                    b[] bVarArr = r0Var.b;
                    a3.x xVar = r0Var.d;
                    t0 t0Var = r0Var.f;
                    m2.j jVar = r0Var.L;
                    h hVar = (h) t0Var;
                    hVar.getClass();
                    j3 = -9223372036854775807L;
                    h6.m mVar = new h6.m(hVar, jVar);
                    j1 j1Var = r0Var.I;
                    a3.y yVar = r0Var.e;
                    r0Var.s0.getClass();
                    x0Var = new x0(bVarArr, j11, xVar, mVar, j1Var, d, yVar);
                } else {
                    j3 = -9223372036854775807L;
                    x0Var.g = d;
                    x0Var.p = j11;
                }
                x0 x0Var11 = a1Var4.l;
                if (x0Var11 == null) {
                    a1Var4.i = x0Var;
                    a1Var4.j = x0Var;
                    a1Var4.k = x0Var;
                } else if (x0Var != x0Var11.m) {
                    x0Var11.b();
                    x0Var11.m = x0Var;
                    x0Var11.c();
                }
                a1Var4.o = null;
                a1Var4.l = x0Var;
                a1Var4.n++;
                a1Var4.l();
                if (!x0Var.d) {
                    long j14 = d.b;
                    x0Var.d = true;
                    x0Var.a.q(this, j14);
                } else if (x0Var.e) {
                    this.n.b(8, x0Var.a).b();
                }
                if (this.H.i == x0Var) {
                    R(d.b, true);
                }
                v(false);
                if (this.e0) {
                    D();
                } else {
                    this.e0 = A(this.H.l);
                    x0();
                }
                a1 a1Var5 = this.H;
                if (!this.b0 && this.O && !this.u0 && !f() && (x0Var6 = a1Var5.k) != null && x0Var6 == a1Var5.j && (x0Var7 = x0Var6.m) != null && (z13 = x0Var7.e)) {
                    ia.p(z13);
                    if (((long) ((x0Var7.e() - this.m0) / this.D.j().a)) <= 10000000) {
                        x0 x0Var12 = a1Var5.k;
                        x0Var12.getClass();
                        a1Var5.k = x0Var12.m;
                        a1Var5.l();
                        a1Var5.k.getClass();
                        r1[] r1VarArr3 = this.a;
                        x0 x0Var13 = a1Var5.k;
                        if (x0Var13 != null) {
                            a3.y yVar2 = x0Var13.o;
                            for (int i15 = 0; i15 < r1VarArr3.length; i15++) {
                                if (yVar2.b(i15)) {
                                    r1 r1Var = r1VarArr3[i15];
                                    if (r1Var.c != null && !r1Var.f()) {
                                        r1 r1Var2 = r1VarArr3[i15];
                                        ia.p(!r1Var2.f());
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
                            if (f()) {
                                this.t0 = x0Var13.a.n();
                                if (!x0Var13.g()) {
                                    a1Var5.n(x0Var13);
                                    v(false);
                                    D();
                                }
                            }
                        }
                    }
                }
                boolean z14 = this.O;
                r1[] r1VarArr4 = this.a;
                a1 a1Var6 = this.H;
                x0Var2 = a1Var6.j;
                if (x0Var2 != null) {
                    if (x0Var2.m == null || this.b0) {
                        if (x0Var2.g.k || this.b0) {
                            for (r1 r1Var3 : r1VarArr4) {
                                if (r1Var3.d(x0Var2) != null) {
                                    b d2 = r1Var3.d(x0Var2);
                                    d2.getClass();
                                    if (d2.k()) {
                                        long j15 = x0Var2.g.f;
                                        long j16 = (j15 == -9223372036854775807L || j15 == Long.MIN_VALUE) ? -9223372036854775807L : j15 + x0Var2.p;
                                        b d10 = r1Var3.d(x0Var2);
                                        d10.getClass();
                                        r1.l(d10, j16);
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
                            } else if (!f() || a1Var6.k != a1Var6.j) {
                                x0 x0Var14 = x0Var2.m;
                                if (x0Var14.e || this.m0 >= x0Var14.e()) {
                                    boolean z15 = x0Var2.m.e;
                                    if (z15) {
                                        ia.p(z15);
                                    }
                                    a3.y yVar3 = x0Var2.o;
                                    x0 x0Var15 = a1Var6.k;
                                    x0 x0Var16 = a1Var6.j;
                                    if (x0Var15 == x0Var16) {
                                        x0Var16.getClass();
                                        a1Var6.k = x0Var16.m;
                                    }
                                    x0 x0Var17 = a1Var6.j;
                                    x0Var17.getClass();
                                    a1Var6.j = x0Var17.m;
                                    a1Var6.l();
                                    x0 x0Var18 = a1Var6.j;
                                    x0Var18.getClass();
                                    a3.y yVar4 = x0Var18.o;
                                    e2.l1 l1Var = this.X.a;
                                    D0(l1Var, x0Var18.g.a, l1Var, x0Var2.g.a, -9223372036854775807L, false);
                                    if (x0Var18.e && ((z14 && this.t0 != j3) || x0Var18.a.n() != j3)) {
                                        this.t0 = j3;
                                        boolean z16 = z14 && !this.u0;
                                        if (z16) {
                                            int i17 = 0;
                                            while (true) {
                                                if (i17 >= r1VarArr4.length) {
                                                    break;
                                                }
                                                boolean b10 = yVar4.b(i17);
                                                a3.u[] uVarArr = yVar4.c;
                                                if (b10 && r1VarArr4[i17].a.b != -2 && !e2.s0.a(uVarArr[i17].n().s, uVarArr[i17].n().k) && !r1VarArr4[i17].f()) {
                                                    z16 = false;
                                                    break;
                                                }
                                                i17++;
                                            }
                                        }
                                        if (!z16) {
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
                                                a1Var6.n(x0Var18);
                                                v(false);
                                                D();
                                            }
                                        }
                                    }
                                    for (r1 r1Var6 : r1VarArr4) {
                                        long e11 = x0Var18.e();
                                        b bVar4 = r1Var6.a;
                                        int i18 = r1Var6.b;
                                        boolean b11 = yVar3.b(i18);
                                        boolean b12 = yVar4.b(i18);
                                        b bVar5 = r1Var6.c;
                                        if (bVar5 == null || (i11 = r1Var6.d) == 3 || (i11 == 0 && r1.h(bVar4))) {
                                            bVar5 = bVar4;
                                        }
                                        if (!b11 || bVar5.D) {
                                            c10 = 65534;
                                        } else {
                                            int i19 = bVar4.b;
                                            c10 = 65534;
                                            boolean z17 = i19 == -2;
                                            q1 q1Var = yVar3.b[i18];
                                            q1 q1Var2 = yVar4.b[i18];
                                            if (!b12 || !Objects.equals(q1Var2, q1Var) || z17 || r1Var6.f()) {
                                                r1.l(bVar5, e11);
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                a1 a1Var7 = this.H;
                x0Var3 = a1Var7.j;
                if (x0Var3 != null && a1Var7.i != x0Var3 && !x0Var3.h) {
                    r1VarArr2 = this.a;
                    a3.y yVar5 = x0Var3.o;
                    z11 = true;
                    for (i10 = 0; i10 < r1VarArr2.length; i10++) {
                        int c11 = r1VarArr2[i10].c();
                        r1 r1Var7 = r1VarArr2[i10];
                        i iVar = this.D;
                        int j17 = r1Var7.j(r1Var7.a, x0Var3, yVar5, iVar);
                        int j18 = r1Var7.j(r1Var7.c, x0Var3, yVar5, iVar);
                        if (j17 == 1) {
                            j17 = j18;
                        }
                        if ((j17 & 2) != 0 && (z12 = this.j0) && z12) {
                            this.j0 = false;
                            if (this.X.p) {
                                this.n.f(2);
                            }
                        }
                        this.k0 -= c11 - r1VarArr2[i10].c();
                        z11 &= (j17 & 1) != 0;
                    }
                    if (z11) {
                        for (int i20 = 0; i20 < r1VarArr2.length; i20++) {
                            if (yVar5.b(i20)) {
                                if (!(r1VarArr2[i20].d(x0Var3) != null)) {
                                    l(x0Var3, i20, false, x0Var3.e());
                                }
                            }
                        }
                    }
                    if (z11) {
                        a1Var7.j.h = true;
                    }
                }
                r1VarArr = this.a;
                a1Var = this.H;
                z9 = false;
                while (s0() && !this.b0 && (x0Var4 = a1Var.i) != null && (x0Var5 = x0Var4.m) != null && this.m0 >= x0Var5.e() && x0Var5.h) {
                    if (z9) {
                        F();
                    }
                    this.u0 = false;
                    a10 = a1Var.a();
                    a10.getClass();
                    if (this.X.b.a.equals(a10.g.a.a)) {
                        x2.g0 g0Var = this.X.b;
                        if (g0Var.b == -1) {
                            x2.g0 g0Var2 = a10.g.a;
                            if (g0Var2.b == -1 && g0Var.e != g0Var2.e) {
                                z10 = true;
                                y0 y0Var2 = a10.g;
                                boolean z18 = z10;
                                x2.g0 g0Var3 = y0Var2.a;
                                long j19 = y0Var2.b;
                                this.X = z(g0Var3, j19, y0Var2.d, j19, !z18, 0);
                                Q();
                                C0();
                                if (f() && a10 == a1Var.k) {
                                    for (r1 r1Var8 : r1VarArr) {
                                        int i21 = r1Var8.d;
                                        if (i21 == 3 || i21 == 4) {
                                            boolean z19 = i21 == 4;
                                            b bVar6 = r1Var8.a;
                                            b bVar7 = r1Var8.c;
                                            if (z19) {
                                                bVar7.getClass();
                                                bVar7.c(17, bVar6);
                                            } else {
                                                bVar7.getClass();
                                                bVar6.c(17, bVar7);
                                            }
                                            r1Var8.d = r1Var8.d == 4 ? 0 : 1;
                                        } else if (i21 == 2) {
                                            r1Var8.d = 0;
                                        }
                                    }
                                }
                                if (this.X.e == 3) {
                                    u0();
                                }
                                a3.y yVar6 = a1Var.i.o;
                                for (i7 = 0; i7 < r1VarArr.length; i7++) {
                                    if (yVar6.b(i7)) {
                                        r1 r1Var9 = r1VarArr[i7];
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
                                z9 = true;
                            }
                        }
                    }
                    z10 = false;
                    y0 y0Var22 = a10.g;
                    boolean z182 = z10;
                    x2.g0 g0Var32 = y0Var22.a;
                    long j192 = y0Var22.b;
                    this.X = z(g0Var32, j192, y0Var22.d, j192, !z182, 0);
                    Q();
                    C0();
                    if (f()) {
                        while (r2 < r1) {
                        }
                    }
                    if (this.X.e == 3) {
                    }
                    a3.y yVar62 = a1Var.i.o;
                    while (i7 < r1VarArr.length) {
                    }
                    z9 = true;
                }
                this.s0.getClass();
            }
        }
        j3 = -9223372036854775807L;
        if (this.e0) {
        }
        a1 a1Var52 = this.H;
        if (!this.b0) {
            ia.p(z13);
            if (((long) ((x0Var7.e() - this.m0) / this.D.j().a)) <= 10000000) {
            }
        }
        boolean z142 = this.O;
        r1[] r1VarArr42 = this.a;
        a1 a1Var62 = this.H;
        x0Var2 = a1Var62.j;
        if (x0Var2 != null) {
        }
        a1 a1Var72 = this.H;
        x0Var3 = a1Var72.j;
        if (x0Var3 != null) {
            r1VarArr2 = this.a;
            a3.y yVar52 = x0Var3.o;
            z11 = true;
            while (i10 < r1VarArr2.length) {
            }
            if (z11) {
            }
            if (z11) {
            }
        }
        r1VarArr = this.a;
        a1Var = this.H;
        z9 = false;
        while (s0()) {
            if (z9) {
            }
            this.u0 = false;
            a10 = a1Var.a();
            a10.getClass();
            if (this.X.b.a.equals(a10.g.a.a)) {
            }
            z10 = false;
            y0 y0Var222 = a10.g;
            boolean z1822 = z10;
            x2.g0 g0Var322 = y0Var222.a;
            long j1922 = y0Var222.b;
            this.X = z(g0Var322, j1922, y0Var222.d, j1922, !z1822, 0);
            Q();
            C0();
            if (f()) {
            }
            if (this.X.e == 3) {
            }
            a3.y yVar622 = a1Var.i.o;
            while (i7 < r1VarArr.length) {
            }
            z9 = true;
        }
        this.s0.getClass();
    }

    public final boolean B(int i7, x2.g0 g0Var) {
        a1 a1Var = this.H;
        x0 x0Var = a1Var.k;
        if (x0Var != null && x0Var.g.a.equals(g0Var)) {
            r1 r1Var = this.a[i7];
            x0 x0Var2 = a1Var.k;
            int i10 = r1Var.d;
            boolean z9 = (i10 == 2 || i10 == 4) && r1Var.d(x0Var2) == r1Var.a;
            boolean z10 = r1Var.d == 3 && r1Var.d(x0Var2) == r1Var.c;
            if (z9 || z10) {
                return true;
            }
        }
        return false;
    }

    public final void B0(int i7, int i10, int i11, boolean z9) {
        boolean z10 = z9 && i7 != -1;
        if (i7 == -1) {
            i11 = 2;
        } else if (i11 == 2) {
            i11 = 1;
        }
        boolean z11 = this.T;
        if (i7 == 0) {
            i10 = 1;
        } else if (i10 == 1) {
            i10 = z11 ? 4 : 0;
        }
        k1 k1Var = this.X;
        if (k1Var.l == z10 && k1Var.n == i10 && k1Var.m == i11) {
            return;
        }
        this.X = k1Var.e(i11, i10, z10);
        E0(false, false);
        a1 a1Var = this.H;
        for (x0 x0Var = a1Var.i; x0Var != null; x0Var = x0Var.m) {
            for (a3.u uVar : x0Var.o.c) {
                if (uVar != null) {
                    uVar.f(z10);
                }
            }
        }
        if (!s0()) {
            w0();
            C0();
            k1 k1Var2 = this.X;
            if (k1Var2.p) {
                this.X = k1Var2.i(false);
            }
            a1Var.m(this.m0);
            return;
        }
        int i12 = this.X.e;
        h2.i0 i0Var = this.n;
        if (i12 != 3) {
            if (i12 == 2) {
                i0Var.f(2);
            }
        } else {
            i iVar = this.D;
            iVar.b = true;
            ((u1) iVar.c).d();
            u0();
            i0Var.f(2);
        }
    }

    public final boolean C() {
        x0 x0Var = this.H.i;
        long j3 = x0Var.g.f;
        if (x0Var.e) {
            return j3 == -9223372036854775807L || this.X.s < j3 || !s0();
        }
        return false;
    }

    /* JADX WARN: Type inference failed for: r2v21, types: [java.lang.Object, x2.e0] */
    public final void C0() {
        long j3;
        float f10;
        x0 x0Var = this.H.i;
        if (x0Var == null) {
            return;
        }
        long n10 = x0Var.e ? x0Var.a.n() : -9223372036854775807L;
        if (n10 != -9223372036854775807L) {
            if (!x0Var.g()) {
                this.H.n(x0Var);
                v(false);
                D();
            }
            R(n10, true);
            if (n10 != this.X.s) {
                k1 k1Var = this.X;
                this.X = z(k1Var.b, n10, k1Var.c, n10, true, 5);
            }
        } else {
            i iVar = this.D;
            boolean z9 = x0Var != this.H.j;
            u1 u1Var = (u1) iVar.c;
            b bVar = (b) iVar.e;
            if (bVar == null || bVar.l() || ((z9 && ((b) iVar.e).n != 2) || (!((b) iVar.e).m() && (z9 || ((b) iVar.e).k())))) {
                iVar.a = true;
                if (iVar.b) {
                    u1Var.d();
                }
            } else {
                w0 w0Var = (w0) iVar.f;
                w0Var.getClass();
                long a10 = w0Var.a();
                if (iVar.a) {
                    if (a10 >= u1Var.a()) {
                        iVar.a = false;
                        if (iVar.b) {
                            u1Var.d();
                        }
                    } else if (u1Var.c) {
                        u1Var.c(u1Var.a());
                        u1Var.c = false;
                    }
                }
                u1Var.c(a10);
                e2.w0 j10 = w0Var.j();
                if (!j10.equals((e2.w0) u1Var.e)) {
                    u1Var.e(j10);
                    ((r0) iVar.d).n.b(16, j10).b();
                }
            }
            long a11 = iVar.a();
            this.m0 = a11;
            long j11 = a11 - x0Var.p;
            long j12 = this.X.s;
            ArrayList arrayList = this.E;
            if (!arrayList.isEmpty() && !this.X.b.b()) {
                if (this.p0) {
                    this.p0 = false;
                }
                k1 k1Var2 = this.X;
                k1Var2.a.b(k1Var2.b.a);
                int min = Math.min(this.o0, arrayList.size());
                if (min > 0 && arrayList.get(min - 1) != null) {
                    throw new ClassCastException();
                }
                if (min < arrayList.size() && arrayList.get(min) != null) {
                    throw new ClassCastException();
                }
                this.o0 = min;
            }
            if (this.D.b()) {
                boolean z10 = !this.Y.d;
                k1 k1Var3 = this.X;
                this.X = z(k1Var3.b, j11, k1Var3.c, j11, z10, 6);
            } else {
                k1 k1Var4 = this.X;
                k1Var4.s = j11;
                k1Var4.t = SystemClock.elapsedRealtime();
            }
        }
        this.X.q = this.H.l.d();
        k1 k1Var5 = this.X;
        k1Var5.r = q(k1Var5.q);
        k1 k1Var6 = this.X;
        if (k1Var6.l && k1Var6.e == 3 && t0(k1Var6.a, k1Var6.b)) {
            k1 k1Var7 = this.X;
            float f11 = 1.0f;
            if (k1Var7.o.a == 1.0f) {
                f fVar = this.J;
                long n11 = n(k1Var7.a, k1Var7.b.a, k1Var7.s);
                long j13 = this.X.r;
                if (fVar.c != -9223372036854775807L) {
                    long j14 = n11 - j13;
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
                        float S = h2.m0.S(j3);
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
                        long j19 = h2.m0.j(n11 - ((long) (Math.max(0.0f, fVar.k - 1.0f) / 1.0E-7f)), fVar.h, j16);
                        fVar.h = j19;
                        long j20 = fVar.g;
                        if (j20 != -9223372036854775807L && j19 > j20) {
                            fVar.h = j20;
                        }
                    }
                    long j21 = n11 - fVar.h;
                    if (Math.abs(j21) < fVar.a) {
                        fVar.k = 1.0f;
                    } else {
                        fVar.k = h2.m0.h((f10 * j21) + 1.0f, fVar.j, fVar.i);
                    }
                    f11 = fVar.k;
                }
                if (this.D.j().a != f11) {
                    e2.w0 w0Var2 = new e2.w0(f11, this.X.o.b);
                    this.n.e(16);
                    this.D.e(w0Var2);
                    y(this.X.o, this.D.j().a, false, false);
                }
            }
        }
    }

    /* JADX WARN: Type inference failed for: r1v14, types: [java.lang.Object, x2.e0] */
    /* JADX WARN: Type inference failed for: r1v21, types: [java.lang.Object, x2.e1] */
    /* JADX WARN: Type inference failed for: r7v1, types: [java.lang.Object, x2.e1] */
    public final void D() {
        boolean b10;
        if (A(this.H.l)) {
            x0 x0Var = this.H.l;
            long q10 = q(!x0Var.e ? 0L : x0Var.a.e());
            x0 x0Var2 = this.H.i;
            long j3 = t0(this.X.a, x0Var.g.a) ? this.J.h : -9223372036854775807L;
            m2.j jVar = this.L;
            e2.l1 l1Var = this.X.a;
            x2.g0 g0Var = x0Var.g.a;
            float f10 = this.D.j().a;
            boolean z9 = this.X.l;
            s0 s0Var = new s0(jVar, l1Var, g0Var, q10, f10, this.c0, j3);
            b10 = ((h) this.f).b(s0Var);
            x0 x0Var3 = this.H.i;
            if (!b10 && x0Var3.e && q10 < 500000 && this.y > 0) {
                x0Var3.a.k(this.X.s);
                b10 = ((h) this.f).b(s0Var);
            }
        } else {
            b10 = false;
        }
        this.e0 = b10;
        if (b10) {
            x0 x0Var4 = this.H.l;
            x0Var4.getClass();
            u0 u0Var = new u0();
            u0Var.a = this.m0 - x0Var4.p;
            float f11 = this.D.j().a;
            ia.f(f11 > 0.0f || f11 == -3.4028235E38f);
            u0Var.b = f11;
            long j10 = this.d0;
            ia.f(j10 >= 0 || j10 == -9223372036854775807L);
            u0Var.c = j10;
            v0 v0Var = new v0(u0Var);
            ia.p(x0Var4.m == null);
            x0Var4.a.c(v0Var);
        }
        x0();
    }

    public final void D0(e2.l1 l1Var, x2.g0 g0Var, e2.l1 l1Var2, x2.g0 g0Var2, long j3, boolean z9) {
        boolean t02 = t0(l1Var, g0Var);
        Object obj = g0Var.a;
        if (!t02) {
            e2.w0 w0Var = g0Var.b() ? e2.w0.d : this.X.o;
            i iVar = this.D;
            if (iVar.j().equals(w0Var)) {
                return;
            }
            this.n.e(16);
            iVar.e(w0Var);
            y(this.X.o, w0Var.a, false, false);
            return;
        }
        e2.i1 i1Var = this.x;
        int i7 = l1Var.g(obj, i1Var).c;
        e2.k1 k1Var = this.w;
        l1Var.n(i7, k1Var);
        e2.f0 f0Var = k1Var.j;
        f fVar = this.J;
        fVar.getClass();
        fVar.c = h2.m0.S(f0Var.a);
        fVar.f = h2.m0.S(f0Var.b);
        fVar.g = h2.m0.S(f0Var.c);
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
            fVar.d = n(l1Var, obj, j3);
            fVar.a();
            return;
        }
        if (!Objects.equals(!l1Var2.p() ? l1Var2.m(l1Var2.g(g0Var2.a, i1Var).c, k1Var, 0L).a : null, k1Var.a) || z9) {
            fVar.d = -9223372036854775807L;
            fVar.a();
        }
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, x2.e0, x2.e1] */
    public final void E() {
        a1 a1Var = this.H;
        a1Var.k();
        x0 x0Var = a1Var.m;
        if (x0Var != null) {
            ?? r12 = x0Var.a;
            if ((!x0Var.d || x0Var.e) && !r12.g()) {
                e2.l1 l1Var = this.X.a;
                if (x0Var.e) {
                    r12.p();
                }
                Iterator it = ((h) this.f).p.values().iterator();
                while (it.hasNext()) {
                    if (((g) it.next()).b) {
                        return;
                    }
                }
                if (!x0Var.d) {
                    long j3 = x0Var.g.b;
                    x0Var.d = true;
                    r12.q(this, j3);
                    return;
                }
                u0 u0Var = new u0();
                u0Var.a = this.m0 - x0Var.p;
                float f10 = this.D.j().a;
                ia.f(f10 > 0.0f || f10 == -3.4028235E38f);
                u0Var.b = f10;
                long j10 = this.d0;
                ia.f(j10 >= 0 || j10 == -9223372036854775807L);
                u0Var.c = j10;
                v0 v0Var = new v0(u0Var);
                ia.p(x0Var.m == null);
                r12.c(v0Var);
            }
        }
    }

    public final void E0(boolean z9, boolean z10) {
        long j3;
        this.c0 = z9;
        if (!z9 || z10) {
            j3 = -9223372036854775807L;
        } else {
            this.F.getClass();
            j3 = SystemClock.elapsedRealtime();
        }
        this.d0 = j3;
    }

    public final void F() {
        o0 o0Var = this.Y;
        k1 k1Var = this.X;
        boolean z9 = o0Var.c | (((k1) o0Var.f) != k1Var);
        o0Var.c = z9;
        o0Var.f = k1Var;
        if (z9) {
            i0 i0Var = this.G.b;
            i0Var.j.d(new ha.b(23, i0Var, o0Var));
            this.Y = new o0(this.X);
        }
    }

    public final void G(int i7) {
        r1 r1Var = this.a[i7];
        try {
            x0 x0Var = this.H.i;
            x0Var.getClass();
            b d = r1Var.d(x0Var);
            d.getClass();
            x2.c1 c1Var = d.r;
            c1Var.getClass();
            c1Var.a();
        } catch (IOException | RuntimeException e10) {
            int i10 = r1Var.a.b;
            if (i10 != 3 && i10 != 5) {
                throw e10;
            }
            a3.y yVar = this.H.i.o;
            h2.a.d("ExoPlayerImplInternal", "Disabling track due to error: " + e2.u.c(yVar.c[i7].n()), e10);
            a3.y yVar2 = new a3.y((q1[]) yVar.b.clone(), (a3.u[]) yVar.c.clone(), yVar.d, yVar.e);
            yVar2.b[i7] = null;
            yVar2.c[i7] = null;
            j(i7);
            x0 x0Var2 = this.H.i;
            x0Var2.a(yVar2, this.X.s, false, new boolean[x0Var2.j.length]);
        }
    }

    public final void H(int i7, boolean z9) {
        boolean[] zArr = this.c;
        if (zArr[i7] != z9) {
            zArr[i7] = z9;
            this.N.d(new c9(this, i7, z9, 1));
        }
    }

    public final void I() {
        w(this.I.b(), true);
    }

    public final void J(n0 n0Var) {
        e2.l1 b10;
        this.Y.f(1);
        int i7 = n0Var.a;
        int i10 = n0Var.b;
        int i11 = n0Var.c;
        x2.h1 h1Var = n0Var.d;
        j1 j1Var = this.I;
        ArrayList arrayList = j1Var.b;
        ia.f(i7 >= 0 && i7 <= i10 && i10 <= arrayList.size() && i11 >= 0);
        j1Var.j = h1Var;
        if (i7 == i10 || i7 == i11) {
            b10 = j1Var.b();
        } else {
            int min = Math.min(i7, i11);
            int max = Math.max(((i10 - i7) + i11) - 1, i10 - 1);
            int i12 = ((i1) arrayList.get(min)).d;
            h2.m0.R(i7, i10, i11, arrayList);
            while (min <= max) {
                i1 i1Var = (i1) arrayList.get(min);
                i1Var.d = i12;
                i12 += i1Var.a.o.e.o();
                min++;
            }
            b10 = j1Var.b();
        }
        w(b10, false);
    }

    public final void K() {
        this.Y.f(1);
        P(false, false, false, true);
        h hVar = (h) this.f;
        ConcurrentHashMap concurrentHashMap = hVar.p;
        long id2 = Thread.currentThread().getId();
        long j3 = hVar.q;
        ia.o("Players that share the same LoadControl must share the same playback thread. See ExoPlayer.Builder.setPlaybackLooper(Looper).", j3 == -1 || j3 == id2);
        hVar.q = id2;
        m2.j jVar = this.L;
        g gVar = (g) concurrentHashMap.get(jVar);
        if (gVar == null) {
            g gVar2 = new g();
            gVar2.a = 1;
            concurrentHashMap.put(jVar, gVar2);
        } else {
            gVar.a++;
        }
        g gVar3 = (g) concurrentHashMap.get(jVar);
        gVar3.getClass();
        Integer num = (Integer) hVar.o.get(jVar.a);
        int intValue = (num == null || num.intValue() == -1) ? hVar.l : num.intValue();
        if (intValue == -1) {
            intValue = 13107200;
        }
        gVar3.c = intValue;
        gVar3.b = false;
        o0(this.X.a.p() ? 4 : 2);
        k1 k1Var = this.X;
        boolean z9 = k1Var.l;
        B0(this.P.d(k1Var.e, z9), k1Var.n, k1Var.m, z9);
        b3.g gVar4 = (b3.g) this.h;
        gVar4.getClass();
        j1 j1Var = this.I;
        ArrayList arrayList = j1Var.b;
        ia.p(!j1Var.k);
        j1Var.l = gVar4;
        for (int i7 = 0; i7 < arrayList.size(); i7++) {
            i1 i1Var = (i1) arrayList.get(i7);
            j1Var.e(i1Var);
            j1Var.g.add(i1Var);
        }
        j1Var.k = true;
        this.n.f(2);
    }

    public final void L(h2.i iVar) {
        m6.n nVar = this.r;
        h2.i0 i0Var = this.n;
        try {
            P(true, false, true, false);
            M();
            t0 t0Var = this.f;
            m2.j jVar = this.L;
            h hVar = (h) t0Var;
            ConcurrentHashMap concurrentHashMap = hVar.p;
            g gVar = (g) concurrentHashMap.get(jVar);
            if (gVar != null) {
                int i7 = gVar.a - 1;
                gVar.a = i7;
                if (i7 == 0) {
                    concurrentHashMap.remove(jVar);
                    hVar.c();
                }
            }
            if (hVar.p.isEmpty()) {
                hVar.q = -1L;
            }
            f2.d dVar = this.P;
            dVar.c = null;
            dVar.a();
            dVar.c(0);
            this.d.a();
            o0(1);
        } finally {
            i0Var.a.removeCallbacksAndMessages(null);
            nVar.g();
            iVar.e();
        }
    }

    public final void M() {
        for (int i7 = 0; i7 < this.a.length; i7++) {
            b bVar = this.b[i7];
            synchronized (bVar.a) {
                bVar.H = null;
            }
            r1 r1Var = this.a[i7];
            b bVar2 = r1Var.a;
            ia.p(bVar2.n == 0);
            bVar2.q();
            r1Var.e = false;
            b bVar3 = r1Var.c;
            if (bVar3 != null) {
                ia.p(bVar3.n == 0);
                bVar3.q();
                r1Var.f = false;
            }
        }
    }

    public final void N(int i7, int i10, x2.h1 h1Var) {
        this.Y.f(1);
        j1 j1Var = this.I;
        j1Var.getClass();
        ia.f(i7 >= 0 && i7 <= i10 && i10 <= j1Var.b.size());
        j1Var.j = h1Var;
        j1Var.g(i7, i10);
        w(j1Var.b(), false);
    }

    /* JADX WARN: Removed duplicated region for block: B:62:0x0164  */
    /* JADX WARN: Removed duplicated region for block: B:65:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void O() {
        int i7;
        int i10;
        float f10 = this.D.j().a;
        a1 a1Var = this.H;
        x0 x0Var = a1Var.i;
        x0 x0Var2 = a1Var.j;
        a3.y yVar = null;
        x0 x0Var3 = x0Var;
        boolean z9 = true;
        while (x0Var3 != null && x0Var3.e) {
            k1 k1Var = this.X;
            a3.y j3 = x0Var3.j(f10, k1Var.a, k1Var.l);
            a3.y yVar2 = x0Var3 == this.H.i ? j3 : yVar;
            a3.y yVar3 = x0Var3.o;
            a3.u[] uVarArr = j3.c;
            if (yVar3 != null && yVar3.c.length == uVarArr.length) {
                for (int i11 = 0; i11 < uVarArr.length; i11++) {
                    if (j3.a(yVar3, i11)) {
                    }
                }
                if (x0Var3 == x0Var2) {
                    z9 = false;
                }
                x0Var3 = x0Var3.m;
                yVar = yVar2;
            }
            if (z9) {
                a1 a1Var2 = this.H;
                x0 x0Var4 = a1Var2.i;
                boolean z10 = (a1Var2.n(x0Var4) & 1) != 0;
                boolean[] zArr = new boolean[this.a.length];
                yVar2.getClass();
                long a10 = x0Var4.a(yVar2, this.X.s, z10, zArr);
                k1 k1Var2 = this.X;
                boolean z11 = (k1Var2.e == 4 || a10 == k1Var2.s) ? false : true;
                k1 k1Var3 = this.X;
                i7 = 4;
                this.X = z(k1Var3.b, a10, k1Var3.c, k1Var3.d, z11, 5);
                if (z11) {
                    R(a10, true);
                }
                i();
                boolean[] zArr2 = new boolean[this.a.length];
                int i12 = 0;
                while (true) {
                    r1[] r1VarArr = this.a;
                    if (i12 >= r1VarArr.length) {
                        break;
                    }
                    int c10 = r1VarArr[i12].c();
                    zArr2[i12] = this.a[i12].g();
                    r1 r1Var = this.a[i12];
                    x2.c1 c1Var = x0Var4.c[i12];
                    i iVar = this.D;
                    long j10 = this.m0;
                    boolean z12 = zArr[i12];
                    b bVar = r1Var.a;
                    if (r1.h(bVar)) {
                        if (c1Var != bVar.r) {
                            r1Var.a(bVar, iVar);
                        } else if (z12) {
                            bVar.z(j10, false, true);
                        }
                    }
                    b bVar2 = r1Var.c;
                    if (bVar2 != null && r1.h(bVar2)) {
                        if (c1Var != bVar2.r) {
                            r1Var.a(bVar2, iVar);
                        } else if (z12) {
                            bVar2.z(j10, false, true);
                        }
                    }
                    if (c10 - this.a[i12].c() > 0) {
                        H(i12, false);
                    }
                    this.k0 -= c10 - this.a[i12].c();
                    i12++;
                }
                m(this.m0, zArr2);
                x0Var4.h = true;
            } else {
                i7 = 4;
                this.H.n(x0Var3);
                if (x0Var3.e) {
                    long max = Math.max(x0Var3.g.b, this.m0 - x0Var3.p);
                    if (this.O && f() && this.H.k == x0Var3) {
                        i();
                    }
                    i10 = 4;
                    x0Var3.a(j3, max, false, new boolean[x0Var3.j.length]);
                    v(true);
                    if (this.X.e == i10) {
                        D();
                        C0();
                        this.n.f(2);
                        return;
                    }
                    return;
                }
            }
            i10 = i7;
            v(true);
            if (this.X.e == i10) {
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
    public final void P(boolean z9, boolean z10, boolean z11, boolean z12) {
        long j3;
        long j10;
        long j11;
        boolean z13;
        e2.l1 l1Var;
        e2.l1 l1Var2;
        x2.g0 g0Var;
        List list;
        this.n.e(2);
        this.U = false;
        if (this.V != null) {
            this.Y.f(1);
            this.V = null;
        }
        this.q0 = null;
        E0(false, true);
        i iVar = this.D;
        iVar.b = false;
        u1 u1Var = (u1) iVar.c;
        if (u1Var.c) {
            u1Var.c(u1Var.a());
            u1Var.c = false;
        }
        this.m0 = 1000000000000L;
        for (int i7 = 0; i7 < this.a.length; i7++) {
            try {
                j(i7);
            } catch (RuntimeException e10) {
                e = e10;
                h2.a.d("ExoPlayerImplInternal", "Disable failed.", e);
                if (z9) {
                }
                this.k0 = 0;
                k1 k1Var = this.X;
                x2.g0 g0Var2 = k1Var.b;
                long j12 = k1Var.s;
                if (!this.X.b.b()) {
                }
                j3 = this.X.c;
                if (z10) {
                }
                this.H.b();
                this.e0 = false;
                l1Var = this.X.a;
                if (z11) {
                }
                l1Var2 = l1Var;
                g0Var = g0Var2;
                k1 k1Var2 = this.X;
                int i10 = k1Var2.e;
                if (z12) {
                }
                x2.q1 q1Var = z13 ? x2.q1.d : k1Var2.h;
                a3.y yVar = z13 ? this.e : k1Var2.i;
                if (z13) {
                }
                this.X = new k1(l1Var2, g0Var, j11, j10, i10, r14, false, q1Var, yVar, list, g0Var, k1Var2.l, k1Var2.m, k1Var2.n, k1Var2.o, j10, 0L, j10, 0L, false);
                if (z11) {
                }
            } catch (l e11) {
                e = e11;
                h2.a.d("ExoPlayerImplInternal", "Disable failed.", e);
                if (z9) {
                }
                this.k0 = 0;
                k1 k1Var3 = this.X;
                x2.g0 g0Var22 = k1Var3.b;
                long j122 = k1Var3.s;
                if (!this.X.b.b()) {
                }
                j3 = this.X.c;
                if (z10) {
                }
                this.H.b();
                this.e0 = false;
                l1Var = this.X.a;
                if (z11) {
                }
                l1Var2 = l1Var;
                g0Var = g0Var22;
                k1 k1Var22 = this.X;
                int i102 = k1Var22.e;
                if (z12) {
                }
                x2.q1 q1Var2 = z13 ? x2.q1.d : k1Var22.h;
                a3.y yVar2 = z13 ? this.e : k1Var22.i;
                if (z13) {
                }
                this.X = new k1(l1Var2, g0Var, j11, j10, i102, r14, false, q1Var2, yVar2, list, g0Var, k1Var22.l, k1Var22.m, k1Var22.n, k1Var22.o, j10, 0L, j10, 0L, false);
                if (z11) {
                }
            }
        }
        this.t0 = -9223372036854775807L;
        if (z9) {
            for (r1 r1Var : this.a) {
                try {
                    r1Var.k();
                } catch (RuntimeException e12) {
                    h2.a.d("ExoPlayerImplInternal", "Reset failed.", e12);
                }
            }
        }
        this.k0 = 0;
        k1 k1Var32 = this.X;
        x2.g0 g0Var222 = k1Var32.b;
        long j1222 = k1Var32.s;
        if (!this.X.b.b()) {
            k1 k1Var4 = this.X;
            e2.i1 i1Var = this.x;
            x2.g0 g0Var3 = k1Var4.b;
            e2.l1 l1Var3 = k1Var4.a;
            if (!l1Var3.p() && !l1Var3.g(g0Var3.a, i1Var).f) {
                j3 = this.X.s;
                if (z10) {
                    j10 = j1222;
                    j11 = j3;
                    z13 = false;
                } else {
                    this.l0 = null;
                    Pair p10 = p(this.X.a);
                    g0Var222 = (x2.g0) p10.first;
                    long longValue = ((Long) p10.second).longValue();
                    z13 = g0Var222.equals(this.X.b) ? false : true;
                    j10 = longValue;
                    j11 = -9223372036854775807L;
                }
                this.H.b();
                this.e0 = false;
                l1Var = this.X.a;
                if (z11 || !(l1Var instanceof p1)) {
                    l1Var2 = l1Var;
                } else {
                    p1 p1Var = (p1) l1Var;
                    x2.h1 h1Var = this.I.j;
                    e2.l1[] l1VarArr = p1Var.l;
                    e2.l1[] l1VarArr2 = new e2.l1[l1VarArr.length];
                    for (int i11 = 0; i11 < l1VarArr.length; i11++) {
                        l1VarArr2[i11] = new o1(l1VarArr[i11]);
                    }
                    l1Var2 = new p1(l1VarArr2, p1Var.m, h1Var);
                    if (g0Var222.b != -1) {
                        l1Var2.g(g0Var222.a, this.x);
                        int i12 = this.x.c;
                        e2.k1 k1Var5 = this.w;
                        l1Var2.m(i12, k1Var5, 0L);
                        if (k1Var5.a()) {
                            g0Var = new x2.g0(g0Var222.a, g0Var222.d);
                            k1 k1Var222 = this.X;
                            int i1022 = k1Var222.e;
                            l lVar = z12 ? null : k1Var222.f;
                            x2.q1 q1Var22 = z13 ? x2.q1.d : k1Var222.h;
                            a3.y yVar22 = z13 ? this.e : k1Var222.i;
                            if (z13) {
                                h9.g0 g0Var4 = h9.i0.b;
                                list = h9.t1.e;
                            } else {
                                list = k1Var222.j;
                            }
                            this.X = new k1(l1Var2, g0Var, j11, j10, i1022, lVar, false, q1Var22, yVar22, list, g0Var, k1Var222.l, k1Var222.m, k1Var222.n, k1Var222.o, j10, 0L, j10, 0L, false);
                            if (z11) {
                                a1 a1Var = this.H;
                                if (!a1Var.q.isEmpty()) {
                                    ArrayList arrayList = new ArrayList();
                                    for (int i13 = 0; i13 < a1Var.q.size(); i13++) {
                                        ((x0) a1Var.q.get(i13)).i();
                                    }
                                    a1Var.q = arrayList;
                                    a1Var.m = null;
                                    a1Var.k();
                                }
                                j1 j1Var = this.I;
                                HashMap hashMap = j1Var.f;
                                for (h1 h1Var2 : hashMap.values()) {
                                    try {
                                        h1Var2.a.p(h1Var2.b);
                                    } catch (RuntimeException e13) {
                                        h2.a.d("MediaSourceList", "Failed to release child source.", e13);
                                    }
                                    x2.a aVar = h1Var2.a;
                                    g1 g1Var = h1Var2.c;
                                    aVar.s(g1Var);
                                    h1Var2.a.r(g1Var);
                                }
                                hashMap.clear();
                                j1Var.g.clear();
                                j1Var.k = false;
                                return;
                            }
                            return;
                        }
                    }
                }
                g0Var = g0Var222;
                k1 k1Var2222 = this.X;
                int i10222 = k1Var2222.e;
                if (z12) {
                }
                x2.q1 q1Var222 = z13 ? x2.q1.d : k1Var2222.h;
                a3.y yVar222 = z13 ? this.e : k1Var2222.i;
                if (z13) {
                }
                this.X = new k1(l1Var2, g0Var, j11, j10, i10222, lVar, false, q1Var222, yVar222, list, g0Var, k1Var2222.l, k1Var2222.m, k1Var2222.n, k1Var2222.o, j10, 0L, j10, 0L, false);
                if (z11) {
                }
            }
        }
        j3 = this.X.c;
        if (z10) {
        }
        this.H.b();
        this.e0 = false;
        l1Var = this.X.a;
        if (z11) {
        }
        l1Var2 = l1Var;
        g0Var = g0Var222;
        k1 k1Var22222 = this.X;
        int i102222 = k1Var22222.e;
        if (z12) {
        }
        x2.q1 q1Var2222 = z13 ? x2.q1.d : k1Var22222.h;
        a3.y yVar2222 = z13 ? this.e : k1Var22222.i;
        if (z13) {
        }
        this.X = new k1(l1Var2, g0Var, j11, j10, i102222, lVar, false, q1Var2222, yVar2222, list, g0Var, k1Var22222.l, k1Var22222.m, k1Var22222.n, k1Var22222.o, j10, 0L, j10, 0L, false);
        if (z11) {
        }
    }

    public final void Q() {
        x0 x0Var = this.H.i;
        this.b0 = x0Var != null && x0Var.g.j && this.a0;
    }

    public final void R(long j3, boolean z9) {
        x0 x0Var = this.H.i;
        long j10 = j3 + (x0Var == null ? 1000000000000L : x0Var.p);
        this.m0 = j10;
        ((u1) this.D.c).c(j10);
        for (r1 r1Var : this.a) {
            long j11 = this.m0;
            b d = r1Var.d(x0Var);
            if (d != null) {
                d.z(j11, false, z9);
            }
        }
        for (x0 x0Var2 = r0.i; x0Var2 != null; x0Var2 = x0Var2.m) {
            for (a3.u uVar : x0Var2.o.c) {
                if (uVar != null) {
                    uVar.s();
                }
            }
        }
    }

    public final void S(e2.l1 l1Var, e2.l1 l1Var2) {
        if (l1Var.p() && l1Var2.p()) {
            return;
        }
        ArrayList arrayList = this.E;
        int size = arrayList.size() - 1;
        if (size < 0) {
            Collections.sort(arrayList);
        } else {
            a8.p0.A(arrayList.get(size));
            throw null;
        }
    }

    public final void V(long j3) {
        boolean z9 = this.T;
        long j10 = w0;
        if (z9) {
            this.S.getClass();
            r2 = this.X.e != 3 ? j10 : 1000L;
            for (r1 r1Var : this.a) {
                long j11 = this.m0;
                long j12 = this.n0;
                b bVar = r1Var.c;
                b bVar2 = r1Var.a;
                long g10 = r1.h(bVar2) ? bVar2.g(j11, j12) : Long.MAX_VALUE;
                if (bVar != null && bVar.n != 0) {
                    g10 = Math.min(g10, bVar.g(j11, j12));
                }
                r2 = Math.min(r2, h2.m0.h0(g10));
            }
            if (this.X.m()) {
                x0 x0Var = this.H.i;
                if ((x0Var != null ? x0Var.m : null) != null) {
                    if ((h2.m0.S(r2) * this.X.o.a) + this.m0 >= r1.e()) {
                        r2 = Math.min(r2, j10);
                    }
                }
            }
        } else if (this.X.e != 3 || s0()) {
            r2 = j10;
        }
        this.n.a.sendEmptyMessageAtTime(2, j3 + r2);
    }

    public final void W(boolean z9) {
        x2.g0 g0Var = this.H.i.g.a;
        long Y = Y(g0Var, this.X.s, true, false);
        if (Y != this.X.s) {
            k1 k1Var = this.X;
            this.X = z(g0Var, Y, k1Var.c, k1Var.d, z9, 5);
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
    public final void X(q0 q0Var) {
        long longValue;
        long j3;
        x2.g0 p10;
        long j10;
        boolean z9;
        boolean z10;
        x2.g0 g0Var;
        long j11;
        boolean z11;
        long j12;
        long j13;
        k1 k1Var;
        int i7;
        long j14;
        int i10;
        long j15;
        x2.g0 g0Var2;
        long j16;
        boolean z12;
        long j17;
        boolean z13;
        long Y;
        k1 k1Var2;
        x2.g0 g0Var3;
        e2.l1 l1Var;
        long j18;
        r0 r0Var = this;
        if (r0Var.U) {
            if (r0Var.V != null) {
                r0Var.W++;
                r0Var.Y.f(1);
            }
            r0Var.V = q0Var;
            return;
        }
        r0Var.Y.f(1);
        Pair T = T(r0Var.X.a, q0Var, true, r0Var.f0, r0Var.g0, r0Var.w, r0Var.x);
        if (T == null) {
            Pair p11 = r0Var.p(r0Var.X.a);
            p10 = (x2.g0) p11.first;
            longValue = ((Long) p11.second).longValue();
            z9 = !r0Var.X.a.p();
            j10 = 0;
            j3 = -9223372036854775807L;
        } else {
            Object obj = T.first;
            longValue = ((Long) T.second).longValue();
            j3 = q0Var.c == -9223372036854775807L ? -9223372036854775807L : longValue;
            p10 = r0Var.H.p(r0Var.X.a, obj, longValue);
            if (p10.b()) {
                r0Var.X.a.g(p10.a, r0Var.x);
                if (r0Var.x.e(p10.b) == p10.c) {
                    r0Var.x.g.getClass();
                }
                r0Var.x.g.a(p10.b).getClass();
                j3 = Math.max(j3, 0L);
                longValue = 0;
                j10 = 0;
            } else {
                j10 = 0;
                if (q0Var.c != -9223372036854775807L) {
                    z9 = false;
                }
            }
            z9 = true;
        }
        try {
            try {
                if (r0Var.X.a.p()) {
                    r0Var.l0 = q0Var;
                } else if (T == null) {
                    if (r0Var.X.e != 1) {
                        r0Var.o0(4);
                    }
                    r0Var.P(false, true, false, true);
                } else {
                    try {
                        try {
                            try {
                                try {
                                    if (p10.equals(r0Var.X.b)) {
                                        try {
                                            x0 x0Var = r0Var.H.i;
                                            if (x0Var == null || !x0Var.e || longValue == j10) {
                                                j13 = longValue;
                                            } else {
                                                ?? r02 = x0Var.a;
                                                long j19 = r0Var.w.m;
                                                if (r0Var.T && j19 != -9223372036854775807L) {
                                                    r0Var.S.getClass();
                                                }
                                                j13 = r02.h(longValue, r0Var.R);
                                            }
                                            if (h2.m0.h0(j13) != h2.m0.h0(r0Var.X.s) || ((i7 = (k1Var = r0Var.X).e) != 2 && i7 != 3)) {
                                                z10 = z9;
                                                g0Var = p10;
                                            }
                                            j14 = k1Var.s;
                                            i10 = 2;
                                            j15 = j14;
                                            z11 = z9;
                                            g0Var2 = p10;
                                            j16 = j3;
                                            r0Var.X = r0Var.z(g0Var2, j14, j16, j15, z11, i10);
                                        } catch (Throwable th2) {
                                            th = th2;
                                            boolean z14 = z9;
                                            g0Var = p10;
                                            z11 = z14;
                                            j12 = longValue;
                                            j11 = j3;
                                            r0Var.X = r0Var.z(g0Var, j12, j11, j12, z11, 2);
                                            throw th;
                                        }
                                    }
                                    z10 = z9;
                                    g0Var = p10;
                                    j13 = longValue;
                                    r0Var.D0(l1Var, g0Var3, l1Var, k1Var2.b, j18, true);
                                    g0Var2 = g0Var3;
                                    j16 = j18;
                                    j14 = Y;
                                    i10 = 2;
                                    j15 = j14;
                                    r0Var = this;
                                    r0Var.X = r0Var.z(g0Var2, j14, j16, j15, z11, i10);
                                } catch (Throwable th3) {
                                    th = th3;
                                    g0Var = g0Var3;
                                    j11 = j18;
                                    j12 = Y;
                                    r0Var.X = r0Var.z(g0Var, j12, j11, j12, z11, 2);
                                    throw th;
                                }
                                l1Var = k1Var2.a;
                                j18 = j3;
                            } catch (Throwable th4) {
                                th = th4;
                                g0Var = g0Var3;
                                j11 = j3;
                                j12 = Y;
                                r0Var.X = r0Var.z(g0Var, j12, j11, j12, z11, 2);
                                throw th;
                            }
                            k1Var2 = r0Var.X;
                            g0Var3 = g0Var;
                        } catch (Throwable th5) {
                            th = th5;
                        }
                        a1 a1Var = r0Var.H;
                        if (a1Var.i != a1Var.j) {
                            j17 = j13;
                            z13 = true;
                        } else {
                            j17 = j13;
                            z13 = false;
                        }
                        Y = r0Var.Y(g0Var, j17, z13, z12);
                        z11 = (longValue != Y) | z10;
                    } catch (Throwable th6) {
                        th = th6;
                        j11 = j3;
                        z11 = z10;
                        j12 = longValue;
                        r0Var.X = r0Var.z(g0Var, j12, j11, j12, z11, 2);
                        throw th;
                    }
                    z12 = r0Var.X.e == 4;
                }
                z11 = z9;
                g0Var2 = p10;
                j14 = longValue;
                j16 = j3;
                i10 = 2;
                j15 = j14;
                r0Var = this;
                r0Var.X = r0Var.z(g0Var2, j14, j16, j15, z11, i10);
            } catch (Throwable th7) {
                th = th7;
                z11 = z9;
                g0Var = p10;
            }
        } catch (Throwable th8) {
            th = th8;
            z10 = z9;
            g0Var = p10;
        }
    }

    /* JADX WARN: Type inference failed for: r10v15, types: [java.lang.Object, x2.e0] */
    /* JADX WARN: Type inference failed for: r10v16, types: [java.lang.Object, x2.e0] */
    /* JADX WARN: Type inference failed for: r10v25, types: [java.lang.Object, x2.e0] */
    /* JADX WARN: Type inference failed for: r10v26, types: [java.lang.Object, x2.e0] */
    public final long Y(x2.g0 g0Var, long j3, boolean z9, boolean z10) {
        a1 a1Var;
        int i7;
        w0();
        boolean z11 = true;
        E0(false, true);
        if (z10 || this.X.e == 3) {
            o0(2);
        }
        x0 x0Var = this.H.i;
        x0 x0Var2 = x0Var;
        while (x0Var2 != null && !g0Var.equals(x0Var2.g.a)) {
            x0Var2 = x0Var2.m;
        }
        if (z9 || x0Var != x0Var2 || (x0Var2 != null && x0Var2.p + j3 < 0)) {
            for (int i10 = 0; i10 < this.a.length; i10++) {
                j(i10);
            }
            this.t0 = -9223372036854775807L;
            if (x0Var2 != null) {
                while (true) {
                    a1Var = this.H;
                    if (a1Var.i == x0Var2) {
                        break;
                    }
                    a1Var.a();
                }
                a1Var.n(x0Var2);
                x0Var2.p = 1000000000000L;
                m(this.H.j.e(), new boolean[this.a.length]);
                x0Var2.h = true;
            }
        }
        i();
        if (this.T) {
            for (r1 r1Var : this.a) {
                if (r1Var.g() && ((i7 = r1Var.a.b) == 2 || i7 == 4)) {
                    this.U = true;
                    break;
                }
            }
        }
        if (x0Var2 != null) {
            this.H.n(x0Var2);
            if (!x0Var2.e) {
                x0Var2.g = x0Var2.g.b(j3, -9223372036854775807L);
            } else if (x0Var2.f) {
                if (this.T) {
                    this.S.getClass();
                    if (!this.X.a.p() && x0Var2.g.a.equals(this.X.b)) {
                        long j10 = x0Var2.p + j3;
                        boolean z12 = true;
                        for (r1 r1Var2 : this.a) {
                            if (r1Var2.g()) {
                                b d = r1Var2.d(x0Var2);
                                z12 &= d != null && d.E(j10);
                            }
                        }
                        if (z12) {
                            ?? r10 = x0Var2.a;
                            long j11 = this.X.s;
                            t1 t1Var = t1.e;
                            if (r10.h(j11, t1Var) == x0Var2.a.h(j3, t1Var)) {
                                z11 = false;
                            }
                        }
                    }
                }
                j3 = x0Var2.a.j(j3);
                x0Var2.a.k(j3 - this.y);
            }
            R(j3, z11);
            D();
        } else {
            this.H.b();
            R(j3, true);
        }
        v(false);
        this.n.f(2);
        return j3;
    }

    public final void Z(n1 n1Var) {
        n1Var.getClass();
        Looper looper = n1Var.e;
        Looper looper2 = this.s;
        h2.i0 i0Var = this.n;
        if (looper != looper2) {
            i0Var.b(15, n1Var).b();
            return;
        }
        h(n1Var);
        int i7 = this.X.e;
        if (i7 == 3 || i7 == 2) {
            i0Var.f(2);
        }
    }

    @Override // x2.d0
    public final void a(x2.e0 e0Var) {
        this.n.b(8, e0Var).b();
    }

    public final void a0(n1 n1Var) {
        Looper looper = n1Var.e;
        if (looper.getThread().isAlive()) {
            this.F.a(looper, null).d(new w(this, n1Var));
        } else {
            h2.a.l("TAG", "Trying to send message on a dead thread.");
            n1Var.a(false);
        }
    }

    @Override // d3.w
    public final void b(long j3, long j10, e2.u uVar, MediaFormat mediaFormat) {
        if (this.U) {
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
    public final void b0(e2.e eVar, boolean z9) {
        int i7;
        a3.s sVar = (a3.s) this.d;
        if (!sVar.j.equals(eVar)) {
            sVar.j = eVar;
            sVar.k();
        }
        if (!z9) {
            eVar = null;
        }
        f2.d dVar = this.P;
        if (!Objects.equals(dVar.d, eVar)) {
            dVar.d = eVar;
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
                        com.google.android.recaptcha.internal.a.o(i10, "Unidentified audio usage: ", "AudioFocusManager");
                        break;
                    case 16:
                        i7 = 4;
                        break;
                }
                dVar.f = i7;
                ia.e("Automatic handling of audio focus is only available for USAGE_MEDIA and USAGE_GAME.", i7 != 1 || i7 == 0);
            }
            i7 = 0;
            dVar.f = i7;
            ia.e("Automatic handling of audio focus is only available for USAGE_MEDIA and USAGE_GAME.", i7 != 1 || i7 == 0);
        }
        k1 k1Var = this.X;
        boolean z10 = k1Var.l;
        B0(dVar.d(k1Var.e, z10), k1Var.n, k1Var.m, z10);
    }

    public final void c(m0 m0Var, int i7) {
        this.Y.f(1);
        j1 j1Var = this.I;
        if (i7 == -1) {
            i7 = j1Var.b.size();
        }
        w(j1Var.a(i7, m0Var.a, m0Var.b), false);
    }

    public final void c0(boolean z9, h2.i iVar) {
        if (this.h0 != z9) {
            this.h0 = z9;
            if (!z9) {
                for (r1 r1Var : this.a) {
                    r1Var.k();
                }
            }
        }
        if (iVar != null) {
            iVar.e();
        }
    }

    @Override // x2.d1
    public final void d(x2.e1 e1Var) {
        this.n.b(9, (x2.e0) e1Var).b();
    }

    public final void d0(k0 k0Var) {
        for (r1 r1Var : this.a) {
            b bVar = r1Var.a;
            if (bVar.b == 4) {
                bVar.c(23, k0Var);
                b bVar2 = r1Var.c;
                if (bVar2 != null) {
                    bVar2.c(23, k0Var);
                }
            }
        }
    }

    public final void e() {
        for (r1 r1Var : this.a) {
            s1 s1Var = this.T ? this.S : null;
            r1Var.a.c(18, s1Var);
            b bVar = r1Var.c;
            if (bVar != null) {
                bVar.c(18, s1Var);
            }
        }
    }

    public final void e0(m0 m0Var) {
        this.Y.f(1);
        int i7 = m0Var.c;
        x2.h1 h1Var = m0Var.b;
        ArrayList arrayList = m0Var.a;
        if (i7 != -1) {
            this.l0 = new q0(new p1(arrayList, h1Var), m0Var.c, m0Var.d);
        }
        j1 j1Var = this.I;
        ArrayList arrayList2 = j1Var.b;
        j1Var.g(0, arrayList2.size());
        w(j1Var.a(arrayList2.size(), arrayList, h1Var), false);
    }

    public final boolean f() {
        if (!this.O) {
            return false;
        }
        for (r1 r1Var : this.a) {
            if (r1Var.f()) {
                return true;
            }
        }
        return false;
    }

    public final void f0(boolean z9) {
        this.a0 = z9;
        Q();
        if (this.b0) {
            a1 a1Var = this.H;
            if (a1Var.j != a1Var.i) {
                W(true);
                v(false);
            }
        }
    }

    public final void g() {
        O();
        W(true);
    }

    public final void g0(e2.w0 w0Var) {
        this.n.e(16);
        i iVar = this.D;
        iVar.e(w0Var);
        e2.w0 j3 = iVar.j();
        y(j3, j3.a, true, true);
    }

    public final void h0(o oVar) {
        this.s0 = oVar;
        e2.l1 l1Var = this.X.a;
        a1 a1Var = this.H;
        a1Var.getClass();
        oVar.getClass();
        if (a1Var.q.isEmpty()) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (int i7 = 0; i7 < a1Var.q.size(); i7++) {
            ((x0) a1Var.q.get(i7)).i();
        }
        a1Var.q = arrayList;
        a1Var.m = null;
        a1Var.k();
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        int i7;
        x0 x0Var;
        x2.g0 g0Var;
        x0 x0Var2;
        int i10;
        try {
            switch (message.what) {
                case 1:
                    boolean z9 = message.arg1 != 0;
                    int i11 = message.arg2;
                    this.Y.f(1);
                    B0(this.P.d(this.X.e, z9), i11 >> 4, i11 & 15, z9);
                    break;
                case 2:
                    k();
                    break;
                case 3:
                    X((q0) message.obj);
                    break;
                case 4:
                    g0((e2.w0) message.obj);
                    break;
                case 5:
                    l0((t1) message.obj);
                    break;
                case 6:
                    v0(false, true);
                    break;
                case 7:
                    L((h2.i) message.obj);
                    return true;
                case 8:
                    x((x2.e0) message.obj);
                    break;
                case 9:
                    t((x2.e0) message.obj);
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
                    c0(message.arg1 != 0, (h2.i) message.obj);
                    break;
                case 14:
                    Z((n1) message.obj);
                    break;
                case 15:
                    a0((n1) message.obj);
                    break;
                case 16:
                    e2.w0 w0Var = (e2.w0) message.obj;
                    y(w0Var, w0Var.a, true, false);
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
                    N(message.arg1, message.arg2, (x2.h1) message.obj);
                    break;
                case 21:
                    n0((x2.h1) message.obj);
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
                    g();
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
                case qs.T /* 30 */:
                    Pair pair = (Pair) message.obj;
                    q0(pair.first, (h2.i) pair.second);
                    break;
                case qs.U /* 31 */:
                    b0((e2.e) message.obj, message.arg1 != 0);
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
                    p0((d3.w) message.obj);
                    break;
                case 36:
                    j0(((Boolean) message.obj).booleanValue());
                    break;
                case 37:
                    this.U = false;
                    q0 q0Var = this.V;
                    if (q0Var != null) {
                        X(q0Var);
                        this.V = null;
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
        } catch (e2.t0 e10) {
            boolean z10 = e10.a;
            int i12 = e10.b;
            if (i12 == 1) {
                i10 = z10 ? 3001 : 3003;
            } else {
                if (i12 == 4) {
                    i10 = z10 ? 3002 : 3004;
                }
                u(e10, r3);
            }
            r3 = i10;
            u(e10, r3);
        } catch (j2.j e11) {
            u(e11, e11.a);
        } catch (IOException e12) {
            u(e12, 2000);
        } catch (RuntimeException e13) {
            l lVar = new l(2, e13, ((e13 instanceof IllegalStateException) || (e13 instanceof IllegalArgumentException)) ? 1004 : 1000);
            h2.a.d("ExoPlayerImplInternal", "Playback error", lVar);
            v0(true, false);
            this.X = this.X.f(lVar);
        } catch (l e14) {
            e = e14;
            int i13 = e.s;
            a1 a1Var = this.H;
            if (i13 == 1 && (x0Var2 = a1Var.j) != null && e.E == null) {
                e = e.a(x0Var2.g.a);
            }
            int i14 = e.s;
            h2.i0 i0Var = this.n;
            if (i14 == 1 && (g0Var = e.E) != null && B(e.x, g0Var)) {
                this.u0 = true;
                i();
                x0 g10 = a1Var.g();
                x0 x0Var3 = a1Var.i;
                if (x0Var3 != g10) {
                    while (x0Var3 != null) {
                        x0 x0Var4 = x0Var3.m;
                        if (x0Var4 == g10) {
                            break;
                        }
                        x0Var3 = x0Var4;
                    }
                }
                a1Var.n(x0Var3);
                if (this.X.e != 4) {
                    D();
                    i0Var.f(2);
                }
            } else {
                l lVar2 = this.q0;
                if (lVar2 != null) {
                    lVar2.addSuppressed(e);
                    e = this.q0;
                }
                if (e.s == 1 && a1Var.i != a1Var.j) {
                    while (true) {
                        x0Var = a1Var.i;
                        if (x0Var == a1Var.j) {
                            break;
                        }
                        a1Var.a();
                    }
                    ia.l(x0Var);
                    F();
                    y0 y0Var = x0Var.g;
                    x2.g0 g0Var2 = y0Var.a;
                    long j3 = y0Var.b;
                    this.X = z(g0Var2, j3, y0Var.d, j3, true, 0);
                }
                if (e.F && (this.q0 == null || (i7 = e.a) == 5004 || i7 == 5003)) {
                    h2.a.m("ExoPlayerImplInternal", "Recoverable renderer error", e);
                    if (this.q0 == null) {
                        this.q0 = e;
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
                    this.X = this.X.f(e);
                }
            }
        } catch (q2.f e15) {
            u(e15, e15.a);
        } catch (x2.b e16) {
            u(e16, 1002);
        }
        F();
        return true;
    }

    public final void i() {
        b bVar;
        if (this.O && f()) {
            for (r1 r1Var : this.a) {
                int c10 = r1Var.c();
                i iVar = this.D;
                if (r1Var.f()) {
                    int i7 = r1Var.d;
                    boolean z9 = i7 == 4 || i7 == 2;
                    int i10 = i7 != 4 ? 0 : 1;
                    if (z9) {
                        try {
                            bVar = r1Var.a;
                        } catch (RuntimeException e10) {
                            h2.a.d("RendererHolder", "Disable prewarming failed.", e10);
                        }
                    } else {
                        bVar = r1Var.c;
                        bVar.getClass();
                    }
                    r1Var.a(bVar, iVar);
                    try {
                        r1Var.i(z9);
                    } catch (RuntimeException e11) {
                        h2.a.d("RendererHolder", "Reset prewarming failed.", e11);
                    }
                    r1Var.d = i10;
                }
                this.k0 -= c10 - r1Var.c();
            }
            this.t0 = -9223372036854775807L;
        }
    }

    public final void i0(int i7) {
        this.f0 = i7;
        e2.l1 l1Var = this.X.a;
        a1 a1Var = this.H;
        a1Var.g = i7;
        int r10 = a1Var.r(l1Var);
        if ((r10 & 1) != 0) {
            W(true);
        } else if ((r10 & 2) != 0) {
            i();
        }
        v(false);
    }

    public final void j(int i7) {
        r1[] r1VarArr = this.a;
        int c10 = r1VarArr[i7].c();
        r1 r1Var = r1VarArr[i7];
        b bVar = r1Var.a;
        i iVar = this.D;
        r1Var.a(bVar, iVar);
        b bVar2 = r1Var.c;
        if (bVar2 != null) {
            boolean z9 = (bVar2.n == 0 || r1Var.d == 3) ? false : true;
            r1Var.a(bVar2, iVar);
            r1Var.i(false);
            if (z9) {
                b bVar3 = r1Var.a;
                bVar2.getClass();
                bVar2.c(17, bVar3);
            }
        }
        r1Var.d = 0;
        H(i7, false);
        this.k0 -= c10;
    }

    public final void j0(boolean z9) {
        if (!z9) {
            q0 q0Var = this.V;
            h2.i0 i0Var = this.n;
            if (q0Var != null && this.U && !i0Var.a.hasMessages(37)) {
                this.W++;
            }
            int i7 = this.W;
            if (i7 > 0) {
                this.N.d(new bg.m0(this, i7, 13));
            }
            this.W = 0;
            this.U = false;
            i0Var.e(37);
            q0 q0Var2 = this.V;
            if (q0Var2 != null) {
                X(q0Var2);
                this.V = null;
                this.U = false;
            }
        }
        this.T = z9;
        e();
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
    public final void k() {
        boolean z9;
        boolean z10;
        long j3;
        boolean z11;
        boolean z12;
        long j10;
        boolean z13;
        int i7;
        boolean z14;
        k1 k1Var;
        int i10;
        boolean z15;
        this.F.getClass();
        long uptimeMillis = SystemClock.uptimeMillis();
        this.n.e(2);
        if (!this.Q) {
            A0();
        }
        int i11 = this.X.e;
        if (i11 == 1 || i11 == 4) {
            return;
        }
        if (this.Q) {
            A0();
        }
        x0 x0Var = this.H.i;
        if (x0Var == null) {
            V(uptimeMillis);
            return;
        }
        Trace.beginSection("doSomeWork");
        C0();
        if (x0Var.e) {
            this.F.getClass();
            this.n0 = h2.m0.S(SystemClock.elapsedRealtime());
            x0Var.a.k(this.X.s - this.y);
            z9 = true;
            z10 = true;
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
                    long j11 = this.m0;
                    long j12 = this.n0;
                    b bVar = r1Var.c;
                    b bVar2 = r1Var.a;
                    if (r1.h(bVar2)) {
                        bVar2.x(j11, j12);
                    }
                    if (bVar != null && bVar.n != 0) {
                        bVar.x(j11, j12);
                    }
                    if (z9) {
                        b bVar3 = r1Var.c;
                        b bVar4 = r1Var.a;
                        boolean l10 = r1.h(bVar4) ? bVar4.l() : true;
                        if (bVar3 != null && bVar3.n != 0) {
                            l10 &= bVar3.l();
                        }
                        if (l10) {
                            z9 = true;
                            b d = r1Var.d(x0Var);
                            z15 = d != null || d.k() || d.m() || d.l();
                            H(i12, z15);
                            z10 = !z10 && z15;
                            if (z15) {
                                G(i12);
                            }
                        }
                    }
                    z9 = false;
                    b d2 = r1Var.d(x0Var);
                    if (d2 != null) {
                    }
                    H(i12, z15);
                    if (z10) {
                    }
                    if (z15) {
                    }
                }
                i12++;
            }
        } else {
            x0Var.a.i();
            z9 = true;
            z10 = true;
        }
        long j13 = x0Var.g.f;
        boolean z16 = z9 && x0Var.e && (j13 == -9223372036854775807L || j13 <= this.X.s);
        if (z16 && this.b0) {
            this.b0 = false;
            int i13 = this.X.n;
            this.Y.f(0);
            B0(this.P.d(this.X.e, false), i13, 5, false);
        }
        if (!z16 || !x0Var.g.k) {
            k1 k1Var2 = this.X;
            if (k1Var2.e == 2) {
                a1 a1Var = this.H;
                if (this.k0 == 0) {
                    z13 = C();
                } else if (z10) {
                    if (k1Var2.g) {
                        x0 x0Var2 = a1Var.i;
                        long j14 = t0(k1Var2.a, x0Var2.g.a) ? this.J.h : -9223372036854775807L;
                        x0 x0Var3 = a1Var.l;
                        boolean z17 = x0Var3.g() && x0Var3.g.k;
                        boolean z18 = x0Var3.g.a.b() && !x0Var3.e;
                        if (!z17 && !z18) {
                            long q10 = q(x0Var3.d());
                            t0 t0Var = this.f;
                            m2.j jVar = this.L;
                            j3 = -9223372036854775807L;
                            e2.l1 l1Var = this.X.a;
                            x2.g0 g0Var = x0Var2.g.a;
                            float f10 = this.D.j().a;
                            boolean z19 = this.X.l;
                            boolean z20 = this.c0;
                            h hVar = (h) t0Var;
                            hVar.getClass();
                            long j15 = j14;
                            e2.g0 g0Var2 = l1Var.m(l1Var.g(g0Var.a, hVar.b).c, hVar.a, 0L).c.b;
                            if (g0Var2 != null) {
                                String scheme = g0Var2.a.getScheme();
                                if (TextUtils.isEmpty(scheme) || h.r.contains(scheme)) {
                                    z12 = true;
                                    long F = h2.m0.F(q10, f10);
                                    j10 = !z20 ? z12 ? hVar.k : hVar.j : z12 ? hVar.i : hVar.h;
                                    if (j15 != -9223372036854775807L) {
                                        j10 = Math.min(j15 / 2, j10);
                                    }
                                    if (j10 > 0 && F < j10) {
                                        if (!(!z12 ? hVar.m : false)) {
                                            g gVar = (g) hVar.p.get(jVar);
                                            gVar.getClass();
                                            synchronized (gVar) {
                                                i7 = gVar.d;
                                            }
                                            int i14 = i7 * hVar.c.b;
                                            g gVar2 = (g) hVar.p.get(jVar);
                                            gVar2.getClass();
                                        }
                                        z13 = false;
                                        if (z13) {
                                            o0(3);
                                            this.q0 = null;
                                            if (s0()) {
                                                E0(false, false);
                                                i iVar = this.D;
                                                z11 = true;
                                                iVar.b = true;
                                                ((u1) iVar.c).d();
                                                u0();
                                                if (this.X.e == 2) {
                                                    int i15 = 0;
                                                    while (true) {
                                                        r1[] r1VarArr2 = this.a;
                                                        if (i15 >= r1VarArr2.length) {
                                                            break;
                                                        }
                                                        if (r1VarArr2[i15].d(x0Var) != null ? z11 : false) {
                                                            G(i15);
                                                        }
                                                        i15++;
                                                    }
                                                    k1 k1Var3 = this.X;
                                                    if (!k1Var3.g && k1Var3.r < 500000 && A(this.H.l) && s0()) {
                                                        z14 = z11;
                                                        if (z14) {
                                                            this.r0 = -9223372036854775807L;
                                                        } else if (this.r0 == -9223372036854775807L) {
                                                            this.F.getClass();
                                                            this.r0 = SystemClock.elapsedRealtime();
                                                        } else {
                                                            this.F.getClass();
                                                            if (SystemClock.elapsedRealtime() - this.r0 >= 4000) {
                                                                throw new h2.f0(0, 4000);
                                                            }
                                                        }
                                                        boolean z21 = (s0() || this.X.e != 3) ? false : z11;
                                                        if (this.j0 || !this.i0 || !z21) {
                                                            z11 = false;
                                                        }
                                                        k1Var = this.X;
                                                        if (k1Var.p != z11) {
                                                            this.X = k1Var.i(z11);
                                                        }
                                                        this.i0 = false;
                                                        if (!z11 && (i10 = this.X.e) != 4 && (z21 || i10 == 2 || (i10 == 3 && this.k0 != 0))) {
                                                            V(uptimeMillis);
                                                        }
                                                        Trace.endSection();
                                                    }
                                                }
                                                z14 = false;
                                                if (z14) {
                                                }
                                                if (s0()) {
                                                }
                                                if (this.j0) {
                                                }
                                                z11 = false;
                                                k1Var = this.X;
                                                if (k1Var.p != z11) {
                                                }
                                                this.i0 = false;
                                                if (!z11) {
                                                    V(uptimeMillis);
                                                }
                                                Trace.endSection();
                                            }
                                        }
                                    }
                                    z13 = true;
                                    if (z13) {
                                    }
                                }
                            }
                            z12 = false;
                            long F2 = h2.m0.F(q10, f10);
                            if (!z20) {
                            }
                            if (j15 != -9223372036854775807L) {
                            }
                            if (j10 > 0) {
                                if (!(!z12 ? hVar.m : false)) {
                                }
                                z13 = false;
                                if (z13) {
                                }
                            }
                            z13 = true;
                            if (z13) {
                            }
                        }
                    }
                    j3 = -9223372036854775807L;
                    z13 = true;
                    if (z13) {
                    }
                } else {
                    z13 = false;
                }
                j3 = -9223372036854775807L;
                if (z13) {
                }
            } else {
                j3 = -9223372036854775807L;
            }
            z11 = true;
            if (this.X.e == 3 && (this.k0 != 0 ? !z10 : !C())) {
                E0(s0(), false);
                o0(2);
                if (this.c0) {
                    for (x0 x0Var4 = this.H.i; x0Var4 != null; x0Var4 = x0Var4.m) {
                        for (a3.u uVar : x0Var4.o.c) {
                            if (uVar != null) {
                                uVar.t();
                            }
                        }
                    }
                    f fVar = this.J;
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
            if (this.X.e == 2) {
            }
            z14 = false;
            if (z14) {
            }
            if (s0()) {
            }
            if (this.j0) {
            }
            z11 = false;
            k1Var = this.X;
            if (k1Var.p != z11) {
            }
            this.i0 = false;
            if (!z11) {
            }
            Trace.endSection();
        }
        o0(4);
        w0();
        z11 = true;
        if (this.X.e == 2) {
        }
        z14 = false;
        if (z14) {
        }
        if (s0()) {
        }
        if (this.j0) {
        }
        z11 = false;
        k1Var = this.X;
        if (k1Var.p != z11) {
        }
        this.i0 = false;
        if (!z11) {
        }
        Trace.endSection();
    }

    public final void k0(s1 s1Var) {
        this.S = s1Var;
        e();
    }

    public final void l(x0 x0Var, int i7, boolean z9, long j3) {
        r1 r1Var = this.a[i7];
        boolean g10 = r1Var.g();
        b bVar = r1Var.a;
        if (g10) {
            return;
        }
        boolean z10 = x0Var == this.H.i;
        a3.y yVar = x0Var.o;
        q1 q1Var = yVar.b[i7];
        a3.u uVar = yVar.c[i7];
        boolean z11 = s0() && this.X.e == 3;
        boolean z12 = !z9 && z11;
        this.k0++;
        x2.c1 c1Var = x0Var.c[i7];
        long j10 = x0Var.p;
        x2.g0 g0Var = x0Var.g.a;
        b bVar2 = r1Var.c;
        int length = uVar != null ? uVar.length() : 0;
        e2.u[] uVarArr = new e2.u[length];
        for (int i10 = 0; i10 < length; i10++) {
            uVar.getClass();
            uVarArr[i10] = uVar.g(i10);
        }
        int i11 = r1Var.d;
        i iVar = this.D;
        if (i11 == 0 || i11 == 2 || i11 == 4) {
            r1Var.e = true;
            ia.p(bVar.n == 0);
            bVar.d = q1Var;
            bVar.G = g0Var;
            bVar.n = 1;
            bVar.o(z12, z10);
            bVar.y(uVarArr, c1Var, j3, j10, g0Var);
            bVar.z(j3, z12, true);
            iVar.h(bVar);
        } else {
            r1Var.f = true;
            bVar2.getClass();
            ia.p(bVar2.n == 0);
            bVar2.d = q1Var;
            bVar2.G = g0Var;
            bVar2.n = 1;
            bVar2.o(z12, z10);
            bVar2.y(uVarArr, c1Var, j3, j10, g0Var);
            bVar2.z(j3, z12, true);
            iVar.h(bVar2);
        }
        l0 l0Var = new l0(this);
        b d = r1Var.d(x0Var);
        d.getClass();
        d.c(11, l0Var);
        if (z11 && z10) {
            r1Var.m();
        }
    }

    public final void l0(t1 t1Var) {
        this.R = t1Var;
    }

    public final void m(long j3, boolean[] zArr) {
        r1[] r1VarArr;
        long j10;
        x0 x0Var = this.H.j;
        a3.y yVar = x0Var.o;
        int i7 = 0;
        while (true) {
            r1VarArr = this.a;
            if (i7 >= r1VarArr.length) {
                break;
            }
            if (!yVar.b(i7)) {
                r1VarArr[i7].k();
            }
            i7++;
        }
        int i10 = 0;
        while (i10 < r1VarArr.length) {
            if (yVar.b(i10) && r1VarArr[i10].d(x0Var) == null) {
                j10 = j3;
                l(x0Var, i10, zArr[i10], j10);
            } else {
                j10 = j3;
            }
            i10++;
            j3 = j10;
        }
    }

    public final void m0(boolean z9) {
        this.g0 = z9;
        e2.l1 l1Var = this.X.a;
        a1 a1Var = this.H;
        a1Var.h = z9;
        int r10 = a1Var.r(l1Var);
        if ((r10 & 1) != 0) {
            W(true);
        } else if ((r10 & 2) != 0) {
            i();
        }
        v(false);
    }

    public final long n(e2.l1 l1Var, Object obj, long j3) {
        e2.i1 i1Var = this.x;
        int i7 = l1Var.g(obj, i1Var).c;
        e2.k1 k1Var = this.w;
        l1Var.n(i7, k1Var);
        if (k1Var.f != -9223372036854775807L && k1Var.a() && k1Var.i) {
            return h2.m0.S(h2.m0.C(k1Var.g) - k1Var.f) - (j3 + i1Var.e);
        }
        return -9223372036854775807L;
    }

    public final void n0(x2.h1 h1Var) {
        this.Y.f(1);
        j1 j1Var = this.I;
        int size = j1Var.b.size();
        if (h1Var.getLength() != size) {
            h1Var = h1Var.i().f(0, size);
        }
        j1Var.j = h1Var;
        w(j1Var.b(), false);
    }

    public final long o(x0 x0Var) {
        if (x0Var == null) {
            return 0L;
        }
        long j3 = x0Var.p;
        if (!x0Var.e) {
            return j3;
        }
        int i7 = 0;
        while (true) {
            r1[] r1VarArr = this.a;
            if (i7 >= r1VarArr.length) {
                return j3;
            }
            if (r1VarArr[i7].d(x0Var) != null) {
                b d = r1VarArr[i7].d(x0Var);
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

    public final void o0(int i7) {
        k1 k1Var = this.X;
        if (k1Var.e != i7) {
            if (i7 != 2) {
                this.r0 = -9223372036854775807L;
            }
            if (i7 != 3 && k1Var.p) {
                this.X = k1Var.i(false);
            }
            this.X = this.X.h(i7);
        }
    }

    public final Pair p(e2.l1 l1Var) {
        long j3 = 0;
        if (l1Var.p()) {
            return Pair.create(k1.u, 0L);
        }
        int a10 = l1Var.a(this.g0);
        Pair i7 = l1Var.i(this.w, this.x, a10, -9223372036854775807L);
        x2.g0 p10 = this.H.p(l1Var, i7.first, 0L);
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

    public final void p0(d3.w wVar) {
        for (r1 r1Var : this.a) {
            b bVar = r1Var.a;
            if (bVar.b == 2) {
                bVar.c(7, wVar);
                b bVar2 = r1Var.c;
                if (bVar2 != null) {
                    bVar2.c(7, wVar);
                }
            }
        }
    }

    public final long q(long j3) {
        x0 x0Var = this.H.l;
        if (x0Var == null) {
            return 0L;
        }
        return Math.max(0L, j3 - (this.m0 - x0Var.p));
    }

    public final void q0(Object obj, h2.i iVar) {
        for (r1 r1Var : this.a) {
            b bVar = r1Var.a;
            if (bVar.b == 2) {
                int i7 = r1Var.d;
                if (i7 == 4 || i7 == 1) {
                    b bVar2 = r1Var.c;
                    bVar2.getClass();
                    bVar2.c(1, obj);
                } else {
                    bVar.c(1, obj);
                }
            }
        }
        int i10 = this.X.e;
        if (i10 == 3 || i10 == 2) {
            this.n.f(2);
        }
        if (iVar != null) {
            iVar.e();
        }
    }

    public final void r(int i7) {
        k1 k1Var = this.X;
        B0(i7, k1Var.n, k1Var.m, k1Var.l);
    }

    public final void r0(float f10) {
        this.v0 = f10;
        float f11 = f10 * this.P.g;
        for (r1 r1Var : this.a) {
            b bVar = r1Var.a;
            if (bVar.b == 1) {
                bVar.c(2, Float.valueOf(f11));
                b bVar2 = r1Var.c;
                if (bVar2 != null) {
                    bVar2.c(2, Float.valueOf(f11));
                }
            }
        }
    }

    public final void s() {
        r0(this.v0);
    }

    public final boolean s0() {
        k1 k1Var = this.X;
        return k1Var.l && k1Var.n == 0;
    }

    public final void t(x2.e0 e0Var) {
        a1 a1Var = this.H;
        x0 x0Var = a1Var.l;
        if (x0Var != null && x0Var.a == e0Var) {
            a1Var.m(this.m0);
            D();
            return;
        }
        x0 x0Var2 = a1Var.m;
        if (x0Var2 == null || x0Var2.a != e0Var) {
            return;
        }
        E();
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

    public final void u(IOException iOException, int i7) {
        l lVar = new l(0, iOException, i7);
        x0 x0Var = this.H.i;
        if (x0Var != null) {
            lVar = lVar.a(x0Var.g.a);
        }
        h2.a.d("ExoPlayerImplInternal", "Playback error", lVar);
        v0(false, false);
        this.X = this.X.f(lVar);
    }

    public final void u0() {
        x0 x0Var = this.H.i;
        if (x0Var == null) {
            return;
        }
        a3.y yVar = x0Var.o;
        int i7 = 0;
        while (true) {
            r1[] r1VarArr = this.a;
            if (i7 >= r1VarArr.length) {
                return;
            }
            if (yVar.b(i7)) {
                r1VarArr[i7].m();
            }
            i7++;
        }
    }

    public final void v(boolean z9) {
        x0 x0Var = this.H.l;
        x2.g0 g0Var = x0Var == null ? this.X.b : x0Var.g.a;
        boolean equals = this.X.k.equals(g0Var);
        if (!equals) {
            this.X = this.X.c(g0Var);
        }
        k1 k1Var = this.X;
        k1Var.q = x0Var == null ? k1Var.s : x0Var.d();
        k1 k1Var2 = this.X;
        k1Var2.r = q(k1Var2.q);
        if ((!equals || z9) && x0Var != null && x0Var.e) {
            y0(x0Var.g.a, x0Var.o);
        }
    }

    public final void v0(boolean z9, boolean z10) {
        P(z9 || !this.h0, false, true, false);
        this.Y.f(z10 ? 1 : 0);
        h hVar = (h) this.f;
        ConcurrentHashMap concurrentHashMap = hVar.p;
        m2.j jVar = this.L;
        g gVar = (g) concurrentHashMap.get(jVar);
        if (gVar != null) {
            int i7 = gVar.a - 1;
            gVar.a = i7;
            if (i7 == 0) {
                concurrentHashMap.remove(jVar);
                hVar.c();
            }
        }
        this.P.d(1, this.X.l);
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
    public final void w(e2.l1 l1Var, boolean z9) {
        long j3;
        e2.k1 k1Var;
        Object obj;
        int i7;
        long j10;
        long j11;
        boolean z10;
        boolean z11;
        boolean z12;
        e2.i1 i1Var;
        boolean z13;
        e2.l1 l1Var2;
        e2.i1 i1Var2;
        e2.l1 l1Var3;
        long j12;
        long j13;
        long j14;
        long j15;
        long j16;
        int i10;
        p0 p0Var;
        int i11;
        long longValue;
        boolean z14;
        int i12;
        boolean z15;
        e2.i1 i1Var3;
        e2.l1 l1Var4;
        e2.l1 l1Var5;
        x2.g0 g0Var;
        boolean z16;
        e2.l1 l1Var6;
        long j17;
        int s5;
        x0 x0Var;
        a1 a1Var;
        k1 k1Var2 = this.X;
        q0 q0Var = this.l0;
        a1 a1Var2 = this.H;
        int i13 = this.f0;
        boolean z17 = this.g0;
        e2.k1 k1Var3 = this.w;
        e2.i1 i1Var4 = this.x;
        if (l1Var.p()) {
            x2.g0 g0Var2 = k1.u;
            boolean z18 = (g0Var2.equals(k1Var2.b) && k1Var2.s == 0) ? false : true;
            p0 p0Var2 = new p0(g0Var2, 0L, -9223372036854775807L, false, true, false, z18, z18 && z9 && !k1Var2.a.p() && !k1Var2.a.g(k1Var2.b.a, i1Var4).f, 4);
            l1Var4 = l1Var;
            j14 = 0;
            p0Var = p0Var2;
            i1Var3 = i1Var4;
        } else {
            x2.g0 g0Var3 = k1Var2.b;
            Object obj2 = g0Var3.a;
            e2.l1 l1Var7 = k1Var2.a;
            boolean z19 = l1Var7.p() || l1Var7.g(g0Var3.a, i1Var4).f;
            long j18 = (k1Var2.b.b() || z19) ? k1Var2.c : k1Var2.s;
            if (q0Var != null) {
                boolean z20 = true;
                j3 = 1;
                e2.l1 l1Var8 = l1Var;
                Pair T = T(l1Var8, q0Var, true, i13, z17, k1Var3, i1Var4);
                if (T == null) {
                    i12 = l1Var8.a(z17);
                    obj = obj2;
                    longValue = j18;
                    z14 = false;
                    z15 = false;
                } else {
                    if (q0Var.c == -9223372036854775807L) {
                        i12 = l1Var8.g(T.first, i1Var4).c;
                        obj = obj2;
                        longValue = j18;
                        z14 = false;
                    } else {
                        obj = T.first;
                        longValue = ((Long) T.second).longValue();
                        z14 = true;
                        i12 = -1;
                    }
                    z15 = k1Var2.e == 4;
                    z20 = false;
                }
                z12 = z14;
                z11 = z20;
                z10 = z15;
                j11 = longValue;
                i7 = i12;
                k1Var = k1Var3;
                l1Var3 = l1Var8;
                i1Var2 = i1Var4;
            } else {
                j3 = 1;
                e2.l1 l1Var9 = l1Var;
                if (k1Var2.a.p()) {
                    i7 = l1Var9.a(z17);
                    k1Var = k1Var3;
                    obj = obj2;
                } else if (l1Var9.b(obj2) == -1) {
                    obj = obj2;
                    int U = U(k1Var3, i1Var4, i13, z17, obj, k1Var2.a, l1Var9);
                    k1Var = k1Var3;
                    e2.l1 l1Var10 = l1Var9;
                    i1Var = i1Var4;
                    if (U == -1) {
                        U = l1Var10.a(z17);
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    i7 = U;
                    z11 = z13;
                    j11 = j18;
                    z10 = false;
                    l1Var2 = l1Var10;
                    z12 = false;
                    l1Var3 = l1Var2;
                    i1Var2 = i1Var;
                } else {
                    k1Var = k1Var3;
                    obj = obj2;
                    if (j18 == -9223372036854775807L) {
                        i7 = l1Var9.g(obj, i1Var4).c;
                    } else if (z19) {
                        k1Var2.a.g(g0Var3.a, i1Var4);
                        if (k1Var2.a.m(i1Var4.c, k1Var, 0L).n == k1Var2.a.b(g0Var3.a)) {
                            Pair i14 = l1Var9.i(k1Var, i1Var4, l1Var9.g(obj, i1Var4).c, j18 + i1Var4.e);
                            obj = i14.first;
                            j10 = ((Long) i14.second).longValue();
                        } else {
                            j10 = l1Var9.g(obj, i1Var4).d != -9223372036854775807L ? h2.m0.j(j18, 0L, i1Var4.d - 1) : j18;
                        }
                        j11 = j10;
                        i7 = -1;
                        z10 = false;
                        z11 = false;
                        z12 = true;
                        l1Var3 = l1Var9;
                        i1Var2 = i1Var4;
                    } else {
                        i7 = -1;
                    }
                }
                j11 = j18;
                z10 = false;
                z11 = false;
                l1Var2 = l1Var9;
                i1Var = i1Var4;
                z12 = false;
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
            x2.g0 p10 = a1Var2.p(l1Var3, obj, j11);
            int i16 = p10.e;
            boolean z21 = i16 == -1 || ((i11 = g0Var3.e) != -1 && i16 >= i11);
            boolean equals = g0Var3.a.equals(obj);
            boolean z22 = equals && !g0Var3.b() && !p10.b() && z21;
            e2.i1 g10 = l1Var3.g(obj, i1Var2);
            if (z19 || j18 != j12) {
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
            if (z22) {
                p10 = g0Var3;
            }
            if (!p10.b()) {
                if (equals && g0Var3.b()) {
                    e2.a a10 = l1Var3.g(obj, i1Var2).g.a(g0Var3.b);
                    a10.getClass();
                    long j19 = k1Var2.c;
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
                j15 = k1Var2.s;
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
            boolean z23 = (p10.equals(k1Var2.b) && j15 == k1Var2.s) ? false : true;
            int i20 = l1Var3.b(k1Var2.b.a) == -1 ? 4 : 3;
            if (p10.a.equals(k1Var2.b.a) && p10.b != -1) {
                e2.a a11 = l1Var3.g(p10.a, i1Var2).g.a(p10.b);
                int i21 = p10.c;
                int[] iArr = a11.e;
                if (i21 >= iArr.length || iArr[i21] != 2) {
                    i10 = 0;
                    p0Var = new p0(p10, j15, j16, z10, z11, z12, z23, (z23 || !z9 || k1Var2.a.p() || k1Var2.a.g(k1Var2.b.a, i1Var2).f) ? false : true, i10);
                    l1Var4 = l1Var3;
                    i1Var3 = i1Var2;
                }
            }
            i10 = i20;
            p0Var = new p0(p10, j15, j16, z10, z11, z12, z23, (z23 || !z9 || k1Var2.a.p() || k1Var2.a.g(k1Var2.b.a, i1Var2).f) ? false : true, i10);
            l1Var4 = l1Var3;
            i1Var3 = i1Var2;
        }
        x2.g0 g0Var4 = p0Var.a;
        long j21 = p0Var.b;
        try {
            if (p0Var.e) {
                z16 = true;
                if (this.X.e != 1) {
                    o0(4);
                }
                P(false, false, false, true);
            } else {
                z16 = true;
            }
            r1[] r1VarArr = this.a;
            int length = r1VarArr.length;
            int i22 = 0;
            e2.l1 l1Var11 = i1Var3;
            while (i22 < length) {
                r1 r1Var = r1VarArr[i22];
                b bVar = r1Var.a;
                boolean equals2 = Objects.equals(bVar.F, l1Var4);
                if (equals2 == 0) {
                    bVar.F = l1Var4;
                    bVar.v();
                }
                b bVar2 = r1Var.c;
                if (bVar2 != null && !Objects.equals(bVar2.F, l1Var4)) {
                    bVar2.F = l1Var4;
                    bVar2.v();
                }
                i22++;
                l1Var11 = equals2;
            }
            try {
                if (p0Var.g) {
                    l1Var11 = l1Var4;
                    if (!l1Var11.p()) {
                        for (x0 x0Var2 = this.H.i; x0Var2 != null; x0Var2 = x0Var2.m) {
                            if (x0Var2.g.a.equals(g0Var4)) {
                                x0Var2.g = this.H.h(l1Var11, x0Var2.g);
                                x0Var2.k();
                            }
                        }
                        boolean z24 = p0Var.d;
                        try {
                            a1Var = this.H;
                            g0Var = g0Var4;
                        } catch (Throwable th2) {
                            th = th2;
                            g0Var = g0Var4;
                            l1Var6 = l1Var11;
                            l1Var5 = l1Var6;
                            k1 k1Var4 = this.X;
                            e2.l1 l1Var12 = k1Var4.a;
                            x2.g0 g0Var5 = k1Var4.b;
                            x2.g0 g0Var6 = g0Var;
                            D0(l1Var5, g0Var6, l1Var12, g0Var5, p0Var.f ? j21 : -9223372036854775807L, false);
                            if (!p0Var.g || p0Var.c != this.X.c) {
                                long j22 = p0Var.c;
                                boolean z25 = p0Var.h;
                                this.X = z(g0Var6, j21, j22, z25 ? j21 : this.X.d, z25, p0Var.i);
                            }
                            Q();
                            S(l1Var5, this.X.a);
                            this.X = this.X.j(l1Var5);
                            if (!l1Var5.p()) {
                                this.l0 = null;
                            }
                            v(false);
                            this.n.f(2);
                            throw th;
                        }
                        try {
                            j21 = Y(g0Var, j21, a1Var.i != a1Var.j ? z16 : false, z24);
                            k1 k1Var5 = this.X;
                            x2.g0 g0Var7 = g0Var;
                            D0(l1Var, g0Var7, k1Var5.a, k1Var5.b, !p0Var.f ? j21 : -9223372036854775807L, false);
                            if (!p0Var.g || p0Var.c != this.X.c) {
                                long j23 = p0Var.c;
                                boolean z26 = p0Var.h;
                                this.X = z(g0Var7, j21, j23, !z26 ? j21 : this.X.d, z26, p0Var.i);
                            }
                            Q();
                            S(l1Var, this.X.a);
                            this.X = this.X.j(l1Var);
                            if (!l1Var.p()) {
                                this.l0 = null;
                            }
                            v(false);
                            this.n.f(2);
                        } catch (Throwable th3) {
                            th = th3;
                            j21 = j21;
                            l1Var6 = l1Var11;
                            l1Var5 = l1Var6;
                            k1 k1Var42 = this.X;
                            e2.l1 l1Var122 = k1Var42.a;
                            x2.g0 g0Var52 = k1Var42.b;
                            x2.g0 g0Var62 = g0Var;
                            D0(l1Var5, g0Var62, l1Var122, g0Var52, p0Var.f ? j21 : -9223372036854775807L, false);
                            if (!p0Var.g) {
                            }
                            long j222 = p0Var.c;
                            boolean z252 = p0Var.h;
                            this.X = z(g0Var62, j21, j222, z252 ? j21 : this.X.d, z252, p0Var.i);
                            Q();
                            S(l1Var5, this.X.a);
                            this.X = this.X.j(l1Var5);
                            if (!l1Var5.p()) {
                            }
                            v(false);
                            this.n.f(2);
                            throw th;
                        }
                    }
                } else {
                    try {
                        x0 x0Var3 = this.H.j;
                        long o4 = x0Var3 == null ? j14 : o(x0Var3);
                        try {
                            try {
                                if (f() && (x0Var = this.H.k) != null) {
                                    j17 = o(x0Var);
                                    s5 = this.H.s(l1Var, this.m0, o4, j17);
                                    if ((s5 & 1) == 0) {
                                        W(false);
                                    } else if ((s5 & 2) != 0) {
                                        i();
                                    }
                                }
                                s5 = this.H.s(l1Var, this.m0, o4, j17);
                                if ((s5 & 1) == 0) {
                                }
                            } catch (Throwable th4) {
                                th = th4;
                                l1Var11 = l1Var;
                                g0Var = g0Var4;
                                l1Var6 = l1Var11;
                                l1Var5 = l1Var6;
                                k1 k1Var422 = this.X;
                                e2.l1 l1Var1222 = k1Var422.a;
                                x2.g0 g0Var522 = k1Var422.b;
                                x2.g0 g0Var622 = g0Var;
                                D0(l1Var5, g0Var622, l1Var1222, g0Var522, p0Var.f ? j21 : -9223372036854775807L, false);
                                if (!p0Var.g) {
                                }
                                long j2222 = p0Var.c;
                                boolean z2522 = p0Var.h;
                                this.X = z(g0Var622, j21, j2222, z2522 ? j21 : this.X.d, z2522, p0Var.i);
                                Q();
                                S(l1Var5, this.X.a);
                                this.X = this.X.j(l1Var5);
                                if (!l1Var5.p()) {
                                }
                                v(false);
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
                k1 k1Var52 = this.X;
                x2.g0 g0Var72 = g0Var;
                D0(l1Var, g0Var72, k1Var52.a, k1Var52.b, !p0Var.f ? j21 : -9223372036854775807L, false);
                if (!p0Var.g) {
                }
                long j232 = p0Var.c;
                boolean z262 = p0Var.h;
                this.X = z(g0Var72, j21, j232, !z262 ? j21 : this.X.d, z262, p0Var.i);
                Q();
                S(l1Var, this.X.a);
                this.X = this.X.j(l1Var);
                if (!l1Var.p()) {
                }
                v(false);
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

    public final void w0() {
        i iVar = this.D;
        iVar.b = false;
        u1 u1Var = (u1) iVar.c;
        if (u1Var.c) {
            u1Var.c(u1Var.a());
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

    public final void x(x2.e0 e0Var) {
        x0 x0Var;
        a1 a1Var = this.H;
        x0 x0Var2 = a1Var.l;
        i iVar = this.D;
        if (x0Var2 != null && x0Var2.a == e0Var) {
            x0Var2.getClass();
            if (!x0Var2.e) {
                float f10 = iVar.j().a;
                k1 k1Var = this.X;
                x0Var2.f(f10, k1Var.a, k1Var.l);
            }
            y0(x0Var2.g.a, x0Var2.o);
            if (x0Var2 == a1Var.i) {
                R(x0Var2.g.b, true);
                m(a1Var.j.e(), new boolean[this.a.length]);
                x0Var2.h = true;
                k1 k1Var2 = this.X;
                x2.g0 g0Var = k1Var2.b;
                long j3 = x0Var2.g.b;
                this.X = z(g0Var, j3, k1Var2.c, j3, false, 5);
            }
            D();
            return;
        }
        int i7 = 0;
        while (true) {
            if (i7 >= a1Var.q.size()) {
                x0Var = null;
                break;
            }
            x0Var = (x0) a1Var.q.get(i7);
            if (x0Var.a == e0Var) {
                break;
            } else {
                i7++;
            }
        }
        if (x0Var != null) {
            ia.p(true ^ x0Var.e);
            float f11 = iVar.j().a;
            k1 k1Var3 = this.X;
            x0Var.f(f11, k1Var3.a, k1Var3.l);
            x0 x0Var3 = a1Var.m;
            if (x0Var3 == null || x0Var3.a != e0Var) {
                return;
            }
            E();
        }
    }

    /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, x2.e1] */
    public final void x0() {
        x0 x0Var = this.H.l;
        boolean z9 = this.e0 || (x0Var != null && x0Var.a.g());
        k1 k1Var = this.X;
        if (z9 != k1Var.g) {
            this.X = k1Var.b(z9);
        }
    }

    public final void y(e2.w0 w0Var, float f10, boolean z9, boolean z10) {
        int i7;
        if (z9) {
            if (z10) {
                this.Y.f(1);
            }
            this.X = this.X.g(w0Var);
        }
        float f11 = w0Var.a;
        x0 x0Var = this.H.i;
        while (true) {
            i7 = 0;
            if (x0Var == null) {
                break;
            }
            a3.u[] uVarArr = x0Var.o.c;
            int length = uVarArr.length;
            while (i7 < length) {
                a3.u uVar = uVarArr[i7];
                if (uVar != null) {
                    uVar.q(f11);
                }
                i7++;
            }
            x0Var = x0Var.m;
        }
        r1[] r1VarArr = this.a;
        int length2 = r1VarArr.length;
        while (i7 < length2) {
            r1 r1Var = r1VarArr[i7];
            float f12 = w0Var.a;
            r1Var.a.A(f10, f12);
            b bVar = r1Var.c;
            if (bVar != null) {
                bVar.A(f10, f12);
            }
            i7++;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00c3 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void y0(x2.g0 g0Var, a3.y yVar) {
        boolean z9;
        int length;
        int i7;
        x0 x0Var = this.H.l;
        x0Var.getClass();
        q(x0Var.d());
        if (t0(this.X.a, x0Var.g.a)) {
            long j3 = this.J.h;
        }
        e2.l1 l1Var = this.X.a;
        float f10 = this.D.j().a;
        boolean z10 = this.X.l;
        a3.u[] uVarArr = yVar.c;
        h hVar = (h) this.f;
        hVar.getClass();
        h9.l0 l0Var = hVar.o;
        m2.j jVar = this.L;
        Integer num = (Integer) l0Var.get(jVar.a);
        int intValue = (num == null || num.intValue() == -1) ? hVar.l : num.intValue();
        g gVar = (g) hVar.p.get(jVar);
        gVar.getClass();
        if (intValue == -1) {
            e2.g0 g0Var2 = l1Var.m(l1Var.g(g0Var.a, hVar.b).c, hVar.a, 0L).c.b;
            if (g0Var2 != null) {
                String scheme = g0Var2.a.getScheme();
                if (TextUtils.isEmpty(scheme) || h.r.contains(scheme)) {
                    z9 = true;
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
                                        i11 = z9 ? 19660800 : 131072000;
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
                            intValue = h2.m0.i(i10, 13107200, 210239488);
                        }
                    }
                }
            }
            z9 = false;
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

    public final k1 z(x2.g0 g0Var, long j3, long j10, long j11, boolean z9, int i7) {
        h9.t1 t1Var;
        boolean z10;
        this.p0 = (!this.p0 && j3 == this.X.s && g0Var.equals(this.X.b)) ? false : true;
        Q();
        k1 k1Var = this.X;
        x2.q1 q1Var = k1Var.h;
        a3.y yVar = k1Var.i;
        List list = k1Var.j;
        if (this.I.k) {
            x0 x0Var = this.H.i;
            q1Var = x0Var == null ? x2.q1.d : x0Var.n;
            yVar = x0Var == null ? this.e : x0Var.o;
            a3.u[] uVarArr = yVar.c;
            h9.f0 f0Var = new h9.f0(4);
            boolean z11 = false;
            for (a3.u uVar : uVarArr) {
                if (uVar != null) {
                    e2.q0 q0Var = uVar.g(0).l;
                    if (q0Var == null) {
                        f0Var.c(new e2.q0(new e2.p0[0]));
                    } else {
                        f0Var.c(q0Var);
                        z11 = true;
                    }
                }
            }
            if (z11) {
                t1Var = f0Var.f();
            } else {
                h9.g0 g0Var2 = h9.i0.b;
                t1Var = h9.t1.e;
            }
            list = t1Var;
            if (x0Var != null) {
                y0 y0Var = x0Var.g;
                if (y0Var.d != j10) {
                    x0Var.g = y0Var.a(j10);
                }
            }
            r1[] r1VarArr = this.a;
            a1 a1Var = this.H;
            x0 x0Var2 = a1Var.i;
            if (x0Var2 == a1Var.j && x0Var2 != null) {
                a3.y yVar2 = x0Var2.o;
                int i10 = 0;
                boolean z12 = false;
                while (true) {
                    if (i10 >= r1VarArr.length) {
                        z10 = true;
                        break;
                    }
                    if (yVar2.b(i10)) {
                        if (r1VarArr[i10].a.b != 1) {
                            z10 = false;
                            break;
                        }
                        if (yVar2.b[i10].a != 0) {
                            z12 = true;
                        }
                    }
                    i10++;
                }
                boolean z13 = z12 && z10;
                if (z13 != this.j0) {
                    this.j0 = z13;
                    if (!z13 && this.X.p) {
                        this.n.f(2);
                    }
                }
            }
        } else if (!g0Var.equals(k1Var.b)) {
            q1Var = x2.q1.d;
            yVar = this.e;
            list = h9.t1.e;
        }
        x2.q1 q1Var2 = q1Var;
        a3.y yVar3 = yVar;
        List list2 = list;
        if (z9) {
            o0 o0Var = this.Y;
            if (!o0Var.d || o0Var.e == 5) {
                o0Var.c = true;
                o0Var.d = true;
                o0Var.e = i7;
            } else {
                ia.f(i7 == 5);
            }
        }
        k1 k1Var2 = this.X;
        return k1Var2.d(g0Var, j3, j10, j11, q(k1Var2.q), q1Var2, yVar3, list2);
    }

    public final void z0(List list, int i7, int i10) {
        this.Y.f(1);
        j1 j1Var = this.I;
        j1Var.getClass();
        ArrayList arrayList = j1Var.b;
        ia.f(i7 >= 0 && i7 <= i10 && i10 <= arrayList.size());
        ia.f(list.size() == i10 - i7);
        for (int i11 = i7; i11 < i10; i11++) {
            ((i1) arrayList.get(i11)).a.t((e2.l0) list.get(i11 - i7));
        }
        w(j1Var.b(), false);
    }
}
