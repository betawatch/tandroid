package org.telegram.ui;

import android.view.View;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.Switch;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes3.dex */
public final class k21 implements View.OnClickListener {
    public final /* synthetic */ org.telegram.ui.Components.vg a;
    public final /* synthetic */ TLRPC.TL_authorization b;
    public final /* synthetic */ n21 c;

    public k21(n21 n21Var, org.telegram.ui.Components.vg vgVar, TLRPC.TL_authorization tL_authorization) {
        this.c = n21Var;
        this.a = vgVar;
        this.b = tL_authorization;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        ((Switch) this.a.f).c(!r0.h, true);
        this.b.encrypted_requests_disabled = !((Switch) r4.f).h;
        n21.K0(this.c);
    }
}
