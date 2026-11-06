package org.telegram.ui;

import android.view.View;
import android.view.WindowInsets;
import android.widget.FrameLayout;
import org.telegram.messenger.voip.VoIPService;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes3.dex */
public final /* synthetic */ class pb1 implements org.telegram.ui.ActionBar.r1, org.telegram.ui.Components.voip.m1, r0.m, org.telegram.ui.Components.voip.z2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ ec1 b;

    public /* synthetic */ pb1(ec1 ec1Var, int i7) {
        this.a = i7;
        this.b = ec1Var;
    }

    @Override // r0.m
    public r0.k1 S0(View view, r0.k1 k1Var) {
        WindowInsets g10 = k1Var.g();
        ec1 ec1Var = this.b;
        ec1Var.q0 = g10;
        ((FrameLayout.LayoutParams) ec1Var.i0.getLayoutParams()).bottomMargin = ec1Var.q0.getSystemWindowInsetBottom();
        ((FrameLayout.LayoutParams) ec1Var.e0.getLayoutParams()).bottomMargin = ec1Var.q0.getSystemWindowInsetBottom();
        ((FrameLayout.LayoutParams) ec1Var.H.getLayoutParams()).topMargin = ec1Var.q0.getSystemWindowInsetTop();
        ((FrameLayout.LayoutParams) ec1Var.I.getLayoutParams()).topMargin = ec1Var.q0.getSystemWindowInsetTop();
        ((FrameLayout.LayoutParams) ec1Var.K.getLayoutParams()).topMargin = ec1Var.q0.getSystemWindowInsetTop() + org.telegram.messenger.g0.L(56.0f);
        ((FrameLayout.LayoutParams) ec1Var.X.getLayoutParams()).topMargin = ec1Var.q0.getSystemWindowInsetTop() + org.telegram.messenger.g0.L(135.0f);
        ((FrameLayout.LayoutParams) ec1Var.N.getLayoutParams()).topMargin = ec1Var.q0.getSystemWindowInsetTop() + org.telegram.messenger.g0.L(17.0f);
        ((FrameLayout.LayoutParams) ec1Var.D.getLayoutParams()).topMargin = ec1Var.q0.getSystemWindowInsetTop() + org.telegram.messenger.g0.L(93.0f);
        ((FrameLayout.LayoutParams) ec1Var.O.getLayoutParams()).topMargin = ec1Var.q0.getSystemWindowInsetTop();
        ((FrameLayout.LayoutParams) ec1Var.R.getLayoutParams()).topMargin = ec1Var.q0.getSystemWindowInsetTop() + org.telegram.messenger.g0.L(118.0f);
        ((FrameLayout.LayoutParams) ec1Var.Q.getLayoutParams()).topMargin = ec1Var.q0.getSystemWindowInsetTop() + org.telegram.messenger.g0.L(380.0f);
        ((FrameLayout.LayoutParams) ec1Var.Z.getLayoutParams()).bottomMargin = ec1Var.q0.getSystemWindowInsetBottom();
        ((FrameLayout.LayoutParams) ec1Var.L0.getLayoutParams()).bottomMargin = ec1Var.q0.getSystemWindowInsetBottom();
        ec1Var.Y.setInsets(ec1Var.q0);
        ec1Var.Z.setInsets(ec1Var.q0);
        ec1Var.s.requestLayout();
        yb1 yb1Var = ec1Var.n0;
        if (yb1Var != null) {
            yb1Var.setBottomPadding(ec1Var.q0.getSystemWindowInsetBottom());
        }
        return r0.k1.b;
    }

    @Override // org.telegram.ui.Components.voip.z2
    public void d(org.telegram.ui.Components.voip.a3 a3Var) {
        int i7 = this.a;
        ec1 ec1Var = this.b;
        switch (i7) {
            case 4:
                VoIPService sharedInstance = VoIPService.getSharedInstance();
                if (sharedInstance != null) {
                    org.telegram.messenger.g0.r(ec1Var.R0);
                    ec1Var.Q0 = false;
                    boolean isMicMute = sharedInstance.isMicMute();
                    boolean z9 = !isMicMute;
                    if (ec1Var.v0.isTouchExplorationEnabled()) {
                        a3Var.announceForAccessibility(org.telegram.messenger.hd.M0(!isMicMute ? 2131754729 : 2131754728, null));
                    }
                    sharedInstance.setMicMute(z9, false, true);
                    ec1Var.p0 = ec1Var.o0;
                    ec1Var.y();
                    break;
                }
                break;
            default:
                org.telegram.messenger.g0.r(ec1Var.R0);
                ec1Var.Q0 = false;
                if (ec1Var.b.checkSelfPermission("android.permission.CAMERA") == 0) {
                    ec1Var.t();
                    break;
                } else {
                    ec1Var.b.requestPermissions(new String[]{"android.permission.CAMERA"}, org.telegram.messenger.qs.n1);
                    break;
                }
        }
    }

    @Override // org.telegram.ui.ActionBar.r1
    public void g(org.telegram.ui.ActionBar.u1 u1Var, int i7) {
        this.b.t0.b();
    }
}
