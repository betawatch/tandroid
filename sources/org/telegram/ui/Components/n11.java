package org.telegram.ui.Components;

import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final class n11 extends v4.u0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ z11 b;

    public /* synthetic */ n11(z11 z11Var, int i7) {
        this.a = i7;
        this.b = z11Var;
    }

    @Override // v4.u0
    public final void b(RecyclerView recyclerView, int i7, int i10) {
        switch (this.a) {
            case 0:
                z11 z11Var = this.b;
                if (z11Var.l()) {
                    z11Var.m();
                    break;
                }
                break;
            default:
                z11 z11Var2 = this.b;
                if (z11Var2.l()) {
                    z11Var2.m();
                    break;
                }
                break;
        }
    }
}
