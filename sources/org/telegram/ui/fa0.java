package org.telegram.ui;

import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final class fa0 extends v4.t0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ pa0 b;

    public /* synthetic */ fa0(pa0 pa0Var, int i7) {
        this.a = i7;
        this.b = pa0Var;
    }

    @Override // v4.t0
    public final void a(RecyclerView recyclerView, int i7) {
        switch (this.a) {
            case 0:
                if (i7 == 1) {
                    pa0 pa0Var = this.b;
                    if (pa0Var.u0 && pa0Var.v0) {
                        org.telegram.messenger.g0.v1(pa0Var.getParentActivity().getCurrentFocus());
                        break;
                    }
                }
                break;
            default:
                boolean z10 = i7 != 0;
                pa0 pa0Var2 = this.b;
                pa0Var2.N = z10;
                if (!z10 && pa0Var2.I != null) {
                    pa0Var2.I = null;
                    break;
                }
                break;
        }
    }

    @Override // v4.t0
    public void b(RecyclerView recyclerView, int i7, int i10) {
        switch (this.a) {
            case 1:
                pa0 pa0Var = this.b;
                pa0Var.K0(false);
                if (pa0Var.I != null) {
                    pa0Var.K += i10;
                    break;
                }
                break;
        }
    }
}
