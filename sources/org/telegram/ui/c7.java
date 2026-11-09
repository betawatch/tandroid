package org.telegram.ui;

import android.view.View;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final class c7 implements org.telegram.ui.Components.cj0 {
    public final /* synthetic */ org.telegram.ui.Components.qj0 a;
    public final /* synthetic */ d7 b;

    public c7(d7 d7Var, org.telegram.ui.Components.qj0 qj0Var) {
        this.b = d7Var;
        this.a = qj0Var;
    }

    @Override // org.telegram.ui.Components.cj0
    public final void c(int i7, View view) {
        t7 t7Var = this.b.f;
        org.telegram.ui.Components.qj0 qj0Var = this.a;
        f7 f7Var = (f7) qj0Var.getAdapter();
        m7 m7Var = (m7) f7Var.e.get(i7);
        if (view instanceof org.telegram.ui.Cells.o7) {
            t7.a(t7Var, m7Var, (o7) f7Var, qj0Var);
            return;
        }
        i7 i7Var = t7Var.F;
        if (i7Var != null) {
            i7Var.o(m7Var.c, m7Var.d, false);
        }
    }
}
