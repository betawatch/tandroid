package org.telegram.ui;

import android.view.View;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.Switch;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes3.dex */
public final class j21 implements View.OnClickListener {
    public final /* synthetic */ org.telegram.ui.Components.eg a;
    public final /* synthetic */ TLRPC.TL_authorization b;
    public final /* synthetic */ l21 c;

    public j21(l21 l21Var, org.telegram.ui.Components.eg egVar, TLRPC.TL_authorization tL_authorization) {
        this.c = l21Var;
        this.a = egVar;
        this.b = tL_authorization;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        ((Switch) this.a.f).c(!r0.h, true);
        this.b.call_requests_disabled = !((Switch) r4.f).h;
        l21.J0(this.c);
    }
}
