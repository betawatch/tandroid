package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class h4 extends AnimatorListenerAdapter {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ ArticleViewer$WindowView b;

    public h4(ArticleViewer$WindowView articleViewer$WindowView, boolean z10) {
        this.b = articleViewer$WindowView;
        this.a = z10;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        ArticleViewer$WindowView articleViewer$WindowView = this.b;
        i4 i4Var = articleViewer$WindowView.I;
        boolean z10 = articleViewer$WindowView.e;
        boolean z11 = this.a;
        if (z10) {
            Object obj = null;
            i4Var.v0[0].setBackgroundDrawable(null);
            if (!z11) {
                l3[] l3VarArr = i4Var.v0;
                l3 l3Var = l3VarArr[1];
                l3VarArr[1] = l3VarArr[0];
                l3VarArr[0] = l3Var;
                i4Var.i0.i();
                i4Var.b1.a(i4Var.v0[0].getBackgroundColor(), true);
                i4Var.c1.a(i4Var.v0[1].getBackgroundColor(), true);
                u3 u3Var = i4Var.L;
                if (u3Var != null) {
                    u3Var.z();
                }
                obj = org.telegram.ui.Cells.f1.o(1, i4Var.e0);
                i4Var.Q0.S(i4Var.v0[0].b);
                org.telegram.ui.Cells.h9 h9Var = i4Var.Q0;
                h9Var.z0 = i4Var.v0[0].d;
                h9Var.f(true);
                i4Var.g0(false);
                i4Var.d0();
            }
            i4Var.v0[1].b();
            i4Var.v0[1].setVisibility(8);
            if (obj instanceof y2) {
                ((y2) obj).a();
            }
            if (obj instanceof TLRPC.WebPage) {
                org.telegram.ui.web.u1.o((TLRPC.WebPage) obj);
            }
        } else if (!z11) {
            u3 u3Var2 = i4Var.L;
            if (u3Var2 != null) {
                u3Var2.release();
                i4Var.q();
            } else {
                i4Var.S();
                i4Var.K();
            }
        }
        articleViewer$WindowView.e = false;
        articleViewer$WindowView.d = false;
        i4Var.V0 = false;
    }
}
