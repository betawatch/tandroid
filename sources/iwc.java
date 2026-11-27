// default package

import java.math.RoundingMode;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes.dex */
public final class iwc implements zy9 {
    public final go9 a;
    public final int b;
    public final long c;
    public final long d;
    public final long e;

    public iwc(go9 go9Var, int i, long j, long j2) {
        this.a = go9Var;
        this.b = i;
        this.c = j;
        long j3 = (j2 - j) / go9Var.c;
        this.d = j3;
        this.e = i(j3);
    }

    @Override // zy9
    public final boolean c() {
        return true;
    }

    @Override // zy9
    public final boolean d() {
        return false;
    }

    @Override // zy9
    public final yy9 e(long j) {
        go9 go9Var = this.a;
        long j2 = this.d - 1;
        long j3 = gcc.j((go9Var.b * j) / (this.b * 1000000), 0L, j2);
        int i = go9Var.c;
        long j4 = this.c;
        long i2 = i(j3);
        bz9 bz9Var = new bz9(i2, (i * j3) + j4);
        if (i2 >= j || j3 == j2) {
            return new yy9(bz9Var, bz9Var);
        }
        long j5 = j3 + 1;
        return new yy9(bz9Var, new bz9(i(j5), (i * j5) + j4));
    }

    @Override // zy9
    public final long h() {
        return this.e;
    }

    public final long i(long j) {
        long j2 = j * this.b;
        long j3 = this.a.b;
        String str = gcc.a;
        return gcc.b0(j2, 1000000L, j3, RoundingMode.DOWN);
    }
}
