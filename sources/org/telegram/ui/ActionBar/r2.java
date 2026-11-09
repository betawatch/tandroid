package org.telegram.ui.ActionBar;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import org.telegram.messenger.qs;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final class r2 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ s2 b;

    public /* synthetic */ r2(s2 s2Var, int i7) {
        this.a = i7;
        this.b = s2Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        int i7 = this.a;
        s2 s2Var = this.b;
        switch (i7) {
            case 0:
                AnimatorSet animatorSet = s2Var.h;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    s2Var.h = null;
                }
                qs.e().k(99, 512);
                break;
            case 1:
                s2Var.D = 0.0f;
                v2 v2Var = s2Var.G;
                v2Var.b.setTranslationX(0.0f);
                v2Var.c.invalidate();
                break;
            case 2:
                v2 v2Var2 = s2Var.G;
                v2Var2.N0 = true;
                v2Var2.b.setTranslationX(s2Var.getMeasuredWidth());
                v2Var2.dismiss();
                v2Var2.c.invalidate();
                break;
            default:
                s2Var.G.b.setTranslationY(0.0f);
                s2Var.G.h0();
                v2 v2Var3 = s2Var.G;
                v2Var3.q0(v2Var3.b.getTranslationY());
                s2Var.invalidate();
                break;
        }
    }
}
