package org.telegram.ui.Components;

import java.util.ArrayList;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final class q20 implements jg.y1 {
    public final /* synthetic */ r20 a;

    public q20(r20 r20Var) {
        this.a = r20Var;
    }

    @Override // jg.y1
    public final a0.h K0() {
        return this.a.x.Z1;
    }

    @Override // jg.y1
    public final /* synthetic */ a0.h d1() {
        return null;
    }

    @Override // jg.y1
    public final void r(int i7) {
        r20 r20Var = this.a;
        s20 s20Var = r20Var.x;
        if (i7 < 0 || i7 != r20Var.n || r20Var.h) {
            return;
        }
        int i10 = r20Var.f - 1;
        boolean z10 = s20Var.u1.getVisibility() == 0;
        r20Var.f();
        if (r20Var.f > i10) {
            s20Var.P0(i10);
        }
        if (r20Var.d.e() || !s20Var.o1.R0()) {
            return;
        }
        s20Var.u1.e(false, z10);
    }

    @Override // jg.y1
    public final /* synthetic */ boolean v1(int i7) {
        return true;
    }

    @Override // jg.y1
    public final /* synthetic */ void P1(ArrayList arrayList) {
    }
}
