package com.google.android.gms.internal.cast;

import b8.ja;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.telegram.messenger.hs;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class w4 extends ja {
    public static final Logger e = Logger.getLogger(w4.class.getName());
    public static final boolean f = p6.e;
    public r5 a;
    public final byte[] b;
    public final int c;
    public int d;

    public w4(byte[] bArr, int i3) {
        int length = bArr.length;
        if (((length - i3) | i3) < 0) {
            throw new IllegalArgumentException(String.format("Array range is invalid. Buffer.length=%d, offset=%d, length=%d", Integer.valueOf(length), 0, Integer.valueOf(i3)));
        }
        this.b = bArr;
        this.d = 0;
        this.c = i3;
    }

    public static int m(int i3) {
        if (i3 >= 0) {
            return o(i3);
        }
        return 10;
    }

    public static int n(String str) {
        int length;
        try {
            length = r6.c(str);
        } catch (q6 unused) {
            length = str.getBytes(i5.a).length;
        }
        return o(length) + length;
    }

    public static int o(int i3) {
        if ((i3 & (-128)) == 0) {
            return 1;
        }
        if ((i3 & (-16384)) == 0) {
            return 2;
        }
        if (((-2097152) & i3) == 0) {
            return 3;
        }
        return (i3 & (-268435456)) == 0 ? 4 : 5;
    }

    public static int p(long j10) {
        int i3;
        if (((-128) & j10) == 0) {
            return 1;
        }
        if (j10 < 0) {
            return 10;
        }
        if (((-34359738368L) & j10) != 0) {
            j10 >>>= 28;
            i3 = 6;
        } else {
            i3 = 2;
        }
        if (((-2097152) & j10) != 0) {
            j10 >>>= 14;
            i3 += 2;
        }
        return (j10 & (-16384)) != 0 ? i3 + 1 : i3;
    }

    public final void a(byte b10) {
        try {
            byte[] bArr = this.b;
            int i3 = this.d;
            this.d = i3 + 1;
            bArr[i3] = b10;
        } catch (IndexOutOfBoundsException e10) {
            throw new androidx.datastore.preferences.protobuf.l(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.d), Integer.valueOf(this.c), 1), e10);
        }
    }

    public final void b(int i3, byte[] bArr) {
        try {
            System.arraycopy(bArr, 0, this.b, this.d, i3);
            this.d += i3;
        } catch (IndexOutOfBoundsException e10) {
            throw new androidx.datastore.preferences.protobuf.l(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.d), Integer.valueOf(this.c), Integer.valueOf(i3)), e10);
        }
    }

    public final void c(int i3, v4 v4Var) {
        j((i3 << 3) | 2);
        j(v4Var.j());
        b(v4Var.j(), v4Var.b);
    }

    public final void d(int i3, int i10) {
        j((i3 << 3) | 5);
        e(i10);
    }

    public final void e(int i3) {
        try {
            byte[] bArr = this.b;
            int i10 = this.d;
            int i11 = i10 + 1;
            this.d = i11;
            bArr[i10] = (byte) (i3 & hs.e4);
            int i12 = i10 + 2;
            this.d = i12;
            bArr[i11] = (byte) ((i3 >> 8) & hs.e4);
            int i13 = i10 + 3;
            this.d = i13;
            bArr[i12] = (byte) ((i3 >> 16) & hs.e4);
            this.d = i10 + 4;
            bArr[i13] = (byte) ((i3 >> 24) & hs.e4);
        } catch (IndexOutOfBoundsException e10) {
            throw new androidx.datastore.preferences.protobuf.l(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.d), Integer.valueOf(this.c), 1), e10);
        }
    }

    public final void f(int i3, long j10) {
        j((i3 << 3) | 1);
        g(j10);
    }

    public final void g(long j10) {
        try {
            byte[] bArr = this.b;
            int i3 = this.d;
            int i10 = i3 + 1;
            this.d = i10;
            bArr[i3] = (byte) (((int) j10) & hs.e4);
            int i11 = i3 + 2;
            this.d = i11;
            bArr[i10] = (byte) (((int) (j10 >> 8)) & hs.e4);
            int i12 = i3 + 3;
            this.d = i12;
            bArr[i11] = (byte) (((int) (j10 >> 16)) & hs.e4);
            int i13 = i3 + 4;
            this.d = i13;
            bArr[i12] = (byte) (((int) (j10 >> 24)) & hs.e4);
            int i14 = i3 + 5;
            this.d = i14;
            bArr[i13] = (byte) (((int) (j10 >> 32)) & hs.e4);
            int i15 = i3 + 6;
            this.d = i15;
            bArr[i14] = (byte) (((int) (j10 >> 40)) & hs.e4);
            int i16 = i3 + 7;
            this.d = i16;
            bArr[i15] = (byte) (((int) (j10 >> 48)) & hs.e4);
            this.d = i3 + 8;
            bArr[i16] = (byte) (((int) (j10 >> 56)) & hs.e4);
        } catch (IndexOutOfBoundsException e10) {
            throw new androidx.datastore.preferences.protobuf.l(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.d), Integer.valueOf(this.c), 1), e10);
        }
    }

    public final void h(int i3, String str) {
        j((i3 << 3) | 2);
        int i10 = this.d;
        try {
            int o10 = o(str.length() * 3);
            int o11 = o(str.length());
            int i11 = this.c;
            byte[] bArr = this.b;
            if (o11 != o10) {
                j(r6.c(str));
                int i12 = this.d;
                this.d = r6.b(str, bArr, i12, i11 - i12);
            } else {
                int i13 = i10 + o11;
                this.d = i13;
                int b10 = r6.b(str, bArr, i13, i11 - i13);
                this.d = i10;
                j((b10 - i10) - o11);
                this.d = b10;
            }
        } catch (q6 e10) {
            this.d = i10;
            e.logp(Level.WARNING, "com.google.protobuf.CodedOutputStream", "inefficientWriteStringNoTag", "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", (Throwable) e10);
            byte[] bytes = str.getBytes(i5.a);
            try {
                int length = bytes.length;
                j(length);
                b(length, bytes);
            } catch (IndexOutOfBoundsException e11) {
                throw new androidx.datastore.preferences.protobuf.l(e11);
            }
        } catch (IndexOutOfBoundsException e12) {
            throw new androidx.datastore.preferences.protobuf.l(e12);
        }
    }

    public final void i(int i3, int i10) {
        j((i3 << 3) | i10);
    }

    public final void j(int i3) {
        while (true) {
            int i10 = i3 & (-128);
            byte[] bArr = this.b;
            if (i10 == 0) {
                int i11 = this.d;
                this.d = i11 + 1;
                bArr[i11] = (byte) i3;
                return;
            } else {
                try {
                    int i12 = this.d;
                    this.d = i12 + 1;
                    bArr[i12] = (byte) ((i3 & hs.L1) | 128);
                    i3 >>>= 7;
                } catch (IndexOutOfBoundsException e10) {
                    throw new androidx.datastore.preferences.protobuf.l(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.d), Integer.valueOf(this.c), 1), e10);
                }
            }
            throw new androidx.datastore.preferences.protobuf.l(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.d), Integer.valueOf(this.c), 1), e10);
        }
    }

    public final void k(int i3, long j10) {
        j(i3 << 3);
        l(j10);
    }

    public final void l(long j10) {
        boolean z10 = f;
        int i3 = this.c;
        byte[] bArr = this.b;
        if (!z10 || i3 - this.d < 10) {
            while ((j10 & (-128)) != 0) {
                try {
                    int i10 = this.d;
                    this.d = i10 + 1;
                    bArr[i10] = (byte) ((((int) j10) & hs.L1) | 128);
                    j10 >>>= 7;
                } catch (IndexOutOfBoundsException e10) {
                    throw new androidx.datastore.preferences.protobuf.l(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.d), Integer.valueOf(i3), 1), e10);
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
                p6.c.d(bArr, p6.f + i13, (byte) i12);
                return;
            } else {
                int i14 = this.d;
                this.d = i14 + 1;
                p6.c.d(bArr, p6.f + i14, (byte) ((i12 & hs.L1) | 128));
                j10 >>>= 7;
            }
        }
    }
}
