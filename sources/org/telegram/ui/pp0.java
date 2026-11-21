package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes3.dex */
public final class pp0 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ qp0 b;

    public pp0(qp0 qp0Var, int i7) {
        this.b = qp0Var;
        this.a = i7;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        if (this.b.b.k8) {
            PhotoViewer photoViewer = this.b.b;
            if (photoViewer.s1) {
                photoViewer.A3();
            }
        }
        if (this.a == 3) {
            PhotoViewer photoViewer2 = this.b.b;
            photoViewer2.E2(photoViewer2.P4, false, true, true);
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        PhotoViewer photoViewer = this.b.b;
        photoViewer.Q0.setVisibility(0);
        if (photoViewer.D3()) {
            photoViewer.o0.setVisibility(0);
        } else {
            photoViewer.T0.setVisibility(0);
        }
        photoViewer.G.setVisibility(0);
        if (photoViewer.j2) {
            mq0 mq0Var = photoViewer.R1;
            mq0Var.setVisibility(mq0Var.getTag() != null ? 0 : 4);
        }
        if (photoViewer.e2 || photoViewer.f2) {
            return;
        }
        int i7 = photoViewer.d2;
        if ((i7 == 0 || i7 == 4 || ((i7 == 2 || i7 == 5) && photoViewer.g7.size() > 1)) && !photoViewer.f4) {
            photoViewer.O0.setVisibility(0);
            photoViewer.P0.setVisibility(0);
            photoViewer.q3();
        }
    }
}
