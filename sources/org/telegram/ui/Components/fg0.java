package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
/* loaded from: classes3.dex */
public final class fg0 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ gg0 b;

    public /* synthetic */ fg0(gg0 gg0Var, int i10) {
        this.a = i10;
        this.b = gg0Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                gg0 gg0Var = this.b;
                gg0Var.h = false;
                gg0Var.a = gg0Var.c;
                gg0Var.invalidate();
                int i10 = gg0Var.J;
                if (i10 >= 0) {
                    gg0Var.b(i10);
                    gg0Var.J = -1;
                    break;
                }
                break;
            default:
                gg0 gg0Var2 = this.b;
                gg0Var2.n = false;
                gg0Var2.h = false;
                gg0Var2.invalidate();
                int i11 = gg0Var2.J;
                if (i11 >= 0) {
                    gg0Var2.b(i11);
                    gg0Var2.J = -1;
                }
                gg0Var2.a();
                break;
        }
    }
}
