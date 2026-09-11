package org.telegram.ui;

import android.view.View;

/* compiled from: r8-map-id-1181a9f210c4244598aa36bb39e1460f3842f305ed8c0c95af755ee091fedd7d */
/* loaded from: classes3.dex */
public final class d7 implements org.telegram.ui.Components.zk0 {
    public final /* synthetic */ org.telegram.ui.Components.ll0 a;
    public final /* synthetic */ e7 b;

    public d7(e7 e7Var, org.telegram.ui.Components.ll0 ll0Var) {
        this.b = e7Var;
        this.a = ll0Var;
    }

    @Override // org.telegram.ui.Components.zk0
    public final void a(int i10, View view) {
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
            i7Var.k1(m7Var.c, m7Var.d, false);
        }
    }
}
