package org.telegram.ui;

import android.content.Context;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final class cf0 implements org.telegram.ui.Components.q70 {
    public final /* synthetic */ org.telegram.ui.Components.r70 a;
    public final /* synthetic */ df0 b;

    public cf0(df0 df0Var, org.telegram.ui.Components.r70 r70Var) {
        this.b = df0Var;
        this.a = r70Var;
    }

    @Override // org.telegram.ui.Components.q70
    public final void e() {
        ef0.b0(this.b.d);
    }

    @Override // org.telegram.ui.Components.q70
    public final void f() {
        df0 df0Var = this.b;
        ef0 ef0Var = df0Var.d;
        Context context = this.a.getContext();
        ef0 ef0Var2 = df0Var.d;
        ef0Var.l0 = new org.telegram.ui.Components.n50(context, ef0Var2.e, ef0Var2.d, ef0Var2.k0, ef0Var2, ef0Var2.n, true, ef0Var2.h);
        df0Var.d.l0.show();
    }

    @Override // org.telegram.ui.Components.q70
    public final /* synthetic */ void d() {
    }

    @Override // org.telegram.ui.Components.q70
    public final /* synthetic */ void k() {
    }
}
