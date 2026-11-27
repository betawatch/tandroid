// default package

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes.dex */
public final class jl6 implements xt6, wt6 {
    public final vz6 a;
    public final long b;
    public final rx6 c;
    public rg0 d;
    public xt6 e;
    public wt6 f;
    public long h = -9223372036854775807L;
    public boolean n;

    public jl6(vz6 vz6Var, rx6 rx6Var, long j) {
        this.a = vz6Var;
        this.c = rx6Var;
        this.b = j;
    }

    @Override // wt6
    public final void a(xt6 xt6Var) {
        wt6 wt6Var = this.f;
        String str = gcc.a;
        wt6Var.a(this);
    }

    public final void b(vz6 vz6Var) {
        long j = this.h;
        if (j == -9223372036854775807L) {
            j = this.b;
        }
        rg0 rg0Var = this.d;
        rg0Var.getClass();
        xt6 c = rg0Var.c(vz6Var, this.c, j);
        this.e = c;
        if (this.n) {
            c.d();
        }
        if (this.f != null) {
            this.e.q(this, j);
        }
    }

    @Override // xt6
    public final long c(e74[] e74VarArr, boolean[] zArr, at9[] at9VarArr, boolean[] zArr2, long j) {
        long j2 = this.h;
        if (j2 != -9223372036854775807L && j == this.b) {
            j = j2;
        }
        this.h = -9223372036854775807L;
        xt6 xt6Var = this.e;
        String str = gcc.a;
        return xt6Var.c(e74VarArr, zArr, at9VarArr, zArr2, j);
    }

    @Override // xt6
    public final void d() {
        this.n = true;
        xt6 xt6Var = this.e;
        if (xt6Var != null) {
            xt6Var.d();
        }
    }

    @Override // i8a
    public final boolean e() {
        xt6 xt6Var = this.e;
        return xt6Var != null && xt6Var.e();
    }

    @Override // h8a
    public final void f(i8a i8aVar) {
        wt6 wt6Var = this.f;
        String str = gcc.a;
        wt6Var.f(this);
    }

    @Override // i8a
    public final long h() {
        xt6 xt6Var = this.e;
        String str = gcc.a;
        return xt6Var.h();
    }

    @Override // xt6
    public final long j(long j, az9 az9Var) {
        xt6 xt6Var = this.e;
        String str = gcc.a;
        return xt6Var.j(j, az9Var);
    }

    @Override // xt6
    public final void l() {
        xt6 xt6Var = this.e;
        if (xt6Var != null) {
            xt6Var.l();
            return;
        }
        rg0 rg0Var = this.d;
        if (rg0Var != null) {
            rg0Var.k();
        }
    }

    @Override // xt6
    public final long m(long j) {
        xt6 xt6Var = this.e;
        String str = gcc.a;
        return xt6Var.m(j);
    }

    @Override // xt6
    public final void n(long j) {
        xt6 xt6Var = this.e;
        String str = gcc.a;
        xt6Var.n(j);
    }

    @Override // xt6
    public final long p() {
        xt6 xt6Var = this.e;
        String str = gcc.a;
        return xt6Var.p();
    }

    @Override // xt6
    public final void q(wt6 wt6Var, long j) {
        this.f = wt6Var;
        xt6 xt6Var = this.e;
        if (xt6Var != null) {
            long j2 = this.h;
            if (j2 == -9223372036854775807L) {
                j2 = this.b;
            }
            xt6Var.q(this, j2);
        }
    }

    @Override // xt6
    public final u1c r() {
        xt6 xt6Var = this.e;
        String str = gcc.a;
        return xt6Var.r();
    }

    @Override // i8a
    public final boolean s(xa6 xa6Var) {
        xt6 xt6Var = this.e;
        return xt6Var != null && xt6Var.s(xa6Var);
    }

    @Override // i8a
    public final long t() {
        xt6 xt6Var = this.e;
        String str = gcc.a;
        return xt6Var.t();
    }

    @Override // i8a
    public final void u(long j) {
        xt6 xt6Var = this.e;
        String str = gcc.a;
        xt6Var.u(j);
    }
}
