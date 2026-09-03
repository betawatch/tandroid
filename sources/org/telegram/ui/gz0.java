package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.ImageReceiver;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final class gz0 extends AnimatorListenerAdapter {
    public final /* synthetic */ ProfileActivity a;

    public gz0(ProfileActivity profileActivity) {
        this.a = profileActivity;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        org.telegram.ui.ActionBar.k kVar;
        ProfileActivity profileActivity = this.a;
        kVar = ((org.telegram.ui.ActionBar.p2) profileActivity).actionBar;
        kVar.B(profileActivity.m2 ? 1090519039 : profileActivity.N5 != null ? 553648127 : org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.f8, profileActivity.w0), false);
        cz0 cz0Var = profileActivity.b0;
        ImageReceiver imageReceiver = cz0Var.R;
        org.telegram.ui.Components.y5 animation = imageReceiver.getAnimation();
        if (animation != null) {
            animation.w(cz0Var);
        }
        imageReceiver.clearImage();
        ImageReceiver.BitmapHolder bitmapHolder = cz0Var.T;
        if (bitmapHolder != null) {
            bitmapHolder.release();
            cz0Var.T = null;
        }
        cz0Var.S = 0.0f;
        cz0Var.invalidate();
        profileActivity.E0 = false;
        profileActivity.l5(false);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
    }
}
