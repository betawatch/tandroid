package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final class uu0 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ vu0 b;

    public /* synthetic */ uu0(vu0 vu0Var, int i7) {
        this.a = i7;
        this.b = vu0Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                vu0 vu0Var = this.b;
                vu0Var.D = 1.0f;
                vu0Var.invalidate();
                vu0Var.G = null;
                break;
            case 1:
                vu0 vu0Var2 = this.b;
                vu0Var2.m(((Float) vu0Var2.w.getAnimatedValue()).floatValue());
                vu0Var2.w = null;
                break;
            default:
                super.onAnimationEnd(animator);
                this.b.F = null;
                break;
        }
    }
}
