package org.telegram.ui;

import android.view.View;
import android.view.WindowInsets;
import android.widget.FrameLayout;
import org.telegram.messenger.voip.VoIPService;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final /* synthetic */ class id1 implements org.telegram.ui.ActionBar.u1, org.telegram.ui.Components.voip.b1, r0.m, org.telegram.ui.Components.voip.q2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ zd1 b;

    public /* synthetic */ id1(zd1 zd1Var, int i10) {
        this.a = i10;
        this.b = zd1Var;
    }

    @Override // r0.m
    public r0.j1 R0(View view, r0.j1 j1Var) {
        WindowInsets g10 = j1Var.g();
        zd1 zd1Var = this.b;
        zd1Var.r0 = g10;
        ((FrameLayout.LayoutParams) zd1Var.j0.getLayoutParams()).bottomMargin = zd1Var.r0.getSystemWindowInsetBottom();
        ((FrameLayout.LayoutParams) zd1Var.e0.getLayoutParams()).bottomMargin = zd1Var.r0.getSystemWindowInsetBottom();
        ((FrameLayout.LayoutParams) zd1Var.H.getLayoutParams()).topMargin = zd1Var.r0.getSystemWindowInsetTop();
        ((FrameLayout.LayoutParams) zd1Var.I.getLayoutParams()).topMargin = zd1Var.r0.getSystemWindowInsetTop();
        ((FrameLayout.LayoutParams) zd1Var.K.getLayoutParams()).topMargin = zd1Var.r0.getSystemWindowInsetTop() + org.telegram.messenger.i0.L(56.0f);
        ((FrameLayout.LayoutParams) zd1Var.X.getLayoutParams()).topMargin = zd1Var.r0.getSystemWindowInsetTop() + org.telegram.messenger.i0.L(135.0f);
        ((FrameLayout.LayoutParams) zd1Var.N.getLayoutParams()).topMargin = zd1Var.r0.getSystemWindowInsetTop() + org.telegram.messenger.i0.L(17.0f);
        ((FrameLayout.LayoutParams) zd1Var.D.getLayoutParams()).topMargin = zd1Var.r0.getSystemWindowInsetTop() + org.telegram.messenger.i0.L(93.0f);
        ((FrameLayout.LayoutParams) zd1Var.O.getLayoutParams()).topMargin = zd1Var.r0.getSystemWindowInsetTop();
        ((FrameLayout.LayoutParams) zd1Var.R.getLayoutParams()).topMargin = zd1Var.r0.getSystemWindowInsetTop() + org.telegram.messenger.i0.L(118.0f);
        ((FrameLayout.LayoutParams) zd1Var.Q.getLayoutParams()).topMargin = zd1Var.r0.getSystemWindowInsetTop() + org.telegram.messenger.i0.L(380.0f);
        ((FrameLayout.LayoutParams) zd1Var.Z.getLayoutParams()).bottomMargin = zd1Var.r0.getSystemWindowInsetBottom();
        ((FrameLayout.LayoutParams) zd1Var.M0.getLayoutParams()).bottomMargin = zd1Var.r0.getSystemWindowInsetBottom();
        zd1Var.Y.setInsets(zd1Var.r0);
        zd1Var.Z.setInsets(zd1Var.r0);
        zd1Var.s.requestLayout();
        sd1 sd1Var = zd1Var.o0;
        if (sd1Var != null) {
            sd1Var.setBottomPadding(zd1Var.r0.getSystemWindowInsetBottom());
        }
        return r0.j1.b;
    }

    @Override // org.telegram.ui.ActionBar.u1
    public void h(org.telegram.ui.ActionBar.x1 x1Var, int i10) {
        switch (this.a) {
            case 0:
                rd1 rd1Var = this.b.u0;
                if (rd1Var != null) {
                    rd1Var.b();
                    break;
                }
                break;
            default:
                this.b.u0.b();
                break;
        }
    }

    @Override // org.telegram.ui.Components.voip.q2
    public void j(org.telegram.ui.Components.voip.r2 r2Var) {
        int i10 = this.a;
        zd1 zd1Var = this.b;
        switch (i10) {
            case 5:
                VoIPService sharedInstance = VoIPService.getSharedInstance();
                if (sharedInstance != null) {
                    org.telegram.messenger.i0.r(zd1Var.S0);
                    zd1Var.R0 = false;
                    boolean isMicMute = sharedInstance.isMicMute();
                    boolean z10 = !isMicMute;
                    if (zd1Var.w0.isTouchExplorationEnabled()) {
                        r2Var.announceForAccessibility(org.telegram.messenger.dd.L0(!isMicMute ? 2131754729 : 2131754728, null));
                    }
                    sharedInstance.setMicMute(z10, false, true);
                    zd1Var.q0 = zd1Var.p0;
                    zd1Var.G();
                    break;
                }
                break;
            default:
                org.telegram.messenger.i0.r(zd1Var.S0);
                zd1Var.R0 = false;
                if (zd1Var.b.checkSelfPermission("android.permission.CAMERA") == 0) {
                    zd1Var.B();
                    break;
                } else {
                    zd1Var.b.requestPermissions(new String[]{"android.permission.CAMERA"}, org.telegram.messenger.at.n1);
                    break;
                }
        }
    }
}
