package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class b1 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ n4 b;

    public b1(n4 n4Var, int i10) {
        this.b = n4Var;
        this.a = i10;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        n4 n4Var = this.b;
        ArrayList arrayList = n4Var.a0;
        if (n4Var.c0.f) {
            ArrayList arrayList2 = new ArrayList();
            n4Var.r0[0].setBackgroundDrawable(null);
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
            for (int size = arrayList.size() - 1; size > this.a; size--) {
                arrayList2.add(arrayList.remove(size));
            }
            n4Var.L0.T(n4Var.r0[0].b);
            org.telegram.ui.Cells.l9 l9Var = n4Var.L0;
            l9Var.E0 = n4Var.r0[0].d;
            l9Var.f(true);
            n4Var.i0(false);
            n4Var.f0();
            n4Var.r0[1].b();
            n4Var.r0[1].setVisibility(8);
            int size2 = arrayList2.size();
            int i10 = 0;
            while (i10 < size2) {
                Object obj = arrayList2.get(i10);
                i10++;
                if (obj instanceof d3) {
                    ((d3) obj).a();
                }
                if (obj instanceof TLRPC.WebPage) {
                    org.telegram.ui.web.h2.o((TLRPC.WebPage) obj);
                }
            }
        } else {
            n4Var.U();
            n4Var.M();
        }
        ArticleViewer$WindowView articleViewer$WindowView = n4Var.c0;
        articleViewer$WindowView.f = false;
        articleViewer$WindowView.d = false;
        n4Var.Q0 = false;
    }
}
