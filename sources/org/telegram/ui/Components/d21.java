package org.telegram.ui.Components;

import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class d21 extends s4.s0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ o21 b;

    public /* synthetic */ d21(o21 o21Var, int i10) {
        this.a = i10;
        this.b = o21Var;
    }

    @Override // s4.s0
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        switch (this.a) {
            case 0:
                o21 o21Var = this.b;
                if (o21Var.l()) {
                    o21Var.m();
                    break;
                }
                break;
            default:
                o21 o21Var2 = this.b;
                if (o21Var2.l()) {
                    o21Var2.m();
                    break;
                }
                break;
        }
    }
}
