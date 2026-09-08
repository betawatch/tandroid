package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
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
    public final void b(boolean z10) {
        d51 d51Var = this.b;
        t41 t41Var = d51Var.n;
        if (z10) {
            s4.h0 adapter = t41Var.getAdapter();
            hg.f2 f2Var = d51Var.v;
            if (adapter != f2Var) {
                t41Var.setAdapter(f2Var);
                if (t41Var.getAdapter().h() <= 0) {
                    d51Var.r.i1(0, AndroidUtilities.dp(58.0f) + (-t41Var.getPaddingTop()) + d51Var.E, false);
                    return;
                }
                return;
            }
        }
        if (z10) {
            return;
        }
        s4.h0 adapter2 = t41Var.getAdapter();
        c51 c51Var = d51Var.s;
        if (adapter2 == c51Var) {
            return;
        }
        t41Var.setAdapter(c51Var);
        if (t41Var.getAdapter().h() <= 0) {
        }
    }
}
