package org.telegram.ui.Components;

import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes3.dex */
public final class v01 extends v4.s0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ g11 b;

    public /* synthetic */ v01(g11 g11Var, int i7) {
        this.a = i7;
        this.b = g11Var;
    }

    @Override // v4.s0
    public final void b(RecyclerView recyclerView, int i7, int i10) {
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
