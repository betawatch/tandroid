package f2;

import android.graphics.PointF;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;
import java.util.WeakHashMap;
import org.telegram.messenger.LiteMode;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public class m0 extends z0 {
    public int A;
    public l0 B;
    public final i0 C;
    public final j0 D;
    public int E;
    public final int[] F;
    public boolean G;
    public boolean H;
    public int o;
    public k0 p;
    public androidx.emoji2.text.f q;
    public boolean r;
    public boolean s;
    public boolean t;
    public boolean u;
    public boolean v;
    public boolean w;
    public final boolean x;
    public int y;
    public boolean z;

    public m0() {
        this(1, false);
    }

    public void A0(n1 n1Var, k0 k0Var, androidx.datastore.preferences.protobuf.i iVar) {
        int i9 = k0Var.d;
        if (i9 < 0 || i9 >= n1Var.b()) {
            return;
        }
        iVar.a(i9, Math.max(0, k0Var.g));
    }

    public final int B0(n1 n1Var) {
        if (r() == 0) {
            return 0;
        }
        G0();
        androidx.emoji2.text.f fVar = this.q;
        boolean z10 = this.x;
        boolean z11 = !z10;
        View K0 = K0(z11);
        View J0 = J0(z11);
        if (r() == 0 || n1Var.b() == 0 || K0 == null || J0 == null) {
            return 0;
        }
        if (!z10) {
            return Math.abs(((a1) K0.getLayoutParams()).b() - ((a1) J0.getLayoutParams()).b()) + 1;
        }
        return Math.min(fVar.k(), fVar.a(J0) - fVar.d(K0));
    }

    public final int C0(n1 n1Var) {
        if (r() != 0) {
            G0();
            androidx.emoji2.text.f fVar = this.q;
            boolean z10 = this.x;
            boolean z11 = !z10;
            View K0 = K0(z11);
            View J0 = J0(z11);
            boolean z12 = this.v;
            if (r() != 0 && n1Var.b() != 0 && K0 != null && J0 != null) {
                int max = z12 ? Math.max(0, (n1Var.b() - Math.max(((a1) K0.getLayoutParams()).b(), ((a1) J0.getLayoutParams()).b())) - 1) : Math.max(0, Math.min(((a1) K0.getLayoutParams()).b(), ((a1) J0.getLayoutParams()).b()));
                if (z10) {
                    return Math.round((max * (Math.abs(fVar.a(J0) - fVar.d(K0)) / (Math.abs(((a1) K0.getLayoutParams()).b() - ((a1) J0.getLayoutParams()).b()) + 1))) + (fVar.j() - fVar.d(K0)));
                }
                return max;
            }
        }
        return 0;
    }

    public final int D0(n1 n1Var) {
        if (r() == 0) {
            return 0;
        }
        G0();
        androidx.emoji2.text.f fVar = this.q;
        boolean z10 = this.x;
        boolean z11 = !z10;
        View K0 = K0(z11);
        View J0 = J0(z11);
        if (r() == 0 || n1Var.b() == 0 || K0 == null || J0 == null) {
            return 0;
        }
        if (!z10) {
            return n1Var.b();
        }
        return (int) (((fVar.a(J0) - fVar.d(K0)) / (Math.abs(((a1) K0.getLayoutParams()).b() - ((a1) J0.getLayoutParams()).b()) + 1)) * n1Var.b());
    }

    public final PointF E0(int i9) {
        if (r() == 0) {
            return null;
        }
        int i10 = (i9 < z0.H(q(0))) != this.v ? -1 : 1;
        return this.o == 0 ? new PointF(i10, 0.0f) : new PointF(0.0f, i10);
    }

    public final int F0(int i9) {
        if (i9 == 1) {
            return (this.o != 1 && Y0()) ? 1 : -1;
        }
        if (i9 == 2) {
            return (this.o != 1 && Y0()) ? -1 : 1;
        }
        if (i9 == 17) {
            if (this.o == 0) {
                return -1;
            }
            return TLObject.FLAG_31;
        }
        if (i9 == 33) {
            if (this.o == 1) {
                return -1;
            }
            return TLObject.FLAG_31;
        }
        if (i9 == 66) {
            if (this.o == 0) {
                return 1;
            }
            return TLObject.FLAG_31;
        }
        if (i9 == 130 && this.o == 1) {
            return 1;
        }
        return TLObject.FLAG_31;
    }

    public final void G0() {
        if (this.p == null) {
            k0 k0Var = new k0();
            k0Var.a = true;
            k0Var.h = 0;
            k0Var.i = 0;
            k0Var.k = null;
            this.p = k0Var;
        }
    }

    public final int H0(g1 g1Var, k0 k0Var, n1 n1Var, boolean z10) {
        int i9 = k0Var.c;
        int i10 = k0Var.g;
        if (i10 != Integer.MIN_VALUE) {
            if (i9 < 0) {
                k0Var.g = i10 + i9;
            }
            c1(g1Var, k0Var);
        }
        int i11 = k0Var.c + k0Var.h;
        while (true) {
            if ((!k0Var.l && i11 <= 0) || !k0Var.b(n1Var)) {
                break;
            }
            j0 j0Var = this.D;
            j0Var.a = 0;
            j0Var.b = false;
            j0Var.c = false;
            j0Var.d = false;
            Z0(g1Var, n1Var, k0Var, j0Var);
            if (!j0Var.b) {
                int i12 = k0Var.b;
                int i13 = j0Var.a;
                k0Var.b = (k0Var.f * i13) + i12;
                if (!j0Var.c || k0Var.k != null || !n1Var.g) {
                    k0Var.c -= i13;
                    i11 -= i13;
                }
                int i14 = k0Var.g;
                if (i14 != Integer.MIN_VALUE) {
                    int i15 = i14 + i13;
                    k0Var.g = i15;
                    int i16 = k0Var.c;
                    if (i16 < 0) {
                        k0Var.g = i15 + i16;
                    }
                    c1(g1Var, k0Var);
                }
                if (z10 && j0Var.d) {
                    break;
                }
            } else {
                break;
            }
        }
        return i9 - k0Var.c;
    }

    public final int I0() {
        View P0 = P0(0, r(), true, false);
        if (P0 == null) {
            return -1;
        }
        return ((a1) P0.getLayoutParams()).b();
    }

    public final View J0(boolean z10) {
        return this.v ? P0(0, r(), z10, true) : P0(r() - 1, -1, z10, true);
    }

    public final View K0(boolean z10) {
        return this.v ? P0(r() - 1, -1, z10, true) : P0(0, r(), z10, true);
    }

    public final int L0() {
        View P0 = P0(0, r(), false, true);
        if (P0 == null) {
            return -1;
        }
        return ((a1) P0.getLayoutParams()).b();
    }

    public final int M0() {
        View P0 = P0(r() - 1, -1, true, false);
        if (P0 == null) {
            return -1;
        }
        return ((a1) P0.getLayoutParams()).b();
    }

    public final int N0() {
        View P0 = P0(r() - 1, -1, false, true);
        if (P0 == null) {
            return -1;
        }
        return ((a1) P0.getLayoutParams()).b();
    }

    public final View O0(int i9, int i10) {
        int i11;
        int i12;
        G0();
        if (i10 <= i9 && i10 >= i9) {
            return q(i9);
        }
        if (this.q.d(q(i9)) < this.q.j()) {
            i11 = 16644;
            i12 = LiteMode.FLAG_ANIMATED_EMOJI_KEYBOARD;
        } else {
            i11 = 4161;
            i12 = 4097;
        }
        return this.o == 0 ? this.c.B(i9, i10, i11, i12) : this.d.B(i9, i10, i11, i12);
    }

    public final View P0(int i9, int i10, boolean z10, boolean z11) {
        G0();
        int i11 = z10 ? 24579 : 320;
        int i12 = z11 ? 320 : 0;
        return this.o == 0 ? this.c.B(i9, i10, i11, i12) : this.d.B(i9, i10, i11, i12);
    }

    public View Q0(g1 g1Var, n1 n1Var, int i9, int i10, int i11) {
        G0();
        int j10 = this.r ? 0 : this.q.j();
        int f10 = this.q.f();
        int i12 = i10 > i9 ? 1 : -1;
        View view = null;
        View view2 = null;
        while (i9 != i10) {
            View q10 = q(i9);
            int H = z0.H(q10);
            if (H >= 0 && H < i11) {
                if (((a1) q10.getLayoutParams()).a.j()) {
                    if (view2 == null) {
                        view2 = q10;
                    }
                } else {
                    if (this.q.d(q10) < f10 && this.q.a(q10) >= j10) {
                        return q10;
                    }
                    if (view == null) {
                        view = q10;
                    }
                }
            }
            i9 += i12;
        }
        return view != null ? view : view2;
    }

    @Override // f2.z0
    public View R(View view, int i9, g1 g1Var, n1 n1Var) {
        int F0;
        f1();
        if (r() != 0 && (F0 = F0(i9)) != Integer.MIN_VALUE) {
            G0();
            m1(F0, (int) (this.q.k() * 0.33333334f), false, n1Var);
            k0 k0Var = this.p;
            k0Var.g = TLObject.FLAG_31;
            k0Var.a = false;
            H0(g1Var, k0Var, n1Var, true);
            View O0 = F0 == -1 ? this.v ? O0(r() - 1, -1) : O0(0, r()) : this.v ? O0(0, r()) : O0(r() - 1, -1);
            View V0 = F0 == -1 ? V0() : U0();
            if (!V0.hasFocusable()) {
                return O0;
            }
            if (O0 != null) {
                return V0;
            }
        }
        return null;
    }

    public int R0() {
        return 0;
    }

    public final int S0(int i9, g1 g1Var, n1 n1Var, boolean z10) {
        int f10;
        int f11;
        if (!this.G || !this.H || (f10 = this.q.f() - i9) <= 0) {
            return 0;
        }
        int i10 = -g1(-f10, g1Var, n1Var);
        int i11 = i9 + i10;
        if (!z10 || (f11 = this.q.f() - i11) <= 0) {
            return i10;
        }
        this.q.n(f11);
        return f11 + i10;
    }

    public final int T0(int i9, g1 g1Var, n1 n1Var, boolean z10) {
        int X0;
        int j10;
        if (!this.G || (X0 = i9 - X0()) <= 0) {
            return 0;
        }
        int i10 = -g1(X0, g1Var, n1Var);
        int i11 = i9 + i10;
        if (!z10 || (j10 = i11 - this.q.j()) <= 0) {
            return i10;
        }
        this.q.n(-j10);
        return i10 - j10;
    }

    public final View U0() {
        return q(this.v ? 0 : r() - 1);
    }

    public final View V0() {
        return q(this.v ? r() - 1 : 0);
    }

    public int W0(n1 n1Var) {
        if (n1Var.a != -1) {
            return this.q.k();
        }
        return 0;
    }

    public int X0() {
        return this.q.j();
    }

    public boolean Y0() {
        RecyclerView recyclerView = this.b;
        WeakHashMap weakHashMap = r0.j0.a;
        return recyclerView.getLayoutDirection() == 1;
    }

    public void Z0(g1 g1Var, n1 n1Var, k0 k0Var, j0 j0Var) {
        int i9;
        int i10;
        int i11;
        int i12;
        View c10 = k0Var.c(g1Var);
        if (c10 == null) {
            j0Var.b = true;
            return;
        }
        a1 a1Var = (a1) c10.getLayoutParams();
        if (k0Var.k == null) {
            if (this.v == (k0Var.f == -1)) {
                a(c10, -1, false);
            } else {
                a(c10, 0, false);
            }
        } else {
            if (this.v == (k0Var.f == -1)) {
                a(c10, -1, true);
            } else {
                a(c10, 0, true);
            }
        }
        P(c10);
        j0Var.a = this.q.b(c10);
        if (this.o == 1) {
            if (Y0()) {
                i12 = this.m - E();
                i9 = i12 - this.q.c(c10);
            } else {
                i9 = D();
                i12 = this.q.c(c10) + i9;
            }
            if (k0Var.f == -1) {
                i10 = k0Var.b;
                i11 = i10 - j0Var.a;
            } else {
                i11 = k0Var.b;
                i10 = j0Var.a + i11;
            }
        } else {
            int F = F();
            int c11 = this.q.c(c10) + F;
            if (k0Var.f == -1) {
                int i13 = k0Var.b;
                int i14 = i13 - j0Var.a;
                i12 = i13;
                i10 = c11;
                i9 = i14;
                i11 = F;
            } else {
                int i15 = k0Var.b;
                int i16 = j0Var.a + i15;
                i9 = i15;
                i10 = c11;
                i11 = F;
                i12 = i16;
            }
        }
        z0.O(c10, i9, i11, i12, i10);
        if (a1Var.a.j() || a1Var.a.m()) {
            j0Var.c = true;
        }
        j0Var.d = c10.hasFocusable();
    }

    @Override // f2.z0
    public final void b(String str) {
        RecyclerView recyclerView;
        if (this.B != null || (recyclerView = this.b) == null) {
            return;
        }
        recyclerView.l(str);
    }

    /* JADX WARN: Removed duplicated region for block: B:203:0x029b  */
    /* JADX WARN: Removed duplicated region for block: B:205:0x02a1  */
    @Override // f2.z0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void b0(g1 g1Var, n1 n1Var) {
        View view;
        View view2;
        g1 g1Var2;
        View Q0;
        int i9;
        int d;
        int i10;
        int i11;
        List list;
        int i12;
        int i13;
        int S0;
        int i14;
        View m10;
        int d9;
        int i15;
        int i16;
        m0 m0Var = this;
        n1 n1Var2 = n1Var;
        int i17 = -1;
        if (!(m0Var.B == null && m0Var.y == -1) && n1Var2.b() == 0) {
            g0(g1Var);
            return;
        }
        l0 l0Var = m0Var.B;
        if (l0Var != null && (i16 = l0Var.a) >= 0) {
            m0Var.y = i16;
        }
        m0Var.G0();
        m0Var.p.a = false;
        m0Var.f1();
        RecyclerView recyclerView = m0Var.b;
        if (recyclerView == null || (view = recyclerView.getFocusedChild()) == null || ((ArrayList) m0Var.a.d).contains(view)) {
            view = null;
        }
        i0 i0Var = m0Var.C;
        if (i0Var.d && m0Var.y == -1 && m0Var.B == null) {
            if (view != null && (m0Var.q.d(view) >= m0Var.q.f() || m0Var.q.a(view) <= m0Var.q.j())) {
                i0Var.d(((a1) view.getLayoutParams()).b(), view);
            }
            g1Var2 = g1Var;
        } else {
            i0Var.f();
            i0Var.c = m0Var.v ^ m0Var.w;
            if (!n1Var2.g && (i9 = m0Var.y) != -1) {
                if (i9 < 0 || i9 >= n1Var2.b()) {
                    m0Var.y = -1;
                    m0Var.A = TLObject.FLAG_31;
                } else {
                    int i18 = m0Var.y;
                    i0Var.b = i18;
                    l0 l0Var2 = m0Var.B;
                    if (l0Var2 != null && l0Var2.a >= 0) {
                        boolean z10 = l0Var2.c;
                        i0Var.c = z10;
                        if (z10) {
                            i0Var.e = m0Var.q.f() - m0Var.B.b;
                        } else {
                            i0Var.e = m0Var.q.j() + m0Var.B.b;
                        }
                    } else if (m0Var.A == Integer.MIN_VALUE) {
                        View m11 = m0Var.m(i18);
                        if (m11 == null) {
                            if (m0Var.r() > 0) {
                                i0Var.c = (m0Var.y < z0.H(m0Var.q(0))) == m0Var.z;
                            }
                            i0Var.b();
                        } else if (m0Var.q.b(m11) > m0Var.q.k()) {
                            i0Var.b();
                        } else if (m0Var.q.d(m11) - m0Var.q.j() < 0) {
                            i0Var.e = m0Var.q.j();
                            i0Var.c = false;
                        } else if (m0Var.q.f() - m0Var.q.a(m11) < 0) {
                            i0Var.e = m0Var.q.f();
                            i0Var.c = true;
                        } else {
                            if (i0Var.c) {
                                int a2 = m0Var.q.a(m11);
                                androidx.emoji2.text.f fVar = m0Var.q;
                                d = (Integer.MIN_VALUE == fVar.a ? 0 : fVar.k() - fVar.a) + a2;
                            } else {
                                d = m0Var.q.d(m11);
                            }
                            i0Var.e = d;
                        }
                    } else {
                        boolean z11 = m0Var.z;
                        i0Var.c = z11;
                        if (z11) {
                            i0Var.e = m0Var.q.f() - m0Var.A;
                        } else {
                            i0Var.e = m0Var.q.j() + m0Var.A;
                        }
                    }
                    g1Var2 = g1Var;
                    i0Var.d = true;
                }
            }
            if (m0Var.r() != 0) {
                RecyclerView recyclerView2 = m0Var.b;
                if (recyclerView2 == null || (view2 = recyclerView2.getFocusedChild()) == null || ((ArrayList) m0Var.a.d).contains(view2)) {
                    view2 = null;
                }
                if (view2 != null) {
                    a1 a1Var = (a1) view2.getLayoutParams();
                    if (!a1Var.a.j() && a1Var.b() >= 0 && a1Var.b() < n1Var2.b()) {
                        i0Var.d(((a1) view2.getLayoutParams()).b(), view2);
                        g1Var2 = g1Var;
                        i0Var.d = true;
                    }
                }
                if (m0Var.s == m0Var.w) {
                    if (i0Var.c) {
                        if (m0Var.v) {
                            Q0 = m0Var.Q0(g1Var, n1Var2, 0, m0Var.r(), n1Var2.b());
                            m0Var = this;
                        } else {
                            m0Var = this;
                            Q0 = m0Var.Q0(g1Var, n1Var, r() - 1, -1, n1Var.b());
                        }
                        g1Var2 = g1Var;
                        n1Var2 = n1Var;
                    } else if (m0Var.v) {
                        g1Var2 = g1Var;
                        n1Var2 = n1Var;
                        Q0 = m0Var.Q0(g1Var2, n1Var2, m0Var.r() - 1, -1, n1Var.b());
                        m0Var = this;
                    } else {
                        m0Var = this;
                        g1Var2 = g1Var;
                        n1Var2 = n1Var;
                        Q0 = m0Var.Q0(g1Var2, n1Var2, 0, r(), n1Var.b());
                    }
                    if (Q0 != null) {
                        i0Var.c(((a1) Q0.getLayoutParams()).b(), Q0);
                        if (!n1Var2.g && m0Var.y0() && (m0Var.q.d(Q0) >= m0Var.q.f() || m0Var.q.a(Q0) < m0Var.q.j())) {
                            i0Var.e = i0Var.c ? m0Var.q.f() : m0Var.q.j();
                        }
                        i0Var.d = true;
                    }
                    i0Var.b();
                    i0Var.b = !m0Var.w ? n1Var2.b() - 1 : m0Var.R0();
                    i0Var.d = true;
                }
            }
            g1Var2 = g1Var;
            i0Var.b();
            i0Var.b = !m0Var.w ? n1Var2.b() - 1 : m0Var.R0();
            i0Var.d = true;
        }
        k0 k0Var = m0Var.p;
        k0Var.f = k0Var.j >= 0 ? 1 : -1;
        int[] iArr = m0Var.F;
        iArr[0] = 0;
        iArr[1] = 0;
        m0Var.z0(n1Var2, iArr);
        int j10 = m0Var.q.j() + Math.max(0, iArr[0]);
        int g10 = m0Var.q.g() + Math.max(0, iArr[1]);
        if (n1Var2.g && (i14 = m0Var.y) != -1 && m0Var.A != Integer.MIN_VALUE && (m10 = m0Var.m(i14)) != null) {
            if (m0Var.z) {
                i15 = m0Var.q.f() - m0Var.q.a(m10);
                d9 = m0Var.A;
            } else {
                d9 = m0Var.q.d(m10) - m0Var.q.j();
                i15 = m0Var.A;
            }
            int i19 = i15 - d9;
            if (i19 > 0) {
                j10 += i19;
            } else {
                g10 -= i19;
            }
        }
        if (!i0Var.c ? !m0Var.v : m0Var.v) {
            i17 = 1;
        }
        m0Var.a1(g1Var2, n1Var2, i0Var, i17);
        for (int r10 = m0Var.r() - 1; r10 >= 0; r10--) {
            View q10 = m0Var.q(r10);
            q1 U = RecyclerView.U(q10);
            if (U != null && !U.r()) {
                if (!U.h() || U.j() || m0Var.b.w.b) {
                    m0Var.q(r10);
                    m0Var.a.j(r10);
                    g1Var2.i(q10);
                    m0Var.b.f.K(U);
                } else {
                    m0Var.j0(r10);
                    g1Var2.h(U);
                }
            }
        }
        m0Var.p.l = m0Var.q.h() == 0 && m0Var.q.e() == 0;
        m0Var.p.getClass();
        m0Var.p.i = 0;
        if (i0Var.c) {
            m0Var.o1(i0Var.b, i0Var.e);
            k0 k0Var2 = m0Var.p;
            k0Var2.h = j10;
            m0Var.H0(g1Var2, k0Var2, n1Var2, false);
            k0 k0Var3 = m0Var.p;
            i11 = k0Var3.b;
            int i20 = k0Var3.d;
            int i21 = k0Var3.c;
            if (i21 > 0) {
                g10 += i21;
            }
            m0Var.n1(i0Var.b, i0Var.e);
            k0 k0Var4 = m0Var.p;
            k0Var4.h = g10;
            k0Var4.d += k0Var4.e;
            m0Var.H0(g1Var2, k0Var4, n1Var2, false);
            k0 k0Var5 = m0Var.p;
            i10 = k0Var5.b;
            int i22 = k0Var5.c;
            if (i22 > 0) {
                m0Var.o1(i20, i11);
                k0 k0Var6 = m0Var.p;
                k0Var6.h = i22;
                m0Var.H0(g1Var2, k0Var6, n1Var2, false);
                i11 = m0Var.p.b;
            }
        } else {
            m0Var.n1(i0Var.b, i0Var.e);
            k0 k0Var7 = m0Var.p;
            k0Var7.h = g10;
            m0Var.H0(g1Var2, k0Var7, n1Var2, false);
            k0 k0Var8 = m0Var.p;
            i10 = k0Var8.b;
            int i23 = k0Var8.d;
            int i24 = k0Var8.c;
            if (i24 > 0) {
                j10 += i24;
            }
            m0Var.o1(i0Var.b, i0Var.e);
            k0 k0Var9 = m0Var.p;
            k0Var9.h = j10;
            k0Var9.d += k0Var9.e;
            m0Var.H0(g1Var2, k0Var9, n1Var2, false);
            k0 k0Var10 = m0Var.p;
            i11 = k0Var10.b;
            int i25 = k0Var10.c;
            if (i25 > 0) {
                m0Var.n1(i23, i10);
                k0 k0Var11 = m0Var.p;
                k0Var11.h = i25;
                m0Var.H0(g1Var2, k0Var11, n1Var2, false);
                i10 = m0Var.p.b;
            }
        }
        if (m0Var.r() > 0) {
            if (m0Var.v ^ m0Var.w) {
                int S02 = m0Var.S0(i10, g1Var2, n1Var2, true);
                i12 = i11 + S02;
                i13 = i10 + S02;
                S0 = m0Var.T0(i12, g1Var2, n1Var2, false);
            } else {
                int T0 = m0Var.T0(i11, g1Var2, n1Var2, true);
                i12 = i11 + T0;
                i13 = i10 + T0;
                S0 = m0Var.S0(i13, g1Var2, n1Var2, false);
            }
            i11 = i12 + S0;
            i10 = i13 + S0;
        }
        if (n1Var2.k && m0Var.r() != 0 && !n1Var2.g && m0Var.y0()) {
            List list2 = (List) g1Var2.f;
            int size = list2.size();
            int H = z0.H(m0Var.q(0));
            int i26 = 0;
            int i27 = 0;
            for (int i28 = 0; i28 < size; i28++) {
                q1 q1Var = (q1) list2.get(i28);
                boolean j11 = q1Var.j();
                View view3 = q1Var.a;
                if (!j11) {
                    if ((q1Var.c() < H) != m0Var.v) {
                        i26 += m0Var.q.b(view3);
                    } else {
                        i27 += m0Var.q.b(view3);
                    }
                }
            }
            m0Var.p.k = list2;
            if (i26 > 0) {
                m0Var.o1(z0.H(m0Var.V0()), i11);
                k0 k0Var12 = m0Var.p;
                k0Var12.h = i26;
                k0Var12.c = 0;
                k0Var12.a(null);
                m0Var.H0(g1Var2, m0Var.p, n1Var2, false);
            }
            if (i27 > 0) {
                m0Var.n1(z0.H(m0Var.U0()), i10);
                k0 k0Var13 = m0Var.p;
                k0Var13.h = i27;
                k0Var13.c = 0;
                list = null;
                k0Var13.a(null);
                m0Var.H0(g1Var2, m0Var.p, n1Var2, false);
            } else {
                list = null;
            }
            m0Var.p.k = list;
        }
        if (n1Var2.g) {
            i0Var.f();
        } else {
            androidx.emoji2.text.f fVar2 = m0Var.q;
            fVar2.a = fVar2.k();
        }
        m0Var.s = m0Var.w;
    }

    public void b1(View view, View view2, int i9, int i10) {
        b("Cannot drop a view during a scroll or layout calculation");
        G0();
        f1();
        int H = z0.H(view);
        int H2 = z0.H(view2);
        char c10 = H < H2 ? (char) 1 : (char) 65535;
        if (this.v) {
            if (c10 == 1) {
                h1(H2, this.q.f() - (this.q.b(view) + this.q.d(view2)));
                return;
            } else {
                h1(H2, this.q.f() - this.q.a(view2));
                return;
            }
        }
        if (c10 == 65535) {
            h1(H2, this.q.d(view2));
        } else {
            h1(H2, this.q.a(view2) - this.q.b(view));
        }
    }

    @Override // f2.z0
    public void c0(n1 n1Var) {
        this.B = null;
        this.y = -1;
        this.A = TLObject.FLAG_31;
        this.C.f();
    }

    public final void c1(g1 g1Var, k0 k0Var) {
        q1 T;
        q1 T2;
        if (!k0Var.a || k0Var.l) {
            return;
        }
        int i9 = k0Var.g;
        int i10 = k0Var.i;
        if (k0Var.f != -1) {
            e1(g1Var, i9, i10);
            return;
        }
        int r10 = r();
        if (i9 < 0) {
            return;
        }
        int e10 = (this.q.e() - i9) + i10;
        if (this.v) {
            for (int i11 = 0; i11 < r10; i11++) {
                View q10 = q(i11);
                if (q10 != null && (T2 = this.b.T(q10)) != null && !T2.r() && (this.q.d(q10) < e10 || this.q.m(q10) < e10)) {
                    d1(g1Var, 0, i11);
                    return;
                }
            }
            return;
        }
        int i12 = r10 - 1;
        for (int i13 = i12; i13 >= 0; i13--) {
            View q11 = q(i13);
            if (q11 != null && (T = this.b.T(q11)) != null && !T.r() && (this.q.d(q11) < e10 || this.q.m(q11) < e10)) {
                d1(g1Var, i12, i13);
                return;
            }
        }
    }

    @Override // f2.z0
    public final boolean d() {
        return !this.u && this.o == 0;
    }

    public final void d1(g1 g1Var, int i9, int i10) {
        if (i9 == i10) {
            return;
        }
        if (i10 <= i9) {
            while (i9 > i10) {
                i0(i9, g1Var);
                i9--;
            }
        } else {
            for (int i11 = i10 - 1; i11 >= i9; i11--) {
                i0(i11, g1Var);
            }
        }
    }

    @Override // f2.z0
    public boolean e() {
        return !this.u && this.o == 1;
    }

    @Override // f2.z0
    public final l0 e0() {
        l0 l0Var = this.B;
        if (l0Var != null) {
            l0 l0Var2 = new l0();
            l0Var2.a = l0Var.a;
            l0Var2.b = l0Var.b;
            l0Var2.c = l0Var.c;
            return l0Var2;
        }
        l0 l0Var3 = new l0();
        if (r() <= 0) {
            l0Var3.a = -1;
            return l0Var3;
        }
        G0();
        boolean z10 = this.s ^ this.v;
        l0Var3.c = z10;
        if (z10) {
            View U0 = U0();
            l0Var3.b = this.q.f() - this.q.a(U0);
            l0Var3.a = ((a1) U0.getLayoutParams()).b();
            return l0Var3;
        }
        View V0 = V0();
        l0Var3.a = z0.H(V0);
        l0Var3.b = this.q.d(V0) - this.q.j();
        return l0Var3;
    }

    public void e1(g1 g1Var, int i9, int i10) {
        q1 T;
        q1 T2;
        if (i9 < 0) {
            return;
        }
        int i11 = i9 - i10;
        int r10 = r();
        if (!this.v) {
            for (int i12 = 0; i12 < r10; i12++) {
                View q10 = q(i12);
                if (q10 != null && (T = this.b.T(q10)) != null && !T.r() && (this.q.a(q10) > i11 || this.q.l(q10) > i11)) {
                    d1(g1Var, 0, i12);
                    return;
                }
            }
            return;
        }
        int i13 = r10 - 1;
        for (int i14 = i13; i14 >= 0; i14--) {
            View q11 = q(i14);
            if (q11 != null && (T2 = this.b.T(q11)) != null && !T2.r() && (this.q.a(q11) > i11 || this.q.l(q11) > i11)) {
                d1(g1Var, i13, i14);
                return;
            }
        }
    }

    public final void f1() {
        if (this.o == 1 || !Y0()) {
            this.v = this.t;
        } else {
            this.v = !this.t;
        }
    }

    public final int g1(int i9, g1 g1Var, n1 n1Var) {
        if (r() == 0 || i9 == 0) {
            return 0;
        }
        G0();
        this.p.a = true;
        int i10 = i9 > 0 ? 1 : -1;
        int abs = Math.abs(i9);
        m1(i10, abs, true, n1Var);
        k0 k0Var = this.p;
        int H0 = H0(g1Var, k0Var, n1Var, false) + k0Var.g;
        if (H0 < 0) {
            return 0;
        }
        if (abs > H0) {
            i9 = i10 * H0;
        }
        this.q.n(-i9);
        this.p.j = i9;
        return i9;
    }

    @Override // f2.z0
    public int h(n1 n1Var) {
        return C0(n1Var);
    }

    public void h1(int i9, int i10) {
        i1(i9, i10, this.v);
    }

    @Override // f2.z0
    public int i(n1 n1Var) {
        return D0(n1Var);
    }

    public void i1(int i9, int i10, boolean z10) {
        if (this.y == i9 && this.A == i10 && this.z == z10) {
            return;
        }
        this.y = i9;
        this.A = i10;
        this.z = z10;
        l0 l0Var = this.B;
        if (l0Var != null) {
            l0Var.a = -1;
        }
        l0();
    }

    @Override // f2.z0
    public int j(n1 n1Var) {
        return B0(n1Var);
    }

    public final void j1(int i9) {
        p0 p0Var;
        if (i9 != 0 && i9 != 1) {
            throw new IllegalArgumentException(j3.r0.l(i9, "invalid orientation:"));
        }
        b(null);
        if (i9 != this.o || this.q == null) {
            if (i9 == 0) {
                p0Var = new p0(this, 0);
            } else {
                if (i9 != 1) {
                    throw new IllegalArgumentException("invalid orientation");
                }
                p0Var = new p0(this, 1);
            }
            this.q = p0Var;
            this.C.f = p0Var;
            this.o = i9;
            l0();
        }
    }

    @Override // f2.z0
    public int k(n1 n1Var) {
        return C0(n1Var);
    }

    public void k1(boolean z10) {
        b(null);
        if (z10 == this.t) {
            return;
        }
        this.t = z10;
        l0();
    }

    @Override // f2.z0
    public int l(n1 n1Var) {
        return D0(n1Var);
    }

    public void l1(boolean z10) {
        b(null);
        if (this.w == z10) {
            return;
        }
        this.w = z10;
        l0();
    }

    @Override // f2.z0
    public final View m(int i9) {
        int r10 = r();
        if (r10 == 0) {
            return null;
        }
        int H = i9 - z0.H(q(0));
        if (H >= 0 && H < r10) {
            View q10 = q(H);
            if (z0.H(q10) == i9) {
                return q10;
            }
        }
        int r11 = r();
        for (int i10 = 0; i10 < r11; i10++) {
            View q11 = q(i10);
            q1 U = RecyclerView.U(q11);
            if (U != null && U.c() == i9 && !U.r() && (this.b.p0.g || !U.j())) {
                return q11;
            }
        }
        return null;
    }

    @Override // f2.z0
    public int m0(int i9, g1 g1Var, n1 n1Var) {
        if (this.o == 1) {
            return 0;
        }
        return g1(i9, g1Var, n1Var);
    }

    public final void m1(int i9, int i10, boolean z10, n1 n1Var) {
        int j10;
        this.p.l = this.q.h() == 0 && this.q.e() == 0;
        this.p.f = i9;
        int[] iArr = this.F;
        iArr[0] = 0;
        iArr[1] = 0;
        z0(n1Var, iArr);
        int max = Math.max(0, iArr[0]);
        int max2 = Math.max(0, iArr[1]);
        boolean z11 = i9 == 1;
        k0 k0Var = this.p;
        int i11 = z11 ? max2 : max;
        k0Var.h = i11;
        if (!z11) {
            max = max2;
        }
        k0Var.i = max;
        if (z11) {
            k0Var.h = this.q.g() + i11;
            View U0 = U0();
            k0 k0Var2 = this.p;
            k0Var2.e = this.v ? -1 : 1;
            int H = z0.H(U0);
            k0 k0Var3 = this.p;
            k0Var2.d = H + k0Var3.e;
            k0Var3.b = this.q.a(U0);
            j10 = this.q.a(U0) - this.q.f();
        } else {
            View V0 = V0();
            k0 k0Var4 = this.p;
            k0Var4.h = this.q.j() + k0Var4.h;
            k0 k0Var5 = this.p;
            k0Var5.e = this.v ? 1 : -1;
            int H2 = z0.H(V0);
            k0 k0Var6 = this.p;
            k0Var5.d = H2 + k0Var6.e;
            k0Var6.b = this.q.d(V0);
            j10 = (-this.q.d(V0)) + this.q.j();
        }
        k0 k0Var7 = this.p;
        k0Var7.c = i10;
        if (z10) {
            k0Var7.c = i10 - j10;
        }
        k0Var7.g = j10;
    }

    @Override // f2.z0
    public a1 n() {
        return new a1(-2, -2);
    }

    @Override // f2.z0
    public void n0(int i9) {
        this.y = i9;
        this.A = TLObject.FLAG_31;
        l0 l0Var = this.B;
        if (l0Var != null) {
            l0Var.a = -1;
        }
        l0();
    }

    public final void n1(int i9, int i10) {
        this.p.c = this.q.f() - i10;
        k0 k0Var = this.p;
        k0Var.e = this.v ? -1 : 1;
        k0Var.d = i9;
        k0Var.f = 1;
        k0Var.b = i10;
        k0Var.g = TLObject.FLAG_31;
    }

    @Override // f2.z0
    public int o0(int i9, g1 g1Var, n1 n1Var) {
        if (this.o == 0) {
            return 0;
        }
        return g1(i9, g1Var, n1Var);
    }

    public final void o1(int i9, int i10) {
        this.p.c = i10 - this.q.j();
        k0 k0Var = this.p;
        k0Var.d = i9;
        k0Var.e = this.v ? 1 : -1;
        k0Var.f = -1;
        k0Var.b = i10;
        k0Var.g = TLObject.FLAG_31;
    }

    @Override // f2.z0
    public void v0(RecyclerView recyclerView, n1 n1Var, int i9) {
        n0 n0Var = new n0(recyclerView.getContext());
        n0Var.a = i9;
        w0(n0Var);
    }

    @Override // f2.z0
    public boolean y0() {
        return this.B == null && this.s == this.w;
    }

    public void z0(n1 n1Var, int[] iArr) {
        int i9;
        int W0 = W0(n1Var);
        if (this.p.f == -1) {
            i9 = 0;
        } else {
            i9 = W0;
            W0 = 0;
        }
        iArr[0] = W0;
        iArr[1] = i9;
    }

    public m0(int i9, boolean z10) {
        this.o = 1;
        this.r = false;
        this.t = false;
        this.u = false;
        this.v = false;
        this.w = false;
        this.x = true;
        this.y = -1;
        this.z = true;
        this.A = TLObject.FLAG_31;
        this.B = null;
        i0 i0Var = new i0();
        i0Var.f();
        this.C = i0Var;
        this.D = new j0();
        this.E = 2;
        this.F = new int[2];
        this.G = true;
        this.H = true;
        j1(i9);
        k1(z10);
    }

    public void a1(g1 g1Var, n1 n1Var, i0 i0Var, int i9) {
    }
}
