package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final class oh1 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ ai1 b;

    public /* synthetic */ oh1(ai1 ai1Var, int i10) {
        this.a = i10;
        this.b = ai1Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        nh.y2 y2Var;
        nh.y2 y2Var2;
        switch (this.a) {
            case 0:
                ai1 ai1Var = this.b;
                ai1Var.f1 = null;
                ai1Var.c1 = 1.0f;
                ai1Var.V0 = 0.0f;
                ai1Var.W0 = 0.0f;
                ai1Var.s.invalidate();
                break;
            case 1:
                org.telegram.ui.Components.voip.m2.k().a.setAlpha(1.0f);
                AndroidUtilities.runOnUIThread(new vy0(this, 25), 200L);
                break;
            case 2:
                ai1 ai1Var2 = this.b;
                ai1Var2.I0.unlock();
                ai1Var2.V.setCornerRadius(-1.0f);
                ai1Var2.B0 = false;
                ai1Var2.V.V = false;
                ai1Var2.n0 = ai1Var2.m0;
                ai1Var2.H();
                break;
            case 3:
                for (org.telegram.ui.Components.p9 p9Var : this.b.S) {
                    org.telegram.ui.Components.l5 l5Var = p9Var.e;
                    if (l5Var != null && (y2Var = l5Var.k) != null) {
                        y2Var.setAllowStartAnimation(true);
                        p9Var.e.k.startAnimation();
                    }
                }
                break;
            case 4:
                ai1 ai1Var3 = this.b;
                ai1Var3.B();
                for (org.telegram.ui.Components.p9 p9Var2 : ai1Var3.S) {
                    org.telegram.ui.Components.l5 l5Var2 = p9Var2.e;
                    if (l5Var2 != null && (y2Var2 = l5Var2.k) != null) {
                        y2Var2.setAllowStartAnimation(false);
                        p9Var2.e.k.stopAnimation();
                    }
                }
                ai1Var3.O.setVisibility(8);
                break;
            case 5:
                ai1 ai1Var4 = this.b;
                if (ai1Var4.W.getTag() == null) {
                    ai1Var4.W.setVisibility(8);
                    break;
                }
                break;
            case 6:
                ai1 ai1Var5 = this.b;
                ai1Var5.V.setTranslationX(0.0f);
                ai1Var5.V.setTranslationY(0.0f);
                ai1Var5.V.setScaleY(1.0f);
                ai1Var5.V.setScaleX(1.0f);
                ai1Var5.V.setVisibility(8);
                break;
            case 7:
                this.b.y.setVisibility(8);
                break;
            default:
                this.b.b0.setVisibility(8);
                break;
        }
    }
}
