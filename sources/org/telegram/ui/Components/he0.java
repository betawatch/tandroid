package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class he0 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ fi.t8 b;

    public /* synthetic */ he0(fi.t8 t8Var, int i10) {
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
