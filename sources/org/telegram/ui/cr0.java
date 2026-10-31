package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.ViewPropertyAnimator;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class cr0 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ PhotoViewer c;

    public /* synthetic */ cr0(PhotoViewer photoViewer, int i10, int i11) {
        this.a = i11;
        this.c = photoViewer;
        this.b = i10;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                PhotoViewer photoViewer = this.c;
                dr0 dr0Var = photoViewer.N1;
                dr0Var.e.setVisibility(0);
                FrameLayout frameLayout = dr0Var.r;
                frameLayout.setVisibility(0);
                frameLayout.setTranslationY(org.telegram.messenger.i0.L(18.0f));
                ViewPropertyAnimator translationY = frameLayout.animate().alpha(1.0f).translationY(0.0f);
                org.telegram.ui.Components.gr grVar = org.telegram.ui.Components.gr.h;
                org.telegram.messenger.z20.m(translationY, grVar, 320L);
                dr0Var.x.animate().alpha(1.0f).translationX(0.0f).setInterpolator(grVar).setDuration(320L).start();
                photoViewer.u4 = this.b;
                photoViewer.q6 = null;
                photoViewer.o6 = -1;
                break;
            default:
                int i10 = this.b;
                PhotoViewer photoViewer2 = this.c;
                photoViewer2.u4 = i10;
                photoViewer2.q6 = null;
                photoViewer2.o6 = -1;
                break;
        }
    }
}
