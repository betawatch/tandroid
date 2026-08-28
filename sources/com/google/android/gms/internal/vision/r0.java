package com.google.android.gms.internal.vision;

import java.util.logging.Logger;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class r0 extends e1 {
    public static final Logger f = Logger.getLogger(r0.class.getName());
    public static final boolean g = x2.e;
    public y1 b;
    public final byte[] c;
    public final int d;
    public int e;

    public r0(byte[] bArr, int i9) {
        if (((bArr.length - i9) | i9) < 0) {
            throw new IllegalArgumentException(String.format("Array range is invalid. Buffer.length=%d, offset=%d, length=%d", Integer.valueOf(bArr.length), 0, Integer.valueOf(i9)));
        }
        this.c = bArr;
        this.e = 0;
        this.d = i9;
    }

    public static int G(String str) {
        int length;
        try {
            length = a3.a(str);
        } catch (b3 unused) {
            length = str.getBytes(j1.a).length;
        }
        return T(length) + length;
    }

    public static int I(int i9, l0 l0Var, n2 n2Var) {
        int T = T(i9 << 3) << 1;
        int c10 = l0Var.c();
        if (c10 == -1) {
            c10 = n2Var.zzb(l0Var);
            l0Var.b(c10);
        }
        return T + c10;
    }

    public static int J(int i9, q0 q0Var) {
        int T = T(i9 << 3);
        int n10 = q0Var.n();
        return aa.d.A(n10, n10, T);
    }

    public static int N(int i9, long j10) {
        return O(j10) + T(i9 << 3);
    }

    public static int O(long j10) {
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
            i9 += 2;
            j10 >>>= 14;
        }
        return (j10 & (-16384)) != 0 ? i9 + 1 : i9;
    }

    public static int P(int i9) {
        if (i9 >= 0) {
            return T(i9);
        }
        return 10;
    }

    public static int Q(int i9, long j10) {
        return O((j10 >> 63) ^ (j10 << 1)) + T(i9 << 3);
    }

    public static int R(int i9) {
        return T(i9 << 3) + 8;
    }

    public static int S(int i9, int i10) {
        return T(i10) + T(i9 << 3);
    }

    public static int T(int i9) {
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

    public static int U(int i9, int i10) {
        return T((i10 >> 31) ^ (i10 << 1)) + T(i9 << 3);
    }

    public static int V(int i9) {
        return T(i9 << 3) + 4;
    }

    public static int y(int i9) {
        return T(i9 << 3);
    }

    public final void B(byte b10) {
        try {
            byte[] bArr = this.c;
            int i9 = this.e;
            this.e = i9 + 1;
            bArr[i9] = b10;
        } catch (IndexOutOfBoundsException e10) {
            throw new s0(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.e), Integer.valueOf(this.d), 1), e10);
        }
    }

    public final void C(int i9) {
        if (i9 >= 0) {
            H(i9);
        } else {
            E(i9);
        }
    }

    public final void D(int i9, int i10) {
        H((i9 << 3) | i10);
    }

    public final void E(long j10) {
        boolean z10 = g;
        byte[] bArr = this.c;
        if (z10 && F() >= 10) {
            while ((j10 & (-128)) != 0) {
                int i9 = this.e;
                this.e = i9 + 1;
                x2.e(bArr, i9, (byte) ((((int) j10) & 127) | 128));
                j10 >>>= 7;
            }
            int i10 = this.e;
            this.e = i10 + 1;
            x2.e(bArr, i10, (byte) j10);
            return;
        }
        while ((j10 & (-128)) != 0) {
            try {
                int i11 = this.e;
                this.e = i11 + 1;
                bArr[i11] = (byte) ((((int) j10) & 127) | 128);
                j10 >>>= 7;
            } catch (IndexOutOfBoundsException e10) {
                throw new s0(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.e), Integer.valueOf(this.d), 1), e10);
            }
        }
        int i12 = this.e;
        this.e = i12 + 1;
        bArr[i12] = (byte) j10;
    }

    public final int F() {
        return this.d - this.e;
    }

    public final void H(int i9) {
        boolean z10 = g;
        byte[] bArr = this.c;
        if (!z10 || m0.a() || F() < 5) {
            while ((i9 & (-128)) != 0) {
                try {
                    int i10 = this.e;
                    this.e = i10 + 1;
                    bArr[i10] = (byte) ((i9 & 127) | 128);
                    i9 >>>= 7;
                } catch (IndexOutOfBoundsException e10) {
                    throw new s0(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.e), Integer.valueOf(this.d), 1), e10);
                }
            }
            int i11 = this.e;
            this.e = i11 + 1;
            bArr[i11] = (byte) i9;
            return;
        }
        if ((i9 & (-128)) == 0) {
            int i12 = this.e;
            this.e = i12 + 1;
            x2.e(bArr, i12, (byte) i9);
            return;
        }
        int i13 = this.e;
        this.e = i13 + 1;
        x2.e(bArr, i13, (byte) (i9 | 128));
        int i14 = i9 >>> 7;
        if ((i14 & (-128)) == 0) {
            int i15 = this.e;
            this.e = i15 + 1;
            x2.e(bArr, i15, (byte) i14);
            return;
        }
        int i16 = this.e;
        this.e = i16 + 1;
        x2.e(bArr, i16, (byte) (i14 | 128));
        int i17 = i9 >>> 14;
        if ((i17 & (-128)) == 0) {
            int i18 = this.e;
            this.e = i18 + 1;
            x2.e(bArr, i18, (byte) i17);
            return;
        }
        int i19 = this.e;
        this.e = i19 + 1;
        x2.e(bArr, i19, (byte) (i17 | 128));
        int i20 = i9 >>> 21;
        if ((i20 & (-128)) == 0) {
            int i21 = this.e;
            this.e = i21 + 1;
            x2.e(bArr, i21, (byte) i20);
        } else {
            int i22 = this.e;
            this.e = i22 + 1;
            x2.e(bArr, i22, (byte) (i20 | 128));
            int i23 = this.e;
            this.e = i23 + 1;
            x2.e(bArr, i23, (byte) (i9 >>> 28));
        }
    }

    public final void K(long j10) {
        try {
            byte[] bArr = this.c;
            int i9 = this.e;
            int i10 = i9 + 1;
            this.e = i10;
            bArr[i9] = (byte) j10;
            int i11 = i9 + 2;
            this.e = i11;
            bArr[i10] = (byte) (j10 >> 8);
            int i12 = i9 + 3;
            this.e = i12;
            bArr[i11] = (byte) (j10 >> 16);
            int i13 = i9 + 4;
            this.e = i13;
            bArr[i12] = (byte) (j10 >> 24);
            int i14 = i9 + 5;
            this.e = i14;
            bArr[i13] = (byte) (j10 >> 32);
            int i15 = i9 + 6;
            this.e = i15;
            bArr[i14] = (byte) (j10 >> 40);
            int i16 = i9 + 7;
            this.e = i16;
            bArr[i15] = (byte) (j10 >> 48);
            this.e = i9 + 8;
            bArr[i16] = (byte) (j10 >> 56);
        } catch (IndexOutOfBoundsException e10) {
            throw new s0(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.e), Integer.valueOf(this.d), 1), e10);
        }
    }

    public final void L(byte[] bArr, int i9, int i10) {
        try {
            System.arraycopy(bArr, i9, this.c, this.e, i10);
            this.e += i10;
        } catch (IndexOutOfBoundsException e10) {
            throw new s0(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.e), Integer.valueOf(this.d), Integer.valueOf(i10)), e10);
        }
    }

    public final void M(int i9) {
        try {
            byte[] bArr = this.c;
            int i10 = this.e;
            int i11 = i10 + 1;
            this.e = i11;
            bArr[i10] = (byte) i9;
            int i12 = i10 + 2;
            this.e = i12;
            bArr[i11] = (byte) (i9 >> 8);
            int i13 = i10 + 3;
            this.e = i13;
            bArr[i12] = (byte) (i9 >> 16);
            this.e = i10 + 4;
            bArr[i13] = (byte) (i9 >>> 24);
        } catch (IndexOutOfBoundsException e10) {
            throw new s0(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.e), Integer.valueOf(this.d), 1), e10);
        }
    }
}
