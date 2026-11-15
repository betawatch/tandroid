package org.telegram.ui;

import android.view.View;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.Switch;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final class g21 implements View.OnClickListener {
    public final /* synthetic */ org.telegram.ui.Components.kg a;
    public final /* synthetic */ TLRPC.TL_authorization b;
    public final /* synthetic */ i21 c;

    public g21(i21 i21Var, org.telegram.ui.Components.kg kgVar, TLRPC.TL_authorization tL_authorization) {
        this.c = i21Var;
        this.a = kgVar;
        this.b = tL_authorization;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        ((Switch) this.a.f).c(!r0.h, true);
        this.b.call_requests_disabled = !((Switch) r4.f).h;
        i21.J0(this.c);
    }
}
