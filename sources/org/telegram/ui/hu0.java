package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final class hu0 extends AnimatorListenerAdapter {
    public final /* synthetic */ iu0 a;

    public hu0(iu0 iu0Var) {
        this.a = iu0Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        super.onAnimationEnd(animator);
        iu0 iu0Var = this.a;
        PhotoViewer photoViewer = iu0Var.c;
        photoViewer.n4 = 0;
        photoViewer.G1();
        photoViewer.L0.setAlpha(255);
        photoViewer.e0.invalidate();
        photoViewer.P0.setTranslationY(0.0f);
        if (photoViewer.t4) {
            PhotoViewer.a0(photoViewer, iu0Var.b.intValue());
        }
        cv0 cv0Var = iu0Var.a;
        if (cv0Var != null) {
            cv0Var.d();
        }
    }
}
