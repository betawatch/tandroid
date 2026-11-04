package org.telegram.ui.Components.voip;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.ViewGroup;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class h0 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ l0 b;

    public /* synthetic */ h0(l0 l0Var, int i3) {
        this.a = i3;
        this.b = l0Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                super.onAnimationEnd(animator);
                l0 l0Var = this.b;
                if (l0Var.getParent() != null) {
                    ((ViewGroup) l0Var.getParent()).removeView(l0Var);
                    break;
                }
                break;
            case 1:
                l0 l0Var2 = this.b;
                if (l0Var2.getParent() != null) {
                    ((ViewGroup) l0Var2.getParent()).removeView(l0Var2);
                    break;
                }
                break;
            default:
                super.onAnimationEnd(animator);
                l0 l0Var3 = this.b;
                if (l0Var3.getParent() != null) {
                    ((ViewGroup) l0Var3.getParent()).removeView(l0Var3);
                    break;
                }
                break;
        }
    }
}
