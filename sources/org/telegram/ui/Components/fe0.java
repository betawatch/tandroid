package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final class fe0 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ ge0 b;

    public /* synthetic */ fe0(ge0 ge0Var, int i7) {
        this.a = i7;
        this.b = ge0Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                ge0 ge0Var = this.b;
                ge0Var.h = false;
                ge0Var.a = ge0Var.c;
                ge0Var.invalidate();
                int i7 = ge0Var.K;
                if (i7 >= 0) {
                    ge0Var.b(i7);
                    ge0Var.K = -1;
                    break;
                }
                break;
            default:
                ge0 ge0Var2 = this.b;
                ge0Var2.n = false;
                ge0Var2.h = false;
                ge0Var2.invalidate();
                int i10 = ge0Var2.K;
                if (i10 >= 0) {
                    ge0Var2.b(i10);
                    ge0Var2.K = -1;
                }
                ge0Var2.a();
                break;
        }
    }
}
