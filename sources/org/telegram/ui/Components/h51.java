package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-c0e607070f32dbde65005355ff6c489b77f9395a3e0f8720848e2402860dea84 */
/* loaded from: classes3.dex */
public final class h51 {
    public final /* synthetic */ q51 a;
    public final /* synthetic */ t51 b;

    public h51(t51 t51Var, q51 q51Var) {
        this.b = t51Var;
        this.a = q51Var;
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
        t51 t51Var = this.b;
        j51 j51Var = t51Var.n;
        if (z10) {
            s4.h0 adapter = j51Var.getAdapter();
            gg.g2 g2Var = t51Var.v;
            if (adapter != g2Var) {
                j51Var.setAdapter(g2Var);
                if (j51Var.getAdapter().h() <= 0) {
                    t51Var.r.i1(0, AndroidUtilities.dp(58.0f) + (-j51Var.getPaddingTop()) + t51Var.E, false);
                    return;
                }
                return;
            }
        }
        if (z10) {
            return;
        }
        s4.h0 adapter2 = j51Var.getAdapter();
        s51 s51Var = t51Var.s;
        if (adapter2 == s51Var) {
            return;
        }
        j51Var.setAdapter(s51Var);
        if (j51Var.getAdapter().h() <= 0) {
        }
    }
}
