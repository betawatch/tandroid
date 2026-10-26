package org.telegram.ui.Components;

import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final class b70 extends s4.u0 {
    public final /* synthetic */ s4.c0 a;
    public final /* synthetic */ n70 b;

    public b70(n70 n70Var, s4.c0 c0Var) {
        this.b = n70Var;
        this.a = c0Var;
    }

    @Override // s4.u0
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        n70 n70Var = this.b;
        n70.O(n70Var);
        if (!n70Var.R || n70Var.Q) {
            return;
        }
        if (n70Var.S - this.a.N0() < 10) {
            n70Var.Y();
        }
    }
}
