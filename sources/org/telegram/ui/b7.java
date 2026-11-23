package org.telegram.ui;

import android.view.View;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes3.dex */
public final class b7 implements org.telegram.ui.Components.qj0 {
    public final /* synthetic */ org.telegram.ui.Components.ek0 a;
    public final /* synthetic */ c7 b;

    public b7(c7 c7Var, org.telegram.ui.Components.ek0 ek0Var) {
        this.b = c7Var;
        this.a = ek0Var;
    }

    @Override // org.telegram.ui.Components.qj0
    public final void c(int i7, View view) {
        s7 s7Var = this.b.f;
        org.telegram.ui.Components.ek0 ek0Var = this.a;
        e7 e7Var = (e7) ek0Var.getAdapter();
        l7 l7Var = (l7) e7Var.e.get(i7);
        if (view instanceof org.telegram.ui.Cells.p7) {
            s7.a(s7Var, l7Var, (n7) e7Var, ek0Var);
            return;
        }
        h7 h7Var = s7Var.G;
        if (h7Var != null) {
            h7Var.m(l7Var.c, l7Var.d, false);
        }
    }
}
