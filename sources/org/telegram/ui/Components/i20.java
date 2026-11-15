package org.telegram.ui.Components;

import java.util.ArrayList;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final class i20 implements jg.y1 {
    public final /* synthetic */ j20 a;

    public i20(j20 j20Var) {
        this.a = j20Var;
    }

    @Override // jg.y1
    public final a0.h K() {
        return this.a.x.Z1;
    }

    @Override // jg.y1
    public final /* synthetic */ a0.h U() {
        return null;
    }

    @Override // jg.y1
    public final /* synthetic */ boolean e0(int i7) {
        return true;
    }

    @Override // jg.y1
    public final void i(int i7) {
        j20 j20Var = this.a;
        k20 k20Var = j20Var.x;
        if (i7 < 0 || i7 != j20Var.n || j20Var.h) {
            return;
        }
        int i10 = j20Var.f - 1;
        boolean z10 = k20Var.u1.getVisibility() == 0;
        j20Var.f();
        if (j20Var.f > i10) {
            k20Var.O0(i10);
        }
        if (j20Var.d.e() || !k20Var.o1.R0()) {
            return;
        }
        k20Var.u1.e(false, z10);
    }

    @Override // jg.y1
    public final /* synthetic */ void l0(ArrayList arrayList) {
    }
}
