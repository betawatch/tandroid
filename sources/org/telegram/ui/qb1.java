package org.telegram.ui;

import android.view.View;
import android.view.WindowInsets;
import android.widget.FrameLayout;
import org.telegram.messenger.voip.VoIPService;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final /* synthetic */ class qb1 implements org.telegram.ui.ActionBar.q1, org.telegram.ui.Components.voip.q1, r0.m, org.telegram.ui.Components.voip.d3 {
    public final /* synthetic */ int a;
    public final /* synthetic */ fc1 b;

    public /* synthetic */ qb1(fc1 fc1Var, int i7) {
        this.a = i7;
        this.b = fc1Var;
    }

    @Override // org.telegram.ui.Components.voip.d3
    public void d(org.telegram.ui.Components.voip.e3 e3Var) {
        int i7 = this.a;
        fc1 fc1Var = this.b;
        switch (i7) {
            case 4:
                VoIPService sharedInstance = VoIPService.getSharedInstance();
                if (sharedInstance != null) {
                    org.telegram.messenger.g0.r(fc1Var.S0);
                    fc1Var.R0 = false;
                    boolean isMicMute = sharedInstance.isMicMute();
                    boolean z10 = !isMicMute;
                    if (fc1Var.w0.isTouchExplorationEnabled()) {
                        e3Var.announceForAccessibility(org.telegram.messenger.gd.N0(!isMicMute ? 2131754728 : 2131754727, null));
                    }
                    sharedInstance.setMicMute(z10, false, true);
                    fc1Var.q0 = fc1Var.p0;
                    fc1Var.y();
                    break;
                }
                break;
            default:
                org.telegram.messenger.g0.r(fc1Var.S0);
                fc1Var.R0 = false;
                if (fc1Var.b.checkSelfPermission("android.permission.CAMERA") == 0) {
                    fc1Var.t();
                    break;
                } else {
                    fc1Var.b.requestPermissions(new String[]{"android.permission.CAMERA"}, org.telegram.messenger.ks.n1);
                    break;
                }
        }
    }

    @Override // org.telegram.ui.ActionBar.q1
    public void i(org.telegram.ui.ActionBar.t1 t1Var, int i7) {
        this.b.u0.b();
    }

    @Override // r0.m
    public r0.l1 l1(View view, r0.l1 l1Var) {
        WindowInsets g10 = l1Var.g();
        fc1 fc1Var = this.b;
        fc1Var.r0 = g10;
        ((FrameLayout.LayoutParams) fc1Var.j0.getLayoutParams()).bottomMargin = fc1Var.r0.getSystemWindowInsetBottom();
        ((FrameLayout.LayoutParams) fc1Var.f0.getLayoutParams()).bottomMargin = fc1Var.r0.getSystemWindowInsetBottom();
        ((FrameLayout.LayoutParams) fc1Var.I.getLayoutParams()).topMargin = fc1Var.r0.getSystemWindowInsetTop();
        ((FrameLayout.LayoutParams) fc1Var.J.getLayoutParams()).topMargin = fc1Var.r0.getSystemWindowInsetTop();
        ((FrameLayout.LayoutParams) fc1Var.L.getLayoutParams()).topMargin = fc1Var.r0.getSystemWindowInsetTop() + org.telegram.messenger.g0.L(56.0f);
        ((FrameLayout.LayoutParams) fc1Var.Y.getLayoutParams()).topMargin = fc1Var.r0.getSystemWindowInsetTop() + org.telegram.messenger.g0.L(135.0f);
        ((FrameLayout.LayoutParams) fc1Var.O.getLayoutParams()).topMargin = fc1Var.r0.getSystemWindowInsetTop() + org.telegram.messenger.g0.L(17.0f);
        ((FrameLayout.LayoutParams) fc1Var.E.getLayoutParams()).topMargin = fc1Var.r0.getSystemWindowInsetTop() + org.telegram.messenger.g0.L(93.0f);
        ((FrameLayout.LayoutParams) fc1Var.P.getLayoutParams()).topMargin = fc1Var.r0.getSystemWindowInsetTop();
        ((FrameLayout.LayoutParams) fc1Var.S.getLayoutParams()).topMargin = fc1Var.r0.getSystemWindowInsetTop() + org.telegram.messenger.g0.L(118.0f);
        ((FrameLayout.LayoutParams) fc1Var.R.getLayoutParams()).topMargin = fc1Var.r0.getSystemWindowInsetTop() + org.telegram.messenger.g0.L(380.0f);
        ((FrameLayout.LayoutParams) fc1Var.a0.getLayoutParams()).bottomMargin = fc1Var.r0.getSystemWindowInsetBottom();
        ((FrameLayout.LayoutParams) fc1Var.M0.getLayoutParams()).bottomMargin = fc1Var.r0.getSystemWindowInsetBottom();
        fc1Var.Z.setInsets(fc1Var.r0);
        fc1Var.a0.setInsets(fc1Var.r0);
        fc1Var.s.requestLayout();
        zb1 zb1Var = fc1Var.o0;
        if (zb1Var != null) {
            zb1Var.setBottomPadding(fc1Var.r0.getSystemWindowInsetBottom());
        }
        return r0.l1.b;
    }
}
