package org.telegram.ui;

import java.util.Iterator;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final /* synthetic */ class bf1 implements org.telegram.ui.ActionBar.b2 {
    public final /* synthetic */ df1 a;

    public /* synthetic */ bf1(df1 df1Var) {
        this.a = df1Var;
    }

    @Override // org.telegram.ui.ActionBar.b2
    public void h(org.telegram.ui.ActionBar.e2 e2Var, int i10) {
        gf1 gf1Var = this.a.a;
        Iterator it = gf1Var.e.iterator();
        while (it.hasNext()) {
            gf1.V(gf1Var, ((Integer) it.next()).intValue());
        }
        gf1Var.e.clear();
        gf1Var.W();
    }
}
