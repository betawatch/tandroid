package org.telegram.ui;

import java.util.Iterator;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes3.dex */
public final /* synthetic */ class lg1 implements org.telegram.ui.ActionBar.z1 {
    public final /* synthetic */ ng1 a;

    public /* synthetic */ lg1(ng1 ng1Var) {
        this.a = ng1Var;
    }

    @Override // org.telegram.ui.ActionBar.z1
    public void g(org.telegram.ui.ActionBar.a2 a2Var, int i10) {
        qg1 qg1Var = this.a.a;
        Iterator it = qg1Var.e.iterator();
        while (it.hasNext()) {
            qg1.U(qg1Var, ((Integer) it.next()).intValue());
        }
        qg1Var.e.clear();
        qg1Var.V();
    }
}
