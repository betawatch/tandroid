package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final class ss0 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ zu0 b;

    public /* synthetic */ ss0(zu0 zu0Var, int i10) {
        this.a = i10;
        this.b = zu0Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                this.b.L0 = null;
                break;
            default:
                zu0 zu0Var = this.b;
                org.telegram.ui.ActionBar.w0 w0Var = zu0Var.n0;
                st0[] st0VarArr = zu0Var.k0;
                zu0Var.f1 = null;
                if (zu0Var.i1) {
                    st0VarArr[1].setVisibility(8);
                    if (w0Var == null || zu0Var.D()) {
                        zu0Var.o0 = zu0Var.b0(0.0f);
                        zu0Var.s1(0.0f);
                    } else {
                        w0Var.setVisibility(zu0Var.v0() ? 8 : 4);
                        zu0Var.o0 = 0.0f;
                    }
                    zu0Var.q1(false);
                    zu0Var.x0 = 0;
                } else {
                    st0 st0Var = st0VarArr[0];
                    st0VarArr[0] = st0VarArr[1];
                    st0VarArr[1] = st0Var;
                    st0Var.setVisibility(8);
                    if (w0Var != null && zu0Var.x0 == 2) {
                        w0Var.setVisibility(zu0Var.v0() ? 8 : 4);
                    }
                    zu0Var.x0 = 0;
                    zu0Var.Z0(1.0f, st0VarArr[0].F);
                    zu0Var.L0();
                    zu0Var.f1();
                }
                zu0Var.g1 = false;
                zu0Var.y1 = false;
                zu0Var.x1 = false;
                zu0Var.N0(false);
                zu0Var.G.setEnabled(true);
                zu0Var.I0.setEnabled(true);
                break;
        }
    }
}
