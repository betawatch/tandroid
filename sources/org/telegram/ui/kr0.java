package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class kr0 extends AnimatorListenerAdapter {
    public final /* synthetic */ lr0 a;

    public kr0(lr0 lr0Var) {
        this.a = lr0Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        super.onAnimationEnd(animator);
        lr0 lr0Var = this.a;
        PhotoViewer photoViewer = lr0Var.c;
        photoViewer.n4 = 0;
        photoViewer.I1();
        photoViewer.L0.setAlpha(org.telegram.messenger.zs.e4);
        photoViewer.e0.invalidate();
        photoViewer.P0.setTranslationY(0.0f);
        if (photoViewer.t4) {
            PhotoViewer.b0(photoViewer, lr0Var.b.intValue());
        }
        es0 es0Var = lr0Var.a;
        if (es0Var != null) {
            es0Var.d();
        }
    }
}
