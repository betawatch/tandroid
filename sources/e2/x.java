package e2;

import e9.y0;
import i2.o1;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicBoolean;
import v7.b8;
import v7.f8;
import v7.u6;

/* compiled from: r8-map-id-6bb23a39fe2d1bb2dc6cc69f606436ba751c240cf93e0ff97ff041cb9f09a305 */
/* loaded from: classes.dex */
public final class x {
    public static final char[] d = {'\r', '\n'};
    public static final char[] e = {'\n'};
    public static final y0 f = y0.t(5, StandardCharsets.US_ASCII, StandardCharsets.UTF_8, StandardCharsets.UTF_16, StandardCharsets.UTF_16BE, StandardCharsets.UTF_16LE);
    public static final AtomicBoolean g = new AtomicBoolean();
    public byte[] a;
    public int b;
    public int c;

    public x() {
        this.a = m0.b;
    }

    public static int b(int i10, int i11, int i12, int i13) {
        byte b10 = (byte) i12;
        return b8.c((byte) 0, f8.a(((i10 & 7) << 2) | ((i11 & 48) >> 4)), f8.a(((((byte) i11) & 15) << 4) | ((b10 & 60) >> 2)), f8.a(((b10 & 3) << 6) | (((byte) i13) & 63)));
    }

    public static int d(Charset charset) {
        u6.h(f.contains(charset), "Unsupported charset: %s", charset);
        return (charset.equals(StandardCharsets.UTF_8) || charset.equals(StandardCharsets.US_ASCII)) ? 1 : 2;
    }

    public static boolean e(byte b10) {
        return (b10 & 192) == 128;
    }

    public final int A() {
        f(1);
        byte[] bArr = this.a;
        int i10 = this.b;
        this.b = i10 + 1;
        return bArr[i10] & 255;
    }

    public final int B() {
        f(4);
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

    public final long C() {
        f(4);
        byte[] bArr = this.a;
        int i10 = this.b;
        this.b = i10 + 1;
        this.b = i10 + 2;
        long j10 = ((bArr[i10] & 255) << 24) | ((bArr[r3] & 255) << 16);
        this.b = i10 + 3;
        long j11 = j10 | ((bArr[r8] & 255) << 8);
        this.b = i10 + 4;
        return (bArr[r3] & 255) | j11;
    }

    public final int D() {
        f(3);
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

    public final int E() {
        int m10 = m();
        if (m10 >= 0) {
            return m10;
        }
        throw new IllegalStateException(o1.k(m10, "Top bit not zero: "));
    }

    public final int F() {
        long j10 = 0;
        for (int i10 = 0; i10 < 9; i10++) {
            if (this.b == this.c) {
                throw new IllegalStateException("Attempting to read a byte over the limit.");
            }
            long A = A();
            j10 |= (127 & A) << (i10 * 7);
            if ((A & 128) == 0) {
                break;
            }
        }
        return b8.b(j10);
    }

    public final long G() {
        long u10 = u();
        if (u10 >= 0) {
            return u10;
        }
        throw new IllegalStateException(a1.g.o(u10, "Top bit not zero: "));
    }

    public final int H() {
        f(2);
        byte[] bArr = this.a;
        int i10 = this.b;
        int i11 = i10 + 1;
        this.b = i11;
        int i12 = (bArr[i10] & 255) << 8;
        this.b = i10 + 2;
        return (bArr[i11] & 255) | i12;
    }

    public final long I() {
        int i10;
        f(1);
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
            throw new NumberFormatException(a1.g.o(j10, "Invalid UTF-8 sequence first byte: "));
        }
        f(i10);
        for (int i12 = 1; i12 < i10; i12++) {
            if ((this.a[this.b + i12] & 192) != 128) {
                throw new NumberFormatException(a1.g.o(j10, "Invalid UTF-8 sequence continuation byte: "));
            }
            j10 = (j10 << 6) | (r4 & 63);
        }
        this.b += i10;
        return j10;
    }

    public final Charset J() {
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

    public final void K(int i10) {
        byte[] bArr = this.a;
        if (bArr.length < i10) {
            bArr = new byte[i10];
        }
        L(i10, bArr);
    }

    public final void L(int i10, byte[] bArr) {
        this.a = bArr;
        this.c = i10;
        this.b = 0;
    }

    public final void M(int i10) {
        u6.g(i10 >= 0 && i10 <= this.a.length);
        this.c = i10;
    }

    public final void N(int i10) {
        u6.g(i10 >= 0 && i10 <= this.c);
        this.b = i10;
    }

    public final void O(int i10) {
        N(this.b + i10);
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

    public final void f(int i10) {
        if (!g.get() || a() >= i10) {
            return;
        }
        StringBuilder n10 = o1.n(i10, "bytesNeeded= ", ", bytesLeft=");
        n10.append(a());
        throw new IndexOutOfBoundsException(n10.toString());
    }

    public final char g(int i10, ByteOrder byteOrder) {
        byte b10;
        byte b11;
        f(2);
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

    public final int h(Charset charset) {
        int i10;
        int i11;
        u6.h(f.contains(charset), "Unsupported charset: %s", charset);
        if (a() < d(charset)) {
            throw new IndexOutOfBoundsException("position=" + this.b + ", limit=" + this.c);
        }
        int i12 = 1;
        if (charset.equals(StandardCharsets.US_ASCII)) {
            byte b10 = this.a[this.b];
            if ((b10 & 128) != 0) {
                return 0;
            }
            i10 = b10 & 255;
        } else if (charset.equals(StandardCharsets.UTF_8)) {
            byte b11 = this.a[this.b];
            int i13 = (b11 & 128) == 0 ? 1 : ((b11 & 224) == 192 && a() >= 2 && e(this.a[this.b + 1])) ? 2 : ((this.a[this.b] & 240) == 224 && a() >= 3 && e(this.a[this.b + 1]) && e(this.a[this.b + 2])) ? 3 : ((this.a[this.b] & 248) == 240 && a() >= 4 && e(this.a[this.b + 1]) && e(this.a[this.b + 2]) && e(this.a[this.b + 3])) ? 4 : 0;
            if (i13 == 1) {
                i11 = this.a[this.b] & 255;
            } else if (i13 == 2) {
                byte[] bArr = this.a;
                int i14 = this.b;
                i11 = b(0, 0, bArr[i14], bArr[i14 + 1]);
            } else if (i13 == 3) {
                byte[] bArr2 = this.a;
                int i15 = this.b;
                i11 = b(0, bArr2[i15] & 15, bArr2[i15 + 1], bArr2[i15 + 2]);
            } else {
                if (i13 != 4) {
                    return 0;
                }
                byte[] bArr3 = this.a;
                int i16 = this.b;
                i11 = b(bArr3[i16], bArr3[i16 + 1], bArr3[i16 + 2], bArr3[i16 + 3]);
            }
            i12 = i13;
            i10 = i11;
        } else {
            ByteOrder byteOrder = charset.equals(StandardCharsets.UTF_16LE) ? ByteOrder.LITTLE_ENDIAN : ByteOrder.BIG_ENDIAN;
            char g10 = g(0, byteOrder);
            if (!Character.isHighSurrogate(g10) || a() < 4) {
                i10 = g10;
                i12 = 2;
            } else {
                i10 = Character.toCodePoint(g10, g(2, byteOrder));
                i12 = 4;
            }
        }
        return (i10 << 8) | i12;
    }

    public final int i() {
        if (a() >= 4) {
            int m10 = m();
            this.b -= 4;
            return m10;
        }
        throw new IndexOutOfBoundsException("position=" + this.b + ", limit=" + this.c);
    }

    public final int j() {
        f(1);
        return this.a[this.b] & 255;
    }

    public final void k(int i10, int i11, byte[] bArr) {
        f(i11);
        System.arraycopy(this.a, this.b, bArr, i10, i11);
        this.b += i11;
    }

    public final char l(Charset charset, char[] cArr) {
        int h;
        if (a() >= d(charset) && (h = h(charset)) != 0) {
            long j10 = h >>> 8;
            u6.c(j10, "out of range: %s", (j10 >> 32) == 0);
            int i10 = (int) j10;
            if (!Character.isSupplementaryCodePoint(i10)) {
                long j11 = i10;
                char c10 = (char) j11;
                u6.c(j11, "Out of range: %s", ((long) c10) == j11);
                for (char c11 : cArr) {
                    if (c11 == c10) {
                        this.b = b8.b(h & 255) + this.b;
                        return c10;
                    }
                }
            }
        }
        return (char) 0;
    }

    public final int m() {
        f(4);
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

    public final String n(Charset charset) {
        int i10;
        u6.h(f.contains(charset), "Unsupported charset: %s", charset);
        if (a() == 0) {
            return null;
        }
        Charset charset2 = StandardCharsets.US_ASCII;
        if (!charset.equals(charset2)) {
            J();
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
            if ((charset.equals(StandardCharsets.UTF_8) || charset.equals(StandardCharsets.US_ASCII)) && m0.O(this.a[i11])) {
                break;
            }
            if (charset.equals(StandardCharsets.UTF_16) || charset.equals(StandardCharsets.UTF_16BE)) {
                byte[] bArr = this.a;
                if (bArr[i11] == 0 && m0.O(bArr[i11 + 1])) {
                    break;
                }
            }
            if (charset.equals(StandardCharsets.UTF_16LE)) {
                byte[] bArr2 = this.a;
                if (bArr2[i11 + 1] == 0 && m0.O(bArr2[i11])) {
                    break;
                }
            }
            i11 += i10;
        }
        String y3 = y(i11 - this.b, charset);
        if (this.b != this.c && l(charset, d) == '\r') {
            l(charset, e);
        }
        return y3;
    }

    public final int o() {
        f(4);
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

    public final long p() {
        f(8);
        byte[] bArr = this.a;
        int i10 = this.b;
        this.b = i10 + 1;
        this.b = i10 + 2;
        long j10 = (bArr[i10] & 255) | ((bArr[r3] & 255) << 8);
        this.b = i10 + 3;
        long j11 = j10 | ((bArr[r8] & 255) << 16);
        this.b = i10 + 4;
        long j12 = j11 | ((bArr[r3] & 255) << 24);
        this.b = i10 + 5;
        long j13 = j12 | ((bArr[r8] & 255) << 32);
        this.b = i10 + 6;
        long j14 = j13 | ((bArr[r3] & 255) << 40);
        this.b = i10 + 7;
        long j15 = j14 | ((bArr[r8] & 255) << 48);
        this.b = i10 + 8;
        return ((bArr[r3] & 255) << 56) | j15;
    }

    public final short q() {
        f(2);
        byte[] bArr = this.a;
        int i10 = this.b;
        int i11 = i10 + 1;
        this.b = i11;
        int i12 = bArr[i10] & 255;
        this.b = i10 + 2;
        return (short) (((bArr[i11] & 255) << 8) | i12);
    }

    public final long r() {
        f(4);
        byte[] bArr = this.a;
        int i10 = this.b;
        this.b = i10 + 1;
        this.b = i10 + 2;
        long j10 = (bArr[i10] & 255) | ((bArr[r3] & 255) << 8);
        this.b = i10 + 3;
        long j11 = j10 | ((bArr[r8] & 255) << 16);
        this.b = i10 + 4;
        return ((bArr[r3] & 255) << 24) | j11;
    }

    public final int s() {
        int o10 = o();
        if (o10 >= 0) {
            return o10;
        }
        throw new IllegalStateException(o1.k(o10, "Top bit not zero: "));
    }

    public final int t() {
        f(2);
        byte[] bArr = this.a;
        int i10 = this.b;
        int i11 = i10 + 1;
        this.b = i11;
        int i12 = bArr[i10] & 255;
        this.b = i10 + 2;
        return ((bArr[i11] & 255) << 8) | i12;
    }

    public final long u() {
        f(8);
        byte[] bArr = this.a;
        int i10 = this.b;
        this.b = i10 + 1;
        this.b = i10 + 2;
        long j10 = ((bArr[i10] & 255) << 56) | ((bArr[r3] & 255) << 48);
        this.b = i10 + 3;
        long j11 = j10 | ((bArr[r8] & 255) << 40);
        this.b = i10 + 4;
        long j12 = j11 | ((bArr[r3] & 255) << 32);
        this.b = i10 + 5;
        long j13 = j12 | ((bArr[r8] & 255) << 24);
        this.b = i10 + 6;
        long j14 = j13 | ((bArr[r3] & 255) << 16);
        this.b = i10 + 7;
        long j15 = j14 | ((bArr[r8] & 255) << 8);
        this.b = i10 + 8;
        return (bArr[r3] & 255) | j15;
    }

    public final String v() {
        if (a() == 0) {
            return null;
        }
        int i10 = this.b;
        while (i10 < this.c && this.a[i10] != 0) {
            i10++;
        }
        byte[] bArr = this.a;
        int i11 = this.b;
        String str = m0.a;
        String str2 = new String(bArr, i11, i10 - i11, StandardCharsets.UTF_8);
        this.b = i10;
        if (i10 < this.c) {
            this.b = i10 + 1;
        }
        return str2;
    }

    public final String w(int i10) {
        f(i10);
        if (i10 == 0) {
            return "";
        }
        int i11 = this.b;
        int i12 = (i11 + i10) - 1;
        int i13 = (i12 >= this.c || this.a[i12] != 0) ? i10 : i10 - 1;
        byte[] bArr = this.a;
        String str = m0.a;
        String str2 = new String(bArr, i11, i13, StandardCharsets.UTF_8);
        this.b += i10;
        return str2;
    }

    public final short x() {
        f(2);
        byte[] bArr = this.a;
        int i10 = this.b;
        int i11 = i10 + 1;
        this.b = i11;
        int i12 = (bArr[i10] & 255) << 8;
        this.b = i10 + 2;
        return (short) ((bArr[i11] & 255) | i12);
    }

    public final String y(int i10, Charset charset) {
        f(i10);
        String str = new String(this.a, this.b, i10, charset);
        this.b += i10;
        return str;
    }

    public final int z() {
        return (A() << 21) | (A() << 14) | (A() << 7) | A();
    }

    public x(int i10) {
        this.a = new byte[i10];
        this.c = i10;
    }

    public x(byte[] bArr) {
        this.a = bArr;
        this.c = bArr.length;
    }

    public x(byte[] bArr, int i10) {
        this.a = bArr;
        this.c = i10;
    }
}
