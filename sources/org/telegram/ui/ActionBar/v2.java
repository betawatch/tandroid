package org.telegram.ui.ActionBar;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import org.telegram.messenger.zs;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class v2 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ w2 b;

    public /* synthetic */ v2(w2 w2Var, int i10) {
        this.a = i10;
        this.b = w2Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        int i10 = this.a;
        w2 w2Var = this.b;
        switch (i10) {
            case 0:
                AnimatorSet animatorSet = w2Var.h;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    w2Var.h = null;
                }
                zs.e().k(99, 512);
                break;
            case 1:
                w2Var.D = 0.0f;
                z2 z2Var = w2Var.G;
                z2Var.b.setTranslationX(0.0f);
                z2Var.c.invalidate();
                break;
            case 2:
                z2 z2Var2 = w2Var.G;
                z2Var2.N0 = true;
                z2Var2.b.setTranslationX(w2Var.getMeasuredWidth());
                z2Var2.dismiss();
                z2Var2.c.invalidate();
                break;
            default:
                w2Var.G.b.setTranslationY(0.0f);
                w2Var.G.h0();
                z2 z2Var3 = w2Var.G;
                z2Var3.q0(z2Var3.b.getTranslationY());
                w2Var.invalidate();
                break;
        }
    }
}
