package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class jt0 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ kt0 b;

    public jt0(kt0 kt0Var, int i10) {
        this.b = kt0Var;
        this.a = i10;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        if (this.b.b.k8) {
            PhotoViewer photoViewer = this.b.b;
            if (photoViewer.r1) {
                photoViewer.E3();
            }
        }
        if (this.a == 3) {
            PhotoViewer photoViewer2 = this.b.b;
            photoViewer2.J2(photoViewer2.P4, false, true, true);
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        PhotoViewer photoViewer = this.b.b;
        photoViewer.P0.setVisibility(0);
        if (photoViewer.H3()) {
            photoViewer.n0.setVisibility(0);
        } else {
            photoViewer.S0.setVisibility(0);
        }
        photoViewer.F.setVisibility(0);
        if (photoViewer.i2) {
            gu0 gu0Var = photoViewer.Q1;
            gu0Var.setVisibility(gu0Var.getTag() != null ? 0 : 4);
        }
        if (photoViewer.d2 || photoViewer.e2) {
            return;
        }
        int i10 = photoViewer.c2;
        if ((i10 == 0 || i10 == 4 || ((i10 == 2 || i10 == 5) && photoViewer.g7.size() > 1)) && !photoViewer.f4) {
            photoViewer.N0.setVisibility(0);
            photoViewer.O0.setVisibility(0);
            photoViewer.v3();
        }
    }
}
