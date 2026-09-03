package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class a1 extends AnimatorListenerAdapter {
    public final /* synthetic */ n4 a;

    public a1(n4 n4Var) {
        this.a = n4Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        n4 n4Var = this.a;
        a4 a4Var = n4Var.H;
        if (n4Var.c0.e) {
            n4Var.r0[0].setBackgroundDrawable(null);
            r3[] r3VarArr = n4Var.r0;
            r3 r3Var = r3VarArr[1];
            r3VarArr[1] = r3VarArr[0];
            r3VarArr[0] = r3Var;
            n4Var.e0.i();
            n4Var.W0.a(n4Var.r0[0].getBackgroundColor(), true);
            n4Var.X0.a(n4Var.r0[1].getBackgroundColor(), true);
            if (a4Var != null) {
                a4Var.m();
            }
            Object g10 = e2.c.g(1, n4Var.a0);
            n4Var.L0.T(n4Var.r0[0].b);
            org.telegram.ui.Cells.l9 l9Var = n4Var.L0;
            l9Var.E0 = n4Var.r0[0].d;
            l9Var.f(true);
            n4Var.i0(false);
            n4Var.f0();
            n4Var.r0[1].b();
            n4Var.r0[1].setVisibility(8);
            if (g10 instanceof d3) {
                ((d3) g10).a();
            }
            if (g10 instanceof TLRPC.WebPage) {
                org.telegram.ui.web.h2.o((TLRPC.WebPage) g10);
            }
        } else if (a4Var != null) {
            a4Var.release();
            n4Var.s();
        } else {
            n4Var.U();
            n4Var.M();
        }
        ArticleViewer$WindowView articleViewer$WindowView = n4Var.c0;
        articleViewer$WindowView.e = false;
        articleViewer$WindowView.d = false;
        n4Var.Q0 = false;
    }
}
