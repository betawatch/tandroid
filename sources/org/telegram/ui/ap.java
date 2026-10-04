package org.telegram.ui;

import android.content.Context;
import org.telegram.messenger.ChatObject;

/* compiled from: r8-map-id-90c74b6d1af88fe423a82a48cb36c0781986d7c98a26085f38aeb2edc71128ad */
/* loaded from: classes3.dex */
public final class ap implements org.telegram.ui.Components.i90 {
    public final /* synthetic */ Context a;
    public final /* synthetic */ hp b;

    public ap(hp hpVar, Context context) {
        this.b = hpVar;
        this.a = context;
    }

    @Override // org.telegram.ui.Components.i90
    public final void c() {
        this.b.W(true);
    }

    @Override // org.telegram.ui.Components.i90
    public final void h() {
        hp hpVar = this.b;
        org.telegram.ui.Components.f70 f70Var = new org.telegram.ui.Components.f70(this.a, hpVar.l0, hpVar.Y, hpVar.o0, hpVar, hpVar.Z, true, ChatObject.isChannel(hpVar.X));
        hp hpVar2 = this.b;
        hpVar2.p0 = f70Var;
        hpVar2.p0.show();
    }

    @Override // org.telegram.ui.Components.i90
    public final /* synthetic */ void b() {
    }

    @Override // org.telegram.ui.Components.i90
    public final /* synthetic */ void i() {
    }
}
