package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes3.dex */
public final class j4 extends AnimatorListenerAdapter {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ ArticleViewer$WindowView b;

    public j4(ArticleViewer$WindowView articleViewer$WindowView, boolean z10) {
        this.b = articleViewer$WindowView;
        this.a = z10;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        ArticleViewer$WindowView articleViewer$WindowView = this.b;
        k4 k4Var = articleViewer$WindowView.H;
        boolean z10 = articleViewer$WindowView.e;
        boolean z11 = this.a;
        if (z10) {
            Object obj = null;
            k4Var.u0[0].setBackgroundDrawable(null);
            if (!z11) {
                n3[] n3VarArr = k4Var.u0;
                n3 n3Var = n3VarArr[1];
                n3VarArr[1] = n3VarArr[0];
                n3VarArr[0] = n3Var;
                k4Var.h0.i();
                k4Var.a1.a(k4Var.u0[0].getBackgroundColor(), true);
                k4Var.b1.a(k4Var.u0[1].getBackgroundColor(), true);
                w3 w3Var = k4Var.K;
                if (w3Var != null) {
                    w3Var.m();
                }
                obj = i2.o1.A(1, k4Var.d0);
                k4Var.P0.S(k4Var.u0[0].b);
                org.telegram.ui.Cells.o9 o9Var = k4Var.P0;
                o9Var.z0 = k4Var.u0[0].d;
                o9Var.f(true);
                k4Var.i0(false);
                k4Var.f0();
            }
            k4Var.u0[1].b();
            k4Var.u0[1].setVisibility(8);
            if (obj instanceof a3) {
                ((a3) obj).a();
            }
            if (obj instanceof TLRPC.WebPage) {
                org.telegram.ui.web.i2.o((TLRPC.WebPage) obj);
            }
        } else if (!z11) {
            w3 w3Var2 = k4Var.K;
            if (w3Var2 != null) {
                w3Var2.release();
                k4Var.s();
            } else {
                k4Var.U();
                k4Var.M();
            }
        }
        articleViewer$WindowView.e = false;
        articleViewer$WindowView.d = false;
        k4Var.U0 = false;
    }
}
