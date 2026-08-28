package androidx.datastore.preferences.protobuf;

import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.telegram.tgnet.ConnectionsManager;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class i {
    public int a;
    public int b;
    public int c;
    public Object d;

    public static void U(int i9) {
        if ((i9 & 3) != 0) {
            throw c0.e();
        }
    }

    public static void V(int i9) {
        if ((i9 & 7) != 0) {
            throw c0.e();
        }
    }

    public Object A(c1 c1Var, n nVar) {
        h hVar = (h) this.d;
        int A = hVar.A();
        if (hVar.a >= 100) {
            throw new c0("Protocol message had too many levels of nesting.  May be malicious.  Use CodedInputStream.setRecursionLimit() to increase the depth limit.");
        }
        int e10 = hVar.e(A);
        Object a2 = c1Var.a();
        hVar.a++;
        c1Var.i(a2, this, nVar);
        c1Var.c(a2);
        hVar.a(0);
        hVar.a--;
        hVar.d(e10);
        return a2;
    }

    public Object B(c1 c1Var, n nVar) {
        S(2);
        return A(c1Var, nVar);
    }

    public int C() {
        S(5);
        return ((h) this.d).v();
    }

    public void D(List list) {
        int z10;
        h hVar = (h) this.d;
        if (list instanceof y) {
            throw new ClassCastException();
        }
        int i9 = this.a & 7;
        if (i9 == 2) {
            int A = hVar.A();
            U(A);
            int b10 = hVar.b() + A;
            do {
                list.add(Integer.valueOf(hVar.v()));
            } while (hVar.b() < b10);
            return;
        }
        if (i9 != 5) {
            throw c0.b();
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
        if (list instanceof j0) {
            throw new ClassCastException();
        }
        int i9 = this.a & 7;
        if (i9 == 1) {
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
        if (i9 != 2) {
            throw c0.b();
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
        if (list instanceof y) {
            throw new ClassCastException();
        }
        int i9 = this.a & 7;
        if (i9 == 0) {
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
        if (i9 != 2) {
            throw c0.b();
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
        if (list instanceof j0) {
            throw new ClassCastException();
        }
        int i9 = this.a & 7;
        if (i9 == 0) {
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
        if (i9 != 2) {
            throw c0.b();
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
            int i9 = hVar.e;
            int i10 = hVar.g;
            if (s10 <= i9 - i10) {
                String str = new String(bArr, i10, s10, a0.a);
                hVar.g += s10;
                return str;
            }
        }
        if (s10 == 0) {
            return "";
        }
        if (s10 > hVar.e) {
            return new String(hVar.n(s10), a0.a);
        }
        hVar.D(s10);
        String str2 = new String(bArr, hVar.g, s10, a0.a);
        hVar.g += s10;
        return str2;
    }

    public void L(List list, boolean z10) {
        int z11;
        int z12;
        h hVar = (h) this.d;
        if ((this.a & 7) != 2) {
            throw c0.b();
        }
        if (!(list instanceof f0) || z10) {
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
        f0 f0Var = (f0) list;
        do {
            f0Var.g(g());
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
        int i9 = hVar.g;
        int i10 = hVar.e;
        if (s10 <= i10 - i9 && s10 > 0) {
            hVar.g = i9 + s10;
        } else {
            if (s10 == 0) {
                return "";
            }
            i9 = 0;
            if (s10 <= i10) {
                hVar.D(s10);
                hVar.g = s10;
            } else {
                bArr = hVar.n(s10);
            }
        }
        return v1.a.e(i9, s10, bArr);
    }

    public int N() {
        S(0);
        return ((h) this.d).A();
    }

    public void O(List list) {
        int z10;
        h hVar = (h) this.d;
        if (list instanceof y) {
            throw new ClassCastException();
        }
        int i9 = this.a & 7;
        if (i9 == 0) {
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
        if (i9 != 2) {
            throw c0.b();
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
        if (list instanceof j0) {
            throw new ClassCastException();
        }
        int i9 = this.a & 7;
        if (i9 == 0) {
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
        if (i9 != 2) {
            throw c0.b();
        }
        int b10 = hVar.b() + hVar.A();
        do {
            list.add(Long.valueOf(hVar.B()));
        } while (hVar.b() < b10);
        R(b10);
    }

    public void R(int i9) {
        if (((h) this.d).b() != i9) {
            throw c0.f();
        }
    }

    public void S(int i9) {
        if ((this.a & 7) != i9) {
            throw c0.b();
        }
    }

    public boolean T() {
        int i9;
        h hVar = (h) this.d;
        if (hVar.c() || (i9 = this.a) == this.b) {
            return false;
        }
        return hVar.E(i9);
    }

    public void a(int i9, int i10) {
        if (i9 < 0) {
            throw new IllegalArgumentException("Layout positions must be non-negative");
        }
        if (i10 < 0) {
            throw new IllegalArgumentException("Pixel distance must be non-negative");
        }
        int i11 = this.c;
        int i12 = i11 * 2;
        int[] iArr = (int[]) this.d;
        if (iArr == null) {
            int[] iArr2 = new int[4];
            this.d = iArr2;
            Arrays.fill(iArr2, -1);
        } else if (i12 >= iArr.length) {
            int[] iArr3 = new int[i11 * 4];
            this.d = iArr3;
            System.arraycopy(iArr, 0, iArr3, 0, iArr.length);
        }
        int[] iArr4 = (int[]) this.d;
        iArr4[i12] = i9;
        iArr4[i12 + 1] = i10;
        this.c++;
    }

    public void b(RecyclerView recyclerView, boolean z10) {
        boolean z11;
        int i9;
        this.c = 0;
        int[] iArr = (int[]) this.d;
        if (iArr != null) {
            Arrays.fill(iArr, -1);
        }
        f2.z0 z0Var = recyclerView.x;
        if (recyclerView.w == null || z0Var == null || !z0Var.h) {
            return;
        }
        if (z10) {
            if (!recyclerView.d.h()) {
                int h = recyclerView.w.h();
                f2.m0 m0Var = (f2.m0) z0Var;
                f2.l0 l0Var = m0Var.B;
                if (l0Var == null || (i9 = l0Var.a) < 0) {
                    m0Var.f1();
                    z11 = m0Var.v;
                    i9 = m0Var.y;
                    if (i9 == -1) {
                        i9 = z11 ? h - 1 : 0;
                    }
                } else {
                    z11 = l0Var.c;
                }
                int i10 = z11 ? -1 : 1;
                for (int i11 = 0; i11 < m0Var.E && i9 >= 0 && i9 < h; i11++) {
                    a(i9, 0);
                    i9 += i10;
                }
            }
        } else if (!recyclerView.Z()) {
            int i12 = this.a;
            int i13 = this.b;
            f2.n1 n1Var = recyclerView.p0;
            f2.m0 m0Var2 = (f2.m0) z0Var;
            if (m0Var2.o != 0) {
                i12 = i13;
            }
            if (m0Var2.r() != 0 && i12 != 0) {
                m0Var2.G0();
                m0Var2.m1(i12 > 0 ? 1 : -1, Math.abs(i12), true, n1Var);
                m0Var2.A0(n1Var, m0Var2.p, this);
            }
        }
        int i14 = this.c;
        if (i14 > z0Var.i) {
            z0Var.i = i14;
            z0Var.j = z10;
            recyclerView.b.l();
        }
    }

    public int c() {
        int i9 = this.c;
        if (i9 != 0) {
            this.a = i9;
            this.c = 0;
        } else {
            this.a = ((h) this.d).z();
        }
        int i10 = this.a;
        return (i10 == 0 || i10 == this.b) ? ConnectionsManager.DEFAULT_DATACENTER_ID : i10 >>> 3;
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
        int i9 = this.a & 7;
        if (i9 == 0) {
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
        if (i9 != 2) {
            throw c0.b();
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
        int i9 = hVar.e;
        int i10 = hVar.g;
        if (s10 <= i9 - i10 && s10 > 0) {
            g i11 = g.i(i10, s10, bArr);
            hVar.g += s10;
            return i11;
        }
        if (s10 == 0) {
            return g.c;
        }
        byte[] o6 = hVar.o(s10);
        if (o6 != null) {
            return g.i(0, o6.length, o6);
        }
        int i12 = hVar.g;
        int i13 = hVar.e;
        int i14 = i13 - i12;
        hVar.i += i13;
        hVar.g = 0;
        hVar.e = 0;
        ArrayList p6 = hVar.p(s10 - i14);
        byte[] bArr2 = new byte[s10];
        System.arraycopy(bArr, i12, bArr2, 0, i14);
        int size = p6.size();
        int i15 = 0;
        while (i15 < size) {
            Object obj = p6.get(i15);
            i15++;
            byte[] bArr3 = (byte[]) obj;
            System.arraycopy(bArr3, 0, bArr2, i14, bArr3.length);
            i14 += bArr3.length;
        }
        g gVar = g.c;
        return new g(bArr2);
    }

    public void h(List list) {
        int z10;
        h hVar = (h) this.d;
        if ((this.a & 7) != 2) {
            throw c0.b();
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
        int i9 = this.a & 7;
        if (i9 == 1) {
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
        if (i9 != 2) {
            throw c0.b();
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
        if (list instanceof y) {
            throw new ClassCastException();
        }
        int i9 = this.a & 7;
        if (i9 == 0) {
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
        if (i9 != 2) {
            throw c0.b();
        }
        int b10 = hVar.b() + hVar.A();
        do {
            list.add(Integer.valueOf(hVar.h()));
        } while (hVar.b() < b10);
        R(b10);
    }

    public Object m(a2 a2Var, Class cls, n nVar) {
        switch (a2Var.ordinal()) {
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
                return A(z0.c.a(cls), nVar);
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
        if (list instanceof y) {
            throw new ClassCastException();
        }
        int i9 = this.a & 7;
        if (i9 == 2) {
            int A = hVar.A();
            U(A);
            int b10 = hVar.b() + A;
            do {
                list.add(Integer.valueOf(hVar.i()));
            } while (hVar.b() < b10);
            return;
        }
        if (i9 != 5) {
            throw c0.b();
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
        if (list instanceof j0) {
            throw new ClassCastException();
        }
        int i9 = this.a & 7;
        if (i9 == 1) {
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
        if (i9 != 2) {
            throw c0.b();
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
        if (list instanceof t) {
            throw new ClassCastException();
        }
        int i9 = this.a & 7;
        if (i9 == 2) {
            int A = hVar.A();
            U(A);
            int b10 = hVar.b() + A;
            do {
                list.add(Float.valueOf(hVar.k()));
            } while (hVar.b() < b10);
            return;
        }
        if (i9 != 5) {
            throw c0.b();
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

    public Object t(c1 c1Var, n nVar) {
        int i9 = this.b;
        this.b = ((this.a >>> 3) << 3) | 4;
        try {
            Object a2 = c1Var.a();
            c1Var.i(a2, this, nVar);
            c1Var.c(a2);
            if (this.a == this.b) {
                return a2;
            }
            throw c0.e();
        } finally {
            this.b = i9;
        }
    }

    public Object u(c1 c1Var, n nVar) {
        S(3);
        return t(c1Var, nVar);
    }

    public void v(List list, c1 c1Var, n nVar) {
        int z10;
        h hVar = (h) this.d;
        int i9 = this.a;
        if ((i9 & 7) != 3) {
            throw c0.b();
        }
        do {
            list.add(t(c1Var, nVar));
            if (hVar.c() || this.c != 0) {
                return;
            } else {
                z10 = hVar.z();
            }
        } while (z10 == i9);
        this.c = z10;
    }

    public int w() {
        S(0);
        return ((h) this.d).l();
    }

    public void x(List list) {
        int z10;
        h hVar = (h) this.d;
        if (list instanceof y) {
            throw new ClassCastException();
        }
        int i9 = this.a & 7;
        if (i9 == 0) {
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
        if (i9 != 2) {
            throw c0.b();
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
        if (list instanceof j0) {
            throw new ClassCastException();
        }
        int i9 = this.a & 7;
        if (i9 == 0) {
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
        if (i9 != 2) {
            throw c0.b();
        }
        int b10 = hVar.b() + hVar.A();
        do {
            list.add(Long.valueOf(hVar.m()));
        } while (hVar.b() < b10);
        R(b10);
    }
}
