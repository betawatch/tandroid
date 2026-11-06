package org.telegram.ui.ActionBar;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.transition.TransitionValues;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes3.dex */
public final class h extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ TransitionValues b;

    public /* synthetic */ h(TransitionValues transitionValues, int i7) {
        this.a = i7;
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
