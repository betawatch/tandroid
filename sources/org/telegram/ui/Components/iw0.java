package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class iw0 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ jw0 b;

    public /* synthetic */ iw0(jw0 jw0Var, int i10) {
        this.a = i10;
        this.b = jw0Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                jw0 jw0Var = this.b;
                jw0Var.y = 1.0f;
                jw0Var.invalidate();
                jw0Var.C = null;
                break;
            case 1:
                jw0 jw0Var2 = this.b;
                jw0Var2.m(((Float) jw0Var2.v.getAnimatedValue()).floatValue());
                jw0Var2.v = null;
                break;
            default:
                super.onAnimationEnd(animator);
                this.b.B = null;
                break;
        }
    }
}
