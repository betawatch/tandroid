package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class m51 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ o51 b;

    public /* synthetic */ m51(o51 o51Var, int i10) {
        this.a = i10;
        this.b = o51Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                super.onAnimationEnd(animator);
                this.b.I = null;
                break;
            case 1:
                super.onAnimationEnd(animator);
                this.b.I = null;
                break;
            default:
                super.onAnimationEnd(animator);
                o51 o51Var = this.b;
                o51Var.N = 0.0f;
                o51Var.I = null;
                o51Var.M = false;
                o51Var.d(true, false);
                break;
        }
    }
}
