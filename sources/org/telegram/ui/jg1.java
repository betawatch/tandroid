package org.telegram.ui;

import java.util.Iterator;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final /* synthetic */ class jg1 implements org.telegram.ui.ActionBar.c2 {
    public final /* synthetic */ lg1 a;

    public /* synthetic */ jg1(lg1 lg1Var) {
        this.a = lg1Var;
    }

    @Override // org.telegram.ui.ActionBar.c2
    public void f(org.telegram.ui.ActionBar.d2 d2Var, int i10) {
        og1 og1Var = this.a.a;
        Iterator it = og1Var.e.iterator();
        while (it.hasNext()) {
            og1.U(og1Var, ((Integer) it.next()).intValue());
        }
        og1Var.e.clear();
        og1Var.V();
    }
}
