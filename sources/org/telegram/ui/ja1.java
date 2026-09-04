package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.Window;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes3.dex */
public final class ja1 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ la1 b;

    public /* synthetic */ ja1(la1 la1Var, int i10) {
        this.a = i10;
        this.b = la1Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                la1 la1Var = this.b;
                la1Var.b.setVisibility(4);
                jg.g gVar = la1Var.b;
                gVar.J = false;
                jg.g gVar2 = la1Var.c;
                gVar2.J = true;
                gVar.y0 = 0;
                gVar2.y0 = 0;
                Window window = la1Var.a;
                if (window != null) {
                    window.clearFlags(16);
                    break;
                }
                break;
            case 1:
                la1 la1Var2 = this.b;
                jg.g gVar3 = la1Var2.c;
                gVar3.setVisibility(4);
                jg.g gVar4 = la1Var2.b;
                gVar4.y0 = 0;
                gVar3.y0 = 0;
                gVar4.J = true;
                gVar3.J = false;
                if (gVar4 instanceof jg.q) {
                    gVar4.u0 = false;
                    gVar4.d();
                } else {
                    gVar4.u0 = true;
                    gVar4.x((gVar4.G0 * gVar4.g0.k) - jg.g.k1);
                    gVar4.c(true);
                    gVar4.invalidate();
                }
                Window window2 = la1Var2.a;
                if (window2 != null) {
                    window2.clearFlags(16);
                    break;
                }
                break;
            default:
                la1 la1Var3 = this.b;
                la1Var3.b.y0 = 0;
                la1Var3.e.setVisibility(8);
                break;
        }
    }
}
