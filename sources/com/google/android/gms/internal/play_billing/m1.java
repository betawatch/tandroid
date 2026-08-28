package com.google.android.gms.internal.play_billing;

import com.google.android.gms.internal.cast.z4;
import f7.e6;
import java.util.Locale;
import java.util.logging.Level;
import java.util.logging.Logger;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class m1 extends e6 {
    public static final Logger e = Logger.getLogger(m1.class.getName());
    public static final boolean f = c3.e;
    public i2 a;
    public final byte[] b;
    public final int c;
    public int d;

    public m1(byte[] bArr, int i9) {
        int length = bArr.length;
        if (((length - i9) | i9) < 0) {
            Locale locale = Locale.US;
            throw new IllegalArgumentException(aa.d.k(length, i9, "Array range is invalid. Buffer.length=", ", offset=0, length="));
        }
        this.b = bArr;
        this.d = 0;
        this.c = i9;
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

    public static int b(int i9) {
        return (352 - (Integer.numberOfLeadingZeros(i9) * 9)) >>> 6;
    }

    public static int c(long j10) {
        return (640 - (Long.numberOfLeadingZeros(j10) * 9)) >>> 6;
    }

    public final void d(int i9, byte[] bArr) {
        try {
            System.arraycopy(bArr, 0, this.b, this.d, i9);
            this.d += i9;
        } catch (IndexOutOfBoundsException e10) {
            throw new z4(this.d, this.c, i9, e10);
        }
    }

    public final void e(int i9, l1 l1Var) {
        o((i9 << 3) | 2);
        o(l1Var.o());
        d(l1Var.o(), l1Var.b);
    }

    public final void f(int i9, int i10) {
        o((i9 << 3) | 5);
        g(i10);
    }

    public final void g(int i9) {
        int i10 = this.d;
        try {
            byte[] bArr = this.b;
            bArr[i10] = (byte) i9;
            bArr[i10 + 1] = (byte) (i9 >> 8);
            bArr[i10 + 2] = (byte) (i9 >> 16);
            bArr[i10 + 3] = (byte) (i9 >> 24);
            this.d = i10 + 4;
        } catch (IndexOutOfBoundsException e10) {
            throw new z4(i10, this.c, 4, e10);
        }
    }

    public final void h(int i9, long j10) {
        o((i9 << 3) | 1);
        i(j10);
    }

    public final void i(long j10) {
        int i9 = this.d;
        try {
            byte[] bArr = this.b;
            bArr[i9] = (byte) j10;
            bArr[i9 + 1] = (byte) (j10 >> 8);
            bArr[i9 + 2] = (byte) (j10 >> 16);
            bArr[i9 + 3] = (byte) (j10 >> 24);
            bArr[i9 + 4] = (byte) (j10 >> 32);
            bArr[i9 + 5] = (byte) (j10 >> 40);
            bArr[i9 + 6] = (byte) (j10 >> 48);
            bArr[i9 + 7] = (byte) (j10 >> 56);
            this.d = i9 + 8;
        } catch (IndexOutOfBoundsException e10) {
            throw new z4(i9, this.c, 8, e10);
        }
    }

    public final void j(int i9, int i10) {
        o(i9 << 3);
        k(i10);
    }

    public final void k(int i9) {
        if (i9 >= 0) {
            o(i9);
        } else {
            q(i9);
        }
    }

    public final void l(int i9, String str) {
        o((i9 << 3) | 2);
        int i10 = this.d;
        try {
            int b10 = b(str.length() * 3);
            int b11 = b(str.length());
            int i11 = this.c;
            byte[] bArr = this.b;
            if (b11 != b10) {
                o(e3.c(str));
                int i12 = this.d;
                this.d = e3.b(str, bArr, i12, i11 - i12);
            } else {
                int i13 = i10 + b11;
                this.d = i13;
                int b12 = e3.b(str, bArr, i13, i11 - i13);
                this.d = i10;
                o((b12 - i10) - b11);
                this.d = b12;
            }
        } catch (d3 e10) {
            this.d = i10;
            e.logp(Level.WARNING, "com.google.protobuf.CodedOutputStream", "inefficientWriteStringNoTag", "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", (Throwable) e10);
            byte[] bytes = str.getBytes(a2.a);
            try {
                int length = bytes.length;
                o(length);
                d(length, bytes);
            } catch (IndexOutOfBoundsException e11) {
                throw new z4(e11);
            }
        } catch (IndexOutOfBoundsException e12) {
            throw new z4(e12);
        }
    }

    public final void m(int i9, int i10) {
        o((i9 << 3) | i10);
    }

    public final void n(int i9, int i10) {
        o(i9 << 3);
        o(i10);
    }

    public final void o(int i9) {
        int i10;
        int i11 = this.d;
        while (true) {
            int i12 = i9 & (-128);
            byte[] bArr = this.b;
            if (i12 == 0) {
                i10 = i11 + 1;
                bArr[i11] = (byte) i9;
                this.d = i10;
                return;
            } else {
                i10 = i11 + 1;
                try {
                    bArr[i11] = (byte) (i9 | 128);
                    i9 >>>= 7;
                    i11 = i10;
                } catch (IndexOutOfBoundsException e10) {
                    throw new z4(i10, this.c, 1, e10);
                }
            }
            throw new z4(i10, this.c, 1, e10);
        }
    }

    public final void p(int i9, long j10) {
        o(i9 << 3);
        q(j10);
    }

    public final void q(long j10) {
        int i9;
        int i10 = this.d;
        boolean z10 = f;
        int i11 = this.c;
        byte[] bArr = this.b;
        if (!z10 || i11 - i10 < 10) {
            long j11 = j10;
            while ((j11 & (-128)) != 0) {
                i9 = i10 + 1;
                try {
                    bArr[i10] = (byte) (((int) j11) | 128);
                    j11 >>>= 7;
                    i10 = i9;
                } catch (IndexOutOfBoundsException e10) {
                    throw new z4(i9, i11, 1, e10);
                }
            }
            i9 = i10 + 1;
            bArr[i10] = (byte) j11;
        } else {
            long j12 = j10;
            while ((j12 & (-128)) != 0) {
                c3.c.d(bArr, c3.f + i10, (byte) (((int) j12) | 128));
                j12 >>>= 7;
                i10++;
            }
            i9 = i10 + 1;
            c3.c.d(bArr, c3.f + i10, (byte) j12);
        }
        this.d = i9;
    }
}
