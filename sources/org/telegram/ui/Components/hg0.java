package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-512d310aee599d224f4c0b0a2d01feec484432ddc9f55a7433fffe3405d6493d */
/* loaded from: classes3.dex */
public final class hg0 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ ig0 b;

    public /* synthetic */ hg0(ig0 ig0Var, int i10) {
        this.a = i10;
        this.b = ig0Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                ig0 ig0Var = this.b;
                ig0Var.h = false;
                ig0Var.a = ig0Var.c;
                ig0Var.invalidate();
                int i10 = ig0Var.J;
                if (i10 >= 0) {
                    ig0Var.b(i10);
                    ig0Var.J = -1;
                    break;
                }
                break;
            default:
                ig0 ig0Var2 = this.b;
                ig0Var2.n = false;
                ig0Var2.h = false;
                ig0Var2.invalidate();
                int i11 = ig0Var2.J;
                if (i11 >= 0) {
                    ig0Var2.b(i11);
                    ig0Var2.J = -1;
                }
                ig0Var2.a();
                break;
        }
    }
}
