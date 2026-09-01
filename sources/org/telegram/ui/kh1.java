package org.telegram.ui;

import android.view.View;
import android.view.WindowInsets;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.voip.VoIPService;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final /* synthetic */ class kh1 implements org.telegram.ui.ActionBar.c2, org.telegram.ui.Components.voip.s1, r0.o, org.telegram.ui.Components.voip.j3 {
    public final /* synthetic */ int a;
    public final /* synthetic */ ci1 b;

    public /* synthetic */ kh1(ci1 ci1Var, int i10) {
        this.a = i10;
        this.b = ci1Var;
    }

    @Override // r0.o
    public r0.m1 M0(View view, r0.m1 m1Var) {
        WindowInsets g10 = m1Var.g();
        ci1 ci1Var = this.b;
        ci1Var.o0 = g10;
        ((FrameLayout.LayoutParams) ci1Var.g0.getLayoutParams()).bottomMargin = ci1Var.o0.getSystemWindowInsetBottom();
        ((FrameLayout.LayoutParams) ci1Var.b0.getLayoutParams()).bottomMargin = ci1Var.o0.getSystemWindowInsetBottom();
        ((FrameLayout.LayoutParams) ci1Var.E.getLayoutParams()).topMargin = ci1Var.o0.getSystemWindowInsetTop();
        ((FrameLayout.LayoutParams) ci1Var.F.getLayoutParams()).topMargin = ci1Var.o0.getSystemWindowInsetTop();
        ((FrameLayout.LayoutParams) ci1Var.H.getLayoutParams()).topMargin = ci1Var.o0.getSystemWindowInsetTop() + AndroidUtilities.dp(56.0f);
        ((FrameLayout.LayoutParams) ci1Var.U.getLayoutParams()).topMargin = ci1Var.o0.getSystemWindowInsetTop() + AndroidUtilities.dp(135.0f);
        ((FrameLayout.LayoutParams) ci1Var.K.getLayoutParams()).topMargin = ci1Var.o0.getSystemWindowInsetTop() + AndroidUtilities.dp(17.0f);
        ((FrameLayout.LayoutParams) ci1Var.y.getLayoutParams()).topMargin = ci1Var.o0.getSystemWindowInsetTop() + AndroidUtilities.dp(93.0f);
        ((FrameLayout.LayoutParams) ci1Var.L.getLayoutParams()).topMargin = ci1Var.o0.getSystemWindowInsetTop();
        ((FrameLayout.LayoutParams) ci1Var.O.getLayoutParams()).topMargin = ci1Var.o0.getSystemWindowInsetTop() + AndroidUtilities.dp(118.0f);
        ((FrameLayout.LayoutParams) ci1Var.N.getLayoutParams()).topMargin = ci1Var.o0.getSystemWindowInsetTop() + AndroidUtilities.dp(380.0f);
        ((FrameLayout.LayoutParams) ci1Var.W.getLayoutParams()).bottomMargin = ci1Var.o0.getSystemWindowInsetBottom();
        ((FrameLayout.LayoutParams) ci1Var.J0.getLayoutParams()).bottomMargin = ci1Var.o0.getSystemWindowInsetBottom();
        ci1Var.V.setInsets(ci1Var.o0);
        ci1Var.W.setInsets(ci1Var.o0);
        ci1Var.s.requestLayout();
        vh1 vh1Var = ci1Var.l0;
        if (vh1Var != null) {
            vh1Var.setBottomPadding(ci1Var.o0.getSystemWindowInsetBottom());
        }
        return r0.m1.b;
    }

    @Override // org.telegram.ui.Components.voip.j3
    public void d(org.telegram.ui.Components.voip.k3 k3Var) {
        switch (this.a) {
            case 5:
                VoIPService sharedInstance = VoIPService.getSharedInstance();
                if (sharedInstance != null) {
                    ci1 ci1Var = this.b;
                    AndroidUtilities.cancelRunOnUIThread(ci1Var.P0);
                    ci1Var.O0 = false;
                    boolean isMicMute = sharedInstance.isMicMute();
                    boolean z4 = !isMicMute;
                    if (ci1Var.t0.isTouchExplorationEnabled()) {
                        k3Var.announceForAccessibility(LocaleController.getString(!isMicMute ? R.string.AccDescrVoipMicOff : R.string.AccDescrVoipMicOn));
                    }
                    sharedInstance.setMicMute(z4, false, true);
                    ci1Var.n0 = ci1Var.m0;
                    ci1Var.H();
                    break;
                }
                break;
            default:
                ci1.i(this.b);
                break;
        }
    }

    @Override // org.telegram.ui.ActionBar.c2
    public void j(org.telegram.ui.ActionBar.d2 d2Var, int i10) {
        switch (this.a) {
            case 0:
                uh1 uh1Var = this.b.r0;
                if (uh1Var != null) {
                    uh1Var.b();
                    break;
                }
                break;
            default:
                this.b.r0.b();
                break;
        }
    }
}
