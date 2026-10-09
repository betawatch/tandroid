package org.telegram.ui;

import java.util.Iterator;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final /* synthetic */ class gg1 implements org.telegram.ui.ActionBar.a2 {
    public final /* synthetic */ ig1 a;

    public /* synthetic */ gg1(ig1 ig1Var) {
        this.a = ig1Var;
    }

    @Override // org.telegram.ui.ActionBar.a2
    public void f(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        lg1 lg1Var = this.a.a;
        Iterator it = lg1Var.e.iterator();
        while (it.hasNext()) {
            lg1.U(lg1Var, ((Integer) it.next()).intValue());
        }
        lg1Var.e.clear();
        lg1Var.V();
    }
}
