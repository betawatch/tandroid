package org.telegram.ui;

import android.view.View;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.Switch;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final class i21 implements View.OnClickListener {
    public final /* synthetic */ org.telegram.ui.Components.ug a;
    public final /* synthetic */ TLRPC.TL_authorization b;
    public final /* synthetic */ l21 c;

    public i21(l21 l21Var, org.telegram.ui.Components.ug ugVar, TLRPC.TL_authorization tL_authorization) {
        this.c = l21Var;
        this.a = ugVar;
        this.b = tL_authorization;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        ((Switch) this.a.f).c(!r0.h, true);
        this.b.encrypted_requests_disabled = !((Switch) r4.f).h;
        l21.K0(this.c);
    }
}
