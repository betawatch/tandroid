package org.telegram.ui.ActionBar;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import org.telegram.messenger.qs;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class s2 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ t2 b;

    public /* synthetic */ s2(t2 t2Var, int i7) {
        this.a = i7;
        this.b = t2Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        int i7 = this.a;
        t2 t2Var = this.b;
        switch (i7) {
            case 0:
                AnimatorSet animatorSet = t2Var.h;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    t2Var.h = null;
                }
                qs.e().k(99, 512);
                break;
            case 1:
                t2Var.D = 0.0f;
                w2 w2Var = t2Var.G;
                w2Var.b.setTranslationX(0.0f);
                w2Var.c.invalidate();
                break;
            case 2:
                w2 w2Var2 = t2Var.G;
                w2Var2.N0 = true;
                w2Var2.b.setTranslationX(t2Var.getMeasuredWidth());
                w2Var2.dismiss();
                w2Var2.c.invalidate();
                break;
            default:
                t2Var.G.b.setTranslationY(0.0f);
                t2Var.G.h0();
                w2 w2Var3 = t2Var.G;
                w2Var3.q0(w2Var3.b.getTranslationY());
                t2Var.invalidate();
                break;
        }
    }
}
