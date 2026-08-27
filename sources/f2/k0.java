package f2;

import android.graphics.PointF;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;
import java.util.WeakHashMap;
import org.telegram.messenger.LiteMode;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public class k0 extends x0 {
    public int A;
    public j0 B;
    public final g0 C;
    public final h0 D;
    public int E;
    public final int[] F;
    public boolean G;
    public boolean H;
    public int o;
    public i0 p;
    public androidx.emoji2.text.g q;
    public boolean r;
    public boolean s;
    public boolean t;
    public boolean u;
    public boolean v;
    public boolean w;
    public final boolean x;
    public int y;
    public boolean z;

    public k0() {
        this(1, false);
    }

    public void A0(l1 l1Var, i0 i0Var, androidx.datastore.preferences.protobuf.i iVar) {
        int i10 = i0Var.d;
        if (i10 < 0 || i10 >= l1Var.b()) {
            return;
        }
        iVar.a(i10, Math.max(0, i0Var.g));
    }

    public final int B0(l1 l1Var) {
        if (r() == 0) {
            return 0;
        }
        G0();
        androidx.emoji2.text.g gVar = this.q;
        boolean z10 = this.x;
        boolean z11 = !z10;
        View K0 = K0(z11);
        View J0 = J0(z11);
        if (r() == 0 || l1Var.b() == 0 || K0 == null || J0 == null) {
            return 0;
        }
        if (!z10) {
            return Math.abs(((y0) K0.getLayoutParams()).b() - ((y0) J0.getLayoutParams()).b()) + 1;
        }
        return Math.min(gVar.k(), gVar.a(J0) - gVar.d(K0));
    }

    public final int C0(l1 l1Var) {
        if (r() != 0) {
            G0();
            androidx.emoji2.text.g gVar = this.q;
            boolean z10 = this.x;
            boolean z11 = !z10;
            View K0 = K0(z11);
            View J0 = J0(z11);
            boolean z12 = this.v;
            if (r() != 0 && l1Var.b() != 0 && K0 != null && J0 != null) {
                int max = z12 ? Math.max(0, (l1Var.b() - Math.max(((y0) K0.getLayoutParams()).b(), ((y0) J0.getLayoutParams()).b())) - 1) : Math.max(0, Math.min(((y0) K0.getLayoutParams()).b(), ((y0) J0.getLayoutParams()).b()));
                if (z10) {
                    return Math.round((max * (Math.abs(gVar.a(J0) - gVar.d(K0)) / (Math.abs(((y0) K0.getLayoutParams()).b() - ((y0) J0.getLayoutParams()).b()) + 1))) + (gVar.j() - gVar.d(K0)));
                }
                return max;
            }
        }
        return 0;
    }

    public final int D0(l1 l1Var) {
        if (r() == 0) {
            return 0;
        }
        G0();
        androidx.emoji2.text.g gVar = this.q;
        boolean z10 = this.x;
        boolean z11 = !z10;
        View K0 = K0(z11);
        View J0 = J0(z11);
        if (r() == 0 || l1Var.b() == 0 || K0 == null || J0 == null) {
            return 0;
        }
        if (!z10) {
            return l1Var.b();
        }
        return (int) (((gVar.a(J0) - gVar.d(K0)) / (Math.abs(((y0) K0.getLayoutParams()).b() - ((y0) J0.getLayoutParams()).b()) + 1)) * l1Var.b());
    }

    public final PointF E0(int i10) {
        if (r() == 0) {
            return null;
        }
        int i11 = (i10 < x0.H(q(0))) != this.v ? -1 : 1;
        return this.o == 0 ? new PointF(i11, 0.0f) : new PointF(0.0f, i11);
    }

    public final int F0(int i10) {
        if (i10 == 1) {
            return (this.o != 1 && Y0()) ? 1 : -1;
        }
        if (i10 == 2) {
            return (this.o != 1 && Y0()) ? -1 : 1;
        }
        if (i10 == 17) {
            if (this.o == 0) {
                return -1;
            }
            return TLObject.FLAG_31;
        }
        if (i10 == 33) {
            if (this.o == 1) {
                return -1;
            }
            return TLObject.FLAG_31;
        }
        if (i10 == 66) {
            if (this.o == 0) {
                return 1;
            }
            return TLObject.FLAG_31;
        }
        if (i10 == 130 && this.o == 1) {
            return 1;
        }
        return TLObject.FLAG_31;
    }

    public final void G0() {
        if (this.p == null) {
            i0 i0Var = new i0();
            i0Var.a = true;
            i0Var.h = 0;
            i0Var.i = 0;
            i0Var.k = null;
            this.p = i0Var;
        }
    }

    public final int H0(e1 e1Var, i0 i0Var, l1 l1Var, boolean z10) {
        int i10 = i0Var.c;
        int i11 = i0Var.g;
        if (i11 != Integer.MIN_VALUE) {
            if (i10 < 0) {
                i0Var.g = i11 + i10;
            }
            c1(e1Var, i0Var);
        }
        int i12 = i0Var.c + i0Var.h;
        while (true) {
            if ((!i0Var.l && i12 <= 0) || !i0Var.b(l1Var)) {
                break;
            }
            h0 h0Var = this.D;
            h0Var.a = 0;
            h0Var.b = false;
            h0Var.c = false;
            h0Var.d = false;
            Z0(e1Var, l1Var, i0Var, h0Var);
            if (!h0Var.b) {
                int i13 = i0Var.b;
                int i14 = h0Var.a;
                i0Var.b = (i0Var.f * i14) + i13;
                if (!h0Var.c || i0Var.k != null || !l1Var.g) {
                    i0Var.c -= i14;
                    i12 -= i14;
                }
                int i15 = i0Var.g;
                if (i15 != Integer.MIN_VALUE) {
                    int i16 = i15 + i14;
                    i0Var.g = i16;
                    int i17 = i0Var.c;
                    if (i17 < 0) {
                        i0Var.g = i16 + i17;
                    }
                    c1(e1Var, i0Var);
                }
                if (z10 && h0Var.d) {
                    break;
                }
            } else {
                break;
            }
        }
        return i10 - i0Var.c;
    }

    public final int I0() {
        View P0 = P0(0, r(), true, false);
        if (P0 == null) {
            return -1;
        }
        return ((y0) P0.getLayoutParams()).b();
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
        return ((y0) P0.getLayoutParams()).b();
    }

    public final int M0() {
        View P0 = P0(r() - 1, -1, true, false);
        if (P0 == null) {
            return -1;
        }
        return ((y0) P0.getLayoutParams()).b();
    }

    public final int N0() {
        View P0 = P0(r() - 1, -1, false, true);
        if (P0 == null) {
            return -1;
        }
        return ((y0) P0.getLayoutParams()).b();
    }

    public final View O0(int i10, int i11) {
        int i12;
        int i13;
        G0();
        if (i11 <= i10 && i11 >= i10) {
            return q(i10);
        }
        if (this.q.d(q(i10)) < this.q.j()) {
            i12 = 16644;
            i13 = LiteMode.FLAG_ANIMATED_EMOJI_KEYBOARD;
        } else {
            i12 = 4161;
            i13 = 4097;
        }
        return this.o == 0 ? this.c.B(i10, i11, i12, i13) : this.d.B(i10, i11, i12, i13);
    }

    public final View P0(int i10, int i11, boolean z10, boolean z11) {
        G0();
        int i12 = z10 ? 24579 : 320;
        int i13 = z11 ? 320 : 0;
        return this.o == 0 ? this.c.B(i10, i11, i12, i13) : this.d.B(i10, i11, i12, i13);
    }

    public View Q0(e1 e1Var, l1 l1Var, int i10, int i11, int i12) {
        G0();
        int j10 = this.r ? 0 : this.q.j();
        int f10 = this.q.f();
        int i13 = i11 > i10 ? 1 : -1;
        View view = null;
        View view2 = null;
        while (i10 != i11) {
            View q6 = q(i10);
            int H = x0.H(q6);
            if (H >= 0 && H < i12) {
                if (((y0) q6.getLayoutParams()).a.j()) {
                    if (view2 == null) {
                        view2 = q6;
                    }
                } else {
                    if (this.q.d(q6) < f10 && this.q.a(q6) >= j10) {
                        return q6;
                    }
                    if (view == null) {
                        view = q6;
                    }
                }
            }
            i10 += i13;
        }
        return view != null ? view : view2;
    }

    @Override // f2.x0
    public View R(View view, int i10, e1 e1Var, l1 l1Var) {
        int F0;
        f1();
        if (r() != 0 && (F0 = F0(i10)) != Integer.MIN_VALUE) {
            G0();
            m1(F0, (int) (this.q.k() * 0.33333334f), false, l1Var);
            i0 i0Var = this.p;
            i0Var.g = TLObject.FLAG_31;
            i0Var.a = false;
            H0(e1Var, i0Var, l1Var, true);
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

    public final int S0(int i10, e1 e1Var, l1 l1Var, boolean z10) {
        int f10;
        int f11;
        if (!this.G || !this.H || (f10 = this.q.f() - i10) <= 0) {
            return 0;
        }
        int i11 = -g1(-f10, e1Var, l1Var);
        int i12 = i10 + i11;
        if (!z10 || (f11 = this.q.f() - i12) <= 0) {
            return i11;
        }
        this.q.n(f11);
        return f11 + i11;
    }

    public final int T0(int i10, e1 e1Var, l1 l1Var, boolean z10) {
        int X0;
        int j10;
        if (!this.G || (X0 = i10 - X0()) <= 0) {
            return 0;
        }
        int i11 = -g1(X0, e1Var, l1Var);
        int i12 = i10 + i11;
        if (!z10 || (j10 = i12 - this.q.j()) <= 0) {
            return i11;
        }
        this.q.n(-j10);
        return i11 - j10;
    }

    public final View U0() {
        return q(this.v ? 0 : r() - 1);
    }

    public final View V0() {
        return q(this.v ? r() - 1 : 0);
    }

    public int W0(l1 l1Var) {
        if (l1Var.a != -1) {
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

    public void Z0(e1 e1Var, l1 l1Var, i0 i0Var, h0 h0Var) {
        int i10;
        int i11;
        int i12;
        int i13;
        View c10 = i0Var.c(e1Var);
        if (c10 == null) {
            h0Var.b = true;
            return;
        }
        y0 y0Var = (y0) c10.getLayoutParams();
        if (i0Var.k == null) {
            if (this.v == (i0Var.f == -1)) {
                a(c10, -1, false);
            } else {
                a(c10, 0, false);
            }
        } else {
            if (this.v == (i0Var.f == -1)) {
                a(c10, -1, true);
            } else {
                a(c10, 0, true);
            }
        }
        P(c10);
        h0Var.a = this.q.b(c10);
        if (this.o == 1) {
            if (Y0()) {
                i13 = this.m - E();
                i10 = i13 - this.q.c(c10);
            } else {
                i10 = D();
                i13 = this.q.c(c10) + i10;
            }
            if (i0Var.f == -1) {
                i11 = i0Var.b;
                i12 = i11 - h0Var.a;
            } else {
                i12 = i0Var.b;
                i11 = h0Var.a + i12;
            }
        } else {
            int F = F();
            int c11 = this.q.c(c10) + F;
            if (i0Var.f == -1) {
                int i14 = i0Var.b;
                int i15 = i14 - h0Var.a;
                i13 = i14;
                i11 = c11;
                i10 = i15;
                i12 = F;
            } else {
                int i16 = i0Var.b;
                int i17 = h0Var.a + i16;
                i10 = i16;
                i11 = c11;
                i12 = F;
                i13 = i17;
            }
        }
        x0.O(c10, i10, i12, i13, i11);
        if (y0Var.a.j() || y0Var.a.m()) {
            h0Var.c = true;
        }
        h0Var.d = c10.hasFocusable();
    }

    @Override // f2.x0
    public final void b(String str) {
        RecyclerView recyclerView;
        if (this.B != null || (recyclerView = this.b) == null) {
            return;
        }
        recyclerView.l(str);
    }

    /* JADX WARN: Removed duplicated region for block: B:203:0x029b  */
    /* JADX WARN: Removed duplicated region for block: B:205:0x02a1  */
    @Override // f2.x0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void b0(e1 e1Var, l1 l1Var) {
        View view;
        View view2;
        e1 e1Var2;
        View Q0;
        int i10;
        int d;
        int i11;
        int i12;
        List list;
        int i13;
        int i14;
        int S0;
        int i15;
        View m10;
        int d10;
        int i16;
        int i17;
        k0 k0Var = this;
        l1 l1Var2 = l1Var;
        int i18 = -1;
        if (!(k0Var.B == null && k0Var.y == -1) && l1Var2.b() == 0) {
            g0(e1Var);
            return;
        }
        j0 j0Var = k0Var.B;
        if (j0Var != null && (i17 = j0Var.a) >= 0) {
            k0Var.y = i17;
        }
        k0Var.G0();
        k0Var.p.a = false;
        k0Var.f1();
        RecyclerView recyclerView = k0Var.b;
        if (recyclerView == null || (view = recyclerView.getFocusedChild()) == null || ((ArrayList) k0Var.a.d).contains(view)) {
            view = null;
        }
        g0 g0Var = k0Var.C;
        if (g0Var.d && k0Var.y == -1 && k0Var.B == null) {
            if (view != null && (k0Var.q.d(view) >= k0Var.q.f() || k0Var.q.a(view) <= k0Var.q.j())) {
                g0Var.d(((y0) view.getLayoutParams()).b(), view);
            }
            e1Var2 = e1Var;
        } else {
            g0Var.f();
            g0Var.c = k0Var.v ^ k0Var.w;
            if (!l1Var2.g && (i10 = k0Var.y) != -1) {
                if (i10 < 0 || i10 >= l1Var2.b()) {
                    k0Var.y = -1;
                    k0Var.A = TLObject.FLAG_31;
                } else {
                    int i19 = k0Var.y;
                    g0Var.b = i19;
                    j0 j0Var2 = k0Var.B;
                    if (j0Var2 != null && j0Var2.a >= 0) {
                        boolean z10 = j0Var2.c;
                        g0Var.c = z10;
                        if (z10) {
                            g0Var.e = k0Var.q.f() - k0Var.B.b;
                        } else {
                            g0Var.e = k0Var.q.j() + k0Var.B.b;
                        }
                    } else if (k0Var.A == Integer.MIN_VALUE) {
                        View m11 = k0Var.m(i19);
                        if (m11 == null) {
                            if (k0Var.r() > 0) {
                                g0Var.c = (k0Var.y < x0.H(k0Var.q(0))) == k0Var.z;
                            }
                            g0Var.b();
                        } else if (k0Var.q.b(m11) > k0Var.q.k()) {
                            g0Var.b();
                        } else if (k0Var.q.d(m11) - k0Var.q.j() < 0) {
                            g0Var.e = k0Var.q.j();
                            g0Var.c = false;
                        } else if (k0Var.q.f() - k0Var.q.a(m11) < 0) {
                            g0Var.e = k0Var.q.f();
                            g0Var.c = true;
                        } else {
                            if (g0Var.c) {
                                int a2 = k0Var.q.a(m11);
                                androidx.emoji2.text.g gVar = k0Var.q;
                                d = (Integer.MIN_VALUE == gVar.a ? 0 : gVar.k() - gVar.a) + a2;
                            } else {
                                d = k0Var.q.d(m11);
                            }
                            g0Var.e = d;
                        }
                    } else {
                        boolean z11 = k0Var.z;
                        g0Var.c = z11;
                        if (z11) {
                            g0Var.e = k0Var.q.f() - k0Var.A;
                        } else {
                            g0Var.e = k0Var.q.j() + k0Var.A;
                        }
                    }
                    e1Var2 = e1Var;
                    g0Var.d = true;
                }
            }
            if (k0Var.r() != 0) {
                RecyclerView recyclerView2 = k0Var.b;
                if (recyclerView2 == null || (view2 = recyclerView2.getFocusedChild()) == null || ((ArrayList) k0Var.a.d).contains(view2)) {
                    view2 = null;
                }
                if (view2 != null) {
                    y0 y0Var = (y0) view2.getLayoutParams();
                    if (!y0Var.a.j() && y0Var.b() >= 0 && y0Var.b() < l1Var2.b()) {
                        g0Var.d(((y0) view2.getLayoutParams()).b(), view2);
                        e1Var2 = e1Var;
                        g0Var.d = true;
                    }
                }
                if (k0Var.s == k0Var.w) {
                    if (g0Var.c) {
                        if (k0Var.v) {
                            Q0 = k0Var.Q0(e1Var, l1Var2, 0, k0Var.r(), l1Var2.b());
                            k0Var = this;
                        } else {
                            k0Var = this;
                            Q0 = k0Var.Q0(e1Var, l1Var, r() - 1, -1, l1Var.b());
                        }
                        e1Var2 = e1Var;
                        l1Var2 = l1Var;
                    } else if (k0Var.v) {
                        e1Var2 = e1Var;
                        l1Var2 = l1Var;
                        Q0 = k0Var.Q0(e1Var2, l1Var2, k0Var.r() - 1, -1, l1Var.b());
                        k0Var = this;
                    } else {
                        k0Var = this;
                        e1Var2 = e1Var;
                        l1Var2 = l1Var;
                        Q0 = k0Var.Q0(e1Var2, l1Var2, 0, r(), l1Var.b());
                    }
                    if (Q0 != null) {
                        g0Var.c(((y0) Q0.getLayoutParams()).b(), Q0);
                        if (!l1Var2.g && k0Var.y0() && (k0Var.q.d(Q0) >= k0Var.q.f() || k0Var.q.a(Q0) < k0Var.q.j())) {
                            g0Var.e = g0Var.c ? k0Var.q.f() : k0Var.q.j();
                        }
                        g0Var.d = true;
                    }
                    g0Var.b();
                    g0Var.b = !k0Var.w ? l1Var2.b() - 1 : k0Var.R0();
                    g0Var.d = true;
                }
            }
            e1Var2 = e1Var;
            g0Var.b();
            g0Var.b = !k0Var.w ? l1Var2.b() - 1 : k0Var.R0();
            g0Var.d = true;
        }
        i0 i0Var = k0Var.p;
        i0Var.f = i0Var.j >= 0 ? 1 : -1;
        int[] iArr = k0Var.F;
        iArr[0] = 0;
        iArr[1] = 0;
        k0Var.z0(l1Var2, iArr);
        int j10 = k0Var.q.j() + Math.max(0, iArr[0]);
        int g10 = k0Var.q.g() + Math.max(0, iArr[1]);
        if (l1Var2.g && (i15 = k0Var.y) != -1 && k0Var.A != Integer.MIN_VALUE && (m10 = k0Var.m(i15)) != null) {
            if (k0Var.z) {
                i16 = k0Var.q.f() - k0Var.q.a(m10);
                d10 = k0Var.A;
            } else {
                d10 = k0Var.q.d(m10) - k0Var.q.j();
                i16 = k0Var.A;
            }
            int i20 = i16 - d10;
            if (i20 > 0) {
                j10 += i20;
            } else {
                g10 -= i20;
            }
        }
        if (!g0Var.c ? !k0Var.v : k0Var.v) {
            i18 = 1;
        }
        k0Var.a1(e1Var2, l1Var2, g0Var, i18);
        for (int r10 = k0Var.r() - 1; r10 >= 0; r10--) {
            View q6 = k0Var.q(r10);
            o1 U = RecyclerView.U(q6);
            if (U != null && !U.r()) {
                if (!U.h() || U.j() || k0Var.b.w.b) {
                    k0Var.q(r10);
                    k0Var.a.k(r10);
                    e1Var2.i(q6);
                    k0Var.b.f.N(U);
                } else {
                    k0Var.j0(r10);
                    e1Var2.h(U);
                }
            }
        }
        k0Var.p.l = k0Var.q.h() == 0 && k0Var.q.e() == 0;
        k0Var.p.getClass();
        k0Var.p.i = 0;
        if (g0Var.c) {
            k0Var.o1(g0Var.b, g0Var.e);
            i0 i0Var2 = k0Var.p;
            i0Var2.h = j10;
            k0Var.H0(e1Var2, i0Var2, l1Var2, false);
            i0 i0Var3 = k0Var.p;
            i12 = i0Var3.b;
            int i21 = i0Var3.d;
            int i22 = i0Var3.c;
            if (i22 > 0) {
                g10 += i22;
            }
            k0Var.n1(g0Var.b, g0Var.e);
            i0 i0Var4 = k0Var.p;
            i0Var4.h = g10;
            i0Var4.d += i0Var4.e;
            k0Var.H0(e1Var2, i0Var4, l1Var2, false);
            i0 i0Var5 = k0Var.p;
            i11 = i0Var5.b;
            int i23 = i0Var5.c;
            if (i23 > 0) {
                k0Var.o1(i21, i12);
                i0 i0Var6 = k0Var.p;
                i0Var6.h = i23;
                k0Var.H0(e1Var2, i0Var6, l1Var2, false);
                i12 = k0Var.p.b;
            }
        } else {
            k0Var.n1(g0Var.b, g0Var.e);
            i0 i0Var7 = k0Var.p;
            i0Var7.h = g10;
            k0Var.H0(e1Var2, i0Var7, l1Var2, false);
            i0 i0Var8 = k0Var.p;
            i11 = i0Var8.b;
            int i24 = i0Var8.d;
            int i25 = i0Var8.c;
            if (i25 > 0) {
                j10 += i25;
            }
            k0Var.o1(g0Var.b, g0Var.e);
            i0 i0Var9 = k0Var.p;
            i0Var9.h = j10;
            i0Var9.d += i0Var9.e;
            k0Var.H0(e1Var2, i0Var9, l1Var2, false);
            i0 i0Var10 = k0Var.p;
            i12 = i0Var10.b;
            int i26 = i0Var10.c;
            if (i26 > 0) {
                k0Var.n1(i24, i11);
                i0 i0Var11 = k0Var.p;
                i0Var11.h = i26;
                k0Var.H0(e1Var2, i0Var11, l1Var2, false);
                i11 = k0Var.p.b;
            }
        }
        if (k0Var.r() > 0) {
            if (k0Var.v ^ k0Var.w) {
                int S02 = k0Var.S0(i11, e1Var2, l1Var2, true);
                i13 = i12 + S02;
                i14 = i11 + S02;
                S0 = k0Var.T0(i13, e1Var2, l1Var2, false);
            } else {
                int T0 = k0Var.T0(i12, e1Var2, l1Var2, true);
                i13 = i12 + T0;
                i14 = i11 + T0;
                S0 = k0Var.S0(i14, e1Var2, l1Var2, false);
            }
            i12 = i13 + S0;
            i11 = i14 + S0;
        }
        if (l1Var2.k && k0Var.r() != 0 && !l1Var2.g && k0Var.y0()) {
            List list2 = (List) e1Var2.f;
            int size = list2.size();
            int H = x0.H(k0Var.q(0));
            int i27 = 0;
            int i28 = 0;
            for (int i29 = 0; i29 < size; i29++) {
                o1 o1Var = (o1) list2.get(i29);
                boolean j11 = o1Var.j();
                View view3 = o1Var.a;
                if (!j11) {
                    if ((o1Var.c() < H) != k0Var.v) {
                        i27 += k0Var.q.b(view3);
                    } else {
                        i28 += k0Var.q.b(view3);
                    }
                }
            }
            k0Var.p.k = list2;
            if (i27 > 0) {
                k0Var.o1(x0.H(k0Var.V0()), i12);
                i0 i0Var12 = k0Var.p;
                i0Var12.h = i27;
                i0Var12.c = 0;
                i0Var12.a(null);
                k0Var.H0(e1Var2, k0Var.p, l1Var2, false);
            }
            if (i28 > 0) {
                k0Var.n1(x0.H(k0Var.U0()), i11);
                i0 i0Var13 = k0Var.p;
                i0Var13.h = i28;
                i0Var13.c = 0;
                list = null;
                i0Var13.a(null);
                k0Var.H0(e1Var2, k0Var.p, l1Var2, false);
            } else {
                list = null;
            }
            k0Var.p.k = list;
        }
        if (l1Var2.g) {
            g0Var.f();
        } else {
            androidx.emoji2.text.g gVar2 = k0Var.q;
            gVar2.a = gVar2.k();
        }
        k0Var.s = k0Var.w;
    }

    public void b1(View view, View view2, int i10, int i11) {
        b("Cannot drop a view during a scroll or layout calculation");
        G0();
        f1();
        int H = x0.H(view);
        int H2 = x0.H(view2);
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

    @Override // f2.x0
    public void c0(l1 l1Var) {
        this.B = null;
        this.y = -1;
        this.A = TLObject.FLAG_31;
        this.C.f();
    }

    public final void c1(e1 e1Var, i0 i0Var) {
        o1 T;
        o1 T2;
        if (!i0Var.a || i0Var.l) {
            return;
        }
        int i10 = i0Var.g;
        int i11 = i0Var.i;
        if (i0Var.f != -1) {
            e1(e1Var, i10, i11);
            return;
        }
        int r10 = r();
        if (i10 < 0) {
            return;
        }
        int e9 = (this.q.e() - i10) + i11;
        if (this.v) {
            for (int i12 = 0; i12 < r10; i12++) {
                View q6 = q(i12);
                if (q6 != null && (T2 = this.b.T(q6)) != null && !T2.r() && (this.q.d(q6) < e9 || this.q.m(q6) < e9)) {
                    d1(e1Var, 0, i12);
                    return;
                }
            }
            return;
        }
        int i13 = r10 - 1;
        for (int i14 = i13; i14 >= 0; i14--) {
            View q9 = q(i14);
            if (q9 != null && (T = this.b.T(q9)) != null && !T.r() && (this.q.d(q9) < e9 || this.q.m(q9) < e9)) {
                d1(e1Var, i13, i14);
                return;
            }
        }
    }

    @Override // f2.x0
    public final boolean d() {
        return !this.u && this.o == 0;
    }

    public final void d1(e1 e1Var, int i10, int i11) {
        if (i10 == i11) {
            return;
        }
        if (i11 <= i10) {
            while (i10 > i11) {
                i0(i10, e1Var);
                i10--;
            }
        } else {
            for (int i12 = i11 - 1; i12 >= i10; i12--) {
                i0(i12, e1Var);
            }
        }
    }

    @Override // f2.x0
    public boolean e() {
        return !this.u && this.o == 1;
    }

    @Override // f2.x0
    public final j0 e0() {
        j0 j0Var = this.B;
        if (j0Var != null) {
            j0 j0Var2 = new j0();
            j0Var2.a = j0Var.a;
            j0Var2.b = j0Var.b;
            j0Var2.c = j0Var.c;
            return j0Var2;
        }
        j0 j0Var3 = new j0();
        if (r() <= 0) {
            j0Var3.a = -1;
            return j0Var3;
        }
        G0();
        boolean z10 = this.s ^ this.v;
        j0Var3.c = z10;
        if (z10) {
            View U0 = U0();
            j0Var3.b = this.q.f() - this.q.a(U0);
            j0Var3.a = ((y0) U0.getLayoutParams()).b();
            return j0Var3;
        }
        View V0 = V0();
        j0Var3.a = x0.H(V0);
        j0Var3.b = this.q.d(V0) - this.q.j();
        return j0Var3;
    }

    public void e1(e1 e1Var, int i10, int i11) {
        o1 T;
        o1 T2;
        if (i10 < 0) {
            return;
        }
        int i12 = i10 - i11;
        int r10 = r();
        if (!this.v) {
            for (int i13 = 0; i13 < r10; i13++) {
                View q6 = q(i13);
                if (q6 != null && (T = this.b.T(q6)) != null && !T.r() && (this.q.a(q6) > i12 || this.q.l(q6) > i12)) {
                    d1(e1Var, 0, i13);
                    return;
                }
            }
            return;
        }
        int i14 = r10 - 1;
        for (int i15 = i14; i15 >= 0; i15--) {
            View q9 = q(i15);
            if (q9 != null && (T2 = this.b.T(q9)) != null && !T2.r() && (this.q.a(q9) > i12 || this.q.l(q9) > i12)) {
                d1(e1Var, i14, i15);
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

    public final int g1(int i10, e1 e1Var, l1 l1Var) {
        if (r() == 0 || i10 == 0) {
            return 0;
        }
        G0();
        this.p.a = true;
        int i11 = i10 > 0 ? 1 : -1;
        int abs = Math.abs(i10);
        m1(i11, abs, true, l1Var);
        i0 i0Var = this.p;
        int H0 = H0(e1Var, i0Var, l1Var, false) + i0Var.g;
        if (H0 < 0) {
            return 0;
        }
        if (abs > H0) {
            i10 = i11 * H0;
        }
        this.q.n(-i10);
        this.p.j = i10;
        return i10;
    }

    @Override // f2.x0
    public int h(l1 l1Var) {
        return C0(l1Var);
    }

    public void h1(int i10, int i11) {
        i1(i10, i11, this.v);
    }

    @Override // f2.x0
    public int i(l1 l1Var) {
        return D0(l1Var);
    }

    public void i1(int i10, int i11, boolean z10) {
        if (this.y == i10 && this.A == i11 && this.z == z10) {
            return;
        }
        this.y = i10;
        this.A = i11;
        this.z = z10;
        j0 j0Var = this.B;
        if (j0Var != null) {
            j0Var.a = -1;
        }
        l0();
    }

    @Override // f2.x0
    public int j(l1 l1Var) {
        return B0(l1Var);
    }

    public final void j1(int i10) {
        n0 n0Var;
        if (i10 != 0 && i10 != 1) {
            throw new IllegalArgumentException(i0.a.k(i10, "invalid orientation:"));
        }
        b(null);
        if (i10 != this.o || this.q == null) {
            if (i10 == 0) {
                n0Var = new n0(this, 0);
            } else {
                if (i10 != 1) {
                    throw new IllegalArgumentException("invalid orientation");
                }
                n0Var = new n0(this, 1);
            }
            this.q = n0Var;
            this.C.f = n0Var;
            this.o = i10;
            l0();
        }
    }

    @Override // f2.x0
    public int k(l1 l1Var) {
        return C0(l1Var);
    }

    public void k1(boolean z10) {
        b(null);
        if (z10 == this.t) {
            return;
        }
        this.t = z10;
        l0();
    }

    @Override // f2.x0
    public int l(l1 l1Var) {
        return D0(l1Var);
    }

    public void l1(boolean z10) {
        b(null);
        if (this.w == z10) {
            return;
        }
        this.w = z10;
        l0();
    }

    @Override // f2.x0
    public final View m(int i10) {
        int r10 = r();
        if (r10 == 0) {
            return null;
        }
        int H = i10 - x0.H(q(0));
        if (H >= 0 && H < r10) {
            View q6 = q(H);
            if (x0.H(q6) == i10) {
                return q6;
            }
        }
        int r11 = r();
        for (int i11 = 0; i11 < r11; i11++) {
            View q9 = q(i11);
            o1 U = RecyclerView.U(q9);
            if (U != null && U.c() == i10 && !U.r() && (this.b.p0.g || !U.j())) {
                return q9;
            }
        }
        return null;
    }

    @Override // f2.x0
    public int m0(int i10, e1 e1Var, l1 l1Var) {
        if (this.o == 1) {
            return 0;
        }
        return g1(i10, e1Var, l1Var);
    }

    public final void m1(int i10, int i11, boolean z10, l1 l1Var) {
        int j10;
        this.p.l = this.q.h() == 0 && this.q.e() == 0;
        this.p.f = i10;
        int[] iArr = this.F;
        iArr[0] = 0;
        iArr[1] = 0;
        z0(l1Var, iArr);
        int max = Math.max(0, iArr[0]);
        int max2 = Math.max(0, iArr[1]);
        boolean z11 = i10 == 1;
        i0 i0Var = this.p;
        int i12 = z11 ? max2 : max;
        i0Var.h = i12;
        if (!z11) {
            max = max2;
        }
        i0Var.i = max;
        if (z11) {
            i0Var.h = this.q.g() + i12;
            View U0 = U0();
            i0 i0Var2 = this.p;
            i0Var2.e = this.v ? -1 : 1;
            int H = x0.H(U0);
            i0 i0Var3 = this.p;
            i0Var2.d = H + i0Var3.e;
            i0Var3.b = this.q.a(U0);
            j10 = this.q.a(U0) - this.q.f();
        } else {
            View V0 = V0();
            i0 i0Var4 = this.p;
            i0Var4.h = this.q.j() + i0Var4.h;
            i0 i0Var5 = this.p;
            i0Var5.e = this.v ? 1 : -1;
            int H2 = x0.H(V0);
            i0 i0Var6 = this.p;
            i0Var5.d = H2 + i0Var6.e;
            i0Var6.b = this.q.d(V0);
            j10 = (-this.q.d(V0)) + this.q.j();
        }
        i0 i0Var7 = this.p;
        i0Var7.c = i11;
        if (z10) {
            i0Var7.c = i11 - j10;
        }
        i0Var7.g = j10;
    }

    @Override // f2.x0
    public y0 n() {
        return new y0(-2, -2);
    }

    @Override // f2.x0
    public void n0(int i10) {
        this.y = i10;
        this.A = TLObject.FLAG_31;
        j0 j0Var = this.B;
        if (j0Var != null) {
            j0Var.a = -1;
        }
        l0();
    }

    public final void n1(int i10, int i11) {
        this.p.c = this.q.f() - i11;
        i0 i0Var = this.p;
        i0Var.e = this.v ? -1 : 1;
        i0Var.d = i10;
        i0Var.f = 1;
        i0Var.b = i11;
        i0Var.g = TLObject.FLAG_31;
    }

    @Override // f2.x0
    public int o0(int i10, e1 e1Var, l1 l1Var) {
        if (this.o == 0) {
            return 0;
        }
        return g1(i10, e1Var, l1Var);
    }

    public final void o1(int i10, int i11) {
        this.p.c = i11 - this.q.j();
        i0 i0Var = this.p;
        i0Var.d = i10;
        i0Var.e = this.v ? 1 : -1;
        i0Var.f = -1;
        i0Var.b = i11;
        i0Var.g = TLObject.FLAG_31;
    }

    @Override // f2.x0
    public void v0(RecyclerView recyclerView, l1 l1Var, int i10) {
        l0 l0Var = new l0(recyclerView.getContext());
        l0Var.a = i10;
        w0(l0Var);
    }

    @Override // f2.x0
    public boolean y0() {
        return this.B == null && this.s == this.w;
    }

    public void z0(l1 l1Var, int[] iArr) {
        int i10;
        int W0 = W0(l1Var);
        if (this.p.f == -1) {
            i10 = 0;
        } else {
            i10 = W0;
            W0 = 0;
        }
        iArr[0] = W0;
        iArr[1] = i10;
    }

    public k0(int i10, boolean z10) {
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
        g0 g0Var = new g0();
        g0Var.f();
        this.C = g0Var;
        this.D = new h0();
        this.E = 2;
        this.F = new int[2];
        this.G = true;
        this.H = true;
        j1(i10);
        k1(z10);
    }

    public void a1(e1 e1Var, l1 l1Var, g0 g0Var, int i10) {
    }
}
