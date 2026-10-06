package org.telegram.ui.Components;

import android.view.ViewGroup;

/* compiled from: r8-map-id-995671d6bce0aaeb91824b65f2f1988c5410eae59f1d5d7c368a0027313cc0ad */
/* loaded from: classes3.dex */
public final /* synthetic */ class k7 implements o1.g {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ k7(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // o1.g
    public final void a(o1.h hVar, float f7, float f10) {
        li.p pVar;
        ViewGroup viewGroup;
        switch (this.a) {
            case 0:
                ((j8) this.b).T.setBufferedProgress(f7 / 1000.0f);
                break;
            case 1:
                rc rcVar = (rc) this.b;
                rcVar.o = (int) f7;
                rcVar.l();
                break;
            case 2:
                if (Math.abs(f7) > ((vb) this.b).getWidth()) {
                    hVar.c();
                    break;
                }
                break;
            case 3:
                xi xiVar = (xi) ((fi) this.b).d;
                pi piVar = xiVar.z0;
                if (piVar == xiVar.m0 || piVar == xiVar.n0 || (xiVar.F && xiVar.t1 != null)) {
                    xiVar.Z1(1);
                }
                xiVar.z0.k(xiVar.l2);
                pVar = ((org.telegram.ui.ActionBar.f3) xiVar).glassEngine;
                pVar.g();
                viewGroup = ((org.telegram.ui.ActionBar.f3) xiVar).containerView;
                viewGroup.invalidate();
                break;
            default:
                ((pc0) this.b).z();
                break;
        }
    }
}
