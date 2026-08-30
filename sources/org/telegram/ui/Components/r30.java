package org.telegram.ui.Components;

import java.util.ArrayList;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final class r30 implements tf.j1 {
    public final /* synthetic */ s30 a;

    public r30(s30 s30Var) {
        this.a = s30Var;
    }

    @Override // tf.j1
    public final /* synthetic */ a0.h I() {
        return null;
    }

    @Override // tf.j1
    public final /* synthetic */ boolean Q(int i10) {
        return true;
    }

    @Override // tf.j1
    public final void g(int i10) {
        s30 s30Var = this.a;
        t30 t30Var = s30Var.w;
        if (i10 < 0 || i10 != s30Var.n || s30Var.h) {
            return;
        }
        int i11 = s30Var.f - 1;
        boolean z4 = t30Var.s.getVisibility() == 0;
        s30Var.l();
        if (s30Var.f > i11) {
            t30Var.I(i11);
        }
        if (s30Var.d.e() || !t30Var.d.S0()) {
            return;
        }
        t30Var.s.e(false, z4);
    }

    @Override // tf.j1
    public final a0.h t() {
        return this.a.w.b0;
    }

    @Override // tf.j1
    public final /* synthetic */ void T(ArrayList arrayList) {
    }
}
