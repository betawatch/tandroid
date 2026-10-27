package org.telegram.ui.Components;

import java.util.ArrayList;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class a40 implements ig.z1 {
    public final /* synthetic */ b40 a;

    public a40(b40 b40Var) {
        this.a = b40Var;
    }

    @Override // ig.z1
    public final /* synthetic */ a0.h U() {
        return null;
    }

    @Override // ig.z1
    public final void f(int i10) {
        b40 b40Var = this.a;
        c40 c40Var = b40Var.w;
        if (i10 < 0 || i10 != b40Var.n || b40Var.h) {
            return;
        }
        int i11 = b40Var.f - 1;
        boolean z10 = c40Var.s.getVisibility() == 0;
        b40Var.l();
        if (b40Var.f > i11) {
            c40Var.J(i11);
        }
        if (b40Var.d.e() || !c40Var.d.S0()) {
            return;
        }
        c40Var.s.e(false, z10);
    }

    @Override // ig.z1
    public final /* synthetic */ boolean k0(int i10) {
        return true;
    }

    @Override // ig.z1
    public final a0.h y() {
        return this.a.w.e0;
    }

    @Override // ig.z1
    public final /* synthetic */ void p0(ArrayList arrayList) {
    }
}
