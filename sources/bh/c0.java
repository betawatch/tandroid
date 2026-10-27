package bh;

import android.widget.FrameLayout;
import di.e6;
import di.j4;
import di.p9;
import di.q3;
import di.t5;
import di.y9;
import fi.sb;
import hi.n4;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.k3;
import org.telegram.ui.ActionBar.r2;
import org.telegram.ui.ActionBar.u6;
import org.telegram.ui.Components.a8;
import org.telegram.ui.Components.dz0;
import org.telegram.ui.Components.ob;
import org.telegram.ui.Components.pm;
import org.telegram.ui.Components.qc;
import org.telegram.ui.Components.ua0;
import org.telegram.ui.Components.ub;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes4.dex */
public final class c0 implements ob {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ c0(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // org.telegram.ui.Components.ob
    public final /* synthetic */ boolean a() {
        switch (this.a) {
        }
        return true;
    }

    @Override // org.telegram.ui.Components.ob
    public final void b(qc qcVar) {
        j4 j4Var;
        u6 u6Var;
        switch (this.a) {
            case 0:
                break;
            case 1:
                if (qcVar.a == 2 && (j4Var = ((q3) this.b).x.F1) != null) {
                    y9 y9Var = ((p9) j4Var).d;
                    y9Var.Y0 = true;
                    y9Var.Q();
                    break;
                }
                break;
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
                break;
            default:
                ub ubVar = qcVar.e;
                zh.i0 i0Var = (zh.i0) this.b;
                eh.d c10 = i0Var.e.c(ubVar, null, true);
                u6Var = ((k3) i0Var).resourcesProvider;
                fh.e eVar = new fh.e(u6Var);
                eVar.e = new gh.a(1);
                float dpf2 = AndroidUtilities.dpf2(0.5f);
                float dpf22 = AndroidUtilities.dpf2(0.5f);
                eVar.f = dpf2;
                eVar.h = dpf22;
                c10.v(eVar);
                c10.x(AndroidUtilities.dp(16.0f));
                ubVar.setCustomBackground(c10);
                break;
        }
    }

    @Override // org.telegram.ui.Components.ob
    public final /* synthetic */ void c(float f7) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Components.ob
    public final void d(qc qcVar) {
        j4 j4Var;
        switch (this.a) {
            case 1:
                if (qcVar.a == 2 && (j4Var = ((q3) this.b).x.F1) != null) {
                    y9 y9Var = ((p9) j4Var).d;
                    y9Var.Y0 = false;
                    y9Var.Q();
                    break;
                }
                break;
        }
    }

    @Override // org.telegram.ui.Components.ob
    public final /* synthetic */ boolean e() {
        switch (this.a) {
        }
        return true;
    }

    @Override // org.telegram.ui.Components.ob
    public final int f(int i10) {
        int editTextHeight;
        int dp;
        i0.b bVar;
        switch (this.a) {
            case 0:
                return (int) ((i0) ((p) this.b).c).u;
            case 1:
                if (((q3) this.b).x.m2) {
                    return 0;
                }
                return AndroidUtilities.dp(64.0f);
            case 2:
                return ((t5) this.b).r.getPaddingBottom();
            case 3:
                return 0;
            case 4:
                editTextHeight = ((sb) this.b).c1.getEditTextHeight();
                dp = AndroidUtilities.dp(12.0f);
                break;
            case 5:
                return ((a8) this.b).e.y.getHeight();
            case 6:
                return ((r2) this.b).getBottomInset();
            case 7:
                ob obVar = (ob) this.b;
                if (obVar == null) {
                    return 0;
                }
                return obVar.f(i10);
            case 8:
                editTextHeight = AndroidUtilities.dp(126.0f);
                dp = ((pm) this.b).c.b.getBottomInset();
                break;
            case 9:
                bVar = ((r2) ((ua0) this.b)).mSystemInsets;
                editTextHeight = bVar.d;
                dp = AndroidUtilities.dp(72.0f);
                break;
            case 10:
                FrameLayout frameLayout = ((dz0) this.b).w;
                if (frameLayout != null) {
                    return frameLayout.getHeight();
                }
                return 0;
            case 11:
                org.telegram.ui.web.a1 a1Var = (org.telegram.ui.web.a1) this.b;
                if (!(a1Var.getParent() instanceof n4)) {
                    return 0;
                }
                n4 n4Var = (n4) a1Var.getParent();
                return (int) ((n4Var.getSwipeOffsetY() + n4Var.getOffsetY()) - n4Var.getTopActionBarOffsetY());
            default:
                return 0;
        }
        return dp + editTextHeight;
    }

    @Override // org.telegram.ui.Components.ob
    public final boolean g(int i10) {
        switch (this.a) {
            case 1:
                if (i10 == 1 || i10 == 2 || i10 == 3) {
                }
                break;
            case 7:
                ob obVar = (ob) this.b;
                if (obVar == null || !obVar.g(i10)) {
                }
                break;
        }
        return false;
    }

    @Override // org.telegram.ui.Components.ob
    public final int h(int i10) {
        switch (this.a) {
            case 0:
                return 0;
            case 1:
                return AndroidUtilities.dp(58.0f);
            case 2:
                return 0;
            case 3:
                return (int) (((e6) this.b).a + AndroidUtilities.dp(58.0f));
            case 4:
                return 0;
            case 5:
                return 0;
            case 6:
                return 0;
            case 7:
                ob obVar = (ob) this.b;
                return obVar == null ? AndroidUtilities.statusBarHeight : obVar.h(i10);
            case 8:
                return 0;
            case 9:
                return 0;
            case 10:
                return 0;
            case 11:
                return 0;
            default:
                return AndroidUtilities.statusBarHeight;
        }
    }

    private final /* synthetic */ void A(qc qcVar) {
    }

    private final /* synthetic */ void B(qc qcVar) {
    }

    private final /* synthetic */ void C(qc qcVar) {
    }

    private final /* synthetic */ void D(qc qcVar) {
    }

    private final /* synthetic */ void E(qc qcVar) {
    }

    private final /* synthetic */ void F(qc qcVar) {
    }

    private final /* synthetic */ void G(qc qcVar) {
    }

    private final /* synthetic */ void H(qc qcVar) {
    }

    private final /* synthetic */ void I(qc qcVar) {
    }

    private final /* synthetic */ void J(qc qcVar) {
    }

    private final /* synthetic */ void K(qc qcVar) {
    }

    private final /* synthetic */ void L(qc qcVar) {
    }

    private final /* synthetic */ void M(qc qcVar) {
    }

    private final /* synthetic */ void N(qc qcVar) {
    }

    private final /* synthetic */ void O(qc qcVar) {
    }

    private final /* synthetic */ void P(qc qcVar) {
    }

    private final /* synthetic */ void Q(qc qcVar) {
    }

    private final /* synthetic */ void R(qc qcVar) {
    }

    private final /* synthetic */ void i(float f7) {
    }

    private final /* synthetic */ void j(float f7) {
    }

    private final /* synthetic */ void k(float f7) {
    }

    private final /* synthetic */ void l(float f7) {
    }

    private final /* synthetic */ void m(float f7) {
    }

    private final /* synthetic */ void n(float f7) {
    }

    private final /* synthetic */ void o(float f7) {
    }

    private final /* synthetic */ void p(float f7) {
    }

    private final /* synthetic */ void q(float f7) {
    }

    private final /* synthetic */ void r(float f7) {
    }

    private final /* synthetic */ void s(float f7) {
    }

    private final /* synthetic */ void t(float f7) {
    }

    private final /* synthetic */ void u(float f7) {
    }

    private final /* synthetic */ void v(qc qcVar) {
    }

    private final /* synthetic */ void w(qc qcVar) {
    }

    private final /* synthetic */ void x(qc qcVar) {
    }

    private final /* synthetic */ void y(qc qcVar) {
    }

    private final /* synthetic */ void z(qc qcVar) {
    }
}
