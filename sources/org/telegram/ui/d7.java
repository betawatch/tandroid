package org.telegram.ui;

import android.view.View;

/* compiled from: r8-map-id-eaaffe05e5b4975c35db95ddc7f057e1a9a0a254a43fe066fa0ad675f8b3973e */
/* loaded from: classes3.dex */
public final class d7 implements org.telegram.ui.Components.jl0 {
    public final /* synthetic */ org.telegram.ui.Components.vl0 a;
    public final /* synthetic */ e7 b;

    public d7(e7 e7Var, org.telegram.ui.Components.vl0 vl0Var) {
        this.b = e7Var;
        this.a = vl0Var;
    }

    @Override // org.telegram.ui.Components.jl0
    public final void d(int i10, View view) {
        t7 t7Var = this.b.e;
        org.telegram.ui.Components.vl0 vl0Var = this.a;
        g7 g7Var = (g7) vl0Var.getAdapter();
        n7 n7Var = (n7) g7Var.e.get(i10);
        if (view instanceof org.telegram.ui.Cells.u7) {
            t7.a(t7Var, n7Var, (p7) g7Var, vl0Var);
            return;
        }
        j7 j7Var = t7Var.E;
        if (j7Var != null) {
            j7Var.H0(n7Var.c, n7Var.d, false);
        }
    }
}
