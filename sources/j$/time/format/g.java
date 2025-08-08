package j$.time.format;

import j$.util.A;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.RoundingMode;

/* loaded from: classes2.dex */
final class g implements f {
    private final j$.time.temporal.a a;
    private final int b;
    private final boolean c;

    g(j$.time.temporal.a aVar) {
        A.z(aVar, "field");
        if (!aVar.m().f()) {
            throw new IllegalArgumentException("Field must have a fixed set of values: " + aVar);
        }
        this.a = aVar;
        this.b = 9;
        this.c = true;
    }

    @Override // j$.time.format.f
    public final boolean f(r rVar, StringBuilder sb) {
        j$.time.temporal.a aVar = this.a;
        Long e = rVar.e(aVar);
        if (e == null) {
            return false;
        }
        v b = rVar.b();
        long longValue = e.longValue();
        j$.time.temporal.q m = aVar.m();
        m.b(longValue, aVar);
        BigDecimal valueOf = BigDecimal.valueOf(m.e());
        BigDecimal add = BigDecimal.valueOf(m.d()).subtract(valueOf).add(BigDecimal.ONE);
        BigDecimal subtract = BigDecimal.valueOf(longValue).subtract(valueOf);
        RoundingMode roundingMode = RoundingMode.FLOOR;
        BigDecimal divide = subtract.divide(add, 9, roundingMode);
        BigDecimal bigDecimal = BigDecimal.ZERO;
        if (divide.compareTo(bigDecimal) != 0) {
            bigDecimal = divide.signum() == 0 ? new BigDecimal(BigInteger.ZERO, 0) : divide.stripTrailingZeros();
        }
        if (bigDecimal.scale() == 0) {
            return true;
        }
        String substring = bigDecimal.setScale(Math.min(Math.max(bigDecimal.scale(), 0), this.b), roundingMode).toPlainString().substring(2);
        b.getClass();
        if (this.c) {
            sb.append('.');
        }
        sb.append(substring);
        return true;
    }

    public final String toString() {
        return "Fraction(" + this.a + ",0," + this.b + (this.c ? ",DecimalPoint" : "") + ")";
    }
}
