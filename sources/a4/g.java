package a4;

import androidx.datastore.preferences.protobuf.b0;
import androidx.datastore.preferences.protobuf.b1;
import androidx.datastore.preferences.protobuf.e0;
import androidx.datastore.preferences.protobuf.i0;
import androidx.datastore.preferences.protobuf.m;
import androidx.datastore.preferences.protobuf.s;
import androidx.datastore.preferences.protobuf.u1;
import androidx.datastore.preferences.protobuf.x;
import androidx.datastore.preferences.protobuf.y0;
import androidx.datastore.preferences.protobuf.z;
import androidx.datastore.preferences.protobuf.z1;
import e2.l0;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;
import org.telegram.messenger.zs;
import org.telegram.tgnet.ConnectionsManager;
import v7.t6;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final class g {
    public final /* synthetic */ int a;
    public Object b;
    public int c;
    public int d;
    public int e;

    public g() {
        this.a = 2;
        this.b = l0.b;
    }

    public static void i0(int i10) {
        if ((i10 & 3) != 0) {
            throw b0.e();
        }
    }

    public static void j0(int i10) {
        if ((i10 & 7) != 0) {
            throw b0.e();
        }
    }

    public void A(List list) {
        int z10;
        androidx.datastore.preferences.protobuf.h hVar = (androidx.datastore.preferences.protobuf.h) this.b;
        if (list instanceof s) {
            throw new ClassCastException();
        }
        int i10 = this.c & 7;
        if (i10 == 2) {
            int A = hVar.A();
            i0(A);
            int b10 = hVar.b() + A;
            do {
                list.add(Float.valueOf(hVar.k()));
            } while (hVar.b() < b10);
            return;
        }
        if (i10 != 5) {
            throw b0.b();
        }
        do {
            list.add(Float.valueOf(hVar.k()));
            if (hVar.c()) {
                return;
            } else {
                z10 = hVar.z();
            }
        } while (z10 == this.c);
        this.e = z10;
    }

    public Object B(b1 b1Var, m mVar) {
        int i10 = this.d;
        this.d = ((this.c >>> 3) << 3) | 4;
        try {
            Object a2 = b1Var.a();
            b1Var.d(a2, this, mVar);
            b1Var.c(a2);
            if (this.c == this.d) {
                return a2;
            }
            throw b0.e();
        } finally {
            this.d = i10;
        }
    }

    public Object C(b1 b1Var, m mVar) {
        a0(3);
        return B(b1Var, mVar);
    }

    public void D(List list, b1 b1Var, m mVar) {
        int z10;
        androidx.datastore.preferences.protobuf.h hVar = (androidx.datastore.preferences.protobuf.h) this.b;
        int i10 = this.c;
        if ((i10 & 7) != 3) {
            throw b0.b();
        }
        do {
            list.add(B(b1Var, mVar));
            if (hVar.c() || this.e != 0) {
                return;
            } else {
                z10 = hVar.z();
            }
        } while (z10 == i10);
        this.e = z10;
    }

    public int E() {
        a0(0);
        return ((androidx.datastore.preferences.protobuf.h) this.b).l();
    }

    public void F(List list) {
        int z10;
        androidx.datastore.preferences.protobuf.h hVar = (androidx.datastore.preferences.protobuf.h) this.b;
        if (list instanceof x) {
            throw new ClassCastException();
        }
        int i10 = this.c & 7;
        if (i10 == 0) {
            do {
                list.add(Integer.valueOf(hVar.l()));
                if (hVar.c()) {
                    return;
                } else {
                    z10 = hVar.z();
                }
            } while (z10 == this.c);
            this.e = z10;
            return;
        }
        if (i10 != 2) {
            throw b0.b();
        }
        int b10 = hVar.b() + hVar.A();
        do {
            list.add(Integer.valueOf(hVar.l()));
        } while (hVar.b() < b10);
        Z(b10);
    }

    public long G() {
        a0(0);
        return ((androidx.datastore.preferences.protobuf.h) this.b).m();
    }

    public void H(List list) {
        int z10;
        androidx.datastore.preferences.protobuf.h hVar = (androidx.datastore.preferences.protobuf.h) this.b;
        if (list instanceof i0) {
            throw new ClassCastException();
        }
        int i10 = this.c & 7;
        if (i10 == 0) {
            do {
                list.add(Long.valueOf(hVar.m()));
                if (hVar.c()) {
                    return;
                } else {
                    z10 = hVar.z();
                }
            } while (z10 == this.c);
            this.e = z10;
            return;
        }
        if (i10 != 2) {
            throw b0.b();
        }
        int b10 = hVar.b() + hVar.A();
        do {
            list.add(Long.valueOf(hVar.m()));
        } while (hVar.b() < b10);
        Z(b10);
    }

    public Object I(b1 b1Var, m mVar) {
        androidx.datastore.preferences.protobuf.h hVar = (androidx.datastore.preferences.protobuf.h) this.b;
        int A = hVar.A();
        if (hVar.a >= 100) {
            throw new b0("Protocol message had too many levels of nesting.  May be malicious.  Use CodedInputStream.setRecursionLimit() to increase the depth limit.");
        }
        int e = hVar.e(A);
        Object a2 = b1Var.a();
        hVar.a++;
        b1Var.d(a2, this, mVar);
        b1Var.c(a2);
        hVar.a(0);
        hVar.a--;
        hVar.d(e);
        return a2;
    }

    public Object J(b1 b1Var, m mVar) {
        a0(2);
        return I(b1Var, mVar);
    }

    public int K() {
        a0(5);
        return ((androidx.datastore.preferences.protobuf.h) this.b).v();
    }

    public void L(List list) {
        int z10;
        androidx.datastore.preferences.protobuf.h hVar = (androidx.datastore.preferences.protobuf.h) this.b;
        if (list instanceof x) {
            throw new ClassCastException();
        }
        int i10 = this.c & 7;
        if (i10 == 2) {
            int A = hVar.A();
            i0(A);
            int b10 = hVar.b() + A;
            do {
                list.add(Integer.valueOf(hVar.v()));
            } while (hVar.b() < b10);
            return;
        }
        if (i10 != 5) {
            throw b0.b();
        }
        do {
            list.add(Integer.valueOf(hVar.v()));
            if (hVar.c()) {
                return;
            } else {
                z10 = hVar.z();
            }
        } while (z10 == this.c);
        this.e = z10;
    }

    public long M() {
        a0(1);
        return ((androidx.datastore.preferences.protobuf.h) this.b).w();
    }

    public void N(List list) {
        int z10;
        androidx.datastore.preferences.protobuf.h hVar = (androidx.datastore.preferences.protobuf.h) this.b;
        if (list instanceof i0) {
            throw new ClassCastException();
        }
        int i10 = this.c & 7;
        if (i10 == 1) {
            do {
                list.add(Long.valueOf(hVar.w()));
                if (hVar.c()) {
                    return;
                } else {
                    z10 = hVar.z();
                }
            } while (z10 == this.c);
            this.e = z10;
            return;
        }
        if (i10 != 2) {
            throw b0.b();
        }
        int A = hVar.A();
        j0(A);
        int b10 = hVar.b() + A;
        do {
            list.add(Long.valueOf(hVar.w()));
        } while (hVar.b() < b10);
    }

    public int O() {
        a0(0);
        return ((androidx.datastore.preferences.protobuf.h) this.b).x();
    }

    public void P(List list) {
        int z10;
        androidx.datastore.preferences.protobuf.h hVar = (androidx.datastore.preferences.protobuf.h) this.b;
        if (list instanceof x) {
            throw new ClassCastException();
        }
        int i10 = this.c & 7;
        if (i10 == 0) {
            do {
                list.add(Integer.valueOf(hVar.x()));
                if (hVar.c()) {
                    return;
                } else {
                    z10 = hVar.z();
                }
            } while (z10 == this.c);
            this.e = z10;
            return;
        }
        if (i10 != 2) {
            throw b0.b();
        }
        int b10 = hVar.b() + hVar.A();
        do {
            list.add(Integer.valueOf(hVar.x()));
        } while (hVar.b() < b10);
        Z(b10);
    }

    public long Q() {
        a0(0);
        return ((androidx.datastore.preferences.protobuf.h) this.b).y();
    }

    public void R(List list) {
        int z10;
        androidx.datastore.preferences.protobuf.h hVar = (androidx.datastore.preferences.protobuf.h) this.b;
        if (list instanceof i0) {
            throw new ClassCastException();
        }
        int i10 = this.c & 7;
        if (i10 == 0) {
            do {
                list.add(Long.valueOf(hVar.y()));
                if (hVar.c()) {
                    return;
                } else {
                    z10 = hVar.z();
                }
            } while (z10 == this.c);
            this.e = z10;
            return;
        }
        if (i10 != 2) {
            throw b0.b();
        }
        int b10 = hVar.b() + hVar.A();
        do {
            list.add(Long.valueOf(hVar.y()));
        } while (hVar.b() < b10);
        Z(b10);
    }

    public String S() {
        a0(2);
        androidx.datastore.preferences.protobuf.h hVar = (androidx.datastore.preferences.protobuf.h) this.b;
        byte[] bArr = hVar.d;
        int s10 = hVar.s();
        if (s10 > 0) {
            int i10 = hVar.e;
            int i11 = hVar.g;
            if (s10 <= i10 - i11) {
                String str = new String(bArr, i11, s10, z.a);
                hVar.g += s10;
                return str;
            }
        }
        if (s10 == 0) {
            return "";
        }
        if (s10 > hVar.e) {
            return new String(hVar.n(s10), z.a);
        }
        hVar.D(s10);
        String str2 = new String(bArr, hVar.g, s10, z.a);
        hVar.g += s10;
        return str2;
    }

    public void T(List list, boolean z10) {
        int z11;
        int z12;
        androidx.datastore.preferences.protobuf.h hVar = (androidx.datastore.preferences.protobuf.h) this.b;
        if ((this.c & 7) != 2) {
            throw b0.b();
        }
        if (!(list instanceof e0) || z10) {
            do {
                list.add(z10 ? U() : S());
                if (hVar.c()) {
                    return;
                } else {
                    z11 = hVar.z();
                }
            } while (z11 == this.c);
            this.e = z11;
            return;
        }
        e0 e0Var = (e0) list;
        do {
            e0Var.e(n());
            if (hVar.c()) {
                return;
            } else {
                z12 = hVar.z();
            }
        } while (z12 == this.c);
        this.e = z12;
    }

    public String U() {
        a0(2);
        androidx.datastore.preferences.protobuf.h hVar = (androidx.datastore.preferences.protobuf.h) this.b;
        byte[] bArr = hVar.d;
        int s10 = hVar.s();
        int i10 = hVar.g;
        int i11 = hVar.e;
        if (s10 <= i11 - i10 && s10 > 0) {
            hVar.g = i10 + s10;
        } else {
            if (s10 == 0) {
                return "";
            }
            i10 = 0;
            if (s10 <= i11) {
                hVar.D(s10);
                hVar.g = s10;
            } else {
                bArr = hVar.n(s10);
            }
        }
        return u1.a.e(i10, s10, bArr);
    }

    public int V() {
        a0(0);
        return ((androidx.datastore.preferences.protobuf.h) this.b).A();
    }

    public void W(List list) {
        int z10;
        androidx.datastore.preferences.protobuf.h hVar = (androidx.datastore.preferences.protobuf.h) this.b;
        if (list instanceof x) {
            throw new ClassCastException();
        }
        int i10 = this.c & 7;
        if (i10 == 0) {
            do {
                list.add(Integer.valueOf(hVar.A()));
                if (hVar.c()) {
                    return;
                } else {
                    z10 = hVar.z();
                }
            } while (z10 == this.c);
            this.e = z10;
            return;
        }
        if (i10 != 2) {
            throw b0.b();
        }
        int b10 = hVar.b() + hVar.A();
        do {
            list.add(Integer.valueOf(hVar.A()));
        } while (hVar.b() < b10);
        Z(b10);
    }

    public long X() {
        a0(0);
        return ((androidx.datastore.preferences.protobuf.h) this.b).B();
    }

    public void Y(List list) {
        int z10;
        androidx.datastore.preferences.protobuf.h hVar = (androidx.datastore.preferences.protobuf.h) this.b;
        if (list instanceof i0) {
            throw new ClassCastException();
        }
        int i10 = this.c & 7;
        if (i10 == 0) {
            do {
                list.add(Long.valueOf(hVar.B()));
                if (hVar.c()) {
                    return;
                } else {
                    z10 = hVar.z();
                }
            } while (z10 == this.c);
            this.e = z10;
            return;
        }
        if (i10 != 2) {
            throw b0.b();
        }
        int b10 = hVar.b() + hVar.A();
        do {
            list.add(Long.valueOf(hVar.B()));
        } while (hVar.b() < b10);
        Z(b10);
    }

    public void Z(int i10) {
        if (((androidx.datastore.preferences.protobuf.h) this.b).b() != i10) {
            throw b0.f();
        }
    }

    public void a() {
        int i10;
        int i11 = this.c;
        t6.p(i11 >= 0 && (i11 < (i10 = this.e) || (i11 == i10 && this.d == 0)));
    }

    public void a0(int i10) {
        if ((this.c & 7) != i10) {
            throw b0.b();
        }
    }

    public int b() {
        return ((this.e - this.c) * 8) - this.d;
    }

    public void b0(int i10, byte[] bArr) {
        this.b = bArr;
        this.c = 0;
        this.d = 0;
        this.e = i10;
    }

    public void c() {
        if (this.d == 0) {
            return;
        }
        this.d = 0;
        this.c++;
        a();
    }

    public void c0(e2.x xVar) {
        b0(xVar.c, xVar.a);
        d0(xVar.b * 8);
    }

    public int d() {
        t6.p(this.d == 0);
        return this.c;
    }

    public void d0(int i10) {
        int i11 = i10 / 8;
        this.c = i11;
        this.d = i10 - (i11 * 8);
        a();
    }

    public int e() {
        int i10 = this.e;
        if (i10 != 0) {
            this.c = i10;
            this.e = 0;
        } else {
            this.c = ((androidx.datastore.preferences.protobuf.h) this.b).z();
        }
        int i11 = this.c;
        return (i11 == 0 || i11 == this.d) ? ConnectionsManager.DEFAULT_DATACENTER_ID : i11 >>> 3;
    }

    public void e0() {
        int i10 = this.d + 1;
        this.d = i10;
        if (i10 == 8) {
            this.d = 0;
            this.c++;
        }
        a();
    }

    public int f() {
        return (this.c * 8) + this.d;
    }

    public void f0(int i10) {
        int i11;
        switch (this.a) {
            case 1:
                int i12 = i10 / 8;
                int i13 = this.d + i12;
                this.d = i13;
                int i14 = (i10 - (i12 * 8)) + this.e;
                this.e = i14;
                boolean z10 = true;
                if (i14 > 7) {
                    this.d = i13 + 1;
                    this.e = i14 - 8;
                }
                int i15 = this.d;
                if (i15 < 0 || (i15 >= (i11 = this.c) && (i15 != i11 || this.e != 0))) {
                    z10 = false;
                }
                t6.p(z10);
                break;
            default:
                int i16 = i10 / 8;
                int i17 = this.c + i16;
                this.c = i17;
                int i18 = (i10 - (i16 * 8)) + this.d;
                this.d = i18;
                if (i18 > 7) {
                    this.c = i17 + 1;
                    this.d = i18 - 8;
                }
                a();
                break;
        }
    }

    public int g() {
        return this.c;
    }

    public void g0(int i10) {
        t6.p(this.d == 0);
        this.c += i10;
        a();
    }

    public boolean h() {
        switch (this.a) {
            case 1:
                boolean z10 = (((((byte[]) this.b)[this.d] & 255) >> this.e) & 1) == 1;
                f0(1);
                return z10;
            default:
                boolean z11 = (((byte[]) this.b)[this.c] & (128 >> this.d)) != 0;
                e0();
                return z11;
        }
    }

    public boolean h0() {
        int i10;
        androidx.datastore.preferences.protobuf.h hVar = (androidx.datastore.preferences.protobuf.h) this.b;
        if (hVar.c() || (i10 = this.c) == this.d) {
            return false;
        }
        return hVar.E(i10);
    }

    public int i(int i10) {
        switch (this.a) {
            case 1:
                int i11 = this.d;
                int min = Math.min(i10, 8 - this.e);
                byte[] bArr = (byte[]) this.b;
                int i12 = i11 + 1;
                int i13 = ((bArr[i11] & 255) >> this.e) & (zs.e4 >> (8 - min));
                while (min < i10) {
                    i13 |= (bArr[i12] & 255) << min;
                    min += 8;
                    i12++;
                }
                int i14 = i13 & ((-1) >>> (32 - i10));
                f0(i10);
                return i14;
            default:
                if (i10 == 0) {
                    return 0;
                }
                this.d += i10;
                int i15 = 0;
                while (true) {
                    int i16 = this.d;
                    if (i16 <= 8) {
                        byte[] bArr2 = (byte[]) this.b;
                        int i17 = this.c;
                        int i18 = ((-1) >>> (32 - i10)) & (i15 | ((bArr2[i17] & 255) >> (8 - i16)));
                        if (i16 == 8) {
                            this.d = 0;
                            this.c = i17 + 1;
                        }
                        a();
                        return i18;
                    }
                    int i19 = i16 - 8;
                    this.d = i19;
                    byte[] bArr3 = (byte[]) this.b;
                    int i20 = this.c;
                    this.c = i20 + 1;
                    i15 |= (bArr3[i20] & 255) << i19;
                }
        }
    }

    public void j(int i10, byte[] bArr) {
        int i11 = i10 >> 3;
        for (int i12 = 0; i12 < i11; i12++) {
            byte[] bArr2 = (byte[]) this.b;
            int i13 = this.c;
            int i14 = i13 + 1;
            this.c = i14;
            byte b10 = bArr2[i13];
            int i15 = this.d;
            byte b11 = (byte) (b10 << i15);
            bArr[i12] = b11;
            bArr[i12] = (byte) (((255 & bArr2[i14]) >> (8 - i15)) | b11);
        }
        int i16 = i10 & 7;
        if (i16 == 0) {
            return;
        }
        byte b12 = (byte) (bArr[i11] & (zs.e4 >> i16));
        bArr[i11] = b12;
        int i17 = this.d;
        if (i17 + i16 > 8) {
            byte[] bArr3 = (byte[]) this.b;
            int i18 = this.c;
            this.c = i18 + 1;
            bArr[i11] = (byte) (b12 | ((bArr3[i18] & 255) << i17));
            this.d = i17 - 8;
        }
        int i19 = this.d + i16;
        this.d = i19;
        byte[] bArr4 = (byte[]) this.b;
        int i20 = this.c;
        bArr[i11] = (byte) (((byte) (((255 & bArr4[i20]) >> (8 - i19)) << (8 - i16))) | bArr[i11]);
        if (i19 == 8) {
            this.d = 0;
            this.c = i20 + 1;
        }
        a();
    }

    public long k(int i10) {
        if (i10 <= 32) {
            int i11 = i(i10);
            String str = l0.a;
            return 4294967295L & i11;
        }
        int i12 = i(i10 - 32);
        int i13 = i(32);
        String str2 = l0.a;
        return (4294967295L & i13) | ((i12 & 4294967295L) << 32);
    }

    public boolean l() {
        a0(0);
        return ((androidx.datastore.preferences.protobuf.h) this.b).f();
    }

    public void m(List list) {
        int z10;
        androidx.datastore.preferences.protobuf.h hVar = (androidx.datastore.preferences.protobuf.h) this.b;
        if (list instanceof androidx.datastore.preferences.protobuf.d) {
            throw new ClassCastException();
        }
        int i10 = this.c & 7;
        if (i10 == 0) {
            do {
                list.add(Boolean.valueOf(hVar.f()));
                if (hVar.c()) {
                    return;
                } else {
                    z10 = hVar.z();
                }
            } while (z10 == this.c);
            this.e = z10;
            return;
        }
        if (i10 != 2) {
            throw b0.b();
        }
        int b10 = hVar.b() + hVar.A();
        do {
            list.add(Boolean.valueOf(hVar.f()));
        } while (hVar.b() < b10);
        Z(b10);
    }

    public androidx.datastore.preferences.protobuf.g n() {
        a0(2);
        androidx.datastore.preferences.protobuf.h hVar = (androidx.datastore.preferences.protobuf.h) this.b;
        byte[] bArr = hVar.d;
        int s10 = hVar.s();
        int i10 = hVar.e;
        int i11 = hVar.g;
        if (s10 <= i10 - i11 && s10 > 0) {
            androidx.datastore.preferences.protobuf.g l4 = androidx.datastore.preferences.protobuf.g.l(i11, s10, bArr);
            hVar.g += s10;
            return l4;
        }
        if (s10 == 0) {
            return androidx.datastore.preferences.protobuf.g.c;
        }
        byte[] o10 = hVar.o(s10);
        if (o10 != null) {
            return androidx.datastore.preferences.protobuf.g.l(0, o10.length, o10);
        }
        int i12 = hVar.g;
        int i13 = hVar.e;
        int i14 = i13 - i12;
        hVar.i += i13;
        hVar.g = 0;
        hVar.e = 0;
        ArrayList p5 = hVar.p(s10 - i14);
        byte[] bArr2 = new byte[s10];
        System.arraycopy(bArr, i12, bArr2, 0, i14);
        int size = p5.size();
        int i15 = 0;
        while (i15 < size) {
            Object obj = p5.get(i15);
            i15++;
            byte[] bArr3 = (byte[]) obj;
            System.arraycopy(bArr3, 0, bArr2, i14, bArr3.length);
            i14 += bArr3.length;
        }
        androidx.datastore.preferences.protobuf.g gVar = androidx.datastore.preferences.protobuf.g.c;
        return new androidx.datastore.preferences.protobuf.g(bArr2);
    }

    public void o(int i10, byte[] bArr) {
        t6.p(this.d == 0);
        System.arraycopy((byte[]) this.b, this.c, bArr, 0, i10);
        this.c += i10;
        a();
    }

    public void p(List list) {
        int z10;
        androidx.datastore.preferences.protobuf.h hVar = (androidx.datastore.preferences.protobuf.h) this.b;
        if ((this.c & 7) != 2) {
            throw b0.b();
        }
        do {
            list.add(n());
            if (hVar.c()) {
                return;
            } else {
                z10 = hVar.z();
            }
        } while (z10 == this.c);
        this.e = z10;
    }

    public double q() {
        a0(1);
        return ((androidx.datastore.preferences.protobuf.h) this.b).g();
    }

    public void r(List list) {
        int z10;
        androidx.datastore.preferences.protobuf.h hVar = (androidx.datastore.preferences.protobuf.h) this.b;
        if (list instanceof androidx.datastore.preferences.protobuf.k) {
            throw new ClassCastException();
        }
        int i10 = this.c & 7;
        if (i10 == 1) {
            do {
                list.add(Double.valueOf(hVar.g()));
                if (hVar.c()) {
                    return;
                } else {
                    z10 = hVar.z();
                }
            } while (z10 == this.c);
            this.e = z10;
            return;
        }
        if (i10 != 2) {
            throw b0.b();
        }
        int A = hVar.A();
        j0(A);
        int b10 = hVar.b() + A;
        do {
            list.add(Double.valueOf(hVar.g()));
        } while (hVar.b() < b10);
    }

    public int s() {
        a0(0);
        return ((androidx.datastore.preferences.protobuf.h) this.b).h();
    }

    public void t(List list) {
        int z10;
        androidx.datastore.preferences.protobuf.h hVar = (androidx.datastore.preferences.protobuf.h) this.b;
        if (list instanceof x) {
            throw new ClassCastException();
        }
        int i10 = this.c & 7;
        if (i10 == 0) {
            do {
                list.add(Integer.valueOf(hVar.h()));
                if (hVar.c()) {
                    return;
                } else {
                    z10 = hVar.z();
                }
            } while (z10 == this.c);
            this.e = z10;
            return;
        }
        if (i10 != 2) {
            throw b0.b();
        }
        int b10 = hVar.b() + hVar.A();
        do {
            list.add(Integer.valueOf(hVar.h()));
        } while (hVar.b() < b10);
        Z(b10);
    }

    public Object u(z1 z1Var, Class cls, m mVar) {
        switch (z1Var.ordinal()) {
            case 0:
                return Double.valueOf(q());
            case 1:
                return Float.valueOf(z());
            case 2:
                return Long.valueOf(G());
            case 3:
                return Long.valueOf(X());
            case 4:
                return Integer.valueOf(E());
            case 5:
                return Long.valueOf(x());
            case 6:
                return Integer.valueOf(v());
            case 7:
                return Boolean.valueOf(l());
            case 8:
                return U();
            case 9:
            default:
                throw new RuntimeException("unsupported field type.");
            case 10:
                a0(2);
                return I(y0.c.a(cls), mVar);
            case 11:
                return n();
            case 12:
                return Integer.valueOf(V());
            case 13:
                return Integer.valueOf(s());
            case 14:
                return Integer.valueOf(K());
            case 15:
                return Long.valueOf(M());
            case 16:
                return Integer.valueOf(O());
            case 17:
                return Long.valueOf(Q());
        }
    }

    public int v() {
        a0(5);
        return ((androidx.datastore.preferences.protobuf.h) this.b).i();
    }

    public void w(List list) {
        int z10;
        androidx.datastore.preferences.protobuf.h hVar = (androidx.datastore.preferences.protobuf.h) this.b;
        if (list instanceof x) {
            throw new ClassCastException();
        }
        int i10 = this.c & 7;
        if (i10 == 2) {
            int A = hVar.A();
            i0(A);
            int b10 = hVar.b() + A;
            do {
                list.add(Integer.valueOf(hVar.i()));
            } while (hVar.b() < b10);
            return;
        }
        if (i10 != 5) {
            throw b0.b();
        }
        do {
            list.add(Integer.valueOf(hVar.i()));
            if (hVar.c()) {
                return;
            } else {
                z10 = hVar.z();
            }
        } while (z10 == this.c);
        this.e = z10;
    }

    public long x() {
        a0(1);
        return ((androidx.datastore.preferences.protobuf.h) this.b).j();
    }

    public void y(List list) {
        int z10;
        androidx.datastore.preferences.protobuf.h hVar = (androidx.datastore.preferences.protobuf.h) this.b;
        if (list instanceof i0) {
            throw new ClassCastException();
        }
        int i10 = this.c & 7;
        if (i10 == 1) {
            do {
                list.add(Long.valueOf(hVar.j()));
                if (hVar.c()) {
                    return;
                } else {
                    z10 = hVar.z();
                }
            } while (z10 == this.c);
            this.e = z10;
            return;
        }
        if (i10 != 2) {
            throw b0.b();
        }
        int A = hVar.A();
        j0(A);
        int b10 = hVar.b() + A;
        do {
            list.add(Long.valueOf(hVar.j()));
        } while (hVar.b() < b10);
    }

    public float z() {
        a0(5);
        return ((androidx.datastore.preferences.protobuf.h) this.b).k();
    }

    public g(byte[] bArr) {
        this.a = 1;
        this.b = bArr;
        this.c = bArr.length;
    }

    public g(byte[] bArr, int i10) {
        this.a = 2;
        this.b = bArr;
        this.e = i10;
    }

    public g(androidx.datastore.preferences.protobuf.h hVar) {
        this.a = 3;
        this.e = 0;
        Charset charset = z.a;
        this.b = hVar;
        hVar.b = this;
    }

    public g(int i10, int i11) {
        this.a = 0;
        this.c = i10;
        this.d = i11;
        this.b = new byte[(i11 * 2) - 1];
        this.e = 0;
    }
}
