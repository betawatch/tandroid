package org.telegram.ui.Components.voip;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.ViewGroup;

/* compiled from: r8-map-id-8159789691d0b3bb0641ef1f4646484974d69719884d0b33e845acec3d7c3062 */
/* loaded from: classes3.dex */
public final class z0 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ d1 b;

    public /* synthetic */ z0(d1 d1Var, int i10) {
        this.a = i10;
        this.b = d1Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                super.onAnimationEnd(animator);
                d1 d1Var = this.b;
                if (d1Var.getParent() != null) {
                    ((ViewGroup) d1Var.getParent()).removeView(d1Var);
                    break;
                }
                break;
            case 1:
                d1 d1Var2 = this.b;
                if (d1Var2.getParent() != null) {
                    ((ViewGroup) d1Var2.getParent()).removeView(d1Var2);
                    break;
                }
                break;
            default:
                super.onAnimationEnd(animator);
                d1 d1Var3 = this.b;
                if (d1Var3.getParent() != null) {
                    ((ViewGroup) d1Var3.getParent()).removeView(d1Var3);
                    break;
                }
                break;
        }
    }
}
