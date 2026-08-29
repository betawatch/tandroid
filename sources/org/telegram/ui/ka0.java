package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.NotificationCenter;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class ka0 extends AnimatorListenerAdapter {
    public final /* synthetic */ org.telegram.ui.Components.aj0 a;
    public final /* synthetic */ org.telegram.ui.Components.xi0 b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ LaunchActivity d;

    public ka0(LaunchActivity launchActivity, org.telegram.ui.Components.aj0 aj0Var, org.telegram.ui.Components.xi0 xi0Var, boolean z10) {
        this.d = launchActivity;
        this.a = aj0Var;
        this.b = xi0Var;
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
        org.telegram.ui.Components.aj0 aj0Var = this.a;
        if (aj0Var != null) {
            aj0Var.setImageDrawable(this.b);
        }
        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.themeAccentListUpdated, new Object[0]);
        if (!this.c && aj0Var != null) {
            aj0Var.setVisibility(0);
        }
        fy.t4 = false;
    }
}
