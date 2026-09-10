package bi;

import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.hy0;
import org.telegram.ui.Components.im;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes4.dex */
public final class rd implements org.telegram.ui.Components.nb {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ rd(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // org.telegram.ui.Components.nb
    public final /* synthetic */ boolean a() {
        switch (this.a) {
        }
        return true;
    }

    @Override // org.telegram.ui.Components.nb
    public final void b(org.telegram.ui.Components.pc pcVar) {
        org.telegram.ui.ActionBar.f6 f6Var;
        zh.w2 w2Var;
        switch (this.a) {
            case 7:
                org.telegram.ui.Components.tb tbVar = pcVar.e;
                wh.k0 k0Var = (wh.k0) this.b;
                bh.d c10 = k0Var.e.c(tbVar, null, true);
                f6Var = ((org.telegram.ui.ActionBar.h3) k0Var).resourcesProvider;
                ch.e eVar = new ch.e(f6Var);
                eVar.e = new androidx.emoji2.text.w(27);
                float dpf2 = AndroidUtilities.dpf2(0.5f);
                float dpf22 = AndroidUtilities.dpf2(0.5f);
                eVar.f = dpf2;
                eVar.h = dpf22;
                c10.n(eVar);
                c10.p(AndroidUtilities.dp(16.0f));
                tbVar.setCustomBackground(c10);
                break;
            case 9:
                if (pcVar.a == 2 && (w2Var = ((zh.h2) this.b).x.Q1) != null) {
                    zh.u7 u7Var = ((zh.l7) w2Var).d;
                    u7Var.Y0 = true;
                    u7Var.P();
                    break;
                }
                break;
        }
    }

    @Override // org.telegram.ui.Components.nb
    public final /* synthetic */ void c(float f7) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Components.nb
    public final void d(org.telegram.ui.Components.pc pcVar) {
        zh.w2 w2Var;
        switch (this.a) {
            case 9:
                if (pcVar.a == 2 && (w2Var = ((zh.h2) this.b).x.Q1) != null) {
                    zh.u7 u7Var = ((zh.l7) w2Var).d;
                    u7Var.Y0 = false;
                    u7Var.P();
                    break;
                }
                break;
        }
    }

    @Override // org.telegram.ui.Components.nb
    public final /* synthetic */ boolean e() {
        switch (this.a) {
        }
        return true;
    }

    @Override // org.telegram.ui.Components.nb
    public final int f(int i10) {
        int editTextHeight;
        int dp;
        switch (this.a) {
            case 0:
                editTextHeight = ((ce) this.b).c1.getEditTextHeight();
                dp = AndroidUtilities.dp(12.0f);
                break;
            case 1:
                return ((org.telegram.ui.Components.x7) this.b).e.E.getHeight();
            case 2:
                return ((org.telegram.ui.ActionBar.p2) this.b).getBottomInset();
            case 3:
                org.telegram.ui.Components.nb nbVar = (org.telegram.ui.Components.nb) this.b;
                if (nbVar == null) {
                    return 0;
                }
                return nbVar.f(i10);
            case 4:
                editTextHeight = AndroidUtilities.dp(126.0f);
                dp = ((im) this.b).c.b.getBottomInset();
                break;
            case 5:
                FrameLayout frameLayout = ((hy0) this.b).w;
                if (frameLayout != null) {
                    return frameLayout.getHeight();
                }
                return 0;
            case 6:
                org.telegram.ui.web.c1 c1Var = (org.telegram.ui.web.c1) this.b;
                if (!(c1Var.getParent() instanceof di.t4)) {
                    return 0;
                }
                di.t4 t4Var = (di.t4) c1Var.getParent();
                return (int) ((t4Var.getSwipeOffsetY() + t4Var.getOffsetY()) - t4Var.getTopActionBarOffsetY());
            case 7:
                return 0;
            case 8:
                return (int) ((yg.c0) ((xh.t3) this.b).c).u;
            case 9:
                if (((zh.h2) this.b).x.x2) {
                    return 0;
                }
                return AndroidUtilities.dp(64.0f);
            case 10:
                return ((zh.z3) this.b).r.getPaddingBottom();
            default:
                return 0;
        }
        return dp + editTextHeight;
    }

    @Override // org.telegram.ui.Components.nb
    public final boolean g(int i10) {
        switch (this.a) {
            case 3:
                org.telegram.ui.Components.nb nbVar = (org.telegram.ui.Components.nb) this.b;
                if (nbVar == null || !nbVar.g(i10)) {
                }
                break;
            case 9:
                if (i10 == 1 || i10 == 2 || i10 == 3) {
                }
                break;
        }
        return false;
    }

    @Override // org.telegram.ui.Components.nb
    public final int h(int i10) {
        switch (this.a) {
            case 0:
                return 0;
            case 1:
                return 0;
            case 2:
                return 0;
            case 3:
                org.telegram.ui.Components.nb nbVar = (org.telegram.ui.Components.nb) this.b;
                return nbVar == null ? AndroidUtilities.statusBarHeight : nbVar.h(i10);
            case 4:
                return 0;
            case 5:
                return 0;
            case 6:
                return 0;
            case 7:
                return AndroidUtilities.statusBarHeight;
            case 8:
                return 0;
            case 9:
                return AndroidUtilities.dp(58.0f);
            case 10:
                return 0;
            default:
                return (int) (((zh.h4) this.b).a + AndroidUtilities.dp(58.0f));
        }
    }

    private final /* synthetic */ void A(org.telegram.ui.Components.pc pcVar) {
    }

    private final /* synthetic */ void B(org.telegram.ui.Components.pc pcVar) {
    }

    private final /* synthetic */ void C(org.telegram.ui.Components.pc pcVar) {
    }

    private final /* synthetic */ void D(org.telegram.ui.Components.pc pcVar) {
    }

    private final /* synthetic */ void E(org.telegram.ui.Components.pc pcVar) {
    }

    private final /* synthetic */ void F(org.telegram.ui.Components.pc pcVar) {
    }

    private final /* synthetic */ void G(org.telegram.ui.Components.pc pcVar) {
    }

    private final /* synthetic */ void H(org.telegram.ui.Components.pc pcVar) {
    }

    private final /* synthetic */ void I(org.telegram.ui.Components.pc pcVar) {
    }

    private final /* synthetic */ void J(org.telegram.ui.Components.pc pcVar) {
    }

    private final /* synthetic */ void K(org.telegram.ui.Components.pc pcVar) {
    }

    private final /* synthetic */ void L(org.telegram.ui.Components.pc pcVar) {
    }

    private final /* synthetic */ void M(org.telegram.ui.Components.pc pcVar) {
    }

    private final /* synthetic */ void N(org.telegram.ui.Components.pc pcVar) {
    }

    private final /* synthetic */ void O(org.telegram.ui.Components.pc pcVar) {
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

    private final /* synthetic */ void u(org.telegram.ui.Components.pc pcVar) {
    }

    private final /* synthetic */ void v(org.telegram.ui.Components.pc pcVar) {
    }

    private final /* synthetic */ void w(org.telegram.ui.Components.pc pcVar) {
    }

    private final /* synthetic */ void x(org.telegram.ui.Components.pc pcVar) {
    }

    private final /* synthetic */ void y(org.telegram.ui.Components.pc pcVar) {
    }

    private final /* synthetic */ void z(org.telegram.ui.Components.pc pcVar) {
    }
}
