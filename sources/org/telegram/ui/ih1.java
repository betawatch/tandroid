package org.telegram.ui;

import android.view.View;
import android.view.WindowInsets;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.voip.VoIPService;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ih1 implements org.telegram.ui.ActionBar.c2, org.telegram.ui.Components.voip.r1, r0.o, org.telegram.ui.Components.voip.i3 {
    public final /* synthetic */ int a;
    public final /* synthetic */ ai1 b;

    public /* synthetic */ ih1(ai1 ai1Var, int i10) {
        this.a = i10;
        this.b = ai1Var;
    }

    @Override // r0.o
    public r0.m1 N0(View view, r0.m1 m1Var) {
        WindowInsets g10 = m1Var.g();
        ai1 ai1Var = this.b;
        ai1Var.o0 = g10;
        ((FrameLayout.LayoutParams) ai1Var.g0.getLayoutParams()).bottomMargin = ai1Var.o0.getSystemWindowInsetBottom();
        ((FrameLayout.LayoutParams) ai1Var.b0.getLayoutParams()).bottomMargin = ai1Var.o0.getSystemWindowInsetBottom();
        ((FrameLayout.LayoutParams) ai1Var.E.getLayoutParams()).topMargin = ai1Var.o0.getSystemWindowInsetTop();
        ((FrameLayout.LayoutParams) ai1Var.F.getLayoutParams()).topMargin = ai1Var.o0.getSystemWindowInsetTop();
        ((FrameLayout.LayoutParams) ai1Var.H.getLayoutParams()).topMargin = ai1Var.o0.getSystemWindowInsetTop() + AndroidUtilities.dp(56.0f);
        ((FrameLayout.LayoutParams) ai1Var.U.getLayoutParams()).topMargin = ai1Var.o0.getSystemWindowInsetTop() + AndroidUtilities.dp(135.0f);
        ((FrameLayout.LayoutParams) ai1Var.K.getLayoutParams()).topMargin = ai1Var.o0.getSystemWindowInsetTop() + AndroidUtilities.dp(17.0f);
        ((FrameLayout.LayoutParams) ai1Var.y.getLayoutParams()).topMargin = ai1Var.o0.getSystemWindowInsetTop() + AndroidUtilities.dp(93.0f);
        ((FrameLayout.LayoutParams) ai1Var.L.getLayoutParams()).topMargin = ai1Var.o0.getSystemWindowInsetTop();
        ((FrameLayout.LayoutParams) ai1Var.O.getLayoutParams()).topMargin = ai1Var.o0.getSystemWindowInsetTop() + AndroidUtilities.dp(118.0f);
        ((FrameLayout.LayoutParams) ai1Var.N.getLayoutParams()).topMargin = ai1Var.o0.getSystemWindowInsetTop() + AndroidUtilities.dp(380.0f);
        ((FrameLayout.LayoutParams) ai1Var.W.getLayoutParams()).bottomMargin = ai1Var.o0.getSystemWindowInsetBottom();
        ((FrameLayout.LayoutParams) ai1Var.J0.getLayoutParams()).bottomMargin = ai1Var.o0.getSystemWindowInsetBottom();
        ai1Var.V.setInsets(ai1Var.o0);
        ai1Var.W.setInsets(ai1Var.o0);
        ai1Var.s.requestLayout();
        th1 th1Var = ai1Var.l0;
        if (th1Var != null) {
            th1Var.setBottomPadding(ai1Var.o0.getSystemWindowInsetBottom());
        }
        return r0.m1.b;
    }

    @Override // org.telegram.ui.Components.voip.i3
    public void d(org.telegram.ui.Components.voip.j3 j3Var) {
        switch (this.a) {
            case 5:
                VoIPService sharedInstance = VoIPService.getSharedInstance();
                if (sharedInstance != null) {
                    ai1 ai1Var = this.b;
                    AndroidUtilities.cancelRunOnUIThread(ai1Var.P0);
                    ai1Var.O0 = false;
                    boolean isMicMute = sharedInstance.isMicMute();
                    boolean z4 = !isMicMute;
                    if (ai1Var.t0.isTouchExplorationEnabled()) {
                        j3Var.announceForAccessibility(LocaleController.getString(!isMicMute ? R.string.AccDescrVoipMicOff : R.string.AccDescrVoipMicOn));
                    }
                    sharedInstance.setMicMute(z4, false, true);
                    ai1Var.n0 = ai1Var.m0;
                    ai1Var.H();
                    break;
                }
                break;
            default:
                ai1.i(this.b);
                break;
        }
    }

    @Override // org.telegram.ui.ActionBar.c2
    public void i(org.telegram.ui.ActionBar.d2 d2Var, int i10) {
        switch (this.a) {
            case 0:
                sh1 sh1Var = this.b.r0;
                if (sh1Var != null) {
                    sh1Var.b();
                    break;
                }
                break;
            default:
                this.b.r0.b();
                break;
        }
    }
}
