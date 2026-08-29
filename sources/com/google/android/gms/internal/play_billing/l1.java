package com.google.android.gms.internal.play_billing;

import com.google.android.gms.internal.cast.z4;
import h7.q6;
import java.util.Locale;
import java.util.logging.Level;
import java.util.logging.Logger;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public final class l1 extends q6 {
    public static final Logger e = Logger.getLogger(l1.class.getName());
    public static final boolean f = b3.e;
    public h2 a;
    public final byte[] b;
    public final int c;
    public int d;

    public l1(byte[] bArr, int i10) {
        int length = bArr.length;
        if (((length - i10) | i10) < 0) {
            Locale locale = Locale.US;
            throw new IllegalArgumentException(a4.w.k(length, i10, "Array range is invalid. Buffer.length=", ", offset=0, length="));
        }
        this.b = bArr;
        this.d = 0;
        this.c = i10;
    }

    public static int a(String str) {
        int length;
        try {
            length = d3.c(str);
        } catch (c3 unused) {
            length = str.getBytes(z1.a).length;
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
        } catch (IndexOutOfBoundsException e10) {
            throw new z4(this.d, this.c, i10, e10);
        }
    }

    public final void e(int i10, k1 k1Var) {
        o((i10 << 3) | 2);
        o(k1Var.o());
        d(k1Var.o(), k1Var.b);
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
        } catch (IndexOutOfBoundsException e10) {
            throw new z4(i11, this.c, 4, e10);
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
        } catch (IndexOutOfBoundsException e10) {
            throw new z4(i10, this.c, 8, e10);
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
                o(d3.c(str));
                int i13 = this.d;
                this.d = d3.b(str, bArr, i13, i12 - i13);
            } else {
                int i14 = i11 + b11;
                this.d = i14;
                int b12 = d3.b(str, bArr, i14, i12 - i14);
                this.d = i11;
                o((b12 - i11) - b11);
                this.d = b12;
            }
        } catch (c3 e10) {
            this.d = i11;
            e.logp(Level.WARNING, "com.google.protobuf.CodedOutputStream", "inefficientWriteStringNoTag", "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", (Throwable) e10);
            byte[] bytes = str.getBytes(z1.a);
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
                } catch (IndexOutOfBoundsException e10) {
                    throw new z4(i11, this.c, 1, e10);
                }
            }
            throw new z4(i11, this.c, 1, e10);
        }
    }

    public final void p(int i10, long j10) {
        o(i10 << 3);
        q(j10);
    }

    public final void q(long j10) {
        int i10;
        int i11 = this.d;
        boolean z10 = f;
        int i12 = this.c;
        byte[] bArr = this.b;
        if (!z10 || i12 - i11 < 10) {
            long j11 = j10;
            while ((j11 & (-128)) != 0) {
                i10 = i11 + 1;
                try {
                    bArr[i11] = (byte) (((int) j11) | 128);
                    j11 >>>= 7;
                    i11 = i10;
                } catch (IndexOutOfBoundsException e10) {
                    throw new z4(i10, i12, 1, e10);
                }
            }
            i10 = i11 + 1;
            bArr[i11] = (byte) j11;
        } else {
            long j12 = j10;
            while ((j12 & (-128)) != 0) {
                b3.c.d(bArr, b3.f + i11, (byte) (((int) j12) | 128));
                j12 >>>= 7;
                i11++;
            }
            i10 = i11 + 1;
            b3.c.d(bArr, b3.f + i11, (byte) j12);
        }
        this.d = i10;
    }
}
