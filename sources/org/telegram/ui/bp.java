package org.telegram.ui;

import android.content.Context;
import org.telegram.messenger.ChatObject;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final class bp implements org.telegram.ui.Components.w90 {
    public final /* synthetic */ Context a;
    public final /* synthetic */ ip b;

    public bp(ip ipVar, Context context) {
        this.b = ipVar;
        this.a = context;
    }

    @Override // org.telegram.ui.Components.w90
    public final void c() {
        this.b.X(true);
    }

    @Override // org.telegram.ui.Components.w90
    public final void i() {
        ip ipVar = this.b;
        org.telegram.ui.Components.t70 t70Var = new org.telegram.ui.Components.t70(this.a, ipVar.l0, ipVar.Y, ipVar.o0, ipVar, ipVar.Z, true, ChatObject.isChannel(ipVar.X));
        ip ipVar2 = this.b;
        ipVar2.p0 = t70Var;
        ipVar2.p0.show();
    }

    @Override // org.telegram.ui.Components.w90
    public final /* synthetic */ void a() {
    }

    @Override // org.telegram.ui.Components.w90
    public final /* synthetic */ void j() {
    }
}
