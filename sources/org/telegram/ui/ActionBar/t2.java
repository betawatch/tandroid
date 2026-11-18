package org.telegram.ui.ActionBar;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import org.telegram.messenger.ks;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes3.dex */
public final class t2 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ u2 b;

    public /* synthetic */ t2(u2 u2Var, int i7) {
        this.a = i7;
        this.b = u2Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        int i7 = this.a;
        u2 u2Var = this.b;
        switch (i7) {
            case 0:
                AnimatorSet animatorSet = u2Var.h;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    u2Var.h = null;
                }
                ks.e().k(99, 512);
                break;
            case 1:
                u2Var.E = 0.0f;
                x2 x2Var = u2Var.H;
                x2Var.b.setTranslationX(0.0f);
                x2Var.c.invalidate();
                break;
            case 2:
                x2 x2Var2 = u2Var.H;
                x2Var2.O0 = true;
                x2Var2.b.setTranslationX(u2Var.getMeasuredWidth());
                x2Var2.dismiss();
                x2Var2.c.invalidate();
                break;
            default:
                u2Var.H.b.setTranslationY(0.0f);
                u2Var.H.h0();
                x2 x2Var3 = u2Var.H;
                x2Var3.q0(x2Var3.b.getTranslationY());
                u2Var.invalidate();
                break;
        }
    }
}
