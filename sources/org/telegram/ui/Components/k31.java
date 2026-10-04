package org.telegram.ui.Components;

import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-90c74b6d1af88fe423a82a48cb36c0781986d7c98a26085f38aeb2edc71128ad */
/* loaded from: classes3.dex */
public final class k31 extends s4.s0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ v31 b;

    public /* synthetic */ k31(v31 v31Var, int i10) {
        this.a = i10;
        this.b = v31Var;
    }

    @Override // s4.s0
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        switch (this.a) {
            case 0:
                v31 v31Var = this.b;
                if (v31Var.k()) {
                    v31Var.l();
                    break;
                }
                break;
            default:
                v31 v31Var2 = this.b;
                if (v31Var2.k()) {
                    v31Var2.l();
                    break;
                }
                break;
        }
    }
}
