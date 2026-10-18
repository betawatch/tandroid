package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-bcc7d273da888d5c27994201329e5b838e55754b73312241608ee42846efd426 */
/* loaded from: classes3.dex */
public final class ot0 extends AnimatorListenerAdapter {
    public final /* synthetic */ pt0 a;

    public ot0(pt0 pt0Var) {
        this.a = pt0Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        super.onAnimationEnd(animator);
        pt0 pt0Var = this.a;
        PhotoViewer photoViewer = pt0Var.c;
        photoViewer.n4 = 0;
        photoViewer.G1();
        photoViewer.L0.setAlpha(255);
        photoViewer.e0.invalidate();
        photoViewer.P0.setTranslationY(0.0f);
        if (photoViewer.t4) {
            PhotoViewer.a0(photoViewer, pt0Var.b.intValue());
        }
        ju0 ju0Var = pt0Var.a;
        if (ju0Var != null) {
            ju0Var.d();
        }
    }
}
