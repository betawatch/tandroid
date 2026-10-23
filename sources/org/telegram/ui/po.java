package org.telegram.ui;

import android.content.Context;
import org.telegram.messenger.ChatObject;

/* compiled from: r8-map-id-5c4d11c5a4a3c3963e49de090c9ebed761f6fe8b7d1fb1bb05822f03003d35b5 */
/* loaded from: classes3.dex */
public final class po implements org.telegram.ui.Components.p90 {
    public final /* synthetic */ Context a;
    public final /* synthetic */ wo b;

    public po(wo woVar, Context context) {
        this.b = woVar;
        this.a = context;
    }

    @Override // org.telegram.ui.Components.p90
    public final void d() {
        this.b.X(true);
    }

    @Override // org.telegram.ui.Components.p90
    public final void i() {
        wo woVar = this.b;
        org.telegram.ui.Components.l70 l70Var = new org.telegram.ui.Components.l70(this.a, woVar.l0, woVar.Y, woVar.o0, woVar, woVar.Z, true, ChatObject.isChannel(woVar.X));
        wo woVar2 = this.b;
        woVar2.p0 = l70Var;
        woVar2.p0.show();
    }

    @Override // org.telegram.ui.Components.p90
    public final /* synthetic */ void c() {
    }

    @Override // org.telegram.ui.Components.p90
    public final /* synthetic */ void k() {
    }
}
