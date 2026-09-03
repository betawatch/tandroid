package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.UndoView;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final class a9 implements org.telegram.ui.Components.fb {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ a9(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // org.telegram.ui.Components.fb
    public final boolean a() {
        switch (this.a) {
        }
        return true;
    }

    @Override // org.telegram.ui.Components.fb
    public final void b(org.telegram.ui.Components.ic icVar) {
        switch (this.a) {
            case 2:
                org.telegram.ui.Components.nb nbVar = icVar.e;
                xn xnVar = (xn) this.b;
                qg.b c3 = xnVar.G.c(nbVar, null, true);
                rg.d dVar = new rg.d(xnVar.ba);
                dVar.e = new s0.b(21);
                float dpf2 = AndroidUtilities.dpf2(0.5f);
                float dpf22 = AndroidUtilities.dpf2(0.5f);
                dVar.f = dpf2;
                dVar.h = dpf22;
                c3.n(dVar);
                c3.p(AndroidUtilities.dp(16.0f));
                nbVar.setCustomBackground(c3);
                break;
            case 4:
                py pyVar = (py) this.b;
                UndoView undoView = pyVar.v0[0];
                if (undoView != null && undoView.getVisibility() == 0) {
                    pyVar.v0[0].e(2, true);
                    break;
                }
                break;
        }
    }

    @Override // org.telegram.ui.Components.fb
    public final void c(float f10) {
        switch (this.a) {
            case 0:
                l9 l9Var = (l9) this.b;
                l9Var.S = Math.max(0.0f, (f10 - l9Var.T) - l9Var.R);
                l9Var.g0();
                break;
            case 3:
                ContactsActivity contactsActivity = (ContactsActivity) this.b;
                contactsActivity.m0 = Math.max(0.0f, (f10 - contactsActivity.n0) - contactsActivity.l0);
                contactsActivity.i0();
                break;
            case 4:
                py pyVar = (py) this.b;
                UndoView undoView = pyVar.v0[0];
                if (undoView == null || undoView.getVisibility() != 0) {
                    pyVar.r1 = Math.max(0.0f, (f10 - pyVar.d4) - pyVar.g4);
                    pyVar.X4();
                    break;
                }
                break;
        }
    }

    @Override // org.telegram.ui.Components.fb
    public final /* synthetic */ void d(org.telegram.ui.Components.ic icVar) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Components.fb
    public final boolean e() {
        switch (this.a) {
            case 8:
                if (((ProfileActivity) this.b).p5 == null) {
                }
                break;
        }
        return true;
    }

    @Override // org.telegram.ui.Components.fb
    public final int f(int i10) {
        int i11;
        int i12;
        ou0 ou0Var;
        switch (this.a) {
            case 0:
                l9 l9Var = (l9) this.b;
                i11 = l9Var.T;
                i12 = l9Var.R;
                break;
            case 1:
                return ((bd) this.b).L.getMeasuredHeight();
            case 2:
                xn xnVar = (xn) this.b;
                if (i10 == 1) {
                    return 0;
                }
                return Math.round(xnVar.P.getInputBubbleHeight() + AndroidUtilities.dp(16.0f) + xnVar.W8(org.telegram.ui.Components.s21.c) + xnVar.v.c());
            case 3:
                ContactsActivity contactsActivity = (ContactsActivity) this.b;
                i11 = contactsActivity.n0;
                i12 = contactsActivity.l0;
                break;
            case 4:
                py pyVar = (py) this.b;
                return pyVar.U2 != 0 ? AndroidUtilities.dp(60.0f) + pyVar.d4 : pyVar.n3();
            case 5:
                i12 = ((wg0) this.b).I;
                i11 = AndroidUtilities.dp(64.0f);
                break;
            case 6:
                PhotoViewer photoViewer = ((iu0) this.b).B0;
                int i13 = 0;
                if (!photoViewer.O4) {
                    eh.d dVar = photoViewer.f0;
                    if (dVar != null && dVar.getVisibility() == 0) {
                        i13 = (int) ((photoViewer.f0.getAlpha() * photoViewer.f0.getHeight()) + 0);
                    }
                    org.telegram.ui.Components.z30 z30Var = photoViewer.i1;
                    return (z30Var == null || !z30Var.c()) ? i13 : (AndroidUtilities.isTablet() || photoViewer.b0.getMeasuredHeight() > photoViewer.b0.getMeasuredWidth()) ? (int) ((photoViewer.i1.getAlpha() * photoViewer.i1.getHeight()) + i13) : i13;
                }
                ms0 ms0Var = photoViewer.R1;
                if (ms0Var != null) {
                    i13 = ms0Var.I.l;
                    if (ms0Var.getVisibility() == 0 && ((ou0Var = photoViewer.d) == null || !ou0Var.A())) {
                        i13 = org.telegram.messenger.y3.C(12.0f, photoViewer.R1.getEditTextHeight(), i13);
                    }
                }
                eg.q1 q1Var = photoViewer.M0;
                if (q1Var == null || q1Var.getVisibility() != 0) {
                    return i13;
                }
                ms0 ms0Var2 = photoViewer.R1;
                return (ms0Var2 == null || !ms0Var2.I.c()) ? i13 + photoViewer.M0.getHeight() : i13;
            case 7:
                return ((PremiumPreviewFragment) this.b).l0.d;
            case 8:
                ProfileActivity profileActivity = (ProfileActivity) this.b;
                if (profileActivity.p5 == null) {
                    return profileActivity.i6 + profileActivity.h6;
                }
                return profileActivity.i6 + profileActivity.h6 + ((int) (((AndroidUtilities.dp(52.0f) - profileActivity.p5.getTranslationY()) - (profileActivity.q5[1].getTranslationY() * profileActivity.L.g0(9, false))) - (profileActivity.q5[0].getTranslationY() * profileActivity.L.g0(8, true))));
            default:
                sf1 sf1Var = (sf1) this.b;
                h51 h51Var = sf1Var.l0;
                if (h51Var == null || h51Var.getVisibility() != 0) {
                    return 0;
                }
                return sf1Var.l0.getMeasuredHeight();
        }
        return i11 + i12;
    }

    @Override // org.telegram.ui.Components.fb
    public final /* synthetic */ boolean g(int i10) {
        switch (this.a) {
        }
        return false;
    }

    @Override // org.telegram.ui.Components.fb
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
                xn xnVar = (xn) this.b;
                kVar = ((org.telegram.ui.ActionBar.p2) xnVar).actionBar;
                if (kVar != null) {
                    kVar2 = ((org.telegram.ui.ActionBar.p2) xnVar).actionBar;
                    int measuredHeight = kVar2.getMeasuredHeight();
                    kVar3 = ((org.telegram.ui.ActionBar.p2) xnVar).actionBar;
                    i11 = kVar3.getTop() + measuredHeight;
                } else {
                    i11 = 0;
                }
                max = Math.max(currentActionBarHeight, i11);
                max2 = (int) Math.max(0.0f, xnVar.q9);
                break;
            case 3:
                return 0;
            case 4:
                py pyVar = (py) this.b;
                kVar4 = ((org.telegram.ui.ActionBar.p2) pyVar).actionBar;
                int i13 = 0;
                if (kVar4 != null) {
                    kVar5 = ((org.telegram.ui.ActionBar.p2) pyVar).actionBar;
                    i12 = kVar5.getMeasuredHeight();
                } else {
                    i12 = 0;
                }
                ow owVar = pyVar.w0;
                int measuredHeight2 = i12 + ((owVar == null || owVar.getVisibility() != 0) ? 0 : pyVar.w0.getMeasuredHeight());
                org.telegram.ui.Components.ls lsVar = pyVar.G1;
                int height = measuredHeight2 + (lsVar != null ? lsVar.getHeight() : 0);
                hx hxVar = pyVar.B0;
                if (hxVar != null && pyVar.D0) {
                    i13 = (int) ((1.0f - hxVar.getCollapsedProgress()) * AndroidUtilities.dp(81.0f));
                }
                return AndroidUtilities.dp(48.0f) + height + i13;
            case 5:
                return 0;
            case 6:
                return org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + AndroidUtilities.statusBarHeight + ((int) (((iu0) this.b).B0.S1.getAlpha() * r4.S1.getEditTextHeight()));
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

    private final /* synthetic */ void A(org.telegram.ui.Components.ic icVar) {
    }

    private final /* synthetic */ void B(org.telegram.ui.Components.ic icVar) {
    }

    private final /* synthetic */ void C(org.telegram.ui.Components.ic icVar) {
    }

    private final /* synthetic */ void D(org.telegram.ui.Components.ic icVar) {
    }

    private final /* synthetic */ void E(org.telegram.ui.Components.ic icVar) {
    }

    private final /* synthetic */ void F(org.telegram.ui.Components.ic icVar) {
    }

    private final /* synthetic */ void G(org.telegram.ui.Components.ic icVar) {
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

    private final /* synthetic */ void p(org.telegram.ui.Components.ic icVar) {
    }

    private final /* synthetic */ void q(org.telegram.ui.Components.ic icVar) {
    }

    private final /* synthetic */ void r(org.telegram.ui.Components.ic icVar) {
    }

    private final /* synthetic */ void s(org.telegram.ui.Components.ic icVar) {
    }

    private final /* synthetic */ void t(org.telegram.ui.Components.ic icVar) {
    }

    private final /* synthetic */ void u(org.telegram.ui.Components.ic icVar) {
    }

    private final /* synthetic */ void v(org.telegram.ui.Components.ic icVar) {
    }

    private final /* synthetic */ void w(org.telegram.ui.Components.ic icVar) {
    }

    private final /* synthetic */ void x(org.telegram.ui.Components.ic icVar) {
    }

    private final /* synthetic */ void y(org.telegram.ui.Components.ic icVar) {
    }

    private final /* synthetic */ void z(org.telegram.ui.Components.ic icVar) {
    }
}
