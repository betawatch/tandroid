package org.telegram.ui.Components;

import java.util.ArrayList;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class n30 implements rf.j1 {
    public final /* synthetic */ o30 a;

    public n30(o30 o30Var) {
        this.a = o30Var;
    }

    @Override // rf.j1
    public final /* synthetic */ boolean A(int i10) {
        return true;
    }

    @Override // rf.j1
    public final void f(int i10) {
        o30 o30Var = this.a;
        p30 p30Var = o30Var.w;
        if (i10 < 0 || i10 != o30Var.n || o30Var.h) {
            return;
        }
        int i11 = o30Var.f - 1;
        boolean z10 = p30Var.s.getVisibility() == 0;
        o30Var.l();
        if (o30Var.f > i11) {
            p30Var.I(i11);
        }
        if (o30Var.d.e() || !p30Var.d.S0()) {
            return;
        }
        p30Var.s.e(false, z10);
    }

    @Override // rf.j1
    public final a0.h q() {
        return this.a.w.a0;
    }

    @Override // rf.j1
    public final /* synthetic */ a0.h t() {
        return null;
    }

    @Override // rf.j1
    public final /* synthetic */ void E(ArrayList arrayList) {
    }
}
