// default package

import java.math.BigInteger;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
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
