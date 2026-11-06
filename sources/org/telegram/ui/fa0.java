package org.telegram.ui;

import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes3.dex */
public final class fa0 extends v4.s0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ pa0 b;

    public /* synthetic */ fa0(pa0 pa0Var, int i7) {
        this.a = i7;
        this.b = pa0Var;
    }

    @Override // v4.s0
    public final void a(RecyclerView recyclerView, int i7) {
        switch (this.a) {
            case 0:
                if (i7 == 1) {
                    pa0 pa0Var = this.b;
                    if (pa0Var.t0 && pa0Var.u0) {
                        org.telegram.messenger.g0.v1(pa0Var.getParentActivity().getCurrentFocus());
                        break;
                    }
                }
                break;
            default:
                boolean z9 = i7 != 0;
                pa0 pa0Var2 = this.b;
                pa0Var2.M = z9;
                if (!z9 && pa0Var2.H != null) {
                    pa0Var2.H = null;
                    break;
                }
                break;
        }
    }

    @Override // v4.s0
    public void b(RecyclerView recyclerView, int i7, int i10) {
        switch (this.a) {
            case 1:
                pa0 pa0Var = this.b;
                pa0Var.K0(false);
                if (pa0Var.H != null) {
                    pa0Var.J += i10;
                    break;
                }
                break;
        }
    }
}
