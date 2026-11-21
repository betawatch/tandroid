package org.telegram.ui;

import android.content.Context;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes3.dex */
public final class df0 implements org.telegram.ui.Components.f80 {
    public final /* synthetic */ org.telegram.ui.Components.g80 a;
    public final /* synthetic */ ef0 b;

    public df0(ef0 ef0Var, org.telegram.ui.Components.g80 g80Var) {
        this.b = ef0Var;
        this.a = g80Var;
    }

    @Override // org.telegram.ui.Components.f80
    public final void e() {
        ff0.b0(this.b.d);
    }

    @Override // org.telegram.ui.Components.f80
    public final void f() {
        ef0 ef0Var = this.b;
        ff0 ff0Var = ef0Var.d;
        Context context = this.a.getContext();
        ff0 ff0Var2 = ef0Var.d;
        ff0Var.m0 = new org.telegram.ui.Components.a60(context, ff0Var2.e, ff0Var2.d, ff0Var2.l0, ff0Var2, ff0Var2.n, true, ff0Var2.h);
        ef0Var.d.m0.show();
    }

    @Override // org.telegram.ui.Components.f80
    public final /* synthetic */ void d() {
    }

    @Override // org.telegram.ui.Components.f80
    public final /* synthetic */ void i() {
    }
}
