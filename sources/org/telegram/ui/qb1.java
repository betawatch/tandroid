package org.telegram.ui;

import android.view.View;
import android.view.WindowInsets;
import android.widget.FrameLayout;
import org.telegram.messenger.voip.VoIPService;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes3.dex */
public final /* synthetic */ class qb1 implements org.telegram.ui.ActionBar.r1, org.telegram.ui.Components.voip.m1, r0.m, org.telegram.ui.Components.voip.z2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ fc1 b;

    public /* synthetic */ qb1(fc1 fc1Var, int i7) {
        this.a = i7;
        this.b = fc1Var;
    }

    @Override // r0.m
    public r0.k1 S0(View view, r0.k1 k1Var) {
        WindowInsets g10 = k1Var.g();
        fc1 fc1Var = this.b;
        fc1Var.q0 = g10;
        ((FrameLayout.LayoutParams) fc1Var.i0.getLayoutParams()).bottomMargin = fc1Var.q0.getSystemWindowInsetBottom();
        ((FrameLayout.LayoutParams) fc1Var.e0.getLayoutParams()).bottomMargin = fc1Var.q0.getSystemWindowInsetBottom();
        ((FrameLayout.LayoutParams) fc1Var.H.getLayoutParams()).topMargin = fc1Var.q0.getSystemWindowInsetTop();
        ((FrameLayout.LayoutParams) fc1Var.I.getLayoutParams()).topMargin = fc1Var.q0.getSystemWindowInsetTop();
        ((FrameLayout.LayoutParams) fc1Var.K.getLayoutParams()).topMargin = fc1Var.q0.getSystemWindowInsetTop() + org.telegram.messenger.g0.L(56.0f);
        ((FrameLayout.LayoutParams) fc1Var.X.getLayoutParams()).topMargin = fc1Var.q0.getSystemWindowInsetTop() + org.telegram.messenger.g0.L(135.0f);
        ((FrameLayout.LayoutParams) fc1Var.N.getLayoutParams()).topMargin = fc1Var.q0.getSystemWindowInsetTop() + org.telegram.messenger.g0.L(17.0f);
        ((FrameLayout.LayoutParams) fc1Var.D.getLayoutParams()).topMargin = fc1Var.q0.getSystemWindowInsetTop() + org.telegram.messenger.g0.L(93.0f);
        ((FrameLayout.LayoutParams) fc1Var.O.getLayoutParams()).topMargin = fc1Var.q0.getSystemWindowInsetTop();
        ((FrameLayout.LayoutParams) fc1Var.R.getLayoutParams()).topMargin = fc1Var.q0.getSystemWindowInsetTop() + org.telegram.messenger.g0.L(118.0f);
        ((FrameLayout.LayoutParams) fc1Var.Q.getLayoutParams()).topMargin = fc1Var.q0.getSystemWindowInsetTop() + org.telegram.messenger.g0.L(380.0f);
        ((FrameLayout.LayoutParams) fc1Var.Z.getLayoutParams()).bottomMargin = fc1Var.q0.getSystemWindowInsetBottom();
        ((FrameLayout.LayoutParams) fc1Var.L0.getLayoutParams()).bottomMargin = fc1Var.q0.getSystemWindowInsetBottom();
        fc1Var.Y.setInsets(fc1Var.q0);
        fc1Var.Z.setInsets(fc1Var.q0);
        fc1Var.s.requestLayout();
        zb1 zb1Var = fc1Var.n0;
        if (zb1Var != null) {
            zb1Var.setBottomPadding(fc1Var.q0.getSystemWindowInsetBottom());
        }
        return r0.k1.b;
    }

    @Override // org.telegram.ui.Components.voip.z2
    public void d(org.telegram.ui.Components.voip.a3 a3Var) {
        int i7 = this.a;
        fc1 fc1Var = this.b;
        switch (i7) {
            case 4:
                VoIPService sharedInstance = VoIPService.getSharedInstance();
                if (sharedInstance != null) {
                    org.telegram.messenger.g0.r(fc1Var.R0);
                    fc1Var.Q0 = false;
                    boolean isMicMute = sharedInstance.isMicMute();
                    boolean z9 = !isMicMute;
                    if (fc1Var.v0.isTouchExplorationEnabled()) {
                        a3Var.announceForAccessibility(org.telegram.messenger.id.M0(!isMicMute ? 2131754729 : 2131754728, null));
                    }
                    sharedInstance.setMicMute(z9, false, true);
                    fc1Var.p0 = fc1Var.o0;
                    fc1Var.y();
                    break;
                }
                break;
            default:
                org.telegram.messenger.g0.r(fc1Var.R0);
                fc1Var.Q0 = false;
                if (fc1Var.b.checkSelfPermission("android.permission.CAMERA") == 0) {
                    fc1Var.t();
                    break;
                } else {
                    fc1Var.b.requestPermissions(new String[]{"android.permission.CAMERA"}, org.telegram.messenger.qs.n1);
                    break;
                }
        }
    }

    @Override // org.telegram.ui.ActionBar.r1
    public void g(org.telegram.ui.ActionBar.u1 u1Var, int i7) {
        this.b.t0.b();
    }
}
