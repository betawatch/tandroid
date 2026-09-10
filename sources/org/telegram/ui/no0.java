package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final class no0 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ wo0 c;

    public /* synthetic */ no0(wo0 wo0Var, boolean z10, int i10) {
        this.a = i10;
        this.c = wo0Var;
        this.b = z10;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        switch (this.a) {
            case 0:
                wo0 wo0Var = this.c;
                AnimatorSet animatorSet = wo0Var.v;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    wo0Var.v = null;
                    break;
                }
                break;
            default:
                wo0 wo0Var2 = this.c;
                AnimatorSet animatorSet2 = wo0Var2.v;
                if (animatorSet2 != null && animatorSet2.equals(animator)) {
                    wo0Var2.v = null;
                    break;
                }
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                wo0 wo0Var = this.c;
                AnimatorSet animatorSet = wo0Var.v;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    if (!this.b) {
                        wo0Var.r.setVisibility(4);
                        break;
                    } else {
                        wo0Var.n.getContentView().setVisibility(4);
                        break;
                    }
                }
                break;
            default:
                wo0 wo0Var2 = this.c;
                AnimatorSet animatorSet2 = wo0Var2.v;
                if (animatorSet2 != null && animatorSet2.equals(animator)) {
                    if (!this.b) {
                        wo0Var2.s.setVisibility(4);
                        break;
                    } else {
                        wo0Var2.U.setVisibility(4);
                        break;
                    }
                }
                break;
        }
    }
}
