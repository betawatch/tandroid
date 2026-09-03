package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MrzRecognizer;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final class g81 implements u9 {
    public TLObject a = null;
    public TLRPC.TL_error b = null;
    public final /* synthetic */ SessionsActivity c;

    public g81(SessionsActivity sessionsActivity) {
        this.c = sessionsActivity;
    }

    @Override // org.telegram.ui.u9
    public final /* synthetic */ String E0() {
        return null;
    }

    @Override // org.telegram.ui.u9
    public final void J(String str) {
        TLObject tLObject = this.a;
        if (!(tLObject instanceof TLRPC.TL_authorization)) {
            if (this.b != null) {
                AndroidUtilities.runOnUIThread(new f81(this, 0));
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

    @Override // org.telegram.ui.u9
    public final boolean e1(String str, m9 m9Var) {
        this.a = null;
        this.b = null;
        AndroidUtilities.runOnUIThread(new if0(this, str, m9Var, 29), 750L);
        return true;
    }

    @Override // org.telegram.ui.u9
    public final /* synthetic */ void P0(MrzRecognizer.Result result) {
    }

    @Override // org.telegram.ui.u9
    public final /* synthetic */ void onDismiss() {
    }
}
