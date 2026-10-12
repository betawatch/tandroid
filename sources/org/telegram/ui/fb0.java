package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.NotificationCenter;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes3.dex */
public final class fb0 extends AnimatorListenerAdapter {
    public final /* synthetic */ org.telegram.ui.Components.bk0 a;
    public final /* synthetic */ org.telegram.ui.Components.yj0 b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ LaunchActivity d;

    public fb0(LaunchActivity launchActivity, org.telegram.ui.Components.bk0 bk0Var, org.telegram.ui.Components.yj0 yj0Var, boolean z10) {
        this.d = launchActivity;
        this.a = bk0Var;
        this.b = yj0Var;
        this.c = z10;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        LaunchActivity launchActivity = this.d;
        launchActivity.G0 = null;
        launchActivity.z0.invalidate();
        launchActivity.o0.invalidate();
        launchActivity.o0.setImageDrawable(null);
        launchActivity.o0.setVisibility(8);
        launchActivity.p0.setVisibility(8);
        org.telegram.ui.Components.bk0 bk0Var = this.a;
        if (bk0Var != null) {
            bk0Var.setImageDrawable(this.b);
        }
        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.themeAccentListUpdated, new Object[0]);
        if (!this.c && bk0Var != null) {
            bk0Var.setVisibility(0);
        }
        yy.w4 = false;
    }
}
