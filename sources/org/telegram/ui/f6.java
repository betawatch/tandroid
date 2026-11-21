package org.telegram.ui;

import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.RectF;
import android.view.View;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes3.dex */
public final /* synthetic */ class f6 implements org.telegram.ui.ActionBar.u6 {
    public final /* synthetic */ int a;
    public final /* synthetic */ org.telegram.ui.ActionBar.g2 b;

    public /* synthetic */ f6(int i7, org.telegram.ui.ActionBar.g2 g2Var) {
        this.a = i7;
        this.b = g2Var;
    }

    @Override // org.telegram.ui.ActionBar.u6
    public final /* synthetic */ void a(float f10) {
        int i7 = this.a;
    }

    @Override // org.telegram.ui.ActionBar.u6
    public final void b() {
        int i7 = this.a;
        org.telegram.ui.ActionBar.g2 g2Var = this.b;
        switch (i7) {
            case 0:
                au auVar = ((x6) g2Var).a0;
                if (auVar != null) {
                    auVar.v0(org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.h5, false));
                    break;
                }
                break;
            case 1:
                ((bn) g2Var).Fb();
                break;
            case 2:
                ((vo) g2Var).getClass();
                break;
            case 3:
                ((cp) g2Var).h.f();
                break;
            case 4:
                ((np) g2Var).getClass();
                break;
            case 5:
                ((rq) g2Var).getClass();
                break;
            case 6:
                ((ContactsActivity) g2Var).getClass();
                break;
            case 7:
                cx cxVar = (cx) g2Var;
                kw kwVar = cxVar.D0;
                if (kwVar != null) {
                    org.telegram.ui.ActionBar.y actionMode = kwVar.getActionMode();
                    if (actionMode != null) {
                        org.telegram.ui.ActionBar.t6.h(org.telegram.ui.ActionBar.m6.w8, actionMode, cxVar.getResourceProvider());
                    }
                    org.telegram.ui.ActionBar.q0 speedItem = cxVar.D0.getSpeedItem();
                    if (speedItem != null) {
                        speedItem.getIconView().setColorFilter(new PorterDuffColorFilter(cxVar.getThemedColor(org.telegram.ui.ActionBar.m6.y8), PorterDuff.Mode.SRC_IN));
                        break;
                    }
                }
                break;
            case 8:
                ((kz) g2Var).getClass();
                break;
            case 9:
                ((s00) g2Var).x0();
                break;
            case 10:
                ((v50) g2Var).a0(true);
                break;
            case 11:
                ((de0) g2Var).Q1();
                break;
            case 12:
                ((ff0) g2Var).g0();
                break;
            case 13:
                ((og0) g2Var).f0();
                break;
            case 14:
                ((NotificationsCustomSettingsActivity) g2Var).getClass();
                break;
            case 15:
                ((lm0) g2Var).J0();
                break;
            case 16:
                ((PremiumPreviewFragment) g2Var).z0();
                break;
            case 17:
                ((st0) g2Var).getClass();
                break;
            case 18:
                RectF rectF = ProfileActivity.Z6;
                ((ProfileActivity) g2Var).p5();
                break;
            case 19:
                ((jx0) g2Var).getClass();
                break;
            case 20:
                ((ey0) g2Var).b.f();
                break;
            case 21:
                ((c51) g2Var).s0();
                break;
            case 22:
                ThemeActivity themeActivity = (ThemeActivity) g2Var;
                for (int i10 = 0; i10 < themeActivity.b.getChildCount(); i10++) {
                    View childAt = themeActivity.b.getChildAt(i10);
                    if (childAt instanceof org.telegram.ui.Cells.t) {
                        ((org.telegram.ui.Cells.t) childAt).getAdapter().f();
                    } else if (childAt instanceof rl0) {
                        ((rl0) childAt).updateColors();
                    }
                }
                for (int i11 = 0; i11 < themeActivity.b.getCachedChildCount(); i11++) {
                    View P = themeActivity.b.P(i11);
                    if (P instanceof org.telegram.ui.Cells.t) {
                        ((org.telegram.ui.Cells.t) P).getAdapter().f();
                    } else if (P instanceof rl0) {
                        ((rl0) P).updateColors();
                    }
                }
                for (int i12 = 0; i12 < themeActivity.b.getHiddenChildCount(); i12++) {
                    View V = themeActivity.b.V(i12);
                    if (V instanceof org.telegram.ui.Cells.t) {
                        ((org.telegram.ui.Cells.t) V).getAdapter().f();
                    } else if (V instanceof rl0) {
                        ((rl0) V).updateColors();
                    }
                }
                for (int i13 = 0; i13 < themeActivity.b.getAttachedScrapChildCount(); i13++) {
                    View O = themeActivity.b.O(i13);
                    if (O instanceof org.telegram.ui.Cells.t) {
                        ((org.telegram.ui.Cells.t) O).getAdapter().f();
                    } else if (O instanceof rl0) {
                        ((rl0) O).updateColors();
                    }
                }
                break;
            case 23:
                ((x71) g2Var).V0();
                break;
            default:
                ((p81) g2Var).Z();
                break;
        }
    }

    private final /* synthetic */ void A(float f10) {
    }

    private final /* synthetic */ void c(float f10) {
    }

    private final /* synthetic */ void d(float f10) {
    }

    private final /* synthetic */ void e(float f10) {
    }

    private final /* synthetic */ void f(float f10) {
    }

    private final /* synthetic */ void g(float f10) {
    }

    private final /* synthetic */ void h(float f10) {
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

    private final /* synthetic */ void u(float f10) {
    }

    private final /* synthetic */ void v(float f10) {
    }

    private final /* synthetic */ void w(float f10) {
    }

    private final /* synthetic */ void x(float f10) {
    }

    private final /* synthetic */ void y(float f10) {
    }

    private final /* synthetic */ void z(float f10) {
    }
}
