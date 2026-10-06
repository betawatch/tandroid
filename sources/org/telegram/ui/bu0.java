package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-512d310aee599d224f4c0b0a2d01feec484432ddc9f55a7433fffe3405d6493d */
/* loaded from: classes3.dex */
public final class bu0 extends AnimatorListenerAdapter {
    public final /* synthetic */ cu0 a;

    public bu0(cu0 cu0Var) {
        this.a = cu0Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        super.onAnimationEnd(animator);
        cu0 cu0Var = this.a;
        PhotoViewer photoViewer = cu0Var.c;
        photoViewer.n4 = 0;
        photoViewer.G1();
        photoViewer.L0.setAlpha(255);
        photoViewer.e0.invalidate();
        photoViewer.P0.setTranslationY(0.0f);
        if (photoViewer.t4) {
            PhotoViewer.Z(photoViewer, cu0Var.b.intValue());
        }
        wu0 wu0Var = cu0Var.a;
        if (wu0Var != null) {
            wu0Var.d();
        }
    }
}
