package org.telegram.ui.Components;

import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class t50 extends f2.b1 {
    public final /* synthetic */ f2.k0 a;
    public final /* synthetic */ f60 b;

    public t50(f60 f60Var, f2.k0 k0Var) {
        this.b = f60Var;
        this.a = k0Var;
    }

    @Override // f2.b1
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        f60 f60Var = this.b;
        f60.O(f60Var);
        if (!f60Var.N || f60Var.M) {
            return;
        }
        if (f60Var.O - this.a.N0() < 10) {
            f60Var.X();
        }
    }
}
