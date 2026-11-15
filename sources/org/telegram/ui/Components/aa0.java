package org.telegram.ui.Components;

import android.view.View;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final class aa0 implements gj0 {
    public final /* synthetic */ da0 a;

    public aa0(da0 da0Var) {
        this.a = da0Var;
    }

    @Override // org.telegram.ui.Components.gj0
    public final void b(int i7, View view) {
        da0 da0Var = this.a;
        if (da0Var.a != 1 || da0Var.r.f.size() <= 1) {
            return;
        }
        int e12 = ((org.telegram.messenger.gj) da0Var.r.f.get(i7)).e1();
        boolean z10 = da0Var.r.g.get(e12, false);
        boolean z11 = !z10;
        if (da0Var.r.g.size() == 1 && z10) {
            return;
        }
        if (z10) {
            da0Var.r.g.delete(e12);
        } else {
            da0Var.r.g.put(e12, z11);
        }
        if (view instanceof org.telegram.ui.Cells.q1) {
            ((org.telegram.ui.Cells.q1) view).m3(z11, z11, true);
        }
        da0Var.l(true);
    }
}
