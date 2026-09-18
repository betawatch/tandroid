package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final class hi1 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ ti1 b;

    public /* synthetic */ hi1(ti1 ti1Var, int i10) {
        this.a = i10;
        this.b = ti1Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        ai.l4 l4Var;
        ai.l4 l4Var2;
        switch (this.a) {
            case 0:
                ti1 ti1Var = this.b;
                ti1Var.i1 = null;
                ti1Var.f1 = 1.0f;
                ti1Var.Y0 = 0.0f;
                ti1Var.Z0 = 0.0f;
                ti1Var.s.invalidate();
                break;
            case 1:
                org.telegram.ui.Components.voip.m2.k().a.setAlpha(1.0f);
                AndroidUtilities.runOnUIThread(new g01(this, 23), 200L);
                break;
            case 2:
                ti1 ti1Var2 = this.b;
                ti1Var2.L0.unlock();
                ti1Var2.Y.setCornerRadius(-1.0f);
                ti1Var2.E0 = false;
                ti1Var2.Y.b0 = false;
                ti1Var2.q0 = ti1Var2.p0;
                ti1Var2.H();
                break;
            case 3:
                for (org.telegram.ui.Components.u9 u9Var : this.b.V) {
                    org.telegram.ui.Components.o5 o5Var = u9Var.e;
                    if (o5Var != null && (l4Var = o5Var.k) != null) {
                        l4Var.setAllowStartAnimation(true);
                        u9Var.e.k.startAnimation();
                    }
                }
                break;
            case 4:
                ti1 ti1Var3 = this.b;
                ti1Var3.B();
                for (org.telegram.ui.Components.u9 u9Var2 : ti1Var3.V) {
                    org.telegram.ui.Components.o5 o5Var2 = u9Var2.e;
                    if (o5Var2 != null && (l4Var2 = o5Var2.k) != null) {
                        l4Var2.setAllowStartAnimation(false);
                        u9Var2.e.k.stopAnimation();
                    }
                }
                ti1Var3.R.setVisibility(8);
                break;
            case 5:
                ti1 ti1Var4 = this.b;
                if (ti1Var4.Z.getTag() == null) {
                    ti1Var4.Z.setVisibility(8);
                    break;
                }
                break;
            case 6:
                ti1 ti1Var5 = this.b;
                ti1Var5.Y.setTranslationX(0.0f);
                ti1Var5.Y.setTranslationY(0.0f);
                ti1Var5.Y.setScaleY(1.0f);
                ti1Var5.Y.setScaleX(1.0f);
                ti1Var5.Y.setVisibility(8);
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
