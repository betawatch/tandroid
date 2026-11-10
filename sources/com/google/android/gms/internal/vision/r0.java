package com.google.android.gms.internal.vision;

import java.util.logging.Logger;
import org.telegram.messenger.qs;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes.dex */
public final class r0 extends e1 {
    public static final Logger f = Logger.getLogger(r0.class.getName());
    public static final boolean g = x2.e;
    public y1 b;
    public final byte[] c;
    public final int d;
    public int e;

    public r0(byte[] bArr, int i7) {
        if (((bArr.length - i7) | i7) < 0) {
            throw new IllegalArgumentException(String.format("Array range is invalid. Buffer.length=%d, offset=%d, length=%d", Integer.valueOf(bArr.length), 0, Integer.valueOf(i7)));
        }
        this.c = bArr;
        this.e = 0;
        this.d = i7;
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

    public static int I(int i7, l0 l0Var, n2 n2Var) {
        int T = T(i7 << 3) << 1;
        int c10 = l0Var.c();
        if (c10 == -1) {
            c10 = n2Var.zzb(l0Var);
            l0Var.b(c10);
        }
        return T + c10;
    }

    public static int J(int i7, q0 q0Var) {
        int T = T(i7 << 3);
        int i10 = q0Var.i();
        return a8.p0.C(i10, i10, T);
    }

    public static int N(int i7, long j3) {
        return O(j3) + T(i7 << 3);
    }

    public static int O(long j3) {
        int i7;
        if (((-128) & j3) == 0) {
            return 1;
        }
        if (j3 < 0) {
            return 10;
        }
        if (((-34359738368L) & j3) != 0) {
            j3 >>>= 28;
            i7 = 6;
        } else {
            i7 = 2;
        }
        if (((-2097152) & j3) != 0) {
            i7 += 2;
            j3 >>>= 14;
        }
        return (j3 & (-16384)) != 0 ? i7 + 1 : i7;
    }

    public static int P(int i7) {
        if (i7 >= 0) {
            return T(i7);
        }
        return 10;
    }

    public static int Q(int i7, long j3) {
        return O((j3 >> 63) ^ (j3 << 1)) + T(i7 << 3);
    }

    public static int R(int i7) {
        return T(i7 << 3) + 8;
    }

    public static int S(int i7, int i10) {
        return T(i10) + T(i7 << 3);
    }

    public static int T(int i7) {
        if ((i7 & (-128)) == 0) {
            return 1;
        }
        if ((i7 & (-16384)) == 0) {
            return 2;
        }
        if (((-2097152) & i7) == 0) {
            return 3;
        }
        return (i7 & (-268435456)) == 0 ? 4 : 5;
    }

    public static int U(int i7, int i10) {
        return T((i10 >> 31) ^ (i10 << 1)) + T(i7 << 3);
    }

    public static int V(int i7) {
        return T(i7 << 3) + 4;
    }

    public static int y(int i7) {
        return T(i7 << 3);
    }

    public final void B(byte b10) {
        try {
            byte[] bArr = this.c;
            int i7 = this.e;
            this.e = i7 + 1;
            bArr[i7] = b10;
        } catch (IndexOutOfBoundsException e10) {
            throw new s0(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.e), Integer.valueOf(this.d), 1), e10);
        }
    }

    public final void C(int i7) {
        if (i7 >= 0) {
            H(i7);
        } else {
            E(i7);
        }
    }

    public final void D(int i7, int i10) {
        H((i7 << 3) | i10);
    }

    public final void E(long j3) {
        boolean z9 = g;
        byte[] bArr = this.c;
        if (z9 && F() >= 10) {
            while ((j3 & (-128)) != 0) {
                int i7 = this.e;
                this.e = i7 + 1;
                x2.e(bArr, i7, (byte) ((((int) j3) & qs.L1) | 128));
                j3 >>>= 7;
            }
            int i10 = this.e;
            this.e = i10 + 1;
            x2.e(bArr, i10, (byte) j3);
            return;
        }
        while ((j3 & (-128)) != 0) {
            try {
                int i11 = this.e;
                this.e = i11 + 1;
                bArr[i11] = (byte) ((((int) j3) & qs.L1) | 128);
                j3 >>>= 7;
            } catch (IndexOutOfBoundsException e10) {
                throw new s0(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.e), Integer.valueOf(this.d), 1), e10);
            }
        }
        int i12 = this.e;
        this.e = i12 + 1;
        bArr[i12] = (byte) j3;
    }

    public final int F() {
        return this.d - this.e;
    }

    public final void H(int i7) {
        boolean z9 = g;
        byte[] bArr = this.c;
        if (!z9 || m0.a() || F() < 5) {
            while ((i7 & (-128)) != 0) {
                try {
                    int i10 = this.e;
                    this.e = i10 + 1;
                    bArr[i10] = (byte) ((i7 & qs.L1) | 128);
                    i7 >>>= 7;
                } catch (IndexOutOfBoundsException e10) {
                    throw new s0(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.e), Integer.valueOf(this.d), 1), e10);
                }
            }
            int i11 = this.e;
            this.e = i11 + 1;
            bArr[i11] = (byte) i7;
            return;
        }
        if ((i7 & (-128)) == 0) {
            int i12 = this.e;
            this.e = i12 + 1;
            x2.e(bArr, i12, (byte) i7);
            return;
        }
        int i13 = this.e;
        this.e = i13 + 1;
        x2.e(bArr, i13, (byte) (i7 | 128));
        int i14 = i7 >>> 7;
        if ((i14 & (-128)) == 0) {
            int i15 = this.e;
            this.e = i15 + 1;
            x2.e(bArr, i15, (byte) i14);
            return;
        }
        int i16 = this.e;
        this.e = i16 + 1;
        x2.e(bArr, i16, (byte) (i14 | 128));
        int i17 = i7 >>> 14;
        if ((i17 & (-128)) == 0) {
            int i18 = this.e;
            this.e = i18 + 1;
            x2.e(bArr, i18, (byte) i17);
            return;
        }
        int i19 = this.e;
        this.e = i19 + 1;
        x2.e(bArr, i19, (byte) (i17 | 128));
        int i20 = i7 >>> 21;
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
            x2.e(bArr, i23, (byte) (i7 >>> 28));
        }
    }

    public final void K(long j3) {
        try {
            byte[] bArr = this.c;
            int i7 = this.e;
            int i10 = i7 + 1;
            this.e = i10;
            bArr[i7] = (byte) j3;
            int i11 = i7 + 2;
            this.e = i11;
            bArr[i10] = (byte) (j3 >> 8);
            int i12 = i7 + 3;
            this.e = i12;
            bArr[i11] = (byte) (j3 >> 16);
            int i13 = i7 + 4;
            this.e = i13;
            bArr[i12] = (byte) (j3 >> 24);
            int i14 = i7 + 5;
            this.e = i14;
            bArr[i13] = (byte) (j3 >> 32);
            int i15 = i7 + 6;
            this.e = i15;
            bArr[i14] = (byte) (j3 >> 40);
            int i16 = i7 + 7;
            this.e = i16;
            bArr[i15] = (byte) (j3 >> 48);
            this.e = i7 + 8;
            bArr[i16] = (byte) (j3 >> 56);
        } catch (IndexOutOfBoundsException e10) {
            throw new s0(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.e), Integer.valueOf(this.d), 1), e10);
        }
    }

    public final void L(byte[] bArr, int i7, int i10) {
        try {
            System.arraycopy(bArr, i7, this.c, this.e, i10);
            this.e += i10;
        } catch (IndexOutOfBoundsException e10) {
            throw new s0(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.e), Integer.valueOf(this.d), Integer.valueOf(i10)), e10);
        }
    }

    public final void M(int i7) {
        try {
            byte[] bArr = this.c;
            int i10 = this.e;
            int i11 = i10 + 1;
            this.e = i11;
            bArr[i10] = (byte) i7;
            int i12 = i10 + 2;
            this.e = i12;
            bArr[i11] = (byte) (i7 >> 8);
            int i13 = i10 + 3;
            this.e = i13;
            bArr[i12] = (byte) (i7 >> 16);
            this.e = i10 + 4;
            bArr[i13] = (byte) (i7 >>> 24);
        } catch (IndexOutOfBoundsException e10) {
            throw new s0(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.e), Integer.valueOf(this.d), 1), e10);
        }
    }
}
