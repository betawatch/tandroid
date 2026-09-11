package org.telegram.ui;

import android.content.Context;
import org.telegram.messenger.ChatObject;

/* compiled from: r8-map-id-1181a9f210c4244598aa36bb39e1460f3842f305ed8c0c95af755ee091fedd7d */
/* loaded from: classes3.dex */
public final class ep implements org.telegram.ui.Components.v80 {
    public final /* synthetic */ Context a;
    public final /* synthetic */ lp b;

    public ep(lp lpVar, Context context) {
        this.b = lpVar;
        this.a = context;
    }

    @Override // org.telegram.ui.Components.v80
    public final void c() {
        this.b.X(true);
    }

    @Override // org.telegram.ui.Components.v80
    public final void d() {
        lp lpVar = this.b;
        org.telegram.ui.Components.r60 r60Var = new org.telegram.ui.Components.r60(this.a, lpVar.l0, lpVar.Y, lpVar.o0, lpVar, lpVar.Z, true, ChatObject.isChannel(lpVar.X));
        lp lpVar2 = this.b;
        lpVar2.p0 = r60Var;
        lpVar2.p0.show();
    }

    @Override // org.telegram.ui.Components.v80
    public final /* synthetic */ void b() {
    }

    @Override // org.telegram.ui.Components.v80
    public final /* synthetic */ void j() {
    }
}
