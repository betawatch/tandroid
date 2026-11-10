package org.telegram.ui;

import android.content.Context;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class df0 implements org.telegram.ui.Components.p70 {
    public final /* synthetic */ org.telegram.ui.Components.q70 a;
    public final /* synthetic */ ef0 b;

    public df0(ef0 ef0Var, org.telegram.ui.Components.q70 q70Var) {
        this.b = ef0Var;
        this.a = q70Var;
    }

    @Override // org.telegram.ui.Components.p70
    public final void e() {
        ff0.b0(this.b.d);
    }

    @Override // org.telegram.ui.Components.p70
    public final void f() {
        ef0 ef0Var = this.b;
        ff0 ff0Var = ef0Var.d;
        Context context = this.a.getContext();
        ff0 ff0Var2 = ef0Var.d;
        ff0Var.l0 = new org.telegram.ui.Components.m50(context, ff0Var2.e, ff0Var2.d, ff0Var2.k0, ff0Var2, ff0Var2.n, true, ff0Var2.h);
        ef0Var.d.l0.show();
    }

    @Override // org.telegram.ui.Components.p70
    public final /* synthetic */ void d() {
    }

    @Override // org.telegram.ui.Components.p70
    public final /* synthetic */ void k() {
    }
}
