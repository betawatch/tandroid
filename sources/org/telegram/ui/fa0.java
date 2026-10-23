package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.NotificationCenter;

/* compiled from: r8-map-id-5c4d11c5a4a3c3963e49de090c9ebed761f6fe8b7d1fb1bb05822f03003d35b5 */
/* loaded from: classes3.dex */
public final class fa0 extends AnimatorListenerAdapter {
    public final /* synthetic */ org.telegram.ui.Components.yj0 a;
    public final /* synthetic */ org.telegram.ui.Components.vj0 b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ LaunchActivity d;

    public fa0(LaunchActivity launchActivity, org.telegram.ui.Components.yj0 yj0Var, org.telegram.ui.Components.vj0 vj0Var, boolean z10) {
        this.d = launchActivity;
        this.a = yj0Var;
        this.b = vj0Var;
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
        org.telegram.ui.Components.yj0 yj0Var = this.a;
        if (yj0Var != null) {
            yj0Var.setImageDrawable(this.b);
        }
        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.themeAccentListUpdated, new Object[0]);
        if (!this.c && yj0Var != null) {
            yj0Var.setVisibility(0);
        }
        cy.x4 = false;
    }
}
