package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
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
        ci.f3 f3Var;
        ci.f3 f3Var2;
        switch (this.a) {
            case 0:
                oh1 oh1Var = this.b;
                oh1Var.i1 = null;
                oh1Var.f1 = 1.0f;
                oh1Var.Y0 = 0.0f;
                oh1Var.Z0 = 0.0f;
                oh1Var.s.invalidate();
                break;
            case 1:
                org.telegram.ui.Components.voip.k2.k().a.setAlpha(1.0f);
                AndroidUtilities.runOnUIThread(new my0(this, 25), 200L);
                break;
            case 2:
                oh1 oh1Var2 = this.b;
                oh1Var2.L0.unlock();
                oh1Var2.Y.setCornerRadius(-1.0f);
                oh1Var2.E0 = false;
                oh1Var2.Y.b0 = false;
                oh1Var2.q0 = oh1Var2.p0;
                oh1Var2.G();
                break;
            case 3:
                for (org.telegram.ui.Components.w9 w9Var : this.b.V) {
                    org.telegram.ui.Components.r5 r5Var = w9Var.e;
                    if (r5Var != null && (f3Var = r5Var.k) != null) {
                        f3Var.setAllowStartAnimation(true);
                        w9Var.e.k.startAnimation();
                    }
                }
                break;
            case 4:
                oh1 oh1Var3 = this.b;
                oh1Var3.A();
                for (org.telegram.ui.Components.w9 w9Var2 : oh1Var3.V) {
                    org.telegram.ui.Components.r5 r5Var2 = w9Var2.e;
                    if (r5Var2 != null && (f3Var2 = r5Var2.k) != null) {
                        f3Var2.setAllowStartAnimation(false);
                        w9Var2.e.k.stopAnimation();
                    }
                }
                oh1Var3.R.setVisibility(8);
                break;
            case 5:
                oh1 oh1Var4 = this.b;
                if (oh1Var4.Z.getTag() == null) {
                    oh1Var4.Z.setVisibility(8);
                    break;
                }
                break;
            case 6:
                oh1 oh1Var5 = this.b;
                oh1Var5.Y.setTranslationX(0.0f);
                oh1Var5.Y.setTranslationY(0.0f);
                oh1Var5.Y.setScaleY(1.0f);
                oh1Var5.Y.setScaleX(1.0f);
                oh1Var5.Y.setVisibility(8);
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
