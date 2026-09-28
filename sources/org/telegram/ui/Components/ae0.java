package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;

/* compiled from: r8-map-id-c7458e893fd6f3e0a6fbf27724068aa00f1caa233b10a33d542967499303009b */
/* loaded from: classes3.dex */
public final class ae0 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ ci.j9 b;

    public /* synthetic */ ae0(ci.j9 j9Var, int i10) {
        this.a = i10;
        this.b = j9Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                ci.j9 j9Var = this.b;
                AnimatorSet animatorSet = (AnimatorSet) j9Var.e;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    j9Var.e = null;
                    break;
                }
                break;
            case 1:
                ci.j9 j9Var2 = this.b;
                AnimatorSet animatorSet2 = (AnimatorSet) j9Var2.e;
                if (animatorSet2 != null && animatorSet2.equals(animator)) {
                    j9Var2.e = null;
                    break;
                }
                break;
            default:
                ci.j9 j9Var3 = this.b;
                AnimatorSet animatorSet3 = (AnimatorSet) j9Var3.e;
                if (animatorSet3 != null && animatorSet3.equals(animator)) {
                    j9Var3.e = null;
                    break;
                }
                break;
        }
    }
}
