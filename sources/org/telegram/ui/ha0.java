package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.NotificationCenter;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class ha0 extends AnimatorListenerAdapter {
    public final /* synthetic */ org.telegram.ui.Components.pi0 a;
    public final /* synthetic */ org.telegram.ui.Components.mi0 b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ LaunchActivity d;

    public ha0(LaunchActivity launchActivity, org.telegram.ui.Components.pi0 pi0Var, org.telegram.ui.Components.mi0 mi0Var, boolean z10) {
        this.d = launchActivity;
        this.a = pi0Var;
        this.b = mi0Var;
        this.c = z10;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        LaunchActivity launchActivity = this.d;
        launchActivity.C0 = null;
        launchActivity.v0.invalidate();
        launchActivity.k0.invalidate();
        launchActivity.k0.setImageDrawable(null);
        launchActivity.k0.setVisibility(8);
        launchActivity.l0.setVisibility(8);
        org.telegram.ui.Components.pi0 pi0Var = this.a;
        if (pi0Var != null) {
            pi0Var.setImageDrawable(this.b);
        }
        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.themeAccentListUpdated, new Object[0]);
        if (!this.c && pi0Var != null) {
            pi0Var.setVisibility(0);
        }
        dy.t4 = false;
    }
}
