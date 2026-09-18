package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.Window;

/* compiled from: r8-map-id-c0e607070f32dbde65005355ff6c489b77f9395a3e0f8720848e2402860dea84 */
/* loaded from: classes3.dex */
public final class ha1 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ ja1 b;

    public /* synthetic */ ha1(ja1 ja1Var, int i10) {
        this.a = i10;
        this.b = ja1Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                ja1 ja1Var = this.b;
                ja1Var.b.setVisibility(4);
                ig.g gVar = ja1Var.b;
                gVar.J = false;
                ig.g gVar2 = ja1Var.c;
                gVar2.J = true;
                gVar.y0 = 0;
                gVar2.y0 = 0;
                Window window = ja1Var.a;
                if (window != null) {
                    window.clearFlags(16);
                    break;
                }
                break;
            case 1:
                ja1 ja1Var2 = this.b;
                ig.g gVar3 = ja1Var2.c;
                gVar3.setVisibility(4);
                ig.g gVar4 = ja1Var2.b;
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
                Window window2 = ja1Var2.a;
                if (window2 != null) {
                    window2.clearFlags(16);
                    break;
                }
                break;
            default:
                ja1 ja1Var3 = this.b;
                ja1Var3.b.y0 = 0;
                ja1Var3.e.setVisibility(8);
                break;
        }
    }
}
