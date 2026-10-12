package i2;

import android.content.Context;
import android.media.MediaFormat;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.os.Trace;
import android.text.TextUtils;
import android.util.Pair;
import androidx.car.app.navigation.model.Maneuver;
import di.x8;
import e9.x1;
import fi.q3;
import j$.util.Objects;
import j$.util.concurrent.ConcurrentHashMap;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessageObject;
import v7.u6;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes.dex */
public final class r0 implements Handler.Callback, u2.d0, l1, a3.y {
    public static final long w0 = e2.m0.h0(10000);
    public final ArrayList E;
    public final e2.g0 F;
    public final w G;
    public final z0 H;
    public final j1 I;
    public final g J;
    public final long K;
    public final j2.k L;
    public final j2.f M;
    public final e2.i0 N;
    public final boolean O;
    public final c2.e P;
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
    public final x2.s d;
    public long d0;
    public final x2.t e;
    public boolean e0;
    public final t0 f;
    public int f0;
    public boolean g0;
    public final y2.c h;
    public boolean h0;
    public boolean i0;
    public boolean j0;
    public int k0;
    public q0 l0;
    public long m0;
    public final e2.i0 n;
    public long n0;
    public int o0;
    public boolean p0;
    public m q0;
    public final j6.l r;
    public long r0;
    public final Looper s;
    public p s0;
    public long t0;
    public boolean u0;
    public final b2.o1 v;
    public float v0;
    public final b2.m1 w;
    public final long x;
    public final j y;

    public r0(Context context, b[] bVarArr, b[] bVarArr2, x2.s sVar, x2.t tVar, t0 t0Var, y2.c cVar, int i10, boolean z10, j2.f fVar, t1 t1Var, g gVar, long j10, Looper looper, e2.g0 g0Var, w wVar, j2.k kVar, final a3.y yVar, boolean z11) {
        p pVar = p.a;
        this.t0 = -9223372036854775807L;
        this.G = wVar;
        this.d = sVar;
        this.e = tVar;
        this.f = t0Var;
        this.h = cVar;
        this.f0 = i10;
        this.g0 = z10;
        this.R = t1Var;
        this.J = gVar;
        this.K = j10;
        this.a0 = false;
        this.F = g0Var;
        this.L = kVar;
        this.s0 = pVar;
        this.M = fVar;
        this.v0 = 1.0f;
        this.S = s1.b;
        this.Q = z11;
        this.r0 = -9223372036854775807L;
        this.d0 = -9223372036854775807L;
        this.x = ((i) t0Var).n;
        b2.l1 l1Var = b2.p1.a;
        k1 k10 = k1.k(tVar);
        this.X = k10;
        this.Y = new o0(k10);
        this.b = new b[bVarArr.length];
        this.c = new boolean[bVarArr.length];
        x2.n nVar = (x2.n) sVar;
        nVar.getClass();
        this.a = new r1[bVarArr.length];
        boolean z12 = false;
        for (int i11 = 0; i11 < bVarArr.length; i11++) {
            b bVar = bVarArr[i11];
            bVar.e = i11;
            bVar.f = kVar;
            bVar.h = g0Var;
            this.b[i11] = bVar;
            b bVar2 = this.b[i11];
            synchronized (bVar2.a) {
                bVar2.H = nVar;
            }
            b bVar3 = bVarArr2[i11];
            if (bVar3 != null) {
                bVar3.e = i11;
                bVar3.f = kVar;
                bVar3.h = g0Var;
                z12 = true;
            }
            this.a[i11] = new r1(bVarArr[i11], bVar3, i11);
        }
        this.O = z12;
        this.y = new j(this, g0Var);
        this.E = new ArrayList();
        this.v = new b2.o1();
        this.w = new b2.m1();
        u6.p(sVar.a == null);
        sVar.a = this;
        sVar.b = cVar;
        this.p0 = true;
        e2.i0 a2 = g0Var.a(looper, null);
        this.N = a2;
        this.H = new z0(fVar, a2, new f1.a(this, 10));
        this.I = new j1(this, fVar, a2, kVar);
        j6.l lVar = new j6.l(7);
        this.r = lVar;
        Looper d = lVar.d();
        this.s = d;
        e2.i0 a10 = g0Var.a(d, this);
        this.n = a10;
        this.P = new c2.e(context, d, this);
        a10.b(35, new a3.y() { // from class: i2.j0
            @Override // a3.y
            public final void a(long j11, long j12, b2.x xVar, MediaFormat mediaFormat) {
                r0 r0Var = r0.this;
                r0Var.getClass();
                yVar.a(j11, j12, xVar, mediaFormat);
                r0Var.a(j11, j12, xVar, mediaFormat);
            }
        }).b();
        a10.b(39, new k0(this)).b();
    }

    public static Pair T(b2.p1 p1Var, q0 q0Var, boolean z10, int i10, boolean z11, b2.o1 o1Var, b2.m1 m1Var) {
        int U;
        b2.p1 p1Var2 = q0Var.a;
        if (p1Var.p()) {
            return null;
        }
        b2.p1 p1Var3 = p1Var2.p() ? p1Var : p1Var2;
        try {
            Pair i11 = p1Var3.i(o1Var, m1Var, q0Var.b, q0Var.c);
            if (!p1Var.equals(p1Var3)) {
                if (p1Var.b(i11.first) == -1) {
                    if (!z10 || (U = U(o1Var, m1Var, i10, z11, i11.first, p1Var3, p1Var)) == -1) {
                        return null;
                    }
                    return p1Var.i(o1Var, m1Var, U, -9223372036854775807L);
                }
                if (p1Var3.g(i11.first, m1Var).f && p1Var3.m(m1Var.c, o1Var, 0L).n == p1Var3.b(i11.first)) {
                    return p1Var.i(o1Var, m1Var, p1Var.g(i11.first, m1Var).c, q0Var.c);
                }
            }
            return i11;
        } catch (IndexOutOfBoundsException unused) {
            return null;
        }
    }

    public static int U(b2.o1 o1Var, b2.m1 m1Var, int i10, boolean z10, Object obj, b2.p1 p1Var, b2.p1 p1Var2) {
        b2.o1 o1Var2 = o1Var;
        b2.p1 p1Var3 = p1Var;
        Object obj2 = p1Var3.m(p1Var3.g(obj, m1Var).c, o1Var, 0L).a;
        for (int i11 = 0; i11 < p1Var2.o(); i11++) {
            if (p1Var2.m(i11, o1Var, 0L).a.equals(obj2)) {
                return i11;
            }
        }
        int b10 = p1Var3.b(obj);
        int h = p1Var3.h();
        int i12 = -1;
        int i13 = 0;
        while (i13 < h && i12 == -1) {
            b2.p1 p1Var4 = p1Var3;
            int d = p1Var4.d(b10, m1Var, o1Var2, i10, z10);
            if (d == -1) {
                break;
            }
            i12 = p1Var2.b(p1Var4.l(d));
            i13++;
            p1Var3 = p1Var4;
            b10 = d;
            o1Var2 = o1Var;
        }
        if (i12 == -1) {
            return -1;
        }
        return p1Var2.f(i12, m1Var, false).c;
    }

    public static void f(n1 n1Var) {
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

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, u2.e0, u2.f1] */
    public static boolean z(x0 x0Var) {
        if (x0Var != null) {
            try {
                ?? r12 = x0Var.a;
                if (x0Var.e) {
                    for (u2.d1 d1Var : x0Var.c) {
                        if (d1Var != null) {
                            d1Var.d();
                        }
                    }
                } else {
                    r12.g();
                }
                if ((!x0Var.e ? 0L : r12.b()) != Long.MIN_VALUE) {
                    return true;
                }
            } catch (IOException unused) {
            }
        }
        return false;
    }

    public final boolean A(int i10, u2.g0 g0Var) {
        z0 z0Var = this.H;
        x0 x0Var = z0Var.k;
        if (x0Var != null && x0Var.g.a.equals(g0Var)) {
            r1 r1Var = this.a[i10];
            x0 x0Var2 = z0Var.k;
            int i11 = r1Var.d;
            boolean z10 = (i11 == 2 || i11 == 4) && r1Var.d(x0Var2) == r1Var.a;
            boolean z11 = r1Var.d == 3 && r1Var.d(x0Var2) == r1Var.c;
            if (z10 || z11) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:99:0x029c, code lost:
    
        if (((long) ((r3.e() - r23.m0) / r23.y.h().a)) > 10000000) goto L254;
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
        x0 x0Var;
        long j10;
        x0 x0Var2;
        x0 x0Var3;
        r1[] r1VarArr;
        z0 z0Var;
        boolean z10;
        x0 x0Var4;
        x0 x0Var5;
        x0 a2;
        boolean z11;
        int i10;
        r1[] r1VarArr2;
        int i11;
        boolean z12;
        boolean z13;
        char c10;
        int i12;
        int i13;
        x0 x0Var6;
        x0 x0Var7;
        boolean z14;
        int i14;
        if (this.X.a.p() || !this.I.k) {
            return;
        }
        this.H.m(this.m0);
        z0 z0Var2 = this.H;
        x0 x0Var8 = z0Var2.l;
        if (x0Var8 == null || (!x0Var8.g.k && x0Var8.g() && z0Var2.l.g.f != -9223372036854775807L && z0Var2.n < 100)) {
            z0 z0Var3 = this.H;
            long j11 = this.m0;
            k1 k1Var = this.X;
            x0 x0Var9 = z0Var3.l;
            y0 d = x0Var9 == null ? z0Var3.d(k1Var.a, k1Var.b, k1Var.c, k1Var.s, -9223372036854775807L) : z0Var3.c(k1Var.a, x0Var9, j11);
            if (d != null) {
                z0 z0Var4 = this.H;
                x0 x0Var10 = z0Var4.l;
                long j12 = x0Var10 == null ? 1000000000000L : (x0Var10.p + x0Var10.g.f) - d.b;
                int i15 = 0;
                while (true) {
                    if (i15 >= z0Var4.q.size()) {
                        x0Var = null;
                        break;
                    }
                    y0 y0Var = ((x0) z0Var4.q.get(i15)).g;
                    long j13 = y0Var.f;
                    long j14 = d.f;
                    if ((j13 == -9223372036854775807L || j13 == j14) && y0Var.b == d.b && y0Var.a.equals(d.a)) {
                        x0Var = (x0) z0Var4.q.remove(i15);
                        break;
                    }
                    i15++;
                }
                if (x0Var == null) {
                    r0 r0Var = (r0) z0Var4.e.b;
                    b[] bVarArr = r0Var.b;
                    x2.s sVar = r0Var.d;
                    t0 t0Var = r0Var.f;
                    j2.k kVar = r0Var.L;
                    i iVar = (i) t0Var;
                    iVar.getClass();
                    j10 = -9223372036854775807L;
                    androidx.biometric.e eVar = new androidx.biometric.e(iVar, kVar);
                    j1 j1Var = r0Var.I;
                    x2.t tVar = r0Var.e;
                    r0Var.s0.getClass();
                    x0Var = new x0(bVarArr, j12, sVar, eVar, j1Var, d, tVar);
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
                    x0Var.a.n(this, j15);
                } else if (x0Var.e) {
                    this.n.b(8, x0Var.a).b();
                }
                if (this.H.i == x0Var) {
                    R(d.b, true);
                }
                t(false);
                if (this.e0) {
                    C();
                } else {
                    this.e0 = z(this.H.l);
                    x0();
                }
                z0 z0Var5 = this.H;
                if (!this.b0 && this.O && !this.u0 && !d() && (x0Var6 = z0Var5.k) != null && x0Var6 == z0Var5.j && (x0Var7 = x0Var6.m) != null && (z14 = x0Var7.e)) {
                    u6.p(z14);
                    if (((long) ((x0Var7.e() - this.m0) / this.y.h().a)) <= 10000000) {
                        x0 x0Var12 = z0Var5.k;
                        x0Var12.getClass();
                        z0Var5.k = x0Var12.m;
                        z0Var5.l();
                        z0Var5.k.getClass();
                        r1[] r1VarArr3 = this.a;
                        x0 x0Var13 = z0Var5.k;
                        if (x0Var13 != null) {
                            x2.t tVar2 = x0Var13.o;
                            for (int i16 = 0; i16 < r1VarArr3.length; i16++) {
                                if (tVar2.b(i16)) {
                                    r1 r1Var = r1VarArr3[i16];
                                    if (r1Var.c != null && !r1Var.f()) {
                                        r1 r1Var2 = r1VarArr3[i16];
                                        u6.p(!r1Var2.f());
                                        if (r1.h(r1Var2.a)) {
                                            i14 = 3;
                                        } else {
                                            b bVar = r1Var2.c;
                                            i14 = (bVar == null || bVar.n == 0) ? 2 : 4;
                                        }
                                        r1Var2.d = i14;
                                        j(x0Var13, i16, false, x0Var13.e());
                                    }
                                }
                            }
                            if (d()) {
                                this.t0 = x0Var13.a.o();
                                if (!x0Var13.g()) {
                                    z0Var5.n(x0Var13);
                                    t(false);
                                    C();
                                }
                            }
                        }
                    }
                }
                boolean z15 = this.O;
                r1[] r1VarArr4 = this.a;
                z0 z0Var6 = this.H;
                x0Var2 = z0Var6.j;
                if (x0Var2 != null) {
                    if (x0Var2.m == null || this.b0) {
                        if (x0Var2.g.k || this.b0) {
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
                        int i17 = 0;
                        while (true) {
                            if (i17 < r1VarArr4.length) {
                                r1 r1Var4 = r1VarArr4[i17];
                                if (!r1Var4.e(x0Var2, r1Var4.a) || !r1Var4.e(x0Var2, r1Var4.c)) {
                                    break;
                                } else {
                                    i17++;
                                }
                            } else if (!d() || z0Var6.k != z0Var6.j) {
                                x0 x0Var14 = x0Var2.m;
                                if (x0Var14.e || this.m0 >= x0Var14.e()) {
                                    boolean z16 = x0Var2.m.e;
                                    if (z16) {
                                        u6.p(z16);
                                    }
                                    x2.t tVar3 = x0Var2.o;
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
                                    x2.t tVar4 = x0Var18.o;
                                    b2.p1 p1Var = this.X.a;
                                    D0(p1Var, x0Var18.g.a, p1Var, x0Var2.g.a, -9223372036854775807L, false);
                                    if (x0Var18.e && ((z15 && this.t0 != j10) || x0Var18.a.o() != j10)) {
                                        this.t0 = j10;
                                        boolean z17 = z15 && !this.u0;
                                        if (z17) {
                                            int i18 = 0;
                                            while (true) {
                                                if (i18 >= r1VarArr4.length) {
                                                    break;
                                                }
                                                boolean b10 = tVar4.b(i18);
                                                x2.p[] pVarArr = tVar4.c;
                                                if (b10 && r1VarArr4[i18].a.b != -2 && !b2.w0.a(pVarArr[i18].m().s, pVarArr[i18].m().k) && !r1VarArr4[i18].f()) {
                                                    z17 = false;
                                                    break;
                                                }
                                                i18++;
                                            }
                                        }
                                        if (!z17) {
                                            long e = x0Var18.e();
                                            for (r1 r1Var5 : r1VarArr4) {
                                                b bVar2 = r1Var5.c;
                                                b bVar3 = r1Var5.a;
                                                if (r1.h(bVar3) && (i13 = r1Var5.d) != 4 && i13 != 2) {
                                                    r1.l(bVar3, e);
                                                }
                                                if (bVar2 != null) {
                                                    if ((bVar2.n != 0) && r1Var5.d != 3) {
                                                        r1.l(bVar2, e);
                                                    }
                                                }
                                            }
                                            if (!x0Var18.g()) {
                                                z0Var6.n(x0Var18);
                                                t(false);
                                                C();
                                            }
                                        }
                                    }
                                    for (r1 r1Var6 : r1VarArr4) {
                                        long e7 = x0Var18.e();
                                        b bVar4 = r1Var6.a;
                                        int i19 = r1Var6.b;
                                        boolean b11 = tVar3.b(i19);
                                        boolean b12 = tVar4.b(i19);
                                        b bVar5 = r1Var6.c;
                                        if (bVar5 == null || (i12 = r1Var6.d) == 3 || (i12 == 0 && r1.h(bVar4))) {
                                            bVar5 = bVar4;
                                        }
                                        if (!b11 || bVar5.y) {
                                            c10 = 65534;
                                        } else {
                                            int i20 = bVar4.b;
                                            c10 = 65534;
                                            boolean z18 = i20 == -2;
                                            q1 q1Var = tVar3.b[i19];
                                            q1 q1Var2 = tVar4.b[i19];
                                            if (!b12 || !Objects.equals(q1Var2, q1Var) || z18 || r1Var6.f()) {
                                                r1.l(bVar5, e7);
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                z0 z0Var7 = this.H;
                x0Var3 = z0Var7.j;
                if (x0Var3 != null && z0Var7.i != x0Var3 && !x0Var3.h) {
                    r1VarArr2 = this.a;
                    x2.t tVar5 = x0Var3.o;
                    z12 = true;
                    for (i11 = 0; i11 < r1VarArr2.length; i11++) {
                        int c11 = r1VarArr2[i11].c();
                        r1 r1Var7 = r1VarArr2[i11];
                        j jVar = this.y;
                        int j18 = r1Var7.j(r1Var7.a, x0Var3, tVar5, jVar);
                        int j19 = r1Var7.j(r1Var7.c, x0Var3, tVar5, jVar);
                        if (j18 == 1) {
                            j18 = j19;
                        }
                        if ((j18 & 2) != 0 && (z13 = this.j0) && z13) {
                            this.j0 = false;
                            if (this.X.p) {
                                this.n.f(2);
                            }
                        }
                        this.k0 -= c11 - r1VarArr2[i11].c();
                        z12 &= (j18 & 1) != 0;
                    }
                    if (z12) {
                        for (int i21 = 0; i21 < r1VarArr2.length; i21++) {
                            if (tVar5.b(i21)) {
                                if (!(r1VarArr2[i21].d(x0Var3) != null)) {
                                    j(x0Var3, i21, false, x0Var3.e());
                                }
                            }
                        }
                    }
                    if (z12) {
                        z0Var7.j.h = true;
                    }
                }
                r1VarArr = this.a;
                z0Var = this.H;
                z10 = false;
                while (s0() && !this.b0 && (x0Var4 = z0Var.i) != null && (x0Var5 = x0Var4.m) != null && this.m0 >= x0Var5.e() && x0Var5.h) {
                    if (z10) {
                        E();
                    }
                    this.u0 = false;
                    a2 = z0Var.a();
                    a2.getClass();
                    if (this.X.b.a.equals(a2.g.a.a)) {
                        u2.g0 g0Var = this.X.b;
                        if (g0Var.b == -1) {
                            u2.g0 g0Var2 = a2.g.a;
                            if (g0Var2.b == -1 && g0Var.e != g0Var2.e) {
                                z11 = true;
                                y0 y0Var2 = a2.g;
                                boolean z19 = z11;
                                u2.g0 g0Var3 = y0Var2.a;
                                long j20 = y0Var2.b;
                                this.X = x(g0Var3, j20, y0Var2.d, j20, !z19, 0);
                                Q();
                                C0();
                                if (d() && a2 == z0Var.k) {
                                    for (r1 r1Var8 : r1VarArr) {
                                        int i22 = r1Var8.d;
                                        if (i22 == 3 || i22 == 4) {
                                            boolean z20 = i22 == 4;
                                            b bVar6 = r1Var8.a;
                                            b bVar7 = r1Var8.c;
                                            if (z20) {
                                                bVar7.getClass();
                                                bVar7.c(17, bVar6);
                                            } else {
                                                bVar7.getClass();
                                                bVar6.c(17, bVar7);
                                            }
                                            r1Var8.d = r1Var8.d == 4 ? 0 : 1;
                                        } else if (i22 == 2) {
                                            r1Var8.d = 0;
                                        }
                                    }
                                }
                                if (this.X.e == 3) {
                                    u0();
                                }
                                x2.t tVar6 = z0Var.i.o;
                                for (i10 = 0; i10 < r1VarArr.length; i10++) {
                                    if (tVar6.b(i10)) {
                                        r1 r1Var9 = r1VarArr[i10];
                                        b bVar8 = r1Var9.c;
                                        b bVar9 = r1Var9.a;
                                        if (r1.h(bVar9)) {
                                            bVar9.e();
                                        } else if (bVar8 != null) {
                                            if (bVar8.n != 0) {
                                                bVar8.e();
                                            }
                                        }
                                    }
                                }
                                z10 = true;
                            }
                        }
                    }
                    z11 = false;
                    y0 y0Var22 = a2.g;
                    boolean z192 = z11;
                    u2.g0 g0Var32 = y0Var22.a;
                    long j202 = y0Var22.b;
                    this.X = x(g0Var32, j202, y0Var22.d, j202, !z192, 0);
                    Q();
                    C0();
                    if (d()) {
                        while (r2 < r1) {
                        }
                    }
                    if (this.X.e == 3) {
                    }
                    x2.t tVar62 = z0Var.i.o;
                    while (i10 < r1VarArr.length) {
                    }
                    z10 = true;
                }
                this.s0.getClass();
            }
        }
        j10 = -9223372036854775807L;
        if (this.e0) {
        }
        z0 z0Var52 = this.H;
        if (!this.b0) {
            u6.p(z14);
            if (((long) ((x0Var7.e() - this.m0) / this.y.h().a)) <= 10000000) {
            }
        }
        boolean z152 = this.O;
        r1[] r1VarArr42 = this.a;
        z0 z0Var62 = this.H;
        x0Var2 = z0Var62.j;
        if (x0Var2 != null) {
        }
        z0 z0Var72 = this.H;
        x0Var3 = z0Var72.j;
        if (x0Var3 != null) {
            r1VarArr2 = this.a;
            x2.t tVar52 = x0Var3.o;
            z12 = true;
            while (i11 < r1VarArr2.length) {
            }
            if (z12) {
            }
            if (z12) {
            }
        }
        r1VarArr = this.a;
        z0Var = this.H;
        z10 = false;
        while (s0()) {
            if (z10) {
            }
            this.u0 = false;
            a2 = z0Var.a();
            a2.getClass();
            if (this.X.b.a.equals(a2.g.a.a)) {
            }
            z11 = false;
            y0 y0Var222 = a2.g;
            boolean z1922 = z11;
            u2.g0 g0Var322 = y0Var222.a;
            long j2022 = y0Var222.b;
            this.X = x(g0Var322, j2022, y0Var222.d, j2022, !z1922, 0);
            Q();
            C0();
            if (d()) {
            }
            if (this.X.e == 3) {
            }
            x2.t tVar622 = z0Var.i.o;
            while (i10 < r1VarArr.length) {
            }
            z10 = true;
        }
        this.s0.getClass();
    }

    public final boolean B() {
        x0 x0Var = this.H.i;
        long j10 = x0Var.g.f;
        if (x0Var.e) {
            return j10 == -9223372036854775807L || this.X.s < j10 || !s0();
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
        k1 k1Var = this.X;
        if (k1Var.l == z11 && k1Var.n == i11 && k1Var.m == i12) {
            return;
        }
        this.X = k1Var.e(i12, i11, z11);
        E0(false, false);
        z0 z0Var = this.H;
        for (x0 x0Var = z0Var.i; x0Var != null; x0Var = x0Var.m) {
            for (x2.p pVar : x0Var.o.c) {
                if (pVar != null) {
                    pVar.e(z11);
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
            z0Var.m(this.m0);
            return;
        }
        int i13 = this.X.e;
        e2.i0 i0Var = this.n;
        if (i13 != 3) {
            if (i13 == 2) {
                i0Var.f(2);
            }
        } else {
            j jVar = this.y;
            jVar.f = true;
            jVar.a.d();
            u0();
            i0Var.f(2);
        }
    }

    /* JADX WARN: Type inference failed for: r1v14, types: [java.lang.Object, u2.e0] */
    /* JADX WARN: Type inference failed for: r1v21, types: [java.lang.Object, u2.f1] */
    /* JADX WARN: Type inference failed for: r7v1, types: [java.lang.Object, u2.f1] */
    public final void C() {
        boolean b10;
        if (z(this.H.l)) {
            x0 x0Var = this.H.l;
            long o10 = o(!x0Var.e ? 0L : x0Var.a.b());
            x0 x0Var2 = this.H.i;
            long j10 = t0(this.X.a, x0Var.g.a) ? this.J.h : -9223372036854775807L;
            j2.k kVar = this.L;
            b2.p1 p1Var = this.X.a;
            u2.g0 g0Var = x0Var.g.a;
            float f7 = this.y.h().a;
            boolean z10 = this.X.l;
            s0 s0Var = new s0(kVar, p1Var, g0Var, o10, f7, this.c0, j10);
            b10 = ((i) this.f).b(s0Var);
            x0 x0Var3 = this.H.i;
            if (!b10 && x0Var3.e && o10 < 500000 && this.x > 0) {
                x0Var3.a.i(this.X.s);
                b10 = ((i) this.f).b(s0Var);
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
            float f10 = this.y.h().a;
            u6.g(f10 > 0.0f || f10 == -3.4028235E38f);
            u0Var.b = f10;
            long j11 = this.d0;
            u6.g(j11 >= 0 || j11 == -9223372036854775807L);
            u0Var.c = j11;
            v0 v0Var = new v0(u0Var);
            u6.p(x0Var4.m == null);
            x0Var4.a.p(v0Var);
        }
        x0();
    }

    /* JADX WARN: Type inference failed for: r2v21, types: [java.lang.Object, u2.e0] */
    public final void C0() {
        long j10;
        float f7;
        x0 x0Var = this.H.i;
        if (x0Var == null) {
            return;
        }
        long o10 = x0Var.e ? x0Var.a.o() : -9223372036854775807L;
        if (o10 != -9223372036854775807L) {
            if (!x0Var.g()) {
                this.H.n(x0Var);
                t(false);
                C();
            }
            R(o10, true);
            if (o10 != this.X.s) {
                k1 k1Var = this.X;
                this.X = x(k1Var.b, o10, k1Var.c, o10, true, 5);
            }
        } else {
            j jVar = this.y;
            boolean z10 = x0Var != this.H.j;
            u1 u1Var = jVar.a;
            b bVar = jVar.c;
            if (bVar == null || bVar.l() || ((z10 && jVar.c.n != 2) || (!jVar.c.m() && (z10 || jVar.c.k())))) {
                jVar.e = true;
                if (jVar.f) {
                    u1Var.d();
                }
            } else {
                w0 w0Var = jVar.d;
                w0Var.getClass();
                long a2 = w0Var.a();
                if (jVar.e) {
                    if (a2 >= u1Var.a()) {
                        jVar.e = false;
                        if (jVar.f) {
                            u1Var.d();
                        }
                    } else if (u1Var.c) {
                        u1Var.c(u1Var.a());
                        u1Var.c = false;
                    }
                }
                u1Var.c(a2);
                b2.a1 h = w0Var.h();
                if (!h.equals((b2.a1) u1Var.e)) {
                    u1Var.f(h);
                    jVar.b.n.b(16, h).b();
                }
            }
            long a10 = jVar.a();
            this.m0 = a10;
            long j11 = a10 - x0Var.p;
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
            if (this.y.b()) {
                boolean z11 = !this.Y.d;
                k1 k1Var3 = this.X;
                this.X = x(k1Var3.b, j11, k1Var3.c, j11, z11, 6);
            } else {
                k1 k1Var4 = this.X;
                k1Var4.s = j11;
                k1Var4.t = SystemClock.elapsedRealtime();
            }
        }
        this.X.q = this.H.l.d();
        k1 k1Var5 = this.X;
        k1Var5.r = o(k1Var5.q);
        k1 k1Var6 = this.X;
        if (k1Var6.l && k1Var6.e == 3 && t0(k1Var6.a, k1Var6.b)) {
            k1 k1Var7 = this.X;
            float f10 = 1.0f;
            if (k1Var7.o.a == 1.0f) {
                g gVar = this.J;
                long l4 = l(k1Var7.a, k1Var7.b.a, k1Var7.s);
                long j13 = this.X.r;
                if (gVar.c != -9223372036854775807L) {
                    long j14 = l4 - j13;
                    long j15 = gVar.m;
                    if (j15 == -9223372036854775807L) {
                        gVar.m = j14;
                        gVar.n = 0L;
                    } else {
                        gVar.m = Math.max(j14, (long) ((j14 * 9.999871E-4f) + (j15 * 0.999f)));
                        gVar.n = (long) ((9.999871E-4f * Math.abs(j14 - r9)) + (gVar.n * 0.999f));
                    }
                    if (gVar.l != -9223372036854775807L) {
                        j10 = 1000;
                        if (SystemClock.elapsedRealtime() - gVar.l < 1000) {
                            f10 = gVar.k;
                        }
                    } else {
                        j10 = 1000;
                    }
                    gVar.l = SystemClock.elapsedRealtime();
                    long j16 = (gVar.n * 3) + gVar.m;
                    if (gVar.h > j16) {
                        float S = e2.m0.S(j10);
                        f7 = 1.0E-7f;
                        long[] jArr = {j16, gVar.e, gVar.h - (((long) ((gVar.k - 1.0f) * S)) + ((long) ((gVar.i - 1.0f) * S)))};
                        long j17 = jArr[0];
                        for (int i10 = 1; i10 < 3; i10++) {
                            long j18 = jArr[i10];
                            if (j18 > j17) {
                                j17 = j18;
                            }
                        }
                        gVar.h = j17;
                    } else {
                        f7 = 1.0E-7f;
                        long j19 = e2.m0.j(l4 - ((long) (Math.max(0.0f, gVar.k - 1.0f) / 1.0E-7f)), gVar.h, j16);
                        gVar.h = j19;
                        long j20 = gVar.g;
                        if (j20 != -9223372036854775807L && j19 > j20) {
                            gVar.h = j20;
                        }
                    }
                    long j21 = l4 - gVar.h;
                    if (Math.abs(j21) < gVar.a) {
                        gVar.k = 1.0f;
                    } else {
                        gVar.k = e2.m0.h((f7 * j21) + 1.0f, gVar.j, gVar.i);
                    }
                    f10 = gVar.k;
                }
                if (this.y.h().a != f10) {
                    b2.a1 a1Var = new b2.a1(f10, this.X.o.b);
                    this.n.e(16);
                    this.y.f(a1Var);
                    w(this.X.o, this.y.h().a, false, false);
                }
            }
        }
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, u2.e0, u2.f1] */
    public final void D() {
        z0 z0Var = this.H;
        z0Var.k();
        x0 x0Var = z0Var.m;
        if (x0Var != null) {
            ?? r12 = x0Var.a;
            if ((!x0Var.d || x0Var.e) && !r12.c()) {
                b2.p1 p1Var = this.X.a;
                if (x0Var.e) {
                    r12.s();
                }
                Iterator it = ((i) this.f).p.values().iterator();
                while (it.hasNext()) {
                    if (((h) it.next()).b) {
                        return;
                    }
                }
                if (!x0Var.d) {
                    long j10 = x0Var.g.b;
                    x0Var.d = true;
                    r12.n(this, j10);
                    return;
                }
                u0 u0Var = new u0();
                u0Var.a = this.m0 - x0Var.p;
                float f7 = this.y.h().a;
                u6.g(f7 > 0.0f || f7 == -3.4028235E38f);
                u0Var.b = f7;
                long j11 = this.d0;
                u6.g(j11 >= 0 || j11 == -9223372036854775807L);
                u0Var.c = j11;
                v0 v0Var = new v0(u0Var);
                u6.p(x0Var.m == null);
                r12.p(v0Var);
            }
        }
    }

    public final void D0(b2.p1 p1Var, u2.g0 g0Var, b2.p1 p1Var2, u2.g0 g0Var2, long j10, boolean z10) {
        boolean t02 = t0(p1Var, g0Var);
        Object obj = g0Var.a;
        if (!t02) {
            b2.a1 a1Var = g0Var.b() ? b2.a1.d : this.X.o;
            j jVar = this.y;
            if (jVar.h().equals(a1Var)) {
                return;
            }
            this.n.e(16);
            jVar.f(a1Var);
            w(this.X.o, a1Var.a, false, false);
            return;
        }
        b2.m1 m1Var = this.w;
        int i10 = p1Var.g(obj, m1Var).c;
        b2.o1 o1Var = this.v;
        p1Var.n(i10, o1Var);
        b2.j0 j0Var = o1Var.j;
        g gVar = this.J;
        gVar.getClass();
        gVar.c = e2.m0.S(j0Var.a);
        gVar.f = e2.m0.S(j0Var.b);
        gVar.g = e2.m0.S(j0Var.c);
        float f7 = j0Var.d;
        if (f7 == -3.4028235E38f) {
            f7 = 0.97f;
        }
        gVar.j = f7;
        float f10 = j0Var.e;
        if (f10 == -3.4028235E38f) {
            f10 = 1.03f;
        }
        gVar.i = f10;
        if (f7 == 1.0f && f10 == 1.0f) {
            gVar.c = -9223372036854775807L;
        }
        gVar.a();
        if (j10 != -9223372036854775807L) {
            gVar.d = l(p1Var, obj, j10);
            gVar.a();
            return;
        }
        if (!Objects.equals(!p1Var2.p() ? p1Var2.m(p1Var2.g(g0Var2.a, m1Var).c, o1Var, 0L).a : null, o1Var.a) || z10) {
            gVar.d = -9223372036854775807L;
            gVar.a();
        }
    }

    public final void E() {
        o0 o0Var = this.Y;
        k1 k1Var = this.X;
        boolean z10 = o0Var.c | (((k1) o0Var.f) != k1Var);
        o0Var.c = z10;
        o0Var.f = k1Var;
        if (z10) {
            h0 h0Var = this.G.b;
            h0Var.j.d(new q3(12, h0Var, o0Var));
            this.Y = new o0(this.X);
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

    public final void F(int i10) {
        r1 r1Var = this.a[i10];
        try {
            x0 x0Var = this.H.i;
            x0Var.getClass();
            b d = r1Var.d(x0Var);
            d.getClass();
            u2.d1 d1Var = d.r;
            d1Var.getClass();
            d1Var.d();
        } catch (IOException | RuntimeException e) {
            int i11 = r1Var.a.b;
            if (i11 != 3 && i11 != 5) {
                throw e;
            }
            x2.t tVar = this.H.i.o;
            e2.a.d("ExoPlayerImplInternal", "Disabling track due to error: " + b2.x.c(tVar.c[i10].m()), e);
            x2.t tVar2 = new x2.t((q1[]) tVar.b.clone(), (x2.p[]) tVar.c.clone(), tVar.d, tVar.e);
            tVar2.b[i10] = null;
            tVar2.c[i10] = null;
            h(i10);
            x0 x0Var2 = this.H.i;
            x0Var2.a(tVar2, this.X.s, false, new boolean[x0Var2.j.length]);
        }
    }

    @Override // u2.e1
    public final void G(u2.f1 f1Var) {
        this.n.b(9, (u2.e0) f1Var).b();
    }

    public final void H(int i10, boolean z10) {
        boolean[] zArr = this.c;
        if (zArr[i10] != z10) {
            zArr[i10] = z10;
            this.N.d(new i0(this, i10, z10, 0));
        }
    }

    public final void I() {
        u(this.I.b(), true);
    }

    public final void J(n0 n0Var) {
        b2.p1 b10;
        this.Y.f(1);
        int i10 = n0Var.a;
        int i11 = n0Var.b;
        int i12 = n0Var.c;
        u2.i1 i1Var = n0Var.d;
        j1 j1Var = this.I;
        ArrayList arrayList = j1Var.b;
        u6.g(i10 >= 0 && i10 <= i11 && i11 <= arrayList.size() && i12 >= 0);
        j1Var.j = i1Var;
        if (i10 == i11 || i10 == i12) {
            b10 = j1Var.b();
        } else {
            int min = Math.min(i10, i12);
            int max = Math.max(((i11 - i10) + i12) - 1, i11 - 1);
            int i13 = ((i1) arrayList.get(min)).d;
            e2.m0.R(i10, i11, i12, arrayList);
            while (min <= max) {
                i1 i1Var2 = (i1) arrayList.get(min);
                i1Var2.d = i13;
                i13 += i1Var2.a.o.e.o();
                min++;
            }
            b10 = j1Var.b();
        }
        u(b10, false);
    }

    public final void K() {
        this.Y.f(1);
        P(false, false, false, true);
        i iVar = (i) this.f;
        ConcurrentHashMap concurrentHashMap = iVar.p;
        long id2 = Thread.currentThread().getId();
        long j10 = iVar.q;
        u6.o("Players that share the same LoadControl must share the same playback thread. See ExoPlayer.Builder.setPlaybackLooper(Looper).", j10 == -1 || j10 == id2);
        iVar.q = id2;
        j2.k kVar = this.L;
        h hVar = (h) concurrentHashMap.get(kVar);
        if (hVar == null) {
            h hVar2 = new h();
            hVar2.a = 1;
            concurrentHashMap.put(kVar, hVar2);
        } else {
            hVar.a++;
        }
        h hVar3 = (h) concurrentHashMap.get(kVar);
        hVar3.getClass();
        Integer num = (Integer) iVar.o.get(kVar.a);
        int intValue = (num == null || num.intValue() == -1) ? iVar.l : num.intValue();
        if (intValue == -1) {
            intValue = 13107200;
        }
        hVar3.c = intValue;
        hVar3.b = false;
        o0(this.X.a.p() ? 4 : 2);
        k1 k1Var = this.X;
        boolean z10 = k1Var.l;
        B0(this.P.d(k1Var.e, z10), k1Var.n, k1Var.m, z10);
        y2.f fVar = (y2.f) this.h;
        fVar.getClass();
        j1 j1Var = this.I;
        ArrayList arrayList = j1Var.b;
        u6.p(!j1Var.k);
        j1Var.l = fVar;
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            i1 i1Var = (i1) arrayList.get(i10);
            j1Var.e(i1Var);
            j1Var.g.add(i1Var);
        }
        j1Var.k = true;
        this.n.f(2);
    }

    public final void L(e2.i iVar) {
        j6.l lVar = this.r;
        e2.i0 i0Var = this.n;
        try {
            P(true, false, true, false);
            M();
            t0 t0Var = this.f;
            j2.k kVar = this.L;
            i iVar2 = (i) t0Var;
            ConcurrentHashMap concurrentHashMap = iVar2.p;
            h hVar = (h) concurrentHashMap.get(kVar);
            if (hVar != null) {
                int i10 = hVar.a - 1;
                hVar.a = i10;
                if (i10 == 0) {
                    concurrentHashMap.remove(kVar);
                    iVar2.c();
                }
            }
            if (iVar2.p.isEmpty()) {
                iVar2.q = -1L;
            }
            c2.e eVar = this.P;
            eVar.c = null;
            eVar.a();
            eVar.c(0);
            this.d.a();
            o0(1);
        } finally {
            i0Var.a.removeCallbacksAndMessages(null);
            lVar.h();
            iVar.e();
        }
    }

    public final void M() {
        for (int i10 = 0; i10 < this.a.length; i10++) {
            b bVar = this.b[i10];
            synchronized (bVar.a) {
                bVar.H = null;
            }
            r1 r1Var = this.a[i10];
            b bVar2 = r1Var.a;
            u6.p(bVar2.n == 0);
            bVar2.q();
            r1Var.e = false;
            b bVar3 = r1Var.c;
            if (bVar3 != null) {
                u6.p(bVar3.n == 0);
                bVar3.q();
                r1Var.f = false;
            }
        }
    }

    public final void N(int i10, int i11, u2.i1 i1Var) {
        this.Y.f(1);
        j1 j1Var = this.I;
        j1Var.getClass();
        u6.g(i10 >= 0 && i10 <= i11 && i11 <= j1Var.b.size());
        j1Var.j = i1Var;
        j1Var.g(i10, i11);
        u(j1Var.b(), false);
    }

    /* JADX WARN: Removed duplicated region for block: B:62:0x0164  */
    /* JADX WARN: Removed duplicated region for block: B:65:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void O() {
        int i10;
        int i11;
        float f7 = this.y.h().a;
        z0 z0Var = this.H;
        x0 x0Var = z0Var.i;
        x0 x0Var2 = z0Var.j;
        x2.t tVar = null;
        x0 x0Var3 = x0Var;
        boolean z10 = true;
        while (x0Var3 != null && x0Var3.e) {
            k1 k1Var = this.X;
            x2.t j10 = x0Var3.j(f7, k1Var.a, k1Var.l);
            x2.t tVar2 = x0Var3 == this.H.i ? j10 : tVar;
            x2.t tVar3 = x0Var3.o;
            x2.p[] pVarArr = j10.c;
            if (tVar3 != null && tVar3.c.length == pVarArr.length) {
                for (int i12 = 0; i12 < pVarArr.length; i12++) {
                    if (j10.a(tVar3, i12)) {
                    }
                }
                if (x0Var3 == x0Var2) {
                    z10 = false;
                }
                x0Var3 = x0Var3.m;
                tVar = tVar2;
            }
            if (z10) {
                z0 z0Var2 = this.H;
                x0 x0Var4 = z0Var2.i;
                boolean z11 = (z0Var2.n(x0Var4) & 1) != 0;
                boolean[] zArr = new boolean[this.a.length];
                tVar2.getClass();
                long a2 = x0Var4.a(tVar2, this.X.s, z11, zArr);
                k1 k1Var2 = this.X;
                boolean z12 = (k1Var2.e == 4 || a2 == k1Var2.s) ? false : true;
                k1 k1Var3 = this.X;
                i10 = 4;
                this.X = x(k1Var3.b, a2, k1Var3.c, k1Var3.d, z12, 5);
                if (z12) {
                    R(a2, true);
                }
                g();
                boolean[] zArr2 = new boolean[this.a.length];
                int i13 = 0;
                while (true) {
                    r1[] r1VarArr = this.a;
                    if (i13 >= r1VarArr.length) {
                        break;
                    }
                    int c10 = r1VarArr[i13].c();
                    zArr2[i13] = this.a[i13].g();
                    r1 r1Var = this.a[i13];
                    u2.d1 d1Var = x0Var4.c[i13];
                    j jVar = this.y;
                    long j11 = this.m0;
                    boolean z13 = zArr[i13];
                    b bVar = r1Var.a;
                    if (r1.h(bVar)) {
                        if (d1Var != bVar.r) {
                            r1Var.a(bVar, jVar);
                        } else if (z13) {
                            bVar.z(j11, false, true);
                        }
                    }
                    b bVar2 = r1Var.c;
                    if (bVar2 != null && r1.h(bVar2)) {
                        if (d1Var != bVar2.r) {
                            r1Var.a(bVar2, jVar);
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
                k(this.m0, zArr2);
                x0Var4.h = true;
            } else {
                i10 = 4;
                this.H.n(x0Var3);
                if (x0Var3.e) {
                    long max = Math.max(x0Var3.g.b, this.m0 - x0Var3.p);
                    if (this.O && d() && this.H.k == x0Var3) {
                        g();
                    }
                    i11 = 4;
                    x0Var3.a(j10, max, false, new boolean[x0Var3.j.length]);
                    t(true);
                    if (this.X.e == i11) {
                        C();
                        C0();
                        this.n.f(2);
                        return;
                    }
                    return;
                }
            }
            i11 = i10;
            t(true);
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
        b2.p1 p1Var;
        b2.p1 p1Var2;
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
        j jVar = this.y;
        jVar.f = false;
        u1 u1Var = jVar.a;
        if (u1Var.c) {
            u1Var.c(u1Var.a());
            u1Var.c = false;
        }
        this.m0 = 1000000000000L;
        for (int i10 = 0; i10 < this.a.length; i10++) {
            try {
                h(i10);
            } catch (m e) {
                e = e;
                e2.a.d("ExoPlayerImplInternal", "Disable failed.", e);
                if (z10) {
                }
                this.k0 = 0;
                k1 k1Var = this.X;
                u2.g0 g0Var2 = k1Var.b;
                long j13 = k1Var.s;
                if (!this.X.b.b()) {
                }
                j10 = this.X.c;
                if (z11) {
                }
                this.H.b();
                this.e0 = false;
                p1Var = this.X.a;
                if (z12) {
                }
                p1Var2 = p1Var;
                g0Var = g0Var2;
                k1 k1Var2 = this.X;
                int i11 = k1Var2.e;
                if (z13) {
                }
                u2.r1 r1Var = z14 ? u2.r1.d : k1Var2.h;
                x2.t tVar = z14 ? this.e : k1Var2.i;
                if (z14) {
                }
                this.X = new k1(p1Var2, g0Var, j12, j11, i11, r14, false, r1Var, tVar, list, g0Var, k1Var2.l, k1Var2.m, k1Var2.n, k1Var2.o, j11, 0L, j11, 0L, false);
                if (z12) {
                }
            } catch (RuntimeException e7) {
                e = e7;
                e2.a.d("ExoPlayerImplInternal", "Disable failed.", e);
                if (z10) {
                }
                this.k0 = 0;
                k1 k1Var3 = this.X;
                u2.g0 g0Var22 = k1Var3.b;
                long j132 = k1Var3.s;
                if (!this.X.b.b()) {
                }
                j10 = this.X.c;
                if (z11) {
                }
                this.H.b();
                this.e0 = false;
                p1Var = this.X.a;
                if (z12) {
                }
                p1Var2 = p1Var;
                g0Var = g0Var22;
                k1 k1Var22 = this.X;
                int i112 = k1Var22.e;
                if (z13) {
                }
                u2.r1 r1Var2 = z14 ? u2.r1.d : k1Var22.h;
                x2.t tVar2 = z14 ? this.e : k1Var22.i;
                if (z14) {
                }
                this.X = new k1(p1Var2, g0Var, j12, j11, i112, r14, false, r1Var2, tVar2, list, g0Var, k1Var22.l, k1Var22.m, k1Var22.n, k1Var22.o, j11, 0L, j11, 0L, false);
                if (z12) {
                }
            }
        }
        this.t0 = -9223372036854775807L;
        if (z10) {
            for (r1 r1Var3 : this.a) {
                try {
                    r1Var3.k();
                } catch (RuntimeException e10) {
                    e2.a.d("ExoPlayerImplInternal", "Reset failed.", e10);
                }
            }
        }
        this.k0 = 0;
        k1 k1Var32 = this.X;
        u2.g0 g0Var222 = k1Var32.b;
        long j1322 = k1Var32.s;
        if (!this.X.b.b()) {
            k1 k1Var4 = this.X;
            b2.m1 m1Var = this.w;
            u2.g0 g0Var3 = k1Var4.b;
            b2.p1 p1Var3 = k1Var4.a;
            if (!p1Var3.p() && !p1Var3.g(g0Var3.a, m1Var).f) {
                j10 = this.X.s;
                if (z11) {
                    j11 = j1322;
                    j12 = j10;
                    z14 = false;
                } else {
                    this.l0 = null;
                    Pair n10 = n(this.X.a);
                    g0Var222 = (u2.g0) n10.first;
                    long longValue = ((Long) n10.second).longValue();
                    z14 = g0Var222.equals(this.X.b) ? false : true;
                    j11 = longValue;
                    j12 = -9223372036854775807L;
                }
                this.H.b();
                this.e0 = false;
                p1Var = this.X.a;
                if (z12 || !(p1Var instanceof p1)) {
                    p1Var2 = p1Var;
                } else {
                    p1 p1Var4 = (p1) p1Var;
                    u2.i1 i1Var = this.I.j;
                    b2.p1[] p1VarArr = p1Var4.l;
                    b2.p1[] p1VarArr2 = new b2.p1[p1VarArr.length];
                    for (int i12 = 0; i12 < p1VarArr.length; i12++) {
                        p1VarArr2[i12] = new o1(p1VarArr[i12]);
                    }
                    p1Var2 = new p1(p1VarArr2, p1Var4.m, i1Var);
                    if (g0Var222.b != -1) {
                        p1Var2.g(g0Var222.a, this.w);
                        int i13 = this.w.c;
                        b2.o1 o1Var = this.v;
                        p1Var2.m(i13, o1Var, 0L);
                        if (o1Var.a()) {
                            g0Var = new u2.g0(g0Var222.a, g0Var222.d);
                            k1 k1Var222 = this.X;
                            int i1122 = k1Var222.e;
                            m mVar = z13 ? null : k1Var222.f;
                            u2.r1 r1Var22 = z14 ? u2.r1.d : k1Var222.h;
                            x2.t tVar22 = z14 ? this.e : k1Var222.i;
                            if (z14) {
                                e9.l0 l0Var = e9.n0.b;
                                list = x1.e;
                            } else {
                                list = k1Var222.j;
                            }
                            this.X = new k1(p1Var2, g0Var, j12, j11, i1122, mVar, false, r1Var22, tVar22, list, g0Var, k1Var222.l, k1Var222.m, k1Var222.n, k1Var222.o, j11, 0L, j11, 0L, false);
                            if (z12) {
                                z0 z0Var = this.H;
                                if (!z0Var.q.isEmpty()) {
                                    ArrayList arrayList = new ArrayList();
                                    for (int i14 = 0; i14 < z0Var.q.size(); i14++) {
                                        ((x0) z0Var.q.get(i14)).i();
                                    }
                                    z0Var.q = arrayList;
                                    z0Var.m = null;
                                    z0Var.k();
                                }
                                j1 j1Var = this.I;
                                HashMap hashMap = j1Var.f;
                                for (h1 h1Var : hashMap.values()) {
                                    try {
                                        h1Var.a.p(h1Var.b);
                                    } catch (RuntimeException e11) {
                                        e2.a.d("MediaSourceList", "Failed to release child source.", e11);
                                    }
                                    u2.a aVar = h1Var.a;
                                    g1 g1Var = h1Var.c;
                                    aVar.s(g1Var);
                                    h1Var.a.r(g1Var);
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
                int i11222 = k1Var2222.e;
                if (z13) {
                }
                u2.r1 r1Var222 = z14 ? u2.r1.d : k1Var2222.h;
                x2.t tVar222 = z14 ? this.e : k1Var2222.i;
                if (z14) {
                }
                this.X = new k1(p1Var2, g0Var, j12, j11, i11222, mVar, false, r1Var222, tVar222, list, g0Var, k1Var2222.l, k1Var2222.m, k1Var2222.n, k1Var2222.o, j11, 0L, j11, 0L, false);
                if (z12) {
                }
            }
        }
        j10 = this.X.c;
        if (z11) {
        }
        this.H.b();
        this.e0 = false;
        p1Var = this.X.a;
        if (z12) {
        }
        p1Var2 = p1Var;
        g0Var = g0Var222;
        k1 k1Var22222 = this.X;
        int i112222 = k1Var22222.e;
        if (z13) {
        }
        u2.r1 r1Var2222 = z14 ? u2.r1.d : k1Var22222.h;
        x2.t tVar2222 = z14 ? this.e : k1Var22222.i;
        if (z14) {
        }
        this.X = new k1(p1Var2, g0Var, j12, j11, i112222, mVar, false, r1Var2222, tVar2222, list, g0Var, k1Var22222.l, k1Var22222.m, k1Var22222.n, k1Var22222.o, j11, 0L, j11, 0L, false);
        if (z12) {
        }
    }

    public final void Q() {
        x0 x0Var = this.H.i;
        this.b0 = x0Var != null && x0Var.g.j && this.a0;
    }

    public final void R(long j10, boolean z10) {
        x0 x0Var = this.H.i;
        long j11 = j10 + (x0Var == null ? 1000000000000L : x0Var.p);
        this.m0 = j11;
        this.y.a.c(j11);
        for (r1 r1Var : this.a) {
            long j12 = this.m0;
            b d = r1Var.d(x0Var);
            if (d != null) {
                d.z(j12, false, z10);
            }
        }
        for (x0 x0Var2 = r0.i; x0Var2 != null; x0Var2 = x0Var2.m) {
            for (x2.p pVar : x0Var2.o.c) {
                if (pVar != null) {
                    pVar.r();
                }
            }
        }
    }

    public final void S(b2.p1 p1Var, b2.p1 p1Var2) {
        if (p1Var.p() && p1Var2.p()) {
            return;
        }
        ArrayList arrayList = this.E;
        int size = arrayList.size() - 1;
        if (size < 0) {
            Collections.sort(arrayList);
        } else {
            a1.g.z(arrayList.get(size));
            throw null;
        }
    }

    public final void V(long j10) {
        boolean z10 = this.T;
        long j11 = w0;
        if (z10) {
            this.S.getClass();
            r2 = this.X.e != 3 ? j11 : 1000L;
            for (r1 r1Var : this.a) {
                long j12 = this.m0;
                long j13 = this.n0;
                b bVar = r1Var.c;
                b bVar2 = r1Var.a;
                long g10 = r1.h(bVar2) ? bVar2.g(j12, j13) : Long.MAX_VALUE;
                if (bVar != null && bVar.n != 0) {
                    g10 = Math.min(g10, bVar.g(j12, j13));
                }
                r2 = Math.min(r2, e2.m0.h0(g10));
            }
            if (this.X.m()) {
                x0 x0Var = this.H.i;
                if ((x0Var != null ? x0Var.m : null) != null) {
                    if ((e2.m0.S(r2) * this.X.o.a) + this.m0 >= r1.e()) {
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
            k1 k1Var = this.X;
            this.X = x(g0Var, Y, k1Var.c, k1Var.d, z10, 5);
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
    public final void X(q0 q0Var) {
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
        k1 k1Var;
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
        k1 k1Var2;
        u2.g0 g0Var3;
        b2.p1 p1Var;
        long j19;
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
        Pair T = T(r0Var.X.a, q0Var, true, r0Var.f0, r0Var.g0, r0Var.v, r0Var.w);
        if (T == null) {
            Pair n10 = r0Var.n(r0Var.X.a);
            p5 = (u2.g0) n10.first;
            longValue = ((Long) n10.second).longValue();
            z10 = !r0Var.X.a.p();
            j11 = 0;
            j10 = -9223372036854775807L;
        } else {
            Object obj = T.first;
            longValue = ((Long) T.second).longValue();
            j10 = q0Var.c == -9223372036854775807L ? -9223372036854775807L : longValue;
            p5 = r0Var.H.p(r0Var.X.a, obj, longValue);
            if (p5.b()) {
                r0Var.X.a.g(p5.a, r0Var.w);
                if (r0Var.w.e(p5.b) == p5.c) {
                    r0Var.w.g.getClass();
                }
                r0Var.w.g.a(p5.b).getClass();
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
                                    if (p5.equals(r0Var.X.b)) {
                                        try {
                                            x0 x0Var = r0Var.H.i;
                                            if (x0Var == null || !x0Var.e || longValue == j11) {
                                                j14 = longValue;
                                            } else {
                                                ?? r02 = x0Var.a;
                                                long j20 = r0Var.v.m;
                                                if (r0Var.T && j20 != -9223372036854775807L) {
                                                    r0Var.S.getClass();
                                                }
                                                j14 = r02.t(longValue, r0Var.R);
                                            }
                                            if (e2.m0.h0(j14) != e2.m0.h0(r0Var.X.s) || ((i10 = (k1Var = r0Var.X).e) != 2 && i10 != 3)) {
                                                z11 = z10;
                                                g0Var = p5;
                                            }
                                            j15 = k1Var.s;
                                            i11 = 2;
                                            j16 = j15;
                                            z12 = z10;
                                            g0Var2 = p5;
                                            j17 = j10;
                                            r0Var.X = r0Var.x(g0Var2, j15, j17, j16, z12, i11);
                                        } catch (Throwable th2) {
                                            th = th2;
                                            boolean z15 = z10;
                                            g0Var = p5;
                                            z12 = z15;
                                            j13 = longValue;
                                            j12 = j10;
                                            r0Var.X = r0Var.x(g0Var, j13, j12, j13, z12, 2);
                                            throw th;
                                        }
                                    }
                                    z11 = z10;
                                    g0Var = p5;
                                    j14 = longValue;
                                    r0Var.D0(p1Var, g0Var3, p1Var, k1Var2.b, j19, true);
                                    g0Var2 = g0Var3;
                                    j17 = j19;
                                    j15 = Y;
                                    i11 = 2;
                                    j16 = j15;
                                    r0Var = this;
                                    r0Var.X = r0Var.x(g0Var2, j15, j17, j16, z12, i11);
                                } catch (Throwable th3) {
                                    th = th3;
                                    g0Var = g0Var3;
                                    j12 = j19;
                                    j13 = Y;
                                    r0Var.X = r0Var.x(g0Var, j13, j12, j13, z12, 2);
                                    throw th;
                                }
                                p1Var = k1Var2.a;
                                j19 = j10;
                            } catch (Throwable th4) {
                                th = th4;
                                g0Var = g0Var3;
                                j12 = j10;
                                j13 = Y;
                                r0Var.X = r0Var.x(g0Var, j13, j12, j13, z12, 2);
                                throw th;
                            }
                            k1Var2 = r0Var.X;
                            g0Var3 = g0Var;
                        } catch (Throwable th5) {
                            th = th5;
                        }
                        z0 z0Var = r0Var.H;
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
                        r0Var.X = r0Var.x(g0Var, j13, j12, j13, z12, 2);
                        throw th;
                    }
                    z13 = r0Var.X.e == 4;
                }
                z12 = z10;
                g0Var2 = p5;
                j15 = longValue;
                j17 = j10;
                i11 = 2;
                j16 = j15;
                r0Var = this;
                r0Var.X = r0Var.x(g0Var2, j15, j17, j16, z12, i11);
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
        z0 z0Var;
        int i10;
        w0();
        boolean z12 = true;
        E0(false, true);
        if (z11 || this.X.e == 3) {
            o0(2);
        }
        x0 x0Var = this.H.i;
        x0 x0Var2 = x0Var;
        while (x0Var2 != null && !g0Var.equals(x0Var2.g.a)) {
            x0Var2 = x0Var2.m;
        }
        if (z10 || x0Var != x0Var2 || (x0Var2 != null && x0Var2.p + j10 < 0)) {
            for (int i11 = 0; i11 < this.a.length; i11++) {
                h(i11);
            }
            this.t0 = -9223372036854775807L;
            if (x0Var2 != null) {
                while (true) {
                    z0Var = this.H;
                    if (z0Var.i == x0Var2) {
                        break;
                    }
                    z0Var.a();
                }
                z0Var.n(x0Var2);
                x0Var2.p = 1000000000000L;
                k(this.H.j.e(), new boolean[this.a.length]);
                x0Var2.h = true;
            }
        }
        g();
        if (this.T) {
            for (r1 r1Var : this.a) {
                if (r1Var.g() && ((i10 = r1Var.a.b) == 2 || i10 == 4)) {
                    this.U = true;
                    break;
                }
            }
        }
        if (x0Var2 != null) {
            this.H.n(x0Var2);
            if (!x0Var2.e) {
                x0Var2.g = x0Var2.g.b(j10, -9223372036854775807L);
            } else if (x0Var2.f) {
                if (this.T) {
                    this.S.getClass();
                    if (!this.X.a.p() && x0Var2.g.a.equals(this.X.b)) {
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
                            long j12 = this.X.s;
                            t1 t1Var = t1.e;
                            if (r10.t(j12, t1Var) == x0Var2.a.t(j10, t1Var)) {
                                z12 = false;
                            }
                        }
                    }
                }
                j10 = x0Var2.a.h(j10);
                x0Var2.a.i(j10 - this.x);
            }
            R(j10, z12);
            C();
        } else {
            this.H.b();
            R(j10, true);
        }
        t(false);
        this.n.f(2);
        return j10;
    }

    public final void Z(n1 n1Var) {
        n1Var.getClass();
        Looper looper = n1Var.e;
        Looper looper2 = this.s;
        e2.i0 i0Var = this.n;
        if (looper != looper2) {
            i0Var.b(15, n1Var).b();
            return;
        }
        f(n1Var);
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

    public final void a0(n1 n1Var) {
        Looper looper = n1Var.e;
        if (looper.getThread().isAlive()) {
            this.F.a(looper, null).d(new x8(this, n1Var));
        } else {
            e2.a.l("TAG", "Trying to send message on a dead thread.");
            n1Var.a(false);
        }
    }

    public final void b(m0 m0Var, int i10) {
        this.Y.f(1);
        j1 j1Var = this.I;
        if (i10 == -1) {
            i10 = j1Var.b.size();
        }
        u(j1Var.a(i10, m0Var.a, m0Var.b), false);
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
        x2.n nVar = (x2.n) this.d;
        if (!nVar.j.equals(fVar)) {
            nVar.j = fVar;
            nVar.k();
        }
        if (!z10) {
            fVar = null;
        }
        c2.e eVar = this.P;
        if (!Objects.equals(eVar.d, fVar)) {
            eVar.d = fVar;
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
                        a1.g.x(i11, "Unidentified audio usage: ", "AudioFocusManager");
                        break;
                    case 16:
                        i10 = 4;
                        break;
                }
                eVar.f = i10;
                u6.f("Automatic handling of audio focus is only available for USAGE_MEDIA and USAGE_GAME.", i10 != 1 || i10 == 0);
            }
            i10 = 0;
            eVar.f = i10;
            u6.f("Automatic handling of audio focus is only available for USAGE_MEDIA and USAGE_GAME.", i10 != 1 || i10 == 0);
        }
        k1 k1Var = this.X;
        boolean z11 = k1Var.l;
        B0(eVar.d(k1Var.e, z11), k1Var.n, k1Var.m, z11);
    }

    public final void c() {
        for (r1 r1Var : this.a) {
            s1 s1Var = this.T ? this.S : null;
            r1Var.a.c(18, s1Var);
            b bVar = r1Var.c;
            if (bVar != null) {
                bVar.c(18, s1Var);
            }
        }
    }

    public final void c0(boolean z10, e2.i iVar) {
        if (this.h0 != z10) {
            this.h0 = z10;
            if (!z10) {
                for (r1 r1Var : this.a) {
                    r1Var.k();
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
        for (r1 r1Var : this.a) {
            if (r1Var.f()) {
                return true;
            }
        }
        return false;
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
        O();
        W(true);
    }

    public final void e0(m0 m0Var) {
        this.Y.f(1);
        int i10 = m0Var.c;
        u2.i1 i1Var = m0Var.b;
        ArrayList arrayList = m0Var.a;
        if (i10 != -1) {
            this.l0 = new q0(new p1(arrayList, i1Var), m0Var.c, m0Var.d);
        }
        j1 j1Var = this.I;
        ArrayList arrayList2 = j1Var.b;
        j1Var.g(0, arrayList2.size());
        u(j1Var.a(arrayList2.size(), arrayList, i1Var), false);
    }

    public final void f0(boolean z10) {
        this.a0 = z10;
        Q();
        if (this.b0) {
            z0 z0Var = this.H;
            if (z0Var.j != z0Var.i) {
                W(true);
                t(false);
            }
        }
    }

    public final void g() {
        b bVar;
        if (this.O && d()) {
            for (r1 r1Var : this.a) {
                int c10 = r1Var.c();
                j jVar = this.y;
                if (r1Var.f()) {
                    int i10 = r1Var.d;
                    boolean z10 = i10 == 4 || i10 == 2;
                    int i11 = i10 != 4 ? 0 : 1;
                    if (z10) {
                        try {
                            bVar = r1Var.a;
                        } catch (RuntimeException e) {
                            e2.a.d("RendererHolder", "Disable prewarming failed.", e);
                        }
                    } else {
                        bVar = r1Var.c;
                        bVar.getClass();
                    }
                    r1Var.a(bVar, jVar);
                    try {
                        r1Var.i(z10);
                    } catch (RuntimeException e7) {
                        e2.a.d("RendererHolder", "Reset prewarming failed.", e7);
                    }
                    r1Var.d = i11;
                }
                this.k0 -= c10 - r1Var.c();
            }
            this.t0 = -9223372036854775807L;
        }
    }

    public final void g0(b2.a1 a1Var) {
        this.n.e(16);
        j jVar = this.y;
        jVar.f(a1Var);
        b2.a1 h = jVar.h();
        w(h, h.a, true, true);
    }

    public final void h(int i10) {
        r1[] r1VarArr = this.a;
        int c10 = r1VarArr[i10].c();
        r1 r1Var = r1VarArr[i10];
        b bVar = r1Var.a;
        j jVar = this.y;
        r1Var.a(bVar, jVar);
        b bVar2 = r1Var.c;
        if (bVar2 != null) {
            boolean z10 = (bVar2.n == 0 || r1Var.d == 3) ? false : true;
            r1Var.a(bVar2, jVar);
            r1Var.i(false);
            if (z10) {
                b bVar3 = r1Var.a;
                bVar2.getClass();
                bVar2.c(17, bVar3);
            }
        }
        r1Var.d = 0;
        H(i10, false);
        this.k0 -= c10;
    }

    public final void h0(p pVar) {
        this.s0 = pVar;
        b2.p1 p1Var = this.X.a;
        z0 z0Var = this.H;
        z0Var.getClass();
        pVar.getClass();
        if (z0Var.q.isEmpty()) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < z0Var.q.size(); i10++) {
            ((x0) z0Var.q.get(i10)).i();
        }
        z0Var.q = arrayList;
        z0Var.m = null;
        z0Var.k();
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        int i10;
        x0 x0Var;
        u2.g0 g0Var;
        x0 x0Var2;
        int i11;
        int i12 = MediaDataController.MAX_STYLE_RUNS_COUNT;
        try {
            switch (message.what) {
                case 1:
                    boolean z10 = message.arg1 != 0;
                    int i13 = message.arg2;
                    this.Y.f(1);
                    B0(this.P.d(this.X.e, z10), i13 >> 4, i13 & 15, z10);
                    break;
                case 2:
                    i();
                    break;
                case 3:
                    X((q0) message.obj);
                    break;
                case 4:
                    g0((b2.a1) message.obj);
                    break;
                case 5:
                    l0((t1) message.obj);
                    break;
                case 6:
                    v0(false, true);
                    break;
                case 7:
                    L((e2.i) message.obj);
                    return true;
                case 8:
                    v((u2.e0) message.obj);
                    break;
                case 9:
                    r((u2.e0) message.obj);
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
                    Z((n1) message.obj);
                    break;
                case 15:
                    a0((n1) message.obj);
                    break;
                case 16:
                    b2.a1 a1Var = (b2.a1) message.obj;
                    w(a1Var, a1Var.a, true, false);
                    break;
                case 17:
                    e0((m0) message.obj);
                    break;
                case 18:
                    b((m0) message.obj, message.arg1);
                    break;
                case 19:
                    J((n0) message.obj);
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
                    e();
                    break;
                case 26:
                    O();
                    W(true);
                    break;
                case 27:
                    z0(message.arg1, message.arg2, (List) message.obj);
                    break;
                case 28:
                    h0((p) message.obj);
                    break;
                case 29:
                    K();
                    break;
                case MessageObject.TYPE_GIFT_STARS /* 30 */:
                    Pair pair = (Pair) message.obj;
                    q0(pair.first, (e2.i) pair.second);
                    break;
                case MessageObject.TYPE_GIFT_THEME_UPDATE /* 31 */:
                    b0((b2.f) message.obj, message.arg1 != 0);
                    break;
                case 32:
                    r0(((Float) message.obj).floatValue());
                    break;
                case 33:
                    p(message.arg1);
                    break;
                case 34:
                    q();
                    break;
                case 35:
                    p0((a3.y) message.obj);
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
                case Maneuver.TYPE_DESTINATION /* 39 */:
                    d0((k0) message.obj);
                    break;
            }
        } catch (b2.x0 e) {
            boolean z11 = e.a;
            int i14 = e.b;
            if (i14 == 1) {
                i11 = z11 ? 3001 : 3003;
            } else {
                if (i14 == 4) {
                    i11 = z11 ? 3002 : 3004;
                }
                s(e, i12);
            }
            i12 = i11;
            s(e, i12);
        } catch (g2.j e7) {
            s(e7, e7.a);
        } catch (m e10) {
            e = e10;
            int i15 = e.s;
            z0 z0Var = this.H;
            if (i15 == 1 && (x0Var2 = z0Var.j) != null && e.E == null) {
                e = e.a(x0Var2.g.a);
            }
            int i16 = e.s;
            e2.i0 i0Var = this.n;
            if (i16 == 1 && (g0Var = e.E) != null && A(e.w, g0Var)) {
                this.u0 = true;
                g();
                x0 g10 = z0Var.g();
                x0 x0Var3 = z0Var.i;
                if (x0Var3 != g10) {
                    while (x0Var3 != null) {
                        x0 x0Var4 = x0Var3.m;
                        if (x0Var4 == g10) {
                            break;
                        }
                        x0Var3 = x0Var4;
                    }
                }
                z0Var.n(x0Var3);
                if (this.X.e != 4) {
                    C();
                    i0Var.f(2);
                }
            } else {
                m mVar = this.q0;
                if (mVar != null) {
                    mVar.addSuppressed(e);
                    e = this.q0;
                }
                if (e.s == 1 && z0Var.i != z0Var.j) {
                    while (true) {
                        x0Var = z0Var.i;
                        if (x0Var == z0Var.j) {
                            break;
                        }
                        z0Var.a();
                    }
                    u6.k(x0Var);
                    E();
                    y0 y0Var = x0Var.g;
                    u2.g0 g0Var2 = y0Var.a;
                    long j10 = y0Var.b;
                    this.X = x(g0Var2, j10, y0Var.d, j10, true, 0);
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
            s(e11, 2000);
        } catch (RuntimeException e12) {
            if ((e12 instanceof IllegalStateException) || (e12 instanceof IllegalArgumentException)) {
                i12 = 1004;
            }
            m mVar2 = new m(2, e12, i12);
            e2.a.d("ExoPlayerImplInternal", "Playback error", mVar2);
            v0(true, false);
            this.X = this.X.f(mVar2);
        } catch (n2.f e13) {
            s(e13, e13.a);
        } catch (u2.b e14) {
            s(e14, 1002);
        }
        E();
        return true;
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
    public final void i() {
        boolean z10;
        boolean z11;
        long j10;
        boolean z12;
        boolean z13;
        long j11;
        boolean z14;
        int i10;
        boolean z15;
        k1 k1Var;
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
        x0 x0Var = this.H.i;
        if (x0Var == null) {
            V(uptimeMillis);
            return;
        }
        Trace.beginSection("doSomeWork");
        C0();
        if (x0Var.e) {
            this.F.getClass();
            this.n0 = e2.m0.S(SystemClock.elapsedRealtime());
            x0Var.a.i(this.X.s - this.x);
            z10 = true;
            z11 = true;
            int i13 = 0;
            while (true) {
                r1[] r1VarArr = this.a;
                if (i13 >= r1VarArr.length) {
                    break;
                }
                r1 r1Var = r1VarArr[i13];
                if (r1Var.c() == 0) {
                    H(i13, false);
                } else {
                    long j12 = this.m0;
                    long j13 = this.n0;
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
                        boolean l4 = r1.h(bVar4) ? bVar4.l() : true;
                        if (bVar3 != null && bVar3.n != 0) {
                            l4 &= bVar3.l();
                        }
                        if (l4) {
                            z10 = true;
                            b d = r1Var.d(x0Var);
                            z16 = d != null || d.k() || d.m() || d.l();
                            H(i13, z16);
                            z11 = !z11 && z16;
                            if (z16) {
                                F(i13);
                            }
                        }
                    }
                    z10 = false;
                    b d10 = r1Var.d(x0Var);
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
            x0Var.a.g();
            z10 = true;
            z11 = true;
        }
        long j14 = x0Var.g.f;
        boolean z17 = z10 && x0Var.e && (j14 == -9223372036854775807L || j14 <= this.X.s);
        if (z17 && this.b0) {
            this.b0 = false;
            int i14 = this.X.n;
            this.Y.f(0);
            B0(this.P.d(this.X.e, false), i14, 5, false);
        }
        if (!z17 || !x0Var.g.k) {
            k1 k1Var2 = this.X;
            if (k1Var2.e == 2) {
                z0 z0Var = this.H;
                if (this.k0 == 0) {
                    z14 = B();
                } else if (z11) {
                    if (k1Var2.g) {
                        x0 x0Var2 = z0Var.i;
                        long j15 = t0(k1Var2.a, x0Var2.g.a) ? this.J.h : -9223372036854775807L;
                        x0 x0Var3 = z0Var.l;
                        boolean z18 = x0Var3.g() && x0Var3.g.k;
                        boolean z19 = x0Var3.g.a.b() && !x0Var3.e;
                        if (!z18 && !z19) {
                            long o10 = o(x0Var3.d());
                            t0 t0Var = this.f;
                            j2.k kVar = this.L;
                            j10 = -9223372036854775807L;
                            b2.p1 p1Var = this.X.a;
                            u2.g0 g0Var = x0Var2.g.a;
                            float f7 = this.y.h().a;
                            boolean z20 = this.X.l;
                            boolean z21 = this.c0;
                            i iVar = (i) t0Var;
                            iVar.getClass();
                            long j16 = j15;
                            b2.k0 k0Var = p1Var.m(p1Var.g(g0Var.a, iVar.b).c, iVar.a, 0L).c.b;
                            if (k0Var != null) {
                                String scheme = k0Var.a.getScheme();
                                if (TextUtils.isEmpty(scheme) || i.r.contains(scheme)) {
                                    z13 = true;
                                    long F = e2.m0.F(o10, f7);
                                    j11 = !z21 ? z13 ? iVar.k : iVar.j : z13 ? iVar.i : iVar.h;
                                    if (j16 != -9223372036854775807L) {
                                        j11 = Math.min(j16 / 2, j11);
                                    }
                                    if (j11 > 0 && F < j11) {
                                        if (!(!z13 ? iVar.m : false)) {
                                            h hVar = (h) iVar.p.get(kVar);
                                            hVar.getClass();
                                            synchronized (hVar) {
                                                i10 = hVar.d;
                                            }
                                            int i15 = i10 * iVar.c.b;
                                            h hVar2 = (h) iVar.p.get(kVar);
                                            hVar2.getClass();
                                        }
                                        z14 = false;
                                        if (z14) {
                                            o0(3);
                                            this.q0 = null;
                                            if (s0()) {
                                                E0(false, false);
                                                j jVar = this.y;
                                                z12 = true;
                                                jVar.f = true;
                                                jVar.a.d();
                                                u0();
                                                if (this.X.e == 2) {
                                                    int i16 = 0;
                                                    while (true) {
                                                        r1[] r1VarArr2 = this.a;
                                                        if (i16 >= r1VarArr2.length) {
                                                            break;
                                                        }
                                                        if (r1VarArr2[i16].d(x0Var) != null ? z12 : false) {
                                                            F(i16);
                                                        }
                                                        i16++;
                                                    }
                                                    k1 k1Var3 = this.X;
                                                    if (!k1Var3.g && k1Var3.r < 500000 && z(this.H.l) && s0()) {
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
                                                        k1Var = this.X;
                                                        if (k1Var.p != z12) {
                                                            this.X = k1Var.i(z12);
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
                                                k1Var = this.X;
                                                if (k1Var.p != z12) {
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
                            long F2 = e2.m0.F(o10, f7);
                            if (!z21) {
                            }
                            if (j16 != -9223372036854775807L) {
                            }
                            if (j11 > 0) {
                                if (!(!z13 ? iVar.m : false)) {
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
            if (this.X.e == 3 && (this.k0 != 0 ? !z11 : !B())) {
                E0(s0(), false);
                o0(2);
                if (this.c0) {
                    for (x0 x0Var4 = this.H.i; x0Var4 != null; x0Var4 = x0Var4.m) {
                        for (x2.p pVar : x0Var4.o.c) {
                            if (pVar != null) {
                                pVar.t();
                            }
                        }
                    }
                    g gVar = this.J;
                    long j17 = gVar.h;
                    if (j17 != j10) {
                        long j18 = j17 + gVar.b;
                        gVar.h = j18;
                        long j19 = gVar.g;
                        if (j19 != j10 && j18 > j19) {
                            gVar.h = j19;
                        }
                        gVar.l = j10;
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
            k1Var = this.X;
            if (k1Var.p != z12) {
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
        k1Var = this.X;
        if (k1Var.p != z12) {
        }
        this.i0 = false;
        if (!z12) {
        }
        Trace.endSection();
    }

    public final void i0(int i10) {
        this.f0 = i10;
        b2.p1 p1Var = this.X.a;
        z0 z0Var = this.H;
        z0Var.g = i10;
        int r10 = z0Var.r(p1Var);
        if ((r10 & 1) != 0) {
            W(true);
        } else if ((r10 & 2) != 0) {
            g();
        }
        t(false);
    }

    public final void j(x0 x0Var, int i10, boolean z10, long j10) {
        r1 r1Var = this.a[i10];
        boolean g10 = r1Var.g();
        b bVar = r1Var.a;
        if (g10) {
            return;
        }
        boolean z11 = x0Var == this.H.i;
        x2.t tVar = x0Var.o;
        q1 q1Var = tVar.b[i10];
        x2.p pVar = tVar.c[i10];
        boolean z12 = s0() && this.X.e == 3;
        boolean z13 = !z10 && z12;
        this.k0++;
        u2.d1 d1Var = x0Var.c[i10];
        long j11 = x0Var.p;
        u2.g0 g0Var = x0Var.g.a;
        b bVar2 = r1Var.c;
        int length = pVar != null ? pVar.length() : 0;
        b2.x[] xVarArr = new b2.x[length];
        for (int i11 = 0; i11 < length; i11++) {
            pVar.getClass();
            xVarArr[i11] = pVar.f(i11);
        }
        int i12 = r1Var.d;
        j jVar = this.y;
        if (i12 == 0 || i12 == 2 || i12 == 4) {
            r1Var.e = true;
            u6.p(bVar.n == 0);
            bVar.d = q1Var;
            bVar.G = g0Var;
            bVar.n = 1;
            bVar.o(z13, z11);
            bVar.y(xVarArr, d1Var, j10, j11, g0Var);
            bVar.z(j10, z13, true);
            jVar.c(bVar);
        } else {
            r1Var.f = true;
            bVar2.getClass();
            u6.p(bVar2.n == 0);
            bVar2.d = q1Var;
            bVar2.G = g0Var;
            bVar2.n = 1;
            bVar2.o(z13, z11);
            bVar2.y(xVarArr, d1Var, j10, j11, g0Var);
            bVar2.z(j10, z13, true);
            jVar.c(bVar2);
        }
        l0 l0Var = new l0(this);
        b d = r1Var.d(x0Var);
        d.getClass();
        d.c(11, l0Var);
        if (z12 && z11) {
            r1Var.m();
        }
    }

    public final void j0(boolean z10) {
        if (!z10) {
            q0 q0Var = this.V;
            e2.i0 i0Var = this.n;
            if (q0Var != null && this.U && !i0Var.a.hasMessages(37)) {
                this.W++;
            }
            int i10 = this.W;
            if (i10 > 0) {
                this.N.d(new ah.g(this, i10, 9));
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
        this.T = z10;
        c();
    }

    public final void k(long j10, boolean[] zArr) {
        r1[] r1VarArr;
        long j11;
        x0 x0Var = this.H.j;
        x2.t tVar = x0Var.o;
        int i10 = 0;
        while (true) {
            r1VarArr = this.a;
            if (i10 >= r1VarArr.length) {
                break;
            }
            if (!tVar.b(i10)) {
                r1VarArr[i10].k();
            }
            i10++;
        }
        int i11 = 0;
        while (i11 < r1VarArr.length) {
            if (tVar.b(i11) && r1VarArr[i11].d(x0Var) == null) {
                j11 = j10;
                j(x0Var, i11, zArr[i11], j11);
            } else {
                j11 = j10;
            }
            i11++;
            j10 = j11;
        }
    }

    public final void k0(s1 s1Var) {
        this.S = s1Var;
        c();
    }

    public final long l(b2.p1 p1Var, Object obj, long j10) {
        b2.m1 m1Var = this.w;
        int i10 = p1Var.g(obj, m1Var).c;
        b2.o1 o1Var = this.v;
        p1Var.n(i10, o1Var);
        if (o1Var.f != -9223372036854775807L && o1Var.a() && o1Var.i) {
            return e2.m0.S(e2.m0.C(o1Var.g) - o1Var.f) - (j10 + m1Var.e);
        }
        return -9223372036854775807L;
    }

    public final void l0(t1 t1Var) {
        this.R = t1Var;
    }

    public final long m(x0 x0Var) {
        if (x0Var == null) {
            return 0L;
        }
        long j10 = x0Var.p;
        if (!x0Var.e) {
            return j10;
        }
        int i10 = 0;
        while (true) {
            r1[] r1VarArr = this.a;
            if (i10 >= r1VarArr.length) {
                return j10;
            }
            if (r1VarArr[i10].d(x0Var) != null) {
                b d = r1VarArr[i10].d(x0Var);
                Objects.requireNonNull(d);
                long j11 = d.x;
                if (j11 == Long.MIN_VALUE) {
                    return Long.MIN_VALUE;
                }
                j10 = Math.max(j11, j10);
            }
            i10++;
        }
    }

    public final void m0(boolean z10) {
        this.g0 = z10;
        b2.p1 p1Var = this.X.a;
        z0 z0Var = this.H;
        z0Var.h = z10;
        int r10 = z0Var.r(p1Var);
        if ((r10 & 1) != 0) {
            W(true);
        } else if ((r10 & 2) != 0) {
            g();
        }
        t(false);
    }

    public final Pair n(b2.p1 p1Var) {
        long j10 = 0;
        if (p1Var.p()) {
            return Pair.create(k1.u, 0L);
        }
        int a2 = p1Var.a(this.g0);
        Pair i10 = p1Var.i(this.v, this.w, a2, -9223372036854775807L);
        u2.g0 p5 = this.H.p(p1Var, i10.first, 0L);
        long longValue = ((Long) i10.second).longValue();
        if (p5.b()) {
            Object obj = p5.a;
            b2.m1 m1Var = this.w;
            p1Var.g(obj, m1Var);
            if (p5.c == m1Var.e(p5.b)) {
                m1Var.g.getClass();
            }
        } else {
            j10 = longValue;
        }
        return Pair.create(p5, Long.valueOf(j10));
    }

    public final void n0(u2.i1 i1Var) {
        this.Y.f(1);
        j1 j1Var = this.I;
        int size = j1Var.b.size();
        if (i1Var.getLength() != size) {
            i1Var = i1Var.i().f(0, size);
        }
        j1Var.j = i1Var;
        u(j1Var.b(), false);
    }

    public final long o(long j10) {
        x0 x0Var = this.H.l;
        if (x0Var == null) {
            return 0L;
        }
        return Math.max(0L, j10 - (this.m0 - x0Var.p));
    }

    public final void o0(int i10) {
        k1 k1Var = this.X;
        if (k1Var.e != i10) {
            if (i10 != 2) {
                this.r0 = -9223372036854775807L;
            }
            if (i10 != 3 && k1Var.p) {
                this.X = k1Var.i(false);
            }
            this.X = this.X.h(i10);
        }
    }

    public final void p(int i10) {
        k1 k1Var = this.X;
        B0(i10, k1Var.n, k1Var.m, k1Var.l);
    }

    public final void p0(a3.y yVar) {
        for (r1 r1Var : this.a) {
            b bVar = r1Var.a;
            if (bVar.b == 2) {
                bVar.c(7, yVar);
                b bVar2 = r1Var.c;
                if (bVar2 != null) {
                    bVar2.c(7, yVar);
                }
            }
        }
    }

    public final void q() {
        r0(this.v0);
    }

    public final void q0(Object obj, e2.i iVar) {
        for (r1 r1Var : this.a) {
            b bVar = r1Var.a;
            if (bVar.b == 2) {
                int i10 = r1Var.d;
                if (i10 == 4 || i10 == 1) {
                    b bVar2 = r1Var.c;
                    bVar2.getClass();
                    bVar2.c(1, obj);
                } else {
                    bVar.c(1, obj);
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

    public final void r(u2.e0 e0Var) {
        z0 z0Var = this.H;
        x0 x0Var = z0Var.l;
        if (x0Var != null && x0Var.a == e0Var) {
            z0Var.m(this.m0);
            C();
            return;
        }
        x0 x0Var2 = z0Var.m;
        if (x0Var2 == null || x0Var2.a != e0Var) {
            return;
        }
        D();
    }

    public final void r0(float f7) {
        this.v0 = f7;
        float f10 = f7 * this.P.g;
        for (r1 r1Var : this.a) {
            b bVar = r1Var.a;
            if (bVar.b == 1) {
                bVar.c(2, Float.valueOf(f10));
                b bVar2 = r1Var.c;
                if (bVar2 != null) {
                    bVar2.c(2, Float.valueOf(f10));
                }
            }
        }
    }

    public final void s(IOException iOException, int i10) {
        m mVar = new m(0, iOException, i10);
        x0 x0Var = this.H.i;
        if (x0Var != null) {
            mVar = mVar.a(x0Var.g.a);
        }
        e2.a.d("ExoPlayerImplInternal", "Playback error", mVar);
        v0(false, false);
        this.X = this.X.f(mVar);
    }

    public final boolean s0() {
        k1 k1Var = this.X;
        return k1Var.l && k1Var.n == 0;
    }

    public final void t(boolean z10) {
        x0 x0Var = this.H.l;
        u2.g0 g0Var = x0Var == null ? this.X.b : x0Var.g.a;
        boolean equals = this.X.k.equals(g0Var);
        if (!equals) {
            this.X = this.X.c(g0Var);
        }
        k1 k1Var = this.X;
        k1Var.q = x0Var == null ? k1Var.s : x0Var.d();
        k1 k1Var2 = this.X;
        k1Var2.r = o(k1Var2.q);
        if ((!equals || z10) && x0Var != null && x0Var.e) {
            y0(x0Var.g.a, x0Var.o);
        }
    }

    public final boolean t0(b2.p1 p1Var, u2.g0 g0Var) {
        if (g0Var.b() || p1Var.p()) {
            return false;
        }
        int i10 = p1Var.g(g0Var.a, this.w).c;
        b2.o1 o1Var = this.v;
        p1Var.n(i10, o1Var);
        return o1Var.a() && o1Var.i && o1Var.f != -9223372036854775807L;
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
    public final void u(b2.p1 p1Var, boolean z10) {
        long j10;
        b2.o1 o1Var;
        Object obj;
        int i10;
        long j11;
        long j12;
        boolean z11;
        boolean z12;
        boolean z13;
        b2.m1 m1Var;
        boolean z14;
        b2.p1 p1Var2;
        b2.m1 m1Var2;
        b2.p1 p1Var3;
        long j13;
        long j14;
        long j15;
        long j16;
        long j17;
        int i11;
        p0 p0Var;
        int i12;
        long longValue;
        boolean z15;
        int i13;
        boolean z16;
        b2.m1 m1Var3;
        b2.p1 p1Var4;
        b2.p1 p1Var5;
        u2.g0 g0Var;
        boolean z17;
        b2.p1 p1Var6;
        long j18;
        int s10;
        x0 x0Var;
        z0 z0Var;
        k1 k1Var = this.X;
        q0 q0Var = this.l0;
        z0 z0Var2 = this.H;
        int i14 = this.f0;
        boolean z18 = this.g0;
        b2.o1 o1Var2 = this.v;
        b2.m1 m1Var4 = this.w;
        if (p1Var.p()) {
            u2.g0 g0Var2 = k1.u;
            boolean z19 = (g0Var2.equals(k1Var.b) && k1Var.s == 0) ? false : true;
            p0 p0Var2 = new p0(g0Var2, 0L, -9223372036854775807L, false, true, false, z19, z19 && z10 && !k1Var.a.p() && !k1Var.a.g(k1Var.b.a, m1Var4).f, 4);
            p1Var4 = p1Var;
            j15 = 0;
            p0Var = p0Var2;
            m1Var3 = m1Var4;
        } else {
            u2.g0 g0Var3 = k1Var.b;
            Object obj2 = g0Var3.a;
            b2.p1 p1Var7 = k1Var.a;
            boolean z20 = p1Var7.p() || p1Var7.g(g0Var3.a, m1Var4).f;
            long j19 = (k1Var.b.b() || z20) ? k1Var.c : k1Var.s;
            if (q0Var != null) {
                boolean z21 = true;
                j10 = 1;
                b2.p1 p1Var8 = p1Var;
                Pair T = T(p1Var8, q0Var, true, i14, z18, o1Var2, m1Var4);
                if (T == null) {
                    i13 = p1Var8.a(z18);
                    obj = obj2;
                    longValue = j19;
                    z15 = false;
                    z16 = false;
                } else {
                    if (q0Var.c == -9223372036854775807L) {
                        i13 = p1Var8.g(T.first, m1Var4).c;
                        obj = obj2;
                        longValue = j19;
                        z15 = false;
                    } else {
                        obj = T.first;
                        longValue = ((Long) T.second).longValue();
                        z15 = true;
                        i13 = -1;
                    }
                    z16 = k1Var.e == 4;
                    z21 = false;
                }
                z13 = z15;
                z12 = z21;
                z11 = z16;
                j12 = longValue;
                i10 = i13;
                o1Var = o1Var2;
                p1Var3 = p1Var8;
                m1Var2 = m1Var4;
            } else {
                j10 = 1;
                b2.p1 p1Var9 = p1Var;
                if (k1Var.a.p()) {
                    i10 = p1Var9.a(z18);
                    o1Var = o1Var2;
                    obj = obj2;
                } else if (p1Var9.b(obj2) == -1) {
                    obj = obj2;
                    int U = U(o1Var2, m1Var4, i14, z18, obj, k1Var.a, p1Var9);
                    o1Var = o1Var2;
                    b2.p1 p1Var10 = p1Var9;
                    m1Var = m1Var4;
                    if (U == -1) {
                        U = p1Var10.a(z18);
                        z14 = true;
                    } else {
                        z14 = false;
                    }
                    i10 = U;
                    z12 = z14;
                    j12 = j19;
                    z11 = false;
                    p1Var2 = p1Var10;
                    z13 = false;
                    p1Var3 = p1Var2;
                    m1Var2 = m1Var;
                } else {
                    o1Var = o1Var2;
                    obj = obj2;
                    if (j19 == -9223372036854775807L) {
                        i10 = p1Var9.g(obj, m1Var4).c;
                    } else if (z20) {
                        k1Var.a.g(g0Var3.a, m1Var4);
                        if (k1Var.a.m(m1Var4.c, o1Var, 0L).n == k1Var.a.b(g0Var3.a)) {
                            Pair i15 = p1Var9.i(o1Var, m1Var4, p1Var9.g(obj, m1Var4).c, j19 + m1Var4.e);
                            obj = i15.first;
                            j11 = ((Long) i15.second).longValue();
                        } else {
                            j11 = p1Var9.g(obj, m1Var4).d != -9223372036854775807L ? e2.m0.j(j19, 0L, m1Var4.d - 1) : j19;
                        }
                        j12 = j11;
                        i10 = -1;
                        z11 = false;
                        z12 = false;
                        z13 = true;
                        p1Var3 = p1Var9;
                        m1Var2 = m1Var4;
                    } else {
                        i10 = -1;
                    }
                }
                j12 = j19;
                z11 = false;
                z12 = false;
                p1Var2 = p1Var9;
                m1Var = m1Var4;
                z13 = false;
                p1Var3 = p1Var2;
                m1Var2 = m1Var;
            }
            if (i10 != -1) {
                Pair i16 = p1Var3.i(o1Var, m1Var2, i10, -9223372036854775807L);
                obj = i16.first;
                j12 = ((Long) i16.second).longValue();
                j13 = -9223372036854775807L;
            } else {
                j13 = j12;
            }
            u2.g0 p5 = z0Var2.p(p1Var3, obj, j12);
            int i17 = p5.e;
            boolean z22 = i17 == -1 || ((i12 = g0Var3.e) != -1 && i17 >= i12);
            boolean equals = g0Var3.a.equals(obj);
            boolean z23 = equals && !g0Var3.b() && !p5.b() && z22;
            b2.m1 g10 = p1Var3.g(obj, m1Var2);
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
                    b2.a a2 = p1Var3.g(obj, m1Var2).g.a(g0Var3.b);
                    a2.getClass();
                    long j20 = k1Var.c;
                    j15 = 0;
                    if (j20 == -9223372036854775807L || 0 > j20) {
                        int i19 = a2.a;
                        int i20 = g0Var3.c;
                        if (i19 > i20 && a2.e[i20] == 2) {
                            long j21 = p1Var3.g(obj, m1Var2).d;
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
                j16 = k1Var.s;
                j17 = j14;
                j15 = 0;
            } else {
                p1Var3.g(p5.a, m1Var2);
                if (p5.c == m1Var2.e(p5.b)) {
                    m1Var2.g.getClass();
                }
                j17 = j14;
                j15 = 0;
                j16 = 0;
            }
            boolean z24 = (p5.equals(k1Var.b) && j16 == k1Var.s) ? false : true;
            int i21 = p1Var3.b(k1Var.b.a) == -1 ? 4 : 3;
            if (p5.a.equals(k1Var.b.a) && p5.b != -1) {
                b2.a a10 = p1Var3.g(p5.a, m1Var2).g.a(p5.b);
                int i22 = p5.c;
                int[] iArr = a10.e;
                if (i22 >= iArr.length || iArr[i22] != 2) {
                    i11 = 0;
                    p0Var = new p0(p5, j16, j17, z11, z12, z13, z24, (z24 || !z10 || k1Var.a.p() || k1Var.a.g(k1Var.b.a, m1Var2).f) ? false : true, i11);
                    p1Var4 = p1Var3;
                    m1Var3 = m1Var2;
                }
            }
            i11 = i21;
            p0Var = new p0(p5, j16, j17, z11, z12, z13, z24, (z24 || !z10 || k1Var.a.p() || k1Var.a.g(k1Var.b.a, m1Var2).f) ? false : true, i11);
            p1Var4 = p1Var3;
            m1Var3 = m1Var2;
        }
        u2.g0 g0Var4 = p0Var.a;
        long j22 = p0Var.b;
        try {
            if (p0Var.e) {
                z17 = true;
                if (this.X.e != 1) {
                    o0(4);
                }
                P(false, false, false, true);
            } else {
                z17 = true;
            }
            r1[] r1VarArr = this.a;
            int length = r1VarArr.length;
            int i23 = 0;
            b2.p1 p1Var11 = m1Var3;
            while (i23 < length) {
                r1 r1Var = r1VarArr[i23];
                b bVar = r1Var.a;
                boolean equals2 = Objects.equals(bVar.F, p1Var4);
                if (equals2 == 0) {
                    bVar.F = p1Var4;
                    bVar.v();
                }
                b bVar2 = r1Var.c;
                if (bVar2 != null && !Objects.equals(bVar2.F, p1Var4)) {
                    bVar2.F = p1Var4;
                    bVar2.v();
                }
                i23++;
                p1Var11 = equals2;
            }
            try {
                if (p0Var.g) {
                    p1Var11 = p1Var4;
                    if (!p1Var11.p()) {
                        for (x0 x0Var2 = this.H.i; x0Var2 != null; x0Var2 = x0Var2.m) {
                            if (x0Var2.g.a.equals(g0Var4)) {
                                x0Var2.g = this.H.h(p1Var11, x0Var2.g);
                                x0Var2.k();
                            }
                        }
                        boolean z25 = p0Var.d;
                        try {
                            z0Var = this.H;
                            g0Var = g0Var4;
                        } catch (Throwable th2) {
                            th = th2;
                            g0Var = g0Var4;
                            p1Var6 = p1Var11;
                            p1Var5 = p1Var6;
                            k1 k1Var2 = this.X;
                            b2.p1 p1Var12 = k1Var2.a;
                            u2.g0 g0Var5 = k1Var2.b;
                            u2.g0 g0Var6 = g0Var;
                            D0(p1Var5, g0Var6, p1Var12, g0Var5, p0Var.f ? j22 : -9223372036854775807L, false);
                            if (!p0Var.g || p0Var.c != this.X.c) {
                                long j23 = p0Var.c;
                                boolean z26 = p0Var.h;
                                this.X = x(g0Var6, j22, j23, z26 ? j22 : this.X.d, z26, p0Var.i);
                            }
                            Q();
                            S(p1Var5, this.X.a);
                            this.X = this.X.j(p1Var5);
                            if (!p1Var5.p()) {
                                this.l0 = null;
                            }
                            t(false);
                            this.n.f(2);
                            throw th;
                        }
                        try {
                            j22 = Y(g0Var, j22, z0Var.i != z0Var.j ? z17 : false, z25);
                            k1 k1Var3 = this.X;
                            u2.g0 g0Var7 = g0Var;
                            D0(p1Var, g0Var7, k1Var3.a, k1Var3.b, !p0Var.f ? j22 : -9223372036854775807L, false);
                            if (!p0Var.g || p0Var.c != this.X.c) {
                                long j24 = p0Var.c;
                                boolean z27 = p0Var.h;
                                this.X = x(g0Var7, j22, j24, !z27 ? j22 : this.X.d, z27, p0Var.i);
                            }
                            Q();
                            S(p1Var, this.X.a);
                            this.X = this.X.j(p1Var);
                            if (!p1Var.p()) {
                                this.l0 = null;
                            }
                            t(false);
                            this.n.f(2);
                        } catch (Throwable th3) {
                            th = th3;
                            j22 = j22;
                            p1Var6 = p1Var11;
                            p1Var5 = p1Var6;
                            k1 k1Var22 = this.X;
                            b2.p1 p1Var122 = k1Var22.a;
                            u2.g0 g0Var52 = k1Var22.b;
                            u2.g0 g0Var62 = g0Var;
                            D0(p1Var5, g0Var62, p1Var122, g0Var52, p0Var.f ? j22 : -9223372036854775807L, false);
                            if (!p0Var.g) {
                            }
                            long j232 = p0Var.c;
                            boolean z262 = p0Var.h;
                            this.X = x(g0Var62, j22, j232, z262 ? j22 : this.X.d, z262, p0Var.i);
                            Q();
                            S(p1Var5, this.X.a);
                            this.X = this.X.j(p1Var5);
                            if (!p1Var5.p()) {
                            }
                            t(false);
                            this.n.f(2);
                            throw th;
                        }
                    }
                } else {
                    try {
                        x0 x0Var3 = this.H.j;
                        long m10 = x0Var3 == null ? j15 : m(x0Var3);
                        try {
                            try {
                                if (d() && (x0Var = this.H.k) != null) {
                                    j18 = m(x0Var);
                                    s10 = this.H.s(p1Var, this.m0, m10, j18);
                                    if ((s10 & 1) == 0) {
                                        W(false);
                                    } else if ((s10 & 2) != 0) {
                                        g();
                                    }
                                }
                                s10 = this.H.s(p1Var, this.m0, m10, j18);
                                if ((s10 & 1) == 0) {
                                }
                            } catch (Throwable th4) {
                                th = th4;
                                p1Var11 = p1Var;
                                g0Var = g0Var4;
                                p1Var6 = p1Var11;
                                p1Var5 = p1Var6;
                                k1 k1Var222 = this.X;
                                b2.p1 p1Var1222 = k1Var222.a;
                                u2.g0 g0Var522 = k1Var222.b;
                                u2.g0 g0Var622 = g0Var;
                                D0(p1Var5, g0Var622, p1Var1222, g0Var522, p0Var.f ? j22 : -9223372036854775807L, false);
                                if (!p0Var.g) {
                                }
                                long j2322 = p0Var.c;
                                boolean z2622 = p0Var.h;
                                this.X = x(g0Var622, j22, j2322, z2622 ? j22 : this.X.d, z2622, p0Var.i);
                                Q();
                                S(p1Var5, this.X.a);
                                this.X = this.X.j(p1Var5);
                                if (!p1Var5.p()) {
                                }
                                t(false);
                                this.n.f(2);
                                throw th;
                            }
                        } catch (Throwable th5) {
                            th = th5;
                            p1Var11 = p1Var;
                        }
                        j18 = j15;
                    } catch (Throwable th6) {
                        th = th6;
                        p1Var11 = p1Var4;
                    }
                }
                g0Var = g0Var4;
                k1 k1Var32 = this.X;
                u2.g0 g0Var72 = g0Var;
                D0(p1Var, g0Var72, k1Var32.a, k1Var32.b, !p0Var.f ? j22 : -9223372036854775807L, false);
                if (!p0Var.g) {
                }
                long j242 = p0Var.c;
                boolean z272 = p0Var.h;
                this.X = x(g0Var72, j22, j242, !z272 ? j22 : this.X.d, z272, p0Var.i);
                Q();
                S(p1Var, this.X.a);
                this.X = this.X.j(p1Var);
                if (!p1Var.p()) {
                }
                t(false);
                this.n.f(2);
            } catch (Throwable th7) {
                th = th7;
            }
        } catch (Throwable th8) {
            th = th8;
            p1Var5 = p1Var4;
            g0Var = g0Var4;
        }
    }

    public final void u0() {
        x0 x0Var = this.H.i;
        if (x0Var == null) {
            return;
        }
        x2.t tVar = x0Var.o;
        int i10 = 0;
        while (true) {
            r1[] r1VarArr = this.a;
            if (i10 >= r1VarArr.length) {
                return;
            }
            if (tVar.b(i10)) {
                r1VarArr[i10].m();
            }
            i10++;
        }
    }

    public final void v(u2.e0 e0Var) {
        x0 x0Var;
        z0 z0Var = this.H;
        x0 x0Var2 = z0Var.l;
        j jVar = this.y;
        if (x0Var2 != null && x0Var2.a == e0Var) {
            x0Var2.getClass();
            if (!x0Var2.e) {
                float f7 = jVar.h().a;
                k1 k1Var = this.X;
                x0Var2.f(f7, k1Var.a, k1Var.l);
            }
            y0(x0Var2.g.a, x0Var2.o);
            if (x0Var2 == z0Var.i) {
                R(x0Var2.g.b, true);
                k(z0Var.j.e(), new boolean[this.a.length]);
                x0Var2.h = true;
                k1 k1Var2 = this.X;
                u2.g0 g0Var = k1Var2.b;
                long j10 = x0Var2.g.b;
                this.X = x(g0Var, j10, k1Var2.c, j10, false, 5);
            }
            C();
            return;
        }
        int i10 = 0;
        while (true) {
            if (i10 >= z0Var.q.size()) {
                x0Var = null;
                break;
            }
            x0Var = (x0) z0Var.q.get(i10);
            if (x0Var.a == e0Var) {
                break;
            } else {
                i10++;
            }
        }
        if (x0Var != null) {
            u6.p(true ^ x0Var.e);
            float f10 = jVar.h().a;
            k1 k1Var3 = this.X;
            x0Var.f(f10, k1Var3.a, k1Var3.l);
            x0 x0Var3 = z0Var.m;
            if (x0Var3 == null || x0Var3.a != e0Var) {
                return;
            }
            D();
        }
    }

    public final void v0(boolean z10, boolean z11) {
        P(z10 || !this.h0, false, true, false);
        this.Y.f(z11 ? 1 : 0);
        i iVar = (i) this.f;
        ConcurrentHashMap concurrentHashMap = iVar.p;
        j2.k kVar = this.L;
        h hVar = (h) concurrentHashMap.get(kVar);
        if (hVar != null) {
            int i10 = hVar.a - 1;
            hVar.a = i10;
            if (i10 == 0) {
                concurrentHashMap.remove(kVar);
                iVar.c();
            }
        }
        this.P.d(1, this.X.l);
        o0(1);
    }

    public final void w(b2.a1 a1Var, float f7, boolean z10, boolean z11) {
        int i10;
        if (z10) {
            if (z11) {
                this.Y.f(1);
            }
            this.X = this.X.g(a1Var);
        }
        float f10 = a1Var.a;
        x0 x0Var = this.H.i;
        while (true) {
            i10 = 0;
            if (x0Var == null) {
                break;
            }
            x2.p[] pVarArr = x0Var.o.c;
            int length = pVarArr.length;
            while (i10 < length) {
                x2.p pVar = pVarArr[i10];
                if (pVar != null) {
                    pVar.p(f10);
                }
                i10++;
            }
            x0Var = x0Var.m;
        }
        r1[] r1VarArr = this.a;
        int length2 = r1VarArr.length;
        while (i10 < length2) {
            r1 r1Var = r1VarArr[i10];
            float f11 = a1Var.a;
            r1Var.a.A(f7, f11);
            b bVar = r1Var.c;
            if (bVar != null) {
                bVar.A(f7, f11);
            }
            i10++;
        }
    }

    public final void w0() {
        j jVar = this.y;
        jVar.f = false;
        u1 u1Var = jVar.a;
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

    public final k1 x(u2.g0 g0Var, long j10, long j11, long j12, boolean z10, int i10) {
        x1 x1Var;
        boolean z11;
        this.p0 = (!this.p0 && j10 == this.X.s && g0Var.equals(this.X.b)) ? false : true;
        Q();
        k1 k1Var = this.X;
        u2.r1 r1Var = k1Var.h;
        x2.t tVar = k1Var.i;
        List list = k1Var.j;
        if (this.I.k) {
            x0 x0Var = this.H.i;
            r1Var = x0Var == null ? u2.r1.d : x0Var.n;
            tVar = x0Var == null ? this.e : x0Var.o;
            x2.p[] pVarArr = tVar.c;
            e9.k0 k0Var = new e9.k0(4);
            boolean z12 = false;
            for (x2.p pVar : pVarArr) {
                if (pVar != null) {
                    b2.u0 u0Var = pVar.f(0).l;
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
            if (x0Var != null) {
                y0 y0Var = x0Var.g;
                if (y0Var.d != j11) {
                    x0Var.g = y0Var.a(j11);
                }
            }
            r1[] r1VarArr = this.a;
            z0 z0Var = this.H;
            x0 x0Var2 = z0Var.i;
            if (x0Var2 == z0Var.j && x0Var2 != null) {
                x2.t tVar2 = x0Var2.o;
                int i11 = 0;
                boolean z13 = false;
                while (true) {
                    if (i11 >= r1VarArr.length) {
                        z11 = true;
                        break;
                    }
                    if (tVar2.b(i11)) {
                        if (r1VarArr[i11].a.b != 1) {
                            z11 = false;
                            break;
                        }
                        if (tVar2.b[i11].a != 0) {
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
        } else if (!g0Var.equals(k1Var.b)) {
            r1Var = u2.r1.d;
            tVar = this.e;
            list = x1.e;
        }
        u2.r1 r1Var2 = r1Var;
        x2.t tVar3 = tVar;
        List list2 = list;
        if (z10) {
            o0 o0Var = this.Y;
            if (!o0Var.d || o0Var.e == 5) {
                o0Var.c = true;
                o0Var.d = true;
                o0Var.e = i10;
            } else {
                u6.g(i10 == 5);
            }
        }
        k1 k1Var2 = this.X;
        return k1Var2.d(g0Var, j10, j11, j12, o(k1Var2.q), r1Var2, tVar3, list2);
    }

    /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, u2.f1] */
    public final void x0() {
        x0 x0Var = this.H.l;
        boolean z10 = this.e0 || (x0Var != null && x0Var.a.c());
        k1 k1Var = this.X;
        if (z10 != k1Var.g) {
            this.X = k1Var.b(z10);
        }
    }

    @Override // u2.d0
    public final void y(u2.e0 e0Var) {
        this.n.b(8, e0Var).b();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00c3 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void y0(u2.g0 g0Var, x2.t tVar) {
        boolean z10;
        int length;
        int i10;
        x0 x0Var = this.H.l;
        x0Var.getClass();
        o(x0Var.d());
        if (t0(this.X.a, x0Var.g.a)) {
            long j10 = this.J.h;
        }
        b2.p1 p1Var = this.X.a;
        float f7 = this.y.h().a;
        boolean z11 = this.X.l;
        x2.p[] pVarArr = tVar.c;
        i iVar = (i) this.f;
        iVar.getClass();
        e9.q0 q0Var = iVar.o;
        j2.k kVar = this.L;
        Integer num = (Integer) q0Var.get(kVar.a);
        int intValue = (num == null || num.intValue() == -1) ? iVar.l : num.intValue();
        h hVar = (h) iVar.p.get(kVar);
        hVar.getClass();
        if (intValue == -1) {
            b2.k0 k0Var = p1Var.m(p1Var.g(g0Var.a, iVar.b).c, iVar.a, 0L).c.b;
            if (k0Var != null) {
                String scheme = k0Var.a.getScheme();
                if (TextUtils.isEmpty(scheme) || i.r.contains(scheme)) {
                    z10 = true;
                    length = pVarArr.length;
                    i10 = 0;
                    int i11 = 0;
                    while (true) {
                        int i12 = 13107200;
                        if (i10 >= length) {
                            x2.p pVar = pVarArr[i10];
                            if (pVar != null) {
                                switch (pVar.b().c) {
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
                            intValue = e2.m0.i(i11, 13107200, 210239488);
                        }
                    }
                }
            }
            z10 = false;
            length = pVarArr.length;
            i10 = 0;
            int i112 = 0;
            while (true) {
                int i122 = 13107200;
                if (i10 >= length) {
                }
                i10++;
            }
        }
        hVar.c = intValue;
        iVar.c();
    }

    public final void z0(int i10, int i11, List list) {
        this.Y.f(1);
        j1 j1Var = this.I;
        j1Var.getClass();
        ArrayList arrayList = j1Var.b;
        u6.g(i10 >= 0 && i10 <= i11 && i11 <= arrayList.size());
        u6.g(list.size() == i11 - i10);
        for (int i12 = i10; i12 < i11; i12++) {
            ((i1) arrayList.get(i12)).a.t((b2.p0) list.get(i12 - i10));
        }
        u(j1Var.b(), false);
    }
}
