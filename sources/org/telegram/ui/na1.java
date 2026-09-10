package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.Window;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final class na1 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ pa1 b;

    public /* synthetic */ na1(pa1 pa1Var, int i10) {
        this.a = i10;
        this.b = pa1Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                pa1 pa1Var = this.b;
                pa1Var.b.setVisibility(4);
                hg.g gVar = pa1Var.b;
                gVar.J = false;
                hg.g gVar2 = pa1Var.c;
                gVar2.J = true;
                gVar.y0 = 0;
                gVar2.y0 = 0;
                Window window = pa1Var.a;
                if (window != null) {
                    window.clearFlags(16);
                    break;
                }
                break;
            case 1:
                pa1 pa1Var2 = this.b;
                hg.g gVar3 = pa1Var2.c;
                gVar3.setVisibility(4);
                hg.g gVar4 = pa1Var2.b;
                gVar4.y0 = 0;
                gVar3.y0 = 0;
                gVar4.J = true;
                gVar3.J = false;
                if (gVar4 instanceof hg.q) {
                    gVar4.u0 = false;
                    gVar4.d();
                } else {
                    gVar4.u0 = true;
                    gVar4.x((gVar4.G0 * gVar4.g0.k) - hg.g.k1);
                    gVar4.c(true);
                    gVar4.invalidate();
                }
                Window window2 = pa1Var2.a;
                if (window2 != null) {
                    window2.clearFlags(16);
                    break;
                }
                break;
            default:
                pa1 pa1Var3 = this.b;
                pa1Var3.b.y0 = 0;
                pa1Var3.e.setVisibility(8);
                break;
        }
    }
}
