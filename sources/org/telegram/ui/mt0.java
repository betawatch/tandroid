package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-425f9d3693dca7cdb7b1343a62ca29dd4bfbf482fa37d742abbdfab31448a8bd */
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
        photoViewer.G1();
        photoViewer.L0.setAlpha(255);
        photoViewer.e0.invalidate();
        photoViewer.P0.setTranslationY(0.0f);
        if (photoViewer.t4) {
            PhotoViewer.a0(photoViewer, nt0Var.b.intValue());
        }
        hu0 hu0Var = nt0Var.a;
        if (hu0Var != null) {
            hu0Var.d();
        }
    }
}
