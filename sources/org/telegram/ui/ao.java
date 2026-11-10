package org.telegram.ui;

import android.content.Context;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class ao implements org.telegram.ui.Components.p70 {
    public final /* synthetic */ Context a;
    public final /* synthetic */ io b;

    public ao(io ioVar, Context context) {
        this.b = ioVar;
        this.a = context;
    }

    @Override // org.telegram.ui.Components.p70
    public final void e() {
        this.b.d0(true);
    }

    @Override // org.telegram.ui.Components.p70
    public final void f() {
        io ioVar = this.b;
        org.telegram.ui.Components.m50 m50Var = new org.telegram.ui.Components.m50(this.a, ioVar.l0, ioVar.Y, ioVar.o0, ioVar, ioVar.Z, true, org.telegram.messenger.t3.T(ioVar.X));
        io ioVar2 = this.b;
        ioVar2.p0 = m50Var;
        ioVar2.p0.show();
    }

    @Override // org.telegram.ui.Components.p70
    public final /* synthetic */ void d() {
    }

    @Override // org.telegram.ui.Components.p70
    public final /* synthetic */ void k() {
    }
}
