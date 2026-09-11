package org.telegram.ui;

import android.view.View;
import android.view.WindowInsets;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.voip.VoIPService;

/* compiled from: r8-map-id-1181a9f210c4244598aa36bb39e1460f3842f305ed8c0c95af755ee091fedd7d */
/* loaded from: classes3.dex */
public final /* synthetic */ class ci1 implements org.telegram.ui.ActionBar.a2, org.telegram.ui.Components.voip.r1, r0.n, org.telegram.ui.Components.voip.g3 {
    public final /* synthetic */ int a;
    public final /* synthetic */ ui1 b;

    public /* synthetic */ ci1(ui1 ui1Var, int i10) {
        this.a = i10;
        this.b = ui1Var;
    }

    @Override // r0.n
    public r0.l1 T0(View view, r0.l1 l1Var) {
        WindowInsets g10 = l1Var.g();
        ui1 ui1Var = this.b;
        ui1Var.r0 = g10;
        ((FrameLayout.LayoutParams) ui1Var.j0.getLayoutParams()).bottomMargin = ui1Var.r0.getSystemWindowInsetBottom();
        ((FrameLayout.LayoutParams) ui1Var.e0.getLayoutParams()).bottomMargin = ui1Var.r0.getSystemWindowInsetBottom();
        ((FrameLayout.LayoutParams) ui1Var.H.getLayoutParams()).topMargin = ui1Var.r0.getSystemWindowInsetTop();
        ((FrameLayout.LayoutParams) ui1Var.I.getLayoutParams()).topMargin = ui1Var.r0.getSystemWindowInsetTop();
        ((FrameLayout.LayoutParams) ui1Var.K.getLayoutParams()).topMargin = ui1Var.r0.getSystemWindowInsetTop() + AndroidUtilities.dp(56.0f);
        ((FrameLayout.LayoutParams) ui1Var.X.getLayoutParams()).topMargin = ui1Var.r0.getSystemWindowInsetTop() + AndroidUtilities.dp(135.0f);
        ((FrameLayout.LayoutParams) ui1Var.N.getLayoutParams()).topMargin = ui1Var.r0.getSystemWindowInsetTop() + AndroidUtilities.dp(17.0f);
        ((FrameLayout.LayoutParams) ui1Var.y.getLayoutParams()).topMargin = ui1Var.r0.getSystemWindowInsetTop() + AndroidUtilities.dp(93.0f);
        ((FrameLayout.LayoutParams) ui1Var.O.getLayoutParams()).topMargin = ui1Var.r0.getSystemWindowInsetTop();
        ((FrameLayout.LayoutParams) ui1Var.R.getLayoutParams()).topMargin = ui1Var.r0.getSystemWindowInsetTop() + AndroidUtilities.dp(118.0f);
        ((FrameLayout.LayoutParams) ui1Var.Q.getLayoutParams()).topMargin = ui1Var.r0.getSystemWindowInsetTop() + AndroidUtilities.dp(380.0f);
        ((FrameLayout.LayoutParams) ui1Var.Z.getLayoutParams()).bottomMargin = ui1Var.r0.getSystemWindowInsetBottom();
        ((FrameLayout.LayoutParams) ui1Var.M0.getLayoutParams()).bottomMargin = ui1Var.r0.getSystemWindowInsetBottom();
        ui1Var.Y.setInsets(ui1Var.r0);
        ui1Var.Z.setInsets(ui1Var.r0);
        ui1Var.s.requestLayout();
        ni1 ni1Var = ui1Var.o0;
        if (ni1Var != null) {
            ni1Var.setBottomPadding(ui1Var.r0.getSystemWindowInsetBottom());
        }
        return r0.l1.b;
    }

    @Override // org.telegram.ui.Components.voip.g3
    public void c(org.telegram.ui.Components.voip.h3 h3Var) {
        switch (this.a) {
            case 5:
                VoIPService sharedInstance = VoIPService.getSharedInstance();
                if (sharedInstance != null) {
                    ui1 ui1Var = this.b;
                    AndroidUtilities.cancelRunOnUIThread(ui1Var.S0);
                    ui1Var.R0 = false;
                    boolean isMicMute = sharedInstance.isMicMute();
                    boolean z10 = !isMicMute;
                    if (ui1Var.w0.isTouchExplorationEnabled()) {
                        h3Var.announceForAccessibility(LocaleController.getString(!isMicMute ? R.string.AccDescrVoipMicOff : R.string.AccDescrVoipMicOn));
                    }
                    sharedInstance.setMicMute(z10, false, true);
                    ui1Var.q0 = ui1Var.p0;
                    ui1Var.H();
                    break;
                }
                break;
            default:
                ui1.i(this.b);
                break;
        }
    }

    @Override // org.telegram.ui.ActionBar.a2
    public void g(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        switch (this.a) {
            case 0:
                mi1 mi1Var = this.b.u0;
                if (mi1Var != null) {
                    mi1Var.b();
                    break;
                }
                break;
            default:
                this.b.u0.b();
                break;
        }
    }
}
