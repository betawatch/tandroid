package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes3.dex */
public final class co extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ eo b;

    public /* synthetic */ co(eo eoVar, int i10) {
        this.a = i10;
        this.b = eoVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationCancel(Animator animator) {
        switch (this.a) {
            case 0:
                this.b.Q = null;
                break;
            default:
                super.onAnimationCancel(animator);
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                eo eoVar = this.b;
                if (eoVar.Q == animator) {
                    eoVar.getSubtitleTextView().setVisibility(4);
                    eoVar.Q = null;
                    break;
                }
                break;
            default:
                this.b.Q = null;
                break;
        }
    }
}
