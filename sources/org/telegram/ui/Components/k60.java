package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class k60 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ l60 b;

    public /* synthetic */ k60(l60 l60Var, int i10) {
        this.a = i10;
        this.b = l60Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                l60 l60Var = this.b;
                l60Var.e.U1 = null;
                l60Var.requestLayout();
                break;
            default:
                l60 l60Var2 = this.b;
                l60Var2.e.U1 = null;
                l60Var2.a = false;
                break;
        }
    }
}
