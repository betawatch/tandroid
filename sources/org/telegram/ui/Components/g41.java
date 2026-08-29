package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class g41 {
    public final /* synthetic */ p41 a;
    public final /* synthetic */ s41 b;

    public g41(s41 s41Var, p41 p41Var) {
        this.b = s41Var;
        this.a = p41Var;
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
        s41 s41Var = this.b;
        i41 i41Var = s41Var.n;
        if (z10) {
            f2.p0 adapter = i41Var.getAdapter();
            rf.m1 m1Var = s41Var.v;
            if (adapter != m1Var) {
                i41Var.setAdapter(m1Var);
                if (i41Var.getAdapter().h() <= 0) {
                    s41Var.r.i1(0, AndroidUtilities.dp(58.0f) + (-i41Var.getPaddingTop()) + s41Var.A, false);
                    return;
                }
                return;
            }
        }
        if (z10) {
            return;
        }
        f2.p0 adapter2 = i41Var.getAdapter();
        r41 r41Var = s41Var.s;
        if (adapter2 == r41Var) {
            return;
        }
        i41Var.setAdapter(r41Var);
        if (i41Var.getAdapter().h() <= 0) {
        }
    }
}
