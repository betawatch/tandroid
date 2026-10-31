package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class b20 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ g20 b;

    public /* synthetic */ b20(g20 g20Var, int i10) {
        this.a = i10;
        this.b = g20Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                g20 g20Var = this.b;
                g20Var.b.setVisibility(8);
                g20Var.D = false;
                g20Var.E = 0.0f;
                break;
            default:
                this.b.e.setVisibility(8);
                break;
        }
    }
}
