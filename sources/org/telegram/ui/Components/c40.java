package org.telegram.ui.Components;

import java.util.ArrayList;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes3.dex */
public final class c40 implements hg.z1 {
    public final /* synthetic */ d40 a;

    public c40(d40 d40Var) {
        this.a = d40Var;
    }

    @Override // hg.z1
    public final /* synthetic */ boolean E0(int i10) {
        return true;
    }

    @Override // hg.z1
    public final a0.h K() {
        return this.a.w.e0;
    }

    @Override // hg.z1
    public final void f(int i10) {
        d40 d40Var = this.a;
        e40 e40Var = d40Var.w;
        if (i10 < 0 || i10 != d40Var.n || d40Var.h) {
            return;
        }
        int i11 = d40Var.f - 1;
        boolean z10 = e40Var.s.getVisibility() == 0;
        d40Var.l();
        if (d40Var.f > i11) {
            e40Var.K(i11);
        }
        if (d40Var.d.e() || !e40Var.d.S0()) {
            return;
        }
        e40Var.s.e(false, z10);
    }

    @Override // hg.z1
    public final /* synthetic */ a0.h k0() {
        return null;
    }

    @Override // hg.z1
    public final /* synthetic */ void O0(ArrayList arrayList) {
    }
}
