package org.telegram.ui;

import java.util.Iterator;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes3.dex */
public final /* synthetic */ class mg1 implements org.telegram.ui.ActionBar.z1 {
    public final /* synthetic */ og1 a;

    public /* synthetic */ mg1(og1 og1Var) {
        this.a = og1Var;
    }

    @Override // org.telegram.ui.ActionBar.z1
    public void g(org.telegram.ui.ActionBar.a2 a2Var, int i10) {
        rg1 rg1Var = this.a.a;
        Iterator it = rg1Var.e.iterator();
        while (it.hasNext()) {
            rg1.U(rg1Var, ((Integer) it.next()).intValue());
        }
        rg1Var.e.clear();
        rg1Var.V();
    }
}
