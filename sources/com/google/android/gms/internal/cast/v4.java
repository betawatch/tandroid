package com.google.android.gms.internal.cast;

import a8.y8;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.telegram.messenger.qs;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes.dex */
public final class v4 extends y8 {
    public static final Logger e = Logger.getLogger(v4.class.getName());
    public static final boolean f = o6.e;
    public q5 a;
    public final byte[] b;
    public final int c;
    public int d;

    public v4(byte[] bArr, int i7) {
        int length = bArr.length;
        if (((length - i7) | i7) < 0) {
            throw new IllegalArgumentException(String.format("Array range is invalid. Buffer.length=%d, offset=%d, length=%d", Integer.valueOf(length), 0, Integer.valueOf(i7)));
        }
        this.b = bArr;
        this.d = 0;
        this.c = i7;
    }

    public static int m(int i7) {
        if (i7 >= 0) {
            return o(i7);
        }
        return 10;
    }

    public static int n(String str) {
        int length;
        try {
            length = q6.c(str);
        } catch (p6 unused) {
            length = str.getBytes(h5.a).length;
        }
        return o(length) + length;
    }

    public static int o(int i7) {
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

    public static int p(long j3) {
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
            j3 >>>= 14;
            i7 += 2;
        }
        return (j3 & (-16384)) != 0 ? i7 + 1 : i7;
    }

    public final void a(byte b10) {
        try {
            byte[] bArr = this.b;
            int i7 = this.d;
            this.d = i7 + 1;
            bArr[i7] = b10;
        } catch (IndexOutOfBoundsException e10) {
            throw new androidx.datastore.preferences.protobuf.l(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.d), Integer.valueOf(this.c), 1), e10);
        }
    }

    public final void b(int i7, byte[] bArr) {
        try {
            System.arraycopy(bArr, 0, this.b, this.d, i7);
            this.d += i7;
        } catch (IndexOutOfBoundsException e10) {
            throw new androidx.datastore.preferences.protobuf.l(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.d), Integer.valueOf(this.c), Integer.valueOf(i7)), e10);
        }
    }

    public final void c(int i7, u4 u4Var) {
        j((i7 << 3) | 2);
        j(u4Var.j());
        b(u4Var.j(), u4Var.b);
    }

    public final void d(int i7, int i10) {
        j((i7 << 3) | 5);
        e(i10);
    }

    public final void e(int i7) {
        try {
            byte[] bArr = this.b;
            int i10 = this.d;
            int i11 = i10 + 1;
            this.d = i11;
            bArr[i10] = (byte) (i7 & qs.e4);
            int i12 = i10 + 2;
            this.d = i12;
            bArr[i11] = (byte) ((i7 >> 8) & qs.e4);
            int i13 = i10 + 3;
            this.d = i13;
            bArr[i12] = (byte) ((i7 >> 16) & qs.e4);
            this.d = i10 + 4;
            bArr[i13] = (byte) ((i7 >> 24) & qs.e4);
        } catch (IndexOutOfBoundsException e10) {
            throw new androidx.datastore.preferences.protobuf.l(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.d), Integer.valueOf(this.c), 1), e10);
        }
    }

    public final void f(int i7, long j3) {
        j((i7 << 3) | 1);
        g(j3);
    }

    public final void g(long j3) {
        try {
            byte[] bArr = this.b;
            int i7 = this.d;
            int i10 = i7 + 1;
            this.d = i10;
            bArr[i7] = (byte) (((int) j3) & qs.e4);
            int i11 = i7 + 2;
            this.d = i11;
            bArr[i10] = (byte) (((int) (j3 >> 8)) & qs.e4);
            int i12 = i7 + 3;
            this.d = i12;
            bArr[i11] = (byte) (((int) (j3 >> 16)) & qs.e4);
            int i13 = i7 + 4;
            this.d = i13;
            bArr[i12] = (byte) (((int) (j3 >> 24)) & qs.e4);
            int i14 = i7 + 5;
            this.d = i14;
            bArr[i13] = (byte) (((int) (j3 >> 32)) & qs.e4);
            int i15 = i7 + 6;
            this.d = i15;
            bArr[i14] = (byte) (((int) (j3 >> 40)) & qs.e4);
            int i16 = i7 + 7;
            this.d = i16;
            bArr[i15] = (byte) (((int) (j3 >> 48)) & qs.e4);
            this.d = i7 + 8;
            bArr[i16] = (byte) (((int) (j3 >> 56)) & qs.e4);
        } catch (IndexOutOfBoundsException e10) {
            throw new androidx.datastore.preferences.protobuf.l(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.d), Integer.valueOf(this.c), 1), e10);
        }
    }

    public final void h(int i7, String str) {
        j((i7 << 3) | 2);
        int i10 = this.d;
        try {
            int o4 = o(str.length() * 3);
            int o10 = o(str.length());
            int i11 = this.c;
            byte[] bArr = this.b;
            if (o10 != o4) {
                j(q6.c(str));
                int i12 = this.d;
                this.d = q6.b(str, bArr, i12, i11 - i12);
            } else {
                int i13 = i10 + o10;
                this.d = i13;
                int b10 = q6.b(str, bArr, i13, i11 - i13);
                this.d = i10;
                j((b10 - i10) - o10);
                this.d = b10;
            }
        } catch (p6 e10) {
            this.d = i10;
            e.logp(Level.WARNING, "com.google.protobuf.CodedOutputStream", "inefficientWriteStringNoTag", "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", (Throwable) e10);
            byte[] bytes = str.getBytes(h5.a);
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

    public final void i(int i7, int i10) {
        j((i7 << 3) | i10);
    }

    public final void j(int i7) {
        while (true) {
            int i10 = i7 & (-128);
            byte[] bArr = this.b;
            if (i10 == 0) {
                int i11 = this.d;
                this.d = i11 + 1;
                bArr[i11] = (byte) i7;
                return;
            } else {
                try {
                    int i12 = this.d;
                    this.d = i12 + 1;
                    bArr[i12] = (byte) ((i7 & qs.L1) | 128);
                    i7 >>>= 7;
                } catch (IndexOutOfBoundsException e10) {
                    throw new androidx.datastore.preferences.protobuf.l(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.d), Integer.valueOf(this.c), 1), e10);
                }
            }
            throw new androidx.datastore.preferences.protobuf.l(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.d), Integer.valueOf(this.c), 1), e10);
        }
    }

    public final void k(int i7, long j3) {
        j(i7 << 3);
        l(j3);
    }

    public final void l(long j3) {
        boolean z9 = f;
        int i7 = this.c;
        byte[] bArr = this.b;
        if (!z9 || i7 - this.d < 10) {
            while ((j3 & (-128)) != 0) {
                try {
                    int i10 = this.d;
                    this.d = i10 + 1;
                    bArr[i10] = (byte) ((((int) j3) & qs.L1) | 128);
                    j3 >>>= 7;
                } catch (IndexOutOfBoundsException e10) {
                    throw new androidx.datastore.preferences.protobuf.l(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.d), Integer.valueOf(i7), 1), e10);
                }
            }
            int i11 = this.d;
            this.d = i11 + 1;
            bArr[i11] = (byte) j3;
            return;
        }
        while (true) {
            int i12 = (int) j3;
            if ((j3 & (-128)) == 0) {
                int i13 = this.d;
                this.d = i13 + 1;
                o6.c.d(bArr, o6.f + i13, (byte) i12);
                return;
            } else {
                int i14 = this.d;
                this.d = i14 + 1;
                o6.c.d(bArr, o6.f + i14, (byte) ((i12 & qs.L1) | 128));
                j3 >>>= 7;
            }
        }
    }
}
