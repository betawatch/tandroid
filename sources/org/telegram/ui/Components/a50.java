package org.telegram.ui.Components;

import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
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
        if (!m50Var.I1 || m50Var.H1) {
            return;
        }
        if (m50Var.J1 - this.a.N0() < 10) {
            m50Var.K0();
        }
    }
}
