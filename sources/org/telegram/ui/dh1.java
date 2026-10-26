package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final class dh1 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ ph1 b;

    public /* synthetic */ dh1(ph1 ph1Var, int i10) {
        this.a = i10;
        this.b = ph1Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        di.f3 f3Var;
        di.f3 f3Var2;
        switch (this.a) {
            case 0:
                ph1 ph1Var = this.b;
                ph1Var.i1 = null;
                ph1Var.f1 = 1.0f;
                ph1Var.Y0 = 0.0f;
                ph1Var.Z0 = 0.0f;
                ph1Var.s.invalidate();
                break;
            case 1:
                org.telegram.ui.Components.voip.n2.k().a.setAlpha(1.0f);
                AndroidUtilities.runOnUIThread(new my0(this, 27), 200L);
                break;
            case 2:
                ph1 ph1Var2 = this.b;
                ph1Var2.L0.unlock();
                ph1Var2.Y.setCornerRadius(-1.0f);
                ph1Var2.E0 = false;
                ph1Var2.Y.b0 = false;
                ph1Var2.q0 = ph1Var2.p0;
                ph1Var2.G();
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
                ph1 ph1Var3 = this.b;
                ph1Var3.A();
                for (org.telegram.ui.Components.y9 y9Var2 : ph1Var3.V) {
                    org.telegram.ui.Components.t5 t5Var2 = y9Var2.e;
                    if (t5Var2 != null && (f3Var2 = t5Var2.k) != null) {
                        f3Var2.setAllowStartAnimation(false);
                        y9Var2.e.k.stopAnimation();
                    }
                }
                ph1Var3.R.setVisibility(8);
                break;
            case 5:
                ph1 ph1Var4 = this.b;
                if (ph1Var4.Z.getTag() == null) {
                    ph1Var4.Z.setVisibility(8);
                    break;
                }
                break;
            case 6:
                ph1 ph1Var5 = this.b;
                ph1Var5.Y.setTranslationX(0.0f);
                ph1Var5.Y.setTranslationY(0.0f);
                ph1Var5.Y.setScaleY(1.0f);
                ph1Var5.Y.setScaleX(1.0f);
                ph1Var5.Y.setVisibility(8);
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
