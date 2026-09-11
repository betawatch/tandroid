package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;

/* compiled from: r8-map-id-1181a9f210c4244598aa36bb39e1460f3842f305ed8c0c95af755ee091fedd7d */
/* loaded from: classes3.dex */
public final class od0 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ di.l9 b;

    public /* synthetic */ od0(di.l9 l9Var, int i10) {
        this.a = i10;
        this.b = l9Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                di.l9 l9Var = this.b;
                AnimatorSet animatorSet = (AnimatorSet) l9Var.e;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    l9Var.e = null;
                    break;
                }
                break;
            case 1:
                di.l9 l9Var2 = this.b;
                AnimatorSet animatorSet2 = (AnimatorSet) l9Var2.e;
                if (animatorSet2 != null && animatorSet2.equals(animator)) {
                    l9Var2.e = null;
                    break;
                }
                break;
            default:
                di.l9 l9Var3 = this.b;
                AnimatorSet animatorSet3 = (AnimatorSet) l9Var3.e;
                if (animatorSet3 != null && animatorSet3.equals(animator)) {
                    l9Var3.e = null;
                    break;
                }
                break;
        }
    }
}
