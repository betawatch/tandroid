package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes3.dex */
public final class yf0 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ PipRoundVideoView b;

    public /* synthetic */ yf0(PipRoundVideoView pipRoundVideoView, int i10) {
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
