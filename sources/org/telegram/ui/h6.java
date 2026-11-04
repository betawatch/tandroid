package org.telegram.ui;

import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.RectF;
import android.view.View;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class h6 implements org.telegram.ui.ActionBar.s6 {
    public final /* synthetic */ int a;
    public final /* synthetic */ org.telegram.ui.ActionBar.d2 b;

    public /* synthetic */ h6(int i3, org.telegram.ui.ActionBar.d2 d2Var) {
        this.a = i3;
        this.b = d2Var;
    }

    @Override // org.telegram.ui.ActionBar.s6
    public final /* synthetic */ void a(float f10) {
        int i3 = this.a;
    }

    @Override // org.telegram.ui.ActionBar.s6
    public final void b() {
        int i3 = this.a;
        org.telegram.ui.ActionBar.d2 d2Var = this.b;
        switch (i3) {
            case 0:
                ut utVar = ((z6) d2Var).a0;
                if (utVar != null) {
                    utVar.v0(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.h5, false));
                    break;
                }
                break;
            case 1:
                ((wm) d2Var).Bb();
                break;
            case 2:
                ((qo) d2Var).getClass();
                break;
            case 3:
                ((xo) d2Var).h.f();
                break;
            case 4:
                ((ip) d2Var).getClass();
                break;
            case 5:
                ((nq) d2Var).getClass();
                break;
            case 6:
                ((ContactsActivity) d2Var).getClass();
                break;
            case 7:
                uw uwVar = (uw) d2Var;
                cw cwVar = uwVar.D0;
                if (cwVar != null) {
                    org.telegram.ui.ActionBar.x actionMode = cwVar.getActionMode();
                    if (actionMode != null) {
                        org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.w8, actionMode, uwVar.getResourceProvider());
                    }
                    org.telegram.ui.ActionBar.q0 speedItem = uwVar.D0.getSpeedItem();
                    if (speedItem != null) {
                        speedItem.getIconView().setColorFilter(new PorterDuffColorFilter(uwVar.getThemedColor(org.telegram.ui.ActionBar.k6.y8), PorterDuff.Mode.SRC_IN));
                        break;
                    }
                }
                break;
            case 8:
                ((ez) d2Var).getClass();
                break;
            case 9:
                ((l00) d2Var).x0();
                break;
            case 10:
                ((o50) d2Var).a0(true);
                break;
            case 11:
                ((xd0) d2Var).H1();
                break;
            case 12:
                ((xe0) d2Var).g0();
                break;
            case 13:
                ((dg0) d2Var).f0();
                break;
            case 14:
                ((NotificationsCustomSettingsActivity) d2Var).getClass();
                break;
            case 15:
                ((cm0) d2Var).J0();
                break;
            case 16:
                ((PremiumPreviewFragment) d2Var).z0();
                break;
            case 17:
                ((it0) d2Var).getClass();
                break;
            case 18:
                RectF rectF = ProfileActivity.T6;
                ((ProfileActivity) d2Var).m5();
                break;
            case 19:
                ((yw0) d2Var).getClass();
                break;
            case 20:
                ((sx0) d2Var).b.f();
                break;
            case 21:
                ((r41) d2Var).s0();
                break;
            case 22:
                ThemeActivity themeActivity = (ThemeActivity) d2Var;
                for (int i10 = 0; i10 < themeActivity.b.getChildCount(); i10++) {
                    View childAt = themeActivity.b.getChildAt(i10);
                    if (childAt instanceof org.telegram.ui.Cells.t) {
                        ((org.telegram.ui.Cells.t) childAt).getAdapter().f();
                    } else if (childAt instanceof il0) {
                        ((il0) childAt).updateColors();
                    }
                }
                for (int i11 = 0; i11 < themeActivity.b.getCachedChildCount(); i11++) {
                    View P = themeActivity.b.P(i11);
                    if (P instanceof org.telegram.ui.Cells.t) {
                        ((org.telegram.ui.Cells.t) P).getAdapter().f();
                    } else if (P instanceof il0) {
                        ((il0) P).updateColors();
                    }
                }
                for (int i12 = 0; i12 < themeActivity.b.getHiddenChildCount(); i12++) {
                    View V = themeActivity.b.V(i12);
                    if (V instanceof org.telegram.ui.Cells.t) {
                        ((org.telegram.ui.Cells.t) V).getAdapter().f();
                    } else if (V instanceof il0) {
                        ((il0) V).updateColors();
                    }
                }
                for (int i13 = 0; i13 < themeActivity.b.getAttachedScrapChildCount(); i13++) {
                    View O = themeActivity.b.O(i13);
                    if (O instanceof org.telegram.ui.Cells.t) {
                        ((org.telegram.ui.Cells.t) O).getAdapter().f();
                    } else if (O instanceof il0) {
                        ((il0) O).updateColors();
                    }
                }
                break;
            case 23:
                ((l71) d2Var).V0();
                break;
            default:
                ((d81) d2Var).Z();
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
