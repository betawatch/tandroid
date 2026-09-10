package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final class h11 implements z4.e {
    public int a;
    public final /* synthetic */ i11 b;

    public h11(i11 i11Var) {
        this.b = i11Var;
    }

    @Override // z4.e
    public final void a(int i10) {
        i11 i11Var = this.b;
        ProfileActivity profileActivity = i11Var.n;
        int k10 = profileActivity.n0.D0.k(i10);
        i11Var.a(this.a != k10);
        this.a = k10;
        if (profileActivity.q0 == null) {
            return;
        }
        if (profileActivity.T0.t()) {
            AndroidUtilities.runOnUIThread(new k01(i11Var, 2), 500L);
        } else {
            i11Var.c();
        }
    }

    @Override // z4.e
    public final void c(int i10) {
    }

    @Override // z4.e
    public final void b(float f7, int i10, int i11) {
    }
}
