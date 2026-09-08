package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes3.dex */
public final class q61 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ s61 b;

    public /* synthetic */ q61(s61 s61Var, int i10) {
        this.a = i10;
        this.b = s61Var;
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
                s61 s61Var = this.b;
                s61Var.N = 0.0f;
                s61Var.I = null;
                s61Var.M = false;
                s61Var.d(true, false);
                break;
        }
    }
}
