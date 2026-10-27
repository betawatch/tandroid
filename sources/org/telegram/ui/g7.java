package org.telegram.ui;

import android.view.View;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class g7 implements org.telegram.ui.Components.am0 {
    public final /* synthetic */ org.telegram.ui.Components.nm0 a;
    public final /* synthetic */ h7 b;

    public g7(h7 h7Var, org.telegram.ui.Components.nm0 nm0Var) {
        this.b = h7Var;
        this.a = nm0Var;
    }

    @Override // org.telegram.ui.Components.am0
    public final void c(int i10, View view) {
        x7 x7Var = this.b.f;
        org.telegram.ui.Components.nm0 nm0Var = this.a;
        j7 j7Var = (j7) nm0Var.getAdapter();
        q7 q7Var = (q7) j7Var.e.get(i10);
        if (view instanceof org.telegram.ui.Cells.w7) {
            x7.a(x7Var, q7Var, (s7) j7Var, nm0Var);
            return;
        }
        m7 m7Var = x7Var.F;
        if (m7Var != null) {
            m7Var.q(q7Var.c, q7Var.d, false);
        }
    }
}
