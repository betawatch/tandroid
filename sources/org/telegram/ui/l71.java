package org.telegram.ui;

import android.view.View;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final class l71 implements View.OnClickListener {
    public final /* synthetic */ n71 a;
    public final /* synthetic */ TLRPC.TL_authorization b;
    public final /* synthetic */ o71 c;

    public l71(o71 o71Var, n71 n71Var, TLRPC.TL_authorization tL_authorization) {
        this.c = o71Var;
        this.a = n71Var;
        this.b = tL_authorization;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        this.a.d.c(!r0.h, true);
        this.b.call_requests_disabled = !r4.d.h;
        o71.n(this.c);
    }
}
