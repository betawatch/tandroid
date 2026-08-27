package org.telegram.ui;

import android.content.Context;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class ih0 implements org.telegram.ui.Components.h80 {
    public final /* synthetic */ org.telegram.ui.Components.i80 a;
    public final /* synthetic */ jh0 b;

    public ih0(jh0 jh0Var, org.telegram.ui.Components.i80 i80Var) {
        this.b = jh0Var;
        this.a = i80Var;
    }

    @Override // org.telegram.ui.Components.h80
    public final void c() {
        kh0.W(this.b.d);
    }

    @Override // org.telegram.ui.Components.h80
    public final void g() {
        jh0 jh0Var = this.b;
        kh0 kh0Var = jh0Var.d;
        Context context = this.a.getContext();
        kh0 kh0Var2 = jh0Var.d;
        kh0Var.h0 = new org.telegram.ui.Components.f60(context, kh0Var2.e, kh0Var2.d, kh0Var2.g0, kh0Var2, kh0Var2.n, true, kh0Var2.h);
        jh0Var.d.h0.show();
    }

    @Override // org.telegram.ui.Components.h80
    public final /* synthetic */ void b() {
    }

    @Override // org.telegram.ui.Components.h80
    public final /* synthetic */ void k() {
    }
}
