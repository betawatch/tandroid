package org.telegram.ui;

import android.view.View;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final class c7 implements org.telegram.ui.Components.jl0 {
    public final /* synthetic */ org.telegram.ui.Components.vl0 a;
    public final /* synthetic */ d7 b;

    public c7(d7 d7Var, org.telegram.ui.Components.vl0 vl0Var) {
        this.b = d7Var;
        this.a = vl0Var;
    }

    @Override // org.telegram.ui.Components.jl0
    public final void d(int i10, View view) {
        r7 r7Var = this.b.d;
        org.telegram.ui.Components.vl0 vl0Var = this.a;
        e7 e7Var = (e7) vl0Var.getAdapter();
        l7 l7Var = (l7) e7Var.e.get(i10);
        if (view instanceof org.telegram.ui.Cells.u7) {
            r7.a(r7Var, l7Var, (n7) e7Var, vl0Var);
            return;
        }
        h7 h7Var = r7Var.v;
        if (h7Var != null) {
            h7Var.a0(l7Var.c, l7Var.d, false);
        }
    }
}
