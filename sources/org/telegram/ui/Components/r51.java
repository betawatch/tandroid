package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-54f46d3192cfcf06f3cb7093cda92e459a80ef6ed91a766593a44d0f1cb126c7 */
/* loaded from: classes3.dex */
public final class r51 {
    public final /* synthetic */ a61 a;
    public final /* synthetic */ d61 b;

    public r51(d61 d61Var, a61 a61Var) {
        this.b = d61Var;
        this.a = a61Var;
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
        d61 d61Var = this.b;
        t51 t51Var = d61Var.n;
        if (z10) {
            s4.g0 adapter = t51Var.getAdapter();
            hg.e2 e2Var = d61Var.v;
            if (adapter != e2Var) {
                t51Var.setAdapter(e2Var);
                if (t51Var.getAdapter().h() <= 0) {
                    d61Var.r.i1(0, AndroidUtilities.dp(58.0f) + (-t51Var.getPaddingTop()) + d61Var.E, false);
                    return;
                }
                return;
            }
        }
        if (z10) {
            return;
        }
        s4.g0 adapter2 = t51Var.getAdapter();
        c61 c61Var = d61Var.s;
        if (adapter2 == c61Var) {
            return;
        }
        t51Var.setAdapter(c61Var);
        if (t51Var.getAdapter().h() <= 0) {
        }
    }
}
