package org.telegram.ui;

import java.util.Iterator;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final /* synthetic */ class nf1 implements org.telegram.ui.ActionBar.c2 {
    public final /* synthetic */ pf1 a;

    public /* synthetic */ nf1(pf1 pf1Var) {
        this.a = pf1Var;
    }

    @Override // org.telegram.ui.ActionBar.c2
    public void j(org.telegram.ui.ActionBar.d2 d2Var, int i10) {
        sf1 sf1Var = this.a.a;
        Iterator it = sf1Var.e.iterator();
        while (it.hasNext()) {
            sf1.U(sf1Var, ((Integer) it.next()).intValue());
        }
        sf1Var.e.clear();
        sf1Var.V();
    }
}
