package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-8e647ea09dd204f7fa56b0790cd1c6c7931fe567b34678ab0d221a9ad6af8f53 */
/* loaded from: classes3.dex */
public final class mx0 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ nx0 b;

    public /* synthetic */ mx0(nx0 nx0Var, int i10) {
        this.a = i10;
        this.b = nx0Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                nx0 nx0Var = this.b;
                nx0Var.y = 1.0f;
                nx0Var.invalidate();
                nx0Var.G = null;
                break;
            case 1:
                nx0 nx0Var2 = this.b;
                nx0Var2.m(((Float) nx0Var2.v.getAnimatedValue()).floatValue());
                nx0Var2.v = null;
                break;
            default:
                super.onAnimationEnd(animator);
                this.b.F = null;
                break;
        }
    }
}
