package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-518d3e50826c848a68038d28135b875c492a3e734bb6bb5b9a39b192f8b0e064 */
/* loaded from: classes3.dex */
public final class m70 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ n70 b;

    public /* synthetic */ m70(n70 n70Var, int i10) {
        this.a = i10;
        this.b = n70Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                n70 n70Var = this.b;
                n70Var.e.d0 = null;
                n70Var.requestLayout();
                break;
            default:
                n70 n70Var2 = this.b;
                n70Var2.e.d0 = null;
                n70Var2.a = false;
                break;
        }
    }
}
