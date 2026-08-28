package j4;

import h3.j2;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class k0 implements a0, z {
    public final a0 a;
    public final long b;
    public z c;

    public k0(a0 a0Var, long j10) {
        this.a = a0Var;
        this.b = j10;
    }

    @Override // j4.d1
    public final boolean b() {
        return this.a.b();
    }

    @Override // j4.c1
    public final void c(d1 d1Var) {
        z zVar = this.c;
        zVar.getClass();
        zVar.c(this);
    }

    @Override // j4.d1
    public final long d() {
        long d = this.a.d();
        if (d == Long.MIN_VALUE) {
            return Long.MIN_VALUE;
        }
        return d + this.b;
    }

    @Override // j4.z
    public final void f(a0 a0Var) {
        z zVar = this.c;
        zVar.getClass();
        zVar.f(this);
    }

    @Override // j4.a0
    public final void g() {
        this.a.g();
    }

    @Override // j4.a0
    public final long i(long j10) {
        long j11 = this.b;
        return this.a.i(j10 - j11) + j11;
    }

    @Override // j4.a0
    public final void k(long j10) {
        this.a.k(j10 - this.b);
    }

    @Override // j4.d1
    public final boolean n(long j10) {
        return this.a.n(j10 - this.b);
    }

    @Override // j4.a0
    public final long o() {
        long o6 = this.a.o();
        if (o6 == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        return o6 + this.b;
    }

    @Override // j4.a0
    public final j1 q() {
        return this.a.q();
    }

    @Override // j4.a0
    public final long u(long j10, j2 j2Var) {
        long j11 = this.b;
        return this.a.u(j10 - j11, j2Var) + j11;
    }

    @Override // j4.d1
    public final long v() {
        long v = this.a.v();
        if (v == Long.MIN_VALUE) {
            return Long.MIN_VALUE;
        }
        return v + this.b;
    }

    @Override // j4.a0
    public final void w(z zVar, long j10) {
        this.c = zVar;
        this.a.w(this, j10 - this.b);
    }

    @Override // j4.a0
    public final long x(b5.t[] tVarArr, boolean[] zArr, b1[] b1VarArr, boolean[] zArr2, long j10) {
        b1[] b1VarArr2 = new b1[b1VarArr.length];
        int i9 = 0;
        while (true) {
            b1 b1Var = null;
            if (i9 >= b1VarArr.length) {
                break;
            }
            l0 l0Var = (l0) b1VarArr[i9];
            if (l0Var != null) {
                b1Var = l0Var.a;
            }
            b1VarArr2[i9] = b1Var;
            i9++;
        }
        a0 a0Var = this.a;
        long j11 = this.b;
        long x10 = a0Var.x(tVarArr, zArr, b1VarArr2, zArr2, j10 - j11);
        for (int i10 = 0; i10 < b1VarArr.length; i10++) {
            b1 b1Var2 = b1VarArr2[i10];
            if (b1Var2 == null) {
                b1VarArr[i10] = null;
            } else {
                b1 b1Var3 = b1VarArr[i10];
                if (b1Var3 == null || ((l0) b1Var3).a != b1Var2) {
                    b1VarArr[i10] = new l0(b1Var2, j11);
                }
            }
        }
        return x10 + j11;
    }

    @Override // j4.d1
    public final void z(long j10) {
        this.a.z(j10 - this.b);
    }
}
