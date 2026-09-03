package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class p01 implements m2.f {
    public int a;
    public final /* synthetic */ q01 b;

    public p01(q01 q01Var) {
        this.b = q01Var;
    }

    @Override // m2.f
    public final void a(int i10) {
        q01 q01Var = this.b;
        ProfileActivity profileActivity = q01Var.n;
        int k10 = profileActivity.k0.A0.k(i10);
        q01Var.a(this.a != k10);
        this.a = k10;
        if (profileActivity.n0 == null) {
            return;
        }
        if (profileActivity.Q0.t()) {
            AndroidUtilities.runOnUIThread(new sz0(q01Var, 2), 500L);
        } else {
            q01Var.c();
        }
    }

    @Override // m2.f
    public final void c(int i10) {
    }

    @Override // m2.f
    public final void b(float f10, int i10, int i11) {
    }
}
