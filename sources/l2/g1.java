package l2;

import android.os.SystemClock;
import h9.t1;
import java.util.List;
import x2.r1;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes.dex */
public final class g1 {
    public static final x2.g0 u = new x2.g0(new Object());
    public final e2.l1 a;
    public final x2.g0 b;
    public final long c;
    public final long d;
    public final int e;
    public final l f;
    public final boolean g;
    public final r1 h;
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

    public g1(e2.l1 l1Var, x2.g0 g0Var, long j3, long j10, int i7, l lVar, boolean z10, r1 r1Var, a3.y yVar, List list, x2.g0 g0Var2, boolean z11, int i10, int i11, e2.w0 w0Var, long j11, long j12, long j13, long j14, boolean z12) {
        this.a = l1Var;
        this.b = g0Var;
        this.c = j3;
        this.d = j10;
        this.e = i7;
        this.f = lVar;
        this.g = z10;
        this.h = r1Var;
        this.i = yVar;
        this.j = list;
        this.k = g0Var2;
        this.l = z11;
        this.m = i10;
        this.n = i11;
        this.o = w0Var;
        this.q = j11;
        this.r = j12;
        this.s = j13;
        this.t = j14;
        this.p = z12;
    }

    public static g1 k(a3.y yVar) {
        e2.h1 h1Var = e2.l1.a;
        r1 r1Var = r1.d;
        t1 t1Var = t1.e;
        e2.w0 w0Var = e2.w0.d;
        x2.g0 g0Var = u;
        return new g1(h1Var, g0Var, -9223372036854775807L, 0L, 1, null, false, r1Var, yVar, t1Var, g0Var, false, 1, 0, w0Var, 0L, 0L, 0L, 0L, false);
    }

    public final g1 a() {
        return new g1(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m, this.n, this.o, this.q, this.r, l(), SystemClock.elapsedRealtime(), this.p);
    }

    public final g1 b(boolean z10) {
        return new g1(this.a, this.b, this.c, this.d, this.e, this.f, z10, this.h, this.i, this.j, this.k, this.l, this.m, this.n, this.o, this.q, this.r, this.s, this.t, this.p);
    }

    public final g1 c(x2.g0 g0Var) {
        return new g1(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, g0Var, this.l, this.m, this.n, this.o, this.q, this.r, this.s, this.t, this.p);
    }

    public final g1 d(x2.g0 g0Var, long j3, long j10, long j11, long j12, r1 r1Var, a3.y yVar, List list) {
        return new g1(this.a, g0Var, j10, j11, this.e, this.f, this.g, r1Var, yVar, list, this.k, this.l, this.m, this.n, this.o, this.q, j12, j3, SystemClock.elapsedRealtime(), this.p);
    }

    public final g1 e(int i7, int i10, boolean z10) {
        return new g1(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, z10, i7, i10, this.o, this.q, this.r, this.s, this.t, this.p);
    }

    public final g1 f(l lVar) {
        return new g1(this.a, this.b, this.c, this.d, this.e, lVar, this.g, this.h, this.i, this.j, this.k, this.l, this.m, this.n, this.o, this.q, this.r, this.s, this.t, this.p);
    }

    public final g1 g(e2.w0 w0Var) {
        return new g1(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m, this.n, w0Var, this.q, this.r, this.s, this.t, this.p);
    }

    public final g1 h(int i7) {
        return new g1(this.a, this.b, this.c, this.d, i7, this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m, this.n, this.o, this.q, this.r, this.s, this.t, this.p);
    }

    public final g1 i(boolean z10) {
        return new g1(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m, this.n, this.o, this.q, this.r, this.s, this.t, z10);
    }

    public final g1 j(e2.l1 l1Var) {
        return new g1(l1Var, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m, this.n, this.o, this.q, this.r, this.s, this.t, this.p);
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
        return h2.l0.S(h2.l0.h0(j10) + ((long) ((SystemClock.elapsedRealtime() - j3) * this.o.a)));
    }

    public final boolean m() {
        return this.e == 3 && this.l && this.n == 0;
    }
}
