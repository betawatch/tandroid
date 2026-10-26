package org.telegram.ui;

import android.view.View;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final class g7 implements org.telegram.ui.Components.zl0 {
    public final /* synthetic */ org.telegram.ui.Components.mm0 a;
    public final /* synthetic */ h7 b;

    public g7(h7 h7Var, org.telegram.ui.Components.mm0 mm0Var) {
        this.b = h7Var;
        this.a = mm0Var;
    }

    @Override // org.telegram.ui.Components.zl0
    public final void c(int i10, View view) {
        x7 x7Var = this.b.f;
        org.telegram.ui.Components.mm0 mm0Var = this.a;
        j7 j7Var = (j7) mm0Var.getAdapter();
        q7 q7Var = (q7) j7Var.e.get(i10);
        if (view instanceof org.telegram.ui.Cells.w7) {
            x7.a(x7Var, q7Var, (s7) j7Var, mm0Var);
            return;
        }
        m7 m7Var = x7Var.F;
        if (m7Var != null) {
            m7Var.q(q7Var.c, q7Var.d, false);
        }
    }
}
