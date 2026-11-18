package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes3.dex */
public final class te0 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ PipRoundVideoView b;

    public /* synthetic */ te0(PipRoundVideoView pipRoundVideoView, int i7) {
        this.a = i7;
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
