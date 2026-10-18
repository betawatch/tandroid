package c3;

import e2.m0;
import v7.u6;

/* compiled from: r8-map-id-bcc7d273da888d5c27994201329e5b838e55754b73312241608ee42846efd426 */
/* loaded from: classes.dex */
public final class z implements c0 {
    public final c5.b0 a;
    public final c5.b0 b;
    public long c;

    public z(long j10, long[] jArr, long[] jArr2) {
        u6.g(jArr.length == jArr2.length);
        int length = jArr2.length;
        if (length <= 0 || jArr2[0] <= 0) {
            this.a = new c5.b0(length, 3);
            this.b = new c5.b0(length, 3);
        } else {
            int i10 = length + 1;
            c5.b0 b0Var = new c5.b0(i10, 3);
            this.a = b0Var;
            c5.b0 b0Var2 = new c5.b0(i10, 3);
            this.b = b0Var2;
            b0Var.d(0L);
            b0Var2.d(0L);
        }
        this.a.g(jArr);
        this.b.g(jArr2);
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
        c5.b0 b0Var = this.b;
        if (b0Var.b == 0) {
            d0 d0Var = d0.c;
            return new b0(d0Var, d0Var);
        }
        int c10 = m0.c(b0Var, j10);
        long n10 = b0Var.n(c10);
        c5.b0 b0Var2 = this.a;
        d0 d0Var2 = new d0(n10, b0Var2.n(c10));
        if (n10 == j10 || c10 == b0Var.b - 1) {
            return new b0(d0Var2, d0Var2);
        }
        int i10 = c10 + 1;
        return new b0(d0Var2, new d0(b0Var.n(i10), b0Var2.n(i10)));
    }

    @Override // c3.c0
    public final long h() {
        return this.c;
    }
}
