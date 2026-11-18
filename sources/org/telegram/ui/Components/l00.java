package org.telegram.ui.Components;

import java.util.Iterator;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class l00 implements org.telegram.ui.ActionBar.m0, te.i, org.telegram.ui.ActionBar.r1, it0 {
    public final /* synthetic */ FragmentContextView a;

    public /* synthetic */ l00(FragmentContextView fragmentContextView) {
        this.a = fragmentContextView;
    }

    @Override // org.telegram.ui.Components.it0
    public void b(org.telegram.messenger.pd pdVar) {
        float[] fArr = FragmentContextView.X0;
        this.a.k(pdVar);
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
            nh.c cVar = ((w00) obj).b;
            cVar.setAlpha(eVar.c());
            cVar.setScaleX(T1);
            cVar.setScaleY(T1);
        }
    }

    @Override // org.telegram.ui.ActionBar.m0
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

    @Override // org.telegram.ui.ActionBar.r1
    public void h(org.telegram.ui.ActionBar.u1 u1Var, int i7) {
        FragmentContextView fragmentContextView = this.a;
        org.telegram.ui.ActionBar.h2 h2Var = fragmentContextView.h;
        if (!(h2Var instanceof org.telegram.ui.cx)) {
            org.telegram.messenger.qd.f(h2Var.getCurrentAccount()).k(fragmentContextView.n.a());
            return;
        }
        for (int i10 = 0; i10 < 4; i10++) {
            Utilities.d.c(new org.telegram.messenger.hd(org.telegram.messenger.qd.f(i10), 6));
        }
    }

    @Override // te.i
    public /* synthetic */ void a() {
    }
}
