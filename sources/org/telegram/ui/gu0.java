package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes3.dex */
public final class gu0 extends AnimatorListenerAdapter {
    public final /* synthetic */ hu0 a;

    public gu0(hu0 hu0Var) {
        this.a = hu0Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        super.onAnimationEnd(animator);
        hu0 hu0Var = this.a;
        PhotoViewer photoViewer = hu0Var.c;
        photoViewer.n4 = 0;
        photoViewer.F1();
        photoViewer.L0.setAlpha(255);
        photoViewer.e0.invalidate();
        photoViewer.P0.setTranslationY(0.0f);
        if (photoViewer.t4) {
            PhotoViewer.a0(photoViewer, hu0Var.b.intValue());
        }
        bv0 bv0Var = hu0Var.a;
        if (bv0Var != null) {
            bv0Var.d();
        }
    }
}
