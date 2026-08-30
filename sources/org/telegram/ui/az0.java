package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.ImageReceiver;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final class az0 extends AnimatorListenerAdapter {
    public final /* synthetic */ ProfileActivity a;

    public az0(ProfileActivity profileActivity) {
        this.a = profileActivity;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        org.telegram.ui.ActionBar.k kVar;
        ProfileActivity profileActivity = this.a;
        kVar = ((org.telegram.ui.ActionBar.p2) profileActivity).actionBar;
        kVar.B(profileActivity.m2 ? 1090519039 : profileActivity.N5 != null ? 553648127 : org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f8, profileActivity.w0), false);
        wy0 wy0Var = profileActivity.b0;
        ImageReceiver imageReceiver = wy0Var.R;
        org.telegram.ui.Components.y5 animation = imageReceiver.getAnimation();
        if (animation != null) {
            animation.w(wy0Var);
        }
        imageReceiver.clearImage();
        ImageReceiver.BitmapHolder bitmapHolder = wy0Var.T;
        if (bitmapHolder != null) {
            bitmapHolder.release();
            wy0Var.T = null;
        }
        wy0Var.S = 0.0f;
        wy0Var.invalidate();
        profileActivity.E0 = false;
        profileActivity.l5(false);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
    }
}
