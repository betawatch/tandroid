package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-189a3a12219b7c214453a48fa9697387dfb8b2ca31ce3a2eba70ff5e2610a248 */
/* loaded from: classes3.dex */
public final class f01 implements z4.e {
    public int a;
    public final /* synthetic */ g01 b;

    public f01(g01 g01Var) {
        this.b = g01Var;
    }

    @Override // z4.e
    public final void b(int i10) {
        g01 g01Var = this.b;
        ProfileActivity profileActivity = g01Var.n;
        int k10 = profileActivity.o0.D0.k(i10);
        g01Var.a(this.a != k10);
        this.a = k10;
        if (profileActivity.r0 == null) {
            return;
        }
        if (profileActivity.U0.t()) {
            AndroidUtilities.runOnUIThread(new sy0(g01Var, 3), 500L);
        } else {
            g01Var.c();
        }
    }

    @Override // z4.e
    public final void c(int i10) {
    }

    @Override // z4.e
    public final void a(float f7, int i10, int i11) {
    }
}
