package org.telegram.ui.Components;

import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
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
