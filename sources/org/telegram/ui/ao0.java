package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final class ao0 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ jo0 c;

    public /* synthetic */ ao0(jo0 jo0Var, boolean z4, int i10) {
        this.a = i10;
        this.c = jo0Var;
        this.b = z4;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        switch (this.a) {
            case 0:
                jo0 jo0Var = this.c;
                AnimatorSet animatorSet = jo0Var.v;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    jo0Var.v = null;
                    break;
                }
                break;
            default:
                jo0 jo0Var2 = this.c;
                AnimatorSet animatorSet2 = jo0Var2.v;
                if (animatorSet2 != null && animatorSet2.equals(animator)) {
                    jo0Var2.v = null;
                    break;
                }
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                jo0 jo0Var = this.c;
                AnimatorSet animatorSet = jo0Var.v;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    if (!this.b) {
                        jo0Var.r.setVisibility(4);
                        break;
                    } else {
                        jo0Var.n.getContentView().setVisibility(4);
                        break;
                    }
                }
                break;
            default:
                jo0 jo0Var2 = this.c;
                AnimatorSet animatorSet2 = jo0Var2.v;
                if (animatorSet2 != null && animatorSet2.equals(animator)) {
                    if (!this.b) {
                        jo0Var2.s.setVisibility(4);
                        break;
                    } else {
                        jo0Var2.R.setVisibility(4);
                        break;
                    }
                }
                break;
        }
    }
}
