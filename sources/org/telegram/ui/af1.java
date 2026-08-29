package org.telegram.ui;

import java.util.Iterator;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final /* synthetic */ class af1 implements org.telegram.ui.ActionBar.b2 {
    public final /* synthetic */ cf1 a;

    public /* synthetic */ af1(cf1 cf1Var) {
        this.a = cf1Var;
    }

    @Override // org.telegram.ui.ActionBar.b2
    public void g(org.telegram.ui.ActionBar.c2 c2Var, int i10) {
        ff1 ff1Var = this.a.a;
        Iterator it = ff1Var.e.iterator();
        while (it.hasNext()) {
            ff1.U(ff1Var, ((Integer) it.next()).intValue());
        }
        ff1Var.e.clear();
        ff1Var.V();
    }
}
