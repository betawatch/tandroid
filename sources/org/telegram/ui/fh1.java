package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class fh1 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ rh1 b;

    public /* synthetic */ fh1(rh1 rh1Var, int i10) {
        this.a = i10;
        this.b = rh1Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        di.f3 f3Var;
        di.f3 f3Var2;
        switch (this.a) {
            case 0:
                rh1 rh1Var = this.b;
                rh1Var.i1 = null;
                rh1Var.f1 = 1.0f;
                rh1Var.Y0 = 0.0f;
                rh1Var.Z0 = 0.0f;
                rh1Var.s.invalidate();
                break;
            case 1:
                org.telegram.ui.Components.voip.n2.k().a.setAlpha(1.0f);
                AndroidUtilities.runOnUIThread(new oy0(this, 27), 200L);
                break;
            case 2:
                rh1 rh1Var2 = this.b;
                rh1Var2.L0.unlock();
                rh1Var2.Y.setCornerRadius(-1.0f);
                rh1Var2.E0 = false;
                rh1Var2.Y.b0 = false;
                rh1Var2.q0 = rh1Var2.p0;
                rh1Var2.G();
                break;
            case 3:
                for (org.telegram.ui.Components.y9 y9Var : this.b.V) {
                    org.telegram.ui.Components.t5 t5Var = y9Var.e;
                    if (t5Var != null && (f3Var = t5Var.k) != null) {
                        f3Var.setAllowStartAnimation(true);
                        y9Var.e.k.startAnimation();
                    }
                }
                break;
            case 4:
                rh1 rh1Var3 = this.b;
                rh1Var3.A();
                for (org.telegram.ui.Components.y9 y9Var2 : rh1Var3.V) {
                    org.telegram.ui.Components.t5 t5Var2 = y9Var2.e;
                    if (t5Var2 != null && (f3Var2 = t5Var2.k) != null) {
                        f3Var2.setAllowStartAnimation(false);
                        y9Var2.e.k.stopAnimation();
                    }
                }
                rh1Var3.R.setVisibility(8);
                break;
            case 5:
                rh1 rh1Var4 = this.b;
                if (rh1Var4.Z.getTag() == null) {
                    rh1Var4.Z.setVisibility(8);
                    break;
                }
                break;
            case 6:
                rh1 rh1Var5 = this.b;
                rh1Var5.Y.setTranslationX(0.0f);
                rh1Var5.Y.setTranslationY(0.0f);
                rh1Var5.Y.setScaleY(1.0f);
                rh1Var5.Y.setScaleX(1.0f);
                rh1Var5.Y.setVisibility(8);
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
