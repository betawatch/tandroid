package org.telegram.ui.Components;

import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final class n21 extends s4.s0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ y21 b;

    public /* synthetic */ n21(y21 y21Var, int i10) {
        this.a = i10;
        this.b = y21Var;
    }

    @Override // s4.s0
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        switch (this.a) {
            case 0:
                y21 y21Var = this.b;
                if (y21Var.k()) {
                    y21Var.l();
                    break;
                }
                break;
            default:
                y21 y21Var2 = this.b;
                if (y21Var2.k()) {
                    y21Var2.l();
                    break;
                }
                break;
        }
    }
}
