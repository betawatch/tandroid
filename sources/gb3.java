// default package

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class gb3 {
    public final n41 a;
    public final ka9 b;
    public final wh0 c;
    public final d73 d;
    public final long e;
    public final long f;

    public gb3(long j, ka9 ka9Var, wh0 wh0Var, n41 n41Var, long j2, d73 d73Var) {
        this.e = j;
        this.b = ka9Var;
        this.c = wh0Var;
        this.f = j2;
        this.a = n41Var;
        this.d = d73Var;
    }

    public final gb3 a(long j, ka9 ka9Var) {
        long J;
        d73 b = this.b.b();
        d73 b2 = ka9Var.b();
        if (b == null || b2 == null || !b.T() || b.X(j) == 0 || b2.X(j) == 0) {
            return new gb3(j, ka9Var, this.c, this.a, this.f, b2);
        }
        long X = b.X(j);
        long V = b.V();
        long e = b.e(V);
        long j2 = X + V;
        long j3 = j2 - 1;
        long j4 = b.j(j3, j) + b.e(j3);
        long V2 = b2.V();
        long e2 = b2.e(V2);
        long j5 = this.f;
        if (j4 == e2) {
            J = (j2 - V2) + j5;
        } else {
            if (j4 < e2) {
                throw new ji0();
            }
            J = e2 < e ? j5 - (b2.J(e, j) - V) : (b.J(e2, j) - V2) + j5;
        }
        return new gb3(j, ka9Var, this.c, this.a, J, b2);
    }

    public final long b(long j) {
        d73 d73Var = this.d;
        d73Var.getClass();
        long j2 = this.e;
        long m = d73Var.m(j2, j) + this.f;
        d73Var.getClass();
        return (d73Var.e0(j2, j) + m) - 1;
    }

    public final long c() {
        d73 d73Var = this.d;
        d73Var.getClass();
        return d73Var.X(this.e);
    }

    public final long d(long j) {
        long e = e(j);
        d73 d73Var = this.d;
        d73Var.getClass();
        return d73Var.j(j - this.f, this.e) + e;
    }

    public final long e(long j) {
        d73 d73Var = this.d;
        d73Var.getClass();
        return d73Var.e(j - this.f);
    }

    public final boolean f(long j, long j2) {
        d73 d73Var = this.d;
        d73Var.getClass();
        return d73Var.T() || j2 == -9223372036854775807L || d(j) <= j2;
    }
}
