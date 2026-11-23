package org.telegram.ui;

import android.content.Context;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final class cf0 implements org.telegram.ui.Components.c80 {
    public final /* synthetic */ org.telegram.ui.Components.d80 a;
    public final /* synthetic */ df0 b;

    public cf0(df0 df0Var, org.telegram.ui.Components.d80 d80Var) {
        this.b = df0Var;
        this.a = d80Var;
    }

    @Override // org.telegram.ui.Components.c80
    public final void e() {
        ef0.b0(this.b.d);
    }

    @Override // org.telegram.ui.Components.c80
    public final void g() {
        df0 df0Var = this.b;
        ef0 ef0Var = df0Var.d;
        Context context = this.a.getContext();
        ef0 ef0Var2 = df0Var.d;
        ef0Var.m0 = new org.telegram.ui.Components.x50(context, ef0Var2.e, ef0Var2.d, ef0Var2.l0, ef0Var2, ef0Var2.n, true, ef0Var2.h);
        df0Var.d.m0.show();
    }

    @Override // org.telegram.ui.Components.c80
    public final /* synthetic */ void d() {
    }

    @Override // org.telegram.ui.Components.c80
    public final /* synthetic */ void j() {
    }
}
