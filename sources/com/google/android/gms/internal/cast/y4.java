package com.google.android.gms.internal.cast;

import java.util.logging.Level;
import java.util.logging.Logger;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes.dex */
public final class y4 extends j7.d6 {
    public static final Logger e = Logger.getLogger(y4.class.getName());
    public static final boolean f = r6.e;
    public t5 a;
    public final byte[] b;
    public final int c;
    public int d;

    public y4(byte[] bArr, int i10) {
        int length = bArr.length;
        if (((length - i10) | i10) < 0) {
            throw new IllegalArgumentException(String.format("Array range is invalid. Buffer.length=%d, offset=%d, length=%d", Integer.valueOf(length), 0, Integer.valueOf(i10)));
        }
        this.b = bArr;
        this.d = 0;
        this.c = i10;
    }

    public static int m(int i10) {
        if (i10 >= 0) {
            return o(i10);
        }
        return 10;
    }

    public static int n(String str) {
        int length;
        try {
            length = t6.c(str);
        } catch (s6 unused) {
            length = str.getBytes(k5.a).length;
        }
        return o(length) + length;
    }

    public static int o(int i10) {
        if ((i10 & (-128)) == 0) {
            return 1;
        }
        if ((i10 & (-16384)) == 0) {
            return 2;
        }
        if (((-2097152) & i10) == 0) {
            return 3;
        }
        return (i10 & (-268435456)) == 0 ? 4 : 5;
    }

    public static int p(long j10) {
        int i10;
        if (((-128) & j10) == 0) {
            return 1;
        }
        if (j10 < 0) {
            return 10;
        }
        if (((-34359738368L) & j10) != 0) {
            j10 >>>= 28;
            i10 = 6;
        } else {
            i10 = 2;
        }
        if (((-2097152) & j10) != 0) {
            j10 >>>= 14;
            i10 += 2;
        }
        return (j10 & (-16384)) != 0 ? i10 + 1 : i10;
    }

    public final void a(byte b10) {
        try {
            byte[] bArr = this.b;
            int i10 = this.d;
            this.d = i10 + 1;
            bArr[i10] = b10;
        } catch (IndexOutOfBoundsException e6) {
            throw new b7.y0(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.d), Integer.valueOf(this.c), 1), e6);
        }
    }

    public final void b(int i10, byte[] bArr) {
        try {
            System.arraycopy(bArr, 0, this.b, this.d, i10);
            this.d += i10;
        } catch (IndexOutOfBoundsException e6) {
            throw new b7.y0(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.d), Integer.valueOf(this.c), Integer.valueOf(i10)), e6);
        }
    }

    public final void c(int i10, x4 x4Var) {
        j((i10 << 3) | 2);
        j(x4Var.o());
        b(x4Var.o(), x4Var.b);
    }

    public final void d(int i10, int i11) {
        j((i10 << 3) | 5);
        e(i11);
    }

    public final void e(int i10) {
        try {
            byte[] bArr = this.b;
            int i11 = this.d;
            int i12 = i11 + 1;
            this.d = i12;
            bArr[i11] = (byte) (i10 & 255);
            int i13 = i11 + 2;
            this.d = i13;
            bArr[i12] = (byte) ((i10 >> 8) & 255);
            int i14 = i11 + 3;
            this.d = i14;
            bArr[i13] = (byte) ((i10 >> 16) & 255);
            this.d = i11 + 4;
            bArr[i14] = (byte) ((i10 >> 24) & 255);
        } catch (IndexOutOfBoundsException e6) {
            throw new b7.y0(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.d), Integer.valueOf(this.c), 1), e6);
        }
    }

    public final void f(int i10, long j10) {
        j((i10 << 3) | 1);
        g(j10);
    }

    public final void g(long j10) {
        try {
            byte[] bArr = this.b;
            int i10 = this.d;
            int i11 = i10 + 1;
            this.d = i11;
            bArr[i10] = (byte) (((int) j10) & 255);
            int i12 = i10 + 2;
            this.d = i12;
            bArr[i11] = (byte) (((int) (j10 >> 8)) & 255);
            int i13 = i10 + 3;
            this.d = i13;
            bArr[i12] = (byte) (((int) (j10 >> 16)) & 255);
            int i14 = i10 + 4;
            this.d = i14;
            bArr[i13] = (byte) (((int) (j10 >> 24)) & 255);
            int i15 = i10 + 5;
            this.d = i15;
            bArr[i14] = (byte) (((int) (j10 >> 32)) & 255);
            int i16 = i10 + 6;
            this.d = i16;
            bArr[i15] = (byte) (((int) (j10 >> 40)) & 255);
            int i17 = i10 + 7;
            this.d = i17;
            bArr[i16] = (byte) (((int) (j10 >> 48)) & 255);
            this.d = i10 + 8;
            bArr[i17] = (byte) (((int) (j10 >> 56)) & 255);
        } catch (IndexOutOfBoundsException e6) {
            throw new b7.y0(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.d), Integer.valueOf(this.c), 1), e6);
        }
    }

    public final void h(int i10, String str) {
        j((i10 << 3) | 2);
        int i11 = this.d;
        try {
            int o10 = o(str.length() * 3);
            int o11 = o(str.length());
            int i12 = this.c;
            byte[] bArr = this.b;
            if (o11 != o10) {
                j(t6.c(str));
                int i13 = this.d;
                this.d = t6.b(str, bArr, i13, i12 - i13);
            } else {
                int i14 = i11 + o11;
                this.d = i14;
                int b10 = t6.b(str, bArr, i14, i12 - i14);
                this.d = i11;
                j((b10 - i11) - o11);
                this.d = b10;
            }
        } catch (s6 e6) {
            this.d = i11;
            e.logp(Level.WARNING, "com.google.protobuf.CodedOutputStream", "inefficientWriteStringNoTag", "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", (Throwable) e6);
            byte[] bytes = str.getBytes(k5.a);
            try {
                int length = bytes.length;
                j(length);
                b(length, bytes);
            } catch (IndexOutOfBoundsException e10) {
                throw new b7.y0(e10);
            }
        } catch (IndexOutOfBoundsException e11) {
            throw new b7.y0(e11);
        }
    }

    public final void i(int i10, int i11) {
        j((i10 << 3) | i11);
    }

    public final void j(int i10) {
        while (true) {
            int i11 = i10 & (-128);
            byte[] bArr = this.b;
            if (i11 == 0) {
                int i12 = this.d;
                this.d = i12 + 1;
                bArr[i12] = (byte) i10;
                return;
            } else {
                try {
                    int i13 = this.d;
                    this.d = i13 + 1;
                    bArr[i13] = (byte) ((i10 & 127) | 128);
                    i10 >>>= 7;
                } catch (IndexOutOfBoundsException e6) {
                    throw new b7.y0(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.d), Integer.valueOf(this.c), 1), e6);
                }
            }
            throw new b7.y0(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.d), Integer.valueOf(this.c), 1), e6);
        }
    }

    public final void k(int i10, long j10) {
        j(i10 << 3);
        l(j10);
    }

    public final void l(long j10) {
        boolean z4 = f;
        int i10 = this.c;
        byte[] bArr = this.b;
        if (!z4 || i10 - this.d < 10) {
            while ((j10 & (-128)) != 0) {
                try {
                    int i11 = this.d;
                    this.d = i11 + 1;
                    bArr[i11] = (byte) ((((int) j10) & 127) | 128);
                    j10 >>>= 7;
                } catch (IndexOutOfBoundsException e6) {
                    throw new b7.y0(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.d), Integer.valueOf(i10), 1), e6);
                }
            }
            int i12 = this.d;
            this.d = i12 + 1;
            bArr[i12] = (byte) j10;
            return;
        }
        while (true) {
            int i13 = (int) j10;
            if ((j10 & (-128)) == 0) {
                int i14 = this.d;
                this.d = i14 + 1;
                r6.c.d(bArr, r6.f + i14, (byte) i13);
                return;
            } else {
                int i15 = this.d;
                this.d = i15 + 1;
                r6.c.d(bArr, r6.f + i15, (byte) ((i13 & 127) | 128));
                j10 >>>= 7;
            }
        }
    }
}
