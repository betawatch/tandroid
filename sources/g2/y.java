package g2;

import b8.od;
import b8.qd;
import b8.zb;
import g9.t0;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicBoolean;
import k2.p1;
import org.telegram.messenger.hs;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class y {
    public static final char[] d = {'\r', '\n'};
    public static final char[] e = {'\n'};
    public static final t0 f = t0.p(5, StandardCharsets.US_ASCII, StandardCharsets.UTF_8, StandardCharsets.UTF_16, StandardCharsets.UTF_16BE, StandardCharsets.UTF_16LE);
    public static final AtomicBoolean g = new AtomicBoolean();
    public byte[] a;
    public int b;
    public int c;

    public y() {
        this.a = n0.b;
    }

    public static int b(int i3, int i10, int i11, int i12) {
        byte b10 = (byte) i11;
        return od.c((byte) 0, qd.a(((i3 & 7) << 2) | ((i10 & 48) >> 4)), qd.a(((((byte) i10) & 15) << 4) | ((b10 & 60) >> 2)), qd.a(((b10 & 3) << 6) | (((byte) i12) & 63)));
    }

    public static int d(Charset charset) {
        zb.h(f.contains(charset), "Unsupported charset: %s", charset);
        return (charset.equals(StandardCharsets.UTF_8) || charset.equals(StandardCharsets.US_ASCII)) ? 1 : 2;
    }

    public static boolean e(byte b10) {
        return (b10 & 192) == 128;
    }

    public final int A() {
        f(1);
        byte[] bArr = this.a;
        int i3 = this.b;
        this.b = i3 + 1;
        return bArr[i3] & 255;
    }

    public final int B() {
        f(4);
        byte[] bArr = this.a;
        int i3 = this.b;
        int i10 = i3 + 1;
        this.b = i10;
        int i11 = (bArr[i3] & 255) << 8;
        this.b = i3 + 2;
        int i12 = (bArr[i10] & 255) | i11;
        this.b = i3 + 4;
        return i12;
    }

    public final long C() {
        f(4);
        byte[] bArr = this.a;
        int i3 = this.b;
        this.b = i3 + 1;
        this.b = i3 + 2;
        long j10 = ((bArr[i3] & 255) << 24) | ((bArr[r3] & 255) << 16);
        this.b = i3 + 3;
        long j11 = j10 | ((bArr[r8] & 255) << 8);
        this.b = i3 + 4;
        return (bArr[r3] & 255) | j11;
    }

    public final int D() {
        f(3);
        byte[] bArr = this.a;
        int i3 = this.b;
        int i10 = i3 + 1;
        this.b = i10;
        int i11 = (bArr[i3] & 255) << 16;
        int i12 = i3 + 2;
        this.b = i12;
        int i13 = ((bArr[i10] & 255) << 8) | i11;
        this.b = i3 + 3;
        return (bArr[i12] & 255) | i13;
    }

    public final int E() {
        int m10 = m();
        if (m10 >= 0) {
            return m10;
        }
        throw new IllegalStateException(p1.i(m10, "Top bit not zero: "));
    }

    public final int F() {
        long j10 = 0;
        for (int i3 = 0; i3 < 9; i3++) {
            if (this.b == this.c) {
                throw new IllegalStateException("Attempting to read a byte over the limit.");
            }
            long A = A();
            j10 |= (127 & A) << (i3 * 7);
            if ((A & 128) == 0) {
                break;
            }
        }
        return od.b(j10);
    }

    public final long G() {
        long u10 = u();
        if (u10 >= 0) {
            return u10;
        }
        throw new IllegalStateException(a1.g.p(u10, "Top bit not zero: "));
    }

    public final int H() {
        f(2);
        byte[] bArr = this.a;
        int i3 = this.b;
        int i10 = i3 + 1;
        this.b = i10;
        int i11 = (bArr[i3] & 255) << 8;
        this.b = i3 + 2;
        return (bArr[i10] & 255) | i11;
    }

    public final long I() {
        int i3;
        f(1);
        long j10 = this.a[this.b];
        int i10 = 7;
        while (true) {
            if (i10 < 0) {
                break;
            }
            if (((1 << i10) & j10) != 0) {
                i10--;
            } else if (i10 < 6) {
                j10 &= r6 - 1;
                i3 = 7 - i10;
            } else if (i10 == 7) {
                i3 = 1;
            }
        }
        i3 = 0;
        if (i3 == 0) {
            throw new NumberFormatException(a1.g.p(j10, "Invalid UTF-8 sequence first byte: "));
        }
        f(i3);
        for (int i11 = 1; i11 < i3; i11++) {
            if ((this.a[this.b + i11] & 192) != 128) {
                throw new NumberFormatException(a1.g.p(j10, "Invalid UTF-8 sequence continuation byte: "));
            }
            j10 = (j10 << 6) | (r4 & 63);
        }
        this.b += i3;
        return j10;
    }

    public final Charset J() {
        if (a() >= 3) {
            byte[] bArr = this.a;
            int i3 = this.b;
            if (bArr[i3] == -17 && bArr[i3 + 1] == -69 && bArr[i3 + 2] == -65) {
                this.b = i3 + 3;
                return StandardCharsets.UTF_8;
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
            return StandardCharsets.UTF_16BE;
        }
        if (b10 != -1 || bArr2[i10 + 1] != -2) {
            return null;
        }
        this.b = i10 + 2;
        return StandardCharsets.UTF_16LE;
    }

    public final void K(int i3) {
        byte[] bArr = this.a;
        if (bArr.length < i3) {
            bArr = new byte[i3];
        }
        L(i3, bArr);
    }

    public final void L(int i3, byte[] bArr) {
        this.a = bArr;
        this.c = i3;
        this.b = 0;
    }

    public final void M(int i3) {
        zb.f(i3 >= 0 && i3 <= this.a.length);
        this.c = i3;
    }

    public final void N(int i3) {
        zb.f(i3 >= 0 && i3 <= this.c);
        this.b = i3;
    }

    public final void O(int i3) {
        N(this.b + i3);
    }

    public final int a() {
        return Math.max(this.c - this.b, 0);
    }

    public final void c(int i3) {
        byte[] bArr = this.a;
        if (i3 > bArr.length) {
            this.a = Arrays.copyOf(bArr, i3);
        }
    }

    public final void f(int i3) {
        if (!g.get() || a() >= i3) {
            return;
        }
        StringBuilder m10 = p1.m(i3, "bytesNeeded= ", ", bytesLeft=");
        m10.append(a());
        throw new IndexOutOfBoundsException(m10.toString());
    }

    public final char g(int i3, ByteOrder byteOrder) {
        byte b10;
        byte b11;
        f(2);
        if (byteOrder == ByteOrder.BIG_ENDIAN) {
            byte[] bArr = this.a;
            int i10 = this.b + i3;
            b10 = bArr[i10];
            b11 = bArr[i10 + 1];
        } else {
            byte[] bArr2 = this.a;
            int i11 = this.b + i3;
            b10 = bArr2[i11 + 1];
            b11 = bArr2[i11];
        }
        return (char) ((b10 << 8) | (b11 & 255));
    }

    public final int h(Charset charset) {
        int i3;
        int i10;
        zb.h(f.contains(charset), "Unsupported charset: %s", charset);
        if (a() < d(charset)) {
            throw new IndexOutOfBoundsException("position=" + this.b + ", limit=" + this.c);
        }
        int i11 = 1;
        if (charset.equals(StandardCharsets.US_ASCII)) {
            byte b10 = this.a[this.b];
            if ((b10 & 128) != 0) {
                return 0;
            }
            i3 = b10 & 255;
        } else if (charset.equals(StandardCharsets.UTF_8)) {
            byte b11 = this.a[this.b];
            int i12 = (b11 & 128) == 0 ? 1 : ((b11 & 224) == 192 && a() >= 2 && e(this.a[this.b + 1])) ? 2 : ((this.a[this.b] & 240) == 224 && a() >= 3 && e(this.a[this.b + 1]) && e(this.a[this.b + 2])) ? 3 : ((this.a[this.b] & 248) == 240 && a() >= 4 && e(this.a[this.b + 1]) && e(this.a[this.b + 2]) && e(this.a[this.b + 3])) ? 4 : 0;
            if (i12 == 1) {
                i10 = this.a[this.b] & 255;
            } else if (i12 == 2) {
                byte[] bArr = this.a;
                int i13 = this.b;
                i10 = b(0, 0, bArr[i13], bArr[i13 + 1]);
            } else if (i12 == 3) {
                byte[] bArr2 = this.a;
                int i14 = this.b;
                i10 = b(0, bArr2[i14] & 15, bArr2[i14 + 1], bArr2[i14 + 2]);
            } else {
                if (i12 != 4) {
                    return 0;
                }
                byte[] bArr3 = this.a;
                int i15 = this.b;
                i10 = b(bArr3[i15], bArr3[i15 + 1], bArr3[i15 + 2], bArr3[i15 + 3]);
            }
            i11 = i12;
            i3 = i10;
        } else {
            ByteOrder byteOrder = charset.equals(StandardCharsets.UTF_16LE) ? ByteOrder.LITTLE_ENDIAN : ByteOrder.BIG_ENDIAN;
            char g7 = g(0, byteOrder);
            if (!Character.isHighSurrogate(g7) || a() < 4) {
                i3 = g7;
                i11 = 2;
            } else {
                i3 = Character.toCodePoint(g7, g(2, byteOrder));
                i11 = 4;
            }
        }
        return (i3 << 8) | i11;
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

    public final void k(int i3, int i10, byte[] bArr) {
        f(i10);
        System.arraycopy(this.a, this.b, bArr, i3, i10);
        this.b += i10;
    }

    public final char l(Charset charset, char[] cArr) {
        int h;
        if (a() >= d(charset) && (h = h(charset)) != 0) {
            long j10 = h >>> 8;
            zb.d(j10, "out of range: %s", (j10 >> 32) == 0);
            int i3 = (int) j10;
            if (!Character.isSupplementaryCodePoint(i3)) {
                long j11 = i3;
                char c2 = (char) j11;
                zb.d(j11, "Out of range: %s", ((long) c2) == j11);
                for (char c10 : cArr) {
                    if (c10 == c2) {
                        this.b = od.b(h & hs.e4) + this.b;
                        return c2;
                    }
                }
            }
        }
        return (char) 0;
    }

    public final int m() {
        f(4);
        byte[] bArr = this.a;
        int i3 = this.b;
        int i10 = i3 + 1;
        this.b = i10;
        int i11 = (bArr[i3] & 255) << 24;
        int i12 = i3 + 2;
        this.b = i12;
        int i13 = ((bArr[i10] & 255) << 16) | i11;
        int i14 = i3 + 3;
        this.b = i14;
        int i15 = i13 | ((bArr[i12] & 255) << 8);
        this.b = i3 + 4;
        return (bArr[i14] & 255) | i15;
    }

    public final String n(Charset charset) {
        int i3;
        zb.h(f.contains(charset), "Unsupported charset: %s", charset);
        if (a() == 0) {
            return null;
        }
        Charset charset2 = StandardCharsets.US_ASCII;
        if (!charset.equals(charset2)) {
            J();
        }
        if (charset.equals(StandardCharsets.UTF_8) || charset.equals(charset2)) {
            i3 = 1;
        } else {
            if (!charset.equals(StandardCharsets.UTF_16) && !charset.equals(StandardCharsets.UTF_16LE) && !charset.equals(StandardCharsets.UTF_16BE)) {
                throw new IllegalArgumentException("Unsupported charset: " + charset);
            }
            i3 = 2;
        }
        int i10 = this.b;
        while (true) {
            int i11 = this.c;
            if (i10 >= i11 - (i3 - 1)) {
                i10 = i11;
                break;
            }
            if ((charset.equals(StandardCharsets.UTF_8) || charset.equals(StandardCharsets.US_ASCII)) && n0.O(this.a[i10])) {
                break;
            }
            if (charset.equals(StandardCharsets.UTF_16) || charset.equals(StandardCharsets.UTF_16BE)) {
                byte[] bArr = this.a;
                if (bArr[i10] == 0 && n0.O(bArr[i10 + 1])) {
                    break;
                }
            }
            if (charset.equals(StandardCharsets.UTF_16LE)) {
                byte[] bArr2 = this.a;
                if (bArr2[i10 + 1] == 0 && n0.O(bArr2[i10])) {
                    break;
                }
            }
            i10 += i3;
        }
        String y9 = y(i10 - this.b, charset);
        if (this.b != this.c && l(charset, d) == '\r') {
            l(charset, e);
        }
        return y9;
    }

    public final int o() {
        f(4);
        byte[] bArr = this.a;
        int i3 = this.b;
        int i10 = i3 + 1;
        this.b = i10;
        int i11 = bArr[i3] & 255;
        int i12 = i3 + 2;
        this.b = i12;
        int i13 = ((bArr[i10] & 255) << 8) | i11;
        int i14 = i3 + 3;
        this.b = i14;
        int i15 = i13 | ((bArr[i12] & 255) << 16);
        this.b = i3 + 4;
        return ((bArr[i14] & 255) << 24) | i15;
    }

    public final long p() {
        f(8);
        byte[] bArr = this.a;
        int i3 = this.b;
        this.b = i3 + 1;
        this.b = i3 + 2;
        long j10 = (bArr[i3] & 255) | ((bArr[r3] & 255) << 8);
        this.b = i3 + 3;
        long j11 = j10 | ((bArr[r8] & 255) << 16);
        this.b = i3 + 4;
        long j12 = j11 | ((bArr[r3] & 255) << 24);
        this.b = i3 + 5;
        long j13 = j12 | ((bArr[r8] & 255) << 32);
        this.b = i3 + 6;
        long j14 = j13 | ((bArr[r3] & 255) << 40);
        this.b = i3 + 7;
        long j15 = j14 | ((bArr[r8] & 255) << 48);
        this.b = i3 + 8;
        return ((bArr[r3] & 255) << 56) | j15;
    }

    public final short q() {
        f(2);
        byte[] bArr = this.a;
        int i3 = this.b;
        int i10 = i3 + 1;
        this.b = i10;
        int i11 = bArr[i3] & 255;
        this.b = i3 + 2;
        return (short) (((bArr[i10] & 255) << 8) | i11);
    }

    public final long r() {
        f(4);
        byte[] bArr = this.a;
        int i3 = this.b;
        this.b = i3 + 1;
        this.b = i3 + 2;
        long j10 = (bArr[i3] & 255) | ((bArr[r3] & 255) << 8);
        this.b = i3 + 3;
        long j11 = j10 | ((bArr[r8] & 255) << 16);
        this.b = i3 + 4;
        return ((bArr[r3] & 255) << 24) | j11;
    }

    public final int s() {
        int o10 = o();
        if (o10 >= 0) {
            return o10;
        }
        throw new IllegalStateException(p1.i(o10, "Top bit not zero: "));
    }

    public final int t() {
        f(2);
        byte[] bArr = this.a;
        int i3 = this.b;
        int i10 = i3 + 1;
        this.b = i10;
        int i11 = bArr[i3] & 255;
        this.b = i3 + 2;
        return ((bArr[i10] & 255) << 8) | i11;
    }

    public final long u() {
        f(8);
        byte[] bArr = this.a;
        int i3 = this.b;
        this.b = i3 + 1;
        this.b = i3 + 2;
        long j10 = ((bArr[i3] & 255) << 56) | ((bArr[r3] & 255) << 48);
        this.b = i3 + 3;
        long j11 = j10 | ((bArr[r8] & 255) << 40);
        this.b = i3 + 4;
        long j12 = j11 | ((bArr[r3] & 255) << 32);
        this.b = i3 + 5;
        long j13 = j12 | ((bArr[r8] & 255) << 24);
        this.b = i3 + 6;
        long j14 = j13 | ((bArr[r3] & 255) << 16);
        this.b = i3 + 7;
        long j15 = j14 | ((bArr[r8] & 255) << 8);
        this.b = i3 + 8;
        return (bArr[r3] & 255) | j15;
    }

    public final String v() {
        if (a() == 0) {
            return null;
        }
        int i3 = this.b;
        while (i3 < this.c && this.a[i3] != 0) {
            i3++;
        }
        byte[] bArr = this.a;
        int i10 = this.b;
        String str = n0.a;
        String str2 = new String(bArr, i10, i3 - i10, StandardCharsets.UTF_8);
        this.b = i3;
        if (i3 < this.c) {
            this.b = i3 + 1;
        }
        return str2;
    }

    public final String w(int i3) {
        f(i3);
        if (i3 == 0) {
            return "";
        }
        int i10 = this.b;
        int i11 = (i10 + i3) - 1;
        int i12 = (i11 >= this.c || this.a[i11] != 0) ? i3 : i3 - 1;
        byte[] bArr = this.a;
        String str = n0.a;
        String str2 = new String(bArr, i10, i12, StandardCharsets.UTF_8);
        this.b += i3;
        return str2;
    }

    public final short x() {
        f(2);
        byte[] bArr = this.a;
        int i3 = this.b;
        int i10 = i3 + 1;
        this.b = i10;
        int i11 = (bArr[i3] & 255) << 8;
        this.b = i3 + 2;
        return (short) ((bArr[i10] & 255) | i11);
    }

    public final String y(int i3, Charset charset) {
        f(i3);
        String str = new String(this.a, this.b, i3, charset);
        this.b += i3;
        return str;
    }

    public final int z() {
        return (A() << 21) | (A() << 14) | (A() << 7) | A();
    }

    public y(int i3) {
        this.a = new byte[i3];
        this.c = i3;
    }

    public y(byte[] bArr) {
        this.a = bArr;
        this.c = bArr.length;
    }

    public y(byte[] bArr, int i3) {
        this.a = bArr;
        this.c = i3;
    }
}
