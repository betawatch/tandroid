package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
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
    public final void b(boolean z4) {
        f51 f51Var = this.b;
        v41 v41Var = f51Var.n;
        if (z4) {
            f2.p0 adapter = v41Var.getAdapter();
            uf.m1 m1Var = f51Var.v;
            if (adapter != m1Var) {
                v41Var.setAdapter(m1Var);
                if (v41Var.getAdapter().h() <= 0) {
                    f51Var.r.i1(0, AndroidUtilities.dp(58.0f) + (-v41Var.getPaddingTop()) + f51Var.B, false);
                    return;
                }
                return;
            }
        }
        if (z4) {
            return;
        }
        f2.p0 adapter2 = v41Var.getAdapter();
        e51 e51Var = f51Var.s;
        if (adapter2 == e51Var) {
            return;
        }
        v41Var.setAdapter(e51Var);
        if (v41Var.getAdapter().h() <= 0) {
        }
    }
}
