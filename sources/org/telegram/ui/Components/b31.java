package org.telegram.ui.Components;

import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-33b1d79182603e8304c32e909c352797304d7e7816a08740f96af6cffe97caab */
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
