package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-5c4d11c5a4a3c3963e49de090c9ebed761f6fe8b7d1fb1bb05822f03003d35b5 */
/* loaded from: classes3.dex */
public final class pg0 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ qg0 b;

    public /* synthetic */ pg0(qg0 qg0Var, int i10) {
        this.a = i10;
        this.b = qg0Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                qg0 qg0Var = this.b;
                qg0Var.h = false;
                qg0Var.a = qg0Var.c;
                qg0Var.invalidate();
                int i10 = qg0Var.J;
                if (i10 >= 0) {
                    qg0Var.b(i10);
                    qg0Var.J = -1;
                    break;
                }
                break;
            default:
                qg0 qg0Var2 = this.b;
                qg0Var2.n = false;
                qg0Var2.h = false;
                qg0Var2.invalidate();
                int i11 = qg0Var2.J;
                if (i11 >= 0) {
                    qg0Var2.b(i11);
                    qg0Var2.J = -1;
                }
                qg0Var2.a();
                break;
        }
    }
}
