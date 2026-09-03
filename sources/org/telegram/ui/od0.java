package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final class od0 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ og0 b;

    public /* synthetic */ od0(og0 og0Var, int i10) {
        this.a = i10;
        this.b = og0Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                og0 og0Var = this.b;
                if (og0Var.d == animator) {
                    og0Var.d = null;
                    break;
                }
                break;
            default:
                og0 og0Var2 = this.b;
                og0Var2.c.setVisibility(8);
                if (og0Var2.d == animator) {
                    og0Var2.d = null;
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
