package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes3.dex */
public final class c11 implements z4.e {
    public int a;
    public final /* synthetic */ d11 b;

    public c11(d11 d11Var) {
        this.b = d11Var;
    }

    @Override // z4.e
    public final void a(int i10) {
        d11 d11Var = this.b;
        ProfileActivity profileActivity = d11Var.n;
        int k10 = profileActivity.n0.D0.k(i10);
        d11Var.a(this.a != k10);
        this.a = k10;
        if (profileActivity.q0 == null) {
            return;
        }
        if (profileActivity.T0.t()) {
            AndroidUtilities.runOnUIThread(new f01(d11Var, 2), 500L);
        } else {
            d11Var.c();
        }
    }

    @Override // z4.e
    public final void c(int i10) {
    }

    @Override // z4.e
    public final void b(float f7, int i10, int i11) {
    }
}
