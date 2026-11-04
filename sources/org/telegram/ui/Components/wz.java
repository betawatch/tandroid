package org.telegram.ui.Components;

import java.util.Iterator;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class wz implements org.telegram.ui.ActionBar.l0, qe.i, org.telegram.ui.ActionBar.p1, ys0 {
    public final /* synthetic */ FragmentContextView a;

    public /* synthetic */ wz(FragmentContextView fragmentContextView) {
        this.a = fragmentContextView;
    }

    @Override // qe.i
    public void b(qe.j jVar) {
        FragmentContextView fragmentContextView = this.a;
        qe.j jVar2 = fragmentContextView.V0;
        float f10 = 1.0f - jVar2.a.d.c.a;
        fragmentContextView.d.setAlpha(f10);
        fragmentContextView.d.setScaleX(org.telegram.messenger.g0.T1(0.7f, 1.0f, f10));
        fragmentContextView.d.setScaleY(org.telegram.messenger.g0.T1(0.7f, 1.0f, f10));
        Iterator it = jVar2.iterator();
        while (it.hasNext()) {
            qe.e eVar = (qe.e) it.next();
            float c2 = eVar.c();
            Object obj = eVar.a;
            float T1 = org.telegram.messenger.g0.T1(0.7f, 1.0f, c2);
            oh.c cVar = ((h00) obj).b;
            cVar.setAlpha(eVar.c());
            cVar.setScaleX(T1);
            cVar.setScaleY(T1);
        }
    }

    @Override // org.telegram.ui.Components.ys0
    public void c(org.telegram.messenger.kd kdVar) {
        float[] fArr = FragmentContextView.X0;
        this.a.k(kdVar);
    }

    @Override // org.telegram.ui.ActionBar.p1
    public void g(org.telegram.ui.ActionBar.s1 s1Var, int i3) {
        FragmentContextView fragmentContextView = this.a;
        org.telegram.ui.ActionBar.d2 d2Var = fragmentContextView.h;
        if (!(d2Var instanceof org.telegram.ui.uw)) {
            org.telegram.messenger.ld.f(d2Var.getCurrentAccount()).k(fragmentContextView.n.a());
            return;
        }
        for (int i10 = 0; i10 < 4; i10++) {
            Utilities.d.c(new org.telegram.messenger.cd(org.telegram.messenger.ld.f(i10), 6));
        }
    }

    @Override // org.telegram.ui.ActionBar.l0
    public void i(int i3) {
        float[] fArr = FragmentContextView.X0;
        if (i3 >= 0) {
            float[] fArr2 = FragmentContextView.X0;
            if (i3 >= 6) {
                return;
            }
            MediaController B = MediaController.B();
            FragmentContextView fragmentContextView = this.a;
            float C = B.C(fragmentContextView.a0);
            float f10 = fArr2[i3];
            MediaController.B().m0(fragmentContextView.a0, f10);
            if (C != f10) {
                fragmentContextView.l(C, f10, false);
            }
        }
    }

    @Override // qe.i
    public /* synthetic */ void a() {
    }
}
