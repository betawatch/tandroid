package ai;

import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.dm;
import org.telegram.ui.Components.vx0;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes4.dex */
public final class w4 implements org.telegram.ui.Components.mb {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ w4(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // org.telegram.ui.Components.mb
    public final /* synthetic */ boolean a() {
        switch (this.a) {
        }
        return true;
    }

    @Override // org.telegram.ui.Components.mb
    public final void b(org.telegram.ui.Components.oc ocVar) {
        y5 y5Var;
        org.telegram.ui.ActionBar.e6 e6Var;
        switch (this.a) {
            case 0:
                if (ocVar.a == 2 && (y5Var = ((a5) this.b).x.Q1) != null) {
                    jc jcVar = ((ac) y5Var).d;
                    jcVar.Y0 = true;
                    jcVar.P();
                    break;
                }
                break;
            case 10:
                org.telegram.ui.Components.sb sbVar = ocVar.e;
                xh.j0 j0Var = (xh.j0) this.b;
                ch.d c10 = j0Var.e.c(sbVar, null, true);
                e6Var = ((org.telegram.ui.ActionBar.f3) j0Var).resourcesProvider;
                dh.e eVar = new dh.e(e6Var);
                eVar.e = new d2.c(4);
                float dpf2 = AndroidUtilities.dpf2(0.5f);
                float dpf22 = AndroidUtilities.dpf2(0.5f);
                eVar.f = dpf2;
                eVar.h = dpf22;
                c10.o(eVar);
                c10.q(AndroidUtilities.dp(16.0f));
                sbVar.setCustomBackground(c10);
                break;
        }
    }

    @Override // org.telegram.ui.Components.mb
    public final /* synthetic */ void c(float f7) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Components.mb
    public final void d(org.telegram.ui.Components.oc ocVar) {
        y5 y5Var;
        switch (this.a) {
            case 0:
                if (ocVar.a == 2 && (y5Var = ((a5) this.b).x.Q1) != null) {
                    jc jcVar = ((ac) y5Var).d;
                    jcVar.Y0 = false;
                    jcVar.P();
                    break;
                }
                break;
        }
    }

    @Override // org.telegram.ui.Components.mb
    public final /* synthetic */ boolean e() {
        switch (this.a) {
        }
        return true;
    }

    @Override // org.telegram.ui.Components.mb
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
                return ((j7) this.b).r.getPaddingBottom();
            case 2:
                return 0;
            case 3:
                editTextHeight = ((ci.oc) this.b).c1.getEditTextHeight();
                dp = AndroidUtilities.dp(12.0f);
                break;
            case 4:
                return ((org.telegram.ui.Components.v7) this.b).e.E.getHeight();
            case 5:
                return ((org.telegram.ui.ActionBar.n2) this.b).getBottomInset();
            case 6:
                org.telegram.ui.Components.mb mbVar = (org.telegram.ui.Components.mb) this.b;
                if (mbVar == null) {
                    return 0;
                }
                return mbVar.f(i10);
            case 7:
                editTextHeight = AndroidUtilities.dp(126.0f);
                dp = ((dm) this.b).c.b.getBottomInset();
                break;
            case 8:
                FrameLayout frameLayout = ((vx0) this.b).w;
                if (frameLayout != null) {
                    return frameLayout.getHeight();
                }
                return 0;
            case 9:
                org.telegram.ui.web.d1 d1Var = (org.telegram.ui.web.d1) this.b;
                if (!(d1Var.getParent() instanceof ei.p4)) {
                    return 0;
                }
                ei.p4 p4Var = (ei.p4) d1Var.getParent();
                return (int) ((p4Var.getSwipeOffsetY() + p4Var.getOffsetY()) - p4Var.getTopActionBarOffsetY());
            case 10:
                return 0;
            default:
                return (int) ((zg.c0) ((yh.v3) this.b).c).u;
        }
        return dp + editTextHeight;
    }

    @Override // org.telegram.ui.Components.mb
    public final boolean g(int i10) {
        switch (this.a) {
            case 0:
                if (i10 == 1 || i10 == 2 || i10 == 3) {
                }
                break;
            case 6:
                org.telegram.ui.Components.mb mbVar = (org.telegram.ui.Components.mb) this.b;
                if (mbVar == null || !mbVar.g(i10)) {
                }
                break;
        }
        return false;
    }

    @Override // org.telegram.ui.Components.mb
    public final int h(int i10) {
        switch (this.a) {
            case 0:
                return AndroidUtilities.dp(58.0f);
            case 1:
                return 0;
            case 2:
                return (int) (((u7) this.b).a + AndroidUtilities.dp(58.0f));
            case 3:
                return 0;
            case 4:
                return 0;
            case 5:
                return 0;
            case 6:
                org.telegram.ui.Components.mb mbVar = (org.telegram.ui.Components.mb) this.b;
                return mbVar == null ? AndroidUtilities.statusBarHeight : mbVar.h(i10);
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

    private final /* synthetic */ void A(org.telegram.ui.Components.oc ocVar) {
    }

    private final /* synthetic */ void B(org.telegram.ui.Components.oc ocVar) {
    }

    private final /* synthetic */ void C(org.telegram.ui.Components.oc ocVar) {
    }

    private final /* synthetic */ void D(org.telegram.ui.Components.oc ocVar) {
    }

    private final /* synthetic */ void E(org.telegram.ui.Components.oc ocVar) {
    }

    private final /* synthetic */ void F(org.telegram.ui.Components.oc ocVar) {
    }

    private final /* synthetic */ void G(org.telegram.ui.Components.oc ocVar) {
    }

    private final /* synthetic */ void H(org.telegram.ui.Components.oc ocVar) {
    }

    private final /* synthetic */ void I(org.telegram.ui.Components.oc ocVar) {
    }

    private final /* synthetic */ void J(org.telegram.ui.Components.oc ocVar) {
    }

    private final /* synthetic */ void K(org.telegram.ui.Components.oc ocVar) {
    }

    private final /* synthetic */ void L(org.telegram.ui.Components.oc ocVar) {
    }

    private final /* synthetic */ void M(org.telegram.ui.Components.oc ocVar) {
    }

    private final /* synthetic */ void N(org.telegram.ui.Components.oc ocVar) {
    }

    private final /* synthetic */ void O(org.telegram.ui.Components.oc ocVar) {
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

    private final /* synthetic */ void u(org.telegram.ui.Components.oc ocVar) {
    }

    private final /* synthetic */ void v(org.telegram.ui.Components.oc ocVar) {
    }

    private final /* synthetic */ void w(org.telegram.ui.Components.oc ocVar) {
    }

    private final /* synthetic */ void x(org.telegram.ui.Components.oc ocVar) {
    }

    private final /* synthetic */ void y(org.telegram.ui.Components.oc ocVar) {
    }

    private final /* synthetic */ void z(org.telegram.ui.Components.oc ocVar) {
    }
}
