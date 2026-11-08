package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes3.dex */
public final class op0 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ pp0 b;

    public op0(pp0 pp0Var, int i7) {
        this.b = pp0Var;
        this.a = i7;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        if (this.b.b.j8) {
            PhotoViewer photoViewer = this.b.b;
            if (photoViewer.r1) {
                photoViewer.z3();
            }
        }
        if (this.a == 3) {
            PhotoViewer photoViewer2 = this.b.b;
            photoViewer2.D2(photoViewer2.O4, false, true, true);
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        PhotoViewer photoViewer = this.b.b;
        photoViewer.P0.setVisibility(0);
        if (photoViewer.C3()) {
            photoViewer.n0.setVisibility(0);
        } else {
            photoViewer.S0.setVisibility(0);
        }
        photoViewer.F.setVisibility(0);
        if (photoViewer.i2) {
            lq0 lq0Var = photoViewer.Q1;
            lq0Var.setVisibility(lq0Var.getTag() != null ? 0 : 4);
        }
        if (photoViewer.d2 || photoViewer.e2) {
            return;
        }
        int i7 = photoViewer.c2;
        if ((i7 == 0 || i7 == 4 || ((i7 == 2 || i7 == 5) && photoViewer.f7.size() > 1)) && !photoViewer.e4) {
            photoViewer.N0.setVisibility(0);
            photoViewer.O0.setVisibility(0);
            photoViewer.p3();
        }
    }
}
