package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.ViewPropertyAnimator;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final class au0 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ PhotoViewer c;

    public /* synthetic */ au0(PhotoViewer photoViewer, int i10, int i11) {
        this.a = i11;
        this.c = photoViewer;
        this.b = i10;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                PhotoViewer photoViewer = this.c;
                bu0 bu0Var = photoViewer.N1;
                bu0Var.e.setVisibility(0);
                FrameLayout frameLayout = bu0Var.r;
                frameLayout.setVisibility(0);
                frameLayout.setTranslationY(AndroidUtilities.dp(18.0f));
                ViewPropertyAnimator translationY = frameLayout.animate().alpha(1.0f).translationY(0.0f);
                org.telegram.ui.Components.qr qrVar = org.telegram.ui.Components.qr.h;
                org.telegram.messenger.wl.q(translationY, qrVar, 320L);
                bu0Var.w.animate().alpha(1.0f).translationX(0.0f).setInterpolator(qrVar).setDuration(320L).start();
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
