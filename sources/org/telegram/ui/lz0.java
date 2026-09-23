package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.ImageReceiver;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes3.dex */
public final class lz0 extends AnimatorListenerAdapter {
    public final /* synthetic */ ProfileActivity a;

    public lz0(ProfileActivity profileActivity) {
        this.a = profileActivity;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        org.telegram.ui.ActionBar.k kVar;
        ProfileActivity profileActivity = this.a;
        kVar = ((org.telegram.ui.ActionBar.n2) profileActivity).actionBar;
        kVar.A(profileActivity.p2 ? 1090519039 : profileActivity.Q5 != null ? 553648127 : org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.f8, profileActivity.z0), false);
        hz0 hz0Var = profileActivity.e0;
        ImageReceiver imageReceiver = hz0Var.U;
        org.telegram.ui.Components.d6 animation = imageReceiver.getAnimation();
        if (animation != null) {
            animation.w(hz0Var);
        }
        imageReceiver.clearImage();
        ImageReceiver.BitmapHolder bitmapHolder = hz0Var.W;
        if (bitmapHolder != null) {
            bitmapHolder.release();
            hz0Var.W = null;
        }
        hz0Var.V = 0.0f;
        hz0Var.invalidate();
        profileActivity.H0 = false;
        profileActivity.l5(false);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
    }
}
