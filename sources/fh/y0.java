package fh;

import android.widget.FrameLayout;
import ih.d9;
import ih.m9;
import kh.wb;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.cx0;
import org.telegram.ui.Components.fb;
import org.telegram.ui.Components.gc;
import org.telegram.ui.Components.lb;
import org.telegram.ui.Components.q7;
import org.telegram.ui.Components.ul;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class y0 implements fb {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ y0(Object obj, int i9) {
        this.a = i9;
        this.b = obj;
    }

    @Override // org.telegram.ui.Components.fb
    public final /* synthetic */ boolean a() {
        switch (this.a) {
        }
        return true;
    }

    @Override // org.telegram.ui.Components.fb
    public final void b(gc gcVar) {
        org.telegram.ui.ActionBar.b6 b6Var;
        ih.c4 c4Var;
        switch (this.a) {
            case 0:
                lb lbVar = gcVar.e;
                z0 z0Var = (z0) this.b;
                kg.d c10 = z0Var.e.c(lbVar, null, true);
                b6Var = ((org.telegram.ui.ActionBar.f3) z0Var).resourcesProvider;
                lg.d dVar = new lg.d(b6Var);
                dVar.e = new i3.i(25);
                float dpf2 = AndroidUtilities.dpf2(0.5f);
                float dpf22 = AndroidUtilities.dpf2(0.5f);
                dVar.f = dpf2;
                dVar.h = dpf22;
                c10.n(dVar);
                c10.p(AndroidUtilities.dp(16.0f));
                lbVar.setCustomBackground(c10);
                break;
            case 2:
                if (gcVar.a == 2 && (c4Var = ((ih.l3) this.b).x.M1) != null) {
                    m9 m9Var = ((d9) c4Var).d;
                    m9Var.U0 = true;
                    m9Var.P();
                    break;
                }
                break;
        }
    }

    @Override // org.telegram.ui.Components.fb
    public final /* synthetic */ void c(float f10) {
        int i9 = this.a;
    }

    @Override // org.telegram.ui.Components.fb
    public final void d(gc gcVar) {
        ih.c4 c4Var;
        switch (this.a) {
            case 2:
                if (gcVar.a == 2 && (c4Var = ((ih.l3) this.b).x.M1) != null) {
                    m9 m9Var = ((d9) c4Var).d;
                    m9Var.U0 = false;
                    m9Var.P();
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
    public final int f(int i9) {
        int editTextHeight;
        int dp;
        switch (this.a) {
            case 0:
                return 0;
            case 1:
                return (int) ((hg.e0) ((v) this.b).b).u;
            case 2:
                if (((ih.l3) this.b).x.t2) {
                    return 0;
                }
                return AndroidUtilities.dp(64.0f);
            case 3:
                return ((ih.g5) this.b).r.getPaddingBottom();
            case 4:
                return 0;
            case 5:
                editTextHeight = ((wb) this.b).Y0.getEditTextHeight();
                dp = AndroidUtilities.dp(12.0f);
                break;
            case 6:
                return ((q7) this.b).e.A.getHeight();
            case 7:
                return ((org.telegram.ui.ActionBar.o2) this.b).getBottomInset();
            case 8:
                fb fbVar = (fb) this.b;
                if (fbVar == null) {
                    return 0;
                }
                return fbVar.f(i9);
            case 9:
                editTextHeight = AndroidUtilities.dp(126.0f);
                dp = ((ul) this.b).c.b.getBottomInset();
                break;
            case 10:
                FrameLayout frameLayout = ((cx0) this.b).w;
                if (frameLayout != null) {
                    return frameLayout.getHeight();
                }
                return 0;
            default:
                org.telegram.ui.web.y0 y0Var = (org.telegram.ui.web.y0) this.b;
                if (!(y0Var.getParent() instanceof mh.f4)) {
                    return 0;
                }
                mh.f4 f4Var = (mh.f4) y0Var.getParent();
                return (int) ((f4Var.getSwipeOffsetY() + f4Var.getOffsetY()) - f4Var.getTopActionBarOffsetY());
        }
        return dp + editTextHeight;
    }

    @Override // org.telegram.ui.Components.fb
    public final boolean g(int i9) {
        switch (this.a) {
            case 2:
                if (i9 == 1 || i9 == 2 || i9 == 3) {
                }
                break;
            case 8:
                fb fbVar = (fb) this.b;
                if (fbVar == null || !fbVar.g(i9)) {
                }
                break;
        }
        return false;
    }

    @Override // org.telegram.ui.Components.fb
    public final int h(int i9) {
        switch (this.a) {
            case 8:
                fb fbVar = (fb) this.b;
                if (fbVar != null) {
                    break;
                } else {
                    break;
                }
        }
        return 0;
    }

    private final /* synthetic */ void A(gc gcVar) {
    }

    private final /* synthetic */ void B(gc gcVar) {
    }

    private final /* synthetic */ void C(gc gcVar) {
    }

    private final /* synthetic */ void D(gc gcVar) {
    }

    private final /* synthetic */ void E(gc gcVar) {
    }

    private final /* synthetic */ void F(gc gcVar) {
    }

    private final /* synthetic */ void G(gc gcVar) {
    }

    private final /* synthetic */ void H(gc gcVar) {
    }

    private final /* synthetic */ void I(gc gcVar) {
    }

    private final /* synthetic */ void J(gc gcVar) {
    }

    private final /* synthetic */ void K(gc gcVar) {
    }

    private final /* synthetic */ void L(gc gcVar) {
    }

    private final /* synthetic */ void M(gc gcVar) {
    }

    private final /* synthetic */ void N(gc gcVar) {
    }

    private final /* synthetic */ void O(gc gcVar) {
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

    private final /* synthetic */ void u(gc gcVar) {
    }

    private final /* synthetic */ void v(gc gcVar) {
    }

    private final /* synthetic */ void w(gc gcVar) {
    }

    private final /* synthetic */ void x(gc gcVar) {
    }

    private final /* synthetic */ void y(gc gcVar) {
    }

    private final /* synthetic */ void z(gc gcVar) {
    }
}
