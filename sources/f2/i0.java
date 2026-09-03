package f2;

import android.graphics.PointF;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;
import java.util.WeakHashMap;
import org.telegram.messenger.LiteMode;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes.dex */
public class i0 extends v0 {
    public int A;
    public h0 B;
    public final b4.v C;
    public final f0 D;
    public int E;
    public final int[] F;
    public boolean G;
    public boolean H;
    public int o;
    public g0 p;
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

    public i0() {
        this(1, false);
    }

    public void A0(i1 i1Var, g0 g0Var, androidx.datastore.preferences.protobuf.i iVar) {
        int i10 = g0Var.d;
        if (i10 < 0 || i10 >= i1Var.b()) {
            return;
        }
        iVar.a(i10, Math.max(0, g0Var.g));
    }

    public final int B0(i1 i1Var) {
        if (r() == 0) {
            return 0;
        }
        G0();
        androidx.emoji2.text.g gVar = this.q;
        boolean z4 = this.x;
        boolean z10 = !z4;
        View K0 = K0(z10);
        View J0 = J0(z10);
        if (r() == 0 || i1Var.b() == 0 || K0 == null || J0 == null) {
            return 0;
        }
        if (!z4) {
            return Math.abs(((w0) K0.getLayoutParams()).b() - ((w0) J0.getLayoutParams()).b()) + 1;
        }
        return Math.min(gVar.k(), gVar.a(J0) - gVar.d(K0));
    }

    public final int C0(i1 i1Var) {
        if (r() != 0) {
            G0();
            androidx.emoji2.text.g gVar = this.q;
            boolean z4 = this.x;
            boolean z10 = !z4;
            View K0 = K0(z10);
            View J0 = J0(z10);
            boolean z11 = this.v;
            if (r() != 0 && i1Var.b() != 0 && K0 != null && J0 != null) {
                int max = z11 ? Math.max(0, (i1Var.b() - Math.max(((w0) K0.getLayoutParams()).b(), ((w0) J0.getLayoutParams()).b())) - 1) : Math.max(0, Math.min(((w0) K0.getLayoutParams()).b(), ((w0) J0.getLayoutParams()).b()));
                if (z4) {
                    return Math.round((max * (Math.abs(gVar.a(J0) - gVar.d(K0)) / (Math.abs(((w0) K0.getLayoutParams()).b() - ((w0) J0.getLayoutParams()).b()) + 1))) + (gVar.j() - gVar.d(K0)));
                }
                return max;
            }
        }
        return 0;
    }

    public final int D0(i1 i1Var) {
        if (r() == 0) {
            return 0;
        }
        G0();
        androidx.emoji2.text.g gVar = this.q;
        boolean z4 = this.x;
        boolean z10 = !z4;
        View K0 = K0(z10);
        View J0 = J0(z10);
        if (r() == 0 || i1Var.b() == 0 || K0 == null || J0 == null) {
            return 0;
        }
        if (!z4) {
            return i1Var.b();
        }
        return (int) (((gVar.a(J0) - gVar.d(K0)) / (Math.abs(((w0) K0.getLayoutParams()).b() - ((w0) J0.getLayoutParams()).b()) + 1)) * i1Var.b());
    }

    public final PointF E0(int i10) {
        if (r() == 0) {
            return null;
        }
        int i11 = (i10 < v0.H(q(0))) != this.v ? -1 : 1;
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
            g0 g0Var = new g0();
            g0Var.a = true;
            g0Var.h = 0;
            g0Var.i = 0;
            g0Var.k = null;
            this.p = g0Var;
        }
    }

    public final int H0(af.h hVar, g0 g0Var, i1 i1Var, boolean z4) {
        int i10 = g0Var.c;
        int i11 = g0Var.g;
        if (i11 != Integer.MIN_VALUE) {
            if (i10 < 0) {
                g0Var.g = i11 + i10;
            }
            c1(hVar, g0Var);
        }
        int i12 = g0Var.c + g0Var.h;
        while (true) {
            if ((!g0Var.l && i12 <= 0) || !g0Var.b(i1Var)) {
                break;
            }
            f0 f0Var = this.D;
            f0Var.a = 0;
            f0Var.b = false;
            f0Var.c = false;
            f0Var.d = false;
            Z0(hVar, i1Var, g0Var, f0Var);
            if (!f0Var.b) {
                int i13 = g0Var.b;
                int i14 = f0Var.a;
                g0Var.b = (g0Var.f * i14) + i13;
                if (!f0Var.c || g0Var.k != null || !i1Var.g) {
                    g0Var.c -= i14;
                    i12 -= i14;
                }
                int i15 = g0Var.g;
                if (i15 != Integer.MIN_VALUE) {
                    int i16 = i15 + i14;
                    g0Var.g = i16;
                    int i17 = g0Var.c;
                    if (i17 < 0) {
                        g0Var.g = i16 + i17;
                    }
                    c1(hVar, g0Var);
                }
                if (z4 && f0Var.d) {
                    break;
                }
            } else {
                break;
            }
        }
        return i10 - g0Var.c;
    }

    public final int I0() {
        View P0 = P0(0, r(), true, false);
        if (P0 == null) {
            return -1;
        }
        return ((w0) P0.getLayoutParams()).b();
    }

    public final View J0(boolean z4) {
        return this.v ? P0(0, r(), z4, true) : P0(r() - 1, -1, z4, true);
    }

    public final View K0(boolean z4) {
        return this.v ? P0(r() - 1, -1, z4, true) : P0(0, r(), z4, true);
    }

    public final int L0() {
        View P0 = P0(0, r(), false, true);
        if (P0 == null) {
            return -1;
        }
        return ((w0) P0.getLayoutParams()).b();
    }

    public final int M0() {
        View P0 = P0(r() - 1, -1, true, false);
        if (P0 == null) {
            return -1;
        }
        return ((w0) P0.getLayoutParams()).b();
    }

    public final int N0() {
        View P0 = P0(r() - 1, -1, false, true);
        if (P0 == null) {
            return -1;
        }
        return ((w0) P0.getLayoutParams()).b();
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
        return this.o == 0 ? this.c.M(i10, i11, i12, i13) : this.d.M(i10, i11, i12, i13);
    }

    public final View P0(int i10, int i11, boolean z4, boolean z10) {
        G0();
        int i12 = z4 ? 24579 : 320;
        int i13 = z10 ? 320 : 0;
        return this.o == 0 ? this.c.M(i10, i11, i12, i13) : this.d.M(i10, i11, i12, i13);
    }

    public View Q0(af.h hVar, i1 i1Var, int i10, int i11, int i12) {
        G0();
        int j10 = this.r ? 0 : this.q.j();
        int f10 = this.q.f();
        int i13 = i11 > i10 ? 1 : -1;
        View view = null;
        View view2 = null;
        while (i10 != i11) {
            View q10 = q(i10);
            int H = v0.H(q10);
            if (H >= 0 && H < i12) {
                if (((w0) q10.getLayoutParams()).a.j()) {
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
            i10 += i13;
        }
        return view != null ? view : view2;
    }

    @Override // f2.v0
    public View R(View view, int i10, af.h hVar, i1 i1Var) {
        int F0;
        f1();
        if (r() != 0 && (F0 = F0(i10)) != Integer.MIN_VALUE) {
            G0();
            m1(F0, (int) (this.q.k() * 0.33333334f), false, i1Var);
            g0 g0Var = this.p;
            g0Var.g = TLObject.FLAG_31;
            g0Var.a = false;
            H0(hVar, g0Var, i1Var, true);
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

    public final int S0(int i10, af.h hVar, i1 i1Var, boolean z4) {
        int f10;
        int f11;
        if (!this.G || !this.H || (f10 = this.q.f() - i10) <= 0) {
            return 0;
        }
        int i11 = -g1(-f10, hVar, i1Var);
        int i12 = i10 + i11;
        if (!z4 || (f11 = this.q.f() - i12) <= 0) {
            return i11;
        }
        this.q.n(f11);
        return f11 + i11;
    }

    public final int T0(int i10, af.h hVar, i1 i1Var, boolean z4) {
        int X0;
        int j10;
        if (!this.G || (X0 = i10 - X0()) <= 0) {
            return 0;
        }
        int i11 = -g1(X0, hVar, i1Var);
        int i12 = i10 + i11;
        if (!z4 || (j10 = i12 - this.q.j()) <= 0) {
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

    public int W0(i1 i1Var) {
        if (i1Var.a != -1) {
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

    public void Z0(af.h hVar, i1 i1Var, g0 g0Var, f0 f0Var) {
        int i10;
        int i11;
        int i12;
        int i13;
        View c3 = g0Var.c(hVar);
        if (c3 == null) {
            f0Var.b = true;
            return;
        }
        w0 w0Var = (w0) c3.getLayoutParams();
        if (g0Var.k == null) {
            if (this.v == (g0Var.f == -1)) {
                a(c3, -1, false);
            } else {
                a(c3, 0, false);
            }
        } else {
            if (this.v == (g0Var.f == -1)) {
                a(c3, -1, true);
            } else {
                a(c3, 0, true);
            }
        }
        P(c3);
        f0Var.a = this.q.b(c3);
        if (this.o == 1) {
            if (Y0()) {
                i13 = this.m - E();
                i10 = i13 - this.q.c(c3);
            } else {
                i10 = D();
                i13 = this.q.c(c3) + i10;
            }
            if (g0Var.f == -1) {
                i11 = g0Var.b;
                i12 = i11 - f0Var.a;
            } else {
                i12 = g0Var.b;
                i11 = f0Var.a + i12;
            }
        } else {
            int F = F();
            int c10 = this.q.c(c3) + F;
            if (g0Var.f == -1) {
                int i14 = g0Var.b;
                int i15 = i14 - f0Var.a;
                i13 = i14;
                i11 = c10;
                i10 = i15;
                i12 = F;
            } else {
                int i16 = g0Var.b;
                int i17 = f0Var.a + i16;
                i10 = i16;
                i11 = c10;
                i12 = F;
                i13 = i17;
            }
        }
        v0.O(c3, i10, i12, i13, i11);
        if (w0Var.a.j() || w0Var.a.m()) {
            f0Var.c = true;
        }
        f0Var.d = c3.hasFocusable();
    }

    @Override // f2.v0
    public final void b(String str) {
        RecyclerView recyclerView;
        if (this.B != null || (recyclerView = this.b) == null) {
            return;
        }
        recyclerView.l(str);
    }

    /* JADX WARN: Removed duplicated region for block: B:203:0x029b  */
    /* JADX WARN: Removed duplicated region for block: B:205:0x02a1  */
    @Override // f2.v0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void b0(af.h hVar, i1 i1Var) {
        View view;
        View view2;
        af.h hVar2;
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
        View m9;
        int d10;
        int i16;
        int i17;
        i0 i0Var = this;
        i1 i1Var2 = i1Var;
        int i18 = -1;
        if (!(i0Var.B == null && i0Var.y == -1) && i1Var2.b() == 0) {
            g0(hVar);
            return;
        }
        h0 h0Var = i0Var.B;
        if (h0Var != null && (i17 = h0Var.a) >= 0) {
            i0Var.y = i17;
        }
        i0Var.G0();
        i0Var.p.a = false;
        i0Var.f1();
        RecyclerView recyclerView = i0Var.b;
        if (recyclerView == null || (view = recyclerView.getFocusedChild()) == null || ((ArrayList) i0Var.a.d).contains(view)) {
            view = null;
        }
        b4.v vVar = i0Var.C;
        if (vVar.e && i0Var.y == -1 && i0Var.B == null) {
            if (view != null && (i0Var.q.d(view) >= i0Var.q.f() || i0Var.q.a(view) <= i0Var.q.j())) {
                vVar.d(((w0) view.getLayoutParams()).b(), view);
            }
            hVar2 = hVar;
        } else {
            vVar.f();
            vVar.d = i0Var.v ^ i0Var.w;
            if (!i1Var2.g && (i10 = i0Var.y) != -1) {
                if (i10 < 0 || i10 >= i1Var2.b()) {
                    i0Var.y = -1;
                    i0Var.A = TLObject.FLAG_31;
                } else {
                    int i19 = i0Var.y;
                    vVar.b = i19;
                    h0 h0Var2 = i0Var.B;
                    if (h0Var2 != null && h0Var2.a >= 0) {
                        boolean z4 = h0Var2.c;
                        vVar.d = z4;
                        if (z4) {
                            vVar.c = i0Var.q.f() - i0Var.B.b;
                        } else {
                            vVar.c = i0Var.q.j() + i0Var.B.b;
                        }
                    } else if (i0Var.A == Integer.MIN_VALUE) {
                        View m10 = i0Var.m(i19);
                        if (m10 == null) {
                            if (i0Var.r() > 0) {
                                vVar.d = (i0Var.y < v0.H(i0Var.q(0))) == i0Var.z;
                            }
                            vVar.b();
                        } else if (i0Var.q.b(m10) > i0Var.q.k()) {
                            vVar.b();
                        } else if (i0Var.q.d(m10) - i0Var.q.j() < 0) {
                            vVar.c = i0Var.q.j();
                            vVar.d = false;
                        } else if (i0Var.q.f() - i0Var.q.a(m10) < 0) {
                            vVar.c = i0Var.q.f();
                            vVar.d = true;
                        } else {
                            if (vVar.d) {
                                int a2 = i0Var.q.a(m10);
                                androidx.emoji2.text.g gVar = i0Var.q;
                                d = (Integer.MIN_VALUE == gVar.a ? 0 : gVar.k() - gVar.a) + a2;
                            } else {
                                d = i0Var.q.d(m10);
                            }
                            vVar.c = d;
                        }
                    } else {
                        boolean z10 = i0Var.z;
                        vVar.d = z10;
                        if (z10) {
                            vVar.c = i0Var.q.f() - i0Var.A;
                        } else {
                            vVar.c = i0Var.q.j() + i0Var.A;
                        }
                    }
                    hVar2 = hVar;
                    vVar.e = true;
                }
            }
            if (i0Var.r() != 0) {
                RecyclerView recyclerView2 = i0Var.b;
                if (recyclerView2 == null || (view2 = recyclerView2.getFocusedChild()) == null || ((ArrayList) i0Var.a.d).contains(view2)) {
                    view2 = null;
                }
                if (view2 != null) {
                    w0 w0Var = (w0) view2.getLayoutParams();
                    if (!w0Var.a.j() && w0Var.b() >= 0 && w0Var.b() < i1Var2.b()) {
                        vVar.d(((w0) view2.getLayoutParams()).b(), view2);
                        hVar2 = hVar;
                        vVar.e = true;
                    }
                }
                if (i0Var.s == i0Var.w) {
                    if (vVar.d) {
                        if (i0Var.v) {
                            Q0 = i0Var.Q0(hVar, i1Var2, 0, i0Var.r(), i1Var2.b());
                            i0Var = this;
                        } else {
                            i0Var = this;
                            Q0 = i0Var.Q0(hVar, i1Var, r() - 1, -1, i1Var.b());
                        }
                        hVar2 = hVar;
                        i1Var2 = i1Var;
                    } else if (i0Var.v) {
                        hVar2 = hVar;
                        i1Var2 = i1Var;
                        Q0 = i0Var.Q0(hVar2, i1Var2, i0Var.r() - 1, -1, i1Var.b());
                        i0Var = this;
                    } else {
                        i0Var = this;
                        hVar2 = hVar;
                        i1Var2 = i1Var;
                        Q0 = i0Var.Q0(hVar2, i1Var2, 0, r(), i1Var.b());
                    }
                    if (Q0 != null) {
                        vVar.c(((w0) Q0.getLayoutParams()).b(), Q0);
                        if (!i1Var2.g && i0Var.y0() && (i0Var.q.d(Q0) >= i0Var.q.f() || i0Var.q.a(Q0) < i0Var.q.j())) {
                            vVar.c = vVar.d ? i0Var.q.f() : i0Var.q.j();
                        }
                        vVar.e = true;
                    }
                    vVar.b();
                    vVar.b = !i0Var.w ? i1Var2.b() - 1 : i0Var.R0();
                    vVar.e = true;
                }
            }
            hVar2 = hVar;
            vVar.b();
            vVar.b = !i0Var.w ? i1Var2.b() - 1 : i0Var.R0();
            vVar.e = true;
        }
        g0 g0Var = i0Var.p;
        g0Var.f = g0Var.j >= 0 ? 1 : -1;
        int[] iArr = i0Var.F;
        iArr[0] = 0;
        iArr[1] = 0;
        i0Var.z0(i1Var2, iArr);
        int j10 = i0Var.q.j() + Math.max(0, iArr[0]);
        int g10 = i0Var.q.g() + Math.max(0, iArr[1]);
        if (i1Var2.g && (i15 = i0Var.y) != -1 && i0Var.A != Integer.MIN_VALUE && (m9 = i0Var.m(i15)) != null) {
            if (i0Var.z) {
                i16 = i0Var.q.f() - i0Var.q.a(m9);
                d10 = i0Var.A;
            } else {
                d10 = i0Var.q.d(m9) - i0Var.q.j();
                i16 = i0Var.A;
            }
            int i20 = i16 - d10;
            if (i20 > 0) {
                j10 += i20;
            } else {
                g10 -= i20;
            }
        }
        if (!vVar.d ? !i0Var.v : i0Var.v) {
            i18 = 1;
        }
        i0Var.a1(hVar2, i1Var2, vVar, i18);
        for (int r10 = i0Var.r() - 1; r10 >= 0; r10--) {
            View q10 = i0Var.q(r10);
            l1 U = RecyclerView.U(q10);
            if (U != null && !U.r()) {
                if (!U.h() || U.j() || i0Var.b.w.b) {
                    i0Var.q(r10);
                    i0Var.a.l(r10);
                    hVar2.i(q10);
                    i0Var.b.f.b0(U);
                } else {
                    i0Var.j0(r10);
                    hVar2.h(U);
                }
            }
        }
        i0Var.p.l = i0Var.q.h() == 0 && i0Var.q.e() == 0;
        i0Var.p.getClass();
        i0Var.p.i = 0;
        if (vVar.d) {
            i0Var.o1(vVar.b, vVar.c);
            g0 g0Var2 = i0Var.p;
            g0Var2.h = j10;
            i0Var.H0(hVar2, g0Var2, i1Var2, false);
            g0 g0Var3 = i0Var.p;
            i12 = g0Var3.b;
            int i21 = g0Var3.d;
            int i22 = g0Var3.c;
            if (i22 > 0) {
                g10 += i22;
            }
            i0Var.n1(vVar.b, vVar.c);
            g0 g0Var4 = i0Var.p;
            g0Var4.h = g10;
            g0Var4.d += g0Var4.e;
            i0Var.H0(hVar2, g0Var4, i1Var2, false);
            g0 g0Var5 = i0Var.p;
            i11 = g0Var5.b;
            int i23 = g0Var5.c;
            if (i23 > 0) {
                i0Var.o1(i21, i12);
                g0 g0Var6 = i0Var.p;
                g0Var6.h = i23;
                i0Var.H0(hVar2, g0Var6, i1Var2, false);
                i12 = i0Var.p.b;
            }
        } else {
            i0Var.n1(vVar.b, vVar.c);
            g0 g0Var7 = i0Var.p;
            g0Var7.h = g10;
            i0Var.H0(hVar2, g0Var7, i1Var2, false);
            g0 g0Var8 = i0Var.p;
            i11 = g0Var8.b;
            int i24 = g0Var8.d;
            int i25 = g0Var8.c;
            if (i25 > 0) {
                j10 += i25;
            }
            i0Var.o1(vVar.b, vVar.c);
            g0 g0Var9 = i0Var.p;
            g0Var9.h = j10;
            g0Var9.d += g0Var9.e;
            i0Var.H0(hVar2, g0Var9, i1Var2, false);
            g0 g0Var10 = i0Var.p;
            i12 = g0Var10.b;
            int i26 = g0Var10.c;
            if (i26 > 0) {
                i0Var.n1(i24, i11);
                g0 g0Var11 = i0Var.p;
                g0Var11.h = i26;
                i0Var.H0(hVar2, g0Var11, i1Var2, false);
                i11 = i0Var.p.b;
            }
        }
        if (i0Var.r() > 0) {
            if (i0Var.v ^ i0Var.w) {
                int S02 = i0Var.S0(i11, hVar2, i1Var2, true);
                i13 = i12 + S02;
                i14 = i11 + S02;
                S0 = i0Var.T0(i13, hVar2, i1Var2, false);
            } else {
                int T0 = i0Var.T0(i12, hVar2, i1Var2, true);
                i13 = i12 + T0;
                i14 = i11 + T0;
                S0 = i0Var.S0(i14, hVar2, i1Var2, false);
            }
            i12 = i13 + S0;
            i11 = i14 + S0;
        }
        if (i1Var2.k && i0Var.r() != 0 && !i1Var2.g && i0Var.y0()) {
            List list2 = (List) hVar2.f;
            int size = list2.size();
            int H = v0.H(i0Var.q(0));
            int i27 = 0;
            int i28 = 0;
            for (int i29 = 0; i29 < size; i29++) {
                l1 l1Var = (l1) list2.get(i29);
                boolean j11 = l1Var.j();
                View view3 = l1Var.a;
                if (!j11) {
                    if ((l1Var.c() < H) != i0Var.v) {
                        i27 += i0Var.q.b(view3);
                    } else {
                        i28 += i0Var.q.b(view3);
                    }
                }
            }
            i0Var.p.k = list2;
            if (i27 > 0) {
                i0Var.o1(v0.H(i0Var.V0()), i12);
                g0 g0Var12 = i0Var.p;
                g0Var12.h = i27;
                g0Var12.c = 0;
                g0Var12.a(null);
                i0Var.H0(hVar2, i0Var.p, i1Var2, false);
            }
            if (i28 > 0) {
                i0Var.n1(v0.H(i0Var.U0()), i11);
                g0 g0Var13 = i0Var.p;
                g0Var13.h = i28;
                g0Var13.c = 0;
                list = null;
                g0Var13.a(null);
                i0Var.H0(hVar2, i0Var.p, i1Var2, false);
            } else {
                list = null;
            }
            i0Var.p.k = list;
        }
        if (i1Var2.g) {
            vVar.f();
        } else {
            androidx.emoji2.text.g gVar2 = i0Var.q;
            gVar2.a = gVar2.k();
        }
        i0Var.s = i0Var.w;
    }

    public void b1(View view, View view2, int i10, int i11) {
        b("Cannot drop a view during a scroll or layout calculation");
        G0();
        f1();
        int H = v0.H(view);
        int H2 = v0.H(view2);
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

    @Override // f2.v0
    public void c0(i1 i1Var) {
        this.B = null;
        this.y = -1;
        this.A = TLObject.FLAG_31;
        this.C.f();
    }

    public final void c1(af.h hVar, g0 g0Var) {
        l1 T;
        l1 T2;
        if (!g0Var.a || g0Var.l) {
            return;
        }
        int i10 = g0Var.g;
        int i11 = g0Var.i;
        if (g0Var.f != -1) {
            e1(hVar, i10, i11);
            return;
        }
        int r10 = r();
        if (i10 < 0) {
            return;
        }
        int e = (this.q.e() - i10) + i11;
        if (this.v) {
            for (int i12 = 0; i12 < r10; i12++) {
                View q10 = q(i12);
                if (q10 != null && (T2 = this.b.T(q10)) != null && !T2.r() && (this.q.d(q10) < e || this.q.m(q10) < e)) {
                    d1(hVar, 0, i12);
                    return;
                }
            }
            return;
        }
        int i13 = r10 - 1;
        for (int i14 = i13; i14 >= 0; i14--) {
            View q11 = q(i14);
            if (q11 != null && (T = this.b.T(q11)) != null && !T.r() && (this.q.d(q11) < e || this.q.m(q11) < e)) {
                d1(hVar, i13, i14);
                return;
            }
        }
    }

    @Override // f2.v0
    public final boolean d() {
        return !this.u && this.o == 0;
    }

    public final void d1(af.h hVar, int i10, int i11) {
        if (i10 == i11) {
            return;
        }
        if (i11 <= i10) {
            while (i10 > i11) {
                i0(i10, hVar);
                i10--;
            }
        } else {
            for (int i12 = i11 - 1; i12 >= i10; i12--) {
                i0(i12, hVar);
            }
        }
    }

    @Override // f2.v0
    public boolean e() {
        return !this.u && this.o == 1;
    }

    @Override // f2.v0
    public final h0 e0() {
        h0 h0Var = this.B;
        if (h0Var != null) {
            h0 h0Var2 = new h0();
            h0Var2.a = h0Var.a;
            h0Var2.b = h0Var.b;
            h0Var2.c = h0Var.c;
            return h0Var2;
        }
        h0 h0Var3 = new h0();
        if (r() <= 0) {
            h0Var3.a = -1;
            return h0Var3;
        }
        G0();
        boolean z4 = this.s ^ this.v;
        h0Var3.c = z4;
        if (z4) {
            View U0 = U0();
            h0Var3.b = this.q.f() - this.q.a(U0);
            h0Var3.a = ((w0) U0.getLayoutParams()).b();
            return h0Var3;
        }
        View V0 = V0();
        h0Var3.a = v0.H(V0);
        h0Var3.b = this.q.d(V0) - this.q.j();
        return h0Var3;
    }

    public void e1(af.h hVar, int i10, int i11) {
        l1 T;
        l1 T2;
        if (i10 < 0) {
            return;
        }
        int i12 = i10 - i11;
        int r10 = r();
        if (!this.v) {
            for (int i13 = 0; i13 < r10; i13++) {
                View q10 = q(i13);
                if (q10 != null && (T = this.b.T(q10)) != null && !T.r() && (this.q.a(q10) > i12 || this.q.l(q10) > i12)) {
                    d1(hVar, 0, i13);
                    return;
                }
            }
            return;
        }
        int i14 = r10 - 1;
        for (int i15 = i14; i15 >= 0; i15--) {
            View q11 = q(i15);
            if (q11 != null && (T2 = this.b.T(q11)) != null && !T2.r() && (this.q.a(q11) > i12 || this.q.l(q11) > i12)) {
                d1(hVar, i14, i15);
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

    public final int g1(int i10, af.h hVar, i1 i1Var) {
        if (r() == 0 || i10 == 0) {
            return 0;
        }
        G0();
        this.p.a = true;
        int i11 = i10 > 0 ? 1 : -1;
        int abs = Math.abs(i10);
        m1(i11, abs, true, i1Var);
        g0 g0Var = this.p;
        int H0 = H0(hVar, g0Var, i1Var, false) + g0Var.g;
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

    @Override // f2.v0
    public int h(i1 i1Var) {
        return C0(i1Var);
    }

    public void h1(int i10, int i11) {
        i1(i10, i11, this.v);
    }

    @Override // f2.v0
    public int i(i1 i1Var) {
        return D0(i1Var);
    }

    public void i1(int i10, int i11, boolean z4) {
        if (this.y == i10 && this.A == i11 && this.z == z4) {
            return;
        }
        this.y = i10;
        this.A = i11;
        this.z = z4;
        h0 h0Var = this.B;
        if (h0Var != null) {
            h0Var.a = -1;
        }
        l0();
    }

    @Override // f2.v0
    public int j(i1 i1Var) {
        return B0(i1Var);
    }

    public final void j1(int i10) {
        l0 l0Var;
        if (i10 != 0 && i10 != 1) {
            throw new IllegalArgumentException(kf.k0.j(i10, "invalid orientation:"));
        }
        b(null);
        if (i10 != this.o || this.q == null) {
            if (i10 == 0) {
                l0Var = new l0(this, 0);
            } else {
                if (i10 != 1) {
                    throw new IllegalArgumentException("invalid orientation");
                }
                l0Var = new l0(this, 1);
            }
            this.q = l0Var;
            this.C.f = l0Var;
            this.o = i10;
            l0();
        }
    }

    @Override // f2.v0
    public int k(i1 i1Var) {
        return C0(i1Var);
    }

    public void k1(boolean z4) {
        b(null);
        if (z4 == this.t) {
            return;
        }
        this.t = z4;
        l0();
    }

    @Override // f2.v0
    public int l(i1 i1Var) {
        return D0(i1Var);
    }

    public void l1(boolean z4) {
        b(null);
        if (this.w == z4) {
            return;
        }
        this.w = z4;
        l0();
    }

    @Override // f2.v0
    public final View m(int i10) {
        int r10 = r();
        if (r10 == 0) {
            return null;
        }
        int H = i10 - v0.H(q(0));
        if (H >= 0 && H < r10) {
            View q10 = q(H);
            if (v0.H(q10) == i10) {
                return q10;
            }
        }
        int r11 = r();
        for (int i11 = 0; i11 < r11; i11++) {
            View q11 = q(i11);
            l1 U = RecyclerView.U(q11);
            if (U != null && U.c() == i10 && !U.r() && (this.b.q0.g || !U.j())) {
                return q11;
            }
        }
        return null;
    }

    @Override // f2.v0
    public int m0(int i10, af.h hVar, i1 i1Var) {
        if (this.o == 1) {
            return 0;
        }
        return g1(i10, hVar, i1Var);
    }

    public final void m1(int i10, int i11, boolean z4, i1 i1Var) {
        int j10;
        this.p.l = this.q.h() == 0 && this.q.e() == 0;
        this.p.f = i10;
        int[] iArr = this.F;
        iArr[0] = 0;
        iArr[1] = 0;
        z0(i1Var, iArr);
        int max = Math.max(0, iArr[0]);
        int max2 = Math.max(0, iArr[1]);
        boolean z10 = i10 == 1;
        g0 g0Var = this.p;
        int i12 = z10 ? max2 : max;
        g0Var.h = i12;
        if (!z10) {
            max = max2;
        }
        g0Var.i = max;
        if (z10) {
            g0Var.h = this.q.g() + i12;
            View U0 = U0();
            g0 g0Var2 = this.p;
            g0Var2.e = this.v ? -1 : 1;
            int H = v0.H(U0);
            g0 g0Var3 = this.p;
            g0Var2.d = H + g0Var3.e;
            g0Var3.b = this.q.a(U0);
            j10 = this.q.a(U0) - this.q.f();
        } else {
            View V0 = V0();
            g0 g0Var4 = this.p;
            g0Var4.h = this.q.j() + g0Var4.h;
            g0 g0Var5 = this.p;
            g0Var5.e = this.v ? 1 : -1;
            int H2 = v0.H(V0);
            g0 g0Var6 = this.p;
            g0Var5.d = H2 + g0Var6.e;
            g0Var6.b = this.q.d(V0);
            j10 = (-this.q.d(V0)) + this.q.j();
        }
        g0 g0Var7 = this.p;
        g0Var7.c = i11;
        if (z4) {
            g0Var7.c = i11 - j10;
        }
        g0Var7.g = j10;
    }

    @Override // f2.v0
    public w0 n() {
        return new w0(-2, -2);
    }

    @Override // f2.v0
    public void n0(int i10) {
        this.y = i10;
        this.A = TLObject.FLAG_31;
        h0 h0Var = this.B;
        if (h0Var != null) {
            h0Var.a = -1;
        }
        l0();
    }

    public final void n1(int i10, int i11) {
        this.p.c = this.q.f() - i11;
        g0 g0Var = this.p;
        g0Var.e = this.v ? -1 : 1;
        g0Var.d = i10;
        g0Var.f = 1;
        g0Var.b = i11;
        g0Var.g = TLObject.FLAG_31;
    }

    @Override // f2.v0
    public int o0(int i10, af.h hVar, i1 i1Var) {
        if (this.o == 0) {
            return 0;
        }
        return g1(i10, hVar, i1Var);
    }

    public final void o1(int i10, int i11) {
        this.p.c = i11 - this.q.j();
        g0 g0Var = this.p;
        g0Var.d = i10;
        g0Var.e = this.v ? 1 : -1;
        g0Var.f = -1;
        g0Var.b = i11;
        g0Var.g = TLObject.FLAG_31;
    }

    @Override // f2.v0
    public void v0(RecyclerView recyclerView, i1 i1Var, int i10) {
        j0 j0Var = new j0(recyclerView.getContext());
        j0Var.a = i10;
        w0(j0Var);
    }

    @Override // f2.v0
    public boolean y0() {
        return this.B == null && this.s == this.w;
    }

    public void z0(i1 i1Var, int[] iArr) {
        int i10;
        int W0 = W0(i1Var);
        if (this.p.f == -1) {
            i10 = 0;
        } else {
            i10 = W0;
            W0 = 0;
        }
        iArr[0] = W0;
        iArr[1] = i10;
    }

    public i0(int i10, boolean z4) {
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
        b4.v vVar = new b4.v();
        vVar.f();
        this.C = vVar;
        this.D = new f0();
        this.E = 2;
        this.F = new int[2];
        this.G = true;
        this.H = true;
        j1(i10);
        k1(z4);
    }

    public void a1(af.h hVar, i1 i1Var, b4.v vVar, int i10) {
    }
}
