package org.telegram.ui.Components.voip;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
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
                k0Var.O0 = null;
                k0Var.E.F = false;
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
                super.onAnimationEnd(animator);
                k0 k0Var2 = this.b;
                k0Var2.K0 = null;
                k0Var2.J0 = 0.0f;
                k0Var2.invalidate();
                break;
            default:
                k0 k0Var3 = this.b;
                k0Var3.C0 = null;
                k0Var3.z0 = 1.0f;
                k0Var3.s0 = 0.0f;
                k0Var3.t0 = 0.0f;
                k0Var3.invalidate();
                break;
        }
    }
}
