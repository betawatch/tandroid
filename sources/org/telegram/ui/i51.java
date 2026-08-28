package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class i51 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ k51 b;

    public /* synthetic */ i51(k51 k51Var, int i9) {
        this.a = i9;
        this.b = k51Var;
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
                k51 k51Var = this.b;
                k51Var.J = 0.0f;
                k51Var.E = null;
                k51Var.I = false;
                k51Var.d(true, false);
                break;
        }
    }
}
