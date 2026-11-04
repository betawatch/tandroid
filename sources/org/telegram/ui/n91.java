package org.telegram.ui;

import java.util.Iterator;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class n91 implements org.telegram.ui.ActionBar.p1 {
    public final /* synthetic */ p91 a;

    public /* synthetic */ n91(p91 p91Var) {
        this.a = p91Var;
    }

    @Override // org.telegram.ui.ActionBar.p1
    public void g(org.telegram.ui.ActionBar.s1 s1Var, int i3) {
        s91 s91Var = this.a.a;
        Iterator it = s91Var.e.iterator();
        while (it.hasNext()) {
            s91.Z(s91Var, ((Integer) it.next()).intValue());
        }
        s91Var.e.clear();
        s91Var.a0();
    }
}
