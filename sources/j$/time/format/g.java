package j$.time.format;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.RoundingMode;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes4.dex */
public final class g extends i {
    public final boolean g;

    public g(j$.time.temporal.o oVar, int i, int i2, boolean z, int i3) {
        super(oVar, i, i2, x.NOT_NEGATIVE, i3);
        this.g = z;
    }

    @Override // j$.time.format.i
    public final i a() {
        if (this.e == -1) {
            return this;
        }
        return new g(this.a, this.b, this.c, this.g, -1);
    }

    @Override // j$.time.format.i
    public final i b(int i) {
        return new g(this.a, this.b, this.c, this.g, this.e + i);
    }

    @Override // j$.time.format.i, j$.time.format.f
    public final boolean j(r rVar, StringBuilder sb) {
        j$.time.temporal.o oVar = this.a;
        Long a = rVar.a(oVar);
        if (a == null) {
            return false;
        }
        v vVar = rVar.b.c;
        long longValue = a.longValue();
        j$.time.temporal.s range = oVar.range();
        range.b(longValue, oVar);
        BigDecimal valueOf = BigDecimal.valueOf(range.a);
        BigDecimal add = BigDecimal.valueOf(range.d).subtract(valueOf).add(BigDecimal.ONE);
        BigDecimal subtract = BigDecimal.valueOf(longValue).subtract(valueOf);
        RoundingMode roundingMode = RoundingMode.FLOOR;
        BigDecimal divide = subtract.divide(add, 9, roundingMode);
        BigDecimal bigDecimal = BigDecimal.ZERO;
        if (divide.compareTo(bigDecimal) != 0) {
            bigDecimal = divide.signum() == 0 ? new BigDecimal(BigInteger.ZERO, 0) : divide.stripTrailingZeros();
        }
        int scale = bigDecimal.scale();
        boolean z = this.g;
        byte b = this.b;
        if (scale != 0) {
            String substring = bigDecimal.setScale(Math.min(Math.max(bigDecimal.scale(), (int) b), (int) this.c), roundingMode).toPlainString().substring(2);
            vVar.getClass();
            if (z) {
                sb.append('.');
            }
            sb.append(substring);
            return true;
        }
        if (b > 0) {
            if (z) {
                vVar.getClass();
                sb.append('.');
            }
            for (int i = 0; i < b; i++) {
                vVar.getClass();
                sb.append('0');
            }
        }
        return true;
    }

    @Override // j$.time.format.i
    public final String toString() {
        return "Fraction(" + this.a + "," + ((int) this.b) + "," + ((int) this.c) + (this.g ? ",DecimalPoint" : "") + ")";
    }
}
