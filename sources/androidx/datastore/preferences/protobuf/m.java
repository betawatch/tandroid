package androidx.datastore.preferences.protobuf;

import a8.p6;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.telegram.messenger.qs;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes.dex */
public final class m extends p6 {
    public static final Logger f = Logger.getLogger(m.class.getName());
    public static final boolean g = n1.e;
    public l0 a;
    public final byte[] b;
    public final int c;
    public int d;
    public final m1.g1 e;

    public m(m1.g1 g1Var, int i7) {
        if (i7 < 0) {
            throw new IllegalArgumentException("bufferSize must be >= 0");
        }
        int max = Math.max(i7, 20);
        this.b = new byte[max];
        this.c = max;
        this.e = g1Var;
    }

    public static int g(int i7, h hVar) {
        int i10 = i(i7);
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

    public static int i(int i7) {
        return j(i7 << 3);
    }

    public static int j(int i7) {
        return (352 - (Integer.numberOfLeadingZeros(i7) * 9)) >>> 6;
    }

    public static int k(long j3) {
        return (640 - (Long.numberOfLeadingZeros(j3) * 9)) >>> 6;
    }

    public final void A(String str) {
        try {
            int length = str.length() * 3;
            int j3 = j(length);
            int i7 = j3 + length;
            int i10 = this.c;
            if (i7 > i10) {
                byte[] bArr = new byte[length];
                int b10 = q1.a.b(str, bArr, 0, length);
                D(b10);
                o(bArr, 0, b10);
                return;
            }
            if (i7 > i10 - this.d) {
                l();
            }
            int j10 = j(str.length());
            int i11 = this.d;
            byte[] bArr2 = this.b;
            try {
                if (j10 == j3) {
                    int i12 = i11 + j10;
                    this.d = i12;
                    int b11 = q1.a.b(str, bArr2, i12, i10 - i12);
                    this.d = i11;
                    e((b11 - i11) - j10);
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

    public final void B(int i7, int i10) {
        D((i7 << 3) | i10);
    }

    public final void C(int i7, int i10) {
        m(20);
        d(i7, 0);
        e(i10);
    }

    public final void D(int i7) {
        m(5);
        e(i7);
    }

    public final void E(int i7, long j3) {
        m(20);
        d(i7, 0);
        f(j3);
    }

    public final void F(long j3) {
        m(10);
        f(j3);
    }

    @Override // a8.p6
    public final void a(int i7, int i10, byte[] bArr) {
        o(bArr, i7, i10);
    }

    public final void b(int i7) {
        int i10 = this.d;
        int i11 = i10 + 1;
        this.d = i11;
        byte b10 = (byte) (i7 & qs.e4);
        byte[] bArr = this.b;
        bArr[i10] = b10;
        int i12 = i10 + 2;
        this.d = i12;
        bArr[i11] = (byte) ((i7 >> 8) & qs.e4);
        int i13 = i10 + 3;
        this.d = i13;
        bArr[i12] = (byte) ((i7 >> 16) & qs.e4);
        this.d = i10 + 4;
        bArr[i13] = (byte) ((i7 >> 24) & qs.e4);
    }

    public final void c(long j3) {
        int i7 = this.d;
        int i10 = i7 + 1;
        this.d = i10;
        byte[] bArr = this.b;
        bArr[i7] = (byte) (j3 & 255);
        int i11 = i7 + 2;
        this.d = i11;
        bArr[i10] = (byte) ((j3 >> 8) & 255);
        int i12 = i7 + 3;
        this.d = i12;
        bArr[i11] = (byte) ((j3 >> 16) & 255);
        int i13 = i7 + 4;
        this.d = i13;
        bArr[i12] = (byte) (255 & (j3 >> 24));
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
    }

    public final void d(int i7, int i10) {
        e((i7 << 3) | i10);
    }

    public final void e(int i7) {
        boolean z9 = g;
        byte[] bArr = this.b;
        if (z9) {
            while ((i7 & (-128)) != 0) {
                int i10 = this.d;
                this.d = i10 + 1;
                n1.j(bArr, i10, (byte) ((i7 | 128) & qs.e4));
                i7 >>>= 7;
            }
            int i11 = this.d;
            this.d = i11 + 1;
            n1.j(bArr, i11, (byte) i7);
            return;
        }
        while ((i7 & (-128)) != 0) {
            int i12 = this.d;
            this.d = i12 + 1;
            bArr[i12] = (byte) ((i7 | 128) & qs.e4);
            i7 >>>= 7;
        }
        int i13 = this.d;
        this.d = i13 + 1;
        bArr[i13] = (byte) i7;
    }

    public final void f(long j3) {
        boolean z9 = g;
        byte[] bArr = this.b;
        if (z9) {
            while ((j3 & (-128)) != 0) {
                int i7 = this.d;
                this.d = i7 + 1;
                n1.j(bArr, i7, (byte) ((((int) j3) | 128) & qs.e4));
                j3 >>>= 7;
            }
            int i10 = this.d;
            this.d = i10 + 1;
            n1.j(bArr, i10, (byte) j3);
            return;
        }
        while ((j3 & (-128)) != 0) {
            int i11 = this.d;
            this.d = i11 + 1;
            bArr[i11] = (byte) ((((int) j3) | 128) & qs.e4);
            j3 >>>= 7;
        }
        int i12 = this.d;
        this.d = i12 + 1;
        bArr[i12] = (byte) j3;
    }

    public final void l() {
        this.e.write(this.b, 0, this.d);
        this.d = 0;
    }

    public final void m(int i7) {
        if (this.c - this.d < i7) {
            l();
        }
    }

    public final void n(byte b10) {
        if (this.d == this.c) {
            l();
        }
        int i7 = this.d;
        this.d = i7 + 1;
        this.b[i7] = b10;
    }

    public final void o(byte[] bArr, int i7, int i10) {
        int i11 = this.d;
        int i12 = this.c;
        int i13 = i12 - i11;
        byte[] bArr2 = this.b;
        if (i13 >= i10) {
            System.arraycopy(bArr, i7, bArr2, i11, i10);
            this.d += i10;
            return;
        }
        System.arraycopy(bArr, i7, bArr2, i11, i13);
        int i14 = i7 + i13;
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

    public final void p(int i7, boolean z9) {
        m(11);
        d(i7, 0);
        byte b10 = z9 ? (byte) 1 : (byte) 0;
        int i10 = this.d;
        this.d = i10 + 1;
        this.b[i10] = b10;
    }

    public final void q(int i7, h hVar) {
        B(i7, 2);
        r(hVar);
    }

    public final void r(h hVar) {
        D(hVar.size());
        a(hVar.l(), hVar.size(), hVar.b);
    }

    public final void s(int i7, int i10) {
        m(14);
        d(i7, 5);
        b(i10);
    }

    public final void t(int i7) {
        m(4);
        b(i7);
    }

    public final void u(int i7, long j3) {
        m(18);
        d(i7, 1);
        c(j3);
    }

    public final void v(long j3) {
        m(8);
        c(j3);
    }

    public final void w(int i7, int i10) {
        m(20);
        d(i7, 0);
        if (i10 >= 0) {
            e(i10);
        } else {
            f(i10);
        }
    }

    public final void x(int i7) {
        if (i7 >= 0) {
            D(i7);
        } else {
            F(i7);
        }
    }

    public final void y(int i7, a aVar, b1 b1Var) {
        B(i7, 2);
        D(aVar.a(b1Var));
        b1Var.c(aVar, this.a);
    }

    public final void z(int i7, String str) {
        B(i7, 2);
        A(str);
    }
}
