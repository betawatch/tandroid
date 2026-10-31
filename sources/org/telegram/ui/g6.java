package org.telegram.ui;

import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.RectF;
import android.view.View;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class g6 implements org.telegram.ui.ActionBar.b7 {
    public final /* synthetic */ int a;
    public final /* synthetic */ org.telegram.ui.ActionBar.k2 b;

    public /* synthetic */ g6(int i10, org.telegram.ui.ActionBar.k2 k2Var) {
        this.a = i10;
        this.b = k2Var;
    }

    @Override // org.telegram.ui.ActionBar.b7
    public final /* synthetic */ void a(float f7) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.ActionBar.b7
    public final void b() {
        int i10 = this.a;
        org.telegram.ui.ActionBar.k2 k2Var = this.b;
        switch (i10) {
            case 0:
                zu zuVar = ((y6) k2Var).Z;
                if (zuVar != null) {
                    zuVar.v0(org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.h5, false));
                    break;
                }
                break;
            case 1:
                ((un) k2Var).rb();
                break;
            case 2:
                ((qp) k2Var).getClass();
                break;
            case 3:
                ((xp) k2Var).h.f();
                break;
            case 4:
                ((iq) k2Var).getClass();
                break;
            case 5:
                ((pr) k2Var).getClass();
                break;
            case 6:
                ((ContactsActivity) k2Var).getClass();
                break;
            case 7:
                ay ayVar = (ay) k2Var;
                kx kxVar = ayVar.C0;
                if (kxVar != null) {
                    org.telegram.ui.ActionBar.y actionMode = kxVar.getActionMode();
                    if (actionMode != null) {
                        org.telegram.ui.ActionBar.a7.i(org.telegram.ui.ActionBar.t6.w8, actionMode, ayVar.getResourceProvider());
                    }
                    org.telegram.ui.ActionBar.t0 speedItem = ayVar.C0.getSpeedItem();
                    if (speedItem != null) {
                        speedItem.getIconView().setColorFilter(new PorterDuffColorFilter(ayVar.getThemedColor(org.telegram.ui.ActionBar.t6.y8), PorterDuff.Mode.SRC_IN));
                        break;
                    }
                }
                break;
            case 8:
                ((i00) k2Var).getClass();
                break;
            case 9:
                ((p10) k2Var).w0();
                break;
            case 10:
                ((s60) k2Var).Z(true);
                break;
            case 11:
                ((hf0) k2Var).G1();
                break;
            case 12:
                ((kg0) k2Var).f0();
                break;
            case 13:
                ((sh0) k2Var).e0();
                break;
            case 14:
                ((NotificationsCustomSettingsActivity) k2Var).getClass();
                break;
            case 15:
                ((tn0) k2Var).I0();
                break;
            case 16:
                ((PremiumPreviewFragment) k2Var).y0();
                break;
            case 17:
                ((av0) k2Var).getClass();
                break;
            case 18:
                RectF rectF = ProfileActivity.R6;
                ((ProfileActivity) k2Var).l5();
                break;
            case 19:
                ((uy0) k2Var).getClass();
                break;
            case 20:
                ((pz0) k2Var).b.f();
                break;
            case 21:
                ((u61) k2Var).r0();
                break;
            case 22:
                ThemeActivity themeActivity = (ThemeActivity) k2Var;
                for (int i11 = 0; i11 < themeActivity.b.getChildCount(); i11++) {
                    View childAt = themeActivity.b.getChildAt(i11);
                    if (childAt instanceof org.telegram.ui.Cells.t) {
                        ((org.telegram.ui.Cells.t) childAt).getAdapter().f();
                    } else if (childAt instanceof zm0) {
                        ((zm0) childAt).updateColors();
                    }
                }
                for (int i12 = 0; i12 < themeActivity.b.getCachedChildCount(); i12++) {
                    View P = themeActivity.b.P(i12);
                    if (P instanceof org.telegram.ui.Cells.t) {
                        ((org.telegram.ui.Cells.t) P).getAdapter().f();
                    } else if (P instanceof zm0) {
                        ((zm0) P).updateColors();
                    }
                }
                for (int i13 = 0; i13 < themeActivity.b.getHiddenChildCount(); i13++) {
                    View V = themeActivity.b.V(i13);
                    if (V instanceof org.telegram.ui.Cells.t) {
                        ((org.telegram.ui.Cells.t) V).getAdapter().f();
                    } else if (V instanceof zm0) {
                        ((zm0) V).updateColors();
                    }
                }
                for (int i14 = 0; i14 < themeActivity.b.getAttachedScrapChildCount(); i14++) {
                    View O = themeActivity.b.O(i14);
                    if (O instanceof org.telegram.ui.Cells.t) {
                        ((org.telegram.ui.Cells.t) O).getAdapter().f();
                    } else if (O instanceof zm0) {
                        ((zm0) O).updateColors();
                    }
                }
                break;
            case 23:
                ((m91) k2Var).U0();
                break;
            default:
                ((ea1) k2Var).Y();
                break;
        }
    }

    private final /* synthetic */ void A(float f7) {
    }

    private final /* synthetic */ void c(float f7) {
    }

    private final /* synthetic */ void d(float f7) {
    }

    private final /* synthetic */ void e(float f7) {
    }

    private final /* synthetic */ void f(float f7) {
    }

    private final /* synthetic */ void g(float f7) {
    }

    private final /* synthetic */ void h(float f7) {
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

    private final /* synthetic */ void u(float f7) {
    }

    private final /* synthetic */ void v(float f7) {
    }

    private final /* synthetic */ void w(float f7) {
    }

    private final /* synthetic */ void x(float f7) {
    }

    private final /* synthetic */ void y(float f7) {
    }

    private final /* synthetic */ void z(float f7) {
    }
}
