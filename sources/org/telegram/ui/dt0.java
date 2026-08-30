package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.ViewPropertyAnimator;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final class dt0 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ PhotoViewer c;

    public /* synthetic */ dt0(PhotoViewer photoViewer, int i10, int i11) {
        this.a = i11;
        this.c = photoViewer;
        this.b = i10;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                PhotoViewer photoViewer = this.c;
                et0 et0Var = photoViewer.K1;
                et0Var.e.setVisibility(0);
                FrameLayout frameLayout = et0Var.r;
                frameLayout.setVisibility(0);
                frameLayout.setTranslationY(AndroidUtilities.dp(18.0f));
                ViewPropertyAnimator translationY = frameLayout.animate().alpha(1.0f).translationY(0.0f);
                org.telegram.ui.Components.nr nrVar = org.telegram.ui.Components.nr.h;
                b.p(translationY, nrVar, 320L);
                et0Var.w.animate().alpha(1.0f).translationX(0.0f).setInterpolator(nrVar).setDuration(320L).start();
                photoViewer.r4 = this.b;
                photoViewer.n6 = null;
                photoViewer.l6 = -1;
                break;
            default:
                int i10 = this.b;
                PhotoViewer photoViewer2 = this.c;
                photoViewer2.r4 = i10;
                photoViewer2.n6 = null;
                photoViewer2.l6 = -1;
                break;
        }
    }
}
