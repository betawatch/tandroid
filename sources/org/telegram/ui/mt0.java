package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-54f46d3192cfcf06f3cb7093cda92e459a80ef6ed91a766593a44d0f1cb126c7 */
/* loaded from: classes3.dex */
public final class mt0 extends AnimatorListenerAdapter {
    public final /* synthetic */ nt0 a;

    public mt0(nt0 nt0Var) {
        this.a = nt0Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        super.onAnimationEnd(animator);
        nt0 nt0Var = this.a;
        PhotoViewer photoViewer = nt0Var.c;
        photoViewer.n4 = 0;
        photoViewer.H1();
        photoViewer.L0.setAlpha(255);
        photoViewer.e0.invalidate();
        photoViewer.P0.setTranslationY(0.0f);
        if (photoViewer.t4) {
            PhotoViewer.b0(photoViewer, nt0Var.b.intValue());
        }
        hu0 hu0Var = nt0Var.a;
        if (hu0Var != null) {
            hu0Var.d();
        }
    }
}
