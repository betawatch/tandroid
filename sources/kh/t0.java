package kh;

import android.widget.FrameLayout;
import nh.i9;
import nh.z8;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.Components.fb;
import org.telegram.ui.Components.ic;
import org.telegram.ui.Components.nb;
import org.telegram.ui.Components.r7;
import org.telegram.ui.Components.xx0;
import org.telegram.ui.Components.zl;
import org.telegram.ui.cl0;
import ph.da;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes.dex */
public final class t0 implements fb {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ t0(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // org.telegram.ui.Components.fb
    public final /* synthetic */ boolean a() {
        switch (this.a) {
        }
        return true;
    }

    @Override // org.telegram.ui.Components.fb
    public final void b(ic icVar) {
        f6 f6Var;
        nh.x3 x3Var;
        switch (this.a) {
            case 0:
                nb nbVar = icVar.e;
                u0 u0Var = (u0) this.b;
                pg.b c3 = u0Var.e.c(nbVar, null, true);
                f6Var = ((org.telegram.ui.ActionBar.g3) u0Var).resourcesProvider;
                qg.d dVar = new qg.d(f6Var);
                dVar.e = new cl0(29);
                float dpf2 = AndroidUtilities.dpf2(0.5f);
                float dpf22 = AndroidUtilities.dpf2(0.5f);
                dVar.f = dpf2;
                dVar.h = dpf22;
                c3.n(dVar);
                c3.p(AndroidUtilities.dp(16.0f));
                nbVar.setCustomBackground(c3);
                break;
            case 2:
                if (icVar.a == 2 && (x3Var = ((nh.i3) this.b).x.N1) != null) {
                    i9 i9Var = ((z8) x3Var).d;
                    i9Var.V0 = true;
                    i9Var.P();
                    break;
                }
                break;
        }
    }

    @Override // org.telegram.ui.Components.fb
    public final /* synthetic */ void c(float f10) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Components.fb
    public final void d(ic icVar) {
        nh.x3 x3Var;
        switch (this.a) {
            case 2:
                if (icVar.a == 2 && (x3Var = ((nh.i3) this.b).x.N1) != null) {
                    i9 i9Var = ((z8) x3Var).d;
                    i9Var.V0 = false;
                    i9Var.P();
                    break;
                }
                break;
        }
    }

    @Override // org.telegram.ui.Components.fb
    public final /* synthetic */ boolean e() {
        switch (this.a) {
        }
        return true;
    }

    @Override // org.telegram.ui.Components.fb
    public final int f(int i10) {
        int dp;
        int bottomInset;
        switch (this.a) {
            case 0:
                return 0;
            case 1:
                return (int) ((mg.d0) ((ah.e) this.b).c).u;
            case 2:
                if (((nh.i3) this.b).x.u2) {
                    return 0;
                }
                return AndroidUtilities.dp(64.0f);
            case 3:
                return ((nh.d5) this.b).r.getPaddingBottom();
            case 4:
                return 0;
            case 5:
                return ((r7) this.b).e.B.getHeight();
            case 6:
                return ((org.telegram.ui.ActionBar.p2) this.b).getBottomInset();
            case 7:
                fb fbVar = (fb) this.b;
                if (fbVar == null) {
                    return 0;
                }
                return fbVar.f(i10);
            case 8:
                dp = AndroidUtilities.dp(126.0f);
                bottomInset = ((zl) this.b).c.b.getBottomInset();
                break;
            case 9:
                FrameLayout frameLayout = ((xx0) this.b).w;
                if (frameLayout != null) {
                    return frameLayout.getHeight();
                }
                return 0;
            case 10:
                org.telegram.ui.web.c1 c1Var = (org.telegram.ui.web.c1) this.b;
                if (!(c1Var.getParent() instanceof rh.m3)) {
                    return 0;
                }
                rh.m3 m3Var = (rh.m3) c1Var.getParent();
                return (int) ((m3Var.getSwipeOffsetY() + m3Var.getOffsetY()) - m3Var.getTopActionBarOffsetY());
            default:
                dp = ((da) this.b).Z0.getEditTextHeight();
                bottomInset = AndroidUtilities.dp(12.0f);
                break;
        }
        return bottomInset + dp;
    }

    @Override // org.telegram.ui.Components.fb
    public final boolean g(int i10) {
        switch (this.a) {
            case 2:
                if (i10 == 1 || i10 == 2 || i10 == 3) {
                }
                break;
            case 7:
                fb fbVar = (fb) this.b;
                if (fbVar == null || !fbVar.g(i10)) {
                }
                break;
        }
        return false;
    }

    @Override // org.telegram.ui.Components.fb
    public final int h(int i10) {
        switch (this.a) {
            case 7:
                fb fbVar = (fb) this.b;
                if (fbVar != null) {
                    break;
                } else {
                    break;
                }
        }
        return 0;
    }

    private final /* synthetic */ void A(ic icVar) {
    }

    private final /* synthetic */ void B(ic icVar) {
    }

    private final /* synthetic */ void C(ic icVar) {
    }

    private final /* synthetic */ void D(ic icVar) {
    }

    private final /* synthetic */ void E(ic icVar) {
    }

    private final /* synthetic */ void F(ic icVar) {
    }

    private final /* synthetic */ void G(ic icVar) {
    }

    private final /* synthetic */ void H(ic icVar) {
    }

    private final /* synthetic */ void I(ic icVar) {
    }

    private final /* synthetic */ void J(ic icVar) {
    }

    private final /* synthetic */ void K(ic icVar) {
    }

    private final /* synthetic */ void L(ic icVar) {
    }

    private final /* synthetic */ void M(ic icVar) {
    }

    private final /* synthetic */ void N(ic icVar) {
    }

    private final /* synthetic */ void O(ic icVar) {
    }

    private final /* synthetic */ void i(float f10) {
    }

    private final /* synthetic */ void j(float f10) {
    }

    private final /* synthetic */ void k(float f10) {
    }

    private final /* synthetic */ void l(float f10) {
    }

    private final /* synthetic */ void m(float f10) {
    }

    private final /* synthetic */ void n(float f10) {
    }

    private final /* synthetic */ void o(float f10) {
    }

    private final /* synthetic */ void p(float f10) {
    }

    private final /* synthetic */ void q(float f10) {
    }

    private final /* synthetic */ void r(float f10) {
    }

    private final /* synthetic */ void s(float f10) {
    }

    private final /* synthetic */ void t(float f10) {
    }

    private final /* synthetic */ void u(ic icVar) {
    }

    private final /* synthetic */ void v(ic icVar) {
    }

    private final /* synthetic */ void w(ic icVar) {
    }

    private final /* synthetic */ void x(ic icVar) {
    }

    private final /* synthetic */ void y(ic icVar) {
    }

    private final /* synthetic */ void z(ic icVar) {
    }
}
