package androidx.datastore.preferences.protobuf;

import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.telegram.tgnet.ConnectionsManager;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public final class i {
    public int a;
    public int b;
    public int c;
    public Object d;

    public static void U(int i10) {
        if ((i10 & 3) != 0) {
            throw b0.e();
        }
    }

    public static void V(int i10) {
        if ((i10 & 7) != 0) {
            throw b0.e();
        }
    }

    public Object A(b1 b1Var, n nVar) {
        h hVar = (h) this.d;
        int A = hVar.A();
        if (hVar.a >= 100) {
            throw new b0("Protocol message had too many levels of nesting.  May be malicious.  Use CodedInputStream.setRecursionLimit() to increase the depth limit.");
        }
        int e9 = hVar.e(A);
        Object a2 = b1Var.a();
        hVar.a++;
        b1Var.i(a2, this, nVar);
        b1Var.c(a2);
        hVar.a(0);
        hVar.a--;
        hVar.d(e9);
        return a2;
    }

    public Object B(b1 b1Var, n nVar) {
        S(2);
        return A(b1Var, nVar);
    }

    public int C() {
        S(5);
        return ((h) this.d).v();
    }

    public void D(List list) {
        int z10;
        h hVar = (h) this.d;
        if (list instanceof x) {
            throw new ClassCastException();
        }
        int i10 = this.a & 7;
        if (i10 == 2) {
            int A = hVar.A();
            U(A);
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
        } while (z10 == this.a);
        this.c = z10;
    }

    public long E() {
        S(1);
        return ((h) this.d).w();
    }

    public void F(List list) {
        int z10;
        h hVar = (h) this.d;
        if (list instanceof i0) {
            throw new ClassCastException();
        }
        int i10 = this.a & 7;
        if (i10 == 1) {
            do {
                list.add(Long.valueOf(hVar.w()));
                if (hVar.c()) {
                    return;
                } else {
                    z10 = hVar.z();
                }
            } while (z10 == this.a);
            this.c = z10;
            return;
        }
        if (i10 != 2) {
            throw b0.b();
        }
        int A = hVar.A();
        V(A);
        int b10 = hVar.b() + A;
        do {
            list.add(Long.valueOf(hVar.w()));
        } while (hVar.b() < b10);
    }

    public int G() {
        S(0);
        return ((h) this.d).x();
    }

    public void H(List list) {
        int z10;
        h hVar = (h) this.d;
        if (list instanceof x) {
            throw new ClassCastException();
        }
        int i10 = this.a & 7;
        if (i10 == 0) {
            do {
                list.add(Integer.valueOf(hVar.x()));
                if (hVar.c()) {
                    return;
                } else {
                    z10 = hVar.z();
                }
            } while (z10 == this.a);
            this.c = z10;
            return;
        }
        if (i10 != 2) {
            throw b0.b();
        }
        int b10 = hVar.b() + hVar.A();
        do {
            list.add(Integer.valueOf(hVar.x()));
        } while (hVar.b() < b10);
        R(b10);
    }

    public long I() {
        S(0);
        return ((h) this.d).y();
    }

    public void J(List list) {
        int z10;
        h hVar = (h) this.d;
        if (list instanceof i0) {
            throw new ClassCastException();
        }
        int i10 = this.a & 7;
        if (i10 == 0) {
            do {
                list.add(Long.valueOf(hVar.y()));
                if (hVar.c()) {
                    return;
                } else {
                    z10 = hVar.z();
                }
            } while (z10 == this.a);
            this.c = z10;
            return;
        }
        if (i10 != 2) {
            throw b0.b();
        }
        int b10 = hVar.b() + hVar.A();
        do {
            list.add(Long.valueOf(hVar.y()));
        } while (hVar.b() < b10);
        R(b10);
    }

    public String K() {
        S(2);
        h hVar = (h) this.d;
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

    public void L(List list, boolean z10) {
        int z11;
        int z12;
        h hVar = (h) this.d;
        if ((this.a & 7) != 2) {
            throw b0.b();
        }
        if (!(list instanceof e0) || z10) {
            do {
                list.add(z10 ? M() : K());
                if (hVar.c()) {
                    return;
                } else {
                    z11 = hVar.z();
                }
            } while (z11 == this.a);
            this.c = z11;
            return;
        }
        e0 e0Var = (e0) list;
        do {
            e0Var.g(g());
            if (hVar.c()) {
                return;
            } else {
                z12 = hVar.z();
            }
        } while (z12 == this.a);
        this.c = z12;
    }

    public String M() {
        S(2);
        h hVar = (h) this.d;
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

    public int N() {
        S(0);
        return ((h) this.d).A();
    }

    public void O(List list) {
        int z10;
        h hVar = (h) this.d;
        if (list instanceof x) {
            throw new ClassCastException();
        }
        int i10 = this.a & 7;
        if (i10 == 0) {
            do {
                list.add(Integer.valueOf(hVar.A()));
                if (hVar.c()) {
                    return;
                } else {
                    z10 = hVar.z();
                }
            } while (z10 == this.a);
            this.c = z10;
            return;
        }
        if (i10 != 2) {
            throw b0.b();
        }
        int b10 = hVar.b() + hVar.A();
        do {
            list.add(Integer.valueOf(hVar.A()));
        } while (hVar.b() < b10);
        R(b10);
    }

    public long P() {
        S(0);
        return ((h) this.d).B();
    }

    public void Q(List list) {
        int z10;
        h hVar = (h) this.d;
        if (list instanceof i0) {
            throw new ClassCastException();
        }
        int i10 = this.a & 7;
        if (i10 == 0) {
            do {
                list.add(Long.valueOf(hVar.B()));
                if (hVar.c()) {
                    return;
                } else {
                    z10 = hVar.z();
                }
            } while (z10 == this.a);
            this.c = z10;
            return;
        }
        if (i10 != 2) {
            throw b0.b();
        }
        int b10 = hVar.b() + hVar.A();
        do {
            list.add(Long.valueOf(hVar.B()));
        } while (hVar.b() < b10);
        R(b10);
    }

    public void R(int i10) {
        if (((h) this.d).b() != i10) {
            throw b0.f();
        }
    }

    public void S(int i10) {
        if ((this.a & 7) != i10) {
            throw b0.b();
        }
    }

    public boolean T() {
        int i10;
        h hVar = (h) this.d;
        if (hVar.c() || (i10 = this.a) == this.b) {
            return false;
        }
        return hVar.E(i10);
    }

    public void a(int i10, int i11) {
        if (i10 < 0) {
            throw new IllegalArgumentException("Layout positions must be non-negative");
        }
        if (i11 < 0) {
            throw new IllegalArgumentException("Pixel distance must be non-negative");
        }
        int i12 = this.c;
        int i13 = i12 * 2;
        int[] iArr = (int[]) this.d;
        if (iArr == null) {
            int[] iArr2 = new int[4];
            this.d = iArr2;
            Arrays.fill(iArr2, -1);
        } else if (i13 >= iArr.length) {
            int[] iArr3 = new int[i12 * 4];
            this.d = iArr3;
            System.arraycopy(iArr, 0, iArr3, 0, iArr.length);
        }
        int[] iArr4 = (int[]) this.d;
        iArr4[i13] = i10;
        iArr4[i13 + 1] = i11;
        this.c++;
    }

    public void b(RecyclerView recyclerView, boolean z10) {
        boolean z11;
        int i10;
        this.c = 0;
        int[] iArr = (int[]) this.d;
        if (iArr != null) {
            Arrays.fill(iArr, -1);
        }
        f2.x0 x0Var = recyclerView.x;
        if (recyclerView.w == null || x0Var == null || !x0Var.h) {
            return;
        }
        if (z10) {
            if (!recyclerView.d.h()) {
                int h = recyclerView.w.h();
                f2.k0 k0Var = (f2.k0) x0Var;
                f2.j0 j0Var = k0Var.B;
                if (j0Var == null || (i10 = j0Var.a) < 0) {
                    k0Var.f1();
                    z11 = k0Var.v;
                    i10 = k0Var.y;
                    if (i10 == -1) {
                        i10 = z11 ? h - 1 : 0;
                    }
                } else {
                    z11 = j0Var.c;
                }
                int i11 = z11 ? -1 : 1;
                for (int i12 = 0; i12 < k0Var.E && i10 >= 0 && i10 < h; i12++) {
                    a(i10, 0);
                    i10 += i11;
                }
            }
        } else if (!recyclerView.Z()) {
            int i13 = this.a;
            int i14 = this.b;
            f2.l1 l1Var = recyclerView.p0;
            f2.k0 k0Var2 = (f2.k0) x0Var;
            if (k0Var2.o != 0) {
                i13 = i14;
            }
            if (k0Var2.r() != 0 && i13 != 0) {
                k0Var2.G0();
                k0Var2.m1(i13 > 0 ? 1 : -1, Math.abs(i13), true, l1Var);
                k0Var2.A0(l1Var, k0Var2.p, this);
            }
        }
        int i15 = this.c;
        if (i15 > x0Var.i) {
            x0Var.i = i15;
            x0Var.j = z10;
            recyclerView.b.l();
        }
    }

    public int c() {
        int i10 = this.c;
        if (i10 != 0) {
            this.a = i10;
            this.c = 0;
        } else {
            this.a = ((h) this.d).z();
        }
        int i11 = this.a;
        return (i11 == 0 || i11 == this.b) ? ConnectionsManager.DEFAULT_DATACENTER_ID : i11 >>> 3;
    }

    public int d() {
        return this.a;
    }

    public boolean e() {
        S(0);
        return ((h) this.d).f();
    }

    public void f(List list) {
        int z10;
        h hVar = (h) this.d;
        if (list instanceof d) {
            throw new ClassCastException();
        }
        int i10 = this.a & 7;
        if (i10 == 0) {
            do {
                list.add(Boolean.valueOf(hVar.f()));
                if (hVar.c()) {
                    return;
                } else {
                    z10 = hVar.z();
                }
            } while (z10 == this.a);
            this.c = z10;
            return;
        }
        if (i10 != 2) {
            throw b0.b();
        }
        int b10 = hVar.b() + hVar.A();
        do {
            list.add(Boolean.valueOf(hVar.f()));
        } while (hVar.b() < b10);
        R(b10);
    }

    public g g() {
        S(2);
        h hVar = (h) this.d;
        byte[] bArr = hVar.d;
        int s10 = hVar.s();
        int i10 = hVar.e;
        int i11 = hVar.g;
        if (s10 <= i10 - i11 && s10 > 0) {
            g i12 = g.i(i11, s10, bArr);
            hVar.g += s10;
            return i12;
        }
        if (s10 == 0) {
            return g.c;
        }
        byte[] o10 = hVar.o(s10);
        if (o10 != null) {
            return g.i(0, o10.length, o10);
        }
        int i13 = hVar.g;
        int i14 = hVar.e;
        int i15 = i14 - i13;
        hVar.i += i14;
        hVar.g = 0;
        hVar.e = 0;
        ArrayList p6 = hVar.p(s10 - i15);
        byte[] bArr2 = new byte[s10];
        System.arraycopy(bArr, i13, bArr2, 0, i15);
        int size = p6.size();
        int i16 = 0;
        while (i16 < size) {
            Object obj = p6.get(i16);
            i16++;
            byte[] bArr3 = (byte[]) obj;
            System.arraycopy(bArr3, 0, bArr2, i15, bArr3.length);
            i15 += bArr3.length;
        }
        g gVar = g.c;
        return new g(bArr2);
    }

    public void h(List list) {
        int z10;
        h hVar = (h) this.d;
        if ((this.a & 7) != 2) {
            throw b0.b();
        }
        do {
            list.add(g());
            if (hVar.c()) {
                return;
            } else {
                z10 = hVar.z();
            }
        } while (z10 == this.a);
        this.c = z10;
    }

    public double i() {
        S(1);
        return ((h) this.d).g();
    }

    public void j(List list) {
        int z10;
        h hVar = (h) this.d;
        if (list instanceof l) {
            throw new ClassCastException();
        }
        int i10 = this.a & 7;
        if (i10 == 1) {
            do {
                list.add(Double.valueOf(hVar.g()));
                if (hVar.c()) {
                    return;
                } else {
                    z10 = hVar.z();
                }
            } while (z10 == this.a);
            this.c = z10;
            return;
        }
        if (i10 != 2) {
            throw b0.b();
        }
        int A = hVar.A();
        V(A);
        int b10 = hVar.b() + A;
        do {
            list.add(Double.valueOf(hVar.g()));
        } while (hVar.b() < b10);
    }

    public int k() {
        S(0);
        return ((h) this.d).h();
    }

    public void l(List list) {
        int z10;
        h hVar = (h) this.d;
        if (list instanceof x) {
            throw new ClassCastException();
        }
        int i10 = this.a & 7;
        if (i10 == 0) {
            do {
                list.add(Integer.valueOf(hVar.h()));
                if (hVar.c()) {
                    return;
                } else {
                    z10 = hVar.z();
                }
            } while (z10 == this.a);
            this.c = z10;
            return;
        }
        if (i10 != 2) {
            throw b0.b();
        }
        int b10 = hVar.b() + hVar.A();
        do {
            list.add(Integer.valueOf(hVar.h()));
        } while (hVar.b() < b10);
        R(b10);
    }

    public Object m(z1 z1Var, Class cls, n nVar) {
        switch (z1Var.ordinal()) {
            case 0:
                return Double.valueOf(i());
            case 1:
                return Float.valueOf(r());
            case 2:
                return Long.valueOf(y());
            case 3:
                return Long.valueOf(P());
            case 4:
                return Integer.valueOf(w());
            case 5:
                return Long.valueOf(p());
            case 6:
                return Integer.valueOf(n());
            case 7:
                return Boolean.valueOf(e());
            case 8:
                return M();
            case 9:
            default:
                throw new RuntimeException("unsupported field type.");
            case 10:
                S(2);
                return A(y0.c.a(cls), nVar);
            case 11:
                return g();
            case 12:
                return Integer.valueOf(N());
            case 13:
                return Integer.valueOf(k());
            case 14:
                return Integer.valueOf(C());
            case 15:
                return Long.valueOf(E());
            case 16:
                return Integer.valueOf(G());
            case 17:
                return Long.valueOf(I());
        }
    }

    public int n() {
        S(5);
        return ((h) this.d).i();
    }

    public void o(List list) {
        int z10;
        h hVar = (h) this.d;
        if (list instanceof x) {
            throw new ClassCastException();
        }
        int i10 = this.a & 7;
        if (i10 == 2) {
            int A = hVar.A();
            U(A);
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
        } while (z10 == this.a);
        this.c = z10;
    }

    public long p() {
        S(1);
        return ((h) this.d).j();
    }

    public void q(List list) {
        int z10;
        h hVar = (h) this.d;
        if (list instanceof i0) {
            throw new ClassCastException();
        }
        int i10 = this.a & 7;
        if (i10 == 1) {
            do {
                list.add(Long.valueOf(hVar.j()));
                if (hVar.c()) {
                    return;
                } else {
                    z10 = hVar.z();
                }
            } while (z10 == this.a);
            this.c = z10;
            return;
        }
        if (i10 != 2) {
            throw b0.b();
        }
        int A = hVar.A();
        V(A);
        int b10 = hVar.b() + A;
        do {
            list.add(Long.valueOf(hVar.j()));
        } while (hVar.b() < b10);
    }

    public float r() {
        S(5);
        return ((h) this.d).k();
    }

    public void s(List list) {
        int z10;
        h hVar = (h) this.d;
        if (list instanceof s) {
            throw new ClassCastException();
        }
        int i10 = this.a & 7;
        if (i10 == 2) {
            int A = hVar.A();
            U(A);
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
        } while (z10 == this.a);
        this.c = z10;
    }

    public Object t(b1 b1Var, n nVar) {
        int i10 = this.b;
        this.b = ((this.a >>> 3) << 3) | 4;
        try {
            Object a2 = b1Var.a();
            b1Var.i(a2, this, nVar);
            b1Var.c(a2);
            if (this.a == this.b) {
                return a2;
            }
            throw b0.e();
        } finally {
            this.b = i10;
        }
    }

    public Object u(b1 b1Var, n nVar) {
        S(3);
        return t(b1Var, nVar);
    }

    public void v(List list, b1 b1Var, n nVar) {
        int z10;
        h hVar = (h) this.d;
        int i10 = this.a;
        if ((i10 & 7) != 3) {
            throw b0.b();
        }
        do {
            list.add(t(b1Var, nVar));
            if (hVar.c() || this.c != 0) {
                return;
            } else {
                z10 = hVar.z();
            }
        } while (z10 == i10);
        this.c = z10;
    }

    public int w() {
        S(0);
        return ((h) this.d).l();
    }

    public void x(List list) {
        int z10;
        h hVar = (h) this.d;
        if (list instanceof x) {
            throw new ClassCastException();
        }
        int i10 = this.a & 7;
        if (i10 == 0) {
            do {
                list.add(Integer.valueOf(hVar.l()));
                if (hVar.c()) {
                    return;
                } else {
                    z10 = hVar.z();
                }
            } while (z10 == this.a);
            this.c = z10;
            return;
        }
        if (i10 != 2) {
            throw b0.b();
        }
        int b10 = hVar.b() + hVar.A();
        do {
            list.add(Integer.valueOf(hVar.l()));
        } while (hVar.b() < b10);
        R(b10);
    }

    public long y() {
        S(0);
        return ((h) this.d).m();
    }

    public void z(List list) {
        int z10;
        h hVar = (h) this.d;
        if (list instanceof i0) {
            throw new ClassCastException();
        }
        int i10 = this.a & 7;
        if (i10 == 0) {
            do {
                list.add(Long.valueOf(hVar.m()));
                if (hVar.c()) {
                    return;
                } else {
                    z10 = hVar.z();
                }
            } while (z10 == this.a);
            this.c = z10;
            return;
        }
        if (i10 != 2) {
            throw b0.b();
        }
        int b10 = hVar.b() + hVar.A();
        do {
            list.add(Long.valueOf(hVar.m()));
        } while (hVar.b() < b10);
        R(b10);
    }
}
