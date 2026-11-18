package org.telegram.ui;

import android.content.Context;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final class bo implements org.telegram.ui.Components.d80 {
    public final /* synthetic */ Context a;
    public final /* synthetic */ jo b;

    public bo(jo joVar, Context context) {
        this.b = joVar;
        this.a = context;
    }

    @Override // org.telegram.ui.Components.d80
    public final void e() {
        this.b.d0(true);
    }

    @Override // org.telegram.ui.Components.d80
    public final void f() {
        jo joVar = this.b;
        org.telegram.ui.Components.x50 x50Var = new org.telegram.ui.Components.x50(this.a, joVar.m0, joVar.Z, joVar.p0, joVar, joVar.a0, true, org.telegram.messenger.v3.T(joVar.Y));
        jo joVar2 = this.b;
        joVar2.q0 = x50Var;
        joVar2.q0.show();
    }

    @Override // org.telegram.ui.Components.d80
    public final /* synthetic */ void d() {
    }

    @Override // org.telegram.ui.Components.d80
    public final /* synthetic */ void i() {
    }
}
