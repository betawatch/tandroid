package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class ft0 extends AnimatorListenerAdapter {
    public final /* synthetic */ gt0 a;

    public ft0(gt0 gt0Var) {
        this.a = gt0Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        super.onAnimationEnd(animator);
        gt0 gt0Var = this.a;
        PhotoViewer photoViewer = gt0Var.c;
        photoViewer.j4 = 0;
        photoViewer.F1();
        photoViewer.H0.setAlpha(255);
        photoViewer.a0.invalidate();
        photoViewer.L0.setTranslationY(0.0f);
        if (photoViewer.p4) {
            PhotoViewer.a0(photoViewer, gt0Var.b.intValue());
        }
        au0 au0Var = gt0Var.a;
        if (au0Var != null) {
            au0Var.d();
        }
    }
}
