package org.telegram.ui;

import android.content.Context;

/* compiled from: r8-map-id-bcc7d273da888d5c27994201329e5b838e55754b73312241608ee42846efd426 */
/* loaded from: classes3.dex */
public final class hh0 implements org.telegram.ui.Components.p90 {
    public final /* synthetic */ org.telegram.ui.Components.q90 a;
    public final /* synthetic */ ih0 b;

    public hh0(ih0 ih0Var, org.telegram.ui.Components.q90 q90Var) {
        this.b = ih0Var;
        this.a = q90Var;
    }

    @Override // org.telegram.ui.Components.p90
    public final void d() {
        jh0.W(this.b.d);
    }

    @Override // org.telegram.ui.Components.p90
    public final void i() {
        ih0 ih0Var = this.b;
        jh0 jh0Var = ih0Var.d;
        Context context = this.a.getContext();
        jh0 jh0Var2 = ih0Var.d;
        jh0Var.l0 = new org.telegram.ui.Components.l70(context, jh0Var2.e, jh0Var2.d, jh0Var2.k0, jh0Var2, jh0Var2.n, true, jh0Var2.h);
        ih0Var.d.l0.show();
    }

    @Override // org.telegram.ui.Components.p90
    public final /* synthetic */ void c() {
    }

    @Override // org.telegram.ui.Components.p90
    public final /* synthetic */ void k() {
    }
}
