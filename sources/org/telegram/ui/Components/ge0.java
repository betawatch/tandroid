package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final class ge0 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ fi.t8 b;

    public /* synthetic */ ge0(fi.t8 t8Var, int i10) {
        this.a = i10;
        this.b = t8Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                fi.t8 t8Var = this.b;
                AnimatorSet animatorSet = (AnimatorSet) t8Var.e;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    t8Var.e = null;
                    break;
                }
                break;
            case 1:
                fi.t8 t8Var2 = this.b;
                AnimatorSet animatorSet2 = (AnimatorSet) t8Var2.e;
                if (animatorSet2 != null && animatorSet2.equals(animator)) {
                    t8Var2.e = null;
                    break;
                }
                break;
            default:
                fi.t8 t8Var3 = this.b;
                AnimatorSet animatorSet3 = (AnimatorSet) t8Var3.e;
                if (animatorSet3 != null && animatorSet3.equals(animator)) {
                    t8Var3.e = null;
                    break;
                }
                break;
        }
    }
}
