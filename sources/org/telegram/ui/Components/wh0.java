package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final class wh0 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ ji0 b;

    public /* synthetic */ wh0(ji0 ji0Var, int i7) {
        this.a = i7;
        this.b = ji0Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                super.onAnimationEnd(animator);
                this.b.L0.e();
                break;
            default:
                super.onAnimationEnd(animator);
                ji0 ji0Var = this.b;
                ji0Var.Q = null;
                ji0Var.n0 = 0.0f;
                ji0Var.l0 = null;
                ji0Var.invalidate();
                break;
        }
    }
}
