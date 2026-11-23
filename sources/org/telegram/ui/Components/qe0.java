package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final class qe0 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ re0 b;

    public /* synthetic */ qe0(re0 re0Var, int i7) {
        this.a = i7;
        this.b = re0Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                re0 re0Var = this.b;
                re0Var.h = false;
                re0Var.a = re0Var.c;
                re0Var.invalidate();
                int i7 = re0Var.K;
                if (i7 >= 0) {
                    re0Var.b(i7);
                    re0Var.K = -1;
                    break;
                }
                break;
            default:
                re0 re0Var2 = this.b;
                re0Var2.n = false;
                re0Var2.h = false;
                re0Var2.invalidate();
                int i10 = re0Var2.K;
                if (i10 >= 0) {
                    re0Var2.b(i10);
                    re0Var2.K = -1;
                }
                re0Var2.a();
                break;
        }
    }
}
