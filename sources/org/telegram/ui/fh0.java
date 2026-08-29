package org.telegram.ui;

import android.content.Context;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class fh0 implements org.telegram.ui.Components.q80 {
    public final /* synthetic */ org.telegram.ui.Components.r80 a;
    public final /* synthetic */ gh0 b;

    public fh0(gh0 gh0Var, org.telegram.ui.Components.r80 r80Var) {
        this.b = gh0Var;
        this.a = r80Var;
    }

    @Override // org.telegram.ui.Components.q80
    public final void b() {
        hh0.W(this.b.d);
    }

    @Override // org.telegram.ui.Components.q80
    public final void j() {
        gh0 gh0Var = this.b;
        hh0 hh0Var = gh0Var.d;
        Context context = this.a.getContext();
        hh0 hh0Var2 = gh0Var.d;
        hh0Var.h0 = new org.telegram.ui.Components.n60(context, hh0Var2.e, hh0Var2.d, hh0Var2.g0, hh0Var2, hh0Var2.n, true, hh0Var2.h);
        gh0Var.d.h0.show();
    }

    @Override // org.telegram.ui.Components.q80
    public final /* synthetic */ void a() {
    }

    @Override // org.telegram.ui.Components.q80
    public final /* synthetic */ void k() {
    }
}
