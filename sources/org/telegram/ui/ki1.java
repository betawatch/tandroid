package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final class ki1 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ wi1 b;

    public /* synthetic */ ki1(wi1 wi1Var, int i10) {
        this.a = i10;
        this.b = wi1Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        ai.m4 m4Var;
        ai.m4 m4Var2;
        switch (this.a) {
            case 0:
                wi1 wi1Var = this.b;
                wi1Var.i1 = null;
                wi1Var.f1 = 1.0f;
                wi1Var.Y0 = 0.0f;
                wi1Var.Z0 = 0.0f;
                wi1Var.s.invalidate();
                break;
            case 1:
                org.telegram.ui.Components.voip.m2.k().a.setAlpha(1.0f);
                AndroidUtilities.runOnUIThread(new nz0(this, 24), 200L);
                break;
            case 2:
                wi1 wi1Var2 = this.b;
                wi1Var2.L0.unlock();
                wi1Var2.Y.setCornerRadius(-1.0f);
                wi1Var2.E0 = false;
                wi1Var2.Y.b0 = false;
                wi1Var2.q0 = wi1Var2.p0;
                wi1Var2.G();
                break;
            case 3:
                for (org.telegram.ui.Components.y9 y9Var : this.b.V) {
                    org.telegram.ui.Components.s5 s5Var = y9Var.e;
                    if (s5Var != null && (m4Var = s5Var.k) != null) {
                        m4Var.setAllowStartAnimation(true);
                        y9Var.e.k.startAnimation();
                    }
                }
                break;
            case 4:
                wi1 wi1Var3 = this.b;
                wi1Var3.A();
                for (org.telegram.ui.Components.y9 y9Var2 : wi1Var3.V) {
                    org.telegram.ui.Components.s5 s5Var2 = y9Var2.e;
                    if (s5Var2 != null && (m4Var2 = s5Var2.k) != null) {
                        m4Var2.setAllowStartAnimation(false);
                        y9Var2.e.k.stopAnimation();
                    }
                }
                wi1Var3.R.setVisibility(8);
                break;
            case 5:
                wi1 wi1Var4 = this.b;
                if (wi1Var4.Z.getTag() == null) {
                    wi1Var4.Z.setVisibility(8);
                    break;
                }
                break;
            case 6:
                wi1 wi1Var5 = this.b;
                wi1Var5.Y.setTranslationX(0.0f);
                wi1Var5.Y.setTranslationY(0.0f);
                wi1Var5.Y.setScaleY(1.0f);
                wi1Var5.Y.setScaleX(1.0f);
                wi1Var5.Y.setVisibility(8);
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
