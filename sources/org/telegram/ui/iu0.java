package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final class iu0 extends AnimatorListenerAdapter {
    public final /* synthetic */ ju0 a;

    public iu0(ju0 ju0Var) {
        this.a = ju0Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        super.onAnimationEnd(animator);
        ju0 ju0Var = this.a;
        PhotoViewer photoViewer = ju0Var.c;
        photoViewer.n4 = 0;
        photoViewer.F1();
        photoViewer.L0.setAlpha(255);
        photoViewer.e0.invalidate();
        photoViewer.P0.setTranslationY(0.0f);
        if (photoViewer.t4) {
            PhotoViewer.a0(photoViewer, ju0Var.b.intValue());
        }
        dv0 dv0Var = ju0Var.a;
        if (dv0Var != null) {
            dv0Var.d();
        }
    }
}
