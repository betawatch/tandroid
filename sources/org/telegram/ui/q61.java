package org.telegram.ui;

import android.view.View;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-425f9d3693dca7cdb7b1343a62ca29dd4bfbf482fa37d742abbdfab31448a8bd */
/* loaded from: classes3.dex */
public final class q61 implements View.OnClickListener {
    public final /* synthetic */ t61 a;
    public final /* synthetic */ TLRPC.TL_authorization b;
    public final /* synthetic */ u61 c;

    public q61(u61 u61Var, t61 t61Var, TLRPC.TL_authorization tL_authorization) {
        this.c = u61Var;
        this.a = t61Var;
        this.b = tL_authorization;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        this.a.d.c(!r0.h, true);
        this.b.encrypted_requests_disabled = !r4.d.h;
        u61.o(this.c);
    }
}
