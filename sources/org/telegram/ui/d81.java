package org.telegram.ui;

import android.view.View;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-09da8b159cf36792e88674cebe3dc77c7407e16cea1bdebcb1e8ccd47061bd65 */
/* loaded from: classes3.dex */
public final class d81 implements View.OnClickListener {
    public final /* synthetic */ f81 a;
    public final /* synthetic */ TLRPC.TL_authorization b;
    public final /* synthetic */ g81 c;

    public d81(g81 g81Var, f81 f81Var, TLRPC.TL_authorization tL_authorization) {
        this.c = g81Var;
        this.a = f81Var;
        this.b = tL_authorization;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        this.a.d.c(!r0.h, true);
        this.b.call_requests_disabled = !r4.d.h;
        g81.n(this.c);
    }
}
