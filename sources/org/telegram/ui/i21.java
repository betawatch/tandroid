package org.telegram.ui;

import android.view.View;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.Switch;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
/* loaded from: classes3.dex */
public final class i21 implements View.OnClickListener {
    public final /* synthetic */ org.telegram.ui.Components.eg a;
    public final /* synthetic */ TLRPC.TL_authorization b;
    public final /* synthetic */ l21 c;

    public i21(l21 l21Var, org.telegram.ui.Components.eg egVar, TLRPC.TL_authorization tL_authorization) {
        this.c = l21Var;
        this.a = egVar;
        this.b = tL_authorization;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        ((Switch) this.a.f).c(!r0.h, true);
        this.b.encrypted_requests_disabled = !((Switch) r4.f).h;
        l21.J0(this.c);
    }
}
