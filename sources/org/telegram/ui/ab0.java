package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.NotificationCenter;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final class ab0 extends AnimatorListenerAdapter {
    public final /* synthetic */ org.telegram.ui.Components.fk0 a;
    public final /* synthetic */ org.telegram.ui.Components.ck0 b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ LaunchActivity d;

    public ab0(LaunchActivity launchActivity, org.telegram.ui.Components.fk0 fk0Var, org.telegram.ui.Components.ck0 ck0Var, boolean z10) {
        this.d = launchActivity;
        this.a = fk0Var;
        this.b = ck0Var;
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
        org.telegram.ui.Components.fk0 fk0Var = this.a;
        if (fk0Var != null) {
            fk0Var.setImageDrawable(this.b);
        }
        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.themeAccentListUpdated, new Object[0]);
        if (!this.c && fk0Var != null) {
            fk0Var.setVisibility(0);
        }
        ty.w4 = false;
    }
}
