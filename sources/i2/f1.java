package i2;

import android.os.SystemClock;
import java.util.List;
import u2.q1;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes.dex */
public final class f1 {
    public static final u2.g0 u = new u2.g0(new Object());
    public final b2.k1 a;
    public final u2.g0 b;
    public final long c;
    public final long d;
    public final int e;
    public final n f;
    public final boolean g;
    public final q1 h;
    public final x2.v i;
    public final List j;
    public final u2.g0 k;
    public final boolean l;
    public final int m;
    public final int n;
    public final b2.v0 o;
    public final boolean p;
    public volatile long q;
    public volatile long r;
    public volatile long s;
    public volatile long t;

    public f1(b2.k1 k1Var, u2.g0 g0Var, long j3, long j10, int i10, n nVar, boolean z10, q1 q1Var, x2.v vVar, List list, u2.g0 g0Var2, boolean z11, int i11, int i12, b2.v0 v0Var, long j11, long j12, long j13, long j14, boolean z12) {
        this.a = k1Var;
        this.b = g0Var;
        this.c = j3;
        this.d = j10;
        this.e = i10;
        this.f = nVar;
        this.g = z10;
        this.h = q1Var;
        this.i = vVar;
        this.j = list;
        this.k = g0Var2;
        this.l = z11;
        this.m = i11;
        this.n = i12;
        this.o = v0Var;
        this.q = j11;
        this.r = j12;
        this.s = j13;
        this.t = j14;
        this.p = z12;
    }

    public static f1 k(x2.v vVar) {
        b2.g1 g1Var = b2.k1.a;
        q1 q1Var = q1.d;
        e9.a1 a1Var = e9.a1.e;
        b2.v0 v0Var = b2.v0.d;
        u2.g0 g0Var = u;
        return new f1(g1Var, g0Var, -9223372036854775807L, 0L, 1, null, false, q1Var, vVar, a1Var, g0Var, false, 1, 0, v0Var, 0L, 0L, 0L, 0L, false);
    }

    public final f1 a() {
        return new f1(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m, this.n, this.o, this.q, this.r, l(), SystemClock.elapsedRealtime(), this.p);
    }

    public final f1 b(boolean z10) {
        return new f1(this.a, this.b, this.c, this.d, this.e, this.f, z10, this.h, this.i, this.j, this.k, this.l, this.m, this.n, this.o, this.q, this.r, this.s, this.t, this.p);
    }

    public final f1 c(u2.g0 g0Var) {
        return new f1(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, g0Var, this.l, this.m, this.n, this.o, this.q, this.r, this.s, this.t, this.p);
    }

    public final f1 d(u2.g0 g0Var, long j3, long j10, long j11, long j12, q1 q1Var, x2.v vVar, List list) {
        return new f1(this.a, g0Var, j10, j11, this.e, this.f, this.g, q1Var, vVar, list, this.k, this.l, this.m, this.n, this.o, this.q, j12, j3, SystemClock.elapsedRealtime(), this.p);
    }

    public final f1 e(int i10, int i11, boolean z10) {
        return new f1(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, z10, i10, i11, this.o, this.q, this.r, this.s, this.t, this.p);
    }

    public final f1 f(n nVar) {
        return new f1(this.a, this.b, this.c, this.d, this.e, nVar, this.g, this.h, this.i, this.j, this.k, this.l, this.m, this.n, this.o, this.q, this.r, this.s, this.t, this.p);
    }

    public final f1 g(b2.v0 v0Var) {
        return new f1(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m, this.n, v0Var, this.q, this.r, this.s, this.t, this.p);
    }

    public final f1 h(int i10) {
        return new f1(this.a, this.b, this.c, this.d, i10, this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m, this.n, this.o, this.q, this.r, this.s, this.t, this.p);
    }

    public final f1 i(boolean z10) {
        return new f1(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m, this.n, this.o, this.q, this.r, this.s, this.t, z10);
    }

    public final f1 j(b2.k1 k1Var) {
        return new f1(k1Var, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m, this.n, this.o, this.q, this.r, this.s, this.t, this.p);
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
        return e2.d0.Q(e2.d0.e0(j10) + ((long) ((SystemClock.elapsedRealtime() - j3) * this.o.a)));
    }

    public final boolean m() {
        return this.e == 3 && this.l && this.n == 0;
    }
}
