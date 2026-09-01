package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final class fg0 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ PipRoundVideoView b;

    public /* synthetic */ fg0(PipRoundVideoView pipRoundVideoView, int i10) {
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
