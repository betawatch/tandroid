package org.telegram.ui.Cells;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-6bb23a39fe2d1bb2dc6cc69f606436ba751c240cf93e0ff97ff041cb9f09a305 */
/* loaded from: classes3.dex */
public final class k2 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ q2 b;

    public /* synthetic */ k2(q2 q2Var, int i10) {
        this.a = i10;
        this.b = q2Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                q2 q2Var = this.b;
                q2Var.V3 = 1.0f;
                q2Var.Y3 = null;
                q2Var.Z3 = null;
                q2Var.a4 = null;
                q2Var.invalidate();
                break;
            case 1:
                q2 q2Var2 = this.b;
                q2Var2.W3 = 1.0f;
                q2Var2.invalidate();
                break;
            default:
                q2 q2Var3 = this.b;
                int i10 = (q2Var3.S2 ? 1 : 0) + (q2Var3.Q2 ? 2 : 0) + (q2Var3.R2 ? 4 : 0);
                int i11 = q2Var3.v4;
                if (i11 != i10) {
                    q2Var3.z(i11, i10);
                } else {
                    q2Var3.z4 = false;
                    q2Var3.x4 = i11;
                }
                q2Var3.invalidate();
                break;
        }
    }
}
