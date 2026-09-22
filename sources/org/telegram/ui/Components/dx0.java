package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
/* loaded from: classes3.dex */
public final class dx0 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ ex0 b;

    public /* synthetic */ dx0(ex0 ex0Var, int i10) {
        this.a = i10;
        this.b = ex0Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                ex0 ex0Var = this.b;
                ex0Var.y = 1.0f;
                ex0Var.invalidate();
                ex0Var.G = null;
                break;
            case 1:
                ex0 ex0Var2 = this.b;
                ex0Var2.m(((Float) ex0Var2.v.getAnimatedValue()).floatValue());
                ex0Var2.v = null;
                break;
            default:
                super.onAnimationEnd(animator);
                this.b.F = null;
                break;
        }
    }
}
