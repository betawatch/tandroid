package org.telegram.ui;

import android.content.Context;
import org.telegram.messenger.ChatObject;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class oo implements org.telegram.ui.Components.d80 {
    public final /* synthetic */ Context a;
    public final /* synthetic */ vo b;

    public oo(vo voVar, Context context) {
        this.b = voVar;
        this.a = context;
    }

    @Override // org.telegram.ui.Components.d80
    public final void c() {
        this.b.W(true);
    }

    @Override // org.telegram.ui.Components.d80
    public final void j() {
        vo voVar = this.b;
        org.telegram.ui.Components.a60 a60Var = new org.telegram.ui.Components.a60(this.a, voVar.h0, voVar.U, voVar.k0, voVar, voVar.V, true, ChatObject.isChannel(voVar.T));
        vo voVar2 = this.b;
        voVar2.l0 = a60Var;
        voVar2.l0.show();
    }

    @Override // org.telegram.ui.Components.d80
    public final /* synthetic */ void b() {
    }

    @Override // org.telegram.ui.Components.d80
    public final /* synthetic */ void k() {
    }
}
