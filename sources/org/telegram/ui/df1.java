package org.telegram.ui;

import java.util.Iterator;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final /* synthetic */ class df1 implements org.telegram.ui.ActionBar.b2 {
    public final /* synthetic */ ff1 a;

    public /* synthetic */ df1(ff1 ff1Var) {
        this.a = ff1Var;
    }

    @Override // org.telegram.ui.ActionBar.b2
    public void h(org.telegram.ui.ActionBar.e2 e2Var, int i10) {
        if1 if1Var = this.a.a;
        Iterator it = if1Var.e.iterator();
        while (it.hasNext()) {
            if1.V(if1Var, ((Integer) it.next()).intValue());
        }
        if1Var.e.clear();
        if1Var.W();
    }
}
