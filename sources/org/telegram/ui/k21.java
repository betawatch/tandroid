package org.telegram.ui;

import android.view.View;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.Switch;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes3.dex */
public final class k21 implements View.OnClickListener {
    public final /* synthetic */ org.telegram.ui.Components.tg a;
    public final /* synthetic */ TLRPC.TL_authorization b;
    public final /* synthetic */ m21 c;

    public k21(m21 m21Var, org.telegram.ui.Components.tg tgVar, TLRPC.TL_authorization tL_authorization) {
        this.c = m21Var;
        this.a = tgVar;
        this.b = tL_authorization;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        ((Switch) this.a.f).c(!r0.h, true);
        this.b.call_requests_disabled = !((Switch) r4.f).h;
        m21.K0(this.c);
    }
}
