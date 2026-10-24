package org.telegram.ui.Components.voip;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes4.dex */
public final class k0 extends AnimatorListenerAdapter {
    public final /* synthetic */ t a;
    public final /* synthetic */ l0 b;

    public k0(l0 l0Var, t tVar) {
        this.b = l0Var;
        this.a = tVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        t tVar = this.a;
        if (tVar.getParent() != null) {
            this.b.removeView(tVar);
            tVar.e();
        }
    }
}
