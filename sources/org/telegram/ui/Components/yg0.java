package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes3.dex */
public final class yg0 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ PipRoundVideoView b;

    public /* synthetic */ yg0(PipRoundVideoView pipRoundVideoView, int i10) {
        this.a = i10;
        this.b = pipRoundVideoView;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                PipRoundVideoView pipRoundVideoView = this.b;
                if (animator.equals(pipRoundVideoView.r)) {
                    pipRoundVideoView.r = null;
                    break;
                }
                break;
            default:
                PipRoundVideoView pipRoundVideoView2 = this.b;
                pipRoundVideoView2.a(false);
                Runnable runnable = pipRoundVideoView2.s;
                if (runnable != null) {
                    runnable.run();
                    break;
                }
                break;
        }
    }
}
