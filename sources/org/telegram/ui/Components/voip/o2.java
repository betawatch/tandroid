package org.telegram.ui.Components.voip;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class o2 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ q2 b;

    public /* synthetic */ o2(q2 q2Var, int i10) {
        this.a = i10;
        this.b = q2Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                q2 q2Var = this.b;
                q2Var.r = 0;
                q2Var.invalidate();
                break;
            default:
                q2 q2Var2 = this.b;
                q2Var2.s = 0;
                q2Var2.invalidate();
                break;
        }
    }
}
