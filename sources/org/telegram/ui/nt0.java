package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final class nt0 extends AnimatorListenerAdapter {
    public final /* synthetic */ ot0 a;

    public nt0(ot0 ot0Var) {
        this.a = ot0Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        super.onAnimationEnd(animator);
        ot0 ot0Var = this.a;
        PhotoViewer photoViewer = ot0Var.c;
        photoViewer.k4 = 0;
        photoViewer.F1();
        photoViewer.I0.setAlpha(255);
        photoViewer.b0.invalidate();
        photoViewer.M0.setTranslationY(0.0f);
        if (photoViewer.q4) {
            PhotoViewer.a0(photoViewer, ot0Var.b.intValue());
        }
        ju0 ju0Var = ot0Var.a;
        if (ju0Var != null) {
            ju0Var.d();
        }
    }
}
