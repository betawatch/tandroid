package d5;

import j3.r0;
import java.nio.charset.Charset;
import java.util.Arrays;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class y {
    public static final char[] d = {'\r', '\n'};
    public static final char[] e = {'\n'};
    public static final o8.c0 f = o8.c0.t(5, n8.d.a, n8.d.c, n8.d.f, n8.d.d, n8.d.e);
    public byte[] a;
    public int b;
    public int c;

    public y() {
        this.a = f0.f;
    }

    public final void A(int i9, byte[] bArr) {
        this.a = bArr;
        this.c = i9;
        this.b = 0;
    }

    public final void B(int i9) {
        a.f(i9 >= 0 && i9 <= this.a.length);
        this.c = i9;
    }

    public final void C(int i9) {
        a.f(i9 >= 0 && i9 <= this.c);
        this.b = i9;
    }

    public final void D(int i9) {
        C(this.b + i9);
    }

    public final int a() {
        return this.c - this.b;
    }

    public final void b(int i9) {
        byte[] bArr = this.a;
        if (i9 > bArr.length) {
            this.a = Arrays.copyOf(bArr, i9);
        }
    }

    public final void c(int i9, int i10, byte[] bArr) {
        System.arraycopy(this.a, this.b, bArr, i9, i10);
        this.b += i10;
    }

    public final char d(Charset charset, char[] cArr) {
        char c10;
        int i9;
        byte b10;
        byte b11;
        if ((charset.equals(n8.d.c) || charset.equals(n8.d.a)) && a() >= 1) {
            long j10 = this.a[this.b] & 255;
            c10 = (char) j10;
            if (!(((long) c10) == j10)) {
                throw new IllegalArgumentException(g7.e0.a("Out of range: %s", Long.valueOf(j10)));
            }
            i9 = 1;
        } else {
            i9 = 2;
            if ((!charset.equals(n8.d.f) && !charset.equals(n8.d.d)) || a() < 2) {
                if (charset.equals(n8.d.e) && a() >= 2) {
                    byte[] bArr = this.a;
                    int i10 = this.b;
                    b10 = bArr[i10 + 1];
                    b11 = bArr[i10];
                }
                return (char) 0;
            }
            byte[] bArr2 = this.a;
            int i11 = this.b;
            b10 = bArr2[i11];
            b11 = bArr2[i11 + 1];
            c10 = (char) ((b11 & 255) | (b10 << 8));
        }
        for (char c11 : cArr) {
            if (c11 == c10) {
                this.b += i9;
                long j11 = c10;
                char c12 = (char) j11;
                if (((long) c12) == j11) {
                    return c12;
                }
                throw new IllegalArgumentException(g7.e0.a("Out of range: %s", Long.valueOf(j11)));
            }
        }
        return (char) 0;
    }

    public final int e() {
        byte[] bArr = this.a;
        int i9 = this.b;
        int i10 = i9 + 1;
        this.b = i10;
        int i11 = (bArr[i9] & 255) << 24;
        int i12 = i9 + 2;
        this.b = i12;
        int i13 = ((bArr[i10] & 255) << 16) | i11;
        int i14 = i9 + 3;
        this.b = i14;
        int i15 = i13 | ((bArr[i12] & 255) << 8);
        this.b = i9 + 4;
        return (bArr[i14] & 255) | i15;
    }

    public final String f(Charset charset) {
        int i9;
        a.e("Unsupported charset: " + charset, f.contains(charset));
        if (a() == 0) {
            return null;
        }
        Charset charset2 = n8.d.a;
        if (!charset.equals(charset2)) {
            y();
        }
        if (charset.equals(n8.d.c) || charset.equals(charset2)) {
            i9 = 1;
        } else {
            if (!charset.equals(n8.d.f) && !charset.equals(n8.d.e) && !charset.equals(n8.d.d)) {
                throw new IllegalArgumentException("Unsupported charset: " + charset);
            }
            i9 = 2;
        }
        int i10 = this.b;
        while (true) {
            int i11 = this.c;
            if (i10 >= i11 - (i9 - 1)) {
                i10 = i11;
                break;
            }
            if ((charset.equals(n8.d.c) || charset.equals(n8.d.a)) && f0.E(this.a[i10])) {
                break;
            }
            if (charset.equals(n8.d.f) || charset.equals(n8.d.d)) {
                byte[] bArr = this.a;
                if (bArr[i10] == 0 && f0.E(bArr[i10 + 1])) {
                    break;
                }
            }
            if (charset.equals(n8.d.e)) {
                byte[] bArr2 = this.a;
                if (bArr2[i10 + 1] == 0 && f0.E(bArr2[i10])) {
                    break;
                }
            }
            i10 += i9;
        }
        String p6 = p(i10 - this.b, charset);
        if (this.b != this.c && d(charset, d) == '\r') {
            d(charset, e);
        }
        return p6;
    }

    public final int g() {
        byte[] bArr = this.a;
        int i9 = this.b;
        int i10 = i9 + 1;
        this.b = i10;
        int i11 = bArr[i9] & 255;
        int i12 = i9 + 2;
        this.b = i12;
        int i13 = ((bArr[i10] & 255) << 8) | i11;
        int i14 = i9 + 3;
        this.b = i14;
        int i15 = i13 | ((bArr[i12] & 255) << 16);
        this.b = i9 + 4;
        return ((bArr[i14] & 255) << 24) | i15;
    }

    public final long h() {
        byte[] bArr = this.a;
        int i9 = this.b;
        this.b = i9 + 1;
        this.b = i9 + 2;
        this.b = i9 + 3;
        long j10 = (bArr[i9] & 255) | ((bArr[r2] & 255) << 8) | ((bArr[r7] & 255) << 16);
        this.b = i9 + 4;
        long j11 = j10 | ((bArr[r8] & 255) << 24);
        this.b = i9 + 5;
        long j12 = j11 | ((bArr[r7] & 255) << 32);
        this.b = i9 + 6;
        long j13 = j12 | ((bArr[r8] & 255) << 40);
        this.b = i9 + 7;
        long j14 = j13 | ((bArr[r7] & 255) << 48);
        this.b = i9 + 8;
        return ((bArr[r8] & 255) << 56) | j14;
    }

    public final long i() {
        byte[] bArr = this.a;
        int i9 = this.b;
        this.b = i9 + 1;
        this.b = i9 + 2;
        long j10 = (bArr[i9] & 255) | ((bArr[r2] & 255) << 8);
        this.b = i9 + 3;
        long j11 = j10 | ((bArr[r7] & 255) << 16);
        this.b = i9 + 4;
        return ((bArr[r2] & 255) << 24) | j11;
    }

    public final int j() {
        int g10 = g();
        if (g10 >= 0) {
            return g10;
        }
        throw new IllegalStateException(r0.l(g10, "Top bit not zero: "));
    }

    public final int k() {
        byte[] bArr = this.a;
        int i9 = this.b;
        int i10 = i9 + 1;
        this.b = i10;
        int i11 = bArr[i9] & 255;
        this.b = i9 + 2;
        return ((bArr[i10] & 255) << 8) | i11;
    }

    public final long l() {
        byte[] bArr = this.a;
        int i9 = this.b;
        this.b = i9 + 1;
        this.b = i9 + 2;
        long j10 = ((bArr[i9] & 255) << 56) | ((bArr[r2] & 255) << 48);
        this.b = i9 + 3;
        long j11 = j10 | ((bArr[r7] & 255) << 40);
        this.b = i9 + 4;
        long j12 = j11 | ((bArr[r2] & 255) << 32);
        this.b = i9 + 5;
        long j13 = j12 | ((bArr[r7] & 255) << 24);
        this.b = i9 + 6;
        long j14 = j13 | ((bArr[r2] & 255) << 16);
        this.b = i9 + 7;
        long j15 = j14 | ((bArr[r7] & 255) << 8);
        this.b = i9 + 8;
        return (bArr[r2] & 255) | j15;
    }

    public final String m() {
        if (a() == 0) {
            return null;
        }
        int i9 = this.b;
        while (i9 < this.c && this.a[i9] != 0) {
            i9++;
        }
        byte[] bArr = this.a;
        int i10 = this.b;
        int i11 = f0.a;
        String str = new String(bArr, i10, i9 - i10, n8.d.c);
        this.b = i9;
        if (i9 < this.c) {
            this.b = i9 + 1;
        }
        return str;
    }

    public final String n(int i9) {
        if (i9 == 0) {
            return "";
        }
        int i10 = this.b;
        int i11 = (i10 + i9) - 1;
        int i12 = (i11 >= this.c || this.a[i11] != 0) ? i9 : i9 - 1;
        byte[] bArr = this.a;
        int i13 = f0.a;
        String str = new String(bArr, i10, i12, n8.d.c);
        this.b += i9;
        return str;
    }

    public final short o() {
        byte[] bArr = this.a;
        int i9 = this.b;
        int i10 = i9 + 1;
        this.b = i10;
        int i11 = (bArr[i9] & 255) << 8;
        this.b = i9 + 2;
        return (short) ((bArr[i10] & 255) | i11);
    }

    public final String p(int i9, Charset charset) {
        String str = new String(this.a, this.b, i9, charset);
        this.b += i9;
        return str;
    }

    public final int q() {
        return (r() << 21) | (r() << 14) | (r() << 7) | r();
    }

    public final int r() {
        byte[] bArr = this.a;
        int i9 = this.b;
        this.b = i9 + 1;
        return bArr[i9] & 255;
    }

    public final long s() {
        byte[] bArr = this.a;
        int i9 = this.b;
        this.b = i9 + 1;
        this.b = i9 + 2;
        long j10 = ((bArr[i9] & 255) << 24) | ((bArr[r2] & 255) << 16);
        this.b = i9 + 3;
        long j11 = j10 | ((bArr[r7] & 255) << 8);
        this.b = i9 + 4;
        return (bArr[r2] & 255) | j11;
    }

    public final int t() {
        byte[] bArr = this.a;
        int i9 = this.b;
        int i10 = i9 + 1;
        this.b = i10;
        int i11 = (bArr[i9] & 255) << 16;
        int i12 = i9 + 2;
        this.b = i12;
        int i13 = ((bArr[i10] & 255) << 8) | i11;
        this.b = i9 + 3;
        return (bArr[i12] & 255) | i13;
    }

    public final int u() {
        int e10 = e();
        if (e10 >= 0) {
            return e10;
        }
        throw new IllegalStateException(r0.l(e10, "Top bit not zero: "));
    }

    public final long v() {
        long l10 = l();
        if (l10 >= 0) {
            return l10;
        }
        throw new IllegalStateException(aa.d.m(l10, "Top bit not zero: "));
    }

    public final int w() {
        byte[] bArr = this.a;
        int i9 = this.b;
        int i10 = i9 + 1;
        this.b = i10;
        int i11 = (bArr[i9] & 255) << 8;
        this.b = i9 + 2;
        return (bArr[i10] & 255) | i11;
    }

    public final long x() {
        int i9;
        int i10;
        long j10 = this.a[this.b];
        int i11 = 7;
        while (true) {
            if (i11 < 0) {
                break;
            }
            if (((1 << i11) & j10) != 0) {
                i11--;
            } else if (i11 < 6) {
                j10 &= r6 - 1;
                i10 = 7 - i11;
            } else if (i11 == 7) {
                i10 = 1;
            }
        }
        i10 = 0;
        if (i10 == 0) {
            throw new NumberFormatException(aa.d.m(j10, "Invalid UTF-8 sequence first byte: "));
        }
        for (i9 = 1; i9 < i10; i9++) {
            if ((this.a[this.b + i9] & 192) != 128) {
                throw new NumberFormatException(aa.d.m(j10, "Invalid UTF-8 sequence continuation byte: "));
            }
            j10 = (j10 << 6) | (r3 & 63);
        }
        this.b += i10;
        return j10;
    }

    public final Charset y() {
        if (a() >= 3) {
            byte[] bArr = this.a;
            int i9 = this.b;
            if (bArr[i9] == -17 && bArr[i9 + 1] == -69 && bArr[i9 + 2] == -65) {
                this.b = i9 + 3;
                return n8.d.c;
            }
        }
        if (a() < 2) {
            return null;
        }
        byte[] bArr2 = this.a;
        int i10 = this.b;
        byte b10 = bArr2[i10];
        if (b10 == -2 && bArr2[i10 + 1] == -1) {
            this.b = i10 + 2;
            return n8.d.d;
        }
        if (b10 != -1 || bArr2[i10 + 1] != -2) {
            return null;
        }
        this.b = i10 + 2;
        return n8.d.e;
    }

    public final void z(int i9) {
        byte[] bArr = this.a;
        if (bArr.length < i9) {
            bArr = new byte[i9];
        }
        A(i9, bArr);
    }

    public y(int i9) {
        this.a = new byte[i9];
        this.c = i9;
    }

    public y(byte[] bArr) {
        this.a = bArr;
        this.c = bArr.length;
    }

    public y(byte[] bArr, int i9) {
        this.a = bArr;
        this.c = i9;
    }
}
