package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class ct0 extends AnimatorListenerAdapter {
    public final /* synthetic */ dt0 a;

    public ct0(dt0 dt0Var) {
        this.a = dt0Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        super.onAnimationEnd(animator);
        dt0 dt0Var = this.a;
        PhotoViewer photoViewer = dt0Var.c;
        photoViewer.j4 = 0;
        photoViewer.F1();
        photoViewer.H0.setAlpha(255);
        photoViewer.a0.invalidate();
        photoViewer.L0.setTranslationY(0.0f);
        if (photoViewer.p4) {
            PhotoViewer.a0(photoViewer, dt0Var.b.intValue());
        }
        xt0 xt0Var = dt0Var.a;
        if (xt0Var != null) {
            xt0Var.d();
        }
    }
}
