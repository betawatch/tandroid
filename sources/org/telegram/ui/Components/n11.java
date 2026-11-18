package org.telegram.ui.Components;

import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
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
