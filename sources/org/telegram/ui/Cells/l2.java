package org.telegram.ui.Cells;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final class l2 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ s2 b;

    public /* synthetic */ l2(s2 s2Var, int i10) {
        this.a = i10;
        this.b = s2Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                s2 s2Var = this.b;
                s2Var.V3 = 1.0f;
                s2Var.Y3 = null;
                s2Var.Z3 = null;
                s2Var.a4 = null;
                s2Var.invalidate();
                break;
            case 1:
                s2 s2Var2 = this.b;
                s2Var2.W3 = 1.0f;
                s2Var2.invalidate();
                break;
            default:
                s2 s2Var3 = this.b;
                int i10 = (s2Var3.S2 ? 1 : 0) + (s2Var3.Q2 ? 2 : 0) + (s2Var3.R2 ? 4 : 0);
                int i11 = s2Var3.v4;
                if (i11 != i10) {
                    s2Var3.B(i11, i10);
                } else {
                    s2Var3.z4 = false;
                    s2Var3.x4 = i11;
                }
                s2Var3.invalidate();
                break;
        }
    }
}
