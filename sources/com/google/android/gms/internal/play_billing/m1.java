package com.google.android.gms.internal.play_billing;

import b8.wa;
import java.util.Locale;
import java.util.logging.Level;
import java.util.logging.Logger;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class m1 extends wa {
    public static final Logger e = Logger.getLogger(m1.class.getName());
    public static final boolean f = c3.e;
    public i2 a;
    public final byte[] b;
    public final int c;
    public int d;

    public m1(byte[] bArr, int i3) {
        int length = bArr.length;
        if (((length - i3) | i3) < 0) {
            Locale locale = Locale.US;
            throw new IllegalArgumentException(a1.g.n(length, i3, "Array range is invalid. Buffer.length=", ", offset=0, length="));
        }
        this.b = bArr;
        this.d = 0;
        this.c = i3;
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

    public static int b(int i3) {
        return (352 - (Integer.numberOfLeadingZeros(i3) * 9)) >>> 6;
    }

    public static int c(long j10) {
        return (640 - (Long.numberOfLeadingZeros(j10) * 9)) >>> 6;
    }

    public final void d(int i3, byte[] bArr) {
        try {
            System.arraycopy(bArr, 0, this.b, this.d, i3);
            this.d += i3;
        } catch (IndexOutOfBoundsException e10) {
            throw new androidx.datastore.preferences.protobuf.l(this.d, this.c, i3, e10);
        }
    }

    public final void e(int i3, l1 l1Var) {
        o((i3 << 3) | 2);
        o(l1Var.j());
        d(l1Var.j(), l1Var.b);
    }

    public final void f(int i3, int i10) {
        o((i3 << 3) | 5);
        g(i10);
    }

    public final void g(int i3) {
        int i10 = this.d;
        try {
            byte[] bArr = this.b;
            bArr[i10] = (byte) i3;
            bArr[i10 + 1] = (byte) (i3 >> 8);
            bArr[i10 + 2] = (byte) (i3 >> 16);
            bArr[i10 + 3] = (byte) (i3 >> 24);
            this.d = i10 + 4;
        } catch (IndexOutOfBoundsException e10) {
            throw new androidx.datastore.preferences.protobuf.l(i10, this.c, 4, e10);
        }
    }

    public final void h(int i3, long j10) {
        o((i3 << 3) | 1);
        i(j10);
    }

    public final void i(long j10) {
        int i3 = this.d;
        try {
            byte[] bArr = this.b;
            bArr[i3] = (byte) j10;
            bArr[i3 + 1] = (byte) (j10 >> 8);
            bArr[i3 + 2] = (byte) (j10 >> 16);
            bArr[i3 + 3] = (byte) (j10 >> 24);
            bArr[i3 + 4] = (byte) (j10 >> 32);
            bArr[i3 + 5] = (byte) (j10 >> 40);
            bArr[i3 + 6] = (byte) (j10 >> 48);
            bArr[i3 + 7] = (byte) (j10 >> 56);
            this.d = i3 + 8;
        } catch (IndexOutOfBoundsException e10) {
            throw new androidx.datastore.preferences.protobuf.l(i3, this.c, 8, e10);
        }
    }

    public final void j(int i3, int i10) {
        o(i3 << 3);
        k(i10);
    }

    public final void k(int i3) {
        if (i3 >= 0) {
            o(i3);
        } else {
            q(i3);
        }
    }

    public final void l(int i3, String str) {
        o((i3 << 3) | 2);
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

    public final void m(int i3, int i10) {
        o((i3 << 3) | i10);
    }

    public final void n(int i3, int i10) {
        o(i3 << 3);
        o(i10);
    }

    public final void o(int i3) {
        int i10;
        int i11 = this.d;
        while (true) {
            int i12 = i3 & (-128);
            byte[] bArr = this.b;
            if (i12 == 0) {
                i10 = i11 + 1;
                bArr[i11] = (byte) i3;
                this.d = i10;
                return;
            } else {
                i10 = i11 + 1;
                try {
                    bArr[i11] = (byte) (i3 | 128);
                    i3 >>>= 7;
                    i11 = i10;
                } catch (IndexOutOfBoundsException e10) {
                    throw new androidx.datastore.preferences.protobuf.l(i10, this.c, 1, e10);
                }
            }
            throw new androidx.datastore.preferences.protobuf.l(i10, this.c, 1, e10);
        }
    }

    public final void p(int i3, long j10) {
        o(i3 << 3);
        q(j10);
    }

    public final void q(long j10) {
        int i3;
        int i10 = this.d;
        boolean z10 = f;
        int i11 = this.c;
        byte[] bArr = this.b;
        if (!z10 || i11 - i10 < 10) {
            long j11 = j10;
            while ((j11 & (-128)) != 0) {
                i3 = i10 + 1;
                try {
                    bArr[i10] = (byte) (((int) j11) | 128);
                    j11 >>>= 7;
                    i10 = i3;
                } catch (IndexOutOfBoundsException e10) {
                    throw new androidx.datastore.preferences.protobuf.l(i3, i11, 1, e10);
                }
            }
            i3 = i10 + 1;
            bArr[i10] = (byte) j11;
        } else {
            long j12 = j10;
            while ((j12 & (-128)) != 0) {
                c3.c.d(bArr, c3.f + i10, (byte) (((int) j12) | 128));
                j12 >>>= 7;
                i10++;
            }
            i3 = i10 + 1;
            c3.c.d(bArr, c3.f + i10, (byte) j12);
        }
        this.d = i3;
    }
}
