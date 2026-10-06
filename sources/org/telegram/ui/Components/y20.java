package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-995671d6bce0aaeb91824b65f2f1988c5410eae59f1d5d7c368a0027313cc0ad */
/* loaded from: classes3.dex */
public final class y20 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ d30 b;

    public /* synthetic */ y20(d30 d30Var, int i10) {
        this.a = i10;
        this.b = d30Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                d30 d30Var = this.b;
                d30Var.b.setVisibility(8);
                d30Var.y = false;
                d30Var.E = 0.0f;
                break;
            default:
                this.b.e.setVisibility(8);
                break;
        }
    }
}
