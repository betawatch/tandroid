package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-c0e607070f32dbde65005355ff6c489b77f9395a3e0f8720848e2402860dea84 */
/* loaded from: classes3.dex */
public final class i70 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ j70 b;

    public /* synthetic */ i70(j70 j70Var, int i10) {
        this.a = i10;
        this.b = j70Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                j70 j70Var = this.b;
                j70Var.e.d0 = null;
                j70Var.requestLayout();
                break;
            default:
                j70 j70Var2 = this.b;
                j70Var2.e.d0 = null;
                j70Var2.a = false;
                break;
        }
    }
}
