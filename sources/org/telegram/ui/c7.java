package org.telegram.ui;

import android.view.View;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final class c7 implements org.telegram.ui.Components.gj0 {
    public final /* synthetic */ org.telegram.ui.Components.uj0 a;
    public final /* synthetic */ d7 b;

    public c7(d7 d7Var, org.telegram.ui.Components.uj0 uj0Var) {
        this.b = d7Var;
        this.a = uj0Var;
    }

    @Override // org.telegram.ui.Components.gj0
    public final void b(int i7, View view) {
        t7 t7Var = this.b.f;
        org.telegram.ui.Components.uj0 uj0Var = this.a;
        f7 f7Var = (f7) uj0Var.getAdapter();
        m7 m7Var = (m7) f7Var.e.get(i7);
        if (view instanceof org.telegram.ui.Cells.n7) {
            t7.a(t7Var, m7Var, (o7) f7Var, uj0Var);
            return;
        }
        i7 i7Var = t7Var.G;
        if (i7Var != null) {
            i7Var.N(m7Var.c, m7Var.d, false);
        }
    }
}
