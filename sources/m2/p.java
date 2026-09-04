package m2;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.RoundingMode;
import java.util.List;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes.dex */
public final class p extends n {
    public final t j;
    public final t k;
    public final long l;

    public p(j jVar, long j3, long j10, long j11, long j12, long j13, List list, long j14, t tVar, t tVar2, long j15, long j16) {
        super(jVar, j3, j10, j11, j13, list, j14, j15, j16);
        this.j = tVar;
        this.k = tVar2;
        this.l = j12;
    }

    @Override // m2.s
    public final j a(m mVar) {
        t tVar = this.j;
        if (tVar == null) {
            return this.a;
        }
        b2.s sVar = mVar.a;
        return new j(0L, -1L, tVar.p(sVar.j, sVar.a, 0L, 0L));
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
        return new j(0L, -1L, this.k.p(sVar.j, sVar.a, j3, j11));
    }
}
