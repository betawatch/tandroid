package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.ImageReceiver;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class ez0 extends AnimatorListenerAdapter {
    public final /* synthetic */ ProfileActivity a;

    public ez0(ProfileActivity profileActivity) {
        this.a = profileActivity;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        org.telegram.ui.ActionBar.k kVar;
        ProfileActivity profileActivity = this.a;
        kVar = ((org.telegram.ui.ActionBar.r2) profileActivity).actionBar;
        kVar.x(profileActivity.p2 ? 1090519039 : profileActivity.X5 != null ? 553648127 : org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.f8, profileActivity.z0), false);
        az0 az0Var = profileActivity.e0;
        ImageReceiver imageReceiver = az0Var.U;
        org.telegram.ui.Components.g6 animation = imageReceiver.getAnimation();
        if (animation != null) {
            animation.w(az0Var);
        }
        imageReceiver.clearImage();
        ImageReceiver.BitmapHolder bitmapHolder = az0Var.W;
        if (bitmapHolder != null) {
            bitmapHolder.release();
            az0Var.W = null;
        }
        az0Var.V = 0.0f;
        az0Var.invalidate();
        profileActivity.H0 = false;
        profileActivity.x5(false);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
    }
}
