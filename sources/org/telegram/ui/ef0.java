package org.telegram.ui;

import android.content.Context;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes3.dex */
public final class ef0 implements org.telegram.ui.Components.d80 {
    public final /* synthetic */ org.telegram.ui.Components.e80 a;
    public final /* synthetic */ ff0 b;

    public ef0(ff0 ff0Var, org.telegram.ui.Components.e80 e80Var) {
        this.b = ff0Var;
        this.a = e80Var;
    }

    @Override // org.telegram.ui.Components.d80
    public final void e() {
        gf0.b0(this.b.d);
    }

    @Override // org.telegram.ui.Components.d80
    public final void f() {
        ff0 ff0Var = this.b;
        gf0 gf0Var = ff0Var.d;
        Context context = this.a.getContext();
        gf0 gf0Var2 = ff0Var.d;
        gf0Var.m0 = new org.telegram.ui.Components.x50(context, gf0Var2.e, gf0Var2.d, gf0Var2.l0, gf0Var2, gf0Var2.n, true, gf0Var2.h);
        ff0Var.d.m0.show();
    }

    @Override // org.telegram.ui.Components.d80
    public final /* synthetic */ void d() {
    }

    @Override // org.telegram.ui.Components.d80
    public final /* synthetic */ void i() {
    }
}
