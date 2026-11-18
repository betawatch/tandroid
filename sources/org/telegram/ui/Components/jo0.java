package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final class jo0 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ yo0 c;

    public /* synthetic */ jo0(yo0 yo0Var, boolean z10, int i7) {
        this.a = i7;
        this.c = yo0Var;
        this.b = z10;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        switch (this.a) {
            case 0:
                AnimatorSet[] animatorSetArr = this.c.P1;
                AnimatorSet animatorSet = animatorSetArr[0];
                if (animatorSet != null && animatorSet.equals(animator)) {
                    animatorSetArr[0] = null;
                    break;
                }
                break;
            default:
                yo0 yo0Var = this.c;
                if (animator.equals(yo0Var.z1)) {
                    yo0Var.z1 = null;
                    break;
                }
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                yo0 yo0Var = this.c;
                AnimatorSet[] animatorSetArr = yo0Var.P1;
                AnimatorSet animatorSet = animatorSetArr[0];
                if (animatorSet != null && animatorSet.equals(animator)) {
                    if (!this.b) {
                        yo0Var.O1[0].setVisibility(4);
                    }
                    animatorSetArr[0] = null;
                    break;
                }
                break;
            default:
                yo0 yo0Var2 = this.c;
                FrameLayout frameLayout = yo0Var2.r1;
                if (animator.equals(yo0Var2.z1)) {
                    if (!this.b) {
                        yo0Var2.n1.setVisibility(4);
                        FrameLayout frameLayout2 = yo0Var2.Y1;
                        if (frameLayout2 != null && frameLayout == null) {
                            frameLayout2.setVisibility(4);
                        }
                        yo0Var2.q1.setVisibility(4);
                    } else if (frameLayout != null) {
                        frameLayout.setVisibility(4);
                    }
                    yo0Var2.z1 = null;
                    break;
                }
                break;
        }
    }
}
