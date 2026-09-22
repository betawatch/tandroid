package org.telegram.ui.Components;

import java.util.ArrayList;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
/* loaded from: classes3.dex */
public final class p30 implements gg.b2 {
    public final /* synthetic */ q30 a;

    public p30(q30 q30Var) {
        this.a = q30Var;
    }

    @Override // gg.b2
    public final /* synthetic */ a0.i D() {
        return null;
    }

    @Override // gg.b2
    public final /* synthetic */ boolean L(int i10) {
        return true;
    }

    @Override // gg.b2
    public final void f(int i10) {
        q30 q30Var = this.a;
        r30 r30Var = q30Var.w;
        if (i10 < 0 || i10 != q30Var.n || q30Var.h) {
            return;
        }
        int i11 = q30Var.f - 1;
        boolean z10 = r30Var.s.getVisibility() == 0;
        q30Var.l();
        if (q30Var.f > i11) {
            r30Var.J(i11);
        }
        if (q30Var.d.e() || !r30Var.d.T0()) {
            return;
        }
        r30Var.s.e(false, z10);
    }

    @Override // gg.b2
    public final a0.i y() {
        return this.a.w.e0;
    }

    @Override // gg.b2
    public final /* synthetic */ void O(ArrayList arrayList) {
    }
}
