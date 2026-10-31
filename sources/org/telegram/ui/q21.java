package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class q21 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ s21 b;

    public /* synthetic */ q21(s21 s21Var, int i10) {
        this.a = i10;
        this.b = s21Var;
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
                s21 s21Var = this.b;
                s21Var.N = 0.0f;
                s21Var.I = null;
                s21Var.M = false;
                s21Var.d(true, false);
                break;
        }
    }
}
