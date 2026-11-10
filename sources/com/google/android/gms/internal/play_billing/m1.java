package com.google.android.gms.internal.play_billing;

import a8.i9;
import java.util.Locale;
import java.util.logging.Level;
import java.util.logging.Logger;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes.dex */
public final class m1 extends i9 {
    public static final Logger e = Logger.getLogger(m1.class.getName());
    public static final boolean f = c3.e;
    public i2 a;
    public final byte[] b;
    public final int c;
    public int d;

    public m1(byte[] bArr, int i7) {
        int length = bArr.length;
        if (((length - i7) | i7) < 0) {
            Locale locale = Locale.US;
            throw new IllegalArgumentException(a8.p0.m(length, i7, "Array range is invalid. Buffer.length=", ", offset=0, length="));
        }
        this.b = bArr;
        this.d = 0;
        this.c = i7;
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

    public static int b(int i7) {
        return (352 - (Integer.numberOfLeadingZeros(i7) * 9)) >>> 6;
    }

    public static int c(long j3) {
        return (640 - (Long.numberOfLeadingZeros(j3) * 9)) >>> 6;
    }

    public final void d(int i7, byte[] bArr) {
        try {
            System.arraycopy(bArr, 0, this.b, this.d, i7);
            this.d += i7;
        } catch (IndexOutOfBoundsException e10) {
            throw new androidx.datastore.preferences.protobuf.l(this.d, this.c, i7, e10);
        }
    }

    public final void e(int i7, l1 l1Var) {
        o((i7 << 3) | 2);
        o(l1Var.j());
        d(l1Var.j(), l1Var.b);
    }

    public final void f(int i7, int i10) {
        o((i7 << 3) | 5);
        g(i10);
    }

    public final void g(int i7) {
        int i10 = this.d;
        try {
            byte[] bArr = this.b;
            bArr[i10] = (byte) i7;
            bArr[i10 + 1] = (byte) (i7 >> 8);
            bArr[i10 + 2] = (byte) (i7 >> 16);
            bArr[i10 + 3] = (byte) (i7 >> 24);
            this.d = i10 + 4;
        } catch (IndexOutOfBoundsException e10) {
            throw new androidx.datastore.preferences.protobuf.l(i10, this.c, 4, e10);
        }
    }

    public final void h(int i7, long j3) {
        o((i7 << 3) | 1);
        i(j3);
    }

    public final void i(long j3) {
        int i7 = this.d;
        try {
            byte[] bArr = this.b;
            bArr[i7] = (byte) j3;
            bArr[i7 + 1] = (byte) (j3 >> 8);
            bArr[i7 + 2] = (byte) (j3 >> 16);
            bArr[i7 + 3] = (byte) (j3 >> 24);
            bArr[i7 + 4] = (byte) (j3 >> 32);
            bArr[i7 + 5] = (byte) (j3 >> 40);
            bArr[i7 + 6] = (byte) (j3 >> 48);
            bArr[i7 + 7] = (byte) (j3 >> 56);
            this.d = i7 + 8;
        } catch (IndexOutOfBoundsException e10) {
            throw new androidx.datastore.preferences.protobuf.l(i7, this.c, 8, e10);
        }
    }

    public final void j(int i7, int i10) {
        o(i7 << 3);
        k(i10);
    }

    public final void k(int i7) {
        if (i7 >= 0) {
            o(i7);
        } else {
            q(i7);
        }
    }

    public final void l(int i7, String str) {
        o((i7 << 3) | 2);
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
                throw new androidx.datastore.preferences.protobuf.l(e11);
            }
        } catch (IndexOutOfBoundsException e12) {
            throw new androidx.datastore.preferences.protobuf.l(e12);
        }
    }

    public final void m(int i7, int i10) {
        o((i7 << 3) | i10);
    }

    public final void n(int i7, int i10) {
        o(i7 << 3);
        o(i10);
    }

    public final void o(int i7) {
        int i10;
        int i11 = this.d;
        while (true) {
            int i12 = i7 & (-128);
            byte[] bArr = this.b;
            if (i12 == 0) {
                i10 = i11 + 1;
                bArr[i11] = (byte) i7;
                this.d = i10;
                return;
            } else {
                i10 = i11 + 1;
                try {
                    bArr[i11] = (byte) (i7 | 128);
                    i7 >>>= 7;
                    i11 = i10;
                } catch (IndexOutOfBoundsException e10) {
                    throw new androidx.datastore.preferences.protobuf.l(i10, this.c, 1, e10);
                }
            }
            throw new androidx.datastore.preferences.protobuf.l(i10, this.c, 1, e10);
        }
    }

    public final void p(int i7, long j3) {
        o(i7 << 3);
        q(j3);
    }

    public final void q(long j3) {
        int i7;
        int i10 = this.d;
        boolean z9 = f;
        int i11 = this.c;
        byte[] bArr = this.b;
        if (!z9 || i11 - i10 < 10) {
            long j10 = j3;
            while ((j10 & (-128)) != 0) {
                i7 = i10 + 1;
                try {
                    bArr[i10] = (byte) (((int) j10) | 128);
                    j10 >>>= 7;
                    i10 = i7;
                } catch (IndexOutOfBoundsException e10) {
                    throw new androidx.datastore.preferences.protobuf.l(i7, i11, 1, e10);
                }
            }
            i7 = i10 + 1;
            bArr[i10] = (byte) j10;
        } else {
            long j11 = j3;
            while ((j11 & (-128)) != 0) {
                c3.c.d(bArr, c3.f + i10, (byte) (((int) j11) | 128));
                j11 >>>= 7;
                i10++;
            }
            i7 = i10 + 1;
            c3.c.d(bArr, c3.f + i10, (byte) j11);
        }
        this.d = i7;
    }
}
