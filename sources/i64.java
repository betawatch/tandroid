// default package

import android.content.Context;
import android.media.MediaFormat;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.os.Trace;
import android.text.TextUtils;
import android.util.Pair;
import j$.util.Objects;
import j$.util.concurrent.ConcurrentHashMap;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
public final class i64 implements Handler.Callback, rr6, sac {
    public static final long x0 = g8c.i0(10000);
    public final ArrayList E;
    public final adb F;
    public final o54 G;
    public final vr6 H;
    public final ey6 I;
    public final jb3 J;
    public final short K;
    public final uc8 L;
    public final boolean M;
    public final l93 N;
    public final cdb O;
    public final boolean P;
    public final c00 Q;
    public boolean R;
    public gv9 S;
    public mr9 T;
    public boolean U;
    public boolean V;
    public h64 W;
    public int X;
    public yb8 Y;
    public f64 Z;
    public final e79[] a;
    public boolean a0;
    public final ug0[] b;
    public boolean b0;
    public final boolean[] c;
    public boolean c0;
    public final sc3 d;
    public boolean d0;
    public final cyb e;
    public long e0;
    public final lb3 f;
    public boolean f0;
    public int g0;
    public final cdb h;
    public boolean h0;
    public boolean i0;
    public boolean j0;
    public boolean k0;
    public int l0;
    public h64 m0;
    public final igf n;
    public long n0;
    public long o0;
    public int p0;
    public boolean q0;
    public final Looper r;
    public j54 r0;
    public final znb s;
    public long s0;
    public l54 t0;
    public long u0;
    public boolean v0;
    public final xnb w;
    public float w0;
    public final long x;
    public final mb3 y;

    /* JADX WARN: Type inference failed for: r9v5, types: [int, short] */
    public i64(Context context, ug0[] ug0VarArr, ug0[] ug0VarArr2, sc3 sc3Var, cyb cybVar, lb3 lb3Var, s93 s93Var, int i, boolean z, l93 l93Var, gv9 gv9Var, jb3 jb3Var, long j, boolean z2, Looper looper, adb adbVar, o54 o54Var, uc8 uc8Var, final sac sacVar, boolean z3) {
        l54 l54Var = l54.a;
        this.u0 = -9223372036854775807L;
        this.G = o54Var;
        this.d = sc3Var;
        this.e = cybVar;
        this.f = lb3Var;
        this.g0 = i;
        this.h0 = z;
        this.S = gv9Var;
        this.J = jb3Var;
        this.K = (int) j;
        this.b0 = false;
        this.M = z2;
        this.F = adbVar;
        this.L = uc8Var;
        this.t0 = l54Var;
        this.N = l93Var;
        this.w0 = 1.0f;
        this.T = mr9.b;
        this.R = z3;
        this.s0 = -9223372036854775807L;
        this.e0 = -9223372036854775807L;
        this.x = lb3Var.m;
        wnb wnbVar = aob.a;
        yb8 k = yb8.k(cybVar);
        this.Y = k;
        this.Z = new f64(k);
        this.b = new ug0[ug0VarArr.length];
        this.c = new boolean[ug0VarArr.length];
        sc3Var.getClass();
        this.a = new e79[ug0VarArr.length];
        boolean z4 = false;
        for (int i2 = 0; i2 < ug0VarArr.length; i2++) {
            ug0 ug0Var = ug0VarArr[i2];
            ug0Var.e = i2;
            ug0Var.f = uc8Var;
            ug0Var.h = adbVar;
            this.b[i2] = ug0Var;
            ug0 ug0Var2 = this.b[i2];
            synchronized (ug0Var2.a) {
                ug0Var2.J = sc3Var;
            }
            ug0 ug0Var3 = ug0VarArr2[i2];
            if (ug0Var3 != null) {
                ug0Var3.e = i2;
                ug0Var3.f = uc8Var;
                ug0Var3.h = adbVar;
                z4 = true;
            }
            this.a[i2] = new e79(ug0VarArr[i2], ug0Var3, i2);
        }
        this.P = z4;
        this.y = new mb3(this, adbVar);
        this.E = new ArrayList();
        this.s = new znb();
        this.w = new xnb();
        gre.p(sc3Var.a == null);
        sc3Var.a = this;
        sc3Var.b = s93Var;
        sc3Var.g = sc3Var.f;
        this.q0 = true;
        cdb a = adbVar.a(looper, null);
        this.O = a;
        this.H = new vr6(l93Var, a, new kx3(this, (byte) 12), ug0VarArr.length);
        this.I = new ey6(this, l93Var, a, uc8Var, s93Var);
        igf igfVar = new igf((byte) 2);
        this.n = igfVar;
        Looper p = igfVar.p();
        this.r = p;
        cdb a2 = adbVar.a(p, this);
        this.h = a2;
        this.Q = new c00(context, p, this);
        a2.c(35, new sac() { // from class: a64
            @Override // sac
            public final void c(long j2, long j3, fm4 fm4Var, MediaFormat mediaFormat) {
                sacVar.c(j2, j3, fm4Var, mediaFormat);
                i64.this.c(j2, j3, fm4Var, mediaFormat);
            }
        }).b();
        a2.c(39, new b64(this)).b();
    }

    public static Pair S(aob aobVar, h64 h64Var, boolean z, int i, boolean z2, znb znbVar, xnb xnbVar) {
        int T;
        aob aobVar2 = h64Var.a;
        if (aobVar.p()) {
            return null;
        }
        aob aobVar3 = aobVar2.p() ? aobVar : aobVar2;
        try {
            Pair i2 = aobVar3.i(znbVar, xnbVar, h64Var.b, h64Var.c);
            if (!aobVar.equals(aobVar3)) {
                if (aobVar.b(i2.first) == -1) {
                    if (!z || (T = T(znbVar, xnbVar, i, z2, i2.first, aobVar3, aobVar)) == -1) {
                        return null;
                    }
                    return aobVar.i(znbVar, xnbVar, T, -9223372036854775807L);
                }
                if (aobVar3.g(i2.first, xnbVar).f && aobVar3.m(xnbVar.c, znbVar, 0L).m == aobVar3.b(i2.first)) {
                    return aobVar.i(znbVar, xnbVar, aobVar.g(i2.first, xnbVar).c, h64Var.c);
                }
            }
            return i2;
        } catch (IndexOutOfBoundsException unused) {
            return null;
        }
    }

    public static int T(znb znbVar, xnb xnbVar, int i, boolean z, Object obj, aob aobVar, aob aobVar2) {
        znb znbVar2 = znbVar;
        aob aobVar3 = aobVar;
        Object obj2 = aobVar3.m(aobVar3.g(obj, xnbVar).c, znbVar, 0L).a;
        for (int i2 = 0; i2 < aobVar2.o(); i2++) {
            if (aobVar2.m(i2, znbVar, 0L).a.equals(obj2)) {
                return i2;
            }
        }
        int b = aobVar3.b(obj);
        int h = aobVar3.h();
        int i3 = -1;
        int i4 = 0;
        while (i4 < h && i3 == -1) {
            aob aobVar4 = aobVar3;
            int d = aobVar4.d(b, xnbVar, znbVar2, i, z);
            if (d == -1) {
                break;
            }
            i3 = aobVar2.b(aobVar4.l(d));
            i4++;
            aobVar3 = aobVar4;
            b = d;
            znbVar2 = znbVar;
        }
        if (i3 == -1) {
            return -1;
        }
        return aobVar2.f(i3, xnbVar, false).c;
    }

    public static boolean y(tr6 tr6Var) {
        if (tr6Var != null) {
            try {
                ej6 ej6Var = tr6Var.a;
                if (tr6Var.e) {
                    for (ip9 ip9Var : tr6Var.c) {
                        if (ip9Var != null) {
                            ip9Var.b();
                        }
                    }
                } else {
                    ej6Var.k();
                }
                if ((!tr6Var.e ? 0L : ej6Var.g()) != Long.MIN_VALUE) {
                    return true;
                }
            } catch (IOException unused) {
            }
        }
        return false;
    }

    public final boolean A(int i, rx6 rx6Var) {
        vr6 vr6Var = this.H;
        tr6 tr6Var = vr6Var.k[i];
        if (tr6Var == null || !tr6Var.g.a.equals(rx6Var)) {
            return false;
        }
        return this.a[i].h(vr6Var.k[i]);
    }

    public final void A0(int i, int i2, int i3, boolean z) {
        boolean z2 = z && i != -1;
        if (i == -1) {
            i3 = 2;
        } else if (i3 == 2) {
            i3 = 1;
        }
        boolean z3 = this.U;
        if (i == 0) {
            i2 = 1;
        } else if (i2 == 1) {
            i2 = z3 ? 4 : 0;
        }
        yb8 yb8Var = this.Y;
        if (yb8Var.l == z2 && yb8Var.n == i2 && yb8Var.m == i3) {
            return;
        }
        this.Y = yb8Var.e(i3, i2, z2);
        D0(false, false);
        vr6 vr6Var = this.H;
        for (tr6 tr6Var = vr6Var.i; tr6Var != null; tr6Var = tr6Var.m) {
            for (k64 k64Var : (k64[]) tr6Var.o.d) {
                if (k64Var != null) {
                    k64Var.h(z2);
                }
            }
        }
        if (!s0()) {
            w0();
            B0();
            yb8 yb8Var2 = this.Y;
            if (yb8Var2.p) {
                this.Y = yb8Var2.i(false);
            }
            vr6Var.r(this.n0);
            return;
        }
        int i4 = this.Y.e;
        cdb cdbVar = this.h;
        if (i4 != 3) {
            if (i4 == 2) {
                cdbVar.h(2);
            }
        } else {
            mb3 mb3Var = this.y;
            mb3Var.b = true;
            ((ie2) mb3Var.c).c();
            u0();
            cdbVar.h(2);
        }
    }

    public final boolean B() {
        tr6 tr6Var = this.H.i;
        long j = tr6Var.g.e;
        if (tr6Var.e) {
            return j == -9223372036854775807L || this.Y.s < j || !s0();
        }
        return false;
    }

    public final void B0() {
        long j;
        float f;
        long j2;
        tr6 tr6Var = this.H.i;
        if (tr6Var != null) {
            long o = tr6Var.e ? tr6Var.a.o() : -9223372036854775807L;
            if (o != -9223372036854775807L) {
                if (!tr6Var.g()) {
                    this.H.s(tr6Var);
                    g();
                    t(false);
                    C();
                }
                Q(o, true);
                if (o != this.Y.s) {
                    yb8 yb8Var = this.Y;
                    this.Y = x(yb8Var.b, o, yb8Var.c, o, true, 5);
                }
            } else {
                mb3 mb3Var = this.y;
                boolean z = z();
                ie2 ie2Var = (ie2) mb3Var.c;
                ug0 ug0Var = (ug0) mb3Var.e;
                if (ug0Var == null || ug0Var.n() || ((z && ((ug0) mb3Var.e).n != 2) || (!((ug0) mb3Var.e).o() && (z || ((ug0) mb3Var.e).m())))) {
                    mb3Var.a = true;
                    if (mb3Var.b) {
                        ie2Var.c();
                    }
                } else {
                    ck6 ck6Var = (ck6) mb3Var.f;
                    ck6Var.getClass();
                    long h = ck6Var.h();
                    if (mb3Var.a) {
                        if (h >= ie2Var.h()) {
                            mb3Var.a = false;
                            if (mb3Var.b) {
                                ie2Var.c();
                            }
                        } else if (ie2Var.c) {
                            ie2Var.a(ie2Var.h());
                            ie2Var.c = false;
                        }
                    }
                    ie2Var.a(h);
                    zb8 g = ck6Var.g();
                    if (!g.equals((zb8) ie2Var.e)) {
                        ie2Var.b(g);
                        ((i64) mb3Var.d).h.c(16, g).b();
                    }
                }
                long h2 = mb3Var.h();
                this.n0 = h2;
                long j3 = h2 - tr6Var.p;
                long j4 = this.Y.s;
                if (!this.E.isEmpty() && !this.Y.b.c()) {
                    if (this.q0) {
                        this.q0 = false;
                    }
                    yb8 yb8Var2 = this.Y;
                    yb8Var2.a.b(yb8Var2.b.a);
                    int min = Math.min(this.p0, this.E.size());
                    if (min > 0 && this.E.get(min - 1) != null) {
                        fyb.g();
                        return;
                    } else {
                        if (min < this.E.size() && this.E.get(min) != null) {
                            fyb.g();
                            return;
                        }
                        this.p0 = min;
                    }
                }
                if (this.y.i()) {
                    boolean z2 = !this.Z.d;
                    yb8 yb8Var3 = this.Y;
                    this.Y = x(yb8Var3.b, j3, yb8Var3.c, j3, z2, 6);
                } else {
                    yb8 yb8Var4 = this.Y;
                    yb8Var4.s = j3;
                    yb8Var4.t = SystemClock.elapsedRealtime();
                }
            }
            this.Y.q = this.H.l.d();
            yb8 yb8Var5 = this.Y;
            yb8Var5.r = o(yb8Var5.q);
            yb8 yb8Var6 = this.Y;
            if (yb8Var6.l && yb8Var6.e == 3 && t0(yb8Var6.a, yb8Var6.b)) {
                yb8 yb8Var7 = this.Y;
                float f2 = 1.0f;
                if (yb8Var7.o.a == 1.0f) {
                    jb3 jb3Var = this.J;
                    long l = l(yb8Var7.a, yb8Var7.b.a, yb8Var7.s);
                    long j5 = this.Y.r;
                    if (jb3Var.c != -9223372036854775807L) {
                        long j6 = l - j5;
                        long j7 = jb3Var.m;
                        if (j7 == -9223372036854775807L) {
                            jb3Var.m = j6;
                            jb3Var.n = 0L;
                        } else {
                            jb3Var.m = Math.max(j6, (long) ((j6 * 9.999871E-4f) + (j7 * 0.999f)));
                            jb3Var.n = (long) ((9.999871E-4f * Math.abs(j6 - r9)) + (jb3Var.n * 0.999f));
                        }
                        if (jb3Var.l != -9223372036854775807L) {
                            j = 1000;
                            if (SystemClock.elapsedRealtime() - jb3Var.l < 1000) {
                                f2 = jb3Var.k;
                            }
                        } else {
                            j = 1000;
                        }
                        jb3Var.l = SystemClock.elapsedRealtime();
                        long j8 = (jb3Var.n * 3) + jb3Var.m;
                        if (jb3Var.h > j8) {
                            float T = g8c.T(j);
                            f = 1.0E-7f;
                            long[] jArr = {j8, jb3Var.e, jb3Var.h - (((long) ((jb3Var.k - 1.0f) * T)) + ((long) ((jb3Var.i - 1.0f) * T)))};
                            j2 = jArr[0];
                            for (int i = 1; i < 3; i++) {
                                long j9 = jArr[i];
                                if (j9 > j2) {
                                    j2 = j9;
                                }
                            }
                            jb3Var.h = j2;
                        } else {
                            f = 1.0E-7f;
                            j2 = g8c.j(l - ((long) (Math.max(0.0f, jb3Var.k - 1.0f) / 1.0E-7f)), jb3Var.h, j8);
                            jb3Var.h = j2;
                            long j10 = jb3Var.g;
                            if (j10 != -9223372036854775807L && j2 > j10) {
                                jb3Var.h = j10;
                                j2 = j10;
                            }
                        }
                        long j11 = l - j2;
                        if (Math.abs(j11) < jb3Var.a) {
                            jb3Var.k = 1.0f;
                        } else {
                            f2 = g8c.h((f * j11) + 1.0f, jb3Var.j, jb3Var.i);
                            jb3Var.k = f2;
                        }
                    }
                    if (this.y.g().a != f2) {
                        zb8 zb8Var = new zb8(f2, this.Y.o.b);
                        this.h.g(16);
                        this.y.b(zb8Var);
                        w(this.Y.o, this.y.g().a, false, false);
                    }
                }
            }
        }
    }

    public final void C() {
        boolean c;
        if (y(this.H.l)) {
            tr6 tr6Var = this.H.l;
            long o = o(!tr6Var.e ? 0L : tr6Var.a.g());
            tr6 tr6Var2 = this.H.i;
            long j = t0(this.Y.a, tr6Var.g.a) ? this.J.h : -9223372036854775807L;
            uc8 uc8Var = this.L;
            aob aobVar = this.Y.a;
            rx6 rx6Var = tr6Var.g.a;
            float f = this.y.g().a;
            boolean z = this.Y.l;
            b86 b86Var = new b86(uc8Var, aobVar, rx6Var, o, f, this.d0, j);
            c = this.f.c(b86Var);
            tr6 tr6Var3 = this.H.i;
            if (!c && tr6Var3.e && o < 500000 && this.x > 0) {
                tr6Var3.a.m(this.Y.s);
                c = this.f.c(b86Var);
            }
        } else {
            c = false;
        }
        this.f0 = c;
        if (c) {
            tr6 tr6Var4 = this.H.l;
            tr6Var4.getClass();
            s86 s86Var = new s86();
            s86Var.a = this.n0 - tr6Var4.p;
            float f2 = this.y.g().a;
            gre.f(f2 > 0.0f || f2 == -3.4028235E38f);
            s86Var.b = f2;
            long j2 = this.e0;
            gre.f(j2 >= 0 || j2 == -9223372036854775807L);
            s86Var.c = j2;
            t86 t86Var = new t86(s86Var);
            gre.p(tr6Var4.m == null);
            tr6Var4.a.r(t86Var);
        }
        x0();
    }

    public final void C0(aob aobVar, rx6 rx6Var, aob aobVar2, rx6 rx6Var2, long j, boolean z) {
        boolean t0 = t0(aobVar, rx6Var);
        Object obj = rx6Var.a;
        if (!t0) {
            zb8 zb8Var = rx6Var.c() ? zb8.d : this.Y.o;
            mb3 mb3Var = this.y;
            if (mb3Var.g().equals(zb8Var)) {
                return;
            }
            this.h.g(16);
            mb3Var.b(zb8Var);
            w(this.Y.o, zb8Var.a, false, false);
            return;
        }
        xnb xnbVar = this.w;
        int i = aobVar.g(obj, xnbVar).c;
        znb znbVar = this.s;
        aobVar.n(i, znbVar);
        wq6 wq6Var = znbVar.i;
        String str = g8c.a;
        jb3 jb3Var = this.J;
        jb3Var.getClass();
        jb3Var.c = g8c.T(wq6Var.a);
        jb3Var.f = g8c.T(wq6Var.b);
        jb3Var.g = g8c.T(wq6Var.c);
        float f = wq6Var.d;
        if (f == -3.4028235E38f) {
            f = 0.97f;
        }
        jb3Var.j = f;
        float f2 = wq6Var.e;
        if (f2 == -3.4028235E38f) {
            f2 = 1.03f;
        }
        jb3Var.i = f2;
        if (f == 1.0f && f2 == 1.0f) {
            jb3Var.c = -9223372036854775807L;
        }
        jb3Var.a();
        if (j != -9223372036854775807L) {
            jb3Var.d = l(aobVar, obj, j);
            jb3Var.a();
            return;
        }
        if (!Objects.equals(!aobVar2.p() ? aobVar2.m(aobVar2.g(rx6Var2.a, xnbVar).c, znbVar, 0L).a : null, znbVar.a) || z) {
            jb3Var.d = -9223372036854775807L;
            jb3Var.a();
        }
    }

    public final void D() {
        vr6 vr6Var = this.H;
        vr6Var.p();
        tr6 tr6Var = vr6Var.m;
        if (tr6Var != null) {
            ej6 ej6Var = tr6Var.a;
            if ((!tr6Var.d || tr6Var.e) && !ej6Var.d()) {
                aob aobVar = this.Y.a;
                if (tr6Var.e) {
                    ej6Var.s();
                }
                Iterator it = this.f.o.values().iterator();
                while (it.hasNext()) {
                    if (((kb3) it.next()).b) {
                        return;
                    }
                }
                if (!tr6Var.d) {
                    long j = tr6Var.g.b;
                    tr6Var.d = true;
                    ej6Var.p(this, j);
                    return;
                }
                s86 s86Var = new s86();
                s86Var.a = this.n0 - tr6Var.p;
                float f = this.y.g().a;
                gre.f(f > 0.0f || f == -3.4028235E38f);
                s86Var.b = f;
                long j2 = this.e0;
                gre.f(j2 >= 0 || j2 == -9223372036854775807L);
                s86Var.c = j2;
                t86 t86Var = new t86(s86Var);
                gre.p(tr6Var.m == null);
                ej6Var.r(t86Var);
            }
        }
    }

    public final void D0(boolean z, boolean z2) {
        long j;
        this.d0 = z;
        if (!z || z2) {
            j = -9223372036854775807L;
        } else {
            this.F.getClass();
            j = SystemClock.elapsedRealtime();
        }
        this.e0 = j;
    }

    public final void E(int i) {
        f64 f64Var = this.Z;
        yb8 yb8Var = this.Y;
        boolean z = f64Var.a | (f64Var.b != yb8Var);
        f64Var.a = z;
        f64Var.b = yb8Var;
        if (z) {
            if (!yb8Var.a.p()) {
                yb8 yb8Var2 = this.Y;
                boolean z2 = yb8Var2.a.b(yb8Var2.b.a) != -1;
                Locale locale = Locale.US;
                yb8 yb8Var3 = this.Y;
                gre.o(String.format(locale, "periodUid %s not found in timeline %s with size %d triggered by msg %d", yb8Var3.b.a, yb8Var3.a.getClass().getName(), Integer.valueOf(this.Y.a.o()), Integer.valueOf(i)), z2);
            }
            f64 f64Var2 = this.Z;
            y54 y54Var = this.G.b;
            y54Var.j.e(new eu3(y54Var, f64Var2, (byte) 12));
            this.Z = new f64(this.Y);
        }
    }

    public final void F(int i) {
        e79 e79Var = this.a[i];
        try {
            tr6 tr6Var = this.H.i;
            tr6Var.getClass();
            ug0 d = e79Var.d(tr6Var);
            d.getClass();
            ip9 ip9Var = d.r;
            ip9Var.getClass();
            ip9Var.b();
        } catch (IOException | RuntimeException e) {
            byte b = e79Var.a.b;
            if (b != 3 && b != 5) {
                throw e;
            }
            cyb cybVar = this.H.i.o;
            lad.d("ExoPlayerImplInternal", "Disabling track due to error: ".concat(fm4.c(((k64[]) cybVar.d)[i].o())), e);
            cyb cybVar2 = new cyb((d79[]) ((d79[]) cybVar.c).clone(), (k64[]) ((k64[]) cybVar.d).clone(), (eyb) cybVar.e, (ko) cybVar.f);
            ((d79[]) cybVar2.c)[i] = null;
            ((k64[]) cybVar2.d)[i] = null;
            h(i);
            tr6 tr6Var2 = this.H.i;
            tr6Var2.a(cybVar2, this.Y.s, false, new boolean[tr6Var2.j.length]);
        }
    }

    public final void G(int i, boolean z) {
        boolean[] zArr = this.c;
        if (zArr[i] != z) {
            zArr[i] = z;
            this.O.e(new z54((Object) this, i, z, (byte) 0));
        }
    }

    public final void H() {
        u(this.I.b(), true);
    }

    public final void I(e64 e64Var) {
        aob b;
        this.Z.a(1);
        int i = e64Var.a;
        int i2 = e64Var.b;
        int i3 = e64Var.c;
        wga wgaVar = e64Var.d;
        ey6 ey6Var = this.I;
        ArrayList arrayList = ey6Var.c;
        gre.f(i >= 0 && i <= i2 && i2 <= arrayList.size() && i3 >= 0);
        ey6Var.k = wgaVar;
        if (i == i2 || i == i3) {
            b = ey6Var.b();
        } else {
            int min = Math.min(i, i3);
            int max = Math.max(((i2 - i) + i3) - 1, i2 - 1);
            int i4 = ((dy6) arrayList.get(min)).d;
            g8c.S(i, i2, i3, arrayList);
            while (min <= max) {
                dy6 dy6Var = (dy6) arrayList.get(min);
                dy6Var.d = i4;
                i4 += dy6Var.a.o.e.o();
                min++;
            }
            b = ey6Var.b();
        }
        u(b, false);
    }

    public final void J() {
        this.Z.a(1);
        O(false, false, false, true);
        lb3 lb3Var = this.f;
        ConcurrentHashMap concurrentHashMap = lb3Var.o;
        long id = Thread.currentThread().getId();
        long j = lb3Var.p;
        gre.o("Players that share the same LoadControl must share the same playback thread. See ExoPlayer.Builder.setPlaybackLooper(Looper).", j == -1 || j == id);
        lb3Var.p = id;
        uc8 uc8Var = this.L;
        kb3 kb3Var = (kb3) concurrentHashMap.get(uc8Var);
        if (kb3Var == null) {
            kb3 kb3Var2 = new kb3();
            kb3Var2.a = 1;
            concurrentHashMap.put(uc8Var, kb3Var2);
        } else {
            kb3Var.a++;
        }
        kb3 kb3Var3 = (kb3) concurrentHashMap.get(uc8Var);
        kb3Var3.getClass();
        Integer num = (Integer) lb3Var.n.get(uc8Var.a);
        int intValue = (num == null || num.intValue() == -1) ? -1 : num.intValue();
        if (intValue == -1) {
            intValue = 13107200;
        }
        kb3Var3.c = intValue;
        kb3Var3.b = false;
        o0(this.Y.a.p() ? 4 : 2);
        yb8 yb8Var = this.Y;
        boolean z = yb8Var.l;
        A0(this.Q.c(yb8Var.e, z), yb8Var.n, yb8Var.m, z);
        ey6 ey6Var = this.I;
        ArrayList arrayList = ey6Var.c;
        gre.p(!ey6Var.l);
        for (int i = 0; i < arrayList.size(); i++) {
            dy6 dy6Var = (dy6) arrayList.get(i);
            ey6Var.e(dy6Var);
            ey6Var.h.add(dy6Var);
        }
        ey6Var.l = true;
        this.h.h(2);
    }

    public final void K(vq2 vq2Var) {
        ska skaVar;
        try {
            O(true, false, true, false);
            L();
            lb3 lb3Var = this.f;
            uc8 uc8Var = this.L;
            ConcurrentHashMap concurrentHashMap = lb3Var.o;
            kb3 kb3Var = (kb3) concurrentHashMap.get(uc8Var);
            if (kb3Var != null) {
                int i = kb3Var.a - 1;
                kb3Var.a = i;
                if (i == 0) {
                    concurrentHashMap.remove(uc8Var);
                    lb3Var.d();
                }
            }
            if (lb3Var.o.isEmpty()) {
                lb3Var.p = -1L;
            }
            c00 c00Var = this.Q;
            c00Var.c = null;
            c00Var.a();
            c00Var.b(0);
            sc3 sc3Var = this.d;
            if (sc3Var.h != null) {
                gre.o("DefaultTrackSelector is accessed on the wrong thread.", Thread.currentThread().equals(sc3Var.h));
            }
            if (Build.VERSION.SDK_INT >= 32 && (skaVar = sc3Var.i) != null) {
                skaVar.e();
                sc3Var.i = null;
            }
            sc3Var.a = null;
            sc3Var.b = null;
            o0(1);
        } finally {
            this.h.f();
            this.n.r();
            vq2Var.e();
        }
    }

    public final void L() {
        for (int i = 0; i < this.a.length; i++) {
            ug0 ug0Var = this.b[i];
            synchronized (ug0Var.a) {
                ug0Var.J = null;
            }
            e79 e79Var = this.a[i];
            ug0 ug0Var2 = e79Var.a;
            gre.p(ug0Var2.n == 0);
            ug0Var2.t();
            e79Var.e = false;
            ug0 ug0Var3 = e79Var.c;
            if (ug0Var3 != null) {
                gre.p(ug0Var3.n == 0);
                ug0Var3.t();
                e79Var.f = false;
            }
        }
    }

    public final void M(int i, int i2, wga wgaVar) {
        this.Z.a(1);
        ey6 ey6Var = this.I;
        ey6Var.getClass();
        gre.f(i >= 0 && i <= i2 && i2 <= ey6Var.c.size());
        ey6Var.k = wgaVar;
        ey6Var.f(i, i2);
        u(ey6Var.b(), false);
    }

    /* JADX WARN: Removed duplicated region for block: B:60:0x016a  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0189 A[ORIG_RETURN, RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void N() {
        int i;
        int i2;
        boolean z;
        float f = this.y.g().a;
        vr6 vr6Var = this.H;
        tr6 tr6Var = vr6Var.i;
        tr6 f2 = vr6Var.f();
        cyb cybVar = null;
        tr6 tr6Var2 = tr6Var;
        boolean z2 = true;
        while (tr6Var2 != null && tr6Var2.e) {
            yb8 yb8Var = this.Y;
            cyb j = tr6Var2.j(f, yb8Var.a, yb8Var.l);
            cyb cybVar2 = tr6Var2 == this.H.i ? j : cybVar;
            cyb cybVar3 = tr6Var2.o;
            k64[] k64VarArr = (k64[]) j.d;
            boolean z3 = false;
            if (((k64[]) cybVar3.d).length == k64VarArr.length) {
                int i3 = 0;
                while (i3 < k64VarArr.length) {
                    if (j.p(cybVar3, i3)) {
                        i3++;
                        cybVar2 = cybVar2;
                        j = j;
                    }
                }
                cyb cybVar4 = cybVar2;
                if (tr6Var2 == f2) {
                    z2 = false;
                }
                tr6Var2 = tr6Var2.m;
                cybVar = cybVar4;
            }
            vr6 vr6Var2 = this.H;
            if (z2) {
                tr6 tr6Var3 = vr6Var2.i;
                boolean z4 = (vr6Var2.s(tr6Var3) & 1) != 0;
                boolean[] zArr = new boolean[this.a.length];
                cybVar2.getClass();
                long a = tr6Var3.a(cybVar2, this.Y.s, z4, zArr);
                yb8 yb8Var2 = this.Y;
                if (yb8Var2.e == 4 || a == yb8Var2.s) {
                    z = false;
                } else {
                    z = false;
                    z3 = true;
                }
                yb8 yb8Var3 = this.Y;
                boolean z5 = z;
                i = 4;
                this.Y = x(yb8Var3.b, a, yb8Var3.c, yb8Var3.d, z3, 5);
                if (z3) {
                    Q(a, true);
                }
                g();
                boolean[] zArr2 = new boolean[this.a.length];
                int i4 = z5;
                while (true) {
                    e79[] e79VarArr = this.a;
                    if (i4 >= e79VarArr.length) {
                        break;
                    }
                    int c = e79VarArr[i4].c();
                    zArr2[i4] = this.a[i4].j();
                    e79 e79Var = this.a[i4];
                    ip9 ip9Var = tr6Var3.c[i4];
                    mb3 mb3Var = this.y;
                    long j2 = this.n0;
                    boolean z6 = zArr[i4];
                    ug0 ug0Var = e79Var.a;
                    if (e79.k(ug0Var)) {
                        if (ip9Var != ug0Var.r) {
                            e79Var.a(ug0Var, mb3Var);
                        } else if (z6) {
                            ug0Var.D(j2, z5, true);
                        }
                    }
                    ug0 ug0Var2 = e79Var.c;
                    if (ug0Var2 != null && e79.k(ug0Var2)) {
                        if (ip9Var != ug0Var2.r) {
                            e79Var.a(ug0Var2, mb3Var);
                        } else if (z6) {
                            ug0Var2.D(j2, z5, true);
                        }
                    }
                    if (c - this.a[i4].c() > 0) {
                        G(i4, z5);
                    }
                    this.l0 -= c - this.a[i4].c();
                    i4++;
                }
                k(this.n0, zArr2);
                a0(tr6Var3);
            } else {
                i = 4;
                vr6Var2.s(tr6Var2);
                if (tr6Var2.e) {
                    long max = Math.max(tr6Var2.g.b, this.n0 - tr6Var2.p);
                    if (this.P) {
                        int i5 = 0;
                        while (true) {
                            e79[] e79VarArr2 = this.a;
                            if (i5 < e79VarArr2.length) {
                                if (this.H.k[i5] == tr6Var2 && e79VarArr2[i5].h(tr6Var2)) {
                                    g();
                                    break;
                                }
                                i5++;
                            } else {
                                break;
                            }
                        }
                    }
                    i2 = 4;
                    tr6Var2.a(j, max, false, new boolean[tr6Var2.j.length]);
                    t(true);
                    if (this.Y.e == i2) {
                        C();
                        B0();
                        this.h.h(2);
                        return;
                    }
                    return;
                }
            }
            i2 = i;
            t(true);
            if (this.Y.e == i2) {
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0135  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x013c  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0176  */
    /* JADX WARN: Removed duplicated region for block: B:85:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:86:0x014b  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0137  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x00c8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void O(boolean z, boolean z2, boolean z3, boolean z4) {
        long j;
        long j2;
        long j3;
        boolean z5;
        aob aobVar;
        aob aobVar2;
        rx6 rx6Var;
        txb txbVar;
        cyb cybVar;
        List list;
        this.h.g(2);
        this.V = false;
        if (this.W != null) {
            this.Z.a(1);
            this.W = null;
        }
        this.r0 = null;
        D0(false, true);
        mb3 mb3Var = this.y;
        mb3Var.b = false;
        ie2 ie2Var = (ie2) mb3Var.c;
        if (ie2Var.c) {
            ie2Var.a(ie2Var.h());
            ie2Var.c = false;
        }
        this.n0 = 1000000000000L;
        for (int i = 0; i < this.a.length; i++) {
            try {
                h(i);
            } catch (j54 | RuntimeException e) {
                lad.d("ExoPlayerImplInternal", "Disable failed.", e);
            }
        }
        this.u0 = -9223372036854775807L;
        if (z) {
            for (e79 e79Var : this.a) {
                try {
                    e79Var.n();
                } catch (RuntimeException e2) {
                    lad.d("ExoPlayerImplInternal", "Reset failed.", e2);
                }
            }
        }
        this.l0 = 0;
        yb8 yb8Var = this.Y;
        rx6 rx6Var2 = yb8Var.b;
        long j4 = yb8Var.s;
        if (!this.Y.b.c()) {
            yb8 yb8Var2 = this.Y;
            xnb xnbVar = this.w;
            rx6 rx6Var3 = yb8Var2.b;
            aob aobVar3 = yb8Var2.a;
            if (!aobVar3.p() && !aobVar3.g(rx6Var3.a, xnbVar).f) {
                j = this.Y.s;
                if (z2) {
                    j2 = j4;
                    j3 = j;
                    z5 = false;
                } else {
                    this.m0 = null;
                    Pair m = m(this.Y.a);
                    rx6Var2 = (rx6) m.first;
                    long longValue = ((Long) m.second).longValue();
                    z5 = rx6Var2.equals(this.Y.b) ? false : true;
                    j2 = longValue;
                    j3 = -9223372036854775807L;
                }
                this.H.b();
                this.f0 = false;
                aobVar = this.Y.a;
                if (z3 || !(aobVar instanceof dd8)) {
                    aobVar2 = aobVar;
                } else {
                    dd8 dd8Var = (dd8) aobVar;
                    wga wgaVar = this.I.k;
                    aob[] aobVarArr = dd8Var.k;
                    aob[] aobVarArr2 = new aob[aobVarArr.length];
                    for (int i2 = 0; i2 < aobVarArr.length; i2++) {
                        aobVarArr2[i2] = new cd8(aobVarArr[i2]);
                    }
                    aobVar2 = new dd8(aobVarArr2, dd8Var.l, wgaVar);
                    if (rx6Var2.b != -1) {
                        aobVar2.g(rx6Var2.a, this.w);
                        int i3 = this.w.c;
                        znb znbVar = this.s;
                        aobVar2.m(i3, znbVar, 0L);
                        if (znbVar.a()) {
                            rx6Var = new rx6(rx6Var2.a, rx6Var2.d);
                            yb8 yb8Var3 = this.Y;
                            int i4 = yb8Var3.e;
                            j54 j54Var = z4 ? null : yb8Var3.f;
                            if (z5) {
                                txbVar = txb.d;
                                cybVar = this.e;
                                km5 km5Var = mm5.b;
                                list = w59.e;
                            } else {
                                txbVar = yb8Var3.h;
                                cybVar = yb8Var3.i;
                                list = yb8Var3.j;
                            }
                            this.Y = new yb8(aobVar2, rx6Var, j3, j2, i4, j54Var, false, txbVar, cybVar, list, rx6Var, yb8Var3.l, yb8Var3.m, yb8Var3.n, yb8Var3.o, j2, 0L, j2, 0L, false);
                            if (z3) {
                                vr6 vr6Var = this.H;
                                if (!vr6Var.q.isEmpty()) {
                                    ArrayList arrayList = new ArrayList();
                                    for (int i5 = 0; i5 < vr6Var.q.size(); i5++) {
                                        ((tr6) vr6Var.q.get(i5)).i();
                                    }
                                    vr6Var.q = arrayList;
                                    vr6Var.m = null;
                                    vr6Var.p();
                                }
                                ey6 ey6Var = this.I;
                                HashMap hashMap = ey6Var.g;
                                for (cy6 cy6Var : hashMap.values()) {
                                    try {
                                        cy6Var.a.p(cy6Var.b);
                                    } catch (RuntimeException e3) {
                                        lad.d("MediaSourceList", "Failed to release child source.", e3);
                                    }
                                    qg0 qg0Var = cy6Var.a;
                                    by6 by6Var = cy6Var.c;
                                    qg0Var.s(by6Var);
                                    cy6Var.a.r(by6Var);
                                }
                                hashMap.clear();
                                ey6Var.h.clear();
                                ey6Var.l = false;
                                return;
                            }
                            return;
                        }
                    }
                }
                rx6Var = rx6Var2;
                yb8 yb8Var32 = this.Y;
                int i42 = yb8Var32.e;
                if (z4) {
                }
                if (z5) {
                }
                this.Y = new yb8(aobVar2, rx6Var, j3, j2, i42, j54Var, false, txbVar, cybVar, list, rx6Var, yb8Var32.l, yb8Var32.m, yb8Var32.n, yb8Var32.o, j2, 0L, j2, 0L, false);
                if (z3) {
                }
            }
        }
        j = this.Y.c;
        if (z2) {
        }
        this.H.b();
        this.f0 = false;
        aobVar = this.Y.a;
        if (z3) {
        }
        aobVar2 = aobVar;
        rx6Var = rx6Var2;
        yb8 yb8Var322 = this.Y;
        int i422 = yb8Var322.e;
        if (z4) {
        }
        if (z5) {
        }
        this.Y = new yb8(aobVar2, rx6Var, j3, j2, i422, j54Var, false, txbVar, cybVar, list, rx6Var, yb8Var322.l, yb8Var322.m, yb8Var322.n, yb8Var322.o, j2, 0L, j2, 0L, false);
        if (z3) {
        }
    }

    public final void P() {
        tr6 tr6Var = this.H.i;
        this.c0 = tr6Var != null && tr6Var.g.h && this.b0;
    }

    public final void Q(long j, boolean z) {
        tr6 tr6Var = this.H.i;
        long j2 = j + (tr6Var == null ? 1000000000000L : tr6Var.p);
        this.n0 = j2;
        ((ie2) this.y.c).a(j2);
        for (e79 e79Var : this.a) {
            long j3 = this.n0;
            ug0 d = e79Var.d(tr6Var);
            if (d != null) {
                d.D(j3, false, z);
            }
        }
        for (tr6 tr6Var2 = r0.i; tr6Var2 != null; tr6Var2 = tr6Var2.m) {
            for (k64 k64Var : (k64[]) tr6Var2.o.d) {
                if (k64Var != null) {
                    k64Var.t();
                }
            }
        }
    }

    public final void R(aob aobVar, aob aobVar2) {
        if (aobVar.p() && aobVar2.p()) {
            return;
        }
        ArrayList arrayList = this.E;
        int size = arrayList.size() - 1;
        if (size < 0) {
            Collections.sort(arrayList);
        } else {
            ir2.u(arrayList.get(size));
            throw null;
        }
    }

    public final void U(long j) {
        boolean z = this.M;
        long j2 = x0;
        if (!z) {
            if (!this.U) {
                if (this.Y.e != 3 || s0()) {
                    r2 = j2;
                }
                this.h.a.sendEmptyMessageAtTime(2, j + r2);
            }
            this.T.getClass();
        }
        r2 = this.Y.e != 3 ? j2 : 1000L;
        for (e79 e79Var : this.a) {
            long j3 = this.n0;
            long j4 = this.o0;
            ug0 ug0Var = e79Var.c;
            ug0 ug0Var2 = e79Var.a;
            long j5 = e79.k(ug0Var2) ? ug0Var2.j(j3, j4) : Long.MAX_VALUE;
            if (ug0Var != null && ug0Var.n != 0) {
                j5 = Math.min(j5, ug0Var.j(j3, j4));
            }
            r2 = Math.min(r2, g8c.i0(j5));
        }
        if (this.Y.m()) {
            tr6 tr6Var = this.H.i;
            if ((tr6Var != null ? tr6Var.m : null) != null) {
                if ((g8c.T(r2) * this.Y.o.a) + this.n0 >= r1.e()) {
                    r2 = Math.min(r2, j2);
                }
            }
        }
        this.h.a.sendEmptyMessageAtTime(2, j + r2);
    }

    public final void V(boolean z) {
        rx6 rx6Var = this.H.i.g.a;
        long X = X(rx6Var, this.Y.s, true, false);
        if (X != this.Y.s) {
            yb8 yb8Var = this.Y;
            this.Y = x(rx6Var, X, yb8Var.c, yb8Var.d, z, 5);
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(15:28|(7:(5:67|68|(1:90)(3:74|(1:78)|79)|80|(1:89)(4:86|87|19|20))(1:30)|46|47|48|18|19|20)|31|32|(1:34)(1:63)|35|36|(1:38)(1:61)|39|40|41|42|43|44|45) */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0193, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0194, code lost:
    
        r2 = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0195, code lost:
    
        r5 = r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0197, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0199, code lost:
    
        r0 = th;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void W(h64 h64Var) {
        rx6 u;
        boolean z;
        long j;
        long j2;
        boolean z2;
        rx6 rx6Var;
        long j3;
        long j4;
        long j5;
        long j6;
        yb8 yb8Var;
        int i;
        long j7;
        int i2;
        long j8;
        rx6 rx6Var2;
        long j9;
        long X;
        yb8 yb8Var2;
        rx6 rx6Var3;
        aob aobVar;
        long j10;
        i64 i64Var = this;
        if (i64Var.V) {
            if (i64Var.W != null) {
                i64Var.X++;
                i64Var.Z.a(1);
            }
            i64Var.W = h64Var;
            return;
        }
        i64Var.Z.a(1);
        Pair S = S(i64Var.Y.a, h64Var, true, i64Var.g0, i64Var.h0, i64Var.s, i64Var.w);
        if (S == null) {
            Pair m = i64Var.m(i64Var.Y.a);
            u = (rx6) m.first;
            j2 = ((Long) m.second).longValue();
            z = !i64Var.Y.a.p();
            j = -9223372036854775807L;
        } else {
            Object obj = S.first;
            long longValue = ((Long) S.second).longValue();
            long j11 = h64Var.c == -9223372036854775807L ? -9223372036854775807L : longValue;
            vr6 vr6Var = i64Var.H;
            yb8 yb8Var3 = i64Var.Y;
            u = vr6Var.u(yb8Var3, yb8Var3.a, obj, longValue, true, false);
            if (u.c()) {
                i64Var.Y.a.g(u.a, i64Var.w);
                if (i64Var.w.e(u.b) == u.c) {
                    i64Var.w.getClass();
                    da daVar = da.c;
                }
                i64Var.w.getClass();
                da.c.a(u.b).getClass();
                z = true;
                j = Math.max(j11, 0L);
                j2 = 0;
            } else {
                z = h64Var.c == -9223372036854775807L;
                j = j11;
                j2 = longValue;
            }
        }
        try {
            try {
                if (i64Var.Y.a.p()) {
                    i64Var.m0 = h64Var;
                } else {
                    yb8 yb8Var4 = i64Var.Y;
                    if (S == null) {
                        if (yb8Var4.e != 1) {
                            i64Var.o0(4);
                        }
                        i64Var.O(false, true, false, true);
                    } else {
                        try {
                            if (u.equals(yb8Var4.b)) {
                                try {
                                    tr6 tr6Var = i64Var.H.i;
                                    if (tr6Var == null || !tr6Var.e || j2 == 0) {
                                        j6 = j2;
                                    } else {
                                        ej6 ej6Var = tr6Var.a;
                                        long j12 = i64Var.s.l;
                                        if (i64Var.U && j12 != -9223372036854775807L) {
                                            i64Var.T.getClass();
                                        }
                                        j6 = ej6Var.i(j2, i64Var.S);
                                    }
                                    if (g8c.i0(j6) == g8c.i0(i64Var.Y.s) && ((i = (yb8Var = i64Var.Y).e) == 2 || i == 3)) {
                                        j7 = yb8Var.s;
                                        i2 = 2;
                                        j8 = j7;
                                        z2 = z;
                                        rx6Var2 = u;
                                        j9 = j;
                                        i64Var.Y = i64Var.x(rx6Var2, j7, j9, j8, z2, i2);
                                    }
                                    z2 = z;
                                    rx6Var = u;
                                    j5 = j;
                                } catch (Throwable th) {
                                    th = th;
                                    z2 = z;
                                    rx6Var = u;
                                    j5 = j;
                                    j3 = j5;
                                    j4 = j2;
                                    i64Var.Y = i64Var.x(rx6Var, j4, j3, j4, z2, 2);
                                    throw th;
                                }
                            } else {
                                z2 = z;
                                rx6Var = u;
                                j5 = j;
                                j6 = j2;
                            }
                            i64Var.C0(aobVar, rx6Var3, aobVar, yb8Var2.b, j10, true);
                            rx6Var2 = rx6Var3;
                            j9 = j10;
                            j7 = X;
                            i2 = 2;
                            j8 = j7;
                            i64Var = this;
                            i64Var.Y = i64Var.x(rx6Var2, j7, j9, j8, z2, i2);
                        } catch (Throwable th2) {
                            th = th2;
                            rx6Var = rx6Var3;
                            j3 = j10;
                            j4 = X;
                            i64Var.Y = i64Var.x(rx6Var, j4, j3, j4, z2, 2);
                            throw th;
                        }
                        X = i64Var.X(rx6Var, j6, i64Var.z(), i64Var.Y.e == 4);
                        z2 |= j2 != X;
                        yb8Var2 = i64Var.Y;
                        rx6Var3 = rx6Var;
                        aobVar = yb8Var2.a;
                        j10 = j5;
                    }
                }
                z2 = z;
                rx6Var2 = u;
                j7 = j2;
                j9 = j;
                i2 = 2;
                j8 = j7;
                i64Var = this;
                i64Var.Y = i64Var.x(rx6Var2, j7, j9, j8, z2, i2);
            } catch (Throwable th3) {
                th = th3;
                z2 = z;
                rx6Var = u;
                j4 = j2;
                j3 = j;
            }
        } catch (Throwable th4) {
            th = th4;
            z2 = z;
            rx6Var = u;
            j3 = j;
        }
    }

    public final long X(rx6 rx6Var, long j, boolean z, boolean z2) {
        vr6 vr6Var;
        byte b;
        w0();
        boolean z3 = true;
        D0(false, true);
        if (z2 || this.Y.e == 3) {
            o0(2);
        }
        tr6 tr6Var = this.H.i;
        tr6 tr6Var2 = tr6Var;
        while (tr6Var2 != null && !rx6Var.equals(tr6Var2.g.a)) {
            tr6Var2 = tr6Var2.m;
        }
        if (z || tr6Var != tr6Var2 || (tr6Var2 != null && tr6Var2.p + j < 0)) {
            for (int i = 0; i < this.a.length; i++) {
                h(i);
            }
            this.u0 = -9223372036854775807L;
            if (tr6Var2 != null) {
                while (true) {
                    vr6Var = this.H;
                    if (vr6Var.i == tr6Var2) {
                        break;
                    }
                    vr6Var.a();
                }
                vr6Var.s(tr6Var2);
                tr6Var2.p = 1000000000000L;
                gre.p(!z());
                k(this.H.d().e(), new boolean[this.a.length]);
                a0(tr6Var2);
            }
        }
        g();
        if (this.U) {
            for (e79 e79Var : this.a) {
                if (e79Var.j() && ((b = e79Var.a.b) == 2 || b == 4)) {
                    this.V = true;
                    break;
                }
            }
        }
        vr6 vr6Var2 = this.H;
        if (tr6Var2 != null) {
            vr6Var2.s(tr6Var2);
            if (!tr6Var2.e) {
                tr6Var2.g = tr6Var2.g.b(j, -9223372036854775807L);
            } else if (tr6Var2.f) {
                if (this.U) {
                    this.T.getClass();
                    if (!this.Y.a.p() && tr6Var2.g.a.equals(this.Y.b)) {
                        long j2 = tr6Var2.p + j;
                        boolean z4 = true;
                        for (e79 e79Var2 : this.a) {
                            if (e79Var2.j()) {
                                ug0 d = e79Var2.d(tr6Var2);
                                z4 &= d != null && d.I(j2);
                            }
                        }
                        if (z4) {
                            ej6 ej6Var = tr6Var2.a;
                            long j3 = this.Y.s;
                            gv9 gv9Var = gv9.e;
                            if (ej6Var.i(j3, gv9Var) == tr6Var2.a.i(j, gv9Var)) {
                                z3 = false;
                            }
                        }
                    }
                }
                j = tr6Var2.a.l(j);
                tr6Var2.a.m(j - this.x);
            }
            Q(j, z3);
            C();
        } else {
            vr6Var2.b();
            Q(j, true);
        }
        t(false);
        this.h.h(2);
        return j;
    }

    public final void Y(yc8 yc8Var) {
        yc8Var.getClass();
        cdb cdbVar = this.h;
        if (yc8Var.e != this.r) {
            cdbVar.c(15, yc8Var).b();
            return;
        }
        synchronized (yc8Var) {
        }
        try {
            yc8Var.a.d(yc8Var.c, yc8Var.d);
            yc8Var.a(true);
            int i = this.Y.e;
            if (i == 3 || i == 2) {
                cdbVar.h(2);
            }
        } catch (Throwable th) {
            yc8Var.a(true);
            throw th;
        }
    }

    public final void Z(yc8 yc8Var) {
        Looper looper = yc8Var.e;
        if (looper.getThread().isAlive()) {
            this.F.a(looper, null).e(new s54(this, yc8Var));
        } else {
            lad.f("TAG", "Trying to send message on a dead thread.");
            yc8Var.a(false);
        }
    }

    @Override // rr6
    public final void a(sr6 sr6Var) {
        this.h.c(8, sr6Var).b();
    }

    public final void a0(tr6 tr6Var) {
        for (int i = 0; i < this.a.length; i++) {
            tr6Var.h[i] = true;
        }
    }

    @Override // p4a
    public final void b(q4a q4aVar) {
        this.h.c(9, (sr6) q4aVar).b();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0057, code lost:
    
        if (r7.a == 1) goto L28;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void b0(nz nzVar, boolean z) {
        byte b;
        ska skaVar;
        i64 i64Var;
        sc3 sc3Var = this.d;
        if (!sc3Var.j.equals(nzVar)) {
            sc3Var.j = nzVar;
            if (sc3Var.g.A0 && Build.VERSION.SDK_INT >= 32 && (skaVar = sc3Var.i) != null && skaVar.b && (i64Var = sc3Var.a) != null) {
                i64Var.h.c(10, null).b();
            }
        }
        if (!z) {
            nzVar = null;
        }
        c00 c00Var = this.Q;
        if (!Objects.equals(c00Var.d, nzVar)) {
            c00Var.d = nzVar;
            if (nzVar != null) {
                int i = nzVar.c;
                b = 3;
                switch (i) {
                    case 0:
                        lad.f("AudioFocusManager", "Specify a proper usage in the audio attributes for audio focus handling. Using AUDIOFOCUS_GAIN by default.");
                        b = 1;
                        break;
                    case 1:
                    case 14:
                        b = 1;
                        break;
                    case 2:
                    case 4:
                        b = 2;
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
                        b00.o(i, "Unidentified audio usage: ", "AudioFocusManager");
                        break;
                    case 16:
                        b = 4;
                        break;
                }
                c00Var.f = b;
                gre.e("Automatic handling of audio focus is only available for USAGE_MEDIA and USAGE_GAME.", b != 1 || b == 0);
            }
            b = 0;
            c00Var.f = b;
            gre.e("Automatic handling of audio focus is only available for USAGE_MEDIA and USAGE_GAME.", b != 1 || b == 0);
        }
        yb8 yb8Var = this.Y;
        boolean z2 = yb8Var.l;
        A0(c00Var.c(yb8Var.e, z2), yb8Var.n, yb8Var.m, z2);
    }

    @Override // sac
    public final void c(long j, long j2, fm4 fm4Var, MediaFormat mediaFormat) {
        if (this.V) {
            this.h.a(37).b();
        }
    }

    public final void c0(int i) {
        for (e79 e79Var : this.a) {
            ug0 ug0Var = e79Var.a;
            byte b = ug0Var.b;
            if (b == 1 || b == 2) {
                ug0Var.d(10, Integer.valueOf(i));
                ug0 ug0Var2 = e79Var.c;
                if (ug0Var2 != null) {
                    ug0Var2.d(10, Integer.valueOf(i));
                }
            }
        }
    }

    public final void d(d64 d64Var, int i) {
        this.Z.a(1);
        ey6 ey6Var = this.I;
        if (i == -1) {
            i = ey6Var.c.size();
        }
        u(ey6Var.a(i, d64Var.a, d64Var.b), false);
    }

    public final void d0(boolean z, vq2 vq2Var) {
        if (this.i0 != z) {
            this.i0 = z;
            if (!z) {
                for (e79 e79Var : this.a) {
                    e79Var.n();
                }
            }
        }
        if (vq2Var != null) {
            vq2Var.e();
        }
    }

    public final void e() {
        for (e79 e79Var : this.a) {
            mr9 mr9Var = this.U ? this.T : null;
            e79Var.a.d(18, mr9Var);
            ug0 ug0Var = e79Var.c;
            if (ug0Var != null) {
                ug0Var.d(18, mr9Var);
            }
        }
    }

    public final void e0(b64 b64Var) {
        for (e79 e79Var : this.a) {
            ug0 ug0Var = e79Var.a;
            if (ug0Var.b == 4) {
                ug0Var.d(23, b64Var);
                ug0 ug0Var2 = e79Var.c;
                if (ug0Var2 != null) {
                    ug0Var2.d(23, b64Var);
                }
            }
        }
    }

    public final boolean f() {
        if (this.P) {
            for (e79 e79Var : this.a) {
                if (e79Var.g()) {
                    return true;
                }
            }
        }
        return false;
    }

    public final void f0(d64 d64Var) {
        this.Z.a(1);
        int i = d64Var.c;
        wga wgaVar = d64Var.b;
        ArrayList arrayList = d64Var.a;
        if (i != -1) {
            this.m0 = new h64(new dd8(arrayList, wgaVar), d64Var.c, d64Var.d);
        }
        ey6 ey6Var = this.I;
        ArrayList arrayList2 = ey6Var.c;
        ey6Var.f(0, arrayList2.size());
        u(ey6Var.a(arrayList2.size(), arrayList, wgaVar), false);
    }

    public final void g() {
        ug0 ug0Var;
        if (this.P && f()) {
            for (e79 e79Var : this.a) {
                int c = e79Var.c();
                mb3 mb3Var = this.y;
                if (e79Var.g()) {
                    byte b = e79Var.d;
                    byte b2 = 1;
                    boolean z = b == 5 || b == 2;
                    if (b != 5 && b != 3) {
                        b2 = 0;
                    }
                    if (z) {
                        try {
                            ug0Var = e79Var.a;
                        } catch (RuntimeException e) {
                            lad.d("RendererHolder", "Disable prewarming failed.", e);
                        }
                    } else {
                        ug0Var = e79Var.c;
                        ug0Var.getClass();
                    }
                    e79Var.a(ug0Var, mb3Var);
                    try {
                        e79Var.l(z);
                    } catch (RuntimeException e2) {
                        lad.d("RendererHolder", "Reset prewarming failed.", e2);
                    }
                    e79Var.d = b2;
                }
                this.l0 -= c - e79Var.c();
            }
            this.u0 = -9223372036854775807L;
        }
    }

    public final void g0(boolean z) {
        this.b0 = z;
        P();
        if (this.c0 && z()) {
            V(true);
            t(false);
        }
    }

    public final void h(int i) {
        e79[] e79VarArr = this.a;
        int c = e79VarArr[i].c();
        e79 e79Var = e79VarArr[i];
        ug0 ug0Var = e79Var.a;
        mb3 mb3Var = this.y;
        e79Var.a(ug0Var, mb3Var);
        ug0 ug0Var2 = e79Var.c;
        if (ug0Var2 != null) {
            byte b = e79Var.d;
            boolean z = true;
            if (b != 5 && b != 1 && b != 3) {
                z = false;
            }
            e79Var.a(ug0Var2, mb3Var);
            e79Var.l(false);
            if (z) {
                ug0 ug0Var3 = e79Var.a;
                ug0Var2.getClass();
                ug0Var2.d(17, ug0Var3);
            }
        }
        e79Var.d = (byte) 0;
        G(i, false);
        this.l0 -= c;
    }

    public final void h0(zb8 zb8Var) {
        this.h.g(16);
        mb3 mb3Var = this.y;
        mb3Var.b(zb8Var);
        zb8 g = mb3Var.g();
        w(g, g.a, true, true);
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        cdb cdbVar;
        int i;
        tr6 tr6Var;
        rx6 rx6Var;
        int i2;
        try {
            switch (message.what) {
                case 1:
                    boolean z = message.arg1 != 0;
                    int i3 = message.arg2;
                    this.Z.a(1);
                    A0(this.Q.c(this.Y.e, z), i3 >> 4, i3 & 15, z);
                    break;
                case 2:
                    i();
                    break;
                case 3:
                    W((h64) message.obj);
                    break;
                case 4:
                    h0((zb8) message.obj);
                    break;
                case 5:
                    this.S = (gv9) message.obj;
                    break;
                case 6:
                    v0(false, true);
                    break;
                case 7:
                    K((vq2) message.obj);
                    return true;
                case 8:
                    v((sr6) message.obj);
                    break;
                case 9:
                    r((sr6) message.obj);
                    break;
                case 10:
                    this.d.i((byb) message.obj);
                    N();
                    break;
                case 11:
                    j0(message.arg1);
                    break;
                case 12:
                    m0(message.arg1 != 0);
                    break;
                case 13:
                    d0(message.arg1 != 0, (vq2) message.obj);
                    break;
                case 14:
                    Y((yc8) message.obj);
                    break;
                case 15:
                    Z((yc8) message.obj);
                    break;
                case 16:
                    zb8 zb8Var = (zb8) message.obj;
                    w(zb8Var, zb8Var.a, true, false);
                    break;
                case 17:
                    f0((d64) message.obj);
                    break;
                case 18:
                    d((d64) message.obj, message.arg1);
                    break;
                case 19:
                    I((e64) message.obj);
                    break;
                case 20:
                    M(message.arg1, message.arg2, (wga) message.obj);
                    break;
                case 21:
                    n0((wga) message.obj);
                    break;
                case 22:
                    H();
                    break;
                case 23:
                    g0(message.arg1 != 0);
                    break;
                case 24:
                    this.R = message.arg1 != 0;
                    break;
                case 25:
                    N();
                    V(true);
                    break;
                case 26:
                    N();
                    V(true);
                    break;
                case 27:
                    z0((List) message.obj, message.arg1, message.arg2);
                    break;
                case 28:
                    i0((l54) message.obj);
                    break;
                case 29:
                    J();
                    break;
                case kk7.S /* 30 */:
                    Pair pair = (Pair) message.obj;
                    q0(pair.first, (vq2) pair.second);
                    break;
                case 31:
                    b0((nz) message.obj, message.arg1 != 0);
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
                    p0((sac) message.obj);
                    break;
                case 36:
                    k0(((Boolean) message.obj).booleanValue());
                    break;
                case 37:
                    this.V = false;
                    h64 h64Var = this.W;
                    if (h64Var != null) {
                        W(h64Var);
                        this.W = null;
                        break;
                    }
                    break;
                case 38:
                    l0((mr9) message.obj);
                    break;
                case 39:
                    e0((b64) message.obj);
                    break;
                case 40:
                    c0(message.arg1);
                    break;
                default:
                    return false;
            }
        } catch (av7 e) {
            boolean z2 = e.a;
            byte b = e.b;
            if (b == 1) {
                i2 = z2 ? 3001 : 3003;
            } else {
                if (b == 4) {
                    i2 = z2 ? 3002 : 3004;
                }
                s(e, r3);
            }
            r3 = i2;
            s(e, r3);
        } catch (j54 e2) {
            e = e2;
            byte b2 = e.d;
            vr6 vr6Var = this.H;
            if (b2 == 1 && e.r == null) {
                e79 e79Var = this.a[e.f];
                tr6 tr6Var2 = vr6Var.i;
                while (true) {
                    if (tr6Var2 == null) {
                        tr6Var2 = vr6Var.d();
                        break;
                    }
                    if (e79Var.i(tr6Var2)) {
                        break;
                    }
                    tr6Var2 = tr6Var2.m;
                }
                if (tr6Var2 != null) {
                    e = e.a(tr6Var2.g.a);
                }
            }
            int i4 = e.f;
            byte b3 = e.d;
            cdb cdbVar2 = this.h;
            if (b3 == 1 && (rx6Var = e.r) != null && A(i4, rx6Var)) {
                this.v0 = true;
                g();
                tr6 k = vr6Var.k(i4);
                tr6 tr6Var3 = vr6Var.i;
                if (tr6Var3 != k) {
                    while (tr6Var3 != null) {
                        tr6 tr6Var4 = tr6Var3.m;
                        if (tr6Var4 == k) {
                            break;
                        }
                        tr6Var3 = tr6Var4;
                    }
                }
                vr6Var.s(tr6Var3);
                if (this.Y.e != 4) {
                    C();
                    cdbVar2.h(2);
                }
            } else {
                j54 j54Var = this.r0;
                if (j54Var != null) {
                    j54Var.addSuppressed(e);
                    e = this.r0;
                }
                if (e.d != 1 || vr6Var.i == vr6Var.f()) {
                    cdbVar = cdbVar2;
                } else {
                    tr6 tr6Var5 = vr6Var.i;
                    while (true) {
                        if (tr6Var5 == null) {
                            tr6Var5 = vr6Var.d();
                            break;
                        }
                        if (tr6Var5.g.a.equals(e.r)) {
                            break;
                        }
                        tr6Var5 = tr6Var5.m;
                    }
                    while (true) {
                        tr6Var = vr6Var.i;
                        if (tr6Var == tr6Var5) {
                            break;
                        }
                        vr6Var.a();
                    }
                    gre.k(tr6Var);
                    E(message.what);
                    ur6 ur6Var = tr6Var.g;
                    rx6 rx6Var2 = ur6Var.a;
                    long j = ur6Var.b;
                    cdbVar = cdbVar2;
                    this.Y = x(rx6Var2, j, ur6Var.d, j, true, 0);
                }
                if (e.s && (this.r0 == null || (i = e.a) == 5004 || i == 5003)) {
                    lad.g("ExoPlayerImplInternal", "Recoverable renderer error", e);
                    if (this.r0 == null) {
                        this.r0 = e;
                    }
                    bdb c = cdbVar.c(25, e);
                    Handler handler = cdbVar.a;
                    Message message2 = c.a;
                    message2.getClass();
                    handler.sendMessageAtFrontOfQueue(message2);
                    c.a();
                } else {
                    lad.d("ExoPlayerImplInternal", "Playback error", e);
                    v0(true, false);
                    this.Y = this.Y.f(e);
                }
            }
        } catch (RuntimeException e3) {
            j54 j54Var2 = new j54(2, e3, ((e3 instanceof IllegalStateException) || (e3 instanceof IllegalArgumentException)) ? 1004 : 1000);
            lad.d("ExoPlayerImplInternal", "Playback error", j54Var2);
            v0(true, false);
            this.Y = this.Y.f(j54Var2);
        } catch (jh0 e4) {
            s(e4, 1002);
        } catch (r63 e5) {
            s(e5, e5.a);
        } catch (rq3 e6) {
            s(e6, e6.a);
        } catch (IOException e7) {
            s(e7, 2000);
        }
        E(message.what);
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:489:0x088a, code lost:
    
        if (r4 >= r5.c) goto L468;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x02f9, code lost:
    
        if (((long) ((r4.e() - r30.n0) / r30.y.g().a)) <= r18) goto L151;
     */
    /* JADX WARN: Removed duplicated region for block: B:202:0x04b4  */
    /* JADX WARN: Removed duplicated region for block: B:247:0x0547  */
    /* JADX WARN: Removed duplicated region for block: B:258:0x0563  */
    /* JADX WARN: Removed duplicated region for block: B:348:0x091f  */
    /* JADX WARN: Removed duplicated region for block: B:371:0x098f  */
    /* JADX WARN: Removed duplicated region for block: B:376:0x099d  */
    /* JADX WARN: Removed duplicated region for block: B:382:0x09ac  */
    /* JADX WARN: Removed duplicated region for block: B:385:0x09b7  */
    /* JADX WARN: Removed duplicated region for block: B:406:0x0798  */
    /* JADX WARN: Removed duplicated region for block: B:422:0x08db  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0291  */
    /* JADX WARN: Removed duplicated region for block: B:476:0x084e  */
    /* JADX WARN: Removed duplicated region for block: B:480:0x0861  */
    /* JADX WARN: Removed duplicated region for block: B:486:0x0873  */
    /* JADX WARN: Removed duplicated region for block: B:488:0x0879  */
    /* JADX WARN: Removed duplicated region for block: B:490:0x0876  */
    /* JADX WARN: Removed duplicated region for block: B:492:0x0856  */
    /* JADX WARN: Removed duplicated region for block: B:499:0x08b4  */
    /* JADX WARN: Removed duplicated region for block: B:506:0x056f  */
    /* JADX WARN: Removed duplicated region for block: B:509:0x058e  */
    /* JADX WARN: Removed duplicated region for block: B:519:0x05cb  */
    /* JADX WARN: Removed duplicated region for block: B:556:0x0623  */
    /* JADX WARN: Removed duplicated region for block: B:560:0x062e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void i() {
        long j;
        int i;
        boolean z;
        boolean z2;
        long j2;
        boolean z3;
        yb8 yb8Var;
        long j3;
        boolean z4;
        boolean z5;
        long j4;
        boolean z6;
        boolean z7;
        yb8 yb8Var2;
        int i2;
        byte b;
        long j5;
        ur6 e;
        tr6 tr6Var;
        long j6;
        int i3;
        tr6 d;
        tr6 d2;
        byte b2;
        e79[] e79VarArr;
        vr6 vr6Var;
        boolean z8;
        tr6 tr6Var2;
        tr6 tr6Var3;
        int i4;
        tr6 a;
        boolean z9;
        byte b3;
        int i5;
        int i6;
        int i7;
        boolean z10;
        tr6[] tr6VarArr;
        byte b4;
        tr6 tr6Var4;
        byte b5;
        byte b6;
        tr6 c;
        tr6 tr6Var5;
        boolean z11;
        cyb cybVar;
        long j7;
        boolean z12;
        this.F.getClass();
        long uptimeMillis = SystemClock.uptimeMillis();
        this.h.g(2);
        yb8 yb8Var3 = this.Y;
        int i8 = yb8Var3.e;
        if (i8 == 1 || i8 == 4) {
            return;
        }
        int i9 = 0;
        if (yb8Var3.a.p() || !this.I.l) {
            j = uptimeMillis;
            i = 5;
        } else {
            this.H.r(this.n0);
            vr6 vr6Var2 = this.H;
            tr6 tr6Var6 = vr6Var2.l;
            if (tr6Var6 == null || (!tr6Var6.g.i && tr6Var6.g() && vr6Var2.l.g.e != -9223372036854775807L && vr6Var2.n < 100)) {
                vr6 vr6Var3 = this.H;
                long j8 = this.n0;
                yb8 yb8Var4 = this.Y;
                j5 = -9223372036854775807L;
                tr6 tr6Var7 = vr6Var3.l;
                if (tr6Var7 == null) {
                    j = uptimeMillis;
                    e = vr6Var3.h(yb8Var4.a, yb8Var4.b, yb8Var4.c, yb8Var4.s, -9223372036854775807L);
                } else {
                    j = uptimeMillis;
                    e = vr6Var3.e(yb8Var4.a, tr6Var7, j8);
                }
                if (e != null) {
                    vr6 vr6Var4 = this.H;
                    tr6 tr6Var8 = vr6Var4.l;
                    long j9 = tr6Var8 == null ? 1000000000000L : (tr6Var8.p + tr6Var8.g.e) - e.b;
                    int i10 = 0;
                    while (true) {
                        if (i10 >= vr6Var4.q.size()) {
                            tr6Var = null;
                            break;
                        }
                        ur6 ur6Var = ((tr6) vr6Var4.q.get(i10)).g;
                        long j10 = ur6Var.e;
                        long j11 = e.e;
                        if ((j10 == -9223372036854775807L || j10 == j11) && ur6Var.b == e.b && ur6Var.a.equals(e.a)) {
                            tr6Var = (tr6) vr6Var4.q.remove(i10);
                            break;
                        }
                        i10++;
                    }
                    if (tr6Var == null) {
                        i64 i64Var = (i64) vr6Var4.e.b;
                        ug0[] ug0VarArr = i64Var.b;
                        sc3 sc3Var = i64Var.d;
                        lb3 lb3Var = i64Var.f;
                        uc8 uc8Var = i64Var.L;
                        lb3Var.getClass();
                        mv6 mv6Var = new mv6(lb3Var, uc8Var);
                        ey6 ey6Var = i64Var.I;
                        cyb cybVar2 = i64Var.e;
                        i64Var.t0.getClass();
                        tr6Var = new tr6(ug0VarArr, j9, sc3Var, mv6Var, ey6Var, e, cybVar2);
                    } else {
                        tr6Var.g = e;
                        tr6Var.p = j9;
                    }
                    tr6 tr6Var9 = vr6Var4.l;
                    if (tr6Var9 == null) {
                        vr6Var4.i = tr6Var;
                        Arrays.fill(vr6Var4.j, tr6Var);
                        Arrays.fill(vr6Var4.k, tr6Var);
                    } else if (tr6Var != tr6Var9.m) {
                        tr6Var9.b();
                        tr6Var9.m = tr6Var;
                        tr6Var9.c();
                    }
                    vr6Var4.o = null;
                    vr6Var4.l = tr6Var;
                    vr6Var4.n++;
                    vr6Var4.q();
                    if (!tr6Var.d) {
                        long j12 = e.b;
                        tr6Var.d = true;
                        tr6Var.a.p(this, j12);
                    } else if (tr6Var.e) {
                        this.h.c(8, tr6Var.a).b();
                    }
                    if (this.H.i == tr6Var) {
                        Q(e.b, true);
                    }
                    t(false);
                }
            } else {
                j5 = -9223372036854775807L;
                j = uptimeMillis;
            }
            if (this.f0) {
                this.f0 = y(this.H.l);
                x0();
            } else {
                C();
            }
            vr6 vr6Var5 = this.H;
            long j13 = 10000000;
            if (!this.c0 && this.P && !this.v0 && !f() && (c = vr6Var5.c()) != null && c == vr6Var5.d() && (tr6Var5 = c.m) != null && (z11 = tr6Var5.e)) {
                gre.p(z11);
                if (((long) ((tr6Var5.e() - this.n0) / this.y.g().a)) > 10000000) {
                    j6 = 10000000;
                    i3 = 0;
                } else {
                    int i11 = 0;
                    while (true) {
                        tr6[] tr6VarArr2 = vr6Var5.k;
                        if (i11 >= tr6VarArr2.length) {
                            break;
                        }
                        tr6 tr6Var10 = tr6VarArr2[i11];
                        tr6Var10.getClass();
                        tr6VarArr2[i11] = tr6Var10.m;
                        vr6Var5.q();
                        i11++;
                    }
                    e79[] e79VarArr2 = this.a;
                    i9 = 0;
                    tr6 c2 = vr6Var5.c();
                    if (c2 != null) {
                        cyb cybVar3 = c2.o;
                        boolean z13 = false;
                        while (i9 < e79VarArr2.length) {
                            if (cybVar3.q(i9)) {
                                e79 e79Var = e79VarArr2[i9];
                                if (e79Var.c == null || e79Var.g()) {
                                    cybVar = cybVar3;
                                    j7 = j13;
                                    z12 = false;
                                } else {
                                    e79 e79Var2 = e79VarArr2[i9];
                                    gre.p(!e79Var2.g());
                                    if (e79.k(e79Var2.a)) {
                                        e79Var2.d = (byte) 4;
                                    } else {
                                        ug0 ug0Var = e79Var2.c;
                                        if (ug0Var != null && ug0Var.n != 0) {
                                            e79Var2.d = (byte) 5;
                                        } else if (e79Var2.d == 0) {
                                            e79Var2.d = (byte) 2;
                                        } else {
                                            e79Var2.d = (byte) 3;
                                        }
                                    }
                                    cybVar = cybVar3;
                                    j7 = j13;
                                    z12 = false;
                                    j(c2, i9, false, c2.e());
                                }
                            } else {
                                cybVar = cybVar3;
                                j7 = j13;
                                z12 = z13;
                            }
                            i9++;
                            z13 = z12;
                            cybVar3 = cybVar;
                            j13 = j7;
                        }
                        j6 = j13;
                        boolean z14 = z13;
                        i3 = z14;
                        if (f()) {
                            this.u0 = c2.a.o();
                            i3 = z14;
                            if (!c2.g()) {
                                vr6Var5.s(c2);
                                t(z14);
                                C();
                                i3 = z14;
                            }
                        }
                    }
                }
                boolean z15 = this.P;
                e79[] e79VarArr3 = this.a;
                vr6 vr6Var6 = this.H;
                d = vr6Var6.d();
                if (d != null) {
                    if (d.m != null && !this.c0) {
                        tr6 d3 = vr6Var6.d();
                        if (d3.e) {
                            e79[] e79VarArr4 = this.a;
                            int length = e79VarArr4.length;
                            int i12 = i3;
                            while (true) {
                                if (i12 < length) {
                                    e79 e79Var3 = e79VarArr4[i12];
                                    if (!e79Var3.e(d3, e79Var3.a) || !e79Var3.e(d3, e79Var3.c)) {
                                        break;
                                    } else {
                                        i12++;
                                    }
                                } else if (!f() || vr6Var6.c() != vr6Var6.d()) {
                                    tr6 tr6Var11 = d.m;
                                    if (tr6Var11.e || this.n0 >= tr6Var11.e()) {
                                        boolean z16 = d.m.e;
                                        if (z16) {
                                            gre.p(z16);
                                        }
                                        cyb cybVar4 = d.o;
                                        int i13 = i3;
                                        while (true) {
                                            tr6VarArr = vr6Var6.j;
                                            if (i13 >= tr6VarArr.length) {
                                                break;
                                            }
                                            tr6[] tr6VarArr3 = vr6Var6.k;
                                            tr6 tr6Var12 = tr6VarArr3[i13];
                                            tr6 tr6Var13 = tr6VarArr[i13];
                                            if (tr6Var12 == tr6Var13) {
                                                tr6Var13.getClass();
                                                tr6VarArr3[i13] = tr6Var13.m;
                                            }
                                            tr6 tr6Var14 = tr6VarArr[i13];
                                            tr6Var14.getClass();
                                            tr6VarArr[i13] = tr6Var14.m;
                                            vr6Var6.q();
                                            tr6VarArr[i13].getClass();
                                            i13++;
                                        }
                                        tr6 tr6Var15 = tr6VarArr[i3];
                                        tr6Var15.getClass();
                                        cyb cybVar5 = tr6Var15.o;
                                        aob aobVar = this.Y.a;
                                        long j14 = j5;
                                        C0(aobVar, tr6Var15.g.a, aobVar, d.g.a, -9223372036854775807L, false);
                                        if (tr6Var15.e && ((z15 && this.u0 != j14) || tr6Var15.a.o() != j14)) {
                                            this.u0 = j14;
                                            boolean z17 = z15 && !this.v0;
                                            if (z17) {
                                                int i14 = 0;
                                                while (true) {
                                                    if (i14 >= e79VarArr3.length) {
                                                        break;
                                                    }
                                                    boolean q = cybVar5.q(i14);
                                                    k64[] k64VarArr = (k64[]) cybVar5.d;
                                                    if (q && e79VarArr3[i14].a.b != -2 && !ud7.a(k64VarArr[i14].o().t, k64VarArr[i14].o().l) && !e79VarArr3[i14].g()) {
                                                        z17 = false;
                                                        break;
                                                    }
                                                    i14++;
                                                }
                                            }
                                            if (!z17) {
                                                long e2 = tr6Var15.e();
                                                int length2 = e79VarArr3.length;
                                                int i15 = 0;
                                                while (i15 < length2) {
                                                    e79 e79Var4 = e79VarArr3[i15];
                                                    ug0 ug0Var2 = e79Var4.c;
                                                    ug0 ug0Var3 = e79Var4.a;
                                                    if (e79.k(ug0Var3) && (b6 = e79Var4.d) != 5 && b6 != 2) {
                                                        e79.o(ug0Var3, e2);
                                                    }
                                                    if (ug0Var2 == null || ug0Var2.n == 0 || (b5 = e79Var4.d) == 4 || b5 == 3) {
                                                        tr6Var4 = tr6Var15;
                                                    } else {
                                                        tr6Var4 = tr6Var15;
                                                        e79.o(ug0Var2, e2);
                                                    }
                                                    i15++;
                                                    tr6Var15 = tr6Var4;
                                                }
                                                tr6 tr6Var16 = tr6Var15;
                                                if (!tr6Var16.g()) {
                                                    vr6Var6.s(tr6Var16);
                                                    t(false);
                                                    C();
                                                }
                                            }
                                        }
                                        for (e79 e79Var5 : e79VarArr3) {
                                            long e3 = tr6Var15.e();
                                            ug0 ug0Var4 = e79Var5.a;
                                            int i16 = e79Var5.b;
                                            boolean q2 = cybVar4.q(i16);
                                            boolean q3 = cybVar5.q(i16);
                                            ug0 ug0Var5 = e79Var5.c;
                                            if (ug0Var5 == null || (b4 = e79Var5.d) == 4 || b4 == 3 || (b4 == 0 && e79.k(ug0Var4))) {
                                                ug0Var5 = ug0Var4;
                                            }
                                            if (q2 && !ug0Var5.E) {
                                                boolean z18 = ug0Var4.b == -2;
                                                d79 d79Var = ((d79[]) cybVar4.c)[i16];
                                                d79 d79Var2 = ((d79[]) cybVar5.c)[i16];
                                                if (!q3 || !Objects.equals(d79Var2, d79Var) || z18 || e79Var5.g()) {
                                                    e79.o(ug0Var5, e3);
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    } else if (d.g.i || this.c0) {
                        for (e79 e79Var6 : e79VarArr3) {
                            if (e79Var6.i(d)) {
                                ug0 d4 = e79Var6.d(d);
                                d4.getClass();
                                if (d4.m()) {
                                    long j15 = d.g.e;
                                    long j16 = (j15 == j5 || j15 == Long.MIN_VALUE) ? j5 : j15 + d.p;
                                    ug0 d5 = e79Var6.d(d);
                                    d5.getClass();
                                    e79.o(d5, j16);
                                }
                            }
                        }
                    }
                }
                vr6 vr6Var7 = this.H;
                d2 = vr6Var7.d();
                if (d2 != null && vr6Var7.i != d2) {
                    for (i7 = 0; i7 < this.a.length; i7++) {
                        if (!d2.h[i7]) {
                            tr6 d6 = vr6Var7.d();
                            cyb cybVar6 = d6.o;
                            e79[] e79VarArr5 = this.a;
                            boolean z19 = true;
                            for (e79 e79Var7 : e79VarArr5) {
                                int c3 = e79Var7.c();
                                mb3 mb3Var = this.y;
                                int m = e79Var7.m(e79Var7.a, d6, cybVar6, mb3Var);
                                int m2 = e79Var7.m(e79Var7.c, d6, cybVar6, mb3Var);
                                if (m == 1) {
                                    m = m2;
                                }
                                if ((m & 2) != 0 && (z10 = this.k0) && z10) {
                                    this.k0 = false;
                                    if (this.Y.p) {
                                        this.h.h(2);
                                    }
                                }
                                this.l0 -= c3 - e79Var7.c();
                                z19 &= (m & 1) != 0;
                            }
                            if (z19) {
                                for (int i17 = 0; i17 < e79VarArr5.length; i17++) {
                                    if (cybVar6.q(i17) && !e79VarArr5[i17].i(d6)) {
                                        j(d6, i17, false, d6.e());
                                    }
                                }
                            }
                            b2 = 3;
                            if (z19) {
                                a0(vr6Var7.d());
                            }
                            e79VarArr = this.a;
                            vr6Var = this.H;
                            z8 = false;
                            loop9: while (s0() && !this.c0 && (tr6Var2 = vr6Var.i) != null && (tr6Var3 = tr6Var2.m) != null && this.n0 >= tr6Var3.e()) {
                                for (i4 = 0; i4 < this.a.length; i4++) {
                                    if (!tr6Var3.h[i4]) {
                                        break loop9;
                                    }
                                }
                                if (z8) {
                                    E(-1);
                                }
                                this.v0 = false;
                                a = vr6Var.a();
                                a.getClass();
                                if (this.Y.b.a.equals(a.g.a.a)) {
                                    rx6 rx6Var = this.Y.b;
                                    if (rx6Var.b == -1) {
                                        rx6 rx6Var2 = a.g.a;
                                        if (rx6Var2.b == -1 && rx6Var.e != rx6Var2.e) {
                                            z9 = true;
                                            ur6 ur6Var2 = a.g;
                                            rx6 rx6Var3 = ur6Var2.a;
                                            boolean z20 = z9;
                                            long j17 = ur6Var2.b;
                                            b3 = b2;
                                            this.Y = x(rx6Var3, j17, ur6Var2.d, j17, !z20, 0);
                                            P();
                                            B0();
                                            for (i5 = 0; i5 < e79VarArr.length; i5++) {
                                                if ((!this.P ? false : this.a[i5].g()) && a == vr6Var.k[i5]) {
                                                    e79 e79Var8 = e79VarArr[i5];
                                                    byte b7 = e79Var8.d;
                                                    if (b7 == 4 || b7 == 5) {
                                                        boolean z21 = b7 == 5;
                                                        ug0 ug0Var6 = e79Var8.a;
                                                        ug0 ug0Var7 = e79Var8.c;
                                                        if (z21) {
                                                            ug0Var7.getClass();
                                                            ug0Var7.d(17, ug0Var6);
                                                        } else {
                                                            ug0Var7.getClass();
                                                            ug0Var6.d(17, ug0Var7);
                                                        }
                                                        e79Var8.d = e79Var8.d == 5 ? (byte) 0 : (byte) 1;
                                                    } else if (b7 == 2) {
                                                        e79Var8.d = (byte) 0;
                                                    } else if (b7 == b3) {
                                                        e79Var8.d = (byte) 1;
                                                    }
                                                }
                                            }
                                            if (this.Y.e == b3) {
                                                u0();
                                            }
                                            cyb cybVar7 = vr6Var.i.o;
                                            for (i6 = 0; i6 < e79VarArr.length; i6++) {
                                                if (cybVar7.q(i6)) {
                                                    e79 e79Var9 = e79VarArr[i6];
                                                    ug0 ug0Var8 = e79Var9.c;
                                                    ug0 ug0Var9 = e79Var9.a;
                                                    if (e79.k(ug0Var9)) {
                                                        ug0Var9.f();
                                                    } else if (ug0Var8 != null && ug0Var8.n != 0) {
                                                        ug0Var8.f();
                                                    }
                                                }
                                            }
                                            b2 = b3;
                                            z8 = true;
                                        }
                                    }
                                }
                                z9 = false;
                                ur6 ur6Var22 = a.g;
                                rx6 rx6Var32 = ur6Var22.a;
                                boolean z202 = z9;
                                long j172 = ur6Var22.b;
                                b3 = b2;
                                this.Y = x(rx6Var32, j172, ur6Var22.d, j172, !z202, 0);
                                P();
                                B0();
                                while (i5 < e79VarArr.length) {
                                }
                                if (this.Y.e == b3) {
                                }
                                cyb cybVar72 = vr6Var.i.o;
                                while (i6 < e79VarArr.length) {
                                }
                                b2 = b3;
                                z8 = true;
                            }
                            i = 5;
                            this.t0.getClass();
                        }
                    }
                }
                b2 = 3;
                e79VarArr = this.a;
                vr6Var = this.H;
                z8 = false;
                loop9: while (s0()) {
                    while (i4 < this.a.length) {
                    }
                    if (z8) {
                    }
                    this.v0 = false;
                    a = vr6Var.a();
                    a.getClass();
                    if (this.Y.b.a.equals(a.g.a.a)) {
                    }
                    z9 = false;
                    ur6 ur6Var222 = a.g;
                    rx6 rx6Var322 = ur6Var222.a;
                    boolean z2022 = z9;
                    long j1722 = ur6Var222.b;
                    b3 = b2;
                    this.Y = x(rx6Var322, j1722, ur6Var222.d, j1722, !z2022, 0);
                    P();
                    B0();
                    while (i5 < e79VarArr.length) {
                    }
                    if (this.Y.e == b3) {
                    }
                    cyb cybVar722 = vr6Var.i.o;
                    while (i6 < e79VarArr.length) {
                    }
                    b2 = b3;
                    z8 = true;
                }
                i = 5;
                this.t0.getClass();
            }
            j6 = 10000000;
            i3 = i9;
            boolean z152 = this.P;
            e79[] e79VarArr32 = this.a;
            vr6 vr6Var62 = this.H;
            d = vr6Var62.d();
            if (d != null) {
            }
            vr6 vr6Var72 = this.H;
            d2 = vr6Var72.d();
            if (d2 != null) {
                while (i7 < this.a.length) {
                }
            }
            b2 = 3;
            e79VarArr = this.a;
            vr6Var = this.H;
            z8 = false;
            loop9: while (s0()) {
            }
            i = 5;
            this.t0.getClass();
        }
        tr6 tr6Var17 = this.H.i;
        long j18 = j;
        if (tr6Var17 == null) {
            U(j18);
            return;
        }
        Trace.beginSection("doSomeWork");
        B0();
        if (tr6Var17.e) {
            this.F.getClass();
            this.o0 = g8c.T(SystemClock.elapsedRealtime());
            tr6Var17.a.m(this.Y.s - this.x);
            int i18 = 0;
            boolean z22 = false;
            z = true;
            z2 = true;
            while (true) {
                e79[] e79VarArr6 = this.a;
                if (i18 >= e79VarArr6.length) {
                    break;
                }
                e79 e79Var10 = e79VarArr6[i18];
                if (e79Var10.c() == 0) {
                    G(i18, false);
                } else {
                    long j19 = this.n0;
                    long j20 = this.o0;
                    ug0 ug0Var10 = e79Var10.c;
                    ug0 ug0Var11 = e79Var10.a;
                    if (e79.k(ug0Var11)) {
                        ug0Var11.B(j19, j20);
                    }
                    if (ug0Var10 != null && ug0Var10.n != 0) {
                        ug0Var10.B(j19, j20);
                    }
                    boolean z23 = z2 && e79Var10.f();
                    boolean z24 = (this.V && e79Var10.j() && ((b = e79Var10.a.b) == 2 || b == 4) && !e79Var10.f()) ? true : z22;
                    ug0 d7 = e79Var10.d(tr6Var17);
                    boolean z25 = d7 == null || d7.m() || d7.o() || d7.n();
                    G(i18, z25);
                    z = z && z25;
                    if (!z25) {
                        F(i18);
                    }
                    z22 = z24;
                    z2 = z23;
                }
                i18++;
            }
            if (this.V && !z22 && !this.h.a.hasMessages(37)) {
                this.h.a(37).b();
            }
        } else {
            tr6Var17.a.k();
            z = true;
            z2 = true;
        }
        long j21 = tr6Var17.g.e;
        if (z2 && tr6Var17.e) {
            j2 = -9223372036854775807L;
            if (j21 == -9223372036854775807L || j21 <= this.Y.s) {
                z3 = true;
                if (z3 && this.c0) {
                    this.c0 = false;
                    int i19 = this.Y.n;
                    this.Z.a(0);
                    A0(this.Q.c(this.Y.e, false), i19, i, false);
                }
                if (z3 || !tr6Var17.g.i) {
                    yb8Var = this.Y;
                    if (yb8Var.e != 2) {
                        vr6 vr6Var8 = this.H;
                        if (this.l0 == 0) {
                            z6 = B();
                            j3 = j2;
                        } else {
                            if (z) {
                                if (yb8Var.g) {
                                    tr6 tr6Var18 = vr6Var8.i;
                                    long j22 = t0(yb8Var.a, tr6Var18.g.a) ? this.J.h : j2;
                                    tr6 tr6Var19 = vr6Var8.l;
                                    boolean z26 = tr6Var19.g() && tr6Var19.g.i;
                                    boolean z27 = tr6Var19.g.a.c() && !tr6Var19.e;
                                    if (!z26 && !z27) {
                                        long o = o(tr6Var19.d());
                                        lb3 lb3Var2 = this.f;
                                        uc8 uc8Var2 = this.L;
                                        aob aobVar2 = this.Y.a;
                                        rx6 rx6Var4 = tr6Var18.g.a;
                                        float f = this.y.g().a;
                                        j3 = j2;
                                        boolean z28 = this.Y.l;
                                        boolean z29 = this.d0;
                                        lb3Var2.getClass();
                                        long j23 = j22;
                                        xq6 xq6Var = aobVar2.m(aobVar2.g(rx6Var4.a, lb3Var2.b).c, lb3Var2.a, 0L).b.b;
                                        if (xq6Var != null) {
                                            String scheme = xq6Var.a.getScheme();
                                            if (TextUtils.isEmpty(scheme) || lb3.q.contains(scheme)) {
                                                z5 = true;
                                                long H = g8c.H(o, f);
                                                j4 = !z29 ? z5 ? lb3Var2.k : lb3Var2.j : z5 ? lb3Var2.i : lb3Var2.h;
                                                if (j23 != j3) {
                                                    j4 = Math.min(j23 / 2, j4);
                                                }
                                                if (j4 > 0 && H < j4) {
                                                    if (!(!z5 ? lb3Var2.l : false)) {
                                                        int b8 = lb3Var2.b(uc8Var2);
                                                        kb3 kb3Var = (kb3) lb3Var2.o.get(uc8Var2);
                                                        kb3Var.getClass();
                                                    }
                                                }
                                                z6 = true;
                                            }
                                        }
                                        z5 = false;
                                        long H2 = g8c.H(o, f);
                                        if (!z29) {
                                        }
                                        if (j23 != j3) {
                                        }
                                        if (j4 > 0) {
                                            if (!(!z5 ? lb3Var2.l : false)) {
                                            }
                                        }
                                        z6 = true;
                                    }
                                }
                                j3 = j2;
                                z6 = true;
                            } else {
                                j3 = j2;
                            }
                            z6 = false;
                        }
                        if (z6) {
                            o0(3);
                            this.r0 = null;
                            if (s0()) {
                                D0(false, false);
                                mb3 mb3Var2 = this.y;
                                z4 = true;
                                mb3Var2.b = true;
                                ((ie2) mb3Var2.c).c();
                                u0();
                                if (this.Y.e == 2) {
                                    int i20 = 0;
                                    while (true) {
                                        e79[] e79VarArr7 = this.a;
                                        if (i20 >= e79VarArr7.length) {
                                            break;
                                        }
                                        if (e79VarArr7[i20].i(tr6Var17)) {
                                            F(i20);
                                        }
                                        i20++;
                                    }
                                    yb8 yb8Var5 = this.Y;
                                    if (!yb8Var5.g && yb8Var5.r < 500000 && y(this.H.l) && s0()) {
                                        long j24 = this.s0;
                                        adb adbVar = this.F;
                                        if (j24 == -9223372036854775807L) {
                                            adbVar.getClass();
                                            this.s0 = SystemClock.elapsedRealtime();
                                        } else {
                                            adbVar.getClass();
                                            if (SystemClock.elapsedRealtime() - this.s0 >= 4000) {
                                                throw new aab(0, 4000);
                                            }
                                        }
                                        boolean z30 = (s0() || this.Y.e != 3) ? false : z4;
                                        z7 = (!this.k0 && this.j0 && z30) ? z4 : false;
                                        yb8Var2 = this.Y;
                                        if (yb8Var2.p != z7) {
                                            yb8Var2 = yb8Var2.i(z7);
                                            this.Y = yb8Var2;
                                        }
                                        this.j0 = false;
                                        if (!z7 && (i2 = yb8Var2.e) != 4 && (z30 || i2 == 2 || (i2 == 3 && this.l0 != 0))) {
                                            U(j18);
                                        }
                                        Trace.endSection();
                                    }
                                }
                                this.s0 = -9223372036854775807L;
                                if (s0()) {
                                }
                                if (!this.k0) {
                                }
                                yb8Var2 = this.Y;
                                if (yb8Var2.p != z7) {
                                }
                                this.j0 = false;
                                if (!z7) {
                                    U(j18);
                                }
                                Trace.endSection();
                            }
                        }
                    } else {
                        j3 = j2;
                    }
                    z4 = true;
                    if (this.Y.e == 3 && (this.l0 != 0 ? !z : !B())) {
                        D0(s0(), false);
                        o0(2);
                        if (this.d0) {
                            for (tr6 tr6Var20 = this.H.i; tr6Var20 != null; tr6Var20 = tr6Var20.m) {
                                for (k64 k64Var : (k64[]) tr6Var20.o.d) {
                                    if (k64Var != null) {
                                        k64Var.u();
                                    }
                                }
                            }
                            jb3 jb3Var = this.J;
                            long j25 = jb3Var.h;
                            if (j25 != j3) {
                                long j26 = j25 + jb3Var.b;
                                jb3Var.h = j26;
                                long j27 = jb3Var.g;
                                if (j27 != j3 && j26 > j27) {
                                    jb3Var.h = j27;
                                }
                                jb3Var.l = j3;
                            }
                        }
                        w0();
                    }
                    if (this.Y.e == 2) {
                    }
                    this.s0 = -9223372036854775807L;
                    if (s0()) {
                    }
                    if (!this.k0) {
                    }
                    yb8Var2 = this.Y;
                    if (yb8Var2.p != z7) {
                    }
                    this.j0 = false;
                    if (!z7) {
                    }
                    Trace.endSection();
                }
                o0(4);
                w0();
                z4 = true;
                if (this.Y.e == 2) {
                }
                this.s0 = -9223372036854775807L;
                if (s0()) {
                }
                if (!this.k0) {
                }
                yb8Var2 = this.Y;
                if (yb8Var2.p != z7) {
                }
                this.j0 = false;
                if (!z7) {
                }
                Trace.endSection();
            }
        } else {
            j2 = -9223372036854775807L;
        }
        z3 = false;
        if (z3) {
            this.c0 = false;
            int i192 = this.Y.n;
            this.Z.a(0);
            A0(this.Q.c(this.Y.e, false), i192, i, false);
        }
        if (z3) {
        }
        yb8Var = this.Y;
        if (yb8Var.e != 2) {
        }
        z4 = true;
        if (this.Y.e == 3) {
            D0(s0(), false);
            o0(2);
            if (this.d0) {
            }
            w0();
        }
        if (this.Y.e == 2) {
        }
        this.s0 = -9223372036854775807L;
        if (s0()) {
        }
        if (!this.k0) {
        }
        yb8Var2 = this.Y;
        if (yb8Var2.p != z7) {
        }
        this.j0 = false;
        if (!z7) {
        }
        Trace.endSection();
    }

    public final void i0(l54 l54Var) {
        this.t0 = l54Var;
        aob aobVar = this.Y.a;
        vr6 vr6Var = this.H;
        vr6Var.getClass();
        l54Var.getClass();
        if (vr6Var.q.isEmpty()) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < vr6Var.q.size(); i++) {
            ((tr6) vr6Var.q.get(i)).i();
        }
        vr6Var.q = arrayList;
        vr6Var.m = null;
        vr6Var.p();
    }

    public final void j(tr6 tr6Var, int i, boolean z, long j) {
        e79 e79Var = this.a[i];
        boolean j2 = e79Var.j();
        ug0 ug0Var = e79Var.a;
        if (j2) {
            return;
        }
        boolean z2 = tr6Var == this.H.i;
        cyb cybVar = tr6Var.o;
        d79 d79Var = ((d79[]) cybVar.c)[i];
        k64 k64Var = ((k64[]) cybVar.d)[i];
        boolean z3 = s0() && this.Y.e == 3;
        boolean z4 = !z && z3;
        this.l0++;
        ip9 ip9Var = tr6Var.c[i];
        long j3 = tr6Var.p;
        rx6 rx6Var = tr6Var.g.a;
        ug0 ug0Var2 = e79Var.c;
        int length = k64Var != null ? k64Var.length() : 0;
        fm4[] fm4VarArr = new fm4[length];
        for (int i2 = 0; i2 < length; i2++) {
            k64Var.getClass();
            fm4VarArr[i2] = k64Var.i(i2);
        }
        byte b = e79Var.d;
        mb3 mb3Var = this.y;
        if (b == 0 || b == 2 || b == 5) {
            e79Var.e = true;
            gre.p(ug0Var.n == 0);
            ug0Var.d = d79Var;
            ug0Var.H = rx6Var;
            ug0Var.n = (byte) 1;
            ug0Var.r(z4, z2);
            ug0Var.C(fm4VarArr, ip9Var, j, j3, rx6Var);
            ug0Var.D(j, z4, true);
            mb3Var.f(ug0Var);
        } else {
            e79Var.f = true;
            ug0Var2.getClass();
            gre.p(ug0Var2.n == 0);
            ug0Var2.d = d79Var;
            ug0Var2.H = rx6Var;
            ug0Var2.n = (byte) 1;
            ug0Var2.r(z4, z2);
            ug0Var2.C(fm4VarArr, ip9Var, j, j3, rx6Var);
            ug0Var2.D(j, z4, true);
            mb3Var.f(ug0Var2);
        }
        c64 c64Var = new c64(this);
        ug0 d = e79Var.d(tr6Var);
        d.getClass();
        d.d(11, c64Var);
        if (z3 && z2) {
            e79Var.p();
        }
    }

    public final void j0(int i) {
        this.g0 = i;
        aob aobVar = this.Y.a;
        vr6 vr6Var = this.H;
        vr6Var.g = i;
        int w = vr6Var.w(aobVar);
        if ((w & 1) != 0) {
            V(true);
        } else if ((w & 2) != 0) {
            g();
        }
        t(false);
    }

    public final void k(long j, boolean[] zArr) {
        e79[] e79VarArr;
        i64 i64Var;
        long j2;
        gre.p(!z());
        tr6 d = this.H.d();
        cyb cybVar = d.o;
        int i = 0;
        while (true) {
            e79VarArr = this.a;
            if (i >= e79VarArr.length) {
                break;
            }
            if (!cybVar.q(i)) {
                e79VarArr[i].n();
            }
            i++;
        }
        int i2 = 0;
        while (i2 < e79VarArr.length) {
            if (!cybVar.q(i2) || e79VarArr[i2].i(d)) {
                i64Var = this;
                j2 = j;
            } else {
                i64Var = this;
                j2 = j;
                i64Var.j(d, i2, zArr[i2], j2);
            }
            i2++;
            this = i64Var;
            j = j2;
        }
    }

    public final void k0(boolean z) {
        if (!z) {
            h64 h64Var = this.W;
            cdb cdbVar = this.h;
            if (h64Var != null && this.V && !cdbVar.a.hasMessages(37)) {
                this.X++;
            }
            int i = this.X;
            if (i > 0) {
                this.O.e(new sm3((Object) this, i, (byte) 5));
            }
            this.X = 0;
            this.V = false;
            cdbVar.g(37);
            h64 h64Var2 = this.W;
            if (h64Var2 != null) {
                W(h64Var2);
                this.W = null;
                this.V = false;
            }
        }
        this.U = z;
        e();
    }

    public final long l(aob aobVar, Object obj, long j) {
        xnb xnbVar = this.w;
        int i = aobVar.g(obj, xnbVar).c;
        znb znbVar = this.s;
        aobVar.n(i, znbVar);
        if (znbVar.e != -9223372036854775807L && znbVar.a() && znbVar.h) {
            return g8c.T(g8c.E(znbVar.f) - znbVar.e) - (j + xnbVar.e);
        }
        return -9223372036854775807L;
    }

    public final void l0(mr9 mr9Var) {
        this.T = mr9Var;
        e();
    }

    public final Pair m(aob aobVar) {
        long j = 0;
        if (aobVar.p()) {
            return Pair.create(yb8.u, 0L);
        }
        int a = aobVar.a(this.h0);
        Pair i = aobVar.i(this.s, this.w, a, -9223372036854775807L);
        rx6 u = this.H.u(this.Y, aobVar, i.first, 0L, true, false);
        long longValue = ((Long) i.second).longValue();
        if (u.c()) {
            Object obj = u.a;
            xnb xnbVar = this.w;
            aobVar.g(obj, xnbVar);
            if (u.c == xnbVar.e(u.b)) {
                da daVar = da.c;
            }
        } else {
            j = longValue;
        }
        return Pair.create(u, Long.valueOf(j));
    }

    public final void m0(boolean z) {
        this.h0 = z;
        aob aobVar = this.Y.a;
        vr6 vr6Var = this.H;
        vr6Var.h = z;
        int w = vr6Var.w(aobVar);
        if ((w & 1) != 0) {
            V(true);
        } else if ((w & 2) != 0) {
            g();
        }
        t(false);
    }

    public final long n(tr6 tr6Var, int i) {
        if (tr6Var == null) {
            return 0L;
        }
        if (tr6Var.e) {
            e79[] e79VarArr = this.a;
            if (e79VarArr[i].i(tr6Var)) {
                ug0 d = e79VarArr[i].d(tr6Var);
                Objects.requireNonNull(d);
                return d.y;
            }
        }
        return tr6Var.p;
    }

    public final void n0(wga wgaVar) {
        this.Z.a(1);
        ey6 ey6Var = this.I;
        int size = ey6Var.c.size();
        if (wgaVar.c() != size) {
            wgaVar = wgaVar.a().b(0, size);
        }
        ey6Var.k = wgaVar;
        u(ey6Var.b(), false);
    }

    public final long o(long j) {
        tr6 tr6Var = this.H.l;
        if (tr6Var == null) {
            return 0L;
        }
        return Math.max(0L, j - (this.n0 - tr6Var.p));
    }

    public final void o0(int i) {
        yb8 yb8Var = this.Y;
        if (yb8Var.e != i) {
            if (i != 2) {
                this.s0 = -9223372036854775807L;
            }
            if (i != 3 && yb8Var.p) {
                yb8Var = yb8Var.i(false);
                this.Y = yb8Var;
            }
            this.Y = yb8Var.h(i);
        }
    }

    public final void p(int i) {
        yb8 yb8Var = this.Y;
        A0(i, yb8Var.n, yb8Var.m, yb8Var.l);
    }

    public final void p0(sac sacVar) {
        for (e79 e79Var : this.a) {
            ug0 ug0Var = e79Var.a;
            byte b = ug0Var.b;
            if (b == 2 || b == 4) {
                ug0Var.d(7, sacVar);
                ug0 ug0Var2 = e79Var.c;
                if (ug0Var2 != null) {
                    ug0Var2.d(7, sacVar);
                }
            }
        }
    }

    public final void q() {
        r0(this.w0);
    }

    public final void q0(Object obj, vq2 vq2Var) {
        for (e79 e79Var : this.a) {
            ug0 ug0Var = e79Var.a;
            if (ug0Var.b == 2) {
                byte b = e79Var.d;
                if (b == 5 || b == 3 || b == 1) {
                    ug0 ug0Var2 = e79Var.c;
                    ug0Var2.getClass();
                    ug0Var2.d(1, obj);
                } else {
                    ug0Var.d(1, obj);
                }
            }
        }
        int i = this.Y.e;
        if (i == 3 || i == 2) {
            this.h.h(2);
        }
        if (vq2Var != null) {
            vq2Var.e();
        }
    }

    public final void r(sr6 sr6Var) {
        vr6 vr6Var = this.H;
        tr6 tr6Var = vr6Var.l;
        if (tr6Var != null && tr6Var.a == sr6Var) {
            vr6Var.r(this.n0);
            C();
            return;
        }
        tr6 tr6Var2 = vr6Var.m;
        if (tr6Var2 == null || tr6Var2.a != sr6Var) {
            return;
        }
        D();
    }

    public final void r0(float f) {
        this.w0 = f;
        float f2 = f * this.Q.g;
        for (e79 e79Var : this.a) {
            ug0 ug0Var = e79Var.a;
            if (ug0Var.b == 1) {
                ug0Var.d(2, Float.valueOf(f2));
                ug0 ug0Var2 = e79Var.c;
                if (ug0Var2 != null) {
                    ug0Var2.d(2, Float.valueOf(f2));
                }
            }
        }
    }

    public final void s(IOException iOException, int i) {
        j54 j54Var = new j54(0, iOException, i);
        tr6 tr6Var = this.H.i;
        if (tr6Var != null) {
            j54Var = j54Var.a(tr6Var.g.a);
        }
        lad.d("ExoPlayerImplInternal", "Playback error", j54Var);
        v0(false, false);
        this.Y = this.Y.f(j54Var);
    }

    public final boolean s0() {
        yb8 yb8Var = this.Y;
        return yb8Var.l && yb8Var.n == 0;
    }

    public final void t(boolean z) {
        tr6 tr6Var = this.H.l;
        rx6 rx6Var = tr6Var == null ? this.Y.b : tr6Var.g.a;
        boolean equals = this.Y.k.equals(rx6Var);
        if (!equals) {
            this.Y = this.Y.c(rx6Var);
        }
        yb8 yb8Var = this.Y;
        yb8Var.q = tr6Var == null ? yb8Var.s : tr6Var.d();
        yb8 yb8Var2 = this.Y;
        yb8Var2.r = o(yb8Var2.q);
        if ((!equals || z) && tr6Var != null && tr6Var.e) {
            y0(tr6Var.g.a, tr6Var.o);
        }
    }

    public final boolean t0(aob aobVar, rx6 rx6Var) {
        if (rx6Var.c() || aobVar.p()) {
            return false;
        }
        int i = aobVar.g(rx6Var.a, this.w).c;
        znb znbVar = this.s;
        aobVar.n(i, znbVar);
        return znbVar.a() && znbVar.h && znbVar.e != -9223372036854775807L;
    }

    /* JADX WARN: Code restructure failed: missing block: B:202:0x0303, code lost:
    
        if (r6 != 2) goto L149;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0418  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0463  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0439  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x043c  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x041a  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0480  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x04cb  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x049f  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x04a1  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0482  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void u(aob aobVar, boolean z) {
        vr6 vr6Var;
        boolean z2;
        rx6 rx6Var;
        long j;
        aob aobVar2;
        znb znbVar;
        long j2;
        int i;
        long j3;
        int i2;
        boolean z3;
        boolean z4;
        boolean z5;
        int i3;
        boolean z6;
        yb8 yb8Var;
        xnb xnbVar;
        boolean z7;
        vr6 vr6Var2;
        long j4;
        aob aobVar3;
        long j5;
        long j6;
        int i4;
        aob aobVar4;
        g64 g64Var;
        int i5;
        long longValue;
        boolean z8;
        boolean z9;
        boolean z10;
        boolean z11;
        aob aobVar5;
        rx6 rx6Var2;
        e79[] e79VarArr;
        vr6 vr6Var3;
        boolean z12;
        long j7;
        long j8;
        yb8 yb8Var2 = this.Y;
        h64 h64Var = this.m0;
        vr6 vr6Var4 = this.H;
        int i6 = this.g0;
        boolean z13 = this.h0;
        znb znbVar2 = this.s;
        xnb xnbVar2 = this.w;
        boolean z14 = this.R;
        if (aobVar.p()) {
            rx6 rx6Var3 = yb8.u;
            boolean z15 = (rx6Var3.equals(yb8Var2.b) && yb8Var2.s == 0) ? false : true;
            aobVar3 = aobVar;
            g64Var = new g64(rx6Var3, 0L, -9223372036854775807L, false, true, false, z15, z15 && z && !yb8Var2.a.p() && !yb8Var2.a.g(yb8Var2.b.a, xnbVar2).f, 4);
        } else {
            rx6 rx6Var4 = yb8Var2.b;
            Object obj = rx6Var4.a;
            aob aobVar6 = yb8Var2.a;
            if (aobVar6.p() || aobVar6.g(rx6Var4.a, xnbVar2).f) {
                vr6Var = vr6Var4;
                z2 = true;
            } else {
                vr6Var = vr6Var4;
                z2 = false;
            }
            long j9 = (yb8Var2.b.c() || z2) ? yb8Var2.c : yb8Var2.s;
            if (h64Var != null) {
                rx6Var = rx6Var4;
                j = 1;
                aobVar2 = aobVar;
                Pair S = S(aobVar2, h64Var, true, i6, z13, znbVar2, xnbVar2);
                if (S == null) {
                    i = aobVar2.a(z13);
                    longValue = j9;
                    z11 = true;
                    z10 = false;
                    z9 = false;
                } else {
                    long j10 = h64Var.c;
                    Object obj2 = S.first;
                    if (j10 == -9223372036854775807L) {
                        i = aobVar2.g(obj2, xnbVar2).c;
                        longValue = j9;
                        z8 = false;
                    } else {
                        longValue = ((Long) S.second).longValue();
                        obj = obj2;
                        i = -1;
                        z8 = true;
                    }
                    z9 = yb8Var2.e == 4;
                    z10 = z8;
                    z11 = false;
                }
                z4 = z11;
                z5 = z10;
                z3 = z9;
                i2 = -1;
                long j11 = longValue;
                znbVar = znbVar2;
                j2 = j11;
            } else {
                rx6Var = rx6Var4;
                j = 1;
                aobVar2 = aobVar;
                if (yb8Var2.a.p()) {
                    i = aobVar2.a(z13);
                    znbVar = znbVar2;
                } else if (aobVar2.b(obj) == -1) {
                    int T = T(znbVar2, xnbVar2, i6, z13, obj, yb8Var2.a, aobVar2);
                    znbVar = znbVar2;
                    aobVar2 = aobVar2;
                    xnbVar2 = xnbVar2;
                    if (T == -1) {
                        i3 = aobVar2.a(z13);
                        z6 = true;
                    } else {
                        i3 = T;
                        z6 = false;
                    }
                    z4 = z6;
                    obj = obj;
                    i = i3;
                    j2 = j9;
                    i2 = -1;
                    z3 = false;
                    z5 = false;
                } else {
                    znbVar = znbVar2;
                    if (j9 == -9223372036854775807L) {
                        int i7 = aobVar2.g(obj, xnbVar2).c;
                        obj = obj;
                        i = i7;
                    } else if (z2) {
                        yb8Var2.a.g(rx6Var.a, xnbVar2);
                        if (yb8Var2.a.m(xnbVar2.c, znbVar, 0L).m == yb8Var2.a.b(rx6Var.a)) {
                            Pair i8 = aobVar2.i(znbVar, xnbVar2, aobVar2.g(obj, xnbVar2).c, j9 + xnbVar2.e);
                            obj = i8.first;
                            j3 = ((Long) i8.second).longValue();
                        } else if (aobVar2.g(obj, xnbVar2).d != -9223372036854775807L) {
                            j3 = g8c.j(j9, 0L, xnbVar2.d - 1);
                            obj = obj;
                        } else {
                            obj = obj;
                            j3 = j9;
                        }
                        j2 = j3;
                        i = -1;
                        i2 = -1;
                        z3 = false;
                        z4 = false;
                        z5 = true;
                    } else {
                        obj = obj;
                        j2 = j9;
                        i = -1;
                        i2 = -1;
                        z3 = false;
                        z4 = false;
                        z5 = false;
                    }
                }
                j2 = j9;
                i2 = -1;
                z3 = false;
                z4 = false;
                z5 = false;
            }
            if (i != i2) {
                Pair i9 = aobVar2.i(znbVar, xnbVar2, i, -9223372036854775807L);
                obj = i9.first;
                j2 = ((Long) i9.second).longValue();
                yb8Var = yb8Var2;
                xnbVar = xnbVar2;
                z7 = z14;
                vr6Var2 = vr6Var;
                j4 = -9223372036854775807L;
            } else {
                yb8Var = yb8Var2;
                xnbVar = xnbVar2;
                z7 = z14;
                vr6Var2 = vr6Var;
                j4 = j2;
            }
            Object obj3 = obj;
            rx6 u = vr6Var2.u(yb8Var, aobVar, obj3, j2, z7, z2);
            yb8 yb8Var3 = yb8Var;
            aobVar3 = aobVar;
            int i10 = u.e;
            boolean z16 = i10 == i2 || ((i5 = rx6Var.e) != i2 && i10 >= i5);
            boolean equals = rx6Var.a.equals(obj3);
            boolean z17 = equals && !rx6Var.c() && !u.c() && z16;
            if (!z2 && j9 == j4) {
                Object obj4 = rx6Var.a;
                int i11 = rx6Var.b;
                if (obj4.equals(u.a)) {
                    aobVar3.g(u.a, xnbVar);
                    if (rx6Var.c()) {
                        xnbVar.g(i11);
                    }
                    if (u.c()) {
                        xnbVar.g(u.b);
                    }
                }
            }
            if (z17) {
                u = rx6Var;
            }
            if (!u.c()) {
                if (equals && rx6Var.c()) {
                    aobVar3.g(obj3, xnbVar).getClass();
                    ba a = da.c.a(rx6Var.b);
                    a.getClass();
                    long j12 = yb8Var3.c;
                    if (j12 == -9223372036854775807L || 0 > j12) {
                        int i12 = a.a;
                        int i13 = rx6Var.c;
                        if (i12 > i13 && a.d[i13] == 2) {
                            long j13 = aobVar3.g(obj3, xnbVar).d;
                            j5 = j13 != -9223372036854775807L ? Math.min(j13 - j, j2) : j2;
                            j6 = j5;
                        }
                    }
                }
                j5 = j2;
                j6 = j4;
            } else if (u.equals(rx6Var)) {
                j6 = j4;
                j5 = yb8Var3.s;
            } else {
                aobVar3.g(u.a, xnbVar);
                if (u.c == xnbVar.e(u.b)) {
                    da daVar = da.c;
                }
                j6 = j4;
                j5 = 0;
            }
            boolean z18 = (u.equals(yb8Var3.b) && j5 == yb8Var3.s) ? false : true;
            int i14 = aobVar3.b(yb8Var3.b.a) == -1 ? 4 : 3;
            Object obj5 = u.a;
            Object obj6 = yb8Var3.b.a;
            boolean equals2 = obj5.equals(obj6);
            aob aobVar7 = obj6;
            if (equals2) {
                aobVar7 = obj6;
                if (u.b != -1) {
                    aobVar3.g(u.a, xnbVar).getClass();
                    ba a2 = da.c.a(u.b);
                    int i15 = u.c;
                    int[] iArr = a2.d;
                    if (i15 < iArr.length) {
                        int i16 = iArr[i15];
                        aobVar7 = i15;
                    }
                    i4 = 0;
                    aobVar4 = i15;
                    g64Var = new g64(u, j5, j6, z3, z4, z5, z18, (z18 || !z || yb8Var3.a.p() || yb8Var3.a.g(yb8Var3.b.a, xnbVar).f) ? false : true, i4);
                }
            }
            i4 = i14;
            aobVar4 = aobVar7;
            g64Var = new g64(u, j5, j6, z3, z4, z5, z18, (z18 || !z || yb8Var3.a.p() || yb8Var3.a.g(yb8Var3.b.a, xnbVar).f) ? false : true, i4);
        }
        rx6 rx6Var5 = g64Var.a;
        long j14 = g64Var.b;
        try {
            if (g64Var.e) {
                if (this.Y.e != 1) {
                    o0(4);
                }
                O(false, false, false, true);
            }
            e79[] e79VarArr2 = this.a;
            int length = e79VarArr2.length;
            int i17 = 0;
            aob aobVar8 = aobVar4;
            while (i17 < length) {
                e79 e79Var = e79VarArr2[i17];
                ug0 ug0Var = e79Var.a;
                boolean equals3 = ug0Var.G.equals(aobVar3);
                if (equals3 == 0) {
                    ug0Var.G = aobVar3;
                    ug0Var.J();
                    ug0Var.z();
                }
                ug0 ug0Var2 = e79Var.c;
                if (ug0Var2 != null && !ug0Var2.G.equals(aobVar3)) {
                    ug0Var2.G = aobVar3;
                    ug0Var2.J();
                    ug0Var2.z();
                }
                i17++;
                aobVar8 = equals3;
            }
            try {
                if (g64Var.g) {
                    aob aobVar9 = aobVar3;
                    if (!aobVar9.p()) {
                        try {
                            for (tr6 tr6Var = this.H.i; tr6Var != null; tr6Var = tr6Var.m) {
                                if (tr6Var.g.a.equals(rx6Var5)) {
                                    tr6Var.g = this.H.l(aobVar9, tr6Var.g);
                                }
                            }
                            rx6Var2 = rx6Var5;
                            try {
                                j14 = X(rx6Var2, j14, z(), g64Var.d);
                                yb8 yb8Var4 = this.Y;
                                rx6 rx6Var6 = rx6Var2;
                                C0(aobVar, rx6Var6, yb8Var4.a, yb8Var4.b, !g64Var.f ? j14 : -9223372036854775807L, false);
                                if (!g64Var.g || g64Var.c != this.Y.c) {
                                    long j15 = g64Var.c;
                                    z12 = g64Var.h;
                                    if (z12) {
                                        j7 = this.Y.d;
                                        j8 = j14;
                                    } else {
                                        j8 = j14;
                                        j7 = j8;
                                    }
                                    this.Y = x(rx6Var6, j8, j15, j7, z12, g64Var.i);
                                }
                                P();
                                R(aobVar, this.Y.a);
                                this.Y = this.Y.j(aobVar);
                                if (!aobVar.p()) {
                                    this.m0 = null;
                                }
                                t(false);
                                this.h.h(2);
                            } catch (Throwable th) {
                                th = th;
                                j14 = j14;
                                aobVar5 = aobVar9;
                                yb8 yb8Var5 = this.Y;
                                aob aobVar10 = yb8Var5.a;
                                rx6 rx6Var7 = yb8Var5.b;
                                rx6 rx6Var8 = rx6Var2;
                                C0(aobVar5, rx6Var8, aobVar10, rx6Var7, !g64Var.f ? j14 : -9223372036854775807L, false);
                                if (!g64Var.g) {
                                }
                                long j16 = g64Var.c;
                                boolean z19 = g64Var.h;
                                this.Y = x(rx6Var8, j14, j16, !z19 ? j14 : this.Y.d, z19, g64Var.i);
                                P();
                                R(aobVar5, this.Y.a);
                                this.Y = this.Y.j(aobVar5);
                                if (!aobVar5.p()) {
                                }
                                t(false);
                                this.h.h(2);
                                throw th;
                            }
                        } catch (Throwable th2) {
                            th = th2;
                            rx6Var2 = rx6Var5;
                        }
                    }
                } else {
                    try {
                        long[] jArr = new long[this.a.length];
                        int i18 = 0;
                        while (true) {
                            e79VarArr = this.a;
                            if (i18 >= e79VarArr.length) {
                                break;
                            }
                            jArr[i18] = n(this.H.j[i18], i18);
                            i18++;
                        }
                        long[] jArr2 = new long[e79VarArr.length];
                        int i19 = 0;
                        while (true) {
                            int length2 = this.a.length;
                            vr6Var3 = this.H;
                            if (i19 >= length2) {
                                break;
                            }
                            jArr2[i19] = n(vr6Var3.k[i19], i19);
                            i19++;
                        }
                        int x = vr6Var3.x(aobVar3, this.n0, jArr, jArr2);
                        if ((x & 1) != 0) {
                            V(false);
                        } else if ((x & 2) != 0) {
                            g();
                        }
                    } catch (Throwable th3) {
                        th = th3;
                        aobVar8 = aobVar3;
                        aobVar5 = aobVar8;
                        rx6Var2 = rx6Var5;
                        yb8 yb8Var52 = this.Y;
                        aob aobVar102 = yb8Var52.a;
                        rx6 rx6Var72 = yb8Var52.b;
                        rx6 rx6Var82 = rx6Var2;
                        C0(aobVar5, rx6Var82, aobVar102, rx6Var72, !g64Var.f ? j14 : -9223372036854775807L, false);
                        if (!g64Var.g || g64Var.c != this.Y.c) {
                            long j162 = g64Var.c;
                            boolean z192 = g64Var.h;
                            this.Y = x(rx6Var82, j14, j162, !z192 ? j14 : this.Y.d, z192, g64Var.i);
                        }
                        P();
                        R(aobVar5, this.Y.a);
                        this.Y = this.Y.j(aobVar5);
                        if (!aobVar5.p()) {
                            this.m0 = null;
                        }
                        t(false);
                        this.h.h(2);
                        throw th;
                    }
                }
                rx6Var2 = rx6Var5;
                yb8 yb8Var42 = this.Y;
                rx6 rx6Var62 = rx6Var2;
                C0(aobVar, rx6Var62, yb8Var42.a, yb8Var42.b, !g64Var.f ? j14 : -9223372036854775807L, false);
                if (!g64Var.g) {
                }
                long j152 = g64Var.c;
                z12 = g64Var.h;
                if (z12) {
                }
                this.Y = x(rx6Var62, j8, j152, j7, z12, g64Var.i);
                P();
                R(aobVar, this.Y.a);
                this.Y = this.Y.j(aobVar);
                if (!aobVar.p()) {
                }
                t(false);
                this.h.h(2);
            } catch (Throwable th4) {
                th = th4;
            }
        } catch (Throwable th5) {
            th = th5;
            aobVar5 = aobVar3;
        }
    }

    public final void u0() {
        tr6 tr6Var = this.H.i;
        if (tr6Var == null) {
            return;
        }
        cyb cybVar = tr6Var.o;
        int i = 0;
        while (true) {
            e79[] e79VarArr = this.a;
            if (i >= e79VarArr.length) {
                return;
            }
            if (cybVar.q(i)) {
                e79VarArr[i].p();
            }
            i++;
        }
    }

    public final void v(sr6 sr6Var) {
        tr6 tr6Var;
        i64 i64Var;
        vr6 vr6Var = this.H;
        tr6 tr6Var2 = vr6Var.l;
        mb3 mb3Var = this.y;
        if (tr6Var2 == null || tr6Var2.a != sr6Var) {
            int i = 0;
            while (true) {
                if (i >= vr6Var.q.size()) {
                    tr6Var = null;
                    break;
                }
                tr6Var = (tr6) vr6Var.q.get(i);
                if (tr6Var.a == sr6Var) {
                    break;
                } else {
                    i++;
                }
            }
            if (tr6Var != null) {
                gre.p(!tr6Var.e);
                float f = mb3Var.g().a;
                yb8 yb8Var = this.Y;
                tr6Var.f(f, yb8Var.a, yb8Var.l);
                tr6 tr6Var3 = vr6Var.m;
                if (tr6Var3 == null || tr6Var3.a != sr6Var) {
                    return;
                }
                D();
                return;
            }
            return;
        }
        tr6Var2.getClass();
        if (!tr6Var2.e) {
            float f2 = mb3Var.g().a;
            yb8 yb8Var2 = this.Y;
            tr6Var2.f(f2, yb8Var2.a, yb8Var2.l);
        }
        y0(tr6Var2.g.a, tr6Var2.o);
        if (tr6Var2 == vr6Var.i) {
            Q(tr6Var2.g.b, true);
            gre.p(!z());
            k(vr6Var.d().e(), new boolean[this.a.length]);
            a0(tr6Var2);
            yb8 yb8Var3 = this.Y;
            rx6 rx6Var = yb8Var3.b;
            long j = tr6Var2.g.b;
            i64Var = this;
            i64Var.Y = x(rx6Var, j, yb8Var3.c, j, false, 5);
        } else {
            i64Var = this;
        }
        i64Var.C();
    }

    public final void v0(boolean z, boolean z2) {
        O(z || !this.i0, false, true, false);
        this.Z.a(z2 ? 1 : 0);
        lb3 lb3Var = this.f;
        ConcurrentHashMap concurrentHashMap = lb3Var.o;
        uc8 uc8Var = this.L;
        kb3 kb3Var = (kb3) concurrentHashMap.get(uc8Var);
        if (kb3Var != null) {
            int i = kb3Var.a - 1;
            kb3Var.a = i;
            if (i == 0) {
                concurrentHashMap.remove(uc8Var);
                lb3Var.d();
            }
        }
        this.Q.c(1, this.Y.l);
        o0(1);
    }

    public final void w(zb8 zb8Var, float f, boolean z, boolean z2) {
        int i;
        if (z) {
            if (z2) {
                this.Z.a(1);
            }
            this.Y = this.Y.g(zb8Var);
        }
        float f2 = zb8Var.a;
        tr6 tr6Var = this.H.i;
        while (true) {
            i = 0;
            if (tr6Var == null) {
                break;
            }
            k64[] k64VarArr = (k64[]) tr6Var.o.d;
            int length = k64VarArr.length;
            while (i < length) {
                k64 k64Var = k64VarArr[i];
                if (k64Var != null) {
                    k64Var.r(f2);
                }
                i++;
            }
            tr6Var = tr6Var.m;
        }
        e79[] e79VarArr = this.a;
        int length2 = e79VarArr.length;
        while (i < length2) {
            e79 e79Var = e79VarArr[i];
            float f3 = zb8Var.a;
            e79Var.a.E(f, f3);
            ug0 ug0Var = e79Var.c;
            if (ug0Var != null) {
                ug0Var.E(f, f3);
            }
            i++;
        }
    }

    public final void w0() {
        mb3 mb3Var = this.y;
        mb3Var.b = false;
        ie2 ie2Var = (ie2) mb3Var.c;
        if (ie2Var.c) {
            ie2Var.a(ie2Var.h());
            ie2Var.c = false;
        }
        for (e79 e79Var : this.a) {
            ug0 ug0Var = e79Var.c;
            ug0 ug0Var2 = e79Var.a;
            if (e79.k(ug0Var2)) {
                e79.b(ug0Var2);
            }
            if (ug0Var != null && ug0Var.n != 0) {
                e79.b(ug0Var);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final yb8 x(rx6 rx6Var, long j, long j2, long j3, boolean z, int i) {
        w59 w59Var;
        tr6 tr6Var;
        boolean z2;
        this.q0 = (!this.q0 && j == this.Y.s && rx6Var.equals(this.Y.b)) ? false : true;
        P();
        yb8 yb8Var = this.Y;
        txb txbVar = yb8Var.h;
        cyb cybVar = yb8Var.i;
        List list = yb8Var.j;
        if (this.I.l) {
            tr6 tr6Var2 = this.H.i;
            if (tr6Var2 == null) {
                txbVar = txb.d;
                cybVar = this.e;
            } else {
                txbVar = tr6Var2.n;
                cybVar = tr6Var2.o;
            }
            k64[] k64VarArr = (k64[]) cybVar.d;
            jm5 jm5Var = new jm5(4);
            boolean z3 = false;
            for (k64 k64Var : k64VarArr) {
                if (k64Var != null) {
                    ld7 ld7Var = k64Var.i(0).m;
                    if (ld7Var == null) {
                        jm5Var.c(new ld7(new jd7[0]));
                    } else {
                        jm5Var.c(ld7Var);
                        z3 = true;
                    }
                }
            }
            if (z3) {
                w59Var = jm5Var.f();
            } else {
                km5 km5Var = mm5.b;
                w59Var = w59.e;
            }
            list = w59Var;
            if (tr6Var2 != null) {
                ur6 ur6Var = tr6Var2.g;
                if (ur6Var.d != j2) {
                    tr6Var2.g = ur6Var.a(j2);
                }
            }
            e79[] e79VarArr = this.a;
            if (!z() && (tr6Var = this.H.i) != null) {
                cyb cybVar2 = tr6Var.o;
                int i2 = 0;
                boolean z4 = false;
                while (true) {
                    if (i2 >= e79VarArr.length) {
                        z2 = true;
                        break;
                    }
                    if (cybVar2.q(i2)) {
                        if (e79VarArr[i2].a.b != 1) {
                            z2 = false;
                            break;
                        }
                        if (((d79[]) cybVar2.c)[i2].a != 0) {
                            z4 = true;
                        }
                    }
                    i2++;
                }
                boolean z5 = z4 && z2;
                if (z5 != this.k0) {
                    this.k0 = z5;
                    if (!z5 && this.Y.p) {
                        this.h.h(2);
                    }
                }
            }
        } else if (!rx6Var.equals(yb8Var.b)) {
            txbVar = txb.d;
            cybVar = this.e;
            km5 km5Var2 = mm5.b;
            list = w59.e;
        }
        cyb cybVar3 = cybVar;
        List list2 = list;
        txb txbVar2 = txbVar;
        if (z) {
            f64 f64Var = this.Z;
            if (!f64Var.d || f64Var.e == 5) {
                f64Var.a = true;
                f64Var.d = true;
                f64Var.e = i;
            } else {
                gre.f(i == 5);
            }
        }
        yb8 yb8Var2 = this.Y;
        return yb8Var2.d(rx6Var, j, j2, j3, o(yb8Var2.q), txbVar2, cybVar3, list2);
    }

    public final void x0() {
        tr6 tr6Var = this.H.l;
        boolean z = this.f0 || (tr6Var != null && tr6Var.a.d());
        yb8 yb8Var = this.Y;
        if (z != yb8Var.g) {
            this.Y = yb8Var.b(z);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00c0 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void y0(rx6 rx6Var, cyb cybVar) {
        boolean z;
        int length;
        int i;
        tr6 tr6Var = this.H.l;
        tr6Var.getClass();
        o(tr6Var.d());
        if (t0(this.Y.a, tr6Var.g.a)) {
            long j = this.J.h;
        }
        aob aobVar = this.Y.a;
        float f = this.y.g().a;
        boolean z2 = this.Y.l;
        k64[] k64VarArr = (k64[]) cybVar.d;
        lb3 lb3Var = this.f;
        lb3Var.getClass();
        qm5 qm5Var = lb3Var.n;
        uc8 uc8Var = this.L;
        Integer num = (Integer) qm5Var.get(uc8Var.a);
        int intValue = (num == null || num.intValue() == -1) ? -1 : num.intValue();
        kb3 kb3Var = (kb3) lb3Var.o.get(uc8Var);
        kb3Var.getClass();
        if (intValue == -1) {
            xq6 xq6Var = aobVar.m(aobVar.g(rx6Var.a, lb3Var.b).c, lb3Var.a, 0L).b.b;
            if (xq6Var != null) {
                String scheme = xq6Var.a.getScheme();
                if (TextUtils.isEmpty(scheme) || lb3.q.contains(scheme)) {
                    z = true;
                    length = k64VarArr.length;
                    i = 0;
                    int i2 = 0;
                    while (true) {
                        int i3 = 13107200;
                        if (i >= length) {
                            k64 k64Var = k64VarArr[i];
                            if (k64Var != null) {
                                switch (k64Var.c().c) {
                                    case -2:
                                        i3 = 0;
                                        i2 += i3;
                                        break;
                                    case -1:
                                    case 1:
                                        i2 += i3;
                                        break;
                                    case 0:
                                        i3 = 144310272;
                                        i2 += i3;
                                        break;
                                    case 2:
                                        i3 = z ? 19660800 : 131072000;
                                        i2 += i3;
                                        break;
                                    case 3:
                                    case 5:
                                    case 6:
                                        i3 = 131072;
                                        i2 += i3;
                                        break;
                                    case 4:
                                        i3 = 26214400;
                                        i2 += i3;
                                        break;
                                    default:
                                        sc8.e();
                                        break;
                                }
                                return;
                            }
                            i++;
                        } else {
                            intValue = g8c.i(i2, 13107200, 210239488);
                        }
                    }
                }
            }
            z = false;
            length = k64VarArr.length;
            i = 0;
            int i22 = 0;
            while (true) {
                int i32 = 13107200;
                if (i >= length) {
                }
                i++;
            }
        }
        kb3Var.c = intValue;
        lb3Var.d();
    }

    public final boolean z() {
        for (int i = 0; i < this.a.length; i++) {
            vr6 vr6Var = this.H;
            if (vr6Var.i != vr6Var.j[i]) {
                return true;
            }
        }
        return false;
    }

    public final void z0(List list, int i, int i2) {
        this.Z.a(1);
        ey6 ey6Var = this.I;
        ey6Var.getClass();
        ArrayList arrayList = ey6Var.c;
        gre.f(i >= 0 && i <= i2 && i2 <= arrayList.size());
        gre.f(list.size() == i2 - i);
        for (int i3 = i; i3 < i2; i3++) {
            ((dy6) arrayList.get(i3)).a.t((br6) list.get(i3 - i));
        }
        u(ey6Var.b(), false);
    }
}
