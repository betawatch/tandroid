package n4;

import h3.t0;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.RoundingMode;
import java.util.List;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class p extends n {
    public final t5.l j;
    public final t5.l k;
    public final long l;

    public p(j jVar, long j10, long j11, long j12, long j13, long j14, List list, long j15, t5.l lVar, t5.l lVar2, long j16, long j17) {
        super(jVar, j10, j11, j12, j14, list, j15, j16, j17);
        this.j = lVar;
        this.k = lVar2;
        this.l = j13;
    }

    @Override // n4.s
    public final j a(m mVar) {
        t5.l lVar = this.j;
        if (lVar == null) {
            return this.a;
        }
        t0 t0Var = mVar.a;
        return new j(0L, -1L, lVar.a(t0Var.n, t0Var.a, 0L, 0L));
    }

    @Override // n4.n
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
        int i9 = p8.a.a;
        return new BigDecimal(multiply).divide(new BigDecimal(multiply2), 0, roundingMode).toBigIntegerExact().longValue();
    }

    @Override // n4.n
    public final j h(k kVar, long j10) {
        long j11 = this.d;
        List list = this.f;
        long j12 = list != null ? ((q) list.get((int) (j10 - j11))).a : (j10 - j11) * this.e;
        t0 t0Var = kVar.a;
        return new j(0L, -1L, this.k.a(t0Var.n, t0Var.a, j10, j12));
    }
}
