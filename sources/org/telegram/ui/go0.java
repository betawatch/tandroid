package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final class go0 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ po0 c;

    public /* synthetic */ go0(po0 po0Var, boolean z10, int i10) {
        this.a = i10;
        this.c = po0Var;
        this.b = z10;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        switch (this.a) {
            case 0:
                po0 po0Var = this.c;
                AnimatorSet animatorSet = po0Var.v;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    po0Var.v = null;
                    break;
                }
                break;
            default:
                po0 po0Var2 = this.c;
                AnimatorSet animatorSet2 = po0Var2.v;
                if (animatorSet2 != null && animatorSet2.equals(animator)) {
                    po0Var2.v = null;
                    break;
                }
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                po0 po0Var = this.c;
                AnimatorSet animatorSet = po0Var.v;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    if (!this.b) {
                        po0Var.r.setVisibility(4);
                        break;
                    } else {
                        po0Var.n.getContentView().setVisibility(4);
                        break;
                    }
                }
                break;
            default:
                po0 po0Var2 = this.c;
                AnimatorSet animatorSet2 = po0Var2.v;
                if (animatorSet2 != null && animatorSet2.equals(animator)) {
                    if (!this.b) {
                        po0Var2.s.setVisibility(4);
                        break;
                    } else {
                        po0Var2.U.setVisibility(4);
                        break;
                    }
                }
                break;
        }
    }
}
