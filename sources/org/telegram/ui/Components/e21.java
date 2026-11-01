package org.telegram.ui.Components;

import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final class e21 extends s4.s0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ p21 b;

    public /* synthetic */ e21(p21 p21Var, int i10) {
        this.a = i10;
        this.b = p21Var;
    }

    @Override // s4.s0
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        switch (this.a) {
            case 0:
                p21 p21Var = this.b;
                if (p21Var.l()) {
                    p21Var.m();
                    break;
                }
                break;
            default:
                p21 p21Var2 = this.b;
                if (p21Var2.l()) {
                    p21Var2.m();
                    break;
                }
                break;
        }
    }
}
