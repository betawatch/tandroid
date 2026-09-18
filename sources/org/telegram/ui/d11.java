package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final class d11 implements z4.e {
    public int a;
    public final /* synthetic */ e11 b;

    public d11(e11 e11Var) {
        this.b = e11Var;
    }

    @Override // z4.e
    public final void a(int i10) {
        e11 e11Var = this.b;
        ProfileActivity profileActivity = e11Var.n;
        int k10 = profileActivity.n0.D0.k(i10);
        e11Var.a(this.a != k10);
        this.a = k10;
        if (profileActivity.q0 == null) {
            return;
        }
        if (profileActivity.T0.t()) {
            AndroidUtilities.runOnUIThread(new g01(e11Var, 2), 500L);
        } else {
            e11Var.c();
        }
    }

    @Override // z4.e
    public final void c(int i10) {
    }

    @Override // z4.e
    public final void b(float f7, int i10, int i11) {
    }
}
