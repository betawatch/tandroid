package gh;

import android.widget.FrameLayout;
import jh.i9;
import jh.z8;
import lh.sb;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.db;
import org.telegram.ui.Components.ec;
import org.telegram.ui.Components.ex0;
import org.telegram.ui.Components.jb;
import org.telegram.ui.Components.q7;
import org.telegram.ui.Components.ql;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public final class w0 implements db {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ w0(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // org.telegram.ui.Components.db
    public final /* synthetic */ boolean a() {
        switch (this.a) {
        }
        return true;
    }

    @Override // org.telegram.ui.Components.db
    public final void b(ec ecVar) {
        org.telegram.ui.ActionBar.c6 c6Var;
        jh.y3 y3Var;
        switch (this.a) {
            case 0:
                jb jbVar = ecVar.e;
                x0 x0Var = (x0) this.b;
                lg.d c10 = x0Var.e.c(jbVar, null, true);
                c6Var = ((org.telegram.ui.ActionBar.e3) x0Var).resourcesProvider;
                mg.d dVar = new mg.d(c6Var);
                dVar.e = new ng.a(2);
                float dpf2 = AndroidUtilities.dpf2(0.5f);
                float dpf22 = AndroidUtilities.dpf2(0.5f);
                dVar.f = dpf2;
                dVar.h = dpf22;
                c10.n(dVar);
                c10.p(AndroidUtilities.dp(16.0f));
                jbVar.setCustomBackground(c10);
                break;
            case 2:
                if (ecVar.a == 2 && (y3Var = ((jh.j3) this.b).x.M1) != null) {
                    i9 i9Var = ((z8) y3Var).d;
                    i9Var.U0 = true;
                    i9Var.P();
                    break;
                }
                break;
        }
    }

    @Override // org.telegram.ui.Components.db
    public final /* synthetic */ void c(float f10) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Components.db
    public final void d(ec ecVar) {
        jh.y3 y3Var;
        switch (this.a) {
            case 2:
                if (ecVar.a == 2 && (y3Var = ((jh.j3) this.b).x.M1) != null) {
                    i9 i9Var = ((z8) y3Var).d;
                    i9Var.U0 = false;
                    i9Var.P();
                    break;
                }
                break;
        }
    }

    @Override // org.telegram.ui.Components.db
    public final /* synthetic */ boolean e() {
        switch (this.a) {
        }
        return true;
    }

    @Override // org.telegram.ui.Components.db
    public final int f(int i10) {
        int editTextHeight;
        int dp;
        switch (this.a) {
            case 0:
                return 0;
            case 1:
                return (int) ((ig.d0) ((ag.y1) this.b).c).u;
            case 2:
                if (((jh.j3) this.b).x.t2) {
                    return 0;
                }
                return AndroidUtilities.dp(64.0f);
            case 3:
                return ((jh.c5) this.b).r.getPaddingBottom();
            case 4:
                return 0;
            case 5:
                editTextHeight = ((sb) this.b).Y0.getEditTextHeight();
                dp = AndroidUtilities.dp(12.0f);
                break;
            case 6:
                return ((q7) this.b).e.A.getHeight();
            case 7:
                return ((org.telegram.ui.ActionBar.n2) this.b).getBottomInset();
            case 8:
                db dbVar = (db) this.b;
                if (dbVar == null) {
                    return 0;
                }
                return dbVar.f(i10);
            case 9:
                editTextHeight = AndroidUtilities.dp(126.0f);
                dp = ((ql) this.b).c.b.getBottomInset();
                break;
            case 10:
                FrameLayout frameLayout = ((ex0) this.b).w;
                if (frameLayout != null) {
                    return frameLayout.getHeight();
                }
                return 0;
            default:
                org.telegram.ui.web.z0 z0Var = (org.telegram.ui.web.z0) this.b;
                if (!(z0Var.getParent() instanceof nh.d4)) {
                    return 0;
                }
                nh.d4 d4Var = (nh.d4) z0Var.getParent();
                return (int) ((d4Var.getSwipeOffsetY() + d4Var.getOffsetY()) - d4Var.getTopActionBarOffsetY());
        }
        return dp + editTextHeight;
    }

    @Override // org.telegram.ui.Components.db
    public final boolean g(int i10) {
        switch (this.a) {
            case 2:
                if (i10 == 1 || i10 == 2 || i10 == 3) {
                }
                break;
            case 8:
                db dbVar = (db) this.b;
                if (dbVar == null || !dbVar.g(i10)) {
                }
                break;
        }
        return false;
    }

    @Override // org.telegram.ui.Components.db
    public final int h(int i10) {
        switch (this.a) {
            case 8:
                db dbVar = (db) this.b;
                if (dbVar != null) {
                    break;
                } else {
                    break;
                }
        }
        return 0;
    }

    private final /* synthetic */ void A(ec ecVar) {
    }

    private final /* synthetic */ void B(ec ecVar) {
    }

    private final /* synthetic */ void C(ec ecVar) {
    }

    private final /* synthetic */ void D(ec ecVar) {
    }

    private final /* synthetic */ void E(ec ecVar) {
    }

    private final /* synthetic */ void F(ec ecVar) {
    }

    private final /* synthetic */ void G(ec ecVar) {
    }

    private final /* synthetic */ void H(ec ecVar) {
    }

    private final /* synthetic */ void I(ec ecVar) {
    }

    private final /* synthetic */ void J(ec ecVar) {
    }

    private final /* synthetic */ void K(ec ecVar) {
    }

    private final /* synthetic */ void L(ec ecVar) {
    }

    private final /* synthetic */ void M(ec ecVar) {
    }

    private final /* synthetic */ void N(ec ecVar) {
    }

    private final /* synthetic */ void O(ec ecVar) {
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

    private final /* synthetic */ void u(ec ecVar) {
    }

    private final /* synthetic */ void v(ec ecVar) {
    }

    private final /* synthetic */ void w(ec ecVar) {
    }

    private final /* synthetic */ void x(ec ecVar) {
    }

    private final /* synthetic */ void y(ec ecVar) {
    }

    private final /* synthetic */ void z(ec ecVar) {
    }
}
