package org.telegram.ui.ActionBar;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import org.telegram.messenger.ns;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final class q2 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ r2 b;

    public /* synthetic */ q2(r2 r2Var, int i7) {
        this.a = i7;
        this.b = r2Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        int i7 = this.a;
        r2 r2Var = this.b;
        switch (i7) {
            case 0:
                AnimatorSet animatorSet = r2Var.h;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    r2Var.h = null;
                }
                ns.e().k(99, 512);
                break;
            case 1:
                r2Var.E = 0.0f;
                u2 u2Var = r2Var.H;
                u2Var.b.setTranslationX(0.0f);
                u2Var.c.invalidate();
                break;
            case 2:
                u2 u2Var2 = r2Var.H;
                u2Var2.O0 = true;
                u2Var2.b.setTranslationX(r2Var.getMeasuredWidth());
                u2Var2.dismiss();
                u2Var2.c.invalidate();
                break;
            default:
                r2Var.H.b.setTranslationY(0.0f);
                r2Var.H.h0();
                u2 u2Var3 = r2Var.H;
                u2Var3.q0(u2Var3.b.getTranslationY());
                r2Var.invalidate();
                break;
        }
    }
}
