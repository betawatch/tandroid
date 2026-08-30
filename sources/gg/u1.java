package gg;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final class u1 extends AnimatorListenerAdapter {
    public final /* synthetic */ s1 a;
    public final /* synthetic */ v1 b;

    public u1(v1 v1Var, s1 s1Var) {
        this.b = v1Var;
        this.a = s1Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        s1 s1Var = this.a;
        s1Var.setLayerType(0, null);
        this.b.d.removeView(s1Var);
    }
}
