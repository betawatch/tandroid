package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
/* loaded from: classes3.dex */
public final class gu0 extends AnimatorListenerAdapter {
    public final /* synthetic */ hu0 a;

    public gu0(hu0 hu0Var) {
        this.a = hu0Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        super.onAnimationEnd(animator);
        hu0 hu0Var = this.a;
        PhotoViewer photoViewer = hu0Var.c;
        photoViewer.n4 = 0;
        photoViewer.F1();
        photoViewer.L0.setAlpha(255);
        photoViewer.e0.invalidate();
        photoViewer.P0.setTranslationY(0.0f);
        if (photoViewer.t4) {
            PhotoViewer.a0(photoViewer, hu0Var.b.intValue());
        }
        bv0 bv0Var = hu0Var.a;
        if (bv0Var != null) {
            bv0Var.d();
        }
    }
}
