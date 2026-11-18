package org.telegram.ui.Components.voip;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final class i0 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ y b;
    public final /* synthetic */ k0 c;

    public /* synthetic */ i0(k0 k0Var, y yVar, int i7) {
        this.a = i7;
        this.c = k0Var;
        this.b = yVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                k0 k0Var = this.c;
                k0Var.O0 = null;
                this.b.F = false;
                y yVar = k0Var.F;
                if (yVar != null) {
                    if (yVar.getParent() != null) {
                        k0Var.removeView(k0Var.F);
                        k0Var.F.e();
                    }
                    k0Var.F = null;
                    break;
                }
                break;
            case 1:
                k0 k0Var2 = this.c;
                k0Var2.y.e();
                k0Var2.r = null;
                this.b.r = false;
                if (!k0Var2.b) {
                    k0Var2.d();
                    k0Var2.E = null;
                    k0Var2.d = 0L;
                }
                k0Var2.c = k0Var2.b ? 1.0f : 0.0f;
                k0Var2.l();
                k0Var2.i(false);
                if (!k0Var2.b) {
                    k0Var2.l0.setVisibility(8);
                    k0Var2.m0.setVisibility(8);
                    k0Var2.f0.setVisibility(8);
                    k0Var2.g0.setVisibility(8);
                    break;
                }
                break;
            case 2:
                y yVar2 = this.b;
                if (yVar2.getParent() != null) {
                    this.c.removeView(yVar2);
                    yVar2.e();
                    break;
                }
                break;
            default:
                y yVar3 = this.b;
                if (yVar3.getParent() != null) {
                    this.c.removeView(yVar3);
                    yVar3.e();
                    break;
                }
                break;
        }
    }
}
