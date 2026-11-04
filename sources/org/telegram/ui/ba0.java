package org.telegram.ui;

import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class ba0 extends u4.t0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ la0 b;

    public /* synthetic */ ba0(la0 la0Var, int i3) {
        this.a = i3;
        this.b = la0Var;
    }

    @Override // u4.t0
    public final void a(RecyclerView recyclerView, int i3) {
        switch (this.a) {
            case 0:
                if (i3 == 1) {
                    la0 la0Var = this.b;
                    if (la0Var.u0 && la0Var.v0) {
                        org.telegram.messenger.g0.v1(la0Var.getParentActivity().getCurrentFocus());
                        break;
                    }
                }
                break;
            default:
                boolean z10 = i3 != 0;
                la0 la0Var2 = this.b;
                la0Var2.N = z10;
                if (!z10 && la0Var2.I != null) {
                    la0Var2.I = null;
                    break;
                }
                break;
        }
    }

    @Override // u4.t0
    public void b(RecyclerView recyclerView, int i3, int i10) {
        switch (this.a) {
            case 1:
                la0 la0Var = this.b;
                la0Var.K0(false);
                if (la0Var.I != null) {
                    la0Var.K += i10;
                    break;
                }
                break;
        }
    }
}
