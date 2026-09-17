package org.telegram.ui.Components.voip;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.ViewGroup;

/* compiled from: r8-map-id-e83daa4a3f4c5cc77b567d3f921056f729108399460aa18047e0e51e076a97b3 */
/* loaded from: classes3.dex */
public final class x0 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ b1 b;

    public /* synthetic */ x0(b1 b1Var, int i10) {
        this.a = i10;
        this.b = b1Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                super.onAnimationEnd(animator);
                b1 b1Var = this.b;
                if (b1Var.getParent() != null) {
                    ((ViewGroup) b1Var.getParent()).removeView(b1Var);
                    break;
                }
                break;
            case 1:
                b1 b1Var2 = this.b;
                if (b1Var2.getParent() != null) {
                    ((ViewGroup) b1Var2.getParent()).removeView(b1Var2);
                    break;
                }
                break;
            default:
                super.onAnimationEnd(animator);
                b1 b1Var3 = this.b;
                if (b1Var3.getParent() != null) {
                    ((ViewGroup) b1Var3.getParent()).removeView(b1Var3);
                    break;
                }
                break;
        }
    }
}
