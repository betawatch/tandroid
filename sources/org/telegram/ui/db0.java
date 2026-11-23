package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes3.dex */
public final class db0 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ de0 b;

    public /* synthetic */ db0(de0 de0Var, int i7) {
        this.a = i7;
        this.b = de0Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                de0 de0Var = this.b;
                if (de0Var.d == animator) {
                    de0Var.d = null;
                    break;
                }
                break;
            default:
                de0 de0Var2 = this.b;
                de0Var2.c.setVisibility(8);
                if (de0Var2.d == animator) {
                    de0Var2.d = null;
                    break;
                }
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
        switch (this.a) {
            case 0:
                this.b.c.setVisibility(0);
                break;
            default:
                super.onAnimationStart(animator);
                break;
        }
    }
}
