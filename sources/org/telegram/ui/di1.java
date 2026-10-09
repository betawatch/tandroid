package org.telegram.ui;

import android.view.View;
import android.view.WindowInsets;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.voip.VoIPService;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final /* synthetic */ class di1 implements org.telegram.ui.ActionBar.a2, org.telegram.ui.Components.voip.t1, r0.n, org.telegram.ui.Components.voip.i3 {
    public final /* synthetic */ int a;
    public final /* synthetic */ wi1 b;

    public /* synthetic */ di1(wi1 wi1Var, int i10) {
        this.a = i10;
        this.b = wi1Var;
    }

    @Override // r0.n
    public r0.k1 M0(View view, r0.k1 k1Var) {
        WindowInsets g10 = k1Var.g();
        wi1 wi1Var = this.b;
        wi1Var.r0 = g10;
        ((FrameLayout.LayoutParams) wi1Var.j0.getLayoutParams()).bottomMargin = wi1Var.r0.getSystemWindowInsetBottom();
        ((FrameLayout.LayoutParams) wi1Var.e0.getLayoutParams()).bottomMargin = wi1Var.r0.getSystemWindowInsetBottom();
        ((FrameLayout.LayoutParams) wi1Var.H.getLayoutParams()).topMargin = wi1Var.r0.getSystemWindowInsetTop();
        ((FrameLayout.LayoutParams) wi1Var.I.getLayoutParams()).topMargin = wi1Var.r0.getSystemWindowInsetTop();
        ((FrameLayout.LayoutParams) wi1Var.K.getLayoutParams()).topMargin = wi1Var.r0.getSystemWindowInsetTop() + AndroidUtilities.dp(56.0f);
        ((FrameLayout.LayoutParams) wi1Var.X.getLayoutParams()).topMargin = wi1Var.r0.getSystemWindowInsetTop() + AndroidUtilities.dp(135.0f);
        ((FrameLayout.LayoutParams) wi1Var.N.getLayoutParams()).topMargin = wi1Var.r0.getSystemWindowInsetTop() + AndroidUtilities.dp(17.0f);
        ((FrameLayout.LayoutParams) wi1Var.y.getLayoutParams()).topMargin = wi1Var.r0.getSystemWindowInsetTop() + AndroidUtilities.dp(93.0f);
        ((FrameLayout.LayoutParams) wi1Var.O.getLayoutParams()).topMargin = wi1Var.r0.getSystemWindowInsetTop();
        ((FrameLayout.LayoutParams) wi1Var.R.getLayoutParams()).topMargin = wi1Var.r0.getSystemWindowInsetTop() + AndroidUtilities.dp(118.0f);
        ((FrameLayout.LayoutParams) wi1Var.Q.getLayoutParams()).topMargin = wi1Var.r0.getSystemWindowInsetTop() + AndroidUtilities.dp(380.0f);
        ((FrameLayout.LayoutParams) wi1Var.Z.getLayoutParams()).bottomMargin = wi1Var.r0.getSystemWindowInsetBottom();
        ((FrameLayout.LayoutParams) wi1Var.M0.getLayoutParams()).bottomMargin = wi1Var.r0.getSystemWindowInsetBottom();
        wi1Var.Y.setInsets(wi1Var.r0);
        wi1Var.Z.setInsets(wi1Var.r0);
        wi1Var.s.requestLayout();
        pi1 pi1Var = wi1Var.o0;
        if (pi1Var != null) {
            pi1Var.setBottomPadding(wi1Var.r0.getSystemWindowInsetBottom());
        }
        return r0.k1.b;
    }

    @Override // org.telegram.ui.ActionBar.a2
    public void f(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        switch (this.a) {
            case 0:
                oi1 oi1Var = this.b.u0;
                if (oi1Var != null) {
                    oi1Var.b();
                    break;
                }
                break;
            default:
                this.b.u0.b();
                break;
        }
    }

    @Override // org.telegram.ui.Components.voip.i3
    public void g(org.telegram.ui.Components.voip.j3 j3Var) {
        switch (this.a) {
            case 5:
                VoIPService sharedInstance = VoIPService.getSharedInstance();
                if (sharedInstance != null) {
                    wi1 wi1Var = this.b;
                    AndroidUtilities.cancelRunOnUIThread(wi1Var.S0);
                    wi1Var.R0 = false;
                    boolean isMicMute = sharedInstance.isMicMute();
                    boolean z10 = !isMicMute;
                    if (wi1Var.w0.isTouchExplorationEnabled()) {
                        j3Var.announceForAccessibility(LocaleController.getString(!isMicMute ? R.string.AccDescrVoipMicOff : R.string.AccDescrVoipMicOn));
                    }
                    sharedInstance.setMicMute(z10, false, true);
                    wi1Var.q0 = wi1Var.p0;
                    wi1Var.G();
                    break;
                }
                break;
            default:
                wi1 wi1Var2 = this.b;
                AndroidUtilities.cancelRunOnUIThread(wi1Var2.S0);
                wi1Var2.R0 = false;
                if (wi1Var2.b.checkSelfPermission("android.permission.CAMERA") == 0) {
                    wi1Var2.B();
                    break;
                } else {
                    wi1Var2.b.requestPermissions(new String[]{"android.permission.CAMERA"}, 102);
                    break;
                }
        }
    }
}
