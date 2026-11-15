package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final class l01 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ v01 b;

    public /* synthetic */ l01(v01 v01Var, int i7) {
        this.a = i7;
        this.b = v01Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                v01 v01Var = this.b;
                if (v01Var.U == animator) {
                    v01Var.U = null;
                    break;
                }
                break;
            case 1:
                v01 v01Var2 = this.b;
                if (v01Var2.g0 == animator) {
                    v01Var2.g0 = null;
                }
                v01Var2.b(1.0f);
                break;
            default:
                v01 v01Var3 = this.b;
                if (v01Var3.K == animator) {
                    v01Var3.K = null;
                    break;
                }
                break;
        }
    }
}
