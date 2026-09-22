package org.telegram.ui;

import android.view.View;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes3.dex */
public final class d7 implements org.telegram.ui.Components.zk0 {
    public final /* synthetic */ org.telegram.ui.Components.ll0 a;
    public final /* synthetic */ e7 b;

    public d7(e7 e7Var, org.telegram.ui.Components.ll0 ll0Var) {
        this.b = e7Var;
        this.a = ll0Var;
    }

    @Override // org.telegram.ui.Components.zk0
    public final void d(int i10, View view) {
        s7 s7Var = this.b.d;
        org.telegram.ui.Components.ll0 ll0Var = this.a;
        f7 f7Var = (f7) ll0Var.getAdapter();
        m7 m7Var = (m7) f7Var.e.get(i10);
        if (view instanceof org.telegram.ui.Cells.t7) {
            s7.a(s7Var, m7Var, (o7) f7Var, ll0Var);
            return;
        }
        i7 i7Var = s7Var.v;
        if (i7Var != null) {
            i7Var.H0(m7Var.c, m7Var.d, false);
        }
    }
}
