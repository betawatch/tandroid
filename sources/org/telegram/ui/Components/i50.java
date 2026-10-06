package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-512d310aee599d224f4c0b0a2d01feec484432ddc9f55a7433fffe3405d6493d */
/* loaded from: classes3.dex */
public final class i50 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ f60 b;

    public /* synthetic */ i50(f60 f60Var, int i10) {
        this.a = i10;
        this.b = f60Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                f60 f60Var = this.b;
                if (animator.equals(f60Var.L)) {
                    f60Var.L = null;
                    break;
                }
                break;
            case 1:
                f60 f60Var2 = this.b;
                if (f60Var2.g1 != null) {
                    f60Var2.g1 = null;
                    break;
                }
                break;
            default:
                f60 f60Var3 = this.b;
                if (animator.equals(f60Var3.e0)) {
                    f60Var3.c(true);
                    f60Var3.b1 = false;
                    f60Var3.setVisibility(4);
                    break;
                }
                break;
        }
    }
}
