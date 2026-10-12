package org.telegram.ui;

import android.view.View;
import android.view.WindowInsets;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.voip.VoIPService;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes3.dex */
public final /* synthetic */ class ki1 implements org.telegram.ui.ActionBar.z1, org.telegram.ui.Components.voip.r1, r0.o, org.telegram.ui.Components.voip.h3 {
    public final /* synthetic */ int a;
    public final /* synthetic */ dj1 b;

    public /* synthetic */ ki1(dj1 dj1Var, int i10) {
        this.a = i10;
        this.b = dj1Var;
    }

    @Override // r0.o
    public r0.l1 Q0(View view, r0.l1 l1Var) {
        WindowInsets g10 = l1Var.g();
        dj1 dj1Var = this.b;
        dj1Var.r0 = g10;
        ((FrameLayout.LayoutParams) dj1Var.j0.getLayoutParams()).bottomMargin = dj1Var.r0.getSystemWindowInsetBottom();
        ((FrameLayout.LayoutParams) dj1Var.e0.getLayoutParams()).bottomMargin = dj1Var.r0.getSystemWindowInsetBottom();
        ((FrameLayout.LayoutParams) dj1Var.H.getLayoutParams()).topMargin = dj1Var.r0.getSystemWindowInsetTop();
        ((FrameLayout.LayoutParams) dj1Var.I.getLayoutParams()).topMargin = dj1Var.r0.getSystemWindowInsetTop();
        ((FrameLayout.LayoutParams) dj1Var.K.getLayoutParams()).topMargin = dj1Var.r0.getSystemWindowInsetTop() + AndroidUtilities.dp(56.0f);
        ((FrameLayout.LayoutParams) dj1Var.X.getLayoutParams()).topMargin = dj1Var.r0.getSystemWindowInsetTop() + AndroidUtilities.dp(135.0f);
        ((FrameLayout.LayoutParams) dj1Var.N.getLayoutParams()).topMargin = dj1Var.r0.getSystemWindowInsetTop() + AndroidUtilities.dp(17.0f);
        ((FrameLayout.LayoutParams) dj1Var.y.getLayoutParams()).topMargin = dj1Var.r0.getSystemWindowInsetTop() + AndroidUtilities.dp(93.0f);
        ((FrameLayout.LayoutParams) dj1Var.O.getLayoutParams()).topMargin = dj1Var.r0.getSystemWindowInsetTop();
        ((FrameLayout.LayoutParams) dj1Var.R.getLayoutParams()).topMargin = dj1Var.r0.getSystemWindowInsetTop() + AndroidUtilities.dp(118.0f);
        ((FrameLayout.LayoutParams) dj1Var.Q.getLayoutParams()).topMargin = dj1Var.r0.getSystemWindowInsetTop() + AndroidUtilities.dp(380.0f);
        ((FrameLayout.LayoutParams) dj1Var.Z.getLayoutParams()).bottomMargin = dj1Var.r0.getSystemWindowInsetBottom();
        ((FrameLayout.LayoutParams) dj1Var.M0.getLayoutParams()).bottomMargin = dj1Var.r0.getSystemWindowInsetBottom();
        dj1Var.Y.setInsets(dj1Var.r0);
        dj1Var.Z.setInsets(dj1Var.r0);
        dj1Var.s.requestLayout();
        wi1 wi1Var = dj1Var.o0;
        if (wi1Var != null) {
            wi1Var.setBottomPadding(dj1Var.r0.getSystemWindowInsetBottom());
        }
        return r0.l1.b;
    }

    @Override // org.telegram.ui.Components.voip.h3
    public void c(org.telegram.ui.Components.voip.i3 i3Var) {
        switch (this.a) {
            case 5:
                VoIPService sharedInstance = VoIPService.getSharedInstance();
                if (sharedInstance != null) {
                    dj1 dj1Var = this.b;
                    AndroidUtilities.cancelRunOnUIThread(dj1Var.S0);
                    dj1Var.R0 = false;
                    boolean isMicMute = sharedInstance.isMicMute();
                    boolean z10 = !isMicMute;
                    if (dj1Var.w0.isTouchExplorationEnabled()) {
                        i3Var.announceForAccessibility(LocaleController.getString(!isMicMute ? R.string.AccDescrVoipMicOff : R.string.AccDescrVoipMicOn));
                    }
                    sharedInstance.setMicMute(z10, false, true);
                    dj1Var.q0 = dj1Var.p0;
                    dj1Var.G();
                    break;
                }
                break;
            default:
                dj1 dj1Var2 = this.b;
                AndroidUtilities.cancelRunOnUIThread(dj1Var2.S0);
                dj1Var2.R0 = false;
                if (dj1Var2.b.checkSelfPermission("android.permission.CAMERA") == 0) {
                    dj1Var2.B();
                    break;
                } else {
                    dj1Var2.b.requestPermissions(new String[]{"android.permission.CAMERA"}, 102);
                    break;
                }
        }
    }

    @Override // org.telegram.ui.ActionBar.z1
    public void g(org.telegram.ui.ActionBar.a2 a2Var, int i10) {
        switch (this.a) {
            case 0:
                vi1 vi1Var = this.b.u0;
                if (vi1Var != null) {
                    vi1Var.b();
                    break;
                }
                break;
            default:
                this.b.u0.b();
                break;
        }
    }
}
