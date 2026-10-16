package c3;

import e2.m0;
import v7.u6;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
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
            c0Var.b(0L);
            c0Var2.b(0L);
        }
        this.a.c(jArr);
        this.b.c(jArr2);
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
        long h = c0Var.h(c10);
        c5.c0 c0Var3 = this.a;
        c0 c0Var4 = new c0(h, c0Var3.h(c10));
        if (h == j10 || c10 == c0Var.b - 1) {
            return new a0(c0Var4, c0Var4);
        }
        int i10 = c10 + 1;
        return new a0(c0Var4, new c0(c0Var.h(i10), c0Var3.h(i10)));
    }

    @Override // c3.b0
    public final long h() {
        return this.c;
    }
}
