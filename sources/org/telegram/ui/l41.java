package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.Window;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class l41 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ n41 b;

    public /* synthetic */ l41(n41 n41Var, int i7) {
        this.a = i7;
        this.b = n41Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                n41 n41Var = this.b;
                n41Var.b.setVisibility(4);
                lg.g gVar = n41Var.b;
                gVar.J = false;
                lg.g gVar2 = n41Var.c;
                gVar2.J = true;
                gVar.y0 = 0;
                gVar2.y0 = 0;
                Window window = n41Var.a;
                if (window != null) {
                    window.clearFlags(16);
                    break;
                }
                break;
            case 1:
                n41 n41Var2 = this.b;
                lg.g gVar3 = n41Var2.c;
                gVar3.setVisibility(4);
                lg.g gVar4 = n41Var2.b;
                gVar4.y0 = 0;
                gVar3.y0 = 0;
                gVar4.J = true;
                gVar3.J = false;
                if (gVar4 instanceof lg.q) {
                    gVar4.u0 = false;
                    gVar4.d();
                } else {
                    gVar4.u0 = true;
                    gVar4.x((gVar4.G0 * gVar4.g0.k) - lg.g.k1);
                    gVar4.c(true);
                    gVar4.invalidate();
                }
                Window window2 = n41Var2.a;
                if (window2 != null) {
                    window2.clearFlags(16);
                    break;
                }
                break;
            default:
                n41 n41Var3 = this.b;
                n41Var3.b.y0 = 0;
                n41Var3.e.setVisibility(8);
                break;
        }
    }
}
