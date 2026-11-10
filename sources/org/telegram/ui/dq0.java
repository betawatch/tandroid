package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class dq0 extends AnimatorListenerAdapter {
    public final /* synthetic */ eq0 a;

    public dq0(eq0 eq0Var) {
        this.a = eq0Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        super.onAnimationEnd(animator);
        eq0 eq0Var = this.a;
        PhotoViewer photoViewer = eq0Var.c;
        photoViewer.m4 = 0;
        photoViewer.D1();
        photoViewer.L0.setAlpha(org.telegram.messenger.qs.e4);
        photoViewer.e0.invalidate();
        photoViewer.P0.setTranslationY(0.0f);
        if (photoViewer.s4) {
            PhotoViewer.S(photoViewer, eq0Var.b.intValue());
        }
        xq0 xq0Var = eq0Var.a;
        if (xq0Var != null) {
            xq0Var.d();
        }
    }
}
