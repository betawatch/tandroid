package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class a1 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ l4 b;

    public a1(l4 l4Var, int i9) {
        this.b = l4Var;
        this.a = i9;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        l4 l4Var = this.b;
        ArrayList arrayList = l4Var.Z;
        if (l4Var.b0.f) {
            ArrayList arrayList2 = new ArrayList();
            l4Var.q0[0].setBackgroundDrawable(null);
            p3[] p3VarArr = l4Var.q0;
            p3 p3Var = p3VarArr[1];
            p3VarArr[1] = p3VarArr[0];
            p3VarArr[0] = p3Var;
            l4Var.d0.i();
            l4Var.V0.a(l4Var.q0[0].getBackgroundColor(), true);
            l4Var.W0.a(l4Var.q0[1].getBackgroundColor(), true);
            y3 y3Var = l4Var.G;
            if (y3Var != null) {
                y3Var.m();
            }
            for (int size = arrayList.size() - 1; size > this.a; size--) {
                arrayList2.add(arrayList.remove(size));
            }
            l4Var.K0.T(l4Var.q0[0].b);
            org.telegram.ui.Cells.n9 n9Var = l4Var.K0;
            n9Var.E0 = l4Var.q0[0].d;
            n9Var.f(true);
            l4Var.i0(false);
            l4Var.f0();
            l4Var.q0[1].b();
            l4Var.q0[1].setVisibility(8);
            int size2 = arrayList2.size();
            int i9 = 0;
            while (i9 < size2) {
                Object obj = arrayList2.get(i9);
                i9++;
                if (obj instanceof c3) {
                    ((c3) obj).a();
                }
                if (obj instanceof TLRPC.WebPage) {
                    org.telegram.ui.web.d2.o((TLRPC.WebPage) obj);
                }
            }
        } else {
            l4Var.U();
            l4Var.M();
        }
        ArticleViewer$WindowView articleViewer$WindowView = l4Var.b0;
        articleViewer$WindowView.f = false;
        articleViewer$WindowView.d = false;
        l4Var.P0 = false;
    }
}
