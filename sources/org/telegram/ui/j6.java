package org.telegram.ui;

import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.view.View;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
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
                vu vuVar = ((c7) r2Var).Z;
                if (vuVar != null) {
                    vuVar.setBackgroundColor(org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.h5, false));
                    break;
                }
                break;
            case 1:
                ((un) r2Var).kb();
                break;
            case 2:
                ((np) r2Var).getClass();
                break;
            case 3:
                ((vp) r2Var).h.l();
                break;
            case 4:
                ((gq) r2Var).getClass();
                break;
            case 5:
                ((kr) r2Var).getClass();
                break;
            case 6:
                ((ContactsActivity) r2Var).getClass();
                break;
            case 7:
                cy cyVar = (cy) r2Var;
                jx jxVar = cyVar.C0;
                if (jxVar != null) {
                    org.telegram.ui.ActionBar.z actionMode = jxVar.getActionMode();
                    if (actionMode != null) {
                        org.telegram.ui.ActionBar.f7.i(org.telegram.ui.ActionBar.y6.w8, actionMode, cyVar.getResourceProvider());
                    }
                    org.telegram.ui.ActionBar.w0 speedItem = cyVar.C0.getSpeedItem();
                    if (speedItem != null) {
                        speedItem.getIconView().setColorFilter(new PorterDuffColorFilter(cyVar.getThemedColor(org.telegram.ui.ActionBar.y6.y8), PorterDuff.Mode.SRC_IN));
                        break;
                    }
                }
                break;
            case 8:
                ((o00) r2Var).getClass();
                break;
            case 9:
                ((d20) r2Var).t0();
                break;
            case 10:
                ((p70) r2Var).W(true);
                break;
            case 11:
                ((pc0) r2Var).d0();
                break;
            case 12:
                ((gg0) r2Var).D1();
                break;
            case 13:
                ((jh0) r2Var).c0();
                break;
            case 14:
                ((vi0) r2Var).b0();
                break;
            case 15:
                ((NotificationsCustomSettingsActivity) r2Var).getClass();
                break;
            case 16:
                ((rp0) r2Var).F0();
                break;
            case 17:
                ((PremiumPreviewFragment) r2Var).v0();
                break;
            case 18:
                ((sx0) r2Var).getClass();
                break;
            case 19:
                int i11 = ProfileActivity.R6;
                ((ProfileActivity) r2Var).d5();
                break;
            case 20:
                ((h11) r2Var).getClass();
                break;
            case 21:
                ((g21) r2Var).b.l();
                break;
            case 22:
                ((w91) r2Var).o0();
                break;
            case 23:
                ThemeActivity themeActivity = (ThemeActivity) r2Var;
                for (int i12 = 0; i12 < themeActivity.b.getChildCount(); i12++) {
                    View childAt = themeActivity.b.getChildAt(i12);
                    if (childAt instanceof org.telegram.ui.Cells.t) {
                        ((org.telegram.ui.Cells.t) childAt).getAdapter().l();
                    } else if (childAt instanceof wo0) {
                        ((wo0) childAt).updateColors();
                    }
                }
                for (int i13 = 0; i13 < themeActivity.b.getCachedChildCount(); i13++) {
                    View P = themeActivity.b.P(i13);
                    if (P instanceof org.telegram.ui.Cells.t) {
                        ((org.telegram.ui.Cells.t) P).getAdapter().l();
                    } else if (P instanceof wo0) {
                        ((wo0) P).updateColors();
                    }
                }
                for (int i14 = 0; i14 < themeActivity.b.getHiddenChildCount(); i14++) {
                    View V = themeActivity.b.V(i14);
                    if (V instanceof org.telegram.ui.Cells.t) {
                        ((org.telegram.ui.Cells.t) V).getAdapter().l();
                    } else if (V instanceof wo0) {
                        ((wo0) V).updateColors();
                    }
                }
                for (int i15 = 0; i15 < themeActivity.b.getAttachedScrapChildCount(); i15++) {
                    View O = themeActivity.b.O(i15);
                    if (O instanceof org.telegram.ui.Cells.t) {
                        ((org.telegram.ui.Cells.t) O).getAdapter().l();
                    } else if (O instanceof wo0) {
                        ((wo0) O).updateColors();
                    }
                }
                break;
            case 24:
                ((tc1) r2Var).R0();
                break;
            default:
                ((pd1) r2Var).V();
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
