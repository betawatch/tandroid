package org.telegram.ui.Components;

import android.view.ViewGroup;

/* compiled from: r8-map-id-425f9d3693dca7cdb7b1343a62ca29dd4bfbf482fa37d742abbdfab31448a8bd */
/* loaded from: classes3.dex */
public final /* synthetic */ class l7 implements o1.g {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ l7(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // o1.g
    public final void a(o1.h hVar, float f7, float f10) {
        ViewGroup viewGroup;
        switch (this.a) {
            case 0:
                ((k8) this.b).T.setBufferedProgress(f7 / 1000.0f);
                break;
            case 1:
                qc qcVar = (qc) this.b;
                qcVar.o = (int) f7;
                qcVar.l();
                break;
            case 2:
                if (Math.abs(f7) > ((ub) this.b).getWidth()) {
                    hVar.c();
                    break;
                }
                break;
            case 3:
                ti tiVar = (ti) ((ai.c5) this.b).d;
                li liVar = tiVar.C0;
                if (liVar == tiVar.m0 || liVar == tiVar.n0 || (tiVar.F && tiVar.w1 != null)) {
                    tiVar.e2(1);
                }
                tiVar.C0.l(tiVar.o2);
                viewGroup = ((org.telegram.ui.ActionBar.f3) tiVar).containerView;
                viewGroup.invalidate();
                break;
            case 4:
                al alVar = (al) this.b;
                alVar.j0 = f7;
                alVar.k0();
                break;
            default:
                ((wc0) this.b).y();
                break;
        }
    }
}
