package org.telegram.ui;

import android.view.View;
import android.view.WindowInsets;
import android.widget.FrameLayout;
import org.telegram.messenger.voip.VoIPService;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class kd1 implements org.telegram.ui.ActionBar.u1, org.telegram.ui.Components.voip.a1, r0.m, org.telegram.ui.Components.voip.p2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ be1 b;

    public /* synthetic */ kd1(be1 be1Var, int i10) {
        this.a = i10;
        this.b = be1Var;
    }

    @Override // r0.m
    public r0.j1 R0(View view, r0.j1 j1Var) {
        WindowInsets g10 = j1Var.g();
        be1 be1Var = this.b;
        be1Var.r0 = g10;
        ((FrameLayout.LayoutParams) be1Var.j0.getLayoutParams()).bottomMargin = be1Var.r0.getSystemWindowInsetBottom();
        ((FrameLayout.LayoutParams) be1Var.e0.getLayoutParams()).bottomMargin = be1Var.r0.getSystemWindowInsetBottom();
        ((FrameLayout.LayoutParams) be1Var.H.getLayoutParams()).topMargin = be1Var.r0.getSystemWindowInsetTop();
        ((FrameLayout.LayoutParams) be1Var.I.getLayoutParams()).topMargin = be1Var.r0.getSystemWindowInsetTop();
        ((FrameLayout.LayoutParams) be1Var.K.getLayoutParams()).topMargin = be1Var.r0.getSystemWindowInsetTop() + org.telegram.messenger.i0.L(56.0f);
        ((FrameLayout.LayoutParams) be1Var.X.getLayoutParams()).topMargin = be1Var.r0.getSystemWindowInsetTop() + org.telegram.messenger.i0.L(135.0f);
        ((FrameLayout.LayoutParams) be1Var.N.getLayoutParams()).topMargin = be1Var.r0.getSystemWindowInsetTop() + org.telegram.messenger.i0.L(17.0f);
        ((FrameLayout.LayoutParams) be1Var.D.getLayoutParams()).topMargin = be1Var.r0.getSystemWindowInsetTop() + org.telegram.messenger.i0.L(93.0f);
        ((FrameLayout.LayoutParams) be1Var.O.getLayoutParams()).topMargin = be1Var.r0.getSystemWindowInsetTop();
        ((FrameLayout.LayoutParams) be1Var.R.getLayoutParams()).topMargin = be1Var.r0.getSystemWindowInsetTop() + org.telegram.messenger.i0.L(118.0f);
        ((FrameLayout.LayoutParams) be1Var.Q.getLayoutParams()).topMargin = be1Var.r0.getSystemWindowInsetTop() + org.telegram.messenger.i0.L(380.0f);
        ((FrameLayout.LayoutParams) be1Var.Z.getLayoutParams()).bottomMargin = be1Var.r0.getSystemWindowInsetBottom();
        ((FrameLayout.LayoutParams) be1Var.M0.getLayoutParams()).bottomMargin = be1Var.r0.getSystemWindowInsetBottom();
        be1Var.Y.setInsets(be1Var.r0);
        be1Var.Z.setInsets(be1Var.r0);
        be1Var.s.requestLayout();
        ud1 ud1Var = be1Var.o0;
        if (ud1Var != null) {
            ud1Var.setBottomPadding(be1Var.r0.getSystemWindowInsetBottom());
        }
        return r0.j1.b;
    }

    @Override // org.telegram.ui.ActionBar.u1
    public void h(org.telegram.ui.ActionBar.x1 x1Var, int i10) {
        switch (this.a) {
            case 0:
                td1 td1Var = this.b.u0;
                if (td1Var != null) {
                    td1Var.b();
                    break;
                }
                break;
            default:
                this.b.u0.b();
                break;
        }
    }

    @Override // org.telegram.ui.Components.voip.p2
    public void j(org.telegram.ui.Components.voip.q2 q2Var) {
        int i10 = this.a;
        be1 be1Var = this.b;
        switch (i10) {
            case 5:
                VoIPService sharedInstance = VoIPService.getSharedInstance();
                if (sharedInstance != null) {
                    org.telegram.messenger.i0.r(be1Var.S0);
                    be1Var.R0 = false;
                    boolean isMicMute = sharedInstance.isMicMute();
                    boolean z10 = !isMicMute;
                    if (be1Var.w0.isTouchExplorationEnabled()) {
                        q2Var.announceForAccessibility(org.telegram.messenger.cd.L0(!isMicMute ? 2131754729 : 2131754728, null));
                    }
                    sharedInstance.setMicMute(z10, false, true);
                    be1Var.q0 = be1Var.p0;
                    be1Var.G();
                    break;
                }
                break;
            default:
                org.telegram.messenger.i0.r(be1Var.S0);
                be1Var.R0 = false;
                if (be1Var.b.checkSelfPermission("android.permission.CAMERA") == 0) {
                    be1Var.B();
                    break;
                } else {
                    be1Var.b.requestPermissions(new String[]{"android.permission.CAMERA"}, org.telegram.messenger.zs.n1);
                    break;
                }
        }
    }
}
