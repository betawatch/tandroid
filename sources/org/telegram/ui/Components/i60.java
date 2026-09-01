package org.telegram.ui.Components;

import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final class i60 extends f2.a1 {
    public final /* synthetic */ f2.j0 a;
    public final /* synthetic */ u60 b;

    public i60(u60 u60Var, f2.j0 j0Var) {
        this.b = u60Var;
        this.a = j0Var;
    }

    @Override // f2.a1
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        u60 u60Var = this.b;
        u60.O(u60Var);
        if (!u60Var.O || u60Var.N) {
            return;
        }
        if (u60Var.P - this.a.N0() < 10) {
            u60Var.X();
        }
    }
}
