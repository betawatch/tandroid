package org.telegram.ui;

import java.util.Iterator;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class qb1 implements org.telegram.ui.ActionBar.u1 {
    public final /* synthetic */ sb1 a;

    public /* synthetic */ qb1(sb1 sb1Var) {
        this.a = sb1Var;
    }

    @Override // org.telegram.ui.ActionBar.u1
    public void h(org.telegram.ui.ActionBar.x1 x1Var, int i10) {
        vb1 vb1Var = this.a.a;
        Iterator it = vb1Var.e.iterator();
        while (it.hasNext()) {
            vb1.Y(vb1Var, ((Integer) it.next()).intValue());
        }
        vb1Var.e.clear();
        vb1Var.Z();
    }
}
