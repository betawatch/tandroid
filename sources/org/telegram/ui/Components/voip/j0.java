package org.telegram.ui.Components.voip;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
/* loaded from: classes3.dex */
public final class j0 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ k0 b;

    public /* synthetic */ j0(k0 k0Var, int i7) {
        this.a = i7;
        this.b = k0Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                k0 k0Var = this.b;
                k0Var.N0 = null;
                k0Var.D.E = false;
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
                super.onAnimationEnd(animator);
                k0 k0Var2 = this.b;
                k0Var2.J0 = null;
                k0Var2.I0 = 0.0f;
                k0Var2.invalidate();
                break;
            default:
                k0 k0Var3 = this.b;
                k0Var3.B0 = null;
                k0Var3.y0 = 1.0f;
                k0Var3.r0 = 0.0f;
                k0Var3.s0 = 0.0f;
                k0Var3.invalidate();
                break;
        }
    }
}
