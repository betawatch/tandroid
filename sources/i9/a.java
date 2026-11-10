package i9;

import a8.ja;
import c8.r0;
import java.math.RoundingMode;
import java.util.Arrays;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes.dex */
public final class a {
    public final String a;
    public final char[] b;
    public final int c;
    public final int d;
    public final int e;
    public final int f;
    public final byte[] g;
    public final boolean h;

    public a(String str, char[] cArr, byte[] bArr, boolean z9) {
        str.getClass();
        this.a = str;
        cArr.getClass();
        this.b = cArr;
        try {
            int length = cArr.length;
            RoundingMode roundingMode = RoundingMode.UNNECESSARY;
            int c10 = r0.c(length);
            this.d = c10;
            int numberOfTrailingZeros = Integer.numberOfTrailingZeros(c10);
            int i7 = 1 << (3 - numberOfTrailingZeros);
            this.e = i7;
            this.f = c10 >> numberOfTrailingZeros;
            this.c = cArr.length - 1;
            this.g = bArr;
            boolean[] zArr = new boolean[i7];
            for (int i10 = 0; i10 < this.f; i10++) {
                int i11 = this.d;
                RoundingMode roundingMode2 = RoundingMode.CEILING;
                zArr[r0.b(i10 * 8, i11)] = true;
            }
            this.h = z9;
        } catch (ArithmeticException e10) {
            throw new IllegalArgumentException("Illegal alphabet length " + cArr.length, e10);
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.h == aVar.h && Arrays.equals(this.b, aVar.b);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.b) + (this.h ? 1231 : 1237);
    }

    public final String toString() {
        return this.a;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public a(String str, char[] cArr) {
        this(str, cArr, r1, false);
        byte[] bArr = new byte[128];
        Arrays.fill(bArr, (byte) -1);
        for (int i7 = 0; i7 < cArr.length; i7++) {
            char c10 = cArr[i7];
            if (c10 < 128) {
                if (bArr[c10] == -1) {
                    bArr[c10] = (byte) i7;
                } else {
                    throw new IllegalArgumentException(ja.a("Duplicate character: %s", Character.valueOf(c10)));
                }
            } else {
                throw new IllegalArgumentException(ja.a("Non-ASCII character: %s", Character.valueOf(c10)));
            }
        }
    }
}
