package m2;

import b2.w;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.RoundingMode;
import java.util.List;
import m.g3;

/* compiled from: r8-map-id-425f9d3693dca7cdb7b1343a62ca29dd4bfbf482fa37d742abbdfab31448a8bd */
/* loaded from: classes.dex */
public final class p extends n {
    public final g3 j;
    public final g3 k;
    public final long l;

    public p(j jVar, long j10, long j11, long j12, long j13, long j14, List list, long j15, g3 g3Var, g3 g3Var2, long j16, long j17) {
        super(jVar, j10, j11, j12, j14, list, j15, j16, j17);
        this.j = g3Var;
        this.k = g3Var2;
        this.l = j13;
    }

    @Override // m2.s
    public final j a(m mVar) {
        g3 g3Var = this.j;
        if (g3Var == null) {
            return this.a;
        }
        w wVar = mVar.a;
        return new j(0L, -1L, g3Var.s(wVar.j, wVar.a, 0L, 0L));
    }

    @Override // m2.n
    public final long d(long j10) {
        if (this.f != null) {
            return r0.size();
        }
        long j11 = this.l;
        if (j11 != -1) {
            return (j11 - this.d) + 1;
        }
        if (j10 == -9223372036854775807L) {
            return -1L;
        }
        BigInteger multiply = BigInteger.valueOf(j10).multiply(BigInteger.valueOf(this.b));
        BigInteger multiply2 = BigInteger.valueOf(this.e).multiply(BigInteger.valueOf(1000000L));
        RoundingMode roundingMode = RoundingMode.CEILING;
        int i10 = g9.a.a;
        return new BigDecimal(multiply).divide(new BigDecimal(multiply2), 0, roundingMode).toBigIntegerExact().longValue();
    }

    @Override // m2.n
    public final j h(k kVar, long j10) {
        long j11 = this.d;
        List list = this.f;
        long j12 = list != null ? ((q) list.get((int) (j10 - j11))).a : (j10 - j11) * this.e;
        w wVar = kVar.a;
        return new j(0L, -1L, this.k.s(wVar.j, wVar.a, j10, j12));
    }
}
