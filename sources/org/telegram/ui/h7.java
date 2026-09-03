package org.telegram.ui;

import android.view.View;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class h7 implements org.telegram.ui.Components.hl0 {
    public final /* synthetic */ org.telegram.ui.Components.rl0 a;
    public final /* synthetic */ i7 b;

    public h7(i7 i7Var, org.telegram.ui.Components.rl0 rl0Var) {
        this.b = i7Var;
        this.a = rl0Var;
    }

    @Override // org.telegram.ui.Components.hl0
    public final void d(int i10, View view) {
        w7 w7Var = this.b.d;
        org.telegram.ui.Components.rl0 rl0Var = this.a;
        j7 j7Var = (j7) rl0Var.getAdapter();
        q7 q7Var = (q7) j7Var.e.get(i10);
        if (view instanceof org.telegram.ui.Cells.q7) {
            w7.a(w7Var, q7Var, (s7) j7Var, rl0Var);
            return;
        }
        m7 m7Var = w7Var.v;
        if (m7Var != null) {
            m7Var.r(q7Var.c, q7Var.d, false);
        }
    }
}
