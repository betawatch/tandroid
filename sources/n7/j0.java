package n7;

import java.math.RoundingMode;
import java.util.Arrays;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes.dex */
public final class j0 {
    public final String a;
    public final char[] b;
    public final int c;
    public final int d;
    public final int e;
    public final int f;
    public final byte[] g;
    public final boolean h;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public j0(String str, char[] cArr) {
        this(str, cArr, r1, false);
        byte[] bArr = new byte[128];
        Arrays.fill(bArr, (byte) -1);
        for (int i10 = 0; i10 < cArr.length; i10++) {
            char c10 = cArr[i10];
            if (!(c10 < 128)) {
                throw new IllegalArgumentException(a.c("Non-ASCII character: %s", Character.valueOf(c10)));
            }
            if (!(bArr[c10] == -1)) {
                throw new IllegalArgumentException(a.c("Duplicate character: %s", Character.valueOf(c10)));
            }
            bArr[c10] = (byte) i10;
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof j0)) {
            return false;
        }
        j0 j0Var = (j0) obj;
        return this.h == j0Var.h && Arrays.equals(this.b, j0Var.b);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.b) + (true != this.h ? 1237 : 1231);
    }

    public final String toString() {
        return this.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0061 A[LOOP:0: B:13:0x005d->B:15:0x0061, LOOP_END] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public j0(String str, char[] cArr, byte[] bArr, boolean z10) {
        int numberOfLeadingZeros;
        int i10;
        this.a = str;
        cArr.getClass();
        this.b = cArr;
        try {
            int length = cArr.length;
            RoundingMode roundingMode = RoundingMode.UNNECESSARY;
            if (length > 0) {
                switch (n0.a[roundingMode.ordinal()]) {
                    case 1:
                        if (((length - 1) & length) != 0) {
                            throw new ArithmeticException("mode was UNNECESSARY, but rounding was necessary");
                        }
                    case 2:
                    case 3:
                        numberOfLeadingZeros = 31 - Integer.numberOfLeadingZeros(length);
                        this.d = numberOfLeadingZeros;
                        int numberOfTrailingZeros = Integer.numberOfTrailingZeros(numberOfLeadingZeros);
                        int i11 = 1 << (3 - numberOfTrailingZeros);
                        this.e = i11;
                        this.f = numberOfLeadingZeros >> numberOfTrailingZeros;
                        this.c = length - 1;
                        this.g = bArr;
                        boolean[] zArr = new boolean[i11];
                        for (i10 = 0; i10 < this.f; i10++) {
                            int i12 = this.d;
                            RoundingMode roundingMode2 = RoundingMode.CEILING;
                            zArr[a.a(i10 * 8, i12)] = true;
                        }
                        this.h = z10;
                        return;
                    case 4:
                    case 5:
                        numberOfLeadingZeros = 32 - Integer.numberOfLeadingZeros(length - 1);
                        this.d = numberOfLeadingZeros;
                        int numberOfTrailingZeros2 = Integer.numberOfTrailingZeros(numberOfLeadingZeros);
                        int i112 = 1 << (3 - numberOfTrailingZeros2);
                        this.e = i112;
                        this.f = numberOfLeadingZeros >> numberOfTrailingZeros2;
                        this.c = length - 1;
                        this.g = bArr;
                        boolean[] zArr2 = new boolean[i112];
                        while (i10 < this.f) {
                        }
                        this.h = z10;
                        return;
                    case 6:
                    case 7:
                    case 8:
                        int numberOfLeadingZeros2 = Integer.numberOfLeadingZeros(length);
                        numberOfLeadingZeros = (31 - numberOfLeadingZeros2) + ((((-1257966797) >>> numberOfLeadingZeros2) - length) >>> 31);
                        this.d = numberOfLeadingZeros;
                        int numberOfTrailingZeros22 = Integer.numberOfTrailingZeros(numberOfLeadingZeros);
                        int i1122 = 1 << (3 - numberOfTrailingZeros22);
                        this.e = i1122;
                        this.f = numberOfLeadingZeros >> numberOfTrailingZeros22;
                        this.c = length - 1;
                        this.g = bArr;
                        boolean[] zArr22 = new boolean[i1122];
                        while (i10 < this.f) {
                        }
                        this.h = z10;
                        return;
                    default:
                        throw new AssertionError();
                }
            } else {
                throw new IllegalArgumentException("x (0) must be > 0");
            }
        } catch (ArithmeticException e7) {
            throw new IllegalArgumentException(i2.g.i(cArr.length, "Illegal alphabet length "), e7);
        }
    }
}
