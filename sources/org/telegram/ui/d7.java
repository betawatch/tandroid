package org.telegram.ui;

import android.view.View;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
/* loaded from: classes3.dex */
public final class d7 implements org.telegram.ui.Components.ml0 {
    public final /* synthetic */ org.telegram.ui.Components.yl0 a;
    public final /* synthetic */ e7 b;

    public d7(e7 e7Var, org.telegram.ui.Components.yl0 yl0Var) {
        this.b = e7Var;
        this.a = yl0Var;
    }

    @Override // org.telegram.ui.Components.ml0
    public final void d(int i10, View view) {
        t7 t7Var = this.b.e;
        org.telegram.ui.Components.yl0 yl0Var = this.a;
        g7 g7Var = (g7) yl0Var.getAdapter();
        n7 n7Var = (n7) g7Var.e.get(i10);
        if (view instanceof org.telegram.ui.Cells.u7) {
            t7.a(t7Var, n7Var, (p7) g7Var, yl0Var);
            return;
        }
        j7 j7Var = t7Var.E;
        if (j7Var != null) {
            j7Var.H0(n7Var.c, n7Var.d, false);
        }
    }
}
