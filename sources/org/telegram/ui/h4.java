package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-1181a9f210c4244598aa36bb39e1460f3842f305ed8c0c95af755ee091fedd7d */
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
        i4 i4Var = articleViewer$WindowView.H;
        boolean z10 = articleViewer$WindowView.e;
        boolean z11 = this.a;
        if (z10) {
            Object obj = null;
            i4Var.u0[0].setBackgroundDrawable(null);
            if (!z11) {
                m3[] m3VarArr = i4Var.u0;
                m3 m3Var = m3VarArr[1];
                m3VarArr[1] = m3VarArr[0];
                m3VarArr[0] = m3Var;
                i4Var.h0.i();
                i4Var.Z0.a(i4Var.u0[0].getBackgroundColor(), true);
                i4Var.a1.a(i4Var.u0[1].getBackgroundColor(), true);
                v3 v3Var = i4Var.K;
                if (v3Var != null) {
                    v3Var.m();
                }
                obj = i2.g.z(1, i4Var.d0);
                i4Var.O0.T(i4Var.u0[0].b);
                org.telegram.ui.Cells.q9 q9Var = i4Var.O0;
                q9Var.E0 = i4Var.u0[0].d;
                q9Var.f(true);
                i4Var.i0(false);
                i4Var.f0();
            }
            i4Var.u0[1].b();
            i4Var.u0[1].setVisibility(8);
            if (obj instanceof z2) {
                ((z2) obj).a();
            }
            if (obj instanceof TLRPC.WebPage) {
                org.telegram.ui.web.j2.o((TLRPC.WebPage) obj);
            }
        } else if (!z11) {
            v3 v3Var2 = i4Var.K;
            if (v3Var2 != null) {
                v3Var2.release();
                i4Var.s();
            } else {
                i4Var.U();
                i4Var.M();
            }
        }
        articleViewer$WindowView.e = false;
        articleViewer$WindowView.d = false;
        i4Var.T0 = false;
    }
}
