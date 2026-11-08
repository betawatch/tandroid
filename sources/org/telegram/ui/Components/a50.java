package org.telegram.ui.Components;

import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
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
