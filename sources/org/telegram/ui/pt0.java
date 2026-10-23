package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-6bb23a39fe2d1bb2dc6cc69f606436ba751c240cf93e0ff97ff041cb9f09a305 */
/* loaded from: classes3.dex */
public final class pt0 extends AnimatorListenerAdapter {
    public final /* synthetic */ qt0 a;

    public pt0(qt0 qt0Var) {
        this.a = qt0Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        super.onAnimationEnd(animator);
        qt0 qt0Var = this.a;
        PhotoViewer photoViewer = qt0Var.c;
        photoViewer.n4 = 0;
        photoViewer.H1();
        photoViewer.L0.setAlpha(255);
        photoViewer.e0.invalidate();
        photoViewer.P0.setTranslationY(0.0f);
        if (photoViewer.t4) {
            PhotoViewer.b0(photoViewer, qt0Var.b.intValue());
        }
        ku0 ku0Var = qt0Var.a;
        if (ku0Var != null) {
            ku0Var.d();
        }
    }
}
