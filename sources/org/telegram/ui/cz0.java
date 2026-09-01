package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.ImageReceiver;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
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
        kVar = ((org.telegram.ui.ActionBar.p2) profileActivity).actionBar;
        kVar.B(profileActivity.m2 ? 1090519039 : profileActivity.N5 != null ? 553648127 : org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.f8, profileActivity.w0), false);
        yy0 yy0Var = profileActivity.b0;
        ImageReceiver imageReceiver = yy0Var.R;
        org.telegram.ui.Components.y5 animation = imageReceiver.getAnimation();
        if (animation != null) {
            animation.w(yy0Var);
        }
        imageReceiver.clearImage();
        ImageReceiver.BitmapHolder bitmapHolder = yy0Var.T;
        if (bitmapHolder != null) {
            bitmapHolder.release();
            yy0Var.T = null;
        }
        yy0Var.S = 0.0f;
        yy0Var.invalidate();
        profileActivity.E0 = false;
        profileActivity.l5(false);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
    }
}
