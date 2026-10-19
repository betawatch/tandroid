package org.telegram.ui.Components.voip;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-425f9d3693dca7cdb7b1343a62ca29dd4bfbf482fa37d742abbdfab31448a8bd */
/* loaded from: classes4.dex */
public final class z extends AnimatorListenerAdapter {
    public final /* synthetic */ t a;
    public final /* synthetic */ l0 b;

    public z(l0 l0Var, t tVar) {
        this.b = l0Var;
        this.a = tVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        l0 l0Var = this.b;
        l0Var.N0 = null;
        this.a.E = false;
        t tVar = l0Var.E;
        if (tVar != null) {
            if (tVar.getParent() != null) {
                l0Var.removeView(l0Var.E);
                l0Var.E.e();
            }
            l0Var.E = null;
        }
    }
}
