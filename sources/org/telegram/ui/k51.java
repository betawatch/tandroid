package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class k51 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ m51 b;

    public /* synthetic */ k51(m51 m51Var, int i10) {
        this.a = i10;
        this.b = m51Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                super.onAnimationEnd(animator);
                this.b.E = null;
                break;
            case 1:
                super.onAnimationEnd(animator);
                this.b.E = null;
                break;
            default:
                super.onAnimationEnd(animator);
                m51 m51Var = this.b;
                m51Var.J = 0.0f;
                m51Var.E = null;
                m51Var.I = false;
                m51Var.d(true, false);
                break;
        }
    }
}
