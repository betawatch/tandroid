package org.telegram.ui;

import java.util.Iterator;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes3.dex */
public final /* synthetic */ class fg1 implements org.telegram.ui.ActionBar.a2 {
    public final /* synthetic */ hg1 a;

    public /* synthetic */ fg1(hg1 hg1Var) {
        this.a = hg1Var;
    }

    @Override // org.telegram.ui.ActionBar.a2
    public void g(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        kg1 kg1Var = this.a.a;
        Iterator it = kg1Var.e.iterator();
        while (it.hasNext()) {
            kg1.U(kg1Var, ((Integer) it.next()).intValue());
        }
        kg1Var.e.clear();
        kg1Var.V();
    }
}
