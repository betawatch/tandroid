package org.telegram.ui;

import android.view.View;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final class m71 implements View.OnClickListener {
    public final /* synthetic */ o71 a;
    public final /* synthetic */ TLRPC.TL_authorization b;
    public final /* synthetic */ p71 c;

    public m71(p71 p71Var, o71 o71Var, TLRPC.TL_authorization tL_authorization) {
        this.c = p71Var;
        this.a = o71Var;
        this.b = tL_authorization;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        this.a.d.c(!r0.h, true);
        this.b.call_requests_disabled = !r4.d.h;
        p71.n(this.c);
    }
}
