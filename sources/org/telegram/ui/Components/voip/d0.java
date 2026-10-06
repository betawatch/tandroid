package org.telegram.ui.Components.voip;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-995671d6bce0aaeb91824b65f2f1988c5410eae59f1d5d7c368a0027313cc0ad */
/* loaded from: classes3.dex */
public final class d0 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ m0 b;

    public /* synthetic */ d0(m0 m0Var, int i10) {
        this.a = i10;
        this.b = m0Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                super.onAnimationEnd(animator);
                m0 m0Var = this.b;
                m0Var.J0 = null;
                m0Var.I0 = 0.0f;
                m0Var.invalidate();
                break;
            default:
                m0 m0Var2 = this.b;
                m0Var2.B0 = null;
                m0Var2.y0 = 1.0f;
                m0Var2.r0 = 0.0f;
                m0Var2.s0 = 0.0f;
                m0Var2.invalidate();
                break;
        }
    }
}
