// default package

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes.dex */
public final class na3 {
    public final o31 a;
    public final ub9 b;
    public final xg0 c;
    public final j63 d;
    public final long e;
    public final long f;

    public na3(long j, ub9 ub9Var, xg0 xg0Var, o31 o31Var, long j2, j63 j63Var) {
        this.e = j;
        this.b = ub9Var;
        this.c = xg0Var;
        this.f = j2;
        this.a = o31Var;
        this.d = j63Var;
    }

    public final na3 a(long j, ub9 ub9Var) {
        long I;
        j63 b = this.b.b();
        j63 b2 = ub9Var.b();
        if (b == null || b2 == null || !b.R() || b.Y(j) == 0 || b2.Y(j) == 0) {
            return new na3(j, ub9Var, this.c, this.a, this.f, b2);
        }
        long Y = b.Y(j);
        long V = b.V();
        long f = b.f(V);
        long j2 = Y + V;
        long j3 = j2 - 1;
        long j4 = b.j(j3, j) + b.f(j3);
        long V2 = b2.V();
        long f2 = b2.f(V2);
        long j5 = this.f;
        if (j4 == f2) {
            I = (j2 - V2) + j5;
        } else {
            if (j4 < f2) {
                throw new kh0();
            }
            I = f2 < f ? j5 - (b2.I(f, j) - V) : (b.I(f2, j) - V2) + j5;
        }
        return new na3(j, ub9Var, this.c, this.a, I, b2);
    }

    public final long b(long j) {
        j63 j63Var = this.d;
        j63Var.getClass();
        long j2 = this.e;
        long r = j63Var.r(j2, j) + this.f;
        j63Var.getClass();
        return (j63Var.a0(j2, j) + r) - 1;
    }

    public final long c() {
        j63 j63Var = this.d;
        j63Var.getClass();
        return j63Var.Y(this.e);
    }

    public final long d(long j) {
        long e = e(j);
        j63 j63Var = this.d;
        j63Var.getClass();
        return j63Var.j(j - this.f, this.e) + e;
    }

    public final long e(long j) {
        j63 j63Var = this.d;
        j63Var.getClass();
        return j63Var.f(j - this.f);
    }

    public final boolean f(long j, long j2) {
        j63 j63Var = this.d;
        j63Var.getClass();
        return j63Var.R() || j2 == -9223372036854775807L || d(j) <= j2;
    }
}
