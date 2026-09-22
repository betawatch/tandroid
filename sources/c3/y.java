package c3;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
/* loaded from: classes.dex */
public final class y implements b0 {
    public final c5.a0 a;
    public final c5.a0 b;
    public long c;

    public y(long j3, long[] jArr, long[] jArr2) {
        e2.d.b(jArr.length == jArr2.length);
        int length = jArr2.length;
        if (length <= 0 || jArr2[0] <= 0) {
            this.a = new c5.a0(length, 2);
            this.b = new c5.a0(length, 2);
        } else {
            int i10 = length + 1;
            c5.a0 a0Var = new c5.a0(i10, 2);
            this.a = a0Var;
            c5.a0 a0Var2 = new c5.a0(i10, 2);
            this.b = a0Var2;
            a0Var.c(0L);
            a0Var2.c(0L);
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
        c5.a0 a0Var = this.b;
        if (a0Var.b == 0) {
            c0 c0Var = c0.c;
            return new a0(c0Var, c0Var);
        }
        int b10 = e2.d0.b(a0Var, j3);
        long f7 = a0Var.f(b10);
        c5.a0 a0Var2 = this.a;
        c0 c0Var2 = new c0(f7, a0Var2.f(b10));
        if (f7 == j3 || b10 == a0Var.b - 1) {
            return new a0(c0Var2, c0Var2);
        }
        int i10 = b10 + 1;
        return new a0(c0Var2, new c0(a0Var.f(i10), a0Var2.f(i10)));
    }

    @Override // c3.b0
    public final long l() {
        return this.c;
    }
}
