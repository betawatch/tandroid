package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes3.dex */
public final class qp0 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ hq0 c;

    public /* synthetic */ qp0(hq0 hq0Var, boolean z10, int i10) {
        this.a = i10;
        this.c = hq0Var;
        this.b = z10;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        switch (this.a) {
            case 0:
                AnimatorSet[] animatorSetArr = this.c.T;
                AnimatorSet animatorSet = animatorSetArr[0];
                if (animatorSet != null && animatorSet.equals(animator)) {
                    animatorSetArr[0] = null;
                    break;
                }
                break;
            default:
                hq0 hq0Var = this.c;
                if (animator.equals(hq0Var.y)) {
                    hq0Var.y = null;
                    break;
                }
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                hq0 hq0Var = this.c;
                AnimatorSet[] animatorSetArr = hq0Var.T;
                AnimatorSet animatorSet = animatorSetArr[0];
                if (animatorSet != null && animatorSet.equals(animator)) {
                    if (!this.b) {
                        hq0Var.S[0].setVisibility(4);
                    }
                    animatorSetArr[0] = null;
                    break;
                }
                break;
            default:
                hq0 hq0Var2 = this.c;
                FrameLayout frameLayout = hq0Var2.h;
                if (animator.equals(hq0Var2.y)) {
                    if (!this.b) {
                        hq0Var2.c.setVisibility(4);
                        FrameLayout frameLayout2 = hq0Var2.c0;
                        if (frameLayout2 != null && frameLayout == null) {
                            frameLayout2.setVisibility(4);
                        }
                        hq0Var2.f.setVisibility(4);
                    } else if (frameLayout != null) {
                        frameLayout.setVisibility(4);
                    }
                    hq0Var2.y = null;
                    break;
                }
                break;
        }
    }
}
