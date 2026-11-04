package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class fp0 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ gp0 b;

    public fp0(gp0 gp0Var, int i3) {
        this.b = gp0Var;
        this.a = i3;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        if (this.b.b.l8) {
            PhotoViewer photoViewer = this.b.b;
            if (photoViewer.s1) {
                photoViewer.E3();
            }
        }
        if (this.a == 3) {
            PhotoViewer photoViewer2 = this.b.b;
            photoViewer2.J2(photoViewer2.Q4, false, true, true);
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        PhotoViewer photoViewer = this.b.b;
        photoViewer.Q0.setVisibility(0);
        if (photoViewer.H3()) {
            photoViewer.o0.setVisibility(0);
        } else {
            photoViewer.T0.setVisibility(0);
        }
        photoViewer.G.setVisibility(0);
        if (photoViewer.j2) {
            cq0 cq0Var = photoViewer.R1;
            cq0Var.setVisibility(cq0Var.getTag() != null ? 0 : 4);
        }
        if (photoViewer.e2 || photoViewer.f2) {
            return;
        }
        int i3 = photoViewer.d2;
        if ((i3 == 0 || i3 == 4 || ((i3 == 2 || i3 == 5) && photoViewer.h7.size() > 1)) && !photoViewer.g4) {
            photoViewer.O0.setVisibility(0);
            photoViewer.P0.setVisibility(0);
            photoViewer.v3();
        }
    }
}
