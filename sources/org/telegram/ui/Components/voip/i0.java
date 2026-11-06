package org.telegram.ui.Components.voip;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
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
                k0Var.N0 = null;
                this.b.E = false;
                y yVar = k0Var.E;
                if (yVar != null) {
                    if (yVar.getParent() != null) {
                        k0Var.removeView(k0Var.E);
                        k0Var.E.e();
                    }
                    k0Var.E = null;
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
                    k0Var2.D = null;
                    k0Var2.d = 0L;
                }
                k0Var2.c = k0Var2.b ? 1.0f : 0.0f;
                k0Var2.l();
                k0Var2.i(false);
                if (!k0Var2.b) {
                    k0Var2.k0.setVisibility(8);
                    k0Var2.l0.setVisibility(8);
                    k0Var2.e0.setVisibility(8);
                    k0Var2.f0.setVisibility(8);
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
