package org.telegram.ui;

import android.view.View;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class b7 implements org.telegram.ui.Components.zk0 {
    public final /* synthetic */ org.telegram.ui.Components.jl0 a;
    public final /* synthetic */ c7 b;

    public b7(c7 c7Var, org.telegram.ui.Components.jl0 jl0Var) {
        this.b = c7Var;
        this.a = jl0Var;
    }

    @Override // org.telegram.ui.Components.zk0
    public final void c(int i10, View view) {
        q7 q7Var = this.b.d;
        org.telegram.ui.Components.jl0 jl0Var = this.a;
        d7 d7Var = (d7) jl0Var.getAdapter();
        k7 k7Var = (k7) d7Var.e.get(i10);
        if (view instanceof org.telegram.ui.Cells.p7) {
            q7.a(q7Var, k7Var, (m7) d7Var, jl0Var);
            return;
        }
        g7 g7Var = q7Var.v;
        if (g7Var != null) {
            g7Var.O0(k7Var.c, k7Var.d, false);
        }
    }
}
