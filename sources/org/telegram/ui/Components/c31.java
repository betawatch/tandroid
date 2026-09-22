package org.telegram.ui.Components;

import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
/* loaded from: classes3.dex */
public final class c31 extends s4.s0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ n31 b;

    public /* synthetic */ c31(n31 n31Var, int i10) {
        this.a = i10;
        this.b = n31Var;
    }

    @Override // s4.s0
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        switch (this.a) {
            case 0:
                n31 n31Var = this.b;
                if (n31Var.k()) {
                    n31Var.l();
                    break;
                }
                break;
            default:
                n31 n31Var2 = this.b;
                if (n31Var2.k()) {
                    n31Var2.l();
                    break;
                }
                break;
        }
    }
}
