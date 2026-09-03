package org.telegram.ui.Components;

import java.util.ArrayList;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class s30 implements tf.i1 {
    public final /* synthetic */ t30 a;

    public s30(t30 t30Var) {
        this.a = t30Var;
    }

    @Override // tf.i1
    public final a0.h H0() {
        return this.a.w.b0;
    }

    @Override // tf.i1
    public final /* synthetic */ a0.h X0() {
        return null;
    }

    @Override // tf.i1
    public final void k(int i10) {
        t30 t30Var = this.a;
        u30 u30Var = t30Var.w;
        if (i10 < 0 || i10 != t30Var.n || t30Var.h) {
            return;
        }
        int i11 = t30Var.f - 1;
        boolean z4 = u30Var.s.getVisibility() == 0;
        t30Var.l();
        if (t30Var.f > i11) {
            u30Var.I(i11);
        }
        if (t30Var.d.e() || !u30Var.d.R0()) {
            return;
        }
        u30Var.s.e(false, z4);
    }

    @Override // tf.i1
    public final /* synthetic */ boolean t1(int i10) {
        return true;
    }

    @Override // tf.i1
    public final /* synthetic */ void J1(ArrayList arrayList) {
    }
}
