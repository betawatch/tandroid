package org.telegram.ui.Components.voip;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.ViewGroup;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class g0 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ l0 b;

    public /* synthetic */ g0(l0 l0Var, int i10) {
        this.a = i10;
        this.b = l0Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                super.onAnimationEnd(animator);
                l0 l0Var = this.b;
                if (l0Var.getParent() != null) {
                    ((ViewGroup) l0Var.getParent()).removeView(l0Var);
                    break;
                }
                break;
            case 1:
                l0 l0Var2 = this.b;
                if (l0Var2.getParent() != null) {
                    ((ViewGroup) l0Var2.getParent()).removeView(l0Var2);
                    break;
                }
                break;
            default:
                super.onAnimationEnd(animator);
                l0 l0Var3 = this.b;
                if (l0Var3.getParent() != null) {
                    ((ViewGroup) l0Var3.getParent()).removeView(l0Var3);
                    break;
                }
                break;
        }
    }
}
