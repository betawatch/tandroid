package i2;

import android.content.Context;
import android.media.MediaFormat;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.os.Trace;
import android.util.Pair;
import com.google.android.gms.internal.vision.e2;
import ei.d5;
import gg.x1;
import j$.util.Objects;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessageObject;

/* compiled from: r8-map-id-8159789691d0b3bb0641ef1f4646484974d69719884d0b33e845acec3d7c3062 */
/* loaded from: classes.dex */
public final class p0 implements Handler.Callback, u2.c0, i1, a3.y {
    public static final long u0 = e2.d0.e0(10000);
    public final ArrayList E;
    public final e2.x F;
    public final x G;
    public final w0 H;
    public final g1 I;
    public final i J;
    public final long K;
    public final j2.k L;
    public final j2.f M;
    public final e2.z N;
    public final boolean O;
    public final e P;
    public q1 Q;
    public p1 R;
    public boolean S;
    public boolean T;
    public o0 U;
    public h1 V;
    public m0 W;
    public boolean X;
    public boolean Y;
    public boolean Z;
    public final o1[] a;
    public boolean a0;
    public final f[] b;
    public long b0;
    public final boolean[] c;
    public boolean c0;
    public final x2.u d;
    public int d0;
    public final x2.v e;
    public boolean e0;
    public final k f;
    public boolean f0;
    public boolean g0;
    public final y2.c h;
    public boolean h0;
    public int i0;
    public o0 j0;
    public long k0;
    public long l0;
    public int m0;
    public final e2.z n;
    public boolean n0;
    public n o0;
    public long p0;
    public q q0;
    public final j6.l r;
    public long r0;
    public final Looper s;
    public boolean s0;
    public float t0;
    public final b2.j1 v;
    public final b2.h1 w;
    public final long x;
    public final a3.q y;

    public p0(Context context, f[] fVarArr, f[] fVarArr2, x2.u uVar, x2.v vVar, k kVar, y2.c cVar, int i10, boolean z10, j2.f fVar, q1 q1Var, i iVar, long j3, Looper looper, e2.x xVar, x xVar2, j2.k kVar2, final a3.y yVar) {
        q qVar = q.a;
        this.r0 = -9223372036854775807L;
        this.G = xVar2;
        this.d = uVar;
        this.e = vVar;
        this.f = kVar;
        this.h = cVar;
        this.d0 = i10;
        this.e0 = z10;
        this.Q = q1Var;
        this.J = iVar;
        this.K = j3;
        this.Y = false;
        this.F = xVar;
        this.L = kVar2;
        this.q0 = qVar;
        this.M = fVar;
        this.t0 = 1.0f;
        this.R = p1.b;
        this.p0 = -9223372036854775807L;
        this.b0 = -9223372036854775807L;
        this.x = kVar.g;
        b2.g1 g1Var = b2.k1.a;
        h1 k10 = h1.k(vVar);
        this.V = k10;
        this.W = new m0(k10);
        this.b = new f[fVarArr.length];
        this.c = new boolean[fVarArr.length];
        x2.p pVar = (x2.p) uVar;
        pVar.getClass();
        this.a = new o1[fVarArr.length];
        boolean z11 = false;
        for (int i11 = 0; i11 < fVarArr.length; i11++) {
            f fVar2 = fVarArr[i11];
            fVar2.e = i11;
            fVar2.f = kVar2;
            fVar2.h = xVar;
            this.b[i11] = fVar2;
            f fVar3 = this.b[i11];
            synchronized (fVar3.a) {
                fVar3.H = pVar;
            }
            f fVar4 = fVarArr2[i11];
            if (fVar4 != null) {
                fVar4.e = i11;
                fVar4.f = kVar2;
                fVar4.h = xVar;
                z11 = true;
            }
            this.a[i11] = new o1(fVarArr[i11], fVar4, i11);
        }
        this.O = z11;
        this.y = new a3.q(this, xVar);
        this.E = new ArrayList();
        this.v = new b2.j1();
        this.w = new b2.h1();
        e2.d.g(uVar.a == null);
        uVar.a = this;
        uVar.b = cVar;
        this.n0 = true;
        e2.z a2 = xVar.a(looper, null);
        this.N = a2;
        this.H = new w0(fVar, a2, new d5(this, 12));
        this.I = new g1(this, fVar, a2, kVar2);
        j6.l lVar = new j6.l(8);
        this.r = lVar;
        Looper g10 = lVar.g();
        this.s = g10;
        e2.z a10 = xVar.a(g10, this);
        this.n = a10;
        this.P = new e(context, g10, this);
        a10.a(35, new a3.y() { // from class: i2.i0
            @Override // a3.y
            public final void a(long j10, long j11, b2.s sVar, MediaFormat mediaFormat) {
                p0 p0Var = p0.this;
                p0Var.getClass();
                yVar.a(j10, j11, sVar, mediaFormat);
                p0Var.a(j10, j11, sVar, mediaFormat);
            }
        }).b();
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, u2.d0, u2.d1] */
    public static boolean A(u0 u0Var) {
        if (u0Var != null) {
            try {
                ?? r12 = u0Var.a;
                if (u0Var.e) {
                    for (u2.b1 b1Var : u0Var.c) {
                        if (b1Var != null) {
                            b1Var.a();
                        }
                    }
                } else {
                    r12.g();
                }
                if ((!u0Var.e ? 0L : r12.d()) != Long.MIN_VALUE) {
                    return true;
                }
            } catch (IOException unused) {
            }
        }
        return false;
    }

    public static Pair T(b2.k1 k1Var, o0 o0Var, boolean z10, int i10, boolean z11, b2.j1 j1Var, b2.h1 h1Var) {
        int U;
        b2.k1 k1Var2 = o0Var.a;
        if (k1Var.p()) {
            return null;
        }
        b2.k1 k1Var3 = k1Var2.p() ? k1Var : k1Var2;
        try {
            Pair i11 = k1Var3.i(j1Var, h1Var, o0Var.b, o0Var.c);
            if (!k1Var.equals(k1Var3)) {
                if (k1Var.b(i11.first) == -1) {
                    if (!z10 || (U = U(j1Var, h1Var, i10, z11, i11.first, k1Var3, k1Var)) == -1) {
                        return null;
                    }
                    return k1Var.i(j1Var, h1Var, U, -9223372036854775807L);
                }
                if (k1Var3.g(i11.first, h1Var).f && k1Var3.m(h1Var.c, j1Var, 0L).n == k1Var3.b(i11.first)) {
                    return k1Var.i(j1Var, h1Var, k1Var.g(i11.first, h1Var).c, o0Var.c);
                }
            }
            return i11;
        } catch (IndexOutOfBoundsException unused) {
            return null;
        }
    }

    public static int U(b2.j1 j1Var, b2.h1 h1Var, int i10, boolean z10, Object obj, b2.k1 k1Var, b2.k1 k1Var2) {
        b2.j1 j1Var2 = j1Var;
        b2.k1 k1Var3 = k1Var;
        Object obj2 = k1Var3.m(k1Var3.g(obj, h1Var).c, j1Var, 0L).a;
        for (int i11 = 0; i11 < k1Var2.o(); i11++) {
            if (k1Var2.m(i11, j1Var, 0L).a.equals(obj2)) {
                return i11;
            }
        }
        int b10 = k1Var3.b(obj);
        int h = k1Var3.h();
        int i12 = 0;
        int i13 = -1;
        while (i12 < h && i13 == -1) {
            b2.k1 k1Var4 = k1Var3;
            int d = k1Var4.d(b10, h1Var, j1Var2, i10, z10);
            if (d == -1) {
                break;
            }
            i13 = k1Var2.b(k1Var4.l(d));
            i12++;
            k1Var3 = k1Var4;
            b10 = d;
            j1Var2 = j1Var;
        }
        if (i13 == -1) {
            return -1;
        }
        return k1Var2.f(i13, h1Var, false).c;
    }

    public static void g(k1 k1Var) {
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

    /* JADX WARN: Removed duplicated region for block: B:27:0x02b1  */
    /* JADX WARN: Removed duplicated region for block: B:30:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r2v21, types: [java.lang.Object, u2.d0] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void A0() {
        long j3;
        boolean z10;
        float f7;
        u0 u0Var = this.H.i;
        if (u0Var == null) {
            return;
        }
        long l4 = u0Var.e ? u0Var.a.l() : -9223372036854775807L;
        if (l4 != -9223372036854775807L) {
            if (!u0Var.g()) {
                this.H.n(u0Var);
                v(false);
                D();
            }
            R(l4);
            if (l4 != this.V.s) {
                h1 h1Var = this.V;
                this.V = z(h1Var.b, l4, h1Var.c, l4, true, 5);
            }
        } else {
            a3.q qVar = this.y;
            boolean z11 = u0Var != this.H.j;
            r1 r1Var = (r1) qVar.c;
            f fVar = (f) qVar.e;
            if (fVar == null || fVar.l() || ((z11 && ((f) qVar.e).n != 2) || (!((f) qVar.e).m() && (z11 || ((f) qVar.e).k())))) {
                qVar.a = true;
                if (qVar.b) {
                    r1Var.d();
                }
            } else {
                t0 t0Var = (t0) qVar.f;
                t0Var.getClass();
                long a2 = t0Var.a();
                if (qVar.a) {
                    if (a2 >= r1Var.a()) {
                        qVar.a = false;
                        if (qVar.b) {
                            r1Var.d();
                        }
                    } else if (r1Var.c) {
                        r1Var.c(r1Var.a());
                        r1Var.c = false;
                    }
                }
                r1Var.c(a2);
                b2.v0 h = t0Var.h();
                if (!h.equals((b2.v0) r1Var.e)) {
                    r1Var.f(h);
                    ((p0) qVar.d).n.a(16, h).b();
                }
            }
            long a10 = qVar.a();
            this.k0 = a10;
            long j10 = a10 - u0Var.p;
            long j11 = this.V.s;
            ArrayList arrayList = this.E;
            if (!arrayList.isEmpty() && !this.V.b.b()) {
                if (this.n0) {
                    this.n0 = false;
                }
                h1 h1Var2 = this.V;
                h1Var2.a.b(h1Var2.b.a);
                int min = Math.min(this.m0, arrayList.size());
                if (min > 0 && arrayList.get(min - 1) != null) {
                    throw new ClassCastException();
                }
                if (min < arrayList.size() && arrayList.get(min) != null) {
                    throw new ClassCastException();
                }
                this.m0 = min;
            }
            if (this.y.b()) {
                boolean z12 = !this.W.d;
                h1 h1Var3 = this.V;
                this.V = z(h1Var3.b, j10, h1Var3.c, j10, z12, 6);
            } else {
                h1 h1Var4 = this.V;
                h1Var4.s = j10;
                h1Var4.t = SystemClock.elapsedRealtime();
            }
        }
        this.V.q = this.H.l.d();
        h1 h1Var5 = this.V;
        h1Var5.r = q(h1Var5.q);
        h1 h1Var6 = this.V;
        if (!h1Var6.l || h1Var6.e != 3 || !s0(h1Var6.a, h1Var6.b)) {
            return;
        }
        h1 h1Var7 = this.V;
        if (h1Var7.o.a != 1.0f) {
            return;
        }
        i iVar = this.J;
        long n10 = n(h1Var7.a, h1Var7.b.a, h1Var7.s);
        long j12 = this.V.r;
        if (iVar.c != -9223372036854775807L) {
            long j13 = n10 - j12;
            long j14 = iVar.m;
            if (j14 == -9223372036854775807L) {
                iVar.m = j13;
                iVar.n = 0L;
            } else {
                iVar.m = Math.max(j13, (long) ((j13 * 9.999871E-4f) + (j14 * 0.999f)));
                iVar.n = (long) ((9.999871E-4f * Math.abs(j13 - r9)) + (iVar.n * 0.999f));
            }
            if (iVar.l != -9223372036854775807L) {
                j3 = 1000;
                f7 = SystemClock.elapsedRealtime() - iVar.l < 1000 ? iVar.k : 1.0f;
            } else {
                j3 = 1000;
            }
            iVar.l = SystemClock.elapsedRealtime();
            long j15 = (iVar.n * 3) + iVar.m;
            if (iVar.h > j15) {
                float Q = e2.d0.Q(j3);
                long j16 = ((long) ((iVar.k - 1.0f) * Q)) + ((long) ((iVar.i - 1.0f) * Q));
                z10 = false;
                long[] jArr = {j15, iVar.e, iVar.h - j16};
                long j17 = jArr[0];
                for (int i10 = 1; i10 < 3; i10++) {
                    long j18 = jArr[i10];
                    if (j18 > j17) {
                        j17 = j18;
                    }
                }
                iVar.h = j17;
            } else {
                z10 = false;
                long i11 = e2.d0.i(n10 - ((long) (Math.max(0.0f, iVar.k - 1.0f) / 1.0E-7f)), iVar.h, j15);
                iVar.h = i11;
                long j19 = iVar.g;
                if (j19 != -9223372036854775807L && i11 > j19) {
                    iVar.h = j19;
                }
            }
            long j20 = n10 - iVar.h;
            if (Math.abs(j20) < iVar.a) {
                iVar.k = 1.0f;
            } else {
                iVar.k = e2.d0.g((1.0E-7f * j20) + 1.0f, iVar.j, iVar.i);
            }
            f7 = iVar.k;
            if (this.y.h().a == f7) {
                b2.v0 v0Var = new b2.v0(f7, this.V.o.b);
                this.n.d(16);
                this.y.f(v0Var);
                y(this.V.o, this.y.h().a, z10, z10);
                return;
            }
            return;
        }
        z10 = false;
        if (this.y.h().a == f7) {
        }
    }

    public final boolean B(int i10, u2.f0 f0Var) {
        w0 w0Var = this.H;
        u0 u0Var = w0Var.k;
        if (u0Var != null && u0Var.g.a.equals(f0Var)) {
            o1 o1Var = this.a[i10];
            u0 u0Var2 = w0Var.k;
            int i11 = o1Var.d;
            boolean z10 = (i11 == 2 || i11 == 4) && o1Var.d(u0Var2) == o1Var.a;
            boolean z11 = o1Var.d == 3 && o1Var.d(u0Var2) == o1Var.c;
            if (z10 || z11) {
                return true;
            }
        }
        return false;
    }

    public final void B0(b2.k1 k1Var, u2.f0 f0Var, b2.k1 k1Var2, u2.f0 f0Var2, long j3, boolean z10) {
        boolean s02 = s0(k1Var, f0Var);
        Object obj = f0Var.a;
        if (!s02) {
            b2.v0 v0Var = f0Var.b() ? b2.v0.d : this.V.o;
            a3.q qVar = this.y;
            if (qVar.h().equals(v0Var)) {
                return;
            }
            this.n.d(16);
            qVar.f(v0Var);
            y(this.V.o, v0Var.a, false, false);
            return;
        }
        b2.h1 h1Var = this.w;
        int i10 = k1Var.g(obj, h1Var).c;
        b2.j1 j1Var = this.v;
        k1Var.n(i10, j1Var);
        b2.e0 e0Var = j1Var.j;
        i iVar = this.J;
        iVar.getClass();
        iVar.c = e2.d0.Q(e0Var.a);
        iVar.f = e2.d0.Q(e0Var.b);
        iVar.g = e2.d0.Q(e0Var.c);
        float f7 = e0Var.d;
        if (f7 == -3.4028235E38f) {
            f7 = 0.97f;
        }
        iVar.j = f7;
        float f10 = e0Var.e;
        if (f10 == -3.4028235E38f) {
            f10 = 1.03f;
        }
        iVar.i = f10;
        if (f7 == 1.0f && f10 == 1.0f) {
            iVar.c = -9223372036854775807L;
        }
        iVar.a();
        if (j3 != -9223372036854775807L) {
            iVar.d = n(k1Var, obj, j3);
            iVar.a();
            return;
        }
        if (!Objects.equals(!k1Var2.p() ? k1Var2.m(k1Var2.g(f0Var2.a, h1Var).c, j1Var, 0L).a : null, j1Var.a) || z10) {
            iVar.d = -9223372036854775807L;
            iVar.a();
        }
    }

    public final boolean C() {
        u0 u0Var = this.H.i;
        long j3 = u0Var.g.e;
        if (u0Var.e) {
            return j3 == -9223372036854775807L || this.V.s < j3 || !r0();
        }
        return false;
    }

    public final void C0(boolean z10, boolean z11) {
        long j3;
        this.a0 = z10;
        if (!z10 || z11) {
            j3 = -9223372036854775807L;
        } else {
            this.F.getClass();
            j3 = SystemClock.elapsedRealtime();
        }
        this.b0 = j3;
    }

    /* JADX WARN: Type inference failed for: r1v16, types: [java.lang.Object, u2.d0] */
    /* JADX WARN: Type inference failed for: r1v23, types: [java.lang.Object, u2.d1] */
    /* JADX WARN: Type inference failed for: r7v1, types: [java.lang.Object, u2.d1] */
    public final void D() {
        boolean c10;
        if (A(this.H.l)) {
            u0 u0Var = this.H.l;
            long q6 = q(!u0Var.e ? 0L : u0Var.a.d());
            u0 u0Var2 = this.H.i;
            long j3 = s0(this.V.a, u0Var.g.a) ? this.J.h : -9223372036854775807L;
            j2.k kVar = this.L;
            b2.k1 k1Var = this.V.a;
            float f7 = this.y.h().a;
            boolean z10 = this.V.l;
            q0 q0Var = new q0(kVar, q6, f7, this.a0, j3);
            c10 = this.f.c(q0Var);
            u0 u0Var3 = this.H.i;
            if (!c10 && u0Var3.e && q6 < 500000 && this.x > 0) {
                u0Var3.a.i(this.V.s);
                c10 = this.f.c(q0Var);
            }
        } else {
            c10 = false;
        }
        this.c0 = c10;
        if (c10) {
            u0 u0Var4 = this.H.l;
            u0Var4.getClass();
            r0 r0Var = new r0();
            r0Var.a = this.k0 - u0Var4.p;
            float f10 = this.y.h().a;
            e2.d.b(f10 > 0.0f || f10 == -3.4028235E38f);
            r0Var.b = f10;
            long j10 = this.b0;
            e2.d.b(j10 >= 0 || j10 == -9223372036854775807L);
            r0Var.c = j10;
            s0 s0Var = new s0(r0Var);
            e2.d.g(u0Var4.m == null);
            u0Var4.a.p(s0Var);
        }
        w0();
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, u2.d0, u2.d1] */
    public final void E() {
        w0 w0Var = this.H;
        w0Var.k();
        u0 u0Var = w0Var.m;
        if (u0Var != null) {
            ?? r12 = u0Var.a;
            if ((!u0Var.d || u0Var.e) && !r12.c()) {
                b2.k1 k1Var = this.V.a;
                if (u0Var.e) {
                    r12.s();
                }
                Iterator it = this.f.h.values().iterator();
                while (it.hasNext()) {
                    if (((j) it.next()).a) {
                        return;
                    }
                }
                if (!u0Var.d) {
                    long j3 = u0Var.g.b;
                    u0Var.d = true;
                    r12.k(this, j3);
                    return;
                }
                r0 r0Var = new r0();
                r0Var.a = this.k0 - u0Var.p;
                float f7 = this.y.h().a;
                e2.d.b(f7 > 0.0f || f7 == -3.4028235E38f);
                r0Var.b = f7;
                long j10 = this.b0;
                e2.d.b(j10 >= 0 || j10 == -9223372036854775807L);
                r0Var.c = j10;
                s0 s0Var = new s0(r0Var);
                e2.d.g(u0Var.m == null);
                r12.p(s0Var);
            }
        }
    }

    public final void F() {
        m0 m0Var = this.W;
        h1 h1Var = this.V;
        boolean z10 = m0Var.c | (((h1) m0Var.f) != h1Var);
        m0Var.c = z10;
        m0Var.f = h1Var;
        if (z10) {
            f0 f0Var = this.G.b;
            f0Var.j.c(new x1(9, f0Var, m0Var));
            this.W = new m0(this.V);
        }
    }

    public final void G(int i10) {
        o1 o1Var = this.a[i10];
        try {
            u0 u0Var = this.H.i;
            u0Var.getClass();
            f d = o1Var.d(u0Var);
            d.getClass();
            u2.b1 b1Var = d.r;
            b1Var.getClass();
            b1Var.a();
        } catch (IOException | RuntimeException e) {
            int i11 = o1Var.a.b;
            if (i11 != 3 && i11 != 5) {
                throw e;
            }
            x2.v vVar = this.H.i.o;
            e2.a.f("ExoPlayerImplInternal", "Disabling track due to error: " + b2.s.c(vVar.c[i10].m()), e);
            x2.v vVar2 = new x2.v((n1[]) vVar.b.clone(), (x2.r[]) vVar.c.clone(), vVar.d, vVar.e);
            vVar2.b[i10] = null;
            vVar2.c[i10] = null;
            i(i10);
            u0 u0Var2 = this.H.i;
            u0Var2.a(vVar2, this.V.s, false, new boolean[u0Var2.j.length]);
        }
    }

    public final void H(int i10, boolean z10) {
        boolean[] zArr = this.c;
        if (zArr[i10] != z10) {
            zArr[i10] = z10;
            this.N.c(new g0(this, i10, z10, 0));
        }
    }

    public final void I() {
        w(this.I.b(), true);
    }

    public final void J(l0 l0Var) {
        b2.k1 b10;
        this.W.f(1);
        int i10 = l0Var.a;
        int i11 = l0Var.b;
        int i12 = l0Var.c;
        u2.g1 g1Var = l0Var.d;
        g1 g1Var2 = this.I;
        ArrayList arrayList = g1Var2.b;
        e2.d.b(i10 >= 0 && i10 <= i11 && i11 <= arrayList.size() && i12 >= 0);
        g1Var2.j = g1Var;
        if (i10 == i11 || i10 == i12) {
            b10 = g1Var2.b();
        } else {
            int min = Math.min(i10, i12);
            int max = Math.max(((i11 - i10) + i12) - 1, i11 - 1);
            int i13 = ((f1) arrayList.get(min)).d;
            e2.d0.P(i10, i11, i12, arrayList);
            while (min <= max) {
                f1 f1Var = (f1) arrayList.get(min);
                f1Var.d = i13;
                i13 += f1Var.a.o.e.o();
                min++;
            }
            b10 = g1Var2.b();
        }
        w(b10, false);
    }

    public final void K() {
        this.W.f(1);
        P(false, false, false, true);
        k kVar = this.f;
        HashMap hashMap = kVar.h;
        long id2 = Thread.currentThread().getId();
        long j3 = kVar.i;
        e2.d.f("Players that share the same LoadControl must share the same playback thread. See ExoPlayer.Builder.setPlaybackLooper(Looper).", j3 == -1 || j3 == id2);
        kVar.i = id2;
        j2.k kVar2 = this.L;
        if (!hashMap.containsKey(kVar2)) {
            hashMap.put(kVar2, new j());
        }
        j jVar = (j) hashMap.get(kVar2);
        jVar.getClass();
        int i10 = kVar.f;
        if (i10 == -1) {
            i10 = 13107200;
        }
        jVar.b = i10;
        jVar.a = false;
        n0(this.V.a.p() ? 4 : 2);
        h1 h1Var = this.V;
        boolean z10 = h1Var.l;
        z0(this.P.d(h1Var.e, z10), h1Var.n, h1Var.m, z10);
        y2.f fVar = (y2.f) this.h;
        fVar.getClass();
        g1 g1Var = this.I;
        ArrayList arrayList = g1Var.b;
        e2.d.g(!g1Var.k);
        g1Var.l = fVar;
        for (int i11 = 0; i11 < arrayList.size(); i11++) {
            f1 f1Var = (f1) arrayList.get(i11);
            g1Var.e(f1Var);
            g1Var.g.add(f1Var);
        }
        g1Var.k = true;
        this.n.e(2);
    }

    public final void L(e2.g gVar) {
        j6.l lVar = this.r;
        e2.z zVar = this.n;
        try {
            P(true, false, true, false);
            M();
            k kVar = this.f;
            if (kVar.h.remove(this.L) != null) {
                kVar.d();
            }
            if (kVar.h.isEmpty()) {
                kVar.i = -1L;
            }
            e eVar = this.P;
            eVar.c = null;
            eVar.a();
            eVar.c(0);
            this.d.a();
            n0(1);
        } finally {
            zVar.a.removeCallbacksAndMessages(null);
            lVar.i();
            gVar.e();
        }
    }

    public final void M() {
        for (int i10 = 0; i10 < this.a.length; i10++) {
            f fVar = this.b[i10];
            synchronized (fVar.a) {
                fVar.H = null;
            }
            o1 o1Var = this.a[i10];
            f fVar2 = o1Var.a;
            e2.d.g(fVar2.n == 0);
            fVar2.r();
            o1Var.e = false;
            f fVar3 = o1Var.c;
            if (fVar3 != null) {
                e2.d.g(fVar3.n == 0);
                fVar3.r();
                o1Var.f = false;
            }
        }
    }

    public final void N(int i10, int i11, u2.g1 g1Var) {
        this.W.f(1);
        g1 g1Var2 = this.I;
        g1Var2.getClass();
        e2.d.b(i10 >= 0 && i10 <= i11 && i11 <= g1Var2.b.size());
        g1Var2.j = g1Var;
        g1Var2.g(i10, i11);
        w(g1Var2.b(), false);
    }

    /* JADX WARN: Removed duplicated region for block: B:62:0x016d  */
    /* JADX WARN: Removed duplicated region for block: B:65:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void O() {
        int i10;
        float f7 = this.y.h().a;
        w0 w0Var = this.H;
        u0 u0Var = w0Var.i;
        u0 u0Var2 = w0Var.j;
        x2.v vVar = null;
        u0 u0Var3 = u0Var;
        boolean z10 = true;
        while (u0Var3 != null && u0Var3.e) {
            h1 h1Var = this.V;
            x2.v j3 = u0Var3.j(f7, h1Var.a, h1Var.l);
            x2.v vVar2 = u0Var3 == this.H.i ? j3 : vVar;
            x2.v vVar3 = u0Var3.o;
            x2.r[] rVarArr = j3.c;
            if (vVar3 != null && vVar3.c.length == rVarArr.length) {
                for (int i11 = 0; i11 < rVarArr.length; i11++) {
                    if (j3.a(vVar3, i11)) {
                    }
                }
                if (u0Var3 == u0Var2) {
                    z10 = false;
                }
                u0Var3 = u0Var3.m;
                vVar = vVar2;
            }
            if (z10) {
                w0 w0Var2 = this.H;
                u0 u0Var4 = w0Var2.i;
                boolean z11 = (w0Var2.n(u0Var4) & 1) != 0;
                boolean[] zArr = new boolean[this.a.length];
                vVar2.getClass();
                long a2 = u0Var4.a(vVar2, this.V.s, z11, zArr);
                h1 h1Var2 = this.V;
                boolean z12 = (h1Var2.e == 4 || a2 == h1Var2.s) ? false : true;
                h1 h1Var3 = this.V;
                this.V = z(h1Var3.b, a2, h1Var3.c, h1Var3.d, z12, 5);
                if (z12) {
                    R(a2);
                }
                h();
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
                    u2.b1 b1Var = u0Var4.c[i12];
                    a3.q qVar = this.y;
                    long j10 = this.k0;
                    boolean z13 = zArr[i12];
                    f fVar = o1Var.a;
                    if (o1.h(fVar)) {
                        if (b1Var != fVar.r) {
                            o1Var.a(fVar, qVar);
                        } else if (z13) {
                            fVar.y = false;
                            fVar.w = j10;
                            fVar.x = j10;
                            fVar.q(j10, false);
                        }
                    }
                    f fVar2 = o1Var.c;
                    if (fVar2 != null && o1.h(fVar2)) {
                        if (b1Var != fVar2.r) {
                            o1Var.a(fVar2, qVar);
                        } else if (z13) {
                            fVar2.y = false;
                            fVar2.w = j10;
                            fVar2.x = j10;
                            fVar2.q(j10, false);
                        }
                    }
                    if (c10 - this.a[i12].c() > 0) {
                        H(i12, false);
                    }
                    this.i0 -= c10 - this.a[i12].c();
                    i12++;
                }
                l(this.k0, zArr2);
                u0Var4.h = true;
            } else {
                this.H.n(u0Var3);
                if (u0Var3.e) {
                    long max = Math.max(u0Var3.g.b, this.k0 - u0Var3.p);
                    if (this.O && e() && this.H.k == u0Var3) {
                        h();
                    }
                    i10 = 4;
                    u0Var3.a(j3, max, false, new boolean[u0Var3.j.length]);
                    v(true);
                    if (this.V.e == i10) {
                        D();
                        A0();
                        this.n.e(2);
                        return;
                    }
                    return;
                }
            }
            i10 = 4;
            v(true);
            if (this.V.e == i10) {
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x012e  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0135  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x013f  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0149  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0177  */
    /* JADX WARN: Removed duplicated region for block: B:88:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0150  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0144  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x013a  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0130  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x00c1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void P(boolean z10, boolean z11, boolean z12, boolean z13) {
        long j3;
        long j10;
        long j11;
        boolean z14;
        b2.k1 k1Var;
        b2.k1 k1Var2;
        u2.f0 f0Var;
        List list;
        this.n.d(2);
        this.T = false;
        this.U = null;
        this.o0 = null;
        C0(false, true);
        a3.q qVar = this.y;
        qVar.b = false;
        r1 r1Var = (r1) qVar.c;
        if (r1Var.c) {
            r1Var.c(r1Var.a());
            r1Var.c = false;
        }
        this.k0 = 1000000000000L;
        for (int i10 = 0; i10 < this.a.length; i10++) {
            try {
                i(i10);
            } catch (n e) {
                e = e;
                e2.a.f("ExoPlayerImplInternal", "Disable failed.", e);
                if (z10) {
                }
                this.i0 = 0;
                h1 h1Var = this.V;
                u2.f0 f0Var2 = h1Var.b;
                long j12 = h1Var.s;
                if (!this.V.b.b()) {
                }
                j3 = this.V.c;
                if (z11) {
                }
                this.H.b();
                this.c0 = false;
                k1Var = this.V.a;
                if (z12) {
                }
                k1Var2 = k1Var;
                f0Var = f0Var2;
                h1 h1Var2 = this.V;
                int i11 = h1Var2.e;
                if (z13) {
                }
                u2.p1 p1Var = z14 ? u2.p1.d : h1Var2.h;
                x2.v vVar = z14 ? this.e : h1Var2.i;
                if (z14) {
                }
                this.V = new h1(k1Var2, f0Var, j11, j10, i11, r14, false, p1Var, vVar, list, f0Var, h1Var2.l, h1Var2.m, h1Var2.n, h1Var2.o, j10, 0L, j10, 0L, false);
                if (z12) {
                }
            } catch (RuntimeException e7) {
                e = e7;
                e2.a.f("ExoPlayerImplInternal", "Disable failed.", e);
                if (z10) {
                }
                this.i0 = 0;
                h1 h1Var3 = this.V;
                u2.f0 f0Var22 = h1Var3.b;
                long j122 = h1Var3.s;
                if (!this.V.b.b()) {
                }
                j3 = this.V.c;
                if (z11) {
                }
                this.H.b();
                this.c0 = false;
                k1Var = this.V.a;
                if (z12) {
                }
                k1Var2 = k1Var;
                f0Var = f0Var22;
                h1 h1Var22 = this.V;
                int i112 = h1Var22.e;
                if (z13) {
                }
                u2.p1 p1Var2 = z14 ? u2.p1.d : h1Var22.h;
                x2.v vVar2 = z14 ? this.e : h1Var22.i;
                if (z14) {
                }
                this.V = new h1(k1Var2, f0Var, j11, j10, i112, r14, false, p1Var2, vVar2, list, f0Var, h1Var22.l, h1Var22.m, h1Var22.n, h1Var22.o, j10, 0L, j10, 0L, false);
                if (z12) {
                }
            }
        }
        this.r0 = -9223372036854775807L;
        if (z10) {
            for (o1 o1Var : this.a) {
                try {
                    o1Var.k();
                } catch (RuntimeException e10) {
                    e2.a.f("ExoPlayerImplInternal", "Reset failed.", e10);
                }
            }
        }
        this.i0 = 0;
        h1 h1Var32 = this.V;
        u2.f0 f0Var222 = h1Var32.b;
        long j1222 = h1Var32.s;
        if (!this.V.b.b()) {
            h1 h1Var4 = this.V;
            b2.h1 h1Var5 = this.w;
            u2.f0 f0Var3 = h1Var4.b;
            b2.k1 k1Var3 = h1Var4.a;
            if (!k1Var3.p() && !k1Var3.g(f0Var3.a, h1Var5).f) {
                j3 = this.V.s;
                if (z11) {
                    j10 = j1222;
                    j11 = j3;
                    z14 = false;
                } else {
                    this.j0 = null;
                    Pair p5 = p(this.V.a);
                    f0Var222 = (u2.f0) p5.first;
                    j10 = ((Long) p5.second).longValue();
                    z14 = f0Var222.equals(this.V.b) ? false : true;
                    j11 = -9223372036854775807L;
                }
                this.H.b();
                this.c0 = false;
                k1Var = this.V.a;
                if (z12 || !(k1Var instanceof m1)) {
                    k1Var2 = k1Var;
                } else {
                    m1 m1Var = (m1) k1Var;
                    u2.g1 g1Var = this.I.j;
                    b2.k1[] k1VarArr = m1Var.l;
                    b2.k1[] k1VarArr2 = new b2.k1[k1VarArr.length];
                    for (int i12 = 0; i12 < k1VarArr.length; i12++) {
                        k1VarArr2[i12] = new l1(k1VarArr[i12]);
                    }
                    k1Var2 = new m1(k1VarArr2, m1Var.m, g1Var);
                    if (f0Var222.b != -1) {
                        k1Var2.g(f0Var222.a, this.w);
                        int i13 = this.w.c;
                        b2.j1 j1Var = this.v;
                        k1Var2.m(i13, j1Var, 0L);
                        if (j1Var.a()) {
                            f0Var = new u2.f0(f0Var222.a, f0Var222.d);
                            h1 h1Var222 = this.V;
                            int i1122 = h1Var222.e;
                            n nVar = z13 ? null : h1Var222.f;
                            u2.p1 p1Var22 = z14 ? u2.p1.d : h1Var222.h;
                            x2.v vVar22 = z14 ? this.e : h1Var222.i;
                            if (z14) {
                                e9.g0 g0Var = e9.i0.b;
                                list = e9.a1.e;
                            } else {
                                list = h1Var222.j;
                            }
                            this.V = new h1(k1Var2, f0Var, j11, j10, i1122, nVar, false, p1Var22, vVar22, list, f0Var, h1Var222.l, h1Var222.m, h1Var222.n, h1Var222.o, j10, 0L, j10, 0L, false);
                            if (z12) {
                                w0 w0Var = this.H;
                                if (!w0Var.q.isEmpty()) {
                                    ArrayList arrayList = new ArrayList();
                                    for (int i14 = 0; i14 < w0Var.q.size(); i14++) {
                                        ((u0) w0Var.q.get(i14)).i();
                                    }
                                    w0Var.q = arrayList;
                                    w0Var.m = null;
                                    w0Var.k();
                                }
                                g1 g1Var2 = this.I;
                                HashMap hashMap = g1Var2.f;
                                for (e1 e1Var : hashMap.values()) {
                                    try {
                                        e1Var.a.p(e1Var.b);
                                    } catch (RuntimeException e11) {
                                        e2.a.f("MediaSourceList", "Failed to release child source.", e11);
                                    }
                                    u2.a aVar = e1Var.a;
                                    d1 d1Var = e1Var.c;
                                    aVar.s(d1Var);
                                    e1Var.a.r(d1Var);
                                }
                                hashMap.clear();
                                g1Var2.g.clear();
                                g1Var2.k = false;
                                return;
                            }
                            return;
                        }
                    }
                }
                f0Var = f0Var222;
                h1 h1Var2222 = this.V;
                int i11222 = h1Var2222.e;
                if (z13) {
                }
                u2.p1 p1Var222 = z14 ? u2.p1.d : h1Var2222.h;
                x2.v vVar222 = z14 ? this.e : h1Var2222.i;
                if (z14) {
                }
                this.V = new h1(k1Var2, f0Var, j11, j10, i11222, nVar, false, p1Var222, vVar222, list, f0Var, h1Var2222.l, h1Var2222.m, h1Var2222.n, h1Var2222.o, j10, 0L, j10, 0L, false);
                if (z12) {
                }
            }
        }
        j3 = this.V.c;
        if (z11) {
        }
        this.H.b();
        this.c0 = false;
        k1Var = this.V.a;
        if (z12) {
        }
        k1Var2 = k1Var;
        f0Var = f0Var222;
        h1 h1Var22222 = this.V;
        int i112222 = h1Var22222.e;
        if (z13) {
        }
        u2.p1 p1Var2222 = z14 ? u2.p1.d : h1Var22222.h;
        x2.v vVar2222 = z14 ? this.e : h1Var22222.i;
        if (z14) {
        }
        this.V = new h1(k1Var2, f0Var, j11, j10, i112222, nVar, false, p1Var2222, vVar2222, list, f0Var, h1Var22222.l, h1Var22222.m, h1Var22222.n, h1Var22222.o, j10, 0L, j10, 0L, false);
        if (z12) {
        }
    }

    public final void Q() {
        u0 u0Var = this.H.i;
        this.Z = u0Var != null && u0Var.g.i && this.Y;
    }

    public final void R(long j3) {
        u0 u0Var = this.H.i;
        long j10 = j3 + (u0Var == null ? 1000000000000L : u0Var.p);
        this.k0 = j10;
        ((r1) this.y.c).c(j10);
        for (o1 o1Var : this.a) {
            long j11 = this.k0;
            f d = o1Var.d(u0Var);
            if (d != null) {
                d.y = false;
                d.w = j11;
                d.x = j11;
                d.q(j11, false);
            }
        }
        for (u0 u0Var2 = r0.i; u0Var2 != null; u0Var2 = u0Var2.m) {
            for (x2.r rVar : u0Var2.o.c) {
                if (rVar != null) {
                    rVar.r();
                }
            }
        }
    }

    public final void S(b2.k1 k1Var, b2.k1 k1Var2) {
        if (k1Var.p() && k1Var2.p()) {
            return;
        }
        ArrayList arrayList = this.E;
        int size = arrayList.size() - 1;
        if (size < 0) {
            Collections.sort(arrayList);
        } else {
            a4.a.z(arrayList.get(size));
            throw null;
        }
    }

    public final void V(long j3) {
        boolean z10 = this.S;
        long j10 = u0;
        if (z10) {
            this.R.getClass();
            r2 = this.V.e != 3 ? j10 : 1000L;
            for (o1 o1Var : this.a) {
                long j11 = this.k0;
                long j12 = this.l0;
                f fVar = o1Var.c;
                f fVar2 = o1Var.a;
                long g10 = o1.h(fVar2) ? fVar2.g(j11, j12) : Long.MAX_VALUE;
                if (fVar != null && fVar.n != 0) {
                    g10 = Math.min(g10, fVar.g(j11, j12));
                }
                r2 = Math.min(r2, e2.d0.e0(g10));
            }
            if (this.V.m()) {
                u0 u0Var = this.H.i;
                if ((u0Var != null ? u0Var.m : null) != null) {
                    if ((e2.d0.Q(r2) * this.V.o.a) + this.k0 >= r1.e()) {
                        r2 = Math.min(r2, j10);
                    }
                }
            }
        } else if (this.V.e != 3 || r0()) {
            r2 = j10;
        }
        this.n.a.sendEmptyMessageAtTime(2, j3 + r2);
    }

    public final void W(boolean z10) {
        u2.f0 f0Var = this.H.i.g.a;
        long Y = Y(f0Var, this.V.s, true, false);
        if (Y != this.V.s) {
            h1 h1Var = this.V;
            this.V = z(f0Var, Y, h1Var.c, h1Var.d, z10, 5);
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(5:25|(20:(8:27|(1:92)(3:33|(1:37)|38)|39|(1:48)|46|47|17|18)(1:93)|53|54|(1:56)(1:85)|57|58|(1:60)(1:83)|61|62|63|64|65|66|67|68|69|70|16|17|18)|49|50|(1:52)(1:89)) */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x0173, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Removed duplicated region for block: B:14:0x00a7 A[Catch: all -> 0x00aa, TRY_ENTER, TryCatch #4 {all -> 0x00aa, blocks: (B:14:0x00a7, B:21:0x00b4, B:23:0x00ba, B:24:0x00bd, B:27:0x00d0, B:29:0x00d6, B:33:0x00de, B:37:0x00ec, B:38:0x00f1, B:39:0x00f9, B:41:0x010a, B:46:0x0118), top: B:12:0x00a5 }] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00b1  */
    /* JADX WARN: Type inference failed for: r0v30, types: [java.lang.Object, u2.d0] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void X(o0 o0Var, boolean z10) {
        long longValue;
        long j3;
        u2.f0 p5;
        long j10;
        boolean z11;
        boolean z12;
        u2.f0 f0Var;
        long j11;
        long j12;
        long j13;
        boolean z13;
        long j14;
        boolean z14;
        long Y;
        h1 h1Var;
        u2.f0 f0Var2;
        b2.k1 k1Var;
        long j15;
        u2.f0 f0Var3;
        long j16;
        long j17;
        h1 h1Var2;
        int i10;
        int i11;
        long j18;
        p0 p0Var = this;
        p0Var.W.f(z10 ? 1 : 0);
        if (p0Var.T) {
            p0Var.U = o0Var;
            return;
        }
        Pair T = T(p0Var.V.a, o0Var, true, p0Var.d0, p0Var.e0, p0Var.v, p0Var.w);
        try {
            try {
                if (T == null) {
                    Pair p10 = p0Var.p(p0Var.V.a);
                    p5 = (u2.f0) p10.first;
                    longValue = ((Long) p10.second).longValue();
                    z11 = !p0Var.V.a.p();
                    j3 = -9223372036854775807L;
                } else {
                    Object obj = T.first;
                    longValue = ((Long) T.second).longValue();
                    j3 = o0Var.c == -9223372036854775807L ? -9223372036854775807L : longValue;
                    p5 = p0Var.H.p(p0Var.V.a, obj, longValue);
                    if (!p5.b()) {
                        j10 = 0;
                        z11 = o0Var.c == -9223372036854775807L;
                        if (!p0Var.V.a.p()) {
                            p0Var.j0 = o0Var;
                        } else if (T == null) {
                            if (p0Var.V.e != 1) {
                                p0Var.n0(4);
                            }
                            p0Var.P(false, true, false, true);
                        } else {
                            try {
                                try {
                                    try {
                                        try {
                                            if (p5.equals(p0Var.V.b)) {
                                                u0 u0Var = p0Var.H.i;
                                                if (u0Var == null || !u0Var.e || longValue == j10) {
                                                    j13 = longValue;
                                                } else {
                                                    ?? r02 = u0Var.a;
                                                    long j19 = p0Var.v.m;
                                                    if (p0Var.S && j19 != -9223372036854775807L) {
                                                        p0Var.R.getClass();
                                                    }
                                                    j13 = r02.t(longValue, p0Var.Q);
                                                }
                                                if (e2.d0.e0(j13) != e2.d0.e0(p0Var.V.s) || ((i10 = (h1Var2 = p0Var.V).e) != 2 && i10 != 3)) {
                                                    z12 = z11;
                                                    f0Var = p5;
                                                }
                                                j17 = h1Var2.s;
                                                i11 = 2;
                                                j18 = j17;
                                                z12 = z11;
                                                f0Var3 = p5;
                                                j16 = j3;
                                                p0Var.V = p0Var.z(f0Var3, j17, j16, j18, z12, i11);
                                                return;
                                            }
                                            z12 = z11;
                                            f0Var = p5;
                                            j13 = longValue;
                                            p0Var.B0(k1Var, f0Var2, k1Var, h1Var.b, j15, true);
                                            f0Var3 = f0Var2;
                                            j16 = j15;
                                            j17 = Y;
                                            i11 = 2;
                                            j18 = j17;
                                            p0Var = this;
                                            p0Var.V = p0Var.z(f0Var3, j17, j16, j18, z12, i11);
                                            return;
                                        } catch (Throwable th2) {
                                            th = th2;
                                            f0Var = f0Var2;
                                            j11 = j15;
                                            j12 = Y;
                                            p0Var.V = p0Var.z(f0Var, j12, j11, j12, z12, 2);
                                            throw th;
                                        }
                                        k1Var = h1Var.a;
                                        j15 = j3;
                                    } catch (Throwable th3) {
                                        th = th3;
                                        f0Var = f0Var2;
                                        j11 = j3;
                                        j12 = Y;
                                        p0Var.V = p0Var.z(f0Var, j12, j11, j12, z12, 2);
                                        throw th;
                                    }
                                    h1Var = p0Var.V;
                                    f0Var2 = f0Var;
                                } catch (Throwable th4) {
                                    th = th4;
                                }
                                w0 w0Var = p0Var.H;
                                if (w0Var.i != w0Var.j) {
                                    j14 = j13;
                                    z14 = true;
                                } else {
                                    j14 = j13;
                                    z14 = false;
                                }
                                Y = p0Var.Y(f0Var, j14, z14, z13);
                                z12 |= longValue != Y;
                            } catch (Throwable th5) {
                                th = th5;
                                j11 = j3;
                                j12 = longValue;
                                p0Var.V = p0Var.z(f0Var, j12, j11, j12, z12, 2);
                                throw th;
                            }
                            p0Var.T = p0Var.S;
                            z13 = p0Var.V.e == 4;
                        }
                        z12 = z11;
                        f0Var3 = p5;
                        j17 = longValue;
                        j16 = j3;
                        i11 = 2;
                        j18 = j17;
                        p0Var = this;
                        p0Var.V = p0Var.z(f0Var3, j17, j16, j18, z12, i11);
                        return;
                    }
                    p0Var.V.a.g(p5.a, p0Var.w);
                    if (p0Var.w.e(p5.b) == p5.c) {
                        p0Var.w.g.getClass();
                    }
                    z11 = true;
                    longValue = 0;
                }
                if (!p0Var.V.a.p()) {
                }
                z12 = z11;
                f0Var3 = p5;
                j17 = longValue;
                j16 = j3;
                i11 = 2;
                j18 = j17;
                p0Var = this;
                p0Var.V = p0Var.z(f0Var3, j17, j16, j18, z12, i11);
                return;
            } catch (Throwable th6) {
                th = th6;
                z12 = z11;
                f0Var = p5;
                j12 = longValue;
                j11 = j3;
            }
        } catch (Throwable th7) {
            th = th7;
            z12 = z11;
            f0Var = p5;
        }
        j10 = 0;
    }

    /* JADX WARN: Type inference failed for: r10v8, types: [java.lang.Object, u2.d0] */
    public final long Y(u2.f0 f0Var, long j3, boolean z10, boolean z11) {
        o1[] o1VarArr;
        v0();
        C0(false, true);
        if (z11 || this.V.e == 3) {
            n0(2);
        }
        w0 w0Var = this.H;
        u0 u0Var = w0Var.i;
        u0 u0Var2 = u0Var;
        while (u0Var2 != null && !f0Var.equals(u0Var2.g.a)) {
            u0Var2 = u0Var2.m;
        }
        if (z10 || u0Var != u0Var2 || (u0Var2 != null && u0Var2.p + j3 < 0)) {
            int i10 = 0;
            while (true) {
                o1VarArr = this.a;
                if (i10 >= o1VarArr.length) {
                    break;
                }
                i(i10);
                i10++;
            }
            this.r0 = -9223372036854775807L;
            if (u0Var2 != null) {
                while (w0Var.i != u0Var2) {
                    w0Var.a();
                }
                w0Var.n(u0Var2);
                u0Var2.p = 1000000000000L;
                l(w0Var.j.e(), new boolean[o1VarArr.length]);
                u0Var2.h = true;
            }
        }
        h();
        if (u0Var2 != null) {
            ?? r10 = u0Var2.a;
            w0Var.n(u0Var2);
            if (!u0Var2.e) {
                u0Var2.g = u0Var2.g.b(j3);
            } else if (u0Var2.f) {
                j3 = r10.h(j3);
                r10.i(j3 - this.x);
            }
            R(j3);
            D();
        } else {
            w0Var.b();
            R(j3);
        }
        v(false);
        this.n.e(2);
        return j3;
    }

    public final void Z(k1 k1Var) {
        k1Var.getClass();
        Looper looper = k1Var.e;
        Looper looper2 = this.s;
        e2.z zVar = this.n;
        if (looper != looper2) {
            zVar.a(15, k1Var).b();
            return;
        }
        g(k1Var);
        int i10 = this.V.e;
        if (i10 == 3 || i10 == 2) {
            zVar.e(2);
        }
    }

    @Override // a3.y
    public final void a(long j3, long j10, b2.s sVar, MediaFormat mediaFormat) {
        if (this.T) {
            e2.z zVar = this.n;
            zVar.getClass();
            e2.y b10 = e2.z.b();
            b10.a = zVar.a.obtainMessage(37);
            b10.b();
        }
    }

    public final void a0(k1 k1Var) {
        Looper looper = k1Var.e;
        if (looper.getThread().isAlive()) {
            this.F.a(looper, null).c(new h0(this, k1Var));
        } else {
            e2.a.n("TAG", "Trying to send message on a dead thread.");
            k1Var.a(false);
        }
    }

    @Override // u2.c0
    public final void b(u2.d0 d0Var) {
        this.n.a(8, d0Var).b();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x003b, code lost:
    
        if (r7.a == 1) goto L20;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void b0(b2.e eVar, boolean z10) {
        int i10;
        x2.p pVar = (x2.p) this.d;
        if (!pVar.j.equals(eVar)) {
            pVar.j = eVar;
            pVar.f();
        }
        if (!z10) {
            eVar = null;
        }
        e eVar2 = this.P;
        if (!Objects.equals(eVar2.d, eVar)) {
            eVar2.d = eVar;
            if (eVar != null) {
                int i11 = eVar.c;
                i10 = 3;
                switch (i11) {
                    case 0:
                        e2.a.n("AudioFocusManager", "Specify a proper usage in the audio attributes for audio focus handling. Using AUDIOFOCUS_GAIN by default.");
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
                        e2.m(i11, "Unidentified audio usage: ", "AudioFocusManager");
                        break;
                    case 16:
                        i10 = 4;
                        break;
                }
                eVar2.f = i10;
                e2.d.a("Automatic handling of audio focus is only available for USAGE_MEDIA and USAGE_GAME.", i10 != 1 || i10 == 0);
            }
            i10 = 0;
            eVar2.f = i10;
            e2.d.a("Automatic handling of audio focus is only available for USAGE_MEDIA and USAGE_GAME.", i10 != 1 || i10 == 0);
        }
        h1 h1Var = this.V;
        boolean z11 = h1Var.l;
        z0(eVar2.d(h1Var.e, z11), h1Var.n, h1Var.m, z11);
    }

    public final void c(k0 k0Var, int i10) {
        this.W.f(1);
        g1 g1Var = this.I;
        if (i10 == -1) {
            i10 = g1Var.b.size();
        }
        w(g1Var.a(i10, k0Var.a, k0Var.b), false);
    }

    public final void c0(boolean z10, e2.g gVar) {
        if (this.f0 != z10) {
            this.f0 = z10;
            if (!z10) {
                for (o1 o1Var : this.a) {
                    o1Var.k();
                }
            }
        }
        if (gVar != null) {
            gVar.e();
        }
    }

    public final void d() {
        for (o1 o1Var : this.a) {
            p1 p1Var = this.S ? this.R : null;
            o1Var.a.c(18, p1Var);
            f fVar = o1Var.c;
            if (fVar != null) {
                fVar.c(18, p1Var);
            }
        }
    }

    public final void d0(k0 k0Var) {
        this.W.f(1);
        int i10 = k0Var.c;
        u2.g1 g1Var = k0Var.b;
        ArrayList arrayList = k0Var.a;
        if (i10 != -1) {
            this.j0 = new o0(new m1(arrayList, g1Var), k0Var.c, k0Var.d);
        }
        g1 g1Var2 = this.I;
        ArrayList arrayList2 = g1Var2.b;
        g1Var2.g(0, arrayList2.size());
        w(g1Var2.a(arrayList2.size(), arrayList, g1Var), false);
    }

    public final boolean e() {
        if (!this.O) {
            return false;
        }
        for (o1 o1Var : this.a) {
            if (o1Var.f()) {
                return true;
            }
        }
        return false;
    }

    public final void e0(boolean z10) {
        this.Y = z10;
        Q();
        if (this.Z) {
            w0 w0Var = this.H;
            if (w0Var.j != w0Var.i) {
                W(true);
                v(false);
            }
        }
    }

    public final void f() {
        O();
        W(true);
    }

    public final void f0(b2.v0 v0Var) {
        this.n.d(16);
        a3.q qVar = this.y;
        qVar.f(v0Var);
        b2.v0 h = qVar.h();
        y(h, h.a, true, true);
    }

    public final void g0(q qVar) {
        this.q0 = qVar;
        b2.k1 k1Var = this.V.a;
        w0 w0Var = this.H;
        w0Var.getClass();
        qVar.getClass();
        if (w0Var.q.isEmpty()) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < w0Var.q.size(); i10++) {
            ((u0) w0Var.q.get(i10)).i();
        }
        w0Var.q = arrayList;
        w0Var.m = null;
        w0Var.k();
    }

    public final void h() {
        f fVar;
        if (this.O && e()) {
            for (o1 o1Var : this.a) {
                int c10 = o1Var.c();
                if (o1Var.f()) {
                    int i10 = o1Var.d;
                    boolean z10 = i10 == 4 || i10 == 2;
                    int i11 = i10 != 4 ? 0 : 1;
                    if (z10) {
                        fVar = o1Var.a;
                    } else {
                        fVar = o1Var.c;
                        fVar.getClass();
                    }
                    o1Var.a(fVar, this.y);
                    o1Var.i(z10);
                    o1Var.d = i11;
                }
                this.i0 -= c10 - o1Var.c();
            }
            this.r0 = -9223372036854775807L;
        }
    }

    public final void h0(int i10) {
        this.d0 = i10;
        b2.k1 k1Var = this.V.a;
        w0 w0Var = this.H;
        w0Var.g = i10;
        int r10 = w0Var.r(k1Var);
        if ((r10 & 1) != 0) {
            W(true);
        } else if ((r10 & 2) != 0) {
            h();
        }
        v(false);
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        int i10;
        u0 u0Var;
        u2.f0 f0Var;
        u0 u0Var2;
        int i11 = MediaDataController.MAX_STYLE_RUNS_COUNT;
        try {
            switch (message.what) {
                case 1:
                    boolean z10 = message.arg1 != 0;
                    int i12 = message.arg2;
                    this.W.f(1);
                    z0(this.P.d(this.V.e, z10), i12 >> 4, i12 & 15, z10);
                    break;
                case 2:
                    j();
                    break;
                case 3:
                    X((o0) message.obj, true);
                    break;
                case 4:
                    f0((b2.v0) message.obj);
                    break;
                case 5:
                    k0((q1) message.obj);
                    break;
                case 6:
                    u0(false, true);
                    break;
                case 7:
                    L((e2.g) message.obj);
                    return true;
                case 8:
                    x((u2.d0) message.obj);
                    break;
                case 9:
                    t((u2.d0) message.obj);
                    break;
                case 10:
                    O();
                    break;
                case 11:
                    h0(message.arg1);
                    break;
                case 12:
                    l0(message.arg1 != 0);
                    break;
                case 13:
                    c0(message.arg1 != 0, (e2.g) message.obj);
                    break;
                case 14:
                    Z((k1) message.obj);
                    break;
                case 15:
                    a0((k1) message.obj);
                    break;
                case 16:
                    b2.v0 v0Var = (b2.v0) message.obj;
                    y(v0Var, v0Var.a, true, false);
                    break;
                case 17:
                    d0((k0) message.obj);
                    break;
                case 18:
                    c((k0) message.obj, message.arg1);
                    break;
                case 19:
                    J((l0) message.obj);
                    break;
                case 20:
                    N(message.arg1, message.arg2, (u2.g1) message.obj);
                    break;
                case 21:
                    m0((u2.g1) message.obj);
                    break;
                case 22:
                    I();
                    break;
                case 23:
                    e0(message.arg1 != 0);
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
                    y0(message.arg1, message.arg2, (List) message.obj);
                    break;
                case 28:
                    g0((q) message.obj);
                    break;
                case 29:
                    K();
                    break;
                case MessageObject.TYPE_GIFT_STARS /* 30 */:
                    Pair pair = (Pair) message.obj;
                    p0(pair.first, (e2.g) pair.second);
                    break;
                case MessageObject.TYPE_GIFT_THEME_UPDATE /* 31 */:
                    b0((b2.e) message.obj, message.arg1 != 0);
                    break;
                case 32:
                    q0(((Float) message.obj).floatValue());
                    break;
                case 33:
                    r(message.arg1);
                    break;
                case 34:
                    s();
                    break;
                case 35:
                    o0((a3.y) message.obj);
                    break;
                case 36:
                    i0(((Boolean) message.obj).booleanValue());
                    break;
                case 37:
                    this.T = false;
                    o0 o0Var = this.U;
                    if (o0Var != null) {
                        X(o0Var, false);
                        this.U = null;
                        break;
                    }
                    break;
                case 38:
                    j0((p1) message.obj);
                    break;
            }
        } catch (b2.s0 e) {
            boolean z11 = e.a;
            int i13 = e.b;
            if (i13 == 1) {
                i11 = z11 ? 3001 : 3003;
            } else if (i13 == 4) {
                i11 = z11 ? 3002 : 3004;
            }
            u(e, i11);
        } catch (g2.j e7) {
            u(e7, e7.a);
        } catch (n e10) {
            e = e10;
            int i14 = e.s;
            w0 w0Var = this.H;
            if (i14 == 1 && (u0Var2 = w0Var.j) != null && e.E == null) {
                e = e.a(u0Var2.g.a);
            }
            int i15 = e.s;
            e2.z zVar = this.n;
            if (i15 == 1 && (f0Var = e.E) != null && B(e.w, f0Var)) {
                this.s0 = true;
                h();
                u0 g10 = w0Var.g();
                u0 u0Var3 = w0Var.i;
                if (u0Var3 != g10) {
                    while (u0Var3 != null) {
                        u0 u0Var4 = u0Var3.m;
                        if (u0Var4 == g10) {
                            break;
                        }
                        u0Var3 = u0Var4;
                    }
                }
                w0Var.n(u0Var3);
                if (this.V.e != 4) {
                    D();
                    zVar.e(2);
                }
            } else {
                n nVar = this.o0;
                if (nVar != null) {
                    nVar.addSuppressed(e);
                    e = this.o0;
                }
                if (e.s == 1 && w0Var.i != w0Var.j) {
                    while (true) {
                        u0Var = w0Var.i;
                        if (u0Var == w0Var.j) {
                            break;
                        }
                        w0Var.a();
                    }
                    e2.d.d(u0Var);
                    F();
                    v0 v0Var2 = u0Var.g;
                    u2.f0 f0Var2 = v0Var2.a;
                    long j3 = v0Var2.b;
                    this.V = z(f0Var2, j3, v0Var2.c, j3, true, 0);
                }
                if (e.F && (this.o0 == null || (i10 = e.a) == 5004 || i10 == 5003)) {
                    e2.a.o("ExoPlayerImplInternal", "Recoverable renderer error", e);
                    if (this.o0 == null) {
                        this.o0 = e;
                    }
                    e2.y a2 = zVar.a(25, e);
                    Handler handler = zVar.a;
                    Message message2 = a2.a;
                    message2.getClass();
                    handler.sendMessageAtFrontOfQueue(message2);
                    a2.a();
                } else {
                    e2.a.f("ExoPlayerImplInternal", "Playback error", e);
                    u0(true, false);
                    this.V = this.V.f(e);
                }
            }
        } catch (IOException e11) {
            u(e11, 2000);
        } catch (RuntimeException e12) {
            if ((e12 instanceof IllegalStateException) || (e12 instanceof IllegalArgumentException)) {
                i11 = 1004;
            }
            n nVar2 = new n(2, e12, i11);
            e2.a.f("ExoPlayerImplInternal", "Playback error", nVar2);
            u0(true, false);
            this.V = this.V.f(nVar2);
        } catch (n2.g e13) {
            u(e13, e13.a);
        } catch (u2.b e14) {
            u(e14, 1002);
        }
        F();
        return true;
    }

    public final void i(int i10) {
        o1[] o1VarArr = this.a;
        int c10 = o1VarArr[i10].c();
        o1 o1Var = o1VarArr[i10];
        f fVar = o1Var.a;
        a3.q qVar = this.y;
        o1Var.a(fVar, qVar);
        f fVar2 = o1Var.c;
        if (fVar2 != null) {
            boolean z10 = (fVar2.n == 0 || o1Var.d == 3) ? false : true;
            o1Var.a(fVar2, qVar);
            o1Var.i(false);
            if (z10) {
                f fVar3 = o1Var.a;
                fVar2.getClass();
                fVar2.c(17, fVar3);
            }
        }
        o1Var.d = 0;
        H(i10, false);
        this.i0 -= c10;
    }

    public final void i0(boolean z10) {
        if (!z10) {
            this.T = false;
            this.n.d(37);
            o0 o0Var = this.U;
            if (o0Var != null) {
                X(o0Var, false);
                this.U = null;
            }
        }
        this.S = z10;
        d();
    }

    /* JADX WARN: Code restructure failed: missing block: B:536:0x078c, code lost:
    
        if (r5 >= r2.b()) goto L458;
     */
    /* JADX WARN: Removed duplicated region for block: B:218:0x0428  */
    /* JADX WARN: Removed duplicated region for block: B:225:0x043b  */
    /* JADX WARN: Removed duplicated region for block: B:245:0x0488  */
    /* JADX WARN: Removed duplicated region for block: B:262:0x04ac  */
    /* JADX WARN: Removed duplicated region for block: B:266:0x04bf  */
    /* JADX WARN: Removed duplicated region for block: B:277:0x04dd  */
    /* JADX WARN: Removed duplicated region for block: B:280:0x04fc  */
    /* JADX WARN: Removed duplicated region for block: B:289:0x053a  */
    /* JADX WARN: Removed duplicated region for block: B:293:0x0542  */
    /* JADX WARN: Removed duplicated region for block: B:318:0x0580  */
    /* JADX WARN: Removed duplicated region for block: B:322:0x058b  */
    /* JADX WARN: Removed duplicated region for block: B:402:0x0681  */
    /* JADX WARN: Removed duplicated region for block: B:404:0x0684 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:430:0x081a  */
    /* JADX WARN: Removed duplicated region for block: B:453:0x0857  */
    /* JADX WARN: Removed duplicated region for block: B:456:0x0884  */
    /* JADX WARN: Removed duplicated region for block: B:461:0x0891  */
    /* JADX WARN: Removed duplicated region for block: B:466:0x089f  */
    /* JADX WARN: Removed duplicated region for block: B:469:0x08aa  */
    /* JADX WARN: Removed duplicated region for block: B:482:0x085a  */
    /* JADX WARN: Removed duplicated region for block: B:492:0x06eb  */
    /* JADX WARN: Removed duplicated region for block: B:553:0x07d9  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x022a  */
    /* JADX WARN: Type inference failed for: r2v3, types: [java.lang.Object, u2.d0] */
    /* JADX WARN: Type inference failed for: r2v57, types: [java.lang.Object, u2.d0] */
    /* JADX WARN: Type inference failed for: r2v95, types: [java.lang.Object, u2.d0] */
    /* JADX WARN: Type inference failed for: r3v27, types: [java.lang.Object, u2.d0] */
    /* JADX WARN: Type inference failed for: r3v83, types: [java.lang.Object, u2.d0] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void j() {
        int i10;
        boolean z10;
        boolean z11;
        long j3;
        boolean z12;
        h1 h1Var;
        boolean z13;
        boolean z14;
        boolean z15;
        h1 h1Var2;
        int i11;
        boolean z16;
        long j10;
        v0 c10;
        u0 u0Var;
        u0 u0Var2;
        u0 u0Var3;
        o1[] o1VarArr;
        w0 w0Var;
        boolean z17;
        u0 u0Var4;
        u0 u0Var5;
        u0 a2;
        boolean z18;
        int i12;
        o1[] o1VarArr2;
        int i13;
        boolean z19;
        boolean z20;
        int i14;
        int i15;
        u0 u0Var6;
        u0 u0Var7;
        int i16;
        this.F.getClass();
        long uptimeMillis = SystemClock.uptimeMillis();
        this.n.d(2);
        int i17 = 4;
        if (this.V.a.p() || !this.I.k) {
            i10 = 3;
        } else {
            this.H.m(this.k0);
            w0 w0Var2 = this.H;
            u0 u0Var8 = w0Var2.l;
            if (u0Var8 == null || (!u0Var8.g.j && u0Var8.g() && w0Var2.l.g.e != -9223372036854775807L && w0Var2.n < 100)) {
                w0 w0Var3 = this.H;
                long j11 = this.k0;
                h1 h1Var3 = this.V;
                u0 u0Var9 = w0Var3.l;
                if (u0Var9 == null) {
                    j10 = -9223372036854775807L;
                    c10 = w0Var3.d(h1Var3.a, h1Var3.b, h1Var3.c, h1Var3.s);
                } else {
                    j10 = -9223372036854775807L;
                    c10 = w0Var3.c(h1Var3.a, u0Var9, j11);
                }
                if (c10 != null) {
                    w0 w0Var4 = this.H;
                    u0 u0Var10 = w0Var4.l;
                    long j12 = u0Var10 == null ? 1000000000000L : (u0Var10.p + u0Var10.g.e) - c10.b;
                    int i18 = 0;
                    while (true) {
                        if (i18 >= w0Var4.q.size()) {
                            u0Var = null;
                            break;
                        }
                        v0 v0Var = ((u0) w0Var4.q.get(i18)).g;
                        long j13 = v0Var.e;
                        long j14 = c10.e;
                        if ((j13 == j10 || j13 == j14) && v0Var.b == c10.b && v0Var.a.equals(c10.a)) {
                            u0Var = (u0) w0Var4.q.remove(i18);
                            break;
                        }
                        i18++;
                    }
                    if (u0Var == null) {
                        p0 p0Var = (p0) w0Var4.e.b;
                        f[] fVarArr = p0Var.b;
                        x2.u uVar = p0Var.d;
                        y2.d dVar = p0Var.f.a;
                        g1 g1Var = p0Var.I;
                        x2.v vVar = p0Var.e;
                        p0Var.q0.getClass();
                        u0Var = new u0(fVarArr, j12, uVar, dVar, g1Var, c10, vVar);
                    } else {
                        u0Var.g = c10;
                        u0Var.p = j12;
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
                        long j15 = c10.b;
                        u0Var.d = true;
                        u0Var.a.k(this, j15);
                    } else if (u0Var.e) {
                        this.n.a(8, u0Var.a).b();
                    }
                    if (this.H.i == u0Var) {
                        R(c10.b);
                    }
                    v(false);
                }
            } else {
                j10 = -9223372036854775807L;
            }
            if (this.c0) {
                this.c0 = A(this.H.l);
                w0();
            } else {
                D();
            }
            w0 w0Var5 = this.H;
            if (!this.Z && this.O && !this.s0 && !e() && (u0Var6 = w0Var5.k) != null && u0Var6 == w0Var5.j && (u0Var7 = u0Var6.m) != null && u0Var7.e) {
                w0Var5.k = u0Var7;
                w0Var5.l();
                e2.d.h(w0Var5.k);
                o1[] o1VarArr3 = this.a;
                u0 u0Var12 = w0Var5.k;
                if (u0Var12 != null) {
                    x2.v vVar2 = u0Var12.o;
                    for (int i19 = 0; i19 < o1VarArr3.length; i19++) {
                        if (vVar2.b(i19)) {
                            o1 o1Var = o1VarArr3[i19];
                            if (o1Var.c != null && !o1Var.f()) {
                                o1 o1Var2 = o1VarArr3[i19];
                                e2.d.g(!o1Var2.f());
                                if (o1.h(o1Var2.a)) {
                                    i16 = 3;
                                } else {
                                    f fVar = o1Var2.c;
                                    i16 = (fVar == null || fVar.n == 0) ? 2 : 4;
                                }
                                o1Var2.d = i16;
                                k(u0Var12, i19, false, u0Var12.e());
                            }
                        }
                    }
                    if (e()) {
                        this.r0 = u0Var12.a.l();
                        if (!u0Var12.g()) {
                            w0Var5.n(u0Var12);
                            v(false);
                            D();
                            boolean z21 = this.O;
                            o1[] o1VarArr4 = this.a;
                            w0 w0Var6 = this.H;
                            u0Var2 = w0Var6.j;
                            if (u0Var2 != null) {
                                if (u0Var2.m == null || this.Z) {
                                    if (u0Var2.g.j || this.Z) {
                                        for (o1 o1Var3 : o1VarArr4) {
                                            if (o1Var3.d(u0Var2) != null) {
                                                f d = o1Var3.d(u0Var2);
                                                d.getClass();
                                                if (d.k()) {
                                                    long j16 = u0Var2.g.e;
                                                    long j17 = (j16 == -9223372036854775807L || j16 == Long.MIN_VALUE) ? -9223372036854775807L : j16 + u0Var2.p;
                                                    f d10 = o1Var3.d(u0Var2);
                                                    d10.getClass();
                                                    o1.l(d10, j17);
                                                }
                                            }
                                        }
                                    }
                                } else if (u0Var2.e) {
                                    int i20 = 0;
                                    while (true) {
                                        if (i20 < o1VarArr4.length) {
                                            o1 o1Var4 = o1VarArr4[i20];
                                            if (!o1Var4.e(u0Var2, o1Var4.a) || !o1Var4.e(u0Var2, o1Var4.c)) {
                                                break;
                                            } else {
                                                i20++;
                                            }
                                        } else if (!e() || w0Var6.k != w0Var6.j) {
                                            u0 u0Var13 = u0Var2.m;
                                            if (u0Var13.e || this.k0 >= u0Var13.e()) {
                                                x2.v vVar3 = u0Var2.o;
                                                u0 u0Var14 = w0Var6.k;
                                                u0 u0Var15 = w0Var6.j;
                                                if (u0Var14 == u0Var15) {
                                                    e2.d.h(u0Var15);
                                                    w0Var6.k = u0Var15.m;
                                                }
                                                u0 u0Var16 = w0Var6.j;
                                                e2.d.h(u0Var16);
                                                w0Var6.j = u0Var16.m;
                                                w0Var6.l();
                                                u0 u0Var17 = w0Var6.j;
                                                e2.d.h(u0Var17);
                                                x2.v vVar4 = u0Var17.o;
                                                b2.k1 k1Var = this.V.a;
                                                x2.v vVar5 = vVar3;
                                                u0 u0Var18 = u0Var17;
                                                int i21 = 3;
                                                B0(k1Var, u0Var17.g.a, k1Var, u0Var2.g.a, -9223372036854775807L, false);
                                                if (u0Var18.e && ((z21 && this.r0 != j10) || u0Var18.a.l() != j10)) {
                                                    this.r0 = j10;
                                                    boolean z22 = z21 && !this.s0;
                                                    if (z22) {
                                                        int i22 = 0;
                                                        while (true) {
                                                            if (i22 >= o1VarArr4.length) {
                                                                break;
                                                            }
                                                            boolean b10 = vVar4.b(i22);
                                                            x2.r[] rVarArr = vVar4.c;
                                                            if (b10 && o1VarArr4[i22].a.b != -2 && !b2.r0.a(rVarArr[i22].m().r, rVarArr[i22].m().k) && !o1VarArr4[i22].f()) {
                                                                z22 = false;
                                                                break;
                                                            }
                                                            i22++;
                                                        }
                                                    }
                                                    if (!z22) {
                                                        long e = u0Var18.e();
                                                        int length = o1VarArr4.length;
                                                        int i23 = 0;
                                                        while (i23 < length) {
                                                            o1 o1Var5 = o1VarArr4[i23];
                                                            f fVar2 = o1Var5.c;
                                                            f fVar3 = o1Var5.a;
                                                            if (o1.h(fVar3) && (i15 = o1Var5.d) != i17 && i15 != 2) {
                                                                o1.l(fVar3, e);
                                                            }
                                                            if (fVar2 != null) {
                                                                if ((fVar2.n != 0) && o1Var5.d != 3) {
                                                                    o1.l(fVar2, e);
                                                                }
                                                            }
                                                            i23++;
                                                            i17 = 4;
                                                        }
                                                        if (!u0Var18.g()) {
                                                            w0Var6.n(u0Var18);
                                                            v(false);
                                                            D();
                                                        }
                                                    }
                                                }
                                                int length2 = o1VarArr4.length;
                                                int i24 = 0;
                                                while (i24 < length2) {
                                                    o1 o1Var6 = o1VarArr4[i24];
                                                    long e7 = u0Var18.e();
                                                    f fVar4 = o1Var6.a;
                                                    int i25 = o1Var6.b;
                                                    x2.v vVar6 = vVar5;
                                                    boolean b11 = vVar6.b(i25);
                                                    boolean b12 = vVar4.b(i25);
                                                    f fVar5 = o1Var6.c;
                                                    u0 u0Var19 = u0Var18;
                                                    if (fVar5 == null || (i14 = o1Var6.d) == i21 || (i14 == 0 && o1.h(fVar4))) {
                                                        fVar5 = fVar4;
                                                    }
                                                    if (b11 && !fVar5.y) {
                                                        boolean z23 = fVar4.b == -2;
                                                        n1 n1Var = vVar6.b[i25];
                                                        n1 n1Var2 = vVar4.b[i25];
                                                        if (!b12 || !Objects.equals(n1Var2, n1Var) || z23 || o1Var6.f()) {
                                                            o1.l(fVar5, e7);
                                                        }
                                                    }
                                                    i24++;
                                                    vVar5 = vVar6;
                                                    u0Var18 = u0Var19;
                                                    i21 = 3;
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                            w0 w0Var7 = this.H;
                            u0Var3 = w0Var7.j;
                            if (u0Var3 != null && w0Var7.i != u0Var3 && !u0Var3.h) {
                                o1VarArr2 = this.a;
                                x2.v vVar7 = u0Var3.o;
                                z19 = true;
                                for (i13 = 0; i13 < o1VarArr2.length; i13++) {
                                    int c11 = o1VarArr2[i13].c();
                                    o1 o1Var7 = o1VarArr2[i13];
                                    a3.q qVar = this.y;
                                    int j18 = o1Var7.j(o1Var7.a, u0Var3, vVar7, qVar);
                                    int j19 = o1Var7.j(o1Var7.c, u0Var3, vVar7, qVar);
                                    if (j18 == 1) {
                                        j18 = j19;
                                    }
                                    if ((j18 & 2) != 0 && (z20 = this.h0) && z20) {
                                        this.h0 = false;
                                        if (this.V.p) {
                                            this.n.e(2);
                                        }
                                    }
                                    this.i0 -= c11 - o1VarArr2[i13].c();
                                    z19 &= (j18 & 1) != 0;
                                }
                                if (z19) {
                                    for (int i26 = 0; i26 < o1VarArr2.length; i26++) {
                                        if (vVar7.b(i26)) {
                                            if (!(o1VarArr2[i26].d(u0Var3) != null)) {
                                                k(u0Var3, i26, false, u0Var3.e());
                                            }
                                        }
                                    }
                                }
                                if (z19) {
                                    w0Var7.j.h = true;
                                }
                            }
                            o1VarArr = this.a;
                            w0Var = this.H;
                            z17 = false;
                            while (r0() && !this.Z && (u0Var4 = w0Var.i) != null && (u0Var5 = u0Var4.m) != null && this.k0 >= u0Var5.e() && u0Var5.h) {
                                if (z17) {
                                    F();
                                }
                                this.s0 = false;
                                a2 = w0Var.a();
                                a2.getClass();
                                if (this.V.b.a.equals(a2.g.a.a)) {
                                    u2.f0 f0Var = this.V.b;
                                    if (f0Var.b == -1) {
                                        u2.f0 f0Var2 = a2.g.a;
                                        if (f0Var2.b == -1 && f0Var.e != f0Var2.e) {
                                            z18 = true;
                                            v0 v0Var2 = a2.g;
                                            u2.f0 f0Var3 = v0Var2.a;
                                            long j20 = v0Var2.b;
                                            this.V = z(f0Var3, j20, v0Var2.c, j20, !z18, 0);
                                            Q();
                                            A0();
                                            if (e() && a2 == w0Var.k) {
                                                for (o1 o1Var8 : o1VarArr) {
                                                    int i27 = o1Var8.d;
                                                    if (i27 == 3 || i27 == 4) {
                                                        boolean z24 = i27 == 4;
                                                        f fVar6 = o1Var8.a;
                                                        f fVar7 = o1Var8.c;
                                                        if (z24) {
                                                            fVar7.getClass();
                                                            fVar7.c(17, fVar6);
                                                        } else {
                                                            fVar7.getClass();
                                                            fVar6.c(17, fVar7);
                                                        }
                                                        o1Var8.d = o1Var8.d == 4 ? 0 : 1;
                                                    } else if (i27 == 2) {
                                                        o1Var8.d = 0;
                                                    }
                                                }
                                            }
                                            if (this.V.e == 3) {
                                                t0();
                                            }
                                            x2.v vVar8 = w0Var.i.o;
                                            for (i12 = 0; i12 < o1VarArr.length; i12++) {
                                                if (vVar8.b(i12)) {
                                                    o1 o1Var9 = o1VarArr[i12];
                                                    f fVar8 = o1Var9.c;
                                                    f fVar9 = o1Var9.a;
                                                    if (o1.h(fVar9)) {
                                                        fVar9.e();
                                                    } else if (fVar8 != null) {
                                                        if (fVar8.n != 0) {
                                                            fVar8.e();
                                                        }
                                                    }
                                                }
                                            }
                                            z17 = true;
                                        }
                                    }
                                }
                                z18 = false;
                                v0 v0Var22 = a2.g;
                                u2.f0 f0Var32 = v0Var22.a;
                                long j202 = v0Var22.b;
                                this.V = z(f0Var32, j202, v0Var22.c, j202, !z18, 0);
                                Q();
                                A0();
                                if (e()) {
                                    while (r8 < r2) {
                                    }
                                }
                                if (this.V.e == 3) {
                                }
                                x2.v vVar82 = w0Var.i.o;
                                while (i12 < o1VarArr.length) {
                                }
                                z17 = true;
                            }
                            i10 = 3;
                            this.q0.getClass();
                        }
                    }
                    boolean z212 = this.O;
                    o1[] o1VarArr42 = this.a;
                    w0 w0Var62 = this.H;
                    u0Var2 = w0Var62.j;
                    if (u0Var2 != null) {
                    }
                    w0 w0Var72 = this.H;
                    u0Var3 = w0Var72.j;
                    if (u0Var3 != null) {
                        o1VarArr2 = this.a;
                        x2.v vVar72 = u0Var3.o;
                        z19 = true;
                        while (i13 < o1VarArr2.length) {
                        }
                        if (z19) {
                        }
                        if (z19) {
                        }
                    }
                    o1VarArr = this.a;
                    w0Var = this.H;
                    z17 = false;
                    while (r0()) {
                        if (z17) {
                        }
                        this.s0 = false;
                        a2 = w0Var.a();
                        a2.getClass();
                        if (this.V.b.a.equals(a2.g.a.a)) {
                        }
                        z18 = false;
                        v0 v0Var222 = a2.g;
                        u2.f0 f0Var322 = v0Var222.a;
                        long j2022 = v0Var222.b;
                        this.V = z(f0Var322, j2022, v0Var222.c, j2022, !z18, 0);
                        Q();
                        A0();
                        if (e()) {
                        }
                        if (this.V.e == 3) {
                        }
                        x2.v vVar822 = w0Var.i.o;
                        while (i12 < o1VarArr.length) {
                        }
                        z17 = true;
                    }
                    i10 = 3;
                    this.q0.getClass();
                }
            }
            boolean z2122 = this.O;
            o1[] o1VarArr422 = this.a;
            w0 w0Var622 = this.H;
            u0Var2 = w0Var622.j;
            if (u0Var2 != null) {
            }
            w0 w0Var722 = this.H;
            u0Var3 = w0Var722.j;
            if (u0Var3 != null) {
            }
            o1VarArr = this.a;
            w0Var = this.H;
            z17 = false;
            while (r0()) {
            }
            i10 = 3;
            this.q0.getClass();
        }
        int i28 = this.V.e;
        if (i28 == 1 || i28 == 4) {
            return;
        }
        u0 u0Var20 = this.H.i;
        if (u0Var20 == null) {
            V(uptimeMillis);
            return;
        }
        Trace.beginSection("doSomeWork");
        A0();
        if (u0Var20.e) {
            this.F.getClass();
            this.l0 = e2.d0.Q(SystemClock.elapsedRealtime());
            u0Var20.a.i(this.V.s - this.x);
            z10 = true;
            z11 = true;
            int i29 = 0;
            while (true) {
                o1[] o1VarArr5 = this.a;
                if (i29 >= o1VarArr5.length) {
                    break;
                }
                o1 o1Var10 = o1VarArr5[i29];
                if (o1Var10.c() == 0) {
                    H(i29, false);
                } else {
                    long j21 = this.k0;
                    long j22 = this.l0;
                    f fVar10 = o1Var10.c;
                    f fVar11 = o1Var10.a;
                    if (o1.h(fVar11)) {
                        fVar11.x(j21, j22);
                    }
                    if (fVar10 != null) {
                        if (fVar10.n != 0) {
                            fVar10.x(j21, j22);
                        }
                    }
                    if (z10) {
                        f fVar12 = o1Var10.c;
                        f fVar13 = o1Var10.a;
                        boolean l4 = o1.h(fVar13) ? fVar13.l() : true;
                        if (fVar12 != null) {
                            if (fVar12.n != 0) {
                                l4 &= fVar12.l();
                            }
                        }
                        if (l4) {
                            z10 = true;
                            f d11 = o1Var10.d(u0Var20);
                            z16 = d11 != null || d11.k() || d11.m() || d11.l();
                            H(i29, z16);
                            z11 = !z11 && z16;
                            if (z16) {
                                G(i29);
                            }
                        }
                    }
                    z10 = false;
                    f d112 = o1Var10.d(u0Var20);
                    if (d112 != null) {
                    }
                    H(i29, z16);
                    if (z11) {
                    }
                    if (z16) {
                    }
                }
                i29++;
            }
        } else {
            u0Var20.a.g();
            z10 = true;
            z11 = true;
        }
        long j23 = u0Var20.g.e;
        if (z10 && u0Var20.e) {
            j3 = -9223372036854775807L;
            if (j23 == -9223372036854775807L || j23 <= this.V.s) {
                z12 = true;
                if (z12 && this.Z) {
                    this.Z = false;
                    int i30 = this.V.n;
                    this.W.f(0);
                    z0(this.P.d(this.V.e, false), i30, 5, false);
                }
                if (z12 || !u0Var20.g.j) {
                    h1Var = this.V;
                    if (h1Var.e == 2) {
                        w0 w0Var8 = this.H;
                        if (this.i0 == 0) {
                            z14 = C();
                        } else {
                            if (z11) {
                                if (h1Var.g) {
                                    long j24 = s0(h1Var.a, w0Var8.i.g.a) ? this.J.h : j3;
                                    u0 u0Var21 = w0Var8.l;
                                    boolean z25 = u0Var21.g() && u0Var21.g.j;
                                    boolean z26 = u0Var21.g.a.b() && !u0Var21.e;
                                    if (!z25 && !z26) {
                                        long q6 = q(u0Var21.d());
                                        k kVar = this.f;
                                        b2.k1 k1Var2 = this.V.a;
                                        float f7 = this.y.h().a;
                                        boolean z27 = this.V.l;
                                        boolean z28 = this.a0;
                                        kVar.getClass();
                                        long D = e2.d0.D(q6, f7);
                                        long j25 = z28 ? kVar.e : kVar.d;
                                        if (j24 != j3) {
                                            j25 = Math.min(j24 / 2, j25);
                                        }
                                        if (j25 > 0 && D < j25) {
                                            y2.d dVar2 = kVar.a;
                                            synchronized (dVar2) {
                                                int i31 = dVar2.d * dVar2.b;
                                            }
                                        }
                                    }
                                }
                                z14 = true;
                            }
                            z14 = false;
                        }
                        if (z14) {
                            n0(i10);
                            this.o0 = null;
                            if (r0()) {
                                C0(false, false);
                                a3.q qVar2 = this.y;
                                z13 = true;
                                qVar2.b = true;
                                ((r1) qVar2.c).d();
                                t0();
                                if (this.V.e == 2) {
                                    int i32 = 0;
                                    while (true) {
                                        o1[] o1VarArr6 = this.a;
                                        if (i32 >= o1VarArr6.length) {
                                            break;
                                        }
                                        if (o1VarArr6[i32].d(u0Var20) != null) {
                                            G(i32);
                                        }
                                        i32++;
                                    }
                                    h1 h1Var4 = this.V;
                                    if (!h1Var4.g && h1Var4.r < 500000 && A(this.H.l) && r0()) {
                                        z15 = true;
                                        if (!z15) {
                                            this.p0 = j3;
                                        } else if (this.p0 == j3) {
                                            this.F.getClass();
                                            this.p0 = SystemClock.elapsedRealtime();
                                        } else {
                                            this.F.getClass();
                                            if (SystemClock.elapsedRealtime() - this.p0 >= 4000) {
                                                throw new IllegalStateException("Playback stuck buffering and not loading");
                                            }
                                        }
                                        boolean z29 = !r0() && this.V.e == i10;
                                        if (this.h0 || !this.g0 || !z29) {
                                            z13 = false;
                                        }
                                        h1Var2 = this.V;
                                        if (h1Var2.p != z13) {
                                            this.V = h1Var2.i(z13);
                                        }
                                        this.g0 = false;
                                        if (!z13 && (i11 = this.V.e) != 4 && (z29 || i11 == 2 || (i11 == i10 && this.i0 != 0))) {
                                            V(uptimeMillis);
                                        }
                                        Trace.endSection();
                                    }
                                }
                                z15 = false;
                                if (!z15) {
                                }
                                if (r0()) {
                                }
                                if (this.h0) {
                                }
                                z13 = false;
                                h1Var2 = this.V;
                                if (h1Var2.p != z13) {
                                }
                                this.g0 = false;
                                if (!z13) {
                                    V(uptimeMillis);
                                }
                                Trace.endSection();
                            }
                        }
                    }
                    z13 = true;
                    if (this.V.e == i10 && (this.i0 != 0 ? !z11 : !C())) {
                        C0(r0(), false);
                        n0(2);
                        if (this.a0) {
                            for (u0 u0Var22 = this.H.i; u0Var22 != null; u0Var22 = u0Var22.m) {
                                for (x2.r rVar : u0Var22.o.c) {
                                    if (rVar != null) {
                                        rVar.t();
                                    }
                                }
                            }
                            i iVar = this.J;
                            long j26 = iVar.h;
                            if (j26 != j3) {
                                long j27 = j26 + iVar.b;
                                iVar.h = j27;
                                long j28 = iVar.g;
                                if (j28 != j3 && j27 > j28) {
                                    iVar.h = j28;
                                }
                                iVar.l = j3;
                            }
                        }
                        v0();
                    }
                    if (this.V.e == 2) {
                    }
                    z15 = false;
                    if (!z15) {
                    }
                    if (r0()) {
                    }
                    if (this.h0) {
                    }
                    z13 = false;
                    h1Var2 = this.V;
                    if (h1Var2.p != z13) {
                    }
                    this.g0 = false;
                    if (!z13) {
                    }
                    Trace.endSection();
                }
                n0(4);
                v0();
                z13 = true;
                if (this.V.e == 2) {
                }
                z15 = false;
                if (!z15) {
                }
                if (r0()) {
                }
                if (this.h0) {
                }
                z13 = false;
                h1Var2 = this.V;
                if (h1Var2.p != z13) {
                }
                this.g0 = false;
                if (!z13) {
                }
                Trace.endSection();
            }
        } else {
            j3 = -9223372036854775807L;
        }
        z12 = false;
        if (z12) {
            this.Z = false;
            int i302 = this.V.n;
            this.W.f(0);
            z0(this.P.d(this.V.e, false), i302, 5, false);
        }
        if (z12) {
        }
        h1Var = this.V;
        if (h1Var.e == 2) {
        }
        z13 = true;
        if (this.V.e == i10) {
            C0(r0(), false);
            n0(2);
            if (this.a0) {
            }
            v0();
        }
        if (this.V.e == 2) {
        }
        z15 = false;
        if (!z15) {
        }
        if (r0()) {
        }
        if (this.h0) {
        }
        z13 = false;
        h1Var2 = this.V;
        if (h1Var2.p != z13) {
        }
        this.g0 = false;
        if (!z13) {
        }
        Trace.endSection();
    }

    public final void j0(p1 p1Var) {
        this.R = p1Var;
        d();
    }

    public final void k(u0 u0Var, int i10, boolean z10, long j3) {
        o1 o1Var = this.a[i10];
        boolean g10 = o1Var.g();
        f fVar = o1Var.a;
        if (g10) {
            return;
        }
        boolean z11 = u0Var == this.H.i;
        x2.v vVar = u0Var.o;
        n1 n1Var = vVar.b[i10];
        x2.r rVar = vVar.c[i10];
        boolean z12 = r0() && this.V.e == 3;
        boolean z13 = !z10 && z12;
        this.i0++;
        u2.b1 b1Var = u0Var.c[i10];
        long j10 = u0Var.p;
        u2.f0 f0Var = u0Var.g.a;
        f fVar2 = o1Var.c;
        int length = rVar != null ? rVar.length() : 0;
        b2.s[] sVarArr = new b2.s[length];
        for (int i11 = 0; i11 < length; i11++) {
            rVar.getClass();
            sVarArr[i11] = rVar.f(i11);
        }
        int i12 = o1Var.d;
        a3.q qVar = this.y;
        if (i12 == 0 || i12 == 2 || i12 == 4) {
            o1Var.e = true;
            e2.d.g(fVar.n == 0);
            fVar.d = n1Var;
            fVar.G = f0Var;
            fVar.n = 1;
            fVar.p(z13, z11);
            fVar.y(sVarArr, b1Var, j3, j10, f0Var);
            fVar.y = false;
            fVar.w = j3;
            fVar.x = j3;
            fVar.q(j3, z13);
            qVar.c(fVar);
        } else {
            o1Var.f = true;
            fVar2.getClass();
            e2.d.g(fVar2.n == 0);
            fVar2.d = n1Var;
            fVar2.G = f0Var;
            fVar2.n = 1;
            fVar2.p(z13, z11);
            fVar2.y(sVarArr, b1Var, j3, j10, f0Var);
            fVar2.y = false;
            fVar2.w = j3;
            fVar2.x = j3;
            fVar2.q(j3, z13);
            qVar.c(fVar2);
        }
        j0 j0Var = new j0(this);
        f d = o1Var.d(u0Var);
        d.getClass();
        d.c(11, j0Var);
        if (z12 && z11) {
            o1Var.m();
        }
    }

    public final void k0(q1 q1Var) {
        this.Q = q1Var;
    }

    public final void l(long j3, boolean[] zArr) {
        o1[] o1VarArr;
        long j10;
        u0 u0Var = this.H.j;
        x2.v vVar = u0Var.o;
        int i10 = 0;
        while (true) {
            o1VarArr = this.a;
            if (i10 >= o1VarArr.length) {
                break;
            }
            if (!vVar.b(i10)) {
                o1VarArr[i10].k();
            }
            i10++;
        }
        int i11 = 0;
        while (i11 < o1VarArr.length) {
            if (vVar.b(i11) && o1VarArr[i11].d(u0Var) == null) {
                j10 = j3;
                k(u0Var, i11, zArr[i11], j10);
            } else {
                j10 = j3;
            }
            i11++;
            j3 = j10;
        }
    }

    public final void l0(boolean z10) {
        this.e0 = z10;
        b2.k1 k1Var = this.V.a;
        w0 w0Var = this.H;
        w0Var.h = z10;
        int r10 = w0Var.r(k1Var);
        if ((r10 & 1) != 0) {
            W(true);
        } else if ((r10 & 2) != 0) {
            h();
        }
        v(false);
    }

    @Override // u2.c1
    public final void m(u2.d1 d1Var) {
        this.n.a(9, (u2.d0) d1Var).b();
    }

    public final void m0(u2.g1 g1Var) {
        this.W.f(1);
        g1 g1Var2 = this.I;
        int size = g1Var2.b.size();
        if (g1Var.getLength() != size) {
            g1Var = g1Var.h().e(0, size);
        }
        g1Var2.j = g1Var;
        w(g1Var2.b(), false);
    }

    public final long n(b2.k1 k1Var, Object obj, long j3) {
        b2.h1 h1Var = this.w;
        int i10 = k1Var.g(obj, h1Var).c;
        b2.j1 j1Var = this.v;
        k1Var.n(i10, j1Var);
        if (j1Var.f != -9223372036854775807L && j1Var.a() && j1Var.i) {
            return e2.d0.Q(e2.d0.A(j1Var.g) - j1Var.f) - (j3 + h1Var.e);
        }
        return -9223372036854775807L;
    }

    public final void n0(int i10) {
        h1 h1Var = this.V;
        if (h1Var.e != i10) {
            if (i10 != 2) {
                this.p0 = -9223372036854775807L;
            }
            if (i10 != 3 && h1Var.p) {
                this.V = h1Var.i(false);
            }
            this.V = this.V.h(i10);
        }
    }

    public final long o(u0 u0Var) {
        if (u0Var == null) {
            return 0L;
        }
        long j3 = u0Var.p;
        if (!u0Var.e) {
            return j3;
        }
        int i10 = 0;
        while (true) {
            o1[] o1VarArr = this.a;
            if (i10 >= o1VarArr.length) {
                return j3;
            }
            if (o1VarArr[i10].d(u0Var) != null) {
                f d = o1VarArr[i10].d(u0Var);
                Objects.requireNonNull(d);
                long j10 = d.x;
                if (j10 == Long.MIN_VALUE) {
                    return Long.MIN_VALUE;
                }
                j3 = Math.max(j10, j3);
            }
            i10++;
        }
    }

    public final void o0(a3.y yVar) {
        for (o1 o1Var : this.a) {
            f fVar = o1Var.a;
            if (fVar.b == 2) {
                fVar.c(7, yVar);
                f fVar2 = o1Var.c;
                if (fVar2 != null) {
                    fVar2.c(7, yVar);
                }
            }
        }
    }

    public final Pair p(b2.k1 k1Var) {
        long j3 = 0;
        if (k1Var.p()) {
            return Pair.create(h1.u, 0L);
        }
        int a2 = k1Var.a(this.e0);
        Pair i10 = k1Var.i(this.v, this.w, a2, -9223372036854775807L);
        u2.f0 p5 = this.H.p(k1Var, i10.first, 0L);
        long longValue = ((Long) i10.second).longValue();
        if (p5.b()) {
            Object obj = p5.a;
            b2.h1 h1Var = this.w;
            k1Var.g(obj, h1Var);
            if (p5.c == h1Var.e(p5.b)) {
                h1Var.g.getClass();
            }
        } else {
            j3 = longValue;
        }
        return Pair.create(p5, Long.valueOf(j3));
    }

    public final void p0(Object obj, e2.g gVar) {
        for (o1 o1Var : this.a) {
            f fVar = o1Var.a;
            if (fVar.b == 2) {
                int i10 = o1Var.d;
                if (i10 == 4 || i10 == 1) {
                    f fVar2 = o1Var.c;
                    fVar2.getClass();
                    fVar2.c(1, obj);
                } else {
                    fVar.c(1, obj);
                }
            }
        }
        int i11 = this.V.e;
        if (i11 == 3 || i11 == 2) {
            this.n.e(2);
        }
        if (gVar != null) {
            gVar.e();
        }
    }

    public final long q(long j3) {
        u0 u0Var = this.H.l;
        if (u0Var == null) {
            return 0L;
        }
        return Math.max(0L, j3 - (this.k0 - u0Var.p));
    }

    public final void q0(float f7) {
        this.t0 = f7;
        float f10 = f7 * this.P.g;
        for (o1 o1Var : this.a) {
            f fVar = o1Var.a;
            if (fVar.b == 1) {
                fVar.c(2, Float.valueOf(f10));
                f fVar2 = o1Var.c;
                if (fVar2 != null) {
                    fVar2.c(2, Float.valueOf(f10));
                }
            }
        }
    }

    public final void r(int i10) {
        h1 h1Var = this.V;
        z0(i10, h1Var.n, h1Var.m, h1Var.l);
    }

    public final boolean r0() {
        h1 h1Var = this.V;
        return h1Var.l && h1Var.n == 0;
    }

    public final void s() {
        q0(this.t0);
    }

    public final boolean s0(b2.k1 k1Var, u2.f0 f0Var) {
        if (f0Var.b() || k1Var.p()) {
            return false;
        }
        int i10 = k1Var.g(f0Var.a, this.w).c;
        b2.j1 j1Var = this.v;
        k1Var.n(i10, j1Var);
        return j1Var.a() && j1Var.i && j1Var.f != -9223372036854775807L;
    }

    public final void t(u2.d0 d0Var) {
        w0 w0Var = this.H;
        u0 u0Var = w0Var.l;
        if (u0Var != null && u0Var.a == d0Var) {
            w0Var.m(this.k0);
            D();
            return;
        }
        u0 u0Var2 = w0Var.m;
        if (u0Var2 == null || u0Var2.a != d0Var) {
            return;
        }
        E();
    }

    public final void t0() {
        u0 u0Var = this.H.i;
        if (u0Var == null) {
            return;
        }
        x2.v vVar = u0Var.o;
        int i10 = 0;
        while (true) {
            o1[] o1VarArr = this.a;
            if (i10 >= o1VarArr.length) {
                return;
            }
            if (vVar.b(i10)) {
                o1VarArr[i10].m();
            }
            i10++;
        }
    }

    public final void u(IOException iOException, int i10) {
        n nVar = new n(0, iOException, i10);
        u0 u0Var = this.H.i;
        if (u0Var != null) {
            nVar = nVar.a(u0Var.g.a);
        }
        e2.a.f("ExoPlayerImplInternal", "Playback error", nVar);
        u0(false, false);
        this.V = this.V.f(nVar);
    }

    public final void u0(boolean z10, boolean z11) {
        P(z10 || !this.f0, false, true, false);
        this.W.f(z11 ? 1 : 0);
        k kVar = this.f;
        if (kVar.h.remove(this.L) != null) {
            kVar.d();
        }
        this.P.d(1, this.V.l);
        n0(1);
    }

    public final void v(boolean z10) {
        u0 u0Var = this.H.l;
        u2.f0 f0Var = u0Var == null ? this.V.b : u0Var.g.a;
        boolean equals = this.V.k.equals(f0Var);
        if (!equals) {
            this.V = this.V.c(f0Var);
        }
        h1 h1Var = this.V;
        h1Var.q = u0Var == null ? h1Var.s : u0Var.d();
        h1 h1Var2 = this.V;
        h1Var2.r = q(h1Var2.q);
        if ((!equals || z10) && u0Var != null && u0Var.e) {
            x0(u0Var.o);
        }
    }

    public final void v0() {
        a3.q qVar = this.y;
        qVar.b = false;
        r1 r1Var = (r1) qVar.c;
        if (r1Var.c) {
            r1Var.c(r1Var.a());
            r1Var.c = false;
        }
        for (o1 o1Var : this.a) {
            f fVar = o1Var.c;
            f fVar2 = o1Var.a;
            if (o1.h(fVar2)) {
                o1.b(fVar2);
            }
            if (fVar != null && fVar.n != 0) {
                o1.b(fVar);
            }
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(6:(4:114|115|(1:117)(1:153)|118)|(8:(11:123|124|125|126|127|128|129|130|131|132|(2:134|135)(2:136|(1:138)))|127|128|129|130|131|132|(0)(0))|151|124|125|126) */
    /* JADX WARN: Code restructure failed: missing block: B:147:0x02e5, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:148:0x02e6, code lost:
    
        r8 = r36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:149:0x02e8, code lost:
    
        r20 = r3;
        r8 = r8;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:104:0x03fc  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0401  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x03c0  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x02c8  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x02d2 A[Catch: all -> 0x02cd, TryCatch #7 {all -> 0x02cd, blocks: (B:135:0x02c9, B:136:0x02d2, B:138:0x02d5, B:30:0x02ee, B:62:0x02fa, B:64:0x0300, B:66:0x030a, B:68:0x0317), top: B:28:0x0290 }] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0340  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x03a6  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0381  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0386  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0343  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x03bd  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x03cb  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0421  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x03dd A[ADDED_TO_REGION] */
    /* JADX WARN: Type inference failed for: r2v34, types: [i2.w0] */
    /* JADX WARN: Type inference failed for: r8v10 */
    /* JADX WARN: Type inference failed for: r8v14 */
    /* JADX WARN: Type inference failed for: r8v18 */
    /* JADX WARN: Type inference failed for: r8v19 */
    /* JADX WARN: Type inference failed for: r8v23, types: [b2.k1] */
    /* JADX WARN: Type inference failed for: r8v25 */
    /* JADX WARN: Type inference failed for: r8v29 */
    /* JADX WARN: Type inference failed for: r8v32 */
    /* JADX WARN: Type inference failed for: r8v9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void w(b2.k1 k1Var, boolean z10) {
        b2.k1 k1Var2;
        b2.j1 j1Var;
        Object obj;
        long j3;
        int i10;
        long i11;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        long j10;
        long j11;
        long j12;
        n0 n0Var;
        int i12;
        long longValue;
        boolean z15;
        boolean z16;
        boolean z17;
        b2.k1 k1Var3;
        u2.f0 f0Var;
        boolean z18;
        b2.k1 k1Var4;
        long o9;
        long j13;
        int s10;
        u0 u0Var;
        h1 h1Var = this.V;
        o0 o0Var = this.j0;
        w0 w0Var = this.H;
        int i13 = this.d0;
        boolean z19 = this.e0;
        b2.j1 j1Var2 = this.v;
        b2.h1 h1Var2 = this.w;
        int i14 = 4;
        if (k1Var.p()) {
            j3 = 0;
            k1Var2 = k1Var;
            n0Var = new n0(h1.u, 0L, -9223372036854775807L, false, true, false);
        } else {
            u2.f0 f0Var2 = h1Var.b;
            Object obj2 = f0Var2.a;
            b2.k1 k1Var5 = h1Var.a;
            boolean z20 = k1Var5.p() || k1Var5.g(f0Var2.a, h1Var2).f;
            long j14 = (h1Var.b.b() || z20) ? h1Var.c : h1Var.s;
            if (o0Var != null) {
                boolean z21 = false;
                k1Var2 = k1Var;
                Pair T = T(k1Var2, o0Var, true, i13, z19, j1Var2, h1Var2);
                if (T == null) {
                    i10 = k1Var2.a(z19);
                    obj = obj2;
                    longValue = j14;
                    z17 = true;
                    z16 = false;
                } else {
                    if (o0Var.c == -9223372036854775807L) {
                        i10 = k1Var2.g(T.first, h1Var2).c;
                        obj = obj2;
                        longValue = j14;
                        z15 = false;
                    } else {
                        obj = T.first;
                        longValue = ((Long) T.second).longValue();
                        i10 = -1;
                        z15 = true;
                    }
                    z21 = h1Var.e == 4;
                    z16 = z15;
                    z17 = false;
                }
                j3 = longValue;
                j1Var = j1Var2;
                z12 = z17;
                z11 = z21;
                z13 = z16;
            } else {
                k1Var2 = k1Var;
                if (h1Var.a.p()) {
                    i10 = k1Var2.a(z19);
                    j1Var = j1Var2;
                    obj = obj2;
                } else if (k1Var2.b(obj2) == -1) {
                    obj = obj2;
                    int U = U(j1Var2, h1Var2, i13, z19, obj, h1Var.a, k1Var2);
                    j1Var = j1Var2;
                    k1Var2 = k1Var2;
                    h1Var2 = h1Var2;
                    if (U == -1) {
                        U = k1Var2.a(z19);
                        z14 = true;
                    } else {
                        z14 = false;
                    }
                    i10 = U;
                    z12 = z14;
                    j3 = j14;
                    z11 = false;
                    z13 = false;
                } else {
                    j1Var = j1Var2;
                    obj = obj2;
                    if (j14 == -9223372036854775807L) {
                        i10 = k1Var2.g(obj, h1Var2).c;
                    } else if (z20) {
                        h1Var.a.g(f0Var2.a, h1Var2);
                        if (h1Var.a.m(h1Var2.c, j1Var, 0L).n == h1Var.a.b(f0Var2.a)) {
                            Pair i15 = k1Var2.i(j1Var, h1Var2, k1Var2.g(obj, h1Var2).c, j14 + h1Var2.e);
                            obj = i15.first;
                            i11 = ((Long) i15.second).longValue();
                        } else {
                            i11 = k1Var2.g(obj, h1Var2).d != -9223372036854775807L ? e2.d0.i(j14, 0L, h1Var2.d - 1) : j14;
                        }
                        j3 = i11;
                        i10 = -1;
                        z11 = false;
                        z12 = false;
                        z13 = true;
                    } else {
                        j3 = j14;
                        i10 = -1;
                        z11 = false;
                        z12 = false;
                        z13 = false;
                    }
                }
                j3 = j14;
                z11 = false;
                z12 = false;
                z13 = false;
            }
            if (i10 != -1) {
                Pair i16 = k1Var2.i(j1Var, h1Var2, i10, -9223372036854775807L);
                obj = i16.first;
                j3 = ((Long) i16.second).longValue();
                j11 = -9223372036854775807L;
                j10 = j3;
            } else {
                j10 = j3;
                j11 = j10;
            }
            u2.f0 p5 = w0Var.p(k1Var2, obj, j10);
            int i17 = p5.e;
            boolean z22 = f0Var2.a.equals(obj) && !f0Var2.b() && !p5.b() && (i17 == -1 || ((i12 = f0Var2.e) != -1 && i17 >= i12));
            b2.h1 g10 = k1Var2.g(obj, h1Var2);
            if (!z20 && j14 == j11) {
                Object obj3 = f0Var2.a;
                int i18 = f0Var2.b;
                if (obj3.equals(p5.a)) {
                    if (f0Var2.b()) {
                        g10.g(i18);
                    }
                    if (p5.b()) {
                        g10.g(p5.b);
                    }
                }
            }
            if (z22) {
                p5 = f0Var2;
            }
            if (p5.b()) {
                if (p5.equals(f0Var2)) {
                    j10 = h1Var.s;
                } else {
                    k1Var2.g(p5.a, h1Var2);
                    if (p5.c == h1Var2.e(p5.b)) {
                        h1Var2.g.getClass();
                    }
                    j12 = 0;
                    n0Var = new n0(p5, j12, j11, z11, z12, z13);
                }
            }
            j12 = j10;
            n0Var = new n0(p5, j12, j11, z11, z12, z13);
        }
        u2.f0 f0Var3 = n0Var.a;
        long j15 = n0Var.c;
        boolean z23 = n0Var.d;
        long j16 = n0Var.b;
        boolean z24 = (this.V.b.equals(f0Var3) && j16 == this.V.s) ? false : true;
        try {
            if (n0Var.e) {
                try {
                    z18 = true;
                    if (this.V.e != 1) {
                        n0(4);
                    }
                    P(false, false, false, true);
                } catch (Throwable th2) {
                    th = th2;
                    k1Var3 = k1Var2;
                    f0Var = f0Var3;
                    j3 = j16;
                    i14 = 2;
                    h1 h1Var3 = this.V;
                    b2.k1 k1Var6 = h1Var3.a;
                    u2.f0 f0Var4 = h1Var3.b;
                    u2.f0 f0Var5 = f0Var;
                    B0(k1Var3, f0Var5, k1Var6, f0Var4, !n0Var.f ? j3 : -9223372036854775807L, false);
                    if (!z24) {
                    }
                    h1 h1Var4 = this.V;
                    Object obj4 = h1Var4.b.a;
                    b2.k1 k1Var7 = h1Var4.a;
                    if (z24) {
                    }
                    this.V = z(f0Var5, j3, j15, this.V.d, (z24 || !z10 || k1Var7.p() || k1Var7.g(obj4, this.w).f) ? false : true, k1Var3.b(obj4) != -1 ? 4 : 3);
                    Q();
                    S(k1Var3, this.V.a);
                    this.V = this.V.j(k1Var3);
                    if (!k1Var3.p()) {
                    }
                    v(false);
                    this.n.e(i14);
                    throw th;
                }
            } else {
                z18 = true;
            }
            o1[] o1VarArr = this.a;
            int length = o1VarArr.length;
            int i19 = 0;
            ?? r82 = z18;
            while (i19 < length) {
                o1 o1Var = o1VarArr[i19];
                f fVar = o1Var.a;
                if (!Objects.equals(fVar.F, k1Var2)) {
                    fVar.F = k1Var2;
                }
                f fVar2 = o1Var.c;
                if (fVar2 != null && !Objects.equals(fVar2.F, k1Var2)) {
                    fVar2.F = k1Var2;
                }
                i19++;
                r82 = 1;
                i14 = 4;
            }
            try {
                if (z24) {
                    r82 = k1Var2;
                    j3 = j16;
                    i14 = 2;
                    if (!r82.p()) {
                        for (u0 u0Var2 = this.H.i; u0Var2 != null; u0Var2 = u0Var2.m) {
                            if (u0Var2.g.a.equals(f0Var3)) {
                                u0Var2.g = this.H.h(r82, u0Var2.g);
                                u0Var2.k();
                            }
                        }
                        try {
                            w0 w0Var2 = this.H;
                            f0Var = f0Var3;
                            try {
                                j3 = Y(f0Var, j3, w0Var2.i != w0Var2.j, z23);
                                h1 h1Var5 = this.V;
                                u2.f0 f0Var6 = f0Var;
                                B0(k1Var, f0Var6, h1Var5.a, h1Var5.b, !n0Var.f ? j3 : -9223372036854775807L, false);
                                if (!z24 || j15 != this.V.c) {
                                    h1 h1Var6 = this.V;
                                    Object obj5 = h1Var6.b.a;
                                    b2.k1 k1Var8 = h1Var6.a;
                                    this.V = z(f0Var6, j3, j15, this.V.d, (z24 || !z10 || k1Var8.p() || k1Var8.g(obj5, this.w).f) ? false : true, k1Var.b(obj5) != -1 ? 4 : 3);
                                }
                                Q();
                                S(k1Var, this.V.a);
                                this.V = this.V.j(k1Var);
                                if (!k1Var.p()) {
                                    this.j0 = null;
                                }
                                v(false);
                                this.n.e(i14);
                            } catch (Throwable th3) {
                                th = th3;
                                j3 = j3;
                                k1Var4 = r82;
                                k1Var3 = k1Var4;
                                h1 h1Var32 = this.V;
                                b2.k1 k1Var62 = h1Var32.a;
                                u2.f0 f0Var42 = h1Var32.b;
                                u2.f0 f0Var52 = f0Var;
                                B0(k1Var3, f0Var52, k1Var62, f0Var42, !n0Var.f ? j3 : -9223372036854775807L, false);
                                if (!z24 || j15 != this.V.c) {
                                    h1 h1Var42 = this.V;
                                    Object obj42 = h1Var42.b.a;
                                    b2.k1 k1Var72 = h1Var42.a;
                                    this.V = z(f0Var52, j3, j15, this.V.d, (z24 || !z10 || k1Var72.p() || k1Var72.g(obj42, this.w).f) ? false : true, k1Var3.b(obj42) != -1 ? 4 : 3);
                                }
                                Q();
                                S(k1Var3, this.V.a);
                                this.V = this.V.j(k1Var3);
                                if (!k1Var3.p()) {
                                    this.j0 = null;
                                }
                                v(false);
                                this.n.e(i14);
                                throw th;
                            }
                        } catch (Throwable th4) {
                            th = th4;
                            f0Var = f0Var3;
                            k1Var4 = r82;
                            k1Var3 = k1Var4;
                            h1 h1Var322 = this.V;
                            b2.k1 k1Var622 = h1Var322.a;
                            u2.f0 f0Var422 = h1Var322.b;
                            u2.f0 f0Var522 = f0Var;
                            B0(k1Var3, f0Var522, k1Var622, f0Var422, !n0Var.f ? j3 : -9223372036854775807L, false);
                            if (!z24) {
                            }
                            h1 h1Var422 = this.V;
                            Object obj422 = h1Var422.b.a;
                            b2.k1 k1Var722 = h1Var422.a;
                            if (z24) {
                            }
                            this.V = z(f0Var522, j3, j15, this.V.d, (z24 || !z10 || k1Var722.p() || k1Var722.g(obj422, this.w).f) ? false : true, k1Var3.b(obj422) != -1 ? 4 : 3);
                            Q();
                            S(k1Var3, this.V.a);
                            this.V = this.V.j(k1Var3);
                            if (!k1Var3.p()) {
                            }
                            v(false);
                            this.n.e(i14);
                            throw th;
                        }
                    }
                } else {
                    try {
                        u0 u0Var3 = this.H.j;
                        o9 = u0Var3 == null ? 0L : o(u0Var3);
                    } catch (Throwable th5) {
                        th = th5;
                        b2.k1 k1Var9 = k1Var2;
                    }
                    try {
                        try {
                            if (e() && (u0Var = this.H.k) != null) {
                                j13 = o(u0Var);
                                j3 = j16;
                                i14 = 2;
                                s10 = this.H.s(k1Var, this.k0, o9, j13);
                                if ((s10 & 1) == 0) {
                                    W(false);
                                } else if ((s10 & 2) != 0) {
                                    h();
                                }
                            }
                            s10 = this.H.s(k1Var, this.k0, o9, j13);
                            if ((s10 & 1) == 0) {
                            }
                        } catch (Throwable th6) {
                            th = th6;
                            r82 = k1Var;
                            f0Var = f0Var3;
                            k1Var4 = r82;
                            k1Var3 = k1Var4;
                            h1 h1Var3222 = this.V;
                            b2.k1 k1Var6222 = h1Var3222.a;
                            u2.f0 f0Var4222 = h1Var3222.b;
                            u2.f0 f0Var5222 = f0Var;
                            B0(k1Var3, f0Var5222, k1Var6222, f0Var4222, !n0Var.f ? j3 : -9223372036854775807L, false);
                            if (!z24) {
                            }
                            h1 h1Var4222 = this.V;
                            Object obj4222 = h1Var4222.b.a;
                            b2.k1 k1Var7222 = h1Var4222.a;
                            if (z24) {
                            }
                            this.V = z(f0Var5222, j3, j15, this.V.d, (z24 || !z10 || k1Var7222.p() || k1Var7222.g(obj4222, this.w).f) ? false : true, k1Var3.b(obj4222) != -1 ? 4 : 3);
                            Q();
                            S(k1Var3, this.V.a);
                            this.V = this.V.j(k1Var3);
                            if (!k1Var3.p()) {
                            }
                            v(false);
                            this.n.e(i14);
                            throw th;
                        }
                        i14 = 2;
                    } catch (Throwable th7) {
                        th = th7;
                        r82 = k1Var;
                        i14 = 2;
                        f0Var = f0Var3;
                        k1Var4 = r82;
                        k1Var3 = k1Var4;
                        h1 h1Var32222 = this.V;
                        b2.k1 k1Var62222 = h1Var32222.a;
                        u2.f0 f0Var42222 = h1Var32222.b;
                        u2.f0 f0Var52222 = f0Var;
                        B0(k1Var3, f0Var52222, k1Var62222, f0Var42222, !n0Var.f ? j3 : -9223372036854775807L, false);
                        if (!z24) {
                        }
                        h1 h1Var42222 = this.V;
                        Object obj42222 = h1Var42222.b.a;
                        b2.k1 k1Var72222 = h1Var42222.a;
                        if (z24) {
                        }
                        this.V = z(f0Var52222, j3, j15, this.V.d, (z24 || !z10 || k1Var72222.p() || k1Var72222.g(obj42222, this.w).f) ? false : true, k1Var3.b(obj42222) != -1 ? 4 : 3);
                        Q();
                        S(k1Var3, this.V.a);
                        this.V = this.V.j(k1Var3);
                        if (!k1Var3.p()) {
                        }
                        v(false);
                        this.n.e(i14);
                        throw th;
                    }
                    j13 = 0;
                    j3 = j16;
                }
                f0Var = f0Var3;
                h1 h1Var52 = this.V;
                u2.f0 f0Var62 = f0Var;
                B0(k1Var, f0Var62, h1Var52.a, h1Var52.b, !n0Var.f ? j3 : -9223372036854775807L, false);
                if (!z24) {
                }
                h1 h1Var62 = this.V;
                Object obj52 = h1Var62.b.a;
                b2.k1 k1Var82 = h1Var62.a;
                if (z24) {
                }
                this.V = z(f0Var62, j3, j15, this.V.d, (z24 || !z10 || k1Var82.p() || k1Var82.g(obj52, this.w).f) ? false : true, k1Var.b(obj52) != -1 ? 4 : 3);
                Q();
                S(k1Var, this.V.a);
                this.V = this.V.j(k1Var);
                if (!k1Var.p()) {
                }
                v(false);
                this.n.e(i14);
            } catch (Throwable th8) {
                th = th8;
            }
        } catch (Throwable th9) {
            th = th9;
        }
    }

    /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, u2.d1] */
    public final void w0() {
        u0 u0Var = this.H.l;
        boolean z10 = this.c0 || (u0Var != null && u0Var.a.c());
        h1 h1Var = this.V;
        if (z10 != h1Var.g) {
            this.V = h1Var.b(z10);
        }
    }

    public final void x(u2.d0 d0Var) {
        u0 u0Var;
        w0 w0Var = this.H;
        u0 u0Var2 = w0Var.l;
        a3.q qVar = this.y;
        if (u0Var2 != null && u0Var2.a == d0Var) {
            u0Var2.getClass();
            if (!u0Var2.e) {
                float f7 = qVar.h().a;
                h1 h1Var = this.V;
                u0Var2.f(f7, h1Var.a, h1Var.l);
            }
            x0(u0Var2.o);
            if (u0Var2 == w0Var.i) {
                R(u0Var2.g.b);
                l(w0Var.j.e(), new boolean[this.a.length]);
                u0Var2.h = true;
                h1 h1Var2 = this.V;
                u2.f0 f0Var = h1Var2.b;
                long j3 = u0Var2.g.b;
                this.V = z(f0Var, j3, h1Var2.c, j3, false, 5);
            }
            D();
            return;
        }
        int i10 = 0;
        while (true) {
            if (i10 >= w0Var.q.size()) {
                u0Var = null;
                break;
            }
            u0Var = (u0) w0Var.q.get(i10);
            if (u0Var.a == d0Var) {
                break;
            } else {
                i10++;
            }
        }
        if (u0Var != null) {
            e2.d.g(true ^ u0Var.e);
            float f10 = qVar.h().a;
            h1 h1Var3 = this.V;
            u0Var.f(f10, h1Var3.a, h1Var3.l);
            u0 u0Var3 = w0Var.m;
            if (u0Var3 == null || u0Var3.a != d0Var) {
                return;
            }
            E();
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public final void x0(x2.v vVar) {
        u0 u0Var = this.H.l;
        u0Var.getClass();
        q(u0Var.d());
        if (s0(this.V.a, u0Var.g.a)) {
            long j3 = this.J.h;
        }
        b2.k1 k1Var = this.V.a;
        float f7 = this.y.h().a;
        boolean z10 = this.V.l;
        x2.r[] rVarArr = vVar.c;
        k kVar = this.f;
        j jVar = (j) kVar.h.get(this.L);
        jVar.getClass();
        int i10 = kVar.f;
        if (i10 == -1) {
            int length = rVarArr.length;
            int i11 = 0;
            int i12 = 0;
            while (true) {
                int i13 = 13107200;
                if (i11 < length) {
                    x2.r rVar = rVarArr[i11];
                    if (rVar != null) {
                        switch (rVar.b().c) {
                            case -2:
                                i13 = 0;
                                i12 += i13;
                                break;
                            case -1:
                            case 1:
                                i12 += i13;
                                break;
                            case 0:
                                i13 = 144310272;
                                i12 += i13;
                                break;
                            case 2:
                                i13 = 131072000;
                                i12 += i13;
                                break;
                            case 3:
                            case 5:
                            case 6:
                                i13 = 131072;
                                i12 += i13;
                                break;
                            case 4:
                                i13 = 26214400;
                                i12 += i13;
                                break;
                            default:
                                throw new IllegalArgumentException();
                        }
                    }
                    i11++;
                } else {
                    i10 = Math.max(13107200, i12);
                }
            }
        }
        jVar.b = i10;
        kVar.d();
    }

    public final void y(b2.v0 v0Var, float f7, boolean z10, boolean z11) {
        int i10;
        if (z10) {
            if (z11) {
                this.W.f(1);
            }
            this.V = this.V.g(v0Var);
        }
        float f10 = v0Var.a;
        u0 u0Var = this.H.i;
        while (true) {
            i10 = 0;
            if (u0Var == null) {
                break;
            }
            x2.r[] rVarArr = u0Var.o.c;
            int length = rVarArr.length;
            while (i10 < length) {
                x2.r rVar = rVarArr[i10];
                if (rVar != null) {
                    rVar.p(f10);
                }
                i10++;
            }
            u0Var = u0Var.m;
        }
        o1[] o1VarArr = this.a;
        int length2 = o1VarArr.length;
        while (i10 < length2) {
            o1 o1Var = o1VarArr[i10];
            float f11 = v0Var.a;
            o1Var.a.z(f7, f11);
            f fVar = o1Var.c;
            if (fVar != null) {
                fVar.z(f7, f11);
            }
            i10++;
        }
    }

    public final void y0(int i10, int i11, List list) {
        this.W.f(1);
        g1 g1Var = this.I;
        g1Var.getClass();
        ArrayList arrayList = g1Var.b;
        e2.d.b(i10 >= 0 && i10 <= i11 && i11 <= arrayList.size());
        e2.d.b(list.size() == i11 - i10);
        for (int i12 = i10; i12 < i11; i12++) {
            ((f1) arrayList.get(i12)).a.t((b2.k0) list.get(i12 - i10));
        }
        w(g1Var.b(), false);
    }

    public final h1 z(u2.f0 f0Var, long j3, long j10, long j11, boolean z10, int i10) {
        e9.a1 a1Var;
        boolean z11;
        this.n0 = (!this.n0 && j3 == this.V.s && f0Var.equals(this.V.b)) ? false : true;
        Q();
        h1 h1Var = this.V;
        u2.p1 p1Var = h1Var.h;
        x2.v vVar = h1Var.i;
        List list = h1Var.j;
        if (this.I.k) {
            u0 u0Var = this.H.i;
            p1Var = u0Var == null ? u2.p1.d : u0Var.n;
            vVar = u0Var == null ? this.e : u0Var.o;
            x2.r[] rVarArr = vVar.c;
            e9.f0 f0Var2 = new e9.f0(4);
            boolean z12 = false;
            for (x2.r rVar : rVarArr) {
                if (rVar != null) {
                    b2.p0 p0Var = rVar.f(0).l;
                    if (p0Var == null) {
                        f0Var2.b(new b2.p0(new b2.o0[0]));
                    } else {
                        f0Var2.b(p0Var);
                        z12 = true;
                    }
                }
            }
            if (z12) {
                a1Var = f0Var2.i();
            } else {
                e9.g0 g0Var = e9.i0.b;
                a1Var = e9.a1.e;
            }
            list = a1Var;
            if (u0Var != null) {
                v0 v0Var = u0Var.g;
                if (v0Var.c != j10) {
                    u0Var.g = v0Var.a(j10);
                }
            }
            o1[] o1VarArr = this.a;
            w0 w0Var = this.H;
            u0 u0Var2 = w0Var.i;
            if (u0Var2 == w0Var.j && u0Var2 != null) {
                x2.v vVar2 = u0Var2.o;
                int i11 = 0;
                boolean z13 = false;
                while (true) {
                    if (i11 >= o1VarArr.length) {
                        z11 = true;
                        break;
                    }
                    if (vVar2.b(i11)) {
                        if (o1VarArr[i11].a.b != 1) {
                            z11 = false;
                            break;
                        }
                        if (vVar2.b[i11].a != 0) {
                            z13 = true;
                        }
                    }
                    i11++;
                }
                boolean z14 = z13 && z11;
                if (z14 != this.h0) {
                    this.h0 = z14;
                    if (!z14 && this.V.p) {
                        this.n.e(2);
                    }
                }
            }
        } else if (!f0Var.equals(h1Var.b)) {
            p1Var = u2.p1.d;
            vVar = this.e;
            list = e9.a1.e;
        }
        u2.p1 p1Var2 = p1Var;
        x2.v vVar3 = vVar;
        List list2 = list;
        if (z10) {
            m0 m0Var = this.W;
            if (!m0Var.d || m0Var.e == 5) {
                m0Var.c = true;
                m0Var.d = true;
                m0Var.e = i10;
            } else {
                e2.d.b(i10 == 5);
            }
        }
        h1 h1Var2 = this.V;
        return h1Var2.d(f0Var, j3, j10, j11, q(h1Var2.q), p1Var2, vVar3, list2);
    }

    public final void z0(int i10, int i11, int i12, boolean z10) {
        boolean z11 = z10 && i10 != -1;
        if (i10 == -1) {
            i12 = 2;
        } else if (i12 == 2) {
            i12 = 1;
        }
        if (i10 == 0) {
            i11 = 1;
        } else if (i11 == 1) {
            i11 = 0;
        }
        h1 h1Var = this.V;
        if (h1Var.l == z11 && h1Var.n == i11 && h1Var.m == i12) {
            return;
        }
        this.V = h1Var.e(i12, i11, z11);
        C0(false, false);
        w0 w0Var = this.H;
        for (u0 u0Var = w0Var.i; u0Var != null; u0Var = u0Var.m) {
            for (x2.r rVar : u0Var.o.c) {
                if (rVar != null) {
                    rVar.e(z11);
                }
            }
        }
        if (!r0()) {
            v0();
            A0();
            h1 h1Var2 = this.V;
            if (h1Var2.p) {
                this.V = h1Var2.i(false);
            }
            w0Var.m(this.k0);
            return;
        }
        int i13 = this.V.e;
        e2.z zVar = this.n;
        if (i13 != 3) {
            if (i13 == 2) {
                zVar.e(2);
            }
        } else {
            a3.q qVar = this.y;
            qVar.b = true;
            ((r1) qVar.c).d();
            t0();
            zVar.e(2);
        }
    }
}
