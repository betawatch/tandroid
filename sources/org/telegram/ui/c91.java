package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.Window;

/* compiled from: r8-map-id-6bb23a39fe2d1bb2dc6cc69f606436ba751c240cf93e0ff97ff041cb9f09a305 */
/* loaded from: classes3.dex */
public final class c91 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ e91 b;

    public /* synthetic */ c91(e91 e91Var, int i10) {
        this.a = i10;
        this.b = e91Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                e91 e91Var = this.b;
                e91Var.b.setVisibility(4);
                jg.g gVar = e91Var.b;
                gVar.J = false;
                jg.g gVar2 = e91Var.c;
                gVar2.J = true;
                gVar.y0 = 0;
                gVar2.y0 = 0;
                Window window = e91Var.a;
                if (window != null) {
                    window.clearFlags(16);
                    break;
                }
                break;
            case 1:
                e91 e91Var2 = this.b;
                jg.g gVar3 = e91Var2.c;
                gVar3.setVisibility(4);
                jg.g gVar4 = e91Var2.b;
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
                Window window2 = e91Var2.a;
                if (window2 != null) {
                    window2.clearFlags(16);
                    break;
                }
                break;
            default:
                e91 e91Var3 = this.b;
                e91Var3.b.y0 = 0;
                e91Var3.e.setVisibility(8);
                break;
        }
    }
}
