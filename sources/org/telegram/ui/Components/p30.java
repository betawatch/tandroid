package org.telegram.ui.Components;

import java.util.ArrayList;

/* compiled from: r8-map-id-1181a9f210c4244598aa36bb39e1460f3842f305ed8c0c95af755ee091fedd7d */
/* loaded from: classes3.dex */
public final class p30 implements hg.a2 {
    public final /* synthetic */ q30 a;

    public p30(q30 q30Var) {
        this.a = q30Var;
    }

    @Override // hg.a2
    public final /* synthetic */ a0.i G() {
        return null;
    }

    @Override // hg.a2
    public final /* synthetic */ boolean Q(int i10) {
        return true;
    }

    @Override // hg.a2
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
        if (q30Var.d.e() || !r30Var.d.R0()) {
            return;
        }
        r30Var.s.e(false, z10);
    }

    @Override // hg.a2
    public final a0.i w() {
        return this.a.w.e0;
    }

    @Override // hg.a2
    public final /* synthetic */ void Y(ArrayList arrayList) {
    }
}
