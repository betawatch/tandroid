package c4;

import androidx.datastore.preferences.protobuf.b0;
import androidx.datastore.preferences.protobuf.b1;
import androidx.datastore.preferences.protobuf.c0;
import androidx.datastore.preferences.protobuf.e0;
import androidx.datastore.preferences.protobuf.k;
import androidx.datastore.preferences.protobuf.p;
import androidx.datastore.preferences.protobuf.v1;
import androidx.datastore.preferences.protobuf.y0;
import androidx.datastore.preferences.protobuf.z;
import b8.zb;
import g2.n0;
import g2.y;
import java.nio.charset.Charset;
import org.telegram.messenger.hs;
import org.telegram.tgnet.ConnectionsManager;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class f {
    public final /* synthetic */ int a;
    public Object b;
    public int c;
    public int d;
    public int e;

    public f() {
        this.a = 2;
        this.b = n0.b;
    }

    public static void O(int i3) {
        if ((i3 & 3) != 0) {
            throw new e0("Failed to parse the message.");
        }
    }

    public static void P(int i3) {
        if ((i3 & 7) != 0) {
            throw new e0("Failed to parse the message.");
        }
    }

    public void A(b0 b0Var) {
        int u10;
        k kVar = (k) this.b;
        int i3 = this.c & 7;
        if (i3 == 0) {
            do {
                b0Var.add(Integer.valueOf(kVar.q()));
                if (kVar.c()) {
                    return;
                } else {
                    u10 = kVar.u();
                }
            } while (u10 == this.c);
            this.e = u10;
            return;
        }
        if (i3 != 2) {
            throw e0.b();
        }
        int b10 = kVar.b() + kVar.v();
        do {
            b0Var.add(Integer.valueOf(kVar.q()));
        } while (kVar.b() < b10);
        F(b10);
    }

    public void B(b0 b0Var) {
        int u10;
        k kVar = (k) this.b;
        int i3 = this.c & 7;
        if (i3 == 0) {
            do {
                b0Var.add(Long.valueOf(kVar.r()));
                if (kVar.c()) {
                    return;
                } else {
                    u10 = kVar.u();
                }
            } while (u10 == this.c);
            this.e = u10;
            return;
        }
        if (i3 != 2) {
            throw e0.b();
        }
        int b10 = kVar.b() + kVar.v();
        do {
            b0Var.add(Long.valueOf(kVar.r()));
        } while (kVar.b() < b10);
        F(b10);
    }

    public void C(b0 b0Var, boolean z10) {
        String s6;
        int u10;
        k kVar = (k) this.b;
        if ((this.c & 7) != 2) {
            throw e0.b();
        }
        do {
            if (z10) {
                G(2);
                s6 = kVar.t();
            } else {
                G(2);
                s6 = kVar.s();
            }
            b0Var.add(s6);
            if (kVar.c()) {
                return;
            } else {
                u10 = kVar.u();
            }
        } while (u10 == this.c);
        this.e = u10;
    }

    public void D(b0 b0Var) {
        int u10;
        k kVar = (k) this.b;
        int i3 = this.c & 7;
        if (i3 == 0) {
            do {
                b0Var.add(Integer.valueOf(kVar.v()));
                if (kVar.c()) {
                    return;
                } else {
                    u10 = kVar.u();
                }
            } while (u10 == this.c);
            this.e = u10;
            return;
        }
        if (i3 != 2) {
            throw e0.b();
        }
        int b10 = kVar.b() + kVar.v();
        do {
            b0Var.add(Integer.valueOf(kVar.v()));
        } while (kVar.b() < b10);
        F(b10);
    }

    public void E(b0 b0Var) {
        int u10;
        k kVar = (k) this.b;
        int i3 = this.c & 7;
        if (i3 == 0) {
            do {
                b0Var.add(Long.valueOf(kVar.w()));
                if (kVar.c()) {
                    return;
                } else {
                    u10 = kVar.u();
                }
            } while (u10 == this.c);
            this.e = u10;
            return;
        }
        if (i3 != 2) {
            throw e0.b();
        }
        int b10 = kVar.b() + kVar.v();
        do {
            b0Var.add(Long.valueOf(kVar.w()));
        } while (kVar.b() < b10);
        F(b10);
    }

    public void F(int i3) {
        if (((k) this.b).b() != i3) {
            throw e0.e();
        }
    }

    public void G(int i3) {
        if ((this.c & 7) != i3) {
            throw e0.b();
        }
    }

    public void H(int i3, byte[] bArr) {
        this.b = bArr;
        this.c = 0;
        this.d = 0;
        this.e = i3;
    }

    public void I(y yVar) {
        H(yVar.c, yVar.a);
        J(yVar.b * 8);
    }

    public void J(int i3) {
        int i10 = i3 / 8;
        this.c = i10;
        this.d = i3 - (i10 * 8);
        a();
    }

    public void K() {
        int i3 = this.d + 1;
        this.d = i3;
        if (i3 == 8) {
            this.d = 0;
            this.c++;
        }
        a();
    }

    public void L(int i3) {
        int i10;
        switch (this.a) {
            case 1:
                int i11 = i3 / 8;
                int i12 = this.d + i11;
                this.d = i12;
                int i13 = (i3 - (i11 * 8)) + this.e;
                this.e = i13;
                boolean z10 = true;
                if (i13 > 7) {
                    this.d = i12 + 1;
                    this.e = i13 - 8;
                }
                int i14 = this.d;
                if (i14 < 0 || (i14 >= (i10 = this.c) && (i14 != i10 || this.e != 0))) {
                    z10 = false;
                }
                zb.p(z10);
                break;
            default:
                int i15 = i3 / 8;
                int i16 = this.c + i15;
                this.c = i16;
                int i17 = (i3 - (i15 * 8)) + this.d;
                this.d = i17;
                if (i17 > 7) {
                    this.c = i16 + 1;
                    this.d = i17 - 8;
                }
                a();
                break;
        }
    }

    public void M(int i3) {
        zb.p(this.d == 0);
        this.c += i3;
        a();
    }

    public boolean N() {
        int i3;
        k kVar = (k) this.b;
        if (kVar.c() || (i3 = this.c) == this.d) {
            return false;
        }
        return kVar.x(i3);
    }

    public void a() {
        int i3;
        int i10 = this.c;
        zb.p(i10 >= 0 && (i10 < (i3 = this.e) || (i10 == i3 && this.d == 0)));
    }

    public int b() {
        return ((this.e - this.c) * 8) - this.d;
    }

    public void c() {
        if (this.d == 0) {
            return;
        }
        this.d = 0;
        this.c++;
        a();
    }

    public int d() {
        zb.p(this.d == 0);
        return this.c;
    }

    public int e() {
        int i3 = this.e;
        if (i3 != 0) {
            this.c = i3;
            this.e = 0;
        } else {
            this.c = ((k) this.b).u();
        }
        int i10 = this.c;
        return (i10 == 0 || i10 == this.d) ? ConnectionsManager.DEFAULT_DATACENTER_ID : i10 >>> 3;
    }

    public int f() {
        return (this.c * 8) + this.d;
    }

    public void g(Object obj, b1 b1Var, p pVar) {
        int i3 = this.d;
        this.d = ((this.c >>> 3) << 3) | 4;
        try {
            b1Var.i(obj, this, pVar);
            if (this.c == this.d) {
            } else {
                throw new e0("Failed to parse the message.");
            }
        } finally {
            this.d = i3;
        }
    }

    public void h(Object obj, b1 b1Var, p pVar) {
        k kVar = (k) this.b;
        int v = kVar.v();
        if (kVar.a >= 100) {
            throw new e0("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
        }
        int e10 = kVar.e(v);
        kVar.a++;
        b1Var.i(obj, this, pVar);
        kVar.a(0);
        kVar.a--;
        kVar.d(e10);
    }

    public boolean i() {
        switch (this.a) {
            case 1:
                boolean z10 = (((((byte[]) this.b)[this.d] & 255) >> this.e) & 1) == 1;
                L(1);
                return z10;
            default:
                boolean z11 = (((byte[]) this.b)[this.c] & (128 >> this.d)) != 0;
                K();
                return z11;
        }
    }

    public int j(int i3) {
        switch (this.a) {
            case 1:
                int i10 = this.d;
                int min = Math.min(i3, 8 - this.e);
                byte[] bArr = (byte[]) this.b;
                int i11 = i10 + 1;
                int i12 = ((bArr[i10] & 255) >> this.e) & (hs.e4 >> (8 - min));
                while (min < i3) {
                    i12 |= (bArr[i11] & 255) << min;
                    min += 8;
                    i11++;
                }
                int i13 = i12 & ((-1) >>> (32 - i3));
                L(i3);
                return i13;
            default:
                if (i3 == 0) {
                    return 0;
                }
                this.d += i3;
                int i14 = 0;
                while (true) {
                    int i15 = this.d;
                    if (i15 <= 8) {
                        byte[] bArr2 = (byte[]) this.b;
                        int i16 = this.c;
                        int i17 = ((-1) >>> (32 - i3)) & (i14 | ((bArr2[i16] & 255) >> (8 - i15)));
                        if (i15 == 8) {
                            this.d = 0;
                            this.c = i16 + 1;
                        }
                        a();
                        return i17;
                    }
                    int i18 = i15 - 8;
                    this.d = i18;
                    byte[] bArr3 = (byte[]) this.b;
                    int i19 = this.c;
                    this.c = i19 + 1;
                    i14 |= (bArr3[i19] & 255) << i18;
                }
        }
    }

    public void k(int i3, byte[] bArr) {
        int i10 = i3 >> 3;
        for (int i11 = 0; i11 < i10; i11++) {
            byte[] bArr2 = (byte[]) this.b;
            int i12 = this.c;
            int i13 = i12 + 1;
            this.c = i13;
            byte b10 = bArr2[i12];
            int i14 = this.d;
            byte b11 = (byte) (b10 << i14);
            bArr[i11] = b11;
            bArr[i11] = (byte) (((255 & bArr2[i13]) >> (8 - i14)) | b11);
        }
        int i15 = i3 & 7;
        if (i15 == 0) {
            return;
        }
        byte b12 = (byte) (bArr[i10] & (hs.e4 >> i15));
        bArr[i10] = b12;
        int i16 = this.d;
        if (i16 + i15 > 8) {
            byte[] bArr3 = (byte[]) this.b;
            int i17 = this.c;
            this.c = i17 + 1;
            bArr[i10] = (byte) (b12 | ((bArr3[i17] & 255) << i16));
            this.d = i16 - 8;
        }
        int i18 = this.d + i15;
        this.d = i18;
        byte[] bArr4 = (byte[]) this.b;
        int i19 = this.c;
        bArr[i10] = (byte) (((byte) (((255 & bArr4[i19]) >> (8 - i18)) << (8 - i15))) | bArr[i10]);
        if (i18 == 8) {
            this.d = 0;
            this.c = i19 + 1;
        }
        a();
    }

    public long l(int i3) {
        if (i3 <= 32) {
            int j10 = j(i3);
            String str = n0.a;
            return 4294967295L & j10;
        }
        int j11 = j(i3 - 32);
        int j12 = j(32);
        String str2 = n0.a;
        return (4294967295L & j12) | ((j11 & 4294967295L) << 32);
    }

    public void m(b0 b0Var) {
        int u10;
        k kVar = (k) this.b;
        int i3 = this.c & 7;
        if (i3 == 0) {
            do {
                b0Var.add(Boolean.valueOf(kVar.f()));
                if (kVar.c()) {
                    return;
                } else {
                    u10 = kVar.u();
                }
            } while (u10 == this.c);
            this.e = u10;
            return;
        }
        if (i3 != 2) {
            throw e0.b();
        }
        int b10 = kVar.b() + kVar.v();
        do {
            b0Var.add(Boolean.valueOf(kVar.f()));
        } while (kVar.b() < b10);
        F(b10);
    }

    public androidx.datastore.preferences.protobuf.h n() {
        G(2);
        return ((k) this.b).g();
    }

    public void o(int i3, byte[] bArr) {
        zb.p(this.d == 0);
        System.arraycopy((byte[]) this.b, this.c, bArr, 0, i3);
        this.c += i3;
        a();
    }

    public void p(b0 b0Var) {
        int u10;
        k kVar = (k) this.b;
        if ((this.c & 7) != 2) {
            throw e0.b();
        }
        do {
            b0Var.add(n());
            if (kVar.c()) {
                return;
            } else {
                u10 = kVar.u();
            }
        } while (u10 == this.c);
        this.e = u10;
    }

    public void q(b0 b0Var) {
        int u10;
        k kVar = (k) this.b;
        int i3 = this.c & 7;
        if (i3 == 1) {
            do {
                b0Var.add(Double.valueOf(kVar.h()));
                if (kVar.c()) {
                    return;
                } else {
                    u10 = kVar.u();
                }
            } while (u10 == this.c);
            this.e = u10;
            return;
        }
        if (i3 != 2) {
            throw e0.b();
        }
        int v = kVar.v();
        P(v);
        int b10 = kVar.b() + v;
        do {
            b0Var.add(Double.valueOf(kVar.h()));
        } while (kVar.b() < b10);
    }

    public void r(b0 b0Var) {
        int u10;
        k kVar = (k) this.b;
        int i3 = this.c & 7;
        if (i3 == 0) {
            do {
                b0Var.add(Integer.valueOf(kVar.i()));
                if (kVar.c()) {
                    return;
                } else {
                    u10 = kVar.u();
                }
            } while (u10 == this.c);
            this.e = u10;
            return;
        }
        if (i3 != 2) {
            throw e0.b();
        }
        int b10 = kVar.b() + kVar.v();
        do {
            b0Var.add(Integer.valueOf(kVar.i()));
        } while (kVar.b() < b10);
        F(b10);
    }

    public Object s(v1 v1Var, Class cls, p pVar) {
        k kVar = (k) this.b;
        switch (v1Var.ordinal()) {
            case 0:
                G(1);
                return Double.valueOf(kVar.h());
            case 1:
                G(5);
                return Float.valueOf(kVar.l());
            case 2:
                G(0);
                return Long.valueOf(kVar.n());
            case 3:
                G(0);
                return Long.valueOf(kVar.w());
            case 4:
                G(0);
                return Integer.valueOf(kVar.m());
            case 5:
                G(1);
                return Long.valueOf(kVar.k());
            case 6:
                G(5);
                return Integer.valueOf(kVar.j());
            case 7:
                G(0);
                return Boolean.valueOf(kVar.f());
            case 8:
                G(2);
                return kVar.t();
            case 9:
            default:
                throw new IllegalArgumentException("unsupported field type.");
            case 10:
                G(2);
                b1 a10 = y0.c.a(cls);
                z a11 = a10.a();
                h(a11, a10, pVar);
                a10.d(a11);
                return a11;
            case 11:
                return n();
            case 12:
                G(0);
                return Integer.valueOf(kVar.v());
            case 13:
                G(0);
                return Integer.valueOf(kVar.i());
            case 14:
                G(5);
                return Integer.valueOf(kVar.o());
            case 15:
                G(1);
                return Long.valueOf(kVar.p());
            case 16:
                G(0);
                return Integer.valueOf(kVar.q());
            case 17:
                G(0);
                return Long.valueOf(kVar.r());
        }
    }

    public void t(b0 b0Var) {
        int u10;
        k kVar = (k) this.b;
        int i3 = this.c & 7;
        if (i3 == 2) {
            int v = kVar.v();
            O(v);
            int b10 = kVar.b() + v;
            do {
                b0Var.add(Integer.valueOf(kVar.j()));
            } while (kVar.b() < b10);
            return;
        }
        if (i3 != 5) {
            throw e0.b();
        }
        do {
            b0Var.add(Integer.valueOf(kVar.j()));
            if (kVar.c()) {
                return;
            } else {
                u10 = kVar.u();
            }
        } while (u10 == this.c);
        this.e = u10;
    }

    public void u(b0 b0Var) {
        int u10;
        k kVar = (k) this.b;
        int i3 = this.c & 7;
        if (i3 == 1) {
            do {
                b0Var.add(Long.valueOf(kVar.k()));
                if (kVar.c()) {
                    return;
                } else {
                    u10 = kVar.u();
                }
            } while (u10 == this.c);
            this.e = u10;
            return;
        }
        if (i3 != 2) {
            throw e0.b();
        }
        int v = kVar.v();
        P(v);
        int b10 = kVar.b() + v;
        do {
            b0Var.add(Long.valueOf(kVar.k()));
        } while (kVar.b() < b10);
    }

    public void v(b0 b0Var) {
        int u10;
        k kVar = (k) this.b;
        int i3 = this.c & 7;
        if (i3 == 2) {
            int v = kVar.v();
            O(v);
            int b10 = kVar.b() + v;
            do {
                b0Var.add(Float.valueOf(kVar.l()));
            } while (kVar.b() < b10);
            return;
        }
        if (i3 != 5) {
            throw e0.b();
        }
        do {
            b0Var.add(Float.valueOf(kVar.l()));
            if (kVar.c()) {
                return;
            } else {
                u10 = kVar.u();
            }
        } while (u10 == this.c);
        this.e = u10;
    }

    public void w(b0 b0Var) {
        int u10;
        k kVar = (k) this.b;
        int i3 = this.c & 7;
        if (i3 == 0) {
            do {
                b0Var.add(Integer.valueOf(kVar.m()));
                if (kVar.c()) {
                    return;
                } else {
                    u10 = kVar.u();
                }
            } while (u10 == this.c);
            this.e = u10;
            return;
        }
        if (i3 != 2) {
            throw e0.b();
        }
        int b10 = kVar.b() + kVar.v();
        do {
            b0Var.add(Integer.valueOf(kVar.m()));
        } while (kVar.b() < b10);
        F(b10);
    }

    public void x(b0 b0Var) {
        int u10;
        k kVar = (k) this.b;
        int i3 = this.c & 7;
        if (i3 == 0) {
            do {
                b0Var.add(Long.valueOf(kVar.n()));
                if (kVar.c()) {
                    return;
                } else {
                    u10 = kVar.u();
                }
            } while (u10 == this.c);
            this.e = u10;
            return;
        }
        if (i3 != 2) {
            throw e0.b();
        }
        int b10 = kVar.b() + kVar.v();
        do {
            b0Var.add(Long.valueOf(kVar.n()));
        } while (kVar.b() < b10);
        F(b10);
    }

    public void y(b0 b0Var) {
        int u10;
        k kVar = (k) this.b;
        int i3 = this.c & 7;
        if (i3 == 2) {
            int v = kVar.v();
            O(v);
            int b10 = kVar.b() + v;
            do {
                b0Var.add(Integer.valueOf(kVar.o()));
            } while (kVar.b() < b10);
            return;
        }
        if (i3 != 5) {
            throw e0.b();
        }
        do {
            b0Var.add(Integer.valueOf(kVar.o()));
            if (kVar.c()) {
                return;
            } else {
                u10 = kVar.u();
            }
        } while (u10 == this.c);
        this.e = u10;
    }

    public void z(b0 b0Var) {
        int u10;
        k kVar = (k) this.b;
        int i3 = this.c & 7;
        if (i3 == 1) {
            do {
                b0Var.add(Long.valueOf(kVar.p()));
                if (kVar.c()) {
                    return;
                } else {
                    u10 = kVar.u();
                }
            } while (u10 == this.c);
            this.e = u10;
            return;
        }
        if (i3 != 2) {
            throw e0.b();
        }
        int v = kVar.v();
        P(v);
        int b10 = kVar.b() + v;
        do {
            b0Var.add(Long.valueOf(kVar.p()));
        } while (kVar.b() < b10);
    }

    public f(k kVar) {
        this.a = 3;
        this.e = 0;
        Charset charset = c0.a;
        this.b = kVar;
        kVar.b = this;
    }

    public f(byte[] bArr) {
        this.a = 1;
        this.b = bArr;
        this.c = bArr.length;
    }

    public f(byte[] bArr, int i3) {
        this.a = 2;
        this.b = bArr;
        this.e = i3;
    }

    public f(int i3, int i10) {
        this.a = 0;
        this.c = i3;
        this.d = i10;
        this.b = new byte[(i10 * 2) - 1];
        this.e = 0;
    }
}
