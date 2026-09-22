package org.telegram.ui;

import android.view.View;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes3.dex */
public final class a81 implements View.OnClickListener {
    public final /* synthetic */ d81 a;
    public final /* synthetic */ TLRPC.TL_authorization b;
    public final /* synthetic */ e81 c;

    public a81(e81 e81Var, d81 d81Var, TLRPC.TL_authorization tL_authorization) {
        this.c = e81Var;
        this.a = d81Var;
        this.b = tL_authorization;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        this.a.d.c(!r0.h, true);
        this.b.encrypted_requests_disabled = !r4.d.h;
        e81.n(this.c);
    }
}
