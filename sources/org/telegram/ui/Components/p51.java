package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-bcc7d273da888d5c27994201329e5b838e55754b73312241608ee42846efd426 */
/* loaded from: classes3.dex */
public final class p51 {
    public final /* synthetic */ y51 a;
    public final /* synthetic */ b61 b;

    public p51(b61 b61Var, y51 y51Var) {
        this.b = b61Var;
        this.a = y51Var;
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
        b61 b61Var = this.b;
        r51 r51Var = b61Var.n;
        if (z10) {
            s4.g0 adapter = r51Var.getAdapter();
            hg.e2 e2Var = b61Var.v;
            if (adapter != e2Var) {
                r51Var.setAdapter(e2Var);
                if (r51Var.getAdapter().h() <= 0) {
                    b61Var.r.i1(0, AndroidUtilities.dp(58.0f) + (-r51Var.getPaddingTop()) + b61Var.E, false);
                    return;
                }
                return;
            }
        }
        if (z10) {
            return;
        }
        s4.g0 adapter2 = r51Var.getAdapter();
        a61 a61Var = b61Var.s;
        if (adapter2 == a61Var) {
            return;
        }
        r51Var.setAdapter(a61Var);
        if (r51Var.getAdapter().h() <= 0) {
        }
    }
}
