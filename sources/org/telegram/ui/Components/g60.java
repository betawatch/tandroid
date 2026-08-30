package org.telegram.ui.Components;

import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final class g60 extends f2.z0 {
    public final /* synthetic */ f2.i0 a;
    public final /* synthetic */ s60 b;

    public g60(s60 s60Var, f2.i0 i0Var) {
        this.b = s60Var;
        this.a = i0Var;
    }

    @Override // f2.z0
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        s60 s60Var = this.b;
        s60.O(s60Var);
        if (!s60Var.O || s60Var.N) {
            return;
        }
        if (s60Var.P - this.a.N0() < 10) {
            s60Var.X();
        }
    }
}
