package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final class g extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ o b;

    public g(o oVar, int i) {
        this.b = oVar;
        this.a = i;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        o oVar = this.b;
        ArticleViewer$WindowView articleViewer$WindowView = oVar.g0;
        ArrayList arrayList = oVar.e0;
        if (articleViewer$WindowView.f) {
            ArrayList arrayList2 = new ArrayList();
            oVar.v0[0].setBackgroundDrawable(null);
            m[] mVarArr = oVar.v0;
            m mVar = mVarArr[1];
            mVarArr[1] = mVarArr[0];
            mVarArr[0] = mVar;
            oVar.i0.i();
            oVar.b1.a(oVar.v0[0].getBackgroundColor(), true);
            oVar.c1.a(oVar.v0[1].getBackgroundColor(), true);
            tw twVar = oVar.L;
            if (twVar != null) {
                twVar.y();
            }
            for (int size = arrayList.size() - 1; size > this.a; size--) {
                arrayList2.add(arrayList.remove(size));
            }
            oVar.Q0.Q(oVar.v0[0].b);
            amb ambVar = oVar.Q0;
            ambVar.z0 = oVar.v0[0].d;
            ambVar.e(true);
            oVar.g0(false);
            oVar.d0();
            oVar.v0[1].a();
            oVar.v0[1].setVisibility(8);
            int size2 = arrayList2.size();
            int i = 0;
            while (i < size2) {
                Object obj = arrayList2.get(i);
                i++;
                if (obj instanceof aw) {
                    ((aw) obj).a();
                }
                if (obj instanceof TLRPC.WebPage) {
                    rxc.o((TLRPC.WebPage) obj);
                }
            }
        } else {
            oVar.S();
            oVar.K();
        }
        ArticleViewer$WindowView articleViewer$WindowView2 = oVar.g0;
        articleViewer$WindowView2.f = false;
        articleViewer$WindowView2.d = false;
        oVar.V0 = false;
    }
}
