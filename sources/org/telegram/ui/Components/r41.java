package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final class r41 {
    public final /* synthetic */ a51 a;
    public final /* synthetic */ d51 b;

    public r41(d51 d51Var, a51 a51Var) {
        this.b = d51Var;
        this.a = a51Var;
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
        d51 d51Var = this.b;
        t41 t41Var = d51Var.n;
        if (z4) {
            f2.p0 adapter = t41Var.getAdapter();
            uf.m1 m1Var = d51Var.v;
            if (adapter != m1Var) {
                t41Var.setAdapter(m1Var);
                if (t41Var.getAdapter().h() <= 0) {
                    d51Var.r.i1(0, AndroidUtilities.dp(58.0f) + (-t41Var.getPaddingTop()) + d51Var.B, false);
                    return;
                }
                return;
            }
        }
        if (z4) {
            return;
        }
        f2.p0 adapter2 = t41Var.getAdapter();
        c51 c51Var = d51Var.s;
        if (adapter2 == c51Var) {
            return;
        }
        t41Var.setAdapter(c51Var);
        if (t41Var.getAdapter().h() <= 0) {
        }
    }
}
