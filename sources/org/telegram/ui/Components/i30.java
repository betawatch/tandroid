package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class i30 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ k30 b;

    public /* synthetic */ i30(k30 k30Var, int i10) {
        this.a = i10;
        this.b = k30Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                k30 k30Var = this.b;
                if (k30Var.U == animator) {
                    k30Var.U = null;
                    k30Var.b();
                    break;
                }
                break;
            default:
                k30 k30Var2 = this.b;
                if (k30Var2.T == animator) {
                    k30Var2.T = null;
                    break;
                }
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
        switch (this.a) {
            case 1:
                j30 j30Var = this.b.S;
                if (j30Var != null) {
                    ((org.telegram.ui.tr0) j30Var).a.a0.requestLayout();
                    break;
                }
                break;
            default:
                super.onAnimationStart(animator);
                break;
        }
    }
}
