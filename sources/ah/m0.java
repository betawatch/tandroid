package ah;

import android.widget.FrameLayout;
import bi.h7;
import bi.j5;
import bi.jb;
import bi.o4;
import bi.sb;
import bi.w2;
import bi.w6;
import di.kc;
import fi.p4;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.ActionBar.e3;
import org.telegram.ui.ActionBar.m2;
import org.telegram.ui.Components.a8;
import org.telegram.ui.Components.qb;
import org.telegram.ui.Components.rm;
import org.telegram.ui.Components.sc;
import org.telegram.ui.Components.ty0;
import org.telegram.ui.Components.wb;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes3.dex */
public final class m0 implements qb {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ m0(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // org.telegram.ui.Components.qb
    public final /* synthetic */ boolean a() {
        switch (this.a) {
        }
        return true;
    }

    @Override // org.telegram.ui.Components.qb
    public final void b(sc scVar) {
        j5 j5Var;
        c6 c6Var;
        switch (this.a) {
            case 0:
                break;
            case 1:
                if (scVar.a == 2 && (j5Var = ((o4) this.b).x.Q1) != null) {
                    sb sbVar = ((jb) j5Var).d;
                    sbVar.Y0 = true;
                    sbVar.P();
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
                wb wbVar = scVar.e;
                yh.k0 k0Var = (yh.k0) this.b;
                dh.d c10 = k0Var.e.c(wbVar, null, true);
                c6Var = ((e3) k0Var).resourcesProvider;
                eh.e eVar = new eh.e(c6Var);
                eVar.e = new w2(18);
                float dpf2 = AndroidUtilities.dpf2(0.5f);
                float dpf22 = AndroidUtilities.dpf2(0.5f);
                eVar.f = dpf2;
                eVar.h = dpf22;
                c10.o(eVar);
                c10.q(AndroidUtilities.dp(16.0f));
                wbVar.setCustomBackground(c10);
                break;
        }
    }

    @Override // org.telegram.ui.Components.qb
    public final /* synthetic */ void c(float f7) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Components.qb
    public final void d(sc scVar) {
        j5 j5Var;
        switch (this.a) {
            case 1:
                if (scVar.a == 2 && (j5Var = ((o4) this.b).x.Q1) != null) {
                    sb sbVar = ((jb) j5Var).d;
                    sbVar.Y0 = false;
                    sbVar.P();
                    break;
                }
                break;
        }
    }

    @Override // org.telegram.ui.Components.qb
    public final /* synthetic */ boolean e() {
        switch (this.a) {
        }
        return true;
    }

    @Override // org.telegram.ui.Components.qb
    public final int f(int i10) {
        int editTextHeight;
        int dp;
        switch (this.a) {
            case 0:
                return (int) ((t0) ((v) this.b).c).u;
            case 1:
                if (((o4) this.b).x.x2) {
                    return 0;
                }
                return AndroidUtilities.dp(64.0f);
            case 2:
                return ((w6) this.b).r.getPaddingBottom();
            case 3:
                return 0;
            case 4:
                editTextHeight = ((kc) this.b).c1.getEditTextHeight();
                dp = AndroidUtilities.dp(12.0f);
                break;
            case 5:
                return ((a8) this.b).e.E.getHeight();
            case 6:
                return ((m2) this.b).getBottomInset();
            case 7:
                qb qbVar = (qb) this.b;
                if (qbVar == null) {
                    return 0;
                }
                return qbVar.f(i10);
            case 8:
                editTextHeight = AndroidUtilities.dp(126.0f);
                dp = ((rm) this.b).c.b.getBottomInset();
                break;
            case 9:
                FrameLayout frameLayout = ((ty0) this.b).w;
                if (frameLayout != null) {
                    return frameLayout.getHeight();
                }
                return 0;
            case 10:
                org.telegram.ui.web.b1 b1Var = (org.telegram.ui.web.b1) this.b;
                if (!(b1Var.getParent() instanceof p4)) {
                    return 0;
                }
                p4 p4Var = (p4) b1Var.getParent();
                return (int) ((p4Var.getSwipeOffsetY() + p4Var.getOffsetY()) - p4Var.getTopActionBarOffsetY());
            default:
                return 0;
        }
        return dp + editTextHeight;
    }

    @Override // org.telegram.ui.Components.qb
    public final boolean g(int i10) {
        switch (this.a) {
            case 1:
                if (i10 == 1 || i10 == 2 || i10 == 3) {
                }
                break;
            case 7:
                qb qbVar = (qb) this.b;
                if (qbVar == null || !qbVar.g(i10)) {
                }
                break;
        }
        return false;
    }

    @Override // org.telegram.ui.Components.qb
    public final int h(int i10) {
        switch (this.a) {
            case 0:
                return 0;
            case 1:
                return AndroidUtilities.dp(58.0f);
            case 2:
                return 0;
            case 3:
                return (int) (((h7) this.b).a + AndroidUtilities.dp(58.0f));
            case 4:
                return 0;
            case 5:
                return 0;
            case 6:
                return 0;
            case 7:
                qb qbVar = (qb) this.b;
                return qbVar == null ? AndroidUtilities.statusBarHeight : qbVar.h(i10);
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

    private final /* synthetic */ void A(sc scVar) {
    }

    private final /* synthetic */ void B(sc scVar) {
    }

    private final /* synthetic */ void C(sc scVar) {
    }

    private final /* synthetic */ void D(sc scVar) {
    }

    private final /* synthetic */ void E(sc scVar) {
    }

    private final /* synthetic */ void F(sc scVar) {
    }

    private final /* synthetic */ void G(sc scVar) {
    }

    private final /* synthetic */ void H(sc scVar) {
    }

    private final /* synthetic */ void I(sc scVar) {
    }

    private final /* synthetic */ void J(sc scVar) {
    }

    private final /* synthetic */ void K(sc scVar) {
    }

    private final /* synthetic */ void L(sc scVar) {
    }

    private final /* synthetic */ void M(sc scVar) {
    }

    private final /* synthetic */ void N(sc scVar) {
    }

    private final /* synthetic */ void O(sc scVar) {
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

    private final /* synthetic */ void u(sc scVar) {
    }

    private final /* synthetic */ void v(sc scVar) {
    }

    private final /* synthetic */ void w(sc scVar) {
    }

    private final /* synthetic */ void x(sc scVar) {
    }

    private final /* synthetic */ void y(sc scVar) {
    }

    private final /* synthetic */ void z(sc scVar) {
    }
}
