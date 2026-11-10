package org.telegram.ui;

import java.util.Iterator;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final /* synthetic */ class aa1 implements org.telegram.ui.ActionBar.r1 {
    public final /* synthetic */ ca1 a;

    public /* synthetic */ aa1(ca1 ca1Var) {
        this.a = ca1Var;
    }

    @Override // org.telegram.ui.ActionBar.r1
    public void g(org.telegram.ui.ActionBar.u1 u1Var, int i7) {
        fa1 fa1Var = this.a.a;
        Iterator it = fa1Var.e.iterator();
        while (it.hasNext()) {
            fa1.Z(fa1Var, ((Integer) it.next()).intValue());
        }
        fa1Var.e.clear();
        fa1Var.a0();
    }
}
