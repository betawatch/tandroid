package org.telegram.ui.Components;

import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-8159789691d0b3bb0641ef1f4646484974d69719884d0b33e845acec3d7c3062 */
/* loaded from: classes3.dex */
public final class z21 extends s4.s0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ k31 b;

    public /* synthetic */ z21(k31 k31Var, int i10) {
        this.a = i10;
        this.b = k31Var;
    }

    @Override // s4.s0
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        switch (this.a) {
            case 0:
                k31 k31Var = this.b;
                if (k31Var.k()) {
                    k31Var.l();
                    break;
                }
                break;
            default:
                k31 k31Var2 = this.b;
                if (k31Var2.k()) {
                    k31Var2.l();
                    break;
                }
                break;
        }
    }
}
