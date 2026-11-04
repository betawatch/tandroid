package org.telegram.ui.ActionBar;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import org.telegram.messenger.hs;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class p2 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ q2 b;

    public /* synthetic */ p2(q2 q2Var, int i3) {
        this.a = i3;
        this.b = q2Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        int i3 = this.a;
        q2 q2Var = this.b;
        switch (i3) {
            case 0:
                AnimatorSet animatorSet = q2Var.h;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    q2Var.h = null;
                }
                hs.e().k(99, 512);
                break;
            case 1:
                q2Var.E = 0.0f;
                t2 t2Var = q2Var.H;
                t2Var.b.setTranslationX(0.0f);
                t2Var.c.invalidate();
                break;
            case 2:
                t2 t2Var2 = q2Var.H;
                t2Var2.O0 = true;
                t2Var2.b.setTranslationX(q2Var.getMeasuredWidth());
                t2Var2.dismiss();
                t2Var2.c.invalidate();
                break;
            default:
                q2Var.H.b.setTranslationY(0.0f);
                q2Var.H.h0();
                t2 t2Var3 = q2Var.H;
                t2Var3.q0(t2Var3.b.getTranslationY());
                q2Var.invalidate();
                break;
        }
    }
}
