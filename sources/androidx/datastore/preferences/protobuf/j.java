package androidx.datastore.preferences.protobuf;

import java.util.logging.Level;
import java.util.logging.Logger;

/* compiled from: r8-map-id-1181a9f210c4244598aa36bb39e1460f3842f305ed8c0c95af755ee091fedd7d */
/* loaded from: classes.dex */
public final class j extends r0 {
    public static final Logger h = Logger.getLogger(j.class.getName());
    public static final boolean i = r1.f;
    public k0 c;
    public final byte[] d;
    public final int e;
    public int f;
    public final k1.l g;

    public j(k1.l lVar, int i10) {
        if (i10 < 0) {
            throw new IllegalArgumentException("bufferSize must be >= 0");
        }
        int max = Math.max(i10, 20);
        this.d = new byte[max];
        this.e = max;
        this.g = lVar;
    }

    public static int A(long j3) {
        int i10;
        if (((-128) & j3) == 0) {
            return 1;
        }
        if (j3 < 0) {
            return 10;
        }
        if (((-34359738368L) & j3) != 0) {
            j3 >>>= 28;
            i10 = 6;
        } else {
            i10 = 2;
        }
        if (((-2097152) & j3) != 0) {
            i10 += 2;
            j3 >>>= 14;
        }
        return (j3 & (-16384)) != 0 ? i10 + 1 : i10;
    }

    public static int r(int i10, g gVar) {
        return s(gVar) + y(i10);
    }

    public static int s(g gVar) {
        int size = gVar.size();
        return z(size) + size;
    }

    public static int t(int i10) {
        return y(i10) + 4;
    }

    public static int u(int i10) {
        return y(i10) + 8;
    }

    public static int v(int i10, a aVar, b1 b1Var) {
        return aVar.b(b1Var) + (y(i10) * 2);
    }

    public static int w(int i10) {
        if (i10 >= 0) {
            return z(i10);
        }
        return 10;
    }

    public static int x(String str) {
        int length;
        try {
            length = u1.b(str);
        } catch (t1 unused) {
            length = str.getBytes(z.a).length;
        }
        return z(length) + length;
    }

    public static int y(int i10) {
        return z(i10 << 3);
    }

    public static int z(int i10) {
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

    public final void B() {
        this.g.write(this.d, 0, this.f);
        this.f = 0;
    }

    public final void C(int i10) {
        if (this.e - this.f < i10) {
            B();
        }
    }

    public final void D(byte b10) {
        if (this.f == this.e) {
            B();
        }
        int i10 = this.f;
        this.f = i10 + 1;
        this.d[i10] = b10;
    }

    public final void E(byte[] bArr, int i10, int i11) {
        int i12 = this.f;
        int i13 = this.e;
        int i14 = i13 - i12;
        byte[] bArr2 = this.d;
        if (i14 >= i11) {
            System.arraycopy(bArr, i10, bArr2, i12, i11);
            this.f += i11;
            return;
        }
        System.arraycopy(bArr, i10, bArr2, i12, i14);
        int i15 = i10 + i14;
        int i16 = i11 - i14;
        this.f = i13;
        B();
        if (i16 > i13) {
            this.g.write(bArr, i15, i16);
        } else {
            System.arraycopy(bArr, i15, bArr2, 0, i16);
            this.f = i16;
        }
    }

    public final void F(int i10, boolean z10) {
        C(11);
        o(i10, 0);
        byte b10 = z10 ? (byte) 1 : (byte) 0;
        int i11 = this.f;
        this.f = i11 + 1;
        this.d[i11] = b10;
    }

    public final void G(int i10, g gVar) {
        R(i10, 2);
        H(gVar);
    }

    public final void H(g gVar) {
        T(gVar.size());
        l(gVar.n(), gVar.size(), gVar.b);
    }

    public final void I(int i10, int i11) {
        C(14);
        o(i10, 5);
        m(i11);
    }

    public final void J(int i10) {
        C(4);
        m(i10);
    }

    public final void K(int i10, long j3) {
        C(18);
        o(i10, 1);
        n(j3);
    }

    public final void L(long j3) {
        C(8);
        n(j3);
    }

    public final void M(int i10, int i11) {
        C(20);
        o(i10, 0);
        if (i11 >= 0) {
            p(i11);
        } else {
            q(i11);
        }
    }

    public final void N(int i10) {
        if (i10 >= 0) {
            T(i10);
        } else {
            V(i10);
        }
    }

    public final void O(int i10, a aVar, b1 b1Var) {
        R(i10, 2);
        T(aVar.b(b1Var));
        b1Var.b(aVar, this.c);
    }

    public final void P(int i10, String str) {
        R(i10, 2);
        Q(str);
    }

    public final void Q(String str) {
        try {
            int length = str.length() * 3;
            int z10 = z(length);
            int i10 = z10 + length;
            int i11 = this.e;
            if (i10 > i11) {
                byte[] bArr = new byte[length];
                int f7 = u1.a.f(str, bArr, 0, length);
                T(f7);
                E(bArr, 0, f7);
                return;
            }
            if (i10 > i11 - this.f) {
                B();
            }
            int z11 = z(str.length());
            int i12 = this.f;
            byte[] bArr2 = this.d;
            try {
                if (z11 == z10) {
                    int i13 = i12 + z11;
                    this.f = i13;
                    int f10 = u1.a.f(str, bArr2, i13, i11 - i13);
                    this.f = i12;
                    p((f10 - i12) - z11);
                    this.f = f10;
                } else {
                    int b10 = u1.b(str);
                    p(b10);
                    this.f = u1.a.f(str, bArr2, this.f, b10);
                }
            } catch (t1 e7) {
                this.f = i12;
                throw e7;
            } catch (ArrayIndexOutOfBoundsException e10) {
                throw new i(e10);
            }
        } catch (t1 e11) {
            h.log(Level.WARNING, "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", (Throwable) e11);
            byte[] bytes = str.getBytes(z.a);
            try {
                T(bytes.length);
                l(0, bytes.length, bytes);
            } catch (i e12) {
                throw e12;
            } catch (IndexOutOfBoundsException e13) {
                throw new i(e13);
            }
        }
    }

    public final void R(int i10, int i11) {
        T((i10 << 3) | i11);
    }

    public final void S(int i10, int i11) {
        C(20);
        o(i10, 0);
        p(i11);
    }

    public final void T(int i10) {
        C(5);
        p(i10);
    }

    public final void U(int i10, long j3) {
        C(20);
        o(i10, 0);
        q(j3);
    }

    public final void V(long j3) {
        C(10);
        q(j3);
    }

    @Override // androidx.datastore.preferences.protobuf.r0
    public final void l(int i10, int i11, byte[] bArr) {
        E(bArr, i10, i11);
    }

    public final void m(int i10) {
        int i11 = this.f;
        int i12 = i11 + 1;
        this.f = i12;
        byte[] bArr = this.d;
        bArr[i11] = (byte) (i10 & 255);
        int i13 = i11 + 2;
        this.f = i13;
        bArr[i12] = (byte) ((i10 >> 8) & 255);
        int i14 = i11 + 3;
        this.f = i14;
        bArr[i13] = (byte) ((i10 >> 16) & 255);
        this.f = i11 + 4;
        bArr[i14] = (byte) ((i10 >> 24) & 255);
    }

    public final void n(long j3) {
        int i10 = this.f;
        int i11 = i10 + 1;
        this.f = i11;
        byte[] bArr = this.d;
        bArr[i10] = (byte) (j3 & 255);
        int i12 = i10 + 2;
        this.f = i12;
        bArr[i11] = (byte) ((j3 >> 8) & 255);
        int i13 = i10 + 3;
        this.f = i13;
        bArr[i12] = (byte) ((j3 >> 16) & 255);
        int i14 = i10 + 4;
        this.f = i14;
        bArr[i13] = (byte) (255 & (j3 >> 24));
        int i15 = i10 + 5;
        this.f = i15;
        bArr[i14] = (byte) (((int) (j3 >> 32)) & 255);
        int i16 = i10 + 6;
        this.f = i16;
        bArr[i15] = (byte) (((int) (j3 >> 40)) & 255);
        int i17 = i10 + 7;
        this.f = i17;
        bArr[i16] = (byte) (((int) (j3 >> 48)) & 255);
        this.f = i10 + 8;
        bArr[i17] = (byte) (((int) (j3 >> 56)) & 255);
    }

    public final void o(int i10, int i11) {
        p((i10 << 3) | i11);
    }

    public final void p(int i10) {
        boolean z10 = i;
        byte[] bArr = this.d;
        if (z10) {
            while ((i10 & (-128)) != 0) {
                int i11 = this.f;
                this.f = i11 + 1;
                r1.j(bArr, i11, (byte) ((i10 & 127) | 128));
                i10 >>>= 7;
            }
            int i12 = this.f;
            this.f = i12 + 1;
            r1.j(bArr, i12, (byte) i10);
            return;
        }
        while ((i10 & (-128)) != 0) {
            int i13 = this.f;
            this.f = i13 + 1;
            bArr[i13] = (byte) ((i10 & 127) | 128);
            i10 >>>= 7;
        }
        int i14 = this.f;
        this.f = i14 + 1;
        bArr[i14] = (byte) i10;
    }

    public final void q(long j3) {
        boolean z10 = i;
        byte[] bArr = this.d;
        if (z10) {
            while ((j3 & (-128)) != 0) {
                int i10 = this.f;
                this.f = i10 + 1;
                r1.j(bArr, i10, (byte) ((((int) j3) & 127) | 128));
                j3 >>>= 7;
            }
            int i11 = this.f;
            this.f = i11 + 1;
            r1.j(bArr, i11, (byte) j3);
            return;
        }
        while ((j3 & (-128)) != 0) {
            int i12 = this.f;
            this.f = i12 + 1;
            bArr[i12] = (byte) ((((int) j3) & 127) | 128);
            j3 >>>= 7;
        }
        int i13 = this.f;
        this.f = i13 + 1;
        bArr[i13] = (byte) j3;
    }
}
