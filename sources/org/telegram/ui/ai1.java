package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-53901c404a1b0373a5bf33e44ab631b007d629dadc71f62a8c7dd35781185007 */
/* loaded from: classes3.dex */
public final class ai1 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ mi1 b;

    public /* synthetic */ ai1(mi1 mi1Var, int i10) {
        this.a = i10;
        this.b = mi1Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        ai.l4 l4Var;
        ai.l4 l4Var2;
        switch (this.a) {
            case 0:
                mi1 mi1Var = this.b;
                mi1Var.i1 = null;
                mi1Var.f1 = 1.0f;
                mi1Var.Y0 = 0.0f;
                mi1Var.Z0 = 0.0f;
                mi1Var.s.invalidate();
                break;
            case 1:
                org.telegram.ui.Components.voip.n2.k().a.setAlpha(1.0f);
                AndroidUtilities.runOnUIThread(new vz0(this, 23), 200L);
                break;
            case 2:
                mi1 mi1Var2 = this.b;
                mi1Var2.L0.unlock();
                mi1Var2.Y.setCornerRadius(-1.0f);
                mi1Var2.E0 = false;
                mi1Var2.Y.b0 = false;
                mi1Var2.q0 = mi1Var2.p0;
                mi1Var2.H();
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
                mi1 mi1Var3 = this.b;
                mi1Var3.B();
                for (org.telegram.ui.Components.w9 w9Var2 : mi1Var3.V) {
                    org.telegram.ui.Components.q5 q5Var2 = w9Var2.e;
                    if (q5Var2 != null && (l4Var2 = q5Var2.k) != null) {
                        l4Var2.setAllowStartAnimation(false);
                        w9Var2.e.k.stopAnimation();
                    }
                }
                mi1Var3.R.setVisibility(8);
                break;
            case 5:
                mi1 mi1Var4 = this.b;
                if (mi1Var4.Z.getTag() == null) {
                    mi1Var4.Z.setVisibility(8);
                    break;
                }
                break;
            case 6:
                mi1 mi1Var5 = this.b;
                mi1Var5.Y.setTranslationX(0.0f);
                mi1Var5.Y.setTranslationY(0.0f);
                mi1Var5.Y.setScaleY(1.0f);
                mi1Var5.Y.setScaleX(1.0f);
                mi1Var5.Y.setVisibility(8);
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
