package org.telegram.ui;

import android.view.View;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.Switch;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class a41 implements View.OnClickListener {
    public final /* synthetic */ org.telegram.ui.Components.ag a;
    public final /* synthetic */ TLRPC.TL_authorization b;
    public final /* synthetic */ c41 c;

    public a41(c41 c41Var, org.telegram.ui.Components.ag agVar, TLRPC.TL_authorization tL_authorization) {
        this.c = c41Var;
        this.a = agVar;
        this.b = tL_authorization;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        ((Switch) this.a.f).c(!r0.h, true);
        this.b.call_requests_disabled = !((Switch) r4.f).h;
        c41.J0(this.c);
    }
}
