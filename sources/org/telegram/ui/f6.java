package org.telegram.ui;

import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.RectF;
import android.view.View;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final /* synthetic */ class f6 implements org.telegram.ui.ActionBar.v6 {
    public final /* synthetic */ int a;
    public final /* synthetic */ org.telegram.ui.ActionBar.h2 b;

    public /* synthetic */ f6(int i7, org.telegram.ui.ActionBar.h2 h2Var) {
        this.a = i7;
        this.b = h2Var;
    }

    @Override // org.telegram.ui.ActionBar.v6
    public final /* synthetic */ void a(float f10) {
        int i7 = this.a;
    }

    @Override // org.telegram.ui.ActionBar.v6
    public final void b() {
        int i7 = this.a;
        org.telegram.ui.ActionBar.h2 h2Var = this.b;
        switch (i7) {
            case 0:
                au auVar = ((x6) h2Var).a0;
                if (auVar != null) {
                    auVar.v0(org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.h5, false));
                    break;
                }
                break;
            case 1:
                ((bn) h2Var).Fb();
                break;
            case 2:
                ((vo) h2Var).getClass();
                break;
            case 3:
                ((cp) h2Var).h.f();
                break;
            case 4:
                ((np) h2Var).getClass();
                break;
            case 5:
                ((rq) h2Var).getClass();
                break;
            case 6:
                ((ContactsActivity) h2Var).getClass();
                break;
            case 7:
                cx cxVar = (cx) h2Var;
                kw kwVar = cxVar.D0;
                if (kwVar != null) {
                    org.telegram.ui.ActionBar.z actionMode = kwVar.getActionMode();
                    if (actionMode != null) {
                        org.telegram.ui.ActionBar.u6.h(org.telegram.ui.ActionBar.n6.w8, actionMode, cxVar.getResourceProvider());
                    }
                    org.telegram.ui.ActionBar.r0 speedItem = cxVar.D0.getSpeedItem();
                    if (speedItem != null) {
                        speedItem.getIconView().setColorFilter(new PorterDuffColorFilter(cxVar.getThemedColor(org.telegram.ui.ActionBar.n6.y8), PorterDuff.Mode.SRC_IN));
                        break;
                    }
                }
                break;
            case 8:
                ((kz) h2Var).getClass();
                break;
            case 9:
                ((s00) h2Var).x0();
                break;
            case 10:
                ((v50) h2Var).a0(true);
                break;
            case 11:
                ((de0) h2Var).Q1();
                break;
            case 12:
                ((ff0) h2Var).g0();
                break;
            case 13:
                ((ng0) h2Var).f0();
                break;
            case 14:
                ((NotificationsCustomSettingsActivity) h2Var).getClass();
                break;
            case 15:
                ((lm0) h2Var).J0();
                break;
            case 16:
                ((PremiumPreviewFragment) h2Var).z0();
                break;
            case 17:
                ((st0) h2Var).getClass();
                break;
            case 18:
                RectF rectF = ProfileActivity.Z6;
                ((ProfileActivity) h2Var).p5();
                break;
            case 19:
                ((jx0) h2Var).getClass();
                break;
            case 20:
                ((ey0) h2Var).b.f();
                break;
            case 21:
                ((c51) h2Var).s0();
                break;
            case 22:
                ThemeActivity themeActivity = (ThemeActivity) h2Var;
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
                ((x71) h2Var).V0();
                break;
            default:
                ((p81) h2Var).Z();
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
