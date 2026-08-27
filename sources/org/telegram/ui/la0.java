package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.NotificationCenter;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class la0 extends AnimatorListenerAdapter {
    public final /* synthetic */ org.telegram.ui.Components.ri0 a;
    public final /* synthetic */ org.telegram.ui.Components.oi0 b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ LaunchActivity d;

    public la0(LaunchActivity launchActivity, org.telegram.ui.Components.ri0 ri0Var, org.telegram.ui.Components.oi0 oi0Var, boolean z10) {
        this.d = launchActivity;
        this.a = ri0Var;
        this.b = oi0Var;
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
        org.telegram.ui.Components.ri0 ri0Var = this.a;
        if (ri0Var != null) {
            ri0Var.setImageDrawable(this.b);
        }
        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.themeAccentListUpdated, new Object[0]);
        if (!this.c && ri0Var != null) {
            ri0Var.setVisibility(0);
        }
        gy.t4 = false;
    }
}
