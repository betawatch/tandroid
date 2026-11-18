package org.telegram.ui;

import android.view.View;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.Switch;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final class j21 implements View.OnClickListener {
    public final /* synthetic */ org.telegram.ui.Components.tg a;
    public final /* synthetic */ TLRPC.TL_authorization b;
    public final /* synthetic */ m21 c;

    public j21(m21 m21Var, org.telegram.ui.Components.tg tgVar, TLRPC.TL_authorization tL_authorization) {
        this.c = m21Var;
        this.a = tgVar;
        this.b = tL_authorization;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        ((Switch) this.a.f).c(!r0.h, true);
        this.b.encrypted_requests_disabled = !((Switch) r4.f).h;
        m21.K0(this.c);
    }
}
