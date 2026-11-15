package org.telegram.ui;

import android.view.View;
import android.view.WindowInsets;
import android.widget.FrameLayout;
import org.telegram.messenger.voip.VoIPService;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final /* synthetic */ class pb1 implements org.telegram.ui.ActionBar.q1, org.telegram.ui.Components.voip.q1, r0.m, org.telegram.ui.Components.voip.d3 {
    public final /* synthetic */ int a;
    public final /* synthetic */ ec1 b;

    public /* synthetic */ pb1(ec1 ec1Var, int i7) {
        this.a = i7;
        this.b = ec1Var;
    }

    @Override // r0.m
    public r0.k1 M0(View view, r0.k1 k1Var) {
        WindowInsets g10 = k1Var.g();
        ec1 ec1Var = this.b;
        ec1Var.r0 = g10;
        ((FrameLayout.LayoutParams) ec1Var.j0.getLayoutParams()).bottomMargin = ec1Var.r0.getSystemWindowInsetBottom();
        ((FrameLayout.LayoutParams) ec1Var.f0.getLayoutParams()).bottomMargin = ec1Var.r0.getSystemWindowInsetBottom();
        ((FrameLayout.LayoutParams) ec1Var.I.getLayoutParams()).topMargin = ec1Var.r0.getSystemWindowInsetTop();
        ((FrameLayout.LayoutParams) ec1Var.J.getLayoutParams()).topMargin = ec1Var.r0.getSystemWindowInsetTop();
        ((FrameLayout.LayoutParams) ec1Var.L.getLayoutParams()).topMargin = ec1Var.r0.getSystemWindowInsetTop() + org.telegram.messenger.g0.L(56.0f);
        ((FrameLayout.LayoutParams) ec1Var.Y.getLayoutParams()).topMargin = ec1Var.r0.getSystemWindowInsetTop() + org.telegram.messenger.g0.L(135.0f);
        ((FrameLayout.LayoutParams) ec1Var.O.getLayoutParams()).topMargin = ec1Var.r0.getSystemWindowInsetTop() + org.telegram.messenger.g0.L(17.0f);
        ((FrameLayout.LayoutParams) ec1Var.E.getLayoutParams()).topMargin = ec1Var.r0.getSystemWindowInsetTop() + org.telegram.messenger.g0.L(93.0f);
        ((FrameLayout.LayoutParams) ec1Var.P.getLayoutParams()).topMargin = ec1Var.r0.getSystemWindowInsetTop();
        ((FrameLayout.LayoutParams) ec1Var.S.getLayoutParams()).topMargin = ec1Var.r0.getSystemWindowInsetTop() + org.telegram.messenger.g0.L(118.0f);
        ((FrameLayout.LayoutParams) ec1Var.R.getLayoutParams()).topMargin = ec1Var.r0.getSystemWindowInsetTop() + org.telegram.messenger.g0.L(380.0f);
        ((FrameLayout.LayoutParams) ec1Var.a0.getLayoutParams()).bottomMargin = ec1Var.r0.getSystemWindowInsetBottom();
        ((FrameLayout.LayoutParams) ec1Var.M0.getLayoutParams()).bottomMargin = ec1Var.r0.getSystemWindowInsetBottom();
        ec1Var.Z.setInsets(ec1Var.r0);
        ec1Var.a0.setInsets(ec1Var.r0);
        ec1Var.s.requestLayout();
        yb1 yb1Var = ec1Var.o0;
        if (yb1Var != null) {
            yb1Var.setBottomPadding(ec1Var.r0.getSystemWindowInsetBottom());
        }
        return r0.k1.b;
    }

    @Override // org.telegram.ui.Components.voip.d3
    public void d(org.telegram.ui.Components.voip.e3 e3Var) {
        int i7 = this.a;
        ec1 ec1Var = this.b;
        switch (i7) {
            case 4:
                VoIPService sharedInstance = VoIPService.getSharedInstance();
                if (sharedInstance != null) {
                    org.telegram.messenger.g0.r(ec1Var.S0);
                    ec1Var.R0 = false;
                    boolean isMicMute = sharedInstance.isMicMute();
                    boolean z10 = !isMicMute;
                    if (ec1Var.w0.isTouchExplorationEnabled()) {
                        e3Var.announceForAccessibility(org.telegram.messenger.hd.M0(!isMicMute ? 2131754729 : 2131754728, null));
                    }
                    sharedInstance.setMicMute(z10, false, true);
                    ec1Var.q0 = ec1Var.p0;
                    ec1Var.y();
                    break;
                }
                break;
            default:
                org.telegram.messenger.g0.r(ec1Var.S0);
                ec1Var.R0 = false;
                if (ec1Var.b.checkSelfPermission("android.permission.CAMERA") == 0) {
                    ec1Var.t();
                    break;
                } else {
                    ec1Var.b.requestPermissions(new String[]{"android.permission.CAMERA"}, org.telegram.messenger.ns.n1);
                    break;
                }
        }
    }

    @Override // org.telegram.ui.ActionBar.q1
    public void h(org.telegram.ui.ActionBar.t1 t1Var, int i7) {
        this.b.u0.b();
    }
}
