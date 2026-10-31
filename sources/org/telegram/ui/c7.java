package org.telegram.ui;

import android.view.View;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class c7 implements org.telegram.ui.Components.gk0 {
    public final /* synthetic */ org.telegram.ui.Components.tk0 a;
    public final /* synthetic */ d7 b;

    public c7(d7 d7Var, org.telegram.ui.Components.tk0 tk0Var) {
        this.b = d7Var;
        this.a = tk0Var;
    }

    @Override // org.telegram.ui.Components.gk0
    public final void f(int i10, View view) {
        t7 t7Var = this.b.f;
        org.telegram.ui.Components.tk0 tk0Var = this.a;
        f7 f7Var = (f7) tk0Var.getAdapter();
        m7 m7Var = (m7) f7Var.e.get(i10);
        if (view instanceof org.telegram.ui.Cells.s7) {
            t7.a(t7Var, m7Var, (o7) f7Var, tk0Var);
            return;
        }
        i7 i7Var = t7Var.F;
        if (i7Var != null) {
            i7Var.a(m7Var.c, m7Var.d, false);
        }
    }
}
