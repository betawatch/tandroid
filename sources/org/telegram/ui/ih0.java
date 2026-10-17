package org.telegram.ui;

import android.content.Context;

/* compiled from: r8-map-id-189a3a12219b7c214453a48fa9697387dfb8b2ca31ce3a2eba70ff5e2610a248 */
/* loaded from: classes3.dex */
public final class ih0 implements org.telegram.ui.Components.p90 {
    public final /* synthetic */ org.telegram.ui.Components.q90 a;
    public final /* synthetic */ jh0 b;

    public ih0(jh0 jh0Var, org.telegram.ui.Components.q90 q90Var) {
        this.b = jh0Var;
        this.a = q90Var;
    }

    @Override // org.telegram.ui.Components.p90
    public final void d() {
        kh0.W(this.b.d);
    }

    @Override // org.telegram.ui.Components.p90
    public final void i() {
        jh0 jh0Var = this.b;
        kh0 kh0Var = jh0Var.d;
        Context context = this.a.getContext();
        kh0 kh0Var2 = jh0Var.d;
        kh0Var.l0 = new org.telegram.ui.Components.l70(context, kh0Var2.e, kh0Var2.d, kh0Var2.k0, kh0Var2, kh0Var2.n, true, kh0Var2.h);
        jh0Var.d.l0.show();
    }

    @Override // org.telegram.ui.Components.p90
    public final /* synthetic */ void c() {
    }

    @Override // org.telegram.ui.Components.p90
    public final /* synthetic */ void k() {
    }
}
