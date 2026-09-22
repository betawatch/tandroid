package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
/* loaded from: classes3.dex */
public final class i51 {
    public final /* synthetic */ r51 a;
    public final /* synthetic */ u51 b;

    public i51(u51 u51Var, r51 r51Var) {
        this.b = u51Var;
        this.a = r51Var;
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
        u51 u51Var = this.b;
        k51 k51Var = u51Var.n;
        if (z10) {
            s4.h0 adapter = k51Var.getAdapter();
            gg.g2 g2Var = u51Var.v;
            if (adapter != g2Var) {
                k51Var.setAdapter(g2Var);
                if (k51Var.getAdapter().h() <= 0) {
                    u51Var.r.i1(0, AndroidUtilities.dp(58.0f) + (-k51Var.getPaddingTop()) + u51Var.E, false);
                    return;
                }
                return;
            }
        }
        if (z10) {
            return;
        }
        s4.h0 adapter2 = k51Var.getAdapter();
        t51 t51Var = u51Var.s;
        if (adapter2 == t51Var) {
            return;
        }
        k51Var.setAdapter(t51Var);
        if (k51Var.getAdapter().h() <= 0) {
        }
    }
}
