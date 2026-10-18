package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.NotificationCenter;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
/* loaded from: classes3.dex */
public final class ha0 extends AnimatorListenerAdapter {
    public final /* synthetic */ org.telegram.ui.Components.xj0 a;
    public final /* synthetic */ org.telegram.ui.Components.uj0 b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ LaunchActivity d;

    public ha0(LaunchActivity launchActivity, org.telegram.ui.Components.xj0 xj0Var, org.telegram.ui.Components.uj0 uj0Var, boolean z10) {
        this.d = launchActivity;
        this.a = xj0Var;
        this.b = uj0Var;
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
        org.telegram.ui.Components.xj0 xj0Var = this.a;
        if (xj0Var != null) {
            xj0Var.setImageDrawable(this.b);
        }
        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.themeAccentListUpdated, new Object[0]);
        if (!this.c && xj0Var != null) {
            xj0Var.setVisibility(0);
        }
        ey.x4 = false;
    }
}
