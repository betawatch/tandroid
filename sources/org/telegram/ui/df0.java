package org.telegram.ui;

import android.content.Context;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final class df0 implements org.telegram.ui.Components.d80 {
    public final /* synthetic */ org.telegram.ui.Components.e80 a;
    public final /* synthetic */ ef0 b;

    public df0(ef0 ef0Var, org.telegram.ui.Components.e80 e80Var) {
        this.b = ef0Var;
        this.a = e80Var;
    }

    @Override // org.telegram.ui.Components.d80
    public final void e() {
        ff0.b0(this.b.d);
    }

    @Override // org.telegram.ui.Components.d80
    public final void f() {
        ef0 ef0Var = this.b;
        ff0 ff0Var = ef0Var.d;
        Context context = this.a.getContext();
        ff0 ff0Var2 = ef0Var.d;
        ff0Var.m0 = new org.telegram.ui.Components.x50(context, ff0Var2.e, ff0Var2.d, ff0Var2.l0, ff0Var2, ff0Var2.n, true, ff0Var2.h);
        ef0Var.d.m0.show();
    }

    @Override // org.telegram.ui.Components.d80
    public final /* synthetic */ void d() {
    }

    @Override // org.telegram.ui.Components.d80
    public final /* synthetic */ void i() {
    }
}
