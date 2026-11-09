package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final class cq0 extends AnimatorListenerAdapter {
    public final /* synthetic */ dq0 a;

    public cq0(dq0 dq0Var) {
        this.a = dq0Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        super.onAnimationEnd(animator);
        dq0 dq0Var = this.a;
        PhotoViewer photoViewer = dq0Var.c;
        photoViewer.m4 = 0;
        photoViewer.D1();
        photoViewer.L0.setAlpha(org.telegram.messenger.qs.e4);
        photoViewer.e0.invalidate();
        photoViewer.P0.setTranslationY(0.0f);
        if (photoViewer.s4) {
            PhotoViewer.S(photoViewer, dq0Var.b.intValue());
        }
        wq0 wq0Var = dq0Var.a;
        if (wq0Var != null) {
            wq0Var.d();
        }
    }
}
