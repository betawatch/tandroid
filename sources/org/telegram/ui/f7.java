package org.telegram.ui;

import android.view.View;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final class f7 implements org.telegram.ui.Components.jl0 {
    public final /* synthetic */ org.telegram.ui.Components.tl0 a;
    public final /* synthetic */ g7 b;

    public f7(g7 g7Var, org.telegram.ui.Components.tl0 tl0Var) {
        this.b = g7Var;
        this.a = tl0Var;
    }

    @Override // org.telegram.ui.Components.jl0
    public final void f(int i10, View view) {
        u7 u7Var = this.b.d;
        org.telegram.ui.Components.tl0 tl0Var = this.a;
        h7 h7Var = (h7) tl0Var.getAdapter();
        o7 o7Var = (o7) h7Var.e.get(i10);
        if (view instanceof org.telegram.ui.Cells.r7) {
            u7.a(u7Var, o7Var, (q7) h7Var, tl0Var);
            return;
        }
        k7 k7Var = u7Var.v;
        if (k7Var != null) {
            k7Var.Y(o7Var.c, o7Var.d, false);
        }
    }
}
