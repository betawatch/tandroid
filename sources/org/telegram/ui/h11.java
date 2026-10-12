package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes3.dex */
public final class h11 implements z4.e {
    public int a;
    public final /* synthetic */ i11 b;

    public h11(i11 i11Var) {
        this.b = i11Var;
    }

    @Override // z4.e
    public final void b(int i10) {
        i11 i11Var = this.b;
        ProfileActivity profileActivity = i11Var.n;
        int k10 = profileActivity.n0.D0.k(i10);
        i11Var.a(this.a != k10);
        this.a = k10;
        if (profileActivity.q0 == null) {
            return;
        }
        if (profileActivity.T0.t()) {
            AndroidUtilities.runOnUIThread(new uz0(i11Var, 3), 500L);
        } else {
            i11Var.c();
        }
    }

    @Override // z4.e
    public final void c(int i10) {
    }

    @Override // z4.e
    public final void a(float f7, int i10, int i11) {
    }
}
