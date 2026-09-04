package c3;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes.dex */
public final class y implements b0 {
    public final c5.b0 a;
    public final c5.b0 b;
    public long c;

    public y(long j3, long[] jArr, long[] jArr2) {
        e2.d.b(jArr.length == jArr2.length);
        int length = jArr2.length;
        if (length <= 0 || jArr2[0] <= 0) {
            this.a = new c5.b0(length, 2);
            this.b = new c5.b0(length, 2);
        } else {
            int i10 = length + 1;
            c5.b0 b0Var = new c5.b0(i10, 2);
            this.a = b0Var;
            c5.b0 b0Var2 = new c5.b0(i10, 2);
            this.b = b0Var2;
            b0Var.c(0L);
            b0Var2.c(0L);
        }
        this.a.d(jArr);
        this.b.d(jArr2);
        this.c = j3;
    }

    @Override // c3.b0
    public final boolean f() {
        return this.b.b > 0;
    }

    @Override // c3.b0
    public final a0 j(long j3) {
        c5.b0 b0Var = this.b;
        if (b0Var.b == 0) {
            c0 c0Var = c0.c;
            return new a0(c0Var, c0Var);
        }
        int b10 = e2.d0.b(b0Var, j3);
        long f7 = b0Var.f(b10);
        c5.b0 b0Var2 = this.a;
        c0 c0Var2 = new c0(f7, b0Var2.f(b10));
        if (f7 == j3 || b10 == b0Var.b - 1) {
            return new a0(c0Var2, c0Var2);
        }
        int i10 = b10 + 1;
        return new a0(c0Var2, new c0(b0Var.f(i10), b0Var2.f(i10)));
    }

    @Override // c3.b0
    public final long l() {
        return this.c;
    }
}
