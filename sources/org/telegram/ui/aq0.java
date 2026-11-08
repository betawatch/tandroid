package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
/* loaded from: classes3.dex */
public final class aq0 extends AnimatorListenerAdapter {
    public final /* synthetic */ bq0 a;

    public aq0(bq0 bq0Var) {
        this.a = bq0Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        super.onAnimationEnd(animator);
        bq0 bq0Var = this.a;
        PhotoViewer photoViewer = bq0Var.c;
        photoViewer.m4 = 0;
        photoViewer.D1();
        photoViewer.L0.setAlpha(org.telegram.messenger.qs.e4);
        photoViewer.e0.invalidate();
        photoViewer.P0.setTranslationY(0.0f);
        if (photoViewer.s4) {
            PhotoViewer.S(photoViewer, bq0Var.b.intValue());
        }
        uq0 uq0Var = bq0Var.a;
        if (uq0Var != null) {
            uq0Var.d();
        }
    }
}
