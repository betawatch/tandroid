package com.google.android.gms.internal.vision;

import java.util.logging.Logger;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes.dex */
public final class r0 extends e1 {
    public static final Logger f = Logger.getLogger(r0.class.getName());
    public static final boolean g = x2.e;
    public y1 b;
    public final byte[] c;
    public final int d;
    public int e;

    public r0(byte[] bArr, int i10) {
        if (((bArr.length - i10) | i10) < 0) {
            throw new IllegalArgumentException(String.format("Array range is invalid. Buffer.length=%d, offset=%d, length=%d", Integer.valueOf(bArr.length), 0, Integer.valueOf(i10)));
        }
        this.c = bArr;
        this.e = 0;
        this.d = i10;
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

    public static int I(int i10, l0 l0Var, n2 n2Var) {
        int T = T(i10 << 3) << 1;
        int c3 = l0Var.c();
        if (c3 == -1) {
            c3 = n2Var.zzb(l0Var);
            l0Var.b(c3);
        }
        return T + c3;
    }

    public static int J(int i10, q0 q0Var) {
        int T = T(i10 << 3);
        int n10 = q0Var.n();
        return android.support.v4.media.a.A(n10, n10, T);
    }

    public static int N(int i10, long j10) {
        return O(j10) + T(i10 << 3);
    }

    public static int O(long j10) {
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
            i10 += 2;
            j10 >>>= 14;
        }
        return (j10 & (-16384)) != 0 ? i10 + 1 : i10;
    }

    public static int P(int i10) {
        if (i10 >= 0) {
            return T(i10);
        }
        return 10;
    }

    public static int Q(int i10, long j10) {
        return O((j10 >> 63) ^ (j10 << 1)) + T(i10 << 3);
    }

    public static int R(int i10) {
        return T(i10 << 3) + 8;
    }

    public static int S(int i10, int i11) {
        return T(i11) + T(i10 << 3);
    }

    public static int T(int i10) {
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

    public static int U(int i10, int i11) {
        return T((i11 >> 31) ^ (i11 << 1)) + T(i10 << 3);
    }

    public static int V(int i10) {
        return T(i10 << 3) + 4;
    }

    public static int y(int i10) {
        return T(i10 << 3);
    }

    public final void B(byte b10) {
        try {
            byte[] bArr = this.c;
            int i10 = this.e;
            this.e = i10 + 1;
            bArr[i10] = b10;
        } catch (IndexOutOfBoundsException e) {
            throw new s0(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.e), Integer.valueOf(this.d), 1), e);
        }
    }

    public final void C(int i10) {
        if (i10 >= 0) {
            H(i10);
        } else {
            E(i10);
        }
    }

    public final void D(int i10, int i11) {
        H((i10 << 3) | i11);
    }

    public final void E(long j10) {
        boolean z4 = g;
        byte[] bArr = this.c;
        if (z4 && F() >= 10) {
            while ((j10 & (-128)) != 0) {
                int i10 = this.e;
                this.e = i10 + 1;
                x2.e(bArr, i10, (byte) ((((int) j10) & 127) | 128));
                j10 >>>= 7;
            }
            int i11 = this.e;
            this.e = i11 + 1;
            x2.e(bArr, i11, (byte) j10);
            return;
        }
        while ((j10 & (-128)) != 0) {
            try {
                int i12 = this.e;
                this.e = i12 + 1;
                bArr[i12] = (byte) ((((int) j10) & 127) | 128);
                j10 >>>= 7;
            } catch (IndexOutOfBoundsException e) {
                throw new s0(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.e), Integer.valueOf(this.d), 1), e);
            }
        }
        int i13 = this.e;
        this.e = i13 + 1;
        bArr[i13] = (byte) j10;
    }

    public final int F() {
        return this.d - this.e;
    }

    public final void H(int i10) {
        boolean z4 = g;
        byte[] bArr = this.c;
        if (!z4 || m0.a() || F() < 5) {
            while ((i10 & (-128)) != 0) {
                try {
                    int i11 = this.e;
                    this.e = i11 + 1;
                    bArr[i11] = (byte) ((i10 & 127) | 128);
                    i10 >>>= 7;
                } catch (IndexOutOfBoundsException e) {
                    throw new s0(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.e), Integer.valueOf(this.d), 1), e);
                }
            }
            int i12 = this.e;
            this.e = i12 + 1;
            bArr[i12] = (byte) i10;
            return;
        }
        if ((i10 & (-128)) == 0) {
            int i13 = this.e;
            this.e = i13 + 1;
            x2.e(bArr, i13, (byte) i10);
            return;
        }
        int i14 = this.e;
        this.e = i14 + 1;
        x2.e(bArr, i14, (byte) (i10 | 128));
        int i15 = i10 >>> 7;
        if ((i15 & (-128)) == 0) {
            int i16 = this.e;
            this.e = i16 + 1;
            x2.e(bArr, i16, (byte) i15);
            return;
        }
        int i17 = this.e;
        this.e = i17 + 1;
        x2.e(bArr, i17, (byte) (i15 | 128));
        int i18 = i10 >>> 14;
        if ((i18 & (-128)) == 0) {
            int i19 = this.e;
            this.e = i19 + 1;
            x2.e(bArr, i19, (byte) i18);
            return;
        }
        int i20 = this.e;
        this.e = i20 + 1;
        x2.e(bArr, i20, (byte) (i18 | 128));
        int i21 = i10 >>> 21;
        if ((i21 & (-128)) == 0) {
            int i22 = this.e;
            this.e = i22 + 1;
            x2.e(bArr, i22, (byte) i21);
        } else {
            int i23 = this.e;
            this.e = i23 + 1;
            x2.e(bArr, i23, (byte) (i21 | 128));
            int i24 = this.e;
            this.e = i24 + 1;
            x2.e(bArr, i24, (byte) (i10 >>> 28));
        }
    }

    public final void K(long j10) {
        try {
            byte[] bArr = this.c;
            int i10 = this.e;
            int i11 = i10 + 1;
            this.e = i11;
            bArr[i10] = (byte) j10;
            int i12 = i10 + 2;
            this.e = i12;
            bArr[i11] = (byte) (j10 >> 8);
            int i13 = i10 + 3;
            this.e = i13;
            bArr[i12] = (byte) (j10 >> 16);
            int i14 = i10 + 4;
            this.e = i14;
            bArr[i13] = (byte) (j10 >> 24);
            int i15 = i10 + 5;
            this.e = i15;
            bArr[i14] = (byte) (j10 >> 32);
            int i16 = i10 + 6;
            this.e = i16;
            bArr[i15] = (byte) (j10 >> 40);
            int i17 = i10 + 7;
            this.e = i17;
            bArr[i16] = (byte) (j10 >> 48);
            this.e = i10 + 8;
            bArr[i17] = (byte) (j10 >> 56);
        } catch (IndexOutOfBoundsException e) {
            throw new s0(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.e), Integer.valueOf(this.d), 1), e);
        }
    }

    public final void L(byte[] bArr, int i10, int i11) {
        try {
            System.arraycopy(bArr, i10, this.c, this.e, i11);
            this.e += i11;
        } catch (IndexOutOfBoundsException e) {
            throw new s0(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.e), Integer.valueOf(this.d), Integer.valueOf(i11)), e);
        }
    }

    public final void M(int i10) {
        try {
            byte[] bArr = this.c;
            int i11 = this.e;
            int i12 = i11 + 1;
            this.e = i12;
            bArr[i11] = (byte) i10;
            int i13 = i11 + 2;
            this.e = i13;
            bArr[i12] = (byte) (i10 >> 8);
            int i14 = i11 + 3;
            this.e = i14;
            bArr[i13] = (byte) (i10 >> 16);
            this.e = i11 + 4;
            bArr[i14] = (byte) (i10 >>> 24);
        } catch (IndexOutOfBoundsException e) {
            throw new s0(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.e), Integer.valueOf(this.d), 1), e);
        }
    }
}
