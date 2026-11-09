package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.Window;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final class k41 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ m41 b;

    public /* synthetic */ k41(m41 m41Var, int i7) {
        this.a = i7;
        this.b = m41Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                m41 m41Var = this.b;
                m41Var.b.setVisibility(4);
                lg.g gVar = m41Var.b;
                gVar.J = false;
                lg.g gVar2 = m41Var.c;
                gVar2.J = true;
                gVar.y0 = 0;
                gVar2.y0 = 0;
                Window window = m41Var.a;
                if (window != null) {
                    window.clearFlags(16);
                    break;
                }
                break;
            case 1:
                m41 m41Var2 = this.b;
                lg.g gVar3 = m41Var2.c;
                gVar3.setVisibility(4);
                lg.g gVar4 = m41Var2.b;
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
                Window window2 = m41Var2.a;
                if (window2 != null) {
                    window2.clearFlags(16);
                    break;
                }
                break;
            default:
                m41 m41Var3 = this.b;
                m41Var3.b.y0 = 0;
                m41Var3.e.setVisibility(8);
                break;
        }
    }
}
