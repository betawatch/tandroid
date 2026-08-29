package ih;

import android.widget.FrameLayout;
import lh.i9;
import lh.z8;
import nh.gb;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.kb;
import org.telegram.ui.Components.mc;
import org.telegram.ui.Components.nx0;
import org.telegram.ui.Components.rb;
import org.telegram.ui.Components.v7;
import org.telegram.ui.Components.yl;
import org.telegram.ui.xx0;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public final class u0 implements kb {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ u0(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // org.telegram.ui.Components.kb
    public final /* synthetic */ boolean a() {
        switch (this.a) {
        }
        return true;
    }

    @Override // org.telegram.ui.Components.kb
    public final void b(mc mcVar) {
        org.telegram.ui.ActionBar.c6 c6Var;
        lh.x3 x3Var;
        switch (this.a) {
            case 0:
                rb rbVar = mcVar.e;
                v0 v0Var = (v0) this.b;
                ng.d c3 = v0Var.e.c(rbVar, null, true);
                c6Var = ((org.telegram.ui.ActionBar.f3) v0Var).resourcesProvider;
                og.d dVar = new og.d(c6Var);
                dVar.e = new xx0(11);
                float dpf2 = AndroidUtilities.dpf2(0.5f);
                float dpf22 = AndroidUtilities.dpf2(0.5f);
                dVar.f = dpf2;
                dVar.h = dpf22;
                c3.n(dVar);
                c3.p(AndroidUtilities.dp(16.0f));
                rbVar.setCustomBackground(c3);
                break;
            case 2:
                if (mcVar.a == 2 && (x3Var = ((lh.h3) this.b).x.M1) != null) {
                    i9 i9Var = ((z8) x3Var).d;
                    i9Var.U0 = true;
                    i9Var.P();
                    break;
                }
                break;
        }
    }

    @Override // org.telegram.ui.Components.kb
    public final /* synthetic */ void c(float f9) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Components.kb
    public final void d(mc mcVar) {
        lh.x3 x3Var;
        switch (this.a) {
            case 2:
                if (mcVar.a == 2 && (x3Var = ((lh.h3) this.b).x.M1) != null) {
                    i9 i9Var = ((z8) x3Var).d;
                    i9Var.U0 = false;
                    i9Var.P();
                    break;
                }
                break;
        }
    }

    @Override // org.telegram.ui.Components.kb
    public final /* synthetic */ boolean e() {
        switch (this.a) {
        }
        return true;
    }

    @Override // org.telegram.ui.Components.kb
    public final int f(int i10) {
        int editTextHeight;
        int dp;
        switch (this.a) {
            case 0:
                return 0;
            case 1:
                return (int) ((kg.d0) ((bg.d1) this.b).c).u;
            case 2:
                if (((lh.h3) this.b).x.t2) {
                    return 0;
                }
                return AndroidUtilities.dp(64.0f);
            case 3:
                return ((lh.c5) this.b).r.getPaddingBottom();
            case 4:
                return 0;
            case 5:
                editTextHeight = ((gb) this.b).Y0.getEditTextHeight();
                dp = AndroidUtilities.dp(12.0f);
                break;
            case 6:
                return ((v7) this.b).e.A.getHeight();
            case 7:
                return ((org.telegram.ui.ActionBar.o2) this.b).getBottomInset();
            case 8:
                kb kbVar = (kb) this.b;
                if (kbVar == null) {
                    return 0;
                }
                return kbVar.f(i10);
            case 9:
                editTextHeight = AndroidUtilities.dp(126.0f);
                dp = ((yl) this.b).c.b.getBottomInset();
                break;
            case 10:
                FrameLayout frameLayout = ((nx0) this.b).w;
                if (frameLayout != null) {
                    return frameLayout.getHeight();
                }
                return 0;
            default:
                org.telegram.ui.web.z0 z0Var = (org.telegram.ui.web.z0) this.b;
                if (!(z0Var.getParent() instanceof ph.m3)) {
                    return 0;
                }
                ph.m3 m3Var = (ph.m3) z0Var.getParent();
                return (int) ((m3Var.getSwipeOffsetY() + m3Var.getOffsetY()) - m3Var.getTopActionBarOffsetY());
        }
        return dp + editTextHeight;
    }

    @Override // org.telegram.ui.Components.kb
    public final boolean g(int i10) {
        switch (this.a) {
            case 2:
                if (i10 == 1 || i10 == 2 || i10 == 3) {
                }
                break;
            case 8:
                kb kbVar = (kb) this.b;
                if (kbVar == null || !kbVar.g(i10)) {
                }
                break;
        }
        return false;
    }

    @Override // org.telegram.ui.Components.kb
    public final int h(int i10) {
        switch (this.a) {
            case 8:
                kb kbVar = (kb) this.b;
                if (kbVar != null) {
                    break;
                } else {
                    break;
                }
        }
        return 0;
    }

    private final /* synthetic */ void A(mc mcVar) {
    }

    private final /* synthetic */ void B(mc mcVar) {
    }

    private final /* synthetic */ void C(mc mcVar) {
    }

    private final /* synthetic */ void D(mc mcVar) {
    }

    private final /* synthetic */ void E(mc mcVar) {
    }

    private final /* synthetic */ void F(mc mcVar) {
    }

    private final /* synthetic */ void G(mc mcVar) {
    }

    private final /* synthetic */ void H(mc mcVar) {
    }

    private final /* synthetic */ void I(mc mcVar) {
    }

    private final /* synthetic */ void J(mc mcVar) {
    }

    private final /* synthetic */ void K(mc mcVar) {
    }

    private final /* synthetic */ void L(mc mcVar) {
    }

    private final /* synthetic */ void M(mc mcVar) {
    }

    private final /* synthetic */ void N(mc mcVar) {
    }

    private final /* synthetic */ void O(mc mcVar) {
    }

    private final /* synthetic */ void i(float f9) {
    }

    private final /* synthetic */ void j(float f9) {
    }

    private final /* synthetic */ void k(float f9) {
    }

    private final /* synthetic */ void l(float f9) {
    }

    private final /* synthetic */ void m(float f9) {
    }

    private final /* synthetic */ void n(float f9) {
    }

    private final /* synthetic */ void o(float f9) {
    }

    private final /* synthetic */ void p(float f9) {
    }

    private final /* synthetic */ void q(float f9) {
    }

    private final /* synthetic */ void r(float f9) {
    }

    private final /* synthetic */ void s(float f9) {
    }

    private final /* synthetic */ void t(float f9) {
    }

    private final /* synthetic */ void u(mc mcVar) {
    }

    private final /* synthetic */ void v(mc mcVar) {
    }

    private final /* synthetic */ void w(mc mcVar) {
    }

    private final /* synthetic */ void x(mc mcVar) {
    }

    private final /* synthetic */ void y(mc mcVar) {
    }

    private final /* synthetic */ void z(mc mcVar) {
    }
}
