package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.NotificationCenter;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
/* loaded from: classes3.dex */
public final class eb0 extends AnimatorListenerAdapter {
    public final /* synthetic */ org.telegram.ui.Components.nj0 a;
    public final /* synthetic */ org.telegram.ui.Components.kj0 b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ LaunchActivity d;

    public eb0(LaunchActivity launchActivity, org.telegram.ui.Components.nj0 nj0Var, org.telegram.ui.Components.kj0 kj0Var, boolean z10) {
        this.d = launchActivity;
        this.a = nj0Var;
        this.b = kj0Var;
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
        org.telegram.ui.Components.nj0 nj0Var = this.a;
        if (nj0Var != null) {
            nj0Var.setImageDrawable(this.b);
        }
        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.themeAccentListUpdated, new Object[0]);
        if (!this.c && nj0Var != null) {
            nj0Var.setVisibility(0);
        }
        uy.w4 = false;
    }
}
