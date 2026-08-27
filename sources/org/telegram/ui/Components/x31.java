package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class x31 {
    public final /* synthetic */ g41 a;
    public final /* synthetic */ j41 b;

    public x31(j41 j41Var, g41 g41Var) {
        this.b = j41Var;
        this.a = g41Var;
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
        j41 j41Var = this.b;
        z31 z31Var = j41Var.n;
        if (z10) {
            f2.q0 adapter = z31Var.getAdapter();
            pf.l1 l1Var = j41Var.v;
            if (adapter != l1Var) {
                z31Var.setAdapter(l1Var);
                if (z31Var.getAdapter().h() <= 0) {
                    j41Var.r.i1(0, AndroidUtilities.dp(58.0f) + (-z31Var.getPaddingTop()) + j41Var.A, false);
                    return;
                }
                return;
            }
        }
        if (z10) {
            return;
        }
        f2.q0 adapter2 = z31Var.getAdapter();
        i41 i41Var = j41Var.s;
        if (adapter2 == i41Var) {
            return;
        }
        z31Var.setAdapter(i41Var);
        if (z31Var.getAdapter().h() <= 0) {
        }
    }
}
