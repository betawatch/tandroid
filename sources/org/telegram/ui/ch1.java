package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class ch1 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ oh1 b;

    public /* synthetic */ ch1(oh1 oh1Var, int i10) {
        this.a = i10;
        this.b = oh1Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        lh.x2 x2Var;
        lh.x2 x2Var2;
        switch (this.a) {
            case 0:
                oh1 oh1Var = this.b;
                oh1Var.e1 = null;
                oh1Var.b1 = 1.0f;
                oh1Var.U0 = 0.0f;
                oh1Var.V0 = 0.0f;
                oh1Var.s.invalidate();
                break;
            case 1:
                org.telegram.ui.Components.voip.o2.k().a.setAlpha(1.0f);
                AndroidUtilities.runOnUIThread(new ky0(this, 25), 200L);
                break;
            case 2:
                oh1 oh1Var2 = this.b;
                oh1Var2.H0.unlock();
                oh1Var2.U.setCornerRadius(-1.0f);
                oh1Var2.A0 = false;
                oh1Var2.U.U = false;
                oh1Var2.m0 = oh1Var2.l0;
                oh1Var2.H();
                break;
            case 3:
                for (org.telegram.ui.Components.t9 t9Var : this.b.R) {
                    org.telegram.ui.Components.p5 p5Var = t9Var.e;
                    if (p5Var != null && (x2Var = p5Var.k) != null) {
                        x2Var.setAllowStartAnimation(true);
                        t9Var.e.k.startAnimation();
                    }
                }
                break;
            case 4:
                oh1 oh1Var3 = this.b;
                oh1Var3.B();
                for (org.telegram.ui.Components.t9 t9Var2 : oh1Var3.R) {
                    org.telegram.ui.Components.p5 p5Var2 = t9Var2.e;
                    if (p5Var2 != null && (x2Var2 = p5Var2.k) != null) {
                        x2Var2.setAllowStartAnimation(false);
                        t9Var2.e.k.stopAnimation();
                    }
                }
                oh1Var3.N.setVisibility(8);
                break;
            case 5:
                oh1 oh1Var4 = this.b;
                if (oh1Var4.V.getTag() == null) {
                    oh1Var4.V.setVisibility(8);
                    break;
                }
                break;
            case 6:
                oh1 oh1Var5 = this.b;
                oh1Var5.U.setTranslationX(0.0f);
                oh1Var5.U.setTranslationY(0.0f);
                oh1Var5.U.setScaleY(1.0f);
                oh1Var5.U.setScaleX(1.0f);
                oh1Var5.U.setVisibility(8);
                break;
            case 7:
                this.b.y.setVisibility(8);
                break;
            default:
                this.b.a0.setVisibility(8);
                break;
        }
    }
}
