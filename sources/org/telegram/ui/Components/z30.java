package org.telegram.ui.Components;

import java.util.ArrayList;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final class z30 implements fg.c2 {
    public final /* synthetic */ a40 a;

    public z30(a40 a40Var) {
        this.a = a40Var;
    }

    @Override // fg.c2
    public final a0.i D() {
        return this.a.w.e0;
    }

    @Override // fg.c2
    public final /* synthetic */ a0.i P() {
        return null;
    }

    @Override // fg.c2
    public final void a(int i10) {
        a40 a40Var = this.a;
        b40 b40Var = a40Var.w;
        if (i10 < 0 || i10 != a40Var.n || a40Var.h) {
            return;
        }
        int i11 = a40Var.f - 1;
        boolean z10 = b40Var.s.getVisibility() == 0;
        a40Var.l();
        if (a40Var.f > i11) {
            b40Var.J(i11);
        }
        if (a40Var.d.e() || !b40Var.d.R0()) {
            return;
        }
        b40Var.s.e(false, z10);
    }

    @Override // fg.c2
    public final /* synthetic */ boolean c0(int i10) {
        return true;
    }

    @Override // fg.c2
    public final /* synthetic */ void k0(ArrayList arrayList) {
    }
}
