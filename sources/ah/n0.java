package ah;

import android.widget.FrameLayout;
import bi.d7;
import bi.gb;
import bi.h5;
import bi.l4;
import bi.pb;
import bi.s6;
import di.pc;
import di.w9;
import fi.q4;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.f3;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.n2;
import org.telegram.ui.Components.dm;
import org.telegram.ui.Components.ob;
import org.telegram.ui.Components.qc;
import org.telegram.ui.Components.ub;
import org.telegram.ui.Components.ux0;
import org.telegram.ui.Components.y7;

/* compiled from: r8-map-id-1181a9f210c4244598aa36bb39e1460f3842f305ed8c0c95af755ee091fedd7d */
/* loaded from: classes3.dex */
public final class n0 implements ob {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ n0(Object obj, int i10) {
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
        h5 h5Var;
        f6 f6Var;
        switch (this.a) {
            case 0:
                break;
            case 1:
                if (qcVar.a == 2 && (h5Var = ((l4) this.b).x.Q1) != null) {
                    pb pbVar = ((gb) h5Var).d;
                    pbVar.Y0 = true;
                    pbVar.P();
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
                break;
            default:
                ub ubVar = qcVar.e;
                yh.j0 j0Var = (yh.j0) this.b;
                dh.d c10 = j0Var.e.c(ubVar, null, true);
                f6Var = ((f3) j0Var).resourcesProvider;
                eh.e eVar = new eh.e(f6Var);
                eVar.e = new w9(5);
                float dpf2 = AndroidUtilities.dpf2(0.5f);
                float dpf22 = AndroidUtilities.dpf2(0.5f);
                eVar.f = dpf2;
                eVar.h = dpf22;
                c10.n(eVar);
                c10.p(AndroidUtilities.dp(16.0f));
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
        h5 h5Var;
        switch (this.a) {
            case 1:
                if (qcVar.a == 2 && (h5Var = ((l4) this.b).x.Q1) != null) {
                    pb pbVar = ((gb) h5Var).d;
                    pbVar.Y0 = false;
                    pbVar.P();
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
        switch (this.a) {
            case 0:
                return (int) ((u0) ((w) this.b).c).u;
            case 1:
                if (((l4) this.b).x.x2) {
                    return 0;
                }
                return AndroidUtilities.dp(64.0f);
            case 2:
                return ((s6) this.b).r.getPaddingBottom();
            case 3:
                return 0;
            case 4:
                editTextHeight = ((pc) this.b).c1.getEditTextHeight();
                dp = AndroidUtilities.dp(12.0f);
                break;
            case 5:
                return ((y7) this.b).e.E.getHeight();
            case 6:
                return ((n2) this.b).getBottomInset();
            case 7:
                ob obVar = (ob) this.b;
                if (obVar == null) {
                    return 0;
                }
                return obVar.f(i10);
            case 8:
                editTextHeight = AndroidUtilities.dp(126.0f);
                dp = ((dm) this.b).c.b.getBottomInset();
                break;
            case 9:
                FrameLayout frameLayout = ((ux0) this.b).w;
                if (frameLayout != null) {
                    return frameLayout.getHeight();
                }
                return 0;
            case 10:
                org.telegram.ui.web.d1 d1Var = (org.telegram.ui.web.d1) this.b;
                if (!(d1Var.getParent() instanceof q4)) {
                    return 0;
                }
                q4 q4Var = (q4) d1Var.getParent();
                return (int) ((q4Var.getSwipeOffsetY() + q4Var.getOffsetY()) - q4Var.getTopActionBarOffsetY());
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
                return (int) (((d7) this.b).a + AndroidUtilities.dp(58.0f));
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

    private final /* synthetic */ void u(qc qcVar) {
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
