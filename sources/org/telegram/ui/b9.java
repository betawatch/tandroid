package org.telegram.ui;

import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.UndoView;

/* compiled from: r8-map-id-5c4d11c5a4a3c3963e49de090c9ebed761f6fe8b7d1fb1bb05822f03003d35b5 */
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
                qn qnVar = (qn) this.b;
                dh.d c10 = qnVar.J.c(ubVar, null, true);
                eh.e eVar = new eh.e(qnVar.ea);
                eVar.e = new ci.i1(20);
                float dpf2 = AndroidUtilities.dpf2(0.5f);
                float dpf22 = AndroidUtilities.dpf2(0.5f);
                eVar.f = dpf2;
                eVar.h = dpf22;
                c10.o(eVar);
                c10.q(AndroidUtilities.dp(16.0f));
                ubVar.setCustomBackground(c10);
                break;
            case 4:
                cy cyVar = (cy) this.b;
                UndoView undoView = cyVar.y0[0];
                if (undoView != null && undoView.getVisibility() == 0) {
                    cyVar.y0[0].e(2, true);
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
                m9Var.g0();
                break;
            case 3:
                ContactsActivity contactsActivity = (ContactsActivity) this.b;
                contactsActivity.p0 = Math.max(0.0f, (f7 - contactsActivity.q0) - contactsActivity.o0);
                contactsActivity.i0();
                break;
            case 4:
                cy cyVar = (cy) this.b;
                UndoView undoView = cyVar.y0[0];
                if (undoView == null || undoView.getVisibility() != 0) {
                    cyVar.u1 = Math.max(0.0f, (f7 - cyVar.g4) - cyVar.j4);
                    cyVar.V4();
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
        hu0 hu0Var;
        switch (this.a) {
            case 0:
                m9 m9Var = (m9) this.b;
                i11 = m9Var.W;
                i12 = m9Var.U;
                break;
            case 1:
                return ((bd) this.b).O.getMeasuredHeight();
            case 2:
                qn qnVar = (qn) this.b;
                if (i10 == 1) {
                    return 0;
                }
                return Math.round(qnVar.S.getInputBubbleHeight() + AndroidUtilities.dp(16.0f) + qnVar.b9(org.telegram.ui.Components.n31.c) + qnVar.v.d());
            case 3:
                ContactsActivity contactsActivity = (ContactsActivity) this.b;
                i11 = contactsActivity.q0;
                i12 = contactsActivity.o0;
                break;
            case 4:
                cy cyVar = (cy) this.b;
                return cyVar.Y2 != 0 ? AndroidUtilities.dp(60.0f) + cyVar.g4 : cyVar.k3();
            case 5:
                i12 = ((ng0) this.b).L;
                i11 = AndroidUtilities.dp(64.0f);
                break;
            case 6:
                PhotoViewer photoViewer = ((bu0) this.b).E0;
                int i13 = 0;
                if (!photoViewer.R4) {
                    ci.i4 i4Var = photoViewer.i0;
                    if (i4Var != null && i4Var.getVisibility() == 0) {
                        i13 = (int) ((photoViewer.i0.getAlpha() * photoViewer.i0.getHeight()) + 0);
                    }
                    org.telegram.ui.Components.e40 e40Var = photoViewer.l1;
                    return (e40Var == null || !e40Var.c()) ? i13 : (AndroidUtilities.isTablet() || photoViewer.e0.getMeasuredHeight() > photoViewer.e0.getMeasuredWidth()) ? (int) ((photoViewer.l1.getAlpha() * photoViewer.l1.getHeight()) + i13) : i13;
                }
                hs0 hs0Var = photoViewer.U1;
                if (hs0Var != null) {
                    i13 = hs0Var.L.l;
                    if (hs0Var.getVisibility() == 0 && ((hu0Var = photoViewer.d) == null || !hu0Var.A())) {
                        i13 = org.telegram.messenger.g0.C(12.0f, photoViewer.U1.getEditTextHeight(), i13);
                    }
                }
                ai.o5 o5Var = photoViewer.P0;
                if (o5Var == null || o5Var.getVisibility() != 0) {
                    return i13;
                }
                hs0 hs0Var2 = photoViewer.U1;
                return (hs0Var2 == null || !hs0Var2.L.c()) ? i13 + photoViewer.P0.getHeight() : i13;
            case 7:
                return ((PremiumPreviewFragment) this.b).o0.d;
            case 8:
                ProfileActivity profileActivity = (ProfileActivity) this.b;
                int i14 = 0;
                int dp = profileActivity.u5 == null ? profileActivity.p6 + profileActivity.o6 : ((int) (((AndroidUtilities.dp(52.0f) - profileActivity.u5.getTranslationY()) - (profileActivity.v5[1].getTranslationY() * profileActivity.O.h0(9, false))) - (profileActivity.v5[0].getTranslationY() * profileActivity.O.h0(8, true)))) + profileActivity.p6 + profileActivity.o6;
                nz0 nz0Var = profileActivity.O;
                float h02 = (nz0Var == null || nz0Var.V == null) ? 0.0f : nz0Var.h0(14, false);
                if (h02 <= 0.0f) {
                    return dp;
                }
                org.telegram.ui.Components.ks0 ks0Var = profileActivity.O.V;
                View view = profileActivity.fragmentView;
                FrameLayout frameLayout = ks0Var.r;
                if (view != null && frameLayout != null && frameLayout.getVisibility() == 0 && frameLayout.getAlpha() > 0.0f) {
                    view.getLocationInWindow(new int[2]);
                    frameLayout.getLocationInWindow(new int[2]);
                    i14 = Math.max(0, (int) (frameLayout.getAlpha() * ((view.getHeight() + r6[1]) - r4[1])));
                }
                return AndroidUtilities.lerp(dp, Math.max(dp, i14), Math.min(1.0f, h02));
            default:
                re1 re1Var = (re1) this.b;
                j41 j41Var = re1Var.o0;
                if (j41Var == null || j41Var.getVisibility() != 0) {
                    return 0;
                }
                return re1Var.o0.getMeasuredHeight();
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
                qn qnVar = (qn) this.b;
                kVar = ((org.telegram.ui.ActionBar.n2) qnVar).actionBar;
                if (kVar != null) {
                    kVar2 = ((org.telegram.ui.ActionBar.n2) qnVar).actionBar;
                    int measuredHeight = kVar2.getMeasuredHeight();
                    kVar3 = ((org.telegram.ui.ActionBar.n2) qnVar).actionBar;
                    i11 = kVar3.getTop() + measuredHeight;
                } else {
                    i11 = 0;
                }
                max = Math.max(currentActionBarHeight, i11);
                max2 = (int) Math.max(0.0f, qnVar.t9);
                break;
            case 3:
                return 0;
            case 4:
                cy cyVar = (cy) this.b;
                kVar4 = ((org.telegram.ui.ActionBar.n2) cyVar).actionBar;
                int i13 = 0;
                if (kVar4 != null) {
                    kVar5 = ((org.telegram.ui.ActionBar.n2) cyVar).actionBar;
                    i12 = kVar5.getMeasuredHeight();
                } else {
                    i12 = 0;
                }
                aw awVar = cyVar.z0;
                int measuredHeight2 = i12 + ((awVar == null || awVar.getVisibility() != 0) ? 0 : cyVar.z0.getMeasuredHeight());
                org.telegram.ui.Components.us usVar = cyVar.J1;
                int height = measuredHeight2 + (usVar != null ? usVar.getHeight() : 0);
                tw twVar = cyVar.E0;
                if (twVar != null && cyVar.G0) {
                    i13 = (int) ((1.0f - twVar.getCollapsedProgress()) * AndroidUtilities.dp(81.0f));
                }
                return AndroidUtilities.dp(48.0f) + height + i13;
            case 5:
                return 0;
            case 6:
                return org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + AndroidUtilities.statusBarHeight + ((int) (((bu0) this.b).E0.V1.getAlpha() * r4.V1.getEditTextHeight()));
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
