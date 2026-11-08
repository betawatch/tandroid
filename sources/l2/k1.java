package l2;

import android.os.SystemClock;
import java.util.List;

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
/* loaded from: classes.dex */
public final class k1 {
    public static final x2.g0 u = new x2.g0(new Object());
    public final e2.l1 a;
    public final x2.g0 b;
    public final long c;
    public final long d;
    public final int e;
    public final l f;
    public final boolean g;
    public final x2.q1 h;
    public final a3.y i;
    public final List j;
    public final x2.g0 k;
    public final boolean l;
    public final int m;
    public final int n;
    public final e2.w0 o;
    public final boolean p;
    public volatile long q;
    public volatile long r;
    public volatile long s;
    public volatile long t;

    public k1(e2.l1 l1Var, x2.g0 g0Var, long j3, long j10, int i7, l lVar, boolean z9, x2.q1 q1Var, a3.y yVar, List list, x2.g0 g0Var2, boolean z10, int i10, int i11, e2.w0 w0Var, long j11, long j12, long j13, long j14, boolean z11) {
        this.a = l1Var;
        this.b = g0Var;
        this.c = j3;
        this.d = j10;
        this.e = i7;
        this.f = lVar;
        this.g = z9;
        this.h = q1Var;
        this.i = yVar;
        this.j = list;
        this.k = g0Var2;
        this.l = z10;
        this.m = i10;
        this.n = i11;
        this.o = w0Var;
        this.q = j11;
        this.r = j12;
        this.s = j13;
        this.t = j14;
        this.p = z11;
    }

    public static k1 k(a3.y yVar) {
        e2.h1 h1Var = e2.l1.a;
        x2.q1 q1Var = x2.q1.d;
        h9.t1 t1Var = h9.t1.e;
        e2.w0 w0Var = e2.w0.d;
        x2.g0 g0Var = u;
        return new k1(h1Var, g0Var, -9223372036854775807L, 0L, 1, null, false, q1Var, yVar, t1Var, g0Var, false, 1, 0, w0Var, 0L, 0L, 0L, 0L, false);
    }

    public final k1 a() {
        return new k1(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m, this.n, this.o, this.q, this.r, l(), SystemClock.elapsedRealtime(), this.p);
    }

    public final k1 b(boolean z9) {
        return new k1(this.a, this.b, this.c, this.d, this.e, this.f, z9, this.h, this.i, this.j, this.k, this.l, this.m, this.n, this.o, this.q, this.r, this.s, this.t, this.p);
    }

    public final k1 c(x2.g0 g0Var) {
        return new k1(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, g0Var, this.l, this.m, this.n, this.o, this.q, this.r, this.s, this.t, this.p);
    }

    public final k1 d(x2.g0 g0Var, long j3, long j10, long j11, long j12, x2.q1 q1Var, a3.y yVar, List list) {
        return new k1(this.a, g0Var, j10, j11, this.e, this.f, this.g, q1Var, yVar, list, this.k, this.l, this.m, this.n, this.o, this.q, j12, j3, SystemClock.elapsedRealtime(), this.p);
    }

    public final k1 e(int i7, int i10, boolean z9) {
        return new k1(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, z9, i7, i10, this.o, this.q, this.r, this.s, this.t, this.p);
    }

    public final k1 f(l lVar) {
        return new k1(this.a, this.b, this.c, this.d, this.e, lVar, this.g, this.h, this.i, this.j, this.k, this.l, this.m, this.n, this.o, this.q, this.r, this.s, this.t, this.p);
    }

    public final k1 g(e2.w0 w0Var) {
        return new k1(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m, this.n, w0Var, this.q, this.r, this.s, this.t, this.p);
    }

    public final k1 h(int i7) {
        return new k1(this.a, this.b, this.c, this.d, i7, this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m, this.n, this.o, this.q, this.r, this.s, this.t, this.p);
    }

    public final k1 i(boolean z9) {
        return new k1(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m, this.n, this.o, this.q, this.r, this.s, this.t, z9);
    }

    public final k1 j(e2.l1 l1Var) {
        return new k1(l1Var, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m, this.n, this.o, this.q, this.r, this.s, this.t, this.p);
    }

    public final long l() {
        long j3;
        long j10;
        if (!m()) {
            return this.s;
        }
        do {
            j3 = this.t;
            j10 = this.s;
        } while (j3 != this.t);
        return h2.m0.S(h2.m0.h0(j10) + ((long) ((SystemClock.elapsedRealtime() - j3) * this.o.a)));
    }

    public final boolean m() {
        return this.e == 3 && this.l && this.n == 0;
    }
}
