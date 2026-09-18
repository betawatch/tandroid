package org.telegram.ui;

import android.view.View;

/* compiled from: r8-map-id-c0e607070f32dbde65005355ff6c489b77f9395a3e0f8720848e2402860dea84 */
/* loaded from: classes3.dex */
public final class d7 implements org.telegram.ui.Components.kl0 {
    public final /* synthetic */ org.telegram.ui.Components.wl0 a;
    public final /* synthetic */ e7 b;

    public d7(e7 e7Var, org.telegram.ui.Components.wl0 wl0Var) {
        this.b = e7Var;
        this.a = wl0Var;
    }

    @Override // org.telegram.ui.Components.kl0
    public final void d(int i10, View view) {
        t7 t7Var = this.b.e;
        org.telegram.ui.Components.wl0 wl0Var = this.a;
        g7 g7Var = (g7) wl0Var.getAdapter();
        n7 n7Var = (n7) g7Var.e.get(i10);
        if (view instanceof org.telegram.ui.Cells.t7) {
            t7.a(t7Var, n7Var, (p7) g7Var, wl0Var);
            return;
        }
        j7 j7Var = t7Var.E;
        if (j7Var != null) {
            j7Var.H0(n7Var.c, n7Var.d, false);
        }
    }
}
