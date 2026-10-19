package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-425f9d3693dca7cdb7b1343a62ca29dd4bfbf482fa37d742abbdfab31448a8bd */
/* loaded from: classes3.dex */
public final class e51 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ g51 b;

    public /* synthetic */ e51(g51 g51Var, int i10) {
        this.a = i10;
        this.b = g51Var;
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
                g51 g51Var = this.b;
                g51Var.N = 0.0f;
                g51Var.I = null;
                g51Var.M = false;
                g51Var.d(true, false);
                break;
        }
    }
}
