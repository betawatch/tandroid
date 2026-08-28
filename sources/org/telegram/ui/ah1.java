package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class ah1 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ mh1 b;

    public /* synthetic */ ah1(mh1 mh1Var, int i9) {
        this.a = i9;
        this.b = mh1Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        ih.z2 z2Var;
        ih.z2 z2Var2;
        switch (this.a) {
            case 0:
                mh1 mh1Var = this.b;
                mh1Var.e1 = null;
                mh1Var.b1 = 1.0f;
                mh1Var.U0 = 0.0f;
                mh1Var.V0 = 0.0f;
                mh1Var.s.invalidate();
                break;
            case 1:
                org.telegram.ui.Components.voip.l2.k().a.setAlpha(1.0f);
                AndroidUtilities.runOnUIThread(new ky0(this, 25), 200L);
                break;
            case 2:
                mh1 mh1Var2 = this.b;
                mh1Var2.H0.unlock();
                mh1Var2.U.setCornerRadius(-1.0f);
                mh1Var2.A0 = false;
                mh1Var2.U.U = false;
                mh1Var2.m0 = mh1Var2.l0;
                mh1Var2.H();
                break;
            case 3:
                for (org.telegram.ui.Components.o9 o9Var : this.b.R) {
                    org.telegram.ui.Components.k5 k5Var = o9Var.e;
                    if (k5Var != null && (z2Var = k5Var.k) != null) {
                        z2Var.setAllowStartAnimation(true);
                        o9Var.e.k.startAnimation();
                    }
                }
                break;
            case 4:
                mh1 mh1Var3 = this.b;
                mh1Var3.B();
                for (org.telegram.ui.Components.o9 o9Var2 : mh1Var3.R) {
                    org.telegram.ui.Components.k5 k5Var2 = o9Var2.e;
                    if (k5Var2 != null && (z2Var2 = k5Var2.k) != null) {
                        z2Var2.setAllowStartAnimation(false);
                        o9Var2.e.k.stopAnimation();
                    }
                }
                mh1Var3.N.setVisibility(8);
                break;
            case 5:
                mh1 mh1Var4 = this.b;
                if (mh1Var4.V.getTag() == null) {
                    mh1Var4.V.setVisibility(8);
                    break;
                }
                break;
            case 6:
                mh1 mh1Var5 = this.b;
                mh1Var5.U.setTranslationX(0.0f);
                mh1Var5.U.setTranslationY(0.0f);
                mh1Var5.U.setScaleY(1.0f);
                mh1Var5.U.setScaleX(1.0f);
                mh1Var5.U.setVisibility(8);
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
