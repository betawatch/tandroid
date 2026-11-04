package org.telegram.ui;

import android.view.View;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class d7 implements org.telegram.ui.Components.fj0 {
    public final /* synthetic */ org.telegram.ui.Components.tj0 a;
    public final /* synthetic */ e7 b;

    public d7(e7 e7Var, org.telegram.ui.Components.tj0 tj0Var) {
        this.b = e7Var;
        this.a = tj0Var;
    }

    @Override // org.telegram.ui.Components.fj0
    public final void f(int i3, View view) {
        u7 u7Var = this.b.f;
        org.telegram.ui.Components.tj0 tj0Var = this.a;
        g7 g7Var = (g7) tj0Var.getAdapter();
        n7 n7Var = (n7) g7Var.e.get(i3);
        if (view instanceof org.telegram.ui.Cells.n7) {
            u7.a(u7Var, n7Var, (p7) g7Var, tj0Var);
            return;
        }
        j7 j7Var = u7Var.G;
        if (j7Var != null) {
            j7Var.a(n7Var.c, n7Var.d, false);
        }
    }
}
