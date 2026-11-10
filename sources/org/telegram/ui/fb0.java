package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class fb0 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ fe0 b;

    public /* synthetic */ fb0(fe0 fe0Var, int i7) {
        this.a = i7;
        this.b = fe0Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                fe0 fe0Var = this.b;
                if (fe0Var.d == animator) {
                    fe0Var.d = null;
                    break;
                }
                break;
            default:
                fe0 fe0Var2 = this.b;
                fe0Var2.c.setVisibility(8);
                if (fe0Var2.d == animator) {
                    fe0Var2.d = null;
                    break;
                }
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
        switch (this.a) {
            case 0:
                this.b.c.setVisibility(0);
                break;
            default:
                super.onAnimationStart(animator);
                break;
        }
    }
}
