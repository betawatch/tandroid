package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes3.dex */
public final class g61 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ i61 b;

    public /* synthetic */ g61(i61 i61Var, int i10) {
        this.a = i10;
        this.b = i61Var;
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
                i61 i61Var = this.b;
                i61Var.N = 0.0f;
                i61Var.I = null;
                i61Var.M = false;
                i61Var.d(true, false);
                break;
        }
    }
}
