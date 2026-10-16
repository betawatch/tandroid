package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes3.dex */
public final class mu0 extends AnimatorListenerAdapter {
    public final /* synthetic */ nu0 a;

    public mu0(nu0 nu0Var) {
        this.a = nu0Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        super.onAnimationEnd(animator);
        nu0 nu0Var = this.a;
        PhotoViewer photoViewer = nu0Var.c;
        photoViewer.n4 = 0;
        photoViewer.G1();
        photoViewer.L0.setAlpha(255);
        photoViewer.e0.invalidate();
        photoViewer.P0.setTranslationY(0.0f);
        if (photoViewer.t4) {
            PhotoViewer.a0(photoViewer, nu0Var.b.intValue());
        }
        hv0 hv0Var = nu0Var.a;
        if (hv0Var != null) {
            hv0Var.d();
        }
    }
}
