package org.telegram.ui;

import android.view.View;
import android.view.WindowInsets;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.voip.VoIPService;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ki1 implements org.telegram.ui.ActionBar.z1, org.telegram.ui.Components.voip.r1, r0.n, org.telegram.ui.Components.voip.h3 {
    public final /* synthetic */ int a;
    public final /* synthetic */ cj1 b;

    public /* synthetic */ ki1(cj1 cj1Var, int i10) {
        this.a = i10;
        this.b = cj1Var;
    }

    @Override // r0.n
    public r0.l1 Q0(View view, r0.l1 l1Var) {
        WindowInsets g10 = l1Var.g();
        cj1 cj1Var = this.b;
        cj1Var.r0 = g10;
        ((FrameLayout.LayoutParams) cj1Var.j0.getLayoutParams()).bottomMargin = cj1Var.r0.getSystemWindowInsetBottom();
        ((FrameLayout.LayoutParams) cj1Var.e0.getLayoutParams()).bottomMargin = cj1Var.r0.getSystemWindowInsetBottom();
        ((FrameLayout.LayoutParams) cj1Var.H.getLayoutParams()).topMargin = cj1Var.r0.getSystemWindowInsetTop();
        ((FrameLayout.LayoutParams) cj1Var.I.getLayoutParams()).topMargin = cj1Var.r0.getSystemWindowInsetTop();
        ((FrameLayout.LayoutParams) cj1Var.K.getLayoutParams()).topMargin = cj1Var.r0.getSystemWindowInsetTop() + AndroidUtilities.dp(56.0f);
        ((FrameLayout.LayoutParams) cj1Var.X.getLayoutParams()).topMargin = cj1Var.r0.getSystemWindowInsetTop() + AndroidUtilities.dp(135.0f);
        ((FrameLayout.LayoutParams) cj1Var.N.getLayoutParams()).topMargin = cj1Var.r0.getSystemWindowInsetTop() + AndroidUtilities.dp(17.0f);
        ((FrameLayout.LayoutParams) cj1Var.y.getLayoutParams()).topMargin = cj1Var.r0.getSystemWindowInsetTop() + AndroidUtilities.dp(93.0f);
        ((FrameLayout.LayoutParams) cj1Var.O.getLayoutParams()).topMargin = cj1Var.r0.getSystemWindowInsetTop();
        ((FrameLayout.LayoutParams) cj1Var.R.getLayoutParams()).topMargin = cj1Var.r0.getSystemWindowInsetTop() + AndroidUtilities.dp(118.0f);
        ((FrameLayout.LayoutParams) cj1Var.Q.getLayoutParams()).topMargin = cj1Var.r0.getSystemWindowInsetTop() + AndroidUtilities.dp(380.0f);
        ((FrameLayout.LayoutParams) cj1Var.Z.getLayoutParams()).bottomMargin = cj1Var.r0.getSystemWindowInsetBottom();
        ((FrameLayout.LayoutParams) cj1Var.M0.getLayoutParams()).bottomMargin = cj1Var.r0.getSystemWindowInsetBottom();
        cj1Var.Y.setInsets(cj1Var.r0);
        cj1Var.Z.setInsets(cj1Var.r0);
        cj1Var.s.requestLayout();
        vi1 vi1Var = cj1Var.o0;
        if (vi1Var != null) {
            vi1Var.setBottomPadding(cj1Var.r0.getSystemWindowInsetBottom());
        }
        return r0.l1.b;
    }

    @Override // org.telegram.ui.Components.voip.h3
    public void c(org.telegram.ui.Components.voip.i3 i3Var) {
        switch (this.a) {
            case 5:
                VoIPService sharedInstance = VoIPService.getSharedInstance();
                if (sharedInstance != null) {
                    cj1 cj1Var = this.b;
                    AndroidUtilities.cancelRunOnUIThread(cj1Var.S0);
                    cj1Var.R0 = false;
                    boolean isMicMute = sharedInstance.isMicMute();
                    boolean z10 = !isMicMute;
                    if (cj1Var.w0.isTouchExplorationEnabled()) {
                        i3Var.announceForAccessibility(LocaleController.getString(!isMicMute ? R.string.AccDescrVoipMicOff : R.string.AccDescrVoipMicOn));
                    }
                    sharedInstance.setMicMute(z10, false, true);
                    cj1Var.q0 = cj1Var.p0;
                    cj1Var.G();
                    break;
                }
                break;
            default:
                cj1 cj1Var2 = this.b;
                AndroidUtilities.cancelRunOnUIThread(cj1Var2.S0);
                cj1Var2.R0 = false;
                if (cj1Var2.b.checkSelfPermission("android.permission.CAMERA") == 0) {
                    cj1Var2.B();
                    break;
                } else {
                    cj1Var2.b.requestPermissions(new String[]{"android.permission.CAMERA"}, 102);
                    break;
                }
        }
    }

    @Override // org.telegram.ui.ActionBar.z1
    public void g(org.telegram.ui.ActionBar.a2 a2Var, int i10) {
        switch (this.a) {
            case 0:
                ui1 ui1Var = this.b.u0;
                if (ui1Var != null) {
                    ui1Var.b();
                    break;
                }
                break;
            default:
                this.b.u0.b();
                break;
        }
    }
}
