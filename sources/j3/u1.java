package j3;

import android.os.SystemClock;
import java.util.List;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes.dex */
public final class u1 {
    public static final o4.v t = new o4.v(new Object());
    public final o2 a;
    public final o4.v b;
    public final long c;
    public final long d;
    public final int e;
    public final n f;
    public final boolean g;
    public final o4.t0 h;
    public final f5.x i;
    public final List j;
    public final o4.v k;
    public final boolean l;
    public final int m;
    public final v1 n;
    public final boolean o;
    public volatile long p;
    public volatile long q;
    public volatile long r;
    public volatile long s;

    public u1(o2 o2Var, o4.v vVar, long j10, long j11, int i10, n nVar, boolean z4, o4.t0 t0Var, f5.x xVar, List list, o4.v vVar2, boolean z10, int i11, v1 v1Var, long j12, long j13, long j14, long j15, boolean z11) {
        this.a = o2Var;
        this.b = vVar;
        this.c = j10;
        this.d = j11;
        this.e = i10;
        this.f = nVar;
        this.g = z4;
        this.h = t0Var;
        this.i = xVar;
        this.j = list;
        this.k = vVar2;
        this.l = z10;
        this.m = i11;
        this.n = v1Var;
        this.p = j12;
        this.q = j13;
        this.r = j14;
        this.s = j15;
        this.o = z11;
    }

    public static u1 i(f5.x xVar) {
        l2 l2Var = o2.a;
        o4.t0 t0Var = o4.t0.d;
        s8.i0 i0Var = s8.i0.e;
        v1 v1Var = v1.d;
        o4.v vVar = t;
        return new u1(l2Var, vVar, -9223372036854775807L, 0L, 1, null, false, t0Var, xVar, i0Var, vVar, false, 0, v1Var, 0L, 0L, 0L, 0L, false);
    }

    public final u1 a() {
        return new u1(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m, this.n, this.p, this.q, j(), SystemClock.elapsedRealtime(), this.o);
    }

    public final u1 b(o4.v vVar) {
        return new u1(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, vVar, this.l, this.m, this.n, this.p, this.q, this.r, this.s, this.o);
    }

    public final u1 c(o4.v vVar, long j10, long j11, long j12, long j13, o4.t0 t0Var, f5.x xVar, List list) {
        return new u1(this.a, vVar, j11, j12, this.e, this.f, this.g, t0Var, xVar, list, this.k, this.l, this.m, this.n, this.p, j13, j10, SystemClock.elapsedRealtime(), this.o);
    }

    public final u1 d(int i10, boolean z4) {
        return new u1(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, z4, i10, this.n, this.p, this.q, this.r, this.s, this.o);
    }

    public final u1 e(n nVar) {
        return new u1(this.a, this.b, this.c, this.d, this.e, nVar, this.g, this.h, this.i, this.j, this.k, this.l, this.m, this.n, this.p, this.q, this.r, this.s, this.o);
    }

    public final u1 f(v1 v1Var) {
        return new u1(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m, v1Var, this.p, this.q, this.r, this.s, this.o);
    }

    public final u1 g(int i10) {
        return new u1(this.a, this.b, this.c, this.d, i10, this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m, this.n, this.p, this.q, this.r, this.s, this.o);
    }

    public final u1 h(o2 o2Var) {
        return new u1(o2Var, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m, this.n, this.p, this.q, this.r, this.s, this.o);
    }

    public final long j() {
        long j10;
        long j11;
        if (!k()) {
            return this.r;
        }
        do {
            j10 = this.s;
            j11 = this.r;
        } while (j10 != this.s);
        return h5.d0.G(h5.d0.S(j11) + ((long) ((SystemClock.elapsedRealtime() - j10) * this.n.a)));
    }

    public final boolean k() {
        return this.e == 3 && this.l && this.m == 0;
    }
}
