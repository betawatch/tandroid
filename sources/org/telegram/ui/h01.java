package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes3.dex */
public final class h01 implements z4.f {
    public int a;
    public final /* synthetic */ i01 b;

    public h01(i01 i01Var) {
        this.b = i01Var;
    }

    @Override // z4.f
    public final void a(int i10) {
        i01 i01Var = this.b;
        ProfileActivity profileActivity = i01Var.n;
        int k10 = profileActivity.o0.D0.k(i10);
        i01Var.a(this.a != k10);
        this.a = k10;
        if (profileActivity.r0 == null) {
            return;
        }
        if (profileActivity.U0.t()) {
            AndroidUtilities.runOnUIThread(new my0(i01Var, 4), 500L);
        } else {
            i01Var.c();
        }
    }

    @Override // z4.f
    public final void c(int i10) {
    }

    @Override // z4.f
    public final void b(float f7, int i10, int i11) {
    }
}
