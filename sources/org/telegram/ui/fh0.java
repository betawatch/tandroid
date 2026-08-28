package org.telegram.ui;

import android.content.Context;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class fh0 implements org.telegram.ui.Components.d80 {
    public final /* synthetic */ org.telegram.ui.Components.e80 a;
    public final /* synthetic */ gh0 b;

    public fh0(gh0 gh0Var, org.telegram.ui.Components.e80 e80Var) {
        this.b = gh0Var;
        this.a = e80Var;
    }

    @Override // org.telegram.ui.Components.d80
    public final void c() {
        hh0.V(this.b.d);
    }

    @Override // org.telegram.ui.Components.d80
    public final void j() {
        gh0 gh0Var = this.b;
        hh0 hh0Var = gh0Var.d;
        Context context = this.a.getContext();
        hh0 hh0Var2 = gh0Var.d;
        hh0Var.h0 = new org.telegram.ui.Components.a60(context, hh0Var2.e, hh0Var2.d, hh0Var2.g0, hh0Var2, hh0Var2.n, true, hh0Var2.h);
        gh0Var.d.h0.show();
    }

    @Override // org.telegram.ui.Components.d80
    public final /* synthetic */ void b() {
    }

    @Override // org.telegram.ui.Components.d80
    public final /* synthetic */ void k() {
    }
}
