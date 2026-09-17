package org.telegram.ui;

import java.util.Iterator;

/* compiled from: r8-map-id-e83daa4a3f4c5cc77b567d3f921056f729108399460aa18047e0e51e076a97b3 */
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
