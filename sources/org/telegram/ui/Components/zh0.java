package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final class zh0 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ mi0 b;

    public /* synthetic */ zh0(mi0 mi0Var, int i7) {
        this.a = i7;
        this.b = mi0Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                super.onAnimationEnd(animator);
                this.b.M0.e();
                break;
            default:
                super.onAnimationEnd(animator);
                mi0 mi0Var = this.b;
                mi0Var.R = null;
                mi0Var.o0 = 0.0f;
                mi0Var.m0 = null;
                mi0Var.invalidate();
                break;
        }
    }
}
