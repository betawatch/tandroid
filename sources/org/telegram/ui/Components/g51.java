package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-eaaffe05e5b4975c35db95ddc7f057e1a9a0a254a43fe066fa0ad675f8b3973e */
/* loaded from: classes3.dex */
public final class g51 {
    public final /* synthetic */ p51 a;
    public final /* synthetic */ s51 b;

    public g51(s51 s51Var, p51 p51Var) {
        this.b = s51Var;
        this.a = p51Var;
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
        s51 s51Var = this.b;
        i51 i51Var = s51Var.n;
        if (z10) {
            s4.h0 adapter = i51Var.getAdapter();
            gg.g2 g2Var = s51Var.v;
            if (adapter != g2Var) {
                i51Var.setAdapter(g2Var);
                if (i51Var.getAdapter().h() <= 0) {
                    s51Var.r.i1(0, AndroidUtilities.dp(58.0f) + (-i51Var.getPaddingTop()) + s51Var.E, false);
                    return;
                }
                return;
            }
        }
        if (z10) {
            return;
        }
        s4.h0 adapter2 = i51Var.getAdapter();
        r51 r51Var = s51Var.s;
        if (adapter2 == r51Var) {
            return;
        }
        i51Var.setAdapter(r51Var);
        if (i51Var.getAdapter().h() <= 0) {
        }
    }
}
