package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.NotificationCenter;

/* compiled from: r8-map-id-eaaffe05e5b4975c35db95ddc7f057e1a9a0a254a43fe066fa0ad675f8b3973e */
/* loaded from: classes3.dex */
public final class eb0 extends AnimatorListenerAdapter {
    public final /* synthetic */ org.telegram.ui.Components.kj0 a;
    public final /* synthetic */ org.telegram.ui.Components.hj0 b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ LaunchActivity d;

    public eb0(LaunchActivity launchActivity, org.telegram.ui.Components.kj0 kj0Var, org.telegram.ui.Components.hj0 hj0Var, boolean z10) {
        this.d = launchActivity;
        this.a = kj0Var;
        this.b = hj0Var;
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
        org.telegram.ui.Components.kj0 kj0Var = this.a;
        if (kj0Var != null) {
            kj0Var.setImageDrawable(this.b);
        }
        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.themeAccentListUpdated, new Object[0]);
        if (!this.c && kj0Var != null) {
            kj0Var.setVisibility(0);
        }
        uy.w4 = false;
    }
}
