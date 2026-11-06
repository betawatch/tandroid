package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes3.dex */
public final class np0 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ op0 b;

    public np0(op0 op0Var, int i7) {
        this.b = op0Var;
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
            kq0 kq0Var = photoViewer.Q1;
            kq0Var.setVisibility(kq0Var.getTag() != null ? 0 : 4);
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
