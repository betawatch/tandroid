package org.telegram.ui;

import android.content.Context;
import org.telegram.messenger.ChatObject;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final class dp implements org.telegram.ui.Components.u80 {
    public final /* synthetic */ Context a;
    public final /* synthetic */ kp b;

    public dp(kp kpVar, Context context) {
        this.b = kpVar;
        this.a = context;
    }

    @Override // org.telegram.ui.Components.u80
    public final void c() {
        this.b.X(true);
    }

    @Override // org.telegram.ui.Components.u80
    public final void i() {
        kp kpVar = this.b;
        org.telegram.ui.Components.r60 r60Var = new org.telegram.ui.Components.r60(this.a, kpVar.l0, kpVar.Y, kpVar.o0, kpVar, kpVar.Z, true, ChatObject.isChannel(kpVar.X));
        kp kpVar2 = this.b;
        kpVar2.p0 = r60Var;
        kpVar2.p0.show();
    }

    @Override // org.telegram.ui.Components.u80
    public final /* synthetic */ void a() {
    }

    @Override // org.telegram.ui.Components.u80
    public final /* synthetic */ void j() {
    }
}
