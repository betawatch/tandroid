package org.telegram.ui;

import java.util.Iterator;

/* compiled from: r8-map-id-c0e607070f32dbde65005355ff6c489b77f9395a3e0f8720848e2402860dea84 */
/* loaded from: classes3.dex */
public final /* synthetic */ class eg1 implements org.telegram.ui.ActionBar.a2 {
    public final /* synthetic */ gg1 a;

    public /* synthetic */ eg1(gg1 gg1Var) {
        this.a = gg1Var;
    }

    @Override // org.telegram.ui.ActionBar.a2
    public void f(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        jg1 jg1Var = this.a.a;
        Iterator it = jg1Var.e.iterator();
        while (it.hasNext()) {
            jg1.U(jg1Var, ((Integer) it.next()).intValue());
        }
        jg1Var.e.clear();
        jg1Var.V();
    }
}
