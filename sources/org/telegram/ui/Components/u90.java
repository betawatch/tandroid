package org.telegram.ui.Components;

import android.view.View;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class u90 implements fj0 {
    public final /* synthetic */ x90 a;

    public u90(x90 x90Var) {
        this.a = x90Var;
    }

    @Override // org.telegram.ui.Components.fj0
    public final void f(int i3, View view) {
        x90 x90Var = this.a;
        if (x90Var.a != 1 || x90Var.r.f.size() <= 1) {
            return;
        }
        int f12 = ((org.telegram.messenger.zi) x90Var.r.f.get(i3)).f1();
        boolean z10 = x90Var.r.g.get(f12, false);
        boolean z11 = !z10;
        if (x90Var.r.g.size() == 1 && z10) {
            return;
        }
        if (z10) {
            x90Var.r.g.delete(f12);
        } else {
            x90Var.r.g.put(f12, z11);
        }
        if (view instanceof org.telegram.ui.Cells.q1) {
            ((org.telegram.ui.Cells.q1) view).j3(z11, z11, true);
        }
        x90Var.l(true);
    }
}
