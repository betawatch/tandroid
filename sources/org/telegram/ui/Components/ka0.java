package org.telegram.ui.Components;

import android.view.View;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final class ka0 implements qj0 {
    public final /* synthetic */ na0 a;

    public ka0(na0 na0Var) {
        this.a = na0Var;
    }

    @Override // org.telegram.ui.Components.qj0
    public final void b(int i7, View view) {
        na0 na0Var = this.a;
        if (na0Var.a != 1 || na0Var.r.f.size() <= 1) {
            return;
        }
        int e12 = ((org.telegram.messenger.fj) na0Var.r.f.get(i7)).e1();
        boolean z10 = na0Var.r.g.get(e12, false);
        boolean z11 = !z10;
        if (na0Var.r.g.size() == 1 && z10) {
            return;
        }
        if (z10) {
            na0Var.r.g.delete(e12);
        } else {
            na0Var.r.g.put(e12, z11);
        }
        if (view instanceof org.telegram.ui.Cells.r1) {
            ((org.telegram.ui.Cells.r1) view).n3(z11, z11, true);
        }
        na0Var.l(true);
    }
}
