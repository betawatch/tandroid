package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final class lt0 extends AnimatorListenerAdapter {
    public final /* synthetic */ mt0 a;

    public lt0(mt0 mt0Var) {
        this.a = mt0Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        super.onAnimationEnd(animator);
        mt0 mt0Var = this.a;
        PhotoViewer photoViewer = mt0Var.c;
        photoViewer.k4 = 0;
        photoViewer.F1();
        photoViewer.I0.setAlpha(255);
        photoViewer.b0.invalidate();
        photoViewer.M0.setTranslationY(0.0f);
        if (photoViewer.q4) {
            PhotoViewer.a0(photoViewer, mt0Var.b.intValue());
        }
        hu0 hu0Var = mt0Var.a;
        if (hu0Var != null) {
            hu0Var.d();
        }
    }
}
