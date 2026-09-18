package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final class t41 {
    public final /* synthetic */ c51 a;
    public final /* synthetic */ f51 b;

    public t41(f51 f51Var, c51 c51Var) {
        this.b = f51Var;
        this.a = c51Var;
    }

    public final int a() {
        return this.b.s.v;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0029  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void b(boolean z10) {
        f51 f51Var = this.b;
        v41 v41Var = f51Var.n;
        if (z10) {
            s4.h0 adapter = v41Var.getAdapter();
            gg.g2 g2Var = f51Var.v;
            if (adapter != g2Var) {
                v41Var.setAdapter(g2Var);
                if (v41Var.getAdapter().h() <= 0) {
                    f51Var.r.i1(0, AndroidUtilities.dp(58.0f) + (-v41Var.getPaddingTop()) + f51Var.E, false);
                    return;
                }
                return;
            }
        }
        if (z10) {
            return;
        }
        s4.h0 adapter2 = v41Var.getAdapter();
        e51 e51Var = f51Var.s;
        if (adapter2 == e51Var) {
            return;
        }
        v41Var.setAdapter(e51Var);
        if (v41Var.getAdapter().h() <= 0) {
        }
    }
}
