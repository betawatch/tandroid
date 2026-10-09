package org.telegram.ui;

import android.view.View;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final class d81 implements View.OnClickListener {
    public final /* synthetic */ g81 a;
    public final /* synthetic */ TLRPC.TL_authorization b;
    public final /* synthetic */ h81 c;

    public d81(h81 h81Var, g81 g81Var, TLRPC.TL_authorization tL_authorization) {
        this.c = h81Var;
        this.a = g81Var;
        this.b = tL_authorization;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        this.a.d.c(!r0.h, true);
        this.b.encrypted_requests_disabled = !r4.d.h;
        h81.p(this.c);
    }
}
