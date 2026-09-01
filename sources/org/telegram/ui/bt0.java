package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final class bt0 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ ct0 b;

    public bt0(ct0 ct0Var, int i10) {
        this.b = ct0Var;
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
            yt0 yt0Var = photoViewer.N1;
            yt0Var.setVisibility(yt0Var.getTag() != null ? 0 : 4);
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
