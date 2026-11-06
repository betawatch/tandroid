package j$.time.format;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.RoundingMode;

/* loaded from: classes2.dex */
public final class g extends i {
    public final boolean g;

    public g(j$.time.temporal.o oVar, int i7, int i10, boolean z9, int i11) {
        super(oVar, i7, i10, x.NOT_NEGATIVE, i11);
        this.g = z9;
    }

    @Override // j$.time.format.i
    public final i a() {
        if (this.e == -1) {
            return this;
        }
        return new g(this.a, this.b, this.c, this.g, -1);
    }

    @Override // j$.time.format.i
    public final i b(int i7) {
        return new g(this.a, this.b, this.c, this.g, this.e + i7);
    }

    @Override // j$.time.format.i, j$.time.format.f
    public final boolean j(r rVar, StringBuilder sb2) {
        j$.time.temporal.o oVar = this.a;
        Long a10 = rVar.a(oVar);
        if (a10 == null) {
            return false;
        }
        v vVar = rVar.b.c;
        long longValue = a10.longValue();
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
        boolean z9 = this.g;
        int i7 = this.b;
        if (scale != 0) {
            String substring = bigDecimal.setScale(Math.min(Math.max(bigDecimal.scale(), i7), this.c), roundingMode).toPlainString().substring(2);
            vVar.getClass();
            if (z9) {
                sb2.append('.');
            }
            sb2.append(substring);
            return true;
        }
        if (i7 > 0) {
            if (z9) {
                vVar.getClass();
                sb2.append('.');
            }
            for (int i10 = 0; i10 < i7; i10++) {
                vVar.getClass();
                sb2.append('0');
            }
        }
        return true;
    }

    @Override // j$.time.format.i
    public final String toString() {
        return "Fraction(" + this.a + "," + this.b + "," + this.c + (this.g ? ",DecimalPoint" : "") + ")";
    }
}
