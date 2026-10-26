package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final class j51 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ l51 b;

    public /* synthetic */ j51(l51 l51Var, int i10) {
        this.a = i10;
        this.b = l51Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                super.onAnimationEnd(animator);
                this.b.I = null;
                break;
            case 1:
                super.onAnimationEnd(animator);
                this.b.I = null;
                break;
            default:
                super.onAnimationEnd(animator);
                l51 l51Var = this.b;
                l51Var.N = 0.0f;
                l51Var.I = null;
                l51Var.M = false;
                l51Var.d(true, false);
                break;
        }
    }
}
