package org.telegram.ui;

import android.content.Context;
import org.telegram.messenger.ChatObject;

/* compiled from: r8-map-id-c0e607070f32dbde65005355ff6c489b77f9395a3e0f8720848e2402860dea84 */
/* loaded from: classes3.dex */
public final class bp implements org.telegram.ui.Components.d90 {
    public final /* synthetic */ Context a;
    public final /* synthetic */ ip b;

    public bp(ip ipVar, Context context) {
        this.b = ipVar;
        this.a = context;
    }

    @Override // org.telegram.ui.Components.d90
    public final void e() {
        this.b.X(true);
    }

    @Override // org.telegram.ui.Components.d90
    public final void j() {
        ip ipVar = this.b;
        org.telegram.ui.Components.a70 a70Var = new org.telegram.ui.Components.a70(this.a, ipVar.l0, ipVar.Y, ipVar.o0, ipVar, ipVar.Z, true, ChatObject.isChannel(ipVar.X));
        ip ipVar2 = this.b;
        ipVar2.p0 = a70Var;
        ipVar2.p0.show();
    }

    @Override // org.telegram.ui.Components.d90
    public final /* synthetic */ void c() {
    }

    @Override // org.telegram.ui.Components.d90
    public final /* synthetic */ void k() {
    }
}
