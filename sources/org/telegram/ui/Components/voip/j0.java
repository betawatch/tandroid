package org.telegram.ui.Components.voip;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
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
