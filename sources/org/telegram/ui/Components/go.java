package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-8e647ea09dd204f7fa56b0790cd1c6c7931fe567b34678ab0d221a9ad6af8f53 */
/* loaded from: classes3.dex */
public final class go extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ ho b;

    public /* synthetic */ go(ho hoVar, int i10) {
        this.a = i10;
        this.b = hoVar;
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
                ho hoVar = this.b;
                if (hoVar.Q == animator) {
                    hoVar.getSubtitleTextView().setVisibility(4);
                    hoVar.Q = null;
                    break;
                }
                break;
            default:
                this.b.Q = null;
                break;
        }
    }
}
