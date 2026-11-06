package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes3.dex */
public final class zb0 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ fi.a8 b;

    public /* synthetic */ zb0(fi.a8 a8Var, int i7) {
        this.a = i7;
        this.b = a8Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                fi.a8 a8Var = this.b;
                AnimatorSet animatorSet = (AnimatorSet) a8Var.e;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    a8Var.e = null;
                    break;
                }
                break;
            case 1:
                fi.a8 a8Var2 = this.b;
                AnimatorSet animatorSet2 = (AnimatorSet) a8Var2.e;
                if (animatorSet2 != null && animatorSet2.equals(animator)) {
                    a8Var2.e = null;
                    break;
                }
                break;
            default:
                fi.a8 a8Var3 = this.b;
                AnimatorSet animatorSet3 = (AnimatorSet) a8Var3.e;
                if (animatorSet3 != null && animatorSet3.equals(animator)) {
                    a8Var3.e = null;
                    break;
                }
                break;
        }
    }
}
