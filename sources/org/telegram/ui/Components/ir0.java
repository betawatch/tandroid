package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes3.dex */
public final class ir0 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ jt0 b;

    public /* synthetic */ ir0(jt0 jt0Var, int i7) {
        this.a = i7;
        this.b = jt0Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                this.b.O0 = null;
                break;
            default:
                jt0 jt0Var = this.b;
                org.telegram.ui.ActionBar.q0 q0Var = jt0Var.q0;
                ds0[] ds0VarArr = jt0Var.n0;
                jt0Var.i1 = null;
                if (jt0Var.l1) {
                    ds0VarArr[1].setVisibility(8);
                    if (q0Var == null || jt0Var.I()) {
                        jt0Var.r0 = jt0Var.l0(0.0f);
                        jt0Var.M1(0.0f);
                    } else {
                        jt0Var.setSearchItemVisibility(jt0Var.I0() ? 8 : 4);
                        jt0Var.r0 = 0.0f;
                    }
                    jt0Var.I1(false);
                    jt0Var.A0 = 0;
                } else {
                    ds0 ds0Var = ds0VarArr[0];
                    ds0VarArr[0] = ds0VarArr[1];
                    ds0VarArr[1] = ds0Var;
                    ds0Var.setVisibility(8);
                    if (q0Var != null && jt0Var.A0 == 2) {
                        jt0Var.setSearchItemVisibility(jt0Var.I0() ? 8 : 4);
                    }
                    jt0Var.A0 = 0;
                    jt0Var.l1(1.0f, ds0VarArr[0].F);
                    jt0Var.Y0();
                    jt0Var.u1();
                }
                jt0Var.j1 = false;
                jt0Var.B1 = false;
                jt0Var.A1 = false;
                jt0Var.setHeaderEnabled(true);
                jt0Var.L0.setEnabled(true);
                break;
        }
    }
}
