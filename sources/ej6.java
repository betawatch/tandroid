// default package

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
public final class ej6 implements sr6, rr6 {
    public final rx6 a;
    public final long b;
    public final mv6 c;
    public qg0 d;
    public sr6 e;
    public rr6 f;
    public long h = -9223372036854775807L;
    public boolean n;

    public ej6(rx6 rx6Var, mv6 mv6Var, long j) {
        this.a = rx6Var;
        this.c = mv6Var;
        this.b = j;
    }

    @Override // rr6
    public final void a(sr6 sr6Var) {
        rr6 rr6Var = this.f;
        String str = g8c.a;
        rr6Var.a(this);
    }

    @Override // p4a
    public final void b(q4a q4aVar) {
        rr6 rr6Var = this.f;
        String str = g8c.a;
        rr6Var.b(this);
    }

    public final void c(rx6 rx6Var) {
        long j = this.h;
        if (j == -9223372036854775807L) {
            j = this.b;
        }
        qg0 qg0Var = this.d;
        qg0Var.getClass();
        sr6 c = qg0Var.c(rx6Var, this.c, j);
        this.e = c;
        if (this.n) {
            c.f();
        }
        if (this.f != null) {
            this.e.p(this, j);
        }
    }

    @Override // q4a
    public final boolean d() {
        sr6 sr6Var = this.e;
        return sr6Var != null && sr6Var.d();
    }

    @Override // sr6
    public final long e(k64[] k64VarArr, boolean[] zArr, ip9[] ip9VarArr, boolean[] zArr2, long j) {
        long j2 = this.h;
        if (j2 != -9223372036854775807L && j == this.b) {
            j = j2;
        }
        this.h = -9223372036854775807L;
        sr6 sr6Var = this.e;
        String str = g8c.a;
        return sr6Var.e(k64VarArr, zArr, ip9VarArr, zArr2, j);
    }

    @Override // sr6
    public final void f() {
        this.n = true;
        sr6 sr6Var = this.e;
        if (sr6Var != null) {
            sr6Var.f();
        }
    }

    @Override // q4a
    public final long g() {
        sr6 sr6Var = this.e;
        String str = g8c.a;
        return sr6Var.g();
    }

    @Override // sr6
    public final long i(long j, gv9 gv9Var) {
        sr6 sr6Var = this.e;
        String str = g8c.a;
        return sr6Var.i(j, gv9Var);
    }

    @Override // sr6
    public final void k() {
        sr6 sr6Var = this.e;
        if (sr6Var != null) {
            sr6Var.k();
            return;
        }
        qg0 qg0Var = this.d;
        if (qg0Var != null) {
            qg0Var.k();
        }
    }

    @Override // sr6
    public final long l(long j) {
        sr6 sr6Var = this.e;
        String str = g8c.a;
        return sr6Var.l(j);
    }

    @Override // sr6
    public final void m(long j) {
        sr6 sr6Var = this.e;
        String str = g8c.a;
        sr6Var.m(j);
    }

    @Override // sr6
    public final long o() {
        sr6 sr6Var = this.e;
        String str = g8c.a;
        return sr6Var.o();
    }

    @Override // sr6
    public final void p(rr6 rr6Var, long j) {
        this.f = rr6Var;
        sr6 sr6Var = this.e;
        if (sr6Var != null) {
            long j2 = this.h;
            if (j2 == -9223372036854775807L) {
                j2 = this.b;
            }
            sr6Var.p(this, j2);
        }
    }

    @Override // sr6
    public final txb q() {
        sr6 sr6Var = this.e;
        String str = g8c.a;
        return sr6Var.q();
    }

    @Override // q4a
    public final boolean r(t86 t86Var) {
        sr6 sr6Var = this.e;
        return sr6Var != null && sr6Var.r(t86Var);
    }

    @Override // q4a
    public final long s() {
        sr6 sr6Var = this.e;
        String str = g8c.a;
        return sr6Var.s();
    }

    @Override // q4a
    public final void t(long j) {
        sr6 sr6Var = this.e;
        String str = g8c.a;
        sr6Var.t(j);
    }
}
