package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final class i01 implements m2.f {
    public int a;
    public final /* synthetic */ j01 b;

    public i01(j01 j01Var) {
        this.b = j01Var;
    }

    @Override // m2.f
    public final void a(int i10) {
        j01 j01Var = this.b;
        ProfileActivity profileActivity = j01Var.n;
        int k10 = profileActivity.k0.A0.k(i10);
        j01Var.a(this.a != k10);
        this.a = k10;
        if (profileActivity.n0 == null) {
            return;
        }
        if (profileActivity.Q0.t()) {
            AndroidUtilities.runOnUIThread(new vy0(j01Var, 3), 500L);
        } else {
            j01Var.c();
        }
    }

    @Override // m2.f
    public final void c(int i10) {
    }

    @Override // m2.f
    public final void b(float f10, int i10, int i11) {
    }
}
