package androidx.datastore.preferences.protobuf;

import java.util.logging.Level;
import java.util.logging.Logger;
import org.telegram.messenger.hs;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class m extends b8.s0 {
    public static final Logger f = Logger.getLogger(m.class.getName());
    public static final boolean g = n1.e;
    public l0 a;
    public final byte[] b;
    public final int c;
    public int d;
    public final l1.h1 e;

    public m(l1.h1 h1Var, int i3) {
        if (i3 < 0) {
            throw new IllegalArgumentException("bufferSize must be >= 0");
        }
        int max = Math.max(i3, 20);
        this.b = new byte[max];
        this.c = max;
        this.e = h1Var;
    }

    public static int g(int i3, h hVar) {
        int i10 = i(i3);
        int size = hVar.size();
        return j(size) + size + i10;
    }

    public static int h(String str) {
        int length;
        try {
            length = q1.a(str);
        } catch (p1 unused) {
            length = str.getBytes(c0.a).length;
        }
        return j(length) + length;
    }

    public static int i(int i3) {
        return j(i3 << 3);
    }

    public static int j(int i3) {
        return (352 - (Integer.numberOfLeadingZeros(i3) * 9)) >>> 6;
    }

    public static int k(long j10) {
        return (640 - (Long.numberOfLeadingZeros(j10) * 9)) >>> 6;
    }

    public final void A(String str) {
        try {
            int length = str.length() * 3;
            int j10 = j(length);
            int i3 = j10 + length;
            int i10 = this.c;
            if (i3 > i10) {
                byte[] bArr = new byte[length];
                int b10 = q1.a.b(str, bArr, 0, length);
                D(b10);
                o(bArr, 0, b10);
                return;
            }
            if (i3 > i10 - this.d) {
                l();
            }
            int j11 = j(str.length());
            int i11 = this.d;
            byte[] bArr2 = this.b;
            try {
                if (j11 == j10) {
                    int i12 = i11 + j11;
                    this.d = i12;
                    int b11 = q1.a.b(str, bArr2, i12, i10 - i12);
                    this.d = i11;
                    e((b11 - i11) - j11);
                    this.d = b11;
                } else {
                    int a10 = q1.a(str);
                    e(a10);
                    this.d = q1.a.b(str, bArr2, this.d, a10);
                }
            } catch (p1 e10) {
                this.d = i11;
                throw e10;
            } catch (ArrayIndexOutOfBoundsException e11) {
                throw new l(e11);
            }
        } catch (p1 e12) {
            f.log(Level.WARNING, "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", (Throwable) e12);
            byte[] bytes = str.getBytes(c0.a);
            try {
                D(bytes.length);
                a(0, bytes.length, bytes);
            } catch (IndexOutOfBoundsException e13) {
                throw new l(e13);
            }
        }
    }

    public final void B(int i3, int i10) {
        D((i3 << 3) | i10);
    }

    public final void C(int i3, int i10) {
        m(20);
        d(i3, 0);
        e(i10);
    }

    public final void D(int i3) {
        m(5);
        e(i3);
    }

    public final void E(int i3, long j10) {
        m(20);
        d(i3, 0);
        f(j10);
    }

    public final void F(long j10) {
        m(10);
        f(j10);
    }

    @Override // b8.s0
    public final void a(int i3, int i10, byte[] bArr) {
        o(bArr, i3, i10);
    }

    public final void b(int i3) {
        int i10 = this.d;
        int i11 = i10 + 1;
        this.d = i11;
        byte b10 = (byte) (i3 & hs.e4);
        byte[] bArr = this.b;
        bArr[i10] = b10;
        int i12 = i10 + 2;
        this.d = i12;
        bArr[i11] = (byte) ((i3 >> 8) & hs.e4);
        int i13 = i10 + 3;
        this.d = i13;
        bArr[i12] = (byte) ((i3 >> 16) & hs.e4);
        this.d = i10 + 4;
        bArr[i13] = (byte) ((i3 >> 24) & hs.e4);
    }

    public final void c(long j10) {
        int i3 = this.d;
        int i10 = i3 + 1;
        this.d = i10;
        byte[] bArr = this.b;
        bArr[i3] = (byte) (j10 & 255);
        int i11 = i3 + 2;
        this.d = i11;
        bArr[i10] = (byte) ((j10 >> 8) & 255);
        int i12 = i3 + 3;
        this.d = i12;
        bArr[i11] = (byte) ((j10 >> 16) & 255);
        int i13 = i3 + 4;
        this.d = i13;
        bArr[i12] = (byte) (255 & (j10 >> 24));
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
    }

    public final void d(int i3, int i10) {
        e((i3 << 3) | i10);
    }

    public final void e(int i3) {
        boolean z10 = g;
        byte[] bArr = this.b;
        if (z10) {
            while ((i3 & (-128)) != 0) {
                int i10 = this.d;
                this.d = i10 + 1;
                n1.j(bArr, i10, (byte) ((i3 | 128) & hs.e4));
                i3 >>>= 7;
            }
            int i11 = this.d;
            this.d = i11 + 1;
            n1.j(bArr, i11, (byte) i3);
            return;
        }
        while ((i3 & (-128)) != 0) {
            int i12 = this.d;
            this.d = i12 + 1;
            bArr[i12] = (byte) ((i3 | 128) & hs.e4);
            i3 >>>= 7;
        }
        int i13 = this.d;
        this.d = i13 + 1;
        bArr[i13] = (byte) i3;
    }

    public final void f(long j10) {
        boolean z10 = g;
        byte[] bArr = this.b;
        if (z10) {
            while ((j10 & (-128)) != 0) {
                int i3 = this.d;
                this.d = i3 + 1;
                n1.j(bArr, i3, (byte) ((((int) j10) | 128) & hs.e4));
                j10 >>>= 7;
            }
            int i10 = this.d;
            this.d = i10 + 1;
            n1.j(bArr, i10, (byte) j10);
            return;
        }
        while ((j10 & (-128)) != 0) {
            int i11 = this.d;
            this.d = i11 + 1;
            bArr[i11] = (byte) ((((int) j10) | 128) & hs.e4);
            j10 >>>= 7;
        }
        int i12 = this.d;
        this.d = i12 + 1;
        bArr[i12] = (byte) j10;
    }

    public final void l() {
        this.e.write(this.b, 0, this.d);
        this.d = 0;
    }

    public final void m(int i3) {
        if (this.c - this.d < i3) {
            l();
        }
    }

    public final void n(byte b10) {
        if (this.d == this.c) {
            l();
        }
        int i3 = this.d;
        this.d = i3 + 1;
        this.b[i3] = b10;
    }

    public final void o(byte[] bArr, int i3, int i10) {
        int i11 = this.d;
        int i12 = this.c;
        int i13 = i12 - i11;
        byte[] bArr2 = this.b;
        if (i13 >= i10) {
            System.arraycopy(bArr, i3, bArr2, i11, i10);
            this.d += i10;
            return;
        }
        System.arraycopy(bArr, i3, bArr2, i11, i13);
        int i14 = i3 + i13;
        int i15 = i10 - i13;
        this.d = i12;
        l();
        if (i15 > i12) {
            this.e.write(bArr, i14, i15);
        } else {
            System.arraycopy(bArr, i14, bArr2, 0, i15);
            this.d = i15;
        }
    }

    public final void p(int i3, boolean z10) {
        m(11);
        d(i3, 0);
        byte b10 = z10 ? (byte) 1 : (byte) 0;
        int i10 = this.d;
        this.d = i10 + 1;
        this.b[i10] = b10;
    }

    public final void q(int i3, h hVar) {
        B(i3, 2);
        r(hVar);
    }

    public final void r(h hVar) {
        D(hVar.size());
        a(hVar.l(), hVar.size(), hVar.b);
    }

    public final void s(int i3, int i10) {
        m(14);
        d(i3, 5);
        b(i10);
    }

    public final void t(int i3) {
        m(4);
        b(i3);
    }

    public final void u(int i3, long j10) {
        m(18);
        d(i3, 1);
        c(j10);
    }

    public final void v(long j10) {
        m(8);
        c(j10);
    }

    public final void w(int i3, int i10) {
        m(20);
        d(i3, 0);
        if (i10 >= 0) {
            e(i10);
        } else {
            f(i10);
        }
    }

    public final void x(int i3) {
        if (i3 >= 0) {
            D(i3);
        } else {
            F(i3);
        }
    }

    public final void y(int i3, a aVar, b1 b1Var) {
        B(i3, 2);
        D(aVar.a(b1Var));
        b1Var.c(aVar, this.a);
    }

    public final void z(int i3, String str) {
        B(i3, 2);
        A(str);
    }
}
