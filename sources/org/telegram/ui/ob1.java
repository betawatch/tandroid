package org.telegram.ui;

import java.util.Iterator;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ob1 implements org.telegram.ui.ActionBar.u1 {
    public final /* synthetic */ qb1 a;

    public /* synthetic */ ob1(qb1 qb1Var) {
        this.a = qb1Var;
    }

    @Override // org.telegram.ui.ActionBar.u1
    public void h(org.telegram.ui.ActionBar.x1 x1Var, int i10) {
        tb1 tb1Var = this.a.a;
        Iterator it = tb1Var.e.iterator();
        while (it.hasNext()) {
            tb1.Z(tb1Var, ((Integer) it.next()).intValue());
        }
        tb1Var.e.clear();
        tb1Var.a0();
    }
}
