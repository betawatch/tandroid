package org.telegram.ui;

import android.content.Context;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final class hh0 implements org.telegram.ui.Components.q90 {
    public final /* synthetic */ org.telegram.ui.Components.r90 a;
    public final /* synthetic */ ih0 b;

    public hh0(ih0 ih0Var, org.telegram.ui.Components.r90 r90Var) {
        this.b = ih0Var;
        this.a = r90Var;
    }

    @Override // org.telegram.ui.Components.q90
    public final void d() {
        jh0.X(this.b.d);
    }

    @Override // org.telegram.ui.Components.q90
    public final void e() {
        ih0 ih0Var = this.b;
        jh0 jh0Var = ih0Var.d;
        Context context = this.a.getContext();
        jh0 jh0Var2 = ih0Var.d;
        jh0Var.l0 = new org.telegram.ui.Components.n70(context, jh0Var2.e, jh0Var2.d, jh0Var2.k0, jh0Var2, jh0Var2.n, true, jh0Var2.h);
        ih0Var.d.l0.show();
    }

    @Override // org.telegram.ui.Components.q90
    public final /* synthetic */ void a() {
    }

    @Override // org.telegram.ui.Components.q90
    public final /* synthetic */ void k() {
    }
}
