package org.telegram.ui.Components;

import java.util.ArrayList;

/* compiled from: r8-map-id-bcc7d273da888d5c27994201329e5b838e55754b73312241608ee42846efd426 */
/* loaded from: classes3.dex */
public final class y30 implements hg.z1 {
    public final /* synthetic */ z30 a;

    public y30(z30 z30Var) {
        this.a = z30Var;
    }

    @Override // hg.z1
    public final /* synthetic */ a0.h J() {
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
            a40Var.K(i11);
        }
        if (z30Var.d.e() || !a40Var.d.S0()) {
            return;
        }
        a40Var.s.e(false, z10);
    }

    @Override // hg.z1
    public final a0.h y() {
        return this.a.w.e0;
    }

    @Override // hg.z1
    public final /* synthetic */ void Y(ArrayList arrayList) {
    }
}
