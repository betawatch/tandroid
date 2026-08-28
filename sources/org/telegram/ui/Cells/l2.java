package org.telegram.ui.Cells;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class l2 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ r2 b;

    public /* synthetic */ l2(r2 r2Var, int i9) {
        this.a = i9;
        this.b = r2Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                r2 r2Var = this.b;
                r2Var.N3 = 1.0f;
                r2Var.Q3 = null;
                r2Var.R3 = null;
                r2Var.S3 = null;
                r2Var.invalidate();
                break;
            case 1:
                r2 r2Var2 = this.b;
                r2Var2.O3 = 1.0f;
                r2Var2.invalidate();
                break;
            default:
                r2 r2Var3 = this.b;
                int i9 = (r2Var3.O2 ? 1 : 0) + (r2Var3.M2 ? 2 : 0) + (r2Var3.N2 ? 4 : 0);
                int i10 = r2Var3.n4;
                if (i10 != i9) {
                    r2Var3.z(i10, i9);
                } else {
                    r2Var3.r4 = false;
                    r2Var3.p4 = i10;
                }
                r2Var3.invalidate();
                break;
        }
    }
}
