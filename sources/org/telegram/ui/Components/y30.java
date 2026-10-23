package org.telegram.ui.Components;

import java.util.ArrayList;

/* compiled from: r8-map-id-6bb23a39fe2d1bb2dc6cc69f606436ba751c240cf93e0ff97ff041cb9f09a305 */
/* loaded from: classes3.dex */
public final class y30 implements hg.z1 {
    public final /* synthetic */ z30 a;

    public y30(z30 z30Var) {
        this.a = z30Var;
    }

    @Override // hg.z1
    public final /* synthetic */ a0.h G() {
        return null;
    }

    @Override // hg.z1
    public final /* synthetic */ boolean O(int i10) {
        return true;
    }

    @Override // hg.z1
    public final void f(int i10) {
        z30 z30Var = this.a;
        a40 a40Var = z30Var.w;
        if (i10 < 0 || i10 != z30Var.n || z30Var.h) {
            return;
        }
        int i11 = z30Var.f - 1;
        boolean z10 = a40Var.s.getVisibility() == 0;
        z30Var.l();
        if (z30Var.f > i11) {
            a40Var.J(i11);
        }
        if (z30Var.d.e() || !a40Var.d.T0()) {
            return;
        }
        a40Var.s.e(false, z10);
    }

    @Override // hg.z1
    public final a0.h x() {
        return this.a.w.e0;
    }

    @Override // hg.z1
    public final /* synthetic */ void S(ArrayList arrayList) {
    }
}
