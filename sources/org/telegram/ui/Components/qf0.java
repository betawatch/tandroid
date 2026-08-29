package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class qf0 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ rf0 b;

    public /* synthetic */ qf0(rf0 rf0Var, int i10) {
        this.a = i10;
        this.b = rf0Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                rf0 rf0Var = this.b;
                rf0Var.h = false;
                rf0Var.a = rf0Var.c;
                rf0Var.invalidate();
                int i10 = rf0Var.F;
                if (i10 >= 0) {
                    rf0Var.b(i10);
                    rf0Var.F = -1;
                    break;
                }
                break;
            default:
                rf0 rf0Var2 = this.b;
                rf0Var2.n = false;
                rf0Var2.h = false;
                rf0Var2.invalidate();
                int i11 = rf0Var2.F;
                if (i11 >= 0) {
                    rf0Var2.b(i11);
                    rf0Var2.F = -1;
                }
                rf0Var2.a();
                break;
        }
    }
}
