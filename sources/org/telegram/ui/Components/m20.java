package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final class m20 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ o20 b;

    public /* synthetic */ m20(o20 o20Var, int i7) {
        this.a = i7;
        this.b = o20Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                o20 o20Var = this.b;
                if (o20Var.c0 == animator) {
                    o20Var.c0 = null;
                    o20Var.b();
                    break;
                }
                break;
            default:
                o20 o20Var2 = this.b;
                if (o20Var2.b0 == animator) {
                    o20Var2.b0 = null;
                    break;
                }
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
        switch (this.a) {
            case 1:
                n20 n20Var = this.b.a0;
                if (n20Var != null) {
                    ((org.telegram.ui.ro0) n20Var).a.f0.requestLayout();
                    break;
                }
                break;
            default:
                super.onAnimationStart(animator);
                break;
        }
    }
}
