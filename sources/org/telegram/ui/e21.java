package org.telegram.ui;

import android.view.View;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes3.dex */
public final class e21 implements View.OnClickListener {
    public final /* synthetic */ TLRPC.TL_authorization a;
    public final /* synthetic */ l21 b;

    public e21(l21 l21Var, TLRPC.TL_authorization tL_authorization) {
        this.b = l21Var;
        this.a = tL_authorization;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        l21.I0(this.b, this.a.country);
    }
}
