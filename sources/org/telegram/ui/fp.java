package org.telegram.ui;

import android.content.Context;
import org.telegram.messenger.ChatObject;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final class fp implements org.telegram.ui.Components.e90 {
    public final /* synthetic */ Context a;
    public final /* synthetic */ mp b;

    public fp(mp mpVar, Context context) {
        this.b = mpVar;
        this.a = context;
    }

    @Override // org.telegram.ui.Components.e90
    public final void e() {
        this.b.X(true);
    }

    @Override // org.telegram.ui.Components.e90
    public final void i() {
        mp mpVar = this.b;
        org.telegram.ui.Components.a70 a70Var = new org.telegram.ui.Components.a70(this.a, mpVar.l0, mpVar.Y, mpVar.o0, mpVar, mpVar.Z, true, ChatObject.isChannel(mpVar.X));
        mp mpVar2 = this.b;
        mpVar2.p0 = a70Var;
        mpVar2.p0.show();
    }

    @Override // org.telegram.ui.Components.e90
    public final /* synthetic */ void c() {
    }

    @Override // org.telegram.ui.Components.e90
    public final /* synthetic */ void j() {
    }
}
