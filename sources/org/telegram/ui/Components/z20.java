package org.telegram.ui.Components;

import java.util.ArrayList;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class z20 implements of.u1 {
    public final /* synthetic */ a30 a;

    public z20(a30 a30Var) {
        this.a = a30Var;
    }

    @Override // of.u1
    public final /* synthetic */ a0.h O() {
        return null;
    }

    @Override // of.u1
    public final void e(int i9) {
        a30 a30Var = this.a;
        b30 b30Var = a30Var.w;
        if (i9 < 0 || i9 != a30Var.n || a30Var.h) {
            return;
        }
        int i10 = a30Var.f - 1;
        boolean z10 = b30Var.s.getVisibility() == 0;
        a30Var.l();
        if (a30Var.f > i10) {
            b30Var.I(i10);
        }
        if (a30Var.d.e() || !b30Var.d.S0()) {
            return;
        }
        b30Var.s.e(false, z10);
    }

    @Override // of.u1
    public final /* synthetic */ boolean p0(int i9) {
        return true;
    }

    @Override // of.u1
    public final a0.h y() {
        return this.a.w.a0;
    }

    @Override // of.u1
    public final /* synthetic */ void H0(ArrayList arrayList) {
    }
}
