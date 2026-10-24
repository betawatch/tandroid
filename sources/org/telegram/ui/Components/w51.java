package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
/* loaded from: classes3.dex */
public final class w51 {
    public final /* synthetic */ f61 a;
    public final /* synthetic */ i61 b;

    public w51(i61 i61Var, f61 f61Var) {
        this.b = i61Var;
        this.a = f61Var;
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
        i61 i61Var = this.b;
        y51 y51Var = i61Var.n;
        if (z10) {
            s4.g0 adapter = y51Var.getAdapter();
            hg.e2 e2Var = i61Var.v;
            if (adapter != e2Var) {
                y51Var.setAdapter(e2Var);
                if (y51Var.getAdapter().h() <= 0) {
                    i61Var.r.i1(0, AndroidUtilities.dp(58.0f) + (-y51Var.getPaddingTop()) + i61Var.E, false);
                    return;
                }
                return;
            }
        }
        if (z10) {
            return;
        }
        s4.g0 adapter2 = y51Var.getAdapter();
        h61 h61Var = i61Var.s;
        if (adapter2 == h61Var) {
            return;
        }
        y51Var.setAdapter(h61Var);
        if (y51Var.getAdapter().h() <= 0) {
        }
    }
}
