package org.telegram.ui;

import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.RectF;
import android.view.View;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final /* synthetic */ class g6 implements org.telegram.ui.ActionBar.v6 {
    public final /* synthetic */ int a;
    public final /* synthetic */ org.telegram.ui.ActionBar.g2 b;

    public /* synthetic */ g6(int i7, org.telegram.ui.ActionBar.g2 g2Var) {
        this.a = i7;
        this.b = g2Var;
    }

    @Override // org.telegram.ui.ActionBar.v6
    public final /* synthetic */ void a(float f10) {
        int i7 = this.a;
    }

    @Override // org.telegram.ui.ActionBar.v6
    public final void b() {
        int i7 = this.a;
        org.telegram.ui.ActionBar.g2 g2Var = this.b;
        switch (i7) {
            case 0:
                zt ztVar = ((y6) g2Var).a0;
                if (ztVar != null) {
                    ztVar.v0(org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.h5, false));
                    break;
                }
                break;
            case 1:
                ((bn) g2Var).Fb();
                break;
            case 2:
                ((uo) g2Var).getClass();
                break;
            case 3:
                ((bp) g2Var).h.f();
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
                bx bxVar = (bx) g2Var;
                jw jwVar = bxVar.D0;
                if (jwVar != null) {
                    org.telegram.ui.ActionBar.y actionMode = jwVar.getActionMode();
                    if (actionMode != null) {
                        org.telegram.ui.ActionBar.u6.h(org.telegram.ui.ActionBar.n6.w8, actionMode, bxVar.getResourceProvider());
                    }
                    org.telegram.ui.ActionBar.q0 speedItem = bxVar.D0.getSpeedItem();
                    if (speedItem != null) {
                        speedItem.getIconView().setColorFilter(new PorterDuffColorFilter(bxVar.getThemedColor(org.telegram.ui.ActionBar.n6.y8), PorterDuff.Mode.SRC_IN));
                        break;
                    }
                }
                break;
            case 8:
                ((jz) g2Var).getClass();
                break;
            case 9:
                ((r00) g2Var).x0();
                break;
            case 10:
                ((v50) g2Var).a0(true);
                break;
            case 11:
                ((de0) g2Var).Q1();
                break;
            case 12:
                ((ef0) g2Var).g0();
                break;
            case 13:
                ((mg0) g2Var).f0();
                break;
            case 14:
                ((NotificationsCustomSettingsActivity) g2Var).getClass();
                break;
            case 15:
                ((jm0) g2Var).J0();
                break;
            case 16:
                ((PremiumPreviewFragment) g2Var).z0();
                break;
            case 17:
                ((rt0) g2Var).getClass();
                break;
            case 18:
                RectF rectF = ProfileActivity.Z6;
                ((ProfileActivity) g2Var).p5();
                break;
            case 19:
                ((hx0) g2Var).getClass();
                break;
            case 20:
                ((cy0) g2Var).b.f();
                break;
            case 21:
                ((b51) g2Var).s0();
                break;
            case 22:
                ThemeActivity themeActivity = (ThemeActivity) g2Var;
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
                ((v71) g2Var).V0();
                break;
            default:
                ((n81) g2Var).Z();
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
