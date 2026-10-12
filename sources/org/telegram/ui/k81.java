package org.telegram.ui;

import android.view.View;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes3.dex */
public final class k81 implements View.OnClickListener {
    public final /* synthetic */ n81 a;
    public final /* synthetic */ TLRPC.TL_authorization b;
    public final /* synthetic */ o81 c;

    public k81(o81 o81Var, n81 n81Var, TLRPC.TL_authorization tL_authorization) {
        this.c = o81Var;
        this.a = n81Var;
        this.b = tL_authorization;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        this.a.d.c(!r0.h, true);
        this.b.encrypted_requests_disabled = !r4.d.h;
        o81.o(this.c);
    }
}
