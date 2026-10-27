package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MrzRecognizer;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class o71 implements x9 {
    public TLObject a = null;
    public TLRPC.TL_error b = null;
    public final /* synthetic */ SessionsActivity c;

    public o71(SessionsActivity sessionsActivity) {
        this.c = sessionsActivity;
    }

    @Override // org.telegram.ui.x9
    public final void H(String str) {
        TLObject tLObject = this.a;
        if (!(tLObject instanceof TLRPC.TL_authorization)) {
            if (this.b != null) {
                AndroidUtilities.runOnUIThread(new m71(this, 0));
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
            sessionsActivity.l0(false);
        } else {
            sessionsActivity.d.add(0, tL_authorization);
        }
        sessionsActivity.n0();
        sessionsActivity.a.l();
        sessionsActivity.r.m(0L, this.a, 11);
    }

    @Override // org.telegram.ui.x9
    public final /* synthetic */ String H0() {
        return null;
    }

    @Override // org.telegram.ui.x9
    public final boolean d1(String str, p9 p9Var) {
        this.a = null;
        this.b = null;
        AndroidUtilities.runOnUIThread(new t31(this, str, p9Var, 3), 750L);
        return true;
    }

    @Override // org.telegram.ui.x9
    public final /* synthetic */ void onDismiss() {
    }

    @Override // org.telegram.ui.x9
    public final /* synthetic */ void R0(MrzRecognizer.Result result) {
    }
}
