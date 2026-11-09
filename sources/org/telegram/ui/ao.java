package org.telegram.ui;

import android.content.Context;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final class ao implements org.telegram.ui.Components.q70 {
    public final /* synthetic */ Context a;
    public final /* synthetic */ io b;

    public ao(io ioVar, Context context) {
        this.b = ioVar;
        this.a = context;
    }

    @Override // org.telegram.ui.Components.q70
    public final void e() {
        this.b.d0(true);
    }

    @Override // org.telegram.ui.Components.q70
    public final void f() {
        io ioVar = this.b;
        org.telegram.ui.Components.n50 n50Var = new org.telegram.ui.Components.n50(this.a, ioVar.l0, ioVar.Y, ioVar.o0, ioVar, ioVar.Z, true, org.telegram.messenger.t3.T(ioVar.X));
        io ioVar2 = this.b;
        ioVar2.p0 = n50Var;
        ioVar2.p0.show();
    }

    @Override // org.telegram.ui.Components.q70
    public final /* synthetic */ void d() {
    }

    @Override // org.telegram.ui.Components.q70
    public final /* synthetic */ void k() {
    }
}
