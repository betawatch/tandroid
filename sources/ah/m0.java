package ah;

import android.widget.FrameLayout;
import ci.e6;
import ci.i4;
import ci.q3;
import ci.q9;
import ci.t5;
import ci.z9;
import ei.vb;
import gi.e4;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.ActionBar.h3;
import org.telegram.ui.ActionBar.o2;
import org.telegram.ui.Components.ob;
import org.telegram.ui.Components.om;
import org.telegram.ui.Components.qc;
import org.telegram.ui.Components.ty0;
import org.telegram.ui.Components.ub;
import org.telegram.ui.Components.y7;

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
/* loaded from: classes3.dex */
public final class m0 implements ob {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ m0(Object obj, int i10) {
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
        i4 i4Var;
        g6 g6Var;
        switch (this.a) {
            case 0:
                break;
            case 1:
                if (qcVar.a == 2 && (i4Var = ((q3) this.b).x.Q1) != null) {
                    z9 z9Var = ((q9) i4Var).d;
                    z9Var.Y0 = true;
                    z9Var.P();
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
                yh.i0 i0Var = (yh.i0) this.b;
                dh.d c10 = i0Var.e.c(ubVar, null, true);
                g6Var = ((h3) i0Var).resourcesProvider;
                eh.e eVar = new eh.e(g6Var);
                eVar.e = new c3.m(22);
                float dpf2 = AndroidUtilities.dpf2(0.5f);
                float dpf22 = AndroidUtilities.dpf2(0.5f);
                eVar.f = dpf2;
                eVar.h = dpf22;
                c10.o(eVar);
                c10.q(AndroidUtilities.dp(16.0f));
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
        i4 i4Var;
        switch (this.a) {
            case 1:
                if (qcVar.a == 2 && (i4Var = ((q3) this.b).x.Q1) != null) {
                    z9 z9Var = ((q9) i4Var).d;
                    z9Var.Y0 = false;
                    z9Var.P();
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
                return (int) ((t0) ((v) this.b).c).u;
            case 1:
                if (((q3) this.b).x.x2) {
                    return 0;
                }
                return AndroidUtilities.dp(64.0f);
            case 2:
                return ((t5) this.b).r.getPaddingBottom();
            case 3:
                return 0;
            case 4:
                editTextHeight = ((vb) this.b).c1.getEditTextHeight();
                dp = AndroidUtilities.dp(12.0f);
                break;
            case 5:
                return ((y7) this.b).e.y.getHeight();
            case 6:
                return ((o2) this.b).getBottomInset();
            case 7:
                ob obVar = (ob) this.b;
                if (obVar == null) {
                    return 0;
                }
                return obVar.f(i10);
            case 8:
                editTextHeight = AndroidUtilities.dp(126.0f);
                dp = ((om) this.b).c.b.getBottomInset();
                break;
            case 9:
                FrameLayout frameLayout = ((ty0) this.b).w;
                if (frameLayout != null) {
                    return frameLayout.getHeight();
                }
                return 0;
            case 10:
                org.telegram.ui.web.b1 b1Var = (org.telegram.ui.web.b1) this.b;
                if (!(b1Var.getParent() instanceof e4)) {
                    return 0;
                }
                e4 e4Var = (e4) b1Var.getParent();
                return (int) ((e4Var.getSwipeOffsetY() + e4Var.getOffsetY()) - e4Var.getTopActionBarOffsetY());
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
