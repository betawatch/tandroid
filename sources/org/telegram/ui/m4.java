package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class m4 extends AnimatorListenerAdapter {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ ArticleViewer$WindowView b;

    public m4(ArticleViewer$WindowView articleViewer$WindowView, boolean z4) {
        this.b = articleViewer$WindowView;
        this.a = z4;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        ArticleViewer$WindowView articleViewer$WindowView = this.b;
        n4 n4Var = articleViewer$WindowView.E;
        boolean z4 = articleViewer$WindowView.e;
        boolean z10 = this.a;
        if (z4) {
            Object obj = null;
            n4Var.r0[0].setBackgroundDrawable(null);
            if (!z10) {
                r3[] r3VarArr = n4Var.r0;
                r3 r3Var = r3VarArr[1];
                r3VarArr[1] = r3VarArr[0];
                r3VarArr[0] = r3Var;
                n4Var.e0.i();
                n4Var.W0.a(n4Var.r0[0].getBackgroundColor(), true);
                n4Var.X0.a(n4Var.r0[1].getBackgroundColor(), true);
                a4 a4Var = n4Var.H;
                if (a4Var != null) {
                    a4Var.m();
                }
                obj = e2.c.g(1, n4Var.a0);
                n4Var.L0.T(n4Var.r0[0].b);
                org.telegram.ui.Cells.l9 l9Var = n4Var.L0;
                l9Var.E0 = n4Var.r0[0].d;
                l9Var.f(true);
                n4Var.i0(false);
                n4Var.f0();
            }
            n4Var.r0[1].b();
            n4Var.r0[1].setVisibility(8);
            if (obj instanceof d3) {
                ((d3) obj).a();
            }
            if (obj instanceof TLRPC.WebPage) {
                org.telegram.ui.web.h2.o((TLRPC.WebPage) obj);
            }
        } else if (!z10) {
            a4 a4Var2 = n4Var.H;
            if (a4Var2 != null) {
                a4Var2.release();
                n4Var.s();
            } else {
                n4Var.U();
                n4Var.M();
            }
        }
        articleViewer$WindowView.e = false;
        articleViewer$WindowView.d = false;
        n4Var.Q0 = false;
    }
}
