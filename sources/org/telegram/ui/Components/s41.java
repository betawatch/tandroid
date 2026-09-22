package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes3.dex */
public final class s41 {
    public final /* synthetic */ b51 a;
    public final /* synthetic */ e51 b;

    public s41(e51 e51Var, b51 b51Var) {
        this.b = e51Var;
        this.a = b51Var;
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
        e51 e51Var = this.b;
        u41 u41Var = e51Var.n;
        if (z10) {
            s4.h0 adapter = u41Var.getAdapter();
            gg.g2 g2Var = e51Var.v;
            if (adapter != g2Var) {
                u41Var.setAdapter(g2Var);
                if (u41Var.getAdapter().h() <= 0) {
                    e51Var.r.i1(0, AndroidUtilities.dp(58.0f) + (-u41Var.getPaddingTop()) + e51Var.E, false);
                    return;
                }
                return;
            }
        }
        if (z10) {
            return;
        }
        s4.h0 adapter2 = u41Var.getAdapter();
        d51 d51Var = e51Var.s;
        if (adapter2 == d51Var) {
            return;
        }
        u41Var.setAdapter(d51Var);
        if (u41Var.getAdapter().h() <= 0) {
        }
    }
}
