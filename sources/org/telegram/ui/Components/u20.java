package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes3.dex */
public final class u20 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ z20 b;

    public /* synthetic */ u20(z20 z20Var, int i10) {
        this.a = i10;
        this.b = z20Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                z20 z20Var = this.b;
                z20Var.b.setVisibility(8);
                z20Var.y = false;
                z20Var.E = 0.0f;
                break;
            default:
                this.b.e.setVisibility(8);
                break;
        }
    }
}
