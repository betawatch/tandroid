package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-c0e607070f32dbde65005355ff6c489b77f9395a3e0f8720848e2402860dea84 */
/* loaded from: classes3.dex */
public final class gi1 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ si1 b;

    public /* synthetic */ gi1(si1 si1Var, int i10) {
        this.a = i10;
        this.b = si1Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        ai.l4 l4Var;
        ai.l4 l4Var2;
        switch (this.a) {
            case 0:
                si1 si1Var = this.b;
                si1Var.i1 = null;
                si1Var.f1 = 1.0f;
                si1Var.Y0 = 0.0f;
                si1Var.Z0 = 0.0f;
                si1Var.s.invalidate();
                break;
            case 1:
                org.telegram.ui.Components.voip.m2.k().a.setAlpha(1.0f);
                AndroidUtilities.runOnUIThread(new e01(this, 23), 200L);
                break;
            case 2:
                si1 si1Var2 = this.b;
                si1Var2.L0.unlock();
                si1Var2.Y.setCornerRadius(-1.0f);
                si1Var2.E0 = false;
                si1Var2.Y.b0 = false;
                si1Var2.q0 = si1Var2.p0;
                si1Var2.H();
                break;
            case 3:
                for (org.telegram.ui.Components.w9 w9Var : this.b.V) {
                    org.telegram.ui.Components.q5 q5Var = w9Var.e;
                    if (q5Var != null && (l4Var = q5Var.k) != null) {
                        l4Var.setAllowStartAnimation(true);
                        w9Var.e.k.startAnimation();
                    }
                }
                break;
            case 4:
                si1 si1Var3 = this.b;
                si1Var3.B();
                for (org.telegram.ui.Components.w9 w9Var2 : si1Var3.V) {
                    org.telegram.ui.Components.q5 q5Var2 = w9Var2.e;
                    if (q5Var2 != null && (l4Var2 = q5Var2.k) != null) {
                        l4Var2.setAllowStartAnimation(false);
                        w9Var2.e.k.stopAnimation();
                    }
                }
                si1Var3.R.setVisibility(8);
                break;
            case 5:
                si1 si1Var4 = this.b;
                if (si1Var4.Z.getTag() == null) {
                    si1Var4.Z.setVisibility(8);
                    break;
                }
                break;
            case 6:
                si1 si1Var5 = this.b;
                si1Var5.Y.setTranslationX(0.0f);
                si1Var5.Y.setTranslationY(0.0f);
                si1Var5.Y.setScaleY(1.0f);
                si1Var5.Y.setScaleX(1.0f);
                si1Var5.Y.setVisibility(8);
                break;
            case 7:
                this.b.y.setVisibility(8);
                break;
            default:
                this.b.e0.setVisibility(8);
                break;
        }
    }
}
