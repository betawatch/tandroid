package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-33b1d79182603e8304c32e909c352797304d7e7816a08740f96af6cffe97caab */
/* loaded from: classes3.dex */
public final class dt0 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ kv0 b;

    public /* synthetic */ dt0(kv0 kv0Var, int i10) {
        this.a = i10;
        this.b = kv0Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                this.b.L0 = null;
                break;
            default:
                kv0 kv0Var = this.b;
                org.telegram.ui.ActionBar.v0 v0Var = kv0Var.n0;
                du0[] du0VarArr = kv0Var.k0;
                kv0Var.f1 = null;
                if (kv0Var.i1) {
                    du0VarArr[1].setVisibility(8);
                    if (v0Var == null || kv0Var.D()) {
                        kv0Var.o0 = kv0Var.b0(0.0f);
                        kv0Var.s1(0.0f);
                    } else {
                        v0Var.setVisibility(kv0Var.v0() ? 8 : 4);
                        kv0Var.o0 = 0.0f;
                    }
                    kv0Var.q1(false);
                    kv0Var.x0 = 0;
                } else {
                    du0 du0Var = du0VarArr[0];
                    du0VarArr[0] = du0VarArr[1];
                    du0VarArr[1] = du0Var;
                    du0Var.setVisibility(8);
                    if (v0Var != null && kv0Var.x0 == 2) {
                        v0Var.setVisibility(kv0Var.v0() ? 8 : 4);
                    }
                    kv0Var.x0 = 0;
                    kv0Var.Z0(1.0f, du0VarArr[0].F);
                    kv0Var.L0();
                    kv0Var.f1();
                }
                kv0Var.g1 = false;
                kv0Var.y1 = false;
                kv0Var.x1 = false;
                kv0Var.N0(false);
                kv0Var.G.setEnabled(true);
                kv0Var.I0.setEnabled(true);
                break;
        }
    }
}
