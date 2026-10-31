package org.telegram.ui;

import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class o41 implements t9 {
    public TLObject a = null;
    public TLRPC.TL_error b = null;
    public final /* synthetic */ SessionsActivity c;

    public o41(SessionsActivity sessionsActivity) {
        this.c = sessionsActivity;
    }

    @Override // org.telegram.ui.t9
    public final void L(String str) {
        TLObject tLObject = this.a;
        if (!(tLObject instanceof TLRPC.TL_authorization)) {
            if (this.b != null) {
                org.telegram.messenger.i0.g3(new n41(this, 0));
                return;
            }
            return;
        }
        TLRPC.TL_authorization tL_authorization = (TLRPC.TL_authorization) tLObject;
        boolean z10 = tL_authorization.password_pending;
        SessionsActivity sessionsActivity = this.c;
        if (z10) {
            sessionsActivity.e.add(0, tL_authorization);
            sessionsActivity.U = 4;
            sessionsActivity.o0(false);
        } else {
            sessionsActivity.d.add(0, tL_authorization);
        }
        sessionsActivity.q0();
        sessionsActivity.a.f();
        sessionsActivity.r.m(0L, this.a, 11);
    }

    @Override // org.telegram.ui.t9
    public final /* synthetic */ String P0() {
        return null;
    }

    @Override // org.telegram.ui.t9
    public final boolean i1(String str, k9 k9Var) {
        this.a = null;
        this.b = null;
        org.telegram.messenger.i0.h3(new k41(this, str, k9Var, 2), 750L);
        return true;
    }

    @Override // org.telegram.ui.t9
    public final /* synthetic */ void X0(org.telegram.messenger.is isVar) {
    }

    @Override // org.telegram.ui.t9
    public final /* synthetic */ void onDismiss() {
    }
}
