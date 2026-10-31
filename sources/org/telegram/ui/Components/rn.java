package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class rn extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ sn b;

    public /* synthetic */ rn(sn snVar, int i10) {
        this.a = i10;
        this.b = snVar;
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
                sn snVar = this.b;
                if (snVar.Q == animator) {
                    snVar.getSubtitleTextView().setVisibility(4);
                    snVar.Q = null;
                    break;
                }
                break;
            default:
                this.b.Q = null;
                break;
        }
    }
}
