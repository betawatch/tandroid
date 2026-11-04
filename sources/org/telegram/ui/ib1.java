package org.telegram.ui;

import android.view.View;
import android.view.WindowInsets;
import android.widget.FrameLayout;
import org.telegram.messenger.voip.VoIPService;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ib1 implements org.telegram.ui.ActionBar.p1, org.telegram.ui.Components.voip.b1, r0.m, org.telegram.ui.Components.voip.o2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ zb1 b;

    public /* synthetic */ ib1(zb1 zb1Var, int i3) {
        this.a = i3;
        this.b = zb1Var;
    }

    @Override // r0.m
    public r0.k1 R0(View view, r0.k1 k1Var) {
        WindowInsets g7 = k1Var.g();
        zb1 zb1Var = this.b;
        zb1Var.s0 = g7;
        ((FrameLayout.LayoutParams) zb1Var.k0.getLayoutParams()).bottomMargin = zb1Var.s0.getSystemWindowInsetBottom();
        ((FrameLayout.LayoutParams) zb1Var.f0.getLayoutParams()).bottomMargin = zb1Var.s0.getSystemWindowInsetBottom();
        ((FrameLayout.LayoutParams) zb1Var.I.getLayoutParams()).topMargin = zb1Var.s0.getSystemWindowInsetTop();
        ((FrameLayout.LayoutParams) zb1Var.J.getLayoutParams()).topMargin = zb1Var.s0.getSystemWindowInsetTop();
        ((FrameLayout.LayoutParams) zb1Var.L.getLayoutParams()).topMargin = zb1Var.s0.getSystemWindowInsetTop() + org.telegram.messenger.g0.L(56.0f);
        ((FrameLayout.LayoutParams) zb1Var.Y.getLayoutParams()).topMargin = zb1Var.s0.getSystemWindowInsetTop() + org.telegram.messenger.g0.L(135.0f);
        ((FrameLayout.LayoutParams) zb1Var.O.getLayoutParams()).topMargin = zb1Var.s0.getSystemWindowInsetTop() + org.telegram.messenger.g0.L(17.0f);
        ((FrameLayout.LayoutParams) zb1Var.E.getLayoutParams()).topMargin = zb1Var.s0.getSystemWindowInsetTop() + org.telegram.messenger.g0.L(93.0f);
        ((FrameLayout.LayoutParams) zb1Var.P.getLayoutParams()).topMargin = zb1Var.s0.getSystemWindowInsetTop();
        ((FrameLayout.LayoutParams) zb1Var.S.getLayoutParams()).topMargin = zb1Var.s0.getSystemWindowInsetTop() + org.telegram.messenger.g0.L(118.0f);
        ((FrameLayout.LayoutParams) zb1Var.R.getLayoutParams()).topMargin = zb1Var.s0.getSystemWindowInsetTop() + org.telegram.messenger.g0.L(380.0f);
        ((FrameLayout.LayoutParams) zb1Var.a0.getLayoutParams()).bottomMargin = zb1Var.s0.getSystemWindowInsetBottom();
        ((FrameLayout.LayoutParams) zb1Var.N0.getLayoutParams()).bottomMargin = zb1Var.s0.getSystemWindowInsetBottom();
        zb1Var.Z.setInsets(zb1Var.s0);
        zb1Var.a0.setInsets(zb1Var.s0);
        zb1Var.s.requestLayout();
        sb1 sb1Var = zb1Var.p0;
        if (sb1Var != null) {
            sb1Var.setBottomPadding(zb1Var.s0.getSystemWindowInsetBottom());
        }
        return r0.k1.b;
    }

    @Override // org.telegram.ui.ActionBar.p1
    public void g(org.telegram.ui.ActionBar.s1 s1Var, int i3) {
        switch (this.a) {
            case 0:
                rb1 rb1Var = this.b.v0;
                if (rb1Var != null) {
                    rb1Var.b();
                    break;
                }
                break;
            default:
                this.b.v0.b();
                break;
        }
    }

    @Override // org.telegram.ui.Components.voip.o2
    public void i(org.telegram.ui.Components.voip.p2 p2Var) {
        int i3 = this.a;
        zb1 zb1Var = this.b;
        switch (i3) {
            case 5:
                VoIPService sharedInstance = VoIPService.getSharedInstance();
                if (sharedInstance != null) {
                    org.telegram.messenger.g0.r(zb1Var.T0);
                    zb1Var.S0 = false;
                    boolean isMicMute = sharedInstance.isMicMute();
                    boolean z10 = !isMicMute;
                    if (zb1Var.x0.isTouchExplorationEnabled()) {
                        p2Var.announceForAccessibility(org.telegram.messenger.bd.M0(!isMicMute ? 2131754729 : 2131754728, null));
                    }
                    sharedInstance.setMicMute(z10, false, true);
                    zb1Var.r0 = zb1Var.q0;
                    zb1Var.G();
                    break;
                }
                break;
            default:
                org.telegram.messenger.g0.r(zb1Var.T0);
                zb1Var.S0 = false;
                if (zb1Var.b.checkSelfPermission("android.permission.CAMERA") == 0) {
                    zb1Var.B();
                    break;
                } else {
                    zb1Var.b.requestPermissions(new String[]{"android.permission.CAMERA"}, org.telegram.messenger.hs.n1);
                    break;
                }
        }
    }
}
