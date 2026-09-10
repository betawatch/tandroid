package m2;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.RoundingMode;
import java.util.List;
import m.e3;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes.dex */
public final class p extends n {
    public final e3 j;
    public final e3 k;
    public final long l;

    public p(j jVar, long j3, long j10, long j11, long j12, long j13, List list, long j14, e3 e3Var, e3 e3Var2, long j15, long j16) {
        super(jVar, j3, j10, j11, j13, list, j14, j15, j16);
        this.j = e3Var;
        this.k = e3Var2;
        this.l = j12;
    }

    @Override // m2.s
    public final j a(m mVar) {
        e3 e3Var = this.j;
        if (e3Var == null) {
            return this.a;
        }
        b2.s sVar = mVar.a;
        return new j(0L, -1L, e3Var.u(sVar.j, sVar.a, 0L, 0L));
    }

    @Override // m2.n
    public final long d(long j3) {
        if (this.f != null) {
            return r0.size();
        }
        long j10 = this.l;
        if (j10 != -1) {
            return (j10 - this.d) + 1;
        }
        if (j3 == -9223372036854775807L) {
            return -1L;
        }
        BigInteger multiply = BigInteger.valueOf(j3).multiply(BigInteger.valueOf(this.b));
        BigInteger multiply2 = BigInteger.valueOf(this.e).multiply(BigInteger.valueOf(1000000L));
        RoundingMode roundingMode = RoundingMode.CEILING;
        int i10 = g9.a.a;
        return new BigDecimal(multiply).divide(new BigDecimal(multiply2), 0, roundingMode).toBigIntegerExact().longValue();
    }

    @Override // m2.n
    public final j h(k kVar, long j3) {
        long j10 = this.d;
        List list = this.f;
        long j11 = list != null ? ((q) list.get((int) (j3 - j10))).a : (j3 - j10) * this.e;
        b2.s sVar = kVar.a;
        return new j(0L, -1L, this.k.u(sVar.j, sVar.a, j3, j11));
    }
}
