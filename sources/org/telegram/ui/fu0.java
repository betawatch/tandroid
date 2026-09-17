package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-e83daa4a3f4c5cc77b567d3f921056f729108399460aa18047e0e51e076a97b3 */
/* loaded from: classes3.dex */
public final class fu0 extends AnimatorListenerAdapter {
    public final /* synthetic */ gu0 a;

    public fu0(gu0 gu0Var) {
        this.a = gu0Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        super.onAnimationEnd(animator);
        gu0 gu0Var = this.a;
        PhotoViewer photoViewer = gu0Var.c;
        photoViewer.n4 = 0;
        photoViewer.F1();
        photoViewer.L0.setAlpha(255);
        photoViewer.e0.invalidate();
        photoViewer.P0.setTranslationY(0.0f);
        if (photoViewer.t4) {
            PhotoViewer.a0(photoViewer, gu0Var.b.intValue());
        }
        av0 av0Var = gu0Var.a;
        if (av0Var != null) {
            av0Var.d();
        }
    }
}
