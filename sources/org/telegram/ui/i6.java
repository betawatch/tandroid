package org.telegram.ui;

import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.view.View;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes3.dex */
public final /* synthetic */ class i6 implements org.telegram.ui.ActionBar.s6 {
    public final /* synthetic */ int a;
    public final /* synthetic */ org.telegram.ui.ActionBar.o2 b;

    public /* synthetic */ i6(int i10, org.telegram.ui.ActionBar.o2 o2Var) {
        this.a = i10;
        this.b = o2Var;
    }

    @Override // org.telegram.ui.ActionBar.s6
    public final /* synthetic */ void a(float f7) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.ActionBar.s6
    public final void b() {
        switch (this.a) {
            case 0:
                yu yuVar = ((c7) this.b).T;
                if (yuVar != null) {
                    yuVar.setBackgroundColor(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.h5, false));
                    break;
                }
                break;
            case 1:
                ((sn) this.b).fb();
                break;
            case 2:
                ((kp) this.b).getClass();
                break;
            case 3:
                ((rp) this.b).W();
                break;
            case 4:
                ((dq) this.b).getClass();
                break;
            case 5:
                ((jr) this.b).getClass();
                break;
            case 6:
                ((ContactsActivity) this.b).g0();
                break;
            case 7:
                ey eyVar = (ey) this.b;
                nx nxVar = eyVar.C0;
                if (nxVar != null) {
                    org.telegram.ui.ActionBar.y actionMode = nxVar.getActionMode();
                    if (actionMode != null) {
                        org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.w8, actionMode, eyVar.getResourceProvider());
                    }
                    org.telegram.ui.ActionBar.u0 speedItem = eyVar.C0.getSpeedItem();
                    if (speedItem != null) {
                        speedItem.getIconView().setColorFilter(new PorterDuffColorFilter(eyVar.getThemedColor(org.telegram.ui.ActionBar.k6.y8), PorterDuff.Mode.SRC_IN));
                        break;
                    }
                }
                break;
            case 8:
                ((q00) this.b).getClass();
                break;
            case 9:
                ((b20) this.b).w0();
                break;
            case 10:
                ((n70) this.b).V(true);
                break;
            case 11:
                ((sc0) this.b).c0();
                break;
            case 12:
                ((ig0) this.b).C1();
                break;
            case 13:
                ((mh0) this.b).b0();
                break;
            case 14:
                ((yi0) this.b).a0();
                break;
            case 15:
                ((NotificationsCustomSettingsActivity) this.b).getClass();
                break;
            case 16:
                ((lp0) this.b).F0();
                break;
            case 17:
                ((PremiumPreviewFragment) this.b).u0();
                break;
            case 18:
                ((ox0) this.b).getClass();
                break;
            case 19:
                ((ProfileActivity) this.b).V4();
                break;
            case 20:
                ((d11) this.b).getClass();
                break;
            case 21:
                d21 d21Var = (d21) this.b;
                d21Var.a.setBackgroundColor(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.a7, false));
                d21Var.c.l();
                break;
            case 22:
                ((u91) this.b).p0();
                break;
            case 23:
                ThemeActivity themeActivity = (ThemeActivity) this.b;
                for (int i10 = 0; i10 < themeActivity.b.getChildCount(); i10++) {
                    View childAt = themeActivity.b.getChildAt(i10);
                    if (childAt instanceof org.telegram.ui.Cells.t) {
                        ((org.telegram.ui.Cells.t) childAt).getAdapter().l();
                    } else if (childAt instanceof qo0) {
                        ((qo0) childAt).updateColors();
                    }
                }
                for (int i11 = 0; i11 < themeActivity.b.getCachedChildCount(); i11++) {
                    View P = themeActivity.b.P(i11);
                    if (P instanceof org.telegram.ui.Cells.t) {
                        ((org.telegram.ui.Cells.t) P).getAdapter().l();
                    } else if (P instanceof qo0) {
                        ((qo0) P).updateColors();
                    }
                }
                for (int i12 = 0; i12 < themeActivity.b.getHiddenChildCount(); i12++) {
                    View V = themeActivity.b.V(i12);
                    if (V instanceof org.telegram.ui.Cells.t) {
                        ((org.telegram.ui.Cells.t) V).getAdapter().l();
                    } else if (V instanceof qo0) {
                        ((qo0) V).updateColors();
                    }
                }
                for (int i13 = 0; i13 < themeActivity.b.getAttachedScrapChildCount(); i13++) {
                    View O = themeActivity.b.O(i13);
                    if (O instanceof org.telegram.ui.Cells.t) {
                        ((org.telegram.ui.Cells.t) O).getAdapter().l();
                    } else if (O instanceof qo0) {
                        ((qo0) O).updateColors();
                    }
                }
                break;
            case 24:
                ((qc1) this.b).Q0();
                break;
            default:
                ((md1) this.b).U();
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
