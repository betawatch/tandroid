package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final class jr0 extends AnimatorListenerAdapter {
    public final /* synthetic */ kr0 a;

    public jr0(kr0 kr0Var) {
        this.a = kr0Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        super.onAnimationEnd(animator);
        kr0 kr0Var = this.a;
        PhotoViewer photoViewer = kr0Var.c;
        photoViewer.n4 = 0;
        photoViewer.I1();
        photoViewer.L0.setAlpha(org.telegram.messenger.at.e4);
        photoViewer.e0.invalidate();
        photoViewer.P0.setTranslationY(0.0f);
        if (photoViewer.t4) {
            PhotoViewer.b0(photoViewer, kr0Var.b.intValue());
        }
        ds0 ds0Var = kr0Var.a;
        if (ds0Var != null) {
            ds0Var.d();
        }
    }
}
