package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-c0e607070f32dbde65005355ff6c489b77f9395a3e0f8720848e2402860dea84 */
/* loaded from: classes3.dex */
public final class e50 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ b60 b;

    public /* synthetic */ e50(b60 b60Var, int i10) {
        this.a = i10;
        this.b = b60Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                b60 b60Var = this.b;
                if (animator.equals(b60Var.J)) {
                    b60Var.J = null;
                    break;
                }
                break;
            case 1:
                b60 b60Var2 = this.b;
                if (b60Var2.e1 != null) {
                    b60Var2.e1 = null;
                    break;
                }
                break;
            default:
                b60 b60Var3 = this.b;
                if (animator.equals(b60Var3.c0)) {
                    b60Var3.d(true);
                    b60Var3.Z0 = false;
                    b60Var3.setVisibility(4);
                    break;
                }
                break;
        }
    }
}
