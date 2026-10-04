package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-90c74b6d1af88fe423a82a48cb36c0781986d7c98a26085f38aeb2edc71128ad */
/* loaded from: classes3.dex */
public final class q51 {
    public final /* synthetic */ z51 a;
    public final /* synthetic */ c61 b;

    public q51(c61 c61Var, z51 z51Var) {
        this.b = c61Var;
        this.a = z51Var;
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
        c61 c61Var = this.b;
        s51 s51Var = c61Var.n;
        if (z10) {
            s4.h0 adapter = s51Var.getAdapter();
            gg.g2 g2Var = c61Var.v;
            if (adapter != g2Var) {
                s51Var.setAdapter(g2Var);
                if (s51Var.getAdapter().h() <= 0) {
                    c61Var.r.i1(0, AndroidUtilities.dp(58.0f) + (-s51Var.getPaddingTop()) + c61Var.E, false);
                    return;
                }
                return;
            }
        }
        if (z10) {
            return;
        }
        s4.h0 adapter2 = s51Var.getAdapter();
        b61 b61Var = c61Var.s;
        if (adapter2 == b61Var) {
            return;
        }
        s51Var.setAdapter(b61Var);
        if (s51Var.getAdapter().h() <= 0) {
        }
    }
}
