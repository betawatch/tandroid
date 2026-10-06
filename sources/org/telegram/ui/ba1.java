package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.Window;

/* compiled from: r8-map-id-995671d6bce0aaeb91824b65f2f1988c5410eae59f1d5d7c368a0027313cc0ad */
/* loaded from: classes3.dex */
public final class ba1 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ da1 b;

    public /* synthetic */ ba1(da1 da1Var, int i10) {
        this.a = i10;
        this.b = da1Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                da1 da1Var = this.b;
                da1Var.b.setVisibility(4);
                ig.g gVar = da1Var.b;
                gVar.J = false;
                ig.g gVar2 = da1Var.c;
                gVar2.J = true;
                gVar.y0 = 0;
                gVar2.y0 = 0;
                Window window = da1Var.a;
                if (window != null) {
                    window.clearFlags(16);
                    break;
                }
                break;
            case 1:
                da1 da1Var2 = this.b;
                ig.g gVar3 = da1Var2.c;
                gVar3.setVisibility(4);
                ig.g gVar4 = da1Var2.b;
                gVar4.y0 = 0;
                gVar3.y0 = 0;
                gVar4.J = true;
                gVar3.J = false;
                if (gVar4 instanceof ig.q) {
                    gVar4.u0 = false;
                    gVar4.d();
                } else {
                    gVar4.u0 = true;
                    gVar4.x((gVar4.G0 * gVar4.g0.k) - ig.g.k1);
                    gVar4.c(true);
                    gVar4.invalidate();
                }
                Window window2 = da1Var2.a;
                if (window2 != null) {
                    window2.clearFlags(16);
                    break;
                }
                break;
            default:
                da1 da1Var3 = this.b;
                da1Var3.b.y0 = 0;
                da1Var3.e.setVisibility(8);
                break;
        }
    }
}
