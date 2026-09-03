package com.google.android.gms.internal.play_billing;

import j7.s6;
import java.util.Locale;
import java.util.logging.Level;
import java.util.logging.Logger;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes.dex */
public final class m1 extends s6 {
    public static final Logger e = Logger.getLogger(m1.class.getName());
    public static final boolean f = c3.e;
    public i2 a;
    public final byte[] b;
    public final int c;
    public int d;

    public m1(byte[] bArr, int i10) {
        int length = bArr.length;
        if (((length - i10) | i10) < 0) {
            Locale locale = Locale.US;
            throw new IllegalArgumentException(android.support.v4.media.a.k(length, i10, "Array range is invalid. Buffer.length=", ", offset=0, length="));
        }
        this.b = bArr;
        this.d = 0;
        this.c = i10;
    }

    public static int a(String str) {
        int length;
        try {
            length = e3.c(str);
        } catch (d3 unused) {
            length = str.getBytes(a2.a).length;
        }
        return b(length) + length;
    }

    public static int b(int i10) {
        return (352 - (Integer.numberOfLeadingZeros(i10) * 9)) >>> 6;
    }

    public static int c(long j10) {
        return (640 - (Long.numberOfLeadingZeros(j10) * 9)) >>> 6;
    }

    public final void d(int i10, byte[] bArr) {
        try {
            System.arraycopy(bArr, 0, this.b, this.d, i10);
            this.d += i10;
        } catch (IndexOutOfBoundsException e6) {
            throw new b7.y0(this.d, this.c, i10, e6);
        }
    }

    public final void e(int i10, l1 l1Var) {
        o((i10 << 3) | 2);
        o(l1Var.o());
        d(l1Var.o(), l1Var.b);
    }

    public final void f(int i10, int i11) {
        o((i10 << 3) | 5);
        g(i11);
    }

    public final void g(int i10) {
        int i11 = this.d;
        try {
            byte[] bArr = this.b;
            bArr[i11] = (byte) i10;
            bArr[i11 + 1] = (byte) (i10 >> 8);
            bArr[i11 + 2] = (byte) (i10 >> 16);
            bArr[i11 + 3] = (byte) (i10 >> 24);
            this.d = i11 + 4;
        } catch (IndexOutOfBoundsException e6) {
            throw new b7.y0(i11, this.c, 4, e6);
        }
    }

    public final void h(int i10, long j10) {
        o((i10 << 3) | 1);
        i(j10);
    }

    public final void i(long j10) {
        int i10 = this.d;
        try {
            byte[] bArr = this.b;
            bArr[i10] = (byte) j10;
            bArr[i10 + 1] = (byte) (j10 >> 8);
            bArr[i10 + 2] = (byte) (j10 >> 16);
            bArr[i10 + 3] = (byte) (j10 >> 24);
            bArr[i10 + 4] = (byte) (j10 >> 32);
            bArr[i10 + 5] = (byte) (j10 >> 40);
            bArr[i10 + 6] = (byte) (j10 >> 48);
            bArr[i10 + 7] = (byte) (j10 >> 56);
            this.d = i10 + 8;
        } catch (IndexOutOfBoundsException e6) {
            throw new b7.y0(i10, this.c, 8, e6);
        }
    }

    public final void j(int i10, int i11) {
        o(i10 << 3);
        k(i11);
    }

    public final void k(int i10) {
        if (i10 >= 0) {
            o(i10);
        } else {
            q(i10);
        }
    }

    public final void l(int i10, String str) {
        o((i10 << 3) | 2);
        int i11 = this.d;
        try {
            int b10 = b(str.length() * 3);
            int b11 = b(str.length());
            int i12 = this.c;
            byte[] bArr = this.b;
            if (b11 != b10) {
                o(e3.c(str));
                int i13 = this.d;
                this.d = e3.b(str, bArr, i13, i12 - i13);
            } else {
                int i14 = i11 + b11;
                this.d = i14;
                int b12 = e3.b(str, bArr, i14, i12 - i14);
                this.d = i11;
                o((b12 - i11) - b11);
                this.d = b12;
            }
        } catch (d3 e6) {
            this.d = i11;
            e.logp(Level.WARNING, "com.google.protobuf.CodedOutputStream", "inefficientWriteStringNoTag", "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", (Throwable) e6);
            byte[] bytes = str.getBytes(a2.a);
            try {
                int length = bytes.length;
                o(length);
                d(length, bytes);
            } catch (IndexOutOfBoundsException e10) {
                throw new b7.y0(e10);
            }
        } catch (IndexOutOfBoundsException e11) {
            throw new b7.y0(e11);
        }
    }

    public final void m(int i10, int i11) {
        o((i10 << 3) | i11);
    }

    public final void n(int i10, int i11) {
        o(i10 << 3);
        o(i11);
    }

    public final void o(int i10) {
        int i11;
        int i12 = this.d;
        while (true) {
            int i13 = i10 & (-128);
            byte[] bArr = this.b;
            if (i13 == 0) {
                i11 = i12 + 1;
                bArr[i12] = (byte) i10;
                this.d = i11;
                return;
            } else {
                i11 = i12 + 1;
                try {
                    bArr[i12] = (byte) (i10 | 128);
                    i10 >>>= 7;
                    i12 = i11;
                } catch (IndexOutOfBoundsException e6) {
                    throw new b7.y0(i11, this.c, 1, e6);
                }
            }
            throw new b7.y0(i11, this.c, 1, e6);
        }
    }

    public final void p(int i10, long j10) {
        o(i10 << 3);
        q(j10);
    }

    public final void q(long j10) {
        int i10;
        int i11 = this.d;
        boolean z4 = f;
        int i12 = this.c;
        byte[] bArr = this.b;
        if (!z4 || i12 - i11 < 10) {
            long j11 = j10;
            while ((j11 & (-128)) != 0) {
                i10 = i11 + 1;
                try {
                    bArr[i11] = (byte) (((int) j11) | 128);
                    j11 >>>= 7;
                    i11 = i10;
                } catch (IndexOutOfBoundsException e6) {
                    throw new b7.y0(i10, i12, 1, e6);
                }
            }
            i10 = i11 + 1;
            bArr[i11] = (byte) j11;
        } else {
            long j12 = j10;
            while ((j12 & (-128)) != 0) {
                c3.c.d(bArr, c3.f + i11, (byte) (((int) j12) | 128));
                j12 >>>= 7;
                i11++;
            }
            i10 = i11 + 1;
            c3.c.d(bArr, c3.f + i11, (byte) j12);
        }
        this.d = i10;
    }
}
