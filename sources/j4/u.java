package j4;

import h3.j2;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class u implements a0, z {
    public final d0 a;
    public final long b;
    public final com.google.android.exoplayer2.upstream.r c;
    public a d;
    public a0 e;
    public z f;
    public long h = -9223372036854775807L;

    public u(d0 d0Var, com.google.android.exoplayer2.upstream.r rVar, long j10) {
        this.a = d0Var;
        this.c = rVar;
        this.b = j10;
    }

    public final void a(d0 d0Var) {
        long j10 = this.h;
        if (j10 == -9223372036854775807L) {
            j10 = this.b;
        }
        a aVar = this.d;
        aVar.getClass();
        a0 b10 = aVar.b(d0Var, this.c, j10);
        this.e = b10;
        if (this.f != null) {
            b10.w(this, j10);
        }
    }

    @Override // j4.d1
    public final boolean b() {
        a0 a0Var = this.e;
        return a0Var != null && a0Var.b();
    }

    @Override // j4.c1
    public final void c(d1 d1Var) {
        z zVar = this.f;
        int i9 = d5.f0.a;
        zVar.c(this);
    }

    @Override // j4.d1
    public final long d() {
        a0 a0Var = this.e;
        int i9 = d5.f0.a;
        return a0Var.d();
    }

    @Override // j4.z
    public final void f(a0 a0Var) {
        z zVar = this.f;
        int i9 = d5.f0.a;
        zVar.f(this);
    }

    @Override // j4.a0
    public final void g() {
        a0 a0Var = this.e;
        if (a0Var != null) {
            a0Var.g();
            return;
        }
        a aVar = this.d;
        if (aVar != null) {
            aVar.j();
        }
    }

    @Override // j4.a0
    public final long i(long j10) {
        a0 a0Var = this.e;
        int i9 = d5.f0.a;
        return a0Var.i(j10);
    }

    @Override // j4.a0
    public final void k(long j10) {
        a0 a0Var = this.e;
        int i9 = d5.f0.a;
        a0Var.k(j10);
    }

    @Override // j4.d1
    public final boolean n(long j10) {
        a0 a0Var = this.e;
        return a0Var != null && a0Var.n(j10);
    }

    @Override // j4.a0
    public final long o() {
        a0 a0Var = this.e;
        int i9 = d5.f0.a;
        return a0Var.o();
    }

    @Override // j4.a0
    public final j1 q() {
        a0 a0Var = this.e;
        int i9 = d5.f0.a;
        return a0Var.q();
    }

    @Override // j4.a0
    public final long u(long j10, j2 j2Var) {
        a0 a0Var = this.e;
        int i9 = d5.f0.a;
        return a0Var.u(j10, j2Var);
    }

    @Override // j4.d1
    public final long v() {
        a0 a0Var = this.e;
        int i9 = d5.f0.a;
        return a0Var.v();
    }

    @Override // j4.a0
    public final void w(z zVar, long j10) {
        this.f = zVar;
        a0 a0Var = this.e;
        if (a0Var != null) {
            long j11 = this.h;
            if (j11 == -9223372036854775807L) {
                j11 = this.b;
            }
            a0Var.w(this, j11);
        }
    }

    @Override // j4.a0
    public final long x(b5.t[] tVarArr, boolean[] zArr, b1[] b1VarArr, boolean[] zArr2, long j10) {
        long j11;
        long j12 = this.h;
        if (j12 == -9223372036854775807L || j10 != this.b) {
            j11 = j10;
        } else {
            this.h = -9223372036854775807L;
            j11 = j12;
        }
        a0 a0Var = this.e;
        int i9 = d5.f0.a;
        return a0Var.x(tVarArr, zArr, b1VarArr, zArr2, j11);
    }

    @Override // j4.d1
    public final void z(long j10) {
        a0 a0Var = this.e;
        int i9 = d5.f0.a;
        a0Var.z(j10);
    }
}
