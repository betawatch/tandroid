package org.telegram.ui.Components;

import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class b60 extends f2.a1 {
    public final /* synthetic */ f2.j0 a;
    public final /* synthetic */ n60 b;

    public b60(n60 n60Var, f2.j0 j0Var) {
        this.b = n60Var;
        this.a = j0Var;
    }

    @Override // f2.a1
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        n60 n60Var = this.b;
        n60.O(n60Var);
        if (!n60Var.N || n60Var.M) {
            return;
        }
        if (n60Var.O - this.a.N0() < 10) {
            n60Var.X();
        }
    }
}
