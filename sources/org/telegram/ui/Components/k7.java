package org.telegram.ui.Components;

import android.view.ViewGroup;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
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
        ViewGroup viewGroup;
        switch (this.a) {
            case 0:
                ((j8) this.b).T.setBufferedProgress(f7 / 1000.0f);
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
                wi wiVar = (wi) ((hi) this.b).d;
                oi oiVar = wiVar.z0;
                if (oiVar == wiVar.m0 || oiVar == wiVar.n0 || (wiVar.F && wiVar.t1 != null)) {
                    wiVar.a2(1);
                }
                wiVar.z0.k(wiVar.l2);
                viewGroup = ((org.telegram.ui.ActionBar.f3) wiVar).containerView;
                viewGroup.invalidate();
                break;
            default:
                ((bc0) this.b).z();
                break;
        }
    }
}
