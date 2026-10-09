package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final class z51 {
    public final /* synthetic */ i61 a;
    public final /* synthetic */ l61 b;

    public z51(l61 l61Var, i61 i61Var) {
        this.b = l61Var;
        this.a = i61Var;
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
        l61 l61Var = this.b;
        b61 b61Var = l61Var.n;
        if (z10) {
            s4.i0 adapter = b61Var.getAdapter();
            gg.f2 f2Var = l61Var.v;
            if (adapter != f2Var) {
                b61Var.setAdapter(f2Var);
                if (b61Var.getAdapter().h() <= 0) {
                    l61Var.r.i1(0, AndroidUtilities.dp(58.0f) + (-b61Var.getPaddingTop()) + l61Var.E, false);
                    return;
                }
                return;
            }
        }
        if (z10) {
            return;
        }
        s4.i0 adapter2 = b61Var.getAdapter();
        k61 k61Var = l61Var.s;
        if (adapter2 == k61Var) {
            return;
        }
        b61Var.setAdapter(k61Var);
        if (b61Var.getAdapter().h() <= 0) {
        }
    }
}
