package org.telegram.ui.Cells;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final class j2 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ p2 b;

    public /* synthetic */ j2(p2 p2Var, int i10) {
        this.a = i10;
        this.b = p2Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                p2 p2Var = this.b;
                p2Var.V3 = 1.0f;
                p2Var.Y3 = null;
                p2Var.Z3 = null;
                p2Var.a4 = null;
                p2Var.invalidate();
                break;
            case 1:
                p2 p2Var2 = this.b;
                p2Var2.W3 = 1.0f;
                p2Var2.invalidate();
                break;
            default:
                p2 p2Var3 = this.b;
                int i10 = (p2Var3.S2 ? 1 : 0) + (p2Var3.Q2 ? 2 : 0) + (p2Var3.R2 ? 4 : 0);
                int i11 = p2Var3.v4;
                if (i11 != i10) {
                    p2Var3.y(i11, i10);
                } else {
                    p2Var3.z4 = false;
                    p2Var3.x4 = i11;
                }
                p2Var3.invalidate();
                break;
        }
    }
}
