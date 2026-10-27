package org.telegram.ui;

import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.Components.UndoView;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class d9 implements org.telegram.ui.Components.ob {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ d9(Object obj, int i10) {
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
        fh.e eVar;
        switch (this.a) {
            case 2:
                org.telegram.ui.Components.ub ubVar = qcVar.e;
                wn wnVar = (wn) this.b;
                eh.d c10 = wnVar.J.c(ubVar, null, true);
                if (qcVar.l) {
                    eVar = new fh.e(wnVar.ua);
                    eVar.e = new cg(1);
                    eVar.d(536870911, 536870911);
                    eVar.c(536870911, 536870911);
                    float dpf2 = AndroidUtilities.dpf2(0.66f);
                    float dpf22 = AndroidUtilities.dpf2(0.66f);
                    eVar.f = dpf2;
                    eVar.h = dpf22;
                    eVar.b(TLObject.FLAG_29, TLObject.FLAG_29);
                    float dp = AndroidUtilities.dp(6.0f);
                    float dp2 = AndroidUtilities.dp(2.0f);
                    eVar.n = dp;
                    eVar.r = dp2;
                } else {
                    eVar = new fh.e(wnVar.ua);
                    eVar.e = new gh.a(1);
                    float dpf23 = AndroidUtilities.dpf2(0.5f);
                    float dpf24 = AndroidUtilities.dpf2(0.5f);
                    eVar.f = dpf23;
                    eVar.h = dpf24;
                }
                c10.v(eVar);
                c10.x(AndroidUtilities.dp(qcVar.l ? 24.0f : 16.0f));
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
                o9 o9Var = (o9) this.b;
                o9Var.Q = Math.max(0.0f, (f7 - o9Var.R) - o9Var.P);
                o9Var.c0();
                break;
            case 3:
                ContactsActivity contactsActivity = (ContactsActivity) this.b;
                contactsActivity.j0 = Math.max(0.0f, (f7 - contactsActivity.k0) - contactsActivity.i0);
                contactsActivity.f0();
                break;
            case 4:
                ey eyVar = (ey) this.b;
                UndoView undoView = eyVar.y0[0];
                if (undoView == null || undoView.getVisibility() != 0) {
                    eyVar.u1 = Math.max(0.0f, (f7 - eyVar.g4) - eyVar.j4);
                    eyVar.g5();
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
            case 9:
                if (((ProfileActivity) this.b).y5 == null) {
                }
                break;
        }
        return true;
    }

    @Override // org.telegram.ui.Components.ob
    public final int f(int i10) {
        int i11;
        int i12;
        qu0 qu0Var;
        int dp;
        switch (this.a) {
            case 0:
                o9 o9Var = (o9) this.b;
                i11 = o9Var.R;
                i12 = o9Var.P;
                break;
            case 1:
                return ((bd) this.b).O.getMeasuredHeight();
            case 2:
                wn wnVar = (wn) this.b;
                mj mjVar = wnVar.v;
                if (i10 == 1) {
                    return 0;
                }
                return (i10 != 1313167187 || wnVar.a1 == null) ? Math.round(wnVar.S.getInputBubbleHeight() + AndroidUtilities.dp(16.0f) + wnVar.j9(org.telegram.ui.Components.b41.c) + mjVar.d()) : Math.round(mjVar.d() + AndroidUtilities.dp(62.0f));
            case 3:
                ContactsActivity contactsActivity = (ContactsActivity) this.b;
                i11 = contactsActivity.k0;
                i12 = contactsActivity.i0;
                break;
            case 4:
                ey eyVar = (ey) this.b;
                return eyVar.Y2 != 0 ? AndroidUtilities.dp(60.0f) + eyVar.g4 : eyVar.t3();
            case 5:
                i12 = ((rg0) this.b).K;
                i11 = AndroidUtilities.dp(64.0f);
                break;
            case 6:
                zj0 zj0Var = (zj0) this.b;
                return AndroidUtilities.dp((zj0Var.j0() ? 60 : 0) + 72) + zj0Var.x;
            case 7:
                PhotoViewer photoViewer = ((ku0) this.b).t0;
                int i13 = 0;
                if (!photoViewer.R4) {
                    di.i4 i4Var = photoViewer.i0;
                    if (i4Var != null && i4Var.getVisibility() == 0) {
                        i13 = (int) ((photoViewer.i0.getAlpha() * photoViewer.i0.getHeight()) + 0);
                    }
                    org.telegram.ui.Components.g40 g40Var = photoViewer.l1;
                    return (g40Var == null || !g40Var.c()) ? i13 : (AndroidUtilities.isTablet() || photoViewer.e0.getMeasuredHeight() > photoViewer.e0.getMeasuredWidth()) ? (int) ((photoViewer.l1.getAlpha() * photoViewer.l1.getHeight()) + i13) : i13;
                }
                qs0 qs0Var = photoViewer.U1;
                if (qs0Var != null) {
                    i13 = qs0Var.L.l;
                    if (qs0Var.getVisibility() == 0 && ((qu0Var = photoViewer.d) == null || !qu0Var.A())) {
                        i13 = org.telegram.messenger.t.D(12.0f, photoViewer.U1.getEditTextHeight(), i13);
                    }
                }
                bi.j5 j5Var = photoViewer.P0;
                if (j5Var == null || j5Var.getVisibility() != 0) {
                    return i13;
                }
                qs0 qs0Var2 = photoViewer.U1;
                return (qs0Var2 == null || !qs0Var2.L.c()) ? i13 + photoViewer.P0.getHeight() : i13;
            case 8:
                return ((PremiumPreviewFragment) this.b).o0.d;
            case 9:
                ProfileActivity profileActivity = (ProfileActivity) this.b;
                int i14 = 0;
                if (profileActivity.y5 == null) {
                    dp = profileActivity.z6 + profileActivity.y6;
                } else {
                    dp = ((int) (((AndroidUtilities.dp(52.0f) - profileActivity.y5.getTranslationY()) - (((1.0f - profileActivity.z5[1].getAlpha()) * AndroidUtilities.dp(72.0f)) * profileActivity.N.o0(9, false))) - (((1.0f - profileActivity.z5[0].getAlpha()) * AndroidUtilities.dp(72.0f)) * profileActivity.N.o0(8, true)))) + profileActivity.z6 + profileActivity.y6;
                }
                xz0 xz0Var = profileActivity.N;
                float o02 = (xz0Var == null || xz0Var.a0 == null) ? 0.0f : xz0Var.o0(14, false);
                if (o02 <= 0.0f) {
                    return dp;
                }
                org.telegram.ui.Components.ws0 ws0Var = profileActivity.N.a0;
                View view = profileActivity.fragmentView;
                FrameLayout frameLayout = ws0Var.r;
                if (view != null && frameLayout != null && frameLayout.getVisibility() == 0 && frameLayout.getAlpha() > 0.0f) {
                    view.getLocationInWindow(new int[2]);
                    frameLayout.getLocationInWindow(new int[2]);
                    i14 = Math.max(0, (int) (frameLayout.getAlpha() * ((view.getHeight() + r7[1]) - r5[1])));
                }
                return AndroidUtilities.lerp(dp, Math.max(dp, i14), Math.min(1.0f, o02));
            default:
                cf1 cf1Var = (cf1) this.b;
                r41 r41Var = cf1Var.o0;
                if (r41Var == null || r41Var.getVisibility() != 0) {
                    return 0;
                }
                return cf1Var.o0.getMeasuredHeight();
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
                wn wnVar = (wn) this.b;
                kVar = ((org.telegram.ui.ActionBar.r2) wnVar).actionBar;
                if (kVar != null) {
                    kVar2 = ((org.telegram.ui.ActionBar.r2) wnVar).actionBar;
                    int measuredHeight = kVar2.getMeasuredHeight();
                    kVar3 = ((org.telegram.ui.ActionBar.r2) wnVar).actionBar;
                    i11 = kVar3.getTop() + measuredHeight;
                } else {
                    i11 = 0;
                }
                max = Math.max(currentActionBarHeight, i11);
                max2 = (int) Math.max(0.0f, wnVar.J9);
                break;
            case 3:
                return 0;
            case 4:
                ey eyVar = (ey) this.b;
                kVar4 = ((org.telegram.ui.ActionBar.r2) eyVar).actionBar;
                int i13 = 0;
                if (kVar4 != null) {
                    kVar5 = ((org.telegram.ui.ActionBar.r2) eyVar).actionBar;
                    i12 = kVar5.getMeasuredHeight();
                } else {
                    i12 = 0;
                }
                tx txVar = eyVar.z0;
                int measuredHeight2 = i12 + ((txVar == null || txVar.getVisibility() != 0) ? 0 : eyVar.z0.getMeasuredHeight());
                org.telegram.ui.Components.ws wsVar = eyVar.J1;
                int height = measuredHeight2 + (wsVar != null ? wsVar.getHeight() : 0);
                sw swVar = eyVar.E0;
                if (swVar != null && eyVar.G0) {
                    i13 = (int) ((1.0f - swVar.getCollapsedProgress()) * AndroidUtilities.dp(81.0f));
                }
                return AndroidUtilities.dp(48.0f) + height + i13;
            case 5:
                return 0;
            case 6:
                return 0;
            case 7:
                return org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + AndroidUtilities.statusBarHeight + ((int) (((ku0) this.b).t0.V1.getAlpha() * r4.V1.getEditTextHeight()));
            case 8:
                return 0;
            case 9:
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

    private final /* synthetic */ void H(org.telegram.ui.Components.qc qcVar) {
    }

    private final /* synthetic */ void I(org.telegram.ui.Components.qc qcVar) {
    }

    private final /* synthetic */ void J(org.telegram.ui.Components.qc qcVar) {
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
