package org.telegram.ui;

import android.view.View;

/* compiled from: r8-map-id-8e647ea09dd204f7fa56b0790cd1c6c7931fe567b34678ab0d221a9ad6af8f53 */
/* loaded from: classes3.dex */
public final class e7 implements org.telegram.ui.Components.ml0 {
    public final /* synthetic */ org.telegram.ui.Components.zl0 a;
    public final /* synthetic */ f7 b;

    public e7(f7 f7Var, org.telegram.ui.Components.zl0 zl0Var) {
        this.b = f7Var;
        this.a = zl0Var;
    }

    @Override // org.telegram.ui.Components.ml0
    public final void d(int i10, View view) {
        v7 v7Var = this.b.f;
        org.telegram.ui.Components.zl0 zl0Var = this.a;
        h7 h7Var = (h7) zl0Var.getAdapter();
        o7 o7Var = (o7) h7Var.e.get(i10);
        if (view instanceof org.telegram.ui.Cells.t7) {
            v7.a(v7Var, o7Var, (q7) h7Var, zl0Var);
            return;
        }
        k7 k7Var = v7Var.E;
        if (k7Var != null) {
            k7Var.f(o7Var.c, o7Var.d, false);
        }
    }
}
