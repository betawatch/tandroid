package i2;

import android.os.SystemClock;
import e9.x1;
import java.util.List;

/* compiled from: r8-map-id-189a3a12219b7c214453a48fa9697387dfb8b2ca31ce3a2eba70ff5e2610a248 */
/* loaded from: classes.dex */
public final class i1 {
    public static final u2.g0 u = new u2.g0(new Object());
    public final b2.o1 a;
    public final u2.g0 b;
    public final long c;
    public final long d;
    public final int e;
    public final l f;
    public final boolean g;
    public final u2.r1 h;
    public final x2.t i;
    public final List j;
    public final u2.g0 k;
    public final boolean l;
    public final int m;
    public final int n;
    public final b2.z0 o;
    public final boolean p;
    public volatile long q;
    public volatile long r;
    public volatile long s;
    public volatile long t;

    public i1(b2.o1 o1Var, u2.g0 g0Var, long j10, long j11, int i10, l lVar, boolean z10, u2.r1 r1Var, x2.t tVar, List list, u2.g0 g0Var2, boolean z11, int i11, int i12, b2.z0 z0Var, long j12, long j13, long j14, long j15, boolean z12) {
        this.a = o1Var;
        this.b = g0Var;
        this.c = j10;
        this.d = j11;
        this.e = i10;
        this.f = lVar;
        this.g = z10;
        this.h = r1Var;
        this.i = tVar;
        this.j = list;
        this.k = g0Var2;
        this.l = z11;
        this.m = i11;
        this.n = i12;
        this.o = z0Var;
        this.q = j12;
        this.r = j13;
        this.s = j14;
        this.t = j15;
        this.p = z12;
    }

    public static i1 k(x2.t tVar) {
        b2.k1 k1Var = b2.o1.a;
        u2.r1 r1Var = u2.r1.d;
        x1 x1Var = x1.e;
        b2.z0 z0Var = b2.z0.d;
        u2.g0 g0Var = u;
        return new i1(k1Var, g0Var, -9223372036854775807L, 0L, 1, null, false, r1Var, tVar, x1Var, g0Var, false, 1, 0, z0Var, 0L, 0L, 0L, 0L, false);
    }

    public final i1 a() {
        return new i1(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m, this.n, this.o, this.q, this.r, l(), SystemClock.elapsedRealtime(), this.p);
    }

    public final i1 b(boolean z10) {
        return new i1(this.a, this.b, this.c, this.d, this.e, this.f, z10, this.h, this.i, this.j, this.k, this.l, this.m, this.n, this.o, this.q, this.r, this.s, this.t, this.p);
    }

    public final i1 c(u2.g0 g0Var) {
        return new i1(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, g0Var, this.l, this.m, this.n, this.o, this.q, this.r, this.s, this.t, this.p);
    }

    public final i1 d(u2.g0 g0Var, long j10, long j11, long j12, long j13, u2.r1 r1Var, x2.t tVar, List list) {
        return new i1(this.a, g0Var, j11, j12, this.e, this.f, this.g, r1Var, tVar, list, this.k, this.l, this.m, this.n, this.o, this.q, j13, j10, SystemClock.elapsedRealtime(), this.p);
    }

    public final i1 e(int i10, int i11, boolean z10) {
        return new i1(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, z10, i10, i11, this.o, this.q, this.r, this.s, this.t, this.p);
    }

    public final i1 f(l lVar) {
        return new i1(this.a, this.b, this.c, this.d, this.e, lVar, this.g, this.h, this.i, this.j, this.k, this.l, this.m, this.n, this.o, this.q, this.r, this.s, this.t, this.p);
    }

    public final i1 g(b2.z0 z0Var) {
        return new i1(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m, this.n, z0Var, this.q, this.r, this.s, this.t, this.p);
    }

    public final i1 h(int i10) {
        return new i1(this.a, this.b, this.c, this.d, i10, this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m, this.n, this.o, this.q, this.r, this.s, this.t, this.p);
    }

    public final i1 i(boolean z10) {
        return new i1(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m, this.n, this.o, this.q, this.r, this.s, this.t, z10);
    }

    public final i1 j(b2.o1 o1Var) {
        return new i1(o1Var, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m, this.n, this.o, this.q, this.r, this.s, this.t, this.p);
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
        return e2.m0.S(e2.m0.h0(j11) + ((long) ((SystemClock.elapsedRealtime() - j10) * this.o.a)));
    }

    public final boolean m() {
        return this.e == 3 && this.l && this.n == 0;
    }
}
