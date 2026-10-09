package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final class a11 implements z4.e {
    public int a;
    public final /* synthetic */ b11 b;

    public a11(b11 b11Var) {
        this.b = b11Var;
    }

    @Override // z4.e
    public final void a(int i10) {
        b11 b11Var = this.b;
        ProfileActivity profileActivity = b11Var.n;
        int k10 = profileActivity.n0.D0.k(i10);
        b11Var.a(this.a != k10);
        this.a = k10;
        if (profileActivity.q0 == null) {
            return;
        }
        if (profileActivity.T0.t()) {
            AndroidUtilities.runOnUIThread(new nz0(b11Var, 3), 500L);
        } else {
            b11Var.c();
        }
    }

    @Override // z4.e
    public final void c(int i10) {
    }

    @Override // z4.e
    public final void b(float f7, int i10, int i11) {
    }
}
