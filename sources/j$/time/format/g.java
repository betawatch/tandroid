package j$.time.format;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.RoundingMode;

/* loaded from: classes2.dex */
final class g extends i {
    private final boolean g;

    g(j$.time.temporal.p pVar, int i, int i2, boolean z, int i3) {
        super(pVar, i, i2, x.NOT_NEGATIVE, i3);
        this.g = z;
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [j$.time.temporal.p, java.lang.Enum] */
    @Override // j$.time.format.i
    final i b() {
        if (this.e == -1) {
            return this;
        }
        return new g(this.a, this.b, this.c, this.g, -1);
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [j$.time.temporal.p, java.lang.Enum] */
    @Override // j$.time.format.i
    final i c(int i) {
        return new g(this.a, this.b, this.c, this.g, this.e + i);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [j$.time.temporal.p, java.lang.Enum] */
    @Override // j$.time.format.i, j$.time.format.f
    public final boolean k(r rVar, StringBuilder sb) {
        ?? r0 = this.a;
        Long e = rVar.e(r0);
        if (e == null) {
            return false;
        }
        v b = rVar.b();
        long longValue = e.longValue();
        j$.time.temporal.u k = r0.k();
        k.b(longValue, r0);
        BigDecimal valueOf = BigDecimal.valueOf(k.e());
        BigDecimal add = BigDecimal.valueOf(k.d()).subtract(valueOf).add(BigDecimal.ONE);
        BigDecimal subtract = BigDecimal.valueOf(longValue).subtract(valueOf);
        RoundingMode roundingMode = RoundingMode.FLOOR;
        BigDecimal divide = subtract.divide(add, 9, roundingMode);
        BigDecimal bigDecimal = BigDecimal.ZERO;
        if (divide.compareTo(bigDecimal) != 0) {
            bigDecimal = divide.signum() == 0 ? new BigDecimal(BigInteger.ZERO, 0) : divide.stripTrailingZeros();
        }
        int scale = bigDecimal.scale();
        boolean z = this.g;
        int i = this.b;
        if (scale != 0) {
            String substring = bigDecimal.setScale(Math.min(Math.max(bigDecimal.scale(), i), this.c), roundingMode).toPlainString().substring(2);
            b.getClass();
            if (z) {
                sb.append('.');
            }
            sb.append(substring);
            return true;
        }
        if (i <= 0) {
            return true;
        }
        if (z) {
            b.getClass();
            sb.append('.');
        }
        for (int i2 = 0; i2 < i; i2++) {
            b.getClass();
            sb.append('0');
        }
        return true;
    }

    @Override // j$.time.format.i
    public final String toString() {
        return "Fraction(" + this.a + "," + this.b + "," + this.c + (this.g ? ",DecimalPoint" : "") + ")";
    }
}
