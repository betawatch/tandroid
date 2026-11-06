package org.telegram.ui.Cells;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
/* loaded from: classes3.dex */
public final class n2 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ t2 b;

    public /* synthetic */ n2(t2 t2Var, int i7) {
        this.a = i7;
        this.b = t2Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                t2 t2Var = this.b;
                t2Var.V3 = 1.0f;
                t2Var.Y3 = null;
                t2Var.Z3 = null;
                t2Var.a4 = null;
                t2Var.invalidate();
                break;
            case 1:
                t2 t2Var2 = this.b;
                t2Var2.W3 = 1.0f;
                t2Var2.invalidate();
                break;
            default:
                t2 t2Var3 = this.b;
                int i7 = (t2Var3.S2 ? 1 : 0) + (t2Var3.Q2 ? 2 : 0) + (t2Var3.R2 ? 4 : 0);
                int i10 = t2Var3.v4;
                if (i10 != i7) {
                    t2Var3.E(i10, i7);
                } else {
                    t2Var3.z4 = false;
                    t2Var3.x4 = i10;
                }
                t2Var3.invalidate();
                break;
        }
    }
}
