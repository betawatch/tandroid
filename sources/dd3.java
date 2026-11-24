// default package

import java.math.BigInteger;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class dd3 implements ix9 {
    public final /* synthetic */ ed3 a;

    public dd3(ed3 ed3Var) {
        this.a = ed3Var;
    }

    @Override // ix9
    public final boolean c() {
        return true;
    }

    @Override // ix9
    public final boolean d() {
        return false;
    }

    @Override // ix9
    public final hx9 f(long j) {
        ed3 ed3Var = this.a;
        long j2 = ed3Var.b;
        BigInteger valueOf = BigInteger.valueOf((ed3Var.d.i * j) / 1000000);
        long j3 = ed3Var.c;
        kx9 kx9Var = new kx9(j, hac.j((valueOf.multiply(BigInteger.valueOf(j3 - j2)).divide(BigInteger.valueOf(ed3Var.f)).longValue() + j2) - 30000, ed3Var.b, j3 - 1));
        return new hx9(kx9Var, kx9Var);
    }

    @Override // ix9
    public final long h() {
        return (this.a.f * 1000000) / r5.d.i;
    }
}
