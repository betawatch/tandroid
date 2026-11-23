package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes3.dex */
public final class f4 extends AnimatorListenerAdapter {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ ArticleViewer$WindowView b;

    public f4(ArticleViewer$WindowView articleViewer$WindowView, boolean z10) {
        this.b = articleViewer$WindowView;
        this.a = z10;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        ArticleViewer$WindowView articleViewer$WindowView = this.b;
        g4 g4Var = articleViewer$WindowView.I;
        boolean z10 = articleViewer$WindowView.e;
        boolean z11 = this.a;
        if (z10) {
            Object obj = null;
            g4Var.v0[0].setBackgroundDrawable(null);
            if (!z11) {
                k3[] k3VarArr = g4Var.v0;
                k3 k3Var = k3VarArr[1];
                k3VarArr[1] = k3VarArr[0];
                k3VarArr[0] = k3Var;
                g4Var.i0.i();
                g4Var.b1.a(g4Var.v0[0].getBackgroundColor(), true);
                g4Var.c1.a(g4Var.v0[1].getBackgroundColor(), true);
                t3 t3Var = g4Var.L;
                if (t3Var != null) {
                    t3Var.z();
                }
                obj = p5.c.g(1, g4Var.e0);
                g4Var.Q0.S(g4Var.v0[0].b);
                org.telegram.ui.Cells.j9 j9Var = g4Var.Q0;
                j9Var.z0 = g4Var.v0[0].d;
                j9Var.f(true);
                g4Var.g0(false);
                g4Var.d0();
            }
            g4Var.v0[1].b();
            g4Var.v0[1].setVisibility(8);
            if (obj instanceof x2) {
                ((x2) obj).a();
            }
            if (obj instanceof TLRPC.WebPage) {
                org.telegram.ui.web.v1.o((TLRPC.WebPage) obj);
            }
        } else if (!z11) {
            t3 t3Var2 = g4Var.L;
            if (t3Var2 != null) {
                t3Var2.release();
                g4Var.q();
            } else {
                g4Var.S();
                g4Var.K();
            }
        }
        articleViewer$WindowView.e = false;
        articleViewer$WindowView.d = false;
        g4Var.V0 = false;
    }
}
