package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.Window;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes3.dex */
public final class pa1 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ ra1 b;

    public /* synthetic */ pa1(ra1 ra1Var, int i10) {
        this.a = i10;
        this.b = ra1Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                ra1 ra1Var = this.b;
                ra1Var.b.setVisibility(4);
                jg.g gVar = ra1Var.b;
                gVar.J = false;
                jg.g gVar2 = ra1Var.c;
                gVar2.J = true;
                gVar.y0 = 0;
                gVar2.y0 = 0;
                Window window = ra1Var.a;
                if (window != null) {
                    window.clearFlags(16);
                    break;
                }
                break;
            case 1:
                ra1 ra1Var2 = this.b;
                jg.g gVar3 = ra1Var2.c;
                gVar3.setVisibility(4);
                jg.g gVar4 = ra1Var2.b;
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
                Window window2 = ra1Var2.a;
                if (window2 != null) {
                    window2.clearFlags(16);
                    break;
                }
                break;
            default:
                ra1 ra1Var3 = this.b;
                ra1Var3.b.y0 = 0;
                ra1Var3.e.setVisibility(8);
                break;
        }
    }
}
