package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final class k01 implements m2.f {
    public int a;
    public final /* synthetic */ l01 b;

    public k01(l01 l01Var) {
        this.b = l01Var;
    }

    @Override // m2.f
    public final void a(int i10) {
        l01 l01Var = this.b;
        ProfileActivity profileActivity = l01Var.n;
        int k10 = profileActivity.k0.A0.k(i10);
        l01Var.a(this.a != k10);
        this.a = k10;
        if (profileActivity.n0 == null) {
            return;
        }
        if (profileActivity.Q0.t()) {
            AndroidUtilities.runOnUIThread(new xy0(l01Var, 3), 500L);
        } else {
            l01Var.c();
        }
    }

    @Override // m2.f
    public final void c(int i10) {
    }

    @Override // m2.f
    public final void b(float f10, int i10, int i11) {
    }
}
