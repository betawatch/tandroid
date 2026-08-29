package f2;

import android.graphics.PointF;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;
import java.util.WeakHashMap;
import org.telegram.messenger.LiteMode;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public class j0 extends w0 {
    public int A;
    public i0 B;
    public final f0 C;
    public final g0 D;
    public int E;
    public final int[] F;
    public boolean G;
    public boolean H;
    public int o;
    public h0 p;
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

    public j0() {
        this(1, false);
    }

    public void A0(k1 k1Var, h0 h0Var, androidx.datastore.preferences.protobuf.i iVar) {
        int i10 = h0Var.d;
        if (i10 < 0 || i10 >= k1Var.b()) {
            return;
        }
        iVar.a(i10, Math.max(0, h0Var.g));
    }

    public final int B0(k1 k1Var) {
        if (r() == 0) {
            return 0;
        }
        G0();
        androidx.emoji2.text.g gVar = this.q;
        boolean z10 = this.x;
        boolean z11 = !z10;
        View K0 = K0(z11);
        View J0 = J0(z11);
        if (r() == 0 || k1Var.b() == 0 || K0 == null || J0 == null) {
            return 0;
        }
        if (!z10) {
            return Math.abs(((x0) K0.getLayoutParams()).b() - ((x0) J0.getLayoutParams()).b()) + 1;
        }
        return Math.min(gVar.k(), gVar.a(J0) - gVar.d(K0));
    }

    public final int C0(k1 k1Var) {
        if (r() != 0) {
            G0();
            androidx.emoji2.text.g gVar = this.q;
            boolean z10 = this.x;
            boolean z11 = !z10;
            View K0 = K0(z11);
            View J0 = J0(z11);
            boolean z12 = this.v;
            if (r() != 0 && k1Var.b() != 0 && K0 != null && J0 != null) {
                int max = z12 ? Math.max(0, (k1Var.b() - Math.max(((x0) K0.getLayoutParams()).b(), ((x0) J0.getLayoutParams()).b())) - 1) : Math.max(0, Math.min(((x0) K0.getLayoutParams()).b(), ((x0) J0.getLayoutParams()).b()));
                if (z10) {
                    return Math.round((max * (Math.abs(gVar.a(J0) - gVar.d(K0)) / (Math.abs(((x0) K0.getLayoutParams()).b() - ((x0) J0.getLayoutParams()).b()) + 1))) + (gVar.j() - gVar.d(K0)));
                }
                return max;
            }
        }
        return 0;
    }

    public final int D0(k1 k1Var) {
        if (r() == 0) {
            return 0;
        }
        G0();
        androidx.emoji2.text.g gVar = this.q;
        boolean z10 = this.x;
        boolean z11 = !z10;
        View K0 = K0(z11);
        View J0 = J0(z11);
        if (r() == 0 || k1Var.b() == 0 || K0 == null || J0 == null) {
            return 0;
        }
        if (!z10) {
            return k1Var.b();
        }
        return (int) (((gVar.a(J0) - gVar.d(K0)) / (Math.abs(((x0) K0.getLayoutParams()).b() - ((x0) J0.getLayoutParams()).b()) + 1)) * k1Var.b());
    }

    public final PointF E0(int i10) {
        if (r() == 0) {
            return null;
        }
        int i11 = (i10 < w0.H(q(0))) != this.v ? -1 : 1;
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
            h0 h0Var = new h0();
            h0Var.a = true;
            h0Var.h = 0;
            h0Var.i = 0;
            h0Var.k = null;
            this.p = h0Var;
        }
    }

    public final int H0(d1 d1Var, h0 h0Var, k1 k1Var, boolean z10) {
        int i10 = h0Var.c;
        int i11 = h0Var.g;
        if (i11 != Integer.MIN_VALUE) {
            if (i10 < 0) {
                h0Var.g = i11 + i10;
            }
            c1(d1Var, h0Var);
        }
        int i12 = h0Var.c + h0Var.h;
        while (true) {
            if ((!h0Var.l && i12 <= 0) || !h0Var.b(k1Var)) {
                break;
            }
            g0 g0Var = this.D;
            g0Var.a = 0;
            g0Var.b = false;
            g0Var.c = false;
            g0Var.d = false;
            Z0(d1Var, k1Var, h0Var, g0Var);
            if (!g0Var.b) {
                int i13 = h0Var.b;
                int i14 = g0Var.a;
                h0Var.b = (h0Var.f * i14) + i13;
                if (!g0Var.c || h0Var.k != null || !k1Var.g) {
                    h0Var.c -= i14;
                    i12 -= i14;
                }
                int i15 = h0Var.g;
                if (i15 != Integer.MIN_VALUE) {
                    int i16 = i15 + i14;
                    h0Var.g = i16;
                    int i17 = h0Var.c;
                    if (i17 < 0) {
                        h0Var.g = i16 + i17;
                    }
                    c1(d1Var, h0Var);
                }
                if (z10 && g0Var.d) {
                    break;
                }
            } else {
                break;
            }
        }
        return i10 - h0Var.c;
    }

    public final int I0() {
        View P0 = P0(0, r(), true, false);
        if (P0 == null) {
            return -1;
        }
        return ((x0) P0.getLayoutParams()).b();
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
        return ((x0) P0.getLayoutParams()).b();
    }

    public final int M0() {
        View P0 = P0(r() - 1, -1, true, false);
        if (P0 == null) {
            return -1;
        }
        return ((x0) P0.getLayoutParams()).b();
    }

    public final int N0() {
        View P0 = P0(r() - 1, -1, false, true);
        if (P0 == null) {
            return -1;
        }
        return ((x0) P0.getLayoutParams()).b();
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
        return this.o == 0 ? this.c.F(i10, i11, i12, i13) : this.d.F(i10, i11, i12, i13);
    }

    public final View P0(int i10, int i11, boolean z10, boolean z11) {
        G0();
        int i12 = z10 ? 24579 : 320;
        int i13 = z11 ? 320 : 0;
        return this.o == 0 ? this.c.F(i10, i11, i12, i13) : this.d.F(i10, i11, i12, i13);
    }

    public View Q0(d1 d1Var, k1 k1Var, int i10, int i11, int i12) {
        G0();
        int j10 = this.r ? 0 : this.q.j();
        int f9 = this.q.f();
        int i13 = i11 > i10 ? 1 : -1;
        View view = null;
        View view2 = null;
        while (i10 != i11) {
            View q6 = q(i10);
            int H = w0.H(q6);
            if (H >= 0 && H < i12) {
                if (((x0) q6.getLayoutParams()).a.j()) {
                    if (view2 == null) {
                        view2 = q6;
                    }
                } else {
                    if (this.q.d(q6) < f9 && this.q.a(q6) >= j10) {
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

    @Override // f2.w0
    public View R(View view, int i10, d1 d1Var, k1 k1Var) {
        int F0;
        f1();
        if (r() != 0 && (F0 = F0(i10)) != Integer.MIN_VALUE) {
            G0();
            m1(F0, (int) (this.q.k() * 0.33333334f), false, k1Var);
            h0 h0Var = this.p;
            h0Var.g = TLObject.FLAG_31;
            h0Var.a = false;
            H0(d1Var, h0Var, k1Var, true);
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

    public final int S0(int i10, d1 d1Var, k1 k1Var, boolean z10) {
        int f9;
        int f10;
        if (!this.G || !this.H || (f9 = this.q.f() - i10) <= 0) {
            return 0;
        }
        int i11 = -g1(-f9, d1Var, k1Var);
        int i12 = i10 + i11;
        if (!z10 || (f10 = this.q.f() - i12) <= 0) {
            return i11;
        }
        this.q.n(f10);
        return f10 + i11;
    }

    public final int T0(int i10, d1 d1Var, k1 k1Var, boolean z10) {
        int X0;
        int j10;
        if (!this.G || (X0 = i10 - X0()) <= 0) {
            return 0;
        }
        int i11 = -g1(X0, d1Var, k1Var);
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

    public int W0(k1 k1Var) {
        if (k1Var.a != -1) {
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

    public void Z0(d1 d1Var, k1 k1Var, h0 h0Var, g0 g0Var) {
        int i10;
        int i11;
        int i12;
        int i13;
        View c3 = h0Var.c(d1Var);
        if (c3 == null) {
            g0Var.b = true;
            return;
        }
        x0 x0Var = (x0) c3.getLayoutParams();
        if (h0Var.k == null) {
            if (this.v == (h0Var.f == -1)) {
                a(c3, -1, false);
            } else {
                a(c3, 0, false);
            }
        } else {
            if (this.v == (h0Var.f == -1)) {
                a(c3, -1, true);
            } else {
                a(c3, 0, true);
            }
        }
        P(c3);
        g0Var.a = this.q.b(c3);
        if (this.o == 1) {
            if (Y0()) {
                i13 = this.m - E();
                i10 = i13 - this.q.c(c3);
            } else {
                i10 = D();
                i13 = this.q.c(c3) + i10;
            }
            if (h0Var.f == -1) {
                i11 = h0Var.b;
                i12 = i11 - g0Var.a;
            } else {
                i12 = h0Var.b;
                i11 = g0Var.a + i12;
            }
        } else {
            int F = F();
            int c6 = this.q.c(c3) + F;
            if (h0Var.f == -1) {
                int i14 = h0Var.b;
                int i15 = i14 - g0Var.a;
                i13 = i14;
                i11 = c6;
                i10 = i15;
                i12 = F;
            } else {
                int i16 = h0Var.b;
                int i17 = g0Var.a + i16;
                i10 = i16;
                i11 = c6;
                i12 = F;
                i13 = i17;
            }
        }
        w0.O(c3, i10, i12, i13, i11);
        if (x0Var.a.j() || x0Var.a.m()) {
            g0Var.c = true;
        }
        g0Var.d = c3.hasFocusable();
    }

    @Override // f2.w0
    public final void b(String str) {
        RecyclerView recyclerView;
        if (this.B != null || (recyclerView = this.b) == null) {
            return;
        }
        recyclerView.l(str);
    }

    /* JADX WARN: Removed duplicated region for block: B:203:0x029b  */
    /* JADX WARN: Removed duplicated region for block: B:205:0x02a1  */
    @Override // f2.w0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void b0(d1 d1Var, k1 k1Var) {
        View view;
        View view2;
        d1 d1Var2;
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
        j0 j0Var = this;
        k1 k1Var2 = k1Var;
        int i18 = -1;
        if (!(j0Var.B == null && j0Var.y == -1) && k1Var2.b() == 0) {
            g0(d1Var);
            return;
        }
        i0 i0Var = j0Var.B;
        if (i0Var != null && (i17 = i0Var.a) >= 0) {
            j0Var.y = i17;
        }
        j0Var.G0();
        j0Var.p.a = false;
        j0Var.f1();
        RecyclerView recyclerView = j0Var.b;
        if (recyclerView == null || (view = recyclerView.getFocusedChild()) == null || ((ArrayList) j0Var.a.d).contains(view)) {
            view = null;
        }
        f0 f0Var = j0Var.C;
        if (f0Var.d && j0Var.y == -1 && j0Var.B == null) {
            if (view != null && (j0Var.q.d(view) >= j0Var.q.f() || j0Var.q.a(view) <= j0Var.q.j())) {
                f0Var.d(((x0) view.getLayoutParams()).b(), view);
            }
            d1Var2 = d1Var;
        } else {
            f0Var.f();
            f0Var.c = j0Var.v ^ j0Var.w;
            if (!k1Var2.g && (i10 = j0Var.y) != -1) {
                if (i10 < 0 || i10 >= k1Var2.b()) {
                    j0Var.y = -1;
                    j0Var.A = TLObject.FLAG_31;
                } else {
                    int i19 = j0Var.y;
                    f0Var.b = i19;
                    i0 i0Var2 = j0Var.B;
                    if (i0Var2 != null && i0Var2.a >= 0) {
                        boolean z10 = i0Var2.c;
                        f0Var.c = z10;
                        if (z10) {
                            f0Var.e = j0Var.q.f() - j0Var.B.b;
                        } else {
                            f0Var.e = j0Var.q.j() + j0Var.B.b;
                        }
                    } else if (j0Var.A == Integer.MIN_VALUE) {
                        View m11 = j0Var.m(i19);
                        if (m11 == null) {
                            if (j0Var.r() > 0) {
                                f0Var.c = (j0Var.y < w0.H(j0Var.q(0))) == j0Var.z;
                            }
                            f0Var.b();
                        } else if (j0Var.q.b(m11) > j0Var.q.k()) {
                            f0Var.b();
                        } else if (j0Var.q.d(m11) - j0Var.q.j() < 0) {
                            f0Var.e = j0Var.q.j();
                            f0Var.c = false;
                        } else if (j0Var.q.f() - j0Var.q.a(m11) < 0) {
                            f0Var.e = j0Var.q.f();
                            f0Var.c = true;
                        } else {
                            if (f0Var.c) {
                                int a2 = j0Var.q.a(m11);
                                androidx.emoji2.text.g gVar = j0Var.q;
                                d = (Integer.MIN_VALUE == gVar.a ? 0 : gVar.k() - gVar.a) + a2;
                            } else {
                                d = j0Var.q.d(m11);
                            }
                            f0Var.e = d;
                        }
                    } else {
                        boolean z11 = j0Var.z;
                        f0Var.c = z11;
                        if (z11) {
                            f0Var.e = j0Var.q.f() - j0Var.A;
                        } else {
                            f0Var.e = j0Var.q.j() + j0Var.A;
                        }
                    }
                    d1Var2 = d1Var;
                    f0Var.d = true;
                }
            }
            if (j0Var.r() != 0) {
                RecyclerView recyclerView2 = j0Var.b;
                if (recyclerView2 == null || (view2 = recyclerView2.getFocusedChild()) == null || ((ArrayList) j0Var.a.d).contains(view2)) {
                    view2 = null;
                }
                if (view2 != null) {
                    x0 x0Var = (x0) view2.getLayoutParams();
                    if (!x0Var.a.j() && x0Var.b() >= 0 && x0Var.b() < k1Var2.b()) {
                        f0Var.d(((x0) view2.getLayoutParams()).b(), view2);
                        d1Var2 = d1Var;
                        f0Var.d = true;
                    }
                }
                if (j0Var.s == j0Var.w) {
                    if (f0Var.c) {
                        if (j0Var.v) {
                            Q0 = j0Var.Q0(d1Var, k1Var2, 0, j0Var.r(), k1Var2.b());
                            j0Var = this;
                        } else {
                            j0Var = this;
                            Q0 = j0Var.Q0(d1Var, k1Var, r() - 1, -1, k1Var.b());
                        }
                        d1Var2 = d1Var;
                        k1Var2 = k1Var;
                    } else if (j0Var.v) {
                        d1Var2 = d1Var;
                        k1Var2 = k1Var;
                        Q0 = j0Var.Q0(d1Var2, k1Var2, j0Var.r() - 1, -1, k1Var.b());
                        j0Var = this;
                    } else {
                        j0Var = this;
                        d1Var2 = d1Var;
                        k1Var2 = k1Var;
                        Q0 = j0Var.Q0(d1Var2, k1Var2, 0, r(), k1Var.b());
                    }
                    if (Q0 != null) {
                        f0Var.c(((x0) Q0.getLayoutParams()).b(), Q0);
                        if (!k1Var2.g && j0Var.y0() && (j0Var.q.d(Q0) >= j0Var.q.f() || j0Var.q.a(Q0) < j0Var.q.j())) {
                            f0Var.e = f0Var.c ? j0Var.q.f() : j0Var.q.j();
                        }
                        f0Var.d = true;
                    }
                    f0Var.b();
                    f0Var.b = !j0Var.w ? k1Var2.b() - 1 : j0Var.R0();
                    f0Var.d = true;
                }
            }
            d1Var2 = d1Var;
            f0Var.b();
            f0Var.b = !j0Var.w ? k1Var2.b() - 1 : j0Var.R0();
            f0Var.d = true;
        }
        h0 h0Var = j0Var.p;
        h0Var.f = h0Var.j >= 0 ? 1 : -1;
        int[] iArr = j0Var.F;
        iArr[0] = 0;
        iArr[1] = 0;
        j0Var.z0(k1Var2, iArr);
        int j10 = j0Var.q.j() + Math.max(0, iArr[0]);
        int g10 = j0Var.q.g() + Math.max(0, iArr[1]);
        if (k1Var2.g && (i15 = j0Var.y) != -1 && j0Var.A != Integer.MIN_VALUE && (m10 = j0Var.m(i15)) != null) {
            if (j0Var.z) {
                i16 = j0Var.q.f() - j0Var.q.a(m10);
                d10 = j0Var.A;
            } else {
                d10 = j0Var.q.d(m10) - j0Var.q.j();
                i16 = j0Var.A;
            }
            int i20 = i16 - d10;
            if (i20 > 0) {
                j10 += i20;
            } else {
                g10 -= i20;
            }
        }
        if (!f0Var.c ? !j0Var.v : j0Var.v) {
            i18 = 1;
        }
        j0Var.a1(d1Var2, k1Var2, f0Var, i18);
        for (int r6 = j0Var.r() - 1; r6 >= 0; r6--) {
            View q6 = j0Var.q(r6);
            n1 U = RecyclerView.U(q6);
            if (U != null && !U.r()) {
                if (!U.h() || U.j() || j0Var.b.w.b) {
                    j0Var.q(r6);
                    j0Var.a.j(r6);
                    d1Var2.i(q6);
                    j0Var.b.f.T(U);
                } else {
                    j0Var.j0(r6);
                    d1Var2.h(U);
                }
            }
        }
        j0Var.p.l = j0Var.q.h() == 0 && j0Var.q.e() == 0;
        j0Var.p.getClass();
        j0Var.p.i = 0;
        if (f0Var.c) {
            j0Var.o1(f0Var.b, f0Var.e);
            h0 h0Var2 = j0Var.p;
            h0Var2.h = j10;
            j0Var.H0(d1Var2, h0Var2, k1Var2, false);
            h0 h0Var3 = j0Var.p;
            i12 = h0Var3.b;
            int i21 = h0Var3.d;
            int i22 = h0Var3.c;
            if (i22 > 0) {
                g10 += i22;
            }
            j0Var.n1(f0Var.b, f0Var.e);
            h0 h0Var4 = j0Var.p;
            h0Var4.h = g10;
            h0Var4.d += h0Var4.e;
            j0Var.H0(d1Var2, h0Var4, k1Var2, false);
            h0 h0Var5 = j0Var.p;
            i11 = h0Var5.b;
            int i23 = h0Var5.c;
            if (i23 > 0) {
                j0Var.o1(i21, i12);
                h0 h0Var6 = j0Var.p;
                h0Var6.h = i23;
                j0Var.H0(d1Var2, h0Var6, k1Var2, false);
                i12 = j0Var.p.b;
            }
        } else {
            j0Var.n1(f0Var.b, f0Var.e);
            h0 h0Var7 = j0Var.p;
            h0Var7.h = g10;
            j0Var.H0(d1Var2, h0Var7, k1Var2, false);
            h0 h0Var8 = j0Var.p;
            i11 = h0Var8.b;
            int i24 = h0Var8.d;
            int i25 = h0Var8.c;
            if (i25 > 0) {
                j10 += i25;
            }
            j0Var.o1(f0Var.b, f0Var.e);
            h0 h0Var9 = j0Var.p;
            h0Var9.h = j10;
            h0Var9.d += h0Var9.e;
            j0Var.H0(d1Var2, h0Var9, k1Var2, false);
            h0 h0Var10 = j0Var.p;
            i12 = h0Var10.b;
            int i26 = h0Var10.c;
            if (i26 > 0) {
                j0Var.n1(i24, i11);
                h0 h0Var11 = j0Var.p;
                h0Var11.h = i26;
                j0Var.H0(d1Var2, h0Var11, k1Var2, false);
                i11 = j0Var.p.b;
            }
        }
        if (j0Var.r() > 0) {
            if (j0Var.v ^ j0Var.w) {
                int S02 = j0Var.S0(i11, d1Var2, k1Var2, true);
                i13 = i12 + S02;
                i14 = i11 + S02;
                S0 = j0Var.T0(i13, d1Var2, k1Var2, false);
            } else {
                int T0 = j0Var.T0(i12, d1Var2, k1Var2, true);
                i13 = i12 + T0;
                i14 = i11 + T0;
                S0 = j0Var.S0(i14, d1Var2, k1Var2, false);
            }
            i12 = i13 + S0;
            i11 = i14 + S0;
        }
        if (k1Var2.k && j0Var.r() != 0 && !k1Var2.g && j0Var.y0()) {
            List list2 = (List) d1Var2.f;
            int size = list2.size();
            int H = w0.H(j0Var.q(0));
            int i27 = 0;
            int i28 = 0;
            for (int i29 = 0; i29 < size; i29++) {
                n1 n1Var = (n1) list2.get(i29);
                boolean j11 = n1Var.j();
                View view3 = n1Var.a;
                if (!j11) {
                    if ((n1Var.c() < H) != j0Var.v) {
                        i27 += j0Var.q.b(view3);
                    } else {
                        i28 += j0Var.q.b(view3);
                    }
                }
            }
            j0Var.p.k = list2;
            if (i27 > 0) {
                j0Var.o1(w0.H(j0Var.V0()), i12);
                h0 h0Var12 = j0Var.p;
                h0Var12.h = i27;
                h0Var12.c = 0;
                h0Var12.a(null);
                j0Var.H0(d1Var2, j0Var.p, k1Var2, false);
            }
            if (i28 > 0) {
                j0Var.n1(w0.H(j0Var.U0()), i11);
                h0 h0Var13 = j0Var.p;
                h0Var13.h = i28;
                h0Var13.c = 0;
                list = null;
                h0Var13.a(null);
                j0Var.H0(d1Var2, j0Var.p, k1Var2, false);
            } else {
                list = null;
            }
            j0Var.p.k = list;
        }
        if (k1Var2.g) {
            f0Var.f();
        } else {
            androidx.emoji2.text.g gVar2 = j0Var.q;
            gVar2.a = gVar2.k();
        }
        j0Var.s = j0Var.w;
    }

    public void b1(View view, View view2, int i10, int i11) {
        b("Cannot drop a view during a scroll or layout calculation");
        G0();
        f1();
        int H = w0.H(view);
        int H2 = w0.H(view2);
        char c3 = H < H2 ? (char) 1 : (char) 65535;
        if (this.v) {
            if (c3 == 1) {
                h1(H2, this.q.f() - (this.q.b(view) + this.q.d(view2)));
                return;
            } else {
                h1(H2, this.q.f() - this.q.a(view2));
                return;
            }
        }
        if (c3 == 65535) {
            h1(H2, this.q.d(view2));
        } else {
            h1(H2, this.q.a(view2) - this.q.b(view));
        }
    }

    @Override // f2.w0
    public void c0(k1 k1Var) {
        this.B = null;
        this.y = -1;
        this.A = TLObject.FLAG_31;
        this.C.f();
    }

    public final void c1(d1 d1Var, h0 h0Var) {
        n1 T;
        n1 T2;
        if (!h0Var.a || h0Var.l) {
            return;
        }
        int i10 = h0Var.g;
        int i11 = h0Var.i;
        if (h0Var.f != -1) {
            e1(d1Var, i10, i11);
            return;
        }
        int r6 = r();
        if (i10 < 0) {
            return;
        }
        int e10 = (this.q.e() - i10) + i11;
        if (this.v) {
            for (int i12 = 0; i12 < r6; i12++) {
                View q6 = q(i12);
                if (q6 != null && (T2 = this.b.T(q6)) != null && !T2.r() && (this.q.d(q6) < e10 || this.q.m(q6) < e10)) {
                    d1(d1Var, 0, i12);
                    return;
                }
            }
            return;
        }
        int i13 = r6 - 1;
        for (int i14 = i13; i14 >= 0; i14--) {
            View q9 = q(i14);
            if (q9 != null && (T = this.b.T(q9)) != null && !T.r() && (this.q.d(q9) < e10 || this.q.m(q9) < e10)) {
                d1(d1Var, i13, i14);
                return;
            }
        }
    }

    @Override // f2.w0
    public final boolean d() {
        return !this.u && this.o == 0;
    }

    public final void d1(d1 d1Var, int i10, int i11) {
        if (i10 == i11) {
            return;
        }
        if (i11 <= i10) {
            while (i10 > i11) {
                i0(i10, d1Var);
                i10--;
            }
        } else {
            for (int i12 = i11 - 1; i12 >= i10; i12--) {
                i0(i12, d1Var);
            }
        }
    }

    @Override // f2.w0
    public boolean e() {
        return !this.u && this.o == 1;
    }

    @Override // f2.w0
    public final i0 e0() {
        i0 i0Var = this.B;
        if (i0Var != null) {
            i0 i0Var2 = new i0();
            i0Var2.a = i0Var.a;
            i0Var2.b = i0Var.b;
            i0Var2.c = i0Var.c;
            return i0Var2;
        }
        i0 i0Var3 = new i0();
        if (r() <= 0) {
            i0Var3.a = -1;
            return i0Var3;
        }
        G0();
        boolean z10 = this.s ^ this.v;
        i0Var3.c = z10;
        if (z10) {
            View U0 = U0();
            i0Var3.b = this.q.f() - this.q.a(U0);
            i0Var3.a = ((x0) U0.getLayoutParams()).b();
            return i0Var3;
        }
        View V0 = V0();
        i0Var3.a = w0.H(V0);
        i0Var3.b = this.q.d(V0) - this.q.j();
        return i0Var3;
    }

    public void e1(d1 d1Var, int i10, int i11) {
        n1 T;
        n1 T2;
        if (i10 < 0) {
            return;
        }
        int i12 = i10 - i11;
        int r6 = r();
        if (!this.v) {
            for (int i13 = 0; i13 < r6; i13++) {
                View q6 = q(i13);
                if (q6 != null && (T = this.b.T(q6)) != null && !T.r() && (this.q.a(q6) > i12 || this.q.l(q6) > i12)) {
                    d1(d1Var, 0, i13);
                    return;
                }
            }
            return;
        }
        int i14 = r6 - 1;
        for (int i15 = i14; i15 >= 0; i15--) {
            View q9 = q(i15);
            if (q9 != null && (T2 = this.b.T(q9)) != null && !T2.r() && (this.q.a(q9) > i12 || this.q.l(q9) > i12)) {
                d1(d1Var, i14, i15);
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

    public final int g1(int i10, d1 d1Var, k1 k1Var) {
        if (r() == 0 || i10 == 0) {
            return 0;
        }
        G0();
        this.p.a = true;
        int i11 = i10 > 0 ? 1 : -1;
        int abs = Math.abs(i10);
        m1(i11, abs, true, k1Var);
        h0 h0Var = this.p;
        int H0 = H0(d1Var, h0Var, k1Var, false) + h0Var.g;
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

    @Override // f2.w0
    public int h(k1 k1Var) {
        return C0(k1Var);
    }

    public void h1(int i10, int i11) {
        i1(i10, i11, this.v);
    }

    @Override // f2.w0
    public int i(k1 k1Var) {
        return D0(k1Var);
    }

    public void i1(int i10, int i11, boolean z10) {
        if (this.y == i10 && this.A == i11 && this.z == z10) {
            return;
        }
        this.y = i10;
        this.A = i11;
        this.z = z10;
        i0 i0Var = this.B;
        if (i0Var != null) {
            i0Var.a = -1;
        }
        l0();
    }

    @Override // f2.w0
    public int j(k1 k1Var) {
        return B0(k1Var);
    }

    public final void j1(int i10) {
        m0 m0Var;
        if (i10 != 0 && i10 != 1) {
            throw new IllegalArgumentException(j7.l1.k(i10, "invalid orientation:"));
        }
        b(null);
        if (i10 != this.o || this.q == null) {
            if (i10 == 0) {
                m0Var = new m0(this, 0);
            } else {
                if (i10 != 1) {
                    throw new IllegalArgumentException("invalid orientation");
                }
                m0Var = new m0(this, 1);
            }
            this.q = m0Var;
            this.C.f = m0Var;
            this.o = i10;
            l0();
        }
    }

    @Override // f2.w0
    public int k(k1 k1Var) {
        return C0(k1Var);
    }

    public void k1(boolean z10) {
        b(null);
        if (z10 == this.t) {
            return;
        }
        this.t = z10;
        l0();
    }

    @Override // f2.w0
    public int l(k1 k1Var) {
        return D0(k1Var);
    }

    public void l1(boolean z10) {
        b(null);
        if (this.w == z10) {
            return;
        }
        this.w = z10;
        l0();
    }

    @Override // f2.w0
    public final View m(int i10) {
        int r6 = r();
        if (r6 == 0) {
            return null;
        }
        int H = i10 - w0.H(q(0));
        if (H >= 0 && H < r6) {
            View q6 = q(H);
            if (w0.H(q6) == i10) {
                return q6;
            }
        }
        int r9 = r();
        for (int i11 = 0; i11 < r9; i11++) {
            View q9 = q(i11);
            n1 U = RecyclerView.U(q9);
            if (U != null && U.c() == i10 && !U.r() && (this.b.p0.g || !U.j())) {
                return q9;
            }
        }
        return null;
    }

    @Override // f2.w0
    public int m0(int i10, d1 d1Var, k1 k1Var) {
        if (this.o == 1) {
            return 0;
        }
        return g1(i10, d1Var, k1Var);
    }

    public final void m1(int i10, int i11, boolean z10, k1 k1Var) {
        int j10;
        this.p.l = this.q.h() == 0 && this.q.e() == 0;
        this.p.f = i10;
        int[] iArr = this.F;
        iArr[0] = 0;
        iArr[1] = 0;
        z0(k1Var, iArr);
        int max = Math.max(0, iArr[0]);
        int max2 = Math.max(0, iArr[1]);
        boolean z11 = i10 == 1;
        h0 h0Var = this.p;
        int i12 = z11 ? max2 : max;
        h0Var.h = i12;
        if (!z11) {
            max = max2;
        }
        h0Var.i = max;
        if (z11) {
            h0Var.h = this.q.g() + i12;
            View U0 = U0();
            h0 h0Var2 = this.p;
            h0Var2.e = this.v ? -1 : 1;
            int H = w0.H(U0);
            h0 h0Var3 = this.p;
            h0Var2.d = H + h0Var3.e;
            h0Var3.b = this.q.a(U0);
            j10 = this.q.a(U0) - this.q.f();
        } else {
            View V0 = V0();
            h0 h0Var4 = this.p;
            h0Var4.h = this.q.j() + h0Var4.h;
            h0 h0Var5 = this.p;
            h0Var5.e = this.v ? 1 : -1;
            int H2 = w0.H(V0);
            h0 h0Var6 = this.p;
            h0Var5.d = H2 + h0Var6.e;
            h0Var6.b = this.q.d(V0);
            j10 = (-this.q.d(V0)) + this.q.j();
        }
        h0 h0Var7 = this.p;
        h0Var7.c = i11;
        if (z10) {
            h0Var7.c = i11 - j10;
        }
        h0Var7.g = j10;
    }

    @Override // f2.w0
    public x0 n() {
        return new x0(-2, -2);
    }

    @Override // f2.w0
    public void n0(int i10) {
        this.y = i10;
        this.A = TLObject.FLAG_31;
        i0 i0Var = this.B;
        if (i0Var != null) {
            i0Var.a = -1;
        }
        l0();
    }

    public final void n1(int i10, int i11) {
        this.p.c = this.q.f() - i11;
        h0 h0Var = this.p;
        h0Var.e = this.v ? -1 : 1;
        h0Var.d = i10;
        h0Var.f = 1;
        h0Var.b = i11;
        h0Var.g = TLObject.FLAG_31;
    }

    @Override // f2.w0
    public int o0(int i10, d1 d1Var, k1 k1Var) {
        if (this.o == 0) {
            return 0;
        }
        return g1(i10, d1Var, k1Var);
    }

    public final void o1(int i10, int i11) {
        this.p.c = i11 - this.q.j();
        h0 h0Var = this.p;
        h0Var.d = i10;
        h0Var.e = this.v ? 1 : -1;
        h0Var.f = -1;
        h0Var.b = i11;
        h0Var.g = TLObject.FLAG_31;
    }

    @Override // f2.w0
    public void v0(RecyclerView recyclerView, k1 k1Var, int i10) {
        k0 k0Var = new k0(recyclerView.getContext());
        k0Var.a = i10;
        w0(k0Var);
    }

    @Override // f2.w0
    public boolean y0() {
        return this.B == null && this.s == this.w;
    }

    public void z0(k1 k1Var, int[] iArr) {
        int i10;
        int W0 = W0(k1Var);
        if (this.p.f == -1) {
            i10 = 0;
        } else {
            i10 = W0;
            W0 = 0;
        }
        iArr[0] = W0;
        iArr[1] = i10;
    }

    public j0(int i10, boolean z10) {
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
        f0 f0Var = new f0();
        f0Var.f();
        this.C = f0Var;
        this.D = new g0();
        this.E = 2;
        this.F = new int[2];
        this.G = true;
        this.H = true;
        j1(i10);
        k1(z10);
    }

    public void a1(d1 d1Var, k1 k1Var, f0 f0Var, int i10) {
    }
}
