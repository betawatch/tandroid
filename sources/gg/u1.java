package gg;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
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
