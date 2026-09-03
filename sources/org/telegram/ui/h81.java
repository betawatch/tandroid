package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MrzRecognizer;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class h81 implements w9 {
    public TLObject a = null;
    public TLRPC.TL_error b = null;
    public final /* synthetic */ SessionsActivity c;

    public h81(SessionsActivity sessionsActivity) {
        this.c = sessionsActivity;
    }

    @Override // org.telegram.ui.w9
    public final /* synthetic */ String C0() {
        return null;
    }

    @Override // org.telegram.ui.w9
    public final void K(String str) {
        TLObject tLObject = this.a;
        if (!(tLObject instanceof TLRPC.TL_authorization)) {
            if (this.b != null) {
                AndroidUtilities.runOnUIThread(new g81(this, 0));
                return;
            }
            return;
        }
        TLRPC.TL_authorization tL_authorization = (TLRPC.TL_authorization) tLObject;
        boolean z4 = tL_authorization.password_pending;
        SessionsActivity sessionsActivity = this.c;
        if (z4) {
            sessionsActivity.f.add(0, tL_authorization);
            sessionsActivity.S = 4;
            sessionsActivity.k0(false);
        } else {
            sessionsActivity.e.add(0, tL_authorization);
        }
        sessionsActivity.m0();
        sessionsActivity.a.l();
        sessionsActivity.s.m(0L, this.a, 11);
    }

    @Override // org.telegram.ui.w9
    public final boolean a1(String str, o9 o9Var) {
        this.a = null;
        this.b = null;
        AndroidUtilities.runOnUIThread(new jf0(this, str, o9Var, 29), 750L);
        return true;
    }

    @Override // org.telegram.ui.w9
    public final /* synthetic */ void P0(MrzRecognizer.Result result) {
    }

    @Override // org.telegram.ui.w9
    public final /* synthetic */ void onDismiss() {
    }
}
