package org.telegram.ui;

import java.util.Iterator;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
/* loaded from: classes3.dex */
public final /* synthetic */ class gg1 implements org.telegram.ui.ActionBar.a2 {
    public final /* synthetic */ ig1 a;

    public /* synthetic */ gg1(ig1 ig1Var) {
        this.a = ig1Var;
    }

    @Override // org.telegram.ui.ActionBar.a2
    public void k(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        lg1 lg1Var = this.a.a;
        Iterator it = lg1Var.e.iterator();
        while (it.hasNext()) {
            lg1.U(lg1Var, ((Integer) it.next()).intValue());
        }
        lg1Var.e.clear();
        lg1Var.V();
    }
}
