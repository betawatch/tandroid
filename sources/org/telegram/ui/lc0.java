package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class lc0 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ hf0 b;

    public /* synthetic */ lc0(hf0 hf0Var, int i10) {
        this.a = i10;
        this.b = hf0Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                hf0 hf0Var = this.b;
                if (hf0Var.d == animator) {
                    hf0Var.d = null;
                    break;
                }
                break;
            default:
                hf0 hf0Var2 = this.b;
                hf0Var2.c.setVisibility(8);
                if (hf0Var2.d == animator) {
                    hf0Var2.d = null;
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
