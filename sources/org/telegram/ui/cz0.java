package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.ImageReceiver;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final class cz0 extends AnimatorListenerAdapter {
    public final /* synthetic */ ProfileActivity a;

    public cz0(ProfileActivity profileActivity) {
        this.a = profileActivity;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        org.telegram.ui.ActionBar.k kVar;
        ProfileActivity profileActivity = this.a;
        kVar = ((org.telegram.ui.ActionBar.r2) profileActivity).actionBar;
        kVar.x(profileActivity.p2 ? 1090519039 : profileActivity.X5 != null ? 553648127 : org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.f8, profileActivity.z0), false);
        yy0 yy0Var = profileActivity.e0;
        ImageReceiver imageReceiver = yy0Var.U;
        org.telegram.ui.Components.g6 animation = imageReceiver.getAnimation();
        if (animation != null) {
            animation.w(yy0Var);
        }
        imageReceiver.clearImage();
        ImageReceiver.BitmapHolder bitmapHolder = yy0Var.W;
        if (bitmapHolder != null) {
            bitmapHolder.release();
            yy0Var.W = null;
        }
        yy0Var.V = 0.0f;
        yy0Var.invalidate();
        profileActivity.H0 = false;
        profileActivity.x5(false);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
    }
}
