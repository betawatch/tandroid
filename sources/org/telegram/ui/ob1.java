package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class ob1 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ zb1 b;

    public /* synthetic */ ob1(zb1 zb1Var, int i3) {
        this.a = i3;
        this.b = zb1Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        ei.c3 c3Var;
        ei.c3 c3Var2;
        int i3 = this.a;
        zb1 zb1Var = this.b;
        switch (i3) {
            case 0:
                zb1Var.j1 = null;
                zb1Var.g1 = 1.0f;
                zb1Var.Z0 = 0.0f;
                zb1Var.a1 = 0.0f;
                zb1Var.s.invalidate();
                break;
            case 1:
                org.telegram.ui.Components.voip.u1.d().a.setAlpha(1.0f);
                org.telegram.messenger.g0.i3(new pu0(this, 25), 200L);
                break;
            case 2:
                zb1Var.M0.e();
                zb1Var.Z.setCornerRadius(-1.0f);
                zb1Var.F0 = false;
                zb1Var.Z.c0 = false;
                zb1Var.r0 = zb1Var.q0;
                zb1Var.G();
                break;
            case 3:
                for (org.telegram.ui.Components.k9 k9Var : zb1Var.W) {
                    org.telegram.ui.Components.g5 g5Var = k9Var.e;
                    if (g5Var != null && (c3Var = g5Var.k) != null) {
                        c3Var.u0 = true;
                        c3Var.P0(false);
                    }
                }
                break;
            case 4:
                zb1Var.A();
                for (org.telegram.ui.Components.k9 k9Var2 : zb1Var.W) {
                    org.telegram.ui.Components.g5 g5Var2 = k9Var2.e;
                    if (g5Var2 != null && (c3Var2 = g5Var2.k) != null) {
                        c3Var2.u0 = false;
                        c3Var2.Q0();
                    }
                }
                zb1Var.S.setVisibility(8);
                break;
            case 5:
                zb1Var.F.setText(org.telegram.messenger.bd.M0(2131743500, null));
                zb1Var.F.animate().alpha(1.0f).setDuration(70L).setListener(null).start();
                break;
            case 6:
                if (zb1Var.a0.getTag() == null) {
                    zb1Var.a0.setVisibility(8);
                    break;
                }
                break;
            case 7:
                zb1Var.Z.setTranslationX(0.0f);
                zb1Var.Z.setTranslationY(0.0f);
                zb1Var.Z.setScaleY(1.0f);
                zb1Var.Z.setScaleX(1.0f);
                zb1Var.Z.setVisibility(8);
                break;
            case 8:
                zb1Var.E.setVisibility(8);
                break;
            default:
                zb1Var.f0.setVisibility(8);
                break;
        }
    }
}
