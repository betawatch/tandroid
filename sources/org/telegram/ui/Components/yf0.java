package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
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
