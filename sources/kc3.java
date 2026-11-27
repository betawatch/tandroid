// default package

import java.math.BigInteger;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes.dex */
public final class kc3 implements zy9 {
    public final /* synthetic */ lc3 a;

    public kc3(lc3 lc3Var) {
        this.a = lc3Var;
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
        lc3 lc3Var = this.a;
        long j2 = lc3Var.b;
        BigInteger valueOf = BigInteger.valueOf((lc3Var.d.i * j) / 1000000);
        long j3 = lc3Var.c;
        bz9 bz9Var = new bz9(j, gcc.j((valueOf.multiply(BigInteger.valueOf(j3 - j2)).divide(BigInteger.valueOf(lc3Var.f)).longValue() + j2) - 30000, lc3Var.b, j3 - 1));
        return new yy9(bz9Var, bz9Var);
    }

    @Override // zy9
    public final long h() {
        return (this.a.f * 1000000) / r5.d.i;
    }
}
