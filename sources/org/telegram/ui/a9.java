package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.UndoView;

/* compiled from: r8-map-id-33b1d79182603e8304c32e909c352797304d7e7816a08740f96af6cffe97caab */
/* loaded from: classes3.dex */
public final class a9 implements org.telegram.ui.Components.ob {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ a9(Object obj, int i10) {
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
                zn znVar = (zn) this.b;
                ch.d c10 = znVar.J.c(ubVar, null, true);
                dh.e eVar = new dh.e(znVar.ea);
                eVar.e = new d2.c(4);
                float dpf2 = AndroidUtilities.dpf2(0.5f);
                float dpf22 = AndroidUtilities.dpf2(0.5f);
                eVar.f = dpf2;
                eVar.h = dpf22;
                c10.o(eVar);
                c10.q(AndroidUtilities.dp(16.0f));
                ubVar.setCustomBackground(c10);
                break;
            case 4:
                uy uyVar = (uy) this.b;
                UndoView undoView = uyVar.y0[0];
                if (undoView != null && undoView.getVisibility() == 0) {
                    uyVar.y0[0].e(2, true);
                    break;
                }
                break;
        }
    }

    @Override // org.telegram.ui.Components.ob
    public final void c(float f7) {
        switch (this.a) {
            case 0:
                l9 l9Var = (l9) this.b;
                l9Var.V = Math.max(0.0f, (f7 - l9Var.W) - l9Var.U);
                l9Var.g0();
                break;
            case 3:
                ContactsActivity contactsActivity = (ContactsActivity) this.b;
                contactsActivity.p0 = Math.max(0.0f, (f7 - contactsActivity.q0) - contactsActivity.o0);
                contactsActivity.i0();
                break;
            case 4:
                uy uyVar = (uy) this.b;
                UndoView undoView = uyVar.y0[0];
                if (undoView == null || undoView.getVisibility() != 0) {
                    uyVar.u1 = Math.max(0.0f, (f7 - uyVar.f4) - uyVar.i4);
                    uyVar.X4();
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
                if (((ProfileActivity) this.b).s5 == null) {
                }
                break;
        }
        return true;
    }

    @Override // org.telegram.ui.Components.ob
    public final int f(int i10) {
        int i11;
        int i12;
        bv0 bv0Var;
        switch (this.a) {
            case 0:
                l9 l9Var = (l9) this.b;
                i11 = l9Var.W;
                i12 = l9Var.U;
                break;
            case 1:
                return ((bd) this.b).O.getMeasuredHeight();
            case 2:
                zn znVar = (zn) this.b;
                if (i10 == 1) {
                    return 0;
                }
                return Math.round(znVar.S.getInputBubbleHeight() + AndroidUtilities.dp(16.0f) + znVar.W8(org.telegram.ui.Components.i31.c) + znVar.v.c());
            case 3:
                ContactsActivity contactsActivity = (ContactsActivity) this.b;
                i11 = contactsActivity.q0;
                i12 = contactsActivity.o0;
                break;
            case 4:
                uy uyVar = (uy) this.b;
                return uyVar.X2 != 0 ? AndroidUtilities.dp(60.0f) + uyVar.f4 : uyVar.n3();
            case 5:
                i12 = ((fh0) this.b).L;
                i11 = AndroidUtilities.dp(64.0f);
                break;
            case 6:
                PhotoViewer photoViewer = ((vu0) this.b).E0;
                int i13 = 0;
                if (!photoViewer.R4) {
                    ai.x5 x5Var = photoViewer.i0;
                    if (x5Var != null && x5Var.getVisibility() == 0) {
                        i13 = (int) ((photoViewer.i0.getAlpha() * photoViewer.i0.getHeight()) + 0);
                    }
                    org.telegram.ui.Components.v30 v30Var = photoViewer.l1;
                    return (v30Var == null || !v30Var.c()) ? i13 : (AndroidUtilities.isTablet() || photoViewer.e0.getMeasuredHeight() > photoViewer.e0.getMeasuredWidth()) ? (int) ((photoViewer.l1.getAlpha() * photoViewer.l1.getHeight()) + i13) : i13;
                }
                bt0 bt0Var = photoViewer.U1;
                if (bt0Var != null) {
                    i13 = bt0Var.L.l;
                    if (bt0Var.getVisibility() == 0 && ((bv0Var = photoViewer.d) == null || !bv0Var.A())) {
                        i13 = org.telegram.messenger.q.D(12.0f, photoViewer.U1.getEditTextHeight(), i13);
                    }
                }
                t5 t5Var = photoViewer.P0;
                if (t5Var == null || t5Var.getVisibility() != 0) {
                    return i13;
                }
                bt0 bt0Var2 = photoViewer.U1;
                return (bt0Var2 == null || !bt0Var2.L.c()) ? i13 + photoViewer.P0.getHeight() : i13;
            case 7:
                return ((PremiumPreviewFragment) this.b).o0.d;
            case 8:
                ProfileActivity profileActivity = (ProfileActivity) this.b;
                if (profileActivity.s5 == null) {
                    return profileActivity.l6 + profileActivity.k6;
                }
                return profileActivity.l6 + profileActivity.k6 + ((int) (((AndroidUtilities.dp(52.0f) - profileActivity.s5.getTranslationY()) - (profileActivity.t5[1].getTranslationY() * profileActivity.O.g0(9, false))) - (profileActivity.t5[0].getTranslationY() * profileActivity.O.g0(8, true))));
            default:
                dg1 dg1Var = (dg1) this.b;
                r41 r41Var = dg1Var.o0;
                if (r41Var == null || r41Var.getVisibility() != 0) {
                    return 0;
                }
                return dg1Var.o0.getMeasuredHeight();
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
                zn znVar = (zn) this.b;
                kVar = ((org.telegram.ui.ActionBar.n2) znVar).actionBar;
                if (kVar != null) {
                    kVar2 = ((org.telegram.ui.ActionBar.n2) znVar).actionBar;
                    int measuredHeight = kVar2.getMeasuredHeight();
                    kVar3 = ((org.telegram.ui.ActionBar.n2) znVar).actionBar;
                    i11 = kVar3.getTop() + measuredHeight;
                } else {
                    i11 = 0;
                }
                max = Math.max(currentActionBarHeight, i11);
                max2 = (int) Math.max(0.0f, znVar.t9);
                break;
            case 3:
                return 0;
            case 4:
                uy uyVar = (uy) this.b;
                kVar4 = ((org.telegram.ui.ActionBar.n2) uyVar).actionBar;
                int i13 = 0;
                if (kVar4 != null) {
                    kVar5 = ((org.telegram.ui.ActionBar.n2) uyVar).actionBar;
                    i12 = kVar5.getMeasuredHeight();
                } else {
                    i12 = 0;
                }
                sw swVar = uyVar.z0;
                int measuredHeight2 = i12 + ((swVar == null || swVar.getVisibility() != 0) ? 0 : uyVar.z0.getMeasuredHeight());
                org.telegram.ui.Components.ks ksVar = uyVar.J1;
                int height = measuredHeight2 + (ksVar != null ? ksVar.getHeight() : 0);
                lx lxVar = uyVar.E0;
                if (lxVar != null && uyVar.G0) {
                    i13 = (int) ((1.0f - lxVar.getCollapsedProgress()) * AndroidUtilities.dp(81.0f));
                }
                return AndroidUtilities.dp(48.0f) + height + i13;
            case 5:
                return 0;
            case 6:
                return org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + AndroidUtilities.statusBarHeight + ((int) (((vu0) this.b).E0.V1.getAlpha() * r4.V1.getEditTextHeight()));
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
