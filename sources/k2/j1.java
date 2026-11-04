package k2;

import android.os.SystemClock;
import java.util.List;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class j1 {
    public static final w2.g0 u = new w2.g0(new Object());
    public final d2.n1 a;
    public final w2.g0 b;
    public final long c;
    public final long d;
    public final int e;
    public final l f;
    public final boolean g;
    public final w2.r1 h;
    public final z2.t i;
    public final List j;
    public final w2.g0 k;
    public final boolean l;
    public final int m;
    public final int n;
    public final d2.y0 o;
    public final boolean p;
    public volatile long q;
    public volatile long r;
    public volatile long s;
    public volatile long t;

    public j1(d2.n1 n1Var, w2.g0 g0Var, long j10, long j11, int i3, l lVar, boolean z10, w2.r1 r1Var, z2.t tVar, List list, w2.g0 g0Var2, boolean z11, int i10, int i11, d2.y0 y0Var, long j12, long j13, long j14, long j15, boolean z12) {
        this.a = n1Var;
        this.b = g0Var;
        this.c = j10;
        this.d = j11;
        this.e = i3;
        this.f = lVar;
        this.g = z10;
        this.h = r1Var;
        this.i = tVar;
        this.j = list;
        this.k = g0Var2;
        this.l = z11;
        this.m = i10;
        this.n = i11;
        this.o = y0Var;
        this.q = j12;
        this.r = j13;
        this.s = j14;
        this.t = j15;
        this.p = z12;
    }

    public static j1 k(z2.t tVar) {
        d2.j1 j1Var = d2.n1.a;
        w2.r1 r1Var = w2.r1.d;
        g9.s1 s1Var = g9.s1.e;
        d2.y0 y0Var = d2.y0.d;
        w2.g0 g0Var = u;
        return new j1(j1Var, g0Var, -9223372036854775807L, 0L, 1, null, false, r1Var, tVar, s1Var, g0Var, false, 1, 0, y0Var, 0L, 0L, 0L, 0L, false);
    }

    public final j1 a() {
        return new j1(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m, this.n, this.o, this.q, this.r, l(), SystemClock.elapsedRealtime(), this.p);
    }

    public final j1 b(boolean z10) {
        return new j1(this.a, this.b, this.c, this.d, this.e, this.f, z10, this.h, this.i, this.j, this.k, this.l, this.m, this.n, this.o, this.q, this.r, this.s, this.t, this.p);
    }

    public final j1 c(w2.g0 g0Var) {
        return new j1(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, g0Var, this.l, this.m, this.n, this.o, this.q, this.r, this.s, this.t, this.p);
    }

    public final j1 d(w2.g0 g0Var, long j10, long j11, long j12, long j13, w2.r1 r1Var, z2.t tVar, List list) {
        return new j1(this.a, g0Var, j11, j12, this.e, this.f, this.g, r1Var, tVar, list, this.k, this.l, this.m, this.n, this.o, this.q, j13, j10, SystemClock.elapsedRealtime(), this.p);
    }

    public final j1 e(int i3, int i10, boolean z10) {
        return new j1(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, z10, i3, i10, this.o, this.q, this.r, this.s, this.t, this.p);
    }

    public final j1 f(l lVar) {
        return new j1(this.a, this.b, this.c, this.d, this.e, lVar, this.g, this.h, this.i, this.j, this.k, this.l, this.m, this.n, this.o, this.q, this.r, this.s, this.t, this.p);
    }

    public final j1 g(d2.y0 y0Var) {
        return new j1(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m, this.n, y0Var, this.q, this.r, this.s, this.t, this.p);
    }

    public final j1 h(int i3) {
        return new j1(this.a, this.b, this.c, this.d, i3, this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m, this.n, this.o, this.q, this.r, this.s, this.t, this.p);
    }

    public final j1 i(boolean z10) {
        return new j1(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m, this.n, this.o, this.q, this.r, this.s, this.t, z10);
    }

    public final j1 j(d2.n1 n1Var) {
        return new j1(n1Var, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m, this.n, this.o, this.q, this.r, this.s, this.t, this.p);
    }

    public final long l() {
        long j10;
        long j11;
        if (!m()) {
            return this.s;
        }
        do {
            j10 = this.t;
            j11 = this.s;
        } while (j10 != this.t);
        return g2.n0.S(g2.n0.h0(j11) + ((long) ((SystemClock.elapsedRealtime() - j10) * this.o.a)));
    }

    public final boolean m() {
        return this.e == 3 && this.l && this.n == 0;
    }
}
