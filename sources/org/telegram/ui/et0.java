package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class et0 extends AnimatorListenerAdapter {
    public final /* synthetic */ ft0 a;

    public et0(ft0 ft0Var) {
        this.a = ft0Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        super.onAnimationEnd(animator);
        ft0 ft0Var = this.a;
        PhotoViewer photoViewer = ft0Var.c;
        photoViewer.j4 = 0;
        photoViewer.F1();
        photoViewer.H0.setAlpha(255);
        photoViewer.a0.invalidate();
        photoViewer.L0.setTranslationY(0.0f);
        if (photoViewer.p4) {
            PhotoViewer.Z(photoViewer, ft0Var.b.intValue());
        }
        zt0 zt0Var = ft0Var.a;
        if (zt0Var != null) {
            zt0Var.d();
        }
    }
}
