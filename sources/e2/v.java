package e2;

import e9.m0;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import v7.t6;
import v7.x7;
import v7.z7;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes.dex */
public final class v {
    public static final char[] d = {'\r', '\n'};
    public static final char[] e = {'\n'};
    public static final m0 f = m0.u(5, StandardCharsets.US_ASCII, StandardCharsets.UTF_8, StandardCharsets.UTF_16, StandardCharsets.UTF_16BE, StandardCharsets.UTF_16LE);
    public byte[] a;
    public int b;
    public int c;

    public v() {
        this.a = d0.b;
    }

    public static int b(int i10, int i11, int i12, int i13) {
        byte b10 = (byte) i12;
        return x7.c((byte) 0, z7.a(((i10 & 7) << 2) | ((i11 & 48) >> 4)), z7.a(((((byte) i11) & 15) << 4) | ((b10 & 60) >> 2)), z7.a(((b10 & 3) << 6) | (((byte) i13) & 63)));
    }

    public static int d(Charset charset) {
        d.a("Unsupported charset: " + charset, f.contains(charset));
        return (charset.equals(StandardCharsets.UTF_8) || charset.equals(StandardCharsets.US_ASCII)) ? 1 : 2;
    }

    public static boolean e(byte b10) {
        return (b10 & 192) == 128;
    }

    public final int A() {
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

    public final int B() {
        int j3 = j();
        if (j3 >= 0) {
            return j3;
        }
        throw new IllegalStateException(i2.g.i(j3, "Top bit not zero: "));
    }

    public final long C() {
        long r10 = r();
        if (r10 >= 0) {
            return r10;
        }
        throw new IllegalStateException(a4.a.o(r10, "Top bit not zero: "));
    }

    public final int D() {
        byte[] bArr = this.a;
        int i10 = this.b;
        int i11 = i10 + 1;
        this.b = i11;
        int i12 = (bArr[i10] & 255) << 8;
        this.b = i10 + 2;
        return (bArr[i11] & 255) | i12;
    }

    public final long E() {
        int i10;
        int i11;
        long j3 = this.a[this.b];
        int i12 = 7;
        while (true) {
            if (i12 < 0) {
                break;
            }
            if (((1 << i12) & j3) != 0) {
                i12--;
            } else if (i12 < 6) {
                j3 &= r6 - 1;
                i11 = 7 - i12;
            } else if (i12 == 7) {
                i11 = 1;
            }
        }
        i11 = 0;
        if (i11 == 0) {
            throw new NumberFormatException(a4.a.o(j3, "Invalid UTF-8 sequence first byte: "));
        }
        for (i10 = 1; i10 < i11; i10++) {
            if ((this.a[this.b + i10] & 192) != 128) {
                throw new NumberFormatException(a4.a.o(j3, "Invalid UTF-8 sequence continuation byte: "));
            }
            j3 = (j3 << 6) | (r3 & 63);
        }
        this.b += i11;
        return j3;
    }

    public final Charset F() {
        if (a() >= 3) {
            byte[] bArr = this.a;
            int i10 = this.b;
            if (bArr[i10] == -17 && bArr[i10 + 1] == -69 && bArr[i10 + 2] == -65) {
                this.b = i10 + 3;
                return StandardCharsets.UTF_8;
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
            return StandardCharsets.UTF_16BE;
        }
        if (b10 != -1 || bArr2[i11 + 1] != -2) {
            return null;
        }
        this.b = i11 + 2;
        return StandardCharsets.UTF_16LE;
    }

    public final void G(int i10) {
        byte[] bArr = this.a;
        if (bArr.length < i10) {
            bArr = new byte[i10];
        }
        H(i10, bArr);
    }

    public final void H(int i10, byte[] bArr) {
        this.a = bArr;
        this.c = i10;
        this.b = 0;
    }

    public final void I(int i10) {
        d.b(i10 >= 0 && i10 <= this.a.length);
        this.c = i10;
    }

    public final void J(int i10) {
        d.b(i10 >= 0 && i10 <= this.c);
        this.b = i10;
    }

    public final void K(int i10) {
        J(this.b + i10);
    }

    public final int a() {
        return Math.max(this.c - this.b, 0);
    }

    public final void c(int i10) {
        byte[] bArr = this.a;
        if (i10 > bArr.length) {
            this.a = Arrays.copyOf(bArr, i10);
        }
    }

    public final char f(int i10, ByteOrder byteOrder) {
        byte b10;
        byte b11;
        if (byteOrder == ByteOrder.BIG_ENDIAN) {
            byte[] bArr = this.a;
            int i11 = this.b + i10;
            b10 = bArr[i11];
            b11 = bArr[i11 + 1];
        } else {
            byte[] bArr2 = this.a;
            int i12 = this.b + i10;
            b10 = bArr2[i12 + 1];
            b11 = bArr2[i12];
        }
        return (char) ((b10 << 8) | (b11 & 255));
    }

    public final int g(Charset charset) {
        int i10;
        int i11;
        d.a("Unsupported charset: " + charset, f.contains(charset));
        if (a() < d(charset)) {
            throw new IndexOutOfBoundsException("position=" + this.b + ", limit=" + this.c);
        }
        int i12 = 1;
        if (charset.equals(StandardCharsets.US_ASCII)) {
            byte b10 = this.a[this.b];
            if ((b10 & 128) == 0) {
                i10 = b10 & 255;
                return (i10 << 8) | i12;
            }
            return 0;
        }
        if (charset.equals(StandardCharsets.UTF_8)) {
            byte b11 = this.a[this.b];
            int i13 = (b11 & 128) == 0 ? 1 : ((b11 & 224) == 192 && a() >= 2 && e(this.a[this.b + 1])) ? 2 : ((this.a[this.b] & 240) == 224 && a() >= 3 && e(this.a[this.b + 1]) && e(this.a[this.b + 2])) ? 3 : ((this.a[this.b] & 248) == 240 && a() >= 4 && e(this.a[this.b + 1]) && e(this.a[this.b + 2]) && e(this.a[this.b + 3])) ? 4 : 0;
            if (i13 == 1) {
                i11 = this.a[this.b] & 255;
            } else if (i13 == 2) {
                byte[] bArr = this.a;
                int i14 = this.b;
                i11 = b(0, 0, bArr[i14], bArr[i14 + 1]);
            } else {
                if (i13 != 3) {
                    if (i13 == 4) {
                        byte[] bArr2 = this.a;
                        int i15 = this.b;
                        i11 = b(bArr2[i15], bArr2[i15 + 1], bArr2[i15 + 2], bArr2[i15 + 3]);
                    }
                    return 0;
                }
                byte[] bArr3 = this.a;
                int i16 = this.b;
                i11 = b(0, bArr3[i16] & 15, bArr3[i16 + 1], bArr3[i16 + 2]);
            }
            i12 = i13;
            i10 = i11;
        } else {
            ByteOrder byteOrder = charset.equals(StandardCharsets.UTF_16LE) ? ByteOrder.LITTLE_ENDIAN : ByteOrder.BIG_ENDIAN;
            char f7 = f(0, byteOrder);
            if (!Character.isHighSurrogate(f7) || a() < 4) {
                i10 = f7;
                i12 = 2;
            } else {
                i10 = Character.toCodePoint(f7, f(2, byteOrder));
                i12 = 4;
            }
        }
        return (i10 << 8) | i12;
    }

    public final void h(int i10, int i11, byte[] bArr) {
        System.arraycopy(this.a, this.b, bArr, i10, i11);
        this.b += i11;
    }

    public final char i(Charset charset, char[] cArr) {
        int g10;
        if (a() >= d(charset) && (g10 = g(charset)) != 0) {
            long j3 = g10 >>> 8;
            t6.b(j3, "out of range: %s", (j3 >> 32) == 0);
            int i10 = (int) j3;
            if (!Character.isSupplementaryCodePoint(i10)) {
                long j10 = i10;
                char c10 = (char) j10;
                t6.b(j10, "Out of range: %s", ((long) c10) == j10);
                for (char c11 : cArr) {
                    if (c11 == c10) {
                        this.b = x7.b(g10 & 255) + this.b;
                        return c10;
                    }
                }
            }
        }
        return (char) 0;
    }

    public final int j() {
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

    public final String k(Charset charset) {
        int i10;
        d.a("Unsupported charset: " + charset, f.contains(charset));
        if (a() == 0) {
            return null;
        }
        Charset charset2 = StandardCharsets.US_ASCII;
        if (!charset.equals(charset2)) {
            F();
        }
        if (charset.equals(StandardCharsets.UTF_8) || charset.equals(charset2)) {
            i10 = 1;
        } else {
            if (!charset.equals(StandardCharsets.UTF_16) && !charset.equals(StandardCharsets.UTF_16LE) && !charset.equals(StandardCharsets.UTF_16BE)) {
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
            if ((charset.equals(StandardCharsets.UTF_8) || charset.equals(StandardCharsets.US_ASCII)) && d0.M(this.a[i11])) {
                break;
            }
            if (charset.equals(StandardCharsets.UTF_16) || charset.equals(StandardCharsets.UTF_16BE)) {
                byte[] bArr = this.a;
                if (bArr[i11] == 0 && d0.M(bArr[i11 + 1])) {
                    break;
                }
            }
            if (charset.equals(StandardCharsets.UTF_16LE)) {
                byte[] bArr2 = this.a;
                if (bArr2[i11 + 1] == 0 && d0.M(bArr2[i11])) {
                    break;
                }
            }
            i11 += i10;
        }
        String v = v(i11 - this.b, charset);
        if (this.b != this.c && i(charset, d) == '\r') {
            i(charset, e);
        }
        return v;
    }

    public final int l() {
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

    public final long m() {
        byte[] bArr = this.a;
        int i10 = this.b;
        this.b = i10 + 1;
        this.b = i10 + 2;
        this.b = i10 + 3;
        long j3 = (bArr[i10] & 255) | ((bArr[r2] & 255) << 8) | ((bArr[r7] & 255) << 16);
        this.b = i10 + 4;
        long j10 = j3 | ((bArr[r8] & 255) << 24);
        this.b = i10 + 5;
        long j11 = j10 | ((bArr[r7] & 255) << 32);
        this.b = i10 + 6;
        long j12 = j11 | ((bArr[r8] & 255) << 40);
        this.b = i10 + 7;
        long j13 = j12 | ((bArr[r7] & 255) << 48);
        this.b = i10 + 8;
        return ((bArr[r8] & 255) << 56) | j13;
    }

    public final short n() {
        byte[] bArr = this.a;
        int i10 = this.b;
        int i11 = i10 + 1;
        this.b = i11;
        int i12 = bArr[i10] & 255;
        this.b = i10 + 2;
        return (short) (((bArr[i11] & 255) << 8) | i12);
    }

    public final long o() {
        byte[] bArr = this.a;
        int i10 = this.b;
        this.b = i10 + 1;
        this.b = i10 + 2;
        long j3 = (bArr[i10] & 255) | ((bArr[r2] & 255) << 8);
        this.b = i10 + 3;
        long j10 = j3 | ((bArr[r7] & 255) << 16);
        this.b = i10 + 4;
        return ((bArr[r2] & 255) << 24) | j10;
    }

    public final int p() {
        int l4 = l();
        if (l4 >= 0) {
            return l4;
        }
        throw new IllegalStateException(i2.g.i(l4, "Top bit not zero: "));
    }

    public final int q() {
        byte[] bArr = this.a;
        int i10 = this.b;
        int i11 = i10 + 1;
        this.b = i11;
        int i12 = bArr[i10] & 255;
        this.b = i10 + 2;
        return ((bArr[i11] & 255) << 8) | i12;
    }

    public final long r() {
        byte[] bArr = this.a;
        int i10 = this.b;
        this.b = i10 + 1;
        this.b = i10 + 2;
        long j3 = ((bArr[i10] & 255) << 56) | ((bArr[r2] & 255) << 48);
        this.b = i10 + 3;
        long j10 = j3 | ((bArr[r7] & 255) << 40);
        this.b = i10 + 4;
        long j11 = j10 | ((bArr[r2] & 255) << 32);
        this.b = i10 + 5;
        long j12 = j11 | ((bArr[r7] & 255) << 24);
        this.b = i10 + 6;
        long j13 = j12 | ((bArr[r2] & 255) << 16);
        this.b = i10 + 7;
        long j14 = j13 | ((bArr[r7] & 255) << 8);
        this.b = i10 + 8;
        return (bArr[r2] & 255) | j14;
    }

    public final String s() {
        if (a() == 0) {
            return null;
        }
        int i10 = this.b;
        while (i10 < this.c && this.a[i10] != 0) {
            i10++;
        }
        byte[] bArr = this.a;
        int i11 = this.b;
        String str = d0.a;
        String str2 = new String(bArr, i11, i10 - i11, StandardCharsets.UTF_8);
        this.b = i10;
        if (i10 < this.c) {
            this.b = i10 + 1;
        }
        return str2;
    }

    public final String t(int i10) {
        if (i10 == 0) {
            return "";
        }
        int i11 = this.b;
        int i12 = (i11 + i10) - 1;
        int i13 = (i12 >= this.c || this.a[i12] != 0) ? i10 : i10 - 1;
        byte[] bArr = this.a;
        String str = d0.a;
        String str2 = new String(bArr, i11, i13, StandardCharsets.UTF_8);
        this.b += i10;
        return str2;
    }

    public final short u() {
        byte[] bArr = this.a;
        int i10 = this.b;
        int i11 = i10 + 1;
        this.b = i11;
        int i12 = (bArr[i10] & 255) << 8;
        this.b = i10 + 2;
        return (short) ((bArr[i11] & 255) | i12);
    }

    public final String v(int i10, Charset charset) {
        String str = new String(this.a, this.b, i10, charset);
        this.b += i10;
        return str;
    }

    public final int w() {
        return (x() << 21) | (x() << 14) | (x() << 7) | x();
    }

    public final int x() {
        byte[] bArr = this.a;
        int i10 = this.b;
        this.b = i10 + 1;
        return bArr[i10] & 255;
    }

    public final int y() {
        byte[] bArr = this.a;
        int i10 = this.b;
        int i11 = i10 + 1;
        this.b = i11;
        int i12 = (bArr[i10] & 255) << 8;
        this.b = i10 + 2;
        int i13 = (bArr[i11] & 255) | i12;
        this.b = i10 + 4;
        return i13;
    }

    public final long z() {
        byte[] bArr = this.a;
        int i10 = this.b;
        this.b = i10 + 1;
        this.b = i10 + 2;
        long j3 = ((bArr[i10] & 255) << 24) | ((bArr[r2] & 255) << 16);
        this.b = i10 + 3;
        long j10 = j3 | ((bArr[r7] & 255) << 8);
        this.b = i10 + 4;
        return (bArr[r2] & 255) | j10;
    }

    public v(int i10) {
        this.a = new byte[i10];
        this.c = i10;
    }

    public v(byte[] bArr) {
        this.a = bArr;
        this.c = bArr.length;
    }

    public v(byte[] bArr, int i10) {
        this.a = bArr;
        this.c = i10;
    }
}
