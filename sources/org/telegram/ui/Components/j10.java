package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class j10 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ k10 b;

    public /* synthetic */ j10(k10 k10Var, int i10) {
        this.a = i10;
        this.b = k10Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                k10 k10Var = this.b;
                org.telegram.messenger.zs.f(k10Var.r.a).j(k10Var.f);
                k10Var.requestLayout();
                break;
            default:
                k10 k10Var2 = this.b;
                k10Var2.d = null;
                k10Var2.a = null;
                k10Var2.b = false;
                break;
        }
    }
}
