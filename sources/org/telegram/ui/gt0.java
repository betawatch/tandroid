package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class gt0 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ ht0 b;

    public gt0(ht0 ht0Var, int i10) {
        this.b = ht0Var;
        this.a = i10;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        if (this.b.b.g8) {
            PhotoViewer photoViewer = this.b.b;
            if (photoViewer.o1) {
                photoViewer.B3();
            }
        }
        if (this.a == 3) {
            PhotoViewer photoViewer2 = this.b.b;
            photoViewer2.G2(photoViewer2.M4, false, true, true);
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        PhotoViewer photoViewer = this.b.b;
        photoViewer.M0.setVisibility(0);
        if (photoViewer.E3()) {
            photoViewer.k0.setVisibility(0);
        } else {
            photoViewer.P0.setVisibility(0);
        }
        photoViewer.C.setVisibility(0);
        if (photoViewer.f2) {
            du0 du0Var = photoViewer.N1;
            du0Var.setVisibility(du0Var.getTag() != null ? 0 : 4);
        }
        if (photoViewer.a2 || photoViewer.b2) {
            return;
        }
        int i10 = photoViewer.Z1;
        if ((i10 == 0 || i10 == 4 || ((i10 == 2 || i10 == 5) && photoViewer.d7.size() > 1)) && !photoViewer.c4) {
            photoViewer.K0.setVisibility(0);
            photoViewer.L0.setVisibility(0);
            photoViewer.s3();
        }
    }
}
