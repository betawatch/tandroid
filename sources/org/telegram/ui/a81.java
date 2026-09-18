package org.telegram.ui;

import android.view.View;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-33b1d79182603e8304c32e909c352797304d7e7816a08740f96af6cffe97caab */
/* loaded from: classes3.dex */
public final class a81 implements View.OnClickListener {
    public final /* synthetic */ c81 a;
    public final /* synthetic */ TLRPC.TL_authorization b;
    public final /* synthetic */ d81 c;

    public a81(d81 d81Var, c81 c81Var, TLRPC.TL_authorization tL_authorization) {
        this.c = d81Var;
        this.a = c81Var;
        this.b = tL_authorization;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        this.a.d.c(!r0.h, true);
        this.b.call_requests_disabled = !r4.d.h;
        d81.n(this.c);
    }
}
