package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final class ni1 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ zi1 b;

    public /* synthetic */ ni1(zi1 zi1Var, int i10) {
        this.a = i10;
        this.b = zi1Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        gg.h1 h1Var;
        gg.h1 h1Var2;
        switch (this.a) {
            case 0:
                zi1 zi1Var = this.b;
                zi1Var.i1 = null;
                zi1Var.f1 = 1.0f;
                zi1Var.Y0 = 0.0f;
                zi1Var.Z0 = 0.0f;
                zi1Var.s.invalidate();
                break;
            case 1:
                org.telegram.ui.Components.voip.l2.k().a.setAlpha(1.0f);
                AndroidUtilities.runOnUIThread(new k01(this, 23), 200L);
                break;
            case 2:
                zi1 zi1Var2 = this.b;
                zi1Var2.L0.unlock();
                zi1Var2.Y.setCornerRadius(-1.0f);
                zi1Var2.E0 = false;
                zi1Var2.Y.b0 = false;
                zi1Var2.q0 = zi1Var2.p0;
                zi1Var2.H();
                break;
            case 3:
                for (org.telegram.ui.Components.w9 w9Var : this.b.V) {
                    org.telegram.ui.Components.p5 p5Var = w9Var.e;
                    if (p5Var != null && (h1Var = p5Var.k) != null) {
                        h1Var.setAllowStartAnimation(true);
                        w9Var.e.k.startAnimation();
                    }
                }
                break;
            case 4:
                zi1 zi1Var3 = this.b;
                zi1Var3.B();
                for (org.telegram.ui.Components.w9 w9Var2 : zi1Var3.V) {
                    org.telegram.ui.Components.p5 p5Var2 = w9Var2.e;
                    if (p5Var2 != null && (h1Var2 = p5Var2.k) != null) {
                        h1Var2.setAllowStartAnimation(false);
                        w9Var2.e.k.stopAnimation();
                    }
                }
                zi1Var3.R.setVisibility(8);
                break;
            case 5:
                zi1 zi1Var4 = this.b;
                if (zi1Var4.Z.getTag() == null) {
                    zi1Var4.Z.setVisibility(8);
                    break;
                }
                break;
            case 6:
                zi1 zi1Var5 = this.b;
                zi1Var5.Y.setTranslationX(0.0f);
                zi1Var5.Y.setTranslationY(0.0f);
                zi1Var5.Y.setScaleY(1.0f);
                zi1Var5.Y.setScaleX(1.0f);
                zi1Var5.Y.setVisibility(8);
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
