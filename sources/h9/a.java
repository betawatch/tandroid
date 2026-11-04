package h9;

import b8.ac;
import b8.wc;
import java.math.RoundingMode;
import java.util.Arrays;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
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

    public a(String str, char[] cArr, byte[] bArr, boolean z10) {
        str.getClass();
        this.a = str;
        cArr.getClass();
        this.b = cArr;
        try {
            int length = cArr.length;
            RoundingMode roundingMode = RoundingMode.UNNECESSARY;
            int c2 = wc.c(length);
            this.d = c2;
            int numberOfTrailingZeros = Integer.numberOfTrailingZeros(c2);
            int i3 = 1 << (3 - numberOfTrailingZeros);
            this.e = i3;
            this.f = c2 >> numberOfTrailingZeros;
            this.c = cArr.length - 1;
            this.g = bArr;
            boolean[] zArr = new boolean[i3];
            for (int i10 = 0; i10 < this.f; i10++) {
                int i11 = this.d;
                RoundingMode roundingMode2 = RoundingMode.CEILING;
                zArr[wc.b(i10 * 8, i11)] = true;
            }
            this.h = z10;
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
        for (int i3 = 0; i3 < cArr.length; i3++) {
            char c2 = cArr[i3];
            if (c2 < 128) {
                if (bArr[c2] == -1) {
                    bArr[c2] = (byte) i3;
                } else {
                    throw new IllegalArgumentException(ac.a("Duplicate character: %s", Character.valueOf(c2)));
                }
            } else {
                throw new IllegalArgumentException(ac.a("Non-ASCII character: %s", Character.valueOf(c2)));
            }
        }
    }
}
