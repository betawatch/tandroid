package org.telegram.ui;

import android.view.View;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes3.dex */
public final class h7 implements org.telegram.ui.Components.am0 {
    public final /* synthetic */ org.telegram.ui.Components.mm0 a;
    public final /* synthetic */ i7 b;

    public h7(i7 i7Var, org.telegram.ui.Components.mm0 mm0Var) {
        this.b = i7Var;
        this.a = mm0Var;
    }

    @Override // org.telegram.ui.Components.am0
    public final void a(int i10, View view) {
        w7 w7Var = this.b.d;
        org.telegram.ui.Components.mm0 mm0Var = this.a;
        j7 j7Var = (j7) mm0Var.getAdapter();
        q7 q7Var = (q7) j7Var.e.get(i10);
        if (view instanceof org.telegram.ui.Cells.t7) {
            w7.a(w7Var, q7Var, (s7) j7Var, mm0Var);
            return;
        }
        m7 m7Var = w7Var.v;
        if (m7Var != null) {
            m7Var.j1(q7Var.c, q7Var.d, false);
        }
    }
}
