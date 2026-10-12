package org.telegram.ui;

import android.content.Context;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes3.dex */
public final class ci0 implements org.telegram.ui.Components.v90 {
    public final /* synthetic */ org.telegram.ui.Components.w90 a;
    public final /* synthetic */ di0 b;

    public ci0(di0 di0Var, org.telegram.ui.Components.w90 w90Var) {
        this.b = di0Var;
        this.a = w90Var;
    }

    @Override // org.telegram.ui.Components.v90
    public final void d() {
        ei0.W(this.b.d);
    }

    @Override // org.telegram.ui.Components.v90
    public final void h() {
        di0 di0Var = this.b;
        ei0 ei0Var = di0Var.d;
        Context context = this.a.getContext();
        ei0 ei0Var2 = di0Var.d;
        ei0Var.l0 = new org.telegram.ui.Components.p70(context, ei0Var2.e, ei0Var2.d, ei0Var2.k0, ei0Var2, ei0Var2.n, true, ei0Var2.h);
        di0Var.d.l0.show();
    }

    @Override // org.telegram.ui.Components.v90
    public final /* synthetic */ void c() {
    }

    @Override // org.telegram.ui.Components.v90
    public final /* synthetic */ void i() {
    }
}
