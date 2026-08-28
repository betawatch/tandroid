package androidx.datastore.preferences.protobuf;

import java.util.logging.Level;
import java.util.logging.Logger;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class k extends s0 {
    public static final Logger h = Logger.getLogger(k.class.getName());
    public static final boolean i = s1.f;
    public l0 c;
    public final byte[] d;
    public final int e;
    public int f;
    public final k1.l g;

    public k(k1.l lVar, int i9) {
        if (i9 < 0) {
            throw new IllegalArgumentException("bufferSize must be >= 0");
        }
        int max = Math.max(i9, 20);
        this.d = new byte[max];
        this.e = max;
        this.g = lVar;
    }

    public static int A(long j10) {
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

    public static int r(int i9, g gVar) {
        return s(gVar) + y(i9);
    }

    public static int s(g gVar) {
        int size = gVar.size();
        return z(size) + size;
    }

    public static int t(int i9) {
        return y(i9) + 4;
    }

    public static int u(int i9) {
        return y(i9) + 8;
    }

    public static int v(int i9, a aVar, c1 c1Var) {
        return aVar.b(c1Var) + (y(i9) * 2);
    }

    public static int w(int i9) {
        if (i9 >= 0) {
            return z(i9);
        }
        return 10;
    }

    public static int x(String str) {
        int length;
        try {
            length = v1.b(str);
        } catch (u1 unused) {
            length = str.getBytes(a0.a).length;
        }
        return z(length) + length;
    }

    public static int y(int i9) {
        return z(i9 << 3);
    }

    public static int z(int i9) {
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

    public final void B() {
        this.g.write(this.d, 0, this.f);
        this.f = 0;
    }

    public final void C(int i9) {
        if (this.e - this.f < i9) {
            B();
        }
    }

    public final void D(byte b10) {
        if (this.f == this.e) {
            B();
        }
        int i9 = this.f;
        this.f = i9 + 1;
        this.d[i9] = b10;
    }

    public final void E(byte[] bArr, int i9, int i10) {
        int i11 = this.f;
        int i12 = this.e;
        int i13 = i12 - i11;
        byte[] bArr2 = this.d;
        if (i13 >= i10) {
            System.arraycopy(bArr, i9, bArr2, i11, i10);
            this.f += i10;
            return;
        }
        System.arraycopy(bArr, i9, bArr2, i11, i13);
        int i14 = i9 + i13;
        int i15 = i10 - i13;
        this.f = i12;
        B();
        if (i15 > i12) {
            this.g.write(bArr, i14, i15);
        } else {
            System.arraycopy(bArr, i14, bArr2, 0, i15);
            this.f = i15;
        }
    }

    public final void F(int i9, boolean z10) {
        C(11);
        o(i9, 0);
        byte b10 = z10 ? (byte) 1 : (byte) 0;
        int i10 = this.f;
        this.f = i10 + 1;
        this.d[i10] = b10;
    }

    public final void G(int i9, g gVar) {
        R(i9, 2);
        H(gVar);
    }

    public final void H(g gVar) {
        T(gVar.size());
        l(gVar.n(), gVar.size(), gVar.b);
    }

    public final void I(int i9, int i10) {
        C(14);
        o(i9, 5);
        m(i10);
    }

    public final void J(int i9) {
        C(4);
        m(i9);
    }

    public final void K(int i9, long j10) {
        C(18);
        o(i9, 1);
        n(j10);
    }

    public final void L(long j10) {
        C(8);
        n(j10);
    }

    public final void M(int i9, int i10) {
        C(20);
        o(i9, 0);
        if (i10 >= 0) {
            p(i10);
        } else {
            q(i10);
        }
    }

    public final void N(int i9) {
        if (i9 >= 0) {
            T(i9);
        } else {
            V(i9);
        }
    }

    public final void O(int i9, a aVar, c1 c1Var) {
        R(i9, 2);
        T(aVar.b(c1Var));
        c1Var.b(aVar, this.c);
    }

    public final void P(int i9, String str) {
        R(i9, 2);
        Q(str);
    }

    public final void Q(String str) {
        try {
            int length = str.length() * 3;
            int z10 = z(length);
            int i9 = z10 + length;
            int i10 = this.e;
            if (i9 > i10) {
                byte[] bArr = new byte[length];
                int f10 = v1.a.f(str, bArr, 0, length);
                T(f10);
                E(bArr, 0, f10);
                return;
            }
            if (i9 > i10 - this.f) {
                B();
            }
            int z11 = z(str.length());
            int i11 = this.f;
            byte[] bArr2 = this.d;
            try {
                try {
                    if (z11 == z10) {
                        int i12 = i11 + z11;
                        this.f = i12;
                        int f11 = v1.a.f(str, bArr2, i12, i10 - i12);
                        this.f = i11;
                        p((f11 - i11) - z11);
                        this.f = f11;
                    } else {
                        int b10 = v1.b(str);
                        p(b10);
                        this.f = v1.a.f(str, bArr2, this.f, b10);
                    }
                } catch (u1 e10) {
                    this.f = i11;
                    throw e10;
                }
            } catch (ArrayIndexOutOfBoundsException e11) {
                throw new j(e11);
            }
        } catch (u1 e12) {
            h.log(Level.WARNING, "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", (Throwable) e12);
            byte[] bytes = str.getBytes(a0.a);
            try {
                T(bytes.length);
                l(0, bytes.length, bytes);
            } catch (j e13) {
                throw e13;
            } catch (IndexOutOfBoundsException e14) {
                throw new j(e14);
            }
        }
    }

    public final void R(int i9, int i10) {
        T((i9 << 3) | i10);
    }

    public final void S(int i9, int i10) {
        C(20);
        o(i9, 0);
        p(i10);
    }

    public final void T(int i9) {
        C(5);
        p(i9);
    }

    public final void U(int i9, long j10) {
        C(20);
        o(i9, 0);
        q(j10);
    }

    public final void V(long j10) {
        C(10);
        q(j10);
    }

    @Override // androidx.datastore.preferences.protobuf.s0
    public final void l(int i9, int i10, byte[] bArr) {
        E(bArr, i9, i10);
    }

    public final void m(int i9) {
        int i10 = this.f;
        int i11 = i10 + 1;
        this.f = i11;
        byte[] bArr = this.d;
        bArr[i10] = (byte) (i9 & 255);
        int i12 = i10 + 2;
        this.f = i12;
        bArr[i11] = (byte) ((i9 >> 8) & 255);
        int i13 = i10 + 3;
        this.f = i13;
        bArr[i12] = (byte) ((i9 >> 16) & 255);
        this.f = i10 + 4;
        bArr[i13] = (byte) ((i9 >> 24) & 255);
    }

    public final void n(long j10) {
        int i9 = this.f;
        int i10 = i9 + 1;
        this.f = i10;
        byte[] bArr = this.d;
        bArr[i9] = (byte) (j10 & 255);
        int i11 = i9 + 2;
        this.f = i11;
        bArr[i10] = (byte) ((j10 >> 8) & 255);
        int i12 = i9 + 3;
        this.f = i12;
        bArr[i11] = (byte) ((j10 >> 16) & 255);
        int i13 = i9 + 4;
        this.f = i13;
        bArr[i12] = (byte) (255 & (j10 >> 24));
        int i14 = i9 + 5;
        this.f = i14;
        bArr[i13] = (byte) (((int) (j10 >> 32)) & 255);
        int i15 = i9 + 6;
        this.f = i15;
        bArr[i14] = (byte) (((int) (j10 >> 40)) & 255);
        int i16 = i9 + 7;
        this.f = i16;
        bArr[i15] = (byte) (((int) (j10 >> 48)) & 255);
        this.f = i9 + 8;
        bArr[i16] = (byte) (((int) (j10 >> 56)) & 255);
    }

    public final void o(int i9, int i10) {
        p((i9 << 3) | i10);
    }

    public final void p(int i9) {
        boolean z10 = i;
        byte[] bArr = this.d;
        if (z10) {
            while ((i9 & (-128)) != 0) {
                int i10 = this.f;
                this.f = i10 + 1;
                s1.j(bArr, i10, (byte) ((i9 & 127) | 128));
                i9 >>>= 7;
            }
            int i11 = this.f;
            this.f = i11 + 1;
            s1.j(bArr, i11, (byte) i9);
            return;
        }
        while ((i9 & (-128)) != 0) {
            int i12 = this.f;
            this.f = i12 + 1;
            bArr[i12] = (byte) ((i9 & 127) | 128);
            i9 >>>= 7;
        }
        int i13 = this.f;
        this.f = i13 + 1;
        bArr[i13] = (byte) i9;
    }

    public final void q(long j10) {
        boolean z10 = i;
        byte[] bArr = this.d;
        if (z10) {
            while ((j10 & (-128)) != 0) {
                int i9 = this.f;
                this.f = i9 + 1;
                s1.j(bArr, i9, (byte) ((((int) j10) & 127) | 128));
                j10 >>>= 7;
            }
            int i10 = this.f;
            this.f = i10 + 1;
            s1.j(bArr, i10, (byte) j10);
            return;
        }
        while ((j10 & (-128)) != 0) {
            int i11 = this.f;
            this.f = i11 + 1;
            bArr[i11] = (byte) ((((int) j10) & 127) | 128);
            j10 >>>= 7;
        }
        int i12 = this.f;
        this.f = i12 + 1;
        bArr[i12] = (byte) j10;
    }
}
