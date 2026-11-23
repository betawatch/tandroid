package org.telegram.ui;

import android.content.Context;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes3.dex */
public final class bo implements org.telegram.ui.Components.f80 {
    public final /* synthetic */ Context a;
    public final /* synthetic */ jo b;

    public bo(jo joVar, Context context) {
        this.b = joVar;
        this.a = context;
    }

    @Override // org.telegram.ui.Components.f80
    public final void e() {
        this.b.d0(true);
    }

    @Override // org.telegram.ui.Components.f80
    public final void f() {
        jo joVar = this.b;
        org.telegram.ui.Components.a60 a60Var = new org.telegram.ui.Components.a60(this.a, joVar.m0, joVar.Z, joVar.p0, joVar, joVar.a0, true, org.telegram.messenger.v3.T(joVar.Y));
        jo joVar2 = this.b;
        joVar2.q0 = a60Var;
        joVar2.q0.show();
    }

    @Override // org.telegram.ui.Components.f80
    public final /* synthetic */ void d() {
    }

    @Override // org.telegram.ui.Components.f80
    public final /* synthetic */ void i() {
    }
}
