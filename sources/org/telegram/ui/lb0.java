package org.telegram.ui;

import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class lb0 extends s4.s0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ yb0 b;

    public /* synthetic */ lb0(yb0 yb0Var, int i10) {
        this.a = i10;
        this.b = yb0Var;
    }

    @Override // s4.s0
    public final void a(RecyclerView recyclerView, int i10) {
        switch (this.a) {
            case 0:
                if (i10 == 1) {
                    yb0 yb0Var = this.b;
                    if (yb0Var.z0 && yb0Var.A0) {
                        org.telegram.messenger.i0.v1(yb0Var.getParentActivity().getCurrentFocus());
                        break;
                    }
                }
                break;
            default:
                boolean z10 = i10 != 0;
                yb0 yb0Var2 = this.b;
                yb0Var2.O = z10;
                if (!z10 && yb0Var2.J != null) {
                    yb0Var2.J = null;
                    break;
                }
                break;
        }
    }

    @Override // s4.s0
    public void b(RecyclerView recyclerView, int i10, int i11) {
        switch (this.a) {
            case 1:
                yb0 yb0Var = this.b;
                yb0Var.O0(false);
                if (yb0Var.J != null) {
                    yb0Var.L += i11;
                    break;
                }
                break;
        }
    }
}
