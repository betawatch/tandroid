package c3;

import v7.t6;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final class y implements b0 {
    public final c5.x a;
    public final c5.x b;
    public long c;

    public y(long j10, long[] jArr, long[] jArr2) {
        t6.f(jArr.length == jArr2.length);
        int length = jArr2.length;
        if (length <= 0 || jArr2[0] <= 0) {
            this.a = new c5.x(length, 4);
            this.b = new c5.x(length, 4);
        } else {
            int i10 = length + 1;
            c5.x xVar = new c5.x(i10, 4);
            this.a = xVar;
            c5.x xVar2 = new c5.x(i10, 4);
            this.b = xVar2;
            xVar.e(0L);
            xVar2.e(0L);
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
        c5.x xVar = this.b;
        if (xVar.b == 0) {
            c0 c0Var = c0.c;
            return new a0(c0Var, c0Var);
        }
        int c10 = e2.l0.c(xVar, j10);
        long k10 = xVar.k(c10);
        c5.x xVar2 = this.a;
        c0 c0Var2 = new c0(k10, xVar2.k(c10));
        if (k10 == j10 || c10 == xVar.b - 1) {
            return new a0(c0Var2, c0Var2);
        }
        int i10 = c10 + 1;
        return new a0(c0Var2, new c0(xVar.k(i10), xVar2.k(i10)));
    }

    @Override // c3.b0
    public final long h() {
        return this.c;
    }
}
