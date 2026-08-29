package org.telegram.ui.Components.voip;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public final class k0 extends AnimatorListenerAdapter {
    public final /* synthetic */ u a;
    public final /* synthetic */ l0 b;

    public k0(l0 l0Var, u uVar) {
        this.b = l0Var;
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
