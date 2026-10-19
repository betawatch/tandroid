package org.telegram.ui;

import android.content.Context;

/* compiled from: r8-map-id-425f9d3693dca7cdb7b1343a62ca29dd4bfbf482fa37d742abbdfab31448a8bd */
/* loaded from: classes3.dex */
public final class gh0 implements org.telegram.ui.Components.p90 {
    public final /* synthetic */ org.telegram.ui.Components.q90 a;
    public final /* synthetic */ hh0 b;

    public gh0(hh0 hh0Var, org.telegram.ui.Components.q90 q90Var) {
        this.b = hh0Var;
        this.a = q90Var;
    }

    @Override // org.telegram.ui.Components.p90
    public final void d() {
        ih0.W(this.b.d);
    }

    @Override // org.telegram.ui.Components.p90
    public final void i() {
        hh0 hh0Var = this.b;
        ih0 ih0Var = hh0Var.d;
        Context context = this.a.getContext();
        ih0 ih0Var2 = hh0Var.d;
        ih0Var.l0 = new org.telegram.ui.Components.l70(context, ih0Var2.e, ih0Var2.d, ih0Var2.k0, ih0Var2, ih0Var2.n, true, ih0Var2.h);
        hh0Var.d.l0.show();
    }

    @Override // org.telegram.ui.Components.p90
    public final /* synthetic */ void c() {
    }

    @Override // org.telegram.ui.Components.p90
    public final /* synthetic */ void k() {
    }
}
