package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-518d3e50826c848a68038d28135b875c492a3e734bb6bb5b9a39b192f8b0e064 */
/* loaded from: classes3.dex */
public final class x20 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ c30 b;

    public /* synthetic */ x20(c30 c30Var, int i10) {
        this.a = i10;
        this.b = c30Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                c30 c30Var = this.b;
                c30Var.b.setVisibility(8);
                c30Var.y = false;
                c30Var.E = 0.0f;
                break;
            default:
                this.b.e.setVisibility(8);
                break;
        }
    }
}
