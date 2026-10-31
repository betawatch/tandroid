package i2;

import ag.d3;
import android.content.Context;
import android.media.MediaFormat;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.os.Trace;
import android.text.TextUtils;
import android.util.Pair;
import e9.x1;
import j$.util.Objects;
import j$.util.concurrent.ConcurrentHashMap;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import org.telegram.messenger.zs;
import v7.t6;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final class s0 implements Handler.Callback, u2.d0, n1, a3.y {
    public static final long w0 = e2.l0.h0(10000);
    public final i D;
    public final ArrayList E;
    public final e2.g0 F;
    public final x G;
    public final a1 H;
    public final l1 I;
    public final f J;
    public final long K;
    public final j2.l L;
    public final j2.g M;
    public final e2.i0 N;
    public final boolean O;
    public final c2.d P;
    public final boolean Q;
    public v1 R;
    public u1 S;
    public boolean T;
    public boolean U;
    public r0 V;
    public int W;
    public m1 X;
    public p0 Y;
    public boolean Z;
    public final t1[] a;
    public boolean a0;
    public final b[] b;
    public boolean b0;
    public final boolean[] c;
    public boolean c0;
    public final x2.t d;
    public long d0;
    public final x2.u e;
    public boolean e0;
    public final u0 f;
    public int f0;
    public boolean g0;
    public final y2.c h;
    public boolean h0;
    public boolean i0;
    public boolean j0;
    public int k0;
    public r0 l0;
    public long m0;
    public final e2.i0 n;
    public long n0;
    public int o0;
    public boolean p0;
    public l q0;
    public final j6.m r;
    public long r0;
    public final Looper s;
    public o s0;
    public long t0;
    public boolean u0;
    public float v0;
    public final b2.n1 w;
    public final b2.l1 x;
    public final long y;

    public s0(Context context, b[] bVarArr, b[] bVarArr2, x2.t tVar, x2.u uVar, u0 u0Var, y2.c cVar, int i10, boolean z10, j2.g gVar, v1 v1Var, f fVar, long j10, Looper looper, e2.g0 g0Var, x xVar, j2.l lVar, final a3.y yVar, boolean z11) {
        o oVar = o.a;
        this.t0 = -9223372036854775807L;
        this.G = xVar;
        this.d = tVar;
        this.e = uVar;
        this.f = u0Var;
        this.h = cVar;
        this.f0 = i10;
        this.g0 = z10;
        this.R = v1Var;
        this.J = fVar;
        this.K = j10;
        this.a0 = false;
        this.F = g0Var;
        this.L = lVar;
        this.s0 = oVar;
        this.M = gVar;
        this.v0 = 1.0f;
        this.S = u1.b;
        this.Q = z11;
        this.r0 = -9223372036854775807L;
        this.d0 = -9223372036854775807L;
        this.y = ((h) u0Var).n;
        b2.k1 k1Var = b2.o1.a;
        m1 k10 = m1.k(uVar);
        this.X = k10;
        this.Y = new p0(k10);
        this.b = new b[bVarArr.length];
        this.c = new boolean[bVarArr.length];
        x2.o oVar2 = (x2.o) tVar;
        oVar2.getClass();
        this.a = new t1[bVarArr.length];
        boolean z12 = false;
        for (int i11 = 0; i11 < bVarArr.length; i11++) {
            b bVar = bVarArr[i11];
            bVar.e = i11;
            bVar.f = lVar;
            bVar.h = g0Var;
            this.b[i11] = bVar;
            b bVar2 = this.b[i11];
            synchronized (bVar2.a) {
                bVar2.H = oVar2;
            }
            b bVar3 = bVarArr2[i11];
            if (bVar3 != null) {
                bVar3.e = i11;
                bVar3.f = lVar;
                bVar3.h = g0Var;
                z12 = true;
            }
            this.a[i11] = new t1(bVarArr[i11], bVar3, i11);
        }
        this.O = z12;
        this.D = new i(this, g0Var);
        this.E = new ArrayList();
        this.w = new b2.n1();
        this.x = new b2.l1();
        t6.p(tVar.a == null);
        tVar.a = this;
        tVar.b = cVar;
        this.p0 = true;
        e2.i0 a2 = g0Var.a(looper, null);
        this.N = a2;
        this.H = new a1(gVar, a2, new a1.c(this, 29));
        this.I = new l1(this, gVar, a2, lVar);
        j6.m mVar = new j6.m(5);
        this.r = mVar;
        Looper e = mVar.e();
        this.s = e;
        e2.i0 a10 = g0Var.a(e, this);
        this.n = a10;
        this.P = new c2.d(context, e, this);
        a10.b(35, new a3.y() { // from class: i2.k0
            @Override // a3.y
            public final void a(long j11, long j12, b2.x xVar2, MediaFormat mediaFormat) {
                s0 s0Var = s0.this;
                s0Var.getClass();
                yVar.a(j11, j12, xVar2, mediaFormat);
                s0Var.a(j11, j12, xVar2, mediaFormat);
            }
        }).b();
        a10.b(39, new l0(this)).b();
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, u2.e0, u2.f1] */
    public static boolean A(y0 y0Var) {
        if (y0Var != null) {
            try {
                ?? r12 = y0Var.a;
                if (y0Var.e) {
                    for (u2.d1 d1Var : y0Var.c) {
                        if (d1Var != null) {
                            d1Var.a();
                        }
                    }
                } else {
                    r12.f();
                }
                if ((!y0Var.e ? 0L : r12.c()) != Long.MIN_VALUE) {
                    return true;
                }
            } catch (IOException unused) {
            }
        }
        return false;
    }

    public static Pair T(b2.o1 o1Var, r0 r0Var, boolean z10, int i10, boolean z11, b2.n1 n1Var, b2.l1 l1Var) {
        int U;
        b2.o1 o1Var2 = r0Var.a;
        if (o1Var.p()) {
            return null;
        }
        b2.o1 o1Var3 = o1Var2.p() ? o1Var : o1Var2;
        try {
            Pair i11 = o1Var3.i(n1Var, l1Var, r0Var.b, r0Var.c);
            if (!o1Var.equals(o1Var3)) {
                if (o1Var.b(i11.first) == -1) {
                    if (!z10 || (U = U(n1Var, l1Var, i10, z11, i11.first, o1Var3, o1Var)) == -1) {
                        return null;
                    }
                    return o1Var.i(n1Var, l1Var, U, -9223372036854775807L);
                }
                if (o1Var3.g(i11.first, l1Var).f && o1Var3.m(l1Var.c, n1Var, 0L).n == o1Var3.b(i11.first)) {
                    return o1Var.i(n1Var, l1Var, o1Var.g(i11.first, l1Var).c, r0Var.c);
                }
            }
            return i11;
        } catch (IndexOutOfBoundsException unused) {
            return null;
        }
    }

    public static int U(b2.n1 n1Var, b2.l1 l1Var, int i10, boolean z10, Object obj, b2.o1 o1Var, b2.o1 o1Var2) {
        b2.n1 n1Var2 = n1Var;
        b2.o1 o1Var3 = o1Var;
        Object obj2 = o1Var3.m(o1Var3.g(obj, l1Var).c, n1Var, 0L).a;
        for (int i11 = 0; i11 < o1Var2.o(); i11++) {
            if (o1Var2.m(i11, n1Var, 0L).a.equals(obj2)) {
                return i11;
            }
        }
        int b10 = o1Var3.b(obj);
        int h = o1Var3.h();
        int i12 = -1;
        int i13 = 0;
        while (i13 < h && i12 == -1) {
            b2.o1 o1Var4 = o1Var3;
            int d = o1Var4.d(b10, l1Var, n1Var2, i10, z10);
            if (d == -1) {
                break;
            }
            i12 = o1Var2.b(o1Var4.l(d));
            i13++;
            o1Var3 = o1Var4;
            b10 = d;
            n1Var2 = n1Var;
        }
        if (i12 == -1) {
            return -1;
        }
        return o1Var2.f(i12, l1Var, false).c;
    }

    public static void g(p1 p1Var) {
        try {
            synchronized (p1Var) {
                synchronized (p1Var) {
                }
                p1Var.a.d(p1Var.c, p1Var.d);
                return;
            }
            p1Var.a.d(p1Var.c, p1Var.d);
            return;
        } finally {
            p1Var.a(true);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:99:0x029c, code lost:
    
        if (((long) ((r3.e() - r23.m0) / r23.D.g().a)) > 10000000) goto L254;
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
    /* JADX WARN: Type inference failed for: r1v49, types: [java.lang.Object, u2.e0] */
    /* JADX WARN: Type inference failed for: r2v58, types: [java.lang.Object, u2.e0] */
    /* JADX WARN: Type inference failed for: r2v9, types: [java.lang.Object, u2.e0] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void A0() {
        y0 y0Var;
        long j10;
        y0 y0Var2;
        y0 y0Var3;
        t1[] t1VarArr;
        a1 a1Var;
        boolean z10;
        y0 y0Var4;
        y0 y0Var5;
        y0 a2;
        boolean z11;
        int i10;
        t1[] t1VarArr2;
        int i11;
        boolean z12;
        boolean z13;
        char c10;
        int i12;
        int i13;
        y0 y0Var6;
        y0 y0Var7;
        boolean z14;
        int i14;
        if (this.X.a.p() || !this.I.k) {
            return;
        }
        this.H.m(this.m0);
        a1 a1Var2 = this.H;
        y0 y0Var8 = a1Var2.l;
        if (y0Var8 == null || (!y0Var8.g.k && y0Var8.g() && a1Var2.l.g.f != -9223372036854775807L && a1Var2.n < 100)) {
            a1 a1Var3 = this.H;
            long j11 = this.m0;
            m1 m1Var = this.X;
            y0 y0Var9 = a1Var3.l;
            z0 d = y0Var9 == null ? a1Var3.d(m1Var.a, m1Var.b, m1Var.c, m1Var.s, -9223372036854775807L) : a1Var3.c(m1Var.a, y0Var9, j11);
            if (d != null) {
                a1 a1Var4 = this.H;
                y0 y0Var10 = a1Var4.l;
                long j12 = y0Var10 == null ? 1000000000000L : (y0Var10.p + y0Var10.g.f) - d.b;
                int i15 = 0;
                while (true) {
                    if (i15 >= a1Var4.q.size()) {
                        y0Var = null;
                        break;
                    }
                    z0 z0Var = ((y0) a1Var4.q.get(i15)).g;
                    long j13 = z0Var.f;
                    long j14 = d.f;
                    if ((j13 == -9223372036854775807L || j13 == j14) && z0Var.b == d.b && z0Var.a.equals(d.a)) {
                        y0Var = (y0) a1Var4.q.remove(i15);
                        break;
                    }
                    i15++;
                }
                if (y0Var == null) {
                    s0 s0Var = (s0) a1Var4.e.b;
                    b[] bVarArr = s0Var.b;
                    x2.t tVar = s0Var.d;
                    u0 u0Var = s0Var.f;
                    j2.l lVar = s0Var.L;
                    h hVar = (h) u0Var;
                    hVar.getClass();
                    j10 = -9223372036854775807L;
                    android.support.v4.media.session.a0 a0Var = new android.support.v4.media.session.a0(hVar, lVar);
                    l1 l1Var = s0Var.I;
                    x2.u uVar = s0Var.e;
                    s0Var.s0.getClass();
                    y0Var = new y0(bVarArr, j12, tVar, a0Var, l1Var, d, uVar);
                } else {
                    j10 = -9223372036854775807L;
                    y0Var.g = d;
                    y0Var.p = j12;
                }
                y0 y0Var11 = a1Var4.l;
                if (y0Var11 == null) {
                    a1Var4.i = y0Var;
                    a1Var4.j = y0Var;
                    a1Var4.k = y0Var;
                } else if (y0Var != y0Var11.m) {
                    y0Var11.b();
                    y0Var11.m = y0Var;
                    y0Var11.c();
                }
                a1Var4.o = null;
                a1Var4.l = y0Var;
                a1Var4.n++;
                a1Var4.l();
                if (!y0Var.d) {
                    long j15 = d.b;
                    y0Var.d = true;
                    y0Var.a.j(this, j15);
                } else if (y0Var.e) {
                    this.n.b(8, y0Var.a).b();
                }
                if (this.H.i == y0Var) {
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
                if (!this.b0 && this.O && !this.u0 && !d() && (y0Var6 = a1Var5.k) != null && y0Var6 == a1Var5.j && (y0Var7 = y0Var6.m) != null && (z14 = y0Var7.e)) {
                    t6.p(z14);
                    if (((long) ((y0Var7.e() - this.m0) / this.D.g().a)) <= 10000000) {
                        y0 y0Var12 = a1Var5.k;
                        y0Var12.getClass();
                        a1Var5.k = y0Var12.m;
                        a1Var5.l();
                        a1Var5.k.getClass();
                        t1[] t1VarArr3 = this.a;
                        y0 y0Var13 = a1Var5.k;
                        if (y0Var13 != null) {
                            x2.u uVar2 = y0Var13.o;
                            for (int i16 = 0; i16 < t1VarArr3.length; i16++) {
                                if (uVar2.b(i16)) {
                                    t1 t1Var = t1VarArr3[i16];
                                    if (t1Var.c != null && !t1Var.f()) {
                                        t1 t1Var2 = t1VarArr3[i16];
                                        t6.p(!t1Var2.f());
                                        if (t1.h(t1Var2.a)) {
                                            i14 = 3;
                                        } else {
                                            b bVar = t1Var2.c;
                                            i14 = (bVar == null || bVar.n == 0) ? 2 : 4;
                                        }
                                        t1Var2.d = i14;
                                        k(y0Var13, i16, false, y0Var13.e());
                                    }
                                }
                            }
                            if (d()) {
                                this.t0 = y0Var13.a.k();
                                if (!y0Var13.g()) {
                                    a1Var5.n(y0Var13);
                                    v(false);
                                    D();
                                }
                            }
                        }
                    }
                }
                boolean z15 = this.O;
                t1[] t1VarArr4 = this.a;
                a1 a1Var6 = this.H;
                y0Var2 = a1Var6.j;
                if (y0Var2 != null) {
                    if (y0Var2.m == null || this.b0) {
                        if (y0Var2.g.k || this.b0) {
                            for (t1 t1Var3 : t1VarArr4) {
                                if (t1Var3.d(y0Var2) != null) {
                                    b d10 = t1Var3.d(y0Var2);
                                    d10.getClass();
                                    if (d10.k()) {
                                        long j16 = y0Var2.g.f;
                                        long j17 = (j16 == -9223372036854775807L || j16 == Long.MIN_VALUE) ? -9223372036854775807L : j16 + y0Var2.p;
                                        b d11 = t1Var3.d(y0Var2);
                                        d11.getClass();
                                        t1.l(d11, j17);
                                    }
                                }
                            }
                        }
                    } else if (y0Var2.e) {
                        int i17 = 0;
                        while (true) {
                            if (i17 < t1VarArr4.length) {
                                t1 t1Var4 = t1VarArr4[i17];
                                if (!t1Var4.e(y0Var2, t1Var4.a) || !t1Var4.e(y0Var2, t1Var4.c)) {
                                    break;
                                } else {
                                    i17++;
                                }
                            } else if (!d() || a1Var6.k != a1Var6.j) {
                                y0 y0Var14 = y0Var2.m;
                                if (y0Var14.e || this.m0 >= y0Var14.e()) {
                                    boolean z16 = y0Var2.m.e;
                                    if (z16) {
                                        t6.p(z16);
                                    }
                                    x2.u uVar3 = y0Var2.o;
                                    y0 y0Var15 = a1Var6.k;
                                    y0 y0Var16 = a1Var6.j;
                                    if (y0Var15 == y0Var16) {
                                        y0Var16.getClass();
                                        a1Var6.k = y0Var16.m;
                                    }
                                    y0 y0Var17 = a1Var6.j;
                                    y0Var17.getClass();
                                    a1Var6.j = y0Var17.m;
                                    a1Var6.l();
                                    y0 y0Var18 = a1Var6.j;
                                    y0Var18.getClass();
                                    x2.u uVar4 = y0Var18.o;
                                    b2.o1 o1Var = this.X.a;
                                    D0(o1Var, y0Var18.g.a, o1Var, y0Var2.g.a, -9223372036854775807L, false);
                                    if (y0Var18.e && ((z15 && this.t0 != j10) || y0Var18.a.k() != j10)) {
                                        this.t0 = j10;
                                        boolean z17 = z15 && !this.u0;
                                        if (z17) {
                                            int i18 = 0;
                                            while (true) {
                                                if (i18 >= t1VarArr4.length) {
                                                    break;
                                                }
                                                boolean b10 = uVar4.b(i18);
                                                x2.q[] qVarArr = uVar4.c;
                                                if (b10 && t1VarArr4[i18].a.b != -2 && !b2.v0.a(qVarArr[i18].m().s, qVarArr[i18].m().k) && !t1VarArr4[i18].f()) {
                                                    z17 = false;
                                                    break;
                                                }
                                                i18++;
                                            }
                                        }
                                        if (!z17) {
                                            long e = y0Var18.e();
                                            for (t1 t1Var5 : t1VarArr4) {
                                                b bVar2 = t1Var5.c;
                                                b bVar3 = t1Var5.a;
                                                if (t1.h(bVar3) && (i13 = t1Var5.d) != 4 && i13 != 2) {
                                                    t1.l(bVar3, e);
                                                }
                                                if (bVar2 != null) {
                                                    if ((bVar2.n != 0) && t1Var5.d != 3) {
                                                        t1.l(bVar2, e);
                                                    }
                                                }
                                            }
                                            if (!y0Var18.g()) {
                                                a1Var6.n(y0Var18);
                                                v(false);
                                                D();
                                            }
                                        }
                                    }
                                    for (t1 t1Var6 : t1VarArr4) {
                                        long e7 = y0Var18.e();
                                        b bVar4 = t1Var6.a;
                                        int i19 = t1Var6.b;
                                        boolean b11 = uVar3.b(i19);
                                        boolean b12 = uVar4.b(i19);
                                        b bVar5 = t1Var6.c;
                                        if (bVar5 == null || (i12 = t1Var6.d) == 3 || (i12 == 0 && t1.h(bVar4))) {
                                            bVar5 = bVar4;
                                        }
                                        if (!b11 || bVar5.D) {
                                            c10 = 65534;
                                        } else {
                                            int i20 = bVar4.b;
                                            c10 = 65534;
                                            boolean z18 = i20 == -2;
                                            s1 s1Var = uVar3.b[i19];
                                            s1 s1Var2 = uVar4.b[i19];
                                            if (!b12 || !Objects.equals(s1Var2, s1Var) || z18 || t1Var6.f()) {
                                                t1.l(bVar5, e7);
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                a1 a1Var7 = this.H;
                y0Var3 = a1Var7.j;
                if (y0Var3 != null && a1Var7.i != y0Var3 && !y0Var3.h) {
                    t1VarArr2 = this.a;
                    x2.u uVar5 = y0Var3.o;
                    z12 = true;
                    for (i11 = 0; i11 < t1VarArr2.length; i11++) {
                        int c11 = t1VarArr2[i11].c();
                        t1 t1Var7 = t1VarArr2[i11];
                        i iVar = this.D;
                        int j18 = t1Var7.j(t1Var7.a, y0Var3, uVar5, iVar);
                        int j19 = t1Var7.j(t1Var7.c, y0Var3, uVar5, iVar);
                        if (j18 == 1) {
                            j18 = j19;
                        }
                        if ((j18 & 2) != 0 && (z13 = this.j0) && z13) {
                            this.j0 = false;
                            if (this.X.p) {
                                this.n.f(2);
                            }
                        }
                        this.k0 -= c11 - t1VarArr2[i11].c();
                        z12 &= (j18 & 1) != 0;
                    }
                    if (z12) {
                        for (int i21 = 0; i21 < t1VarArr2.length; i21++) {
                            if (uVar5.b(i21)) {
                                if (!(t1VarArr2[i21].d(y0Var3) != null)) {
                                    k(y0Var3, i21, false, y0Var3.e());
                                }
                            }
                        }
                    }
                    if (z12) {
                        a1Var7.j.h = true;
                    }
                }
                t1VarArr = this.a;
                a1Var = this.H;
                z10 = false;
                while (s0() && !this.b0 && (y0Var4 = a1Var.i) != null && (y0Var5 = y0Var4.m) != null && this.m0 >= y0Var5.e() && y0Var5.h) {
                    if (z10) {
                        F();
                    }
                    this.u0 = false;
                    a2 = a1Var.a();
                    a2.getClass();
                    if (this.X.b.a.equals(a2.g.a.a)) {
                        u2.g0 g0Var = this.X.b;
                        if (g0Var.b == -1) {
                            u2.g0 g0Var2 = a2.g.a;
                            if (g0Var2.b == -1 && g0Var.e != g0Var2.e) {
                                z11 = true;
                                z0 z0Var2 = a2.g;
                                boolean z19 = z11;
                                u2.g0 g0Var3 = z0Var2.a;
                                long j20 = z0Var2.b;
                                this.X = z(g0Var3, j20, z0Var2.d, j20, !z19, 0);
                                Q();
                                C0();
                                if (d() && a2 == a1Var.k) {
                                    for (t1 t1Var8 : t1VarArr) {
                                        int i22 = t1Var8.d;
                                        if (i22 == 3 || i22 == 4) {
                                            boolean z20 = i22 == 4;
                                            b bVar6 = t1Var8.a;
                                            b bVar7 = t1Var8.c;
                                            if (z20) {
                                                bVar7.getClass();
                                                bVar7.d(17, bVar6);
                                            } else {
                                                bVar7.getClass();
                                                bVar6.d(17, bVar7);
                                            }
                                            t1Var8.d = t1Var8.d == 4 ? 0 : 1;
                                        } else if (i22 == 2) {
                                            t1Var8.d = 0;
                                        }
                                    }
                                }
                                if (this.X.e == 3) {
                                    u0();
                                }
                                x2.u uVar6 = a1Var.i.o;
                                for (i10 = 0; i10 < t1VarArr.length; i10++) {
                                    if (uVar6.b(i10)) {
                                        t1 t1Var9 = t1VarArr[i10];
                                        b bVar8 = t1Var9.c;
                                        b bVar9 = t1Var9.a;
                                        if (t1.h(bVar9)) {
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
                    z0 z0Var22 = a2.g;
                    boolean z192 = z11;
                    u2.g0 g0Var32 = z0Var22.a;
                    long j202 = z0Var22.b;
                    this.X = z(g0Var32, j202, z0Var22.d, j202, !z192, 0);
                    Q();
                    C0();
                    if (d()) {
                        while (r2 < r1) {
                        }
                    }
                    if (this.X.e == 3) {
                    }
                    x2.u uVar62 = a1Var.i.o;
                    while (i10 < t1VarArr.length) {
                    }
                    z10 = true;
                }
                this.s0.getClass();
            }
        }
        j10 = -9223372036854775807L;
        if (this.e0) {
        }
        a1 a1Var52 = this.H;
        if (!this.b0) {
            t6.p(z14);
            if (((long) ((y0Var7.e() - this.m0) / this.D.g().a)) <= 10000000) {
            }
        }
        boolean z152 = this.O;
        t1[] t1VarArr42 = this.a;
        a1 a1Var62 = this.H;
        y0Var2 = a1Var62.j;
        if (y0Var2 != null) {
        }
        a1 a1Var72 = this.H;
        y0Var3 = a1Var72.j;
        if (y0Var3 != null) {
            t1VarArr2 = this.a;
            x2.u uVar52 = y0Var3.o;
            z12 = true;
            while (i11 < t1VarArr2.length) {
            }
            if (z12) {
            }
            if (z12) {
            }
        }
        t1VarArr = this.a;
        a1Var = this.H;
        z10 = false;
        while (s0()) {
            if (z10) {
            }
            this.u0 = false;
            a2 = a1Var.a();
            a2.getClass();
            if (this.X.b.a.equals(a2.g.a.a)) {
            }
            z11 = false;
            z0 z0Var222 = a2.g;
            boolean z1922 = z11;
            u2.g0 g0Var322 = z0Var222.a;
            long j2022 = z0Var222.b;
            this.X = z(g0Var322, j2022, z0Var222.d, j2022, !z1922, 0);
            Q();
            C0();
            if (d()) {
            }
            if (this.X.e == 3) {
            }
            x2.u uVar622 = a1Var.i.o;
            while (i10 < t1VarArr.length) {
            }
            z10 = true;
        }
        this.s0.getClass();
    }

    public final boolean B(int i10, u2.g0 g0Var) {
        a1 a1Var = this.H;
        y0 y0Var = a1Var.k;
        if (y0Var != null && y0Var.g.a.equals(g0Var)) {
            t1 t1Var = this.a[i10];
            y0 y0Var2 = a1Var.k;
            int i11 = t1Var.d;
            boolean z10 = (i11 == 2 || i11 == 4) && t1Var.d(y0Var2) == t1Var.a;
            boolean z11 = t1Var.d == 3 && t1Var.d(y0Var2) == t1Var.c;
            if (z10 || z11) {
                return true;
            }
        }
        return false;
    }

    public final void B0(int i10, int i11, int i12, boolean z10) {
        boolean z11 = z10 && i10 != -1;
        if (i10 == -1) {
            i12 = 2;
        } else if (i12 == 2) {
            i12 = 1;
        }
        boolean z12 = this.T;
        if (i10 == 0) {
            i11 = 1;
        } else if (i11 == 1) {
            i11 = z12 ? 4 : 0;
        }
        m1 m1Var = this.X;
        if (m1Var.l == z11 && m1Var.n == i11 && m1Var.m == i12) {
            return;
        }
        this.X = m1Var.e(i12, i11, z11);
        E0(false, false);
        a1 a1Var = this.H;
        for (y0 y0Var = a1Var.i; y0Var != null; y0Var = y0Var.m) {
            for (x2.q qVar : y0Var.o.c) {
                if (qVar != null) {
                    qVar.e(z11);
                }
            }
        }
        if (!s0()) {
            w0();
            C0();
            m1 m1Var2 = this.X;
            if (m1Var2.p) {
                this.X = m1Var2.i(false);
            }
            a1Var.m(this.m0);
            return;
        }
        int i13 = this.X.e;
        e2.i0 i0Var = this.n;
        if (i13 != 3) {
            if (i13 == 2) {
                i0Var.f(2);
            }
        } else {
            i iVar = this.D;
            iVar.f = true;
            iVar.a.e();
            u0();
            i0Var.f(2);
        }
    }

    public final boolean C() {
        y0 y0Var = this.H.i;
        long j10 = y0Var.g.f;
        if (y0Var.e) {
            return j10 == -9223372036854775807L || this.X.s < j10 || !s0();
        }
        return false;
    }

    /* JADX WARN: Type inference failed for: r2v21, types: [java.lang.Object, u2.e0] */
    public final void C0() {
        long j10;
        float f7;
        y0 y0Var = this.H.i;
        if (y0Var == null) {
            return;
        }
        long k10 = y0Var.e ? y0Var.a.k() : -9223372036854775807L;
        if (k10 != -9223372036854775807L) {
            if (!y0Var.g()) {
                this.H.n(y0Var);
                v(false);
                D();
            }
            R(k10, true);
            if (k10 != this.X.s) {
                m1 m1Var = this.X;
                this.X = z(m1Var.b, k10, m1Var.c, k10, true, 5);
            }
        } else {
            i iVar = this.D;
            boolean z10 = y0Var != this.H.j;
            w1 w1Var = iVar.a;
            b bVar = iVar.c;
            if (bVar == null || bVar.l() || ((z10 && iVar.c.n != 2) || (!iVar.c.m() && (z10 || iVar.c.k())))) {
                iVar.e = true;
                if (iVar.f) {
                    w1Var.e();
                }
            } else {
                x0 x0Var = iVar.d;
                x0Var.getClass();
                long a2 = x0Var.a();
                if (iVar.e) {
                    if (a2 >= w1Var.a()) {
                        iVar.e = false;
                        if (iVar.f) {
                            w1Var.e();
                        }
                    } else if (w1Var.c) {
                        w1Var.d(w1Var.a());
                        w1Var.c = false;
                    }
                }
                w1Var.d(a2);
                b2.z0 g10 = x0Var.g();
                if (!g10.equals((b2.z0) w1Var.e)) {
                    w1Var.c(g10);
                    iVar.b.n.b(16, g10).b();
                }
            }
            long a10 = iVar.a();
            this.m0 = a10;
            long j11 = a10 - y0Var.p;
            long j12 = this.X.s;
            ArrayList arrayList = this.E;
            if (!arrayList.isEmpty() && !this.X.b.b()) {
                if (this.p0) {
                    this.p0 = false;
                }
                m1 m1Var2 = this.X;
                m1Var2.a.b(m1Var2.b.a);
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
                boolean z11 = !this.Y.d;
                m1 m1Var3 = this.X;
                this.X = z(m1Var3.b, j11, m1Var3.c, j11, z11, 6);
            } else {
                m1 m1Var4 = this.X;
                m1Var4.s = j11;
                m1Var4.t = SystemClock.elapsedRealtime();
            }
        }
        this.X.q = this.H.l.d();
        m1 m1Var5 = this.X;
        m1Var5.r = p(m1Var5.q);
        m1 m1Var6 = this.X;
        if (m1Var6.l && m1Var6.e == 3 && t0(m1Var6.a, m1Var6.b)) {
            m1 m1Var7 = this.X;
            float f10 = 1.0f;
            if (m1Var7.o.a == 1.0f) {
                f fVar = this.J;
                long m10 = m(m1Var7.a, m1Var7.b.a, m1Var7.s);
                long j13 = this.X.r;
                if (fVar.c != -9223372036854775807L) {
                    long j14 = m10 - j13;
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
                            f10 = fVar.k;
                        }
                    } else {
                        j10 = 1000;
                    }
                    fVar.l = SystemClock.elapsedRealtime();
                    long j16 = (fVar.n * 3) + fVar.m;
                    if (fVar.h > j16) {
                        float S = e2.l0.S(j10);
                        f7 = 1.0E-7f;
                        long[] jArr = {j16, fVar.e, fVar.h - (((long) ((fVar.k - 1.0f) * S)) + ((long) ((fVar.i - 1.0f) * S)))};
                        long j17 = jArr[0];
                        for (int i10 = 1; i10 < 3; i10++) {
                            long j18 = jArr[i10];
                            if (j18 > j17) {
                                j17 = j18;
                            }
                        }
                        fVar.h = j17;
                    } else {
                        f7 = 1.0E-7f;
                        long j19 = e2.l0.j(m10 - ((long) (Math.max(0.0f, fVar.k - 1.0f) / 1.0E-7f)), fVar.h, j16);
                        fVar.h = j19;
                        long j20 = fVar.g;
                        if (j20 != -9223372036854775807L && j19 > j20) {
                            fVar.h = j20;
                        }
                    }
                    long j21 = m10 - fVar.h;
                    if (Math.abs(j21) < fVar.a) {
                        fVar.k = 1.0f;
                    } else {
                        fVar.k = e2.l0.h((f7 * j21) + 1.0f, fVar.j, fVar.i);
                    }
                    f10 = fVar.k;
                }
                if (this.D.g().a != f10) {
                    b2.z0 z0Var = new b2.z0(f10, this.X.o.b);
                    this.n.e(16);
                    this.D.c(z0Var);
                    y(this.X.o, this.D.g().a, false, false);
                }
            }
        }
    }

    /* JADX WARN: Type inference failed for: r1v14, types: [java.lang.Object, u2.e0] */
    /* JADX WARN: Type inference failed for: r1v21, types: [java.lang.Object, u2.f1] */
    /* JADX WARN: Type inference failed for: r7v1, types: [java.lang.Object, u2.f1] */
    public final void D() {
        boolean b10;
        if (A(this.H.l)) {
            y0 y0Var = this.H.l;
            long p5 = p(!y0Var.e ? 0L : y0Var.a.c());
            y0 y0Var2 = this.H.i;
            long j10 = t0(this.X.a, y0Var.g.a) ? this.J.h : -9223372036854775807L;
            j2.l lVar = this.L;
            b2.o1 o1Var = this.X.a;
            u2.g0 g0Var = y0Var.g.a;
            float f7 = this.D.g().a;
            boolean z10 = this.X.l;
            t0 t0Var = new t0(lVar, o1Var, g0Var, p5, f7, this.c0, j10);
            b10 = ((h) this.f).b(t0Var);
            y0 y0Var3 = this.H.i;
            if (!b10 && y0Var3.e && p5 < 500000 && this.y > 0) {
                y0Var3.a.h(this.X.s);
                b10 = ((h) this.f).b(t0Var);
            }
        } else {
            b10 = false;
        }
        this.e0 = b10;
        if (b10) {
            y0 y0Var4 = this.H.l;
            y0Var4.getClass();
            v0 v0Var = new v0();
            v0Var.a = this.m0 - y0Var4.p;
            float f10 = this.D.g().a;
            t6.f(f10 > 0.0f || f10 == -3.4028235E38f);
            v0Var.b = f10;
            long j11 = this.d0;
            t6.f(j11 >= 0 || j11 == -9223372036854775807L);
            v0Var.c = j11;
            w0 w0Var = new w0(v0Var);
            t6.p(y0Var4.m == null);
            y0Var4.a.m(w0Var);
        }
        x0();
    }

    public final void D0(b2.o1 o1Var, u2.g0 g0Var, b2.o1 o1Var2, u2.g0 g0Var2, long j10, boolean z10) {
        boolean t02 = t0(o1Var, g0Var);
        Object obj = g0Var.a;
        if (!t02) {
            b2.z0 z0Var = g0Var.b() ? b2.z0.d : this.X.o;
            i iVar = this.D;
            if (iVar.g().equals(z0Var)) {
                return;
            }
            this.n.e(16);
            iVar.c(z0Var);
            y(this.X.o, z0Var.a, false, false);
            return;
        }
        b2.l1 l1Var = this.x;
        int i10 = o1Var.g(obj, l1Var).c;
        b2.n1 n1Var = this.w;
        o1Var.n(i10, n1Var);
        b2.j0 j0Var = n1Var.j;
        f fVar = this.J;
        fVar.getClass();
        fVar.c = e2.l0.S(j0Var.a);
        fVar.f = e2.l0.S(j0Var.b);
        fVar.g = e2.l0.S(j0Var.c);
        float f7 = j0Var.d;
        if (f7 == -3.4028235E38f) {
            f7 = 0.97f;
        }
        fVar.j = f7;
        float f10 = j0Var.e;
        if (f10 == -3.4028235E38f) {
            f10 = 1.03f;
        }
        fVar.i = f10;
        if (f7 == 1.0f && f10 == 1.0f) {
            fVar.c = -9223372036854775807L;
        }
        fVar.a();
        if (j10 != -9223372036854775807L) {
            fVar.d = m(o1Var, obj, j10);
            fVar.a();
            return;
        }
        if (!Objects.equals(!o1Var2.p() ? o1Var2.m(o1Var2.g(g0Var2.a, l1Var).c, n1Var, 0L).a : null, n1Var.a) || z10) {
            fVar.d = -9223372036854775807L;
            fVar.a();
        }
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, u2.e0, u2.f1] */
    public final void E() {
        a1 a1Var = this.H;
        a1Var.k();
        y0 y0Var = a1Var.m;
        if (y0Var != null) {
            ?? r12 = y0Var.a;
            if ((!y0Var.d || y0Var.e) && !r12.d()) {
                b2.o1 o1Var = this.X.a;
                if (y0Var.e) {
                    r12.s();
                }
                Iterator it = ((h) this.f).p.values().iterator();
                while (it.hasNext()) {
                    if (((g) it.next()).b) {
                        return;
                    }
                }
                if (!y0Var.d) {
                    long j10 = y0Var.g.b;
                    y0Var.d = true;
                    r12.j(this, j10);
                    return;
                }
                v0 v0Var = new v0();
                v0Var.a = this.m0 - y0Var.p;
                float f7 = this.D.g().a;
                t6.f(f7 > 0.0f || f7 == -3.4028235E38f);
                v0Var.b = f7;
                long j11 = this.d0;
                t6.f(j11 >= 0 || j11 == -9223372036854775807L);
                v0Var.c = j11;
                w0 w0Var = new w0(v0Var);
                t6.p(y0Var.m == null);
                r12.m(w0Var);
            }
        }
    }

    public final void E0(boolean z10, boolean z11) {
        long j10;
        this.c0 = z10;
        if (!z10 || z11) {
            j10 = -9223372036854775807L;
        } else {
            this.F.getClass();
            j10 = SystemClock.elapsedRealtime();
        }
        this.d0 = j10;
    }

    public final void F() {
        p0 p0Var = this.Y;
        m1 m1Var = this.X;
        boolean z10 = p0Var.c | (((m1) p0Var.f) != m1Var);
        p0Var.c = z10;
        p0Var.f = m1Var;
        if (z10) {
            i0 i0Var = this.G.b;
            i0Var.j.d(new d1.e(15, i0Var, p0Var));
            this.Y = new p0(this.X);
        }
    }

    public final void G(int i10) {
        t1 t1Var = this.a[i10];
        try {
            y0 y0Var = this.H.i;
            y0Var.getClass();
            b d = t1Var.d(y0Var);
            d.getClass();
            u2.d1 d1Var = d.r;
            d1Var.getClass();
            d1Var.a();
        } catch (IOException | RuntimeException e) {
            int i11 = t1Var.a.b;
            if (i11 != 3 && i11 != 5) {
                throw e;
            }
            x2.u uVar = this.H.i.o;
            e2.a.d("ExoPlayerImplInternal", "Disabling track due to error: " + b2.x.c(uVar.c[i10].m()), e);
            x2.u uVar2 = new x2.u((s1[]) uVar.b.clone(), (x2.q[]) uVar.c.clone(), uVar.d, uVar.e);
            uVar2.b[i10] = null;
            uVar2.c[i10] = null;
            i(i10);
            y0 y0Var2 = this.H.i;
            y0Var2.a(uVar2, this.X.s, false, new boolean[y0Var2.j.length]);
        }
    }

    public final void H(int i10, boolean z10) {
        boolean[] zArr = this.c;
        if (zArr[i10] != z10) {
            zArr[i10] = z10;
            this.N.d(new j0(this, i10, z10, 0));
        }
    }

    public final void I() {
        w(this.I.b(), true);
    }

    public final void J(o0 o0Var) {
        b2.o1 b10;
        this.Y.f(1);
        int i10 = o0Var.a;
        int i11 = o0Var.b;
        int i12 = o0Var.c;
        u2.i1 i1Var = o0Var.d;
        l1 l1Var = this.I;
        ArrayList arrayList = l1Var.b;
        t6.f(i10 >= 0 && i10 <= i11 && i11 <= arrayList.size() && i12 >= 0);
        l1Var.j = i1Var;
        if (i10 == i11 || i10 == i12) {
            b10 = l1Var.b();
        } else {
            int min = Math.min(i10, i12);
            int max = Math.max(((i11 - i10) + i12) - 1, i11 - 1);
            int i13 = ((k1) arrayList.get(min)).d;
            e2.l0.R(i10, i11, i12, arrayList);
            while (min <= max) {
                k1 k1Var = (k1) arrayList.get(min);
                k1Var.d = i13;
                i13 += k1Var.a.o.e.o();
                min++;
            }
            b10 = l1Var.b();
        }
        w(b10, false);
    }

    public final void K() {
        this.Y.f(1);
        P(false, false, false, true);
        h hVar = (h) this.f;
        ConcurrentHashMap concurrentHashMap = hVar.p;
        long id2 = Thread.currentThread().getId();
        long j10 = hVar.q;
        t6.o("Players that share the same LoadControl must share the same playback thread. See ExoPlayer.Builder.setPlaybackLooper(Looper).", j10 == -1 || j10 == id2);
        hVar.q = id2;
        j2.l lVar = this.L;
        g gVar = (g) concurrentHashMap.get(lVar);
        if (gVar == null) {
            g gVar2 = new g();
            gVar2.a = 1;
            concurrentHashMap.put(lVar, gVar2);
        } else {
            gVar.a++;
        }
        g gVar3 = (g) concurrentHashMap.get(lVar);
        gVar3.getClass();
        Integer num = (Integer) hVar.o.get(lVar.a);
        int intValue = (num == null || num.intValue() == -1) ? hVar.l : num.intValue();
        if (intValue == -1) {
            intValue = 13107200;
        }
        gVar3.c = intValue;
        gVar3.b = false;
        o0(this.X.a.p() ? 4 : 2);
        m1 m1Var = this.X;
        boolean z10 = m1Var.l;
        B0(this.P.d(m1Var.e, z10), m1Var.n, m1Var.m, z10);
        y2.f fVar = (y2.f) this.h;
        fVar.getClass();
        l1 l1Var = this.I;
        ArrayList arrayList = l1Var.b;
        t6.p(!l1Var.k);
        l1Var.l = fVar;
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            k1 k1Var = (k1) arrayList.get(i10);
            l1Var.e(k1Var);
            l1Var.g.add(k1Var);
        }
        l1Var.k = true;
        this.n.f(2);
    }

    public final void L(e2.i iVar) {
        j6.m mVar = this.r;
        e2.i0 i0Var = this.n;
        try {
            P(true, false, true, false);
            M();
            u0 u0Var = this.f;
            j2.l lVar = this.L;
            h hVar = (h) u0Var;
            ConcurrentHashMap concurrentHashMap = hVar.p;
            g gVar = (g) concurrentHashMap.get(lVar);
            if (gVar != null) {
                int i10 = gVar.a - 1;
                gVar.a = i10;
                if (i10 == 0) {
                    concurrentHashMap.remove(lVar);
                    hVar.c();
                }
            }
            if (hVar.p.isEmpty()) {
                hVar.q = -1L;
            }
            c2.d dVar = this.P;
            dVar.c = null;
            dVar.a();
            dVar.c(0);
            this.d.a();
            o0(1);
        } finally {
            i0Var.a.removeCallbacksAndMessages(null);
            mVar.g();
            iVar.e();
        }
    }

    public final void M() {
        for (int i10 = 0; i10 < this.a.length; i10++) {
            b bVar = this.b[i10];
            synchronized (bVar.a) {
                bVar.H = null;
            }
            t1 t1Var = this.a[i10];
            b bVar2 = t1Var.a;
            t6.p(bVar2.n == 0);
            bVar2.q();
            t1Var.e = false;
            b bVar3 = t1Var.c;
            if (bVar3 != null) {
                t6.p(bVar3.n == 0);
                bVar3.q();
                t1Var.f = false;
            }
        }
    }

    public final void N(int i10, int i11, u2.i1 i1Var) {
        this.Y.f(1);
        l1 l1Var = this.I;
        l1Var.getClass();
        t6.f(i10 >= 0 && i10 <= i11 && i11 <= l1Var.b.size());
        l1Var.j = i1Var;
        l1Var.g(i10, i11);
        w(l1Var.b(), false);
    }

    /* JADX WARN: Removed duplicated region for block: B:62:0x0164  */
    /* JADX WARN: Removed duplicated region for block: B:65:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void O() {
        int i10;
        int i11;
        float f7 = this.D.g().a;
        a1 a1Var = this.H;
        y0 y0Var = a1Var.i;
        y0 y0Var2 = a1Var.j;
        x2.u uVar = null;
        y0 y0Var3 = y0Var;
        boolean z10 = true;
        while (y0Var3 != null && y0Var3.e) {
            m1 m1Var = this.X;
            x2.u j10 = y0Var3.j(f7, m1Var.a, m1Var.l);
            x2.u uVar2 = y0Var3 == this.H.i ? j10 : uVar;
            x2.u uVar3 = y0Var3.o;
            x2.q[] qVarArr = j10.c;
            if (uVar3 != null && uVar3.c.length == qVarArr.length) {
                for (int i12 = 0; i12 < qVarArr.length; i12++) {
                    if (j10.a(uVar3, i12)) {
                    }
                }
                if (y0Var3 == y0Var2) {
                    z10 = false;
                }
                y0Var3 = y0Var3.m;
                uVar = uVar2;
            }
            if (z10) {
                a1 a1Var2 = this.H;
                y0 y0Var4 = a1Var2.i;
                boolean z11 = (a1Var2.n(y0Var4) & 1) != 0;
                boolean[] zArr = new boolean[this.a.length];
                uVar2.getClass();
                long a2 = y0Var4.a(uVar2, this.X.s, z11, zArr);
                m1 m1Var2 = this.X;
                boolean z12 = (m1Var2.e == 4 || a2 == m1Var2.s) ? false : true;
                m1 m1Var3 = this.X;
                i10 = 4;
                this.X = z(m1Var3.b, a2, m1Var3.c, m1Var3.d, z12, 5);
                if (z12) {
                    R(a2, true);
                }
                h();
                boolean[] zArr2 = new boolean[this.a.length];
                int i13 = 0;
                while (true) {
                    t1[] t1VarArr = this.a;
                    if (i13 >= t1VarArr.length) {
                        break;
                    }
                    int c10 = t1VarArr[i13].c();
                    zArr2[i13] = this.a[i13].g();
                    t1 t1Var = this.a[i13];
                    u2.d1 d1Var = y0Var4.c[i13];
                    i iVar = this.D;
                    long j11 = this.m0;
                    boolean z13 = zArr[i13];
                    b bVar = t1Var.a;
                    if (t1.h(bVar)) {
                        if (d1Var != bVar.r) {
                            t1Var.a(bVar, iVar);
                        } else if (z13) {
                            bVar.z(j11, false, true);
                        }
                    }
                    b bVar2 = t1Var.c;
                    if (bVar2 != null && t1.h(bVar2)) {
                        if (d1Var != bVar2.r) {
                            t1Var.a(bVar2, iVar);
                        } else if (z13) {
                            bVar2.z(j11, false, true);
                        }
                    }
                    if (c10 - this.a[i13].c() > 0) {
                        H(i13, false);
                    }
                    this.k0 -= c10 - this.a[i13].c();
                    i13++;
                }
                l(this.m0, zArr2);
                y0Var4.h = true;
            } else {
                i10 = 4;
                this.H.n(y0Var3);
                if (y0Var3.e) {
                    long max = Math.max(y0Var3.g.b, this.m0 - y0Var3.p);
                    if (this.O && d() && this.H.k == y0Var3) {
                        h();
                    }
                    i11 = 4;
                    y0Var3.a(j10, max, false, new boolean[y0Var3.j.length]);
                    v(true);
                    if (this.X.e == i11) {
                        D();
                        C0();
                        this.n.f(2);
                        return;
                    }
                    return;
                }
            }
            i11 = i10;
            v(true);
            if (this.X.e == i11) {
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
        b2.o1 o1Var;
        b2.o1 o1Var2;
        u2.g0 g0Var;
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
        iVar.f = false;
        w1 w1Var = iVar.a;
        if (w1Var.c) {
            w1Var.d(w1Var.a());
            w1Var.c = false;
        }
        this.m0 = 1000000000000L;
        for (int i10 = 0; i10 < this.a.length; i10++) {
            try {
                i(i10);
            } catch (l e) {
                e = e;
                e2.a.d("ExoPlayerImplInternal", "Disable failed.", e);
                if (z10) {
                }
                this.k0 = 0;
                m1 m1Var = this.X;
                u2.g0 g0Var2 = m1Var.b;
                long j13 = m1Var.s;
                if (!this.X.b.b()) {
                }
                j10 = this.X.c;
                if (z11) {
                }
                this.H.b();
                this.e0 = false;
                o1Var = this.X.a;
                if (z12) {
                }
                o1Var2 = o1Var;
                g0Var = g0Var2;
                m1 m1Var2 = this.X;
                int i11 = m1Var2.e;
                if (z13) {
                }
                u2.r1 r1Var = z14 ? u2.r1.d : m1Var2.h;
                x2.u uVar = z14 ? this.e : m1Var2.i;
                if (z14) {
                }
                this.X = new m1(o1Var2, g0Var, j12, j11, i11, r14, false, r1Var, uVar, list, g0Var, m1Var2.l, m1Var2.m, m1Var2.n, m1Var2.o, j11, 0L, j11, 0L, false);
                if (z12) {
                }
            } catch (RuntimeException e7) {
                e = e7;
                e2.a.d("ExoPlayerImplInternal", "Disable failed.", e);
                if (z10) {
                }
                this.k0 = 0;
                m1 m1Var3 = this.X;
                u2.g0 g0Var22 = m1Var3.b;
                long j132 = m1Var3.s;
                if (!this.X.b.b()) {
                }
                j10 = this.X.c;
                if (z11) {
                }
                this.H.b();
                this.e0 = false;
                o1Var = this.X.a;
                if (z12) {
                }
                o1Var2 = o1Var;
                g0Var = g0Var22;
                m1 m1Var22 = this.X;
                int i112 = m1Var22.e;
                if (z13) {
                }
                u2.r1 r1Var2 = z14 ? u2.r1.d : m1Var22.h;
                x2.u uVar2 = z14 ? this.e : m1Var22.i;
                if (z14) {
                }
                this.X = new m1(o1Var2, g0Var, j12, j11, i112, r14, false, r1Var2, uVar2, list, g0Var, m1Var22.l, m1Var22.m, m1Var22.n, m1Var22.o, j11, 0L, j11, 0L, false);
                if (z12) {
                }
            }
        }
        this.t0 = -9223372036854775807L;
        if (z10) {
            for (t1 t1Var : this.a) {
                try {
                    t1Var.k();
                } catch (RuntimeException e10) {
                    e2.a.d("ExoPlayerImplInternal", "Reset failed.", e10);
                }
            }
        }
        this.k0 = 0;
        m1 m1Var32 = this.X;
        u2.g0 g0Var222 = m1Var32.b;
        long j1322 = m1Var32.s;
        if (!this.X.b.b()) {
            m1 m1Var4 = this.X;
            b2.l1 l1Var = this.x;
            u2.g0 g0Var3 = m1Var4.b;
            b2.o1 o1Var3 = m1Var4.a;
            if (!o1Var3.p() && !o1Var3.g(g0Var3.a, l1Var).f) {
                j10 = this.X.s;
                if (z11) {
                    j11 = j1322;
                    j12 = j10;
                    z14 = false;
                } else {
                    this.l0 = null;
                    Pair o10 = o(this.X.a);
                    g0Var222 = (u2.g0) o10.first;
                    long longValue = ((Long) o10.second).longValue();
                    z14 = g0Var222.equals(this.X.b) ? false : true;
                    j11 = longValue;
                    j12 = -9223372036854775807L;
                }
                this.H.b();
                this.e0 = false;
                o1Var = this.X.a;
                if (z12 || !(o1Var instanceof r1)) {
                    o1Var2 = o1Var;
                } else {
                    r1 r1Var3 = (r1) o1Var;
                    u2.i1 i1Var = this.I.j;
                    b2.o1[] o1VarArr = r1Var3.l;
                    b2.o1[] o1VarArr2 = new b2.o1[o1VarArr.length];
                    for (int i12 = 0; i12 < o1VarArr.length; i12++) {
                        o1VarArr2[i12] = new q1(o1VarArr[i12]);
                    }
                    o1Var2 = new r1(o1VarArr2, r1Var3.m, i1Var);
                    if (g0Var222.b != -1) {
                        o1Var2.g(g0Var222.a, this.x);
                        int i13 = this.x.c;
                        b2.n1 n1Var = this.w;
                        o1Var2.m(i13, n1Var, 0L);
                        if (n1Var.a()) {
                            g0Var = new u2.g0(g0Var222.a, g0Var222.d);
                            m1 m1Var222 = this.X;
                            int i1122 = m1Var222.e;
                            l lVar = z13 ? null : m1Var222.f;
                            u2.r1 r1Var22 = z14 ? u2.r1.d : m1Var222.h;
                            x2.u uVar22 = z14 ? this.e : m1Var222.i;
                            if (z14) {
                                e9.l0 l0Var = e9.n0.b;
                                list = x1.e;
                            } else {
                                list = m1Var222.j;
                            }
                            this.X = new m1(o1Var2, g0Var, j12, j11, i1122, lVar, false, r1Var22, uVar22, list, g0Var, m1Var222.l, m1Var222.m, m1Var222.n, m1Var222.o, j11, 0L, j11, 0L, false);
                            if (z12) {
                                a1 a1Var = this.H;
                                if (!a1Var.q.isEmpty()) {
                                    ArrayList arrayList = new ArrayList();
                                    for (int i14 = 0; i14 < a1Var.q.size(); i14++) {
                                        ((y0) a1Var.q.get(i14)).i();
                                    }
                                    a1Var.q = arrayList;
                                    a1Var.m = null;
                                    a1Var.k();
                                }
                                l1 l1Var2 = this.I;
                                HashMap hashMap = l1Var2.f;
                                for (j1 j1Var : hashMap.values()) {
                                    try {
                                        j1Var.a.p(j1Var.b);
                                    } catch (RuntimeException e11) {
                                        e2.a.d("MediaSourceList", "Failed to release child source.", e11);
                                    }
                                    u2.a aVar = j1Var.a;
                                    i1 i1Var2 = j1Var.c;
                                    aVar.s(i1Var2);
                                    j1Var.a.r(i1Var2);
                                }
                                hashMap.clear();
                                l1Var2.g.clear();
                                l1Var2.k = false;
                                return;
                            }
                            return;
                        }
                    }
                }
                g0Var = g0Var222;
                m1 m1Var2222 = this.X;
                int i11222 = m1Var2222.e;
                if (z13) {
                }
                u2.r1 r1Var222 = z14 ? u2.r1.d : m1Var2222.h;
                x2.u uVar222 = z14 ? this.e : m1Var2222.i;
                if (z14) {
                }
                this.X = new m1(o1Var2, g0Var, j12, j11, i11222, lVar, false, r1Var222, uVar222, list, g0Var, m1Var2222.l, m1Var2222.m, m1Var2222.n, m1Var2222.o, j11, 0L, j11, 0L, false);
                if (z12) {
                }
            }
        }
        j10 = this.X.c;
        if (z11) {
        }
        this.H.b();
        this.e0 = false;
        o1Var = this.X.a;
        if (z12) {
        }
        o1Var2 = o1Var;
        g0Var = g0Var222;
        m1 m1Var22222 = this.X;
        int i112222 = m1Var22222.e;
        if (z13) {
        }
        u2.r1 r1Var2222 = z14 ? u2.r1.d : m1Var22222.h;
        x2.u uVar2222 = z14 ? this.e : m1Var22222.i;
        if (z14) {
        }
        this.X = new m1(o1Var2, g0Var, j12, j11, i112222, lVar, false, r1Var2222, uVar2222, list, g0Var, m1Var22222.l, m1Var22222.m, m1Var22222.n, m1Var22222.o, j11, 0L, j11, 0L, false);
        if (z12) {
        }
    }

    public final void Q() {
        y0 y0Var = this.H.i;
        this.b0 = y0Var != null && y0Var.g.j && this.a0;
    }

    public final void R(long j10, boolean z10) {
        y0 y0Var = this.H.i;
        long j11 = j10 + (y0Var == null ? 1000000000000L : y0Var.p);
        this.m0 = j11;
        this.D.a.d(j11);
        for (t1 t1Var : this.a) {
            long j12 = this.m0;
            b d = t1Var.d(y0Var);
            if (d != null) {
                d.z(j12, false, z10);
            }
        }
        for (y0 y0Var2 = r0.i; y0Var2 != null; y0Var2 = y0Var2.m) {
            for (x2.q qVar : y0Var2.o.c) {
                if (qVar != null) {
                    qVar.r();
                }
            }
        }
    }

    public final void S(b2.o1 o1Var, b2.o1 o1Var2) {
        if (o1Var.p() && o1Var2.p()) {
            return;
        }
        ArrayList arrayList = this.E;
        int size = arrayList.size() - 1;
        if (size < 0) {
            Collections.sort(arrayList);
        } else {
            a1.g.y(arrayList.get(size));
            throw null;
        }
    }

    public final void V(long j10) {
        boolean z10 = this.T;
        long j11 = w0;
        if (z10) {
            this.S.getClass();
            r2 = this.X.e != 3 ? j11 : 1000L;
            for (t1 t1Var : this.a) {
                long j12 = this.m0;
                long j13 = this.n0;
                b bVar = t1Var.c;
                b bVar2 = t1Var.a;
                long h = t1.h(bVar2) ? bVar2.h(j12, j13) : Long.MAX_VALUE;
                if (bVar != null && bVar.n != 0) {
                    h = Math.min(h, bVar.h(j12, j13));
                }
                r2 = Math.min(r2, e2.l0.h0(h));
            }
            if (this.X.m()) {
                y0 y0Var = this.H.i;
                if ((y0Var != null ? y0Var.m : null) != null) {
                    if ((e2.l0.S(r2) * this.X.o.a) + this.m0 >= r1.e()) {
                        r2 = Math.min(r2, j11);
                    }
                }
            }
        } else if (this.X.e != 3 || s0()) {
            r2 = j11;
        }
        this.n.a.sendEmptyMessageAtTime(2, j10 + r2);
    }

    public final void W(boolean z10) {
        u2.g0 g0Var = this.H.i.g.a;
        long Y = Y(g0Var, this.X.s, true, false);
        if (Y != this.X.s) {
            m1 m1Var = this.X;
            this.X = z(g0Var, Y, m1Var.c, m1Var.d, z10, 5);
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(5:27|(20:(9:72|73|(1:96)(3:79|(1:83)|84)|85|(1:95)|92|93|19|20)(1:29)|34|35|(1:37)(1:65)|38|39|(1:41)|42|43|44|45|46|47|48|49|50|51|18|19|20)|30|31|(1:33)(1:69)) */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x0192, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Type inference failed for: r0v18, types: [java.lang.Object, u2.e0] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void X(r0 r0Var) {
        long longValue;
        long j10;
        u2.g0 p5;
        long j11;
        boolean z10;
        boolean z11;
        u2.g0 g0Var;
        long j12;
        boolean z12;
        long j13;
        long j14;
        m1 m1Var;
        int i10;
        long j15;
        int i11;
        long j16;
        u2.g0 g0Var2;
        long j17;
        boolean z13;
        long j18;
        boolean z14;
        long Y;
        m1 m1Var2;
        u2.g0 g0Var3;
        b2.o1 o1Var;
        long j19;
        s0 s0Var = this;
        if (s0Var.U) {
            if (s0Var.V != null) {
                s0Var.W++;
                s0Var.Y.f(1);
            }
            s0Var.V = r0Var;
            return;
        }
        s0Var.Y.f(1);
        Pair T = T(s0Var.X.a, r0Var, true, s0Var.f0, s0Var.g0, s0Var.w, s0Var.x);
        if (T == null) {
            Pair o10 = s0Var.o(s0Var.X.a);
            p5 = (u2.g0) o10.first;
            longValue = ((Long) o10.second).longValue();
            z10 = !s0Var.X.a.p();
            j11 = 0;
            j10 = -9223372036854775807L;
        } else {
            Object obj = T.first;
            longValue = ((Long) T.second).longValue();
            j10 = r0Var.c == -9223372036854775807L ? -9223372036854775807L : longValue;
            p5 = s0Var.H.p(s0Var.X.a, obj, longValue);
            if (p5.b()) {
                s0Var.X.a.g(p5.a, s0Var.x);
                if (s0Var.x.e(p5.b) == p5.c) {
                    s0Var.x.g.getClass();
                }
                s0Var.x.g.a(p5.b).getClass();
                j10 = Math.max(j10, 0L);
                longValue = 0;
                j11 = 0;
            } else {
                j11 = 0;
                if (r0Var.c != -9223372036854775807L) {
                    z10 = false;
                }
            }
            z10 = true;
        }
        try {
            try {
                if (s0Var.X.a.p()) {
                    s0Var.l0 = r0Var;
                } else if (T == null) {
                    if (s0Var.X.e != 1) {
                        s0Var.o0(4);
                    }
                    s0Var.P(false, true, false, true);
                } else {
                    try {
                        try {
                            try {
                                try {
                                    if (p5.equals(s0Var.X.b)) {
                                        try {
                                            y0 y0Var = s0Var.H.i;
                                            if (y0Var == null || !y0Var.e || longValue == j11) {
                                                j14 = longValue;
                                            } else {
                                                ?? r02 = y0Var.a;
                                                long j20 = s0Var.w.m;
                                                if (s0Var.T && j20 != -9223372036854775807L) {
                                                    s0Var.S.getClass();
                                                }
                                                j14 = r02.t(longValue, s0Var.R);
                                            }
                                            if (e2.l0.h0(j14) != e2.l0.h0(s0Var.X.s) || ((i10 = (m1Var = s0Var.X).e) != 2 && i10 != 3)) {
                                                z11 = z10;
                                                g0Var = p5;
                                            }
                                            j15 = m1Var.s;
                                            i11 = 2;
                                            j16 = j15;
                                            z12 = z10;
                                            g0Var2 = p5;
                                            j17 = j10;
                                            s0Var.X = s0Var.z(g0Var2, j15, j17, j16, z12, i11);
                                        } catch (Throwable th2) {
                                            th = th2;
                                            boolean z15 = z10;
                                            g0Var = p5;
                                            z12 = z15;
                                            j13 = longValue;
                                            j12 = j10;
                                            s0Var.X = s0Var.z(g0Var, j13, j12, j13, z12, 2);
                                            throw th;
                                        }
                                    }
                                    z11 = z10;
                                    g0Var = p5;
                                    j14 = longValue;
                                    s0Var.D0(o1Var, g0Var3, o1Var, m1Var2.b, j19, true);
                                    g0Var2 = g0Var3;
                                    j17 = j19;
                                    j15 = Y;
                                    i11 = 2;
                                    j16 = j15;
                                    s0Var = this;
                                    s0Var.X = s0Var.z(g0Var2, j15, j17, j16, z12, i11);
                                } catch (Throwable th3) {
                                    th = th3;
                                    g0Var = g0Var3;
                                    j12 = j19;
                                    j13 = Y;
                                    s0Var.X = s0Var.z(g0Var, j13, j12, j13, z12, 2);
                                    throw th;
                                }
                                o1Var = m1Var2.a;
                                j19 = j10;
                            } catch (Throwable th4) {
                                th = th4;
                                g0Var = g0Var3;
                                j12 = j10;
                                j13 = Y;
                                s0Var.X = s0Var.z(g0Var, j13, j12, j13, z12, 2);
                                throw th;
                            }
                            m1Var2 = s0Var.X;
                            g0Var3 = g0Var;
                        } catch (Throwable th5) {
                            th = th5;
                        }
                        a1 a1Var = s0Var.H;
                        if (a1Var.i != a1Var.j) {
                            j18 = j14;
                            z14 = true;
                        } else {
                            j18 = j14;
                            z14 = false;
                        }
                        Y = s0Var.Y(g0Var, j18, z14, z13);
                        z12 = (longValue != Y) | z11;
                    } catch (Throwable th6) {
                        th = th6;
                        j12 = j10;
                        z12 = z11;
                        j13 = longValue;
                        s0Var.X = s0Var.z(g0Var, j13, j12, j13, z12, 2);
                        throw th;
                    }
                    z13 = s0Var.X.e == 4;
                }
                z12 = z10;
                g0Var2 = p5;
                j15 = longValue;
                j17 = j10;
                i11 = 2;
                j16 = j15;
                s0Var = this;
                s0Var.X = s0Var.z(g0Var2, j15, j17, j16, z12, i11);
            } catch (Throwable th7) {
                th = th7;
                z12 = z10;
                g0Var = p5;
            }
        } catch (Throwable th8) {
            th = th8;
            z11 = z10;
            g0Var = p5;
        }
    }

    /* JADX WARN: Type inference failed for: r10v15, types: [java.lang.Object, u2.e0] */
    /* JADX WARN: Type inference failed for: r10v16, types: [java.lang.Object, u2.e0] */
    /* JADX WARN: Type inference failed for: r10v25, types: [java.lang.Object, u2.e0] */
    /* JADX WARN: Type inference failed for: r10v26, types: [java.lang.Object, u2.e0] */
    public final long Y(u2.g0 g0Var, long j10, boolean z10, boolean z11) {
        a1 a1Var;
        int i10;
        w0();
        boolean z12 = true;
        E0(false, true);
        if (z11 || this.X.e == 3) {
            o0(2);
        }
        y0 y0Var = this.H.i;
        y0 y0Var2 = y0Var;
        while (y0Var2 != null && !g0Var.equals(y0Var2.g.a)) {
            y0Var2 = y0Var2.m;
        }
        if (z10 || y0Var != y0Var2 || (y0Var2 != null && y0Var2.p + j10 < 0)) {
            for (int i11 = 0; i11 < this.a.length; i11++) {
                i(i11);
            }
            this.t0 = -9223372036854775807L;
            if (y0Var2 != null) {
                while (true) {
                    a1Var = this.H;
                    if (a1Var.i == y0Var2) {
                        break;
                    }
                    a1Var.a();
                }
                a1Var.n(y0Var2);
                y0Var2.p = 1000000000000L;
                l(this.H.j.e(), new boolean[this.a.length]);
                y0Var2.h = true;
            }
        }
        h();
        if (this.T) {
            for (t1 t1Var : this.a) {
                if (t1Var.g() && ((i10 = t1Var.a.b) == 2 || i10 == 4)) {
                    this.U = true;
                    break;
                }
            }
        }
        if (y0Var2 != null) {
            this.H.n(y0Var2);
            if (!y0Var2.e) {
                y0Var2.g = y0Var2.g.b(j10, -9223372036854775807L);
            } else if (y0Var2.f) {
                if (this.T) {
                    this.S.getClass();
                    if (!this.X.a.p() && y0Var2.g.a.equals(this.X.b)) {
                        long j11 = y0Var2.p + j10;
                        boolean z13 = true;
                        for (t1 t1Var2 : this.a) {
                            if (t1Var2.g()) {
                                b d = t1Var2.d(y0Var2);
                                z13 &= d != null && d.E(j11);
                            }
                        }
                        if (z13) {
                            ?? r10 = y0Var2.a;
                            long j12 = this.X.s;
                            v1 v1Var = v1.e;
                            if (r10.t(j12, v1Var) == y0Var2.a.t(j10, v1Var)) {
                                z12 = false;
                            }
                        }
                    }
                }
                j10 = y0Var2.a.g(j10);
                y0Var2.a.h(j10 - this.y);
            }
            R(j10, z12);
            D();
        } else {
            this.H.b();
            R(j10, true);
        }
        v(false);
        this.n.f(2);
        return j10;
    }

    public final void Z(p1 p1Var) {
        p1Var.getClass();
        Looper looper = p1Var.e;
        Looper looper2 = this.s;
        e2.i0 i0Var = this.n;
        if (looper != looper2) {
            i0Var.b(15, p1Var).b();
            return;
        }
        g(p1Var);
        int i10 = this.X.e;
        if (i10 == 3 || i10 == 2) {
            i0Var.f(2);
        }
    }

    @Override // a3.y
    public final void a(long j10, long j11, b2.x xVar, MediaFormat mediaFormat) {
        if (this.U) {
            this.n.a(37).b();
        }
    }

    public final void a0(p1 p1Var) {
        Looper looper = p1Var.e;
        if (looper.getThread().isAlive()) {
            this.F.a(looper, null).d(new gg.c(this, p1Var));
        } else {
            e2.a.l("TAG", "Trying to send message on a dead thread.");
            p1Var.a(false);
        }
    }

    public final void b(n0 n0Var, int i10) {
        this.Y.f(1);
        l1 l1Var = this.I;
        if (i10 == -1) {
            i10 = l1Var.b.size();
        }
        w(l1Var.a(i10, n0Var.a, n0Var.b), false);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x003b, code lost:
    
        if (r7.a == 1) goto L20;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void b0(b2.f fVar, boolean z10) {
        int i10;
        x2.o oVar = (x2.o) this.d;
        if (!oVar.j.equals(fVar)) {
            oVar.j = fVar;
            oVar.k();
        }
        if (!z10) {
            fVar = null;
        }
        c2.d dVar = this.P;
        if (!Objects.equals(dVar.d, fVar)) {
            dVar.d = fVar;
            if (fVar != null) {
                int i11 = fVar.c;
                i10 = 3;
                switch (i11) {
                    case 0:
                        e2.a.l("AudioFocusManager", "Specify a proper usage in the audio attributes for audio focus handling. Using AUDIOFOCUS_GAIN by default.");
                        i10 = 1;
                        break;
                    case 1:
                    case 14:
                        i10 = 1;
                        break;
                    case 2:
                    case 4:
                        i10 = 2;
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
                        a1.g.w(i11, "Unidentified audio usage: ", "AudioFocusManager");
                        break;
                    case 16:
                        i10 = 4;
                        break;
                }
                dVar.f = i10;
                t6.e("Automatic handling of audio focus is only available for USAGE_MEDIA and USAGE_GAME.", i10 != 1 || i10 == 0);
            }
            i10 = 0;
            dVar.f = i10;
            t6.e("Automatic handling of audio focus is only available for USAGE_MEDIA and USAGE_GAME.", i10 != 1 || i10 == 0);
        }
        m1 m1Var = this.X;
        boolean z11 = m1Var.l;
        B0(dVar.d(m1Var.e, z11), m1Var.n, m1Var.m, z11);
    }

    public final void c() {
        for (t1 t1Var : this.a) {
            u1 u1Var = this.T ? this.S : null;
            t1Var.a.d(18, u1Var);
            b bVar = t1Var.c;
            if (bVar != null) {
                bVar.d(18, u1Var);
            }
        }
    }

    public final void c0(boolean z10, e2.i iVar) {
        if (this.h0 != z10) {
            this.h0 = z10;
            if (!z10) {
                for (t1 t1Var : this.a) {
                    t1Var.k();
                }
            }
        }
        if (iVar != null) {
            iVar.e();
        }
    }

    public final boolean d() {
        if (!this.O) {
            return false;
        }
        for (t1 t1Var : this.a) {
            if (t1Var.f()) {
                return true;
            }
        }
        return false;
    }

    public final void d0(l0 l0Var) {
        for (t1 t1Var : this.a) {
            b bVar = t1Var.a;
            if (bVar.b == 4) {
                bVar.d(23, l0Var);
                b bVar2 = t1Var.c;
                if (bVar2 != null) {
                    bVar2.d(23, l0Var);
                }
            }
        }
    }

    @Override // u2.d0
    public final void e(u2.e0 e0Var) {
        this.n.b(8, e0Var).b();
    }

    public final void e0(n0 n0Var) {
        this.Y.f(1);
        int i10 = n0Var.c;
        u2.i1 i1Var = n0Var.b;
        ArrayList arrayList = n0Var.a;
        if (i10 != -1) {
            this.l0 = new r0(new r1(arrayList, i1Var), n0Var.c, n0Var.d);
        }
        l1 l1Var = this.I;
        ArrayList arrayList2 = l1Var.b;
        l1Var.g(0, arrayList2.size());
        w(l1Var.a(arrayList2.size(), arrayList, i1Var), false);
    }

    public final void f() {
        O();
        W(true);
    }

    public final void f0(boolean z10) {
        this.a0 = z10;
        Q();
        if (this.b0) {
            a1 a1Var = this.H;
            if (a1Var.j != a1Var.i) {
                W(true);
                v(false);
            }
        }
    }

    public final void g0(b2.z0 z0Var) {
        this.n.e(16);
        i iVar = this.D;
        iVar.c(z0Var);
        b2.z0 g10 = iVar.g();
        y(g10, g10.a, true, true);
    }

    public final void h() {
        b bVar;
        if (this.O && d()) {
            for (t1 t1Var : this.a) {
                int c10 = t1Var.c();
                i iVar = this.D;
                if (t1Var.f()) {
                    int i10 = t1Var.d;
                    boolean z10 = i10 == 4 || i10 == 2;
                    int i11 = i10 != 4 ? 0 : 1;
                    if (z10) {
                        try {
                            bVar = t1Var.a;
                        } catch (RuntimeException e) {
                            e2.a.d("RendererHolder", "Disable prewarming failed.", e);
                        }
                    } else {
                        bVar = t1Var.c;
                        bVar.getClass();
                    }
                    t1Var.a(bVar, iVar);
                    try {
                        t1Var.i(z10);
                    } catch (RuntimeException e7) {
                        e2.a.d("RendererHolder", "Reset prewarming failed.", e7);
                    }
                    t1Var.d = i11;
                }
                this.k0 -= c10 - t1Var.c();
            }
            this.t0 = -9223372036854775807L;
        }
    }

    public final void h0(o oVar) {
        this.s0 = oVar;
        b2.o1 o1Var = this.X.a;
        a1 a1Var = this.H;
        a1Var.getClass();
        oVar.getClass();
        if (a1Var.q.isEmpty()) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < a1Var.q.size(); i10++) {
            ((y0) a1Var.q.get(i10)).i();
        }
        a1Var.q = arrayList;
        a1Var.m = null;
        a1Var.k();
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        int i10;
        y0 y0Var;
        u2.g0 g0Var;
        y0 y0Var2;
        int i11;
        try {
            switch (message.what) {
                case 1:
                    boolean z10 = message.arg1 != 0;
                    int i12 = message.arg2;
                    this.Y.f(1);
                    B0(this.P.d(this.X.e, z10), i12 >> 4, i12 & 15, z10);
                    break;
                case 2:
                    j();
                    break;
                case 3:
                    X((r0) message.obj);
                    break;
                case 4:
                    g0((b2.z0) message.obj);
                    break;
                case 5:
                    l0((v1) message.obj);
                    break;
                case 6:
                    v0(false, true);
                    break;
                case 7:
                    L((e2.i) message.obj);
                    return true;
                case 8:
                    x((u2.e0) message.obj);
                    break;
                case 9:
                    t((u2.e0) message.obj);
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
                    c0(message.arg1 != 0, (e2.i) message.obj);
                    break;
                case 14:
                    Z((p1) message.obj);
                    break;
                case 15:
                    a0((p1) message.obj);
                    break;
                case 16:
                    b2.z0 z0Var = (b2.z0) message.obj;
                    y(z0Var, z0Var.a, true, false);
                    break;
                case 17:
                    e0((n0) message.obj);
                    break;
                case 18:
                    b((n0) message.obj, message.arg1);
                    break;
                case 19:
                    J((o0) message.obj);
                    break;
                case 20:
                    N(message.arg1, message.arg2, (u2.i1) message.obj);
                    break;
                case 21:
                    n0((u2.i1) message.obj);
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
                case zs.T /* 30 */:
                    Pair pair = (Pair) message.obj;
                    q0(pair.first, (e2.i) pair.second);
                    break;
                case zs.U /* 31 */:
                    b0((b2.f) message.obj, message.arg1 != 0);
                    break;
                case 32:
                    r0(((Float) message.obj).floatValue());
                    break;
                case 33:
                    q(message.arg1);
                    break;
                case 34:
                    s();
                    break;
                case 35:
                    p0((a3.y) message.obj);
                    break;
                case 36:
                    j0(((Boolean) message.obj).booleanValue());
                    break;
                case 37:
                    this.U = false;
                    r0 r0Var = this.V;
                    if (r0Var != null) {
                        X(r0Var);
                        this.V = null;
                        break;
                    }
                    break;
                case 38:
                    k0((u1) message.obj);
                    break;
                case 39:
                    d0((l0) message.obj);
                    break;
            }
        } catch (b2.w0 e) {
            boolean z11 = e.a;
            int i13 = e.b;
            if (i13 == 1) {
                i11 = z11 ? 3001 : 3003;
            } else {
                if (i13 == 4) {
                    i11 = z11 ? 3002 : 3004;
                }
                u(e, r3);
            }
            r3 = i11;
            u(e, r3);
        } catch (g2.k e7) {
            u(e7, e7.a);
        } catch (l e10) {
            e = e10;
            int i14 = e.s;
            a1 a1Var = this.H;
            if (i14 == 1 && (y0Var2 = a1Var.j) != null && e.E == null) {
                e = e.a(y0Var2.g.a);
            }
            int i15 = e.s;
            e2.i0 i0Var = this.n;
            if (i15 == 1 && (g0Var = e.E) != null && B(e.x, g0Var)) {
                this.u0 = true;
                h();
                y0 g10 = a1Var.g();
                y0 y0Var3 = a1Var.i;
                if (y0Var3 != g10) {
                    while (y0Var3 != null) {
                        y0 y0Var4 = y0Var3.m;
                        if (y0Var4 == g10) {
                            break;
                        }
                        y0Var3 = y0Var4;
                    }
                }
                a1Var.n(y0Var3);
                if (this.X.e != 4) {
                    D();
                    i0Var.f(2);
                }
            } else {
                l lVar = this.q0;
                if (lVar != null) {
                    lVar.addSuppressed(e);
                    e = this.q0;
                }
                if (e.s == 1 && a1Var.i != a1Var.j) {
                    while (true) {
                        y0Var = a1Var.i;
                        if (y0Var == a1Var.j) {
                            break;
                        }
                        a1Var.a();
                    }
                    t6.k(y0Var);
                    F();
                    z0 z0Var2 = y0Var.g;
                    u2.g0 g0Var2 = z0Var2.a;
                    long j10 = z0Var2.b;
                    this.X = z(g0Var2, j10, z0Var2.d, j10, true, 0);
                }
                if (e.F && (this.q0 == null || (i10 = e.a) == 5004 || i10 == 5003)) {
                    e2.a.m("ExoPlayerImplInternal", "Recoverable renderer error", e);
                    if (this.q0 == null) {
                        this.q0 = e;
                    }
                    e2.h0 b10 = i0Var.b(25, e);
                    Handler handler = i0Var.a;
                    Message message2 = b10.a;
                    message2.getClass();
                    handler.sendMessageAtFrontOfQueue(message2);
                    b10.a();
                } else {
                    e2.a.d("ExoPlayerImplInternal", "Playback error", e);
                    v0(true, false);
                    this.X = this.X.f(e);
                }
            }
        } catch (IOException e11) {
            u(e11, 2000);
        } catch (RuntimeException e12) {
            l lVar2 = new l(2, e12, ((e12 instanceof IllegalStateException) || (e12 instanceof IllegalArgumentException)) ? 1004 : 1000);
            e2.a.d("ExoPlayerImplInternal", "Playback error", lVar2);
            v0(true, false);
            this.X = this.X.f(lVar2);
        } catch (n2.f e13) {
            u(e13, e13.a);
        } catch (u2.b e14) {
            u(e14, 1002);
        }
        F();
        return true;
    }

    public final void i(int i10) {
        t1[] t1VarArr = this.a;
        int c10 = t1VarArr[i10].c();
        t1 t1Var = t1VarArr[i10];
        b bVar = t1Var.a;
        i iVar = this.D;
        t1Var.a(bVar, iVar);
        b bVar2 = t1Var.c;
        if (bVar2 != null) {
            boolean z10 = (bVar2.n == 0 || t1Var.d == 3) ? false : true;
            t1Var.a(bVar2, iVar);
            t1Var.i(false);
            if (z10) {
                b bVar3 = t1Var.a;
                bVar2.getClass();
                bVar2.d(17, bVar3);
            }
        }
        t1Var.d = 0;
        H(i10, false);
        this.k0 -= c10;
    }

    public final void i0(int i10) {
        this.f0 = i10;
        b2.o1 o1Var = this.X.a;
        a1 a1Var = this.H;
        a1Var.g = i10;
        int r10 = a1Var.r(o1Var);
        if ((r10 & 1) != 0) {
            W(true);
        } else if ((r10 & 2) != 0) {
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
    /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Object, u2.e0] */
    /* JADX WARN: Type inference failed for: r7v19, types: [java.lang.Object, u2.e0] */
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
        int i10;
        boolean z15;
        m1 m1Var;
        int i11;
        boolean z16;
        this.F.getClass();
        long uptimeMillis = SystemClock.uptimeMillis();
        this.n.e(2);
        if (!this.Q) {
            A0();
        }
        int i12 = this.X.e;
        if (i12 == 1 || i12 == 4) {
            return;
        }
        if (this.Q) {
            A0();
        }
        y0 y0Var = this.H.i;
        if (y0Var == null) {
            V(uptimeMillis);
            return;
        }
        Trace.beginSection("doSomeWork");
        C0();
        if (y0Var.e) {
            this.F.getClass();
            this.n0 = e2.l0.S(SystemClock.elapsedRealtime());
            y0Var.a.h(this.X.s - this.y);
            z10 = true;
            z11 = true;
            int i13 = 0;
            while (true) {
                t1[] t1VarArr = this.a;
                if (i13 >= t1VarArr.length) {
                    break;
                }
                t1 t1Var = t1VarArr[i13];
                if (t1Var.c() == 0) {
                    H(i13, false);
                } else {
                    long j12 = this.m0;
                    long j13 = this.n0;
                    b bVar = t1Var.c;
                    b bVar2 = t1Var.a;
                    if (t1.h(bVar2)) {
                        bVar2.x(j12, j13);
                    }
                    if (bVar != null && bVar.n != 0) {
                        bVar.x(j12, j13);
                    }
                    if (z10) {
                        b bVar3 = t1Var.c;
                        b bVar4 = t1Var.a;
                        boolean l4 = t1.h(bVar4) ? bVar4.l() : true;
                        if (bVar3 != null && bVar3.n != 0) {
                            l4 &= bVar3.l();
                        }
                        if (l4) {
                            z10 = true;
                            b d = t1Var.d(y0Var);
                            z16 = d != null || d.k() || d.m() || d.l();
                            H(i13, z16);
                            z11 = !z11 && z16;
                            if (z16) {
                                G(i13);
                            }
                        }
                    }
                    z10 = false;
                    b d10 = t1Var.d(y0Var);
                    if (d10 != null) {
                    }
                    H(i13, z16);
                    if (z11) {
                    }
                    if (z16) {
                    }
                }
                i13++;
            }
        } else {
            y0Var.a.f();
            z10 = true;
            z11 = true;
        }
        long j14 = y0Var.g.f;
        boolean z17 = z10 && y0Var.e && (j14 == -9223372036854775807L || j14 <= this.X.s);
        if (z17 && this.b0) {
            this.b0 = false;
            int i14 = this.X.n;
            this.Y.f(0);
            B0(this.P.d(this.X.e, false), i14, 5, false);
        }
        if (!z17 || !y0Var.g.k) {
            m1 m1Var2 = this.X;
            if (m1Var2.e == 2) {
                a1 a1Var = this.H;
                if (this.k0 == 0) {
                    z14 = C();
                } else if (z11) {
                    if (m1Var2.g) {
                        y0 y0Var2 = a1Var.i;
                        long j15 = t0(m1Var2.a, y0Var2.g.a) ? this.J.h : -9223372036854775807L;
                        y0 y0Var3 = a1Var.l;
                        boolean z18 = y0Var3.g() && y0Var3.g.k;
                        boolean z19 = y0Var3.g.a.b() && !y0Var3.e;
                        if (!z18 && !z19) {
                            long p5 = p(y0Var3.d());
                            u0 u0Var = this.f;
                            j2.l lVar = this.L;
                            j10 = -9223372036854775807L;
                            b2.o1 o1Var = this.X.a;
                            u2.g0 g0Var = y0Var2.g.a;
                            float f7 = this.D.g().a;
                            boolean z20 = this.X.l;
                            boolean z21 = this.c0;
                            h hVar = (h) u0Var;
                            hVar.getClass();
                            long j16 = j15;
                            b2.k0 k0Var = o1Var.m(o1Var.g(g0Var.a, hVar.b).c, hVar.a, 0L).c.b;
                            if (k0Var != null) {
                                String scheme = k0Var.a.getScheme();
                                if (TextUtils.isEmpty(scheme) || h.r.contains(scheme)) {
                                    z13 = true;
                                    long F = e2.l0.F(p5, f7);
                                    j11 = !z21 ? z13 ? hVar.k : hVar.j : z13 ? hVar.i : hVar.h;
                                    if (j16 != -9223372036854775807L) {
                                        j11 = Math.min(j16 / 2, j11);
                                    }
                                    if (j11 > 0 && F < j11) {
                                        if (!(!z13 ? hVar.m : false)) {
                                            g gVar = (g) hVar.p.get(lVar);
                                            gVar.getClass();
                                            synchronized (gVar) {
                                                i10 = gVar.d;
                                            }
                                            int i15 = i10 * hVar.c.b;
                                            g gVar2 = (g) hVar.p.get(lVar);
                                            gVar2.getClass();
                                        }
                                        z14 = false;
                                        if (z14) {
                                            o0(3);
                                            this.q0 = null;
                                            if (s0()) {
                                                E0(false, false);
                                                i iVar = this.D;
                                                z12 = true;
                                                iVar.f = true;
                                                iVar.a.e();
                                                u0();
                                                if (this.X.e == 2) {
                                                    int i16 = 0;
                                                    while (true) {
                                                        t1[] t1VarArr2 = this.a;
                                                        if (i16 >= t1VarArr2.length) {
                                                            break;
                                                        }
                                                        if (t1VarArr2[i16].d(y0Var) != null ? z12 : false) {
                                                            G(i16);
                                                        }
                                                        i16++;
                                                    }
                                                    m1 m1Var3 = this.X;
                                                    if (!m1Var3.g && m1Var3.r < 500000 && A(this.H.l) && s0()) {
                                                        z15 = z12;
                                                        if (z15) {
                                                            this.r0 = -9223372036854775807L;
                                                        } else if (this.r0 == -9223372036854775807L) {
                                                            this.F.getClass();
                                                            this.r0 = SystemClock.elapsedRealtime();
                                                        } else {
                                                            this.F.getClass();
                                                            if (SystemClock.elapsedRealtime() - this.r0 >= 4000) {
                                                                throw new e2.f0(0, 4000);
                                                            }
                                                        }
                                                        boolean z22 = (s0() || this.X.e != 3) ? false : z12;
                                                        if (this.j0 || !this.i0 || !z22) {
                                                            z12 = false;
                                                        }
                                                        m1Var = this.X;
                                                        if (m1Var.p != z12) {
                                                            this.X = m1Var.i(z12);
                                                        }
                                                        this.i0 = false;
                                                        if (!z12 && (i11 = this.X.e) != 4 && (z22 || i11 == 2 || (i11 == 3 && this.k0 != 0))) {
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
                                                if (this.j0) {
                                                }
                                                z12 = false;
                                                m1Var = this.X;
                                                if (m1Var.p != z12) {
                                                }
                                                this.i0 = false;
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
                            long F2 = e2.l0.F(p5, f7);
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
            if (this.X.e == 3 && (this.k0 != 0 ? !z11 : !C())) {
                E0(s0(), false);
                o0(2);
                if (this.c0) {
                    for (y0 y0Var4 = this.H.i; y0Var4 != null; y0Var4 = y0Var4.m) {
                        for (x2.q qVar : y0Var4.o.c) {
                            if (qVar != null) {
                                qVar.t();
                            }
                        }
                    }
                    f fVar = this.J;
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
            if (this.X.e == 2) {
            }
            z15 = false;
            if (z15) {
            }
            if (s0()) {
            }
            if (this.j0) {
            }
            z12 = false;
            m1Var = this.X;
            if (m1Var.p != z12) {
            }
            this.i0 = false;
            if (!z12) {
            }
            Trace.endSection();
        }
        o0(4);
        w0();
        z12 = true;
        if (this.X.e == 2) {
        }
        z15 = false;
        if (z15) {
        }
        if (s0()) {
        }
        if (this.j0) {
        }
        z12 = false;
        m1Var = this.X;
        if (m1Var.p != z12) {
        }
        this.i0 = false;
        if (!z12) {
        }
        Trace.endSection();
    }

    public final void j0(boolean z10) {
        if (!z10) {
            r0 r0Var = this.V;
            e2.i0 i0Var = this.n;
            if (r0Var != null && this.U && !i0Var.a.hasMessages(37)) {
                this.W++;
            }
            int i10 = this.W;
            if (i10 > 0) {
                this.N.d(new d3(this, i10, 5));
            }
            this.W = 0;
            this.U = false;
            i0Var.e(37);
            r0 r0Var2 = this.V;
            if (r0Var2 != null) {
                X(r0Var2);
                this.V = null;
                this.U = false;
            }
        }
        this.T = z10;
        c();
    }

    public final void k(y0 y0Var, int i10, boolean z10, long j10) {
        t1 t1Var = this.a[i10];
        boolean g10 = t1Var.g();
        b bVar = t1Var.a;
        if (g10) {
            return;
        }
        boolean z11 = y0Var == this.H.i;
        x2.u uVar = y0Var.o;
        s1 s1Var = uVar.b[i10];
        x2.q qVar = uVar.c[i10];
        boolean z12 = s0() && this.X.e == 3;
        boolean z13 = !z10 && z12;
        this.k0++;
        u2.d1 d1Var = y0Var.c[i10];
        long j11 = y0Var.p;
        u2.g0 g0Var = y0Var.g.a;
        b bVar2 = t1Var.c;
        int length = qVar != null ? qVar.length() : 0;
        b2.x[] xVarArr = new b2.x[length];
        for (int i11 = 0; i11 < length; i11++) {
            qVar.getClass();
            xVarArr[i11] = qVar.f(i11);
        }
        int i12 = t1Var.d;
        i iVar = this.D;
        if (i12 == 0 || i12 == 2 || i12 == 4) {
            t1Var.e = true;
            t6.p(bVar.n == 0);
            bVar.d = s1Var;
            bVar.G = g0Var;
            bVar.n = 1;
            bVar.o(z13, z11);
            bVar.y(xVarArr, d1Var, j10, j11, g0Var);
            bVar.z(j10, z13, true);
            iVar.d(bVar);
        } else {
            t1Var.f = true;
            bVar2.getClass();
            t6.p(bVar2.n == 0);
            bVar2.d = s1Var;
            bVar2.G = g0Var;
            bVar2.n = 1;
            bVar2.o(z13, z11);
            bVar2.y(xVarArr, d1Var, j10, j11, g0Var);
            bVar2.z(j10, z13, true);
            iVar.d(bVar2);
        }
        m0 m0Var = new m0(this);
        b d = t1Var.d(y0Var);
        d.getClass();
        d.d(11, m0Var);
        if (z12 && z11) {
            t1Var.m();
        }
    }

    public final void k0(u1 u1Var) {
        this.S = u1Var;
        c();
    }

    public final void l(long j10, boolean[] zArr) {
        t1[] t1VarArr;
        long j11;
        y0 y0Var = this.H.j;
        x2.u uVar = y0Var.o;
        int i10 = 0;
        while (true) {
            t1VarArr = this.a;
            if (i10 >= t1VarArr.length) {
                break;
            }
            if (!uVar.b(i10)) {
                t1VarArr[i10].k();
            }
            i10++;
        }
        int i11 = 0;
        while (i11 < t1VarArr.length) {
            if (uVar.b(i11) && t1VarArr[i11].d(y0Var) == null) {
                j11 = j10;
                k(y0Var, i11, zArr[i11], j11);
            } else {
                j11 = j10;
            }
            i11++;
            j10 = j11;
        }
    }

    public final void l0(v1 v1Var) {
        this.R = v1Var;
    }

    public final long m(b2.o1 o1Var, Object obj, long j10) {
        b2.l1 l1Var = this.x;
        int i10 = o1Var.g(obj, l1Var).c;
        b2.n1 n1Var = this.w;
        o1Var.n(i10, n1Var);
        if (n1Var.f != -9223372036854775807L && n1Var.a() && n1Var.i) {
            return e2.l0.S(e2.l0.C(n1Var.g) - n1Var.f) - (j10 + l1Var.e);
        }
        return -9223372036854775807L;
    }

    public final void m0(boolean z10) {
        this.g0 = z10;
        b2.o1 o1Var = this.X.a;
        a1 a1Var = this.H;
        a1Var.h = z10;
        int r10 = a1Var.r(o1Var);
        if ((r10 & 1) != 0) {
            W(true);
        } else if ((r10 & 2) != 0) {
            h();
        }
        v(false);
    }

    public final long n(y0 y0Var) {
        if (y0Var == null) {
            return 0L;
        }
        long j10 = y0Var.p;
        if (!y0Var.e) {
            return j10;
        }
        int i10 = 0;
        while (true) {
            t1[] t1VarArr = this.a;
            if (i10 >= t1VarArr.length) {
                return j10;
            }
            if (t1VarArr[i10].d(y0Var) != null) {
                b d = t1VarArr[i10].d(y0Var);
                Objects.requireNonNull(d);
                long j11 = d.y;
                if (j11 == Long.MIN_VALUE) {
                    return Long.MIN_VALUE;
                }
                j10 = Math.max(j11, j10);
            }
            i10++;
        }
    }

    public final void n0(u2.i1 i1Var) {
        this.Y.f(1);
        l1 l1Var = this.I;
        int size = l1Var.b.size();
        if (i1Var.getLength() != size) {
            i1Var = i1Var.i().f(0, size);
        }
        l1Var.j = i1Var;
        w(l1Var.b(), false);
    }

    public final Pair o(b2.o1 o1Var) {
        long j10 = 0;
        if (o1Var.p()) {
            return Pair.create(m1.u, 0L);
        }
        int a2 = o1Var.a(this.g0);
        Pair i10 = o1Var.i(this.w, this.x, a2, -9223372036854775807L);
        u2.g0 p5 = this.H.p(o1Var, i10.first, 0L);
        long longValue = ((Long) i10.second).longValue();
        if (p5.b()) {
            Object obj = p5.a;
            b2.l1 l1Var = this.x;
            o1Var.g(obj, l1Var);
            if (p5.c == l1Var.e(p5.b)) {
                l1Var.g.getClass();
            }
        } else {
            j10 = longValue;
        }
        return Pair.create(p5, Long.valueOf(j10));
    }

    public final void o0(int i10) {
        m1 m1Var = this.X;
        if (m1Var.e != i10) {
            if (i10 != 2) {
                this.r0 = -9223372036854775807L;
            }
            if (i10 != 3 && m1Var.p) {
                this.X = m1Var.i(false);
            }
            this.X = this.X.h(i10);
        }
    }

    public final long p(long j10) {
        y0 y0Var = this.H.l;
        if (y0Var == null) {
            return 0L;
        }
        return Math.max(0L, j10 - (this.m0 - y0Var.p));
    }

    public final void p0(a3.y yVar) {
        for (t1 t1Var : this.a) {
            b bVar = t1Var.a;
            if (bVar.b == 2) {
                bVar.d(7, yVar);
                b bVar2 = t1Var.c;
                if (bVar2 != null) {
                    bVar2.d(7, yVar);
                }
            }
        }
    }

    public final void q(int i10) {
        m1 m1Var = this.X;
        B0(i10, m1Var.n, m1Var.m, m1Var.l);
    }

    public final void q0(Object obj, e2.i iVar) {
        for (t1 t1Var : this.a) {
            b bVar = t1Var.a;
            if (bVar.b == 2) {
                int i10 = t1Var.d;
                if (i10 == 4 || i10 == 1) {
                    b bVar2 = t1Var.c;
                    bVar2.getClass();
                    bVar2.d(1, obj);
                } else {
                    bVar.d(1, obj);
                }
            }
        }
        int i11 = this.X.e;
        if (i11 == 3 || i11 == 2) {
            this.n.f(2);
        }
        if (iVar != null) {
            iVar.e();
        }
    }

    @Override // u2.e1
    public final void r(u2.f1 f1Var) {
        this.n.b(9, (u2.e0) f1Var).b();
    }

    public final void r0(float f7) {
        this.v0 = f7;
        float f10 = f7 * this.P.g;
        for (t1 t1Var : this.a) {
            b bVar = t1Var.a;
            if (bVar.b == 1) {
                bVar.d(2, Float.valueOf(f10));
                b bVar2 = t1Var.c;
                if (bVar2 != null) {
                    bVar2.d(2, Float.valueOf(f10));
                }
            }
        }
    }

    public final void s() {
        r0(this.v0);
    }

    public final boolean s0() {
        m1 m1Var = this.X;
        return m1Var.l && m1Var.n == 0;
    }

    public final void t(u2.e0 e0Var) {
        a1 a1Var = this.H;
        y0 y0Var = a1Var.l;
        if (y0Var != null && y0Var.a == e0Var) {
            a1Var.m(this.m0);
            D();
            return;
        }
        y0 y0Var2 = a1Var.m;
        if (y0Var2 == null || y0Var2.a != e0Var) {
            return;
        }
        E();
    }

    public final boolean t0(b2.o1 o1Var, u2.g0 g0Var) {
        if (g0Var.b() || o1Var.p()) {
            return false;
        }
        int i10 = o1Var.g(g0Var.a, this.x).c;
        b2.n1 n1Var = this.w;
        o1Var.n(i10, n1Var);
        return n1Var.a() && n1Var.i && n1Var.f != -9223372036854775807L;
    }

    public final void u(IOException iOException, int i10) {
        l lVar = new l(0, iOException, i10);
        y0 y0Var = this.H.i;
        if (y0Var != null) {
            lVar = lVar.a(y0Var.g.a);
        }
        e2.a.d("ExoPlayerImplInternal", "Playback error", lVar);
        v0(false, false);
        this.X = this.X.f(lVar);
    }

    public final void u0() {
        y0 y0Var = this.H.i;
        if (y0Var == null) {
            return;
        }
        x2.u uVar = y0Var.o;
        int i10 = 0;
        while (true) {
            t1[] t1VarArr = this.a;
            if (i10 >= t1VarArr.length) {
                return;
            }
            if (uVar.b(i10)) {
                t1VarArr[i10].m();
            }
            i10++;
        }
    }

    public final void v(boolean z10) {
        y0 y0Var = this.H.l;
        u2.g0 g0Var = y0Var == null ? this.X.b : y0Var.g.a;
        boolean equals = this.X.k.equals(g0Var);
        if (!equals) {
            this.X = this.X.c(g0Var);
        }
        m1 m1Var = this.X;
        m1Var.q = y0Var == null ? m1Var.s : y0Var.d();
        m1 m1Var2 = this.X;
        m1Var2.r = p(m1Var2.q);
        if ((!equals || z10) && y0Var != null && y0Var.e) {
            y0(y0Var.g.a, y0Var.o);
        }
    }

    public final void v0(boolean z10, boolean z11) {
        P(z10 || !this.h0, false, true, false);
        this.Y.f(z11 ? 1 : 0);
        h hVar = (h) this.f;
        ConcurrentHashMap concurrentHashMap = hVar.p;
        j2.l lVar = this.L;
        g gVar = (g) concurrentHashMap.get(lVar);
        if (gVar != null) {
            int i10 = gVar.a - 1;
            gVar.a = i10;
            if (i10 == 0) {
                concurrentHashMap.remove(lVar);
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
    public final void w(b2.o1 o1Var, boolean z10) {
        long j10;
        b2.n1 n1Var;
        Object obj;
        int i10;
        long j11;
        long j12;
        boolean z11;
        boolean z12;
        boolean z13;
        b2.l1 l1Var;
        boolean z14;
        b2.o1 o1Var2;
        b2.l1 l1Var2;
        b2.o1 o1Var3;
        long j13;
        long j14;
        long j15;
        long j16;
        long j17;
        int i11;
        q0 q0Var;
        int i12;
        long longValue;
        boolean z15;
        int i13;
        boolean z16;
        b2.l1 l1Var3;
        b2.o1 o1Var4;
        b2.o1 o1Var5;
        u2.g0 g0Var;
        boolean z17;
        b2.o1 o1Var6;
        long j18;
        int s10;
        y0 y0Var;
        a1 a1Var;
        m1 m1Var = this.X;
        r0 r0Var = this.l0;
        a1 a1Var2 = this.H;
        int i14 = this.f0;
        boolean z18 = this.g0;
        b2.n1 n1Var2 = this.w;
        b2.l1 l1Var4 = this.x;
        if (o1Var.p()) {
            u2.g0 g0Var2 = m1.u;
            boolean z19 = (g0Var2.equals(m1Var.b) && m1Var.s == 0) ? false : true;
            q0 q0Var2 = new q0(g0Var2, 0L, -9223372036854775807L, false, true, false, z19, z19 && z10 && !m1Var.a.p() && !m1Var.a.g(m1Var.b.a, l1Var4).f, 4);
            o1Var4 = o1Var;
            j15 = 0;
            q0Var = q0Var2;
            l1Var3 = l1Var4;
        } else {
            u2.g0 g0Var3 = m1Var.b;
            Object obj2 = g0Var3.a;
            b2.o1 o1Var7 = m1Var.a;
            boolean z20 = o1Var7.p() || o1Var7.g(g0Var3.a, l1Var4).f;
            long j19 = (m1Var.b.b() || z20) ? m1Var.c : m1Var.s;
            if (r0Var != null) {
                boolean z21 = true;
                j10 = 1;
                b2.o1 o1Var8 = o1Var;
                Pair T = T(o1Var8, r0Var, true, i14, z18, n1Var2, l1Var4);
                if (T == null) {
                    i13 = o1Var8.a(z18);
                    obj = obj2;
                    longValue = j19;
                    z15 = false;
                    z16 = false;
                } else {
                    if (r0Var.c == -9223372036854775807L) {
                        i13 = o1Var8.g(T.first, l1Var4).c;
                        obj = obj2;
                        longValue = j19;
                        z15 = false;
                    } else {
                        obj = T.first;
                        longValue = ((Long) T.second).longValue();
                        z15 = true;
                        i13 = -1;
                    }
                    z16 = m1Var.e == 4;
                    z21 = false;
                }
                z13 = z15;
                z12 = z21;
                z11 = z16;
                j12 = longValue;
                i10 = i13;
                n1Var = n1Var2;
                o1Var3 = o1Var8;
                l1Var2 = l1Var4;
            } else {
                j10 = 1;
                b2.o1 o1Var9 = o1Var;
                if (m1Var.a.p()) {
                    i10 = o1Var9.a(z18);
                    n1Var = n1Var2;
                    obj = obj2;
                } else if (o1Var9.b(obj2) == -1) {
                    obj = obj2;
                    int U = U(n1Var2, l1Var4, i14, z18, obj, m1Var.a, o1Var9);
                    n1Var = n1Var2;
                    b2.o1 o1Var10 = o1Var9;
                    l1Var = l1Var4;
                    if (U == -1) {
                        U = o1Var10.a(z18);
                        z14 = true;
                    } else {
                        z14 = false;
                    }
                    i10 = U;
                    z12 = z14;
                    j12 = j19;
                    z11 = false;
                    o1Var2 = o1Var10;
                    z13 = false;
                    o1Var3 = o1Var2;
                    l1Var2 = l1Var;
                } else {
                    n1Var = n1Var2;
                    obj = obj2;
                    if (j19 == -9223372036854775807L) {
                        i10 = o1Var9.g(obj, l1Var4).c;
                    } else if (z20) {
                        m1Var.a.g(g0Var3.a, l1Var4);
                        if (m1Var.a.m(l1Var4.c, n1Var, 0L).n == m1Var.a.b(g0Var3.a)) {
                            Pair i15 = o1Var9.i(n1Var, l1Var4, o1Var9.g(obj, l1Var4).c, j19 + l1Var4.e);
                            obj = i15.first;
                            j11 = ((Long) i15.second).longValue();
                        } else {
                            j11 = o1Var9.g(obj, l1Var4).d != -9223372036854775807L ? e2.l0.j(j19, 0L, l1Var4.d - 1) : j19;
                        }
                        j12 = j11;
                        i10 = -1;
                        z11 = false;
                        z12 = false;
                        z13 = true;
                        o1Var3 = o1Var9;
                        l1Var2 = l1Var4;
                    } else {
                        i10 = -1;
                    }
                }
                j12 = j19;
                z11 = false;
                z12 = false;
                o1Var2 = o1Var9;
                l1Var = l1Var4;
                z13 = false;
                o1Var3 = o1Var2;
                l1Var2 = l1Var;
            }
            if (i10 != -1) {
                Pair i16 = o1Var3.i(n1Var, l1Var2, i10, -9223372036854775807L);
                obj = i16.first;
                j12 = ((Long) i16.second).longValue();
                j13 = -9223372036854775807L;
            } else {
                j13 = j12;
            }
            u2.g0 p5 = a1Var2.p(o1Var3, obj, j12);
            int i17 = p5.e;
            boolean z22 = i17 == -1 || ((i12 = g0Var3.e) != -1 && i17 >= i12);
            boolean equals = g0Var3.a.equals(obj);
            boolean z23 = equals && !g0Var3.b() && !p5.b() && z22;
            b2.l1 g10 = o1Var3.g(obj, l1Var2);
            if (z20 || j19 != j13) {
                j14 = j13;
            } else {
                Object obj3 = g0Var3.a;
                int i18 = g0Var3.b;
                j14 = j13;
                if (obj3.equals(p5.a)) {
                    if (g0Var3.b()) {
                        g10.g(i18);
                    }
                    if (p5.b()) {
                        g10.g(p5.b);
                    }
                }
            }
            if (z23) {
                p5 = g0Var3;
            }
            if (!p5.b()) {
                if (equals && g0Var3.b()) {
                    b2.a a2 = o1Var3.g(obj, l1Var2).g.a(g0Var3.b);
                    a2.getClass();
                    long j20 = m1Var.c;
                    j15 = 0;
                    if (j20 == -9223372036854775807L || 0 > j20) {
                        int i19 = a2.a;
                        int i20 = g0Var3.c;
                        if (i19 > i20 && a2.e[i20] == 2) {
                            long j21 = o1Var3.g(obj, l1Var2).d;
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
            } else if (p5.equals(g0Var3)) {
                j16 = m1Var.s;
                j17 = j14;
                j15 = 0;
            } else {
                o1Var3.g(p5.a, l1Var2);
                if (p5.c == l1Var2.e(p5.b)) {
                    l1Var2.g.getClass();
                }
                j17 = j14;
                j15 = 0;
                j16 = 0;
            }
            boolean z24 = (p5.equals(m1Var.b) && j16 == m1Var.s) ? false : true;
            int i21 = o1Var3.b(m1Var.b.a) == -1 ? 4 : 3;
            if (p5.a.equals(m1Var.b.a) && p5.b != -1) {
                b2.a a10 = o1Var3.g(p5.a, l1Var2).g.a(p5.b);
                int i22 = p5.c;
                int[] iArr = a10.e;
                if (i22 >= iArr.length || iArr[i22] != 2) {
                    i11 = 0;
                    q0Var = new q0(p5, j16, j17, z11, z12, z13, z24, (z24 || !z10 || m1Var.a.p() || m1Var.a.g(m1Var.b.a, l1Var2).f) ? false : true, i11);
                    o1Var4 = o1Var3;
                    l1Var3 = l1Var2;
                }
            }
            i11 = i21;
            q0Var = new q0(p5, j16, j17, z11, z12, z13, z24, (z24 || !z10 || m1Var.a.p() || m1Var.a.g(m1Var.b.a, l1Var2).f) ? false : true, i11);
            o1Var4 = o1Var3;
            l1Var3 = l1Var2;
        }
        u2.g0 g0Var4 = q0Var.a;
        long j22 = q0Var.b;
        try {
            if (q0Var.e) {
                z17 = true;
                if (this.X.e != 1) {
                    o0(4);
                }
                P(false, false, false, true);
            } else {
                z17 = true;
            }
            t1[] t1VarArr = this.a;
            int length = t1VarArr.length;
            int i23 = 0;
            b2.o1 o1Var11 = l1Var3;
            while (i23 < length) {
                t1 t1Var = t1VarArr[i23];
                b bVar = t1Var.a;
                boolean equals2 = Objects.equals(bVar.F, o1Var4);
                if (equals2 == 0) {
                    bVar.F = o1Var4;
                    bVar.v();
                }
                b bVar2 = t1Var.c;
                if (bVar2 != null && !Objects.equals(bVar2.F, o1Var4)) {
                    bVar2.F = o1Var4;
                    bVar2.v();
                }
                i23++;
                o1Var11 = equals2;
            }
            try {
                if (q0Var.g) {
                    o1Var11 = o1Var4;
                    if (!o1Var11.p()) {
                        for (y0 y0Var2 = this.H.i; y0Var2 != null; y0Var2 = y0Var2.m) {
                            if (y0Var2.g.a.equals(g0Var4)) {
                                y0Var2.g = this.H.h(o1Var11, y0Var2.g);
                                y0Var2.k();
                            }
                        }
                        boolean z25 = q0Var.d;
                        try {
                            a1Var = this.H;
                            g0Var = g0Var4;
                        } catch (Throwable th2) {
                            th = th2;
                            g0Var = g0Var4;
                            o1Var6 = o1Var11;
                            o1Var5 = o1Var6;
                            m1 m1Var2 = this.X;
                            b2.o1 o1Var12 = m1Var2.a;
                            u2.g0 g0Var5 = m1Var2.b;
                            u2.g0 g0Var6 = g0Var;
                            D0(o1Var5, g0Var6, o1Var12, g0Var5, q0Var.f ? j22 : -9223372036854775807L, false);
                            if (!q0Var.g || q0Var.c != this.X.c) {
                                long j23 = q0Var.c;
                                boolean z26 = q0Var.h;
                                this.X = z(g0Var6, j22, j23, z26 ? j22 : this.X.d, z26, q0Var.i);
                            }
                            Q();
                            S(o1Var5, this.X.a);
                            this.X = this.X.j(o1Var5);
                            if (!o1Var5.p()) {
                                this.l0 = null;
                            }
                            v(false);
                            this.n.f(2);
                            throw th;
                        }
                        try {
                            j22 = Y(g0Var, j22, a1Var.i != a1Var.j ? z17 : false, z25);
                            m1 m1Var3 = this.X;
                            u2.g0 g0Var7 = g0Var;
                            D0(o1Var, g0Var7, m1Var3.a, m1Var3.b, !q0Var.f ? j22 : -9223372036854775807L, false);
                            if (!q0Var.g || q0Var.c != this.X.c) {
                                long j24 = q0Var.c;
                                boolean z27 = q0Var.h;
                                this.X = z(g0Var7, j22, j24, !z27 ? j22 : this.X.d, z27, q0Var.i);
                            }
                            Q();
                            S(o1Var, this.X.a);
                            this.X = this.X.j(o1Var);
                            if (!o1Var.p()) {
                                this.l0 = null;
                            }
                            v(false);
                            this.n.f(2);
                        } catch (Throwable th3) {
                            th = th3;
                            j22 = j22;
                            o1Var6 = o1Var11;
                            o1Var5 = o1Var6;
                            m1 m1Var22 = this.X;
                            b2.o1 o1Var122 = m1Var22.a;
                            u2.g0 g0Var52 = m1Var22.b;
                            u2.g0 g0Var62 = g0Var;
                            D0(o1Var5, g0Var62, o1Var122, g0Var52, q0Var.f ? j22 : -9223372036854775807L, false);
                            if (!q0Var.g) {
                            }
                            long j232 = q0Var.c;
                            boolean z262 = q0Var.h;
                            this.X = z(g0Var62, j22, j232, z262 ? j22 : this.X.d, z262, q0Var.i);
                            Q();
                            S(o1Var5, this.X.a);
                            this.X = this.X.j(o1Var5);
                            if (!o1Var5.p()) {
                            }
                            v(false);
                            this.n.f(2);
                            throw th;
                        }
                    }
                } else {
                    try {
                        y0 y0Var3 = this.H.j;
                        long n10 = y0Var3 == null ? j15 : n(y0Var3);
                        try {
                            try {
                                if (d() && (y0Var = this.H.k) != null) {
                                    j18 = n(y0Var);
                                    s10 = this.H.s(o1Var, this.m0, n10, j18);
                                    if ((s10 & 1) == 0) {
                                        W(false);
                                    } else if ((s10 & 2) != 0) {
                                        h();
                                    }
                                }
                                s10 = this.H.s(o1Var, this.m0, n10, j18);
                                if ((s10 & 1) == 0) {
                                }
                            } catch (Throwable th4) {
                                th = th4;
                                o1Var11 = o1Var;
                                g0Var = g0Var4;
                                o1Var6 = o1Var11;
                                o1Var5 = o1Var6;
                                m1 m1Var222 = this.X;
                                b2.o1 o1Var1222 = m1Var222.a;
                                u2.g0 g0Var522 = m1Var222.b;
                                u2.g0 g0Var622 = g0Var;
                                D0(o1Var5, g0Var622, o1Var1222, g0Var522, q0Var.f ? j22 : -9223372036854775807L, false);
                                if (!q0Var.g) {
                                }
                                long j2322 = q0Var.c;
                                boolean z2622 = q0Var.h;
                                this.X = z(g0Var622, j22, j2322, z2622 ? j22 : this.X.d, z2622, q0Var.i);
                                Q();
                                S(o1Var5, this.X.a);
                                this.X = this.X.j(o1Var5);
                                if (!o1Var5.p()) {
                                }
                                v(false);
                                this.n.f(2);
                                throw th;
                            }
                        } catch (Throwable th5) {
                            th = th5;
                            o1Var11 = o1Var;
                        }
                        j18 = j15;
                    } catch (Throwable th6) {
                        th = th6;
                        o1Var11 = o1Var4;
                    }
                }
                g0Var = g0Var4;
                m1 m1Var32 = this.X;
                u2.g0 g0Var72 = g0Var;
                D0(o1Var, g0Var72, m1Var32.a, m1Var32.b, !q0Var.f ? j22 : -9223372036854775807L, false);
                if (!q0Var.g) {
                }
                long j242 = q0Var.c;
                boolean z272 = q0Var.h;
                this.X = z(g0Var72, j22, j242, !z272 ? j22 : this.X.d, z272, q0Var.i);
                Q();
                S(o1Var, this.X.a);
                this.X = this.X.j(o1Var);
                if (!o1Var.p()) {
                }
                v(false);
                this.n.f(2);
            } catch (Throwable th7) {
                th = th7;
            }
        } catch (Throwable th8) {
            th = th8;
            o1Var5 = o1Var4;
            g0Var = g0Var4;
        }
    }

    public final void w0() {
        i iVar = this.D;
        iVar.f = false;
        w1 w1Var = iVar.a;
        if (w1Var.c) {
            w1Var.d(w1Var.a());
            w1Var.c = false;
        }
        for (t1 t1Var : this.a) {
            b bVar = t1Var.c;
            b bVar2 = t1Var.a;
            if (t1.h(bVar2)) {
                t1.b(bVar2);
            }
            if (bVar != null && bVar.n != 0) {
                t1.b(bVar);
            }
        }
    }

    public final void x(u2.e0 e0Var) {
        y0 y0Var;
        a1 a1Var = this.H;
        y0 y0Var2 = a1Var.l;
        i iVar = this.D;
        if (y0Var2 != null && y0Var2.a == e0Var) {
            y0Var2.getClass();
            if (!y0Var2.e) {
                float f7 = iVar.g().a;
                m1 m1Var = this.X;
                y0Var2.f(f7, m1Var.a, m1Var.l);
            }
            y0(y0Var2.g.a, y0Var2.o);
            if (y0Var2 == a1Var.i) {
                R(y0Var2.g.b, true);
                l(a1Var.j.e(), new boolean[this.a.length]);
                y0Var2.h = true;
                m1 m1Var2 = this.X;
                u2.g0 g0Var = m1Var2.b;
                long j10 = y0Var2.g.b;
                this.X = z(g0Var, j10, m1Var2.c, j10, false, 5);
            }
            D();
            return;
        }
        int i10 = 0;
        while (true) {
            if (i10 >= a1Var.q.size()) {
                y0Var = null;
                break;
            }
            y0Var = (y0) a1Var.q.get(i10);
            if (y0Var.a == e0Var) {
                break;
            } else {
                i10++;
            }
        }
        if (y0Var != null) {
            t6.p(true ^ y0Var.e);
            float f10 = iVar.g().a;
            m1 m1Var3 = this.X;
            y0Var.f(f10, m1Var3.a, m1Var3.l);
            y0 y0Var3 = a1Var.m;
            if (y0Var3 == null || y0Var3.a != e0Var) {
                return;
            }
            E();
        }
    }

    /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, u2.f1] */
    public final void x0() {
        y0 y0Var = this.H.l;
        boolean z10 = this.e0 || (y0Var != null && y0Var.a.d());
        m1 m1Var = this.X;
        if (z10 != m1Var.g) {
            this.X = m1Var.b(z10);
        }
    }

    public final void y(b2.z0 z0Var, float f7, boolean z10, boolean z11) {
        int i10;
        if (z10) {
            if (z11) {
                this.Y.f(1);
            }
            this.X = this.X.g(z0Var);
        }
        float f10 = z0Var.a;
        y0 y0Var = this.H.i;
        while (true) {
            i10 = 0;
            if (y0Var == null) {
                break;
            }
            x2.q[] qVarArr = y0Var.o.c;
            int length = qVarArr.length;
            while (i10 < length) {
                x2.q qVar = qVarArr[i10];
                if (qVar != null) {
                    qVar.p(f10);
                }
                i10++;
            }
            y0Var = y0Var.m;
        }
        t1[] t1VarArr = this.a;
        int length2 = t1VarArr.length;
        while (i10 < length2) {
            t1 t1Var = t1VarArr[i10];
            float f11 = z0Var.a;
            t1Var.a.A(f7, f11);
            b bVar = t1Var.c;
            if (bVar != null) {
                bVar.A(f7, f11);
            }
            i10++;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00c3 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void y0(u2.g0 g0Var, x2.u uVar) {
        boolean z10;
        int length;
        int i10;
        y0 y0Var = this.H.l;
        y0Var.getClass();
        p(y0Var.d());
        if (t0(this.X.a, y0Var.g.a)) {
            long j10 = this.J.h;
        }
        b2.o1 o1Var = this.X.a;
        float f7 = this.D.g().a;
        boolean z11 = this.X.l;
        x2.q[] qVarArr = uVar.c;
        h hVar = (h) this.f;
        hVar.getClass();
        e9.q0 q0Var = hVar.o;
        j2.l lVar = this.L;
        Integer num = (Integer) q0Var.get(lVar.a);
        int intValue = (num == null || num.intValue() == -1) ? hVar.l : num.intValue();
        g gVar = (g) hVar.p.get(lVar);
        gVar.getClass();
        if (intValue == -1) {
            b2.k0 k0Var = o1Var.m(o1Var.g(g0Var.a, hVar.b).c, hVar.a, 0L).c.b;
            if (k0Var != null) {
                String scheme = k0Var.a.getScheme();
                if (TextUtils.isEmpty(scheme) || h.r.contains(scheme)) {
                    z10 = true;
                    length = qVarArr.length;
                    i10 = 0;
                    int i11 = 0;
                    while (true) {
                        int i12 = 13107200;
                        if (i10 >= length) {
                            x2.q qVar = qVarArr[i10];
                            if (qVar != null) {
                                switch (qVar.b().c) {
                                    case -2:
                                        i12 = 0;
                                        i11 += i12;
                                        break;
                                    case -1:
                                    case 1:
                                        i11 += i12;
                                        break;
                                    case 0:
                                        i12 = 144310272;
                                        i11 += i12;
                                        break;
                                    case 2:
                                        i12 = z10 ? 19660800 : 131072000;
                                        i11 += i12;
                                        break;
                                    case 3:
                                    case 5:
                                    case 6:
                                        i12 = 131072;
                                        i11 += i12;
                                        break;
                                    case 4:
                                        i12 = 26214400;
                                        i11 += i12;
                                        break;
                                    default:
                                        throw new IllegalArgumentException();
                                }
                            }
                            i10++;
                        } else {
                            intValue = e2.l0.i(i11, 13107200, 210239488);
                        }
                    }
                }
            }
            z10 = false;
            length = qVarArr.length;
            i10 = 0;
            int i112 = 0;
            while (true) {
                int i122 = 13107200;
                if (i10 >= length) {
                }
                i10++;
            }
        }
        gVar.c = intValue;
        hVar.c();
    }

    public final m1 z(u2.g0 g0Var, long j10, long j11, long j12, boolean z10, int i10) {
        x1 x1Var;
        boolean z11;
        this.p0 = (!this.p0 && j10 == this.X.s && g0Var.equals(this.X.b)) ? false : true;
        Q();
        m1 m1Var = this.X;
        u2.r1 r1Var = m1Var.h;
        x2.u uVar = m1Var.i;
        List list = m1Var.j;
        if (this.I.k) {
            y0 y0Var = this.H.i;
            r1Var = y0Var == null ? u2.r1.d : y0Var.n;
            uVar = y0Var == null ? this.e : y0Var.o;
            x2.q[] qVarArr = uVar.c;
            e9.k0 k0Var = new e9.k0(4);
            boolean z12 = false;
            for (x2.q qVar : qVarArr) {
                if (qVar != null) {
                    b2.u0 u0Var = qVar.f(0).l;
                    if (u0Var == null) {
                        k0Var.c(new b2.u0(new b2.t0[0]));
                    } else {
                        k0Var.c(u0Var);
                        z12 = true;
                    }
                }
            }
            if (z12) {
                x1Var = k0Var.f();
            } else {
                e9.l0 l0Var = e9.n0.b;
                x1Var = x1.e;
            }
            list = x1Var;
            if (y0Var != null) {
                z0 z0Var = y0Var.g;
                if (z0Var.d != j11) {
                    y0Var.g = z0Var.a(j11);
                }
            }
            t1[] t1VarArr = this.a;
            a1 a1Var = this.H;
            y0 y0Var2 = a1Var.i;
            if (y0Var2 == a1Var.j && y0Var2 != null) {
                x2.u uVar2 = y0Var2.o;
                int i11 = 0;
                boolean z13 = false;
                while (true) {
                    if (i11 >= t1VarArr.length) {
                        z11 = true;
                        break;
                    }
                    if (uVar2.b(i11)) {
                        if (t1VarArr[i11].a.b != 1) {
                            z11 = false;
                            break;
                        }
                        if (uVar2.b[i11].a != 0) {
                            z13 = true;
                        }
                    }
                    i11++;
                }
                boolean z14 = z13 && z11;
                if (z14 != this.j0) {
                    this.j0 = z14;
                    if (!z14 && this.X.p) {
                        this.n.f(2);
                    }
                }
            }
        } else if (!g0Var.equals(m1Var.b)) {
            r1Var = u2.r1.d;
            uVar = this.e;
            list = x1.e;
        }
        u2.r1 r1Var2 = r1Var;
        x2.u uVar3 = uVar;
        List list2 = list;
        if (z10) {
            p0 p0Var = this.Y;
            if (!p0Var.d || p0Var.e == 5) {
                p0Var.c = true;
                p0Var.d = true;
                p0Var.e = i10;
            } else {
                t6.f(i10 == 5);
            }
        }
        m1 m1Var2 = this.X;
        return m1Var2.d(g0Var, j10, j11, j12, p(m1Var2.q), r1Var2, uVar3, list2);
    }

    public final void z0(List list, int i10, int i11) {
        this.Y.f(1);
        l1 l1Var = this.I;
        l1Var.getClass();
        ArrayList arrayList = l1Var.b;
        t6.f(i10 >= 0 && i10 <= i11 && i11 <= arrayList.size());
        t6.f(list.size() == i11 - i10);
        for (int i12 = i10; i12 < i11; i12++) {
            ((k1) arrayList.get(i12)).a.t((b2.p0) list.get(i12 - i10));
        }
        w(l1Var.b(), false);
    }
}
