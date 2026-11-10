package org.telegram.ui;

import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class ia0 extends v4.s0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ sa0 b;

    public /* synthetic */ ia0(sa0 sa0Var, int i7) {
        this.a = i7;
        this.b = sa0Var;
    }

    @Override // v4.s0
    public final void a(RecyclerView recyclerView, int i7) {
        switch (this.a) {
            case 0:
                if (i7 == 1) {
                    sa0 sa0Var = this.b;
                    if (sa0Var.t0 && sa0Var.u0) {
                        org.telegram.messenger.g0.v1(sa0Var.getParentActivity().getCurrentFocus());
                        break;
                    }
                }
                break;
            default:
                boolean z9 = i7 != 0;
                sa0 sa0Var2 = this.b;
                sa0Var2.M = z9;
                if (!z9 && sa0Var2.H != null) {
                    sa0Var2.H = null;
                    break;
                }
                break;
        }
    }

    @Override // v4.s0
    public void b(RecyclerView recyclerView, int i7, int i10) {
        switch (this.a) {
            case 1:
                sa0 sa0Var = this.b;
                sa0Var.K0(false);
                if (sa0Var.H != null) {
                    sa0Var.J += i10;
                    break;
                }
                break;
        }
    }
}
