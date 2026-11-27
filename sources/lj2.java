// default package

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes.dex */
public final class lj2 implements xt6, wt6 {
    public final xt6 a;
    public wt6 b;
    public kj2[] c = new kj2[0];
    public long d;
    public boolean e;
    public boolean f;
    public long h;
    public long n;
    public long r;
    public nj2 s;

    public lj2(xt6 xt6Var, boolean z, long j, long j2, int i) {
        this.a = xt6Var;
        this.d = z ? j : -9223372036854775807L;
        this.h = -9223372036854775807L;
        this.n = j;
        this.r = j2;
    }

    @Override // wt6
    public final void a(xt6 xt6Var) {
        if (this.s != null) {
            return;
        }
        wt6 wt6Var = this.b;
        wt6Var.getClass();
        wt6Var.a(this);
    }

    public final boolean b() {
        return (this.d == -9223372036854775807L || this.e) ? false : true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x007c, code lost:
    
        if (r4 == false) goto L34;
     */
    @Override // xt6
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final long c(e74[] e74VarArr, boolean[] zArr, at9[] at9VarArr, boolean[] zArr2, long j) {
        boolean z;
        e74 e74Var;
        this.c = new kj2[at9VarArr.length];
        at9[] at9VarArr2 = new at9[at9VarArr.length];
        int i = 0;
        while (true) {
            at9 at9Var = null;
            if (i >= at9VarArr.length) {
                break;
            }
            kj2[] kj2VarArr = this.c;
            kj2 kj2Var = (kj2) at9VarArr[i];
            kj2VarArr[i] = kj2Var;
            if (kj2Var != null) {
                at9Var = kj2Var.a;
            }
            at9VarArr2[i] = at9Var;
            i++;
        }
        long c = this.a.c(e74VarArr, zArr, at9VarArr2, zArr2, j);
        long j2 = this.r;
        long max = Math.max(c, j);
        if (j2 != Long.MIN_VALUE) {
            max = Math.min(max, j2);
        }
        int i2 = 0;
        boolean z2 = false;
        while (true) {
            boolean z3 = true;
            if (i2 >= at9VarArr.length) {
                break;
            }
            at9 at9Var2 = at9VarArr2[i2];
            kj2[] kj2VarArr2 = this.c;
            if (at9Var2 == null) {
                kj2VarArr2[i2] = null;
            } else {
                kj2 kj2Var2 = kj2VarArr2[i2];
                if (kj2Var2 == null || kj2Var2.a != at9Var2) {
                    if (b()) {
                        if (c < j) {
                            z = true;
                        } else if (c == 0 || (e74Var = e74VarArr[i2]) == null) {
                            z = false;
                        } else {
                            ko4 n = e74Var.n();
                            z = !eg7.a(n.t, n.l);
                        }
                    }
                    z3 = false;
                    kj2[] kj2VarArr3 = this.c;
                    at9 at9Var3 = at9VarArr2[i2];
                    at9Var3.getClass();
                    kj2VarArr3[i2] = new kj2(this, at9Var3, z3);
                    z2 |= z3;
                }
            }
            at9VarArr[i2] = this.c[i2];
            i2++;
        }
        this.d = z2 ? max : -9223372036854775807L;
        if (this.f) {
            this.e = true;
        }
        return max;
    }

    @Override // xt6
    public final void d() {
        this.f = true;
        this.a.d();
    }

    @Override // i8a
    public final boolean e() {
        return this.a.e();
    }

    @Override // h8a
    public final void f(i8a i8aVar) {
        wt6 wt6Var = this.b;
        wt6Var.getClass();
        wt6Var.f(this);
    }

    @Override // i8a
    public final long h() {
        long h = this.a.h();
        if (h != Long.MIN_VALUE) {
            long j = this.r;
            if (j == Long.MIN_VALUE || h < j) {
                return h;
            }
        }
        return Long.MIN_VALUE;
    }

    @Override // xt6
    public final long j(long j, az9 az9Var) {
        long j2 = this.n;
        if (j == j2) {
            return j2;
        }
        long j3 = gcc.j(az9Var.a, 0L, j - j2);
        long j4 = az9Var.b;
        long j5 = this.r;
        long j6 = gcc.j(j4, 0L, j5 == Long.MIN_VALUE ? Long.MAX_VALUE : j5 - j);
        if (j3 != az9Var.a || j6 != az9Var.b) {
            az9Var = new az9(j3, j6);
        }
        return this.a.j(j, az9Var);
    }

    @Override // xt6
    public final void l() {
        nj2 nj2Var = this.s;
        if (nj2Var != null) {
            throw nj2Var;
        }
        this.a.l();
    }

    @Override // xt6
    public final long m(long j) {
        this.d = -9223372036854775807L;
        for (kj2 kj2Var : this.c) {
            if (kj2Var != null) {
                kj2Var.c = false;
            }
        }
        long m = this.a.m(j);
        long j2 = this.n;
        long j3 = this.r;
        long max = Math.max(m, j2);
        return j3 != Long.MIN_VALUE ? Math.min(max, j3) : max;
    }

    @Override // xt6
    public final void n(long j) {
        this.a.n(j);
    }

    @Override // xt6
    public final long p() {
        if (b()) {
            this.e = true;
            long j = this.d;
            this.d = -9223372036854775807L;
            this.h = j;
            long p = p();
            return p != -9223372036854775807L ? p : j;
        }
        long p2 = this.a.p();
        if (p2 != -9223372036854775807L) {
            long j2 = this.n;
            long j3 = this.r;
            long max = Math.max(p2, j2);
            if (j3 != Long.MIN_VALUE) {
                max = Math.min(max, j3);
            }
            if (max != this.h) {
                this.h = max;
                return max;
            }
        }
        return -9223372036854775807L;
    }

    @Override // xt6
    public final void q(wt6 wt6Var, long j) {
        this.b = wt6Var;
        this.a.q(this, j);
    }

    @Override // xt6
    public final u1c r() {
        return this.a.r();
    }

    @Override // i8a
    public final boolean s(xa6 xa6Var) {
        return this.a.s(xa6Var);
    }

    @Override // i8a
    public final long t() {
        long t = this.a.t();
        if (t != Long.MIN_VALUE) {
            long j = this.r;
            if (j == Long.MIN_VALUE || t < j) {
                return t;
            }
        }
        return Long.MIN_VALUE;
    }

    @Override // i8a
    public final void u(long j) {
        this.a.u(j);
    }
}
