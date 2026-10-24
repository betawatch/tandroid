package c3;

import v7.u6;

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
/* loaded from: classes.dex */
public final class b0 implements e0 {
    public final c5.c0 a;
    public final c5.c0 b;
    public long c;

    public b0(long j10, long[] jArr, long[] jArr2) {
        u6.g(jArr.length == jArr2.length);
        int length = jArr2.length;
        if (length <= 0 || jArr2[0] <= 0) {
            this.a = new c5.c0(length, 3);
            this.b = new c5.c0(length, 3);
        } else {
            int i10 = length + 1;
            c5.c0 c0Var = new c5.c0(i10, 3);
            this.a = c0Var;
            c5.c0 c0Var2 = new c5.c0(i10, 3);
            this.b = c0Var2;
            c0Var.e(0L);
            c0Var2.e(0L);
        }
        this.a.f(jArr);
        this.b.f(jArr2);
        this.c = j10;
    }

    @Override // c3.e0
    public final boolean d() {
        return this.b.b > 0;
    }

    @Override // c3.e0
    public final /* synthetic */ boolean e() {
        return false;
    }

    @Override // c3.e0
    public final d0 f(long j10) {
        c5.c0 c0Var = this.b;
        if (c0Var.b == 0) {
            f0 f0Var = f0.c;
            return new d0(f0Var, f0Var);
        }
        int c10 = e2.m0.c(c0Var, j10);
        long n10 = c0Var.n(c10);
        c5.c0 c0Var2 = this.a;
        f0 f0Var2 = new f0(n10, c0Var2.n(c10));
        if (n10 == j10 || c10 == c0Var.b - 1) {
            return new d0(f0Var2, f0Var2);
        }
        int i10 = c10 + 1;
        return new d0(f0Var2, new f0(c0Var.n(i10), c0Var2.n(i10)));
    }

    @Override // c3.e0
    public final long h() {
        return this.c;
    }
}
