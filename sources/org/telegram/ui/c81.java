package org.telegram.ui;

import android.view.View;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final class c81 implements View.OnClickListener {
    public final /* synthetic */ e81 a;
    public final /* synthetic */ TLRPC.TL_authorization b;
    public final /* synthetic */ f81 c;

    public c81(f81 f81Var, e81 e81Var, TLRPC.TL_authorization tL_authorization) {
        this.c = f81Var;
        this.a = e81Var;
        this.b = tL_authorization;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        this.a.d.c(!r0.h, true);
        this.b.call_requests_disabled = !r4.d.h;
        f81.n(this.c);
    }
}
