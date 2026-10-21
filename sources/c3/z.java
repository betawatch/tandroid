package c3;

import e2.m0;
import v7.u6;

/* compiled from: r8-map-id-54f46d3192cfcf06f3cb7093cda92e459a80ef6ed91a766593a44d0f1cb126c7 */
/* loaded from: classes.dex */
public final class z implements c0 {
    public final c5.c0 a;
    public final c5.c0 b;
    public long c;

    public z(long j10, long[] jArr, long[] jArr2) {
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
            c0Var.d(0L);
            c0Var2.d(0L);
        }
        this.a.e(jArr);
        this.b.e(jArr2);
        this.c = j10;
    }

    @Override // c3.c0
    public final boolean d() {
        return this.b.b > 0;
    }

    @Override // c3.c0
    public final /* synthetic */ boolean e() {
        return false;
    }

    @Override // c3.c0
    public final b0 f(long j10) {
        c5.c0 c0Var = this.b;
        if (c0Var.b == 0) {
            d0 d0Var = d0.c;
            return new b0(d0Var, d0Var);
        }
        int c10 = m0.c(c0Var, j10);
        long n10 = c0Var.n(c10);
        c5.c0 c0Var2 = this.a;
        d0 d0Var2 = new d0(n10, c0Var2.n(c10));
        if (n10 == j10 || c10 == c0Var.b - 1) {
            return new b0(d0Var2, d0Var2);
        }
        int i10 = c10 + 1;
        return new b0(d0Var2, new d0(c0Var.n(i10), c0Var2.n(i10)));
    }

    @Override // c3.c0
    public final long h() {
        return this.c;
    }
}
