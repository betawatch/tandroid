package org.telegram.ui;

import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.UndoView;

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
/* loaded from: classes3.dex */
public final class b9 implements org.telegram.ui.Components.ob {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ b9(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // org.telegram.ui.Components.ob
    public final boolean a() {
        switch (this.a) {
        }
        return true;
    }

    @Override // org.telegram.ui.Components.ob
    public final void b(org.telegram.ui.Components.qc qcVar) {
        switch (this.a) {
            case 2:
                org.telegram.ui.Components.ub ubVar = qcVar.e;
                sn snVar = (sn) this.b;
                dh.d c10 = snVar.J.c(ubVar, null, true);
                eh.e eVar = new eh.e(snVar.qa);
                eVar.e = new c3.m(22);
                float dpf2 = AndroidUtilities.dpf2(0.5f);
                float dpf22 = AndroidUtilities.dpf2(0.5f);
                eVar.f = dpf2;
                eVar.h = dpf22;
                c10.o(eVar);
                c10.q(AndroidUtilities.dp(16.0f));
                ubVar.setCustomBackground(c10);
                break;
            case 4:
                ey eyVar = (ey) this.b;
                UndoView undoView = eyVar.y0[0];
                if (undoView != null && undoView.getVisibility() == 0) {
                    eyVar.y0[0].d(2, true);
                    break;
                }
                break;
        }
    }

    @Override // org.telegram.ui.Components.ob
    public final void c(float f7) {
        switch (this.a) {
            case 0:
                m9 m9Var = (m9) this.b;
                m9Var.V = Math.max(0.0f, (f7 - m9Var.W) - m9Var.U);
                m9Var.f0();
                break;
            case 3:
                ContactsActivity contactsActivity = (ContactsActivity) this.b;
                contactsActivity.p0 = Math.max(0.0f, (f7 - contactsActivity.q0) - contactsActivity.o0);
                contactsActivity.i0();
                break;
            case 4:
                ey eyVar = (ey) this.b;
                UndoView undoView = eyVar.y0[0];
                if (undoView == null || undoView.getVisibility() != 0) {
                    eyVar.u1 = Math.max(0.0f, (f7 - eyVar.g4) - eyVar.j4);
                    eyVar.W4();
                    break;
                }
                break;
        }
    }

    @Override // org.telegram.ui.Components.ob
    public final /* synthetic */ void d(org.telegram.ui.Components.qc qcVar) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Components.ob
    public final boolean e() {
        switch (this.a) {
            case 8:
                if (((ProfileActivity) this.b).u5 == null) {
                }
                break;
        }
        return true;
    }

    @Override // org.telegram.ui.Components.ob
    public final int f(int i10) {
        int i11;
        int i12;
        ku0 ku0Var;
        switch (this.a) {
            case 0:
                m9 m9Var = (m9) this.b;
                i11 = m9Var.W;
                i12 = m9Var.U;
                break;
            case 1:
                return ((bd) this.b).O.getMeasuredHeight();
            case 2:
                sn snVar = (sn) this.b;
                if (i10 == 1) {
                    return 0;
                }
                return Math.round(snVar.S.getInputBubbleHeight() + AndroidUtilities.dp(16.0f) + snVar.b9(org.telegram.ui.Components.s31.c) + snVar.v.d());
            case 3:
                ContactsActivity contactsActivity = (ContactsActivity) this.b;
                i11 = contactsActivity.q0;
                i12 = contactsActivity.o0;
                break;
            case 4:
                ey eyVar = (ey) this.b;
                return eyVar.Y2 != 0 ? AndroidUtilities.dp(60.0f) + eyVar.g4 : eyVar.j3();
            case 5:
                i12 = ((rg0) this.b).L;
                i11 = AndroidUtilities.dp(64.0f);
                break;
            case 6:
                PhotoViewer photoViewer = ((eu0) this.b).E0;
                int i13 = 0;
                if (!photoViewer.R4) {
                    ci.h4 h4Var = photoViewer.i0;
                    if (h4Var != null && h4Var.getVisibility() == 0) {
                        i13 = (int) ((photoViewer.i0.getAlpha() * photoViewer.i0.getHeight()) + 0);
                    }
                    org.telegram.ui.Components.e40 e40Var = photoViewer.l1;
                    return (e40Var == null || !e40Var.c()) ? i13 : (AndroidUtilities.isTablet() || photoViewer.e0.getMeasuredHeight() > photoViewer.e0.getMeasuredWidth()) ? (int) ((photoViewer.l1.getAlpha() * photoViewer.l1.getHeight()) + i13) : i13;
                }
                ks0 ks0Var = photoViewer.U1;
                if (ks0Var != null) {
                    i13 = ks0Var.L.l;
                    if (ks0Var.getVisibility() == 0 && ((ku0Var = photoViewer.d) == null || !ku0Var.A())) {
                        i13 = org.telegram.messenger.v0.C(12.0f, photoViewer.U1.getEditTextHeight(), i13);
                    }
                }
                ai.o5 o5Var = photoViewer.P0;
                if (o5Var == null || o5Var.getVisibility() != 0) {
                    return i13;
                }
                ks0 ks0Var2 = photoViewer.U1;
                return (ks0Var2 == null || !ks0Var2.L.c()) ? i13 + photoViewer.P0.getHeight() : i13;
            case 7:
                return ((PremiumPreviewFragment) this.b).o0.d;
            case 8:
                ProfileActivity profileActivity = (ProfileActivity) this.b;
                int i14 = 0;
                int dp = profileActivity.u5 == null ? profileActivity.r6 + profileActivity.q6 : ((int) (((AndroidUtilities.dp(52.0f) - profileActivity.u5.getTranslationY()) - (profileActivity.v5[1].getTranslationY() * profileActivity.O.i0(9, false))) - (profileActivity.v5[0].getTranslationY() * profileActivity.O.i0(8, true)))) + profileActivity.r6 + profileActivity.q6;
                rz0 rz0Var = profileActivity.O;
                float i02 = (rz0Var == null || rz0Var.V == null) ? 0.0f : rz0Var.i0(14, false);
                if (i02 <= 0.0f) {
                    return dp;
                }
                org.telegram.ui.Components.ns0 ns0Var = profileActivity.O.V;
                View view = profileActivity.fragmentView;
                FrameLayout frameLayout = ns0Var.r;
                if (view != null && frameLayout != null && frameLayout.getVisibility() == 0 && frameLayout.getAlpha() > 0.0f) {
                    view.getLocationInWindow(new int[2]);
                    frameLayout.getLocationInWindow(new int[2]);
                    i14 = Math.max(0, (int) (frameLayout.getAlpha() * ((view.getHeight() + r6[1]) - r4[1])));
                }
                return AndroidUtilities.lerp(dp, Math.max(dp, i14), Math.min(1.0f, i02));
            default:
                ye1 ye1Var = (ye1) this.b;
                n41 n41Var = ye1Var.o0;
                if (n41Var == null || n41Var.getVisibility() != 0) {
                    return 0;
                }
                return ye1Var.o0.getMeasuredHeight();
        }
        return i11 + i12;
    }

    @Override // org.telegram.ui.Components.ob
    public final /* synthetic */ boolean g(int i10) {
        switch (this.a) {
        }
        return false;
    }

    @Override // org.telegram.ui.Components.ob
    public final int h(int i10) {
        org.telegram.ui.ActionBar.k kVar;
        int i11;
        int max;
        int max2;
        org.telegram.ui.ActionBar.k kVar2;
        org.telegram.ui.ActionBar.k kVar3;
        org.telegram.ui.ActionBar.k kVar4;
        int i12;
        org.telegram.ui.ActionBar.k kVar5;
        switch (this.a) {
            case 0:
                return 0;
            case 1:
                return 0;
            case 2:
                int currentActionBarHeight = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + AndroidUtilities.statusBarHeight;
                sn snVar = (sn) this.b;
                kVar = ((org.telegram.ui.ActionBar.o2) snVar).actionBar;
                if (kVar != null) {
                    kVar2 = ((org.telegram.ui.ActionBar.o2) snVar).actionBar;
                    int measuredHeight = kVar2.getMeasuredHeight();
                    kVar3 = ((org.telegram.ui.ActionBar.o2) snVar).actionBar;
                    i11 = kVar3.getTop() + measuredHeight;
                } else {
                    i11 = 0;
                }
                max = Math.max(currentActionBarHeight, i11);
                max2 = (int) Math.max(0.0f, snVar.F9);
                break;
            case 3:
                return 0;
            case 4:
                ey eyVar = (ey) this.b;
                kVar4 = ((org.telegram.ui.ActionBar.o2) eyVar).actionBar;
                int i13 = 0;
                if (kVar4 != null) {
                    kVar5 = ((org.telegram.ui.ActionBar.o2) eyVar).actionBar;
                    i12 = kVar5.getMeasuredHeight();
                } else {
                    i12 = 0;
                }
                cw cwVar = eyVar.z0;
                int measuredHeight2 = i12 + ((cwVar == null || cwVar.getVisibility() != 0) ? 0 : eyVar.z0.getMeasuredHeight());
                org.telegram.ui.Components.us usVar = eyVar.J1;
                int height = measuredHeight2 + (usVar != null ? usVar.getHeight() : 0);
                vw vwVar = eyVar.E0;
                if (vwVar != null && eyVar.G0) {
                    i13 = (int) ((1.0f - vwVar.getCollapsedProgress()) * AndroidUtilities.dp(81.0f));
                }
                return AndroidUtilities.dp(48.0f) + height + i13;
            case 5:
                return 0;
            case 6:
                return org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + AndroidUtilities.statusBarHeight + ((int) (((eu0) this.b).E0.V1.getAlpha() * r4.V1.getEditTextHeight()));
            case 7:
                return 0;
            case 8:
                max2 = AndroidUtilities.statusBarHeight;
                max = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
                break;
            default:
                return 0;
        }
        return max + max2;
    }

    private final /* synthetic */ void A(org.telegram.ui.Components.qc qcVar) {
    }

    private final /* synthetic */ void B(org.telegram.ui.Components.qc qcVar) {
    }

    private final /* synthetic */ void C(org.telegram.ui.Components.qc qcVar) {
    }

    private final /* synthetic */ void D(org.telegram.ui.Components.qc qcVar) {
    }

    private final /* synthetic */ void E(org.telegram.ui.Components.qc qcVar) {
    }

    private final /* synthetic */ void F(org.telegram.ui.Components.qc qcVar) {
    }

    private final /* synthetic */ void G(org.telegram.ui.Components.qc qcVar) {
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

    private final /* synthetic */ void p(org.telegram.ui.Components.qc qcVar) {
    }

    private final /* synthetic */ void q(org.telegram.ui.Components.qc qcVar) {
    }

    private final /* synthetic */ void r(org.telegram.ui.Components.qc qcVar) {
    }

    private final /* synthetic */ void s(org.telegram.ui.Components.qc qcVar) {
    }

    private final /* synthetic */ void t(org.telegram.ui.Components.qc qcVar) {
    }

    private final /* synthetic */ void u(org.telegram.ui.Components.qc qcVar) {
    }

    private final /* synthetic */ void v(org.telegram.ui.Components.qc qcVar) {
    }

    private final /* synthetic */ void w(org.telegram.ui.Components.qc qcVar) {
    }

    private final /* synthetic */ void x(org.telegram.ui.Components.qc qcVar) {
    }

    private final /* synthetic */ void y(org.telegram.ui.Components.qc qcVar) {
    }

    private final /* synthetic */ void z(org.telegram.ui.Components.qc qcVar) {
    }
}
