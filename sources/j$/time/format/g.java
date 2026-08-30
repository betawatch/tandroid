package j$.time.format;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.RoundingMode;

/* loaded from: classes2.dex */
public final class g extends i {
    public final boolean g;

    public g(j$.time.temporal.o oVar, int i10, int i11, boolean z4, int i12) {
        super(oVar, i10, i11, x.NOT_NEGATIVE, i12);
        this.g = z4;
    }

    @Override // j$.time.format.i
    public final i a() {
        if (this.e == -1) {
            return this;
        }
        return new g(this.a, this.b, this.c, this.g, -1);
    }

    @Override // j$.time.format.i
    public final i b(int i10) {
        return new g(this.a, this.b, this.c, this.g, this.e + i10);
    }

    @Override // j$.time.format.i, j$.time.format.f
    public final boolean j(r rVar, StringBuilder sb) {
        j$.time.temporal.o oVar = this.a;
        Long a2 = rVar.a(oVar);
        if (a2 == null) {
            return false;
        }
        v vVar = rVar.b.c;
        long longValue = a2.longValue();
        j$.time.temporal.s l10 = oVar.l();
        l10.b(longValue, oVar);
        BigDecimal valueOf = BigDecimal.valueOf(l10.a);
        BigDecimal add = BigDecimal.valueOf(l10.d).subtract(valueOf).add(BigDecimal.ONE);
        BigDecimal subtract = BigDecimal.valueOf(longValue).subtract(valueOf);
        RoundingMode roundingMode = RoundingMode.FLOOR;
        BigDecimal divide = subtract.divide(add, 9, roundingMode);
        BigDecimal bigDecimal = BigDecimal.ZERO;
        if (divide.compareTo(bigDecimal) != 0) {
            bigDecimal = divide.signum() == 0 ? new BigDecimal(BigInteger.ZERO, 0) : divide.stripTrailingZeros();
        }
        int scale = bigDecimal.scale();
        boolean z4 = this.g;
        int i10 = this.b;
        if (scale != 0) {
            String substring = bigDecimal.setScale(Math.min(Math.max(bigDecimal.scale(), i10), this.c), roundingMode).toPlainString().substring(2);
            vVar.getClass();
            if (z4) {
                sb.append('.');
            }
            sb.append(substring);
            return true;
        }
        if (i10 > 0) {
            if (z4) {
                vVar.getClass();
                sb.append('.');
            }
            for (int i11 = 0; i11 < i10; i11++) {
                vVar.getClass();
                sb.append('0');
            }
        }
        return true;
    }

    @Override // j$.time.format.i
    public final String toString() {
        return "Fraction(" + this.a + "," + this.b + "," + this.c + (this.g ? ",DecimalPoint" : "") + ")";
    }
}
