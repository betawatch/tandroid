package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes3.dex */
public final class ii1 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ ui1 b;

    public /* synthetic */ ii1(ui1 ui1Var, int i10) {
        this.a = i10;
        this.b = ui1Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        bi.y3 y3Var;
        bi.y3 y3Var2;
        switch (this.a) {
            case 0:
                ui1 ui1Var = this.b;
                ui1Var.i1 = null;
                ui1Var.f1 = 1.0f;
                ui1Var.Y0 = 0.0f;
                ui1Var.Z0 = 0.0f;
                ui1Var.s.invalidate();
                break;
            case 1:
                org.telegram.ui.Components.voip.k2.k().a.setAlpha(1.0f);
                AndroidUtilities.runOnUIThread(new f01(this, 23), 200L);
                break;
            case 2:
                ui1 ui1Var2 = this.b;
                ui1Var2.L0.unlock();
                ui1Var2.Y.setCornerRadius(-1.0f);
                ui1Var2.E0 = false;
                ui1Var2.Y.b0 = false;
                ui1Var2.q0 = ui1Var2.p0;
                ui1Var2.H();
                break;
            case 3:
                for (org.telegram.ui.Components.x9 x9Var : this.b.V) {
                    org.telegram.ui.Components.q5 q5Var = x9Var.e;
                    if (q5Var != null && (y3Var = q5Var.k) != null) {
                        y3Var.setAllowStartAnimation(true);
                        x9Var.e.k.startAnimation();
                    }
                }
                break;
            case 4:
                ui1 ui1Var3 = this.b;
                ui1Var3.B();
                for (org.telegram.ui.Components.x9 x9Var2 : ui1Var3.V) {
                    org.telegram.ui.Components.q5 q5Var2 = x9Var2.e;
                    if (q5Var2 != null && (y3Var2 = q5Var2.k) != null) {
                        y3Var2.setAllowStartAnimation(false);
                        x9Var2.e.k.stopAnimation();
                    }
                }
                ui1Var3.R.setVisibility(8);
                break;
            case 5:
                ui1 ui1Var4 = this.b;
                if (ui1Var4.Z.getTag() == null) {
                    ui1Var4.Z.setVisibility(8);
                    break;
                }
                break;
            case 6:
                ui1 ui1Var5 = this.b;
                ui1Var5.Y.setTranslationX(0.0f);
                ui1Var5.Y.setTranslationY(0.0f);
                ui1Var5.Y.setScaleY(1.0f);
                ui1Var5.Y.setScaleX(1.0f);
                ui1Var5.Y.setVisibility(8);
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
