package org.telegram.ui.Components;

import android.view.View;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final class ba0 implements gj0 {
    public final /* synthetic */ ea0 a;

    public ba0(ea0 ea0Var) {
        this.a = ea0Var;
    }

    @Override // org.telegram.ui.Components.gj0
    public final void b(int i7, View view) {
        ea0 ea0Var = this.a;
        if (ea0Var.a != 1 || ea0Var.r.f.size() <= 1) {
            return;
        }
        int e12 = ((org.telegram.messenger.gj) ea0Var.r.f.get(i7)).e1();
        boolean z10 = ea0Var.r.g.get(e12, false);
        boolean z11 = !z10;
        if (ea0Var.r.g.size() == 1 && z10) {
            return;
        }
        if (z10) {
            ea0Var.r.g.delete(e12);
        } else {
            ea0Var.r.g.put(e12, z11);
        }
        if (view instanceof org.telegram.ui.Cells.q1) {
            ((org.telegram.ui.Cells.q1) view).m3(z11, z11, true);
        }
        ea0Var.l(true);
    }
}
