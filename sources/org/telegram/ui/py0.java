package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.ImageReceiver;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class py0 extends AnimatorListenerAdapter {
    public final /* synthetic */ ProfileActivity a;

    public py0(ProfileActivity profileActivity) {
        this.a = profileActivity;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        org.telegram.ui.ActionBar.l lVar;
        ProfileActivity profileActivity = this.a;
        lVar = ((org.telegram.ui.ActionBar.o2) profileActivity).actionBar;
        lVar.B(profileActivity.l2 ? 1090519039 : profileActivity.M5 != null ? 553648127 : org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f8, profileActivity.v0), false);
        ly0 ly0Var = profileActivity.a0;
        ImageReceiver imageReceiver = ly0Var.Q;
        org.telegram.ui.Components.c6 animation = imageReceiver.getAnimation();
        if (animation != null) {
            animation.w(ly0Var);
        }
        imageReceiver.clearImage();
        ImageReceiver.BitmapHolder bitmapHolder = ly0Var.S;
        if (bitmapHolder != null) {
            bitmapHolder.release();
            ly0Var.S = null;
        }
        ly0Var.R = 0.0f;
        ly0Var.invalidate();
        profileActivity.D0 = false;
        profileActivity.l5(false);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
    }
}
