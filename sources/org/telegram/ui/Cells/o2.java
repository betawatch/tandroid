package org.telegram.ui.Cells;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class o2 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ v2 b;

    public /* synthetic */ o2(v2 v2Var, int i10) {
        this.a = i10;
        this.b = v2Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                v2 v2Var = this.b;
                v2Var.V3 = 1.0f;
                v2Var.Y3 = null;
                v2Var.Z3 = null;
                v2Var.a4 = null;
                v2Var.invalidate();
                break;
            case 1:
                v2 v2Var2 = this.b;
                v2Var2.W3 = 1.0f;
                v2Var2.invalidate();
                break;
            default:
                v2 v2Var3 = this.b;
                int i10 = (v2Var3.S2 ? 1 : 0) + (v2Var3.Q2 ? 2 : 0) + (v2Var3.R2 ? 4 : 0);
                int i11 = v2Var3.v4;
                if (i11 != i10) {
                    v2Var3.H(i11, i10);
                } else {
                    v2Var3.z4 = false;
                    v2Var3.x4 = i11;
                }
                v2Var3.invalidate();
                break;
        }
    }
}
