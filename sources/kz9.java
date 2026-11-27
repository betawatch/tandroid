// default package

import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.RoundingMode;
import java.util.ArrayList;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes.dex */
public final class kz9 extends iz9 {
    public final ko9 j;
    public final ko9 k;
    public final long l;

    public kz9(n29 n29Var, long j, long j2, long j3, long j4, long j5, ArrayList arrayList, long j6, ko9 ko9Var, ko9 ko9Var2, long j7, long j8) {
        super(n29Var, j, j2, j3, j5, arrayList, j6, j7, j8);
        this.j = ko9Var;
        this.k = ko9Var2;
        this.l = j4;
    }

    @Override // nz9
    public final nz9 a() {
        return new kz9(this.a, this.b, 0L, this.d, this.l, this.e, this.f, this.i, this.j, this.k, this.g, this.h);
    }

    @Override // nz9
    public final n29 b(ub9 ub9Var) {
        ko9 ko9Var = this.j;
        if (ko9Var == null) {
            return this.a;
        }
        ko4 ko4Var = ub9Var.a;
        return new n29(0L, -1L, ko9Var.g(ko4Var.k, 0L, 0L, ko4Var.a));
    }

    @Override // iz9
    public final long e(long j) {
        if (this.f != null) {
            return r0.size();
        }
        long j2 = this.l;
        if (j2 != -1) {
            return (j2 - this.d) + 1;
        }
        if (j == -9223372036854775807L) {
            return -1L;
        }
        BigInteger multiply = BigInteger.valueOf(j).multiply(BigInteger.valueOf(this.b));
        BigInteger multiply2 = BigInteger.valueOf(this.e).multiply(BigInteger.valueOf(1000000L));
        RoundingMode roundingMode = RoundingMode.CEILING;
        int i = uh0.a;
        return new BigDecimal(multiply).divide(new BigDecimal(multiply2), 0, roundingMode).toBigIntegerExact().longValue();
    }

    @Override // iz9
    public final n29 i(sb9 sb9Var, long j) {
        ArrayList arrayList = this.f;
        long j2 = j - this.d;
        long j3 = arrayList != null ? ((lz9) arrayList.get((int) j2)).a : j2 * this.e;
        ko4 ko4Var = sb9Var.a;
        return new n29(0L, -1L, this.k.g(ko4Var.k, j, j3, ko4Var.a));
    }
}
