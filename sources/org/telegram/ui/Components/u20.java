package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final class u20 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ w20 b;

    public /* synthetic */ u20(w20 w20Var, int i7) {
        this.a = i7;
        this.b = w20Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                w20 w20Var = this.b;
                if (w20Var.c0 == animator) {
                    w20Var.c0 = null;
                    w20Var.b();
                    break;
                }
                break;
            default:
                w20 w20Var2 = this.b;
                if (w20Var2.b0 == animator) {
                    w20Var2.b0 = null;
                    break;
                }
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
        switch (this.a) {
            case 1:
                v20 v20Var = this.b.a0;
                if (v20Var != null) {
                    ((org.telegram.ui.uo0) v20Var).a.f0.requestLayout();
                    break;
                }
                break;
            default:
                super.onAnimationStart(animator);
                break;
        }
    }
}
