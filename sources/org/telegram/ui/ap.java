package org.telegram.ui;

import android.content.Context;
import org.telegram.messenger.ChatObject;

/* compiled from: r8-map-id-8e647ea09dd204f7fa56b0790cd1c6c7931fe567b34678ab0d221a9ad6af8f53 */
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
        org.telegram.ui.Components.f70 f70Var = new org.telegram.ui.Components.f70(this.a, hpVar.m0, hpVar.Z, hpVar.p0, hpVar, hpVar.a0, true, ChatObject.isChannel(hpVar.Y));
        hp hpVar2 = this.b;
        hpVar2.q0 = f70Var;
        hpVar2.q0.show();
    }

    @Override // org.telegram.ui.Components.i90
    public final /* synthetic */ void b() {
    }

    @Override // org.telegram.ui.Components.i90
    public final /* synthetic */ void i() {
    }
}
