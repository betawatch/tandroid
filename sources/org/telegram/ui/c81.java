package org.telegram.ui;

import android.view.View;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
/* loaded from: classes3.dex */
public final class c81 implements View.OnClickListener {
    public final /* synthetic */ f81 a;
    public final /* synthetic */ TLRPC.TL_authorization b;
    public final /* synthetic */ g81 c;

    public c81(g81 g81Var, f81 f81Var, TLRPC.TL_authorization tL_authorization) {
        this.c = g81Var;
        this.a = f81Var;
        this.b = tL_authorization;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        this.a.d.c(!r0.h, true);
        this.b.encrypted_requests_disabled = !r4.d.h;
        g81.n(this.c);
    }
}
