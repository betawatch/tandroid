package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class e61 {
    public final /* synthetic */ n61 a;
    public final /* synthetic */ q61 b;

    public e61(q61 q61Var, n61 n61Var) {
        this.b = q61Var;
        this.a = n61Var;
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
        q61 q61Var = this.b;
        g61 g61Var = q61Var.n;
        if (z10) {
            s4.h0 adapter = g61Var.getAdapter();
            ig.d2 d2Var = q61Var.v;
            if (adapter != d2Var) {
                g61Var.setAdapter(d2Var);
                if (g61Var.getAdapter().h() <= 0) {
                    q61Var.r.i1(0, AndroidUtilities.dp(58.0f) + (-g61Var.getPaddingTop()) + q61Var.E, false);
                    return;
                }
                return;
            }
        }
        if (z10) {
            return;
        }
        s4.h0 adapter2 = g61Var.getAdapter();
        p61 p61Var = q61Var.s;
        if (adapter2 == p61Var) {
            return;
        }
        g61Var.setAdapter(p61Var);
        if (g61Var.getAdapter().h() <= 0) {
        }
    }
}
