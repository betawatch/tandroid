package org.telegram.ui;

import android.content.Context;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes3.dex */
public final class af0 implements org.telegram.ui.Components.p70 {
    public final /* synthetic */ org.telegram.ui.Components.q70 a;
    public final /* synthetic */ bf0 b;

    public af0(bf0 bf0Var, org.telegram.ui.Components.q70 q70Var) {
        this.b = bf0Var;
        this.a = q70Var;
    }

    @Override // org.telegram.ui.Components.p70
    public final void e() {
        cf0.b0(this.b.d);
    }

    @Override // org.telegram.ui.Components.p70
    public final void f() {
        bf0 bf0Var = this.b;
        cf0 cf0Var = bf0Var.d;
        Context context = this.a.getContext();
        cf0 cf0Var2 = bf0Var.d;
        cf0Var.l0 = new org.telegram.ui.Components.m50(context, cf0Var2.e, cf0Var2.d, cf0Var2.k0, cf0Var2, cf0Var2.n, true, cf0Var2.h);
        bf0Var.d.l0.show();
    }

    @Override // org.telegram.ui.Components.p70
    public final /* synthetic */ void d() {
    }

    @Override // org.telegram.ui.Components.p70
    public final /* synthetic */ void k() {
    }
}
