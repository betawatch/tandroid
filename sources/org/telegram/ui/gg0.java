package org.telegram.ui;

import android.content.Context;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final class gg0 implements org.telegram.ui.Components.i80 {
    public final /* synthetic */ org.telegram.ui.Components.j80 a;
    public final /* synthetic */ hg0 b;

    public gg0(hg0 hg0Var, org.telegram.ui.Components.j80 j80Var) {
        this.b = hg0Var;
        this.a = j80Var;
    }

    @Override // org.telegram.ui.Components.i80
    public final void d() {
        ig0.b0(this.b.d);
    }

    @Override // org.telegram.ui.Components.i80
    public final void g() {
        hg0 hg0Var = this.b;
        ig0 ig0Var = hg0Var.d;
        Context context = this.a.getContext();
        ig0 ig0Var2 = hg0Var.d;
        ig0Var.l0 = new org.telegram.ui.Components.c60(context, ig0Var2.e, ig0Var2.d, ig0Var2.k0, ig0Var2, ig0Var2.n, true, ig0Var2.h);
        hg0Var.d.l0.show();
    }

    @Override // org.telegram.ui.Components.i80
    public final /* synthetic */ void b() {
    }

    @Override // org.telegram.ui.Components.i80
    public final /* synthetic */ void n() {
    }
}
