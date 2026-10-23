package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-5c4d11c5a4a3c3963e49de090c9ebed761f6fe8b7d1fb1bb05822f03003d35b5 */
/* loaded from: classes3.dex */
public final class nt0 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ uv0 b;

    public /* synthetic */ nt0(uv0 uv0Var, int i10) {
        this.a = i10;
        this.b = uv0Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                this.b.L0 = null;
                break;
            default:
                uv0 uv0Var = this.b;
                org.telegram.ui.ActionBar.u0 u0Var = uv0Var.n0;
                nu0[] nu0VarArr = uv0Var.k0;
                uv0Var.f1 = null;
                if (uv0Var.i1) {
                    nu0VarArr[1].setVisibility(8);
                    if (u0Var == null || uv0Var.D()) {
                        uv0Var.o0 = uv0Var.b0(0.0f);
                        uv0Var.v1(0.0f);
                    } else {
                        u0Var.setVisibility(uv0Var.x0() ? 8 : 4);
                        uv0Var.o0 = 0.0f;
                    }
                    uv0Var.s1(false);
                    uv0Var.x0 = 0;
                } else {
                    nu0 nu0Var = nu0VarArr[0];
                    nu0VarArr[0] = nu0VarArr[1];
                    nu0VarArr[1] = nu0Var;
                    nu0Var.setVisibility(8);
                    if (u0Var != null && uv0Var.x0 == 2) {
                        u0Var.setVisibility(uv0Var.x0() ? 8 : 4);
                    }
                    uv0Var.x0 = 0;
                    uv0Var.b1(1.0f, nu0VarArr[0].F);
                    uv0Var.N0();
                    uv0Var.h1();
                }
                uv0Var.g1 = false;
                uv0Var.y1 = false;
                uv0Var.x1 = false;
                uv0Var.P0(false);
                uv0Var.G.setEnabled(true);
                uv0Var.I0.setEnabled(true);
                break;
        }
    }
}
