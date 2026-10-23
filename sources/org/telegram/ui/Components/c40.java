package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-6bb23a39fe2d1bb2dc6cc69f606436ba751c240cf93e0ff97ff041cb9f09a305 */
/* loaded from: classes3.dex */
public final class c40 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ e40 b;

    public /* synthetic */ c40(e40 e40Var, int i10) {
        this.a = i10;
        this.b = e40Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                e40 e40Var = this.b;
                if (e40Var.b0 == animator) {
                    e40Var.b0 = null;
                    e40Var.b();
                    break;
                }
                break;
            default:
                e40 e40Var2 = this.b;
                if (e40Var2.a0 == animator) {
                    e40Var2.a0 = null;
                    break;
                }
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
        switch (this.a) {
            case 1:
                d40 d40Var = this.b.W;
                if (d40Var != null) {
                    ((org.telegram.ui.es0) d40Var).a.e0.requestLayout();
                    break;
                }
                break;
            default:
                super.onAnimationStart(animator);
                break;
        }
    }
}
