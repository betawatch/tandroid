package org.telegram.ui;

import android.view.View;
import android.view.WindowInsets;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.voip.VoIPService;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final /* synthetic */ class hi1 implements org.telegram.ui.ActionBar.c2, org.telegram.ui.Components.voip.s1, r0.n, org.telegram.ui.Components.voip.i3 {
    public final /* synthetic */ int a;
    public final /* synthetic */ zi1 b;

    public /* synthetic */ hi1(zi1 zi1Var, int i10) {
        this.a = i10;
        this.b = zi1Var;
    }

    @Override // r0.n
    public r0.l1 Q0(View view, r0.l1 l1Var) {
        WindowInsets g10 = l1Var.g();
        zi1 zi1Var = this.b;
        zi1Var.r0 = g10;
        ((FrameLayout.LayoutParams) zi1Var.j0.getLayoutParams()).bottomMargin = zi1Var.r0.getSystemWindowInsetBottom();
        ((FrameLayout.LayoutParams) zi1Var.e0.getLayoutParams()).bottomMargin = zi1Var.r0.getSystemWindowInsetBottom();
        ((FrameLayout.LayoutParams) zi1Var.H.getLayoutParams()).topMargin = zi1Var.r0.getSystemWindowInsetTop();
        ((FrameLayout.LayoutParams) zi1Var.I.getLayoutParams()).topMargin = zi1Var.r0.getSystemWindowInsetTop();
        ((FrameLayout.LayoutParams) zi1Var.K.getLayoutParams()).topMargin = zi1Var.r0.getSystemWindowInsetTop() + AndroidUtilities.dp(56.0f);
        ((FrameLayout.LayoutParams) zi1Var.X.getLayoutParams()).topMargin = zi1Var.r0.getSystemWindowInsetTop() + AndroidUtilities.dp(135.0f);
        ((FrameLayout.LayoutParams) zi1Var.N.getLayoutParams()).topMargin = zi1Var.r0.getSystemWindowInsetTop() + AndroidUtilities.dp(17.0f);
        ((FrameLayout.LayoutParams) zi1Var.y.getLayoutParams()).topMargin = zi1Var.r0.getSystemWindowInsetTop() + AndroidUtilities.dp(93.0f);
        ((FrameLayout.LayoutParams) zi1Var.O.getLayoutParams()).topMargin = zi1Var.r0.getSystemWindowInsetTop();
        ((FrameLayout.LayoutParams) zi1Var.R.getLayoutParams()).topMargin = zi1Var.r0.getSystemWindowInsetTop() + AndroidUtilities.dp(118.0f);
        ((FrameLayout.LayoutParams) zi1Var.Q.getLayoutParams()).topMargin = zi1Var.r0.getSystemWindowInsetTop() + AndroidUtilities.dp(380.0f);
        ((FrameLayout.LayoutParams) zi1Var.Z.getLayoutParams()).bottomMargin = zi1Var.r0.getSystemWindowInsetBottom();
        ((FrameLayout.LayoutParams) zi1Var.M0.getLayoutParams()).bottomMargin = zi1Var.r0.getSystemWindowInsetBottom();
        zi1Var.Y.setInsets(zi1Var.r0);
        zi1Var.Z.setInsets(zi1Var.r0);
        zi1Var.s.requestLayout();
        si1 si1Var = zi1Var.o0;
        if (si1Var != null) {
            si1Var.setBottomPadding(zi1Var.r0.getSystemWindowInsetBottom());
        }
        return r0.l1.b;
    }

    @Override // org.telegram.ui.Components.voip.i3
    public void b(org.telegram.ui.Components.voip.j3 j3Var) {
        switch (this.a) {
            case 5:
                VoIPService sharedInstance = VoIPService.getSharedInstance();
                if (sharedInstance != null) {
                    zi1 zi1Var = this.b;
                    AndroidUtilities.cancelRunOnUIThread(zi1Var.S0);
                    zi1Var.R0 = false;
                    boolean isMicMute = sharedInstance.isMicMute();
                    boolean z10 = !isMicMute;
                    if (zi1Var.w0.isTouchExplorationEnabled()) {
                        j3Var.announceForAccessibility(LocaleController.getString(!isMicMute ? R.string.AccDescrVoipMicOff : R.string.AccDescrVoipMicOn));
                    }
                    sharedInstance.setMicMute(z10, false, true);
                    zi1Var.q0 = zi1Var.p0;
                    zi1Var.H();
                    break;
                }
                break;
            default:
                zi1.i(this.b);
                break;
        }
    }

    @Override // org.telegram.ui.ActionBar.c2
    public void f(org.telegram.ui.ActionBar.d2 d2Var, int i10) {
        switch (this.a) {
            case 0:
                ri1 ri1Var = this.b.u0;
                if (ri1Var != null) {
                    ri1Var.b();
                    break;
                }
                break;
            default:
                this.b.u0.b();
                break;
        }
    }
}
