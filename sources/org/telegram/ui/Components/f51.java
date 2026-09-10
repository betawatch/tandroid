package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final class f51 {
    public final /* synthetic */ o51 a;
    public final /* synthetic */ r51 b;

    public f51(r51 r51Var, o51 o51Var) {
        this.b = r51Var;
        this.a = o51Var;
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
        r51 r51Var = this.b;
        h51 h51Var = r51Var.n;
        if (z10) {
            s4.h0 adapter = h51Var.getAdapter();
            fg.h2 h2Var = r51Var.v;
            if (adapter != h2Var) {
                h51Var.setAdapter(h2Var);
                if (h51Var.getAdapter().h() <= 0) {
                    r51Var.r.i1(0, AndroidUtilities.dp(58.0f) + (-h51Var.getPaddingTop()) + r51Var.E, false);
                    return;
                }
                return;
            }
        }
        if (z10) {
            return;
        }
        s4.h0 adapter2 = h51Var.getAdapter();
        q51 q51Var = r51Var.s;
        if (adapter2 == q51Var) {
            return;
        }
        h51Var.setAdapter(q51Var);
        if (h51Var.getAdapter().h() <= 0) {
        }
    }
}
