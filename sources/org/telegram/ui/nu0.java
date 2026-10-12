package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes3.dex */
public final class nu0 extends AnimatorListenerAdapter {
    public final /* synthetic */ ou0 a;

    public nu0(ou0 ou0Var) {
        this.a = ou0Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        super.onAnimationEnd(animator);
        ou0 ou0Var = this.a;
        PhotoViewer photoViewer = ou0Var.c;
        photoViewer.n4 = 0;
        photoViewer.G1();
        photoViewer.L0.setAlpha(255);
        photoViewer.e0.invalidate();
        photoViewer.P0.setTranslationY(0.0f);
        if (photoViewer.t4) {
            PhotoViewer.a0(photoViewer, ou0Var.b.intValue());
        }
        iv0 iv0Var = ou0Var.a;
        if (iv0Var != null) {
            iv0Var.d();
        }
    }
}
