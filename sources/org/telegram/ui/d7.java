package org.telegram.ui;

import android.view.View;

/* compiled from: r8-map-id-c7458e893fd6f3e0a6fbf27724068aa00f1caa233b10a33d542967499303009b */
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
        s7 s7Var = this.b.d;
        org.telegram.ui.Components.yl0 yl0Var = this.a;
        f7 f7Var = (f7) yl0Var.getAdapter();
        m7 m7Var = (m7) f7Var.e.get(i10);
        if (view instanceof org.telegram.ui.Cells.t7) {
            s7.a(s7Var, m7Var, (o7) f7Var, yl0Var);
            return;
        }
        i7 i7Var = s7Var.v;
        if (i7Var != null) {
            i7Var.H0(m7Var.c, m7Var.d, false);
        }
    }
}
