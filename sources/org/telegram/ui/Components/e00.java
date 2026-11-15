package org.telegram.ui.Components;

import java.util.Iterator;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final /* synthetic */ class e00 implements org.telegram.ui.ActionBar.l0, te.i, org.telegram.ui.ActionBar.q1, at0 {
    public final /* synthetic */ FragmentContextView a;

    public /* synthetic */ e00(FragmentContextView fragmentContextView) {
        this.a = fragmentContextView;
    }

    @Override // org.telegram.ui.Components.at0
    public void c(org.telegram.messenger.qd qdVar) {
        float[] fArr = FragmentContextView.X0;
        this.a.k(qdVar);
    }

    @Override // te.i
    public void f(te.j jVar) {
        FragmentContextView fragmentContextView = this.a;
        te.j jVar2 = fragmentContextView.V0;
        float f10 = 1.0f - jVar2.a.d.c.a;
        fragmentContextView.d.setAlpha(f10);
        fragmentContextView.d.setScaleX(org.telegram.messenger.g0.T1(0.7f, 1.0f, f10));
        fragmentContextView.d.setScaleY(org.telegram.messenger.g0.T1(0.7f, 1.0f, f10));
        Iterator it = jVar2.iterator();
        while (it.hasNext()) {
            te.e eVar = (te.e) it.next();
            float c10 = eVar.c();
            Object obj = eVar.a;
            float T1 = org.telegram.messenger.g0.T1(0.7f, 1.0f, c10);
            nh.c cVar = ((p00) obj).b;
            cVar.setAlpha(eVar.c());
            cVar.setScaleX(T1);
            cVar.setScaleY(T1);
        }
    }

    @Override // org.telegram.ui.ActionBar.l0
    public void g(int i7) {
        float[] fArr = FragmentContextView.X0;
        if (i7 >= 0) {
            float[] fArr2 = FragmentContextView.X0;
            if (i7 >= 6) {
                return;
            }
            MediaController B = MediaController.B();
            FragmentContextView fragmentContextView = this.a;
            float C = B.C(fragmentContextView.a0);
            float f10 = fArr2[i7];
            MediaController.B().m0(fragmentContextView.a0, f10);
            if (C != f10) {
                fragmentContextView.l(C, f10, false);
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.q1
    public void h(org.telegram.ui.ActionBar.t1 t1Var, int i7) {
        FragmentContextView fragmentContextView = this.a;
        org.telegram.ui.ActionBar.e2 e2Var = fragmentContextView.h;
        if (!(e2Var instanceof org.telegram.ui.yw)) {
            org.telegram.messenger.rd.f(e2Var.getCurrentAccount()).k(fragmentContextView.n.a());
            return;
        }
        for (int i10 = 0; i10 < 4; i10++) {
            Utilities.d.c(new org.telegram.messenger.id(org.telegram.messenger.rd.f(i10), 6));
        }
    }

    @Override // te.i
    public /* synthetic */ void a() {
    }
}
