package org.telegram.ui.ActionBar;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.transition.TransitionValues;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class h extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ TransitionValues b;

    public /* synthetic */ h(TransitionValues transitionValues, int i10) {
        this.a = i10;
        this.b = transitionValues;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                super.onAnimationEnd(animator);
                this.b.view.setLayerType(0, null);
                break;
            default:
                super.onAnimationEnd(animator);
                this.b.view.setEnabled(true);
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        switch (this.a) {
            case 0:
                super.onAnimationStart(animator);
                this.b.view.setLayerType(2, null);
                break;
            default:
                super.onAnimationStart(animator);
                this.b.view.setEnabled(false);
                break;
        }
    }
}
