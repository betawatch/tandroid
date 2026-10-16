package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.UndoView;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes3.dex */
public final class c9 implements org.telegram.ui.Components.qb {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ c9(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // org.telegram.ui.Components.qb
    public final boolean a() {
        switch (this.a) {
        }
        return true;
    }

    @Override // org.telegram.ui.Components.qb
    public final void b(org.telegram.ui.Components.sc scVar) {
        switch (this.a) {
            case 2:
                org.telegram.ui.Components.wb wbVar = scVar.e;
                fo foVar = (fo) this.b;
                dh.d c10 = foVar.J.c(wbVar, null, true);
                eh.e eVar = new eh.e(foVar.ea);
                eVar.e = new bi.w2(18);
                float dpf2 = AndroidUtilities.dpf2(0.5f);
                float dpf22 = AndroidUtilities.dpf2(0.5f);
                eVar.f = dpf2;
                eVar.h = dpf22;
                c10.o(eVar);
                c10.q(AndroidUtilities.dp(16.0f));
                wbVar.setCustomBackground(c10);
                break;
            case 4:
                yy yyVar = (yy) this.b;
                UndoView undoView = yyVar.y0[0];
                if (undoView != null && undoView.getVisibility() == 0) {
                    yyVar.y0[0].e(2, true);
                    break;
                }
                break;
        }
    }

    @Override // org.telegram.ui.Components.qb
    public final void c(float f7) {
        switch (this.a) {
            case 0:
                n9 n9Var = (n9) this.b;
                n9Var.V = Math.max(0.0f, (f7 - n9Var.W) - n9Var.U);
                n9Var.g0();
                break;
            case 3:
                ContactsActivity contactsActivity = (ContactsActivity) this.b;
                contactsActivity.p0 = Math.max(0.0f, (f7 - contactsActivity.q0) - contactsActivity.o0);
                contactsActivity.i0();
                break;
            case 4:
                yy yyVar = (yy) this.b;
                UndoView undoView = yyVar.y0[0];
                if (undoView == null || undoView.getVisibility() != 0) {
                    yyVar.u1 = Math.max(0.0f, (f7 - yyVar.g4) - yyVar.j4);
                    yyVar.V4();
                    break;
                }
                break;
        }
    }

    @Override // org.telegram.ui.Components.qb
    public final /* synthetic */ void d(org.telegram.ui.Components.sc scVar) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Components.qb
    public final boolean e() {
        switch (this.a) {
            case 8:
                if (((ProfileActivity) this.b).s5 == null) {
                }
                break;
        }
        return true;
    }

    @Override // org.telegram.ui.Components.qb
    public final int f(int i10) {
        int i11;
        int i12;
        hv0 hv0Var;
        switch (this.a) {
            case 0:
                n9 n9Var = (n9) this.b;
                i11 = n9Var.W;
                i12 = n9Var.U;
                break;
            case 1:
                return ((gd) this.b).O.getMeasuredHeight();
            case 2:
                fo foVar = (fo) this.b;
                if (i10 == 1) {
                    return 0;
                }
                return Math.round(foVar.S.getInputBubbleHeight() + AndroidUtilities.dp(16.0f) + foVar.b9(org.telegram.ui.Components.u31.c) + foVar.v.d());
            case 3:
                ContactsActivity contactsActivity = (ContactsActivity) this.b;
                i11 = contactsActivity.q0;
                i12 = contactsActivity.o0;
                break;
            case 4:
                yy yyVar = (yy) this.b;
                return yyVar.Y2 != 0 ? AndroidUtilities.dp(60.0f) + yyVar.g4 : yyVar.k3();
            case 5:
                i12 = ((jh0) this.b).L;
                i11 = AndroidUtilities.dp(64.0f);
                break;
            case 6:
                PhotoViewer photoViewer = ((bv0) this.b).E0;
                int i13 = 0;
                if (!photoViewer.R4) {
                    bi.i5 i5Var = photoViewer.i0;
                    if (i5Var != null && i5Var.getVisibility() == 0) {
                        i13 = (int) ((photoViewer.i0.getAlpha() * photoViewer.i0.getHeight()) + 0);
                    }
                    org.telegram.ui.Components.i40 i40Var = photoViewer.l1;
                    return (i40Var == null || !i40Var.c()) ? i13 : (AndroidUtilities.isTablet() || photoViewer.e0.getMeasuredHeight() > photoViewer.e0.getMeasuredWidth()) ? (int) ((photoViewer.l1.getAlpha() * photoViewer.l1.getHeight()) + i13) : i13;
                }
                ht0 ht0Var = photoViewer.U1;
                if (ht0Var != null) {
                    i13 = ht0Var.L.l;
                    if (ht0Var.getVisibility() == 0 && ((hv0Var = photoViewer.d) == null || !hv0Var.A())) {
                        i13 = org.telegram.messenger.g0.C(12.0f, photoViewer.U1.getEditTextHeight(), i13);
                    }
                }
                x5 x5Var = photoViewer.P0;
                if (x5Var == null || x5Var.getVisibility() != 0) {
                    return i13;
                }
                ht0 ht0Var2 = photoViewer.U1;
                return (ht0Var2 == null || !ht0Var2.L.c()) ? i13 + photoViewer.P0.getHeight() : i13;
            case 7:
                return ((PremiumPreviewFragment) this.b).o0.d;
            case 8:
                ProfileActivity profileActivity = (ProfileActivity) this.b;
                if (profileActivity.s5 == null) {
                    return profileActivity.l6 + profileActivity.k6;
                }
                return profileActivity.l6 + profileActivity.k6 + ((int) (((AndroidUtilities.dp(52.0f) - profileActivity.s5.getTranslationY()) - (profileActivity.t5[1].getTranslationY() * profileActivity.O.g0(9, false))) - (profileActivity.t5[0].getTranslationY() * profileActivity.O.g0(8, true))));
            default:
                kg1 kg1Var = (kg1) this.b;
                d61 d61Var = kg1Var.o0;
                if (d61Var == null || d61Var.getVisibility() != 0) {
                    return 0;
                }
                return kg1Var.o0.getMeasuredHeight();
        }
        return i11 + i12;
    }

    @Override // org.telegram.ui.Components.qb
    public final /* synthetic */ boolean g(int i10) {
        switch (this.a) {
        }
        return false;
    }

    @Override // org.telegram.ui.Components.qb
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
                fo foVar = (fo) this.b;
                kVar = ((org.telegram.ui.ActionBar.m2) foVar).actionBar;
                if (kVar != null) {
                    kVar2 = ((org.telegram.ui.ActionBar.m2) foVar).actionBar;
                    int measuredHeight = kVar2.getMeasuredHeight();
                    kVar3 = ((org.telegram.ui.ActionBar.m2) foVar).actionBar;
                    i11 = kVar3.getTop() + measuredHeight;
                } else {
                    i11 = 0;
                }
                max = Math.max(currentActionBarHeight, i11);
                max2 = (int) Math.max(0.0f, foVar.t9);
                break;
            case 3:
                return 0;
            case 4:
                yy yyVar = (yy) this.b;
                kVar4 = ((org.telegram.ui.ActionBar.m2) yyVar).actionBar;
                int i13 = 0;
                if (kVar4 != null) {
                    kVar5 = ((org.telegram.ui.ActionBar.m2) yyVar).actionBar;
                    i12 = kVar5.getMeasuredHeight();
                } else {
                    i12 = 0;
                }
                ww wwVar = yyVar.z0;
                int measuredHeight2 = i12 + ((wwVar == null || wwVar.getVisibility() != 0) ? 0 : yyVar.z0.getMeasuredHeight());
                org.telegram.ui.Components.xs xsVar = yyVar.J1;
                int height = measuredHeight2 + (xsVar != null ? xsVar.getHeight() : 0);
                px pxVar = yyVar.E0;
                if (pxVar != null && yyVar.G0) {
                    i13 = (int) ((1.0f - pxVar.getCollapsedProgress()) * AndroidUtilities.dp(81.0f));
                }
                return AndroidUtilities.dp(48.0f) + height + i13;
            case 5:
                return 0;
            case 6:
                return org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + AndroidUtilities.statusBarHeight + ((int) (((bv0) this.b).E0.V1.getAlpha() * r4.V1.getEditTextHeight()));
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

    private final /* synthetic */ void A(org.telegram.ui.Components.sc scVar) {
    }

    private final /* synthetic */ void B(org.telegram.ui.Components.sc scVar) {
    }

    private final /* synthetic */ void C(org.telegram.ui.Components.sc scVar) {
    }

    private final /* synthetic */ void D(org.telegram.ui.Components.sc scVar) {
    }

    private final /* synthetic */ void E(org.telegram.ui.Components.sc scVar) {
    }

    private final /* synthetic */ void F(org.telegram.ui.Components.sc scVar) {
    }

    private final /* synthetic */ void G(org.telegram.ui.Components.sc scVar) {
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

    private final /* synthetic */ void p(org.telegram.ui.Components.sc scVar) {
    }

    private final /* synthetic */ void q(org.telegram.ui.Components.sc scVar) {
    }

    private final /* synthetic */ void r(org.telegram.ui.Components.sc scVar) {
    }

    private final /* synthetic */ void s(org.telegram.ui.Components.sc scVar) {
    }

    private final /* synthetic */ void t(org.telegram.ui.Components.sc scVar) {
    }

    private final /* synthetic */ void u(org.telegram.ui.Components.sc scVar) {
    }

    private final /* synthetic */ void v(org.telegram.ui.Components.sc scVar) {
    }

    private final /* synthetic */ void w(org.telegram.ui.Components.sc scVar) {
    }

    private final /* synthetic */ void x(org.telegram.ui.Components.sc scVar) {
    }

    private final /* synthetic */ void y(org.telegram.ui.Components.sc scVar) {
    }

    private final /* synthetic */ void z(org.telegram.ui.Components.sc scVar) {
    }
}
