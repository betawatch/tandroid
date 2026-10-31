package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class l7 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ w7 b;

    public /* synthetic */ l7(w7 w7Var, int i10) {
        this.a = i10;
        this.b = w7Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationCancel(Animator animator) {
        switch (this.a) {
            case 2:
                this.b.s2 = null;
                break;
            default:
                super.onAnimationCancel(animator);
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                this.b.c2 = false;
                break;
            case 1:
                w7 w7Var = this.b;
                w7Var.Y1.setVisibility(4);
                w7Var.Z1.setImageBitmap(null);
                w7Var.c2 = false;
                break;
        }
    }

    private final void a(Animator animator) {
    }
}
