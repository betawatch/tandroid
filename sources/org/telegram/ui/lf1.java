package org.telegram.ui;

import java.util.Iterator;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final /* synthetic */ class lf1 implements org.telegram.ui.ActionBar.c2 {
    public final /* synthetic */ nf1 a;

    public /* synthetic */ lf1(nf1 nf1Var) {
        this.a = nf1Var;
    }

    @Override // org.telegram.ui.ActionBar.c2
    public void i(org.telegram.ui.ActionBar.d2 d2Var, int i10) {
        qf1 qf1Var = this.a.a;
        Iterator it = qf1Var.e.iterator();
        while (it.hasNext()) {
            qf1.U(qf1Var, ((Integer) it.next()).intValue());
        }
        qf1Var.e.clear();
        qf1Var.V();
    }
}
