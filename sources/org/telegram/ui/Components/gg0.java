package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-c7458e893fd6f3e0a6fbf27724068aa00f1caa233b10a33d542967499303009b */
/* loaded from: classes3.dex */
public final class gg0 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ hg0 b;

    public /* synthetic */ gg0(hg0 hg0Var, int i10) {
        this.a = i10;
        this.b = hg0Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                hg0 hg0Var = this.b;
                hg0Var.h = false;
                hg0Var.a = hg0Var.c;
                hg0Var.invalidate();
                int i10 = hg0Var.J;
                if (i10 >= 0) {
                    hg0Var.b(i10);
                    hg0Var.J = -1;
                    break;
                }
                break;
            default:
                hg0 hg0Var2 = this.b;
                hg0Var2.n = false;
                hg0Var2.h = false;
                hg0Var2.invalidate();
                int i11 = hg0Var2.J;
                if (i11 >= 0) {
                    hg0Var2.b(i11);
                    hg0Var2.J = -1;
                }
                hg0Var2.a();
                break;
        }
    }
}
