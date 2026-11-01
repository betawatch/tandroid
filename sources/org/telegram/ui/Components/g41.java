package org.telegram.ui.Components;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final class g41 implements uu0 {
    public int a;
    public boolean b;
    public final /* synthetic */ h41 c;

    public g41(h41 h41Var) {
        this.c = h41Var;
    }

    @Override // org.telegram.ui.Components.uu0
    public final void L(int i10, boolean z10) {
        if (this.a == i10 && this.b == z10) {
            return;
        }
        this.a = i10;
        this.b = z10;
        if (i10 > org.telegram.messenger.i0.L(20.0f)) {
            h41 h41Var = this.c;
            if (h41Var.g0) {
                return;
            }
            h41Var.n0.q0 = false;
            h41Var.g0 = true;
        }
    }
}
