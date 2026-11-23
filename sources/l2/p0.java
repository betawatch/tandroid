package l2;

import a8.ma;
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
import h9.s1;
import j$.util.Objects;
import j$.util.concurrent.ConcurrentHashMap;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import org.telegram.messenger.ks;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes.dex */
public final class p0 implements Handler.Callback, x2.d0, i1, d3.v {
    public static final long x0 = h2.l0.h0(10000);
    public final j E;
    public final ArrayList F;
    public final h2.g0 G;
    public final v H;
    public final x0 I;
    public final g1 J;
    public final g K;
    public final long L;
    public final m2.i M;
    public final m2.d N;
    public final h2.i0 O;
    public final boolean P;
    public final f2.e Q;
    public final boolean R;
    public q1 S;
    public p1 T;
    public boolean U;
    public boolean V;
    public o0 W;
    public int X;
    public h1 Y;
    public m0 Z;
    public final o1[] a;
    public boolean a0;
    public final b[] b;
    public boolean b0;
    public final boolean[] c;
    public boolean c0;
    public final a3.x d;
    public boolean d0;
    public final a3.y e;
    public long e0;
    public final r0 f;
    public boolean f0;
    public int g0;
    public final b3.d h;
    public boolean h0;
    public boolean i0;
    public boolean j0;
    public boolean k0;
    public int l0;
    public o0 m0;
    public final h2.i0 n;
    public long n0;
    public long o0;
    public int p0;
    public boolean q0;
    public final m6.n r;
    public m r0;
    public final Looper s;
    public long s0;
    public p t0;
    public long u0;
    public boolean v0;
    public final e2.k1 w;
    public float w0;
    public final e2.i1 x;
    public final long y;

    public p0(Context context, b[] bVarArr, b[] bVarArr2, a3.x xVar, a3.y yVar, r0 r0Var, b3.d dVar, int i7, boolean z10, m2.d dVar2, q1 q1Var, g gVar, long j3, Looper looper, h2.g0 g0Var, v vVar, m2.i iVar, final d3.v vVar2, boolean z11) {
        p pVar = p.a;
        this.u0 = -9223372036854775807L;
        this.H = vVar;
        this.d = xVar;
        this.e = yVar;
        this.f = r0Var;
        this.h = dVar;
        this.g0 = i7;
        this.h0 = z10;
        this.S = q1Var;
        this.K = gVar;
        this.L = j3;
        this.b0 = false;
        this.G = g0Var;
        this.M = iVar;
        this.t0 = pVar;
        this.N = dVar2;
        this.w0 = 1.0f;
        this.T = p1.b;
        this.R = z11;
        this.s0 = -9223372036854775807L;
        this.e0 = -9223372036854775807L;
        this.y = ((i) r0Var).n;
        e2.h1 h1Var = e2.l1.a;
        h1 k10 = h1.k(yVar);
        this.Y = k10;
        this.Z = new m0(k10);
        this.b = new b[bVarArr.length];
        this.c = new boolean[bVarArr.length];
        a3.s sVar = (a3.s) xVar;
        sVar.getClass();
        this.a = new o1[bVarArr.length];
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
            this.a[i10] = new o1(bVarArr[i10], bVar3, i10);
        }
        this.P = z12;
        this.E = new j(this, g0Var);
        this.F = new ArrayList();
        this.w = new e2.k1();
        this.x = new e2.i1();
        ma.p(xVar.a == null);
        xVar.a = this;
        xVar.b = dVar;
        this.q0 = true;
        h2.i0 a10 = g0Var.a(looper, null);
        this.O = a10;
        this.I = new x0(dVar2, a10, new kg.f1(this, 12));
        this.J = new g1(this, dVar2, a10, iVar);
        m6.n nVar = new m6.n(7);
        this.r = nVar;
        Looper d = nVar.d();
        this.s = d;
        h2.i0 a11 = g0Var.a(d, this);
        this.n = a11;
        this.Q = new f2.e(context, d, this);
        a11.b(35, new d3.v() { // from class: l2.h0
            @Override // d3.v
            public final void a(long j10, long j11, e2.u uVar, MediaFormat mediaFormat) {
                p0 p0Var = p0.this;
                p0Var.getClass();
                vVar2.a(j10, j11, uVar, mediaFormat);
                p0Var.a(j10, j11, uVar, mediaFormat);
            }
        }).b();
        a11.b(39, new i0(this)).b();
    }

    public static Pair R(e2.l1 l1Var, o0 o0Var, boolean z10, int i7, boolean z11, e2.k1 k1Var, e2.i1 i1Var) {
        int S;
        e2.l1 l1Var2 = o0Var.a;
        if (l1Var.p()) {
            return null;
        }
        e2.l1 l1Var3 = l1Var2.p() ? l1Var : l1Var2;
        try {
            Pair i10 = l1Var3.i(k1Var, i1Var, o0Var.b, o0Var.c);
            if (!l1Var.equals(l1Var3)) {
                if (l1Var.b(i10.first) == -1) {
                    if (!z10 || (S = S(k1Var, i1Var, i7, z11, i10.first, l1Var3, l1Var)) == -1) {
                        return null;
                    }
                    return l1Var.i(k1Var, i1Var, S, -9223372036854775807L);
                }
                if (l1Var3.g(i10.first, i1Var).f && l1Var3.m(i1Var.c, k1Var, 0L).n == l1Var3.b(i10.first)) {
                    return l1Var.i(k1Var, i1Var, l1Var.g(i10.first, i1Var).c, o0Var.c);
                }
            }
            return i10;
        } catch (IndexOutOfBoundsException unused) {
            return null;
        }
    }

    public static int S(e2.k1 k1Var, e2.i1 i1Var, int i7, boolean z10, Object obj, e2.l1 l1Var, e2.l1 l1Var2) {
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

    public static void f(k1 k1Var) {
        try {
            synchronized (k1Var) {
                synchronized (k1Var) {
                }
                k1Var.a.c(k1Var.c, k1Var.d);
                return;
            }
            k1Var.a.c(k1Var.c, k1Var.d);
            return;
        } finally {
            k1Var.a(true);
        }
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, x2.e0, x2.f1] */
    public static boolean y(v0 v0Var) {
        if (v0Var != null) {
            try {
                ?? r12 = v0Var.a;
                if (v0Var.e) {
                    for (x2.d1 d1Var : v0Var.c) {
                        if (d1Var != null) {
                            d1Var.a();
                        }
                    }
                } else {
                    r12.j();
                }
                if ((!v0Var.e ? 0L : r12.f()) != Long.MIN_VALUE) {
                    return true;
                }
            } catch (IOException unused) {
            }
        }
        return false;
    }

    public final boolean A() {
        v0 v0Var = this.I.i;
        long j3 = v0Var.g.f;
        if (v0Var.e) {
            return j3 == -9223372036854775807L || this.Y.s < j3 || !r0();
        }
        return false;
    }

    public final void A0(int i7, int i10, int i11, boolean z10) {
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
        h1 h1Var = this.Y;
        if (h1Var.l == z11 && h1Var.n == i10 && h1Var.m == i11) {
            return;
        }
        this.Y = h1Var.e(i11, i10, z11);
        D0(false, false);
        x0 x0Var = this.I;
        for (v0 v0Var = x0Var.i; v0Var != null; v0Var = v0Var.m) {
            for (a3.u uVar : v0Var.o.c) {
                if (uVar != null) {
                    uVar.f(z11);
                }
            }
        }
        if (!r0()) {
            v0();
            B0();
            h1 h1Var2 = this.Y;
            if (h1Var2.p) {
                this.Y = h1Var2.i(false);
            }
            x0Var.m(this.n0);
            return;
        }
        int i12 = this.Y.e;
        h2.i0 i0Var = this.n;
        if (i12 != 3) {
            if (i12 == 2) {
                i0Var.f(2);
            }
        } else {
            j jVar = this.E;
            jVar.b = true;
            ((r1) jVar.c).d();
            t0();
            i0Var.f(2);
        }
    }

    /* JADX WARN: Type inference failed for: r1v14, types: [java.lang.Object, x2.e0] */
    /* JADX WARN: Type inference failed for: r1v21, types: [java.lang.Object, x2.f1] */
    /* JADX WARN: Type inference failed for: r7v1, types: [java.lang.Object, x2.f1] */
    public final void B() {
        boolean b10;
        if (y(this.I.l)) {
            v0 v0Var = this.I.l;
            long o4 = o(!v0Var.e ? 0L : v0Var.a.f());
            v0 v0Var2 = this.I.i;
            long j3 = s0(this.Y.a, v0Var.g.a) ? this.K.h : -9223372036854775807L;
            m2.i iVar = this.M;
            e2.l1 l1Var = this.Y.a;
            x2.g0 g0Var = v0Var.g.a;
            float f10 = this.E.l().a;
            boolean z10 = this.Y.l;
            q0 q0Var = new q0(iVar, l1Var, g0Var, o4, f10, this.d0, j3);
            b10 = ((i) this.f).b(q0Var);
            v0 v0Var3 = this.I.i;
            if (!b10 && v0Var3.e && o4 < 500000 && this.y > 0) {
                v0Var3.a.n(this.Y.s);
                b10 = ((i) this.f).b(q0Var);
            }
        } else {
            b10 = false;
        }
        this.f0 = b10;
        if (b10) {
            v0 v0Var4 = this.I.l;
            v0Var4.getClass();
            s0 s0Var = new s0();
            s0Var.a = this.n0 - v0Var4.p;
            float f11 = this.E.l().a;
            ma.f(f11 > 0.0f || f11 == -3.4028235E38f);
            s0Var.b = f11;
            long j10 = this.e0;
            ma.f(j10 >= 0 || j10 == -9223372036854775807L);
            s0Var.c = j10;
            t0 t0Var = new t0(s0Var);
            ma.p(v0Var4.m == null);
            v0Var4.a.d(t0Var);
        }
        w0();
    }

    /* JADX WARN: Type inference failed for: r2v21, types: [java.lang.Object, x2.e0] */
    public final void B0() {
        long j3;
        float f10;
        v0 v0Var = this.I.i;
        if (v0Var == null) {
            return;
        }
        long p10 = v0Var.e ? v0Var.a.p() : -9223372036854775807L;
        if (p10 != -9223372036854775807L) {
            if (!v0Var.g()) {
                this.I.n(v0Var);
                t(false);
                B();
            }
            P(p10, true);
            if (p10 != this.Y.s) {
                h1 h1Var = this.Y;
                this.Y = x(h1Var.b, p10, h1Var.c, p10, true, 5);
            }
        } else {
            j jVar = this.E;
            boolean z10 = v0Var != this.I.j;
            r1 r1Var = (r1) jVar.c;
            b bVar = (b) jVar.e;
            if (bVar == null || bVar.k() || ((z10 && ((b) jVar.e).n != 2) || (!((b) jVar.e).m() && (z10 || ((b) jVar.e).j())))) {
                jVar.a = true;
                if (jVar.b) {
                    r1Var.d();
                }
            } else {
                u0 u0Var = (u0) jVar.f;
                u0Var.getClass();
                long a10 = u0Var.a();
                if (jVar.a) {
                    if (a10 >= r1Var.a()) {
                        jVar.a = false;
                        if (jVar.b) {
                            r1Var.d();
                        }
                    } else if (r1Var.c) {
                        r1Var.c(r1Var.a());
                        r1Var.c = false;
                    }
                }
                r1Var.c(a10);
                e2.w0 l10 = u0Var.l();
                if (!l10.equals((e2.w0) r1Var.e)) {
                    r1Var.e(l10);
                    ((p0) jVar.d).n.b(16, l10).b();
                }
            }
            long a11 = jVar.a();
            this.n0 = a11;
            long j10 = a11 - v0Var.p;
            long j11 = this.Y.s;
            ArrayList arrayList = this.F;
            if (!arrayList.isEmpty() && !this.Y.b.b()) {
                if (this.q0) {
                    this.q0 = false;
                }
                h1 h1Var2 = this.Y;
                h1Var2.a.b(h1Var2.b.a);
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
                h1 h1Var3 = this.Y;
                this.Y = x(h1Var3.b, j10, h1Var3.c, j10, z11, 6);
            } else {
                h1 h1Var4 = this.Y;
                h1Var4.s = j10;
                h1Var4.t = SystemClock.elapsedRealtime();
            }
        }
        this.Y.q = this.I.l.d();
        h1 h1Var5 = this.Y;
        h1Var5.r = o(h1Var5.q);
        h1 h1Var6 = this.Y;
        if (h1Var6.l && h1Var6.e == 3 && s0(h1Var6.a, h1Var6.b)) {
            h1 h1Var7 = this.Y;
            float f11 = 1.0f;
            if (h1Var7.o.a == 1.0f) {
                g gVar = this.K;
                long l11 = l(h1Var7.a, h1Var7.b.a, h1Var7.s);
                long j12 = this.Y.r;
                if (gVar.c != -9223372036854775807L) {
                    long j13 = l11 - j12;
                    long j14 = gVar.m;
                    if (j14 == -9223372036854775807L) {
                        gVar.m = j13;
                        gVar.n = 0L;
                    } else {
                        gVar.m = Math.max(j13, (long) ((j13 * 9.999871E-4f) + (j14 * 0.999f)));
                        gVar.n = (long) ((9.999871E-4f * Math.abs(j13 - r9)) + (gVar.n * 0.999f));
                    }
                    if (gVar.l != -9223372036854775807L) {
                        j3 = 1000;
                        if (SystemClock.elapsedRealtime() - gVar.l < 1000) {
                            f11 = gVar.k;
                        }
                    } else {
                        j3 = 1000;
                    }
                    gVar.l = SystemClock.elapsedRealtime();
                    long j15 = (gVar.n * 3) + gVar.m;
                    if (gVar.h > j15) {
                        float S = h2.l0.S(j3);
                        f10 = 1.0E-7f;
                        long[] jArr = {j15, gVar.e, gVar.h - (((long) ((gVar.k - 1.0f) * S)) + ((long) ((gVar.i - 1.0f) * S)))};
                        long j16 = jArr[0];
                        for (int i7 = 1; i7 < 3; i7++) {
                            long j17 = jArr[i7];
                            if (j17 > j16) {
                                j16 = j17;
                            }
                        }
                        gVar.h = j16;
                    } else {
                        f10 = 1.0E-7f;
                        long j18 = h2.l0.j(l11 - ((long) (Math.max(0.0f, gVar.k - 1.0f) / 1.0E-7f)), gVar.h, j15);
                        gVar.h = j18;
                        long j19 = gVar.g;
                        if (j19 != -9223372036854775807L && j18 > j19) {
                            gVar.h = j19;
                        }
                    }
                    long j20 = l11 - gVar.h;
                    if (Math.abs(j20) < gVar.a) {
                        gVar.k = 1.0f;
                    } else {
                        gVar.k = h2.l0.h((f10 * j20) + 1.0f, gVar.j, gVar.i);
                    }
                    f11 = gVar.k;
                }
                if (this.E.l().a != f11) {
                    e2.w0 w0Var = new e2.w0(f11, this.Y.o.b);
                    this.n.e(16);
                    this.E.e(w0Var);
                    w(this.Y.o, this.E.l().a, false, false);
                }
            }
        }
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, x2.e0, x2.f1] */
    public final void C() {
        x0 x0Var = this.I;
        x0Var.k();
        v0 v0Var = x0Var.m;
        if (v0Var != null) {
            ?? r12 = v0Var.a;
            if ((!v0Var.d || v0Var.e) && !r12.g()) {
                e2.l1 l1Var = this.Y.a;
                if (v0Var.e) {
                    r12.r();
                }
                Iterator it = ((i) this.f).p.values().iterator();
                while (it.hasNext()) {
                    if (((h) it.next()).b) {
                        return;
                    }
                }
                if (!v0Var.d) {
                    long j3 = v0Var.g.b;
                    v0Var.d = true;
                    r12.s(this, j3);
                    return;
                }
                s0 s0Var = new s0();
                s0Var.a = this.n0 - v0Var.p;
                float f10 = this.E.l().a;
                ma.f(f10 > 0.0f || f10 == -3.4028235E38f);
                s0Var.b = f10;
                long j10 = this.e0;
                ma.f(j10 >= 0 || j10 == -9223372036854775807L);
                s0Var.c = j10;
                t0 t0Var = new t0(s0Var);
                ma.p(v0Var.m == null);
                r12.d(t0Var);
            }
        }
    }

    public final void C0(e2.l1 l1Var, x2.g0 g0Var, e2.l1 l1Var2, x2.g0 g0Var2, long j3, boolean z10) {
        boolean s02 = s0(l1Var, g0Var);
        Object obj = g0Var.a;
        if (!s02) {
            e2.w0 w0Var = g0Var.b() ? e2.w0.d : this.Y.o;
            j jVar = this.E;
            if (jVar.l().equals(w0Var)) {
                return;
            }
            this.n.e(16);
            jVar.e(w0Var);
            w(this.Y.o, w0Var.a, false, false);
            return;
        }
        e2.i1 i1Var = this.x;
        int i7 = l1Var.g(obj, i1Var).c;
        e2.k1 k1Var = this.w;
        l1Var.n(i7, k1Var);
        e2.f0 f0Var = k1Var.j;
        g gVar = this.K;
        gVar.getClass();
        gVar.c = h2.l0.S(f0Var.a);
        gVar.f = h2.l0.S(f0Var.b);
        gVar.g = h2.l0.S(f0Var.c);
        float f10 = f0Var.d;
        if (f10 == -3.4028235E38f) {
            f10 = 0.97f;
        }
        gVar.j = f10;
        float f11 = f0Var.e;
        if (f11 == -3.4028235E38f) {
            f11 = 1.03f;
        }
        gVar.i = f11;
        if (f10 == 1.0f && f11 == 1.0f) {
            gVar.c = -9223372036854775807L;
        }
        gVar.a();
        if (j3 != -9223372036854775807L) {
            gVar.d = l(l1Var, obj, j3);
            gVar.a();
            return;
        }
        if (!Objects.equals(!l1Var2.p() ? l1Var2.m(l1Var2.g(g0Var2.a, i1Var).c, k1Var, 0L).a : null, k1Var.a) || z10) {
            gVar.d = -9223372036854775807L;
            gVar.a();
        }
    }

    public final void D() {
        m0 m0Var = this.Z;
        h1 h1Var = this.Y;
        boolean z10 = m0Var.c | (((h1) m0Var.f) != h1Var);
        m0Var.c = z10;
        m0Var.f = h1Var;
        if (z10) {
            g0 g0Var = this.H.b;
            g0Var.j.d(new ji.f(18, g0Var, m0Var));
            this.Z = new m0(this.Y);
        }
    }

    public final void D0(boolean z10, boolean z11) {
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

    public final void E(int i7) {
        o1 o1Var = this.a[i7];
        try {
            v0 v0Var = this.I.i;
            v0Var.getClass();
            b d = o1Var.d(v0Var);
            d.getClass();
            x2.d1 d1Var = d.r;
            d1Var.getClass();
            d1Var.a();
        } catch (IOException | RuntimeException e10) {
            int i10 = o1Var.a.b;
            if (i10 != 3 && i10 != 5) {
                throw e10;
            }
            a3.y yVar = this.I.i.o;
            h2.a.d("ExoPlayerImplInternal", "Disabling track due to error: " + e2.u.c(yVar.c[i7].n()), e10);
            a3.y yVar2 = new a3.y((n1[]) yVar.b.clone(), (a3.u[]) yVar.c.clone(), yVar.d, yVar.e);
            yVar2.b[i7] = null;
            yVar2.c[i7] = null;
            h(i7);
            v0 v0Var2 = this.I.i;
            v0Var2.a(yVar2, this.Y.s, false, new boolean[v0Var2.j.length]);
        }
    }

    public final void F(int i7, boolean z10) {
        boolean[] zArr = this.c;
        if (zArr[i7] != z10) {
            zArr[i7] = z10;
            this.O.d(new x7(this, i7, z10, 1));
        }
    }

    public final void G() {
        u(this.J.b(), true);
    }

    public final void H(l0 l0Var) {
        e2.l1 b10;
        this.Z.f(1);
        int i7 = l0Var.a;
        int i10 = l0Var.b;
        int i11 = l0Var.c;
        x2.i1 i1Var = l0Var.d;
        g1 g1Var = this.J;
        ArrayList arrayList = g1Var.b;
        ma.f(i7 >= 0 && i7 <= i10 && i10 <= arrayList.size() && i11 >= 0);
        g1Var.j = i1Var;
        if (i7 == i10 || i7 == i11) {
            b10 = g1Var.b();
        } else {
            int min = Math.min(i7, i11);
            int max = Math.max(((i10 - i7) + i11) - 1, i10 - 1);
            int i12 = ((f1) arrayList.get(min)).d;
            h2.l0.R(i7, i10, i11, arrayList);
            while (min <= max) {
                f1 f1Var = (f1) arrayList.get(min);
                f1Var.d = i12;
                i12 += f1Var.a.o.e.o();
                min++;
            }
            b10 = g1Var.b();
        }
        u(b10, false);
    }

    public final void I() {
        this.Z.f(1);
        N(false, false, false, true);
        i iVar = (i) this.f;
        ConcurrentHashMap concurrentHashMap = iVar.p;
        long id2 = Thread.currentThread().getId();
        long j3 = iVar.q;
        ma.o("Players that share the same LoadControl must share the same playback thread. See ExoPlayer.Builder.setPlaybackLooper(Looper).", j3 == -1 || j3 == id2);
        iVar.q = id2;
        m2.i iVar2 = this.M;
        h hVar = (h) concurrentHashMap.get(iVar2);
        if (hVar == null) {
            h hVar2 = new h();
            hVar2.a = 1;
            concurrentHashMap.put(iVar2, hVar2);
        } else {
            hVar.a++;
        }
        h hVar3 = (h) concurrentHashMap.get(iVar2);
        hVar3.getClass();
        Integer num = (Integer) iVar.o.get(iVar2.a);
        int intValue = (num == null || num.intValue() == -1) ? iVar.l : num.intValue();
        if (intValue == -1) {
            intValue = 13107200;
        }
        hVar3.c = intValue;
        hVar3.b = false;
        n0(this.Y.a.p() ? 4 : 2);
        h1 h1Var = this.Y;
        boolean z10 = h1Var.l;
        A0(this.Q.d(h1Var.e, z10), h1Var.n, h1Var.m, z10);
        b3.g gVar = (b3.g) this.h;
        gVar.getClass();
        g1 g1Var = this.J;
        ArrayList arrayList = g1Var.b;
        ma.p(!g1Var.k);
        g1Var.l = gVar;
        for (int i7 = 0; i7 < arrayList.size(); i7++) {
            f1 f1Var = (f1) arrayList.get(i7);
            g1Var.e(f1Var);
            g1Var.g.add(f1Var);
        }
        g1Var.k = true;
        this.n.f(2);
    }

    public final void J(h2.i iVar) {
        m6.n nVar = this.r;
        h2.i0 i0Var = this.n;
        try {
            N(true, false, true, false);
            K();
            r0 r0Var = this.f;
            m2.i iVar2 = this.M;
            i iVar3 = (i) r0Var;
            ConcurrentHashMap concurrentHashMap = iVar3.p;
            h hVar = (h) concurrentHashMap.get(iVar2);
            if (hVar != null) {
                int i7 = hVar.a - 1;
                hVar.a = i7;
                if (i7 == 0) {
                    concurrentHashMap.remove(iVar2);
                    iVar3.c();
                }
            }
            if (iVar3.p.isEmpty()) {
                iVar3.q = -1L;
            }
            f2.e eVar = this.Q;
            eVar.c = null;
            eVar.a();
            eVar.c(0);
            this.d.a();
            n0(1);
        } finally {
            i0Var.a.removeCallbacksAndMessages(null);
            nVar.f();
            iVar.e();
        }
    }

    public final void K() {
        for (int i7 = 0; i7 < this.a.length; i7++) {
            b bVar = this.b[i7];
            synchronized (bVar.a) {
                bVar.I = null;
            }
            o1 o1Var = this.a[i7];
            b bVar2 = o1Var.a;
            ma.p(bVar2.n == 0);
            bVar2.q();
            o1Var.e = false;
            b bVar3 = o1Var.c;
            if (bVar3 != null) {
                ma.p(bVar3.n == 0);
                bVar3.q();
                o1Var.f = false;
            }
        }
    }

    public final void L(int i7, int i10, x2.i1 i1Var) {
        this.Z.f(1);
        g1 g1Var = this.J;
        g1Var.getClass();
        ma.f(i7 >= 0 && i7 <= i10 && i10 <= g1Var.b.size());
        g1Var.j = i1Var;
        g1Var.g(i7, i10);
        u(g1Var.b(), false);
    }

    /* JADX WARN: Removed duplicated region for block: B:62:0x0164  */
    /* JADX WARN: Removed duplicated region for block: B:65:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void M() {
        int i7;
        int i10;
        float f10 = this.E.l().a;
        x0 x0Var = this.I;
        v0 v0Var = x0Var.i;
        v0 v0Var2 = x0Var.j;
        a3.y yVar = null;
        v0 v0Var3 = v0Var;
        boolean z10 = true;
        while (v0Var3 != null && v0Var3.e) {
            h1 h1Var = this.Y;
            a3.y j3 = v0Var3.j(f10, h1Var.a, h1Var.l);
            a3.y yVar2 = v0Var3 == this.I.i ? j3 : yVar;
            a3.y yVar3 = v0Var3.o;
            a3.u[] uVarArr = j3.c;
            if (yVar3 != null && yVar3.c.length == uVarArr.length) {
                for (int i11 = 0; i11 < uVarArr.length; i11++) {
                    if (j3.a(yVar3, i11)) {
                    }
                }
                if (v0Var3 == v0Var2) {
                    z10 = false;
                }
                v0Var3 = v0Var3.m;
                yVar = yVar2;
            }
            if (z10) {
                x0 x0Var2 = this.I;
                v0 v0Var4 = x0Var2.i;
                boolean z11 = (x0Var2.n(v0Var4) & 1) != 0;
                boolean[] zArr = new boolean[this.a.length];
                yVar2.getClass();
                long a10 = v0Var4.a(yVar2, this.Y.s, z11, zArr);
                h1 h1Var2 = this.Y;
                boolean z12 = (h1Var2.e == 4 || a10 == h1Var2.s) ? false : true;
                h1 h1Var3 = this.Y;
                i7 = 4;
                this.Y = x(h1Var3.b, a10, h1Var3.c, h1Var3.d, z12, 5);
                if (z12) {
                    P(a10, true);
                }
                g();
                boolean[] zArr2 = new boolean[this.a.length];
                int i12 = 0;
                while (true) {
                    o1[] o1VarArr = this.a;
                    if (i12 >= o1VarArr.length) {
                        break;
                    }
                    int c10 = o1VarArr[i12].c();
                    zArr2[i12] = this.a[i12].g();
                    o1 o1Var = this.a[i12];
                    x2.d1 d1Var = v0Var4.c[i12];
                    j jVar = this.E;
                    long j10 = this.n0;
                    boolean z13 = zArr[i12];
                    b bVar = o1Var.a;
                    if (o1.h(bVar)) {
                        if (d1Var != bVar.r) {
                            o1Var.a(bVar, jVar);
                        } else if (z13) {
                            bVar.z(j10, false, true);
                        }
                    }
                    b bVar2 = o1Var.c;
                    if (bVar2 != null && o1.h(bVar2)) {
                        if (d1Var != bVar2.r) {
                            o1Var.a(bVar2, jVar);
                        } else if (z13) {
                            bVar2.z(j10, false, true);
                        }
                    }
                    if (c10 - this.a[i12].c() > 0) {
                        F(i12, false);
                    }
                    this.l0 -= c10 - this.a[i12].c();
                    i12++;
                }
                k(this.n0, zArr2);
                v0Var4.h = true;
            } else {
                i7 = 4;
                this.I.n(v0Var3);
                if (v0Var3.e) {
                    long max = Math.max(v0Var3.g.b, this.n0 - v0Var3.p);
                    if (this.P && d() && this.I.k == v0Var3) {
                        g();
                    }
                    i10 = 4;
                    v0Var3.a(j3, max, false, new boolean[v0Var3.j.length]);
                    t(true);
                    if (this.Y.e == i10) {
                        B();
                        B0();
                        this.n.f(2);
                        return;
                    }
                    return;
                }
            }
            i10 = i7;
            t(true);
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
    public final void N(boolean z10, boolean z11, boolean z12, boolean z13) {
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
        D0(false, true);
        j jVar = this.E;
        jVar.b = false;
        r1 r1Var = (r1) jVar.c;
        if (r1Var.c) {
            r1Var.c(r1Var.a());
            r1Var.c = false;
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
                h1 h1Var = this.Y;
                x2.g0 g0Var2 = h1Var.b;
                long j12 = h1Var.s;
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
                h1 h1Var2 = this.Y;
                int i10 = h1Var2.e;
                if (z13) {
                }
                x2.r1 r1Var2 = z14 ? x2.r1.d : h1Var2.h;
                a3.y yVar = z14 ? this.e : h1Var2.i;
                if (z14) {
                }
                this.Y = new h1(l1Var2, g0Var, j11, j10, i10, r14, false, r1Var2, yVar, list, g0Var, h1Var2.l, h1Var2.m, h1Var2.n, h1Var2.o, j10, 0L, j10, 0L, false);
                if (z12) {
                }
            } catch (m e11) {
                e = e11;
                h2.a.d("ExoPlayerImplInternal", "Disable failed.", e);
                if (z10) {
                }
                this.l0 = 0;
                h1 h1Var3 = this.Y;
                x2.g0 g0Var22 = h1Var3.b;
                long j122 = h1Var3.s;
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
                h1 h1Var22 = this.Y;
                int i102 = h1Var22.e;
                if (z13) {
                }
                x2.r1 r1Var22 = z14 ? x2.r1.d : h1Var22.h;
                a3.y yVar2 = z14 ? this.e : h1Var22.i;
                if (z14) {
                }
                this.Y = new h1(l1Var2, g0Var, j11, j10, i102, r14, false, r1Var22, yVar2, list, g0Var, h1Var22.l, h1Var22.m, h1Var22.n, h1Var22.o, j10, 0L, j10, 0L, false);
                if (z12) {
                }
            }
        }
        this.u0 = -9223372036854775807L;
        if (z10) {
            for (o1 o1Var : this.a) {
                try {
                    o1Var.k();
                } catch (RuntimeException e12) {
                    h2.a.d("ExoPlayerImplInternal", "Reset failed.", e12);
                }
            }
        }
        this.l0 = 0;
        h1 h1Var32 = this.Y;
        x2.g0 g0Var222 = h1Var32.b;
        long j1222 = h1Var32.s;
        if (!this.Y.b.b()) {
            h1 h1Var4 = this.Y;
            e2.i1 i1Var = this.x;
            x2.g0 g0Var3 = h1Var4.b;
            e2.l1 l1Var3 = h1Var4.a;
            if (!l1Var3.p() && !l1Var3.g(g0Var3.a, i1Var).f) {
                j3 = this.Y.s;
                if (z11) {
                    j10 = j1222;
                    j11 = j3;
                    z14 = false;
                } else {
                    this.m0 = null;
                    Pair n10 = n(this.Y.a);
                    g0Var222 = (x2.g0) n10.first;
                    long longValue = ((Long) n10.second).longValue();
                    z14 = g0Var222.equals(this.Y.b) ? false : true;
                    j10 = longValue;
                    j11 = -9223372036854775807L;
                }
                this.I.b();
                this.f0 = false;
                l1Var = this.Y.a;
                if (z12 || !(l1Var instanceof m1)) {
                    l1Var2 = l1Var;
                } else {
                    m1 m1Var = (m1) l1Var;
                    x2.i1 i1Var2 = this.J.j;
                    e2.l1[] l1VarArr = m1Var.l;
                    e2.l1[] l1VarArr2 = new e2.l1[l1VarArr.length];
                    for (int i11 = 0; i11 < l1VarArr.length; i11++) {
                        l1VarArr2[i11] = new l1(l1VarArr[i11]);
                    }
                    l1Var2 = new m1(l1VarArr2, m1Var.m, i1Var2);
                    if (g0Var222.b != -1) {
                        l1Var2.g(g0Var222.a, this.x);
                        int i12 = this.x.c;
                        e2.k1 k1Var = this.w;
                        l1Var2.m(i12, k1Var, 0L);
                        if (k1Var.a()) {
                            g0Var = new x2.g0(g0Var222.a, g0Var222.d);
                            h1 h1Var222 = this.Y;
                            int i1022 = h1Var222.e;
                            m mVar = z13 ? null : h1Var222.f;
                            x2.r1 r1Var222 = z14 ? x2.r1.d : h1Var222.h;
                            a3.y yVar22 = z14 ? this.e : h1Var222.i;
                            if (z14) {
                                h9.g0 g0Var4 = h9.i0.b;
                                list = s1.e;
                            } else {
                                list = h1Var222.j;
                            }
                            this.Y = new h1(l1Var2, g0Var, j11, j10, i1022, mVar, false, r1Var222, yVar22, list, g0Var, h1Var222.l, h1Var222.m, h1Var222.n, h1Var222.o, j10, 0L, j10, 0L, false);
                            if (z12) {
                                x0 x0Var = this.I;
                                if (!x0Var.q.isEmpty()) {
                                    ArrayList arrayList = new ArrayList();
                                    for (int i13 = 0; i13 < x0Var.q.size(); i13++) {
                                        ((v0) x0Var.q.get(i13)).i();
                                    }
                                    x0Var.q = arrayList;
                                    x0Var.m = null;
                                    x0Var.k();
                                }
                                g1 g1Var = this.J;
                                HashMap hashMap = g1Var.f;
                                for (e1 e1Var : hashMap.values()) {
                                    try {
                                        e1Var.a.p(e1Var.b);
                                    } catch (RuntimeException e13) {
                                        h2.a.d("MediaSourceList", "Failed to release child source.", e13);
                                    }
                                    x2.a aVar = e1Var.a;
                                    d1 d1Var = e1Var.c;
                                    aVar.s(d1Var);
                                    e1Var.a.r(d1Var);
                                }
                                hashMap.clear();
                                g1Var.g.clear();
                                g1Var.k = false;
                                return;
                            }
                            return;
                        }
                    }
                }
                g0Var = g0Var222;
                h1 h1Var2222 = this.Y;
                int i10222 = h1Var2222.e;
                if (z13) {
                }
                x2.r1 r1Var2222 = z14 ? x2.r1.d : h1Var2222.h;
                a3.y yVar222 = z14 ? this.e : h1Var2222.i;
                if (z14) {
                }
                this.Y = new h1(l1Var2, g0Var, j11, j10, i10222, mVar, false, r1Var2222, yVar222, list, g0Var, h1Var2222.l, h1Var2222.m, h1Var2222.n, h1Var2222.o, j10, 0L, j10, 0L, false);
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
        h1 h1Var22222 = this.Y;
        int i102222 = h1Var22222.e;
        if (z13) {
        }
        x2.r1 r1Var22222 = z14 ? x2.r1.d : h1Var22222.h;
        a3.y yVar2222 = z14 ? this.e : h1Var22222.i;
        if (z14) {
        }
        this.Y = new h1(l1Var2, g0Var, j11, j10, i102222, mVar, false, r1Var22222, yVar2222, list, g0Var, h1Var22222.l, h1Var22222.m, h1Var22222.n, h1Var22222.o, j10, 0L, j10, 0L, false);
        if (z12) {
        }
    }

    public final void O() {
        v0 v0Var = this.I.i;
        this.c0 = v0Var != null && v0Var.g.j && this.b0;
    }

    public final void P(long j3, boolean z10) {
        v0 v0Var = this.I.i;
        long j10 = j3 + (v0Var == null ? 1000000000000L : v0Var.p);
        this.n0 = j10;
        ((r1) this.E.c).c(j10);
        for (o1 o1Var : this.a) {
            long j11 = this.n0;
            b d = o1Var.d(v0Var);
            if (d != null) {
                d.z(j11, false, z10);
            }
        }
        for (v0 v0Var2 = r0.i; v0Var2 != null; v0Var2 = v0Var2.m) {
            for (a3.u uVar : v0Var2.o.c) {
                if (uVar != null) {
                    uVar.s();
                }
            }
        }
    }

    public final void Q(e2.l1 l1Var, e2.l1 l1Var2) {
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

    public final void T(long j3) {
        boolean z10 = this.U;
        long j10 = x0;
        if (z10) {
            this.T.getClass();
            r2 = this.Y.e != 3 ? j10 : 1000L;
            for (o1 o1Var : this.a) {
                long j11 = this.n0;
                long j12 = this.o0;
                b bVar = o1Var.c;
                b bVar2 = o1Var.a;
                long g10 = o1.h(bVar2) ? bVar2.g(j11, j12) : Long.MAX_VALUE;
                if (bVar != null && bVar.n != 0) {
                    g10 = Math.min(g10, bVar.g(j11, j12));
                }
                r2 = Math.min(r2, h2.l0.h0(g10));
            }
            if (this.Y.m()) {
                v0 v0Var = this.I.i;
                if ((v0Var != null ? v0Var.m : null) != null) {
                    if ((h2.l0.S(r2) * this.Y.o.a) + this.n0 >= r1.e()) {
                        r2 = Math.min(r2, j10);
                    }
                }
            }
        } else if (this.Y.e != 3 || r0()) {
            r2 = j10;
        }
        this.n.a.sendEmptyMessageAtTime(2, j3 + r2);
    }

    public final void U(boolean z10) {
        x2.g0 g0Var = this.I.i.g.a;
        long X = X(g0Var, this.Y.s, true, false);
        if (X != this.Y.s) {
            h1 h1Var = this.Y;
            this.Y = x(g0Var, X, h1Var.c, h1Var.d, z10, 5);
        }
    }

    @Override // x2.d0
    public final void V(x2.e0 e0Var) {
        this.n.b(8, e0Var).b();
    }

    /* JADX WARN: Can't wrap try/catch for region: R(5:27|(20:(9:72|73|(1:96)(3:79|(1:83)|84)|85|(1:95)|92|93|19|20)(1:29)|34|35|(1:37)(1:65)|38|39|(1:41)|42|43|44|45|46|47|48|49|50|51|18|19|20)|30|31|(1:33)(1:69)) */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x0192, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Type inference failed for: r0v18, types: [java.lang.Object, x2.e0] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void W(o0 o0Var) {
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
        h1 h1Var;
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
        h1 h1Var2;
        x2.g0 g0Var3;
        e2.l1 l1Var;
        long j18;
        p0 p0Var = this;
        if (p0Var.V) {
            if (p0Var.W != null) {
                p0Var.X++;
                p0Var.Z.f(1);
            }
            p0Var.W = o0Var;
            return;
        }
        p0Var.Z.f(1);
        Pair R = R(p0Var.Y.a, o0Var, true, p0Var.g0, p0Var.h0, p0Var.w, p0Var.x);
        if (R == null) {
            Pair n10 = p0Var.n(p0Var.Y.a);
            p10 = (x2.g0) n10.first;
            longValue = ((Long) n10.second).longValue();
            z10 = !p0Var.Y.a.p();
            j10 = 0;
            j3 = -9223372036854775807L;
        } else {
            Object obj = R.first;
            longValue = ((Long) R.second).longValue();
            j3 = o0Var.c == -9223372036854775807L ? -9223372036854775807L : longValue;
            p10 = p0Var.I.p(p0Var.Y.a, obj, longValue);
            if (p10.b()) {
                p0Var.Y.a.g(p10.a, p0Var.x);
                if (p0Var.x.e(p10.b) == p10.c) {
                    p0Var.x.g.getClass();
                }
                p0Var.x.g.a(p10.b).getClass();
                j3 = Math.max(j3, 0L);
                longValue = 0;
                j10 = 0;
            } else {
                j10 = 0;
                if (o0Var.c != -9223372036854775807L) {
                    z10 = false;
                }
            }
            z10 = true;
        }
        try {
            try {
                if (p0Var.Y.a.p()) {
                    p0Var.m0 = o0Var;
                } else if (R == null) {
                    if (p0Var.Y.e != 1) {
                        p0Var.n0(4);
                    }
                    p0Var.N(false, true, false, true);
                } else {
                    try {
                        try {
                            try {
                                try {
                                    if (p10.equals(p0Var.Y.b)) {
                                        try {
                                            v0 v0Var = p0Var.I.i;
                                            if (v0Var == null || !v0Var.e || longValue == j10) {
                                                j13 = longValue;
                                            } else {
                                                ?? r02 = v0Var.a;
                                                long j19 = p0Var.w.m;
                                                if (p0Var.U && j19 != -9223372036854775807L) {
                                                    p0Var.T.getClass();
                                                }
                                                j13 = r02.i(longValue, p0Var.S);
                                            }
                                            if (h2.l0.h0(j13) != h2.l0.h0(p0Var.Y.s) || ((i7 = (h1Var = p0Var.Y).e) != 2 && i7 != 3)) {
                                                z11 = z10;
                                                g0Var = p10;
                                            }
                                            j14 = h1Var.s;
                                            i10 = 2;
                                            j15 = j14;
                                            z12 = z10;
                                            g0Var2 = p10;
                                            j16 = j3;
                                            p0Var.Y = p0Var.x(g0Var2, j14, j16, j15, z12, i10);
                                        } catch (Throwable th2) {
                                            th = th2;
                                            boolean z15 = z10;
                                            g0Var = p10;
                                            z12 = z15;
                                            j12 = longValue;
                                            j11 = j3;
                                            p0Var.Y = p0Var.x(g0Var, j12, j11, j12, z12, 2);
                                            throw th;
                                        }
                                    }
                                    z11 = z10;
                                    g0Var = p10;
                                    j13 = longValue;
                                    p0Var.C0(l1Var, g0Var3, l1Var, h1Var2.b, j18, true);
                                    g0Var2 = g0Var3;
                                    j16 = j18;
                                    j14 = X;
                                    i10 = 2;
                                    j15 = j14;
                                    p0Var = this;
                                    p0Var.Y = p0Var.x(g0Var2, j14, j16, j15, z12, i10);
                                } catch (Throwable th3) {
                                    th = th3;
                                    g0Var = g0Var3;
                                    j11 = j18;
                                    j12 = X;
                                    p0Var.Y = p0Var.x(g0Var, j12, j11, j12, z12, 2);
                                    throw th;
                                }
                                l1Var = h1Var2.a;
                                j18 = j3;
                            } catch (Throwable th4) {
                                th = th4;
                                g0Var = g0Var3;
                                j11 = j3;
                                j12 = X;
                                p0Var.Y = p0Var.x(g0Var, j12, j11, j12, z12, 2);
                                throw th;
                            }
                            h1Var2 = p0Var.Y;
                            g0Var3 = g0Var;
                        } catch (Throwable th5) {
                            th = th5;
                        }
                        x0 x0Var = p0Var.I;
                        if (x0Var.i != x0Var.j) {
                            j17 = j13;
                            z14 = true;
                        } else {
                            j17 = j13;
                            z14 = false;
                        }
                        X = p0Var.X(g0Var, j17, z14, z13);
                        z12 = (longValue != X) | z11;
                    } catch (Throwable th6) {
                        th = th6;
                        j11 = j3;
                        z12 = z11;
                        j12 = longValue;
                        p0Var.Y = p0Var.x(g0Var, j12, j11, j12, z12, 2);
                        throw th;
                    }
                    z13 = p0Var.Y.e == 4;
                }
                z12 = z10;
                g0Var2 = p10;
                j14 = longValue;
                j16 = j3;
                i10 = 2;
                j15 = j14;
                p0Var = this;
                p0Var.Y = p0Var.x(g0Var2, j14, j16, j15, z12, i10);
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
        x0 x0Var;
        int i7;
        v0();
        boolean z12 = true;
        D0(false, true);
        if (z11 || this.Y.e == 3) {
            n0(2);
        }
        v0 v0Var = this.I.i;
        v0 v0Var2 = v0Var;
        while (v0Var2 != null && !g0Var.equals(v0Var2.g.a)) {
            v0Var2 = v0Var2.m;
        }
        if (z10 || v0Var != v0Var2 || (v0Var2 != null && v0Var2.p + j3 < 0)) {
            for (int i10 = 0; i10 < this.a.length; i10++) {
                h(i10);
            }
            this.u0 = -9223372036854775807L;
            if (v0Var2 != null) {
                while (true) {
                    x0Var = this.I;
                    if (x0Var.i == v0Var2) {
                        break;
                    }
                    x0Var.a();
                }
                x0Var.n(v0Var2);
                v0Var2.p = 1000000000000L;
                k(this.I.j.e(), new boolean[this.a.length]);
                v0Var2.h = true;
            }
        }
        g();
        if (this.U) {
            for (o1 o1Var : this.a) {
                if (o1Var.g() && ((i7 = o1Var.a.b) == 2 || i7 == 4)) {
                    this.V = true;
                    break;
                }
            }
        }
        if (v0Var2 != null) {
            this.I.n(v0Var2);
            if (!v0Var2.e) {
                v0Var2.g = v0Var2.g.b(j3, -9223372036854775807L);
            } else if (v0Var2.f) {
                if (this.U) {
                    this.T.getClass();
                    if (!this.Y.a.p() && v0Var2.g.a.equals(this.Y.b)) {
                        long j10 = v0Var2.p + j3;
                        boolean z13 = true;
                        for (o1 o1Var2 : this.a) {
                            if (o1Var2.g()) {
                                b d = o1Var2.d(v0Var2);
                                z13 &= d != null && d.E(j10);
                            }
                        }
                        if (z13) {
                            ?? r10 = v0Var2.a;
                            long j11 = this.Y.s;
                            q1 q1Var = q1.e;
                            if (r10.i(j11, q1Var) == v0Var2.a.i(j3, q1Var)) {
                                z12 = false;
                            }
                        }
                    }
                }
                j3 = v0Var2.a.l(j3);
                v0Var2.a.n(j3 - this.y);
            }
            P(j3, z12);
            B();
        } else {
            this.I.b();
            P(j3, true);
        }
        t(false);
        this.n.f(2);
        return j3;
    }

    public final void Y(k1 k1Var) {
        k1Var.getClass();
        Looper looper = k1Var.e;
        Looper looper2 = this.s;
        h2.i0 i0Var = this.n;
        if (looper != looper2) {
            i0Var.b(15, k1Var).b();
            return;
        }
        f(k1Var);
        int i7 = this.Y.e;
        if (i7 == 3 || i7 == 2) {
            i0Var.f(2);
        }
    }

    public final void Z(k1 k1Var) {
        Looper looper = k1Var.e;
        if (looper.getThread().isAlive()) {
            this.G.a(looper, null).d(new kg.i0(this, k1Var));
        } else {
            h2.a.l("TAG", "Trying to send message on a dead thread.");
            k1Var.a(false);
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
                ma.e("Automatic handling of audio focus is only available for USAGE_MEDIA and USAGE_GAME.", i7 != 1 || i7 == 0);
            }
            i7 = 0;
            eVar2.f = i7;
            ma.e("Automatic handling of audio focus is only available for USAGE_MEDIA and USAGE_GAME.", i7 != 1 || i7 == 0);
        }
        h1 h1Var = this.Y;
        boolean z11 = h1Var.l;
        A0(eVar2.d(h1Var.e, z11), h1Var.n, h1Var.m, z11);
    }

    public final void b(k0 k0Var, int i7) {
        this.Z.f(1);
        g1 g1Var = this.J;
        if (i7 == -1) {
            i7 = g1Var.b.size();
        }
        u(g1Var.a(i7, k0Var.a, k0Var.b), false);
    }

    public final void b0(boolean z10, h2.i iVar) {
        if (this.i0 != z10) {
            this.i0 = z10;
            if (!z10) {
                for (o1 o1Var : this.a) {
                    o1Var.k();
                }
            }
        }
        if (iVar != null) {
            iVar.e();
        }
    }

    public final void c() {
        for (o1 o1Var : this.a) {
            p1 p1Var = this.U ? this.T : null;
            o1Var.a.c(18, p1Var);
            b bVar = o1Var.c;
            if (bVar != null) {
                bVar.c(18, p1Var);
            }
        }
    }

    public final void c0(i0 i0Var) {
        for (o1 o1Var : this.a) {
            b bVar = o1Var.a;
            if (bVar.b == 4) {
                bVar.c(23, i0Var);
                b bVar2 = o1Var.c;
                if (bVar2 != null) {
                    bVar2.c(23, i0Var);
                }
            }
        }
    }

    public final boolean d() {
        if (!this.P) {
            return false;
        }
        for (o1 o1Var : this.a) {
            if (o1Var.f()) {
                return true;
            }
        }
        return false;
    }

    public final void d0(k0 k0Var) {
        this.Z.f(1);
        int i7 = k0Var.c;
        x2.i1 i1Var = k0Var.b;
        ArrayList arrayList = k0Var.a;
        if (i7 != -1) {
            this.m0 = new o0(new m1(arrayList, i1Var), k0Var.c, k0Var.d);
        }
        g1 g1Var = this.J;
        ArrayList arrayList2 = g1Var.b;
        g1Var.g(0, arrayList2.size());
        u(g1Var.a(arrayList2.size(), arrayList, i1Var), false);
    }

    public final void e() {
        M();
        U(true);
    }

    public final void e0(boolean z10) {
        this.b0 = z10;
        O();
        if (this.c0) {
            x0 x0Var = this.I;
            if (x0Var.j != x0Var.i) {
                U(true);
                t(false);
            }
        }
    }

    public final void f0(e2.w0 w0Var) {
        this.n.e(16);
        j jVar = this.E;
        jVar.e(w0Var);
        e2.w0 l10 = jVar.l();
        w(l10, l10.a, true, true);
    }

    public final void g() {
        b bVar;
        if (this.P && d()) {
            for (o1 o1Var : this.a) {
                int c10 = o1Var.c();
                j jVar = this.E;
                if (o1Var.f()) {
                    int i7 = o1Var.d;
                    boolean z10 = i7 == 4 || i7 == 2;
                    int i10 = i7 != 4 ? 0 : 1;
                    if (z10) {
                        try {
                            bVar = o1Var.a;
                        } catch (RuntimeException e10) {
                            h2.a.d("RendererHolder", "Disable prewarming failed.", e10);
                        }
                    } else {
                        bVar = o1Var.c;
                        bVar.getClass();
                    }
                    o1Var.a(bVar, jVar);
                    try {
                        o1Var.i(z10);
                    } catch (RuntimeException e11) {
                        h2.a.d("RendererHolder", "Reset prewarming failed.", e11);
                    }
                    o1Var.d = i10;
                }
                this.l0 -= c10 - o1Var.c();
            }
            this.u0 = -9223372036854775807L;
        }
    }

    public final void g0(p pVar) {
        this.t0 = pVar;
        e2.l1 l1Var = this.Y.a;
        x0 x0Var = this.I;
        x0Var.getClass();
        pVar.getClass();
        if (x0Var.q.isEmpty()) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (int i7 = 0; i7 < x0Var.q.size(); i7++) {
            ((v0) x0Var.q.get(i7)).i();
        }
        x0Var.q = arrayList;
        x0Var.m = null;
        x0Var.k();
    }

    public final void h(int i7) {
        o1[] o1VarArr = this.a;
        int c10 = o1VarArr[i7].c();
        o1 o1Var = o1VarArr[i7];
        b bVar = o1Var.a;
        j jVar = this.E;
        o1Var.a(bVar, jVar);
        b bVar2 = o1Var.c;
        if (bVar2 != null) {
            boolean z10 = (bVar2.n == 0 || o1Var.d == 3) ? false : true;
            o1Var.a(bVar2, jVar);
            o1Var.i(false);
            if (z10) {
                b bVar3 = o1Var.a;
                bVar2.getClass();
                bVar2.c(17, bVar3);
            }
        }
        o1Var.d = 0;
        F(i7, false);
        this.l0 -= c10;
    }

    public final void h0(int i7) {
        this.g0 = i7;
        e2.l1 l1Var = this.Y.a;
        x0 x0Var = this.I;
        x0Var.g = i7;
        int r10 = x0Var.r(l1Var);
        if ((r10 & 1) != 0) {
            U(true);
        } else if ((r10 & 2) != 0) {
            g();
        }
        t(false);
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        int i7;
        v0 v0Var;
        x2.g0 g0Var;
        v0 v0Var2;
        int i10;
        try {
            switch (message.what) {
                case 1:
                    boolean z10 = message.arg1 != 0;
                    int i11 = message.arg2;
                    this.Z.f(1);
                    A0(this.Q.d(this.Y.e, z10), i11 >> 4, i11 & 15, z10);
                    break;
                case 2:
                    i();
                    break;
                case 3:
                    W((o0) message.obj);
                    break;
                case 4:
                    f0((e2.w0) message.obj);
                    break;
                case 5:
                    k0((q1) message.obj);
                    break;
                case 6:
                    u0(false, true);
                    break;
                case 7:
                    J((h2.i) message.obj);
                    return true;
                case 8:
                    v((x2.e0) message.obj);
                    break;
                case 9:
                    r((x2.e0) message.obj);
                    break;
                case 10:
                    M();
                    break;
                case 11:
                    h0(message.arg1);
                    break;
                case 12:
                    l0(message.arg1 != 0);
                    break;
                case 13:
                    b0(message.arg1 != 0, (h2.i) message.obj);
                    break;
                case 14:
                    Y((k1) message.obj);
                    break;
                case 15:
                    Z((k1) message.obj);
                    break;
                case 16:
                    e2.w0 w0Var = (e2.w0) message.obj;
                    w(w0Var, w0Var.a, true, false);
                    break;
                case 17:
                    d0((k0) message.obj);
                    break;
                case 18:
                    b((k0) message.obj, message.arg1);
                    break;
                case 19:
                    H((l0) message.obj);
                    break;
                case 20:
                    L(message.arg1, message.arg2, (x2.i1) message.obj);
                    break;
                case 21:
                    m0((x2.i1) message.obj);
                    break;
                case 22:
                    G();
                    break;
                case 23:
                    e0(message.arg1 != 0);
                    break;
                case 24:
                default:
                    return false;
                case 25:
                    e();
                    break;
                case 26:
                    M();
                    U(true);
                    break;
                case 27:
                    y0((List) message.obj, message.arg1, message.arg2);
                    break;
                case 28:
                    g0((p) message.obj);
                    break;
                case 29:
                    I();
                    break;
                case ks.T /* 30 */:
                    Pair pair = (Pair) message.obj;
                    p0(pair.first, (h2.i) pair.second);
                    break;
                case ks.U /* 31 */:
                    a0((e2.e) message.obj, message.arg1 != 0);
                    break;
                case 32:
                    q0(((Float) message.obj).floatValue());
                    break;
                case 33:
                    p(message.arg1);
                    break;
                case 34:
                    q();
                    break;
                case 35:
                    o0((d3.v) message.obj);
                    break;
                case 36:
                    i0(((Boolean) message.obj).booleanValue());
                    break;
                case 37:
                    this.V = false;
                    o0 o0Var = this.W;
                    if (o0Var != null) {
                        W(o0Var);
                        this.W = null;
                        break;
                    }
                    break;
                case 38:
                    j0((p1) message.obj);
                    break;
                case 39:
                    c0((i0) message.obj);
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
                s(e10, r3);
            }
            r3 = i10;
            s(e10, r3);
        } catch (j2.j e11) {
            s(e11, e11.a);
        } catch (IOException e12) {
            s(e12, 2000);
        } catch (RuntimeException e13) {
            m mVar = new m(2, e13, ((e13 instanceof IllegalStateException) || (e13 instanceof IllegalArgumentException)) ? 1004 : 1000);
            h2.a.d("ExoPlayerImplInternal", "Playback error", mVar);
            u0(true, false);
            this.Y = this.Y.f(mVar);
        } catch (m e14) {
            e = e14;
            int i13 = e.s;
            x0 x0Var = this.I;
            if (i13 == 1 && (v0Var2 = x0Var.j) != null && e.F == null) {
                e = e.a(v0Var2.g.a);
            }
            int i14 = e.s;
            h2.i0 i0Var = this.n;
            if (i14 == 1 && (g0Var = e.F) != null && z(e.x, g0Var)) {
                this.v0 = true;
                g();
                v0 g10 = x0Var.g();
                v0 v0Var3 = x0Var.i;
                if (v0Var3 != g10) {
                    while (v0Var3 != null) {
                        v0 v0Var4 = v0Var3.m;
                        if (v0Var4 == g10) {
                            break;
                        }
                        v0Var3 = v0Var4;
                    }
                }
                x0Var.n(v0Var3);
                if (this.Y.e != 4) {
                    B();
                    i0Var.f(2);
                }
            } else {
                m mVar2 = this.r0;
                if (mVar2 != null) {
                    mVar2.addSuppressed(e);
                    e = this.r0;
                }
                if (e.s == 1 && x0Var.i != x0Var.j) {
                    while (true) {
                        v0Var = x0Var.i;
                        if (v0Var == x0Var.j) {
                            break;
                        }
                        x0Var.a();
                    }
                    ma.l(v0Var);
                    D();
                    w0 w0Var2 = v0Var.g;
                    x2.g0 g0Var2 = w0Var2.a;
                    long j3 = w0Var2.b;
                    this.Y = x(g0Var2, j3, w0Var2.d, j3, true, 0);
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
                    u0(true, false);
                    this.Y = this.Y.f(e);
                }
            }
        } catch (q2.f e15) {
            s(e15, e15.a);
        } catch (x2.b e16) {
            s(e16, 1002);
        }
        D();
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
        h1 h1Var;
        int i10;
        boolean z16;
        this.G.getClass();
        long uptimeMillis = SystemClock.uptimeMillis();
        this.n.e(2);
        if (!this.R) {
            z0();
        }
        int i11 = this.Y.e;
        if (i11 == 1 || i11 == 4) {
            return;
        }
        if (this.R) {
            z0();
        }
        v0 v0Var = this.I.i;
        if (v0Var == null) {
            T(uptimeMillis);
            return;
        }
        Trace.beginSection("doSomeWork");
        B0();
        if (v0Var.e) {
            this.G.getClass();
            this.o0 = h2.l0.S(SystemClock.elapsedRealtime());
            v0Var.a.n(this.Y.s - this.y);
            z10 = true;
            z11 = true;
            int i12 = 0;
            while (true) {
                o1[] o1VarArr = this.a;
                if (i12 >= o1VarArr.length) {
                    break;
                }
                o1 o1Var = o1VarArr[i12];
                if (o1Var.c() == 0) {
                    F(i12, false);
                } else {
                    long j11 = this.n0;
                    long j12 = this.o0;
                    b bVar = o1Var.c;
                    b bVar2 = o1Var.a;
                    if (o1.h(bVar2)) {
                        bVar2.x(j11, j12);
                    }
                    if (bVar != null && bVar.n != 0) {
                        bVar.x(j11, j12);
                    }
                    if (z10) {
                        b bVar3 = o1Var.c;
                        b bVar4 = o1Var.a;
                        boolean k10 = o1.h(bVar4) ? bVar4.k() : true;
                        if (bVar3 != null && bVar3.n != 0) {
                            k10 &= bVar3.k();
                        }
                        if (k10) {
                            z10 = true;
                            b d = o1Var.d(v0Var);
                            z16 = d != null || d.j() || d.m() || d.k();
                            F(i12, z16);
                            z11 = !z11 && z16;
                            if (z16) {
                                E(i12);
                            }
                        }
                    }
                    z10 = false;
                    b d2 = o1Var.d(v0Var);
                    if (d2 != null) {
                    }
                    F(i12, z16);
                    if (z11) {
                    }
                    if (z16) {
                    }
                }
                i12++;
            }
        } else {
            v0Var.a.j();
            z10 = true;
            z11 = true;
        }
        long j13 = v0Var.g.f;
        boolean z17 = z10 && v0Var.e && (j13 == -9223372036854775807L || j13 <= this.Y.s);
        if (z17 && this.c0) {
            this.c0 = false;
            int i13 = this.Y.n;
            this.Z.f(0);
            A0(this.Q.d(this.Y.e, false), i13, 5, false);
        }
        if (!z17 || !v0Var.g.k) {
            h1 h1Var2 = this.Y;
            if (h1Var2.e == 2) {
                x0 x0Var = this.I;
                if (this.l0 == 0) {
                    z14 = A();
                } else if (z11) {
                    if (h1Var2.g) {
                        v0 v0Var2 = x0Var.i;
                        long j14 = s0(h1Var2.a, v0Var2.g.a) ? this.K.h : -9223372036854775807L;
                        v0 v0Var3 = x0Var.l;
                        boolean z18 = v0Var3.g() && v0Var3.g.k;
                        boolean z19 = v0Var3.g.a.b() && !v0Var3.e;
                        if (!z18 && !z19) {
                            long o4 = o(v0Var3.d());
                            r0 r0Var = this.f;
                            m2.i iVar = this.M;
                            j3 = -9223372036854775807L;
                            e2.l1 l1Var = this.Y.a;
                            x2.g0 g0Var = v0Var2.g.a;
                            float f10 = this.E.l().a;
                            boolean z20 = this.Y.l;
                            boolean z21 = this.d0;
                            i iVar2 = (i) r0Var;
                            iVar2.getClass();
                            long j15 = j14;
                            e2.g0 g0Var2 = l1Var.m(l1Var.g(g0Var.a, iVar2.b).c, iVar2.a, 0L).c.b;
                            if (g0Var2 != null) {
                                String scheme = g0Var2.a.getScheme();
                                if (TextUtils.isEmpty(scheme) || i.r.contains(scheme)) {
                                    z13 = true;
                                    long F = h2.l0.F(o4, f10);
                                    j10 = !z21 ? z13 ? iVar2.k : iVar2.j : z13 ? iVar2.i : iVar2.h;
                                    if (j15 != -9223372036854775807L) {
                                        j10 = Math.min(j15 / 2, j10);
                                    }
                                    if (j10 > 0 && F < j10) {
                                        if (!(!z13 ? iVar2.m : false)) {
                                            h hVar = (h) iVar2.p.get(iVar);
                                            hVar.getClass();
                                            synchronized (hVar) {
                                                i7 = hVar.d;
                                            }
                                            int i14 = i7 * iVar2.c.b;
                                            h hVar2 = (h) iVar2.p.get(iVar);
                                            hVar2.getClass();
                                        }
                                        z14 = false;
                                        if (z14) {
                                            n0(3);
                                            this.r0 = null;
                                            if (r0()) {
                                                D0(false, false);
                                                j jVar = this.E;
                                                z12 = true;
                                                jVar.b = true;
                                                ((r1) jVar.c).d();
                                                t0();
                                                if (this.Y.e == 2) {
                                                    int i15 = 0;
                                                    while (true) {
                                                        o1[] o1VarArr2 = this.a;
                                                        if (i15 >= o1VarArr2.length) {
                                                            break;
                                                        }
                                                        if (o1VarArr2[i15].d(v0Var) != null ? z12 : false) {
                                                            E(i15);
                                                        }
                                                        i15++;
                                                    }
                                                    h1 h1Var3 = this.Y;
                                                    if (!h1Var3.g && h1Var3.r < 500000 && y(this.I.l) && r0()) {
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
                                                        boolean z22 = (r0() || this.Y.e != 3) ? false : z12;
                                                        if (this.k0 || !this.j0 || !z22) {
                                                            z12 = false;
                                                        }
                                                        h1Var = this.Y;
                                                        if (h1Var.p != z12) {
                                                            this.Y = h1Var.i(z12);
                                                        }
                                                        this.j0 = false;
                                                        if (!z12 && (i10 = this.Y.e) != 4 && (z22 || i10 == 2 || (i10 == 3 && this.l0 != 0))) {
                                                            T(uptimeMillis);
                                                        }
                                                        Trace.endSection();
                                                    }
                                                }
                                                z15 = false;
                                                if (z15) {
                                                }
                                                if (r0()) {
                                                }
                                                if (this.k0) {
                                                }
                                                z12 = false;
                                                h1Var = this.Y;
                                                if (h1Var.p != z12) {
                                                }
                                                this.j0 = false;
                                                if (!z12) {
                                                    T(uptimeMillis);
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
                            long F2 = h2.l0.F(o4, f10);
                            if (!z21) {
                            }
                            if (j15 != -9223372036854775807L) {
                            }
                            if (j10 > 0) {
                                if (!(!z13 ? iVar2.m : false)) {
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
            if (this.Y.e == 3 && (this.l0 != 0 ? !z11 : !A())) {
                D0(r0(), false);
                n0(2);
                if (this.d0) {
                    for (v0 v0Var4 = this.I.i; v0Var4 != null; v0Var4 = v0Var4.m) {
                        for (a3.u uVar : v0Var4.o.c) {
                            if (uVar != null) {
                                uVar.t();
                            }
                        }
                    }
                    g gVar = this.K;
                    long j16 = gVar.h;
                    if (j16 != j3) {
                        long j17 = j16 + gVar.b;
                        gVar.h = j17;
                        long j18 = gVar.g;
                        if (j18 != j3 && j17 > j18) {
                            gVar.h = j18;
                        }
                        gVar.l = j3;
                    }
                }
                v0();
            }
            if (this.Y.e == 2) {
            }
            z15 = false;
            if (z15) {
            }
            if (r0()) {
            }
            if (this.k0) {
            }
            z12 = false;
            h1Var = this.Y;
            if (h1Var.p != z12) {
            }
            this.j0 = false;
            if (!z12) {
            }
            Trace.endSection();
        }
        n0(4);
        v0();
        z12 = true;
        if (this.Y.e == 2) {
        }
        z15 = false;
        if (z15) {
        }
        if (r0()) {
        }
        if (this.k0) {
        }
        z12 = false;
        h1Var = this.Y;
        if (h1Var.p != z12) {
        }
        this.j0 = false;
        if (!z12) {
        }
        Trace.endSection();
    }

    public final void i0(boolean z10) {
        if (!z10) {
            o0 o0Var = this.W;
            h2.i0 i0Var = this.n;
            if (o0Var != null && this.V && !i0Var.a.hasMessages(37)) {
                this.X++;
            }
            int i7 = this.X;
            if (i7 > 0) {
                this.O.d(new ai.u0(this, i7, 19));
            }
            this.X = 0;
            this.V = false;
            i0Var.e(37);
            o0 o0Var2 = this.W;
            if (o0Var2 != null) {
                W(o0Var2);
                this.W = null;
                this.V = false;
            }
        }
        this.U = z10;
        c();
    }

    @Override // x2.e1
    public final void i2(x2.f1 f1Var) {
        this.n.b(9, (x2.e0) f1Var).b();
    }

    public final void j(v0 v0Var, int i7, boolean z10, long j3) {
        o1 o1Var = this.a[i7];
        boolean g10 = o1Var.g();
        b bVar = o1Var.a;
        if (g10) {
            return;
        }
        boolean z11 = v0Var == this.I.i;
        a3.y yVar = v0Var.o;
        n1 n1Var = yVar.b[i7];
        a3.u uVar = yVar.c[i7];
        boolean z12 = r0() && this.Y.e == 3;
        boolean z13 = !z10 && z12;
        this.l0++;
        x2.d1 d1Var = v0Var.c[i7];
        long j10 = v0Var.p;
        x2.g0 g0Var = v0Var.g.a;
        b bVar2 = o1Var.c;
        int length = uVar != null ? uVar.length() : 0;
        e2.u[] uVarArr = new e2.u[length];
        for (int i10 = 0; i10 < length; i10++) {
            uVar.getClass();
            uVarArr[i10] = uVar.g(i10);
        }
        int i11 = o1Var.d;
        j jVar = this.E;
        if (i11 == 0 || i11 == 2 || i11 == 4) {
            o1Var.e = true;
            ma.p(bVar.n == 0);
            bVar.d = n1Var;
            bVar.H = g0Var;
            bVar.n = 1;
            bVar.o(z13, z11);
            bVar.y(uVarArr, d1Var, j3, j10, g0Var);
            bVar.z(j3, z13, true);
            jVar.h(bVar);
        } else {
            o1Var.f = true;
            bVar2.getClass();
            ma.p(bVar2.n == 0);
            bVar2.d = n1Var;
            bVar2.H = g0Var;
            bVar2.n = 1;
            bVar2.o(z13, z11);
            bVar2.y(uVarArr, d1Var, j3, j10, g0Var);
            bVar2.z(j3, z13, true);
            jVar.h(bVar2);
        }
        j0 j0Var = new j0(this);
        b d = o1Var.d(v0Var);
        d.getClass();
        d.c(11, j0Var);
        if (z12 && z11) {
            o1Var.m();
        }
    }

    public final void j0(p1 p1Var) {
        this.T = p1Var;
        c();
    }

    public final void k(long j3, boolean[] zArr) {
        o1[] o1VarArr;
        long j10;
        v0 v0Var = this.I.j;
        a3.y yVar = v0Var.o;
        int i7 = 0;
        while (true) {
            o1VarArr = this.a;
            if (i7 >= o1VarArr.length) {
                break;
            }
            if (!yVar.b(i7)) {
                o1VarArr[i7].k();
            }
            i7++;
        }
        int i10 = 0;
        while (i10 < o1VarArr.length) {
            if (yVar.b(i10) && o1VarArr[i10].d(v0Var) == null) {
                j10 = j3;
                j(v0Var, i10, zArr[i10], j10);
            } else {
                j10 = j3;
            }
            i10++;
            j3 = j10;
        }
    }

    public final void k0(q1 q1Var) {
        this.S = q1Var;
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

    public final void l0(boolean z10) {
        this.h0 = z10;
        e2.l1 l1Var = this.Y.a;
        x0 x0Var = this.I;
        x0Var.h = z10;
        int r10 = x0Var.r(l1Var);
        if ((r10 & 1) != 0) {
            U(true);
        } else if ((r10 & 2) != 0) {
            g();
        }
        t(false);
    }

    public final long m(v0 v0Var) {
        if (v0Var == null) {
            return 0L;
        }
        long j3 = v0Var.p;
        if (!v0Var.e) {
            return j3;
        }
        int i7 = 0;
        while (true) {
            o1[] o1VarArr = this.a;
            if (i7 >= o1VarArr.length) {
                return j3;
            }
            if (o1VarArr[i7].d(v0Var) != null) {
                b d = o1VarArr[i7].d(v0Var);
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

    public final void m0(x2.i1 i1Var) {
        this.Z.f(1);
        g1 g1Var = this.J;
        int size = g1Var.b.size();
        if (i1Var.getLength() != size) {
            i1Var = i1Var.i().f(0, size);
        }
        g1Var.j = i1Var;
        u(g1Var.b(), false);
    }

    public final Pair n(e2.l1 l1Var) {
        long j3 = 0;
        if (l1Var.p()) {
            return Pair.create(h1.u, 0L);
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

    public final void n0(int i7) {
        h1 h1Var = this.Y;
        if (h1Var.e != i7) {
            if (i7 != 2) {
                this.s0 = -9223372036854775807L;
            }
            if (i7 != 3 && h1Var.p) {
                this.Y = h1Var.i(false);
            }
            this.Y = this.Y.h(i7);
        }
    }

    public final long o(long j3) {
        v0 v0Var = this.I.l;
        if (v0Var == null) {
            return 0L;
        }
        return Math.max(0L, j3 - (this.n0 - v0Var.p));
    }

    public final void o0(d3.v vVar) {
        for (o1 o1Var : this.a) {
            b bVar = o1Var.a;
            if (bVar.b == 2) {
                bVar.c(7, vVar);
                b bVar2 = o1Var.c;
                if (bVar2 != null) {
                    bVar2.c(7, vVar);
                }
            }
        }
    }

    public final void p(int i7) {
        h1 h1Var = this.Y;
        A0(i7, h1Var.n, h1Var.m, h1Var.l);
    }

    public final void p0(Object obj, h2.i iVar) {
        for (o1 o1Var : this.a) {
            b bVar = o1Var.a;
            if (bVar.b == 2) {
                int i7 = o1Var.d;
                if (i7 == 4 || i7 == 1) {
                    b bVar2 = o1Var.c;
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

    public final void q() {
        q0(this.w0);
    }

    public final void q0(float f10) {
        this.w0 = f10;
        float f11 = f10 * this.Q.g;
        for (o1 o1Var : this.a) {
            b bVar = o1Var.a;
            if (bVar.b == 1) {
                bVar.c(2, Float.valueOf(f11));
                b bVar2 = o1Var.c;
                if (bVar2 != null) {
                    bVar2.c(2, Float.valueOf(f11));
                }
            }
        }
    }

    public final void r(x2.e0 e0Var) {
        x0 x0Var = this.I;
        v0 v0Var = x0Var.l;
        if (v0Var != null && v0Var.a == e0Var) {
            x0Var.m(this.n0);
            B();
            return;
        }
        v0 v0Var2 = x0Var.m;
        if (v0Var2 == null || v0Var2.a != e0Var) {
            return;
        }
        C();
    }

    public final boolean r0() {
        h1 h1Var = this.Y;
        return h1Var.l && h1Var.n == 0;
    }

    public final void s(IOException iOException, int i7) {
        m mVar = new m(0, iOException, i7);
        v0 v0Var = this.I.i;
        if (v0Var != null) {
            mVar = mVar.a(v0Var.g.a);
        }
        h2.a.d("ExoPlayerImplInternal", "Playback error", mVar);
        u0(false, false);
        this.Y = this.Y.f(mVar);
    }

    public final boolean s0(e2.l1 l1Var, x2.g0 g0Var) {
        if (g0Var.b() || l1Var.p()) {
            return false;
        }
        int i7 = l1Var.g(g0Var.a, this.x).c;
        e2.k1 k1Var = this.w;
        l1Var.n(i7, k1Var);
        return k1Var.a() && k1Var.i && k1Var.f != -9223372036854775807L;
    }

    public final void t(boolean z10) {
        v0 v0Var = this.I.l;
        x2.g0 g0Var = v0Var == null ? this.Y.b : v0Var.g.a;
        boolean equals = this.Y.k.equals(g0Var);
        if (!equals) {
            this.Y = this.Y.c(g0Var);
        }
        h1 h1Var = this.Y;
        h1Var.q = v0Var == null ? h1Var.s : v0Var.d();
        h1 h1Var2 = this.Y;
        h1Var2.r = o(h1Var2.q);
        if ((!equals || z10) && v0Var != null && v0Var.e) {
            x0(v0Var.g.a, v0Var.o);
        }
    }

    public final void t0() {
        v0 v0Var = this.I.i;
        if (v0Var == null) {
            return;
        }
        a3.y yVar = v0Var.o;
        int i7 = 0;
        while (true) {
            o1[] o1VarArr = this.a;
            if (i7 >= o1VarArr.length) {
                return;
            }
            if (yVar.b(i7)) {
                o1VarArr[i7].m();
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
    public final void u(e2.l1 l1Var, boolean z10) {
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
        n0 n0Var;
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
        v0 v0Var;
        x0 x0Var;
        h1 h1Var = this.Y;
        o0 o0Var = this.m0;
        x0 x0Var2 = this.I;
        int i13 = this.g0;
        boolean z18 = this.h0;
        e2.k1 k1Var2 = this.w;
        e2.i1 i1Var4 = this.x;
        if (l1Var.p()) {
            x2.g0 g0Var2 = h1.u;
            boolean z19 = (g0Var2.equals(h1Var.b) && h1Var.s == 0) ? false : true;
            n0 n0Var2 = new n0(g0Var2, 0L, -9223372036854775807L, false, true, false, z19, z19 && z10 && !h1Var.a.p() && !h1Var.a.g(h1Var.b.a, i1Var4).f, 4);
            l1Var4 = l1Var;
            j14 = 0;
            n0Var = n0Var2;
            i1Var3 = i1Var4;
        } else {
            x2.g0 g0Var3 = h1Var.b;
            Object obj2 = g0Var3.a;
            e2.l1 l1Var7 = h1Var.a;
            boolean z20 = l1Var7.p() || l1Var7.g(g0Var3.a, i1Var4).f;
            long j18 = (h1Var.b.b() || z20) ? h1Var.c : h1Var.s;
            if (o0Var != null) {
                boolean z21 = true;
                j3 = 1;
                e2.l1 l1Var8 = l1Var;
                Pair R = R(l1Var8, o0Var, true, i13, z18, k1Var2, i1Var4);
                if (R == null) {
                    i12 = l1Var8.a(z18);
                    obj = obj2;
                    longValue = j18;
                    z15 = false;
                    z16 = false;
                } else {
                    if (o0Var.c == -9223372036854775807L) {
                        i12 = l1Var8.g(R.first, i1Var4).c;
                        obj = obj2;
                        longValue = j18;
                        z15 = false;
                    } else {
                        obj = R.first;
                        longValue = ((Long) R.second).longValue();
                        z15 = true;
                        i12 = -1;
                    }
                    z16 = h1Var.e == 4;
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
                if (h1Var.a.p()) {
                    i7 = l1Var9.a(z18);
                    k1Var = k1Var2;
                    obj = obj2;
                } else if (l1Var9.b(obj2) == -1) {
                    obj = obj2;
                    int S = S(k1Var2, i1Var4, i13, z18, obj, h1Var.a, l1Var9);
                    k1Var = k1Var2;
                    e2.l1 l1Var10 = l1Var9;
                    i1Var = i1Var4;
                    if (S == -1) {
                        S = l1Var10.a(z18);
                        z14 = true;
                    } else {
                        z14 = false;
                    }
                    i7 = S;
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
                        h1Var.a.g(g0Var3.a, i1Var4);
                        if (h1Var.a.m(i1Var4.c, k1Var, 0L).n == h1Var.a.b(g0Var3.a)) {
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
            x2.g0 p10 = x0Var2.p(l1Var3, obj, j11);
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
                    long j19 = h1Var.c;
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
                j15 = h1Var.s;
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
            boolean z24 = (p10.equals(h1Var.b) && j15 == h1Var.s) ? false : true;
            int i20 = l1Var3.b(h1Var.b.a) == -1 ? 4 : 3;
            if (p10.a.equals(h1Var.b.a) && p10.b != -1) {
                e2.a a11 = l1Var3.g(p10.a, i1Var2).g.a(p10.b);
                int i21 = p10.c;
                int[] iArr = a11.e;
                if (i21 >= iArr.length || iArr[i21] != 2) {
                    i10 = 0;
                    n0Var = new n0(p10, j15, j16, z11, z12, z13, z24, (z24 || !z10 || h1Var.a.p() || h1Var.a.g(h1Var.b.a, i1Var2).f) ? false : true, i10);
                    l1Var4 = l1Var3;
                    i1Var3 = i1Var2;
                }
            }
            i10 = i20;
            n0Var = new n0(p10, j15, j16, z11, z12, z13, z24, (z24 || !z10 || h1Var.a.p() || h1Var.a.g(h1Var.b.a, i1Var2).f) ? false : true, i10);
            l1Var4 = l1Var3;
            i1Var3 = i1Var2;
        }
        x2.g0 g0Var4 = n0Var.a;
        long j21 = n0Var.b;
        try {
            if (n0Var.e) {
                z17 = true;
                if (this.Y.e != 1) {
                    n0(4);
                }
                N(false, false, false, true);
            } else {
                z17 = true;
            }
            o1[] o1VarArr = this.a;
            int length = o1VarArr.length;
            int i22 = 0;
            e2.l1 l1Var11 = i1Var3;
            while (i22 < length) {
                o1 o1Var = o1VarArr[i22];
                b bVar = o1Var.a;
                boolean equals2 = Objects.equals(bVar.G, l1Var4);
                if (equals2 == 0) {
                    bVar.G = l1Var4;
                    bVar.v();
                }
                b bVar2 = o1Var.c;
                if (bVar2 != null && !Objects.equals(bVar2.G, l1Var4)) {
                    bVar2.G = l1Var4;
                    bVar2.v();
                }
                i22++;
                l1Var11 = equals2;
            }
            try {
                if (n0Var.g) {
                    l1Var11 = l1Var4;
                    if (!l1Var11.p()) {
                        for (v0 v0Var2 = this.I.i; v0Var2 != null; v0Var2 = v0Var2.m) {
                            if (v0Var2.g.a.equals(g0Var4)) {
                                v0Var2.g = this.I.h(l1Var11, v0Var2.g);
                                v0Var2.k();
                            }
                        }
                        boolean z25 = n0Var.d;
                        try {
                            x0Var = this.I;
                            g0Var = g0Var4;
                        } catch (Throwable th2) {
                            th = th2;
                            g0Var = g0Var4;
                            l1Var6 = l1Var11;
                            l1Var5 = l1Var6;
                            h1 h1Var2 = this.Y;
                            e2.l1 l1Var12 = h1Var2.a;
                            x2.g0 g0Var5 = h1Var2.b;
                            x2.g0 g0Var6 = g0Var;
                            C0(l1Var5, g0Var6, l1Var12, g0Var5, n0Var.f ? j21 : -9223372036854775807L, false);
                            if (!n0Var.g || n0Var.c != this.Y.c) {
                                long j22 = n0Var.c;
                                boolean z26 = n0Var.h;
                                this.Y = x(g0Var6, j21, j22, z26 ? j21 : this.Y.d, z26, n0Var.i);
                            }
                            O();
                            Q(l1Var5, this.Y.a);
                            this.Y = this.Y.j(l1Var5);
                            if (!l1Var5.p()) {
                                this.m0 = null;
                            }
                            t(false);
                            this.n.f(2);
                            throw th;
                        }
                        try {
                            j21 = X(g0Var, j21, x0Var.i != x0Var.j ? z17 : false, z25);
                            h1 h1Var3 = this.Y;
                            x2.g0 g0Var7 = g0Var;
                            C0(l1Var, g0Var7, h1Var3.a, h1Var3.b, !n0Var.f ? j21 : -9223372036854775807L, false);
                            if (!n0Var.g || n0Var.c != this.Y.c) {
                                long j23 = n0Var.c;
                                boolean z27 = n0Var.h;
                                this.Y = x(g0Var7, j21, j23, !z27 ? j21 : this.Y.d, z27, n0Var.i);
                            }
                            O();
                            Q(l1Var, this.Y.a);
                            this.Y = this.Y.j(l1Var);
                            if (!l1Var.p()) {
                                this.m0 = null;
                            }
                            t(false);
                            this.n.f(2);
                        } catch (Throwable th3) {
                            th = th3;
                            j21 = j21;
                            l1Var6 = l1Var11;
                            l1Var5 = l1Var6;
                            h1 h1Var22 = this.Y;
                            e2.l1 l1Var122 = h1Var22.a;
                            x2.g0 g0Var52 = h1Var22.b;
                            x2.g0 g0Var62 = g0Var;
                            C0(l1Var5, g0Var62, l1Var122, g0Var52, n0Var.f ? j21 : -9223372036854775807L, false);
                            if (!n0Var.g) {
                            }
                            long j222 = n0Var.c;
                            boolean z262 = n0Var.h;
                            this.Y = x(g0Var62, j21, j222, z262 ? j21 : this.Y.d, z262, n0Var.i);
                            O();
                            Q(l1Var5, this.Y.a);
                            this.Y = this.Y.j(l1Var5);
                            if (!l1Var5.p()) {
                            }
                            t(false);
                            this.n.f(2);
                            throw th;
                        }
                    }
                } else {
                    try {
                        v0 v0Var3 = this.I.j;
                        long m10 = v0Var3 == null ? j14 : m(v0Var3);
                        try {
                            try {
                                if (d() && (v0Var = this.I.k) != null) {
                                    j17 = m(v0Var);
                                    s5 = this.I.s(l1Var, this.n0, m10, j17);
                                    if ((s5 & 1) == 0) {
                                        U(false);
                                    } else if ((s5 & 2) != 0) {
                                        g();
                                    }
                                }
                                s5 = this.I.s(l1Var, this.n0, m10, j17);
                                if ((s5 & 1) == 0) {
                                }
                            } catch (Throwable th4) {
                                th = th4;
                                l1Var11 = l1Var;
                                g0Var = g0Var4;
                                l1Var6 = l1Var11;
                                l1Var5 = l1Var6;
                                h1 h1Var222 = this.Y;
                                e2.l1 l1Var1222 = h1Var222.a;
                                x2.g0 g0Var522 = h1Var222.b;
                                x2.g0 g0Var622 = g0Var;
                                C0(l1Var5, g0Var622, l1Var1222, g0Var522, n0Var.f ? j21 : -9223372036854775807L, false);
                                if (!n0Var.g) {
                                }
                                long j2222 = n0Var.c;
                                boolean z2622 = n0Var.h;
                                this.Y = x(g0Var622, j21, j2222, z2622 ? j21 : this.Y.d, z2622, n0Var.i);
                                O();
                                Q(l1Var5, this.Y.a);
                                this.Y = this.Y.j(l1Var5);
                                if (!l1Var5.p()) {
                                }
                                t(false);
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
                h1 h1Var32 = this.Y;
                x2.g0 g0Var72 = g0Var;
                C0(l1Var, g0Var72, h1Var32.a, h1Var32.b, !n0Var.f ? j21 : -9223372036854775807L, false);
                if (!n0Var.g) {
                }
                long j232 = n0Var.c;
                boolean z272 = n0Var.h;
                this.Y = x(g0Var72, j21, j232, !z272 ? j21 : this.Y.d, z272, n0Var.i);
                O();
                Q(l1Var, this.Y.a);
                this.Y = this.Y.j(l1Var);
                if (!l1Var.p()) {
                }
                t(false);
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

    public final void u0(boolean z10, boolean z11) {
        N(z10 || !this.i0, false, true, false);
        this.Z.f(z11 ? 1 : 0);
        i iVar = (i) this.f;
        ConcurrentHashMap concurrentHashMap = iVar.p;
        m2.i iVar2 = this.M;
        h hVar = (h) concurrentHashMap.get(iVar2);
        if (hVar != null) {
            int i7 = hVar.a - 1;
            hVar.a = i7;
            if (i7 == 0) {
                concurrentHashMap.remove(iVar2);
                iVar.c();
            }
        }
        this.Q.d(1, this.Y.l);
        n0(1);
    }

    public final void v(x2.e0 e0Var) {
        v0 v0Var;
        x0 x0Var = this.I;
        v0 v0Var2 = x0Var.l;
        j jVar = this.E;
        if (v0Var2 != null && v0Var2.a == e0Var) {
            v0Var2.getClass();
            if (!v0Var2.e) {
                float f10 = jVar.l().a;
                h1 h1Var = this.Y;
                v0Var2.f(f10, h1Var.a, h1Var.l);
            }
            x0(v0Var2.g.a, v0Var2.o);
            if (v0Var2 == x0Var.i) {
                P(v0Var2.g.b, true);
                k(x0Var.j.e(), new boolean[this.a.length]);
                v0Var2.h = true;
                h1 h1Var2 = this.Y;
                x2.g0 g0Var = h1Var2.b;
                long j3 = v0Var2.g.b;
                this.Y = x(g0Var, j3, h1Var2.c, j3, false, 5);
            }
            B();
            return;
        }
        int i7 = 0;
        while (true) {
            if (i7 >= x0Var.q.size()) {
                v0Var = null;
                break;
            }
            v0Var = (v0) x0Var.q.get(i7);
            if (v0Var.a == e0Var) {
                break;
            } else {
                i7++;
            }
        }
        if (v0Var != null) {
            ma.p(true ^ v0Var.e);
            float f11 = jVar.l().a;
            h1 h1Var3 = this.Y;
            v0Var.f(f11, h1Var3.a, h1Var3.l);
            v0 v0Var3 = x0Var.m;
            if (v0Var3 == null || v0Var3.a != e0Var) {
                return;
            }
            C();
        }
    }

    public final void v0() {
        j jVar = this.E;
        jVar.b = false;
        r1 r1Var = (r1) jVar.c;
        if (r1Var.c) {
            r1Var.c(r1Var.a());
            r1Var.c = false;
        }
        for (o1 o1Var : this.a) {
            b bVar = o1Var.c;
            b bVar2 = o1Var.a;
            if (o1.h(bVar2)) {
                o1.b(bVar2);
            }
            if (bVar != null && bVar.n != 0) {
                o1.b(bVar);
            }
        }
    }

    public final void w(e2.w0 w0Var, float f10, boolean z10, boolean z11) {
        int i7;
        if (z10) {
            if (z11) {
                this.Z.f(1);
            }
            this.Y = this.Y.g(w0Var);
        }
        float f11 = w0Var.a;
        v0 v0Var = this.I.i;
        while (true) {
            i7 = 0;
            if (v0Var == null) {
                break;
            }
            a3.u[] uVarArr = v0Var.o.c;
            int length = uVarArr.length;
            while (i7 < length) {
                a3.u uVar = uVarArr[i7];
                if (uVar != null) {
                    uVar.q(f11);
                }
                i7++;
            }
            v0Var = v0Var.m;
        }
        o1[] o1VarArr = this.a;
        int length2 = o1VarArr.length;
        while (i7 < length2) {
            o1 o1Var = o1VarArr[i7];
            float f12 = w0Var.a;
            o1Var.a.A(f10, f12);
            b bVar = o1Var.c;
            if (bVar != null) {
                bVar.A(f10, f12);
            }
            i7++;
        }
    }

    /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, x2.f1] */
    public final void w0() {
        v0 v0Var = this.I.l;
        boolean z10 = this.f0 || (v0Var != null && v0Var.a.g());
        h1 h1Var = this.Y;
        if (z10 != h1Var.g) {
            this.Y = h1Var.b(z10);
        }
    }

    public final h1 x(x2.g0 g0Var, long j3, long j10, long j11, boolean z10, int i7) {
        s1 s1Var;
        boolean z11;
        this.q0 = (!this.q0 && j3 == this.Y.s && g0Var.equals(this.Y.b)) ? false : true;
        O();
        h1 h1Var = this.Y;
        x2.r1 r1Var = h1Var.h;
        a3.y yVar = h1Var.i;
        List list = h1Var.j;
        if (this.J.k) {
            v0 v0Var = this.I.i;
            r1Var = v0Var == null ? x2.r1.d : v0Var.n;
            yVar = v0Var == null ? this.e : v0Var.o;
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
                s1Var = f0Var.f();
            } else {
                h9.g0 g0Var2 = h9.i0.b;
                s1Var = s1.e;
            }
            list = s1Var;
            if (v0Var != null) {
                w0 w0Var = v0Var.g;
                if (w0Var.d != j10) {
                    v0Var.g = w0Var.a(j10);
                }
            }
            o1[] o1VarArr = this.a;
            x0 x0Var = this.I;
            v0 v0Var2 = x0Var.i;
            if (v0Var2 == x0Var.j && v0Var2 != null) {
                a3.y yVar2 = v0Var2.o;
                int i10 = 0;
                boolean z13 = false;
                while (true) {
                    if (i10 >= o1VarArr.length) {
                        z11 = true;
                        break;
                    }
                    if (yVar2.b(i10)) {
                        if (o1VarArr[i10].a.b != 1) {
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
        } else if (!g0Var.equals(h1Var.b)) {
            r1Var = x2.r1.d;
            yVar = this.e;
            list = s1.e;
        }
        x2.r1 r1Var2 = r1Var;
        a3.y yVar3 = yVar;
        List list2 = list;
        if (z10) {
            m0 m0Var = this.Z;
            if (!m0Var.d || m0Var.e == 5) {
                m0Var.c = true;
                m0Var.d = true;
                m0Var.e = i7;
            } else {
                ma.f(i7 == 5);
            }
        }
        h1 h1Var2 = this.Y;
        return h1Var2.d(g0Var, j3, j10, j11, o(h1Var2.q), r1Var2, yVar3, list2);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00c3 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void x0(x2.g0 g0Var, a3.y yVar) {
        boolean z10;
        int length;
        int i7;
        v0 v0Var = this.I.l;
        v0Var.getClass();
        o(v0Var.d());
        if (s0(this.Y.a, v0Var.g.a)) {
            long j3 = this.K.h;
        }
        e2.l1 l1Var = this.Y.a;
        float f10 = this.E.l().a;
        boolean z11 = this.Y.l;
        a3.u[] uVarArr = yVar.c;
        i iVar = (i) this.f;
        iVar.getClass();
        h9.l0 l0Var = iVar.o;
        m2.i iVar2 = this.M;
        Integer num = (Integer) l0Var.get(iVar2.a);
        int intValue = (num == null || num.intValue() == -1) ? iVar.l : num.intValue();
        h hVar = (h) iVar.p.get(iVar2);
        hVar.getClass();
        if (intValue == -1) {
            e2.g0 g0Var2 = l1Var.m(l1Var.g(g0Var.a, iVar.b).c, iVar.a, 0L).c.b;
            if (g0Var2 != null) {
                String scheme = g0Var2.a.getScheme();
                if (TextUtils.isEmpty(scheme) || i.r.contains(scheme)) {
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
        hVar.c = intValue;
        iVar.c();
    }

    public final void y0(List list, int i7, int i10) {
        this.Z.f(1);
        g1 g1Var = this.J;
        g1Var.getClass();
        ArrayList arrayList = g1Var.b;
        ma.f(i7 >= 0 && i7 <= i10 && i10 <= arrayList.size());
        ma.f(list.size() == i10 - i7);
        for (int i11 = i7; i11 < i10; i11++) {
            ((f1) arrayList.get(i11)).a.t((e2.l0) list.get(i11 - i7));
        }
        u(g1Var.b(), false);
    }

    public final boolean z(int i7, x2.g0 g0Var) {
        x0 x0Var = this.I;
        v0 v0Var = x0Var.k;
        if (v0Var != null && v0Var.g.a.equals(g0Var)) {
            o1 o1Var = this.a[i7];
            v0 v0Var2 = x0Var.k;
            int i10 = o1Var.d;
            boolean z10 = (i10 == 2 || i10 == 4) && o1Var.d(v0Var2) == o1Var.a;
            boolean z11 = o1Var.d == 3 && o1Var.d(v0Var2) == o1Var.c;
            if (z10 || z11) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:99:0x029c, code lost:
    
        if (((long) ((r3.e() - r23.n0) / r23.E.l().a)) > 10000000) goto L254;
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
    public final void z0() {
        v0 v0Var;
        long j3;
        v0 v0Var2;
        v0 v0Var3;
        o1[] o1VarArr;
        x0 x0Var;
        boolean z10;
        v0 v0Var4;
        v0 v0Var5;
        v0 a10;
        boolean z11;
        int i7;
        o1[] o1VarArr2;
        int i10;
        boolean z12;
        boolean z13;
        char c10;
        int i11;
        int i12;
        v0 v0Var6;
        v0 v0Var7;
        boolean z14;
        int i13;
        if (this.Y.a.p() || !this.J.k) {
            return;
        }
        this.I.m(this.n0);
        x0 x0Var2 = this.I;
        v0 v0Var8 = x0Var2.l;
        if (v0Var8 == null || (!v0Var8.g.k && v0Var8.g() && x0Var2.l.g.f != -9223372036854775807L && x0Var2.n < 100)) {
            x0 x0Var3 = this.I;
            long j10 = this.n0;
            h1 h1Var = this.Y;
            v0 v0Var9 = x0Var3.l;
            w0 d = v0Var9 == null ? x0Var3.d(h1Var.a, h1Var.b, h1Var.c, h1Var.s, -9223372036854775807L) : x0Var3.c(h1Var.a, v0Var9, j10);
            if (d != null) {
                x0 x0Var4 = this.I;
                v0 v0Var10 = x0Var4.l;
                long j11 = v0Var10 == null ? 1000000000000L : (v0Var10.p + v0Var10.g.f) - d.b;
                int i14 = 0;
                while (true) {
                    if (i14 >= x0Var4.q.size()) {
                        v0Var = null;
                        break;
                    }
                    w0 w0Var = ((v0) x0Var4.q.get(i14)).g;
                    long j12 = w0Var.f;
                    long j13 = d.f;
                    if ((j12 == -9223372036854775807L || j12 == j13) && w0Var.b == d.b && w0Var.a.equals(d.a)) {
                        v0Var = (v0) x0Var4.q.remove(i14);
                        break;
                    }
                    i14++;
                }
                if (v0Var == null) {
                    p0 p0Var = (p0) x0Var4.e.b;
                    b[] bVarArr = p0Var.b;
                    a3.x xVar = p0Var.d;
                    r0 r0Var = p0Var.f;
                    m2.i iVar = p0Var.M;
                    i iVar2 = (i) r0Var;
                    iVar2.getClass();
                    j3 = -9223372036854775807L;
                    h6.m mVar = new h6.m(iVar2, iVar);
                    g1 g1Var = p0Var.J;
                    a3.y yVar = p0Var.e;
                    p0Var.t0.getClass();
                    v0Var = new v0(bVarArr, j11, xVar, mVar, g1Var, d, yVar);
                } else {
                    j3 = -9223372036854775807L;
                    v0Var.g = d;
                    v0Var.p = j11;
                }
                v0 v0Var11 = x0Var4.l;
                if (v0Var11 == null) {
                    x0Var4.i = v0Var;
                    x0Var4.j = v0Var;
                    x0Var4.k = v0Var;
                } else if (v0Var != v0Var11.m) {
                    v0Var11.b();
                    v0Var11.m = v0Var;
                    v0Var11.c();
                }
                x0Var4.o = null;
                x0Var4.l = v0Var;
                x0Var4.n++;
                x0Var4.l();
                if (!v0Var.d) {
                    long j14 = d.b;
                    v0Var.d = true;
                    v0Var.a.s(this, j14);
                } else if (v0Var.e) {
                    this.n.b(8, v0Var.a).b();
                }
                if (this.I.i == v0Var) {
                    P(d.b, true);
                }
                t(false);
                if (this.f0) {
                    B();
                } else {
                    this.f0 = y(this.I.l);
                    w0();
                }
                x0 x0Var5 = this.I;
                if (!this.c0 && this.P && !this.v0 && !d() && (v0Var6 = x0Var5.k) != null && v0Var6 == x0Var5.j && (v0Var7 = v0Var6.m) != null && (z14 = v0Var7.e)) {
                    ma.p(z14);
                    if (((long) ((v0Var7.e() - this.n0) / this.E.l().a)) <= 10000000) {
                        v0 v0Var12 = x0Var5.k;
                        v0Var12.getClass();
                        x0Var5.k = v0Var12.m;
                        x0Var5.l();
                        x0Var5.k.getClass();
                        o1[] o1VarArr3 = this.a;
                        v0 v0Var13 = x0Var5.k;
                        if (v0Var13 != null) {
                            a3.y yVar2 = v0Var13.o;
                            for (int i15 = 0; i15 < o1VarArr3.length; i15++) {
                                if (yVar2.b(i15)) {
                                    o1 o1Var = o1VarArr3[i15];
                                    if (o1Var.c != null && !o1Var.f()) {
                                        o1 o1Var2 = o1VarArr3[i15];
                                        ma.p(!o1Var2.f());
                                        if (o1.h(o1Var2.a)) {
                                            i13 = 3;
                                        } else {
                                            b bVar = o1Var2.c;
                                            i13 = (bVar == null || bVar.n == 0) ? 2 : 4;
                                        }
                                        o1Var2.d = i13;
                                        j(v0Var13, i15, false, v0Var13.e());
                                    }
                                }
                            }
                            if (d()) {
                                this.u0 = v0Var13.a.p();
                                if (!v0Var13.g()) {
                                    x0Var5.n(v0Var13);
                                    t(false);
                                    B();
                                }
                            }
                        }
                    }
                }
                boolean z15 = this.P;
                o1[] o1VarArr4 = this.a;
                x0 x0Var6 = this.I;
                v0Var2 = x0Var6.j;
                if (v0Var2 != null) {
                    if (v0Var2.m == null || this.c0) {
                        if (v0Var2.g.k || this.c0) {
                            for (o1 o1Var3 : o1VarArr4) {
                                if (o1Var3.d(v0Var2) != null) {
                                    b d2 = o1Var3.d(v0Var2);
                                    d2.getClass();
                                    if (d2.j()) {
                                        long j15 = v0Var2.g.f;
                                        long j16 = (j15 == -9223372036854775807L || j15 == Long.MIN_VALUE) ? -9223372036854775807L : j15 + v0Var2.p;
                                        b d10 = o1Var3.d(v0Var2);
                                        d10.getClass();
                                        o1.l(d10, j16);
                                    }
                                }
                            }
                        }
                    } else if (v0Var2.e) {
                        int i16 = 0;
                        while (true) {
                            if (i16 < o1VarArr4.length) {
                                o1 o1Var4 = o1VarArr4[i16];
                                if (!o1Var4.e(v0Var2, o1Var4.a) || !o1Var4.e(v0Var2, o1Var4.c)) {
                                    break;
                                } else {
                                    i16++;
                                }
                            } else if (!d() || x0Var6.k != x0Var6.j) {
                                v0 v0Var14 = v0Var2.m;
                                if (v0Var14.e || this.n0 >= v0Var14.e()) {
                                    boolean z16 = v0Var2.m.e;
                                    if (z16) {
                                        ma.p(z16);
                                    }
                                    a3.y yVar3 = v0Var2.o;
                                    v0 v0Var15 = x0Var6.k;
                                    v0 v0Var16 = x0Var6.j;
                                    if (v0Var15 == v0Var16) {
                                        v0Var16.getClass();
                                        x0Var6.k = v0Var16.m;
                                    }
                                    v0 v0Var17 = x0Var6.j;
                                    v0Var17.getClass();
                                    x0Var6.j = v0Var17.m;
                                    x0Var6.l();
                                    v0 v0Var18 = x0Var6.j;
                                    v0Var18.getClass();
                                    a3.y yVar4 = v0Var18.o;
                                    e2.l1 l1Var = this.Y.a;
                                    C0(l1Var, v0Var18.g.a, l1Var, v0Var2.g.a, -9223372036854775807L, false);
                                    if (v0Var18.e && ((z15 && this.u0 != j3) || v0Var18.a.p() != j3)) {
                                        this.u0 = j3;
                                        boolean z17 = z15 && !this.v0;
                                        if (z17) {
                                            int i17 = 0;
                                            while (true) {
                                                if (i17 >= o1VarArr4.length) {
                                                    break;
                                                }
                                                boolean b10 = yVar4.b(i17);
                                                a3.u[] uVarArr = yVar4.c;
                                                if (b10 && o1VarArr4[i17].a.b != -2 && !e2.s0.a(uVarArr[i17].n().s, uVarArr[i17].n().k) && !o1VarArr4[i17].f()) {
                                                    z17 = false;
                                                    break;
                                                }
                                                i17++;
                                            }
                                        }
                                        if (!z17) {
                                            long e10 = v0Var18.e();
                                            for (o1 o1Var5 : o1VarArr4) {
                                                b bVar2 = o1Var5.c;
                                                b bVar3 = o1Var5.a;
                                                if (o1.h(bVar3) && (i12 = o1Var5.d) != 4 && i12 != 2) {
                                                    o1.l(bVar3, e10);
                                                }
                                                if (bVar2 != null) {
                                                    if ((bVar2.n != 0) && o1Var5.d != 3) {
                                                        o1.l(bVar2, e10);
                                                    }
                                                }
                                            }
                                            if (!v0Var18.g()) {
                                                x0Var6.n(v0Var18);
                                                t(false);
                                                B();
                                            }
                                        }
                                    }
                                    for (o1 o1Var6 : o1VarArr4) {
                                        long e11 = v0Var18.e();
                                        b bVar4 = o1Var6.a;
                                        int i18 = o1Var6.b;
                                        boolean b11 = yVar3.b(i18);
                                        boolean b12 = yVar4.b(i18);
                                        b bVar5 = o1Var6.c;
                                        if (bVar5 == null || (i11 = o1Var6.d) == 3 || (i11 == 0 && o1.h(bVar4))) {
                                            bVar5 = bVar4;
                                        }
                                        if (!b11 || bVar5.E) {
                                            c10 = 65534;
                                        } else {
                                            int i19 = bVar4.b;
                                            c10 = 65534;
                                            boolean z18 = i19 == -2;
                                            n1 n1Var = yVar3.b[i18];
                                            n1 n1Var2 = yVar4.b[i18];
                                            if (!b12 || !Objects.equals(n1Var2, n1Var) || z18 || o1Var6.f()) {
                                                o1.l(bVar5, e11);
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                x0 x0Var7 = this.I;
                v0Var3 = x0Var7.j;
                if (v0Var3 != null && x0Var7.i != v0Var3 && !v0Var3.h) {
                    o1VarArr2 = this.a;
                    a3.y yVar5 = v0Var3.o;
                    z12 = true;
                    for (i10 = 0; i10 < o1VarArr2.length; i10++) {
                        int c11 = o1VarArr2[i10].c();
                        o1 o1Var7 = o1VarArr2[i10];
                        j jVar = this.E;
                        int j17 = o1Var7.j(o1Var7.a, v0Var3, yVar5, jVar);
                        int j18 = o1Var7.j(o1Var7.c, v0Var3, yVar5, jVar);
                        if (j17 == 1) {
                            j17 = j18;
                        }
                        if ((j17 & 2) != 0 && (z13 = this.k0) && z13) {
                            this.k0 = false;
                            if (this.Y.p) {
                                this.n.f(2);
                            }
                        }
                        this.l0 -= c11 - o1VarArr2[i10].c();
                        z12 &= (j17 & 1) != 0;
                    }
                    if (z12) {
                        for (int i20 = 0; i20 < o1VarArr2.length; i20++) {
                            if (yVar5.b(i20)) {
                                if (!(o1VarArr2[i20].d(v0Var3) != null)) {
                                    j(v0Var3, i20, false, v0Var3.e());
                                }
                            }
                        }
                    }
                    if (z12) {
                        x0Var7.j.h = true;
                    }
                }
                o1VarArr = this.a;
                x0Var = this.I;
                z10 = false;
                while (r0() && !this.c0 && (v0Var4 = x0Var.i) != null && (v0Var5 = v0Var4.m) != null && this.n0 >= v0Var5.e() && v0Var5.h) {
                    if (z10) {
                        D();
                    }
                    this.v0 = false;
                    a10 = x0Var.a();
                    a10.getClass();
                    if (this.Y.b.a.equals(a10.g.a.a)) {
                        x2.g0 g0Var = this.Y.b;
                        if (g0Var.b == -1) {
                            x2.g0 g0Var2 = a10.g.a;
                            if (g0Var2.b == -1 && g0Var.e != g0Var2.e) {
                                z11 = true;
                                w0 w0Var2 = a10.g;
                                boolean z19 = z11;
                                x2.g0 g0Var3 = w0Var2.a;
                                long j19 = w0Var2.b;
                                this.Y = x(g0Var3, j19, w0Var2.d, j19, !z19, 0);
                                O();
                                B0();
                                if (d() && a10 == x0Var.k) {
                                    for (o1 o1Var8 : o1VarArr) {
                                        int i21 = o1Var8.d;
                                        if (i21 == 3 || i21 == 4) {
                                            boolean z20 = i21 == 4;
                                            b bVar6 = o1Var8.a;
                                            b bVar7 = o1Var8.c;
                                            if (z20) {
                                                bVar7.getClass();
                                                bVar7.c(17, bVar6);
                                            } else {
                                                bVar7.getClass();
                                                bVar6.c(17, bVar7);
                                            }
                                            o1Var8.d = o1Var8.d == 4 ? 0 : 1;
                                        } else if (i21 == 2) {
                                            o1Var8.d = 0;
                                        }
                                    }
                                }
                                if (this.Y.e == 3) {
                                    t0();
                                }
                                a3.y yVar6 = x0Var.i.o;
                                for (i7 = 0; i7 < o1VarArr.length; i7++) {
                                    if (yVar6.b(i7)) {
                                        o1 o1Var9 = o1VarArr[i7];
                                        b bVar8 = o1Var9.c;
                                        b bVar9 = o1Var9.a;
                                        if (o1.h(bVar9)) {
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
                    w0 w0Var22 = a10.g;
                    boolean z192 = z11;
                    x2.g0 g0Var32 = w0Var22.a;
                    long j192 = w0Var22.b;
                    this.Y = x(g0Var32, j192, w0Var22.d, j192, !z192, 0);
                    O();
                    B0();
                    if (d()) {
                        while (r2 < r1) {
                        }
                    }
                    if (this.Y.e == 3) {
                    }
                    a3.y yVar62 = x0Var.i.o;
                    while (i7 < o1VarArr.length) {
                    }
                    z10 = true;
                }
                this.t0.getClass();
            }
        }
        j3 = -9223372036854775807L;
        if (this.f0) {
        }
        x0 x0Var52 = this.I;
        if (!this.c0) {
            ma.p(z14);
            if (((long) ((v0Var7.e() - this.n0) / this.E.l().a)) <= 10000000) {
            }
        }
        boolean z152 = this.P;
        o1[] o1VarArr42 = this.a;
        x0 x0Var62 = this.I;
        v0Var2 = x0Var62.j;
        if (v0Var2 != null) {
        }
        x0 x0Var72 = this.I;
        v0Var3 = x0Var72.j;
        if (v0Var3 != null) {
            o1VarArr2 = this.a;
            a3.y yVar52 = v0Var3.o;
            z12 = true;
            while (i10 < o1VarArr2.length) {
            }
            if (z12) {
            }
            if (z12) {
            }
        }
        o1VarArr = this.a;
        x0Var = this.I;
        z10 = false;
        while (r0()) {
            if (z10) {
            }
            this.v0 = false;
            a10 = x0Var.a();
            a10.getClass();
            if (this.Y.b.a.equals(a10.g.a.a)) {
            }
            z11 = false;
            w0 w0Var222 = a10.g;
            boolean z1922 = z11;
            x2.g0 g0Var322 = w0Var222.a;
            long j1922 = w0Var222.b;
            this.Y = x(g0Var322, j1922, w0Var222.d, j1922, !z1922, 0);
            O();
            B0();
            if (d()) {
            }
            if (this.Y.e == 3) {
            }
            a3.y yVar622 = x0Var.i.o;
            while (i7 < o1VarArr.length) {
            }
            z10 = true;
        }
        this.t0.getClass();
    }
}
