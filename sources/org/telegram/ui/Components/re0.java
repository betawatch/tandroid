package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes3.dex */
public final class re0 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ se0 b;

    public /* synthetic */ re0(se0 se0Var, int i7) {
        this.a = i7;
        this.b = se0Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                se0 se0Var = this.b;
                se0Var.h = false;
                se0Var.a = se0Var.c;
                se0Var.invalidate();
                int i7 = se0Var.K;
                if (i7 >= 0) {
                    se0Var.b(i7);
                    se0Var.K = -1;
                    break;
                }
                break;
            default:
                se0 se0Var2 = this.b;
                se0Var2.n = false;
                se0Var2.h = false;
                se0Var2.invalidate();
                int i10 = se0Var2.K;
                if (i10 >= 0) {
                    se0Var2.b(i10);
                    se0Var2.K = -1;
                }
                se0Var2.a();
                break;
        }
    }
}
