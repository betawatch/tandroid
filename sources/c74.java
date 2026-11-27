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

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes.dex */
public final class c74 implements Handler.Callback, wt6, sec {
    public static final long x0 = gcc.i0(10000);
    public final ArrayList E;
    public final vgb F;
    public final j64 G;
    public final au6 H;
    public final i07 I;
    public final cc3 J;
    public final short K;
    public final ig8 L;
    public final boolean M;
    public final ea3 N;
    public final xgb O;
    public final boolean P;
    public final d00 Q;
    public boolean R;
    public az9 S;
    public fv9 T;
    public boolean U;
    public boolean V;
    public b74 W;
    public int X;
    public nf8 Y;
    public z64 Z;
    public final ra9[] a;
    public boolean a0;
    public final vg0[] b;
    public boolean b0;
    public final boolean[] c;
    public boolean c0;
    public final ld3 d;
    public boolean d0;
    public final d2c e;
    public long e0;
    public final ec3 f;
    public boolean f0;
    public int g0;
    public final xgb h;
    public boolean h0;
    public boolean i0;
    public boolean j0;
    public boolean k0;
    public int l0;
    public b74 m0;
    public final ykf n;
    public long n0;
    public long o0;
    public int p0;
    public boolean q0;
    public final Looper r;
    public e64 r0;
    public final zrb s;
    public long s0;
    public g64 t0;
    public long u0;
    public boolean v0;
    public final xrb w;
    public float w0;
    public final long x;
    public final fc3 y;

    /* JADX WARN: Type inference failed for: r9v5, types: [int, short] */
    public c74(Context context, vg0[] vg0VarArr, vg0[] vg0VarArr2, ld3 ld3Var, d2c d2cVar, ec3 ec3Var, la3 la3Var, int i, boolean z, ea3 ea3Var, az9 az9Var, cc3 cc3Var, long j, boolean z2, Looper looper, vgb vgbVar, j64 j64Var, ig8 ig8Var, final sec secVar, boolean z3) {
        g64 g64Var = g64.a;
        this.u0 = -9223372036854775807L;
        this.G = j64Var;
        this.d = ld3Var;
        this.e = d2cVar;
        this.f = ec3Var;
        this.g0 = i;
        this.h0 = z;
        this.S = az9Var;
        this.J = cc3Var;
        this.K = (int) j;
        this.b0 = false;
        this.M = z2;
        this.F = vgbVar;
        this.L = ig8Var;
        this.t0 = g64Var;
        this.N = ea3Var;
        this.w0 = 1.0f;
        this.T = fv9.b;
        this.R = z3;
        this.s0 = -9223372036854775807L;
        this.e0 = -9223372036854775807L;
        this.x = ec3Var.m;
        wrb wrbVar = asb.a;
        nf8 k = nf8.k(d2cVar);
        this.Y = k;
        this.Z = new z64(k);
        this.b = new vg0[vg0VarArr.length];
        this.c = new boolean[vg0VarArr.length];
        ld3Var.getClass();
        this.a = new ra9[vg0VarArr.length];
        boolean z4 = false;
        for (int i2 = 0; i2 < vg0VarArr.length; i2++) {
            vg0 vg0Var = vg0VarArr[i2];
            vg0Var.e = i2;
            vg0Var.f = ig8Var;
            vg0Var.h = vgbVar;
            this.b[i2] = vg0Var;
            vg0 vg0Var2 = this.b[i2];
            synchronized (vg0Var2.a) {
                vg0Var2.J = ld3Var;
            }
            vg0 vg0Var3 = vg0VarArr2[i2];
            if (vg0Var3 != null) {
                vg0Var3.e = i2;
                vg0Var3.f = ig8Var;
                vg0Var3.h = vgbVar;
                z4 = true;
            }
            this.a[i2] = new ra9(vg0VarArr[i2], vg0Var3, i2);
        }
        this.P = z4;
        this.y = new fc3(this, vgbVar);
        this.E = new ArrayList();
        this.s = new zrb();
        this.w = new xrb();
        yve.p(ld3Var.a == null);
        ld3Var.a = this;
        ld3Var.b = la3Var;
        ld3Var.g = ld3Var.f;
        this.q0 = true;
        xgb a = vgbVar.a(looper, null);
        this.O = a;
        this.H = new au6(ea3Var, a, new lu3(this, (byte) 14), vg0VarArr.length);
        this.I = new i07(this, ea3Var, a, ig8Var, la3Var);
        ykf ykfVar = new ykf((byte) 2);
        this.n = ykfVar;
        Looper p = ykfVar.p();
        this.r = p;
        xgb a2 = vgbVar.a(p, this);
        this.h = a2;
        this.Q = new d00(context, p, this);
        a2.c(35, new sec() { // from class: u64
            @Override // sec
            public final void b(long j2, long j3, ko4 ko4Var, MediaFormat mediaFormat) {
                secVar.b(j2, j3, ko4Var, mediaFormat);
                c74.this.b(j2, j3, ko4Var, mediaFormat);
            }
        }).b();
        a2.c(39, new v64(this)).b();
    }

    public static Pair S(asb asbVar, b74 b74Var, boolean z, int i, boolean z2, zrb zrbVar, xrb xrbVar) {
        int T;
        asb asbVar2 = b74Var.a;
        if (asbVar.p()) {
            return null;
        }
        asb asbVar3 = asbVar2.p() ? asbVar : asbVar2;
        try {
            Pair i2 = asbVar3.i(zrbVar, xrbVar, b74Var.b, b74Var.c);
            if (!asbVar.equals(asbVar3)) {
                if (asbVar.b(i2.first) == -1) {
                    if (!z || (T = T(zrbVar, xrbVar, i, z2, i2.first, asbVar3, asbVar)) == -1) {
                        return null;
                    }
                    return asbVar.i(zrbVar, xrbVar, T, -9223372036854775807L);
                }
                if (asbVar3.g(i2.first, xrbVar).f && asbVar3.m(xrbVar.c, zrbVar, 0L).m == asbVar3.b(i2.first)) {
                    return asbVar.i(zrbVar, xrbVar, asbVar.g(i2.first, xrbVar).c, b74Var.c);
                }
            }
            return i2;
        } catch (IndexOutOfBoundsException unused) {
            return null;
        }
    }

    public static int T(zrb zrbVar, xrb xrbVar, int i, boolean z, Object obj, asb asbVar, asb asbVar2) {
        zrb zrbVar2 = zrbVar;
        asb asbVar3 = asbVar;
        Object obj2 = asbVar3.m(asbVar3.g(obj, xrbVar).c, zrbVar, 0L).a;
        for (int i2 = 0; i2 < asbVar2.o(); i2++) {
            if (asbVar2.m(i2, zrbVar, 0L).a.equals(obj2)) {
                return i2;
            }
        }
        int b = asbVar3.b(obj);
        int h = asbVar3.h();
        int i3 = -1;
        int i4 = 0;
        while (i4 < h && i3 == -1) {
            asb asbVar4 = asbVar3;
            int d = asbVar4.d(b, xrbVar, zrbVar2, i, z);
            if (d == -1) {
                break;
            }
            i3 = asbVar2.b(asbVar4.l(d));
            i4++;
            asbVar3 = asbVar4;
            b = d;
            zrbVar2 = zrbVar;
        }
        if (i3 == -1) {
            return -1;
        }
        return asbVar2.f(i3, xrbVar, false).c;
    }

    public static boolean y(yt6 yt6Var) {
        if (yt6Var != null) {
            try {
                jl6 jl6Var = yt6Var.a;
                if (yt6Var.e) {
                    for (at9 at9Var : yt6Var.c) {
                        if (at9Var != null) {
                            at9Var.g();
                        }
                    }
                } else {
                    jl6Var.l();
                }
                if ((!yt6Var.e ? 0L : jl6Var.h()) != Long.MIN_VALUE) {
                    return true;
                }
            } catch (IOException unused) {
            }
        }
        return false;
    }

    public final boolean A(int i, vz6 vz6Var) {
        au6 au6Var = this.H;
        yt6 yt6Var = au6Var.k[i];
        if (yt6Var == null || !yt6Var.g.a.equals(vz6Var)) {
            return false;
        }
        return this.a[i].h(au6Var.k[i]);
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
        nf8 nf8Var = this.Y;
        if (nf8Var.l == z2 && nf8Var.n == i2 && nf8Var.m == i3) {
            return;
        }
        this.Y = nf8Var.e(i3, i2, z2);
        D0(false, false);
        au6 au6Var = this.H;
        for (yt6 yt6Var = au6Var.i; yt6Var != null; yt6Var = yt6Var.m) {
            for (e74 e74Var : (e74[]) yt6Var.o.d) {
                if (e74Var != null) {
                    e74Var.h(z2);
                }
            }
        }
        if (!s0()) {
            w0();
            B0();
            nf8 nf8Var2 = this.Y;
            if (nf8Var2.p) {
                this.Y = nf8Var2.i(false);
            }
            au6Var.r(this.n0);
            return;
        }
        int i4 = this.Y.e;
        xgb xgbVar = this.h;
        if (i4 != 3) {
            if (i4 == 2) {
                xgbVar.h(2);
            }
        } else {
            fc3 fc3Var = this.y;
            fc3Var.b = true;
            ((ze2) fc3Var.c).b();
            u0();
            xgbVar.h(2);
        }
    }

    public final boolean B() {
        yt6 yt6Var = this.H.i;
        long j = yt6Var.g.e;
        if (yt6Var.e) {
            return j == -9223372036854775807L || this.Y.s < j || !s0();
        }
        return false;
    }

    public final void B0() {
        long j;
        float f;
        long j2;
        yt6 yt6Var = this.H.i;
        if (yt6Var != null) {
            long p = yt6Var.e ? yt6Var.a.p() : -9223372036854775807L;
            if (p != -9223372036854775807L) {
                if (!yt6Var.g()) {
                    this.H.s(yt6Var);
                    g();
                    t(false);
                    C();
                }
                Q(p, true);
                if (p != this.Y.s) {
                    nf8 nf8Var = this.Y;
                    this.Y = x(nf8Var.b, p, nf8Var.c, p, true, 5);
                }
            } else {
                fc3 fc3Var = this.y;
                boolean z = z();
                ze2 ze2Var = (ze2) fc3Var.c;
                vg0 vg0Var = (vg0) fc3Var.e;
                if (vg0Var == null || vg0Var.n() || ((z && ((vg0) fc3Var.e).n != 2) || (!((vg0) fc3Var.e).o() && (z || ((vg0) fc3Var.e).m())))) {
                    fc3Var.a = true;
                    if (fc3Var.b) {
                        ze2Var.b();
                    }
                } else {
                    hm6 hm6Var = (hm6) fc3Var.f;
                    hm6Var.getClass();
                    long g = hm6Var.g();
                    if (fc3Var.a) {
                        if (g >= ze2Var.g()) {
                            fc3Var.a = false;
                            if (fc3Var.b) {
                                ze2Var.b();
                            }
                        } else if (ze2Var.c) {
                            ze2Var.a(ze2Var.g());
                            ze2Var.c = false;
                        }
                    }
                    ze2Var.a(g);
                    of8 f2 = hm6Var.f();
                    if (!f2.equals((of8) ze2Var.e)) {
                        ze2Var.c(f2);
                        ((c74) fc3Var.d).h.c(16, f2).b();
                    }
                }
                long g2 = fc3Var.g();
                this.n0 = g2;
                long j3 = g2 - yt6Var.p;
                long j4 = this.Y.s;
                if (!this.E.isEmpty() && !this.Y.b.c()) {
                    if (this.q0) {
                        this.q0 = false;
                    }
                    nf8 nf8Var2 = this.Y;
                    nf8Var2.a.b(nf8Var2.b.a);
                    int min = Math.min(this.p0, this.E.size());
                    if (min > 0 && this.E.get(min - 1) != null) {
                        grb.o();
                        return;
                    } else {
                        if (min < this.E.size() && this.E.get(min) != null) {
                            grb.o();
                            return;
                        }
                        this.p0 = min;
                    }
                }
                if (this.y.h()) {
                    boolean z2 = !this.Z.d;
                    nf8 nf8Var3 = this.Y;
                    this.Y = x(nf8Var3.b, j3, nf8Var3.c, j3, z2, 6);
                } else {
                    nf8 nf8Var4 = this.Y;
                    nf8Var4.s = j3;
                    nf8Var4.t = SystemClock.elapsedRealtime();
                }
            }
            this.Y.q = this.H.l.d();
            nf8 nf8Var5 = this.Y;
            nf8Var5.r = o(nf8Var5.q);
            nf8 nf8Var6 = this.Y;
            if (nf8Var6.l && nf8Var6.e == 3 && t0(nf8Var6.a, nf8Var6.b)) {
                nf8 nf8Var7 = this.Y;
                float f3 = 1.0f;
                if (nf8Var7.o.a == 1.0f) {
                    cc3 cc3Var = this.J;
                    long l = l(nf8Var7.a, nf8Var7.b.a, nf8Var7.s);
                    long j5 = this.Y.r;
                    if (cc3Var.c != -9223372036854775807L) {
                        long j6 = l - j5;
                        long j7 = cc3Var.m;
                        if (j7 == -9223372036854775807L) {
                            cc3Var.m = j6;
                            cc3Var.n = 0L;
                        } else {
                            cc3Var.m = Math.max(j6, (long) ((j6 * 9.999871E-4f) + (j7 * 0.999f)));
                            cc3Var.n = (long) ((9.999871E-4f * Math.abs(j6 - r9)) + (cc3Var.n * 0.999f));
                        }
                        if (cc3Var.l != -9223372036854775807L) {
                            j = 1000;
                            if (SystemClock.elapsedRealtime() - cc3Var.l < 1000) {
                                f3 = cc3Var.k;
                            }
                        } else {
                            j = 1000;
                        }
                        cc3Var.l = SystemClock.elapsedRealtime();
                        long j8 = (cc3Var.n * 3) + cc3Var.m;
                        if (cc3Var.h > j8) {
                            float T = gcc.T(j);
                            f = 1.0E-7f;
                            long[] jArr = {j8, cc3Var.e, cc3Var.h - (((long) ((cc3Var.k - 1.0f) * T)) + ((long) ((cc3Var.i - 1.0f) * T)))};
                            j2 = jArr[0];
                            for (int i = 1; i < 3; i++) {
                                long j9 = jArr[i];
                                if (j9 > j2) {
                                    j2 = j9;
                                }
                            }
                            cc3Var.h = j2;
                        } else {
                            f = 1.0E-7f;
                            j2 = gcc.j(l - ((long) (Math.max(0.0f, cc3Var.k - 1.0f) / 1.0E-7f)), cc3Var.h, j8);
                            cc3Var.h = j2;
                            long j10 = cc3Var.g;
                            if (j10 != -9223372036854775807L && j2 > j10) {
                                cc3Var.h = j10;
                                j2 = j10;
                            }
                        }
                        long j11 = l - j2;
                        if (Math.abs(j11) < cc3Var.a) {
                            cc3Var.k = 1.0f;
                        } else {
                            f3 = gcc.h((f * j11) + 1.0f, cc3Var.j, cc3Var.i);
                            cc3Var.k = f3;
                        }
                    }
                    if (this.y.f().a != f3) {
                        of8 of8Var = new of8(f3, this.Y.o.b);
                        this.h.g(16);
                        this.y.c(of8Var);
                        w(this.Y.o, this.y.f().a, false, false);
                    }
                }
            }
        }
    }

    public final void C() {
        boolean c;
        if (y(this.H.l)) {
            yt6 yt6Var = this.H.l;
            long o = o(!yt6Var.e ? 0L : yt6Var.a.h());
            yt6 yt6Var2 = this.H.i;
            long j = t0(this.Y.a, yt6Var.g.a) ? this.J.h : -9223372036854775807L;
            ig8 ig8Var = this.L;
            asb asbVar = this.Y.a;
            vz6 vz6Var = yt6Var.g.a;
            float f = this.y.f().a;
            boolean z = this.Y.l;
            fa6 fa6Var = new fa6(ig8Var, asbVar, vz6Var, o, f, this.d0, j);
            c = this.f.c(fa6Var);
            yt6 yt6Var3 = this.H.i;
            if (!c && yt6Var3.e && o < 500000 && this.x > 0) {
                yt6Var3.a.n(this.Y.s);
                c = this.f.c(fa6Var);
            }
        } else {
            c = false;
        }
        this.f0 = c;
        if (c) {
            yt6 yt6Var4 = this.H.l;
            yt6Var4.getClass();
            wa6 wa6Var = new wa6();
            wa6Var.a = this.n0 - yt6Var4.p;
            float f2 = this.y.f().a;
            yve.f(f2 > 0.0f || f2 == -3.4028235E38f);
            wa6Var.b = f2;
            long j2 = this.e0;
            yve.f(j2 >= 0 || j2 == -9223372036854775807L);
            wa6Var.c = j2;
            xa6 xa6Var = new xa6(wa6Var);
            yve.p(yt6Var4.m == null);
            yt6Var4.a.s(xa6Var);
        }
        x0();
    }

    public final void C0(asb asbVar, vz6 vz6Var, asb asbVar2, vz6 vz6Var2, long j, boolean z) {
        boolean t0 = t0(asbVar, vz6Var);
        Object obj = vz6Var.a;
        if (!t0) {
            of8 of8Var = vz6Var.c() ? of8.d : this.Y.o;
            fc3 fc3Var = this.y;
            if (fc3Var.f().equals(of8Var)) {
                return;
            }
            this.h.g(16);
            fc3Var.c(of8Var);
            w(this.Y.o, of8Var.a, false, false);
            return;
        }
        xrb xrbVar = this.w;
        int i = asbVar.g(obj, xrbVar).c;
        zrb zrbVar = this.s;
        asbVar.n(i, zrbVar);
        at6 at6Var = zrbVar.i;
        String str = gcc.a;
        cc3 cc3Var = this.J;
        cc3Var.getClass();
        cc3Var.c = gcc.T(at6Var.a);
        cc3Var.f = gcc.T(at6Var.b);
        cc3Var.g = gcc.T(at6Var.c);
        float f = at6Var.d;
        if (f == -3.4028235E38f) {
            f = 0.97f;
        }
        cc3Var.j = f;
        float f2 = at6Var.e;
        if (f2 == -3.4028235E38f) {
            f2 = 1.03f;
        }
        cc3Var.i = f2;
        if (f == 1.0f && f2 == 1.0f) {
            cc3Var.c = -9223372036854775807L;
        }
        cc3Var.a();
        if (j != -9223372036854775807L) {
            cc3Var.d = l(asbVar, obj, j);
            cc3Var.a();
            return;
        }
        if (!Objects.equals(!asbVar2.p() ? asbVar2.m(asbVar2.g(vz6Var2.a, xrbVar).c, zrbVar, 0L).a : null, zrbVar.a) || z) {
            cc3Var.d = -9223372036854775807L;
            cc3Var.a();
        }
    }

    public final void D() {
        au6 au6Var = this.H;
        au6Var.p();
        yt6 yt6Var = au6Var.m;
        if (yt6Var != null) {
            jl6 jl6Var = yt6Var.a;
            if ((!yt6Var.d || yt6Var.e) && !jl6Var.e()) {
                asb asbVar = this.Y.a;
                if (yt6Var.e) {
                    jl6Var.t();
                }
                Iterator it = this.f.o.values().iterator();
                while (it.hasNext()) {
                    if (((dc3) it.next()).b) {
                        return;
                    }
                }
                if (!yt6Var.d) {
                    long j = yt6Var.g.b;
                    yt6Var.d = true;
                    jl6Var.q(this, j);
                    return;
                }
                wa6 wa6Var = new wa6();
                wa6Var.a = this.n0 - yt6Var.p;
                float f = this.y.f().a;
                yve.f(f > 0.0f || f == -3.4028235E38f);
                wa6Var.b = f;
                long j2 = this.e0;
                yve.f(j2 >= 0 || j2 == -9223372036854775807L);
                wa6Var.c = j2;
                xa6 xa6Var = new xa6(wa6Var);
                yve.p(yt6Var.m == null);
                jl6Var.s(xa6Var);
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
        z64 z64Var = this.Z;
        nf8 nf8Var = this.Y;
        boolean z = z64Var.a | (z64Var.b != nf8Var);
        z64Var.a = z;
        z64Var.b = nf8Var;
        if (z) {
            if (!nf8Var.a.p()) {
                nf8 nf8Var2 = this.Y;
                boolean z2 = nf8Var2.a.b(nf8Var2.b.a) != -1;
                Locale locale = Locale.US;
                nf8 nf8Var3 = this.Y;
                yve.o(String.format(locale, "periodUid %s not found in timeline %s with size %d triggered by msg %d", nf8Var3.b.a, nf8Var3.a.getClass().getName(), Integer.valueOf(this.Y.a.o()), Integer.valueOf(i)), z2);
            }
            z64 z64Var2 = this.Z;
            s64 s64Var = this.G.b;
            s64Var.j.e(new vx3(s64Var, z64Var2, (byte) 9));
            this.Z = new z64(this.Y);
        }
    }

    public final void F(int i) {
        ra9 ra9Var = this.a[i];
        try {
            yt6 yt6Var = this.H.i;
            yt6Var.getClass();
            vg0 d = ra9Var.d(yt6Var);
            d.getClass();
            at9 at9Var = d.r;
            at9Var.getClass();
            at9Var.g();
        } catch (IOException | RuntimeException e) {
            byte b = ra9Var.a.b;
            if (b != 3 && b != 5) {
                throw e;
            }
            d2c d2cVar = this.H.i.o;
            efd.d("ExoPlayerImplInternal", "Disabling track due to error: ".concat(ko4.c(((e74[]) d2cVar.d)[i].n())), e);
            d2c d2cVar2 = new d2c((qa9[]) ((qa9[]) d2cVar.c).clone(), (e74[]) ((e74[]) d2cVar.d).clone(), (f2c) d2cVar.e, (lo) d2cVar.f);
            ((qa9[]) d2cVar2.c)[i] = null;
            ((e74[]) d2cVar2.d)[i] = null;
            h(i);
            yt6 yt6Var2 = this.H.i;
            yt6Var2.a(d2cVar2, this.Y.s, false, new boolean[yt6Var2.j.length]);
        }
    }

    public final void G(int i, boolean z) {
        boolean[] zArr = this.c;
        if (zArr[i] != z) {
            zArr[i] = z;
            this.O.e(new t64((Object) this, i, z, (byte) 0));
        }
    }

    public final void H() {
        u(this.I.b(), true);
    }

    public final void I(y64 y64Var) {
        asb b;
        this.Z.a(1);
        int i = y64Var.a;
        int i2 = y64Var.b;
        int i3 = y64Var.c;
        pka pkaVar = y64Var.d;
        i07 i07Var = this.I;
        ArrayList arrayList = i07Var.c;
        yve.f(i >= 0 && i <= i2 && i2 <= arrayList.size() && i3 >= 0);
        i07Var.k = pkaVar;
        if (i == i2 || i == i3) {
            b = i07Var.b();
        } else {
            int min = Math.min(i, i3);
            int max = Math.max(((i2 - i) + i3) - 1, i2 - 1);
            int i4 = ((h07) arrayList.get(min)).d;
            gcc.S(i, i2, i3, arrayList);
            while (min <= max) {
                h07 h07Var = (h07) arrayList.get(min);
                h07Var.d = i4;
                i4 += h07Var.a.o.e.o();
                min++;
            }
            b = i07Var.b();
        }
        u(b, false);
    }

    public final void J() {
        this.Z.a(1);
        O(false, false, false, true);
        ec3 ec3Var = this.f;
        ConcurrentHashMap concurrentHashMap = ec3Var.o;
        long id = Thread.currentThread().getId();
        long j = ec3Var.p;
        yve.o("Players that share the same LoadControl must share the same playback thread. See ExoPlayer.Builder.setPlaybackLooper(Looper).", j == -1 || j == id);
        ec3Var.p = id;
        ig8 ig8Var = this.L;
        dc3 dc3Var = (dc3) concurrentHashMap.get(ig8Var);
        if (dc3Var == null) {
            dc3 dc3Var2 = new dc3();
            dc3Var2.a = 1;
            concurrentHashMap.put(ig8Var, dc3Var2);
        } else {
            dc3Var.a++;
        }
        dc3 dc3Var3 = (dc3) concurrentHashMap.get(ig8Var);
        dc3Var3.getClass();
        Integer num = (Integer) ec3Var.n.get(ig8Var.a);
        int intValue = (num == null || num.intValue() == -1) ? -1 : num.intValue();
        if (intValue == -1) {
            intValue = 13107200;
        }
        dc3Var3.c = intValue;
        dc3Var3.b = false;
        o0(this.Y.a.p() ? 4 : 2);
        nf8 nf8Var = this.Y;
        boolean z = nf8Var.l;
        A0(this.Q.c(nf8Var.e, z), nf8Var.n, nf8Var.m, z);
        i07 i07Var = this.I;
        ArrayList arrayList = i07Var.c;
        yve.p(!i07Var.l);
        for (int i = 0; i < arrayList.size(); i++) {
            h07 h07Var = (h07) arrayList.get(i);
            i07Var.e(h07Var);
            i07Var.h.add(h07Var);
        }
        i07Var.l = true;
        this.h.h(2);
    }

    public final void K(or2 or2Var) {
        moa moaVar;
        try {
            O(true, false, true, false);
            L();
            ec3 ec3Var = this.f;
            ig8 ig8Var = this.L;
            ConcurrentHashMap concurrentHashMap = ec3Var.o;
            dc3 dc3Var = (dc3) concurrentHashMap.get(ig8Var);
            if (dc3Var != null) {
                int i = dc3Var.a - 1;
                dc3Var.a = i;
                if (i == 0) {
                    concurrentHashMap.remove(ig8Var);
                    ec3Var.d();
                }
            }
            if (ec3Var.o.isEmpty()) {
                ec3Var.p = -1L;
            }
            d00 d00Var = this.Q;
            d00Var.c = null;
            d00Var.a();
            d00Var.b(0);
            ld3 ld3Var = this.d;
            if (ld3Var.h != null) {
                yve.o("DefaultTrackSelector is accessed on the wrong thread.", Thread.currentThread().equals(ld3Var.h));
            }
            if (Build.VERSION.SDK_INT >= 32 && (moaVar = ld3Var.i) != null) {
                moaVar.e();
                ld3Var.i = null;
            }
            ld3Var.a = null;
            ld3Var.b = null;
            o0(1);
        } finally {
            this.h.f();
            this.n.r();
            or2Var.e();
        }
    }

    public final void L() {
        for (int i = 0; i < this.a.length; i++) {
            vg0 vg0Var = this.b[i];
            synchronized (vg0Var.a) {
                vg0Var.J = null;
            }
            ra9 ra9Var = this.a[i];
            vg0 vg0Var2 = ra9Var.a;
            yve.p(vg0Var2.n == 0);
            vg0Var2.t();
            ra9Var.e = false;
            vg0 vg0Var3 = ra9Var.c;
            if (vg0Var3 != null) {
                yve.p(vg0Var3.n == 0);
                vg0Var3.t();
                ra9Var.f = false;
            }
        }
    }

    public final void M(int i, int i2, pka pkaVar) {
        this.Z.a(1);
        i07 i07Var = this.I;
        i07Var.getClass();
        yve.f(i >= 0 && i <= i2 && i2 <= i07Var.c.size());
        i07Var.k = pkaVar;
        i07Var.f(i, i2);
        u(i07Var.b(), false);
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
        float f = this.y.f().a;
        au6 au6Var = this.H;
        yt6 yt6Var = au6Var.i;
        yt6 f2 = au6Var.f();
        d2c d2cVar = null;
        yt6 yt6Var2 = yt6Var;
        boolean z2 = true;
        while (yt6Var2 != null && yt6Var2.e) {
            nf8 nf8Var = this.Y;
            d2c j = yt6Var2.j(f, nf8Var.a, nf8Var.l);
            d2c d2cVar2 = yt6Var2 == this.H.i ? j : d2cVar;
            d2c d2cVar3 = yt6Var2.o;
            e74[] e74VarArr = (e74[]) j.d;
            boolean z3 = false;
            if (((e74[]) d2cVar3.d).length == e74VarArr.length) {
                int i3 = 0;
                while (i3 < e74VarArr.length) {
                    if (j.p(d2cVar3, i3)) {
                        i3++;
                        d2cVar2 = d2cVar2;
                        j = j;
                    }
                }
                d2c d2cVar4 = d2cVar2;
                if (yt6Var2 == f2) {
                    z2 = false;
                }
                yt6Var2 = yt6Var2.m;
                d2cVar = d2cVar4;
            }
            au6 au6Var2 = this.H;
            if (z2) {
                yt6 yt6Var3 = au6Var2.i;
                boolean z4 = (au6Var2.s(yt6Var3) & 1) != 0;
                boolean[] zArr = new boolean[this.a.length];
                d2cVar2.getClass();
                long a = yt6Var3.a(d2cVar2, this.Y.s, z4, zArr);
                nf8 nf8Var2 = this.Y;
                if (nf8Var2.e == 4 || a == nf8Var2.s) {
                    z = false;
                } else {
                    z = false;
                    z3 = true;
                }
                nf8 nf8Var3 = this.Y;
                boolean z5 = z;
                i = 4;
                this.Y = x(nf8Var3.b, a, nf8Var3.c, nf8Var3.d, z3, 5);
                if (z3) {
                    Q(a, true);
                }
                g();
                boolean[] zArr2 = new boolean[this.a.length];
                int i4 = z5;
                while (true) {
                    ra9[] ra9VarArr = this.a;
                    if (i4 >= ra9VarArr.length) {
                        break;
                    }
                    int c = ra9VarArr[i4].c();
                    zArr2[i4] = this.a[i4].j();
                    ra9 ra9Var = this.a[i4];
                    at9 at9Var = yt6Var3.c[i4];
                    fc3 fc3Var = this.y;
                    long j2 = this.n0;
                    boolean z6 = zArr[i4];
                    vg0 vg0Var = ra9Var.a;
                    if (ra9.k(vg0Var)) {
                        if (at9Var != vg0Var.r) {
                            ra9Var.a(vg0Var, fc3Var);
                        } else if (z6) {
                            vg0Var.D(j2, z5, true);
                        }
                    }
                    vg0 vg0Var2 = ra9Var.c;
                    if (vg0Var2 != null && ra9.k(vg0Var2)) {
                        if (at9Var != vg0Var2.r) {
                            ra9Var.a(vg0Var2, fc3Var);
                        } else if (z6) {
                            vg0Var2.D(j2, z5, true);
                        }
                    }
                    if (c - this.a[i4].c() > 0) {
                        G(i4, z5);
                    }
                    this.l0 -= c - this.a[i4].c();
                    i4++;
                }
                k(this.n0, zArr2);
                a0(yt6Var3);
            } else {
                i = 4;
                au6Var2.s(yt6Var2);
                if (yt6Var2.e) {
                    long max = Math.max(yt6Var2.g.b, this.n0 - yt6Var2.p);
                    if (this.P) {
                        int i5 = 0;
                        while (true) {
                            ra9[] ra9VarArr2 = this.a;
                            if (i5 < ra9VarArr2.length) {
                                if (this.H.k[i5] == yt6Var2 && ra9VarArr2[i5].h(yt6Var2)) {
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
                    yt6Var2.a(j, max, false, new boolean[yt6Var2.j.length]);
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
        asb asbVar;
        asb asbVar2;
        vz6 vz6Var;
        u1c u1cVar;
        d2c d2cVar;
        List list;
        this.h.g(2);
        this.V = false;
        if (this.W != null) {
            this.Z.a(1);
            this.W = null;
        }
        this.r0 = null;
        D0(false, true);
        fc3 fc3Var = this.y;
        fc3Var.b = false;
        ze2 ze2Var = (ze2) fc3Var.c;
        if (ze2Var.c) {
            ze2Var.a(ze2Var.g());
            ze2Var.c = false;
        }
        this.n0 = 1000000000000L;
        for (int i = 0; i < this.a.length; i++) {
            try {
                h(i);
            } catch (e64 | RuntimeException e) {
                efd.d("ExoPlayerImplInternal", "Disable failed.", e);
            }
        }
        this.u0 = -9223372036854775807L;
        if (z) {
            for (ra9 ra9Var : this.a) {
                try {
                    ra9Var.n();
                } catch (RuntimeException e2) {
                    efd.d("ExoPlayerImplInternal", "Reset failed.", e2);
                }
            }
        }
        this.l0 = 0;
        nf8 nf8Var = this.Y;
        vz6 vz6Var2 = nf8Var.b;
        long j4 = nf8Var.s;
        if (!this.Y.b.c()) {
            nf8 nf8Var2 = this.Y;
            xrb xrbVar = this.w;
            vz6 vz6Var3 = nf8Var2.b;
            asb asbVar3 = nf8Var2.a;
            if (!asbVar3.p() && !asbVar3.g(vz6Var3.a, xrbVar).f) {
                j = this.Y.s;
                if (z2) {
                    j2 = j4;
                    j3 = j;
                    z5 = false;
                } else {
                    this.m0 = null;
                    Pair m = m(this.Y.a);
                    vz6Var2 = (vz6) m.first;
                    long longValue = ((Long) m.second).longValue();
                    z5 = vz6Var2.equals(this.Y.b) ? false : true;
                    j2 = longValue;
                    j3 = -9223372036854775807L;
                }
                this.H.b();
                this.f0 = false;
                asbVar = this.Y.a;
                if (z3 || !(asbVar instanceof rg8)) {
                    asbVar2 = asbVar;
                } else {
                    rg8 rg8Var = (rg8) asbVar;
                    pka pkaVar = this.I.k;
                    asb[] asbVarArr = rg8Var.k;
                    asb[] asbVarArr2 = new asb[asbVarArr.length];
                    for (int i2 = 0; i2 < asbVarArr.length; i2++) {
                        asbVarArr2[i2] = new qg8(asbVarArr[i2]);
                    }
                    asbVar2 = new rg8(asbVarArr2, rg8Var.l, pkaVar);
                    if (vz6Var2.b != -1) {
                        asbVar2.g(vz6Var2.a, this.w);
                        int i3 = this.w.c;
                        zrb zrbVar = this.s;
                        asbVar2.m(i3, zrbVar, 0L);
                        if (zrbVar.a()) {
                            vz6Var = new vz6(vz6Var2.d, vz6Var2.a);
                            nf8 nf8Var3 = this.Y;
                            int i4 = nf8Var3.e;
                            e64 e64Var = z4 ? null : nf8Var3.f;
                            if (z5) {
                                u1cVar = u1c.d;
                                d2cVar = this.e;
                                no5 no5Var = po5.b;
                                list = j99.e;
                            } else {
                                u1cVar = nf8Var3.h;
                                d2cVar = nf8Var3.i;
                                list = nf8Var3.j;
                            }
                            this.Y = new nf8(asbVar2, vz6Var, j3, j2, i4, e64Var, false, u1cVar, d2cVar, list, vz6Var, nf8Var3.l, nf8Var3.m, nf8Var3.n, nf8Var3.o, j2, 0L, j2, 0L, false);
                            if (z3) {
                                au6 au6Var = this.H;
                                if (!au6Var.q.isEmpty()) {
                                    ArrayList arrayList = new ArrayList();
                                    for (int i5 = 0; i5 < au6Var.q.size(); i5++) {
                                        ((yt6) au6Var.q.get(i5)).i();
                                    }
                                    au6Var.q = arrayList;
                                    au6Var.m = null;
                                    au6Var.p();
                                }
                                i07 i07Var = this.I;
                                HashMap hashMap = i07Var.g;
                                for (g07 g07Var : hashMap.values()) {
                                    try {
                                        g07Var.a.p(g07Var.b);
                                    } catch (RuntimeException e3) {
                                        efd.d("MediaSourceList", "Failed to release child source.", e3);
                                    }
                                    rg0 rg0Var = g07Var.a;
                                    f07 f07Var = g07Var.c;
                                    rg0Var.s(f07Var);
                                    g07Var.a.r(f07Var);
                                }
                                hashMap.clear();
                                i07Var.h.clear();
                                i07Var.l = false;
                                return;
                            }
                            return;
                        }
                    }
                }
                vz6Var = vz6Var2;
                nf8 nf8Var32 = this.Y;
                int i42 = nf8Var32.e;
                if (z4) {
                }
                if (z5) {
                }
                this.Y = new nf8(asbVar2, vz6Var, j3, j2, i42, e64Var, false, u1cVar, d2cVar, list, vz6Var, nf8Var32.l, nf8Var32.m, nf8Var32.n, nf8Var32.o, j2, 0L, j2, 0L, false);
                if (z3) {
                }
            }
        }
        j = this.Y.c;
        if (z2) {
        }
        this.H.b();
        this.f0 = false;
        asbVar = this.Y.a;
        if (z3) {
        }
        asbVar2 = asbVar;
        vz6Var = vz6Var2;
        nf8 nf8Var322 = this.Y;
        int i422 = nf8Var322.e;
        if (z4) {
        }
        if (z5) {
        }
        this.Y = new nf8(asbVar2, vz6Var, j3, j2, i422, e64Var, false, u1cVar, d2cVar, list, vz6Var, nf8Var322.l, nf8Var322.m, nf8Var322.n, nf8Var322.o, j2, 0L, j2, 0L, false);
        if (z3) {
        }
    }

    public final void P() {
        yt6 yt6Var = this.H.i;
        this.c0 = yt6Var != null && yt6Var.g.h && this.b0;
    }

    public final void Q(long j, boolean z) {
        yt6 yt6Var = this.H.i;
        long j2 = j + (yt6Var == null ? 1000000000000L : yt6Var.p);
        this.n0 = j2;
        ((ze2) this.y.c).a(j2);
        for (ra9 ra9Var : this.a) {
            long j3 = this.n0;
            vg0 d = ra9Var.d(yt6Var);
            if (d != null) {
                d.D(j3, false, z);
            }
        }
        for (yt6 yt6Var2 = r0.i; yt6Var2 != null; yt6Var2 = yt6Var2.m) {
            for (e74 e74Var : (e74[]) yt6Var2.o.d) {
                if (e74Var != null) {
                    e74Var.s();
                }
            }
        }
    }

    public final void R(asb asbVar, asb asbVar2) {
        if (asbVar.p() && asbVar2.p()) {
            return;
        }
        ArrayList arrayList = this.E;
        int size = arrayList.size() - 1;
        if (size < 0) {
            Collections.sort(arrayList);
        } else {
            bs2.u(arrayList.get(size));
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
        for (ra9 ra9Var : this.a) {
            long j3 = this.n0;
            long j4 = this.o0;
            vg0 vg0Var = ra9Var.c;
            vg0 vg0Var2 = ra9Var.a;
            long j5 = ra9.k(vg0Var2) ? vg0Var2.j(j3, j4) : Long.MAX_VALUE;
            if (vg0Var != null && vg0Var.n != 0) {
                j5 = Math.min(j5, vg0Var.j(j3, j4));
            }
            r2 = Math.min(r2, gcc.i0(j5));
        }
        if (this.Y.m()) {
            yt6 yt6Var = this.H.i;
            if ((yt6Var != null ? yt6Var.m : null) != null) {
                if ((gcc.T(r2) * this.Y.o.a) + this.n0 >= r1.e()) {
                    r2 = Math.min(r2, j2);
                }
            }
        }
        this.h.a.sendEmptyMessageAtTime(2, j + r2);
    }

    public final void V(boolean z) {
        vz6 vz6Var = this.H.i.g.a;
        long X = X(vz6Var, this.Y.s, true, false);
        if (X != this.Y.s) {
            nf8 nf8Var = this.Y;
            this.Y = x(vz6Var, X, nf8Var.c, nf8Var.d, z, 5);
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
    public final void W(b74 b74Var) {
        vz6 u;
        boolean z;
        long j;
        long j2;
        boolean z2;
        vz6 vz6Var;
        long j3;
        long j4;
        long j5;
        long j6;
        nf8 nf8Var;
        int i;
        long j7;
        int i2;
        long j8;
        vz6 vz6Var2;
        long j9;
        long X;
        nf8 nf8Var2;
        vz6 vz6Var3;
        asb asbVar;
        long j10;
        c74 c74Var = this;
        if (c74Var.V) {
            if (c74Var.W != null) {
                c74Var.X++;
                c74Var.Z.a(1);
            }
            c74Var.W = b74Var;
            return;
        }
        c74Var.Z.a(1);
        Pair S = S(c74Var.Y.a, b74Var, true, c74Var.g0, c74Var.h0, c74Var.s, c74Var.w);
        if (S == null) {
            Pair m = c74Var.m(c74Var.Y.a);
            u = (vz6) m.first;
            j2 = ((Long) m.second).longValue();
            z = !c74Var.Y.a.p();
            j = -9223372036854775807L;
        } else {
            Object obj = S.first;
            long longValue = ((Long) S.second).longValue();
            long j11 = b74Var.c == -9223372036854775807L ? -9223372036854775807L : longValue;
            au6 au6Var = c74Var.H;
            nf8 nf8Var3 = c74Var.Y;
            u = au6Var.u(nf8Var3, nf8Var3.a, obj, longValue, true, false);
            if (u.c()) {
                c74Var.Y.a.g(u.a, c74Var.w);
                if (c74Var.w.e(u.b) == u.c) {
                    c74Var.w.getClass();
                    ea eaVar = ea.c;
                }
                c74Var.w.getClass();
                ea.c.a(u.b).getClass();
                z = true;
                j = Math.max(j11, 0L);
                j2 = 0;
            } else {
                z = b74Var.c == -9223372036854775807L;
                j = j11;
                j2 = longValue;
            }
        }
        try {
            try {
                if (c74Var.Y.a.p()) {
                    c74Var.m0 = b74Var;
                } else {
                    nf8 nf8Var4 = c74Var.Y;
                    if (S == null) {
                        if (nf8Var4.e != 1) {
                            c74Var.o0(4);
                        }
                        c74Var.O(false, true, false, true);
                    } else {
                        try {
                            if (u.equals(nf8Var4.b)) {
                                try {
                                    yt6 yt6Var = c74Var.H.i;
                                    if (yt6Var == null || !yt6Var.e || j2 == 0) {
                                        j6 = j2;
                                    } else {
                                        jl6 jl6Var = yt6Var.a;
                                        long j12 = c74Var.s.l;
                                        if (c74Var.U && j12 != -9223372036854775807L) {
                                            c74Var.T.getClass();
                                        }
                                        j6 = jl6Var.j(j2, c74Var.S);
                                    }
                                    if (gcc.i0(j6) == gcc.i0(c74Var.Y.s) && ((i = (nf8Var = c74Var.Y).e) == 2 || i == 3)) {
                                        j7 = nf8Var.s;
                                        i2 = 2;
                                        j8 = j7;
                                        z2 = z;
                                        vz6Var2 = u;
                                        j9 = j;
                                        c74Var.Y = c74Var.x(vz6Var2, j7, j9, j8, z2, i2);
                                    }
                                    z2 = z;
                                    vz6Var = u;
                                    j5 = j;
                                } catch (Throwable th) {
                                    th = th;
                                    z2 = z;
                                    vz6Var = u;
                                    j5 = j;
                                    j3 = j5;
                                    j4 = j2;
                                    c74Var.Y = c74Var.x(vz6Var, j4, j3, j4, z2, 2);
                                    throw th;
                                }
                            } else {
                                z2 = z;
                                vz6Var = u;
                                j5 = j;
                                j6 = j2;
                            }
                            c74Var.C0(asbVar, vz6Var3, asbVar, nf8Var2.b, j10, true);
                            vz6Var2 = vz6Var3;
                            j9 = j10;
                            j7 = X;
                            i2 = 2;
                            j8 = j7;
                            c74Var = this;
                            c74Var.Y = c74Var.x(vz6Var2, j7, j9, j8, z2, i2);
                        } catch (Throwable th2) {
                            th = th2;
                            vz6Var = vz6Var3;
                            j3 = j10;
                            j4 = X;
                            c74Var.Y = c74Var.x(vz6Var, j4, j3, j4, z2, 2);
                            throw th;
                        }
                        X = c74Var.X(vz6Var, j6, c74Var.z(), c74Var.Y.e == 4);
                        z2 |= j2 != X;
                        nf8Var2 = c74Var.Y;
                        vz6Var3 = vz6Var;
                        asbVar = nf8Var2.a;
                        j10 = j5;
                    }
                }
                z2 = z;
                vz6Var2 = u;
                j7 = j2;
                j9 = j;
                i2 = 2;
                j8 = j7;
                c74Var = this;
                c74Var.Y = c74Var.x(vz6Var2, j7, j9, j8, z2, i2);
            } catch (Throwable th3) {
                th = th3;
                z2 = z;
                vz6Var = u;
                j4 = j2;
                j3 = j;
            }
        } catch (Throwable th4) {
            th = th4;
            z2 = z;
            vz6Var = u;
            j3 = j;
        }
    }

    public final long X(vz6 vz6Var, long j, boolean z, boolean z2) {
        au6 au6Var;
        byte b;
        w0();
        boolean z3 = true;
        D0(false, true);
        if (z2 || this.Y.e == 3) {
            o0(2);
        }
        yt6 yt6Var = this.H.i;
        yt6 yt6Var2 = yt6Var;
        while (yt6Var2 != null && !vz6Var.equals(yt6Var2.g.a)) {
            yt6Var2 = yt6Var2.m;
        }
        if (z || yt6Var != yt6Var2 || (yt6Var2 != null && yt6Var2.p + j < 0)) {
            for (int i = 0; i < this.a.length; i++) {
                h(i);
            }
            this.u0 = -9223372036854775807L;
            if (yt6Var2 != null) {
                while (true) {
                    au6Var = this.H;
                    if (au6Var.i == yt6Var2) {
                        break;
                    }
                    au6Var.a();
                }
                au6Var.s(yt6Var2);
                yt6Var2.p = 1000000000000L;
                yve.p(!z());
                k(this.H.d().e(), new boolean[this.a.length]);
                a0(yt6Var2);
            }
        }
        g();
        if (this.U) {
            for (ra9 ra9Var : this.a) {
                if (ra9Var.j() && ((b = ra9Var.a.b) == 2 || b == 4)) {
                    this.V = true;
                    break;
                }
            }
        }
        au6 au6Var2 = this.H;
        if (yt6Var2 != null) {
            au6Var2.s(yt6Var2);
            if (!yt6Var2.e) {
                yt6Var2.g = yt6Var2.g.b(j, -9223372036854775807L);
            } else if (yt6Var2.f) {
                if (this.U) {
                    this.T.getClass();
                    if (!this.Y.a.p() && yt6Var2.g.a.equals(this.Y.b)) {
                        long j2 = yt6Var2.p + j;
                        boolean z4 = true;
                        for (ra9 ra9Var2 : this.a) {
                            if (ra9Var2.j()) {
                                vg0 d = ra9Var2.d(yt6Var2);
                                z4 &= d != null && d.I(j2);
                            }
                        }
                        if (z4) {
                            jl6 jl6Var = yt6Var2.a;
                            long j3 = this.Y.s;
                            az9 az9Var = az9.e;
                            if (jl6Var.j(j3, az9Var) == yt6Var2.a.j(j, az9Var)) {
                                z3 = false;
                            }
                        }
                    }
                }
                j = yt6Var2.a.m(j);
                yt6Var2.a.n(j - this.x);
            }
            Q(j, z3);
            C();
        } else {
            au6Var2.b();
            Q(j, true);
        }
        t(false);
        this.h.h(2);
        return j;
    }

    public final void Y(mg8 mg8Var) {
        mg8Var.getClass();
        xgb xgbVar = this.h;
        if (mg8Var.e != this.r) {
            xgbVar.c(15, mg8Var).b();
            return;
        }
        synchronized (mg8Var) {
        }
        try {
            mg8Var.a.d(mg8Var.c, mg8Var.d);
            mg8Var.a(true);
            int i = this.Y.e;
            if (i == 3 || i == 2) {
                xgbVar.h(2);
            }
        } catch (Throwable th) {
            mg8Var.a(true);
            throw th;
        }
    }

    public final void Z(mg8 mg8Var) {
        Looper looper = mg8Var.e;
        if (looper.getThread().isAlive()) {
            this.F.a(looper, null).e(new lw3(this, mg8Var));
        } else {
            efd.f("TAG", "Trying to send message on a dead thread.");
            mg8Var.a(false);
        }
    }

    @Override // wt6
    public final void a(xt6 xt6Var) {
        this.h.c(8, xt6Var).b();
    }

    public final void a0(yt6 yt6Var) {
        for (int i = 0; i < this.a.length; i++) {
            yt6Var.h[i] = true;
        }
    }

    @Override // sec
    public final void b(long j, long j2, ko4 ko4Var, MediaFormat mediaFormat) {
        if (this.V) {
            this.h.a(37).b();
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0057, code lost:
    
        if (r7.a == 1) goto L28;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void b0(oz ozVar, boolean z) {
        byte b;
        moa moaVar;
        c74 c74Var;
        ld3 ld3Var = this.d;
        if (!ld3Var.j.equals(ozVar)) {
            ld3Var.j = ozVar;
            if (ld3Var.g.A0 && Build.VERSION.SDK_INT >= 32 && (moaVar = ld3Var.i) != null && moaVar.b && (c74Var = ld3Var.a) != null) {
                c74Var.h.c(10, null).b();
            }
        }
        if (!z) {
            ozVar = null;
        }
        d00 d00Var = this.Q;
        if (!Objects.equals(d00Var.d, ozVar)) {
            d00Var.d = ozVar;
            if (ozVar != null) {
                int i = ozVar.c;
                b = 3;
                switch (i) {
                    case 0:
                        efd.f("AudioFocusManager", "Specify a proper usage in the audio attributes for audio focus handling. Using AUDIOFOCUS_GAIN by default.");
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
                        c00.p(i, "Unidentified audio usage: ", "AudioFocusManager");
                        break;
                    case 16:
                        b = 4;
                        break;
                }
                d00Var.f = b;
                yve.e("Automatic handling of audio focus is only available for USAGE_MEDIA and USAGE_GAME.", b != 1 || b == 0);
            }
            b = 0;
            d00Var.f = b;
            yve.e("Automatic handling of audio focus is only available for USAGE_MEDIA and USAGE_GAME.", b != 1 || b == 0);
        }
        nf8 nf8Var = this.Y;
        boolean z2 = nf8Var.l;
        A0(d00Var.c(nf8Var.e, z2), nf8Var.n, nf8Var.m, z2);
    }

    public final void c(x64 x64Var, int i) {
        this.Z.a(1);
        i07 i07Var = this.I;
        if (i == -1) {
            i = i07Var.c.size();
        }
        u(i07Var.a(i, x64Var.a, x64Var.b), false);
    }

    public final void c0(int i) {
        for (ra9 ra9Var : this.a) {
            vg0 vg0Var = ra9Var.a;
            byte b = vg0Var.b;
            if (b == 1 || b == 2) {
                vg0Var.d(10, Integer.valueOf(i));
                vg0 vg0Var2 = ra9Var.c;
                if (vg0Var2 != null) {
                    vg0Var2.d(10, Integer.valueOf(i));
                }
            }
        }
    }

    public final void d() {
        for (ra9 ra9Var : this.a) {
            fv9 fv9Var = this.U ? this.T : null;
            ra9Var.a.d(18, fv9Var);
            vg0 vg0Var = ra9Var.c;
            if (vg0Var != null) {
                vg0Var.d(18, fv9Var);
            }
        }
    }

    public final void d0(boolean z, or2 or2Var) {
        if (this.i0 != z) {
            this.i0 = z;
            if (!z) {
                for (ra9 ra9Var : this.a) {
                    ra9Var.n();
                }
            }
        }
        if (or2Var != null) {
            or2Var.e();
        }
    }

    public final boolean e() {
        if (this.P) {
            for (ra9 ra9Var : this.a) {
                if (ra9Var.g()) {
                    return true;
                }
            }
        }
        return false;
    }

    public final void e0(v64 v64Var) {
        for (ra9 ra9Var : this.a) {
            vg0 vg0Var = ra9Var.a;
            if (vg0Var.b == 4) {
                vg0Var.d(23, v64Var);
                vg0 vg0Var2 = ra9Var.c;
                if (vg0Var2 != null) {
                    vg0Var2.d(23, v64Var);
                }
            }
        }
    }

    @Override // h8a
    public final void f(i8a i8aVar) {
        this.h.c(9, (xt6) i8aVar).b();
    }

    public final void f0(x64 x64Var) {
        this.Z.a(1);
        int i = x64Var.c;
        pka pkaVar = x64Var.b;
        ArrayList arrayList = x64Var.a;
        if (i != -1) {
            this.m0 = new b74(new rg8(arrayList, pkaVar), x64Var.c, x64Var.d);
        }
        i07 i07Var = this.I;
        ArrayList arrayList2 = i07Var.c;
        i07Var.f(0, arrayList2.size());
        u(i07Var.a(arrayList2.size(), arrayList, pkaVar), false);
    }

    public final void g() {
        vg0 vg0Var;
        if (this.P && e()) {
            for (ra9 ra9Var : this.a) {
                int c = ra9Var.c();
                fc3 fc3Var = this.y;
                if (ra9Var.g()) {
                    byte b = ra9Var.d;
                    byte b2 = 1;
                    boolean z = b == 5 || b == 2;
                    if (b != 5 && b != 3) {
                        b2 = 0;
                    }
                    if (z) {
                        try {
                            vg0Var = ra9Var.a;
                        } catch (RuntimeException e) {
                            efd.d("RendererHolder", "Disable prewarming failed.", e);
                        }
                    } else {
                        vg0Var = ra9Var.c;
                        vg0Var.getClass();
                    }
                    ra9Var.a(vg0Var, fc3Var);
                    try {
                        ra9Var.l(z);
                    } catch (RuntimeException e2) {
                        efd.d("RendererHolder", "Reset prewarming failed.", e2);
                    }
                    ra9Var.d = b2;
                }
                this.l0 -= c - ra9Var.c();
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
        ra9[] ra9VarArr = this.a;
        int c = ra9VarArr[i].c();
        ra9 ra9Var = ra9VarArr[i];
        vg0 vg0Var = ra9Var.a;
        fc3 fc3Var = this.y;
        ra9Var.a(vg0Var, fc3Var);
        vg0 vg0Var2 = ra9Var.c;
        if (vg0Var2 != null) {
            byte b = ra9Var.d;
            boolean z = true;
            if (b != 5 && b != 1 && b != 3) {
                z = false;
            }
            ra9Var.a(vg0Var2, fc3Var);
            ra9Var.l(false);
            if (z) {
                vg0 vg0Var3 = ra9Var.a;
                vg0Var2.getClass();
                vg0Var2.d(17, vg0Var3);
            }
        }
        ra9Var.d = (byte) 0;
        G(i, false);
        this.l0 -= c;
    }

    public final void h0(of8 of8Var) {
        this.h.g(16);
        fc3 fc3Var = this.y;
        fc3Var.c(of8Var);
        of8 f = fc3Var.f();
        w(f, f.a, true, true);
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        int i;
        xgb xgbVar;
        int i2;
        yt6 yt6Var;
        vz6 vz6Var;
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
                    W((b74) message.obj);
                    break;
                case 4:
                    h0((of8) message.obj);
                    break;
                case 5:
                    this.S = (az9) message.obj;
                    break;
                case 6:
                    v0(false, true);
                    break;
                case 7:
                    K((or2) message.obj);
                    return true;
                case 8:
                    v((xt6) message.obj);
                    break;
                case 9:
                    r((xt6) message.obj);
                    break;
                case 10:
                    this.d.i((c2c) message.obj);
                    N();
                    break;
                case 11:
                    j0(message.arg1);
                    break;
                case 12:
                    m0(message.arg1 != 0);
                    break;
                case 13:
                    d0(message.arg1 != 0, (or2) message.obj);
                    break;
                case 14:
                    Y((mg8) message.obj);
                    break;
                case 15:
                    Z((mg8) message.obj);
                    break;
                case 16:
                    of8 of8Var = (of8) message.obj;
                    w(of8Var, of8Var.a, true, false);
                    break;
                case 17:
                    f0((x64) message.obj);
                    break;
                case 18:
                    c((x64) message.obj, message.arg1);
                    break;
                case 19:
                    I((y64) message.obj);
                    break;
                case 20:
                    M(message.arg1, message.arg2, (pka) message.obj);
                    break;
                case 21:
                    n0((pka) message.obj);
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
                    i0((g64) message.obj);
                    break;
                case 29:
                    J();
                    break;
                case jn7.S /* 30 */:
                    Pair pair = (Pair) message.obj;
                    q0(pair.first, (or2) pair.second);
                    break;
                case 31:
                    b0((oz) message.obj, message.arg1 != 0);
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
                    p0((sec) message.obj);
                    break;
                case 36:
                    k0(((Boolean) message.obj).booleanValue());
                    break;
                case 37:
                    this.V = false;
                    b74 b74Var = this.W;
                    if (b74Var != null) {
                        W(b74Var);
                        this.W = null;
                        break;
                    }
                    break;
                case 38:
                    l0((fv9) message.obj);
                    break;
                case 39:
                    e0((v64) message.obj);
                    break;
                case 40:
                    c0(message.arg1);
                    break;
                default:
                    return false;
            }
        } catch (e64 e) {
            e = e;
            byte b = e.d;
            au6 au6Var = this.H;
            if (b == 1 && e.r == null) {
                ra9 ra9Var = this.a[e.f];
                yt6 yt6Var2 = au6Var.i;
                while (true) {
                    if (yt6Var2 == null) {
                        yt6Var2 = au6Var.d();
                        break;
                    }
                    if (ra9Var.i(yt6Var2)) {
                        break;
                    }
                    yt6Var2 = yt6Var2.m;
                }
                if (yt6Var2 != null) {
                    e = e.a(yt6Var2.g.a);
                }
            }
            int i4 = e.f;
            byte b2 = e.d;
            xgb xgbVar2 = this.h;
            if (b2 == 1 && (vz6Var = e.r) != null && A(i4, vz6Var)) {
                this.v0 = true;
                g();
                yt6 k = au6Var.k(i4);
                yt6 yt6Var3 = au6Var.i;
                if (yt6Var3 != k) {
                    while (yt6Var3 != null) {
                        yt6 yt6Var4 = yt6Var3.m;
                        if (yt6Var4 == k) {
                            break;
                        }
                        yt6Var3 = yt6Var4;
                    }
                }
                au6Var.s(yt6Var3);
                if (this.Y.e != 4) {
                    C();
                    xgbVar2.h(2);
                }
            } else {
                e64 e64Var = this.r0;
                if (e64Var != null) {
                    e64Var.addSuppressed(e);
                    e = this.r0;
                }
                if (e.d != 1 || au6Var.i == au6Var.f()) {
                    xgbVar = xgbVar2;
                } else {
                    yt6 yt6Var5 = au6Var.i;
                    while (true) {
                        if (yt6Var5 == null) {
                            yt6Var5 = au6Var.d();
                            break;
                        }
                        if (yt6Var5.g.a.equals(e.r)) {
                            break;
                        }
                        yt6Var5 = yt6Var5.m;
                    }
                    while (true) {
                        yt6Var = au6Var.i;
                        if (yt6Var == yt6Var5) {
                            break;
                        }
                        au6Var.a();
                    }
                    yve.k(yt6Var);
                    E(message.what);
                    zt6 zt6Var = yt6Var.g;
                    vz6 vz6Var2 = zt6Var.a;
                    long j = zt6Var.b;
                    xgbVar = xgbVar2;
                    this.Y = x(vz6Var2, j, zt6Var.d, j, true, 0);
                }
                if (e.s && (this.r0 == null || (i2 = e.a) == 5004 || i2 == 5003)) {
                    efd.g("ExoPlayerImplInternal", "Recoverable renderer error", e);
                    if (this.r0 == null) {
                        this.r0 = e;
                    }
                    wgb c = xgbVar.c(25, e);
                    Handler handler = xgbVar.a;
                    Message message2 = c.a;
                    message2.getClass();
                    handler.sendMessageAtFrontOfQueue(message2);
                    c.a();
                } else {
                    efd.d("ExoPlayerImplInternal", "Playback error", e);
                    v0(true, false);
                    this.Y = this.Y.f(e);
                }
            }
        } catch (hy7 e2) {
            boolean z2 = e2.a;
            byte b3 = e2.b;
            if (b3 == 1) {
                i = z2 ? 3001 : 3003;
            } else {
                if (b3 == 4) {
                    i = z2 ? 3002 : 3004;
                }
                s(e2, r3);
            }
            r3 = i;
            s(e2, r3);
        } catch (ir3 e3) {
            s(e3, e3.a);
        } catch (IOException e4) {
            s(e4, 2000);
        } catch (RuntimeException e5) {
            e64 e64Var2 = new e64(2, e5, ((e5 instanceof IllegalStateException) || (e5 instanceof IllegalArgumentException)) ? 1004 : 1000);
            efd.d("ExoPlayerImplInternal", "Playback error", e64Var2);
            v0(true, false);
            this.Y = this.Y.f(e64Var2);
        } catch (k73 e6) {
            s(e6, e6.a);
        } catch (kh0 e7) {
            s(e7, 1002);
        }
        E(message.what);
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:489:0x088a, code lost:
    
        if (r4 >= r5.c) goto L468;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x02f9, code lost:
    
        if (((long) ((r4.e() - r30.n0) / r30.y.f().a)) <= r18) goto L151;
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
        nf8 nf8Var;
        long j3;
        boolean z4;
        boolean z5;
        long j4;
        boolean z6;
        boolean z7;
        nf8 nf8Var2;
        int i2;
        byte b;
        long j5;
        zt6 e;
        yt6 yt6Var;
        long j6;
        int i3;
        yt6 d;
        yt6 d2;
        byte b2;
        ra9[] ra9VarArr;
        au6 au6Var;
        boolean z8;
        yt6 yt6Var2;
        yt6 yt6Var3;
        int i4;
        yt6 a;
        boolean z9;
        byte b3;
        int i5;
        int i6;
        int i7;
        boolean z10;
        yt6[] yt6VarArr;
        byte b4;
        yt6 yt6Var4;
        byte b5;
        byte b6;
        yt6 c;
        yt6 yt6Var5;
        boolean z11;
        d2c d2cVar;
        long j7;
        boolean z12;
        this.F.getClass();
        long uptimeMillis = SystemClock.uptimeMillis();
        this.h.g(2);
        nf8 nf8Var3 = this.Y;
        int i8 = nf8Var3.e;
        if (i8 == 1 || i8 == 4) {
            return;
        }
        int i9 = 0;
        if (nf8Var3.a.p() || !this.I.l) {
            j = uptimeMillis;
            i = 5;
        } else {
            this.H.r(this.n0);
            au6 au6Var2 = this.H;
            yt6 yt6Var6 = au6Var2.l;
            if (yt6Var6 == null || (!yt6Var6.g.i && yt6Var6.g() && au6Var2.l.g.e != -9223372036854775807L && au6Var2.n < 100)) {
                au6 au6Var3 = this.H;
                long j8 = this.n0;
                nf8 nf8Var4 = this.Y;
                j5 = -9223372036854775807L;
                yt6 yt6Var7 = au6Var3.l;
                if (yt6Var7 == null) {
                    j = uptimeMillis;
                    e = au6Var3.h(nf8Var4.a, nf8Var4.b, nf8Var4.c, nf8Var4.s, -9223372036854775807L);
                } else {
                    j = uptimeMillis;
                    e = au6Var3.e(nf8Var4.a, yt6Var7, j8);
                }
                if (e != null) {
                    au6 au6Var4 = this.H;
                    yt6 yt6Var8 = au6Var4.l;
                    long j9 = yt6Var8 == null ? 1000000000000L : (yt6Var8.p + yt6Var8.g.e) - e.b;
                    int i10 = 0;
                    while (true) {
                        if (i10 >= au6Var4.q.size()) {
                            yt6Var = null;
                            break;
                        }
                        zt6 zt6Var = ((yt6) au6Var4.q.get(i10)).g;
                        long j10 = zt6Var.e;
                        long j11 = e.e;
                        if ((j10 == -9223372036854775807L || j10 == j11) && zt6Var.b == e.b && zt6Var.a.equals(e.a)) {
                            yt6Var = (yt6) au6Var4.q.remove(i10);
                            break;
                        }
                        i10++;
                    }
                    if (yt6Var == null) {
                        c74 c74Var = (c74) au6Var4.e.b;
                        vg0[] vg0VarArr = c74Var.b;
                        ld3 ld3Var = c74Var.d;
                        ec3 ec3Var = c74Var.f;
                        ig8 ig8Var = c74Var.L;
                        ec3Var.getClass();
                        rx6 rx6Var = new rx6(ec3Var, ig8Var);
                        i07 i07Var = c74Var.I;
                        d2c d2cVar2 = c74Var.e;
                        c74Var.t0.getClass();
                        yt6Var = new yt6(vg0VarArr, j9, ld3Var, rx6Var, i07Var, e, d2cVar2);
                    } else {
                        yt6Var.g = e;
                        yt6Var.p = j9;
                    }
                    yt6 yt6Var9 = au6Var4.l;
                    if (yt6Var9 == null) {
                        au6Var4.i = yt6Var;
                        Arrays.fill(au6Var4.j, yt6Var);
                        Arrays.fill(au6Var4.k, yt6Var);
                    } else if (yt6Var != yt6Var9.m) {
                        yt6Var9.b();
                        yt6Var9.m = yt6Var;
                        yt6Var9.c();
                    }
                    au6Var4.o = null;
                    au6Var4.l = yt6Var;
                    au6Var4.n++;
                    au6Var4.q();
                    if (!yt6Var.d) {
                        long j12 = e.b;
                        yt6Var.d = true;
                        yt6Var.a.q(this, j12);
                    } else if (yt6Var.e) {
                        this.h.c(8, yt6Var.a).b();
                    }
                    if (this.H.i == yt6Var) {
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
            au6 au6Var5 = this.H;
            long j13 = 10000000;
            if (!this.c0 && this.P && !this.v0 && !e() && (c = au6Var5.c()) != null && c == au6Var5.d() && (yt6Var5 = c.m) != null && (z11 = yt6Var5.e)) {
                yve.p(z11);
                if (((long) ((yt6Var5.e() - this.n0) / this.y.f().a)) > 10000000) {
                    j6 = 10000000;
                    i3 = 0;
                } else {
                    int i11 = 0;
                    while (true) {
                        yt6[] yt6VarArr2 = au6Var5.k;
                        if (i11 >= yt6VarArr2.length) {
                            break;
                        }
                        yt6 yt6Var10 = yt6VarArr2[i11];
                        yt6Var10.getClass();
                        yt6VarArr2[i11] = yt6Var10.m;
                        au6Var5.q();
                        i11++;
                    }
                    ra9[] ra9VarArr2 = this.a;
                    i9 = 0;
                    yt6 c2 = au6Var5.c();
                    if (c2 != null) {
                        d2c d2cVar3 = c2.o;
                        boolean z13 = false;
                        while (i9 < ra9VarArr2.length) {
                            if (d2cVar3.q(i9)) {
                                ra9 ra9Var = ra9VarArr2[i9];
                                if (ra9Var.c == null || ra9Var.g()) {
                                    d2cVar = d2cVar3;
                                    j7 = j13;
                                    z12 = false;
                                } else {
                                    ra9 ra9Var2 = ra9VarArr2[i9];
                                    yve.p(!ra9Var2.g());
                                    if (ra9.k(ra9Var2.a)) {
                                        ra9Var2.d = (byte) 4;
                                    } else {
                                        vg0 vg0Var = ra9Var2.c;
                                        if (vg0Var != null && vg0Var.n != 0) {
                                            ra9Var2.d = (byte) 5;
                                        } else if (ra9Var2.d == 0) {
                                            ra9Var2.d = (byte) 2;
                                        } else {
                                            ra9Var2.d = (byte) 3;
                                        }
                                    }
                                    d2cVar = d2cVar3;
                                    j7 = j13;
                                    z12 = false;
                                    j(c2, i9, false, c2.e());
                                }
                            } else {
                                d2cVar = d2cVar3;
                                j7 = j13;
                                z12 = z13;
                            }
                            i9++;
                            z13 = z12;
                            d2cVar3 = d2cVar;
                            j13 = j7;
                        }
                        j6 = j13;
                        boolean z14 = z13;
                        i3 = z14;
                        if (e()) {
                            this.u0 = c2.a.p();
                            i3 = z14;
                            if (!c2.g()) {
                                au6Var5.s(c2);
                                t(z14);
                                C();
                                i3 = z14;
                            }
                        }
                    }
                }
                boolean z15 = this.P;
                ra9[] ra9VarArr3 = this.a;
                au6 au6Var6 = this.H;
                d = au6Var6.d();
                if (d != null) {
                    if (d.m != null && !this.c0) {
                        yt6 d3 = au6Var6.d();
                        if (d3.e) {
                            ra9[] ra9VarArr4 = this.a;
                            int length = ra9VarArr4.length;
                            int i12 = i3;
                            while (true) {
                                if (i12 < length) {
                                    ra9 ra9Var3 = ra9VarArr4[i12];
                                    if (!ra9Var3.e(d3, ra9Var3.a) || !ra9Var3.e(d3, ra9Var3.c)) {
                                        break;
                                    } else {
                                        i12++;
                                    }
                                } else if (!e() || au6Var6.c() != au6Var6.d()) {
                                    yt6 yt6Var11 = d.m;
                                    if (yt6Var11.e || this.n0 >= yt6Var11.e()) {
                                        boolean z16 = d.m.e;
                                        if (z16) {
                                            yve.p(z16);
                                        }
                                        d2c d2cVar4 = d.o;
                                        int i13 = i3;
                                        while (true) {
                                            yt6VarArr = au6Var6.j;
                                            if (i13 >= yt6VarArr.length) {
                                                break;
                                            }
                                            yt6[] yt6VarArr3 = au6Var6.k;
                                            yt6 yt6Var12 = yt6VarArr3[i13];
                                            yt6 yt6Var13 = yt6VarArr[i13];
                                            if (yt6Var12 == yt6Var13) {
                                                yt6Var13.getClass();
                                                yt6VarArr3[i13] = yt6Var13.m;
                                            }
                                            yt6 yt6Var14 = yt6VarArr[i13];
                                            yt6Var14.getClass();
                                            yt6VarArr[i13] = yt6Var14.m;
                                            au6Var6.q();
                                            yt6VarArr[i13].getClass();
                                            i13++;
                                        }
                                        yt6 yt6Var15 = yt6VarArr[i3];
                                        yt6Var15.getClass();
                                        d2c d2cVar5 = yt6Var15.o;
                                        asb asbVar = this.Y.a;
                                        long j14 = j5;
                                        C0(asbVar, yt6Var15.g.a, asbVar, d.g.a, -9223372036854775807L, false);
                                        if (yt6Var15.e && ((z15 && this.u0 != j14) || yt6Var15.a.p() != j14)) {
                                            this.u0 = j14;
                                            boolean z17 = z15 && !this.v0;
                                            if (z17) {
                                                int i14 = 0;
                                                while (true) {
                                                    if (i14 >= ra9VarArr3.length) {
                                                        break;
                                                    }
                                                    boolean q = d2cVar5.q(i14);
                                                    e74[] e74VarArr = (e74[]) d2cVar5.d;
                                                    if (q && ra9VarArr3[i14].a.b != -2 && !dg7.a(e74VarArr[i14].n().t, e74VarArr[i14].n().l) && !ra9VarArr3[i14].g()) {
                                                        z17 = false;
                                                        break;
                                                    }
                                                    i14++;
                                                }
                                            }
                                            if (!z17) {
                                                long e2 = yt6Var15.e();
                                                int length2 = ra9VarArr3.length;
                                                int i15 = 0;
                                                while (i15 < length2) {
                                                    ra9 ra9Var4 = ra9VarArr3[i15];
                                                    vg0 vg0Var2 = ra9Var4.c;
                                                    vg0 vg0Var3 = ra9Var4.a;
                                                    if (ra9.k(vg0Var3) && (b6 = ra9Var4.d) != 5 && b6 != 2) {
                                                        ra9.o(vg0Var3, e2);
                                                    }
                                                    if (vg0Var2 == null || vg0Var2.n == 0 || (b5 = ra9Var4.d) == 4 || b5 == 3) {
                                                        yt6Var4 = yt6Var15;
                                                    } else {
                                                        yt6Var4 = yt6Var15;
                                                        ra9.o(vg0Var2, e2);
                                                    }
                                                    i15++;
                                                    yt6Var15 = yt6Var4;
                                                }
                                                yt6 yt6Var16 = yt6Var15;
                                                if (!yt6Var16.g()) {
                                                    au6Var6.s(yt6Var16);
                                                    t(false);
                                                    C();
                                                }
                                            }
                                        }
                                        for (ra9 ra9Var5 : ra9VarArr3) {
                                            long e3 = yt6Var15.e();
                                            vg0 vg0Var4 = ra9Var5.a;
                                            int i16 = ra9Var5.b;
                                            boolean q2 = d2cVar4.q(i16);
                                            boolean q3 = d2cVar5.q(i16);
                                            vg0 vg0Var5 = ra9Var5.c;
                                            if (vg0Var5 == null || (b4 = ra9Var5.d) == 4 || b4 == 3 || (b4 == 0 && ra9.k(vg0Var4))) {
                                                vg0Var5 = vg0Var4;
                                            }
                                            if (q2 && !vg0Var5.E) {
                                                boolean z18 = vg0Var4.b == -2;
                                                qa9 qa9Var = ((qa9[]) d2cVar4.c)[i16];
                                                qa9 qa9Var2 = ((qa9[]) d2cVar5.c)[i16];
                                                if (!q3 || !Objects.equals(qa9Var2, qa9Var) || z18 || ra9Var5.g()) {
                                                    ra9.o(vg0Var5, e3);
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    } else if (d.g.i || this.c0) {
                        for (ra9 ra9Var6 : ra9VarArr3) {
                            if (ra9Var6.i(d)) {
                                vg0 d4 = ra9Var6.d(d);
                                d4.getClass();
                                if (d4.m()) {
                                    long j15 = d.g.e;
                                    long j16 = (j15 == j5 || j15 == Long.MIN_VALUE) ? j5 : j15 + d.p;
                                    vg0 d5 = ra9Var6.d(d);
                                    d5.getClass();
                                    ra9.o(d5, j16);
                                }
                            }
                        }
                    }
                }
                au6 au6Var7 = this.H;
                d2 = au6Var7.d();
                if (d2 != null && au6Var7.i != d2) {
                    for (i7 = 0; i7 < this.a.length; i7++) {
                        if (!d2.h[i7]) {
                            yt6 d6 = au6Var7.d();
                            d2c d2cVar6 = d6.o;
                            ra9[] ra9VarArr5 = this.a;
                            boolean z19 = true;
                            for (ra9 ra9Var7 : ra9VarArr5) {
                                int c3 = ra9Var7.c();
                                fc3 fc3Var = this.y;
                                int m = ra9Var7.m(ra9Var7.a, d6, d2cVar6, fc3Var);
                                int m2 = ra9Var7.m(ra9Var7.c, d6, d2cVar6, fc3Var);
                                if (m == 1) {
                                    m = m2;
                                }
                                if ((m & 2) != 0 && (z10 = this.k0) && z10) {
                                    this.k0 = false;
                                    if (this.Y.p) {
                                        this.h.h(2);
                                    }
                                }
                                this.l0 -= c3 - ra9Var7.c();
                                z19 &= (m & 1) != 0;
                            }
                            if (z19) {
                                for (int i17 = 0; i17 < ra9VarArr5.length; i17++) {
                                    if (d2cVar6.q(i17) && !ra9VarArr5[i17].i(d6)) {
                                        j(d6, i17, false, d6.e());
                                    }
                                }
                            }
                            b2 = 3;
                            if (z19) {
                                a0(au6Var7.d());
                            }
                            ra9VarArr = this.a;
                            au6Var = this.H;
                            z8 = false;
                            loop9: while (s0() && !this.c0 && (yt6Var2 = au6Var.i) != null && (yt6Var3 = yt6Var2.m) != null && this.n0 >= yt6Var3.e()) {
                                for (i4 = 0; i4 < this.a.length; i4++) {
                                    if (!yt6Var3.h[i4]) {
                                        break loop9;
                                    }
                                }
                                if (z8) {
                                    E(-1);
                                }
                                this.v0 = false;
                                a = au6Var.a();
                                a.getClass();
                                if (this.Y.b.a.equals(a.g.a.a)) {
                                    vz6 vz6Var = this.Y.b;
                                    if (vz6Var.b == -1) {
                                        vz6 vz6Var2 = a.g.a;
                                        if (vz6Var2.b == -1 && vz6Var.e != vz6Var2.e) {
                                            z9 = true;
                                            zt6 zt6Var2 = a.g;
                                            vz6 vz6Var3 = zt6Var2.a;
                                            boolean z20 = z9;
                                            long j17 = zt6Var2.b;
                                            b3 = b2;
                                            this.Y = x(vz6Var3, j17, zt6Var2.d, j17, !z20, 0);
                                            P();
                                            B0();
                                            for (i5 = 0; i5 < ra9VarArr.length; i5++) {
                                                if ((!this.P ? false : this.a[i5].g()) && a == au6Var.k[i5]) {
                                                    ra9 ra9Var8 = ra9VarArr[i5];
                                                    byte b7 = ra9Var8.d;
                                                    if (b7 == 4 || b7 == 5) {
                                                        boolean z21 = b7 == 5;
                                                        vg0 vg0Var6 = ra9Var8.a;
                                                        vg0 vg0Var7 = ra9Var8.c;
                                                        if (z21) {
                                                            vg0Var7.getClass();
                                                            vg0Var7.d(17, vg0Var6);
                                                        } else {
                                                            vg0Var7.getClass();
                                                            vg0Var6.d(17, vg0Var7);
                                                        }
                                                        ra9Var8.d = ra9Var8.d == 5 ? (byte) 0 : (byte) 1;
                                                    } else if (b7 == 2) {
                                                        ra9Var8.d = (byte) 0;
                                                    } else if (b7 == b3) {
                                                        ra9Var8.d = (byte) 1;
                                                    }
                                                }
                                            }
                                            if (this.Y.e == b3) {
                                                u0();
                                            }
                                            d2c d2cVar7 = au6Var.i.o;
                                            for (i6 = 0; i6 < ra9VarArr.length; i6++) {
                                                if (d2cVar7.q(i6)) {
                                                    ra9 ra9Var9 = ra9VarArr[i6];
                                                    vg0 vg0Var8 = ra9Var9.c;
                                                    vg0 vg0Var9 = ra9Var9.a;
                                                    if (ra9.k(vg0Var9)) {
                                                        vg0Var9.i();
                                                    } else if (vg0Var8 != null && vg0Var8.n != 0) {
                                                        vg0Var8.i();
                                                    }
                                                }
                                            }
                                            b2 = b3;
                                            z8 = true;
                                        }
                                    }
                                }
                                z9 = false;
                                zt6 zt6Var22 = a.g;
                                vz6 vz6Var32 = zt6Var22.a;
                                boolean z202 = z9;
                                long j172 = zt6Var22.b;
                                b3 = b2;
                                this.Y = x(vz6Var32, j172, zt6Var22.d, j172, !z202, 0);
                                P();
                                B0();
                                while (i5 < ra9VarArr.length) {
                                }
                                if (this.Y.e == b3) {
                                }
                                d2c d2cVar72 = au6Var.i.o;
                                while (i6 < ra9VarArr.length) {
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
                ra9VarArr = this.a;
                au6Var = this.H;
                z8 = false;
                loop9: while (s0()) {
                    while (i4 < this.a.length) {
                    }
                    if (z8) {
                    }
                    this.v0 = false;
                    a = au6Var.a();
                    a.getClass();
                    if (this.Y.b.a.equals(a.g.a.a)) {
                    }
                    z9 = false;
                    zt6 zt6Var222 = a.g;
                    vz6 vz6Var322 = zt6Var222.a;
                    boolean z2022 = z9;
                    long j1722 = zt6Var222.b;
                    b3 = b2;
                    this.Y = x(vz6Var322, j1722, zt6Var222.d, j1722, !z2022, 0);
                    P();
                    B0();
                    while (i5 < ra9VarArr.length) {
                    }
                    if (this.Y.e == b3) {
                    }
                    d2c d2cVar722 = au6Var.i.o;
                    while (i6 < ra9VarArr.length) {
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
            ra9[] ra9VarArr32 = this.a;
            au6 au6Var62 = this.H;
            d = au6Var62.d();
            if (d != null) {
            }
            au6 au6Var72 = this.H;
            d2 = au6Var72.d();
            if (d2 != null) {
                while (i7 < this.a.length) {
                }
            }
            b2 = 3;
            ra9VarArr = this.a;
            au6Var = this.H;
            z8 = false;
            loop9: while (s0()) {
            }
            i = 5;
            this.t0.getClass();
        }
        yt6 yt6Var17 = this.H.i;
        long j18 = j;
        if (yt6Var17 == null) {
            U(j18);
            return;
        }
        Trace.beginSection("doSomeWork");
        B0();
        if (yt6Var17.e) {
            this.F.getClass();
            this.o0 = gcc.T(SystemClock.elapsedRealtime());
            yt6Var17.a.n(this.Y.s - this.x);
            int i18 = 0;
            boolean z22 = false;
            z = true;
            z2 = true;
            while (true) {
                ra9[] ra9VarArr6 = this.a;
                if (i18 >= ra9VarArr6.length) {
                    break;
                }
                ra9 ra9Var10 = ra9VarArr6[i18];
                if (ra9Var10.c() == 0) {
                    G(i18, false);
                } else {
                    long j19 = this.n0;
                    long j20 = this.o0;
                    vg0 vg0Var10 = ra9Var10.c;
                    vg0 vg0Var11 = ra9Var10.a;
                    if (ra9.k(vg0Var11)) {
                        vg0Var11.B(j19, j20);
                    }
                    if (vg0Var10 != null && vg0Var10.n != 0) {
                        vg0Var10.B(j19, j20);
                    }
                    boolean z23 = z2 && ra9Var10.f();
                    boolean z24 = (this.V && ra9Var10.j() && ((b = ra9Var10.a.b) == 2 || b == 4) && !ra9Var10.f()) ? true : z22;
                    vg0 d7 = ra9Var10.d(yt6Var17);
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
            yt6Var17.a.l();
            z = true;
            z2 = true;
        }
        long j21 = yt6Var17.g.e;
        if (z2 && yt6Var17.e) {
            j2 = -9223372036854775807L;
            if (j21 == -9223372036854775807L || j21 <= this.Y.s) {
                z3 = true;
                if (z3 && this.c0) {
                    this.c0 = false;
                    int i19 = this.Y.n;
                    this.Z.a(0);
                    A0(this.Q.c(this.Y.e, false), i19, i, false);
                }
                if (z3 || !yt6Var17.g.i) {
                    nf8Var = this.Y;
                    if (nf8Var.e != 2) {
                        au6 au6Var8 = this.H;
                        if (this.l0 == 0) {
                            z6 = B();
                            j3 = j2;
                        } else {
                            if (z) {
                                if (nf8Var.g) {
                                    yt6 yt6Var18 = au6Var8.i;
                                    long j22 = t0(nf8Var.a, yt6Var18.g.a) ? this.J.h : j2;
                                    yt6 yt6Var19 = au6Var8.l;
                                    boolean z26 = yt6Var19.g() && yt6Var19.g.i;
                                    boolean z27 = yt6Var19.g.a.c() && !yt6Var19.e;
                                    if (!z26 && !z27) {
                                        long o = o(yt6Var19.d());
                                        ec3 ec3Var2 = this.f;
                                        ig8 ig8Var2 = this.L;
                                        asb asbVar2 = this.Y.a;
                                        vz6 vz6Var4 = yt6Var18.g.a;
                                        float f = this.y.f().a;
                                        j3 = j2;
                                        boolean z28 = this.Y.l;
                                        boolean z29 = this.d0;
                                        ec3Var2.getClass();
                                        long j23 = j22;
                                        bt6 bt6Var = asbVar2.m(asbVar2.g(vz6Var4.a, ec3Var2.b).c, ec3Var2.a, 0L).b.b;
                                        if (bt6Var != null) {
                                            String scheme = bt6Var.a.getScheme();
                                            if (TextUtils.isEmpty(scheme) || ec3.q.contains(scheme)) {
                                                z5 = true;
                                                long H = gcc.H(o, f);
                                                j4 = !z29 ? z5 ? ec3Var2.k : ec3Var2.j : z5 ? ec3Var2.i : ec3Var2.h;
                                                if (j23 != j3) {
                                                    j4 = Math.min(j23 / 2, j4);
                                                }
                                                if (j4 > 0 && H < j4) {
                                                    if (!(!z5 ? ec3Var2.l : false)) {
                                                        int b8 = ec3Var2.b(ig8Var2);
                                                        dc3 dc3Var = (dc3) ec3Var2.o.get(ig8Var2);
                                                        dc3Var.getClass();
                                                    }
                                                }
                                                z6 = true;
                                            }
                                        }
                                        z5 = false;
                                        long H2 = gcc.H(o, f);
                                        if (!z29) {
                                        }
                                        if (j23 != j3) {
                                        }
                                        if (j4 > 0) {
                                            if (!(!z5 ? ec3Var2.l : false)) {
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
                                fc3 fc3Var2 = this.y;
                                z4 = true;
                                fc3Var2.b = true;
                                ((ze2) fc3Var2.c).b();
                                u0();
                                if (this.Y.e == 2) {
                                    int i20 = 0;
                                    while (true) {
                                        ra9[] ra9VarArr7 = this.a;
                                        if (i20 >= ra9VarArr7.length) {
                                            break;
                                        }
                                        if (ra9VarArr7[i20].i(yt6Var17)) {
                                            F(i20);
                                        }
                                        i20++;
                                    }
                                    nf8 nf8Var5 = this.Y;
                                    if (!nf8Var5.g && nf8Var5.r < 500000 && y(this.H.l) && s0()) {
                                        long j24 = this.s0;
                                        vgb vgbVar = this.F;
                                        if (j24 == -9223372036854775807L) {
                                            vgbVar.getClass();
                                            this.s0 = SystemClock.elapsedRealtime();
                                        } else {
                                            vgbVar.getClass();
                                            if (SystemClock.elapsedRealtime() - this.s0 >= 4000) {
                                                throw new ydb(0, 4000);
                                            }
                                        }
                                        boolean z30 = (s0() || this.Y.e != 3) ? false : z4;
                                        z7 = (!this.k0 && this.j0 && z30) ? z4 : false;
                                        nf8Var2 = this.Y;
                                        if (nf8Var2.p != z7) {
                                            nf8Var2 = nf8Var2.i(z7);
                                            this.Y = nf8Var2;
                                        }
                                        this.j0 = false;
                                        if (!z7 && (i2 = nf8Var2.e) != 4 && (z30 || i2 == 2 || (i2 == 3 && this.l0 != 0))) {
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
                                nf8Var2 = this.Y;
                                if (nf8Var2.p != z7) {
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
                            for (yt6 yt6Var20 = this.H.i; yt6Var20 != null; yt6Var20 = yt6Var20.m) {
                                for (e74 e74Var : (e74[]) yt6Var20.o.d) {
                                    if (e74Var != null) {
                                        e74Var.t();
                                    }
                                }
                            }
                            cc3 cc3Var = this.J;
                            long j25 = cc3Var.h;
                            if (j25 != j3) {
                                long j26 = j25 + cc3Var.b;
                                cc3Var.h = j26;
                                long j27 = cc3Var.g;
                                if (j27 != j3 && j26 > j27) {
                                    cc3Var.h = j27;
                                }
                                cc3Var.l = j3;
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
                    nf8Var2 = this.Y;
                    if (nf8Var2.p != z7) {
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
                nf8Var2 = this.Y;
                if (nf8Var2.p != z7) {
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
        nf8Var = this.Y;
        if (nf8Var.e != 2) {
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
        nf8Var2 = this.Y;
        if (nf8Var2.p != z7) {
        }
        this.j0 = false;
        if (!z7) {
        }
        Trace.endSection();
    }

    public final void i0(g64 g64Var) {
        this.t0 = g64Var;
        asb asbVar = this.Y.a;
        au6 au6Var = this.H;
        au6Var.getClass();
        g64Var.getClass();
        if (au6Var.q.isEmpty()) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < au6Var.q.size(); i++) {
            ((yt6) au6Var.q.get(i)).i();
        }
        au6Var.q = arrayList;
        au6Var.m = null;
        au6Var.p();
    }

    public final void j(yt6 yt6Var, int i, boolean z, long j) {
        ra9 ra9Var = this.a[i];
        boolean j2 = ra9Var.j();
        vg0 vg0Var = ra9Var.a;
        if (j2) {
            return;
        }
        boolean z2 = yt6Var == this.H.i;
        d2c d2cVar = yt6Var.o;
        qa9 qa9Var = ((qa9[]) d2cVar.c)[i];
        e74 e74Var = ((e74[]) d2cVar.d)[i];
        boolean z3 = s0() && this.Y.e == 3;
        boolean z4 = !z && z3;
        this.l0++;
        at9 at9Var = yt6Var.c[i];
        long j3 = yt6Var.p;
        vz6 vz6Var = yt6Var.g.a;
        vg0 vg0Var2 = ra9Var.c;
        int length = e74Var != null ? e74Var.length() : 0;
        ko4[] ko4VarArr = new ko4[length];
        for (int i2 = 0; i2 < length; i2++) {
            e74Var.getClass();
            ko4VarArr[i2] = e74Var.i(i2);
        }
        byte b = ra9Var.d;
        fc3 fc3Var = this.y;
        if (b == 0 || b == 2 || b == 5) {
            ra9Var.e = true;
            yve.p(vg0Var.n == 0);
            vg0Var.d = qa9Var;
            vg0Var.H = vz6Var;
            vg0Var.n = (byte) 1;
            vg0Var.r(z4, z2);
            vg0Var.C(ko4VarArr, at9Var, j, j3, vz6Var);
            vg0Var.D(j, z4, true);
            fc3Var.i(vg0Var);
        } else {
            ra9Var.f = true;
            vg0Var2.getClass();
            yve.p(vg0Var2.n == 0);
            vg0Var2.d = qa9Var;
            vg0Var2.H = vz6Var;
            vg0Var2.n = (byte) 1;
            vg0Var2.r(z4, z2);
            vg0Var2.C(ko4VarArr, at9Var, j, j3, vz6Var);
            vg0Var2.D(j, z4, true);
            fc3Var.i(vg0Var2);
        }
        w64 w64Var = new w64(this);
        vg0 d = ra9Var.d(yt6Var);
        d.getClass();
        d.d(11, w64Var);
        if (z3 && z2) {
            ra9Var.p();
        }
    }

    public final void j0(int i) {
        this.g0 = i;
        asb asbVar = this.Y.a;
        au6 au6Var = this.H;
        au6Var.g = i;
        int w = au6Var.w(asbVar);
        if ((w & 1) != 0) {
            V(true);
        } else if ((w & 2) != 0) {
            g();
        }
        t(false);
    }

    public final void k(long j, boolean[] zArr) {
        ra9[] ra9VarArr;
        c74 c74Var;
        long j2;
        yve.p(!z());
        yt6 d = this.H.d();
        d2c d2cVar = d.o;
        int i = 0;
        while (true) {
            ra9VarArr = this.a;
            if (i >= ra9VarArr.length) {
                break;
            }
            if (!d2cVar.q(i)) {
                ra9VarArr[i].n();
            }
            i++;
        }
        int i2 = 0;
        while (i2 < ra9VarArr.length) {
            if (!d2cVar.q(i2) || ra9VarArr[i2].i(d)) {
                c74Var = this;
                j2 = j;
            } else {
                c74Var = this;
                j2 = j;
                c74Var.j(d, i2, zArr[i2], j2);
            }
            i2++;
            this = c74Var;
            j = j2;
        }
    }

    public final void k0(boolean z) {
        if (!z) {
            b74 b74Var = this.W;
            xgb xgbVar = this.h;
            if (b74Var != null && this.V && !xgbVar.a.hasMessages(37)) {
                this.X++;
            }
            int i = this.X;
            if (i > 0) {
                this.O.e(new hl3((Object) this, i, (byte) 6));
            }
            this.X = 0;
            this.V = false;
            xgbVar.g(37);
            b74 b74Var2 = this.W;
            if (b74Var2 != null) {
                W(b74Var2);
                this.W = null;
                this.V = false;
            }
        }
        this.U = z;
        d();
    }

    public final long l(asb asbVar, Object obj, long j) {
        xrb xrbVar = this.w;
        int i = asbVar.g(obj, xrbVar).c;
        zrb zrbVar = this.s;
        asbVar.n(i, zrbVar);
        if (zrbVar.e != -9223372036854775807L && zrbVar.a() && zrbVar.h) {
            return gcc.T(gcc.E(zrbVar.f) - zrbVar.e) - (j + xrbVar.e);
        }
        return -9223372036854775807L;
    }

    public final void l0(fv9 fv9Var) {
        this.T = fv9Var;
        d();
    }

    public final Pair m(asb asbVar) {
        long j = 0;
        if (asbVar.p()) {
            return Pair.create(nf8.u, 0L);
        }
        int a = asbVar.a(this.h0);
        Pair i = asbVar.i(this.s, this.w, a, -9223372036854775807L);
        vz6 u = this.H.u(this.Y, asbVar, i.first, 0L, true, false);
        long longValue = ((Long) i.second).longValue();
        if (u.c()) {
            Object obj = u.a;
            xrb xrbVar = this.w;
            asbVar.g(obj, xrbVar);
            if (u.c == xrbVar.e(u.b)) {
                ea eaVar = ea.c;
            }
        } else {
            j = longValue;
        }
        return Pair.create(u, Long.valueOf(j));
    }

    public final void m0(boolean z) {
        this.h0 = z;
        asb asbVar = this.Y.a;
        au6 au6Var = this.H;
        au6Var.h = z;
        int w = au6Var.w(asbVar);
        if ((w & 1) != 0) {
            V(true);
        } else if ((w & 2) != 0) {
            g();
        }
        t(false);
    }

    public final long n(yt6 yt6Var, int i) {
        if (yt6Var == null) {
            return 0L;
        }
        if (yt6Var.e) {
            ra9[] ra9VarArr = this.a;
            if (ra9VarArr[i].i(yt6Var)) {
                vg0 d = ra9VarArr[i].d(yt6Var);
                Objects.requireNonNull(d);
                return d.y;
            }
        }
        return yt6Var.p;
    }

    public final void n0(pka pkaVar) {
        this.Z.a(1);
        i07 i07Var = this.I;
        int size = i07Var.c.size();
        if (pkaVar.c() != size) {
            pkaVar = pkaVar.a().b(0, size);
        }
        i07Var.k = pkaVar;
        u(i07Var.b(), false);
    }

    public final long o(long j) {
        yt6 yt6Var = this.H.l;
        if (yt6Var == null) {
            return 0L;
        }
        return Math.max(0L, j - (this.n0 - yt6Var.p));
    }

    public final void o0(int i) {
        nf8 nf8Var = this.Y;
        if (nf8Var.e != i) {
            if (i != 2) {
                this.s0 = -9223372036854775807L;
            }
            if (i != 3 && nf8Var.p) {
                nf8Var = nf8Var.i(false);
                this.Y = nf8Var;
            }
            this.Y = nf8Var.h(i);
        }
    }

    public final void p(int i) {
        nf8 nf8Var = this.Y;
        A0(i, nf8Var.n, nf8Var.m, nf8Var.l);
    }

    public final void p0(sec secVar) {
        for (ra9 ra9Var : this.a) {
            vg0 vg0Var = ra9Var.a;
            byte b = vg0Var.b;
            if (b == 2 || b == 4) {
                vg0Var.d(7, secVar);
                vg0 vg0Var2 = ra9Var.c;
                if (vg0Var2 != null) {
                    vg0Var2.d(7, secVar);
                }
            }
        }
    }

    public final void q() {
        r0(this.w0);
    }

    public final void q0(Object obj, or2 or2Var) {
        for (ra9 ra9Var : this.a) {
            vg0 vg0Var = ra9Var.a;
            if (vg0Var.b == 2) {
                byte b = ra9Var.d;
                if (b == 5 || b == 3 || b == 1) {
                    vg0 vg0Var2 = ra9Var.c;
                    vg0Var2.getClass();
                    vg0Var2.d(1, obj);
                } else {
                    vg0Var.d(1, obj);
                }
            }
        }
        int i = this.Y.e;
        if (i == 3 || i == 2) {
            this.h.h(2);
        }
        if (or2Var != null) {
            or2Var.e();
        }
    }

    public final void r(xt6 xt6Var) {
        au6 au6Var = this.H;
        yt6 yt6Var = au6Var.l;
        if (yt6Var != null && yt6Var.a == xt6Var) {
            au6Var.r(this.n0);
            C();
            return;
        }
        yt6 yt6Var2 = au6Var.m;
        if (yt6Var2 == null || yt6Var2.a != xt6Var) {
            return;
        }
        D();
    }

    public final void r0(float f) {
        this.w0 = f;
        float f2 = f * this.Q.g;
        for (ra9 ra9Var : this.a) {
            vg0 vg0Var = ra9Var.a;
            if (vg0Var.b == 1) {
                vg0Var.d(2, Float.valueOf(f2));
                vg0 vg0Var2 = ra9Var.c;
                if (vg0Var2 != null) {
                    vg0Var2.d(2, Float.valueOf(f2));
                }
            }
        }
    }

    public final void s(IOException iOException, int i) {
        e64 e64Var = new e64(0, iOException, i);
        yt6 yt6Var = this.H.i;
        if (yt6Var != null) {
            e64Var = e64Var.a(yt6Var.g.a);
        }
        efd.d("ExoPlayerImplInternal", "Playback error", e64Var);
        v0(false, false);
        this.Y = this.Y.f(e64Var);
    }

    public final boolean s0() {
        nf8 nf8Var = this.Y;
        return nf8Var.l && nf8Var.n == 0;
    }

    public final void t(boolean z) {
        yt6 yt6Var = this.H.l;
        vz6 vz6Var = yt6Var == null ? this.Y.b : yt6Var.g.a;
        boolean equals = this.Y.k.equals(vz6Var);
        if (!equals) {
            this.Y = this.Y.c(vz6Var);
        }
        nf8 nf8Var = this.Y;
        nf8Var.q = yt6Var == null ? nf8Var.s : yt6Var.d();
        nf8 nf8Var2 = this.Y;
        nf8Var2.r = o(nf8Var2.q);
        if ((!equals || z) && yt6Var != null && yt6Var.e) {
            y0(yt6Var.g.a, yt6Var.o);
        }
    }

    public final boolean t0(asb asbVar, vz6 vz6Var) {
        if (vz6Var.c() || asbVar.p()) {
            return false;
        }
        int i = asbVar.g(vz6Var.a, this.w).c;
        zrb zrbVar = this.s;
        asbVar.n(i, zrbVar);
        return zrbVar.a() && zrbVar.h && zrbVar.e != -9223372036854775807L;
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
    public final void u(asb asbVar, boolean z) {
        au6 au6Var;
        boolean z2;
        vz6 vz6Var;
        long j;
        asb asbVar2;
        zrb zrbVar;
        long j2;
        int i;
        long j3;
        int i2;
        boolean z3;
        boolean z4;
        boolean z5;
        int i3;
        boolean z6;
        nf8 nf8Var;
        xrb xrbVar;
        boolean z7;
        au6 au6Var2;
        long j4;
        asb asbVar3;
        long j5;
        long j6;
        int i4;
        asb asbVar4;
        a74 a74Var;
        int i5;
        long longValue;
        boolean z8;
        boolean z9;
        boolean z10;
        boolean z11;
        asb asbVar5;
        vz6 vz6Var2;
        ra9[] ra9VarArr;
        au6 au6Var3;
        boolean z12;
        long j7;
        long j8;
        nf8 nf8Var2 = this.Y;
        b74 b74Var = this.m0;
        au6 au6Var4 = this.H;
        int i6 = this.g0;
        boolean z13 = this.h0;
        zrb zrbVar2 = this.s;
        xrb xrbVar2 = this.w;
        boolean z14 = this.R;
        if (asbVar.p()) {
            vz6 vz6Var3 = nf8.u;
            boolean z15 = (vz6Var3.equals(nf8Var2.b) && nf8Var2.s == 0) ? false : true;
            asbVar3 = asbVar;
            a74Var = new a74(vz6Var3, 0L, -9223372036854775807L, false, true, false, z15, z15 && z && !nf8Var2.a.p() && !nf8Var2.a.g(nf8Var2.b.a, xrbVar2).f, 4);
        } else {
            vz6 vz6Var4 = nf8Var2.b;
            Object obj = vz6Var4.a;
            asb asbVar6 = nf8Var2.a;
            if (asbVar6.p() || asbVar6.g(vz6Var4.a, xrbVar2).f) {
                au6Var = au6Var4;
                z2 = true;
            } else {
                au6Var = au6Var4;
                z2 = false;
            }
            long j9 = (nf8Var2.b.c() || z2) ? nf8Var2.c : nf8Var2.s;
            if (b74Var != null) {
                vz6Var = vz6Var4;
                j = 1;
                asbVar2 = asbVar;
                Pair S = S(asbVar2, b74Var, true, i6, z13, zrbVar2, xrbVar2);
                if (S == null) {
                    i = asbVar2.a(z13);
                    longValue = j9;
                    z11 = true;
                    z10 = false;
                    z9 = false;
                } else {
                    long j10 = b74Var.c;
                    Object obj2 = S.first;
                    if (j10 == -9223372036854775807L) {
                        i = asbVar2.g(obj2, xrbVar2).c;
                        longValue = j9;
                        z8 = false;
                    } else {
                        longValue = ((Long) S.second).longValue();
                        obj = obj2;
                        i = -1;
                        z8 = true;
                    }
                    z9 = nf8Var2.e == 4;
                    z10 = z8;
                    z11 = false;
                }
                z4 = z11;
                z5 = z10;
                z3 = z9;
                i2 = -1;
                long j11 = longValue;
                zrbVar = zrbVar2;
                j2 = j11;
            } else {
                vz6Var = vz6Var4;
                j = 1;
                asbVar2 = asbVar;
                if (nf8Var2.a.p()) {
                    i = asbVar2.a(z13);
                    zrbVar = zrbVar2;
                } else if (asbVar2.b(obj) == -1) {
                    int T = T(zrbVar2, xrbVar2, i6, z13, obj, nf8Var2.a, asbVar2);
                    zrbVar = zrbVar2;
                    asbVar2 = asbVar2;
                    xrbVar2 = xrbVar2;
                    if (T == -1) {
                        i3 = asbVar2.a(z13);
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
                    zrbVar = zrbVar2;
                    if (j9 == -9223372036854775807L) {
                        int i7 = asbVar2.g(obj, xrbVar2).c;
                        obj = obj;
                        i = i7;
                    } else if (z2) {
                        nf8Var2.a.g(vz6Var.a, xrbVar2);
                        if (nf8Var2.a.m(xrbVar2.c, zrbVar, 0L).m == nf8Var2.a.b(vz6Var.a)) {
                            Pair i8 = asbVar2.i(zrbVar, xrbVar2, asbVar2.g(obj, xrbVar2).c, j9 + xrbVar2.e);
                            obj = i8.first;
                            j3 = ((Long) i8.second).longValue();
                        } else if (asbVar2.g(obj, xrbVar2).d != -9223372036854775807L) {
                            j3 = gcc.j(j9, 0L, xrbVar2.d - 1);
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
                Pair i9 = asbVar2.i(zrbVar, xrbVar2, i, -9223372036854775807L);
                obj = i9.first;
                j2 = ((Long) i9.second).longValue();
                nf8Var = nf8Var2;
                xrbVar = xrbVar2;
                z7 = z14;
                au6Var2 = au6Var;
                j4 = -9223372036854775807L;
            } else {
                nf8Var = nf8Var2;
                xrbVar = xrbVar2;
                z7 = z14;
                au6Var2 = au6Var;
                j4 = j2;
            }
            Object obj3 = obj;
            vz6 u = au6Var2.u(nf8Var, asbVar, obj3, j2, z7, z2);
            nf8 nf8Var3 = nf8Var;
            asbVar3 = asbVar;
            int i10 = u.e;
            boolean z16 = i10 == i2 || ((i5 = vz6Var.e) != i2 && i10 >= i5);
            boolean equals = vz6Var.a.equals(obj3);
            boolean z17 = equals && !vz6Var.c() && !u.c() && z16;
            if (!z2 && j9 == j4) {
                Object obj4 = vz6Var.a;
                int i11 = vz6Var.b;
                if (obj4.equals(u.a)) {
                    asbVar3.g(u.a, xrbVar);
                    if (vz6Var.c()) {
                        xrbVar.g(i11);
                    }
                    if (u.c()) {
                        xrbVar.g(u.b);
                    }
                }
            }
            if (z17) {
                u = vz6Var;
            }
            if (!u.c()) {
                if (equals && vz6Var.c()) {
                    asbVar3.g(obj3, xrbVar).getClass();
                    ca a = ea.c.a(vz6Var.b);
                    a.getClass();
                    long j12 = nf8Var3.c;
                    if (j12 == -9223372036854775807L || 0 > j12) {
                        int i12 = a.a;
                        int i13 = vz6Var.c;
                        if (i12 > i13 && a.d[i13] == 2) {
                            long j13 = asbVar3.g(obj3, xrbVar).d;
                            j5 = j13 != -9223372036854775807L ? Math.min(j13 - j, j2) : j2;
                            j6 = j5;
                        }
                    }
                }
                j5 = j2;
                j6 = j4;
            } else if (u.equals(vz6Var)) {
                j6 = j4;
                j5 = nf8Var3.s;
            } else {
                asbVar3.g(u.a, xrbVar);
                if (u.c == xrbVar.e(u.b)) {
                    ea eaVar = ea.c;
                }
                j6 = j4;
                j5 = 0;
            }
            boolean z18 = (u.equals(nf8Var3.b) && j5 == nf8Var3.s) ? false : true;
            int i14 = asbVar3.b(nf8Var3.b.a) == -1 ? 4 : 3;
            Object obj5 = u.a;
            Object obj6 = nf8Var3.b.a;
            boolean equals2 = obj5.equals(obj6);
            asb asbVar7 = obj6;
            if (equals2) {
                asbVar7 = obj6;
                if (u.b != -1) {
                    asbVar3.g(u.a, xrbVar).getClass();
                    ca a2 = ea.c.a(u.b);
                    int i15 = u.c;
                    int[] iArr = a2.d;
                    if (i15 < iArr.length) {
                        int i16 = iArr[i15];
                        asbVar7 = i15;
                    }
                    i4 = 0;
                    asbVar4 = i15;
                    a74Var = new a74(u, j5, j6, z3, z4, z5, z18, (z18 || !z || nf8Var3.a.p() || nf8Var3.a.g(nf8Var3.b.a, xrbVar).f) ? false : true, i4);
                }
            }
            i4 = i14;
            asbVar4 = asbVar7;
            a74Var = new a74(u, j5, j6, z3, z4, z5, z18, (z18 || !z || nf8Var3.a.p() || nf8Var3.a.g(nf8Var3.b.a, xrbVar).f) ? false : true, i4);
        }
        vz6 vz6Var5 = a74Var.a;
        long j14 = a74Var.b;
        try {
            if (a74Var.e) {
                if (this.Y.e != 1) {
                    o0(4);
                }
                O(false, false, false, true);
            }
            ra9[] ra9VarArr2 = this.a;
            int length = ra9VarArr2.length;
            int i17 = 0;
            asb asbVar8 = asbVar4;
            while (i17 < length) {
                ra9 ra9Var = ra9VarArr2[i17];
                vg0 vg0Var = ra9Var.a;
                boolean equals3 = vg0Var.G.equals(asbVar3);
                if (equals3 == 0) {
                    vg0Var.G = asbVar3;
                    vg0Var.J();
                    vg0Var.z();
                }
                vg0 vg0Var2 = ra9Var.c;
                if (vg0Var2 != null && !vg0Var2.G.equals(asbVar3)) {
                    vg0Var2.G = asbVar3;
                    vg0Var2.J();
                    vg0Var2.z();
                }
                i17++;
                asbVar8 = equals3;
            }
            try {
                if (a74Var.g) {
                    asb asbVar9 = asbVar3;
                    if (!asbVar9.p()) {
                        try {
                            for (yt6 yt6Var = this.H.i; yt6Var != null; yt6Var = yt6Var.m) {
                                if (yt6Var.g.a.equals(vz6Var5)) {
                                    yt6Var.g = this.H.l(asbVar9, yt6Var.g);
                                }
                            }
                            vz6Var2 = vz6Var5;
                            try {
                                j14 = X(vz6Var2, j14, z(), a74Var.d);
                                nf8 nf8Var4 = this.Y;
                                vz6 vz6Var6 = vz6Var2;
                                C0(asbVar, vz6Var6, nf8Var4.a, nf8Var4.b, !a74Var.f ? j14 : -9223372036854775807L, false);
                                if (!a74Var.g || a74Var.c != this.Y.c) {
                                    long j15 = a74Var.c;
                                    z12 = a74Var.h;
                                    if (z12) {
                                        j7 = this.Y.d;
                                        j8 = j14;
                                    } else {
                                        j8 = j14;
                                        j7 = j8;
                                    }
                                    this.Y = x(vz6Var6, j8, j15, j7, z12, a74Var.i);
                                }
                                P();
                                R(asbVar, this.Y.a);
                                this.Y = this.Y.j(asbVar);
                                if (!asbVar.p()) {
                                    this.m0 = null;
                                }
                                t(false);
                                this.h.h(2);
                            } catch (Throwable th) {
                                th = th;
                                j14 = j14;
                                asbVar5 = asbVar9;
                                nf8 nf8Var5 = this.Y;
                                asb asbVar10 = nf8Var5.a;
                                vz6 vz6Var7 = nf8Var5.b;
                                vz6 vz6Var8 = vz6Var2;
                                C0(asbVar5, vz6Var8, asbVar10, vz6Var7, !a74Var.f ? j14 : -9223372036854775807L, false);
                                if (!a74Var.g) {
                                }
                                long j16 = a74Var.c;
                                boolean z19 = a74Var.h;
                                this.Y = x(vz6Var8, j14, j16, !z19 ? j14 : this.Y.d, z19, a74Var.i);
                                P();
                                R(asbVar5, this.Y.a);
                                this.Y = this.Y.j(asbVar5);
                                if (!asbVar5.p()) {
                                }
                                t(false);
                                this.h.h(2);
                                throw th;
                            }
                        } catch (Throwable th2) {
                            th = th2;
                            vz6Var2 = vz6Var5;
                        }
                    }
                } else {
                    try {
                        long[] jArr = new long[this.a.length];
                        int i18 = 0;
                        while (true) {
                            ra9VarArr = this.a;
                            if (i18 >= ra9VarArr.length) {
                                break;
                            }
                            jArr[i18] = n(this.H.j[i18], i18);
                            i18++;
                        }
                        long[] jArr2 = new long[ra9VarArr.length];
                        int i19 = 0;
                        while (true) {
                            int length2 = this.a.length;
                            au6Var3 = this.H;
                            if (i19 >= length2) {
                                break;
                            }
                            jArr2[i19] = n(au6Var3.k[i19], i19);
                            i19++;
                        }
                        int x = au6Var3.x(asbVar3, this.n0, jArr, jArr2);
                        if ((x & 1) != 0) {
                            V(false);
                        } else if ((x & 2) != 0) {
                            g();
                        }
                    } catch (Throwable th3) {
                        th = th3;
                        asbVar8 = asbVar3;
                        asbVar5 = asbVar8;
                        vz6Var2 = vz6Var5;
                        nf8 nf8Var52 = this.Y;
                        asb asbVar102 = nf8Var52.a;
                        vz6 vz6Var72 = nf8Var52.b;
                        vz6 vz6Var82 = vz6Var2;
                        C0(asbVar5, vz6Var82, asbVar102, vz6Var72, !a74Var.f ? j14 : -9223372036854775807L, false);
                        if (!a74Var.g || a74Var.c != this.Y.c) {
                            long j162 = a74Var.c;
                            boolean z192 = a74Var.h;
                            this.Y = x(vz6Var82, j14, j162, !z192 ? j14 : this.Y.d, z192, a74Var.i);
                        }
                        P();
                        R(asbVar5, this.Y.a);
                        this.Y = this.Y.j(asbVar5);
                        if (!asbVar5.p()) {
                            this.m0 = null;
                        }
                        t(false);
                        this.h.h(2);
                        throw th;
                    }
                }
                vz6Var2 = vz6Var5;
                nf8 nf8Var42 = this.Y;
                vz6 vz6Var62 = vz6Var2;
                C0(asbVar, vz6Var62, nf8Var42.a, nf8Var42.b, !a74Var.f ? j14 : -9223372036854775807L, false);
                if (!a74Var.g) {
                }
                long j152 = a74Var.c;
                z12 = a74Var.h;
                if (z12) {
                }
                this.Y = x(vz6Var62, j8, j152, j7, z12, a74Var.i);
                P();
                R(asbVar, this.Y.a);
                this.Y = this.Y.j(asbVar);
                if (!asbVar.p()) {
                }
                t(false);
                this.h.h(2);
            } catch (Throwable th4) {
                th = th4;
            }
        } catch (Throwable th5) {
            th = th5;
            asbVar5 = asbVar3;
        }
    }

    public final void u0() {
        yt6 yt6Var = this.H.i;
        if (yt6Var == null) {
            return;
        }
        d2c d2cVar = yt6Var.o;
        int i = 0;
        while (true) {
            ra9[] ra9VarArr = this.a;
            if (i >= ra9VarArr.length) {
                return;
            }
            if (d2cVar.q(i)) {
                ra9VarArr[i].p();
            }
            i++;
        }
    }

    public final void v(xt6 xt6Var) {
        yt6 yt6Var;
        c74 c74Var;
        au6 au6Var = this.H;
        yt6 yt6Var2 = au6Var.l;
        fc3 fc3Var = this.y;
        if (yt6Var2 == null || yt6Var2.a != xt6Var) {
            int i = 0;
            while (true) {
                if (i >= au6Var.q.size()) {
                    yt6Var = null;
                    break;
                }
                yt6Var = (yt6) au6Var.q.get(i);
                if (yt6Var.a == xt6Var) {
                    break;
                } else {
                    i++;
                }
            }
            if (yt6Var != null) {
                yve.p(!yt6Var.e);
                float f = fc3Var.f().a;
                nf8 nf8Var = this.Y;
                yt6Var.f(f, nf8Var.a, nf8Var.l);
                yt6 yt6Var3 = au6Var.m;
                if (yt6Var3 == null || yt6Var3.a != xt6Var) {
                    return;
                }
                D();
                return;
            }
            return;
        }
        yt6Var2.getClass();
        if (!yt6Var2.e) {
            float f2 = fc3Var.f().a;
            nf8 nf8Var2 = this.Y;
            yt6Var2.f(f2, nf8Var2.a, nf8Var2.l);
        }
        y0(yt6Var2.g.a, yt6Var2.o);
        if (yt6Var2 == au6Var.i) {
            Q(yt6Var2.g.b, true);
            yve.p(!z());
            k(au6Var.d().e(), new boolean[this.a.length]);
            a0(yt6Var2);
            nf8 nf8Var3 = this.Y;
            vz6 vz6Var = nf8Var3.b;
            long j = yt6Var2.g.b;
            c74Var = this;
            c74Var.Y = x(vz6Var, j, nf8Var3.c, j, false, 5);
        } else {
            c74Var = this;
        }
        c74Var.C();
    }

    public final void v0(boolean z, boolean z2) {
        O(z || !this.i0, false, true, false);
        this.Z.a(z2 ? 1 : 0);
        ec3 ec3Var = this.f;
        ConcurrentHashMap concurrentHashMap = ec3Var.o;
        ig8 ig8Var = this.L;
        dc3 dc3Var = (dc3) concurrentHashMap.get(ig8Var);
        if (dc3Var != null) {
            int i = dc3Var.a - 1;
            dc3Var.a = i;
            if (i == 0) {
                concurrentHashMap.remove(ig8Var);
                ec3Var.d();
            }
        }
        this.Q.c(1, this.Y.l);
        o0(1);
    }

    public final void w(of8 of8Var, float f, boolean z, boolean z2) {
        int i;
        if (z) {
            if (z2) {
                this.Z.a(1);
            }
            this.Y = this.Y.g(of8Var);
        }
        float f2 = of8Var.a;
        yt6 yt6Var = this.H.i;
        while (true) {
            i = 0;
            if (yt6Var == null) {
                break;
            }
            e74[] e74VarArr = (e74[]) yt6Var.o.d;
            int length = e74VarArr.length;
            while (i < length) {
                e74 e74Var = e74VarArr[i];
                if (e74Var != null) {
                    e74Var.q(f2);
                }
                i++;
            }
            yt6Var = yt6Var.m;
        }
        ra9[] ra9VarArr = this.a;
        int length2 = ra9VarArr.length;
        while (i < length2) {
            ra9 ra9Var = ra9VarArr[i];
            float f3 = of8Var.a;
            ra9Var.a.E(f, f3);
            vg0 vg0Var = ra9Var.c;
            if (vg0Var != null) {
                vg0Var.E(f, f3);
            }
            i++;
        }
    }

    public final void w0() {
        fc3 fc3Var = this.y;
        fc3Var.b = false;
        ze2 ze2Var = (ze2) fc3Var.c;
        if (ze2Var.c) {
            ze2Var.a(ze2Var.g());
            ze2Var.c = false;
        }
        for (ra9 ra9Var : this.a) {
            vg0 vg0Var = ra9Var.c;
            vg0 vg0Var2 = ra9Var.a;
            if (ra9.k(vg0Var2)) {
                ra9.b(vg0Var2);
            }
            if (vg0Var != null && vg0Var.n != 0) {
                ra9.b(vg0Var);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final nf8 x(vz6 vz6Var, long j, long j2, long j3, boolean z, int i) {
        j99 j99Var;
        yt6 yt6Var;
        boolean z2;
        this.q0 = (!this.q0 && j == this.Y.s && vz6Var.equals(this.Y.b)) ? false : true;
        P();
        nf8 nf8Var = this.Y;
        u1c u1cVar = nf8Var.h;
        d2c d2cVar = nf8Var.i;
        List list = nf8Var.j;
        if (this.I.l) {
            yt6 yt6Var2 = this.H.i;
            if (yt6Var2 == null) {
                u1cVar = u1c.d;
                d2cVar = this.e;
            } else {
                u1cVar = yt6Var2.n;
                d2cVar = yt6Var2.o;
            }
            e74[] e74VarArr = (e74[]) d2cVar.d;
            mo5 mo5Var = new mo5(4);
            boolean z3 = false;
            for (e74 e74Var : e74VarArr) {
                if (e74Var != null) {
                    uf7 uf7Var = e74Var.i(0).m;
                    if (uf7Var == null) {
                        mo5Var.c(new uf7(new sf7[0]));
                    } else {
                        mo5Var.c(uf7Var);
                        z3 = true;
                    }
                }
            }
            if (z3) {
                j99Var = mo5Var.f();
            } else {
                no5 no5Var = po5.b;
                j99Var = j99.e;
            }
            list = j99Var;
            if (yt6Var2 != null) {
                zt6 zt6Var = yt6Var2.g;
                if (zt6Var.d != j2) {
                    yt6Var2.g = zt6Var.a(j2);
                }
            }
            ra9[] ra9VarArr = this.a;
            if (!z() && (yt6Var = this.H.i) != null) {
                d2c d2cVar2 = yt6Var.o;
                int i2 = 0;
                boolean z4 = false;
                while (true) {
                    if (i2 >= ra9VarArr.length) {
                        z2 = true;
                        break;
                    }
                    if (d2cVar2.q(i2)) {
                        if (ra9VarArr[i2].a.b != 1) {
                            z2 = false;
                            break;
                        }
                        if (((qa9[]) d2cVar2.c)[i2].a != 0) {
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
        } else if (!vz6Var.equals(nf8Var.b)) {
            u1cVar = u1c.d;
            d2cVar = this.e;
            no5 no5Var2 = po5.b;
            list = j99.e;
        }
        d2c d2cVar3 = d2cVar;
        List list2 = list;
        u1c u1cVar2 = u1cVar;
        if (z) {
            z64 z64Var = this.Z;
            if (!z64Var.d || z64Var.e == 5) {
                z64Var.a = true;
                z64Var.d = true;
                z64Var.e = i;
            } else {
                yve.f(i == 5);
            }
        }
        nf8 nf8Var2 = this.Y;
        return nf8Var2.d(vz6Var, j, j2, j3, o(nf8Var2.q), u1cVar2, d2cVar3, list2);
    }

    public final void x0() {
        yt6 yt6Var = this.H.l;
        boolean z = this.f0 || (yt6Var != null && yt6Var.a.e());
        nf8 nf8Var = this.Y;
        if (z != nf8Var.g) {
            this.Y = nf8Var.b(z);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00c0 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void y0(vz6 vz6Var, d2c d2cVar) {
        boolean z;
        int length;
        int i;
        yt6 yt6Var = this.H.l;
        yt6Var.getClass();
        o(yt6Var.d());
        if (t0(this.Y.a, yt6Var.g.a)) {
            long j = this.J.h;
        }
        asb asbVar = this.Y.a;
        float f = this.y.f().a;
        boolean z2 = this.Y.l;
        e74[] e74VarArr = (e74[]) d2cVar.d;
        ec3 ec3Var = this.f;
        ec3Var.getClass();
        to5 to5Var = ec3Var.n;
        ig8 ig8Var = this.L;
        Integer num = (Integer) to5Var.get(ig8Var.a);
        int intValue = (num == null || num.intValue() == -1) ? -1 : num.intValue();
        dc3 dc3Var = (dc3) ec3Var.o.get(ig8Var);
        dc3Var.getClass();
        if (intValue == -1) {
            bt6 bt6Var = asbVar.m(asbVar.g(vz6Var.a, ec3Var.b).c, ec3Var.a, 0L).b.b;
            if (bt6Var != null) {
                String scheme = bt6Var.a.getScheme();
                if (TextUtils.isEmpty(scheme) || ec3.q.contains(scheme)) {
                    z = true;
                    length = e74VarArr.length;
                    i = 0;
                    int i2 = 0;
                    while (true) {
                        int i3 = 13107200;
                        if (i >= length) {
                            e74 e74Var = e74VarArr[i];
                            if (e74Var != null) {
                                switch (e74Var.c().c) {
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
                                        iy8.d();
                                        break;
                                }
                                return;
                            }
                            i++;
                        } else {
                            intValue = gcc.i(i2, 13107200, 210239488);
                        }
                    }
                }
            }
            z = false;
            length = e74VarArr.length;
            i = 0;
            int i22 = 0;
            while (true) {
                int i32 = 13107200;
                if (i >= length) {
                }
                i++;
            }
        }
        dc3Var.c = intValue;
        ec3Var.d();
    }

    public final boolean z() {
        for (int i = 0; i < this.a.length; i++) {
            au6 au6Var = this.H;
            if (au6Var.i != au6Var.j[i]) {
                return true;
            }
        }
        return false;
    }

    public final void z0(List list, int i, int i2) {
        this.Z.a(1);
        i07 i07Var = this.I;
        i07Var.getClass();
        ArrayList arrayList = i07Var.c;
        yve.f(i >= 0 && i <= i2 && i2 <= arrayList.size());
        yve.f(list.size() == i2 - i);
        for (int i3 = i; i3 < i2; i3++) {
            ((h07) arrayList.get(i3)).a.t((ft6) list.get(i3 - i));
        }
        u(i07Var.b(), false);
    }
}
