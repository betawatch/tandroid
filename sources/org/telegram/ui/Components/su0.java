package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes3.dex */
public final class su0 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ tu0 b;

    public /* synthetic */ su0(tu0 tu0Var, int i7) {
        this.a = i7;
        this.b = tu0Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                tu0 tu0Var = this.b;
                tu0Var.D = 1.0f;
                tu0Var.invalidate();
                tu0Var.G = null;
                break;
            case 1:
                tu0 tu0Var2 = this.b;
                tu0Var2.m(((Float) tu0Var2.w.getAnimatedValue()).floatValue());
                tu0Var2.w = null;
                break;
            default:
                super.onAnimationEnd(animator);
                this.b.F = null;
                break;
        }
    }
}
