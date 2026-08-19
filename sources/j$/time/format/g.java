package j$.time.format;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.RoundingMode;

/* loaded from: classes2.dex */
public final class g extends i {
    public final boolean g;

    public g(j$.time.temporal.o oVar, int i, int i2, boolean z, int i3) {
        super(oVar, i, i2, x.NOT_NEGATIVE, i3);
        this.g = z;
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [j$.time.temporal.o, java.lang.Enum] */
    @Override // j$.time.format.i
    public final i a() {
        if (this.e == -1) {
            return this;
        }
        return new g(this.a, this.b, this.c, this.g, -1);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [j$.time.temporal.o, java.lang.Enum] */
    @Override // j$.time.format.i
    public final i b(int i) {
        return new g(this.a, this.b, this.c, this.g, this.e + i);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [j$.time.temporal.o, java.lang.Enum] */
    @Override // j$.time.format.i, j$.time.format.f
    public final boolean l(r rVar, StringBuilder sb) {
        ?? r0 = this.a;
        Long a = rVar.a(r0);
        if (a == null) {
            return false;
        }
        v vVar = rVar.b.c;
        long longValue = a.longValue();
        j$.time.temporal.s l = r0.l();
        l.b(longValue, r0);
        BigDecimal valueOf = BigDecimal.valueOf(l.a);
        BigDecimal add = BigDecimal.valueOf(l.d).subtract(valueOf).add(BigDecimal.ONE);
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
            vVar.getClass();
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
            vVar.getClass();
            sb.append('.');
        }
        for (int i2 = 0; i2 < i; i2++) {
            vVar.getClass();
            sb.append('0');
        }
        return true;
    }

    @Override // j$.time.format.i
    public final String toString() {
        return "Fraction(" + this.a + "," + this.b + "," + this.c + (this.g ? ",DecimalPoint" : "") + ")";
    }
}
