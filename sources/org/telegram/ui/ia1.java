package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.Window;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final class ia1 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ ka1 b;

    public /* synthetic */ ia1(ka1 ka1Var, int i10) {
        this.a = i10;
        this.b = ka1Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                ka1 ka1Var = this.b;
                ka1Var.b.setVisibility(4);
                ig.g gVar = ka1Var.b;
                gVar.J = false;
                ig.g gVar2 = ka1Var.c;
                gVar2.J = true;
                gVar.y0 = 0;
                gVar2.y0 = 0;
                Window window = ka1Var.a;
                if (window != null) {
                    window.clearFlags(16);
                    break;
                }
                break;
            case 1:
                ka1 ka1Var2 = this.b;
                ig.g gVar3 = ka1Var2.c;
                gVar3.setVisibility(4);
                ig.g gVar4 = ka1Var2.b;
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
                Window window2 = ka1Var2.a;
                if (window2 != null) {
                    window2.clearFlags(16);
                    break;
                }
                break;
            default:
                ka1 ka1Var3 = this.b;
                ka1Var3.b.y0 = 0;
                ka1Var3.e.setVisibility(8);
                break;
        }
    }
}
