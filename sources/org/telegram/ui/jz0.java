package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.ImageReceiver;

/* compiled from: r8-map-id-8159789691d0b3bb0641ef1f4646484974d69719884d0b33e845acec3d7c3062 */
/* loaded from: classes3.dex */
public final class jz0 extends AnimatorListenerAdapter {
    public final /* synthetic */ ProfileActivity a;

    public jz0(ProfileActivity profileActivity) {
        this.a = profileActivity;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        org.telegram.ui.ActionBar.k kVar;
        ProfileActivity profileActivity = this.a;
        kVar = ((org.telegram.ui.ActionBar.m2) profileActivity).actionBar;
        kVar.A(profileActivity.p2 ? 1090519039 : profileActivity.Q5 != null ? 553648127 : org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.f8, profileActivity.z0), false);
        fz0 fz0Var = profileActivity.e0;
        ImageReceiver imageReceiver = fz0Var.U;
        org.telegram.ui.Components.d6 animation = imageReceiver.getAnimation();
        if (animation != null) {
            animation.w(fz0Var);
        }
        imageReceiver.clearImage();
        ImageReceiver.BitmapHolder bitmapHolder = fz0Var.W;
        if (bitmapHolder != null) {
            bitmapHolder.release();
            fz0Var.W = null;
        }
        fz0Var.V = 0.0f;
        fz0Var.invalidate();
        profileActivity.H0 = false;
        profileActivity.l5(false);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
    }
}
