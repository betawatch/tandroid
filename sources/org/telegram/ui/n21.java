package org.telegram.ui;

import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class n21 implements r9 {
    public TLObject a = null;
    public TLRPC.TL_error b = null;
    public final /* synthetic */ SessionsActivity c;

    public n21(SessionsActivity sessionsActivity) {
        this.c = sessionsActivity;
    }

    @Override // org.telegram.ui.r9
    public final void M(String str) {
        TLObject tLObject = this.a;
        if (!(tLObject instanceof TLRPC.TL_authorization)) {
            if (this.b != null) {
                org.telegram.messenger.g0.h3(new l21(this, 0));
                return;
            }
            return;
        }
        TLRPC.TL_authorization tL_authorization = (TLRPC.TL_authorization) tLObject;
        boolean z10 = tL_authorization.password_pending;
        SessionsActivity sessionsActivity = this.c;
        if (z10) {
            sessionsActivity.e.add(0, tL_authorization);
            sessionsActivity.V = 4;
            sessionsActivity.p0(false);
        } else {
            sessionsActivity.d.add(0, tL_authorization);
        }
        sessionsActivity.r0();
        sessionsActivity.a.f();
        sessionsActivity.r.m(0L, this.a, 11);
    }

    @Override // org.telegram.ui.r9
    public final /* synthetic */ String M0() {
        return null;
    }

    @Override // org.telegram.ui.r9
    public final boolean e1(String str, i9 i9Var) {
        this.a = null;
        this.b = null;
        org.telegram.messenger.g0.i3(new wy0(this, str, i9Var, 3), 750L);
        return true;
    }

    @Override // org.telegram.ui.r9
    public final /* synthetic */ void V0(org.telegram.messenger.rr rrVar) {
    }

    @Override // org.telegram.ui.r9
    public final /* synthetic */ void onDismiss() {
    }
}
