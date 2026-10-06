package ai;

import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.gm;
import org.telegram.ui.Components.ry0;

/* compiled from: r8-map-id-512d310aee599d224f4c0b0a2d01feec484432ddc9f55a7433fffe3405d6493d */
/* loaded from: classes4.dex */
public final class w4 implements org.telegram.ui.Components.pb {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ w4(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // org.telegram.ui.Components.pb
    public final /* synthetic */ boolean a() {
        switch (this.a) {
        }
        return true;
    }

    @Override // org.telegram.ui.Components.pb
    public final void b(org.telegram.ui.Components.rc rcVar) {
        x5 x5Var;
        org.telegram.ui.ActionBar.d6 d6Var;
        switch (this.a) {
            case 0:
                if (rcVar.a == 2 && (x5Var = ((a5) this.b).x.Q1) != null) {
                    jc jcVar = ((ac) x5Var).d;
                    jcVar.Y0 = true;
                    jcVar.P();
                    break;
                }
                break;
            case 10:
                org.telegram.ui.Components.vb vbVar = rcVar.e;
                xh.j0 j0Var = (xh.j0) this.b;
                ch.d c10 = j0Var.e.c(vbVar, null, true);
                d6Var = ((org.telegram.ui.ActionBar.f3) j0Var).resourcesProvider;
                dh.e eVar = new dh.e(d6Var);
                eVar.e = new d2.c(4);
                float dpf2 = AndroidUtilities.dpf2(0.5f);
                float dpf22 = AndroidUtilities.dpf2(0.5f);
                eVar.f = dpf2;
                eVar.h = dpf22;
                c10.w(eVar);
                c10.y(AndroidUtilities.dp(16.0f));
                vbVar.setCustomBackground(c10);
                break;
        }
    }

    @Override // org.telegram.ui.Components.pb
    public final /* synthetic */ void c(float f7) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Components.pb
    public final void d(org.telegram.ui.Components.rc rcVar) {
        x5 x5Var;
        switch (this.a) {
            case 0:
                if (rcVar.a == 2 && (x5Var = ((a5) this.b).x.Q1) != null) {
                    jc jcVar = ((ac) x5Var).d;
                    jcVar.Y0 = false;
                    jcVar.P();
                    break;
                }
                break;
        }
    }

    @Override // org.telegram.ui.Components.pb
    public final /* synthetic */ boolean e() {
        switch (this.a) {
        }
        return true;
    }

    @Override // org.telegram.ui.Components.pb
    public final int f(int i10) {
        int editTextHeight;
        int dp;
        switch (this.a) {
            case 0:
                if (((a5) this.b).x.x2) {
                    return 0;
                }
                return AndroidUtilities.dp(64.0f);
            case 1:
                return ((k7) this.b).r.getPaddingBottom();
            case 2:
                return 0;
            case 3:
                editTextHeight = ((ci.kc) this.b).c1.getEditTextHeight();
                dp = AndroidUtilities.dp(12.0f);
                break;
            case 4:
                return ((org.telegram.ui.Components.x7) this.b).e.E.getHeight();
            case 5:
                return ((org.telegram.ui.ActionBar.n2) this.b).getBottomInset();
            case 6:
                org.telegram.ui.Components.pb pbVar = (org.telegram.ui.Components.pb) this.b;
                if (pbVar == null) {
                    return 0;
                }
                return pbVar.f(i10);
            case 7:
                editTextHeight = AndroidUtilities.dp(126.0f);
                dp = ((gm) this.b).c.b.getBottomInset();
                break;
            case 8:
                FrameLayout frameLayout = ((ry0) this.b).w;
                if (frameLayout != null) {
                    return frameLayout.getHeight();
                }
                return 0;
            case 9:
                org.telegram.ui.web.c1 c1Var = (org.telegram.ui.web.c1) this.b;
                if (!(c1Var.getParent() instanceof ei.q4)) {
                    return 0;
                }
                ei.q4 q4Var = (ei.q4) c1Var.getParent();
                return (int) ((q4Var.getSwipeOffsetY() + q4Var.getOffsetY()) - q4Var.getTopActionBarOffsetY());
            case 10:
                return 0;
            default:
                return (int) ((zg.z) ((yh.u3) this.b).c).u;
        }
        return dp + editTextHeight;
    }

    @Override // org.telegram.ui.Components.pb
    public final boolean g(int i10) {
        switch (this.a) {
            case 0:
                if (i10 == 1 || i10 == 2 || i10 == 3) {
                }
                break;
            case 6:
                org.telegram.ui.Components.pb pbVar = (org.telegram.ui.Components.pb) this.b;
                if (pbVar == null || !pbVar.g(i10)) {
                }
                break;
        }
        return false;
    }

    @Override // org.telegram.ui.Components.pb
    public final int h(int i10) {
        switch (this.a) {
            case 0:
                return AndroidUtilities.dp(58.0f);
            case 1:
                return 0;
            case 2:
                return (int) (((v7) this.b).a + AndroidUtilities.dp(58.0f));
            case 3:
                return 0;
            case 4:
                return 0;
            case 5:
                return 0;
            case 6:
                org.telegram.ui.Components.pb pbVar = (org.telegram.ui.Components.pb) this.b;
                return pbVar == null ? AndroidUtilities.statusBarHeight : pbVar.h(i10);
            case 7:
                return 0;
            case 8:
                return 0;
            case 9:
                return 0;
            case 10:
                return AndroidUtilities.statusBarHeight;
            default:
                return 0;
        }
    }

    private final /* synthetic */ void A(org.telegram.ui.Components.rc rcVar) {
    }

    private final /* synthetic */ void B(org.telegram.ui.Components.rc rcVar) {
    }

    private final /* synthetic */ void C(org.telegram.ui.Components.rc rcVar) {
    }

    private final /* synthetic */ void D(org.telegram.ui.Components.rc rcVar) {
    }

    private final /* synthetic */ void E(org.telegram.ui.Components.rc rcVar) {
    }

    private final /* synthetic */ void F(org.telegram.ui.Components.rc rcVar) {
    }

    private final /* synthetic */ void G(org.telegram.ui.Components.rc rcVar) {
    }

    private final /* synthetic */ void H(org.telegram.ui.Components.rc rcVar) {
    }

    private final /* synthetic */ void I(org.telegram.ui.Components.rc rcVar) {
    }

    private final /* synthetic */ void J(org.telegram.ui.Components.rc rcVar) {
    }

    private final /* synthetic */ void K(org.telegram.ui.Components.rc rcVar) {
    }

    private final /* synthetic */ void L(org.telegram.ui.Components.rc rcVar) {
    }

    private final /* synthetic */ void M(org.telegram.ui.Components.rc rcVar) {
    }

    private final /* synthetic */ void N(org.telegram.ui.Components.rc rcVar) {
    }

    private final /* synthetic */ void O(org.telegram.ui.Components.rc rcVar) {
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

    private final /* synthetic */ void u(org.telegram.ui.Components.rc rcVar) {
    }

    private final /* synthetic */ void v(org.telegram.ui.Components.rc rcVar) {
    }

    private final /* synthetic */ void w(org.telegram.ui.Components.rc rcVar) {
    }

    private final /* synthetic */ void x(org.telegram.ui.Components.rc rcVar) {
    }

    private final /* synthetic */ void y(org.telegram.ui.Components.rc rcVar) {
    }

    private final /* synthetic */ void z(org.telegram.ui.Components.rc rcVar) {
    }
}
