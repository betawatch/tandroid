package com.google.android.gms.internal.cast;

import java.util.logging.Level;
import java.util.logging.Logger;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class y4 extends f7.t5 {
    public static final Logger e = Logger.getLogger(y4.class.getName());
    public static final boolean f = s6.e;
    public u5 a;
    public final byte[] b;
    public final int c;
    public int d;

    public y4(byte[] bArr, int i9) {
        int length = bArr.length;
        if (((length - i9) | i9) < 0) {
            throw new IllegalArgumentException(String.format("Array range is invalid. Buffer.length=%d, offset=%d, length=%d", Integer.valueOf(length), 0, Integer.valueOf(i9)));
        }
        this.b = bArr;
        this.d = 0;
        this.c = i9;
    }

    public static int m(int i9) {
        if (i9 >= 0) {
            return o(i9);
        }
        return 10;
    }

    public static int n(String str) {
        int length;
        try {
            length = u6.c(str);
        } catch (t6 unused) {
            length = str.getBytes(l5.a).length;
        }
        return o(length) + length;
    }

    public static int o(int i9) {
        if ((i9 & (-128)) == 0) {
            return 1;
        }
        if ((i9 & (-16384)) == 0) {
            return 2;
        }
        if (((-2097152) & i9) == 0) {
            return 3;
        }
        return (i9 & (-268435456)) == 0 ? 4 : 5;
    }

    public static int p(long j10) {
        int i9;
        if (((-128) & j10) == 0) {
            return 1;
        }
        if (j10 < 0) {
            return 10;
        }
        if (((-34359738368L) & j10) != 0) {
            j10 >>>= 28;
            i9 = 6;
        } else {
            i9 = 2;
        }
        if (((-2097152) & j10) != 0) {
            j10 >>>= 14;
            i9 += 2;
        }
        return (j10 & (-16384)) != 0 ? i9 + 1 : i9;
    }

    public final void a(byte b10) {
        try {
            byte[] bArr = this.b;
            int i9 = this.d;
            this.d = i9 + 1;
            bArr[i9] = b10;
        } catch (IndexOutOfBoundsException e10) {
            throw new z4(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.d), Integer.valueOf(this.c), 1), e10);
        }
    }

    public final void b(int i9, byte[] bArr) {
        try {
            System.arraycopy(bArr, 0, this.b, this.d, i9);
            this.d += i9;
        } catch (IndexOutOfBoundsException e10) {
            throw new z4(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.d), Integer.valueOf(this.c), Integer.valueOf(i9)), e10);
        }
    }

    public final void c(int i9, x4 x4Var) {
        j((i9 << 3) | 2);
        j(x4Var.o());
        b(x4Var.o(), x4Var.b);
    }

    public final void d(int i9, int i10) {
        j((i9 << 3) | 5);
        e(i10);
    }

    public final void e(int i9) {
        try {
            byte[] bArr = this.b;
            int i10 = this.d;
            int i11 = i10 + 1;
            this.d = i11;
            bArr[i10] = (byte) (i9 & 255);
            int i12 = i10 + 2;
            this.d = i12;
            bArr[i11] = (byte) ((i9 >> 8) & 255);
            int i13 = i10 + 3;
            this.d = i13;
            bArr[i12] = (byte) ((i9 >> 16) & 255);
            this.d = i10 + 4;
            bArr[i13] = (byte) ((i9 >> 24) & 255);
        } catch (IndexOutOfBoundsException e10) {
            throw new z4(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.d), Integer.valueOf(this.c), 1), e10);
        }
    }

    public final void f(int i9, long j10) {
        j((i9 << 3) | 1);
        g(j10);
    }

    public final void g(long j10) {
        try {
            byte[] bArr = this.b;
            int i9 = this.d;
            int i10 = i9 + 1;
            this.d = i10;
            bArr[i9] = (byte) (((int) j10) & 255);
            int i11 = i9 + 2;
            this.d = i11;
            bArr[i10] = (byte) (((int) (j10 >> 8)) & 255);
            int i12 = i9 + 3;
            this.d = i12;
            bArr[i11] = (byte) (((int) (j10 >> 16)) & 255);
            int i13 = i9 + 4;
            this.d = i13;
            bArr[i12] = (byte) (((int) (j10 >> 24)) & 255);
            int i14 = i9 + 5;
            this.d = i14;
            bArr[i13] = (byte) (((int) (j10 >> 32)) & 255);
            int i15 = i9 + 6;
            this.d = i15;
            bArr[i14] = (byte) (((int) (j10 >> 40)) & 255);
            int i16 = i9 + 7;
            this.d = i16;
            bArr[i15] = (byte) (((int) (j10 >> 48)) & 255);
            this.d = i9 + 8;
            bArr[i16] = (byte) (((int) (j10 >> 56)) & 255);
        } catch (IndexOutOfBoundsException e10) {
            throw new z4(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.d), Integer.valueOf(this.c), 1), e10);
        }
    }

    public final void h(int i9, String str) {
        j((i9 << 3) | 2);
        int i10 = this.d;
        try {
            int o6 = o(str.length() * 3);
            int o9 = o(str.length());
            int i11 = this.c;
            byte[] bArr = this.b;
            if (o9 != o6) {
                j(u6.c(str));
                int i12 = this.d;
                this.d = u6.b(str, bArr, i12, i11 - i12);
            } else {
                int i13 = i10 + o9;
                this.d = i13;
                int b10 = u6.b(str, bArr, i13, i11 - i13);
                this.d = i10;
                j((b10 - i10) - o9);
                this.d = b10;
            }
        } catch (t6 e10) {
            this.d = i10;
            e.logp(Level.WARNING, "com.google.protobuf.CodedOutputStream", "inefficientWriteStringNoTag", "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", (Throwable) e10);
            byte[] bytes = str.getBytes(l5.a);
            try {
                int length = bytes.length;
                j(length);
                b(length, bytes);
            } catch (IndexOutOfBoundsException e11) {
                throw new z4(e11);
            }
        } catch (IndexOutOfBoundsException e12) {
            throw new z4(e12);
        }
    }

    public final void i(int i9, int i10) {
        j((i9 << 3) | i10);
    }

    public final void j(int i9) {
        while (true) {
            int i10 = i9 & (-128);
            byte[] bArr = this.b;
            if (i10 == 0) {
                int i11 = this.d;
                this.d = i11 + 1;
                bArr[i11] = (byte) i9;
                return;
            } else {
                try {
                    int i12 = this.d;
                    this.d = i12 + 1;
                    bArr[i12] = (byte) ((i9 & 127) | 128);
                    i9 >>>= 7;
                } catch (IndexOutOfBoundsException e10) {
                    throw new z4(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.d), Integer.valueOf(this.c), 1), e10);
                }
            }
            throw new z4(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.d), Integer.valueOf(this.c), 1), e10);
        }
    }

    public final void k(int i9, long j10) {
        j(i9 << 3);
        l(j10);
    }

    public final void l(long j10) {
        boolean z10 = f;
        int i9 = this.c;
        byte[] bArr = this.b;
        if (!z10 || i9 - this.d < 10) {
            while ((j10 & (-128)) != 0) {
                try {
                    int i10 = this.d;
                    this.d = i10 + 1;
                    bArr[i10] = (byte) ((((int) j10) & 127) | 128);
                    j10 >>>= 7;
                } catch (IndexOutOfBoundsException e10) {
                    throw new z4(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.d), Integer.valueOf(i9), 1), e10);
                }
            }
            int i11 = this.d;
            this.d = i11 + 1;
            bArr[i11] = (byte) j10;
            return;
        }
        while (true) {
            int i12 = (int) j10;
            if ((j10 & (-128)) == 0) {
                int i13 = this.d;
                this.d = i13 + 1;
                s6.c.d(bArr, s6.f + i13, (byte) i12);
                return;
            } else {
                int i14 = this.d;
                this.d = i14 + 1;
                s6.c.d(bArr, s6.f + i14, (byte) ((i12 & 127) | 128));
                j10 >>>= 7;
            }
        }
    }
}
