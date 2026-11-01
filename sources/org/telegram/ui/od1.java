package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final class od1 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ zd1 b;

    public /* synthetic */ od1(zd1 zd1Var, int i10) {
        this.a = i10;
        this.b = zd1Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        ag.c2 c2Var;
        ag.c2 c2Var2;
        int i10 = this.a;
        zd1 zd1Var = this.b;
        switch (i10) {
            case 0:
                zd1Var.i1 = null;
                zd1Var.f1 = 1.0f;
                zd1Var.Y0 = 0.0f;
                zd1Var.Z0 = 0.0f;
                zd1Var.s.invalidate();
                break;
            case 1:
                org.telegram.ui.Components.voip.u1.d().a.setAlpha(1.0f);
                org.telegram.messenger.i0.h3(new vv0(this, 28), 200L);
                break;
            case 2:
                zd1Var.L0.e();
                zd1Var.Y.setCornerRadius(-1.0f);
                zd1Var.E0 = false;
                zd1Var.Y.b0 = false;
                zd1Var.q0 = zd1Var.p0;
                zd1Var.G();
                break;
            case 3:
                for (org.telegram.ui.Components.g9 g9Var : zd1Var.V) {
                    org.telegram.ui.Components.f5 f5Var = g9Var.e;
                    if (f5Var != null && (c2Var = f5Var.k) != null) {
                        c2Var.t0 = true;
                        c2Var.P0(false);
                    }
                }
                break;
            case 4:
                zd1Var.A();
                for (org.telegram.ui.Components.g9 g9Var2 : zd1Var.V) {
                    org.telegram.ui.Components.f5 f5Var2 = g9Var2.e;
                    if (f5Var2 != null && (c2Var2 = f5Var2.k) != null) {
                        c2Var2.t0 = false;
                        c2Var2.Q0();
                    }
                }
                zd1Var.R.setVisibility(8);
                break;
            case 5:
                zd1Var.E.setText(org.telegram.messenger.dd.L0(2131743516, null));
                zd1Var.E.animate().alpha(1.0f).setDuration(70L).setListener(null).start();
                break;
            case 6:
                if (zd1Var.Z.getTag() == null) {
                    zd1Var.Z.setVisibility(8);
                    break;
                }
                break;
            case 7:
                zd1Var.Y.setTranslationX(0.0f);
                zd1Var.Y.setTranslationY(0.0f);
                zd1Var.Y.setScaleY(1.0f);
                zd1Var.Y.setScaleX(1.0f);
                zd1Var.Y.setVisibility(8);
                break;
            case 8:
                zd1Var.D.setVisibility(8);
                break;
            default:
                zd1Var.e0.setVisibility(8);
                break;
        }
    }
}
