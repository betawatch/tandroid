package org.telegram.ui.Components.voip;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes.dex */
public final class h0 extends AnimatorListenerAdapter {
    public final /* synthetic */ t a;
    public final /* synthetic */ k0 b;

    public h0(k0 k0Var, t tVar) {
        this.b = k0Var;
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
