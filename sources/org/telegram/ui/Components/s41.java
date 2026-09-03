package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
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
    public final void b(boolean z4) {
        e51 e51Var = this.b;
        u41 u41Var = e51Var.n;
        if (z4) {
            f2.o0 adapter = u41Var.getAdapter();
            tf.m1 m1Var = e51Var.v;
            if (adapter != m1Var) {
                u41Var.setAdapter(m1Var);
                if (u41Var.getAdapter().h() <= 0) {
                    e51Var.r.i1(0, AndroidUtilities.dp(58.0f) + (-u41Var.getPaddingTop()) + e51Var.B, false);
                    return;
                }
                return;
            }
        }
        if (z4) {
            return;
        }
        f2.o0 adapter2 = u41Var.getAdapter();
        d51 d51Var = e51Var.s;
        if (adapter2 == d51Var) {
            return;
        }
        u41Var.setAdapter(d51Var);
        if (u41Var.getAdapter().h() <= 0) {
        }
    }
}
