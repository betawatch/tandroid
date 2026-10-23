package org.telegram.ui;

import android.view.View;
import android.view.WindowInsets;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.voip.VoIPService;

/* compiled from: r8-map-id-5c4d11c5a4a3c3963e49de090c9ebed761f6fe8b7d1fb1bb05822f03003d35b5 */
/* loaded from: classes3.dex */
public final /* synthetic */ class pg1 implements org.telegram.ui.ActionBar.a2, org.telegram.ui.Components.voip.r1, r0.n, org.telegram.ui.Components.voip.g3 {
    public final /* synthetic */ int a;
    public final /* synthetic */ hh1 b;

    public /* synthetic */ pg1(hh1 hh1Var, int i10) {
        this.a = i10;
        this.b = hh1Var;
    }

    @Override // r0.n
    public r0.k1 B0(View view, r0.k1 k1Var) {
        WindowInsets g10 = k1Var.g();
        hh1 hh1Var = this.b;
        hh1Var.r0 = g10;
        ((FrameLayout.LayoutParams) hh1Var.j0.getLayoutParams()).bottomMargin = hh1Var.r0.getSystemWindowInsetBottom();
        ((FrameLayout.LayoutParams) hh1Var.e0.getLayoutParams()).bottomMargin = hh1Var.r0.getSystemWindowInsetBottom();
        ((FrameLayout.LayoutParams) hh1Var.H.getLayoutParams()).topMargin = hh1Var.r0.getSystemWindowInsetTop();
        ((FrameLayout.LayoutParams) hh1Var.I.getLayoutParams()).topMargin = hh1Var.r0.getSystemWindowInsetTop();
        ((FrameLayout.LayoutParams) hh1Var.K.getLayoutParams()).topMargin = hh1Var.r0.getSystemWindowInsetTop() + AndroidUtilities.dp(56.0f);
        ((FrameLayout.LayoutParams) hh1Var.X.getLayoutParams()).topMargin = hh1Var.r0.getSystemWindowInsetTop() + AndroidUtilities.dp(135.0f);
        ((FrameLayout.LayoutParams) hh1Var.N.getLayoutParams()).topMargin = hh1Var.r0.getSystemWindowInsetTop() + AndroidUtilities.dp(17.0f);
        ((FrameLayout.LayoutParams) hh1Var.y.getLayoutParams()).topMargin = hh1Var.r0.getSystemWindowInsetTop() + AndroidUtilities.dp(93.0f);
        ((FrameLayout.LayoutParams) hh1Var.O.getLayoutParams()).topMargin = hh1Var.r0.getSystemWindowInsetTop();
        ((FrameLayout.LayoutParams) hh1Var.R.getLayoutParams()).topMargin = hh1Var.r0.getSystemWindowInsetTop() + AndroidUtilities.dp(118.0f);
        ((FrameLayout.LayoutParams) hh1Var.Q.getLayoutParams()).topMargin = hh1Var.r0.getSystemWindowInsetTop() + AndroidUtilities.dp(380.0f);
        ((FrameLayout.LayoutParams) hh1Var.Z.getLayoutParams()).bottomMargin = hh1Var.r0.getSystemWindowInsetBottom();
        ((FrameLayout.LayoutParams) hh1Var.M0.getLayoutParams()).bottomMargin = hh1Var.r0.getSystemWindowInsetBottom();
        hh1Var.Y.setInsets(hh1Var.r0);
        hh1Var.Z.setInsets(hh1Var.r0);
        hh1Var.s.requestLayout();
        ah1 ah1Var = hh1Var.o0;
        if (ah1Var != null) {
            ah1Var.setBottomPadding(hh1Var.r0.getSystemWindowInsetBottom());
        }
        return r0.k1.b;
    }

    @Override // org.telegram.ui.Components.voip.g3
    public void c(org.telegram.ui.Components.voip.h3 h3Var) {
        switch (this.a) {
            case 5:
                VoIPService sharedInstance = VoIPService.getSharedInstance();
                if (sharedInstance != null) {
                    hh1 hh1Var = this.b;
                    AndroidUtilities.cancelRunOnUIThread(hh1Var.S0);
                    hh1Var.R0 = false;
                    boolean isMicMute = sharedInstance.isMicMute();
                    boolean z10 = !isMicMute;
                    if (hh1Var.w0.isTouchExplorationEnabled()) {
                        h3Var.announceForAccessibility(LocaleController.getString(!isMicMute ? R.string.AccDescrVoipMicOff : R.string.AccDescrVoipMicOn));
                    }
                    sharedInstance.setMicMute(z10, false, true);
                    hh1Var.q0 = hh1Var.p0;
                    hh1Var.G();
                    break;
                }
                break;
            default:
                hh1 hh1Var2 = this.b;
                AndroidUtilities.cancelRunOnUIThread(hh1Var2.S0);
                hh1Var2.R0 = false;
                if (hh1Var2.b.checkSelfPermission("android.permission.CAMERA") == 0) {
                    hh1Var2.B();
                    break;
                } else {
                    hh1Var2.b.requestPermissions(new String[]{"android.permission.CAMERA"}, 102);
                    break;
                }
        }
    }

    @Override // org.telegram.ui.ActionBar.a2
    public void g(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        switch (this.a) {
            case 0:
                zg1 zg1Var = this.b.u0;
                if (zg1Var != null) {
                    zg1Var.b();
                    break;
                }
                break;
            default:
                this.b.u0.b();
                break;
        }
    }
}
