package org.telegram.ui.Components;

import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class v01 extends u4.t0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ g11 b;

    public /* synthetic */ v01(g11 g11Var, int i3) {
        this.a = i3;
        this.b = g11Var;
    }

    @Override // u4.t0
    public final void b(RecyclerView recyclerView, int i3, int i10) {
        switch (this.a) {
            case 0:
                g11 g11Var = this.b;
                if (g11Var.l()) {
                    g11Var.m();
                    break;
                }
                break;
            default:
                g11 g11Var2 = this.b;
                if (g11Var2.l()) {
                    g11Var2.m();
                    break;
                }
                break;
        }
    }
}
