package c3;

import e2.m0;
import v7.u6;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes.dex */
public final class y implements b0 {
    public final c5.c0 a;
    public final c5.c0 b;
    public long c;

    public y(long j10, long[] jArr, long[] jArr2) {
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
            c0Var.c(0L);
            c0Var2.c(0L);
        }
        this.a.f(jArr);
        this.b.f(jArr2);
        this.c = j10;
    }

    @Override // c3.b0
    public final boolean d() {
        return this.b.b > 0;
    }

    @Override // c3.b0
    public final /* synthetic */ boolean e() {
        return false;
    }

    @Override // c3.b0
    public final a0 f(long j10) {
        c5.c0 c0Var = this.b;
        if (c0Var.b == 0) {
            c0 c0Var2 = c0.c;
            return new a0(c0Var2, c0Var2);
        }
        int c10 = m0.c(c0Var, j10);
        long m10 = c0Var.m(c10);
        c5.c0 c0Var3 = this.a;
        c0 c0Var4 = new c0(m10, c0Var3.m(c10));
        if (m10 == j10 || c10 == c0Var.b - 1) {
            return new a0(c0Var4, c0Var4);
        }
        int i10 = c10 + 1;
        return new a0(c0Var4, new c0(c0Var.m(i10), c0Var3.m(i10)));
    }

    @Override // c3.b0
    public final long h() {
        return this.c;
    }
}
