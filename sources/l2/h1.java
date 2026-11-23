package l2;

import android.os.SystemClock;
import h9.s1;
import java.util.List;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes.dex */
public final class h1 {
    public static final x2.g0 u = new x2.g0(new Object());
    public final e2.l1 a;
    public final x2.g0 b;
    public final long c;
    public final long d;
    public final int e;
    public final m f;
    public final boolean g;
    public final x2.r1 h;
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

    public h1(e2.l1 l1Var, x2.g0 g0Var, long j3, long j10, int i7, m mVar, boolean z10, x2.r1 r1Var, a3.y yVar, List list, x2.g0 g0Var2, boolean z11, int i10, int i11, e2.w0 w0Var, long j11, long j12, long j13, long j14, boolean z12) {
        this.a = l1Var;
        this.b = g0Var;
        this.c = j3;
        this.d = j10;
        this.e = i7;
        this.f = mVar;
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

    public static h1 k(a3.y yVar) {
        e2.h1 h1Var = e2.l1.a;
        x2.r1 r1Var = x2.r1.d;
        s1 s1Var = s1.e;
        e2.w0 w0Var = e2.w0.d;
        x2.g0 g0Var = u;
        return new h1(h1Var, g0Var, -9223372036854775807L, 0L, 1, null, false, r1Var, yVar, s1Var, g0Var, false, 1, 0, w0Var, 0L, 0L, 0L, 0L, false);
    }

    public final h1 a() {
        return new h1(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m, this.n, this.o, this.q, this.r, l(), SystemClock.elapsedRealtime(), this.p);
    }

    public final h1 b(boolean z10) {
        return new h1(this.a, this.b, this.c, this.d, this.e, this.f, z10, this.h, this.i, this.j, this.k, this.l, this.m, this.n, this.o, this.q, this.r, this.s, this.t, this.p);
    }

    public final h1 c(x2.g0 g0Var) {
        return new h1(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, g0Var, this.l, this.m, this.n, this.o, this.q, this.r, this.s, this.t, this.p);
    }

    public final h1 d(x2.g0 g0Var, long j3, long j10, long j11, long j12, x2.r1 r1Var, a3.y yVar, List list) {
        return new h1(this.a, g0Var, j10, j11, this.e, this.f, this.g, r1Var, yVar, list, this.k, this.l, this.m, this.n, this.o, this.q, j12, j3, SystemClock.elapsedRealtime(), this.p);
    }

    public final h1 e(int i7, int i10, boolean z10) {
        return new h1(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, z10, i7, i10, this.o, this.q, this.r, this.s, this.t, this.p);
    }

    public final h1 f(m mVar) {
        return new h1(this.a, this.b, this.c, this.d, this.e, mVar, this.g, this.h, this.i, this.j, this.k, this.l, this.m, this.n, this.o, this.q, this.r, this.s, this.t, this.p);
    }

    public final h1 g(e2.w0 w0Var) {
        return new h1(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m, this.n, w0Var, this.q, this.r, this.s, this.t, this.p);
    }

    public final h1 h(int i7) {
        return new h1(this.a, this.b, this.c, this.d, i7, this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m, this.n, this.o, this.q, this.r, this.s, this.t, this.p);
    }

    public final h1 i(boolean z10) {
        return new h1(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m, this.n, this.o, this.q, this.r, this.s, this.t, z10);
    }

    public final h1 j(e2.l1 l1Var) {
        return new h1(l1Var, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m, this.n, this.o, this.q, this.r, this.s, this.t, this.p);
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
