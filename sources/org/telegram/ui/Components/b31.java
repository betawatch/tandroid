package org.telegram.ui.Components;

import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-c0e607070f32dbde65005355ff6c489b77f9395a3e0f8720848e2402860dea84 */
/* loaded from: classes3.dex */
public final class b31 extends s4.s0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ m31 b;

    public /* synthetic */ b31(m31 m31Var, int i10) {
        this.a = i10;
        this.b = m31Var;
    }

    @Override // s4.s0
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        switch (this.a) {
            case 0:
                m31 m31Var = this.b;
                if (m31Var.k()) {
                    m31Var.l();
                    break;
                }
                break;
            default:
                m31 m31Var2 = this.b;
                if (m31Var2.k()) {
                    m31Var2.l();
                    break;
                }
                break;
        }
    }
}
