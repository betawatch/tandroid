package org.telegram.ui;

import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.view.View;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final /* synthetic */ class j6 implements org.telegram.ui.ActionBar.g7 {
    public final /* synthetic */ int a;
    public final /* synthetic */ org.telegram.ui.ActionBar.r2 b;

    public /* synthetic */ j6(int i10, org.telegram.ui.ActionBar.r2 r2Var) {
        this.a = i10;
        this.b = r2Var;
    }

    @Override // org.telegram.ui.ActionBar.g7
    public final /* synthetic */ void a(float f7) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.ActionBar.g7
    public final void b() {
        int i10 = this.a;
        org.telegram.ui.ActionBar.r2 r2Var = this.b;
        switch (i10) {
            case 0:
                xu xuVar = ((c7) r2Var).Z;
                if (xuVar != null) {
                    xuVar.setBackgroundColor(org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.h5, false));
                    break;
                }
                break;
            case 1:
                ((wn) r2Var).ob();
                break;
            case 2:
                ((pp) r2Var).getClass();
                break;
            case 3:
                ((xp) r2Var).h.l();
                break;
            case 4:
                ((iq) r2Var).getClass();
                break;
            case 5:
                ((mr) r2Var).getClass();
                break;
            case 6:
                ((ContactsActivity) r2Var).getClass();
                break;
            case 7:
                ey eyVar = (ey) r2Var;
                mx mxVar = eyVar.C0;
                if (mxVar != null) {
                    org.telegram.ui.ActionBar.z actionMode = mxVar.getActionMode();
                    if (actionMode != null) {
                        org.telegram.ui.ActionBar.f7.i(org.telegram.ui.ActionBar.y6.w8, actionMode, eyVar.getResourceProvider());
                    }
                    org.telegram.ui.ActionBar.w0 speedItem = eyVar.C0.getSpeedItem();
                    if (speedItem != null) {
                        speedItem.getIconView().setColorFilter(new PorterDuffColorFilter(eyVar.getThemedColor(org.telegram.ui.ActionBar.y6.y8), PorterDuff.Mode.SRC_IN));
                        break;
                    }
                }
                break;
            case 8:
                ((q00) r2Var).getClass();
                break;
            case 9:
                ((f20) r2Var).t0();
                break;
            case 10:
                ((r70) r2Var).W(true);
                break;
            case 11:
                ((rc0) r2Var).d0();
                break;
            case 12:
                ((ig0) r2Var).D1();
                break;
            case 13:
                ((lh0) r2Var).c0();
                break;
            case 14:
                ((xi0) r2Var).b0();
                break;
            case 15:
                ((NotificationsCustomSettingsActivity) r2Var).getClass();
                break;
            case 16:
                ((tp0) r2Var).F0();
                break;
            case 17:
                ((PremiumPreviewFragment) r2Var).v0();
                break;
            case 18:
                ((ux0) r2Var).getClass();
                break;
            case 19:
                int i11 = ProfileActivity.R6;
                ((ProfileActivity) r2Var).d5();
                break;
            case 20:
                ((j11) r2Var).getClass();
                break;
            case 21:
                ((i21) r2Var).b.l();
                break;
            case 22:
                ((y91) r2Var).o0();
                break;
            case 23:
                ThemeActivity themeActivity = (ThemeActivity) r2Var;
                for (int i12 = 0; i12 < themeActivity.b.getChildCount(); i12++) {
                    View childAt = themeActivity.b.getChildAt(i12);
                    if (childAt instanceof org.telegram.ui.Cells.t) {
                        ((org.telegram.ui.Cells.t) childAt).getAdapter().l();
                    } else if (childAt instanceof yo0) {
                        ((yo0) childAt).updateColors();
                    }
                }
                for (int i13 = 0; i13 < themeActivity.b.getCachedChildCount(); i13++) {
                    View P = themeActivity.b.P(i13);
                    if (P instanceof org.telegram.ui.Cells.t) {
                        ((org.telegram.ui.Cells.t) P).getAdapter().l();
                    } else if (P instanceof yo0) {
                        ((yo0) P).updateColors();
                    }
                }
                for (int i14 = 0; i14 < themeActivity.b.getHiddenChildCount(); i14++) {
                    View V = themeActivity.b.V(i14);
                    if (V instanceof org.telegram.ui.Cells.t) {
                        ((org.telegram.ui.Cells.t) V).getAdapter().l();
                    } else if (V instanceof yo0) {
                        ((yo0) V).updateColors();
                    }
                }
                for (int i15 = 0; i15 < themeActivity.b.getAttachedScrapChildCount(); i15++) {
                    View O = themeActivity.b.O(i15);
                    if (O instanceof org.telegram.ui.Cells.t) {
                        ((org.telegram.ui.Cells.t) O).getAdapter().l();
                    } else if (O instanceof yo0) {
                        ((yo0) O).updateColors();
                    }
                }
                break;
            case 24:
                ((vc1) r2Var).R0();
                break;
            default:
                ((rd1) r2Var).V();
                break;
        }
    }

    private final /* synthetic */ void A(float f7) {
    }

    private final /* synthetic */ void B(float f7) {
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
