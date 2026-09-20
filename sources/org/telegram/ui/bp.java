package org.telegram.ui;

import android.content.Context;
import org.telegram.messenger.ChatObject;

/* compiled from: r8-map-id-eaaffe05e5b4975c35db95ddc7f057e1a9a0a254a43fe066fa0ad675f8b3973e */
/* loaded from: classes3.dex */
public final class bp implements org.telegram.ui.Components.c90 {
    public final /* synthetic */ Context a;
    public final /* synthetic */ ip b;

    public bp(ip ipVar, Context context) {
        this.b = ipVar;
        this.a = context;
    }

    @Override // org.telegram.ui.Components.c90
    public final void e() {
        this.b.X(true);
    }

    @Override // org.telegram.ui.Components.c90
    public final void h() {
        ip ipVar = this.b;
        org.telegram.ui.Components.z60 z60Var = new org.telegram.ui.Components.z60(this.a, ipVar.l0, ipVar.Y, ipVar.o0, ipVar, ipVar.Z, true, ChatObject.isChannel(ipVar.X));
        ip ipVar2 = this.b;
        ipVar2.p0 = z60Var;
        ipVar2.p0.show();
    }

    @Override // org.telegram.ui.Components.c90
    public final /* synthetic */ void c() {
    }

    @Override // org.telegram.ui.Components.c90
    public final /* synthetic */ void i() {
    }
}
