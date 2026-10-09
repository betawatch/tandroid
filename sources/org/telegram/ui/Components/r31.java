package org.telegram.ui.Components;

import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final class r31 extends s4.t0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ c41 b;

    public /* synthetic */ r31(c41 c41Var, int i10) {
        this.a = i10;
        this.b = c41Var;
    }

    @Override // s4.t0
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        switch (this.a) {
            case 0:
                c41 c41Var = this.b;
                if (c41Var.k()) {
                    c41Var.l();
                    break;
                }
                break;
            default:
                c41 c41Var2 = this.b;
                if (c41Var2.k()) {
                    c41Var2.l();
                    break;
                }
                break;
        }
    }
}
