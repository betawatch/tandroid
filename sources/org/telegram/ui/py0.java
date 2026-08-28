package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.ImageReceiver;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class py0 extends AnimatorListenerAdapter {
    public final /* synthetic */ ProfileActivity a;

    public py0(ProfileActivity profileActivity) {
        this.a = profileActivity;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        org.telegram.ui.ActionBar.k kVar;
        ProfileActivity profileActivity = this.a;
        kVar = ((org.telegram.ui.ActionBar.o2) profileActivity).actionBar;
        kVar.A(profileActivity.l2 ? 1090519039 : profileActivity.M5 != null ? 553648127 : org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.f8, profileActivity.v0), false);
        ly0 ly0Var = profileActivity.a0;
        ImageReceiver imageReceiver = ly0Var.Q;
        org.telegram.ui.Components.x5 animation = imageReceiver.getAnimation();
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
