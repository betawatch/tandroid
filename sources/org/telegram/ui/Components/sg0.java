package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final class sg0 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ tg0 b;

    public /* synthetic */ sg0(tg0 tg0Var, int i10) {
        this.a = i10;
        this.b = tg0Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                tg0 tg0Var = this.b;
                tg0Var.h = false;
                tg0Var.a = tg0Var.c;
                tg0Var.invalidate();
                int i10 = tg0Var.J;
                if (i10 >= 0) {
                    tg0Var.b(i10);
                    tg0Var.J = -1;
                    break;
                }
                break;
            default:
                tg0 tg0Var2 = this.b;
                tg0Var2.n = false;
                tg0Var2.h = false;
                tg0Var2.invalidate();
                int i11 = tg0Var2.J;
                if (i11 >= 0) {
                    tg0Var2.b(i11);
                    tg0Var2.J = -1;
                }
                tg0Var2.a();
                break;
        }
    }
}
