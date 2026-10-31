package org.telegram.ui;

import android.content.Context;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class ig0 implements org.telegram.ui.Components.i80 {
    public final /* synthetic */ org.telegram.ui.Components.j80 a;
    public final /* synthetic */ jg0 b;

    public ig0(jg0 jg0Var, org.telegram.ui.Components.j80 j80Var) {
        this.b = jg0Var;
        this.a = j80Var;
    }

    @Override // org.telegram.ui.Components.i80
    public final void d() {
        kg0.a0(this.b.d);
    }

    @Override // org.telegram.ui.Components.i80
    public final void g() {
        jg0 jg0Var = this.b;
        kg0 kg0Var = jg0Var.d;
        Context context = this.a.getContext();
        kg0 kg0Var2 = jg0Var.d;
        kg0Var.l0 = new org.telegram.ui.Components.c60(context, kg0Var2.e, kg0Var2.d, kg0Var2.k0, kg0Var2, kg0Var2.n, true, kg0Var2.h);
        jg0Var.d.l0.show();
    }

    @Override // org.telegram.ui.Components.i80
    public final /* synthetic */ void b() {
    }

    @Override // org.telegram.ui.Components.i80
    public final /* synthetic */ void n() {
    }
}
