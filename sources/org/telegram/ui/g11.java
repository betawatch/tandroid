package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes3.dex */
public final class g11 implements z4.e {
    public int a;
    public final /* synthetic */ h11 b;

    public g11(h11 h11Var) {
        this.b = h11Var;
    }

    @Override // z4.e
    public final void b(int i10) {
        h11 h11Var = this.b;
        ProfileActivity profileActivity = h11Var.n;
        int k10 = profileActivity.n0.D0.k(i10);
        h11Var.a(this.a != k10);
        this.a = k10;
        if (profileActivity.q0 == null) {
            return;
        }
        if (profileActivity.T0.t()) {
            AndroidUtilities.runOnUIThread(new tz0(h11Var, 3), 500L);
        } else {
            h11Var.c();
        }
    }

    @Override // z4.e
    public final void c(int i10) {
    }

    @Override // z4.e
    public final void a(float f7, int i10, int i11) {
    }
}
