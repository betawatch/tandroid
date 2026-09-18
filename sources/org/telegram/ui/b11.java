package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-33b1d79182603e8304c32e909c352797304d7e7816a08740f96af6cffe97caab */
/* loaded from: classes3.dex */
public final class b11 implements z4.e {
    public int a;
    public final /* synthetic */ c11 b;

    public b11(c11 c11Var) {
        this.b = c11Var;
    }

    @Override // z4.e
    public final void a(int i10) {
        c11 c11Var = this.b;
        ProfileActivity profileActivity = c11Var.n;
        int k10 = profileActivity.n0.D0.k(i10);
        c11Var.a(this.a != k10);
        this.a = k10;
        if (profileActivity.q0 == null) {
            return;
        }
        if (profileActivity.T0.t()) {
            AndroidUtilities.runOnUIThread(new e01(c11Var, 2), 500L);
        } else {
            c11Var.c();
        }
    }

    @Override // z4.e
    public final void c(int i10) {
    }

    @Override // z4.e
    public final void b(float f7, int i10, int i11) {
    }
}
