package org.telegram.ui.Components;

import android.view.ViewGroup;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final /* synthetic */ class n7 implements o1.g {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ n7(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // o1.g
    public final void a(o1.h hVar, float f7, float f10) {
        oi.q qVar;
        ViewGroup viewGroup;
        switch (this.a) {
            case 0:
                ((m8) this.b).S.setBufferedProgress(f7 / 1000.0f);
                break;
            case 1:
                qc qcVar = (qc) this.b;
                qcVar.p = (int) f7;
                qcVar.l();
                break;
            case 2:
                if (Math.abs(f7) > ((ub) this.b).getWidth()) {
                    hVar.c();
                    break;
                }
                break;
            case 3:
                ti tiVar = (ti) ((bi.x4) this.b).d;
                li liVar = tiVar.C0;
                if (liVar == tiVar.m0 || liVar == tiVar.n0 || (tiVar.F && tiVar.w1 != null)) {
                    tiVar.i2(1);
                }
                tiVar.C0.l(tiVar.o2);
                qVar = ((org.telegram.ui.ActionBar.k3) tiVar).glassEngine;
                qVar.g();
                viewGroup = ((org.telegram.ui.ActionBar.k3) tiVar).containerView;
                viewGroup.invalidate();
                break;
            case 4:
                al alVar = (al) this.b;
                alVar.m0 = f7;
                alVar.k0();
                break;
            default:
                ((vc0) this.b).y();
                break;
        }
    }
}
