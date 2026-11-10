package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class f4 extends AnimatorListenerAdapter {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ ArticleViewer$WindowView b;

    public f4(ArticleViewer$WindowView articleViewer$WindowView, boolean z9) {
        this.b = articleViewer$WindowView;
        this.a = z9;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        ArticleViewer$WindowView articleViewer$WindowView = this.b;
        g4 g4Var = articleViewer$WindowView.H;
        boolean z9 = articleViewer$WindowView.e;
        boolean z10 = this.a;
        if (z9) {
            Object obj = null;
            g4Var.u0[0].setBackgroundDrawable(null);
            if (!z10) {
                k3[] k3VarArr = g4Var.u0;
                k3 k3Var = k3VarArr[1];
                k3VarArr[1] = k3VarArr[0];
                k3VarArr[0] = k3Var;
                g4Var.h0.i();
                g4Var.a1.a(g4Var.u0[0].getBackgroundColor(), true);
                g4Var.b1.a(g4Var.u0[1].getBackgroundColor(), true);
                t3 t3Var = g4Var.K;
                if (t3Var != null) {
                    t3Var.z();
                }
                obj = org.telegram.ui.Cells.f1.k(1, g4Var.d0);
                g4Var.P0.S(g4Var.u0[0].b);
                org.telegram.ui.Cells.i9 i9Var = g4Var.P0;
                i9Var.z0 = g4Var.u0[0].d;
                i9Var.f(true);
                g4Var.g0(false);
                g4Var.d0();
            }
            g4Var.u0[1].b();
            g4Var.u0[1].setVisibility(8);
            if (obj instanceof x2) {
                ((x2) obj).a();
            }
            if (obj instanceof TLRPC.WebPage) {
                org.telegram.ui.web.w1.o((TLRPC.WebPage) obj);
            }
        } else if (!z10) {
            t3 t3Var2 = g4Var.K;
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
        g4Var.U0 = false;
    }
}
