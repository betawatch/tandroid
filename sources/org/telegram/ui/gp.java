package org.telegram.ui;

import android.content.Context;
import org.telegram.messenger.ChatObject;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes3.dex */
public final class gp implements org.telegram.ui.Components.v90 {
    public final /* synthetic */ Context a;
    public final /* synthetic */ np b;

    public gp(np npVar, Context context) {
        this.b = npVar;
        this.a = context;
    }

    @Override // org.telegram.ui.Components.v90
    public final void d() {
        this.b.X(true);
    }

    @Override // org.telegram.ui.Components.v90
    public final void i() {
        np npVar = this.b;
        org.telegram.ui.Components.p70 p70Var = new org.telegram.ui.Components.p70(this.a, npVar.l0, npVar.Y, npVar.o0, npVar, npVar.Z, true, ChatObject.isChannel(npVar.X));
        np npVar2 = this.b;
        npVar2.p0 = p70Var;
        npVar2.p0.show();
    }

    @Override // org.telegram.ui.Components.v90
    public final /* synthetic */ void c() {
    }

    @Override // org.telegram.ui.Components.v90
    public final /* synthetic */ void j() {
    }
}
