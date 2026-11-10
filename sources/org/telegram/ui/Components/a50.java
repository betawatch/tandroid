package org.telegram.ui.Components;

import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class a50 extends v4.s0 {
    public final /* synthetic */ v4.b0 a;
    public final /* synthetic */ m50 b;

    public a50(m50 m50Var, v4.b0 b0Var) {
        this.b = m50Var;
        this.a = b0Var;
    }

    @Override // v4.s0
    public final void b(RecyclerView recyclerView, int i7, int i10) {
        m50 m50Var = this.b;
        m50.I0(m50Var);
        if (!m50Var.L1 || m50Var.K1) {
            return;
        }
        if (m50Var.M1 - this.a.N0() < 10) {
            m50Var.K0();
        }
    }
}
