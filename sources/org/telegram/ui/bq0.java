package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes3.dex */
public final class bq0 extends AnimatorListenerAdapter {
    public final /* synthetic */ cq0 a;

    public bq0(cq0 cq0Var) {
        this.a = cq0Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        super.onAnimationEnd(animator);
        cq0 cq0Var = this.a;
        PhotoViewer photoViewer = cq0Var.c;
        photoViewer.n4 = 0;
        photoViewer.D1();
        photoViewer.M0.setAlpha(org.telegram.messenger.ls.e4);
        photoViewer.f0.invalidate();
        photoViewer.Q0.setTranslationY(0.0f);
        if (photoViewer.t4) {
            PhotoViewer.T(photoViewer, cq0Var.b.intValue());
        }
        uq0 uq0Var = cq0Var.a;
        if (uq0Var != null) {
            uq0Var.d();
        }
    }
}
