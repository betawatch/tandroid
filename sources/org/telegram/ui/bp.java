package org.telegram.ui;

import android.content.Context;
import org.telegram.messenger.ChatObject;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
/* loaded from: classes3.dex */
public final class bp implements org.telegram.ui.Components.f90 {
    public final /* synthetic */ Context a;
    public final /* synthetic */ ip b;

    public bp(ip ipVar, Context context) {
        this.b = ipVar;
        this.a = context;
    }

    @Override // org.telegram.ui.Components.f90
    public final void c() {
        this.b.X(true);
    }

    @Override // org.telegram.ui.Components.f90
    public final void h() {
        ip ipVar = this.b;
        org.telegram.ui.Components.c70 c70Var = new org.telegram.ui.Components.c70(this.a, ipVar.l0, ipVar.Y, ipVar.o0, ipVar, ipVar.Z, true, ChatObject.isChannel(ipVar.X));
        ip ipVar2 = this.b;
        ipVar2.p0 = c70Var;
        ipVar2.p0.show();
    }

    @Override // org.telegram.ui.Components.f90
    public final /* synthetic */ void a() {
    }

    @Override // org.telegram.ui.Components.f90
    public final /* synthetic */ void i() {
    }
}
