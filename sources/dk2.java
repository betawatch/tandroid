// default package

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class dk2 implements tt6, st6 {
    public final tt6 a;
    public st6 b;
    public ck2[] c = new ck2[0];
    public long d;
    public boolean e;
    public boolean f;
    public long h;
    public long n;
    public long r;
    public fk2 s;

    public dk2(tt6 tt6Var, boolean z, long j, long j2, int i) {
        this.a = tt6Var;
        this.d = z ? j : -9223372036854775807L;
        this.h = -9223372036854775807L;
        this.n = j;
        this.r = j2;
    }

    @Override // st6
    public final void a(tt6 tt6Var) {
        if (this.s != null) {
            return;
        }
        st6 st6Var = this.b;
        st6Var.getClass();
        st6Var.a(this);
    }

    @Override // r6a
    public final void b(s6a s6aVar) {
        st6 st6Var = this.b;
        st6Var.getClass();
        st6Var.b(this);
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x007c, code lost:
    
        if (r4 == false) goto L34;
     */
    @Override // tt6
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final long c(t74[] t74VarArr, boolean[] zArr, jr9[] jr9VarArr, boolean[] zArr2, long j) {
        boolean z;
        t74 t74Var;
        this.c = new ck2[jr9VarArr.length];
        jr9[] jr9VarArr2 = new jr9[jr9VarArr.length];
        int i = 0;
        while (true) {
            jr9 jr9Var = null;
            if (i >= jr9VarArr.length) {
                break;
            }
            ck2[] ck2VarArr = this.c;
            ck2 ck2Var = (ck2) jr9VarArr[i];
            ck2VarArr[i] = ck2Var;
            if (ck2Var != null) {
                jr9Var = ck2Var.a;
            }
            jr9VarArr2[i] = jr9Var;
            i++;
        }
        long c = this.a.c(t74VarArr, zArr, jr9VarArr2, zArr2, j);
        long j2 = this.r;
        long max = Math.max(c, j);
        if (j2 != Long.MIN_VALUE) {
            max = Math.min(max, j2);
        }
        int i2 = 0;
        boolean z2 = false;
        while (true) {
            boolean z3 = true;
            if (i2 >= jr9VarArr.length) {
                break;
            }
            jr9 jr9Var2 = jr9VarArr2[i2];
            ck2[] ck2VarArr2 = this.c;
            if (jr9Var2 == null) {
                ck2VarArr2[i2] = null;
            } else {
                ck2 ck2Var2 = ck2VarArr2[i2];
                if (ck2Var2 == null || ck2Var2.a != jr9Var2) {
                    if (d()) {
                        if (c < j) {
                            z = true;
                        } else if (c == 0 || (t74Var = t74VarArr[i2]) == null) {
                            z = false;
                        } else {
                            go4 o = t74Var.o();
                            z = !wf7.a(o.t, o.l);
                        }
                    }
                    z3 = false;
                    ck2[] ck2VarArr3 = this.c;
                    jr9 jr9Var3 = jr9VarArr2[i2];
                    jr9Var3.getClass();
                    ck2VarArr3[i2] = new ck2(this, jr9Var3, z3);
                    z2 |= z3;
                }
            }
            jr9VarArr[i2] = this.c[i2];
            i2++;
        }
        this.d = z2 ? max : -9223372036854775807L;
        if (this.f) {
            this.e = true;
        }
        return max;
    }

    public final boolean d() {
        return (this.d == -9223372036854775807L || this.e) ? false : true;
    }

    @Override // tt6
    public final void e() {
        this.f = true;
        this.a.e();
    }

    @Override // s6a
    public final boolean f() {
        return this.a.f();
    }

    @Override // s6a
    public final long g() {
        long g = this.a.g();
        if (g != Long.MIN_VALUE) {
            long j = this.r;
            if (j == Long.MIN_VALUE || g < j) {
                return g;
            }
        }
        return Long.MIN_VALUE;
    }

    @Override // tt6
    public final long h(long j, jx9 jx9Var) {
        long j2 = this.n;
        if (j == j2) {
            return j2;
        }
        long j3 = hac.j(jx9Var.a, 0L, j - j2);
        long j4 = jx9Var.b;
        long j5 = this.r;
        long j6 = hac.j(j4, 0L, j5 == Long.MIN_VALUE ? Long.MAX_VALUE : j5 - j);
        if (j3 != jx9Var.a || j6 != jx9Var.b) {
            jx9Var = new jx9(j3, j6);
        }
        return this.a.h(j, jx9Var);
    }

    @Override // tt6
    public final void j() {
        fk2 fk2Var = this.s;
        if (fk2Var != null) {
            throw fk2Var;
        }
        this.a.j();
    }

    @Override // tt6
    public final long k(long j) {
        this.d = -9223372036854775807L;
        for (ck2 ck2Var : this.c) {
            if (ck2Var != null) {
                ck2Var.c = false;
            }
        }
        long k = this.a.k(j);
        long j2 = this.n;
        long j3 = this.r;
        long max = Math.max(k, j2);
        return j3 != Long.MIN_VALUE ? Math.min(max, j3) : max;
    }

    @Override // tt6
    public final void l(long j) {
        this.a.l(j);
    }

    @Override // tt6
    public final long n() {
        if (d()) {
            this.e = true;
            long j = this.d;
            this.d = -9223372036854775807L;
            this.h = j;
            long n = n();
            return n != -9223372036854775807L ? n : j;
        }
        long n2 = this.a.n();
        if (n2 != -9223372036854775807L) {
            long j2 = this.n;
            long j3 = this.r;
            long max = Math.max(n2, j2);
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

    @Override // tt6
    public final void o(st6 st6Var, long j) {
        this.b = st6Var;
        this.a.o(this, j);
    }

    @Override // tt6
    public final vzb q() {
        return this.a.q();
    }

    @Override // s6a
    public final boolean r(sa6 sa6Var) {
        return this.a.r(sa6Var);
    }

    @Override // s6a
    public final long s() {
        long s = this.a.s();
        if (s != Long.MIN_VALUE) {
            long j = this.r;
            if (j == Long.MIN_VALUE || s < j) {
                return s;
            }
        }
        return Long.MIN_VALUE;
    }

    @Override // s6a
    public final void t(long j) {
        this.a.t(j);
    }
}
