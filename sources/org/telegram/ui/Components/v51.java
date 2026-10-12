package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes3.dex */
public final class v51 {
    public final /* synthetic */ e61 a;
    public final /* synthetic */ h61 b;

    public v51(h61 h61Var, e61 e61Var) {
        this.b = h61Var;
        this.a = e61Var;
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
        h61 h61Var = this.b;
        x51 x51Var = h61Var.n;
        if (z10) {
            s4.g0 adapter = x51Var.getAdapter();
            hg.e2 e2Var = h61Var.v;
            if (adapter != e2Var) {
                x51Var.setAdapter(e2Var);
                if (x51Var.getAdapter().h() <= 0) {
                    h61Var.r.i1(0, AndroidUtilities.dp(58.0f) + (-x51Var.getPaddingTop()) + h61Var.E, false);
                    return;
                }
                return;
            }
        }
        if (z10) {
            return;
        }
        s4.g0 adapter2 = x51Var.getAdapter();
        g61 g61Var = h61Var.s;
        if (adapter2 == g61Var) {
            return;
        }
        x51Var.setAdapter(g61Var);
        if (x51Var.getAdapter().h() <= 0) {
        }
    }
}
