package org.telegram.ui;

import android.view.View;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.Switch;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class l21 implements View.OnClickListener {
    public final /* synthetic */ org.telegram.ui.Components.dg a;
    public final /* synthetic */ TLRPC.TL_authorization b;
    public final /* synthetic */ o21 c;

    public l21(o21 o21Var, org.telegram.ui.Components.dg dgVar, TLRPC.TL_authorization tL_authorization) {
        this.c = o21Var;
        this.a = dgVar;
        this.b = tL_authorization;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        ((Switch) this.a.f).c(!r0.h, true);
        this.b.encrypted_requests_disabled = !((Switch) r4.f).h;
        o21.J0(this.c);
    }
}
