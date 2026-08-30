package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final class a70 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ b70 b;

    public /* synthetic */ a70(b70 b70Var, int i10) {
        this.a = i10;
        this.b = b70Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                b70 b70Var = this.b;
                b70Var.e.a0 = null;
                b70Var.requestLayout();
                break;
            default:
                b70 b70Var2 = this.b;
                b70Var2.e.a0 = null;
                b70Var2.a = false;
                break;
        }
    }
}
