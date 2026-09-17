package org.telegram.ui.Components.voip;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-09da8b159cf36792e88674cebe3dc77c7407e16cea1bdebcb1e8ccd47061bd65 */
/* loaded from: classes3.dex */
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
