package org.telegram.ui;

import android.content.Context;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final class ao implements org.telegram.ui.Components.c80 {
    public final /* synthetic */ Context a;
    public final /* synthetic */ io b;

    public ao(io ioVar, Context context) {
        this.b = ioVar;
        this.a = context;
    }

    @Override // org.telegram.ui.Components.c80
    public final void e() {
        this.b.d0(true);
    }

    @Override // org.telegram.ui.Components.c80
    public final void g() {
        io ioVar = this.b;
        org.telegram.ui.Components.x50 x50Var = new org.telegram.ui.Components.x50(this.a, ioVar.m0, ioVar.Z, ioVar.p0, ioVar, ioVar.a0, true, org.telegram.messenger.v3.T(ioVar.Y));
        io ioVar2 = this.b;
        ioVar2.q0 = x50Var;
        ioVar2.q0.show();
    }

    @Override // org.telegram.ui.Components.c80
    public final /* synthetic */ void d() {
    }

    @Override // org.telegram.ui.Components.c80
    public final /* synthetic */ void j() {
    }
}
