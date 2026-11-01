package org.telegram.ui;

import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final class kb0 extends s4.s0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ xb0 b;

    public /* synthetic */ kb0(xb0 xb0Var, int i10) {
        this.a = i10;
        this.b = xb0Var;
    }

    @Override // s4.s0
    public final void a(RecyclerView recyclerView, int i10) {
        switch (this.a) {
            case 0:
                if (i10 == 1) {
                    xb0 xb0Var = this.b;
                    if (xb0Var.z0 && xb0Var.A0) {
                        org.telegram.messenger.i0.v1(xb0Var.getParentActivity().getCurrentFocus());
                        break;
                    }
                }
                break;
            default:
                boolean z10 = i10 != 0;
                xb0 xb0Var2 = this.b;
                xb0Var2.O = z10;
                if (!z10 && xb0Var2.J != null) {
                    xb0Var2.J = null;
                    break;
                }
                break;
        }
    }

    @Override // s4.s0
    public void b(RecyclerView recyclerView, int i10, int i11) {
        switch (this.a) {
            case 1:
                xb0 xb0Var = this.b;
                xb0Var.P0(false);
                if (xb0Var.J != null) {
                    xb0Var.L += i11;
                    break;
                }
                break;
        }
    }
}
