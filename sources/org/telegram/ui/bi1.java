package org.telegram.ui;

import android.view.View;
import android.view.WindowInsets;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.voip.VoIPService;

/* compiled from: r8-map-id-eaaffe05e5b4975c35db95ddc7f057e1a9a0a254a43fe066fa0ad675f8b3973e */
/* loaded from: classes3.dex */
public final /* synthetic */ class bi1 implements org.telegram.ui.ActionBar.a2, org.telegram.ui.Components.voip.t1, r0.n, org.telegram.ui.Components.voip.i3 {
    public final /* synthetic */ int a;
    public final /* synthetic */ ti1 b;

    public /* synthetic */ bi1(ti1 ti1Var, int i10) {
        this.a = i10;
        this.b = ti1Var;
    }

    @Override // r0.n
    public r0.l1 P0(View view, r0.l1 l1Var) {
        WindowInsets g10 = l1Var.g();
        ti1 ti1Var = this.b;
        ti1Var.r0 = g10;
        ((FrameLayout.LayoutParams) ti1Var.j0.getLayoutParams()).bottomMargin = ti1Var.r0.getSystemWindowInsetBottom();
        ((FrameLayout.LayoutParams) ti1Var.e0.getLayoutParams()).bottomMargin = ti1Var.r0.getSystemWindowInsetBottom();
        ((FrameLayout.LayoutParams) ti1Var.H.getLayoutParams()).topMargin = ti1Var.r0.getSystemWindowInsetTop();
        ((FrameLayout.LayoutParams) ti1Var.I.getLayoutParams()).topMargin = ti1Var.r0.getSystemWindowInsetTop();
        ((FrameLayout.LayoutParams) ti1Var.K.getLayoutParams()).topMargin = ti1Var.r0.getSystemWindowInsetTop() + AndroidUtilities.dp(56.0f);
        ((FrameLayout.LayoutParams) ti1Var.X.getLayoutParams()).topMargin = ti1Var.r0.getSystemWindowInsetTop() + AndroidUtilities.dp(135.0f);
        ((FrameLayout.LayoutParams) ti1Var.N.getLayoutParams()).topMargin = ti1Var.r0.getSystemWindowInsetTop() + AndroidUtilities.dp(17.0f);
        ((FrameLayout.LayoutParams) ti1Var.y.getLayoutParams()).topMargin = ti1Var.r0.getSystemWindowInsetTop() + AndroidUtilities.dp(93.0f);
        ((FrameLayout.LayoutParams) ti1Var.O.getLayoutParams()).topMargin = ti1Var.r0.getSystemWindowInsetTop();
        ((FrameLayout.LayoutParams) ti1Var.R.getLayoutParams()).topMargin = ti1Var.r0.getSystemWindowInsetTop() + AndroidUtilities.dp(118.0f);
        ((FrameLayout.LayoutParams) ti1Var.Q.getLayoutParams()).topMargin = ti1Var.r0.getSystemWindowInsetTop() + AndroidUtilities.dp(380.0f);
        ((FrameLayout.LayoutParams) ti1Var.Z.getLayoutParams()).bottomMargin = ti1Var.r0.getSystemWindowInsetBottom();
        ((FrameLayout.LayoutParams) ti1Var.M0.getLayoutParams()).bottomMargin = ti1Var.r0.getSystemWindowInsetBottom();
        ti1Var.Y.setInsets(ti1Var.r0);
        ti1Var.Z.setInsets(ti1Var.r0);
        ti1Var.s.requestLayout();
        mi1 mi1Var = ti1Var.o0;
        if (mi1Var != null) {
            mi1Var.setBottomPadding(ti1Var.r0.getSystemWindowInsetBottom());
        }
        return r0.l1.b;
    }

    @Override // org.telegram.ui.Components.voip.i3
    public void f(org.telegram.ui.Components.voip.j3 j3Var) {
        switch (this.a) {
            case 5:
                VoIPService sharedInstance = VoIPService.getSharedInstance();
                if (sharedInstance != null) {
                    ti1 ti1Var = this.b;
                    AndroidUtilities.cancelRunOnUIThread(ti1Var.S0);
                    ti1Var.R0 = false;
                    boolean isMicMute = sharedInstance.isMicMute();
                    boolean z10 = !isMicMute;
                    if (ti1Var.w0.isTouchExplorationEnabled()) {
                        j3Var.announceForAccessibility(LocaleController.getString(!isMicMute ? R.string.AccDescrVoipMicOff : R.string.AccDescrVoipMicOn));
                    }
                    sharedInstance.setMicMute(z10, false, true);
                    ti1Var.q0 = ti1Var.p0;
                    ti1Var.H();
                    break;
                }
                break;
            default:
                ti1.i(this.b);
                break;
        }
    }

    @Override // org.telegram.ui.ActionBar.a2
    public void k(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        switch (this.a) {
            case 0:
                li1 li1Var = this.b.u0;
                if (li1Var != null) {
                    li1Var.b();
                    break;
                }
                break;
            default:
                this.b.u0.b();
                break;
        }
    }
}
