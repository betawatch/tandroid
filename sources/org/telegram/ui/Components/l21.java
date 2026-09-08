package org.telegram.ui.Components;

import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes3.dex */
public final class l21 extends s4.s0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ w21 b;

    public /* synthetic */ l21(w21 w21Var, int i10) {
        this.a = i10;
        this.b = w21Var;
    }

    @Override // s4.s0
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        switch (this.a) {
            case 0:
                w21 w21Var = this.b;
                if (w21Var.k()) {
                    w21Var.l();
                    break;
                }
                break;
            default:
                w21 w21Var2 = this.b;
                if (w21Var2.k()) {
                    w21Var2.l();
                    break;
                }
                break;
        }
    }
}
