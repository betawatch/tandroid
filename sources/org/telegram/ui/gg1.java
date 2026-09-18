package org.telegram.ui;

import java.util.Iterator;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final /* synthetic */ class gg1 implements org.telegram.ui.ActionBar.b2 {
    public final /* synthetic */ ig1 a;

    public /* synthetic */ gg1(ig1 ig1Var) {
        this.a = ig1Var;
    }

    @Override // org.telegram.ui.ActionBar.b2
    public void f(org.telegram.ui.ActionBar.c2 c2Var, int i10) {
        lg1 lg1Var = this.a.a;
        Iterator it = lg1Var.e.iterator();
        while (it.hasNext()) {
            lg1.U(lg1Var, ((Integer) it.next()).intValue());
        }
        lg1Var.e.clear();
        lg1Var.V();
    }
}
