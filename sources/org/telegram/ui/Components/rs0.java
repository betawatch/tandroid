package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final class rs0 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ zu0 b;

    public /* synthetic */ rs0(zu0 zu0Var, int i10) {
        this.a = i10;
        this.b = zu0Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                this.b.I0 = null;
                break;
            default:
                zu0 zu0Var = this.b;
                org.telegram.ui.ActionBar.w0 w0Var = zu0Var.k0;
                rt0[] rt0VarArr = zu0Var.h0;
                zu0Var.c1 = null;
                if (zu0Var.f1) {
                    rt0VarArr[1].setVisibility(8);
                    if (w0Var == null || zu0Var.D()) {
                        zu0Var.l0 = zu0Var.b0(0.0f);
                        zu0Var.s1(0.0f);
                    } else {
                        w0Var.setVisibility(zu0Var.v0() ? 8 : 4);
                        zu0Var.l0 = 0.0f;
                    }
                    zu0Var.q1(false);
                    zu0Var.u0 = 0;
                } else {
                    rt0 rt0Var = rt0VarArr[0];
                    rt0VarArr[0] = rt0VarArr[1];
                    rt0VarArr[1] = rt0Var;
                    rt0Var.setVisibility(8);
                    if (w0Var != null && zu0Var.u0 == 2) {
                        w0Var.setVisibility(zu0Var.v0() ? 8 : 4);
                    }
                    zu0Var.u0 = 0;
                    zu0Var.Z0(1.0f, rt0VarArr[0].C);
                    zu0Var.L0();
                    zu0Var.f1();
                }
                zu0Var.d1 = false;
                zu0Var.v1 = false;
                zu0Var.u1 = false;
                zu0Var.N0(false);
                zu0Var.D.setEnabled(true);
                zu0Var.F0.setEnabled(true);
                break;
        }
    }
}
