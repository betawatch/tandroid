package org.telegram.ui.Components;

import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes3.dex */
public final class a70 extends s4.r0 {
    public final /* synthetic */ s4.b0 a;
    public final /* synthetic */ m70 b;

    public a70(m70 m70Var, s4.b0 b0Var) {
        this.b = m70Var;
        this.a = b0Var;
    }

    @Override // s4.r0
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        m70 m70Var = this.b;
        m70.O(m70Var);
        if (!m70Var.R || m70Var.Q) {
            return;
        }
        if (m70Var.S - this.a.N0() < 10) {
            m70Var.Y();
        }
    }
}
