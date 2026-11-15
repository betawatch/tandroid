package org.telegram.ui;

import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.RectF;
import android.view.View;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final /* synthetic */ class g6 implements org.telegram.ui.ActionBar.r6 {
    public final /* synthetic */ int a;
    public final /* synthetic */ org.telegram.ui.ActionBar.e2 b;

    public /* synthetic */ g6(int i7, org.telegram.ui.ActionBar.e2 e2Var) {
        this.a = i7;
        this.b = e2Var;
    }

    @Override // org.telegram.ui.ActionBar.r6
    public final /* synthetic */ void a(float f10) {
        int i7 = this.a;
    }

    @Override // org.telegram.ui.ActionBar.r6
    public final void b() {
        int i7 = this.a;
        org.telegram.ui.ActionBar.e2 e2Var = this.b;
        switch (i7) {
            case 0:
                yt ytVar = ((y6) e2Var).a0;
                if (ytVar != null) {
                    ytVar.v0(org.telegram.ui.ActionBar.j6.x0(null, org.telegram.ui.ActionBar.j6.h5, false));
                    break;
                }
                break;
            case 1:
                ((an) e2Var).Fb();
                break;
            case 2:
                ((to) e2Var).getClass();
                break;
            case 3:
                ((ap) e2Var).h.f();
                break;
            case 4:
                ((mp) e2Var).getClass();
                break;
            case 5:
                ((qq) e2Var).getClass();
                break;
            case 6:
                ((ContactsActivity) e2Var).getClass();
                break;
            case 7:
                yw ywVar = (yw) e2Var;
                hw hwVar = ywVar.D0;
                if (hwVar != null) {
                    org.telegram.ui.ActionBar.y actionMode = hwVar.getActionMode();
                    if (actionMode != null) {
                        org.telegram.ui.ActionBar.q6.h(org.telegram.ui.ActionBar.j6.w8, actionMode, ywVar.getResourceProvider());
                    }
                    org.telegram.ui.ActionBar.q0 speedItem = ywVar.D0.getSpeedItem();
                    if (speedItem != null) {
                        speedItem.getIconView().setColorFilter(new PorterDuffColorFilter(ywVar.getThemedColor(org.telegram.ui.ActionBar.j6.y8), PorterDuff.Mode.SRC_IN));
                        break;
                    }
                }
                break;
            case 8:
                ((hz) e2Var).getClass();
                break;
            case 9:
                ((p00) e2Var).x0();
                break;
            case 10:
                ((t50) e2Var).a0(true);
                break;
            case 11:
                ((ce0) e2Var).Q1();
                break;
            case 12:
                ((cf0) e2Var).g0();
                break;
            case 13:
                ((jg0) e2Var).f0();
                break;
            case 14:
                ((NotificationsCustomSettingsActivity) e2Var).getClass();
                break;
            case 15:
                ((jm0) e2Var).J0();
                break;
            case 16:
                ((PremiumPreviewFragment) e2Var).z0();
                break;
            case 17:
                ((pt0) e2Var).getClass();
                break;
            case 18:
                RectF rectF = ProfileActivity.X6;
                ((ProfileActivity) e2Var).o5();
                break;
            case 19:
                ((fx0) e2Var).getClass();
                break;
            case 20:
                ((zx0) e2Var).b.f();
                break;
            case 21:
                ((z41) e2Var).s0();
                break;
            case 22:
                ThemeActivity themeActivity = (ThemeActivity) e2Var;
                for (int i10 = 0; i10 < themeActivity.b.getChildCount(); i10++) {
                    View childAt = themeActivity.b.getChildAt(i10);
                    if (childAt instanceof org.telegram.ui.Cells.t) {
                        ((org.telegram.ui.Cells.t) childAt).getAdapter().f();
                    } else if (childAt instanceof pl0) {
                        ((pl0) childAt).updateColors();
                    }
                }
                for (int i11 = 0; i11 < themeActivity.b.getCachedChildCount(); i11++) {
                    View P = themeActivity.b.P(i11);
                    if (P instanceof org.telegram.ui.Cells.t) {
                        ((org.telegram.ui.Cells.t) P).getAdapter().f();
                    } else if (P instanceof pl0) {
                        ((pl0) P).updateColors();
                    }
                }
                for (int i12 = 0; i12 < themeActivity.b.getHiddenChildCount(); i12++) {
                    View V = themeActivity.b.V(i12);
                    if (V instanceof org.telegram.ui.Cells.t) {
                        ((org.telegram.ui.Cells.t) V).getAdapter().f();
                    } else if (V instanceof pl0) {
                        ((pl0) V).updateColors();
                    }
                }
                for (int i13 = 0; i13 < themeActivity.b.getAttachedScrapChildCount(); i13++) {
                    View O = themeActivity.b.O(i13);
                    if (O instanceof org.telegram.ui.Cells.t) {
                        ((org.telegram.ui.Cells.t) O).getAdapter().f();
                    } else if (O instanceof pl0) {
                        ((pl0) O).updateColors();
                    }
                }
                break;
            case 23:
                ((t71) e2Var).V0();
                break;
            default:
                ((l81) e2Var).Z();
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
