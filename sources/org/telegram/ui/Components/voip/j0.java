package org.telegram.ui.Components.voip;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-518d3e50826c848a68038d28135b875c492a3e734bb6bb5b9a39b192f8b0e064 */
/* loaded from: classes3.dex */
public final class j0 extends AnimatorListenerAdapter {
    public final /* synthetic */ u a;
    public final /* synthetic */ m0 b;

    public j0(m0 m0Var, u uVar) {
        this.b = m0Var;
        this.a = uVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        u uVar = this.a;
        if (uVar.getParent() != null) {
            this.b.removeView(uVar);
            uVar.e();
        }
    }
}
