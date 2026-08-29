package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MrzRecognizer;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class m71 implements q9 {
    public TLObject a = null;
    public TLRPC.TL_error b = null;
    public final /* synthetic */ SessionsActivity c;

    public m71(SessionsActivity sessionsActivity) {
        this.c = sessionsActivity;
    }

    @Override // org.telegram.ui.q9
    public final /* synthetic */ String E0() {
        return null;
    }

    @Override // org.telegram.ui.q9
    public final void J(String str) {
        TLObject tLObject = this.a;
        if (!(tLObject instanceof TLRPC.TL_authorization)) {
            if (this.b != null) {
                AndroidUtilities.runOnUIThread(new l71(this, 0));
                return;
            }
            return;
        }
        TLRPC.TL_authorization tL_authorization = (TLRPC.TL_authorization) tLObject;
        boolean z10 = tL_authorization.password_pending;
        SessionsActivity sessionsActivity = this.c;
        if (z10) {
            sessionsActivity.f.add(0, tL_authorization);
            sessionsActivity.R = 4;
            sessionsActivity.k0(false);
        } else {
            sessionsActivity.e.add(0, tL_authorization);
        }
        sessionsActivity.m0();
        sessionsActivity.a.l();
        sessionsActivity.s.m(0L, this.a, 11);
    }

    @Override // org.telegram.ui.q9
    public final boolean d1(String str, i9 i9Var) {
        this.a = null;
        this.b = null;
        AndroidUtilities.runOnUIThread(new xe0(this, str, i9Var, 29), 750L);
        return true;
    }

    @Override // org.telegram.ui.q9
    public final /* synthetic */ void S0(MrzRecognizer.Result result) {
    }

    @Override // org.telegram.ui.q9
    public final /* synthetic */ void onDismiss() {
    }
}
