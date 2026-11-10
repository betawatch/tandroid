package org.telegram.ui;

import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.RectF;
import android.view.View;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final /* synthetic */ class f6 implements org.telegram.ui.ActionBar.u6 {
    public final /* synthetic */ int a;
    public final /* synthetic */ org.telegram.ui.ActionBar.f2 b;

    public /* synthetic */ f6(int i7, org.telegram.ui.ActionBar.f2 f2Var) {
        this.a = i7;
        this.b = f2Var;
    }

    @Override // org.telegram.ui.ActionBar.u6
    public final /* synthetic */ void a(float f10) {
        int i7 = this.a;
    }

    @Override // org.telegram.ui.ActionBar.u6
    public final void b() {
        int i7 = this.a;
        org.telegram.ui.ActionBar.f2 f2Var = this.b;
        switch (i7) {
            case 0:
                zt ztVar = ((y6) f2Var).Z;
                if (ztVar != null) {
                    ztVar.v0(org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.h5, false));
                    break;
                }
                break;
            case 1:
                ((cn) f2Var).Eb();
                break;
            case 2:
                ((uo) f2Var).getClass();
                break;
            case 3:
                ((bp) f2Var).h.f();
                break;
            case 4:
                ((mp) f2Var).getClass();
                break;
            case 5:
                ((rq) f2Var).getClass();
                break;
            case 6:
                ((ContactsActivity) f2Var).getClass();
                break;
            case 7:
                zw zwVar = (zw) f2Var;
                iw iwVar = zwVar.C0;
                if (iwVar != null) {
                    org.telegram.ui.ActionBar.y actionMode = iwVar.getActionMode();
                    if (actionMode != null) {
                        org.telegram.ui.ActionBar.t6.h(org.telegram.ui.ActionBar.m6.w8, actionMode, zwVar.getResourceProvider());
                    }
                    org.telegram.ui.ActionBar.r0 speedItem = zwVar.C0.getSpeedItem();
                    if (speedItem != null) {
                        speedItem.getIconView().setColorFilter(new PorterDuffColorFilter(zwVar.getThemedColor(org.telegram.ui.ActionBar.m6.y8), PorterDuff.Mode.SRC_IN));
                        break;
                    }
                }
                break;
            case 8:
                ((jz) f2Var).getClass();
                break;
            case 9:
                ((r00) f2Var).x0();
                break;
            case 10:
                ((x50) f2Var).a0(true);
                break;
            case 11:
                ((fe0) f2Var).Q1();
                break;
            case 12:
                ((ff0) f2Var).g0();
                break;
            case 13:
                ((mg0) f2Var).f0();
                break;
            case 14:
                ((NotificationsCustomSettingsActivity) f2Var).getClass();
                break;
            case 15:
                ((km0) f2Var).J0();
                break;
            case 16:
                ((PremiumPreviewFragment) f2Var).z0();
                break;
            case 17:
                ((vt0) f2Var).getClass();
                break;
            case 18:
                RectF rectF = ProfileActivity.V6;
                ((ProfileActivity) f2Var).p5();
                break;
            case 19:
                ((lx0) f2Var).getClass();
                break;
            case 20:
                ((fy0) f2Var).b.f();
                break;
            case 21:
                ((e51) f2Var).s0();
                break;
            case 22:
                ThemeActivity themeActivity = (ThemeActivity) f2Var;
                for (int i10 = 0; i10 < themeActivity.b.getChildCount(); i10++) {
                    View childAt = themeActivity.b.getChildAt(i10);
                    if (childAt instanceof org.telegram.ui.Cells.t) {
                        ((org.telegram.ui.Cells.t) childAt).getAdapter().f();
                    } else if (childAt instanceof ql0) {
                        ((ql0) childAt).updateColors();
                    }
                }
                for (int i11 = 0; i11 < themeActivity.b.getCachedChildCount(); i11++) {
                    View P = themeActivity.b.P(i11);
                    if (P instanceof org.telegram.ui.Cells.t) {
                        ((org.telegram.ui.Cells.t) P).getAdapter().f();
                    } else if (P instanceof ql0) {
                        ((ql0) P).updateColors();
                    }
                }
                for (int i12 = 0; i12 < themeActivity.b.getHiddenChildCount(); i12++) {
                    View V = themeActivity.b.V(i12);
                    if (V instanceof org.telegram.ui.Cells.t) {
                        ((org.telegram.ui.Cells.t) V).getAdapter().f();
                    } else if (V instanceof ql0) {
                        ((ql0) V).updateColors();
                    }
                }
                for (int i13 = 0; i13 < themeActivity.b.getAttachedScrapChildCount(); i13++) {
                    View O = themeActivity.b.O(i13);
                    if (O instanceof org.telegram.ui.Cells.t) {
                        ((org.telegram.ui.Cells.t) O).getAdapter().f();
                    } else if (O instanceof ql0) {
                        ((ql0) O).updateColors();
                    }
                }
                break;
            case 23:
                ((x71) f2Var).V0();
                break;
            default:
                ((p81) f2Var).Z();
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
