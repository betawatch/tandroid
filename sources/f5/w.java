package f5;

import i7.q6;
import j7.l1;
import java.nio.charset.Charset;
import java.util.Arrays;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public final class w {
    public static final char[] d = {'\r', '\n'};
    public static final char[] e = {'\n'};
    public static final q8.c0 f = q8.c0.t(5, p8.d.a, p8.d.c, p8.d.f, p8.d.d, p8.d.e);
    public byte[] a;
    public int b;
    public int c;

    public w() {
        this.a = d0.f;
    }

    public final void A(int i10, byte[] bArr) {
        this.a = bArr;
        this.c = i10;
        this.b = 0;
    }

    public final void B(int i10) {
        a.f(i10 >= 0 && i10 <= this.a.length);
        this.c = i10;
    }

    public final void C(int i10) {
        a.f(i10 >= 0 && i10 <= this.c);
        this.b = i10;
    }

    public final void D(int i10) {
        C(this.b + i10);
    }

    public final int a() {
        return this.c - this.b;
    }

    public final void b(int i10) {
        byte[] bArr = this.a;
        if (i10 > bArr.length) {
            this.a = Arrays.copyOf(bArr, i10);
        }
    }

    public final void c(int i10, int i11, byte[] bArr) {
        System.arraycopy(this.a, this.b, bArr, i10, i11);
        this.b += i11;
    }

    public final char d(Charset charset, char[] cArr) {
        char c3;
        int i10;
        byte b10;
        byte b11;
        if ((charset.equals(p8.d.c) || charset.equals(p8.d.a)) && a() >= 1) {
            long j10 = this.a[this.b] & 255;
            c3 = (char) j10;
            if (!(((long) c3) == j10)) {
                throw new IllegalArgumentException(q6.a("Out of range: %s", Long.valueOf(j10)));
            }
            i10 = 1;
        } else {
            i10 = 2;
            if ((!charset.equals(p8.d.f) && !charset.equals(p8.d.d)) || a() < 2) {
                if (charset.equals(p8.d.e) && a() >= 2) {
                    byte[] bArr = this.a;
                    int i11 = this.b;
                    b10 = bArr[i11 + 1];
                    b11 = bArr[i11];
                }
                return (char) 0;
            }
            byte[] bArr2 = this.a;
            int i12 = this.b;
            b10 = bArr2[i12];
            b11 = bArr2[i12 + 1];
            c3 = (char) ((b11 & 255) | (b10 << 8));
        }
        for (char c6 : cArr) {
            if (c6 == c3) {
                this.b += i10;
                long j11 = c3;
                char c10 = (char) j11;
                if (((long) c10) == j11) {
                    return c10;
                }
                throw new IllegalArgumentException(q6.a("Out of range: %s", Long.valueOf(j11)));
            }
        }
        return (char) 0;
    }

    public final int e() {
        byte[] bArr = this.a;
        int i10 = this.b;
        int i11 = i10 + 1;
        this.b = i11;
        int i12 = (bArr[i10] & 255) << 24;
        int i13 = i10 + 2;
        this.b = i13;
        int i14 = ((bArr[i11] & 255) << 16) | i12;
        int i15 = i10 + 3;
        this.b = i15;
        int i16 = i14 | ((bArr[i13] & 255) << 8);
        this.b = i10 + 4;
        return (bArr[i15] & 255) | i16;
    }

    public final String f(Charset charset) {
        int i10;
        a.e("Unsupported charset: " + charset, f.contains(charset));
        if (a() == 0) {
            return null;
        }
        Charset charset2 = p8.d.a;
        if (!charset.equals(charset2)) {
            y();
        }
        if (charset.equals(p8.d.c) || charset.equals(charset2)) {
            i10 = 1;
        } else {
            if (!charset.equals(p8.d.f) && !charset.equals(p8.d.e) && !charset.equals(p8.d.d)) {
                throw new IllegalArgumentException("Unsupported charset: " + charset);
            }
            i10 = 2;
        }
        int i11 = this.b;
        while (true) {
            int i12 = this.c;
            if (i11 >= i12 - (i10 - 1)) {
                i11 = i12;
                break;
            }
            if ((charset.equals(p8.d.c) || charset.equals(p8.d.a)) && d0.E(this.a[i11])) {
                break;
            }
            if (charset.equals(p8.d.f) || charset.equals(p8.d.d)) {
                byte[] bArr = this.a;
                if (bArr[i11] == 0 && d0.E(bArr[i11 + 1])) {
                    break;
                }
            }
            if (charset.equals(p8.d.e)) {
                byte[] bArr2 = this.a;
                if (bArr2[i11 + 1] == 0 && d0.E(bArr2[i11])) {
                    break;
                }
            }
            i11 += i10;
        }
        String p10 = p(i11 - this.b, charset);
        if (this.b != this.c && d(charset, d) == '\r') {
            d(charset, e);
        }
        return p10;
    }

    public final int g() {
        byte[] bArr = this.a;
        int i10 = this.b;
        int i11 = i10 + 1;
        this.b = i11;
        int i12 = bArr[i10] & 255;
        int i13 = i10 + 2;
        this.b = i13;
        int i14 = ((bArr[i11] & 255) << 8) | i12;
        int i15 = i10 + 3;
        this.b = i15;
        int i16 = i14 | ((bArr[i13] & 255) << 16);
        this.b = i10 + 4;
        return ((bArr[i15] & 255) << 24) | i16;
    }

    public final long h() {
        byte[] bArr = this.a;
        int i10 = this.b;
        this.b = i10 + 1;
        this.b = i10 + 2;
        this.b = i10 + 3;
        long j10 = (bArr[i10] & 255) | ((bArr[r2] & 255) << 8) | ((bArr[r7] & 255) << 16);
        this.b = i10 + 4;
        long j11 = j10 | ((bArr[r8] & 255) << 24);
        this.b = i10 + 5;
        long j12 = j11 | ((bArr[r7] & 255) << 32);
        this.b = i10 + 6;
        long j13 = j12 | ((bArr[r8] & 255) << 40);
        this.b = i10 + 7;
        long j14 = j13 | ((bArr[r7] & 255) << 48);
        this.b = i10 + 8;
        return ((bArr[r8] & 255) << 56) | j14;
    }

    public final long i() {
        byte[] bArr = this.a;
        int i10 = this.b;
        this.b = i10 + 1;
        this.b = i10 + 2;
        long j10 = (bArr[i10] & 255) | ((bArr[r2] & 255) << 8);
        this.b = i10 + 3;
        long j11 = j10 | ((bArr[r7] & 255) << 16);
        this.b = i10 + 4;
        return ((bArr[r2] & 255) << 24) | j11;
    }

    public final int j() {
        int g10 = g();
        if (g10 >= 0) {
            return g10;
        }
        throw new IllegalStateException(l1.k(g10, "Top bit not zero: "));
    }

    public final int k() {
        byte[] bArr = this.a;
        int i10 = this.b;
        int i11 = i10 + 1;
        this.b = i11;
        int i12 = bArr[i10] & 255;
        this.b = i10 + 2;
        return ((bArr[i11] & 255) << 8) | i12;
    }

    public final long l() {
        byte[] bArr = this.a;
        int i10 = this.b;
        this.b = i10 + 1;
        this.b = i10 + 2;
        long j10 = ((bArr[i10] & 255) << 56) | ((bArr[r2] & 255) << 48);
        this.b = i10 + 3;
        long j11 = j10 | ((bArr[r7] & 255) << 40);
        this.b = i10 + 4;
        long j12 = j11 | ((bArr[r2] & 255) << 32);
        this.b = i10 + 5;
        long j13 = j12 | ((bArr[r7] & 255) << 24);
        this.b = i10 + 6;
        long j14 = j13 | ((bArr[r2] & 255) << 16);
        this.b = i10 + 7;
        long j15 = j14 | ((bArr[r7] & 255) << 8);
        this.b = i10 + 8;
        return (bArr[r2] & 255) | j15;
    }

    public final String m() {
        if (a() == 0) {
            return null;
        }
        int i10 = this.b;
        while (i10 < this.c && this.a[i10] != 0) {
            i10++;
        }
        byte[] bArr = this.a;
        int i11 = this.b;
        int i12 = d0.a;
        String str = new String(bArr, i11, i10 - i11, p8.d.c);
        this.b = i10;
        if (i10 < this.c) {
            this.b = i10 + 1;
        }
        return str;
    }

    public final String n(int i10) {
        if (i10 == 0) {
            return "";
        }
        int i11 = this.b;
        int i12 = (i11 + i10) - 1;
        int i13 = (i12 >= this.c || this.a[i12] != 0) ? i10 : i10 - 1;
        byte[] bArr = this.a;
        int i14 = d0.a;
        String str = new String(bArr, i11, i13, p8.d.c);
        this.b += i10;
        return str;
    }

    public final short o() {
        byte[] bArr = this.a;
        int i10 = this.b;
        int i11 = i10 + 1;
        this.b = i11;
        int i12 = (bArr[i10] & 255) << 8;
        this.b = i10 + 2;
        return (short) ((bArr[i11] & 255) | i12);
    }

    public final String p(int i10, Charset charset) {
        String str = new String(this.a, this.b, i10, charset);
        this.b += i10;
        return str;
    }

    public final int q() {
        return (r() << 21) | (r() << 14) | (r() << 7) | r();
    }

    public final int r() {
        byte[] bArr = this.a;
        int i10 = this.b;
        this.b = i10 + 1;
        return bArr[i10] & 255;
    }

    public final long s() {
        byte[] bArr = this.a;
        int i10 = this.b;
        this.b = i10 + 1;
        this.b = i10 + 2;
        long j10 = ((bArr[i10] & 255) << 24) | ((bArr[r2] & 255) << 16);
        this.b = i10 + 3;
        long j11 = j10 | ((bArr[r7] & 255) << 8);
        this.b = i10 + 4;
        return (bArr[r2] & 255) | j11;
    }

    public final int t() {
        byte[] bArr = this.a;
        int i10 = this.b;
        int i11 = i10 + 1;
        this.b = i11;
        int i12 = (bArr[i10] & 255) << 16;
        int i13 = i10 + 2;
        this.b = i13;
        int i14 = ((bArr[i11] & 255) << 8) | i12;
        this.b = i10 + 3;
        return (bArr[i13] & 255) | i14;
    }

    public final int u() {
        int e10 = e();
        if (e10 >= 0) {
            return e10;
        }
        throw new IllegalStateException(l1.k(e10, "Top bit not zero: "));
    }

    public final long v() {
        long l10 = l();
        if (l10 >= 0) {
            return l10;
        }
        throw new IllegalStateException(a4.w.m(l10, "Top bit not zero: "));
    }

    public final int w() {
        byte[] bArr = this.a;
        int i10 = this.b;
        int i11 = i10 + 1;
        this.b = i11;
        int i12 = (bArr[i10] & 255) << 8;
        this.b = i10 + 2;
        return (bArr[i11] & 255) | i12;
    }

    public final long x() {
        int i10;
        int i11;
        long j10 = this.a[this.b];
        int i12 = 7;
        while (true) {
            if (i12 < 0) {
                break;
            }
            if (((1 << i12) & j10) != 0) {
                i12--;
            } else if (i12 < 6) {
                j10 &= r6 - 1;
                i11 = 7 - i12;
            } else if (i12 == 7) {
                i11 = 1;
            }
        }
        i11 = 0;
        if (i11 == 0) {
            throw new NumberFormatException(a4.w.m(j10, "Invalid UTF-8 sequence first byte: "));
        }
        for (i10 = 1; i10 < i11; i10++) {
            if ((this.a[this.b + i10] & 192) != 128) {
                throw new NumberFormatException(a4.w.m(j10, "Invalid UTF-8 sequence continuation byte: "));
            }
            j10 = (j10 << 6) | (r3 & 63);
        }
        this.b += i11;
        return j10;
    }

    public final Charset y() {
        if (a() >= 3) {
            byte[] bArr = this.a;
            int i10 = this.b;
            if (bArr[i10] == -17 && bArr[i10 + 1] == -69 && bArr[i10 + 2] == -65) {
                this.b = i10 + 3;
                return p8.d.c;
            }
        }
        if (a() < 2) {
            return null;
        }
        byte[] bArr2 = this.a;
        int i11 = this.b;
        byte b10 = bArr2[i11];
        if (b10 == -2 && bArr2[i11 + 1] == -1) {
            this.b = i11 + 2;
            return p8.d.d;
        }
        if (b10 != -1 || bArr2[i11 + 1] != -2) {
            return null;
        }
        this.b = i11 + 2;
        return p8.d.e;
    }

    public final void z(int i10) {
        byte[] bArr = this.a;
        if (bArr.length < i10) {
            bArr = new byte[i10];
        }
        A(i10, bArr);
    }

    public w(int i10) {
        this.a = new byte[i10];
        this.c = i10;
    }

    public w(byte[] bArr) {
        this.a = bArr;
        this.c = bArr.length;
    }

    public w(byte[] bArr, int i10) {
        this.a = bArr;
        this.c = i10;
    }
}
