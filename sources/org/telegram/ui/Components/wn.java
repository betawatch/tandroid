package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class wn extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ xn b;

    public /* synthetic */ wn(xn xnVar, int i10) {
        this.a = i10;
        this.b = xnVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationCancel(Animator animator) {
        switch (this.a) {
            case 0:
                this.b.M = null;
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
                xn xnVar = this.b;
                if (xnVar.M == animator) {
                    xnVar.getSubtitleTextView().setVisibility(4);
                    xnVar.M = null;
                    break;
                }
                break;
            default:
                this.b.M = null;
                break;
        }
    }
}
